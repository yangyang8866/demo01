package pre.yang.stream0925;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
public class Stream01Test {

    /**
     * 从给定的句子中返回单词长度大于5的单词列表，按长度倒叙输出，最多返回3个。
     */

    /**
     * 数组
     */
    @Test
    public void test01(){

        String str = "qqqqq www eeeee rrr vvvvvvvv dddddddddd hhhhhhh";
        String[] strings = str.split(" ");
        List<String> arrList = new ArrayList<>();
        for (String string : strings) {
            if (string.length() > 5){
                arrList.add(string);
            }
        }

        arrList.sort(((o1, o2) -> o2.length()-o1.length()));
        if (arrList.size() > 3){
            arrList.subList(0,3);
        }
        System.out.println(arrList);

    }

    @Test
    public void test02(){

        //asList方法是将数组转化为List集合
        List<String> ids = Arrays.asList("205","105","308","469","627","193","111");

        //流
        List<Integer> results = ids.stream().map(s -> Integer.valueOf(s)).collect(Collectors.toList());
        System.out.println(results);
    }


}
