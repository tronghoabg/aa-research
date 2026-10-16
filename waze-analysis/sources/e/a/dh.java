package e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dh implements ea {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f47327a;

    @Override // e.a.ea
    public final /* synthetic */ int a(Object obj) {
        if (this.f47327a == 0) {
            return ((de) obj).d();
        }
        ((bv) obj).d();
        return 5;
    }

    @Override // e.a.ea
    public final /* synthetic */ void b(Object obj) {
        if (this.f47327a != 0) {
            ((bv) obj).e();
        } else {
            ((de) obj).f();
        }
    }
}
