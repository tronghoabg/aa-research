package i.b.q;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class ac implements ei {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f49233c;

    /* renamed from: b, reason: collision with root package name */
    static final ei f49232b = new ac(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f49231a = new ac(0);

    private ac(int i2) {
        this.f49233c = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        return this.f49233c != 0 ? q.a(i2) != null : ad.a(i2) != null;
    }
}
