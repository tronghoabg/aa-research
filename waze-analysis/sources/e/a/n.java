package e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private h f47835a = h.f47759a;

    /* renamed from: b, reason: collision with root package name */
    private int f47836b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f47837c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f47838d;

    n() {
    }

    public final void a(h hVar) {
        com.google.d.b.an.C(hVar, "callOptions cannot be null");
        this.f47835a = hVar;
    }

    public final void b(boolean z) {
        this.f47838d = z;
    }

    public final void c(boolean z) {
        this.f47837c = z;
    }

    public final void d(int i2) {
        this.f47836b = i2;
    }

    public final void e() {
        new o(this.f47835a, this.f47836b, this.f47837c, this.f47838d);
    }
}
