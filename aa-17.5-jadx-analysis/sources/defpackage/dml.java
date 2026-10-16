package defpackage;

/* loaded from: classes2.dex */
public final class dml extends cfx {
    public afec a;
    public final afec b = new ddz(this, 5);

    public dml(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cfx
    public final void er() {
        this.a.invoke(this.b);
    }

    @Override // defpackage.cfx
    public final void q() {
        this.a.invoke(null);
    }
}
