package Y8;

import N1.O;
import R8.A;
import T3.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import l8.AbstractC3409K;
import l8.C3406H;
import l8.e0;
import n2.C3581d;
import n2.C3582e;
import n2.C3586i;
import n2.l;
import n2.o;
import q5.InterfaceC3873h;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements InterfaceC3873h, l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f16718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16720c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16721d;

    public /* synthetic */ b(boolean z2, Object obj, Object obj2, Object obj3) {
        this.f16719b = obj;
        this.f16720c = obj2;
        this.f16718a = z2;
        this.f16721d = obj3;
    }

    @Override // q5.InterfaceC3873h
    public void a(Exception exc) throws Throwable {
        c cVar = (c) this.f16719b;
        cVar.getClass();
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f16720c;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.f16718a) {
            boolean z2 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new r(20, cVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = A.f10435a;
            boolean z10 = false;
            try {
                long nanos = timeUnit.toNanos(2L);
                long jNanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th) {
                            th = th;
                            if (z2) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = jNanoTime - System.nanoTime();
                        z10 = true;
                    }
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                th = th2;
                z2 = z10;
            }
        }
        taskCompletionSource.trySetResult((R8.b) this.f16721d);
    }

    @Override // n2.l
    public e0 c(int i5, O o7, int[] iArr) {
        o oVar = (o) this.f16719b;
        oVar.getClass();
        C3581d c3581d = new C3581d(oVar, 0);
        int i10 = ((int[]) this.f16721d)[i5];
        C3406H c3406hI = AbstractC3409K.i();
        int i11 = 0;
        while (i11 < o7.f8073a) {
            int i12 = i5;
            O o10 = o7;
            c3406hI.a(new C3582e(i12, o10, i11, (C3586i) this.f16720c, iArr[i11], this.f16718a, c3581d, i10));
            i11++;
            i5 = i12;
            o7 = o10;
        }
        return c3406hI.g();
    }
}
