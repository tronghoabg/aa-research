package defpackage;

/* loaded from: classes.dex */
public final class nvr implements kww {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public nvr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.kww
    public final void b() {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            ((eqj) obj).j(false);
            return;
        }
        nvs nvsVar = (nvs) obj;
        nvsVar.c.getClass();
        nvsVar.d.getClass();
        nvsVar.b.post(new nqw(obj, 6));
    }

    @Override // defpackage.kww
    public final void g() {
        if (this.b != 0) {
            ((eqj) this.a).j(true);
        }
    }

    @Override // defpackage.kww
    public final void f() {
    }

    @Override // defpackage.kww
    public final void a(int i) {
    }

    @Override // defpackage.kww
    public final /* synthetic */ void e(int i) {
    }
}
