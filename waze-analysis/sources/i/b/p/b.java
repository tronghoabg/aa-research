package i.b.p;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class b implements ei {

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ int f49193h;

    /* renamed from: g, reason: collision with root package name */
    static final ei f49192g = new b(6);

    /* renamed from: f, reason: collision with root package name */
    static final ei f49191f = new b(5);

    /* renamed from: e, reason: collision with root package name */
    static final ei f49190e = new b(4);

    /* renamed from: d, reason: collision with root package name */
    static final ei f49189d = new b(3);

    /* renamed from: c, reason: collision with root package name */
    static final ei f49188c = new b(2);

    /* renamed from: b, reason: collision with root package name */
    static final ei f49187b = new b(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f49186a = new b(0);

    private b(int i2) {
        this.f49193h = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        int i3 = this.f49193h;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? ae.a(i2) != null : w.a(i2) != null : s.b(i2) != null : i.a(i2) != null : h.a(i2) != null : a.b(i2) != null : c.b(i2) != null;
    }
}
