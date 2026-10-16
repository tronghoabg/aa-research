package i.b.f.a;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bn implements ei {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f48432c;

    /* renamed from: b, reason: collision with root package name */
    static final ei f48431b = new bn(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f48430a = new bn(0);

    private bn(int i2) {
        this.f48432c = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        return this.f48432c != 0 ? ab.a(i2) != null : bo.a(i2) != null;
    }
}
