package defpackage;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.text.format.DateFormat;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.gms.car.CarWindowLayoutParams;
import j$.time.Duration;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class nsh {
    public static final CarWindowLayoutParams a(nso nsoVar, nsn nsnVar, afec afecVar) {
        qsw qswVarN = nsoVar.n(nsnVar);
        if (qswVarN == null) {
            return null;
        }
        afecVar.invoke(qswVarN);
        return qswVarN.a();
    }

    public static nog b(CarWindowLayoutParams carWindowLayoutParams, String str, Fragment fragment, eqa eqaVar) {
        return c().a(carWindowLayoutParams, str, fragment, eqaVar);
    }

    public static noj c() {
        return (noj) mki.a.b(noj.class, new lfu(11));
    }

    public static /* synthetic */ String d(int i) {
        return i != 1 ? i != 2 ? "RESTORE_PREVIOUSLY_SAVED_VIEW" : "SAVE_FOCUSED_VIEW" : "DEFAULT";
    }

    public static final void e(final cfy cfyVar, final dfw dfwVar, final long j, final String str, final String str2, final boolean z, bux buxVar, final int i) {
        int i2;
        String str3;
        String str4;
        bux buxVar2;
        Object obj;
        byf byfVar;
        bux buxVarC = buxVar.c(-810397845);
        if ((i & 6) == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(dfwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.B(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            str3 = str;
            i2 |= true != buxVarC.C(str3) ? 1024 : 2048;
        } else {
            str3 = str;
        }
        if ((i & 24576) == 0) {
            str4 = str2;
            i2 |= true != buxVarC.C(str4) ? 8192 : 16384;
        } else {
            str4 = str2;
        }
        int i3 = i2 | 196608;
        if (buxVarC.I((74899 & i3) != 74898, i3 & 1)) {
            Context context = (Context) buxVarC.f(daa.b);
            Duration duration = nyy.a;
            boolean zC = buxVarC.C(null);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                objS = new ParcelableSnapshotMutableLongState(System.currentTimeMillis());
                bvvVar.ad(objS);
            }
            byf byfVar2 = (byf) objS;
            Object objS2 = bvvVar.S();
            Object obj2 = buw.a;
            if (objS2 == obj2) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(Boolean.valueOf(DateFormat.is24HourFormat(context)), bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS2 = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objS2;
            afak afakVar = afak.a;
            boolean zC2 = buxVarC.C(byfVar2);
            Object objS3 = bvvVar.S();
            if (zC2 || objS3 == obj2) {
                objS3 = new bto(byfVar2, (afck) null, 3);
                bvvVar.ad(objS3);
            }
            bvq.g(afakVar, (afeg) objS3, buxVarC);
            boolean zC3 = buxVarC.C(byfVar2) | buxVarC.E(context);
            Object objS4 = bvvVar.S();
            if (zC3 || objS4 == obj2) {
                obj = obj2;
                byfVar = byfVar2;
                acg acgVar = new acg((Object) context, (Object) byfVar, (Object) bwqVar, 20, (char[]) null);
                bvvVar.ad(acgVar);
                objS4 = acgVar;
            } else {
                byfVar = byfVar2;
                obj = obj2;
            }
            bvq.b(context, null, (afec) objS4, buxVarC);
            boolean zB = buxVarC.B(byfVar.e()) | ((458752 & i3) == 131072);
            Object objS5 = bvvVar.S();
            Object obj3 = objS5;
            if (zB || objS5 == obj) {
                Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
                calendar.setTimeInMillis(byfVar.e());
                bvvVar.ad(calendar);
                obj3 = calendar;
            }
            obj3.getClass();
            Calendar calendar2 = (Calendar) obj3;
            String str5 = true != ((Boolean) bwqVar.a()).booleanValue() ? str3 : str4;
            boolean zC4 = buxVarC.C(calendar2) | buxVarC.C(str5);
            Object objS6 = bvvVar.S();
            if (zC4 || objS6 == obj) {
                objS6 = DateFormat.format(str5, calendar2).toString();
                bvvVar.ad(objS6);
            }
            String str6 = (String) objS6;
            cfn cfnVar = cfl.e;
            ctp ctpVarB = atk.b(cfnVar, false);
            long j2 = bvvVar.u;
            long j3 = j2 ^ (j2 >>> 32);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf((int) j3), cwb.f);
            buxVarC.i(afakVar, new alx(cwb.g, 16));
            byq.c(buxVarC, cfyVarJ, cwb.c);
            buxVar2 = buxVarC;
            brp.b(str6, awd.o(atn.a.a(cfy.e, cfnVar), cfnVar, true), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, dfwVar, buxVar2, i3 & 896, (i3 << 18) & 29360128, 131064);
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: nyz
                @Override // defpackage.afeg
                public final Object invoke(Object obj4, Object obj5) {
                    bux buxVar3 = (bux) obj4;
                    ((Integer) obj5).intValue();
                    cfy cfyVar2 = cfyVar;
                    dfw dfwVar2 = dfwVar;
                    int i4 = i | 1;
                    int i5 = 306783378 & i4;
                    int i6 = 613566756 & i4;
                    nsh.e(cfyVar2, dfwVar2, j, str, str2, z, buxVar3, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6));
                    return afak.a;
                }
            };
        }
    }

    public static nwt f(nul nulVar, nuo nuoVar) {
        if (nulVar == null) {
            return null;
        }
        int iG = g(nuoVar);
        GhIcon ghIcon = nulVar.a;
        if (ghIcon == null && nulVar.b == null && iG == 1) {
            return null;
        }
        return new nwu(ghIcon, nulVar.b, nulVar.c, nulVar.e);
    }

    public static int g(nuo nuoVar) {
        int iOrdinal = nuoVar.ordinal();
        if (iOrdinal == 3 || iOrdinal == 4) {
            return 2;
        }
        if (iOrdinal != 5) {
            return iOrdinal != 7 ? 1 : 4;
        }
        return 3;
    }

    public static /* synthetic */ String h(int i) {
        switch (i) {
            case 1:
                return "DEFAULT";
            case 2:
                return "CALL_ACCEPT";
            case 3:
                return "CALL_DECLINE";
            case 4:
                return "SELECTED";
            case 5:
                return "PRIMARY";
            case 6:
                return "PERSONAL_RECOMMENDATION";
            default:
                return "null";
        }
    }

    public static nsw i() {
        return (nsw) mki.a.i(nsw.class);
    }
}
