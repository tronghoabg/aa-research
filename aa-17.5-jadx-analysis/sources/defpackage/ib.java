package defpackage;

/* loaded from: classes2.dex */
public final class ib implements ebu {
    int a;
    final /* synthetic */ ic b;
    private boolean c = false;

    protected ib(ic icVar) {
        this.b = icVar;
    }

    @Override // defpackage.ebu
    public final void a() {
        if (this.c) {
            return;
        }
        ic icVar = this.b;
        icVar.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    @Override // defpackage.ebu
    public final void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.c = false;
    }

    @Override // defpackage.ebu
    public final void c() {
        this.c = true;
    }

    public final void d(erb erbVar, int i) {
        this.b.f = erbVar;
        this.a = i;
    }
}
