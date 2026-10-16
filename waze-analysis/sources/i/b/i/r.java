package i.b.i;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r implements ei {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f48497c;

    /* renamed from: b, reason: collision with root package name */
    static final ei f48496b = new r(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f48495a = new r(0);

    private r(int i2) {
        this.f48497c = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        return this.f48497c != 0 ? q.a(i2) != null : s.a(i2) != null;
    }
}
