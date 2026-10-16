package defpackage;

import androidx.car.app.AppManager;
import androidx.car.app.model.TemplateWrapper;

/* loaded from: classes2.dex */
public abstract class qw implements eqa {
    public final qn a;
    public final eqc b = new eqc(this, true);
    public String c;
    public TemplateWrapper d;
    public boolean e;

    protected qw(qn qnVar) {
        qnVar.getClass();
        this.a = qnVar;
    }

    public final qx g() {
        return (qx) this.a.a(qx.class);
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return this.b;
    }

    public abstract wb h();

    public final void i(epr eprVar) {
        yj.b(new af((Object) this, (Object) eprVar, 14, (byte[]) null));
    }

    public final void j() {
        if (this.b.e.a(eps.d)) {
            ((AppManager) this.a.a(AppManager.class)).a();
        }
    }
}
