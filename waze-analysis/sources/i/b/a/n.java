package i.b.a;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n implements ei {

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f48348d;

    /* renamed from: c, reason: collision with root package name */
    static final ei f48347c = new n(2);

    /* renamed from: b, reason: collision with root package name */
    static final ei f48346b = new n(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f48345a = new n(0);

    private n(int i2) {
        this.f48348d = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        int i3 = this.f48348d;
        return i3 != 0 ? i3 != 1 ? p.a(i2) != null : m.a(i2) != null : o.a(i2) != null;
    }
}
