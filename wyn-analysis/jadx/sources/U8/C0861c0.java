package U8;

/* renamed from: U8.c0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0861c0 {

    /* renamed from: a, reason: collision with root package name */
    public Double f12531a;

    /* renamed from: b, reason: collision with root package name */
    public int f12532b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12533c;

    /* renamed from: d, reason: collision with root package name */
    public int f12534d;

    /* renamed from: e, reason: collision with root package name */
    public long f12535e;

    /* renamed from: f, reason: collision with root package name */
    public long f12536f;

    /* renamed from: g, reason: collision with root package name */
    public byte f12537g;

    public final C0863d0 a() {
        if (this.f12537g == 31) {
            return new C0863d0(this.f12531a, this.f12532b, this.f12533c, this.f12534d, this.f12535e, this.f12536f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f12537g & 1) == 0) {
            sb2.append(" batteryVelocity");
        }
        if ((this.f12537g & 2) == 0) {
            sb2.append(" proximityOn");
        }
        if ((this.f12537g & 4) == 0) {
            sb2.append(" orientation");
        }
        if ((this.f12537g & 8) == 0) {
            sb2.append(" ramUsed");
        }
        if ((this.f12537g & 16) == 0) {
            sb2.append(" diskUsed");
        }
        throw new IllegalStateException(N0.a.i("Missing required properties:", sb2));
    }
}
