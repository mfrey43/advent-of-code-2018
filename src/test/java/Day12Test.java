import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

public class Day12Test {

  Day12 day12 = new Day12();

  @Test
  public void test() throws IOException {
    String input = IOUtils.toString(getClass().getResourceAsStream("input_day_12_test.txt"), StandardCharsets.UTF_8)
        .replaceAll("\r", "");

    assertThat(day12.afterGens(input, 20), is("325"));
  }
}
