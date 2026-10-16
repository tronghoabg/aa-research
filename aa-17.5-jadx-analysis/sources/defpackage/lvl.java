package defpackage;

import android.accounts.Account;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.auto.components.phone.PhoneCarAppService;
import com.google.android.gms.car.control.CarAction;
import com.google.android.gms.car.navigation.DestinationDistance;
import com.google.android.gms.car.navigation.NavigationCurrentPosition;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
public final class lvl {
    public static final void A(whg whgVar) {
        av(whgVar, yzy.mk);
    }

    public static final mef B(kqt kqtVar) {
        String str;
        yfq yfqVar = kqtVar.b;
        if (yfqVar.isEmpty()) {
            str = kqtVar.a;
        } else {
            yfqVar.getClass();
            str = ((kqz) woy.bF(yfqVar)).a;
        }
        String str2 = kqtVar.a;
        Uri uri = kqtVar.c;
        str.getClass();
        return new mef(uri, str2, str);
    }

    public static final void C(qw qwVar) {
        qwVar.getClass();
        qwVar.g().f(qwVar);
    }

    public static final mqb D(Context context) {
        context.getClass();
        return new mqb(new ComponentName(context.getPackageName(), PhoneCarAppService.class.getName()), (byte[]) null);
    }

    public static mdm E() {
        return (mdm) mki.a.i(mdm.class);
    }

    public static final void F(kjk kjkVar, npe npeVar, npe npeVar2, boolean z, cfy cfyVar, bux buxVar, int i) {
        int i2;
        npe npeVar3;
        npe npeVar4;
        boolean z2;
        bux buxVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1692219267);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(kjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            npeVar3 = npeVar;
            i2 |= true != buxVarC.E(npeVar3) ? 16 : 32;
        } else {
            npeVar3 = npeVar;
        }
        if ((i & 384) == 0) {
            npeVar4 = npeVar2;
            i2 |= true != buxVarC.E(npeVar4) ? 128 : 256;
        } else {
            npeVar4 = npeVar2;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= true != buxVarC.D(z2) ? 1024 : 2048;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 8192 : 16384;
        }
        if (buxVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            kjz kjzVar = kjkVar.a;
            boolean zC = buxVarC.C(kjzVar);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                klj kljVarG = kjq.a.a().g();
                objS = aiyr.a(new jyc(kljVarG.c.b(), kljVarG, kjzVar.a, 3));
                bvvVar.ad(objS);
            }
            int i4 = i2 >> 6;
            boolean zBooleanValue = ((Boolean) byx.e((aiyk) objS, true, null, null, buxVarC, 6).a()).booleanValue();
            int i5 = i4 & 896;
            int i6 = i4 & 112;
            if (zBooleanValue) {
                buxVarC.v(1422372834);
                H(npeVar3, z2, cfyVar, kjkVar.b, null, buxVarC, ((i2 >> 3) & 14) | i6 | i5, 16);
                buxVar2 = buxVarC;
                bvvVar.Y(false);
            } else {
                buxVarC.v(1422476994);
                G(npeVar4, z, cfyVar, kjkVar.b, null, buxVarC, i4 & 1022, 16);
                buxVar2 = buxVarC;
                bvvVar.Y(false);
            }
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mcg(kjkVar, npeVar, npeVar2, z, cfyVar, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G(defpackage.npe r13, boolean r14, defpackage.cfy r15, com.google.android.gms.car.control.CarAction r16, defpackage.afec r17, defpackage.bux r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvl.G(npe, boolean, cfy, com.google.android.gms.car.control.CarAction, afec, bux, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void H(defpackage.npe r13, boolean r14, defpackage.cfy r15, com.google.android.gms.car.control.CarAction r16, defpackage.afec r17, defpackage.bux r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvl.H(npe, boolean, cfy, com.google.android.gms.car.control.CarAction, afec, bux, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void I(defpackage.kjk r16, defpackage.cfy r17, boolean r18, defpackage.bux r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvl.I(kjk, cfy, boolean, bux, int, int):void");
    }

    public static final void J(kjk kjkVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-811767406);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != buxVarC.E(kjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            Integer num = (Integer) kkg.b(roc.ao(bxc.f(jul.f(kjkVar.a), kke.a, buxVarC)));
            boolean zC = buxVarC.C(num) | buxVarC.E(kjkVar);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                objS = new nkn(num, kjkVar, (afck) null, 5);
                bvvVar.ad(objS);
            }
            bvq.g(num, (afeg) objS, buxVarC);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nqo(kjkVar, i, i4);
        }
    }

    public static final void K(npe npeVar, npe npeVar2, boolean z, cfy cfyVar, CarAction carAction, boolean z2, bux buxVar, int i) {
        npe npeVar3;
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(473712318);
        if (i3 == 0) {
            npeVar3 = npeVar;
            i2 = (true != buxVarC.E(npeVar3) ? 2 : 4) | i;
        } else {
            npeVar3 = npeVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(npeVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(carAction) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.D(z2) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i2) != 74898, i2 & 1)) {
            int i4 = i2 >> 3;
            int i5 = i2 & 1022;
            int i6 = i4 & 7168;
            if (z2) {
                buxVarC.v(-898618512);
                ksy ksyVar = nly.a;
                ctp ctpVarA = atp.a(new asz(15.0f, false, null), cfl.j, buxVarC, 0);
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
                L(npeVar3, npeVar2, z, carAction, buxVarC, i5 | i6);
                bvvVar.Y(true);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-898370543);
                ksy ksyVar2 = nly.a;
                ctp ctpVarA2 = avv.a(new asz(15.0f, false, null), cfl.m, buxVarC, 0);
                bvv bvvVar2 = (bvv) buxVarC;
                int iG2 = a.g(bvvVar2.u);
                ccx ccxVarAh2 = bvvVar2.ah();
                cfy cfyVarJ2 = bzi.j(buxVarC, cfyVar);
                afdr afdrVar2 = cwb.a;
                buxVarC.w();
                if (bvvVar2.t) {
                    buxVarC.j(afdrVar2);
                } else {
                    buxVarC.y();
                }
                byq.c(buxVarC, ctpVarA2, cwb.e);
                byq.c(buxVarC, ccxVarAh2, cwb.d);
                byq.c(buxVarC, Integer.valueOf(iG2), cwb.f);
                byq.b(buxVarC, cwb.g);
                byq.c(buxVarC, cfyVarJ2, cwb.c);
                L(npeVar, npeVar2, z, carAction, buxVarC, i5 | i6);
                bvvVar2.Y(true);
                bvvVar2.Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mxm(npeVar, npeVar2, z, cfyVar, carAction, z2, i, 2);
        }
    }

    public static final void L(npe npeVar, npe npeVar2, boolean z, CarAction carAction, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1712607033);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(npeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(npeVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(carAction) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            int i4 = i2 & 7168;
            int i5 = (i2 & 14) | 48;
            int i6 = ((i2 >> 3) & 14) | 48;
            int i7 = i5 | i4;
            if (z) {
                buxVarC.v(-359414036);
                G(npeVar2, true, null, carAction, null, buxVarC, i6 | i4, 20);
                H(npeVar, true, null, carAction, null, buxVarC, i7, 20);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-359234422);
                H(npeVar, false, null, carAction, null, buxVarC, i7, 20);
                G(npeVar2, false, null, carAction, null, buxVarC, i6 | i4, 20);
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hkv(npeVar, npeVar2, z, carAction, i, 5);
        }
    }

    public static final void M(npe npeVar, boolean z, boolean z2, CarAction carAction, afec afecVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        krr krrVar;
        krr krrVar2;
        int i3;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(2083464972);
        if (i4 == 0) {
            i2 = (true != buxVarC.E(npeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(carAction) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((i & 32768) == 0 ? buxVarC.C(afecVar) : buxVarC.E(afecVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 65536 : 131072;
        }
        int i5 = i2;
        if (buxVarC.I((i5 & 74899) != 74898, i5 & 1)) {
            afha afhaVar = npeVar.a;
            bym bymVarF = bxc.f(npeVar.c, kke.a, buxVarC);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = bvq.a(afcp.a, buxVarC);
                bvvVar.ad(objS);
            }
            aitx aitxVar = (aitx) objS;
            cmw cmwVarB = dao.b(aw(z, z2), buxVarC, 0);
            Integer num = (Integer) kkg.b(roc.ao(bymVarF));
            int iIntValue = num != null ? num.intValue() : 0;
            boolean z3 = roc.ao(bymVarF) instanceof kkc;
            aezr aezrVar = kts.a;
            if (z2) {
                buxVarC.v(755115701);
                krrVar = krr.E;
            } else {
                buxVarC.v(755116693);
                krrVar = krr.M;
            }
            long j = ksp.j(krrVar, buxVarC);
            bvvVar.Y(false);
            if (z2) {
                buxVarC.v(755119253);
                krrVar2 = krr.F;
            } else {
                buxVarC.v(755120309);
                krrVar2 = krr.N;
            }
            long j2 = ksp.j(krrVar2, buxVarC);
            bvvVar.Y(false);
            boolean z4 = false;
            kts ktsVarK = jyw.k(0L, j, j2, ksp.k(krs.a, buxVarC), buxVarC, 29951);
            boolean zE = buxVarC.E(aitxVar) | buxVarC.E(carAction) | buxVarC.C(bymVarF);
            if ((i5 & 57344) == 16384 || ((i5 & 32768) != 0 && buxVarC.E(afecVar))) {
                z4 = true;
            }
            int i6 = afhaVar.b;
            boolean zE2 = zE | z4 | buxVarC.E(npeVar) | buxVarC.A(i6);
            Object objS2 = bvvVar.S();
            if (zE2 || objS2 == obj) {
                i3 = i6;
                nla nlaVar = new nla(aitxVar, carAction, afecVar, npeVar, i3, bymVarF, 0);
                bvvVar.ad(nlaVar);
                objS2 = nlaVar;
            } else {
                i3 = i6;
            }
            buxVar2 = buxVarC;
            lws.t(cmwVarB, iIntValue, i3, (afdr) objS2, cfyVar, false, z3, ktsVarK, buxVar2, ((i5 >> 3) & 57344) | 8, 32);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mxm(npeVar, z, z2, carAction, afecVar, cfyVar, i, 3);
        }
    }

    public static final void N(boolean z, bux buxVar, int i) {
        int i2;
        bux buxVarC = buxVar.c(-1822482439);
        if ((i & 6) == 0) {
            i2 = (true != buxVarC.D(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(true) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cmw cmwVarB = dao.b(aw(z, true), buxVarC, 0);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new ngv(12);
                bvvVar.ad(objS);
            }
            lws.t(cmwVarB, 0, 0, (afdr) objS, null, false, false, null, buxVarC, 1576376, 176);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nkz(z, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void O(boolean r17, boolean r18, defpackage.afec r19, defpackage.cfy r20, defpackage.bux r21, int r22, int r23) {
        /*
            r5 = r22
            r0 = r5 & 6
            r1 = 1624014101(0x60cc7d15, float:1.1787965E20)
            r2 = r21
            bux r14 = r2.c(r1)
            r1 = 1
            r9 = r17
            if (r0 != 0) goto L1d
            boolean r0 = r14.D(r9)
            if (r1 == r0) goto L1a
            r0 = 2
            goto L1b
        L1a:
            r0 = 4
        L1b:
            r0 = r0 | r5
            goto L1e
        L1d:
            r0 = r5
        L1e:
            r2 = r5 & 48
            r12 = r18
            if (r2 != 0) goto L30
            boolean r2 = r14.D(r12)
            if (r1 == r2) goto L2d
            r2 = 16
            goto L2f
        L2d:
            r2 = 32
        L2f:
            r0 = r0 | r2
        L30:
            r2 = r5 & 384(0x180, float:5.38E-43)
            r10 = r19
            if (r2 != 0) goto L42
            boolean r2 = r14.E(r10)
            if (r1 == r2) goto L3f
            r2 = 128(0x80, float:1.8E-43)
            goto L41
        L3f:
            r2 = 256(0x100, float:3.59E-43)
        L41:
            r0 = r0 | r2
        L42:
            r2 = r23 & 8
            if (r2 == 0) goto L49
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L5c
        L49:
            r3 = r5 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L5c
            r3 = r20
            boolean r4 = r14.C(r3)
            if (r1 == r4) goto L58
            r4 = 1024(0x400, float:1.435E-42)
            goto L5a
        L58:
            r4 = 2048(0x800, float:2.87E-42)
        L5a:
            r0 = r0 | r4
            goto L5e
        L5c:
            r3 = r20
        L5e:
            r4 = r0 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            r7 = 0
            if (r4 == r6) goto L66
            goto L67
        L66:
            r1 = r7
        L67:
            r4 = r0 & 1
            boolean r1 = r14.I(r1, r4)
            if (r1 == 0) goto La0
            if (r2 == 0) goto L75
            cfv r1 = defpackage.cfy.e
            r11 = r1
            goto L76
        L75:
            r11 = r3
        L76:
            r1 = 2131231628(0x7f08038c, float:1.8079342E38)
            cmw r6 = defpackage.dao.b(r1, r14, r7)
            int r1 = r0 << 9
            int r2 = r0 << 6
            int r0 = r0 << 15
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | 56
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r2
            r1 = r1 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r3
            r1 = r1 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r2
            r15 = r1 | r0
            r16 = 132(0x84, float:1.85E-43)
            r7 = 1108344832(0x42100000, float:36.0)
            r8 = 0
            r13 = 0
            defpackage.lxr.F(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4 = r11
            goto La4
        La0:
            r14.s()
            r4 = r3
        La4:
            bxf r8 = r14.J()
            if (r8 == 0) goto Lba
            nkp r0 = new nkp
            r7 = 0
            r1 = r17
            r2 = r18
            r3 = r19
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.c = r0
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvl.O(boolean, boolean, afec, cfy, bux, int, int):void");
    }

    public static final void P(kjk kjkVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        kjkVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(759293132);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != buxVarC.E(kjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if (buxVarC.I((i5 & 19) != 18, i5 & 1)) {
            kjz kjzVar = kjkVar.a;
            cfv cfvVar = cfy.e;
            boolean zC = buxVarC.C(kjzVar);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                npc npcVarA = npc.a.a();
                kll kllVar = kjzVar.a.b;
                objS = (npy) npcVarA.a(new npb("recircControl", kllVar), new nlh(npcVarA, kllVar, 7, null));
                bvvVar.ad(objS);
            }
            npy npyVar = (npy) objS;
            if (npyVar == null) {
                buxVarC.v(-1490810849);
                Object objS2 = bvvVar.S();
                if (objS2 == buw.a) {
                    objS2 = new nji(20);
                    bvvVar.ad(objS2);
                }
                O(false, false, (afec) objS2, null, buxVarC, 438, 8);
                bvvVar.Y(false);
                bxf bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    bxfVarJ.c = new nad(kjkVar, cfvVar, i, 14);
                    return;
                }
                return;
            }
            buxVarC.v(-1490727242);
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
                objS4 = new njf(aitxVar, carAction, npyVar, i4);
                bvvVar.ad(objS4);
            }
            O(zBooleanValue, z, (afec) objS4, cfvVar, buxVarC, (i5 << 6) & 7168, 0);
            cfyVar = cfvVar;
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ2 = buxVarC.J();
        if (bxfVarJ2 != null) {
            bxfVarJ2.c = new nad(kjkVar, cfyVar, i, 15);
        }
    }

    public static final eqj Q(kjk kjkVar) {
        kjz kjzVar = kjkVar.c;
        byte[] bArr = null;
        klq klqVar = kjzVar != null ? kjzVar.a : null;
        klr klrVar = klqVar != null ? new klr(klqVar.a) : null;
        if (klrVar != null && a.Y(klrVar.a, 354419973)) {
            kll kllVar = klqVar.b;
            int i = 17;
            return ax((nop) npc.a.a().a(new npb("acControl", kllVar), new njb(kllVar, i)), new nji(i));
        }
        if (klrVar != null && a.Y(klrVar.a, 354419977)) {
            return ax(npc.a.a().b(klqVar.b), new nji(19));
        }
        if (klrVar == null || !a.Y(klrVar.a, 354419978)) {
            return tby.b;
        }
        kll kllVar2 = klqVar.b;
        npc npcVarA = npc.a.a();
        return ax((npy) npcVarA.a(new npb("autoControl", kllVar2), new nlh(npcVarA, kllVar2, 8, bArr)), new nji(18));
    }

    public static final void R(nko nkoVar, bux buxVar, int i) {
        int i2;
        nko nkoVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-793543294);
        if (i3 == 0) {
            i2 = (true != buxVarC.A(nkoVar == null ? -1 : nkoVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            nkoVar2 = nkoVar;
            lws.w(nkoVar2, null, null, null, nkh.a, buxVarC, (i2 & 14) | 24576, 14);
        } else {
            nkoVar2 = nkoVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kda(nkoVar2, i, 20);
        }
    }

    public static final void S(kkf kkfVar, afha afhaVar, CarAction carAction, afeg afegVar, nko nkoVar, bux buxVar, int i) {
        int i2;
        afdr afdrVar;
        kkf kkfVar2 = kkfVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1259206083);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(kkfVar2) : buxVarC.E(kkfVar2)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afhaVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(carAction) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? buxVarC.C(afegVar) : buxVarC.E(afegVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.A(nkoVar == null ? -1 : nkoVar.ordinal()) ? 8192 : 16384;
        }
        if (buxVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = bvq.a(afcp.a, buxVarC);
                bvvVar.ad(objS);
            }
            aitx aitxVar = (aitx) objS;
            if (kkfVar2 instanceof kkc) {
                buxVarC.v(764361051);
                boolean zE = ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && buxVarC.E(afegVar))) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && buxVarC.E(kkfVar2))) | buxVarC.E(aitxVar) | buxVarC.E(carAction) | buxVarC.E(afhaVar);
                Object objS2 = bvvVar.S();
                if (zE || objS2 == obj) {
                    dmu dmuVar = new dmu(aitxVar, carAction, kkfVar2, afhaVar, afegVar, 3);
                    kkfVar2 = kkfVar2;
                    bvvVar.ad(dmuVar);
                    objS2 = dmuVar;
                }
                afdrVar = (afdr) objS2;
                bvvVar.Y(false);
            } else {
                buxVarC.v(764678925);
                bvvVar.Y(false);
                afdrVar = null;
            }
            lws.v(afdrVar, null, null, bxc.i(-895030258, true, new mxw(kkfVar2, nkoVar, i4), buxVarC), buxVarC, 3072, 6);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gbn(kkfVar2, afhaVar, carAction, afegVar, nkoVar, i, 4);
        }
    }

    public static final void T(kjk kjkVar, boolean z, bux buxVar, int i, int i2) {
        int i3;
        boolean z2;
        bxf bxfVarJ;
        nkm nkmVar;
        kjkVar.getClass();
        int i4 = i & 6;
        bux buxVarC = buxVar.c(538138407);
        if (i4 == 0) {
            i3 = i | (true != buxVarC.E(kjkVar) ? 2 : 4);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        boolean z3 = i5 == 0;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if (buxVarC.I((i3 & 19) != 18, i3 & 1)) {
            int i6 = i3 << 15;
            boolean z4 = z3 & z;
            kjz kjzVar = kjkVar.a;
            boolean zC = buxVarC.C(kjzVar);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            byte[] bArr = null;
            if (zC || objS == buw.a) {
                npc npcVarA = npc.a.a();
                kll kllVar = kjzVar.a.b;
                objS = (npe) npcVarA.a(new npb("fanSpeedControl", kllVar), new nlh(npcVarA, kllVar, 5, bArr));
                bvvVar.ad(objS);
            }
            npe npeVar = (npe) objS;
            boolean zContains = kjkVar.d.contains(1);
            boolean zC2 = buxVarC.C(kjkVar);
            Object objS2 = bvvVar.S();
            if (zC2 || objS2 == buw.a) {
                objS2 = Q(kjkVar);
                bvvVar.ad(objS2);
            }
            int i7 = i6 & 3670016;
            bym bymVarE = bxc.e((eqj) objS2, buxVarC);
            if (npeVar == null) {
                buxVarC.v(-1431219210);
                kke kkeVar = kke.a;
                afha afhaVar = new afha(0, 0);
                Object objS3 = bvvVar.S();
                if (objS3 == buw.a) {
                    objS3 = new dww((afck) null, 4, (int[]) null);
                    bvvVar.ad(objS3);
                }
                U(zContains, kkeVar, afhaVar, null, (afeg) objS3, null, z4, buxVarC, i7 | 3120, 32);
                bvvVar.Y(false);
                bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    nkmVar = new nkm(kjkVar, z4, i, i2, 0);
                    bxfVarJ.c = nkmVar;
                }
                return;
            }
            buxVarC.v(-1431029893);
            bvvVar.Y(false);
            kkf kkfVarAo = roc.ao(bxc.f(npeVar.c, kke.a, buxVarC));
            CarAction carAction = kjkVar.b;
            boolean zE = buxVarC.E(npeVar);
            Object objS4 = bvvVar.S();
            if (zE || objS4 == buw.a) {
                objS4 = new nkw(npeVar, null, 1, null);
                bvvVar.ad(objS4);
            }
            U(zContains, kkfVarAo, npeVar.a, carAction, (afeg) objS4, (nko) bymVarE.a(), z4, buxVarC, i7, 0);
            z2 = z4;
        } else {
            buxVarC.s();
            z2 = z;
        }
        bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            nkmVar = new nkm(kjkVar, z2, i, i2, 2);
            bxfVarJ.c = nkmVar;
        }
    }

    public static final void U(boolean z, kkf kkfVar, afha afhaVar, CarAction carAction, afeg afegVar, nko nkoVar, boolean z2, bux buxVar, int i, int i2) {
        int i3;
        boolean z3;
        bux buxVar2;
        nko nkoVar2;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(61601353);
        if (i4 == 0) {
            i3 = (true != buxVarC.D(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? buxVarC.C(kkfVar) : buxVarC.E(kkfVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.E(afhaVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.E(carAction) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != ((32768 & i) == 0 ? buxVarC.C(afegVar) : buxVarC.E(afegVar)) ? 8192 : 16384;
        }
        int i5 = i2 & 32;
        int i6 = 196608;
        if (i5 != 0) {
            i3 |= i6;
        } else if ((196608 & i) == 0) {
            i6 = true != buxVarC.A(nkoVar == null ? -1 : nkoVar.ordinal()) ? 65536 : 131072;
            i3 |= i6;
        }
        if ((1572864 & i) == 0) {
            z3 = z2;
            i3 |= true != buxVarC.D(z3) ? 524288 : 1048576;
        } else {
            z3 = z2;
        }
        if (buxVarC.I((599187 & i3) != 599186, i3 & 1)) {
            int i7 = i3 >> 3;
            nko nkoVar3 = i5 != 0 ? null : nkoVar;
            Integer num = (Integer) kkg.b(kkfVar);
            nko nkoVar4 = num == null ? nko.e : num.intValue() == 0 ? nko.f : nkoVar3;
            if (z) {
                buxVarC.v(1215322914);
                buxVar2 = buxVarC;
                S(kkfVar, afhaVar, carAction, afegVar, nkoVar4, buxVar2, i7 & 8190);
                ((bvv) buxVar2).Y(false);
            } else {
                buxVarC.v(1215415480);
                W(kkfVar, afhaVar, carAction, afegVar, nkoVar4, z3, buxVarC, i7 & 466942);
                buxVar2 = buxVarC;
                ((bvv) buxVar2).Y(false);
            }
            nkoVar2 = nkoVar3;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            nkoVar2 = nkoVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mch(z, kkfVar, afhaVar, carAction, afegVar, nkoVar2, z2, i, i2, 2);
        }
    }

    public static final void V(kkf kkfVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(999507020);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(kkfVar) : buxVarC.E(kkfVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        int i4 = 13;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            Integer num = (Integer) kkg.b(kkfVar);
            String strValueOf = (num == null || num.intValue() == 0) ? null : String.valueOf(num.intValue());
            ctp ctpVarA = avv.a(atd.e, cfl.n, buxVarC, 54);
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
            cmw cmwVarB = dao.b(R.drawable.blower, buxVarC, 0);
            cfv cfvVar = cfy.e;
            ksy ksyVar = nly.a;
            boc.a(cmwVarB, null, awd.i(cfvVar, 32.0f), 0L, buxVarC, 56, 8);
            acp acpVarB = acl.B(null, 3);
            cfm cfmVar = cfl.l;
            lws.w(strValueOf, null, acpVarB.a(acl.n(null, cfmVar, 13)), acl.C(null, 3).a(acl.s(null, cfmVar, 13)), nkg.a, buxVarC, 28032, 2);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nad(kkfVar, cfyVar, i, i4);
        }
    }

    public static final void W(kkf kkfVar, afha afhaVar, CarAction carAction, afeg afegVar, nko nkoVar, boolean z, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        afdr afdrVar;
        int i3;
        Object lxuVar;
        bvv bvvVar;
        Integer num;
        boolean z2;
        aitx aitxVar;
        int i4;
        byte[] bArr;
        boolean z3;
        int i5 = i & 6;
        bux buxVarC = buxVar.c(-784327483);
        if (i5 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(kkfVar) : buxVarC.E(kkfVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afhaVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(carAction) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? buxVarC.C(afegVar) : buxVarC.E(afegVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.A(nkoVar == null ? -1 : nkoVar.ordinal()) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.D(z) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i2) != 74898, i2 & 1)) {
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = bvq.a(afcp.a, buxVarC);
                bvvVar2.ad(objS);
            }
            aitx aitxVar2 = (aitx) objS;
            Integer num2 = (Integer) kkg.b(kkfVar);
            boolean z4 = num2 != null && num2.intValue() > ((Number) woy.bC(afhaVar)).intValue();
            boolean z5 = num2 != null && num2.intValue() < ((Number) woy.bA(afhaVar)).intValue();
            if (carAction == null) {
                buxVarC.v(-1277285529);
                bvvVar2.Y(false);
                afdrVar = null;
            } else {
                buxVarC.v(-1277255738);
                boolean zE = buxVarC.E(carAction);
                Object objS2 = bvvVar2.S();
                if (zE || objS2 == obj) {
                    objS2 = new njb(carAction, 6);
                    bvvVar2.ad(objS2);
                }
                afdrVar = (afdr) objS2;
                bvvVar2.Y(false);
            }
            boolean zE2 = buxVarC.E(aitxVar2);
            int i6 = i2 & 7168;
            boolean zC = zE2 | (i6 == 2048 || ((i2 & 4096) != 0 && buxVarC.E(afegVar))) | buxVarC.C(num2);
            afdr afdrVar2 = afdrVar;
            Object objS3 = bvvVar2.S();
            if (zC || objS3 == obj) {
                i3 = i2;
                bvvVar = bvvVar2;
                num = num2;
                z2 = z4;
                aitxVar = aitxVar2;
                i4 = i6;
                bArr = null;
                z3 = false;
                lxuVar = new lxu((Object) aitxVar, (Object) afegVar, (Object) num, 11, (byte[]) null);
                bvvVar.ad(lxuVar);
            } else {
                int i7 = i2;
                lxuVar = objS3;
                i3 = i7;
                bvvVar = bvvVar2;
                num = num2;
                i4 = i6;
                z2 = z4;
                aitxVar = aitxVar2;
                bArr = null;
                z3 = false;
            }
            afdr afdrVar3 = (afdr) lxuVar;
            boolean zE3 = buxVarC.E(aitxVar) | ((i4 == 2048 || ((i3 & 4096) != 0 && buxVarC.E(afegVar))) ? true : z3) | buxVarC.C(num);
            Object objS4 = bvvVar.S();
            if (zE3 || objS4 == obj) {
                objS4 = new lxu((Object) aitxVar, (Object) afegVar, (Object) num, 12, (byte[]) null);
                bvvVar.ad(objS4);
            }
            buxVar2 = buxVarC;
            lws.q(afdrVar3, (afdr) objS4, z5, z2, afdrVar2, null, z, bxc.i(2030728977, true, new njg(nkoVar, 4), buxVarC), null, null, null, null, bxc.i(25728255, true, new mxw(num, kkfVar, 2, bArr), buxVarC), buxVar2, ((i3 << 3) & 3670016) | 12582912, 384, 3872);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new boa(kkfVar, afhaVar, carAction, afegVar, nkoVar, z, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void X(boolean r18, boolean r19, boolean r20, defpackage.afec r21, defpackage.cfy r22, defpackage.bux r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvl.X(boolean, boolean, boolean, afec, cfy, bux, int, int):void");
    }

    public static final void Y(kjk kjkVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        kjkVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(926047250);
        int i4 = 4;
        int i5 = 1;
        if (i3 == 0) {
            i2 = (true != buxVarC.E(kjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if (buxVarC.I((i6 & 19) != 18, i6 & 1)) {
            kjz kjzVar = kjkVar.a;
            cfv cfvVar = cfy.e;
            boolean zC = buxVarC.C(kjzVar);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                npc npcVarA = npc.a.a();
                kll kllVar = kjzVar.a.b;
                objS = (npy) npcVarA.a(new npb("defrostControl", kllVar), new nlh(npcVarA, kllVar, i4, null));
                bvvVar.ad(objS);
            }
            npy npyVar = (npy) objS;
            boolean zF = affa.f(kjzVar.a.b, new klp(i5));
            if (npyVar == null) {
                buxVarC.v(1299015205);
                Object objS2 = bvvVar.S();
                if (objS2 == buw.a) {
                    objS2 = new nji(14);
                    bvvVar.ad(objS2);
                }
                X(false, zF, false, (afec) objS2, null, buxVarC, 3462, 16);
                bvvVar.Y(false);
                bxf bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    bxfVarJ.c = new nad(kjkVar, cfvVar, i, 11);
                    return;
                }
                return;
            }
            buxVarC.v(1299118032);
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
                objS4 = new njf(aitxVar, carAction, npyVar, 3);
                bvvVar.ad(objS4);
            }
            X(zBooleanValue, zF, z, (afec) objS4, cfvVar, buxVarC, (i6 << 9) & 57344, 0);
            cfyVar = cfvVar;
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ2 = buxVarC.J();
        if (bxfVarJ2 != null) {
            bxfVarJ2.c = new nad(kjkVar, cfyVar, i, 12);
        }
    }

    public static final void Z(final kji kjiVar, final int i, bux buxVar, final int i2) {
        int i3;
        int i4;
        kjiVar.getClass();
        int i5 = i2 & 6;
        bux buxVarC = buxVar.c(1338013043);
        int i6 = 4;
        if (i5 == 0) {
            i3 = (true != buxVarC.E(kjiVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.A(i + (-1)) ? 16 : 32;
        }
        if (buxVarC.I((i3 & 19) != 18, i3 & 1)) {
            int i7 = kjiVar.a.a;
            if (i7 == 1) {
                i4 = R.drawable.gs_airwave_rond100_vd_theme_24;
            } else if (i7 == 2) {
                i4 = R.drawable.gs_library_music_rond100_vd_theme_24;
            } else {
                if (i7 != 3) {
                    throw new IllegalArgumentException(a.bp(i7, "Unsupported action has no icon "));
                }
                i4 = R.drawable.gs_car_gear_rond100_vd_theme_24;
            }
            boolean zE = buxVarC.E(kjiVar);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                objS = new njb(kjiVar, i6);
                bvvVar.ad(objS);
            }
            afdr afdrVar = (afdr) objS;
            if (i == 2) {
                buxVarC.v(-844262726);
                lws.p(dao.b(i4, buxVarC, 0), afdrVar, buxVarC, 8);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-844163526);
                cmw cmwVarB = dao.b(i4, buxVarC, 0);
                bcm bcmVar = czz.au(buxVarC).b;
                ksy ksyVar = nly.a;
                ksy ksyVar2 = nly.a;
                ksy ksyVar3 = ksy.a;
                khc.l(cmwVarB, afdrVar, null, ksyVar2, false, bcmVar, null, null, null, buxVarC, 8, 0, 4020);
                bvvVar.Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: nke
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i8 = i2 | 1;
                    int i9 = 306783378 & i8;
                    kji kjiVar2 = kjiVar;
                    int i10 = 613566756 & i8;
                    int i11 = i;
                    lvl.Z(kjiVar2, i11, (bux) obj, (i8 & (-920350135)) | i9 | (i10 >> 1) | ((i9 + i9) & i10));
                    return afak.a;
                }
            };
        }
    }

    public static /* synthetic */ void a(lvg lvgVar) {
        if (lvgVar instanceof lvk) {
            lnm.m().h((lvk) lvgVar);
        } else if (lvgVar instanceof lvi) {
            lnm.m().f(lvgVar, false, false);
        }
    }

    public static final void aa(kjk kjkVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        bxf bxfVarJ;
        nad nadVar;
        String strE;
        kjkVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-772981396);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(kjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (buxVarC.I((i4 & 19) != 18, i4 & 1)) {
            kjz kjzVar = kjkVar.a;
            cfv cfvVar = cfy.e;
            boolean zC = buxVarC.C(kjzVar);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            byte[] bArr = null;
            if (zC || objS == buw.a) {
                npc npcVarA = npc.a.a();
                kll kllVar = kjzVar.a.b;
                objS = (npy) npcVarA.a(new npb("acOnControl", kllVar), new nlh(npcVarA, kllVar, 10, bArr));
                bvvVar.ad(objS);
            }
            npy npyVar = (npy) objS;
            String strE2 = vq.e(R.string.control_ac_on, buxVarC);
            if (npyVar == null) {
                buxVarC.v(1726165868);
                Object objS2 = bvvVar.S();
                if (objS2 == buw.a) {
                    objS2 = new nji(13);
                    bvvVar.ad(objS2);
                }
                lxr.E(strE2, null, false, (afec) objS2, null, false, null, buxVarC, 200064, 82);
                bvvVar.Y(false);
                bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    nadVar = new nad(kjkVar, cfvVar, i, 7);
                    bxfVarJ.c = nadVar;
                }
                return;
            }
            buxVarC.v(1726267734);
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
            if (affa.f(kkg.b(roc.ao(bymVarF)), false)) {
                buxVarC.v(194246064);
                strE = vq.e(R.string.control_off, buxVarC);
                bvvVar.Y(false);
            } else {
                buxVarC.v(1726701361);
                bvvVar.Y(false);
                strE = null;
            }
            Boolean bool = (Boolean) kkg.b(roc.ao(bymVarF));
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            boolean z = roc.ao(bymVarF) instanceof kkc;
            boolean zE = buxVarC.E(aitxVar) | buxVarC.E(carAction) | buxVarC.E(npyVar);
            Object objS4 = bvvVar.S();
            if (zE || objS4 == obj) {
                objS4 = new njf(aitxVar, carAction, npyVar, 2);
                bvvVar.ad(objS4);
            }
            cfyVar2 = cfvVar;
            lxr.E(strE2, strE, zBooleanValue, (afec) objS4, cfyVar2, z, null, buxVarC, (i4 << 9) & 57344, 64);
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            nadVar = new nad(kjkVar, cfyVar2, i, 8);
            bxfVarJ.c = nadVar;
        }
    }

    public static final void ab(njw njwVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        long jK;
        bym bymVar;
        boolean z;
        bvv bvvVar;
        njwVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-596924716);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(njwVar) : buxVarC.E(njwVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bym bymVarF = bxc.f(njwVar.e(), 0, buxVarC);
            ksy ksyVar = ksy.c;
            float f = ksyVar.h;
            if (leh.a.a().b()) {
                buxVarC.v(-1819330751);
                jK = ksp.j(krr.o, buxVarC);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-1819280314);
                jK = ksp.k(krs.a, buxVarC);
                ((bvv) buxVarC).Y(false);
            }
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new asg();
                bvvVar2.ad(objS);
            }
            asf asfVar = (asf) objS;
            cfy cfyVarI = awd.i(cfyVar, f);
            avp avpVar = bmo.a;
            ckv ckvVarD = bmo.d(buxVarC);
            aezr aezrVar = ktf.a;
            long j = jK;
            int i5 = i2;
            cfy cfyVarA = kvc.a(cfyVarI, ckvVarD, kgq.j(0L, 0L, 0L, 0L, buxVarC, 255).j, kgq.j(0L, 0L, 0L, 0L, buxVarC, 255).k, ksyVar.o, ksyVar.p, asfVar, false, false, buxVarC, 1572864, 192);
            int i6 = i5 & 14;
            if (i6 == 4 || ((i5 & 8) != 0 && buxVarC.E(njwVar))) {
                bymVar = bymVarF;
                z = true;
            } else {
                bymVar = bymVarF;
                z = false;
            }
            boolean zC = z | buxVarC.C(bymVar);
            Object objS2 = bvvVar2.S();
            if (zC || objS2 == obj) {
                objS2 = new mts(njwVar, bymVar, i4);
                bvvVar = bvvVar2;
                bvvVar.ad(objS2);
            } else {
                bvvVar = bvvVar2;
            }
            cfy cfyVarD = das.d(afp.w(cfyVarA, asfVar, null, true, null, (afdr) objS2), "geminiLive");
            ctp ctpVarB = atk.b(cfl.a, false);
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
            int i7 = jvm.x;
            Bundle bundleB = juc.b();
            cfv cfvVar = cfy.e;
            cfy cfyVarG = cjn.g(awd.c(cfvVar, 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bcr.a, true, 0, 1042431);
            Object objS3 = bvvVar.S();
            if (objS3 == obj) {
                objS3 = new ndo(i4);
                bvvVar.ad(objS3);
            }
            cfy cfyVarK = bxc.k(cfyVarG, (afec) objS3);
            vo voVarD = dtv.d(buxVarC);
            eps epsVar = (eps) dyz.c(((eqa) buxVarC.f(erz.a)).getLifecycle(), buxVarC).a();
            Object objS4 = bvvVar.S();
            if (objS4 == obj) {
                objS4 = muo.o;
                bvvVar.ad(objS4);
            }
            bvv bvvVar3 = bvvVar;
            buxVar2 = buxVarC;
            dtk.i(jvm.class, cfyVarK, voVarD, bundleB, epsVar, (afec) objS4, buxVar2, 0);
            int i8 = 17;
            if (ldz.a.a().b()) {
                buxVar2.v(-864425688);
                bvvVar3.Y(false);
            } else {
                buxVar2.v(-864879280);
                cfy cfyVarC = awd.c(cfvVar, 1.0f);
                Object objS5 = bvvVar3.S();
                if (objS5 == obj) {
                    objS5 = new ndo(i8);
                    bvvVar3.ad(objS5);
                }
                cfy cfyVarK2 = bxc.k(cfyVarC, (afec) objS5);
                boolean z2 = buxVar2.z(f) | buxVar2.B(j);
                Object objS6 = bvvVar3.S();
                if (z2 || objS6 == obj) {
                    objS6 = new bnp(f, j, 2);
                    bvvVar3.ad(objS6);
                }
                afp.z(cfyVarK2, (afec) objS6, buxVar2, 0);
                bvvVar3.Y(false);
            }
            cfy cfyVarC2 = awd.c(cfvVar, 1.0f);
            boolean zC2 = buxVar2.C(bymVar) | (i6 == 4 || ((i5 & 8) != 0 && buxVar2.E(njwVar)));
            Object objS7 = bvvVar3.S();
            if (zC2 || objS7 == obj) {
                objS7 = new mts(njwVar, bymVar, i8);
                bvvVar3.ad(objS7);
            }
            atk.c(das.d(afp.w(cfyVarC2, asfVar, null, true, null, (afdr) objS7), "geminiLive"), buxVar2, 0);
            bvvVar3.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nad(njwVar, cfyVar, i, 6);
        }
    }

    public static final boolean ac(Account account) {
        return affa.f(account != null ? account.type : null, "com.google");
    }

    public static final boolean ad(Account account) {
        if (affa.f(account != null ? account.type : null, "com.google.android.apps.maps")) {
            String str = account.name;
            str.getClass();
            if (afyh.g(str, "incognito@", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [abow, java.lang.Object] */
    public static abow ae(abpc abpcVar, ByteBuffer byteBuffer, abnj abnjVar) throws IOException {
        byte[] bArrC;
        int i;
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            int iAbs = Math.abs(i2);
            byte[] bArr = new byte[iAbs];
            byteBuffer.get(bArr);
            int i3 = iAbs < 4 ? 0 : ((bArr[iAbs - 1] & 255) << 24) + ((bArr[iAbs - 2] & 255) << 16) + ((bArr[iAbs - 3] & 255) << 8) + (bArr[iAbs - 4] & 255);
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr, 0, iAbs), Math.min(Math.max(i3, iAbs) + 10, 8192));
                try {
                    if (i3 <= 10000000) {
                        bArrC = new byte[i3];
                        int i4 = 0;
                        while (i4 < i3 && (i = gZIPInputStream.read(bArrC, i4, i3 - i4)) != -1) {
                            i4 += i;
                        }
                        if (i4 < i3) {
                            bArrC = Arrays.copyOf(bArrC, i4);
                        } else {
                            int i5 = gZIPInputStream.read();
                            if (i5 != -1) {
                                boolean z = true;
                                byte[][] bArr2 = {bArrC, new byte[]{(byte) i5}, yts.c(gZIPInputStream)};
                                long length = 0;
                                for (int i6 = 0; i6 < 3; i6++) {
                                    length += bArr2[i6].length;
                                }
                                int i7 = (int) length;
                                if (length != i7) {
                                    z = false;
                                }
                                woy.R(z, "the total number of elements (%s) in the arrays must fit in an int", length);
                                bArrC = new byte[i7];
                                int i8 = 0;
                                for (int i9 = 0; i9 < 3; i9++) {
                                    byte[] bArr3 = bArr2[i9];
                                    int length2 = bArr3.length;
                                    System.arraycopy(bArr3, 0, bArrC, i8, length2);
                                    i8 += length2;
                                }
                            }
                        }
                    } else {
                        bArrC = yts.c(gZIPInputStream);
                    }
                    gZIPInputStream.close();
                } finally {
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            byte[] bArr4 = new byte[i2];
            byteBuffer.get(bArr4);
            bArrC = bArr4;
        }
        return abpcVar.j(bArrC, abnjVar);
    }

    public static void af(DataOutputStream dataOutputStream, abow abowVar) throws IOException {
        byte[] bArrH = abowVar.h();
        int length = bArrH.length;
        if (length > 250) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArrH);
                gZIPOutputStream.close();
                if (byteArrayOutputStream.size() < length) {
                    dataOutputStream.writeInt(-byteArrayOutputStream.size());
                    byteArrayOutputStream.writeTo(dataOutputStream);
                    return;
                }
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        dataOutputStream.writeInt(length);
        dataOutputStream.write(bArrH);
    }

    public static aasr ag(plz plzVar) {
        aceg acegVarA = plzVar.a(acef.ENABLE_FEATURES);
        return acegVarA.c == 4 ? (aasr) acegVarA.d : aasr.a;
    }

    public static aaun ah(plz plzVar) {
        aceg acegVarA = plzVar.a(acef.MAP_CORE_GEO_CONSUMER);
        return acegVarA.c == 248 ? (aaun) acegVarA.d : aaun.a;
    }

    public static aauo ai(plz plzVar) {
        aceg acegVarA = plzVar.a(acef.MAP_CORE);
        return acegVarA.c == 240 ? (aauo) acegVarA.d : aauo.a;
    }

    public static abgi aj(plz plzVar) {
        aceg acegVarA = plzVar.a(acef.PAINT_PARAMETERS);
        return acegVarA.c == 39 ? (abgi) acegVarA.d : abgi.a;
    }

    public static final boolean ak(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("activity");
        systemService.getClass();
        ActivityManager activityManager = (ActivityManager) systemService;
        try {
            return activityManager.isLowRamDevice();
        } catch (VerifyError e) {
            ((ynz) ((ynz) plj.a.h()).p(e).ai(6773)).w("Expected isLowRamDevice API from version %d", Build.VERSION.SDK_INT);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem <= 1073741824;
        }
    }

    @ResultIgnorabilityUnspecified
    public static Object al(Callable callable) throws Exception {
        int i = 0;
        do {
            try {
                return callable.call();
            } catch (Exception e) {
                i++;
            }
        } while (i < 2);
        throw e;
    }

    public static int am(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
    }

    public static /* synthetic */ String an(int i) {
        return i != 1 ? "CALLOUT" : "CVO";
    }

    public static boolean ao(int i) {
        return i + (-1) == 0;
    }

    public static abow ap(xpr xprVar) {
        switch (xprVar) {
            case MESSAGE_WIFI_REQUEST_START_BT:
                return xpx.a;
            case MESSAGE_WIFI_REQUEST_INFO_BT:
                return xpp.a;
            case MESSAGE_WIFI_RESPONSE_INFO_BT:
                return xpq.a;
            case MESSAGE_WIFI_VERSION_REQUEST_BT:
                return xpz.a;
            case MESSAGE_WIFI_VERSION_RESPONSE_BT:
                return xqa.a;
            case MESSAGE_WIFI_CONNECT_STATUS_BT:
                return xpn.a;
            case MESSAGE_WIFI_RESPONSE_START_BT:
                return xpy.a;
            case MESSAGE_WIFI_PING_REQUEST_BT:
                return xps.a;
            case MESSAGE_WIFI_PING_RESPONSE_BT:
                return xpt.a;
            case MESSAGE_WIFI_CONNECTION_REJECTION_BT:
                return xpo.a;
            case MESSAGE_WIFI_SETUP_INFO_BT:
                return xpw.a;
            default:
                throw new RuntimeException(null, null);
        }
    }

    public static void aq(xpr xprVar, abow abowVar) {
        switch (xprVar) {
            case MESSAGE_WIFI_REQUEST_START_BT:
                xpx xpxVar = (xpx) abowVar;
                xxg xxgVar = new xxg("WifiStartRequest");
                xxgVar.b("ipAddress", xpxVar.c);
                xxgVar.f("port", xpxVar.d);
                xxgVar.toString();
                return;
            case MESSAGE_WIFI_REQUEST_INFO_BT:
                new xxg("WifiInfoRequest").toString();
                return;
            case MESSAGE_WIFI_RESPONSE_INFO_BT:
                xpq xpqVar = (xpq) abowVar;
                xxg xxgVar2 = new xxg("WifiInfoResponse");
                xxgVar2.b("wifiSsid", xpqVar.b);
                xpv xpvVarB = xpv.b(xpqVar.e);
                if (xpvVarB == null) {
                    xpvVarB = xpv.UNKNOWN_SECURITY_MODE;
                }
                xxgVar2.b("wifiSecurityMode", xpvVarB.name());
                int iAC = a.aC(xpqVar.f);
                xxgVar2.b("accessPointType", (iAC == 0 || iAC == 1) ? "STATIC" : "DYNAMIC");
                xxgVar2.toString();
                return;
            case MESSAGE_WIFI_VERSION_REQUEST_BT:
                xpz xpzVar = (xpz) abowVar;
                xxg xxgVar3 = new xxg("WifiVersionRequest");
                xxgVar3.f("majorVersion", xpzVar.c);
                xxgVar3.f("minorVersion", xpzVar.d);
                xxgVar3.b("supportedWifiChannels", xpzVar.f);
                xxgVar3.toString();
                return;
            case MESSAGE_WIFI_VERSION_RESPONSE_BT:
                xqa xqaVar = (xqa) abowVar;
                xxg xxgVar4 = new xxg("WifiVersionResponse");
                xxgVar4.f("majorVersion", xqaVar.c);
                xxgVar4.f("minorVersion", xqaVar.d);
                xxgVar4.b("deviceSerial", xqaVar.e);
                int iAm = wpq.am(xqaVar.f);
                xxgVar4.b("versionStatus", wpq.al(iAm != 0 ? iAm : 13));
                int iAy = a.ay(xqaVar.g);
                xxgVar4.b("selectedWifiChannelType", (iAy == 0 || iAy == 1) ? "CHANNELS_5GHZ_ONLY" : iAy != 2 ? iAy != 3 ? "NO_CHANNELS_SUPPORTED" : "CHANNELS_DUAL_BAND" : "CHANNELS_24GHZ_ONLY");
                xxgVar4.toString();
                return;
            case MESSAGE_WIFI_CONNECT_STATUS_BT:
                xpn xpnVar = (xpn) abowVar;
                xxg xxgVar5 = new xxg("WifiConnectStatus");
                int iAm2 = wpq.am(xpnVar.c);
                xxgVar5.b("connectStatus", wpq.al(iAm2 != 0 ? iAm2 : 13));
                xxgVar5.b("errorMessageHint", xpnVar.d);
                xxgVar5.toString();
                return;
            case MESSAGE_WIFI_RESPONSE_START_BT:
                xpy xpyVar = (xpy) abowVar;
                xxg xxgVar6 = new xxg("WifiStartResponse");
                xxgVar6.b("ipAddress", xpyVar.c);
                xxgVar6.f("port", xpyVar.d);
                int iAm3 = wpq.am(xpyVar.e);
                xxgVar6.b("messageStatus", wpq.al(iAm3 != 0 ? iAm3 : 13));
                xxgVar6.toString();
                return;
            case MESSAGE_WIFI_PING_REQUEST_BT:
                xxg xxgVar7 = new xxg("WifiPingRequest");
                xxgVar7.g("timestampMs", ((xps) abowVar).c);
                xxgVar7.toString();
                return;
            case MESSAGE_WIFI_PING_RESPONSE_BT:
                xxg xxgVar8 = new xxg("WifiPingResponse");
                xxgVar8.g("timestampMs", ((xpt) abowVar).b);
                xxgVar8.toString();
                return;
            case MESSAGE_WIFI_CONNECTION_REJECTION_BT:
                xxg xxgVar9 = new xxg("WifiConnectionRejection");
                int iAp = a.ap(((xpo) abowVar).b);
                xxgVar9.b("rejectionReason", wox.s(iAp != 0 ? iAp : 1));
                xxgVar9.toString();
                return;
            case MESSAGE_WIFI_SETUP_INFO_BT:
                xpw xpwVar = (xpw) abowVar;
                xxg xxgVar10 = new xxg("WifiSetupInfo");
                xxgVar10.f("majorVersion", xpwVar.b);
                xxgVar10.f("minorVersion", xpwVar.c);
                xpm xpmVar = xpwVar.f;
                if (xpmVar == null) {
                    xpmVar = xpm.a;
                }
                xxgVar10.b("accessPointInfo.ssid", xpmVar.b);
                xpm xpmVar2 = xpwVar.f;
                if (xpmVar2 == null) {
                    xpmVar2 = xpm.a;
                }
                xpv xpvVarB2 = xpv.b(xpmVar2.e);
                if (xpvVarB2 == null) {
                    xpvVarB2 = xpv.UNKNOWN_SECURITY_MODE;
                }
                xxgVar10.b("accessPointInfo.wifiSecurityMode", xpvVarB2.name());
                xpm xpmVar3 = xpwVar.f;
                if (xpmVar3 == null) {
                    xpmVar3 = xpm.a;
                }
                xxgVar10.b("accessPointInfo.supportedWifiChannels", xpmVar3.f);
                xxgVar10.toString();
                return;
            default:
                throw new RuntimeException(null, null);
        }
    }

    public static /* synthetic */ int ar(ozx ozxVar) {
        Objects.checkIndex(0, 4);
        if (ozxVar instanceof ozu) {
            return 0;
        }
        if (ozxVar instanceof ozv) {
            return 1;
        }
        return ozxVar instanceof ozw ? 2 : -2;
    }

    public static /* synthetic */ int as(pfx pfxVar) {
        Objects.checkIndex(0, 3);
        if (pfxVar instanceof pfv) {
            return 0;
        }
        return pfxVar instanceof pfw ? 1 : -2;
    }

    public static boolean at(pej pejVar) {
        Objects.checkIndex(0, 5);
        if (osq.H(pejVar, pee.a)) {
            return false;
        }
        if (osq.J(pejVar, pee.a) || osq.I(pejVar, pee.a)) {
            return true;
        }
        if (!(pejVar instanceof pef)) {
            throw new RuntimeException(null, null);
        }
        return true;
    }

    public static boolean au(pdt pdtVar) {
        if ((pdtVar instanceof pdq) || affa.f(pdtVar, pdr.a)) {
            return true;
        }
        if (pdtVar instanceof pds) {
            return false;
        }
        throw new aezs();
    }

    private static final void av(whg whgVar, yzy yzyVar) {
        lxr.e();
        lxr.f(((lub) whgVar.c).h, yzyVar, (ComponentName) whgVar.b);
    }

    private static final int aw(boolean z, boolean z2) {
        return z2 ? z ? R.drawable.gs_seat_heat_left_rond100_vd_theme_24 : R.drawable.gs_seat_heat_right_rond100_vd_theme_24 : z ? R.drawable.gs_seat_cool_left_rond100_vd_theme_24 : R.drawable.gs_seat_cool_right_rond100_vd_theme_24;
    }

    private static final eqj ax(npa npaVar, afec afecVar) {
        eqj eqjVarA;
        return (npaVar == null || (eqjVarA = npaVar.a()) == null) ? tby.b : jun.e(jun.d(eqjVarA, afecVar));
    }

    public static final String b(Context context, NavigationCurrentPosition navigationCurrentPosition) throws Resources.NotFoundException {
        yfq yfqVarA;
        DestinationDistance destinationDistance;
        context.getClass();
        if (navigationCurrentPosition == null || (yfqVarA = navigationCurrentPosition.a()) == null || (destinationDistance = (DestinationDistance) woy.bH(yfqVarA)) == null) {
            return null;
        }
        int iCeil = (int) Math.ceil(destinationDistance.c / 60.0d);
        if (iCeil > 10) {
            int i = iCeil % 5;
            iCeil += i == 0 ? 0 : 5 - i;
        }
        if (iCeil <= 10) {
            String quantityString = context.getResources().getQuantityString(R.plurals.share_imminent_eta_reply_text, iCeil, Integer.valueOf(iCeil));
            quantityString.getClass();
            return quantityString;
        }
        if (iCeil < 60) {
            String string = context.getString(R.string.share_eta_min_reply_text, Integer.valueOf(iCeil));
            string.getClass();
            return string;
        }
        int i2 = iCeil / 60;
        int i3 = iCeil % 60;
        String string2 = i3 == 0 ? context.getString(R.string.share_eta_hr_reply_text, Integer.valueOf(i2)) : context.getString(R.string.share_eta_hr_min_reply_text, Integer.valueOf(i2), Integer.valueOf(i3));
        string2.getClass();
        return string2;
    }

    public static /* synthetic */ String c(Context context, Location location) {
        Locale locale = Locale.US;
        locale.getClass();
        locale.getClass();
        if (location == null) {
            return null;
        }
        Uri.Builder builderAppendEncodedPath = new Uri.Builder().scheme("https").appendEncodedPath("/maps.google.com");
        String str = String.format(locale, "?q=%.6f,%.6f", Arrays.copyOf(new Object[]{Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())}, 2));
        str.getClass();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        country.getClass();
        Locale locale2 = Locale.ROOT;
        locale2.getClass();
        String lowerCase = country.toLowerCase(locale2);
        lowerCase.getClass();
        return context.getString(R.string.share_location_reply_text, builderAppendEncodedPath.appendEncodedPath(str + "&hl=" + language + "&gl=" + lowerCase + "&entry=gps").toString());
    }

    public static lux d() {
        return (lux) mki.a.i(lux.class);
    }

    public static final yzy e(whg whgVar) {
        return lua.ASSISTANT_AUTO_READ.equals(whgVar.d) ? yzy.mw : yzy.mx;
    }

    public static final yzy f(whg whgVar) {
        lub lubVar = lub.HUN;
        lub lubVar2 = (lub) whgVar.c;
        boolean zEquals = lubVar2.equals(lubVar);
        boolean zEquals2 = lua.ASSISTANT_AUTO_READ.equals(whgVar.d);
        boolean zEquals3 = lubVar2.equals(lub.DASHBOARD);
        if (zEquals2) {
            return yzy.nh;
        }
        if (zEquals3) {
            return yzy.mR;
        }
        return ((ltz) whgVar.e).equals(ltz.a) ? zEquals ? yzy.mI : yzy.mn : zEquals ? yzy.mH : yzy.mm;
    }

    public static final yzy g(whg whgVar) {
        lub lubVar = lub.HUN;
        lub lubVar2 = (lub) whgVar.c;
        boolean zEquals = lubVar2.equals(lubVar);
        boolean zEquals2 = lua.ASSISTANT_AUTO_READ.equals(whgVar.d);
        boolean zEquals3 = lubVar2.equals(lub.DASHBOARD);
        if (zEquals2) {
            return yzy.ni;
        }
        if (zEquals3) {
            return yzy.mS;
        }
        return ((ltz) whgVar.e).equals(ltz.a) ? zEquals ? yzy.mG : yzy.mr : zEquals ? yzy.mF : yzy.mq;
    }

    public static final yzy h(whg whgVar) {
        lub lubVar = lub.HUN;
        lub lubVar2 = (lub) whgVar.c;
        return lubVar2.equals(lubVar) ? yzy.ne : lubVar2.equals(lub.DASHBOARD) ? yzy.nf : yzy.mL;
    }

    public static final void i(whg whgVar) {
        av(whgVar, yzy.ml);
    }

    public static final void j(whg whgVar) {
        av(whgVar, ((lub) whgVar.c).equals(lub.HUN) ? yzy.mJ : yzy.mj);
    }

    public static final void k(whg whgVar) {
        boolean zEquals = ((lub) whgVar.c).equals(lub.HUN);
        boolean zEquals2 = lua.ASSISTANT_AUTO_READ.equals(whgVar.d);
        whgVar.b();
        av(whgVar, zEquals2 ? yzy.mP : zEquals ? yzy.mK : yzy.mi);
        if (whgVar.a) {
            av(whgVar, zEquals2 ? yzy.KE : zEquals ? yzy.KF : yzy.KG);
        }
    }

    public static final void l(whg whgVar) {
        whgVar.b();
        av(whgVar, yzy.mO);
    }

    public static final void m(whg whgVar) {
        av(whgVar, yzy.KX);
    }

    public static final void n(whg whgVar) {
        av(whgVar, yzy.KU);
    }

    public static final void o(whg whgVar) {
        av(whgVar, yzy.KY);
    }

    public static final void p(whg whgVar) {
        av(whgVar, yzy.KV);
    }

    public static final void q(whg whgVar) {
        av(whgVar, yzy.Lb);
    }

    public static final void r(whg whgVar) {
        av(whgVar, yzy.KR);
    }

    public static final void s(whg whgVar) {
        av(whgVar, yzy.KQ);
    }

    public static final void t(whg whgVar) {
        av(whgVar, yzy.La);
    }

    public static final void u(whg whgVar) {
        av(whgVar, yzy.KP);
    }

    public static final void v(whg whgVar) {
        av(whgVar, yzy.KN);
    }

    public static final void w(whg whgVar) {
        av(whgVar, yzy.KZ);
    }

    public static final void x(whg whgVar) {
        av(whgVar, yzy.KM);
    }

    public static final void y(whg whgVar) {
        av(whgVar, yzy.KW);
    }

    public static final void z(whg whgVar) {
        av(whgVar, yzy.KI);
    }
}
