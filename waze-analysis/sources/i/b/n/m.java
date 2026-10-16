package i.b.n;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class m implements ei {

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f49155d;

    /* renamed from: c, reason: collision with root package name */
    static final ei f49154c = new m(2);

    /* renamed from: b, reason: collision with root package name */
    static final ei f49153b = new m(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f49152a = new m(0);

    private m(int i2) {
        this.f49155d = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        int i3 = this.f49155d;
        return i3 != 0 ? i3 != 1 ? w.a(i2) != null : b.a(i2) != null : n.a(i2) != null;
    }
}
