package defpackage;

/* loaded from: classes3.dex */
final class aedv extends aedr {
    final /* synthetic */ aedw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aedv(aedw aedwVar) {
        super(aedwVar);
        this.b = aedwVar;
    }

    @Override // defpackage.aedr, defpackage.aedq, defpackage.adla
    public final void f(adjh adjhVar, adlg adlgVar) {
        super.f(adjhVar, adlgVar);
        aedw aedwVar = this.b;
        if (aedwVar.f.i || adjhVar != adjh.d) {
            return;
        }
        aedwVar.b.c();
    }
}
