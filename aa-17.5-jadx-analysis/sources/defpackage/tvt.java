package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class tvt extends tvr implements tpr {
    public tvt(abax abaxVar, tod todVar, tza tzaVar, ukq ukqVar, tqo tqoVar, typ typVar, zyq zyqVar, uvg uvgVar, usy usyVar, gjv gjvVar, tvm tvmVar, boolean z) {
        super(abaxVar, todVar, tzaVar, ukqVar, tqoVar, typVar, zyqVar, uvgVar, usyVar, gjvVar, tvmVar, z);
        this.e.l(this.g);
        this.e.m(1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tvr
    protected final twf C(tvr tvrVar, zyq zyqVar, tza tzaVar, tod todVar, uip uipVar, abax abaxVar, tqo tqoVar) {
        abdx abdxVar = abaxVar.c;
        if (abdxVar == null) {
            abdxVar = abdx.a;
        }
        List listA = A(abdxVar, todVar);
        int i = abaxVar.k;
        int i2 = abaxVar.l;
        int iAp = a.ap(abaxVar.f);
        if (iAp == 0) {
            iAp = 1;
        }
        int i3 = iAp;
        abnr abnrVar = (abnr) abde.a.n();
        ynp ynpVarListIterator = ((yfq) listA).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            abms abmsVar = (abms) ynpVarListIterator.next();
            B(abnrVar, todVar.b(abmsVar), abmsVar, tqoVar, i, i2, i3);
        }
        tpw tpwVarA = zyqVar.a(tvrVar, tzaVar, todVar, (abde) abnrVar.q());
        if (tpwVarA == txj.b) {
            return null;
        }
        return (twf) tpwVarA;
    }
}
