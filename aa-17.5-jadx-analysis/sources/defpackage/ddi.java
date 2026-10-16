package defpackage;

/* loaded from: classes.dex */
public final class ddi extends cfx implements cyu {
    public boolean a;
    public afec b;

    public ddi(boolean z, afec afecVar) {
        this.a = z;
        this.b = afecVar;
    }

    @Override // defpackage.cyu
    public final void g(dec decVar) {
        this.b.invoke(decVar);
    }

    @Override // defpackage.cyu
    public final boolean y() {
        return this.a;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ boolean z() {
        return true;
    }

    @Override // defpackage.cyu
    public final void D() {
    }
}
