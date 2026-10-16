package defpackage;

import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.projection.gearhead.R;
import j$.util.Objects;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class lkn implements eqn {
    private final /* synthetic */ int a;

    public /* synthetic */ lkn(int i) {
        this.a = i;
    }

    @Override // defpackage.eqn
    public final void eS(Object obj) {
        int i = 2;
        switch (this.a) {
            case 0:
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    nfy.a().c(ngb.i);
                    break;
                }
                break;
            case 2:
                lol lolVar = (lol) obj;
                lolVar.d();
                lolVar.e();
                break;
            case 3:
                break;
            case 4:
                yph yphVar = lnb.a;
                break;
            case 5:
                yph yphVar2 = lnb.a;
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                yph yphVar3 = lsc.a;
                break;
            case 9:
                yph yphVar4 = lsc.a;
                ((Boolean) obj).booleanValue();
                break;
            case 10:
                ((ype) lsc.a.l().ai((char) 4254)).u("Expiring observer keeping target app connection active");
                break;
            case 11:
                yph yphVar5 = lvv.a;
                lvv.l(new iwu(12));
                break;
            case 12:
                Map map = (Map) obj;
                yph yphVar6 = oxs.a;
                if (lzf.c()) {
                    for (mqc mqcVar : map.values()) {
                        if (mqcVar.d) {
                            int i2 = nqe.a;
                            int i3 = nqg.a;
                            nqf.a.b(kio.b().e(), mqcVar.a());
                            break;
                        }
                    }
                    int i4 = nqe.a;
                    int i5 = nqg.a;
                    nqf.a.e(kio.b().e());
                    break;
                }
                break;
            case 13:
                yph yphVar7 = oxs.a;
                if (((Boolean) obj).booleanValue()) {
                    ((ype) ((ype) oxs.a.f()).ai((char) 6097)).u("Stopping immersives due to dashboard becoming visible");
                    nqd.a().h();
                    break;
                }
                break;
            case 14:
                yph yphVar8 = oxs.a;
                if (Objects.equals((Integer) obj, 2)) {
                    ((ype) ((ype) oxs.a.f()).ai((char) 6098)).u("Stopping immersives due to demand space becoming open");
                    nqd.a().h();
                    break;
                }
                break;
            case 15:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                yph yphVar9 = oxs.a;
                ((ype) oxs.a.l().ai((char) 6095)).y("Handling assistant scrim change: %b", bool);
                if (zBooleanValue) {
                    kzn kznVarB = kzn.b();
                    if (kznVarB.b != null) {
                        ((ype) kzn.a.l().ai((char) 3663)).u("Already shown");
                        break;
                    } else {
                        ((ype) kzn.a.l().ai((char) 3662)).u("Showing");
                        nso nsoVarB = nsr.c().b();
                        qsw qswVarN = nsoVarB.n(nsn.b);
                        qswVarN.getClass();
                        CarWindowLayoutParams carWindowLayoutParamsA = qswVarN.a();
                        qsw qswVarN2 = nsoVarB.n(nsn.o);
                        qswVarN2.getClass();
                        int i6 = 1;
                        qswVarN2.l = true;
                        qswVarN2.g = carWindowLayoutParamsA.i - 1;
                        qswVarN2.q = null;
                        qswVarN2.m = 2065;
                        qswVarN2.n = true != leh.a().b() ? R.style.Theme_Gearhead_Coolwalk_Dark : R.style.Theme_Gearhead_Coolwalk_DayNight;
                        kznVarB.b = (noh) kgq.c(new mmd(kznVarB, qswVarN2.a(), i6), "GH.AssistantScrimMan", yzz.ASSISTANT_SCRIM, yzy.Lg, true, "Unable to show scrim for assistant", new Object[0]);
                        break;
                    }
                } else {
                    kzn.b().d();
                    break;
                }
            default:
                yph yphVar10 = qir.a;
                qir.l(new qhc(i));
                break;
        }
    }
}
