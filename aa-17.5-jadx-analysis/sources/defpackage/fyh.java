package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Size;
import androidx.car.app.model.Background;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarProgressBar;
import com.google.android.gms.car.CarSensorEvent;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class fyh {
    public static final void a(fyi fyiVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(622298816);
        if (i3 == 0) {
            i2 = i | (true != buxVarC.C(fyiVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfy cfyVarBf = ca.bf(awd.d(cfyVar, 132.0f), true, null);
            avp avpVar = bmo.a;
            cfy cfyVarD = das.d(afp.D(afp.x(ggh.a(cfyVarBf, czz.ar(7, buxVarC), gux.c(buxVarC).C(), 0L, null, null, null, false, false, buxVarC, 0, 252), true, null, null, fyiVar.a), 2.0f, gux.c(buxVarC).A(), bcr.d()), "alphajump-button");
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarD);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            atn atnVar = atn.a;
            brp.b("A\n•\nZ", atnVar.a(asl.I(cfy.e, gjk.b.k, BitmapDescriptorFactory.HUE_RED), cfl.e), gux.c(buxVarC).T(), 0L, null, 0L, new dkt(3), 0L, 0, false, 0, 0, czz.av(buxVarC).l, buxVarC, 6, 0, 130040);
            buxVarC = buxVarC;
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bro(fyiVar, cfyVar, i, 12, null);
        }
    }

    public static final fyj b(Background background, geu geuVar) {
        gag gagVarA;
        CarColor color = background.getColor();
        CarIcon image = background.getImage();
        if (image != null) {
            ghw ghwVar = ghw.a;
            ghv ghvVar = ghv.a;
            ghvVar.getClass();
            gagVarA = gai.a(image, geuVar, ghwVar, ghvVar, null, 8);
        } else {
            gagVarA = null;
        }
        return new fyj(color, gagVarA);
    }

    public static final gcb c(gby gbyVar, geu geuVar) {
        CarColor carColor = gbyVar.b;
        return new gcb(gbyVar.a, carColor != null ? gzw.g(carColor, geuVar.d().g()) : null);
    }

    public static final gby d(CarProgressBar carProgressBar) {
        return new gby(carProgressBar.getProgress(), carProgressBar.getColor());
    }

    public static int e(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        int i3 = 1;
        if (i2 != 1) {
            int i4 = i2 != 3 ? 1024 : 2048;
            return (i4 + i4) * i3;
        }
        i3 = 2;
        return (i4 + i4) * i3;
    }

    public static final int f(DrawingSpec drawingSpec, jkk jkkVar) {
        if (acpf.p()) {
            ikz ikzVar = ((ina) jkkVar).m;
            if (ikzVar.j("settings_native_app_dpi")) {
                String strB = ikzVar.b("settings_native_app_dpi", "160");
                strB.getClass();
                return Integer.parseInt(strB);
            }
        }
        int i = drawingSpec.a;
        int i2 = drawingSpec.b;
        Size size = i > i2 ? ipn.b : ipn.c;
        return (int) Math.min(Math.min((i * 160.0d) / size.getWidth(), (i2 * 160.0d) / size.getHeight()), drawingSpec.c * 1.31d);
    }

    public static CarSensorEvent g(int i, abow abowVar) {
        byte[] bArrD;
        switch (i) {
            case 1:
                return roc.u((xit) abowVar);
            case 2:
                return roc.I((xog) abowVar);
            case 3:
                CarSensorEvent carSensorEvent = new CarSensorEvent(3, SystemClock.elapsedRealtimeNanos(), 1, 0);
                carSensorEvent.d[0] = ((xnq) abowVar).b * 0.001f;
                return carSensorEvent;
            case 4:
                return roc.G((xlu) abowVar);
            case 5:
                return roc.z((xjj) abowVar);
            case 6:
                CarSensorEvent carSensorEvent2 = new CarSensorEvent(6, SystemClock.elapsedRealtimeNanos(), 0, 1);
                carSensorEvent2.e[0] = ((xly) abowVar).b;
                return carSensorEvent2;
            case 7:
                CarSensorEvent carSensorEvent3 = new CarSensorEvent(7, SystemClock.elapsedRealtimeNanos(), 0, 1);
                byte[] bArr = carSensorEvent3.e;
                int iD = wox.D(((xjl) abowVar).b);
                if (iD == 0) {
                    iD = 1;
                }
                bArr[0] = (byte) (iD - 1);
                return carSensorEvent3;
            case 8:
                return roc.w((xjb) abowVar);
            case 9:
                return roc.F((xlt) abowVar);
            case 10:
                return roc.E((xkh) abowVar);
            case 11:
                CarSensorEvent carSensorEvent4 = new CarSensorEvent(11, SystemClock.elapsedRealtimeNanos(), 0, 1);
                carSensorEvent4.e[0] = (byte) ((xjf) abowVar).b;
                return carSensorEvent4;
            case 12:
                return roc.y((xjg) abowVar);
            case 13:
                return roc.C((xjr) abowVar);
            case 14:
                return roc.t((xgy) abowVar);
            case 15:
                return roc.v((xja) abowVar);
            case 16:
                return roc.x((xjd) abowVar);
            case 17:
                return roc.A((xjo) abowVar);
            case 18:
                return roc.B((xjp) abowVar);
            case 19:
                return roc.D((xkg) abowVar);
            case 20:
                return roc.H((xlz) abowVar);
            case 21:
                return roc.J((xoj) abowVar);
            case 22:
                CarSensorEvent carSensorEvent5 = new CarSensorEvent(22, SystemClock.elapsedRealtimeNanos(), 0, 1);
                carSensorEvent5.e[0] = ((xok) abowVar).b;
                return carSensorEvent5;
            case 23:
                abowVar.getClass();
                Objects.checkIndex(0, 3);
                if (abowVar instanceof xgu) {
                    bArrD = ((xgu) abowVar).h();
                } else {
                    if (!(abowVar instanceof xnk)) {
                        throw new IllegalArgumentException("Unsupported VehicleEnergyModel data type");
                    }
                    bArrD = ((xnk) abowVar).b.D();
                }
                return new CarSensorEvent(23, SystemClock.elapsedRealtimeNanos(), new float[0], bArrD);
            case 24:
                return new CarSensorEvent(24, SystemClock.elapsedRealtimeNanos(), new float[0], ((xon) abowVar).h());
            case 25:
                return new CarSensorEvent(25, SystemClock.elapsedRealtimeNanos(), new float[0], ((xni) abowVar).b.D());
            default:
                throw new IllegalArgumentException(a.bp(i, "Invalid type "));
        }
    }

    public static Intent h(int i, yze yzeVar, String str) {
        Intent intent = new Intent();
        intent.setComponent(itx.e);
        intent.addFlags(268435456);
        intent.putExtra("connection_type", i);
        intent.putExtra("error_code", yzeVar.D);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("error_details", str);
        }
        return intent;
    }

    public static void i(Context context, yze yzeVar, int i, yzf yzfVar, String str) {
        if (yzeVar == yze.PROTOCOL_IO_ERROR || yzeVar == yze.PROTOCOL_BYEBYE_REQUESTED_BY_USER || yzeVar == yze.PROTOCOL_BYEBYE_REQUESTED_BY_CAR || yzeVar == yze.PREFLIGHT_FAILED || yzeVar == yze.SESSION_OBSOLETE_DUE_TO_NEW_CONNECTION || yzfVar == yzf.BYEBYE_TIMEOUT) {
            return;
        }
        context.startActivity(h(i, yzeVar, str));
    }
}
