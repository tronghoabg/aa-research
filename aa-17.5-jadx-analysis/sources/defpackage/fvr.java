package defpackage;

import android.os.Handler;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import j$.time.Clock;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class fvr {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(fvs fvsVar, cfy cfyVar, bux buxVar, int i) {
        bux buxVarC = buxVar.c(-2043095983);
        int i2 = (i & 6) == 0 ? i | (true != ((i & 8) == 0 ? buxVarC.C(fvsVar) : buxVarC.E(fvsVar)) ? 2 : 4) : i;
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            buxVarC.v(-1890467309);
            ctp ctpVarA = atp.a(atd.g(fvsVar.b), cfl.k, buxVarC, 48);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            buxVarC.v(1062523121);
            for (afbn afbnVar = new afbn((afbo) fvsVar.a, 0, 0); afbnVar.hasNext(); afbnVar = afbnVar) {
                fwl.a((fwm) afbnVar.next(), null, null, false, null, null, null, null, buxVarC, 8, 254);
                bvvVar = bvvVar;
            }
            bvv bvvVar2 = bvvVar;
            bvvVar2.Y(false);
            bvvVar2.Y(true);
            bvvVar2.Y(false);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bro(fvsVar, cfyVar, i, 6, null);
        }
    }

    public static final fvv b(Action action, geu geuVar, afdr afdrVar) {
        afdr bshVar;
        action.getClass();
        geuVar.getClass();
        if (afdrVar != null) {
            bshVar = afdrVar;
        } else {
            if (action.getType() == 65539) {
                afdrVar = new flm(geuVar, 15);
            } else if (action.getType() == 65542 || action.getType() == 1 || action.getType() == 65540 || action.getType() == 65538) {
                uq onClickDelegate = action.getOnClickDelegate();
                bshVar = onClickDelegate != null ? new bsh(geuVar, onClickDelegate, 20) : null;
            } else {
                if (action.getType() != 65541) {
                    throw new IllegalStateException("OnClick unsupported for " + action.getType());
                }
                afdrVar = new flm(geuVar, 16);
            }
            bshVar = afdrVar;
        }
        int flags = action.getFlags();
        boolean zIsEnabled = action.isEnabled();
        int type = action.getType();
        CarColor backgroundColor = action.getBackgroundColor();
        CarIcon icon = action.getIcon();
        CarText title = action.getTitle();
        fvv fvvVar = new fvv(flags, zIsEnabled, type, backgroundColor, icon, bshVar, title != null ? fzo.f(title) : null, action.isStandard(), g(action, geuVar));
        gka.b(fvvVar, action);
        return fvvVar;
    }

    public static final boolean c(Action action) {
        action.getClass();
        return (action.getFlags() & 4) != 0;
    }

    public static final boolean d(Action action) {
        action.getClass();
        return (action.getFlags() & 1) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.fwb e(androidx.car.app.model.Action r10, defpackage.geu r11, defpackage.afdr r12) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fvr.e(androidx.car.app.model.Action, geu, afdr):fwb");
    }

    public static /* synthetic */ fwb f(fwb fwbVar, afdr afdrVar, int i) {
        boolean zE = (i & 1) != 0 ? fwbVar.e() : false;
        if ((i & 2) != 0) {
            afdrVar = fwbVar.d();
        }
        gcs gcsVarC = (i & 4) != 0 ? fwbVar.c() : null;
        if (fwbVar instanceof fvy) {
            return fvy.h((fvy) fwbVar, gcsVarC, afdrVar, zE);
        }
        if (fwbVar instanceof fwa) {
            fwa fwaVar = (fwa) fwbVar;
            return fwa.h(fwaVar, null, fvy.h(fwaVar.b, gcsVarC, afdrVar, zE), 1);
        }
        if (fwbVar instanceof fvz) {
            return fvz.h((fvz) fwbVar, null, 3);
        }
        throw new aezs();
    }

    public static /* synthetic */ fvw g(Action action, geu geuVar) {
        Integer numValueOf;
        int iIntValue;
        String str;
        String lowerCase;
        Integer numC;
        String string;
        List<CharSequence> variants;
        CharSequence charSequence;
        int iHashCode;
        Clock clockSystemUTC = Clock.systemUTC();
        clockSystemUTC.getClass();
        clockSystemUTC.getClass();
        boolean zC = c(action);
        int i = 1;
        int epochMilli = 0;
        if (zC) {
            iIntValue = 10000;
        } else {
            CarText title = action.getTitle();
            List listK = (title == null || (variants = title.getVariants()) == null || (charSequence = (CharSequence) woy.bH(variants)) == null) ? null : afyh.K(charSequence, new char[]{'|'}, 0);
            if (listK == null || (str = (String) woy.bH(listK)) == null || !afyh.u(str, "TimedActionParams", false)) {
                numValueOf = null;
            } else {
                String str2 = (String) woy.bI(listK, 1);
                List listK2 = str2 != null ? afyh.K(str2, new char[]{','}, 0) : null;
                int iIntValue2 = 10;
                if (listK2 != null) {
                    Iterator it = listK2.iterator();
                    while (it.hasNext()) {
                        List listK3 = afyh.K((String) it.next(), new char[]{':'}, 0);
                        String str3 = (String) woy.bH(listK3);
                        String string2 = str3 != null ? afyh.k(str3).toString() : null;
                        String str4 = (String) woy.bI(listK3, 1);
                        if (str4 == null || (string = afyh.k(str4).toString()) == null) {
                            lowerCase = null;
                        } else {
                            lowerCase = string.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        }
                        if (affa.f(string2, "duration") && lowerCase != null && (numC = afyh.c(lowerCase)) != null) {
                            iIntValue2 = numC.intValue();
                        }
                    }
                }
                numValueOf = Integer.valueOf(iIntValue2 * 1000);
            }
            if (numValueOf == null) {
                return null;
            }
            iIntValue = numValueOf.intValue();
        }
        if (((ggk) geuVar.F(ggk.class)).L()) {
            uq onClickDelegate = action.getOnClickDelegate();
            if (onClickDelegate != null) {
                iHashCode = onClickDelegate.hashCode();
            } else {
                int type = action.getType() * 31;
                CarText title2 = action.getTitle();
                int iHashCode2 = (type + (title2 != null ? title2.hashCode() : 0)) * 31;
                CarIcon icon = action.getIcon();
                int iHashCode3 = (((((iHashCode2 + (icon != null ? icon.hashCode() : 0)) * 31) + action.getFlags()) * 31) + a.f(action.isEnabled())) * 31;
                CarColor backgroundColor = action.getBackgroundColor();
                iHashCode = (backgroundColor != null ? backgroundColor.hashCode() : 0) + iHashCode3;
            }
            Instant instant = clockSystemUTC.instant();
            Map map = fvx.a;
            instant.getClass();
            long j = iIntValue + 300000;
            Long lValueOf = Long.valueOf(j);
            Map map2 = fvx.a;
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            Object obj = map2.get(numValueOf2);
            if (obj == null) {
                map2.put(numValueOf2, instant);
                obj = instant;
                epochMilli = 1;
            }
            Instant instant2 = (Instant) obj;
            if (epochMilli != 0) {
                kze kzeVar = new kze(iHashCode, i);
                fvx.c.put(numValueOf2, kzeVar);
                Handler handler = fvx.b;
                lValueOf.getClass();
                handler.postDelayed(kzeVar, j);
            }
            epochMilli = (int) (instant.toEpochMilli() - instant2.toEpochMilli());
        }
        return new fvw(clockSystemUTC, iIntValue, epochMilli, zC);
    }

    public static /* synthetic */ fwm h(fvu fvuVar, geu geuVar, fwx fwxVar, boolean z, fwh fwhVar, hls hlsVar, fwe fweVar, boolean z2, int i, int i2) {
        fwm fwmVar;
        fwh fwhVar2 = (i2 & 8) != 0 ? fwh.c : fwhVar;
        hls hlsVar2 = (i2 & 16) != 0 ? new hls(true, false, false) : hlsVar;
        fwe fweVar2 = (i2 & 32) != 0 ? null : fweVar;
        boolean z3 = (!((i2 & 64) == 0)) | z2;
        int i3 = (i2 & 128) != 0 ? 1 : i;
        boolean z4 = ((i2 & 4) == 0) & z;
        fvuVar.getClass();
        fwhVar2.getClass();
        hlsVar2.getClass();
        if (i3 == 0) {
            throw null;
        }
        fwb fwbVar = fvuVar.b;
        if (fwbVar != null) {
            gcs gcsVarC = z4 ? null : fwbVar.c();
            if ((i2 & 2) != 0) {
                fwxVar = null;
            }
            fwmVar = new fwm(null, fxa.e(fwbVar, geuVar, gcsVarC, 2), fwxVar);
        } else {
            fvv fvvVar = fvuVar.a;
            if (fvvVar == null) {
                throw new IllegalStateException("Either of the internal models should be non null!");
            }
            fwmVar = new fwm(fwl.f(fvvVar, geuVar, fwhVar2, fweVar2, hlsVar2, z4, i3, z3, 128), null, null);
        }
        gzj.d(fwmVar, fvuVar);
        return fwmVar;
    }

    public static final fwd i(Integer num) {
        int iIntValue = num.intValue();
        return new fwd(iIntValue, iIntValue);
    }

    public static final boolean j(Action action) {
        action.getClass();
        return action.getType() == 65540;
    }

    public static final fvz k(geu geuVar) {
        CarIcon carIcon = CarIcon.APP_ICON;
        carIcon.getClass();
        return new fvz(gai.a(carIcon, geuVar, null, null, null, 14), null);
    }
}
