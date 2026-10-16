package defpackage;

import android.content.Intent;
import android.content.res.Configuration;

/* loaded from: classes2.dex */
public abstract class qz implements eqa {
    public final eqc a;
    public final qn b;
    private final eqc c;
    private final epz d;

    public qz() {
        qy qyVar = new qy(this, 0);
        this.d = qyVar;
        eqc eqcVar = new eqc(this, true);
        this.c = eqcVar;
        this.a = new eqc(this, true);
        eqcVar.c(qyVar);
        this.b = new qn(eqcVar, new qr());
    }

    public final qn a() {
        qn qnVar = this.b;
        qnVar.getClass();
        return qnVar;
    }

    public abstract qw b(Intent intent);

    public final void c(epr eprVar) {
        this.c.e(eprVar);
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return this.a;
    }

    public void d(Configuration configuration) {
    }

    public void e(Intent intent) {
    }
}
