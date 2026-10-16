package defpackage;

/* loaded from: classes3.dex */
public class aedr extends aedq {
    final /* synthetic */ aeds a;

    protected aedr(aeds aedsVar) {
        this.a = aedsVar;
    }

    @Override // defpackage.aedq, defpackage.adla
    public void f(adjh adjhVar, adlg adlgVar) {
        aeds aedsVar = this.a;
        if (aedsVar.c == adjh.e) {
            return;
        }
        aedsVar.c = adjhVar;
        aedsVar.d = adlgVar;
        aedu aeduVar = aedsVar.e;
        if (aeduVar.i) {
            return;
        }
        aeduVar.f();
    }

    @Override // defpackage.aedq
    protected final adla g() {
        return this.a.e.h;
    }
}
