import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Day11Test {

  Day11 day11 = new Day11();

  @Test
  public void testGrid(){
    assertThat(day11.buildGrid(8)[4][2], is(4));
    assertThat(day11.buildGrid(57)[78][121], is(-5));
    assertThat(day11.buildGrid(39)[195][216], is(0));
    assertThat(day11.buildGrid(71)[152][100], is(4));
  }

  @Test
  public void testBestCellSize3(){
    assertThat(day11.findBestTopLeftCell3(day11.buildGrid(18)), is("33,45"));
    assertThat(day11.findBestTopLeftCell3(day11.buildGrid(42)), is("21,61"));
  }

  @Test
  public void testBestCellForAllSizes(){
    assertThat(day11.findBestTopLeftCellAllSizes(day11.buildGrid(18)), is("90,269,16"));
    assertThat(day11.findBestTopLeftCellAllSizes(day11.buildGrid(42)), is("232,251,12"));
  }
}
