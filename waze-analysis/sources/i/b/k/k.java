package i.b.k;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k implements ei {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f48536e;

    /* renamed from: d, reason: collision with root package name */
    static final ei f48535d = new k(3);

    /* renamed from: c, reason: collision with root package name */
    static final ei f48534c = new k(2);

    /* renamed from: b, reason: collision with root package name */
    static final ei f48533b = new k(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f48532a = new k(0);

    private k(int i2) {
        this.f48536e = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        int i3 = this.f48536e;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? n.a(i2) != null : m.a(i2) != null : j.a(i2) != null : l.a(i2) != null;
    }
}
