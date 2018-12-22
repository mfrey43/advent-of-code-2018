import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

public class Day14Test {

  Day14 day14 = new Day14();

  @Test
  public void test() throws IOException {
    assertThat(day14.calculate("37", 9, 10), is("5158916779"));
    assertThat(day14.calculate("37", 5, 10), is("0124515891"));
    assertThat(day14.calculate("37", 18, 10), is("9251071085"));
    assertThat(day14.calculate("37", 2018, 10), is("5941429882"));
  }
}
