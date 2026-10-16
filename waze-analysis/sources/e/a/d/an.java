package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class an implements ap {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f46614a;

    an(int i2) {
        this.f46614a = i2;
    }

    @Override // e.a.d.aq
    public final /* synthetic */ int a(ho hoVar, int i2, Object obj, int i3) {
        int i4 = this.f46614a;
        if (i4 == 0) {
            hoVar.k(i2);
            return 0;
        }
        if (i4 != 1) {
            hoVar.j((byte[]) obj, i3, i2);
            return i3 + i2;
        }
        return hoVar.e();
    }
}
