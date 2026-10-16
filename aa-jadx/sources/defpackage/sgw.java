package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sgw implements defpackage.epl {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.SETUP.FRX");
    public final defpackage.sgv b;
    public boolean c = false;
    public final int d;
    int e;
    final int f;
    public final defpackage.erh g;
    private final int h;
    private final j$.util.Optional i;
    private final defpackage.epl j;

    /* JADX WARN: Multi-variable type inference failed */
    public sgw(defpackage.sgv sgvVar, int i, defpackage.erh erhVar, int i2, int i3, j$.util.Optional optional) {
        defpackage.sgu sguVar = new defpackage.sgu(this);
        this.j = sguVar;
        this.b = sgvVar;
        this.h = i;
        this.g = erhVar;
        this.d = i2;
        this.f = i3;
        this.i = optional;
        sgvVar.getLifecycle().c(sguVar);
    }

    public final void g() {
        this.c = true;
        defpackage.sgv sgvVar = this.b;
        sgvVar.E();
        sgvVar.K(false);
    }

    public final void h(int i) {
        java.lang.String str;
        defpackage.yqk yqkVar = a;
        defpackage.ypu ypuVarAi = yqkVar.f().ai(8910);
        switch (i) {
            case 1:
                str = "ENTRY";
                break;
            case 2:
                str = "DEVICE_INCOMPATIBLE";
                break;
            case 3:
                str = "INTRO_LOCKED";
                break;
            case 4:
                str = "INTRO";
                break;
            case 5:
                str = "INTRO_RETRY";
                break;
            case 6:
                str = "DOWNLOAD_GH";
                break;
            case 7:
                str = "RESET_USB";
                break;
            case 8:
                str = "NETWORK_ERROR";
                break;
            case 9:
                str = "EXIT";
                break;
            case 10:
                str = "EXIT_FAILURE";
                break;
            case 11:
                str = "EXIT_AND_CONTINUE";
                break;
            case 12:
                str = "UNPLUG_REPLUG";
                break;
            default:
                str = "null";
                break;
        }
        if (i == 0) {
            throw null;
        }
        ypuVarAi.y("moveTo %s", str);
        if (this.c) {
            yqkVar.h().ai(8911).u("moveTo exit early, no state changes should happen after an exit condition");
            return;
        }
        this.e = i;
        switch (i - 1) {
            case 0:
                int i2 = 2;
                this.g.M(defpackage.zbe.FRX_PRESETUP_GENERAL, this.d == 2 ? defpackage.zbd.cb : defpackage.zbd.ca);
                int i3 = this.h;
                if (i3 == 0 || i3 == 1) {
                    i2 = true != this.b.L() ? 4 : 3;
                } else if (i3 != 3 && i3 != 4 && i3 != 5) {
                    i2 = 10;
                }
                h(i2);
                return;
            case 1:
                defpackage.rit ritVar = defpackage.rit.INSTANCE;
                boolean zE = defpackage.acvq.e();
                defpackage.sgv sgvVar = this.b;
                if (zE) {
                    sgvVar.J(new defpackage.sgd());
                    return;
                } else {
                    sgvVar.J(new defpackage.sge());
                    return;
                }
            case 2:
                defpackage.sgv sgvVar2 = this.b;
                sgvVar2.F();
                sgvVar2.J(defpackage.sgm.a(true, false));
                return;
            case 3:
                defpackage.sgv sgvVar3 = this.b;
                sgvVar3.E();
                sgvVar3.J(defpackage.sgm.a(false, false));
                return;
            case 4:
                this.b.J(defpackage.sgm.a(false, true));
                return;
            case 5:
                defpackage.sgv sgvVar4 = this.b;
                if (sgvVar4.M()) {
                    sgvVar4.J(new defpackage.sfy());
                    return;
                } else {
                    h(8);
                    return;
                }
            case 6:
                defpackage.sgv sgvVar5 = this.b;
                defpackage.sgp sgpVar = new defpackage.sgp(this.i);
                sgpVar.setArguments(new android.os.Bundle());
                sgvVar5.J(sgpVar);
                return;
            case 7:
                this.g.M(defpackage.zbe.FRX_INSTALL_APPS, defpackage.zbd.bO);
                defpackage.sgv sgvVar6 = this.b;
                defpackage.sga sgaVar = new defpackage.sga();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("com.google.android.gms.carsetup.setup.ErrorFragment.ERROR_TITLE", com.google.android.projection.gearhead.R.string.car_frx_no_connection_title);
                bundle.putInt("com.google.android.gms.carsetup.setup.ErrorFragment.ERROR_MESSAGE", com.google.android.projection.gearhead.R.string.car_frx_no_connection_message);
                sgaVar.setArguments(bundle);
                sgvVar6.J(sgaVar);
                return;
            case 8:
            case 9:
                g();
                return;
            case 10:
                this.c = true;
                defpackage.sgv sgvVar7 = this.b;
                sgvVar7.E();
                sgvVar7.K(true);
                return;
            default:
                defpackage.sgv sgvVar8 = this.b;
                defpackage.shd shdVar = new defpackage.shd();
                shdVar.setArguments(new android.os.Bundle());
                sgvVar8.J(shdVar);
                return;
        }
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eU() {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eD(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eE(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eF(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eG(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eT(defpackage.eqg eqgVar) {
    }
}
