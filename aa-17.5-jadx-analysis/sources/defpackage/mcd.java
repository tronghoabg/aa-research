package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.telecom.PhoneCall;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class mcd {
    public static odp A() {
        return (odp) mki.a.i(odp.class);
    }

    public static int B(List list) {
        int size = list.size();
        PhoneCall phoneCall = size > 0 ? (PhoneCall) list.get(0) : null;
        PhoneCall phoneCall2 = size > 1 ? (PhoneCall) list.get(1) : null;
        if (phoneCall == null) {
            return 0;
        }
        if (phoneCall2 != null && phoneCall2.a() && phoneCall.a()) {
            return 3;
        }
        if (phoneCall.c()) {
            return 1;
        }
        return phoneCall.a() ? 2 : 0;
    }

    public static void C(ocq ocqVar, yzy yzyVar) {
        ebf.j().o(((oci) ocqVar).g.g, yzyVar);
    }

    public static ocb D(obx obxVar) {
        return new ocb(obxVar.a(1.0f).c);
    }

    public static final boolean E() {
        String str = Build.MANUFACTURER;
        str.getClass();
        return afyh.u(str, "samsung", true);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F(final defpackage.nul r14, final int r15, final boolean r16, defpackage.cfy r17, defpackage.bux r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mcd.F(nul, int, boolean, cfy, bux, int, int):void");
    }

    public static final void G(final String str, final String str2, final String str3, final GhIcon ghIcon, final GhIcon ghIcon2, final nuo nuoVar, final afdr afdrVar, final afdr afdrVar2, final boolean z, final int i, final boolean z2, final List list, final boolean z3, final boolean z4, final boolean z5, cfy cfyVar, bux buxVar, final int i2, final int i3) {
        int i4;
        String str4;
        GhIcon ghIcon3;
        GhIcon ghIcon4;
        int i5;
        afdr afdrVar3;
        int i6;
        cfy cfyVar2;
        bux buxVar2;
        final nuo nuoVar2;
        int i7 = i2 & 6;
        bux buxVarC = buxVar.c(42444634);
        if (i7 == 0) {
            i4 = (true != buxVarC.C(str) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            str4 = str2;
            i4 |= true != buxVarC.C(str4) ? 16 : 32;
        } else {
            str4 = str2;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != buxVarC.C(str3) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            ghIcon3 = ghIcon;
            i4 |= true != buxVarC.C(ghIcon3) ? 1024 : 2048;
        } else {
            ghIcon3 = ghIcon;
        }
        if ((i2 & 24576) == 0) {
            ghIcon4 = ghIcon2;
            i4 |= true != buxVarC.C(ghIcon4) ? 8192 : 16384;
        } else {
            ghIcon4 = ghIcon2;
        }
        if ((i2 & 196608) == 0) {
            i5 = 196608;
            i4 |= true != buxVarC.A(nuoVar.ordinal()) ? 65536 : 131072;
        } else {
            i5 = 196608;
        }
        if ((1572864 & i2) == 0) {
            afdrVar3 = afdrVar;
            i4 |= true != buxVarC.E(afdrVar3) ? 524288 : 1048576;
        } else {
            afdrVar3 = afdrVar;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != buxVarC.E(afdrVar2) ? 4194304 : 8388608;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= true != buxVarC.D(z) ? 33554432 : 67108864;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= true != buxVarC.A(i) ? 268435456 : 536870912;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (true != buxVarC.D(z2) ? 2 : 4);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= true != ((i3 & 64) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i6 |= true == buxVarC.D(z3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= true == buxVarC.D(z4) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= true == buxVarC.D(z5) ? 16384 : 8192;
        }
        if ((i3 & i5) == 0) {
            i6 |= true == buxVarC.C(cfyVar) ? 131072 : 65536;
        }
        int i8 = i6;
        if (buxVarC.I(((306783379 & i4) == 306783378 && (i8 & 74899) == 74898) ? false : true, i4 & 1)) {
            Iterator it = list.iterator();
            final int i9 = 0;
            while (it.hasNext()) {
                nul nulVar = (nul) it.next();
                if ((nulVar != null ? nulVar.c : null) != null && (nulVar.b != null || nulVar.a != null)) {
                    i9++;
                }
            }
            final boolean z6 = i9 > 1;
            final bym bymVarA = ady.a(z3 ? 42.0f : 8.0f, null, null, null, buxVarC, 0, 14);
            final bym bymVarA2 = ady.a(z4 ? 42.0f : 8.0f, null, null, null, buxVarC, 0, 14);
            final bcm bcmVarC = bcr.c(((dlj) bymVarA.a()).a, ((dlj) bymVarA.a()).a, ((dlj) bymVarA2.a()).a, ((dlj) bymVarA2.a()).a);
            final GhIcon ghIcon5 = ghIcon4;
            final afdr afdrVar4 = afdrVar3;
            final GhIcon ghIcon6 = ghIcon3;
            final String str5 = str4;
            afeh afehVar = new afeh() { // from class: nyc
                @Override // defpackage.afeh
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    cfy cfyVar3 = (cfy) obj;
                    bux buxVar3 = (bux) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    cfyVar3.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != buxVar3.C(cfyVar3) ? 2 : 4;
                    }
                    if (buxVar3.I((iIntValue & 19) != 18, iIntValue & 1)) {
                        final bym bymVar = bymVarA2;
                        final bym bymVar2 = bymVarA;
                        final nuo nuoVar3 = nuoVar;
                        final String str6 = str3;
                        final boolean z7 = z;
                        final boolean z8 = z2;
                        final String str7 = str;
                        final boolean z9 = z3;
                        final int i10 = i;
                        final afdr afdrVar5 = afdrVar4;
                        final GhIcon ghIcon7 = ghIcon5;
                        final GhIcon ghIcon8 = ghIcon6;
                        final String str8 = str5;
                        int i11 = iIntValue;
                        final boolean z10 = z6;
                        Object obj4 = afdrVar2;
                        long jG = kfn.i(buxVar3).G();
                        cct cctVarI = bxc.i(-247005030, true, new afeg() { // from class: nxz
                            @Override // defpackage.afeg
                            public final Object invoke(Object obj5, Object obj6) {
                                cct cctVarI2;
                                bcm bcmVarC2;
                                bux buxVar4 = (bux) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                int i12 = 2;
                                if (buxVar4.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                    String str9 = str6;
                                    boolean z11 = z7;
                                    boolean z12 = z8;
                                    String str10 = str7;
                                    int i13 = i10;
                                    String str11 = str8;
                                    cct cctVarI3 = bxc.i(1303709577, true, new nxy(str10, z12, z11, str9, i13, 0), buxVar4);
                                    cct cctVarI4 = null;
                                    if (str11 == null) {
                                        buxVar4.v(-1247223153);
                                        buxVar4.o();
                                        cctVarI2 = null;
                                    } else {
                                        buxVar4.v(-1247223152);
                                        cctVarI2 = bxc.i(1958535402, true, new njt(str11, 8), buxVar4);
                                        buxVar4.o();
                                    }
                                    GhIcon ghIcon9 = ghIcon7;
                                    GhIcon ghIcon10 = ghIcon8;
                                    if (ghIcon10 == null && ghIcon9 == null) {
                                        buxVar4.v(-1247125502);
                                    } else {
                                        nuo nuoVar4 = nuoVar3;
                                        buxVar4.v(-1247074724);
                                        cctVarI4 = bxc.i(2019508954, true, new nrb(ghIcon10, ghIcon9, nuoVar4, i12), buxVar4);
                                    }
                                    buxVar4.o();
                                    cct cctVar = cctVarI4;
                                    bym bymVar3 = bymVar2;
                                    if (z10) {
                                        float f = z9 ? ((dlj) bymVar3.a()).a : 8.0f;
                                        bcmVarC2 = bcr.c(f, 8.0f, 8.0f, f);
                                    } else {
                                        bcmVarC2 = bcr.c(((dlj) bymVar3.a()).a, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ((dlj) bymVar.a()).a);
                                    }
                                    mcd.f(cctVarI3, cctVarI2, cctVar, afdrVar5, null, i13, bcmVarC2, buxVar4, 6, 16);
                                } else {
                                    buxVar4.s();
                                }
                                return afak.a;
                            }
                        }, buxVar3);
                        boolean zC = buxVar3.C(obj4);
                        Object objG = buxVar3.g();
                        int i12 = 6;
                        if (zC || objG == buw.a) {
                            objG = new nxb(obj4, i12);
                            buxVar3.x(objG);
                        }
                        final int i13 = i9;
                        final boolean z11 = z5;
                        final List list2 = list;
                        afdr afdrVar6 = (afdr) objG;
                        boolean zD = buxVar3.D(z10) | buxVar3.E(list2) | buxVar3.D(z11) | buxVar3.A(i13);
                        Object objG2 = buxVar3.g();
                        if (zD || objG2 == buw.a) {
                            objG2 = new afec() { // from class: nya
                                @Override // defpackage.afec
                                public final Object invoke(Object obj5) {
                                    mcr mcrVar = (mcr) obj5;
                                    mcrVar.getClass();
                                    List list3 = list2;
                                    boolean z12 = z11;
                                    if (z10) {
                                        mcrVar.b(new cct(1061406804, true, new jtl(list3, z12, 5)));
                                    } else if (i13 > 0) {
                                        mcrVar.a(new cct(-725562009, true, new jtl(list3, z12, 6)));
                                    }
                                    return afak.a;
                                }
                            };
                            buxVar3.x(objG2);
                        }
                        mcd.g(cctVarI, afdrVar6, cfyVar3, 0, true, jG, bcmVarC, null, null, null, null, (afec) objG2, buxVar3, ((i11 << 6) & 896) | 24582, 0, 1928);
                    } else {
                        buxVar3.s();
                    }
                    return afak.a;
                }
            };
            buxVar2 = buxVarC;
            cct cctVarI = bxc.i(15515666, true, afehVar, buxVar2);
            nuoVar2 = nuoVar;
            if (nuoVar2 == nuo.k) {
                buxVar2.v(1751960974);
                ctp ctpVarB = atk.b(cfl.a, false);
                bvv bvvVar = (bvv) buxVar2;
                int iG = a.g(bvvVar.u);
                ccx ccxVarAh = bvvVar.ah();
                cfyVar2 = cfyVar;
                cfy cfyVarJ = bzi.j(buxVar2, cfyVar2);
                afdr afdrVar5 = cwb.a;
                buxVar2.w();
                if (bvvVar.t) {
                    buxVar2.j(afdrVar5);
                } else {
                    buxVar2.y();
                }
                byq.c(buxVar2, ctpVarB, cwb.e);
                byq.c(buxVar2, ccxVarAh, cwb.d);
                byq.c(buxVar2, Integer.valueOf(iG), cwb.f);
                byq.b(buxVar2, cwb.g);
                byq.c(buxVar2, cfyVarJ, cwb.c);
                atn atnVar = atn.a;
                cfv cfvVar = cfy.e;
                atk.c(lxr.t(atnVar.b(cfvVar), bcmVarC, buxVar2), buxVar2, 0);
                cctVarI.invoke(cfvVar, buxVar2, 54);
                bvvVar.Y(true);
                bvvVar.Y(false);
            } else {
                cfyVar2 = cfyVar;
                buxVar2.v(1752116098);
                cctVarI.invoke(cfyVar2, buxVar2, Integer.valueOf(((i8 >> 15) & 14) | 48));
                ((bvv) buxVar2).Y(false);
            }
        } else {
            cfyVar2 = cfyVar;
            buxVar2 = buxVarC;
            nuoVar2 = nuoVar;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            final cfy cfyVar3 = cfyVar2;
            bxfVarJ.c = new afeg() { // from class: nyd
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str6 = str;
                    String str7 = str2;
                    String str8 = str3;
                    GhIcon ghIcon7 = ghIcon;
                    GhIcon ghIcon8 = ghIcon2;
                    nuo nuoVar3 = nuoVar2;
                    afdr afdrVar6 = afdrVar;
                    afdr afdrVar7 = afdrVar2;
                    boolean z7 = z;
                    int i10 = i;
                    boolean z8 = z2;
                    List list2 = list;
                    int i11 = i2;
                    boolean z9 = z3;
                    int i12 = i3;
                    int i13 = i11 | 1;
                    int i14 = i12 & 306783378;
                    int i15 = i13 & 306783378;
                    boolean z10 = z5;
                    int i16 = i12 & 613566756;
                    int i17 = i13 & 613566756;
                    cfy cfyVar4 = cfyVar3;
                    mcd.G(str6, str7, str8, ghIcon7, ghIcon8, nuoVar3, afdrVar6, afdrVar7, z7, i10, z8, list2, z9, z4, z10, cfyVar4, (bux) obj, (i13 & (-920350135)) | i15 | (i17 >> 1) | ((i15 + i15) & i17), (i12 & (-920350135)) | i14 | (i16 >> 1) | ((i14 + i14) & i16));
                    return afak.a;
                }
            };
        }
    }

    public static final void H(PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                int i = nxw.s;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r33v5 */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.content.Context] */
    public static final void I(final nur nurVar, final boolean z, final boolean z2, final afdr afdrVar, final boolean z3, cfy cfyVar, bux buxVar, final int i) throws Resources.NotFoundException {
        int i2;
        boolean z4;
        boolean z5;
        bux buxVar2;
        final cfy cfyVar2;
        CharSequence string;
        boolean z6;
        ?? r33;
        String string2;
        afdrVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1332329806);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(nurVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z4 = z;
            i2 |= true != buxVarC.D(z4) ? 16 : 32;
        } else {
            z4 = z;
        }
        if ((i & 384) == 0) {
            z5 = z2;
            i2 |= true != buxVarC.D(z5) ? 128 : 256;
        } else {
            z5 = z2;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.D(z3) ? 8192 : 16384;
        }
        int i4 = i2 | 196608;
        if (buxVarC.I((74899 & i4) != 74898, i4 & 1)) {
            cfv cfvVar = cfy.e;
            ?? r9 = (Context) buxVarC.f(daa.b);
            CharSequence charSequence = nurVar.m;
            boolean z7 = nurVar.j;
            String string3 = charSequence.toString();
            if (z7) {
                string = nurVar.n;
                if (TextUtils.isEmpty(string)) {
                    z6 = z7;
                    r33 = 0;
                    long j = nurVar.i;
                    oni.b();
                    string = oni.a(r9, j);
                } else {
                    z6 = z7;
                    r33 = 0;
                    r33 = 0;
                    CharSequence charSequence2 = nurVar.o;
                    if (!TextUtils.isEmpty(charSequence2)) {
                        string = r9.getString(R.string.sender_and_body, new Object[]{charSequence2, string});
                    }
                }
            } else {
                string = nurVar.n;
                if (TextUtils.isEmpty(string)) {
                    z6 = z7;
                    string = null;
                } else {
                    z6 = z7;
                }
                r33 = 0;
            }
            String string4 = string != null ? string.toString() : null;
            long j2 = nurVar.i;
            oni.b();
            oit.a();
            long epochMilli = Instant.now().toEpochMilli() - j2;
            if (epochMilli < 60000) {
                string2 = r9.getString(R.string.now);
            } else if (epochMilli >= 86400000) {
                Resources resources = r9.getResources();
                Object[] objArr = new Object[1];
                objArr[r33] = Integer.valueOf((int) (epochMilli / 86400000));
                string2 = resources.getString(R.string.day, objArr);
            } else if (epochMilli >= 3600000) {
                Resources resources2 = r9.getResources();
                Object[] objArr2 = new Object[1];
                objArr2[r33] = Integer.valueOf((int) (epochMilli / 3600000));
                string2 = resources2.getString(R.string.hour, objArr2);
            } else {
                Resources resources3 = r9.getResources();
                Object[] objArr3 = new Object[1];
                objArr3[r33] = Integer.valueOf((int) (epochMilli / 60000));
                string2 = resources3.getString(R.string.minute, objArr3);
            }
            string2.getClass();
            Object[] objArr4 = new Object[1];
            objArr4[r33] = string2;
            String strF = vq.f(R.string.notification_time_stamp, objArr4, buxVarC);
            GhIcon ghIcon = nurVar.d;
            GhIcon ghIcon2 = nurVar.b;
            String str = string4;
            nuo nuoVar = nurVar.x;
            nuoVar.getClass();
            boolean zE = buxVarC.E(nurVar);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                objS = new nxb(nurVar, 7);
                bvvVar.ad(objS);
            }
            afdr afdrVar2 = (afdr) objS;
            boolean z8 = (nuoVar == nuo.h && z6) ? true : r33;
            int i5 = nurVar.E;
            boolean z9 = nurVar.C;
            nul[] nulVarArr = new nul[3];
            nulVarArr[r33] = nurVar.p;
            nulVarArr[1] = nurVar.q;
            nulVarArr[2] = nurVar.r;
            buxVar2 = buxVarC;
            G(string3, str, strF, ghIcon, ghIcon2, nuoVar, afdrVar2, afdrVar, z8, i5, z9, woy.bi(nulVarArr), z4, z5, z3, cfvVar, buxVar2, (i4 << 12) & 29360128, ((i4 << 3) & 8064) | (i4 & 57344) | (i4 & 458752));
            cfyVar2 = cfvVar;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: nyb
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                    bux buxVar3 = (bux) obj;
                    ((Integer) obj2).intValue();
                    nur nurVar2 = nurVar;
                    boolean z10 = z;
                    int i6 = i | 1;
                    int i7 = 306783378 & i6;
                    int i8 = 613566756 & i6;
                    mcd.I(nurVar2, z10, z2, afdrVar, z3, cfyVar2, buxVar3, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8));
                    return afak.a;
                }
            };
        }
    }

    public static void J(nwr nwrVar, yzy yzyVar) {
        int i = nwrVar.m == null ? 0 : 1;
        int i2 = nwrVar.n == null ? 0 : 1;
        int i3 = nwrVar.o == null ? 0 : 1;
        int i4 = nwrVar.p != null ? 1 : 0;
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.SYSTEM_UI_NOTIFICATION, yzyVar);
        nwq nwqVar = nwrVar.h;
        String str = nwqVar.b;
        rrbVarH.p(new ComponentName(str, ""));
        abnp abnpVarE = rrbVarH.E();
        abnpVarE.t();
        yza yzaVar = (yza) abnpVarE.b;
        yza yzaVar2 = yza.a;
        yzaVar.b |= 4;
        yzaVar.e = i + i2 + i3 + i4;
        abnpVarE.t();
        yza yzaVar3 = (yza) abnpVarE.b;
        str.getClass();
        yzaVar3.b |= 1;
        yzaVar3.c = str;
        int iA = nwqVar.c.a();
        abnpVarE.t();
        yza yzaVar4 = (yza) abnpVarE.b;
        yzaVar4.d = iA - 1;
        yzaVar4.b |= 2;
        long j = nwqVar.d;
        abnpVarE.t();
        yza yzaVar5 = (yza) abnpVarE.b;
        yzaVar5.b |= 8;
        yzaVar5.f = j;
        boolean z = nwqVar.e;
        abnpVarE.t();
        yza yzaVar6 = (yza) abnpVarE.b;
        yzaVar6.b |= 16;
        yzaVar6.g = z;
        ebf.j().f(rrbVarH);
    }

    public static final long a(StatusBarNotification statusBarNotification) {
        String tag = statusBarNotification.getTag();
        int id = statusBarNotification.getId();
        String packageName = statusBarNotification.getPackageName();
        String string = statusBarNotification.getUser().toString();
        return (tag + id + packageName + string).hashCode();
    }

    public static void b() {
    }

    public static final cil d(bwq bwqVar) {
        return (cil) bwqVar.a();
    }

    public static final void e(int i, cfy cfyVar, mce mceVar, bux buxVar, int i2, int i3) {
        int i4;
        int i5 = i2 & 6;
        bux buxVarC = buxVar.c(-288159688);
        if (i5 == 0) {
            i4 = (true != buxVarC.A(i) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        int i7 = i4 | 384;
        if (buxVarC.I((i7 & 147) != 146, i7 & 1)) {
            if (i6 != 0) {
                cfyVar = cfy.e;
            }
            mceVar = mce.b;
            bmm.a(awd.k(cfyVar, i <= 9 ? mceVar.d : mceVar.e, mceVar.c), ksp.j(krr.i, buxVarC), ksp.j(krr.j, buxVarC), bxc.i(474770917, true, new fun(i <= 9 ? String.valueOf(i) : "9+", mceVar, 19), buxVarC), buxVarC, 3072);
        } else {
            buxVarC.s();
        }
        cfy cfyVar2 = cfyVar;
        mce mceVar2 = mceVar;
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mcp(i, cfyVar2, mceVar2, i2, i3, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.afeh r27, defpackage.afeh r28, defpackage.afeg r29, defpackage.afdr r30, defpackage.cfy r31, int r32, defpackage.ckv r33, defpackage.bux r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mcd.f(afeh, afeh, afeg, afdr, cfy, int, ckv, bux, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final defpackage.afeg r36, final defpackage.afdr r37, defpackage.cfy r38, int r39, boolean r40, long r41, defpackage.ckv r43, defpackage.cil r44, defpackage.afdr r45, defpackage.cil r46, defpackage.afdr r47, defpackage.afec r48, defpackage.bux r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mcd.g(afeg, afdr, cfy, int, boolean, long, ckv, cil, afdr, cil, afdr, afec, bux, int, int, int):void");
    }

    public static final cfy h(cfy cfyVar, long j, float f, ckv ckvVar) {
        return !a.j(j, cjn.i(0)) ? asl.H(bxc.p(ebj.m(cfyVar, f), new fzr(j, ckvVar, 2)), f) : cfyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0253 A[PHI: r42
  0x0253: PHI (r42v3 int) = (r42v1 int), (r42v4 int), (r42v4 int) binds: [B:170:0x023a, B:178:0x0251, B:174:0x0245] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final defpackage.afeh r31, final com.google.android.apps.auto.components.graphics.icon.GhIcon r32, defpackage.cfy r33, defpackage.ckv r34, float r35, long r36, long r38, long r40, boolean r42, long r43, boolean r45, defpackage.bux r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 1228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mcd.i(afeh, com.google.android.apps.auto.components.graphics.icon.GhIcon, cfy, ckv, float, long, long, long, boolean, long, boolean, bux, int, int, int):void");
    }

    public static /* synthetic */ afak j(afeh afehVar, long j, ckv ckvVar, bux buxVar, int i) {
        if (buxVar.I((i & 3) != 2, i & 1)) {
            afehVar.invoke(awd.c(cjn.g(h(cfy.e, j, 4.0f, ckvVar), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ckvVar, true, 0, 1042431), 1.0f), buxVar, 0);
        } else {
            buxVar.s();
        }
        return afak.a;
    }

    public static final void k(final GhIcon ghIcon, final GhIcon ghIcon2, cfy cfyVar, final boolean z, float f, long j, long j2, long j3, bux buxVar, final int i) {
        int i2;
        bux buxVar2;
        final cfy cfyVar2;
        final float f2;
        final long j4;
        final long j5;
        final long j6;
        long jA;
        long jZ;
        cfy cfyVar3;
        long j7;
        float f3;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1962549138);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(ghIcon) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(ghIcon2) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= true != buxVarC.D(z) ? 1024 : 2048;
        }
        int i5 = i4 | 24576;
        if ((196608 & i) == 0) {
            i5 = i4 | 90112;
        }
        if ((1572864 & i) == 0) {
            i5 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        if (buxVarC.I((4793491 & i5) != 4793490, i5 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            cct cctVarI = null;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                cfv cfvVar = cfy.e;
                long jF = kfn.i(buxVarC).F();
                jA = ksp.a(kfn.i(buxVarC), jF);
                jZ = kfn.i(buxVarC).z();
                cfyVar3 = cfvVar;
                j7 = jF;
                f3 = 24.0f;
            } else {
                buxVarC.s();
                cfyVar3 = cfyVar;
                f3 = f;
                j7 = j;
                jA = j2;
                jZ = j3;
            }
            buxVarC.l();
            if (ghIcon == null) {
                buxVarC.v(-1087929762);
            } else {
                buxVarC.v(-1087901831);
                cctVarI = bxc.i(2011136488, true, new kkw(ghIcon, 14), buxVarC);
            }
            bvvVar.Y(false);
            buxVar2 = buxVarC;
            i(cctVarI, ghIcon2, cfyVar3, (!z || ghIcon == null || ghIcon.b == 7) ? bcr.a : ckq.a, f3, j7, jA, jZ, false, 0L, false, buxVar2, i5 & 58352, 0, 1792);
            cfyVar2 = cfyVar3;
            f2 = f3;
            j4 = j7;
            j5 = jA;
            j6 = jZ;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            cfyVar2 = cfyVar;
            f2 = f;
            j4 = j;
            j5 = j2;
            j6 = j3;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: mci
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    GhIcon ghIcon3 = ghIcon;
                    GhIcon ghIcon4 = ghIcon2;
                    cfy cfyVar4 = cfyVar2;
                    boolean z2 = z;
                    int i6 = i;
                    int i7 = i6 | 1;
                    int i8 = 306783378 & i7;
                    int i9 = i8 + i8;
                    int i10 = 613566756 & i7;
                    mcd.k(ghIcon3, ghIcon4, cfyVar4, z2, f2, j4, j5, j6, (bux) obj, i8 | (i10 >> 1) | (i7 & (-920350135)) | (i9 & i10));
                    return afak.a;
                }
            };
        }
    }

    public static final int l(abzy abzyVar) {
        return abzyVar.a.a(85);
    }

    public static final int m(bbt bbtVar, int i) {
        bbtVar.getClass();
        return bbtVar.j() - n(bbtVar.j(), i);
    }

    public static final int n(int i, int i2) {
        if (!lmi.a.a().c() && !lec.a.a().f()) {
            return i;
        }
        int i3 = i % i2;
        return i3 + (i2 & (((i3 ^ i2) & ((-i3) | i3)) >> 31));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0116  */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [aes, aew] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final defpackage.atm r30, final boolean r31, final defpackage.bbt r32, defpackage.cfy r33, boolean r34, long r35, long r37, boolean r39, int r40, boolean r41, defpackage.cil r42, defpackage.afec r43, defpackage.bux r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mcd.o(atm, boolean, bbt, cfy, boolean, long, long, boolean, int, boolean, cil, afec, bux, int, int, int):void");
    }

    public static final void p(bbt bbtVar, int i, float f, float f2, long j, long j2, afec afecVar, bux buxVar, int i2) {
        bbt bbtVar2;
        int i3;
        float f3;
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(331043297);
        if (i4 == 0) {
            bbtVar2 = bbtVar;
            i3 = (true != buxVarC.C(bbtVar2) ? 2 : 4) | i2;
        } else {
            bbtVar2 = bbtVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.A(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != buxVarC.z(f) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            f3 = f2;
            i3 |= true != buxVarC.z(f3) ? 1024 : 2048;
        } else {
            f3 = f2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != buxVarC.B(j) ? 8192 : 16384;
        }
        long j3 = j2;
        if ((196608 & i2) == 0) {
            i3 |= true != buxVarC.B(j3) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != buxVarC.E(afecVar) ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i3) != 599186, i3 & 1)) {
            int iN = n(n(bbtVar2.j(), i) + afgi.k(bbtVar2.c()), i);
            cfv cfvVar = cfy.e;
            cfy cfyVarI = asl.I(cfvVar, y(), afecVar != null ? 4.0f : y());
            ctp ctpVarA = avv.a(atd.g(f3), cfl.n, buxVarC, 48);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarI);
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
            buxVarC.v(31475383);
            int i5 = 0;
            while (i5 < i) {
                if (i5 == iN) {
                    j3 = j;
                }
                bym bymVarA = adc.a(j3, null, buxVarC, 0, 14);
                Integer num = afecVar != null ? (Integer) afecVar.invoke(Integer.valueOf(i5)) : null;
                if (num != null) {
                    buxVarC.v(-1157834391);
                    t(num.intValue(), ((cjv) bymVarA.a()).a, buxVarC, 0);
                    bvvVar.Y(false);
                } else {
                    buxVarC.v(-1157783799);
                    atk.c(afp.E(awd.i(cfvVar, f), ((cjv) bymVarA.a()).a, bcr.a), buxVarC, 0);
                    bvvVar.Y(false);
                }
                i5++;
                j3 = j2;
            }
            bvvVar.Y(false);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mwf(bbtVar, i, f, f2, j, j2, afecVar, i2, 0);
        }
    }

    public static final void q(bbt bbtVar, int i, float f, float f2, long j, long j2, afec afecVar, bux buxVar, int i2) {
        bbt bbtVar2;
        int i3;
        float f3;
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(-831148429);
        if (i4 == 0) {
            bbtVar2 = bbtVar;
            i3 = (true != buxVarC.C(bbtVar2) ? 2 : 4) | i2;
        } else {
            bbtVar2 = bbtVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.A(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != buxVarC.z(f) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            f3 = f2;
            i3 |= true != buxVarC.z(f3) ? 1024 : 2048;
        } else {
            f3 = f2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != buxVarC.B(j) ? 8192 : 16384;
        }
        long j3 = j2;
        if ((196608 & i2) == 0) {
            i3 |= true != buxVarC.B(j3) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != buxVarC.E(afecVar) ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i3) != 599186, i3 & 1)) {
            int iN = n(n(bbtVar2.j(), i) + afgi.k(bbtVar2.c()), i);
            cfv cfvVar = cfy.e;
            cfy cfyVarI = asl.I(cfvVar, afecVar != null ? 4.0f : y(), y());
            ctp ctpVarA = atp.a(atd.g(f3), cfl.k, buxVarC, 48);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarI);
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
            buxVarC.v(-1812812809);
            int i5 = 0;
            while (i5 < i) {
                if (i5 == iN) {
                    j3 = j;
                }
                bym bymVarA = adc.a(j3, null, buxVarC, 0, 14);
                Integer num = afecVar != null ? (Integer) afecVar.invoke(Integer.valueOf(i5)) : null;
                if (num != null) {
                    buxVarC.v(39633961);
                    t(num.intValue(), ((cjv) bymVarA.a()).a, buxVarC, 0);
                    bvvVar.Y(false);
                } else {
                    buxVarC.v(39684553);
                    atk.c(afp.E(awd.i(cfvVar, f), ((cjv) bymVarA.a()).a, bcr.a), buxVarC, 0);
                    bvvVar.Y(false);
                }
                i5++;
                j3 = j2;
            }
            bvvVar.Y(false);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mwf(bbtVar, i, f, f2, j, j2, afecVar, i2, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final void r(bbt bbtVar, int i, float f, float f2, long j, long j2, bux buxVar, int i2) {
        bbt bbtVar2;
        int i3;
        bux buxVar2;
        ?? r0;
        float f3 = f;
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(-117275134);
        if (i4 == 0) {
            bbtVar2 = bbtVar;
            i3 = (true != buxVarC.C(bbtVar2) ? 2 : 4) | i2;
        } else {
            bbtVar2 = bbtVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.A(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != buxVarC.z(f3) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != buxVarC.z(f2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != buxVarC.B(j) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != buxVarC.B(j2) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i3) != 74898, i3 & 1)) {
            double dJ = bbtVar2.j() + bbtVar2.c();
            double dFloor = Math.floor(dJ);
            float f4 = f3 + f2 + BitmapDescriptorFactory.HUE_RED;
            bym bymVarA = ady.a((((float) dFloor) * f4) + BitmapDescriptorFactory.HUE_RED, null, null, null, buxVarC, 0, 14);
            bym bymVarA2 = ady.a((f4 * ((float) Math.ceil(dJ))) + BitmapDescriptorFactory.HUE_RED + f + BitmapDescriptorFactory.HUE_RED, null, null, null, buxVarC, 0, 14);
            buxVar2 = buxVarC;
            cfv cfvVar = cfy.e;
            cfy cfyVarH = asl.H(cfvVar, y());
            boolean zC = ((57344 & i3) == 16384) | buxVar2.C(bymVarA) | buxVar2.C(bymVarA2);
            boolean z = (i3 & 896) == 256;
            bvv bvvVar = (bvv) buxVar2;
            Object objS = bvvVar.S();
            if ((zC || z) || objS == buw.a) {
                r0 = 0;
                f3 = f;
                mwk mwkVar = new mwk(j, f3, bymVarA, bymVarA2, 1);
                bvvVar.ad(mwkVar);
                objS = mwkVar;
            } else {
                f3 = f;
                r0 = 0;
            }
            cfy cfyVarR = bxc.r(cfyVarH, (afec) objS);
            ctp ctpVarA = avv.a(atd.g(f2), cfl.m, buxVar2, r0);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVar2, cfyVarR);
            afdr afdrVar = cwb.a;
            buxVar2.w();
            if (bvvVar.t) {
                buxVar2.j(afdrVar);
            } else {
                buxVar2.y();
            }
            byq.c(buxVar2, ctpVarA, cwb.e);
            byq.c(buxVar2, ccxVarAh, cwb.d);
            byq.c(buxVar2, Integer.valueOf(iG), cwb.f);
            byq.b(buxVar2, cwb.g);
            byq.c(buxVar2, cfyVarJ, cwb.c);
            buxVar2.v(-1621264389);
            for (int i5 = r0; i5 < i; i5++) {
                atk.c(afp.E(awd.i(cfvVar, f3), j2, bcr.a), buxVar2, r0);
            }
            bvvVar.Y(r0);
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mwe(bbtVar, i, f3, f2, j, j2, i2, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final void s(bbt bbtVar, int i, float f, float f2, long j, long j2, bux buxVar, int i2) {
        bbt bbtVar2;
        int i3;
        bux buxVar2;
        ?? r0;
        float f3 = f;
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(-1870639596);
        if (i4 == 0) {
            bbtVar2 = bbtVar;
            i3 = (true != buxVarC.C(bbtVar2) ? 2 : 4) | i2;
        } else {
            bbtVar2 = bbtVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.A(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != buxVarC.z(f3) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != buxVarC.z(f2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != buxVarC.B(j) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != buxVarC.B(j2) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i3) != 74898, i3 & 1)) {
            double dJ = bbtVar2.j() + bbtVar2.c();
            double dFloor = Math.floor(dJ);
            float f4 = f3 + f2 + BitmapDescriptorFactory.HUE_RED;
            bym bymVarA = ady.a((((float) dFloor) * f4) + BitmapDescriptorFactory.HUE_RED, null, null, null, buxVarC, 0, 14);
            bym bymVarA2 = ady.a((f4 * ((float) Math.ceil(dJ))) + BitmapDescriptorFactory.HUE_RED + f + BitmapDescriptorFactory.HUE_RED, null, null, null, buxVarC, 0, 14);
            buxVar2 = buxVarC;
            cfv cfvVar = cfy.e;
            cfy cfyVarH = asl.H(cfvVar, y());
            boolean zC = ((57344 & i3) == 16384) | buxVar2.C(bymVarA) | ((i3 & 896) == 256) | buxVar2.C(bymVarA2);
            bvv bvvVar = (bvv) buxVar2;
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                r0 = 0;
                f3 = f;
                mwk mwkVar = new mwk(j, f3, bymVarA, bymVarA2, 0);
                bvvVar.ad(mwkVar);
                objS = mwkVar;
            } else {
                f3 = f;
                r0 = 0;
            }
            cfy cfyVarR = bxc.r(cfyVarH, (afec) objS);
            ctp ctpVarA = atp.a(atd.g(f2), cfl.j, buxVar2, r0);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVar2, cfyVarR);
            afdr afdrVar = cwb.a;
            buxVar2.w();
            if (bvvVar.t) {
                buxVar2.j(afdrVar);
            } else {
                buxVar2.y();
            }
            byq.c(buxVar2, ctpVarA, cwb.e);
            byq.c(buxVar2, ccxVarAh, cwb.d);
            byq.c(buxVar2, Integer.valueOf(iG), cwb.f);
            byq.b(buxVar2, cwb.g);
            byq.c(buxVar2, cfyVarJ, cwb.c);
            buxVar2.v(-1242336609);
            for (int i5 = r0; i5 < i; i5++) {
                atk.c(afp.E(awd.i(cfvVar, f3), j2, bcr.a), buxVar2, r0);
            }
            bvvVar.Y(r0);
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mwe(bbtVar, i, f3, f2, j, j2, i2, 2);
        }
    }

    public static final void t(final int i, final long j, bux buxVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(1598031840);
        if (i4 == 0) {
            i3 = (true != buxVarC.A(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.B(j) ? 16 : 32;
        }
        if (buxVarC.I((i3 & 19) != 18, i3 & 1)) {
            ca.bb(dao.b(i, buxVarC, i3 & 14), null, awd.i(cfy.e, 16.0f), null, csh.b, BitmapDescriptorFactory.HUE_RED, new cjp(j, 5), buxVarC, 25016, 40);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: mwd
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i2 | 1;
                    int i6 = 306783378 & i5;
                    int i7 = 613566756 & i5;
                    mcd.t(i, j, (bux) obj, (i7 >> 1) | i6 | (i5 & (-920350135)) | ((i6 + i6) & i7));
                    return afak.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(final boolean r19, final defpackage.bbt r20, final defpackage.cfy r21, float r22, defpackage.arn r23, final defpackage.afei r24, defpackage.bux r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mcd.u(boolean, bbt, cfy, float, arn, afei, bux, int, int):void");
    }

    public static final void v(final bbt bbtVar, final cfy cfyVar, final boolean z, final long j, final long j2, final boolean z2, float f, float f2, float f3, final int i, final boolean z3, final afec afecVar, bux buxVar, final int i2, final int i3) {
        int i4;
        int i5;
        bux buxVar2;
        final float f4;
        final float f5;
        final float f6;
        float fW;
        float f7;
        float fX;
        float f8;
        boolean z4;
        int i6 = i2 & 6;
        bux buxVarC = buxVar.c(718590301);
        if (i6 == 0) {
            i4 = (true != buxVarC.C(bbtVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != buxVarC.B(j) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != buxVarC.B(j2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != buxVarC.D(z2) ? 65536 : 131072;
        }
        int i7 = i4 | 1572864;
        if ((12582912 & i2) == 0) {
            i7 = i4 | 5767168;
        }
        if ((100663296 & i2) == 0) {
            i7 |= 33554432;
        }
        if ((805306368 & i2) == 0) {
            i7 |= true != buxVarC.A(i) ? 268435456 : 536870912;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (true != buxVarC.D(z3) ? 2 : 4);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true == buxVarC.E(afecVar) ? 32 : 16;
        }
        if (buxVarC.I(((i7 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true, i7 & 1)) {
            int i8 = i7 >> 24;
            int i9 = i7 & (-264241153);
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i2 & 1) == 0 || buxVarC.F()) {
                fW = w();
                f7 = 0.32f;
                fX = x();
            } else {
                buxVarC.s();
                f7 = f;
                fW = f2;
                fX = f3;
            }
            int i10 = i9 << 3;
            int i11 = i8 & 112;
            int i12 = i7 & 14;
            buxVarC.l();
            int i13 = i5;
            long jH = cjv.h(j, f7);
            cfy cfyVarA = z2 ? cfyVar.a(new aix(j2, ckq.a)) : cfyVar;
            ctp ctpVarB = atk.b(cfl.e, false);
            float f9 = f7;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarA);
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
            boolean z5 = z3 || afecVar != null;
            int i14 = i10 & 57344;
            int i15 = i12 | i11;
            if (z5 && z) {
                buxVarC.v(-428434216);
                z4 = true;
                f8 = f9;
                q(bbtVar, i, fW, fX, j, jH, afecVar, buxVarC, i14 | i15 | ((i13 << 15) & 3670016));
                buxVar2 = buxVarC;
                bvvVar.Y(false);
            } else {
                f8 = f9;
                buxVar2 = buxVarC;
                if (z5) {
                    buxVar2.v(-428194090);
                    z4 = true;
                    p(bbtVar, i, fW, fX, j, jH, afecVar, buxVar2, i14 | i15 | ((i13 << 15) & 3670016));
                    buxVar2 = buxVar2;
                    bvvVar.Y(false);
                } else {
                    z4 = true;
                    if (z) {
                        buxVar2.v(-427976811);
                        s(bbtVar, i, fW, fX, j, jH, buxVar2, i15 | i14);
                        bvvVar.Y(false);
                    } else {
                        buxVar2.v(-427856717);
                        r(bbtVar, i, fW, fX, j, jH, buxVar2, i15 | i14);
                        bvvVar.Y(false);
                    }
                }
            }
            bvvVar.Y(z4);
            f5 = fW;
            f6 = fX;
            f4 = f8;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            f4 = f;
            f5 = f2;
            f6 = f3;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: mwh
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bbt bbtVar2 = bbtVar;
                    cfy cfyVar2 = cfyVar;
                    boolean z6 = z;
                    long j3 = j;
                    long j4 = j2;
                    boolean z7 = z2;
                    float f10 = f4;
                    float f11 = f5;
                    int i16 = i2;
                    float f12 = f6;
                    int i17 = i3;
                    int i18 = i16 | 1;
                    int i19 = i17 & 306783378;
                    int i20 = i18 & 306783378;
                    boolean z8 = z3;
                    int i21 = i17 & 613566756;
                    int i22 = i18 & 613566756;
                    afec afecVar2 = afecVar;
                    mcd.v(bbtVar2, cfyVar2, z6, j3, j4, z7, f10, f11, f12, i, z8, afecVar2, (bux) obj, (i18 & (-920350135)) | i20 | (i22 >> 1) | ((i20 + i20) & i22), (i17 & (-920350135)) | i19 | (i21 >> 1) | ((i19 + i19) & i21));
                    return afak.a;
                }
            };
        }
    }

    public static final float w() {
        return lec.a.a().f() ? 8.0f : 10.0f;
    }

    public static final float x() {
        return lec.a.a().f() ? 4.0f : 8.0f;
    }

    public static final float y() {
        return lec.a.a().f() ? 8.0f : 10.0f;
    }

    public static final boolean z(float f, float f2) {
        if (dlj.a(f, 304.0f) >= 0) {
            if (dlj.a(f2, true != ldz.a.a().b() ? 190.0f : 180.0f) >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(final java.lang.String r32, defpackage.cfy r33, com.google.android.apps.auto.components.graphics.icon.GhIcon r34, long r35, defpackage.bux r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mcd.c(java.lang.String, cfy, com.google.android.apps.auto.components.graphics.icon.GhIcon, long, bux, int, int):void");
    }
}
