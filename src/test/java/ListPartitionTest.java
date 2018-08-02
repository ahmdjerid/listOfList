import com.interview.test.ListPartition;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static org.assertj.core.api.Assertions.*;
/**
 * @author Amal Soltani <amal.soltani@esprit.tn>
 *         Date: 02/08/2018
 */
public class ListPartitionTest {




    @Test
    public void itShouldReturnListOfListWithSize2()throws Exception{
      List<List<Integer>> expectedResult= new ArrayList<>() ;
        expectedResult.add(Arrays.asList(1,2));
        expectedResult.add(Arrays.asList(3,4));
        expectedResult.add(Arrays.asList(5,6));

        List<List<Integer>> result = ListPartition.partition(Arrays.asList(1, 2, 3, 4, 5,6), 2);
        assertThat(result).isEqualTo(expectedResult);

    }




    @Test
    public void itShouldReturnListOfListWithSize3()throws Exception{
        List<List<Integer>> expectedResult= new ArrayList<>() ;
        expectedResult.add(Arrays.asList(1,2,3));
        expectedResult.add(Arrays.asList(4,5,6));
        expectedResult.add(Arrays.asList(7,8,9));

        List<List<Integer>> result = ListPartition.partition(Arrays.asList(1, 2, 3, 4, 5,6,7,8,9), 3);
        assertThat(result).isEqualTo(expectedResult);

    }




    @Test
    public void itShouldReturnThreeListWithDifferentSize()throws Exception{
        List<List<Integer>> expectedResult= new ArrayList<>() ;
        expectedResult.add(Arrays.asList(1,2));
        expectedResult.add(Arrays.asList(3,4));
        expectedResult.add(Arrays.asList(5));

        List<List<Integer>> result = ListPartition.partition(Arrays.asList(1, 2, 3, 4, 5), 2);
        assertThat(result).isEqualTo(expectedResult);

    }

}




