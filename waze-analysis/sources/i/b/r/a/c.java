package i.b.r.a;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class c implements ei {

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f49276d;

    /* renamed from: c, reason: collision with root package name */
    static final ei f49275c = new c(2);

    /* renamed from: b, reason: collision with root package name */
    static final ei f49274b = new c(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f49273a = new c(0);

    private c(int i2) {
        this.f49276d = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        int i3 = this.f49276d;
        return i3 != 0 ? i3 != 1 ? e.a(i2) != null : b.a(i2) != null : d.a(i2) != null;
    }
}
