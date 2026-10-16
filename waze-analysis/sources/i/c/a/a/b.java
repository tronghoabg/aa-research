package i.c.a.a;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class b implements ei {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f49577f;

    /* renamed from: e, reason: collision with root package name */
    static final ei f49576e = new b(4);

    /* renamed from: d, reason: collision with root package name */
    static final ei f49575d = new b(3);

    /* renamed from: c, reason: collision with root package name */
    static final ei f49574c = new b(2);

    /* renamed from: b, reason: collision with root package name */
    static final ei f49573b = new b(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f49572a = new b(0);

    private b(int i2) {
        this.f49577f = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        int i3 = this.f49577f;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? m.a(i2) != null : g.a(i2) != null : d.b(i2) != null : a.b(i2) != null : c.b(i2) != null;
    }
}
