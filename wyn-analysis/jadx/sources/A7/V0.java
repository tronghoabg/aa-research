package A7;

import E4.RunnableC0432a;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zzg;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public final class V0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f723a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f724b;

    public /* synthetic */ V0(Object obj, int i5) {
        this.f723a = i5;
        this.f724b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f723a) {
            case 0:
                ((P0) this.f724b).zzl().m0(runnable);
                break;
            case 1:
                ((Handler) ((b7.k) this.f724b).f19397c).post(runnable);
                break;
            case 2:
                ((zau) this.f724b).post(runnable);
                break;
            case 3:
                ((zzg) this.f724b).post(runnable);
                break;
            default:
                ((ExecutorService) this.f724b).execute(new RunnableC0432a(3, runnable));
                break;
        }
    }

    public V0(Looper looper) {
        this.f723a = 3;
        this.f724b = new zzg(looper);
    }
}
