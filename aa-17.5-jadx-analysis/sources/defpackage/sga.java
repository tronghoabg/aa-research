package defpackage;

import android.os.Bundle;
import com.google.android.projection.gearhead.R;
import j$.util.Optional;

/* loaded from: classes2.dex */
public final class sga implements epf {
    public static final ypf a = ols.R("CAR.SETUP.FRX");
    public final sfz b;
    public boolean c = false;
    public final int d;
    int e;
    final int f;
    public final erb g;
    private final int h;
    private final Optional i;
    private final epf j;

    /* JADX WARN: Multi-variable type inference failed */
    public sga(sfz sfzVar, int i, erb erbVar, int i2, int i3, Optional optional) {
        sfy sfyVar = new sfy(this);
        this.j = sfyVar;
        this.b = sfzVar;
        this.h = i;
        this.g = erbVar;
        this.d = i2;
        this.f = i3;
        this.i = optional;
        sfzVar.getLifecycle().c(sfyVar);
    }

    public final void g() {
        this.c = true;
        sfz sfzVar = this.b;
        sfzVar.E();
        sfzVar.K(false);
    }

    public final void h(int i) {
        String str;
        ypf ypfVar = a;
        yop yopVarAi = ypfVar.f().ai(8885);
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
        yopVarAi.y("moveTo %s", str);
        if (this.c) {
            ypfVar.h().ai(8886).u("moveTo exit early, no state changes should happen after an exit condition");
            return;
        }
        this.e = i;
        switch (i - 1) {
            case 0:
                int i2 = 2;
                this.g.L(yzz.FRX_PRESETUP_GENERAL, this.d == 2 ? yzy.cb : yzy.ca);
                int i3 = this.h;
                if (i3 == 0 || i3 == 1) {
                    i2 = true != this.b.L() ? 4 : 3;
                } else if (i3 != 3 && i3 != 4 && i3 != 5) {
                    i2 = 10;
                }
                h(i2);
                return;
            case 1:
                rhx rhxVar = rhx.c;
                boolean zE = acuo.e();
                sfz sfzVar = this.b;
                if (zE) {
                    sfzVar.J(new sfh());
                    return;
                } else {
                    sfzVar.J(new sfi());
                    return;
                }
            case 2:
                sfz sfzVar2 = this.b;
                sfzVar2.F();
                sfzVar2.J(sfq.a(true, false));
                return;
            case 3:
                sfz sfzVar3 = this.b;
                sfzVar3.E();
                sfzVar3.J(sfq.a(false, false));
                return;
            case 4:
                this.b.J(sfq.a(false, true));
                return;
            case 5:
                sfz sfzVar4 = this.b;
                if (sfzVar4.M()) {
                    sfzVar4.J(new sfc());
                    return;
                } else {
                    h(8);
                    return;
                }
            case 6:
                sfz sfzVar5 = this.b;
                sft sftVar = new sft(this.i);
                sftVar.setArguments(new Bundle());
                sfzVar5.J(sftVar);
                return;
            case 7:
                this.g.L(yzz.FRX_INSTALL_APPS, yzy.bO);
                sfz sfzVar6 = this.b;
                sfe sfeVar = new sfe();
                Bundle bundle = new Bundle();
                bundle.putInt("com.google.android.gms.carsetup.setup.ErrorFragment.ERROR_TITLE", R.string.car_frx_no_connection_title);
                bundle.putInt("com.google.android.gms.carsetup.setup.ErrorFragment.ERROR_MESSAGE", R.string.car_frx_no_connection_message);
                sfeVar.setArguments(bundle);
                sfzVar6.J(sfeVar);
                return;
            case 8:
            case 9:
                g();
                return;
            case 10:
                this.c = true;
                sfz sfzVar7 = this.b;
                sfzVar7.E();
                sfzVar7.K(true);
                return;
            default:
                sfz sfzVar8 = this.b;
                sgh sghVar = new sgh();
                sghVar.setArguments(new Bundle());
                sfzVar8.J(sghVar);
                return;
        }
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fL(eqa eqaVar) {
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

    @Override // defpackage.epf
    public final /* synthetic */ void fy(eqa eqaVar) {
    }
}
