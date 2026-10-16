package i.b.n.a;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class af implements ei {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f49103e;

    /* renamed from: d, reason: collision with root package name */
    static final ei f49102d = new af(3);

    /* renamed from: c, reason: collision with root package name */
    static final ei f49101c = new af(2);

    /* renamed from: b, reason: collision with root package name */
    static final ei f49100b = new af(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f49099a = new af(0);

    private af(int i2) {
        this.f49103e = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        int i3 = this.f49103e;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? at.a(i2) != null : aq.a(i2) != null : g.a(i2) != null : ag.a(i2) != null;
    }
}
