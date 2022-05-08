import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DividingList {
    
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        for (int i = 0; i < 160; i++) {
            input.add(String.valueOf(i));
        }
        int partitionSize = 50;
        Collection<List<String>> partitionedList = IntStream.range(0, input.size())
                .boxed()
                //0 - 49 까지는 classifier에서 0이 나옴 , 0-49번까지 인덱스를 통해서 실제로 넣을 값들을 맵핑을 통해 가져와서 target(list)에 넣어준다
                .collect(Collectors.groupingBy(index -> (index / partitionSize), Collectors.mapping(input::get, Collectors.toList())))
                .values();

        for (List<String> strings : partitionedList) {
            System.out.println(strings);
        }
    }
}
