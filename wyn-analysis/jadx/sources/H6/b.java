package H6;

import A7.AbstractC0279p0;
import E4.RunnableC0432a;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4932a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4933b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4934c;

    public b() {
        this.f4932a = 1;
        this.f4934c = Executors.defaultThreadFactory();
        this.f4933b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f4932a) {
            case 0:
                int andIncrement = ((AtomicInteger) this.f4933b).getAndIncrement();
                int length = String.valueOf(andIncrement).length();
                String str = (String) this.f4934c;
                StringBuilder sb2 = new StringBuilder(AbstractC0279p0.g(12, length, str));
                sb2.append("AdWorker(");
                sb2.append(str);
                sb2.append(") #");
                sb2.append(andIncrement);
                return new Thread(runnable, sb2.toString());
            case 1:
                AtomicInteger atomicInteger = (AtomicInteger) this.f4933b;
                Thread threadNewThread = ((ThreadFactory) this.f4934c).newThread(runnable);
                threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return threadNewThread;
            default:
                Thread threadNewThread2 = ((ThreadFactory) this.f4933b).newThread(new RunnableC0432a(2, runnable));
                threadNewThread2.setName((String) this.f4934c);
                return threadNewThread2;
        }
    }

    public b(String str, int i5) {
        this.f4932a = i5;
        switch (i5) {
            case 2:
                this.f4933b = Executors.defaultThreadFactory();
                this.f4934c = str;
                break;
            default:
                this.f4934c = str;
                this.f4933b = new AtomicInteger(1);
                break;
        }
    }
}
