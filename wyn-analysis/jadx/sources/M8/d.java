package M8;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f7544b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f7545c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f7546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f7547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f7548f;

    public /* synthetic */ d(f fVar, Runnable runnable, long j8, long j10, TimeUnit timeUnit, int i5) {
        this.f7543a = i5;
        this.f7544b = fVar;
        this.f7545c = runnable;
        this.f7546d = j8;
        this.f7547e = j10;
        this.f7548f = timeUnit;
    }

    @Override // M8.g
    public final ScheduledFuture a(xa.d dVar) {
        switch (this.f7543a) {
            case 0:
                f fVar = this.f7544b;
                return fVar.f7554b.scheduleAtFixedRate(new e(fVar, this.f7545c, dVar, 0), this.f7546d, this.f7547e, this.f7548f);
            default:
                f fVar2 = this.f7544b;
                return fVar2.f7554b.scheduleWithFixedDelay(new e(fVar2, this.f7545c, dVar, 2), this.f7546d, this.f7547e, this.f7548f);
        }
    }
}
