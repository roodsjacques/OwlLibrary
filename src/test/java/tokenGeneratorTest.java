import static util.JavaMailUtil.pwrdGenerator;

public class tokenGeneratorTest {

    public static void main(String[] args) {
            String uuid = pwrdGenerator();
        System.out.println("token # 1 : " + uuid);
    }
}
