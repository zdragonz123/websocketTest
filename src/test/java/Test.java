import java.nio.ByteBuffer;

/**
 * Created by zhenglongzhen on 2017/4/8.
 */
public class Test {
    private  int pos = 0 ;


    public static void main(String[] args) {
            Test test = new Test();
        System.out.println(test.next());
        System.out.println(test.pos);

        ByteBuffer byteBuffer = ByteBuffer.allocate(1);
        byte b = 123;
        byteBuffer.put(b);
        System.out.println("positon:" + byteBuffer.position());
        System.out.println("capacity:" + byteBuffer.capacity());
        System.out.println("limit:" + byteBuffer.limit());
        byteBuffer.flip();
        System.out.println("positon:" + byteBuffer.position());
        System.out.println("capacity:" + byteBuffer.capacity());
        System.out.println("limit:" + byteBuffer.limit());
        while(byteBuffer.hasRemaining()){
            byteBuffer.get();
            System.out.println("positon:" + byteBuffer.position());
            System.out.println("capacity:" + byteBuffer.capacity());
            System.out.println("limit:" + byteBuffer.limit());
        }
        System.out.println("positon:" + byteBuffer.position());
        System.out.println("capacity:" + byteBuffer.capacity());
        System.out.println("limit:" + byteBuffer.limit());


    }

    public int next(){
        return  pos++;
    }
}
