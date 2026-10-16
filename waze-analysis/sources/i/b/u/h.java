package i.b.u;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class h implements ei {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f49314e;

    /* renamed from: d, reason: collision with root package name */
    static final ei f49313d = new h(3);

    /* renamed from: c, reason: collision with root package name */
    static final ei f49312c = new h(2);

    /* renamed from: b, reason: collision with root package name */
    static final ei f49311b = new h(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f49310a = new h(0);

    private h(int i2) {
        this.f49314e = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        int i3 = this.f49314e;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? z.a(i2) != null : t.a(i2) != null : d.a(i2) != null : i.a(i2) != null;
    }
}
