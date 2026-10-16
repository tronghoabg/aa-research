package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public final class swo extends sla implements sle {
    public swo(Context context, swr swrVar) {
        super(context, null, sws.a, swrVar, skz.a);
    }

    public final svz a() {
        snb snbVar = new snb();
        snbVar.a = new swk();
        snbVar.c = 4501;
        return super.u(0, snbVar.a());
    }

    public final void b(swt swtVar) {
        final smr smrVarH = uqw.H(swtVar, this.g, "swt");
        final qwr qwrVar = ((swr) this.e).a;
        smy smyVar = new smy() { // from class: swj
            @Override // defpackage.smy
            public final void a(Object obj, Object obj2) throws RemoteException {
                qwr qwrVar2 = new qwr(smrVarH, 3);
                ((sxa) obj).H(qwrVar, qwrVar2, new swm(this.a, (nok) obj2, qwrVar2));
            }
        };
        qpy qpyVar = new qpy(this, 17);
        smx smxVar = new smx();
        smxVar.a = smyVar;
        smxVar.b = qpyVar;
        smxVar.c = smrVarH;
        smxVar.d = new Feature[]{swi.a};
        smxVar.f = 4507;
        x(smxVar.a());
    }
}
