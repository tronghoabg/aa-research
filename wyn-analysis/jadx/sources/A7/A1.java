package A7;

/* loaded from: classes4.dex */
public final class A1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f418a;

    /* renamed from: b, reason: collision with root package name */
    public final long f419b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S3.s f420c;

    public A1(S3.s sVar, long j8, long j10) {
        this.f420c = sVar;
        this.f418a = j8;
        this.f419b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0264k0 c0264k0Zzl = ((C0303x1) this.f420c.f11010c).zzl();
        V v2 = new V(1);
        v2.f722b = this;
        c0264k0Zzl.m0(v2);
    }
}
