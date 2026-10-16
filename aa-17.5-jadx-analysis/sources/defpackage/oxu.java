package defpackage;

import android.content.Intent;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarDisplayUiFeatures;

/* loaded from: classes.dex */
public abstract class oxu implements epf {
    private static final yph c = yph.c("GH.SecondaryDCM");
    public final rcg a = new oxt(this, 0);
    public boolean b = true;
    private CarDisplayId d = null;
    private tgs e = null;

    public oxu(eqa eqaVar) {
        eqaVar.getLifecycle().c(this);
        lgx.b().a(mpz.b).fE(eqaVar, new ntw(this, 17));
    }

    public static final boolean l(CarDisplayUiFeatures carDisplayUiFeatures) {
        return !carDisplayUiFeatures.a(16);
    }

    private final void m(Intent intent) {
        intent.putExtra("com.google.android.gms.car.EXTRA_SHOW_TURN_CARD", this.b);
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        if (this.e == null) {
            return;
        }
        CarDisplayId carDisplayId = this.d;
        carDisplayId.getClass();
        if (kio.b().q()) {
            kgq.d(new mjc(this, carDisplayId, 5, null), "GH.SecondaryDCM", yzz.CAR_DISPLAY_UI_FEATURES, yzy.Lo, "Error unregistering listener.", new Object[0]);
        }
    }

    @Override // defpackage.epf
    public final void fy(eqa eqaVar) {
        tgs tgsVarK = k();
        this.e = tgsVarK;
        if (tgsVarK == null) {
            return;
        }
        CarDisplayId carDisplayId = ((nso) tgsVarK.i(nso.class)).o;
        this.d = carDisplayId;
        mmd mmdVar = new mmd(this, carDisplayId, 3);
        yzz yzzVar = yzz.CAR_DISPLAY_UI_FEATURES;
        kgq.c(mmdVar, "GH.SecondaryDCM", yzzVar, yzy.Lm, true, "Error getting initial values.", new Object[0]);
        kgq.d(new mjc(this, this.d, 6, null), "GH.SecondaryDCM", yzzVar, yzy.Ln, "Error registering listener.", new Object[0]);
    }

    public abstract Intent g();

    public abstract Intent h();

    protected abstract String i();

    public final void j(Intent intent, Intent intent2) {
        m(intent);
        m(intent2);
        tgs tgsVar = this.e;
        if (tgsVar == null) {
            i();
            return;
        }
        mpk mpkVar = (mpk) tgsVar.i(mpk.class);
        i();
        try {
            mpkVar.a(intent);
        } catch (IllegalArgumentException unused) {
            intent2.getComponent().getClass();
            ((ype) ((ype) c.g()).ai(6136)).R("Failed to start navigation intent: %s. Starting fallback intent: %s for %s", intent, intent2, i());
            mpkVar.a(intent2);
        }
    }

    protected abstract tgs k();

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fw(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fx(eqa eqaVar) {
    }
}
