package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vry {
    public final vrw a;
    public final aezk b;
    public final vyj c;
    public final aezk d;
    public final ackk e;
    private final vll f;
    private final Executor g;

    /* JADX WARN: Type inference failed for: r11v15, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [aezk, java.lang.Object] */
    public vry(vrw vrwVar, aezk aezkVar, vll vllVar, rdx rdxVar, aezk aezkVar2, Executor executor, ackk ackkVar, aezk aezkVar3) {
        this.a = vrwVar;
        this.f = vllVar;
        this.b = aezkVar;
        this.g = executor;
        this.d = new vwj(aezkVar2, 1);
        Context context = (Context) ((acks) rdxVar.a).b;
        context.getClass();
        Executor executor2 = (Executor) rdxVar.d.a();
        executor2.getClass();
        vyl vylVar = (vyl) rdxVar.e.a();
        vylVar.getClass();
        Boolean bool = (Boolean) rdxVar.b.a();
        bool.getClass();
        boolean zBooleanValue = bool.booleanValue();
        xxh xxhVar = (xxh) ((acks) rdxVar.f).b;
        xxhVar.getClass();
        this.c = new vyj(context, executor2, vylVar, ackkVar, zBooleanValue, xxhVar, aezkVar3, (zgh) rdxVar.c.a());
        this.e = ackkVar;
    }

    public final zgp a(final vru vruVar) {
        if (this.f.a) {
            zgk zgkVar = zgk.a;
            return zgkVar != null ? zgkVar : new zgk();
        }
        zfj zfjVar = new zfj() { // from class: vrx
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, xyc] */
            /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, xyc] */
            /* JADX WARN: Type inference failed for: r12v53, types: [aezk, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r12v57, types: [aezk, java.lang.Object] */
            @Override // defpackage.zfj
            public final zgp a() throws NoSuchAlgorithmException {
                ajfz ajfzVarB;
                String strB;
                RuntimeException runtimeException;
                boolean z;
                int i;
                int i2;
                int i3;
                boolean z2;
                long j;
                ArrayList arrayList;
                vru vruVar2 = vruVar;
                boolean z3 = vruVar2.g;
                vry vryVar = this.a;
                if (z3) {
                    abnp abnpVarN = ajfz.a.n();
                    abnpVarN.t();
                    ajfz ajfzVar = (ajfz) abnpVarN.b;
                    ajfzVar.e = 2;
                    ajfzVar.b |= 2;
                    ajfzVarB = (ajfz) abnpVarN.q();
                } else {
                    vyk vykVar = vruVar2.f;
                    vyj vyjVar = vryVar.c;
                    boolean z4 = vyjVar.b;
                    vym vymVar = vyjVar.a;
                    ajfzVarB = z4 ? vymVar.b(vykVar) : vymVar.e();
                }
                int i4 = vruVar2.m;
                char c = 65535;
                if (i4 != 0) {
                    abnp abnpVarK = ajfzVarB.K();
                    abnpVarK.t();
                    ajfz ajfzVar2 = (ajfz) abnpVarK.b;
                    ajfzVar2.e = i4 - 1;
                    ajfzVar2.b |= 2;
                    ajfzVarB = (ajfz) abnpVarK.q();
                }
                vyk vykVar2 = vyk.a;
                if (ajfzVarB.c != 2 || ((Integer) ajfzVarB.d).intValue() != -1) {
                    char c2 = 4;
                    if ((ajfzVarB.c == 4 ? (ajfy) ajfzVarB.d : ajfy.a).c != -1) {
                        vsb vsbVar = (vsb) vryVar.b.a();
                        ajgu ajguVar = vruVar2.c;
                        abnp abnpVarK2 = ajguVar.K();
                        abnp abnpVarN2 = ajgc.a.n();
                        int i5 = vsbVar.l;
                        abnpVarN2.t();
                        ajgc ajgcVar = (ajgc) abnpVarN2.b;
                        ajgcVar.e = i5 - 1;
                        ajgcVar.b |= 4;
                        String str = vsbVar.b;
                        boolean z5 = true;
                        if (str != null) {
                            abnpVarN2.t();
                            ajgc ajgcVar2 = (ajgc) abnpVarN2.b;
                            ajgcVar2.b |= 1;
                            ajgcVar2.c = str;
                        }
                        abnpVarN2.t();
                        ajgc ajgcVar3 = (ajgc) abnpVarN2.b;
                        ajgcVar3.b |= 8;
                        ajgcVar3.f = 959816797L;
                        String str2 = vsbVar.d;
                        if (str2 != null) {
                            abnpVarN2.t();
                            ajgc ajgcVar4 = (ajgc) abnpVarN2.b;
                            ajgcVar4.b |= 2;
                            ajgcVar4.d = str2;
                        }
                        ajfe ajfeVar = ajguVar.f;
                        if (ajfeVar == null) {
                            ajfeVar = ajfe.a;
                        }
                        ajfx ajfxVar = ajfeVar.d;
                        if (ajfxVar == null) {
                            ajfxVar = ajfx.a;
                        }
                        ajfw ajfwVar = ajfxVar.c;
                        if (ajfwVar == null) {
                            ajfwVar = ajfw.a;
                        }
                        if ((ajfwVar.b & 8) == 0 || !((Boolean) vsbVar.g.a()).booleanValue()) {
                            strB = vsbVar.c;
                        } else {
                            ajfe ajfeVar2 = ajguVar.f;
                            if (ajfeVar2 == null) {
                                ajfeVar2 = ajfe.a;
                            }
                            ajfx ajfxVar2 = ajfeVar2.d;
                            if (ajfxVar2 == null) {
                                ajfxVar2 = ajfx.a;
                            }
                            ajfw ajfwVar2 = ajfxVar2.c;
                            if (ajfwVar2 == null) {
                                ajfwVar2 = ajfw.a;
                            }
                            strB = vqs.b(str, ajfwVar2.f);
                        }
                        if (strB != null) {
                            abnpVarN2.t();
                            ajgc ajgcVar5 = (ajgc) abnpVarN2.b;
                            ajgcVar5.b |= 16;
                            ajgcVar5.g = strB;
                        }
                        oit oitVar = vsbVar.m;
                        int i6 = ajguVar.b;
                        if ((i6 & 64) != 0 || (((i6 & 65536) != 0 && ((Boolean) oitVar.a.a()).booleanValue()) || ((Boolean) oitVar.b.a()).booleanValue())) {
                            xxh xxhVar = (xxh) ((rob) oitVar.c).a.gu();
                            if (xxhVar.f()) {
                                String str3 = (String) xxhVar.b();
                                if (str3.equals("com.android.vending")) {
                                    abnpVarN2.t();
                                    ajgc ajgcVar6 = (ajgc) abnpVarN2.b;
                                    ajgcVar6.b |= 64;
                                    ajgcVar6.h = true;
                                } else {
                                    abnpVarN2.t();
                                    ajgc ajgcVar7 = (ajgc) abnpVarN2.b;
                                    ajgcVar7.b |= 128;
                                    ajgcVar7.i = str3;
                                }
                            }
                        }
                        abnpVarK2.t();
                        ajgu ajguVar2 = (ajgu) abnpVarK2.b;
                        ajgc ajgcVar8 = (ajgc) abnpVarN2.q();
                        ajgcVar8.getClass();
                        ajguVar2.z = ajgcVar8;
                        ajguVar2.b |= 4194304;
                        if (tmz.e(vsbVar.a)) {
                            abnp abnpVarN3 = ajgj.a.n();
                            long freeSpace = vsbVar.e.a().getFreeSpace() / 1024;
                            abnpVarN3.t();
                            ajgj ajgjVar = (ajgj) abnpVarN3.b;
                            ajgjVar.b |= 1;
                            ajgjVar.c = freeSpace;
                            long jLongValue = ((Long) vsbVar.f.gu()).longValue();
                            abnpVarN3.t();
                            ajgj ajgjVar2 = (ajgj) abnpVarN3.b;
                            ajgjVar2.b |= 2;
                            ajgjVar2.d = jLongValue;
                            abnpVarK2.t();
                            ajgu ajguVar3 = (ajgu) abnpVarK2.b;
                            ajgj ajgjVar3 = (ajgj) abnpVarN3.q();
                            ajgjVar3.getClass();
                            ajguVar3.B = ajgjVar3;
                            ajguVar3.b |= 16777216;
                        }
                        RuntimeException runtimeException2 = null;
                        int i7 = 67108864;
                        if (!TextUtils.isEmpty(null)) {
                            ajgb ajgbVar = ajguVar.D;
                            if (ajgbVar == null) {
                                ajgbVar = ajgb.a;
                            }
                            abnp abnpVarK3 = ajgbVar.K();
                            if (((ajgb) abnpVarK3.b).c.isEmpty()) {
                                abnpVarK3.t();
                                throw null;
                            }
                            String str4 = ((String) null) + "::" + ((ajgb) abnpVarK3.b).c;
                            abnpVarK3.t();
                            ajgb ajgbVar2 = (ajgb) abnpVarK3.b;
                            ajgbVar2.b |= 1;
                            ajgbVar2.c = str4;
                            abnpVarK2.t();
                            ajgu ajguVar4 = (ajgu) abnpVarK2.b;
                            ajgb ajgbVar3 = (ajgb) abnpVarK3.q();
                            ajgbVar3.getClass();
                            ajguVar4.D = ajgbVar3;
                            ajguVar4.b |= 67108864;
                        }
                        vpn vpnVar = vruVar2.k;
                        if (vpnVar == null || !vsbVar.h.f()) {
                            runtimeException = null;
                            z = true;
                            i = 67108864;
                        } else {
                            int i8 = vruVar2.l;
                            ArrayList arrayList2 = new ArrayList();
                            int i9 = 0;
                            while (true) {
                                vpo[] vpoVarArr = vpnVar.b;
                                char c3 = c;
                                if (i9 >= vpoVarArr.length) {
                                    break;
                                }
                                vpl[] vplVarArrB = vpoVarArr[i9].b(vpnVar.c[i9], i8);
                                int length = vplVarArrB.length;
                                char c4 = c2;
                                int i10 = 0;
                                while (i10 < length) {
                                    arrayList2.add(new acjs(vplVarArrB[i10], i9));
                                    i10++;
                                    runtimeException2 = runtimeException2;
                                    i7 = i7;
                                }
                                i9++;
                                c = c3;
                                c2 = c4;
                            }
                            runtimeException = runtimeException2;
                            i = i7;
                            Collections.sort(arrayList2, new tui(9));
                            abnp abnpVarN4 = ajgi.a.n();
                            ArrayList arrayList3 = new ArrayList();
                            int iMax = Math.max(arrayList2.size() - i8, 0);
                            long j2 = 0;
                            while (iMax < arrayList2.size()) {
                                acjs acjsVar = (acjs) arrayList2.get(iMax);
                                vpl vplVar = (vpl) acjsVar.b;
                                vpk vpkVar = vplVar.g;
                                if (vpkVar != null) {
                                    abnp abnpVarN5 = ajgm.a.n();
                                    int iIntValue = vpkVar.a.intValue();
                                    abnpVarN5.t();
                                    z2 = z5;
                                    ajgm ajgmVar = (ajgm) abnpVarN5.b;
                                    i3 = iMax;
                                    ajgmVar.b |= 1;
                                    ajgmVar.c = iIntValue;
                                    long j3 = vplVar.a;
                                    j = j2;
                                    abpt abptVarC = abqu.c(j3 / 1000000000, (int) (j3 % 1000000000));
                                    abnpVarN5.t();
                                    ajgm ajgmVar2 = (ajgm) abnpVarN5.b;
                                    abptVarC.getClass();
                                    ajgmVar2.d = abptVarC;
                                    ajgmVar2.b |= 2;
                                    int i11 = vplVar.d;
                                    abnpVarN5.t();
                                    ajgm ajgmVar3 = (ajgm) abnpVarN5.b;
                                    ajgmVar3.b |= 16;
                                    ajgmVar3.g = i11;
                                    abnpVarN5.t();
                                    ajgm ajgmVar4 = (ajgm) abnpVarN5.b;
                                    ajgmVar4.b |= 32;
                                    ajgmVar4.h = vpkVar.d;
                                    abnpVarN5.t();
                                    ajgm ajgmVar5 = (ajgm) abnpVarN5.b;
                                    ajgmVar5.b |= 4;
                                    ajgmVar5.e = vpkVar.b;
                                    abnpVarN5.t();
                                    ajgm ajgmVar6 = (ajgm) abnpVarN5.b;
                                    ajgmVar6.b |= 8;
                                    ajgmVar6.f = vpkVar.c;
                                    arrayList3.add((ajgm) abnpVarN5.q());
                                } else {
                                    i3 = iMax;
                                    z2 = z5;
                                    j = j2;
                                    int i12 = acjsVar.a;
                                    Long lG = zeb.g(vplVar.b + "." + vplVar.c + ":" + vplVar.d);
                                    if (lG != null) {
                                        long jLongValue2 = lG.longValue();
                                        abnpVarN4.t();
                                        ajgi ajgiVar = (ajgi) abnpVarN4.b;
                                        abog abogVar = ajgiVar.b;
                                        if (!abogVar.c()) {
                                            ajgiVar.b = abnv.H(abogVar);
                                        }
                                        ajgiVar.b.f(jLongValue2);
                                        int size = ((ajgi) abnpVarN4.b).b.size() - 1;
                                        long j4 = vplVar.a / 1000000;
                                        long j5 = j4 - j;
                                        abnpVarN4.t();
                                        ajgi ajgiVar2 = (ajgi) abnpVarN4.b;
                                        arrayList = arrayList3;
                                        abog abogVar2 = ajgiVar2.c;
                                        if (!abogVar2.c()) {
                                            ajgiVar2.c = abnv.H(abogVar2);
                                        }
                                        ajgiVar2.c.f(j5);
                                        abnpVarN4.t();
                                        ajgi ajgiVar3 = (ajgi) abnpVarN4.b;
                                        abod abodVar = ajgiVar3.d;
                                        if (!abodVar.c()) {
                                            int size2 = abodVar.size();
                                            ajgiVar3.d = abodVar.d(size2 + size2);
                                        }
                                        ajgiVar3.d.g(i12);
                                        int i13 = 0;
                                        while (true) {
                                            int[] iArr = vplVar.e;
                                            if (i13 >= iArr.length) {
                                                break;
                                            }
                                            int i14 = iArr[i13];
                                            abnpVarN4.t();
                                            ajgi ajgiVar4 = (ajgi) abnpVarN4.b;
                                            abod abodVar2 = ajgiVar4.e;
                                            if (!abodVar2.c()) {
                                                int size3 = abodVar2.size();
                                                ajgiVar4.e = abodVar2.d(size3 + size3);
                                            }
                                            ajgiVar4.e.g(size);
                                            abnpVarN4.t();
                                            ajgi ajgiVar5 = (ajgi) abnpVarN4.b;
                                            abod abodVar3 = ajgiVar5.f;
                                            if (!abodVar3.c()) {
                                                int size4 = abodVar3.size();
                                                ajgiVar5.f = abodVar3.d(size4 + size4);
                                            }
                                            ajgiVar5.f.g(i14);
                                            String str5 = vplVar.f[i13];
                                            abnpVarN4.t();
                                            ajgi ajgiVar6 = (ajgi) abnpVarN4.b;
                                            str5.getClass();
                                            aboh abohVar = ajgiVar6.g;
                                            if (!abohVar.c()) {
                                                int size5 = abohVar.size();
                                                ajgiVar6.g = abohVar.d(size5 + size5);
                                            }
                                            ajgiVar6.g.add(str5);
                                            i13++;
                                        }
                                        j2 = j4;
                                    }
                                    iMax = i3 + 1;
                                    z5 = z2;
                                    arrayList3 = arrayList;
                                }
                                arrayList = arrayList3;
                                j2 = j;
                                iMax = i3 + 1;
                                z5 = z2;
                                arrayList3 = arrayList;
                            }
                            z = z5;
                            vpm vpmVar = new vpm((ajgi) abnpVarN4.q(), yfq.o(arrayList3));
                            ajgi ajgiVar7 = vpmVar.a;
                            abnpVarK2.t();
                            ajgu ajguVar5 = (ajgu) abnpVarK2.b;
                            ajguVar5.w = ajgiVar7;
                            ajguVar5.b |= 2097152;
                            yfq yfqVar = vpmVar.b;
                            abnpVarK2.t();
                            ajgu ajguVar6 = (ajgu) abnpVarK2.b;
                            aboh abohVar2 = ajguVar6.x;
                            if (!abohVar2.c()) {
                                int size6 = abohVar2.size();
                                ajguVar6.x = abohVar2.d(size6 + size6);
                            }
                            abmc.i(yfqVar, ajguVar6.x);
                        }
                        xxh xxhVar2 = vsbVar.i;
                        if (xxhVar2.f() && vruVar2.i && (i2 = vruVar2.j) > 0) {
                            if (((Boolean) vsbVar.k.a()).booleanValue()) {
                                yfq yfqVarC = ((vxg) xxhVar2.b()).c();
                                if (!yfqVarC.isEmpty()) {
                                    abnpVarK2.aQ(yrm.V(vsb.a(yfqVarC, i2), new txa(14)));
                                }
                            } else {
                                yfq yfqVarD = ((vxg) xxhVar2.b()).d();
                                if (!yfqVarD.isEmpty()) {
                                    abnpVarK2.aQ(yrm.V(vsb.a(yfqVarD, i2), new txa(15)));
                                }
                            }
                        }
                        if (vruVar2.h != null) {
                            throw runtimeException;
                        }
                        xxh xxhVar3 = vsbVar.j;
                        if (xxhVar3.f()) {
                            yfq yfqVarA = ((vrs) xxhVar3.b()).a();
                            abnpVarK2.t();
                            ajgu ajguVar7 = (ajgu) abnpVarK2.b;
                            aboh abohVar3 = ajguVar7.y;
                            if (!abohVar3.c()) {
                                int size7 = abohVar3.size();
                                ajguVar7.y = abohVar3.d(size7 + size7);
                            }
                            abmc.i(yfqVarA, ajguVar7.y);
                        }
                        abnp abnpVarK4 = ((ajgu) abnpVarK2.q()).K();
                        abnpVarK4.t();
                        ajgu ajguVar8 = (ajgu) abnpVarK4.b;
                        ajfzVarB.getClass();
                        ajguVar8.u = ajfzVarB;
                        ajguVar8.b |= 1048576;
                        String str6 = vruVar2.a;
                        if (vruVar2.b) {
                            if (str6 != null) {
                                abnpVarK4.t();
                                ajgu ajguVar9 = (ajgu) abnpVarK4.b;
                                ajguVar9.b |= 4;
                                ajguVar9.e = str6;
                            } else {
                                abnpVarK4.t();
                                ajgu ajguVar10 = (ajgu) abnpVarK4.b;
                                ajguVar10.b &= -5;
                                ajguVar10.e = ajgu.a.e;
                            }
                        } else if (str6 != null) {
                            abnpVarK4.t();
                            ajgu ajguVar11 = (ajgu) abnpVarK4.b;
                            ajguVar11.b |= 2;
                            ajguVar11.d = str6;
                        } else {
                            abnpVarK4.t();
                            ajgu ajguVar12 = (ajgu) abnpVarK4.b;
                            ajguVar12.b &= -3;
                            ajguVar12.d = ajgu.a.d;
                        }
                        vryVar.d.a();
                        abnr abnrVar = (abnr) ajey.a.n();
                        ajey ajeyVar = vruVar2.d;
                        aezk aezkVarB = ((vqu) vryVar.e.a()).b();
                        if (ajeyVar != null) {
                            abnrVar.w(ajeyVar);
                        } else if (aezkVarB != null) {
                            try {
                                abnrVar.w((abnv) aezkVarB.a());
                            } catch (RuntimeException e) {
                                ((ynz) ((ynz) ((ynz) vlj.a.h()).p(e)).ai((char) 9800)).u("Failed to get metric extension from configuration object");
                            }
                        }
                        ajey ajeyVar2 = (ajey) abnrVar.q();
                        boolean zEquals = ajeyVar2.equals(ajey.a);
                        ajey ajeyVar3 = ajeyVar2;
                        if (z == zEquals) {
                            ajeyVar3 = runtimeException;
                        }
                        if (ajeyVar3 != 0) {
                            abnpVarK4.t();
                            ajgu ajguVar13 = (ajgu) abnpVarK4.b;
                            ajguVar13.C = ajeyVar3;
                            ajguVar13.b |= 33554432;
                        }
                        String str7 = vruVar2.e;
                        if (str7 != null) {
                            abnp abnpVarN6 = ajgb.a.n();
                            abnpVarN6.t();
                            ajgb ajgbVar4 = (ajgb) abnpVarN6.b;
                            ajgbVar4.b |= 1;
                            ajgbVar4.c = str7;
                            abnpVarK4.t();
                            ajgu ajguVar14 = (ajgu) abnpVarK4.b;
                            ajgb ajgbVar5 = (ajgb) abnpVarN6.q();
                            ajgbVar5.getClass();
                            ajguVar14.D = ajgbVar5;
                            ajguVar14.b |= i;
                        }
                        vrw vrwVar = vryVar.a;
                        ajgu ajguVar15 = (ajgu) abnpVarK4.q();
                        yfq yfqVar2 = (yfq) vrwVar.a.gu();
                        int size8 = yfqVar2.size();
                        wub.G(size8, "expectedSize");
                        yfl yflVar = new yfl(size8);
                        int size9 = yfqVar2.size();
                        RuntimeException runtimeException3 = runtimeException;
                        for (int i15 = 0; i15 < size9; i15++) {
                            try {
                                yflVar.i(((vyv) yfqVar2.get(i15)).b(ajguVar15));
                            } catch (RuntimeException e2) {
                                ((ynz) ((ynz) ((ynz) vlj.a.h()).p(e2)).ai((char) 9799)).u("One transmitter failed to send message");
                                if (runtimeException3 == null) {
                                    runtimeException3 = e2;
                                } else {
                                    runtimeException3.addSuppressed(e2);
                                }
                            }
                        }
                        if (runtimeException3 != null) {
                            throw runtimeException3;
                        }
                        zgp zgpVarA = new zgh(true, yfq.n(yflVar.g())).a(new vrv(), zfq.a);
                        vryVar.c.c.a();
                        return zgpVarA;
                    }
                }
                return zgl.a;
            }
        };
        Executor executor = this.g;
        zhk zhkVar = new zhk(zfjVar);
        executor.execute(zhkVar);
        return zhkVar;
    }

    public final boolean b(String str) {
        return !e(str).f();
    }

    public final boolean c() {
        vyj vyjVar = this.c;
        return vyjVar.b && vyjVar.a.a;
    }

    public final int d() {
        int iAt = a.at(this.c.a.b.e);
        if (iAt == 0) {
            return 1;
        }
        return iAt;
    }

    public final vyk e(String str) {
        if (this.f.a) {
            return vyk.b;
        }
        vyj vyjVar = this.c;
        if (vyjVar.c.b()) {
            return vyk.b;
        }
        return vyjVar.b ? vyjVar.a.d(str) : vyk.b;
    }
}
