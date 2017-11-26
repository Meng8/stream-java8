import java.util.function.Supplier;

/**
 * Created by qiuzhanghua on 2017/2/7.
 */
public class FibonacciSupplier implements Supplier<Long> {
//  private long previous = 1;
//  private long current = 2;
	private long f = 0;
	private long n = 0;
	private long s= 1;
	

  @Override
  public Long get() {
//    long p = previous;
//    long next = current + previous;
//    previous = current;
//    current = next;
//    return p;
    long sum=f+n+s;
	f=n;
	n=s;
	s=sum;
	return sum;
  }
}
