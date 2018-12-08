import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.time.StopWatch;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Day7 {

  public static void main(String[] args) throws IOException {
    StopWatch stopwatch = new StopWatch();
    stopwatch.start();
    System.out.println(new Day7().part1());
    stopwatch.stop();
    System.out.println("time spent: " + stopwatch.getTime() + "ms");
  }

  public String part1() throws IOException {
    String input = IOUtils.toString(getClass().getResourceAsStream("input_day_07.txt"), StandardCharsets.UTF_8);

    Map<String, Step> steps = new HashMap<>();

    for (String line : input.split("\n")) {
      final String[] split = line.split(" ");
      String mustBeFinished = split[1];
      String before = split[7];
      if(!steps.containsKey(before)){
        steps.put(before, new Step(before));
      }
      if(!steps.containsKey(mustBeFinished)){
        steps.put(mustBeFinished, new Step(mustBeFinished));
      }
      steps.get(before).beforeSteps.add(steps.get(mustBeFinished));
    }
    List<Step> stepList = steps.values().stream().sorted(Comparator.comparing(o -> o.id)).collect(Collectors.toList());

    List<Step> stepsInOrder = new ArrayList<>();
    while(!stepList.isEmpty()){
      Step step = stepList.stream().filter(Step::preconditionsAreMet).findFirst().get();
      step.complete();
      stepsInOrder.add(step);
      stepList.remove(step);
    }
    return stepsInOrder.stream().map(step -> step.id).collect(Collectors.joining());
  }

  private static class Step {

    String id;
    private boolean completed = false;
    private Set<Step> beforeSteps = new HashSet<>();

    public Step(String id) {
      this.id = id;
    }

    public void complete(){
      this.completed = true;
    }

    public boolean preconditionsAreMet(){
      return beforeSteps.stream().allMatch(step -> step.completed);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o)
        return true;
      if (o == null || getClass() != o.getClass())
        return false;
      Step step = (Step) o;
      return Objects.equals(id, step.id);
    }

    @Override
    public int hashCode() {
      return Objects.hash(id);
    }
  }
}