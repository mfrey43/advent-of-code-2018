import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.time.StopWatch;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Day10 {

  public static void main(String[] args) throws IOException {
    StopWatch stopwatch = new StopWatch();
    stopwatch.start();
    System.out.println(new Day10().part1());
    stopwatch.stop();
    System.out.println("time spent: " + stopwatch.getTime() + "ms");

    stopwatch.reset();
    stopwatch.start();
    System.out.println(new Day10().part2());
    stopwatch.stop();
    System.out.println("time spent: " + stopwatch.getTime() + "ms");
  }

  public String part1() throws IOException {
    String input = IOUtils.toString(getClass().getResourceAsStream("input_day_10.txt"), StandardCharsets.UTF_8);

    return "TODO";
  }

  public String part2() throws IOException {
    String input = IOUtils.toString(getClass().getResourceAsStream("input_day_10.txt"), StandardCharsets.UTF_8);

    return "TODO";
  }
}
