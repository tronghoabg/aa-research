package okhttp3.internal.f;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class af {

    /* renamed from: a, reason: collision with root package name */
    private final af[] f56130a;

    /* renamed from: b, reason: collision with root package name */
    private final int f56131b;

    /* renamed from: c, reason: collision with root package name */
    private final int f56132c;

    public af(int i2, int i3) {
        this.f56130a = null;
        this.f56131b = i2;
        int i4 = i3 & 7;
        this.f56132c = i4 == 0 ? 8 : i4;
    }

    public final int a() {
        return this.f56131b;
    }

    public final int b() {
        return this.f56132c;
    }

    public final af[] c() {
        return this.f56130a;
    }

    public af() {
        this.f56130a = new af[256];
        this.f56131b = 0;
        this.f56132c = 0;
    }
}
