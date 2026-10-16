package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class dcp implements bva, epy {
    public final czq a;
    public final bva b;
    public boolean c;
    public ept d;
    public afeg e = dav.a;

    public dcp(czq czqVar, bva bvaVar) {
        this.a = czqVar;
        this.b = bvaVar;
    }

    @Override // defpackage.epy
    public final void a(eqa eqaVar, epr eprVar) {
        if (eprVar == epr.ON_DESTROY) {
            d();
        } else {
            if (eprVar != epr.ON_CREATE || this.c) {
                return;
            }
            e(this.e);
        }
    }

    @Override // defpackage.bva
    public final void d() {
        if (!this.c) {
            this.c = true;
            czq czqVar = this.a;
            czqVar.setTag(R.id.wrapped_composition_tag, null);
            ept eptVar = this.d;
            if (eptVar != null) {
                eptVar.d(this);
            }
            this.d = null;
            dbe dbeVar = czqVar.g;
            if (dbeVar != null) {
                dbeVar.a.invoke();
            }
            czqVar.g = null;
        }
        this.b.d();
    }

    @Override // defpackage.bva
    public final void e(afeg afegVar) {
        bee beeVar = new bee(this, afegVar, 18, null);
        czq czqVar = this.a;
        ((Boolean) czqVar.m.a()).booleanValue();
        if (czqVar.isAttachedToWindow()) {
            beeVar.invoke(czqVar.P());
        } else {
            czqVar.C = beeVar;
        }
    }

    @Override // defpackage.bva
    public final boolean f() {
        return this.b.f();
    }
}
