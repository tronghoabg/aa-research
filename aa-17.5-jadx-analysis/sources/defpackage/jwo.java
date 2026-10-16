package defpackage;

import android.content.ComponentName;
import androidx.car.app.navigation.model.Maneuver;

/* loaded from: classes2.dex */
public final class jwo extends gns {
    private static final yph a = yph.c("CarApp.H");
    private final ohs b;

    public jwo(ohs ohsVar) {
        this.b = ohsVar;
    }

    @Override // defpackage.gns
    public final void b() {
        this.b.F((rrc) rrc.h(yxy.GEARHEAD, yzz.CAR_APP_LIBRARY, yzy.yW).l());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.gns
    public final void d(gnq gnqVar) {
        yzy yzyVar;
        int i;
        int i2 = gnqVar.j;
        if (i2 == 0) {
            throw new IllegalStateException("Missing required properties: action");
        }
        gnr gnrVar = new gnr(i2, gnqVar.a, gnqVar.b, gnqVar.c, gnqVar.d, gnqVar.e, gnqVar.f, gnqVar.g, gnqVar.h, gnqVar.i);
        int i3 = gnrVar.h;
        if (i3 == 0) {
            throw null;
        }
        switch (i3 - 1) {
            case 0:
                yzyVar = yzy.rP;
                break;
            case 1:
                yzyVar = yzy.rQ;
                break;
            case 2:
                yzyVar = yzy.sh;
                break;
            case 3:
                yzyVar = yzy.si;
                break;
            case 4:
                yzyVar = yzy.rT;
                break;
            case 5:
                yzyVar = yzy.rU;
                break;
            case 6:
                yzyVar = yzy.Jz;
                break;
            case 7:
                yzyVar = yzy.rX;
                break;
            case 8:
                yzyVar = yzy.rY;
                break;
            case 9:
                yzyVar = yzy.sS;
                break;
            case 10:
                yzyVar = yzy.sT;
                break;
            case 11:
                yzyVar = yzy.rZ;
                break;
            case 12:
                yzyVar = yzy.se;
                break;
            case 13:
                yzyVar = yzy.sf;
                break;
            case 14:
                yzyVar = yzy.sB;
                break;
            case 15:
                yzyVar = yzy.sC;
                break;
            case 16:
                yzyVar = yzy.sD;
                break;
            case 17:
                yzyVar = yzy.sE;
                break;
            case 18:
                yzyVar = yzy.sG;
                break;
            case 19:
                yzyVar = yzy.a;
                break;
            case 20:
                yzyVar = yzy.sI;
                break;
            case 21:
                yzyVar = yzy.sJ;
                break;
            case 22:
                yzyVar = yzy.a;
                break;
            case 23:
                yzyVar = yzy.rV;
                break;
            case 24:
                yzyVar = yzy.Jx;
                break;
            case 25:
                yzyVar = yzy.Jy;
                break;
            case 26:
                yzyVar = yzy.mV;
                break;
            case 27:
                yzyVar = yzy.mW;
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                throw new IllegalArgumentException("This telemetry should not be called from apphost code as it is host-specific.");
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                throw new IllegalArgumentException("This telemetry should not be called from apphost code as it is host-specific.");
            case 30:
                yzyVar = yzy.JD;
                break;
            case 31:
                yzyVar = yzy.JE;
                break;
            case 32:
                yzyVar = yzy.JF;
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                yzyVar = yzy.JB;
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                yzyVar = yzy.JC;
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                yzyVar = yzy.JG;
                break;
            default:
                yzyVar = yzy.JH;
                break;
        }
        ComponentName componentName = (ComponentName) gnrVar.d.e();
        String str = (String) gnrVar.a.e();
        Long l = (Long) gnrVar.b.e();
        gnk gnkVar = (gnk) gnrVar.c.e();
        gnl gnlVar = (gnl) gnrVar.e.e();
        gnm gnmVar = (gnm) gnrVar.f.e();
        String str2 = (String) gnrVar.g.e();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.CAR_APP_LIBRARY, yzyVar);
        if (gnkVar != null) {
            abnp abnpVarN = ywx.a.n();
            int i4 = 8;
            switch (gnkVar.ordinal()) {
                case 0:
                    i = 1;
                    break;
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 25;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                case 6:
                    i = 6;
                    break;
                case 7:
                    i = 7;
                    break;
                case 8:
                    i = 8;
                    break;
                case 9:
                    i = 9;
                    break;
                case 10:
                    i = 10;
                    break;
                case 11:
                    i = 11;
                    break;
                case 12:
                    i = 12;
                    break;
                case 13:
                    i = 13;
                    break;
                case 14:
                    i = 14;
                    break;
                case 15:
                    i = 15;
                    break;
                case 16:
                    i = 16;
                    break;
                case 17:
                    i = 17;
                    break;
                case 18:
                    i = 18;
                    break;
                case 19:
                    i = 19;
                    break;
                case 20:
                    i = 20;
                    break;
                case 21:
                    i = 21;
                    break;
                case 22:
                    i = 22;
                    break;
                case 23:
                    i = 23;
                    break;
                case 24:
                    i = 24;
                    break;
                case 25:
                    i = 26;
                    break;
                case 26:
                    i = 27;
                    break;
                case 27:
                    i = 28;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    i = 29;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    i = 30;
                    break;
                case 30:
                    i = 31;
                    break;
                case 31:
                    i = 33;
                    break;
                case 32:
                    i = 32;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    i = 36;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    i = 38;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    i = 39;
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    i = 52;
                    break;
                case 37:
                    i = 53;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    i = 54;
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    i = 55;
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    i = 51;
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    i = 56;
                    break;
                default:
                    throw new aezs();
            }
            abnpVarN.t();
            ywx ywxVar = (ywx) abnpVarN.b;
            ywxVar.b |= 1;
            ywxVar.c = i - 1;
            if (gnlVar != null) {
                switch (gnlVar.ordinal()) {
                    case 0:
                        i4 = 1;
                        abnpVarN.t();
                        ywx ywxVar2 = (ywx) abnpVarN.b;
                        ywxVar2.b |= 2;
                        ywxVar2.d = i4 - 1;
                        break;
                    case 1:
                        i4 = 2;
                        abnpVarN.t();
                        ywx ywxVar22 = (ywx) abnpVarN.b;
                        ywxVar22.b |= 2;
                        ywxVar22.d = i4 - 1;
                        break;
                    case 2:
                        i4 = 3;
                        abnpVarN.t();
                        ywx ywxVar222 = (ywx) abnpVarN.b;
                        ywxVar222.b |= 2;
                        ywxVar222.d = i4 - 1;
                        break;
                    case 3:
                        i4 = 4;
                        abnpVarN.t();
                        ywx ywxVar2222 = (ywx) abnpVarN.b;
                        ywxVar2222.b |= 2;
                        ywxVar2222.d = i4 - 1;
                        break;
                    case 4:
                        i4 = 5;
                        abnpVarN.t();
                        ywx ywxVar22222 = (ywx) abnpVarN.b;
                        ywxVar22222.b |= 2;
                        ywxVar22222.d = i4 - 1;
                        break;
                    case 5:
                        i4 = 6;
                        abnpVarN.t();
                        ywx ywxVar222222 = (ywx) abnpVarN.b;
                        ywxVar222222.b |= 2;
                        ywxVar222222.d = i4 - 1;
                        break;
                    case 6:
                        i4 = 7;
                        abnpVarN.t();
                        ywx ywxVar2222222 = (ywx) abnpVarN.b;
                        ywxVar2222222.b |= 2;
                        ywxVar2222222.d = i4 - 1;
                        break;
                    case 7:
                        abnpVarN.t();
                        ywx ywxVar22222222 = (ywx) abnpVarN.b;
                        ywxVar22222222.b |= 2;
                        ywxVar22222222.d = i4 - 1;
                        break;
                    default:
                        throw new aezs();
                }
            }
            rrbVarH.n = xxh.h((ywx) abnpVarN.q());
        }
        if (componentName != null) {
            rrbVarH.p(componentName);
        }
        if (str != null) {
            rrbVarH.i(str);
        }
        if (l != null) {
            rrbVarH.u(l.longValue());
        }
        if (gnmVar != null) {
            abnp abnpVarN2 = yxa.a.n();
            abnpVarN2.t();
            yxa yxaVar = (yxa) abnpVarN2.b;
            yxaVar.b |= 1;
            yxaVar.c = gnmVar.a;
            abnpVarN2.t();
            yxa yxaVar2 = (yxa) abnpVarN2.b;
            yxaVar2.b |= 2;
            yxaVar2.d = gnmVar.b;
            abnv abnvVarQ = abnpVarN2.q();
            abnvVarQ.getClass();
            rrbVarH.p = xxh.h((yxa) abnvVarQ);
        }
        if (str2 != null) {
            rrbVarH.j(str2);
        }
        rrc rrcVar = (rrc) rrbVarH.l();
        if (affa.f(rrcVar.i, yzy.a)) {
            ((ype) a.h()).u("UNKNOWN_ACTION is not a valid action, will no-op");
        } else {
            this.b.F(rrcVar);
        }
    }

    @Override // defpackage.gns
    public final void e() {
        this.b.F((rrc) rrc.h(yxy.GEARHEAD, yzz.CAR_APP_LIBRARY, yzy.yV).l());
    }

    @Override // defpackage.gns
    public final void f(ComponentName componentName) {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.CAR_APP_LIBRARY, yzy.JI);
        rrbVarH.p(componentName);
        this.b.F((rrc) rrbVarH.l());
    }

    @Override // defpackage.gns
    public final void g() {
        this.b.F((rrc) rrc.h(yxy.GEARHEAD, yzz.CAR_APP_LIBRARY, yzy.yX).l());
    }
}
