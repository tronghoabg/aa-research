package defpackage;

import android.accounts.Account;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.model.CarColor;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.apps.auto.components.messaging.smartactions.template.SmartReplyConfirmationService;
import com.google.android.apps.gmm.systems.accounts.GmmAccount;
import com.google.android.apps.gmm.systems.accounts.GoogleAccount;
import com.google.android.apps.gmm.systems.accounts.IncognitoAccount;
import com.google.android.gms.car.RadioProgramSelector;
import com.google.android.gms.car.control.CarAction;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.DataInput;
import java.io.IOException;
import java.net.ConnectException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLException;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.impl.CronetExceptionImpl;

/* loaded from: classes.dex */
public final class lws {
    public static pmn a;
    public static pmo b;

    public static final void A(npp nppVar, npt nptVar, nko nkoVar, boolean z, afdr afdrVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVarX;
        boolean z2;
        bux buxVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1208169932);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(nppVar) : buxVarC.E(nppVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.A(nptVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.A(nkoVar == null ? -1 : nkoVar.ordinal()) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.D(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 65536 : 131072;
        }
        int i4 = i2;
        if (buxVarC.I((i4 & 74899) != 74898, i4 & 1)) {
            buxVarC.v(-1410125719);
            cfy cfyVarD = das.d(cfyVar, "compact_action");
            if (afdrVar != null) {
                z2 = false;
                buxVar2 = buxVarC;
                cfyVarX = afp.x(kvc.a(cfyVarD, czz.au(buxVarC).b, 0L, 0L, null, null, null, true, true, buxVarC, 113246208, 62), true, null, null, afdrVar);
            } else {
                cfyVarX = cfyVarD;
                z2 = false;
                buxVar2 = buxVarC;
            }
            bvv bvvVar = (bvv) buxVar2;
            bvvVar.Y(z2);
            ctp ctpVarA = atp.a(atd.e, cfl.k, buxVar2, 54);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVar2, cfyVarX);
            afdr afdrVar2 = cwb.a;
            buxVar2.w();
            if (bvvVar.t) {
                buxVar2.j(afdrVar2);
            } else {
                buxVar2.y();
            }
            byq.c(buxVar2, ctpVarA, cwb.e);
            byq.c(buxVar2, ccxVarAh, cwb.d);
            byq.c(buxVar2, Integer.valueOf(iG), cwb.f);
            byq.b(buxVar2, cwb.g);
            byq.c(buxVar2, cfyVarJ, cwb.c);
            buxVarC = buxVar2;
            D(nppVar, nptVar, z, null, buxVarC, ((i4 >> 3) & 896) | (i4 & 126));
            y(nkoVar, z, buxVarC, (i4 >> 6) & 126);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new boa(nppVar, nptVar, nkoVar, z, afdrVar, cfyVar, i, 7);
        }
    }

    public static final void B(final npp nppVar, npt nptVar, final afdr afdrVar, final afdr afdrVar2, final boolean z, final boolean z2, final nko nkoVar, final boolean z3, final afdr afdrVar3, final cfy cfyVar, final boolean z4, bux buxVar, final int i, final int i2) {
        int i3;
        boolean z5;
        afdr afdrVar4;
        cfy cfyVar2;
        int i4;
        boolean z6;
        int i5;
        npt nptVar2;
        bux buxVar2;
        int i6 = i & 6;
        bux buxVarC = buxVar.c(951667278);
        if (i6 == 0) {
            i3 = (true != ((i & 8) == 0 ? buxVarC.C(nppVar) : buxVarC.E(nppVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.A(nptVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.E(afdrVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.E(afdrVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != buxVarC.D(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            z5 = z2;
            i3 |= true != buxVarC.D(z5) ? 65536 : 131072;
        } else {
            z5 = z2;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != buxVarC.A(nkoVar == null ? -1 : nkoVar.ordinal()) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i3 |= true != buxVarC.D(z3) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            afdrVar4 = afdrVar3;
            i3 |= true != buxVarC.E(afdrVar4) ? 33554432 : 67108864;
        } else {
            afdrVar4 = afdrVar3;
        }
        if ((805306368 & i) == 0) {
            cfyVar2 = cfyVar;
            i4 = 12582912;
            i3 |= true != buxVarC.C(cfyVar2) ? 268435456 : 536870912;
        } else {
            cfyVar2 = cfyVar;
            i4 = 12582912;
        }
        if ((i2 & 6) == 0) {
            z6 = z4;
            i5 = i2 | (true != buxVarC.D(z6) ? 2 : 4);
        } else {
            z6 = z4;
            i5 = i2;
        }
        if (buxVarC.I(((i3 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true, i3 & 1)) {
            int i7 = i3;
            nptVar2 = nptVar;
            int i8 = i7 >> 6;
            int i9 = i7 >> 12;
            buxVar2 = buxVarC;
            q(afdrVar, afdrVar2, z, z5, afdrVar4, cfyVar2, z6, bxc.i(-1879577190, true, new jtl(nkoVar, z3, 4), buxVarC), null, null, new cjv(kfn.i(buxVarC).C()), new cjv(kfn.i(buxVarC).b()), bxc.i(2893320, true, new gqd(nppVar, nptVar2, z3, 2), buxVarC), buxVar2, (i8 & 7168) | (i8 & 14) | i4 | (i8 & 112) | (i8 & 896) | (57344 & i9) | (458752 & i9) | (3670016 & (i5 << 18)), 384, 768);
        } else {
            nptVar2 = nptVar;
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            final npt nptVar3 = nptVar2;
            bxfVarJ.c = new afeg() { // from class: nlg
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    npp nppVar2 = nppVar;
                    npt nptVar4 = nptVar3;
                    afdr afdrVar5 = afdrVar;
                    afdr afdrVar6 = afdrVar2;
                    boolean z7 = z;
                    boolean z8 = z2;
                    nko nkoVar2 = nkoVar;
                    int i10 = i;
                    boolean z9 = z3;
                    int i11 = i2;
                    int i12 = i10 | 1;
                    int i13 = i11 & 306783378;
                    int i14 = 306783378 & i12;
                    cfy cfyVar3 = cfyVar;
                    int i15 = i11 & 613566756;
                    int i16 = i12 & 613566756;
                    boolean z10 = z4;
                    lws.B(nppVar2, nptVar4, afdrVar5, afdrVar6, z7, z8, nkoVar2, z9, afdrVar3, cfyVar3, z10, (bux) obj, (i12 & (-920350135)) | i14 | (i16 >> 1) | ((i14 + i14) & i16), (i11 & (-920350135)) | i13 | (i15 >> 1) | ((i13 + i13) & i15));
                    return afak.a;
                }
            };
        }
    }

    public static final void C(final boolean z, final npp nppVar, final npt nptVar, final npl nplVar, final boolean z2, final boolean z3, final nko nkoVar, final boolean z4, final afdr afdrVar, final boolean z5, final cfy cfyVar, bux buxVar, final int i, final int i2) {
        int i3;
        boolean z6;
        afdr afdrVar2;
        boolean z7;
        int i4;
        int i5 = i & 6;
        bux buxVarC = buxVar.c(1923140042);
        if (i5 == 0) {
            i3 = (true != buxVarC.D(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? buxVarC.C(nppVar) : buxVarC.E(nppVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.A(nptVar.ordinal()) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != ((i & 4096) == 0 ? buxVarC.C(nplVar) : buxVarC.E(nplVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != buxVarC.D(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != buxVarC.D(z3) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != buxVarC.A(nkoVar == null ? -1 : nkoVar.ordinal()) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            z6 = z4;
            i3 |= true != buxVarC.D(z6) ? 4194304 : 8388608;
        } else {
            z6 = z4;
        }
        if ((100663296 & i) == 0) {
            afdrVar2 = afdrVar;
            i3 |= true != buxVarC.E(afdrVar2) ? 33554432 : 67108864;
        } else {
            afdrVar2 = afdrVar;
        }
        if ((805306368 & i) == 0) {
            z7 = z5;
            i3 |= true != buxVarC.D(z7) ? 268435456 : 536870912;
        } else {
            z7 = z5;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != buxVarC.C(cfyVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if (buxVarC.I(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            int i6 = (i3 >> 3) & 126;
            if (z) {
                buxVarC.v(1696608049);
                ksy ksyVar = nly.a;
                float f = nly.a.h;
                int i7 = i3 >> 12;
                A(nppVar, nptVar, nkoVar, z6, afdrVar2, awd.l(cfyVar, f, f, Float.NaN, Float.NaN), buxVarC, (57344 & i7) | (i7 & 896) | i6 | (i7 & 7168));
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(1696941950);
                bvv bvvVar = (bvv) buxVarC;
                Object objS = bvvVar.S();
                Object obj = buw.a;
                if (objS == obj) {
                    objS = bvq.a(afcp.a, buxVarC);
                    bvvVar.ad(objS);
                }
                int i8 = i3 & 7168;
                aitx aitxVar = (aitx) objS;
                boolean zE = (i8 == 2048 || ((i3 & 4096) != 0 && buxVarC.E(nplVar))) | buxVarC.E(aitxVar);
                Object objS2 = bvvVar.S();
                if (zE || objS2 == obj) {
                    objS2 = new nlh(nplVar, aitxVar, 0);
                    bvvVar.ad(objS2);
                }
                afdr afdrVar3 = (afdr) objS2;
                boolean zE2 = (i8 == 2048 || ((i3 & 4096) != 0 && buxVarC.E(nplVar))) | buxVarC.E(aitxVar);
                Object objS3 = bvvVar.S();
                if (zE2 || objS3 == obj) {
                    objS3 = new nlh(nplVar, aitxVar, 1);
                    bvvVar.ad(objS3);
                }
                int i9 = 3670016 & i3;
                int i10 = i3 & 29360128;
                int i11 = i3 & 234881024;
                int i12 = (i4 << 27) & 1879048192;
                B(nppVar, nptVar, afdrVar3, (afdr) objS3, z2, z3, nkoVar, z4, afdrVar, cfyVar, z7, buxVarC, i12 | (i3 & 57344) | i6 | (458752 & i3) | i9 | i10 | i11, (i3 >> 27) & 14);
                buxVarC = buxVarC;
                bvvVar.Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: nlf
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    boolean z8 = z;
                    npp nppVar2 = nppVar;
                    npt nptVar2 = nptVar;
                    npl nplVar2 = nplVar;
                    boolean z9 = z2;
                    boolean z10 = z3;
                    nko nkoVar2 = nkoVar;
                    int i13 = i;
                    boolean z11 = z4;
                    int i14 = i2;
                    int i15 = i13 | 1;
                    int i16 = i14 & 306783378;
                    int i17 = 306783378 & i15;
                    boolean z12 = z5;
                    int i18 = i14 & 613566756;
                    int i19 = i15 & 613566756;
                    cfy cfyVar2 = cfyVar;
                    lws.C(z8, nppVar2, nptVar2, nplVar2, z9, z10, nkoVar2, z11, afdrVar, z12, cfyVar2, (bux) obj2, (i15 & (-920350135)) | i17 | (i19 >> 1) | ((i17 + i17) & i19), (i14 & (-920350135)) | i16 | (i18 >> 1) | ((i16 + i16) & i18));
                    return afak.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void D(defpackage.npp r30, defpackage.npt r31, boolean r32, defpackage.cfy r33, defpackage.bux r34, int r35) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lws.D(npp, npt, boolean, cfy, bux, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void E(kjk kjkVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        bxf bxfVarJ;
        nad nadVar;
        kjkVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-418051028);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(kjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        Object[] objArr = 0;
        if (buxVarC.I((i4 & 19) != 18, i4 & 1)) {
            kjz kjzVar = kjkVar.a;
            cfv cfvVar = cfy.e;
            boolean zC = buxVarC.C(kjzVar);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                objS = npc.a.a().b(kjzVar.a.b);
                bvvVar.ad(objS);
            }
            npy npyVar = (npy) objS;
            String strE = vq.e(R.string.control_sync, buxVarC);
            if (npyVar == null) {
                buxVarC.v(1247277258);
                Object objS2 = bvvVar.S();
                if (objS2 == buw.a) {
                    objS2 = new nle(objArr == true ? 1 : 0);
                    bvvVar.ad(objS2);
                }
                lxr.E(strE, null, false, (afec) objS2, null, false, null, buxVarC, 200064, 82);
                bvvVar.Y(false);
                bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    nadVar = new nad(kjkVar, cfvVar, i, 16);
                    bxfVarJ.c = nadVar;
                }
                return;
            }
            buxVarC.v(1247381046);
            bvvVar.Y(false);
            Object objS3 = bvvVar.S();
            Object obj = buw.a;
            if (objS3 == obj) {
                objS3 = bvq.a(afcp.a, buxVarC);
                bvvVar.ad(objS3);
            }
            aitx aitxVar = (aitx) objS3;
            bym bymVarF = bxc.f(npyVar.a, kke.a, buxVarC);
            CarAction carAction = kjkVar.b;
            Boolean bool = (Boolean) kkg.b(roc.ao(bymVarF));
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            boolean z = roc.ao(bymVarF) instanceof kkc;
            boolean zE = buxVarC.E(aitxVar) | buxVarC.E(carAction) | buxVarC.E(npyVar);
            Object objS4 = bvvVar.S();
            if (zE || objS4 == obj) {
                objS4 = new njf(aitxVar, carAction, npyVar, 5);
                bvvVar.ad(objS4);
            }
            cfyVar2 = cfvVar;
            lxr.E(strE, null, zBooleanValue, (afec) objS4, cfyVar2, z, null, buxVarC, (i4 << 9) & 57344, 66);
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            nadVar = new nad(kjkVar, cfyVar2, i, 17);
            bxfVarJ.c = nadVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F(defpackage.kjk r25, defpackage.cfy r26, boolean r27, defpackage.bux r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lws.F(kjk, cfy, boolean, bux, int, int):void");
    }

    public static pwv G(CronetException cronetException) {
        if (cronetException instanceof NetworkException) {
            switch (((NetworkException) cronetException).getErrorCode()) {
                case 1:
                case 3:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    return new pwv(pwu.c.d(cronetException));
                case 2:
                    return new pwv(pwu.k.d(cronetException));
                case 4:
                    return new pwv(pwu.b.d(cronetException));
                default:
                    return new pwv(pwu.a.d(cronetException));
            }
        }
        if (cronetException instanceof CronetExceptionImpl) {
            int i = xyg.a;
            cronetException.getClass();
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(cronetException);
            boolean z = false;
            Throwable cause = cronetException;
            Throwable cause2 = cause;
            while (true) {
                cause = cause.getCause();
                if (cause != null) {
                    arrayList.add(cause);
                    if (cause == cause2) {
                        throw new IllegalArgumentException("Loop in causal chain detected.", cause);
                    }
                    if (z) {
                        cause2 = cause2.getCause();
                    }
                    z = !z;
                } else {
                    for (Throwable th : DesugarCollections.unmodifiableList(arrayList)) {
                        if ((th instanceof UnknownHostException) || (th instanceof ConnectException) || (th instanceof SSLException)) {
                            return new pwv(pwu.k.d(cronetException));
                        }
                    }
                }
            }
        }
        return new pwv(pwu.a.d(cronetException));
    }

    public static String H(accb accbVar) {
        switch (accbVar.ordinal()) {
            case 15:
                return "acep";
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
            case 31:
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
            case 37:
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case 48:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 76:
            case 78:
            case 79:
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
            case 99:
            case 100:
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 128:
            case 129:
            case 132:
            case 133:
            case 134:
            case 138:
            case 140:
            case 142:
            case 148:
            case 157:
            case 158:
            case 159:
            case 161:
            case 163:
            case 164:
            case 170:
            case 171:
            case 173:
            case 174:
            case 175:
            case 180:
            case 188:
            case 189:
            case 190:
            case 197:
            case 199:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 226:
            case 235:
            case 238:
            case 240:
            case 242:
            case 243:
            case 244:
            case 245:
            case 246:
            case 247:
            case 248:
            case 252:
            case 253:
            case 254:
            case 255:
            case 256:
            case 257:
            case 258:
            case 259:
            case 260:
            case 261:
            case 262:
            case 263:
            case 264:
            case 267:
            case 271:
            case 274:
            case 277:
            case 279:
            case 280:
            case 296:
            case 297:
            case 299:
            case 300:
            case 304:
            case 305:
            case 307:
            case 308:
            case 310:
            case 311:
            case 339:
            case 340:
            case 345:
            case 354:
            case 356:
            case 357:
            case 358:
            case 359:
            case 360:
            case 361:
            case 364:
            case 367:
            case 374:
            case 375:
            case 377:
            case 378:
            case 380:
            case 381:
            case 382:
            case 383:
            case 384:
            case 385:
            case 386:
            case 387:
            case 397:
            case 418:
            case 426:
            case 438:
            case 439:
            case 440:
            case 448:
            case 450:
            case 455:
            case 456:
            case 457:
            case 459:
            case 460:
            case 461:
            case 462:
            case 465:
            case 489:
            case 517:
            case 523:
            case 534:
            case 555:
            case 567:
            case 577:
            case 587:
            case 588:
            case 589:
            default:
                return "";
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                return "acfq";
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return "achv";
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                return "acfc";
            case 53:
                return "aaoc";
            case 75:
                return "acbt";
            case 77:
                return "aciz";
            case 97:
                return "acfh";
            case 98:
                return "acfi";
            case 108:
                return "acjf";
            case 120:
                return "aajm";
            case 127:
                return "achp";
            case 130:
                return "acex";
            case 131:
                return "acew";
            case 135:
                return "acgp";
            case 136:
                return "acgc";
            case 137:
                return "acfu";
            case 139:
                return "achc";
            case 141:
                return "acbg";
            case 143:
                return "acdn";
            case 144:
                return "acgf";
            case 145:
                return "aapz";
            case 146:
                return "aceo";
            case 147:
                return "aaqb";
            case 149:
                return "aaqc";
            case 150:
                return "acgg";
            case 151:
                return "aaqf";
            case 152:
                return "acge";
            case 153:
                return "acfz";
            case 154:
                return "acbj";
            case 155:
                return "aapr";
            case 156:
                return "aapy";
            case 160:
                return "acck";
            case 162:
                return "acdl";
            case 165:
                return "aaqe";
            case 166:
                return "aaqa";
            case 167:
                return "acjb";
            case 168:
                return "aapp";
            case 169:
                return "aced";
            case 172:
                return "acfa";
            case 176:
                return "achf";
            case 177:
                return "aapo";
            case 178:
                return "acez";
            case 179:
                return "aapq";
            case 181:
                return "accs";
            case 182:
                return "acct";
            case 183:
                return "acdo";
            case 184:
                return "acer";
            case 185:
                return "accr";
            case 186:
                return "acgu";
            case 187:
                return "aaqg";
            case 191:
                return "com.google.wireless.googlenav.proto.MapsActivitiesTimelineRequest$MapsActivitiesTimelineRequestProto";
            case 192:
                return "acdm";
            case 193:
                return "com.google.wireless.googlenav.proto.MapsActivitiesHistoryEditRequest$MapsActivitiesHistoryEditRequestProto";
            case 194:
                return "com.google.wireless.googlenav.proto.MapsActivitiesDeleteDataRequest$MapsActivitiesDeleteDataRequestProto";
            case 195:
                return "acgd";
            case 196:
                return "com.google.wireless.googlenav.proto.PersonalPlacesRequest$PersonalPlacesRequestProto";
            case 198:
                return "aapv";
            case 200:
                return "com.google.wireless.googlenav.proto.UserPrefsReadRequest$UserPrefsReadRequestProto";
            case 201:
                return "com.google.wireless.googlenav.proto.UserPrefsWriteRequest$UserPrefsWriteRequestProto";
            case 202:
                return "aarf";
            case 203:
                return "aare";
            case 204:
                return "aarg";
            case 205:
                return "aaqk";
            case 206:
                return "com.google.wireless.googlenav.proto.RiddlerFollowOnRequest$RiddlerFollowOnRequestProto";
            case 207:
                return "com.google.maps.gmm.ListRiddlerQuestionsRequest";
            case 208:
                return "com.google.maps.gmm.ListRiddlerQuestionsDeidentifiedRequest";
            case 209:
                return "aanz";
            case 210:
                return "aaoa";
            case 216:
                return "aaob";
            case 217:
                return "com.google.maps.gmm.LocationSharingUploadLocationRequest";
            case 218:
                return "aaps";
            case 219:
                return "aaiq";
            case 220:
                return "aajb";
            case 221:
                return "aapt";
            case 222:
                return "aaqy";
            case 223:
                return "aard";
            case 224:
                return "aapx";
            case 225:
                return "com.google.wireless.googlenav.proto.UserContributionsRequest$UserContributionsRequestProto";
            case 227:
                return "com.google.wireless.googlenav.proto.PersonalNotesRequest$PersonalNotesRequestProto";
            case 228:
                return "aaon";
            case 229:
                return "aaoo";
            case 230:
                return "aaop";
            case 231:
                return "acgm";
            case 232:
                return "aajq";
            case 233:
                return "achm";
            case 234:
                return "aaom";
            case 236:
                return "com.google.wireless.googlenav.proto.AliasStickerRequestProto";
            case 237:
                return "aanv";
            case 239:
                return "acgn";
            case 241:
                return "accg";
            case 249:
                return "aaor";
            case 250:
                return "aaku";
            case 251:
                return "aaqh";
            case 265:
                return "aarb";
            case 266:
                return "com.google.maps.gmm.ThumbsVoteRequest";
            case 268:
                return "aams";
            case 269:
                return "aaof";
            case 270:
                return "com.google.maps.gmm.PromotedPinAdsRequestProto";
            case 272:
                return "aaod";
            case 273:
                return "aaoe";
            case 275:
                return "com.google.maps.gmm.AdBlockRequest";
            case 276:
                return "com.google.wireless.googlenav.proto.OfflineGetRegionSizeRequest$OfflineGetRegionSizeRequestProto";
            case 278:
                return "aany";
            case 281:
                return "com.google.maps.gmm.AddressDataFeedbackRequest";
            case 282:
                return "com.google.maps.gmm.GetBuildingEntranceEditingDataRequest";
            case 283:
                return "aaoq";
            case 284:
                return "com.google.maps.gmm.PlaceQaAnswerWriteRequest";
            case 285:
                return "com.google.maps.gmm.PlaceQaQuestionWriteRequest";
            case 286:
                return "com.google.maps.gmm.SuggestPlaceQaTaggableEntitiesRequest";
            case 287:
                return "com.google.maps.gmm.PlaceQaUserContributionsRequest";
            case 288:
                return "com.google.maps.gmm.PlaceQaVoteRequest";
            case 289:
                return "aapi";
            case 290:
                return "com.google.maps.gmm.PlaceQaRepliesRequest";
            case 291:
                return "com.google.maps.gmm.WritePlaceQaReplyRequest";
            case 292:
                return "aalr";
            case 293:
                return "aanx";
            case 294:
                return "aarc";
            case 295:
                return "com.google.maps.gmm.LocalPostsRequest";
            case 298:
                return "aamr";
            case 301:
                return "aanw";
            case 302:
                return "com.google.maps.gmm.AreaTrafficRequest";
            case 303:
                return "aaoy";
            case 306:
                return "aazm";
            case 309:
                return "com.google.maps.gmm.TransactionsGetUserStreamRequest";
            case 312:
                return "com.google.maps.gmm.SendPostTripNotificationRequest";
            case 313:
                return "com.google.maps.gmm.WritePostTripAnswerRequest";
            case 314:
                return "com.google.maps.gmm.GetPostTripQuestionsRequest";
            case 315:
                return "com.google.maps.gmm.CreateShareableUrlRequest";
            case 316:
                return "com.google.maps.gmm.CreateEntityListRequest";
            case 317:
                return "com.google.maps.gmm.DeleteEntityListRequest";
            case 318:
                return "com.google.maps.gmm.CreateEntityListItemRequest";
            case 319:
                return "com.google.maps.gmm.DeleteEntityListItemRequest";
            case 320:
                return "com.google.maps.gmm.CreateEntityListItemCustomDataRequest";
            case 321:
                return "com.google.maps.gmm.DeleteEntityListItemCustomDataRequest";
            case 322:
                return "com.google.maps.gmm.GetEntityListParticipantsRequest";
            case 323:
                return "com.google.maps.gmm.GetEntityListRecommendationsRequest";
            case 324:
                return "aakq";
            case 325:
                return "com.google.maps.gmm.ListEntityListsRequest";
            case 326:
                return "com.google.maps.gmm.ShareEntityListRequest";
            case 327:
                return "com.google.maps.gmm.UpdateEntityListRequest";
            case 328:
                return "com.google.maps.gmm.UpdateEntityListItemRequest";
            case 329:
                return "com.google.maps.gmm.UpdateEntityListItemCustomDataRequest";
            case 330:
                return "com.google.maps.gmm.UpdateEntityListRoleRequest";
            case 331:
                return "com.google.maps.gmm.UpdateEntityListVisibilityRequest";
            case 332:
                return "com.google.maps.gmm.CreateEntityListCustomDataRequest";
            case 333:
                return "com.google.maps.gmm.DeleteEntityListCustomDataRequest";
            case 334:
                return "com.google.maps.gmm.UpdateEntityListCustomDataRequest";
            case 335:
                return "aamt";
            case 336:
                return "aamu";
            case 337:
                return "aamv";
            case 338:
                return "aanc";
            case 341:
                return "com.google.maps.gmm.PhotoVoteRequest";
            case 342:
                return "aaqj";
            case 343:
                return "com.google.maps.gmm.localstream.LocalStreamFeedbackRequest";
            case 344:
                return "com.google.maps.gmm.localstream.LocalStreamDeleteCardRequest";
            case 346:
                return "com.google.maps.gmm.LocalStreamCreateMutedPlacesRequest";
            case 347:
                return "com.google.maps.gmm.LocalStreamDeleteMutedPlacesRequest";
            case 348:
                return "com.google.maps.gmm.LocalStreamUpdateAreasRequest";
            case 349:
                return "com.google.maps.gmm.LocalStreamDeleteTripDestinationsRequest";
            case 350:
                return "com.google.maps.gmm.localstream.LocalStreamVerifyAreaRequest";
            case 351:
                return "com.google.maps.gmm.LocalStreamEnablePlaceListsRequest";
            case 352:
                return "com.google.maps.gmm.LocalStreamDisablePlaceListsRequest";
            case 353:
                return "aamz";
            case 355:
                return "com.google.maps.gmm.PlaceVisitStatsRequest";
            case 362:
                return "com.google.maps.gmm.GetEntityListHeroImagesRequest";
            case 363:
                return "com.google.maps.gmm.TransitLinesRequest";
            case 365:
                return "com.google.maps.gmm.GetEntityListMetadataRequest";
            case 366:
                return "aait";
            case 368:
                return "com.google.maps.gmm.SendShareRequest";
            case 369:
                return "aalv";
            case 370:
                return "com.google.maps.gmm.SynthesizeTextRequest";
            case 371:
                return "aape";
            case 372:
                return "com.google.maps.gmm.GetCreatorProfileRequest";
            case 373:
                return "com.google.maps.gmm.EditCreatorProfileRequest";
            case 376:
                return "aalc";
            case 379:
                return "com.google.maps.gmm.UpdateDiscoveryPrefsRequest";
            case 388:
                return "com.google.maps.gmm.GetPlaceInsightsRequest";
            case 389:
                return "aana";
            case 390:
                return "aamj";
            case 391:
                return "aalu";
            case 392:
                return "aalt";
            case 393:
                return "aami";
            case 394:
                return "aalb";
            case 395:
                return "aapa";
            case 396:
                return "aaiw";
            case 398:
                return "aals";
            case 399:
                return "aajc";
            case 400:
                return "aajn";
            case 401:
                return "aamo";
            case 402:
                return "aanp";
            case 403:
                return "aaqz";
            case 404:
                return "aarh";
            case 405:
                return "aaiz";
            case 406:
                return "aajk";
            case 407:
                return "com.google.maps.gmm.WriteOwnerResponseToReviewRequest";
            case 408:
                return "com.google.maps.gmm.DeleteOwnerResponseToReviewRequest";
            case 409:
                return "com.google.maps.gmm.BusinessCategoriesRequest";
            case 410:
                return "com.google.maps.gmm.DeleteLocalPostRequest";
            case 411:
                return "com.google.maps.gmm.CreateLocalPostRequest";
            case 412:
                return "com.google.maps.gmm.UpdateLocalPostRequest";
            case 413:
                return "aakd";
            case 414:
                return "aajt";
            case 415:
                return "aajp";
            case 416:
                return "aani";
            case 417:
                return "aajr";
            case 419:
                return "aakg";
            case 420:
                return "aamx";
            case 421:
                return "aaqs";
            case 422:
                return "aamf";
            case 423:
                return "aaog";
            case 424:
                return "aajs";
            case 425:
                return "aakk";
            case 427:
                return "aakb";
            case 428:
                return "aamn";
            case 429:
                return "aali";
            case 430:
                return "aaqx";
            case 431:
                return "com.google.maps.gmm.GetCallTranscriptRequest";
            case 432:
                return "aaje";
            case 433:
                return "aanf";
            case 434:
                return "aanb";
            case 435:
                return "aamy";
            case 436:
                return "com.google.maps.gmm.ListPublicEntityListsForUserRequest";
            case 437:
                return "aalf";
            case 441:
                return "aane";
            case 442:
                return "aaqu";
            case 443:
                return "aaix";
            case 444:
                return "aaji";
            case 445:
                return "aakf";
            case 446:
                return "aaqq";
            case 447:
                return "aalq";
            case 449:
                return "aaln";
            case 451:
                return "aake";
            case 452:
                return "aaqp";
            case 453:
                return "aaim";
            case 454:
                return "aalp";
            case 458:
                return "aapm";
            case 463:
                return "aang";
            case 464:
                return "aaov";
            case 466:
                return "aaqo";
            case 467:
                return "com.google.maps.gmm.DeleteSearchHistorySuggestRequest";
            case 468:
                return "aale";
            case 469:
                return "aakv";
            case 470:
                return "aamk";
            case 471:
                return "aaml";
            case 472:
                return "aapg";
            case 473:
                return "aakc";
            case 474:
                return "aakj";
            case 475:
                return "aalh";
            case 476:
                return "aaql";
            case 477:
                return "aakt";
            case 478:
                return "aari";
            case 479:
                return "aajl";
            case 480:
                return "aanj";
            case 481:
                return "aaol";
            case 482:
                return "aakl";
            case 483:
                return "aakm";
            case 484:
                return "aakn";
            case 485:
                return "aako";
            case 486:
                return "aamd";
            case 487:
                return "aame";
            case 488:
                return "aajo";
            case 490:
                return "aara";
            case 491:
                return "aaky";
            case 492:
                return "com.google.maps.gmm.GetRiddlerFamiliarPlacesRequest";
            case 493:
                return "aaju";
            case 494:
                return "aans";
            case 495:
                return "aant";
            case 496:
                return "aanr";
            case 497:
                return "aanm";
            case 498:
                return "aalg";
            case 499:
                return "com.google.maps.gmm.SuggestEditByChatRequest";
            case 500:
                return "aapl";
            case 501:
                return "aakx";
            case 502:
                return "aaoz";
            case 503:
                return "aamg";
            case 504:
                return "aaqv";
            case 505:
                return "aaks";
            case 506:
                return "aaox";
            case 507:
                return "aaio";
            case 508:
                return "aajv";
            case 509:
                return "com.google.maps.gmm.OfflineGetDataViewRequest";
            case 510:
                return "aano";
            case 511:
                return "aald";
            case sk.AUDIO_CONTENT_BUFFER_SIZE /* 512 */:
                return "aanh";
            case 513:
                return "aaow";
            case 514:
                return "aaqw";
            case 515:
                return "aann";
            case 516:
                return "com.google.maps.gmm.DecodeUrlRequest";
            case 518:
                return "aamm";
            case 519:
                return "aamh";
            case 520:
                return "aajy";
            case 521:
                return "aajw";
            case 522:
                return "aaot";
            case 524:
                return "aalm";
            case 525:
                return "aakw";
            case 526:
                return "aajx";
            case 527:
                return "com.google.maps.gmm.GetMidTripUgcImpactRequest";
            case 528:
                return "com.google.maps.gmm.DeleteUserFactualEditRequest";
            case 529:
                return "aapk";
            case 530:
                return "aand";
            case 531:
                return "aanl";
            case 532:
                return "aaka";
            case 533:
                return "com.google.maps.gmm.GetPlacesAggregationForUserPrototypeRequest";
            case 535:
                return "com.google.maps.gmm.GetPlacesToAnnotatePrototypeRequest";
            case 536:
                return "com.google.maps.gmm.SubmitPlaceAnnotationsPrototypeRequest";
            case 537:
                return "com.google.maps.gmm.GetUserAnnotationAggregatesPrototypeRequest";
            case 538:
                return "com.google.maps.gmm.GetSimilarPlacesPrototypeRequest";
            case 539:
                return "aaou";
            case 540:
                return "aaiv";
            case 541:
                return "aakr";
            case 542:
                return "aajf";
            case 543:
                return "aaqr";
            case 544:
                return "aapf";
            case 545:
                return "aajg";
            case 546:
                return "aalj";
            case 547:
                return "aank";
            case 548:
                return "aaqm";
            case 549:
                return "aakp";
            case 550:
                return "com.google.maps.gmm.ListAddressEditingChildSubregionsRequest";
            case 551:
                return "com.google.maps.gmm.ListAddressEditingCountriesRequest";
            case 552:
                return "com.google.maps.gmm.GetAddressEditingCountryMetadataRequest";
            case 553:
                return "com.google.maps.gmm.CreateArrivalProblemReportRequest";
            case 554:
                return "aamp";
            case 556:
                return "com.google.maps.gmm.GetKnowBeforeYouGoSummariesRequest";
            case 557:
                return "aaoh";
            case 558:
                return "aamw";
            case 559:
                return "aajd";
            case 560:
                return "aaip";
            case 561:
                return "aapb";
            case 562:
                return "aamq";
            case 563:
                return "aaly";
            case 564:
                return "aalz";
            case 565:
                return "aama";
            case 566:
                return "aanq";
            case 568:
                return "com.google.maps.gmm.CallAskMapsAgentRequest";
            case 569:
                return "com.google.maps.gmm.StartBulkDeleteContributionsRequest";
            case 570:
                return "aalk";
            case 571:
                return "aamc";
            case 572:
                return "aajz";
            case 573:
                return "aala";
            case 574:
                return "aail";
            case 575:
                return "aaqt";
            case 576:
                return "aaph";
            case 578:
                return "aaki";
            case 579:
                return "com.google.maps.gmm.GetFacadesByS2CellsRequest";
            case 580:
                return "aakz";
            case 581:
                return "com.google.maps.gmm.GetUserMotivationContentRequest";
            case 582:
                return "aamb";
            case 583:
                return "aall";
            case 584:
                return "aajh";
            case 585:
                return "aaja";
            case 586:
                return "aalx";
            case 590:
                return "aakh";
        }
    }

    public static int I(ByteBuffer byteBuffer) {
        return (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8);
    }

    public static zid J(URL url) {
        String host = url.getHost();
        int defaultPort = url.getDefaultPort();
        return new zid(host, defaultPort, defaultPort);
    }

    @ResultIgnorabilityUnspecified
    public static int K(DataInput dataInput) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte < 128) {
            return unsignedByte;
        }
        int unsignedByte2 = dataInput.readUnsignedByte();
        int i = (unsignedByte & 127) | ((unsignedByte2 & 127) << 7);
        if (unsignedByte2 < 128) {
            return i;
        }
        int unsignedByte3 = dataInput.readUnsignedByte();
        int i2 = i | ((unsignedByte3 & 127) << 14);
        if (unsignedByte3 < 128) {
            return i2;
        }
        int unsignedByte4 = dataInput.readUnsignedByte();
        int i3 = i2 | ((unsignedByte4 & 127) << 21);
        if (unsignedByte4 < 128) {
            return i3;
        }
        int unsignedByte5 = dataInput.readUnsignedByte();
        int i4 = i3 | ((unsignedByte5 & 127) << 28);
        if (unsignedByte5 >= 128) {
            while (unsignedByte5 >= 128) {
                unsignedByte5 = dataInput.readUnsignedByte();
            }
        }
        return i4;
    }

    public static void L(String str, String str2) {
        if (str2 != null) {
            if (!str.startsWith(str2)) {
                throw new IllegalArgumentException(String.format("Prefix '%s' required for thread name '%s'.", str2, str));
            }
        } else if (str.length() > 15) {
            throw new IllegalArgumentException(String.format("Thread name %s can't be longer than the systrace limit of %d.", str, 15));
        }
    }

    public static void M(zgp zgpVar, Executor executor) {
        wub.ah(zgpVar, new pri(), executor);
    }

    public static final boolean N(Context context) {
        try {
            return htm.x((ActivityManager) context.getSystemService("activity"));
        } catch (val unused) {
            return false;
        }
    }

    public static boolean O(int i) {
        return i == 2 || i == 4;
    }

    public static final GmmAccount P(Account account) {
        int i;
        GmmAccount gmmAccount;
        GmmAccount incognitoAccount;
        if (account instanceof GmmAccount) {
            gmmAccount = (GmmAccount) account;
        } else {
            if (affa.f(account.type, "com.google")) {
                i = 2;
            } else {
                if (!affa.f(account.type, "com.google.android.apps.maps")) {
                    String str = account.type;
                    throw new IllegalArgumentException("GmmAccount requires a known type. ");
                }
                if (affa.f(account.name, GmmAccount.SignedOut.a.name)) {
                    i = 4;
                } else {
                    String str2 = account.name;
                    str2.getClass();
                    i = afyh.g(str2, "incognito@", false) ? 3 : 1;
                }
            }
            int i2 = i - 1;
            if (i2 != 0) {
                if (i2 == 2) {
                    String str3 = account.name;
                    str3.getClass();
                    incognitoAccount = new IncognitoAccount(str3);
                } else if (i2 != 3) {
                    String str4 = account.name;
                    str4.getClass();
                    String str5 = account.type;
                    str5.getClass();
                    incognitoAccount = new GoogleAccount(str4, str5);
                } else {
                    gmmAccount = GmmAccount.SignedOut.a;
                }
                gmmAccount = incognitoAccount;
            } else {
                gmmAccount = GmmAccount.Unknown.a;
            }
        }
        return gmmAccount == null ? GmmAccount.SignedOut.a : gmmAccount;
    }

    public static final boolean Q(String str) {
        return str != null && afyh.g(str, " ", false);
    }

    private static final nko R(bym bymVar) {
        return (nko) bymVar.a();
    }

    private static final npp S(bym bymVar) {
        return (npp) bymVar.a();
    }

    public static final Intent a(String str, String str2, String str3) {
        nqa nqaVar = nqd.a;
        Intent intentPutExtra = new Intent().putExtra("assistant_immersive_activity", true).putExtra("ROBIN_DASHBOARD_CAL_EXTRA", true);
        intentPutExtra.getClass();
        return intentPutExtra.setClass(mki.a.c, SmartReplyConfirmationService.class).putExtra("EXTRA_REPLY_TEXT", str3).putExtra("EXTRA_SBN_KEY", str).putExtra("EXTRA_CONVERSATION_TITLE", str2);
    }

    public static void b() {
    }

    public static /* synthetic */ boolean c(dst dstVar, String[] strArr) {
        CharSequence charSequence = dstVar.j;
        if (charSequence == null) {
            return false;
        }
        for (String str : strArr) {
            if (woy.at(charSequence, str)) {
                return true;
            }
        }
        return false;
    }

    public static lyp d() {
        return (lyp) mki.a.i(lyp.class);
    }

    public static int e(long j) {
        return (int) ((j >>> 32) & 3);
    }

    public static Optional f(RadioProgramSelector radioProgramSelector) {
        int i = radioProgramSelector.a.a;
        if (!h(i)) {
            return j(i) ? g(radioProgramSelector, 8) : Optional.empty();
        }
        Optional optionalG = g(radioProgramSelector, 3);
        if (true == optionalG.isPresent()) {
            optionalG = Optional.ofNullable(Long.valueOf((((Long) optionalG.get()).longValue() >>> 36) & 262143));
        }
        return optionalG.or(new llv(radioProgramSelector, 10));
    }

    public static Optional g(RadioProgramSelector radioProgramSelector, int i) {
        RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier = radioProgramSelector.a;
        if (radioProgramIdentifier.a == i) {
            return Optional.of(Long.valueOf(radioProgramIdentifier.b));
        }
        for (RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier2 : radioProgramSelector.b) {
            if (radioProgramIdentifier2.a == i) {
                return Optional.of(Long.valueOf(radioProgramIdentifier2.b));
            }
        }
        return Optional.empty();
    }

    public static boolean h(int i) {
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public static boolean i(long j) {
        return j > 150 && j <= 30000;
    }

    public static boolean j(int i) {
        return i == 5 || i == 9;
    }

    public static boolean k(long j) {
        return j > 60000 && j < 110000;
    }

    public static boolean l(int i) {
        return i == 3 || i == 4;
    }

    public static /* synthetic */ int m(String str) throws NumberFormatException {
        if (str.length() > 1 && str.charAt(0) == '+') {
            str = str.substring(1);
        }
        long j = Long.parseLong(str, 16);
        if ((4294967295L & j) == j) {
            return (int) j;
        }
        throw new NumberFormatException(a.bq(str, "Input ", " in base 16 is not in the range of an unsigned integer"));
    }

    public static final void n(kqz kqzVar, Context context, yzz yzzVar, int i) {
        Long l;
        String str = kqzVar.d;
        if (affa.f(str, "vnd.android.cursor.item/phone_v2") || (l = kqzVar.c) == null) {
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzzVar, yzy.Q);
            rrbVarH.p(mkn.b);
            rrbVarH.A(i);
            ohsVarJ.F(rrbVarH.l());
            ebf.A().p(kqzVar.a);
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Mime type must be set when id is set");
        }
        odp odpVarA = mcd.A();
        String strL = odpVarA.l(str);
        ComponentName componentNameA = strL != null ? odpVarA.a(context, strL) : null;
        if (componentNameA != null) {
            Intent intentPutExtra = new Intent("android.intent.action.CALL").setComponent(componentNameA).putExtra("com.google.android.apps.auto.components.apphost.EXTRA_START_COMPONENT_ON_FINISH", mkn.b);
            intentPutExtra.getClass();
            mpe.a().i(intentPutExtra);
        } else {
            ((ynz) mex.a.h().ai(4819)).y("No calling app found for %s", str);
        }
        odpVarA.o(context, l.longValue(), yzzVar, str);
    }

    public static /* synthetic */ afak o(int i, int i2, int i3, tj tjVar) {
        tjVar.getClass();
        if (leh.a.a().b()) {
            tjVar.a(CarColor.createCustom(i, i2));
        } else {
            tjVar.a(CarColor.createCustom(i3, i3));
        }
        return afak.a;
    }

    public static final void p(cmw cmwVar, afdr afdrVar, bux buxVar, int i) {
        int i2;
        afdr afdrVar2;
        cmwVar.getClass();
        afdrVar.getClass();
        bux buxVarC = buxVar.c(-404269023);
        if ((i & 6) == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(cmwVar) : buxVarC.E(cmwVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            afdrVar2 = afdrVar;
            i2 |= true != buxVarC.E(afdrVar2) ? 16 : 32;
        } else {
            afdrVar2 = afdrVar;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            int i3 = (i2 & 112) | (i2 & 14) | 392;
            afdr afdrVar3 = afdrVar2;
            khc.l(cmwVar, afdrVar3, awd.k(cfy.e, 72.0f, 42.0f), new ksy(42.0f, 32.0f, new dlj(32.0f), null, null, 504), false, bcr.a, kgq.o(false, buxVarC, 1), null, null, buxVarC, i3, 0, 3760);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nad(cmwVar, afdrVar, i, 18, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(final defpackage.afdr r32, final defpackage.afdr r33, final boolean r34, final boolean r35, final defpackage.afdr r36, defpackage.cfy r37, boolean r38, defpackage.afeg r39, defpackage.cmw r40, defpackage.cmw r41, defpackage.cjv r42, defpackage.cjv r43, final defpackage.afeg r44, defpackage.bux r45, final int r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lws.q(afdr, afdr, boolean, boolean, afdr, cfy, boolean, afeg, cmw, cmw, cjv, cjv, afeg, bux, int, int, int):void");
    }

    public static final void r(afdr afdrVar, boolean z, cmw cmwVar, cjv cjvVar, boolean z2, String str, bux buxVar, int i) {
        int i2;
        boolean z3;
        bux buxVar2;
        ksy ksyVarA;
        ktf ktfVarG;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-15405346);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(afdrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i2 |= true != buxVarC.D(z3) ? 16 : 32;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(cmwVar) : buxVarC.E(cmwVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(cjvVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.D(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.C(str) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i2) != 74898, i2 & 1)) {
            int i4 = i2 >> 6;
            bcm bcmVar = czz.au(buxVarC).b;
            if (z2) {
                ksy ksyVar = nly.a;
                ksyVarA = ksy.a(nly.a, ksy.b.h, BitmapDescriptorFactory.HUE_RED, null, BitmapDescriptorFactory.HUE_RED, 510);
            } else {
                ksy ksyVar2 = nly.a;
                ksyVarA = nly.a;
            }
            cfy cfyVarR = cfy.e;
            cfy cfyVarD = das.d(cfyVarR, str);
            if (z2) {
                cfyVarR = awd.r(cfyVarR);
            }
            cfy cfyVarA = cfyVarD.a(cfyVarR);
            if (cjvVar == null) {
                buxVarC.v(621416944);
                aezr aezrVar = ktf.a;
                buxVar2 = buxVarC;
                ktfVarG = kgq.g(0L, 0L, 0L, 0L, buxVar2, 255);
                ((bvv) buxVar2).Y(false);
            } else {
                buxVarC.v(621475999);
                aezr aezrVar2 = ktf.a;
                long j = cjvVar.a;
                buxVar2 = buxVarC;
                ktfVarG = kgq.g(0L, j, 0L, j, buxVar2, 221);
                ((bvv) buxVar2).Y(false);
            }
            khc.l(cmwVar, afdrVar, cfyVarA, ksyVarA, z3, bcmVar, ktfVarG, null, null, buxVar2, (i4 & 14) | 8 | ((i2 << 3) & 112) | ((i2 << 9) & 57344), 0, 3744);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mxm(afdrVar, z, cmwVar, cjvVar, z2, str, i, 4);
        }
    }

    public static /* synthetic */ afak s(afeg afegVar, afeg afegVar2, bux buxVar, int i) {
        if (buxVar.I((i & 3) != 2, i & 1)) {
            afegVar.invoke(buxVar, 0);
            afegVar2.invoke(buxVar, 0);
        } else {
            buxVar.s();
        }
        return afak.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(final defpackage.cmw r27, final int r28, final int r29, final defpackage.afdr r30, defpackage.cfy r31, boolean r32, boolean r33, defpackage.kts r34, defpackage.bux r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lws.t(cmw, int, int, afdr, cfy, boolean, boolean, kts, bux, int, int):void");
    }

    public static final void u(final int i, final int i2, cfy cfyVar, long j, float f, float f2, float f3, bux buxVar, final int i3) {
        final cfy cfyVar2;
        final long j2;
        final float f4;
        final float f5;
        final float f6;
        cfy cfyVar3;
        long j3;
        float f7;
        float f8;
        float f9;
        int i4 = i3 & 6;
        bux buxVarC = buxVar.c(1897666570);
        int i5 = i4 == 0 ? (true != buxVarC.A(i) ? 2 : 4) | i3 : i3;
        if ((i3 & 48) == 0) {
            i5 |= true != buxVarC.A(i2) ? 16 : 32;
        }
        int i6 = i5 | 384;
        if ((i3 & 3072) == 0) {
            i6 = i5 | 1408;
        }
        int i7 = 1794048 | i6;
        if (buxVarC.I((599187 & i7) != 599186, i7 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i3 & 1) == 0 || buxVarC.F()) {
                cfyVar3 = cfy.e;
                j3 = ((cjv) buxVarC.f(bnm.a)).a;
                f7 = 4.0f;
                f8 = 6.0f;
                f9 = 0.4f;
            } else {
                buxVarC.s();
                cfyVar3 = cfyVar;
                j3 = j;
                f8 = f;
                f7 = f2;
                f9 = f3;
            }
            buxVarC.l();
            final long jH = cjv.h(j3, cjv.a(j3) * f9);
            cfy cfyVarD = awd.d(cfyVar3, 16.0f);
            ctp ctpVarA = avv.a(atd.g(f7), cfl.n, buxVarC, 48);
            cfy cfyVar4 = cfyVar3;
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
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            buxVarC.v(318417641);
            for (int i8 = 0; i8 < i2; i8++) {
                cfy cfyVarI = awd.i(cfy.e, f8);
                boolean zA = buxVarC.A(i8) | ((i7 & 14) == 4) | buxVarC.B(j3) | buxVarC.B(jH);
                Object objS = bvvVar.S();
                if (zA || objS == buw.a) {
                    final int i9 = i8;
                    final long j4 = j3;
                    objS = new afec() { // from class: nlo
                        @Override // defpackage.afec
                        public final Object invoke(Object obj) {
                            cmd cmdVar = (cmd) obj;
                            cmdVar.getClass();
                            czz.aH(cmdVar, i9 < i ? j4 : jH, BitmapDescriptorFactory.HUE_RED, 0L, null, 126);
                            return afak.a;
                        }
                    };
                    bvvVar.ad(objS);
                }
                afp.z(cfyVarI, (afec) objS, buxVarC, 0);
            }
            bvvVar.Y(false);
            bvvVar.Y(true);
            j2 = j3;
            f5 = f7;
            f4 = f8;
            f6 = f9;
            cfyVar2 = cfyVar4;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
            j2 = j;
            f4 = f;
            f5 = f2;
            f6 = f3;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: nlp
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    int i10 = i;
                    int i11 = i2;
                    cfy cfyVar5 = cfyVar2;
                    int i12 = i3 | 1;
                    int i13 = 306783378 & i12;
                    int i14 = 613566756 & i12;
                    lws.u(i10, i11, cfyVar5, j2, f4, f5, f6, buxVar2, (i12 & (-920350135)) | i13 | (i14 >> 1) | ((i13 + i13) & i14));
                    return afak.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(defpackage.afdr r25, defpackage.cfy r26, java.lang.String r27, defpackage.afeg r28, defpackage.bux r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lws.v(afdr, cfy, java.lang.String, afeg, bux, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w(java.lang.Object r17, defpackage.cfy r18, defpackage.acp r19, defpackage.acq r20, defpackage.afeh r21, defpackage.bux r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lws.w(java.lang.Object, cfy, acp, acq, afeh, bux, int, int):void");
    }

    public static final void x(String str, cfy cfyVar, long j, bux buxVar, int i) {
        int i2;
        long j2;
        bux buxVar2;
        cfy cfyVar2;
        str.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1591275490);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            j2 = j;
            i4 |= true != buxVarC.B(j2) ? 128 : 256;
        } else {
            j2 = j;
        }
        if (buxVarC.I((i4 & 147) != 146, i4 & 1)) {
            cfv cfvVar = cfy.e;
            dfw dfwVar = czz.av(buxVarC).b;
            long j3 = nlx.a;
            long j4 = nlx.b;
            die dieVar = new die(500);
            dkr.a(BitmapDescriptorFactory.HUE_RED);
            buxVar2 = buxVarC;
            brp.b(str, cfvVar, j2, 0L, null, 0L, new dkt(3), 0L, 0, false, 1, 0, dfw.v(dfwVar, 0L, j4, dieVar, null, null, null, 0L, null, 0, 0, j4, null, new dks(BitmapDescriptorFactory.HUE_RED, 17), 15597561), buxVar2, i4 & 1022, 24576, 113656);
            cfyVar2 = cfvVar;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gaw(str, cfyVar2, j, i, 4);
        }
    }

    public static final void y(nko nkoVar, boolean z, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(450231990);
        if (i3 == 0) {
            i2 = (true != buxVarC.A(nkoVar == null ? -1 : nkoVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            lvl.R(true != z ? null : nkoVar, buxVarC, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gpv(nkoVar, z, i, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z(defpackage.kjk r19, defpackage.cfy r20, boolean r21, defpackage.bux r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lws.z(kjk, cfy, boolean, bux, int, int):void");
    }
}
