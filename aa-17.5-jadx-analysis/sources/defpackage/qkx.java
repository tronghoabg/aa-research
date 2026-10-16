package defpackage;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public class qkx extends qlf {
    public final qmh a;
    public boolean b;

    public qkx(qmh qmhVar) {
        super(qmhVar.b(), qmhVar.k);
        this.a = qmhVar;
    }

    @Override // defpackage.qlf
    public final void a(qlc qlcVar) throws Throwable {
        qlw qlwVar = (qlw) qlcVar.a(qlw.class);
        if (TextUtils.isEmpty(qlwVar.b)) {
            qlwVar.b = this.a.d().a();
        }
        if (this.b && TextUtils.isEmpty(qlwVar.d)) {
            qmc qmcVar = this.a.h;
            qmh.g(qmcVar);
            qmcVar.s();
            qkt qktVarA = qmcVar.a();
            String str = qktVarA != null ? qktVarA.a : null;
            qlwVar.d = true != TextUtils.isEmpty(str) ? str : null;
            qmcVar.s();
            qkt qktVarA2 = qmcVar.a();
            qlwVar.e = (qktVarA2 == null || qktVarA2.b) ? false : true;
        }
    }
}
