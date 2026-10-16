package e.a.b.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    private long f46419a;

    /* renamed from: b, reason: collision with root package name */
    private long f46420b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f46421c;

    public final synchronized boolean a(long j2) {
        long j3 = this.f46420b;
        if (j3 - j2 >= 0) {
            j2 = j3;
        }
        this.f46420b = j2;
        if (this.f46419a - j2 >= 131072 || !this.f46421c) {
            return false;
        }
        this.f46421c = false;
        return true;
    }

    public final boolean b() {
        return this.f46421c;
    }

    public final synchronized boolean c(long j2) {
        long j3 = this.f46419a + j2;
        this.f46419a = j3;
        if (j3 - this.f46420b < 131072 || this.f46421c) {
            return false;
        }
        this.f46421c = true;
        return true;
    }
}
