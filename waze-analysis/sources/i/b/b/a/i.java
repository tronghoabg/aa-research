package i.b.b.a;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i implements ei {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f48379c;

    /* renamed from: b, reason: collision with root package name */
    static final ei f48378b = new i(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f48377a = new i(0);

    private i(int i2) {
        this.f48379c = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        return this.f48379c != 0 ? h.a(i2) != null : j.a(i2) != null;
    }
}
