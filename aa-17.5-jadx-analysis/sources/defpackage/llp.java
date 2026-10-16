package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final /* synthetic */ class llp implements afec {
    public final /* synthetic */ afdr a;
    public final /* synthetic */ afeg b;
    public final /* synthetic */ afdr c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ llp(qn qnVar, mon monVar, afdr afdrVar, afeg afegVar, afdr afdrVar2, String str, Bundle bundle, int i) {
        this.h = i;
        this.d = qnVar;
        this.e = monVar;
        this.a = afdrVar;
        this.b = afegVar;
        this.c = afdrVar2;
        this.f = str;
        this.g = bundle;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        if (this.h == 0) {
            thj thjVar = (thj) obj;
            thjVar.getClass();
            eqc eqcVar = thjVar.b;
            eqcVar.getClass();
            Context context = (Context) this.d;
            int iU = lnm.u(64, context);
            int iU2 = lnm.u(8, context);
            lkd lkdVar = new lkd(thjVar, 8);
            lle lleVar = new lle(14);
            qx qxVarG = thjVar.g();
            qxVarG.getClass();
            int iV = lnm.v(qxVarG);
            Object obj2 = this.g;
            Object obj3 = this.f;
            afdr afdrVar = this.c;
            return new llo(context, eqcVar, (mon) this.e, iU, iU2, lkdVar, this.a, this.b, lleVar, iV, afdrVar, (String) obj3, (Bundle) obj2);
        }
        thj thjVar2 = (thj) obj;
        thjVar2.getClass();
        mon monVar = (mon) this.f;
        ComponentName componentName = monVar.a;
        Object obj4 = this.g;
        qn qnVar = (qn) obj4;
        qnVar.e.w(new lki(qnVar, componentName));
        eqc eqcVar2 = thjVar2.b;
        eqcVar2.getClass();
        llu lluVar = (llu) this.e;
        String strI = lluVar.i();
        Context context2 = (Context) obj4;
        int iU3 = lnm.u(64, context2);
        int iU4 = lnm.u(164, context2);
        int iU5 = lnm.u(8, context2);
        CharSequence charSequenceS = lluVar.h().S();
        String string = charSequenceS != null ? charSequenceS.toString() : null;
        afeg afegVar = this.b;
        afdr afdrVar2 = this.c;
        afdr afdrVar3 = this.a;
        Object obj5 = this.d;
        htm htmVar = new htm(lluVar.h().n());
        qx qxVarG2 = thjVar2.g();
        qxVarG2.getClass();
        return new lkg(context2, eqcVar2, strI, monVar, iU3, iU4, iU5, null, string, (htm) obj5, htmVar, afdrVar3, afdrVar2, afegVar, lnm.v(qxVarG2), null);
    }

    public /* synthetic */ llp(qn qnVar, mon monVar, llu lluVar, htm htmVar, afdr afdrVar, afdr afdrVar2, afeg afegVar, int i) {
        this.h = i;
        this.g = qnVar;
        this.f = monVar;
        this.e = lluVar;
        this.d = htmVar;
        this.a = afdrVar;
        this.c = afdrVar2;
        this.b = afegVar;
    }
}
