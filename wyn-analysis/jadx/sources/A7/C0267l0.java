package A7;

import com.google.android.gms.internal.measurement.zzdg;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: A7.l0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0267l0 extends FutureTask implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f943a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f944b;

    /* renamed from: c, reason: collision with root package name */
    public final String f945c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0264k0 f946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0267l0(C0264k0 c0264k0, Runnable runnable, boolean z2, String str) {
        super(zzdg.zza().zza(runnable), null);
        this.f946d = c0264k0;
        long andIncrement = C0264k0.k.getAndIncrement();
        this.f943a = andIncrement;
        this.f945c = str;
        this.f944b = z2;
        if (andIncrement == Long.MAX_VALUE) {
            c0264k0.zzj().f605f.c("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0267l0 c0267l0 = (C0267l0) obj;
        boolean z2 = c0267l0.f944b;
        boolean z10 = this.f944b;
        if (z10 != z2) {
            return z10 ? -1 : 1;
        }
        long j8 = c0267l0.f943a;
        long j10 = this.f943a;
        if (j10 < j8) {
            return -1;
        }
        if (j10 > j8) {
            return 1;
        }
        this.f946d.zzj().f606g.d("Two tasks share the same index. index", Long.valueOf(j10));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        N nZzj = this.f946d.zzj();
        nZzj.f605f.d(this.f945c, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0267l0(C0264k0 c0264k0, Callable callable, boolean z2) {
        super(zzdg.zza().zza(callable));
        this.f946d = c0264k0;
        long andIncrement = C0264k0.k.getAndIncrement();
        this.f943a = andIncrement;
        this.f945c = "Task exception on worker thread";
        this.f944b = z2;
        if (andIncrement == Long.MAX_VALUE) {
            c0264k0.zzj().f605f.c("Tasks index overflow");
        }
    }
}
