package defpackage;

/* loaded from: classes2.dex */
public final class gjh extends cfx implements chu {
    public afec a;
    private final afec b = new fzl(this, 15);

    public gjh(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cfx
    public final void er() {
        aezr aezrVar = gjf.a;
        gjf gjfVarH = fxi.h();
        afec afecVar = this.b;
        afecVar.getClass();
        gjfVarH.c.add(afecVar);
    }

    @Override // defpackage.chu
    public final void eu(cis cisVar) {
        cisVar.b();
    }

    @Override // defpackage.cfx
    public final void q() {
        aezr aezrVar = gjf.a;
        gjf gjfVarH = fxi.h();
        afec afecVar = this.b;
        afecVar.getClass();
        gjfVarH.c.remove(afecVar);
    }
}
