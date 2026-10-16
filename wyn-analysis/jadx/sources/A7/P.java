package A7;

/* loaded from: classes4.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final int f646a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f647b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f648c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N f649d;

    public P(N n10, int i5, boolean z2, boolean z10) {
        this.f649d = n10;
        this.f646a = i5;
        this.f647b = z2;
        this.f648c = z10;
    }

    public final void a(Object obj, Object obj2, Object obj3, String str) {
        this.f649d.k0(this.f646a, this.f647b, this.f648c, str, obj, obj2, obj3);
    }

    public final void b(Object obj, String str, Object obj2) {
        this.f649d.k0(this.f646a, this.f647b, this.f648c, str, obj, obj2, null);
    }

    public final void c(String str) {
        this.f649d.k0(this.f646a, this.f647b, this.f648c, str, null, null, null);
    }

    public final void d(String str, Object obj) {
        this.f649d.k0(this.f646a, this.f647b, this.f648c, str, obj, null, null);
    }
}
