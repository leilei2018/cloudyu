package cloud.webalipay.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import com.netflix.hystrix.HystrixThreadPoolProperties;

public class Study extends HystrixCommand<Object> {

    public Study(Setter setter) {
        super(setter);
    }

    @Override
    protected Object run() throws Exception {
        int a = 1/0;
        return null;
    }

    @Override
    protected Object getFallback() {
        System.out.println("error");
        return 1;
    }

    public static void main(String[] args) {
        /*HystrixThreadPoolProperties.Setter tset = HystrixThreadPoolProperties.defaultSetter();
        tset.withCoreSize(5);
        HystrixCommand.
        Setter setter = Setter
                 //.withGroupKey(HystrixCommandGroupKey.Factory.asKey("Study"))
                 .andThreadPoolPropertiesDefaults(tset);
                //.andCommandKey(HystrixCommandKey.Factory.asKey("gg"));
        Study s = new Study(setter);
        s.execute();*/
    }
}
