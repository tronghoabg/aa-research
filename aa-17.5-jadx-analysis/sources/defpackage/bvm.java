package defpackage;

/* loaded from: classes.dex */
final class bvm implements bxq {
    private final afec a;
    private bvn b;

    public bvm(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.bxq
    public final void eX() {
        bvn bvnVar = this.b;
        if (bvnVar != null) {
            bvnVar.a();
        }
        this.b = null;
    }

    @Override // defpackage.bxq
    public final void eo() {
        this.b = (bvn) this.a.invoke(bvq.a);
    }

    @Override // defpackage.bxq
    public final void eW() {
    }
}
