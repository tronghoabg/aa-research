package defpackage;

/* loaded from: classes3.dex */
final class ahtg implements afec {
    final /* synthetic */ agax val$overrider;
    final /* synthetic */ ahsz val$strategy;

    public ahtg(ahsz ahszVar, agax agaxVar) {
        this.val$strategy = ahszVar;
        this.val$overrider = agaxVar;
    }

    @Override // defpackage.afec
    public afak invoke(agax agaxVar) {
        this.val$strategy.inheritanceConflict(this.val$overrider, agaxVar);
        return afak.a;
    }
}
