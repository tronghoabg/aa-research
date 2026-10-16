package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class myy {
    public final mwy a;
    private final long b;
    private final float c;

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public myy(long r4, defpackage.mwy r6) {
        /*
            r3 = this;
            r3.<init>()
            r3.b = r4
            r3.a = r6
            lek r6 = defpackage.lel.a
            lel r0 = r6.a()
            boolean r0 = r0.b()
            r1 = 1127481344(0x43340000, float:180.0)
            if (r0 != 0) goto L6a
            yph r0 = defpackage.myi.a
            lel r6 = r6.a()
            boolean r6 = r6.a()
            boolean r6 = defpackage.myi.x(r4, r6)
            if (r6 == 0) goto L26
            goto L6a
        L26:
            float r6 = defpackage.dll.b(r4)
            r0 = 1140457472(0x43fa0000, float:500.0)
            int r6 = defpackage.dlj.a(r6, r0)
            if (r6 >= 0) goto L41
            float r6 = defpackage.dll.a(r4)
            r2 = 1132068864(0x437a0000, float:250.0)
            int r6 = defpackage.dlj.a(r6, r2)
            if (r6 >= 0) goto L41
            r1 = 1122500608(0x42e80000, float:116.0)
            goto L9f
        L41:
            float r6 = defpackage.dll.b(r4)
            int r6 = defpackage.dlj.a(r6, r0)
            if (r6 >= 0) goto L5a
            float r6 = defpackage.dll.a(r4)
            r0 = 1135542272(0x43af0000, float:350.0)
            int r6 = defpackage.dlj.a(r6, r0)
            if (r6 >= 0) goto L5a
            r1 = 1125515264(0x43160000, float:150.0)
            goto L9f
        L5a:
            float r4 = defpackage.dll.a(r4)
            r5 = 1133248512(0x438c0000, float:280.0)
            int r4 = defpackage.dlj.a(r4, r5)
            if (r4 >= 0) goto L67
            goto L9f
        L67:
            r1 = 1130758144(0x43660000, float:230.0)
            goto L9f
        L6a:
            float r6 = defpackage.dll.b(r4)
            float r0 = defpackage.dll.a(r4)
            boolean r6 = defpackage.mcd.z(r6, r0)
            if (r6 != 0) goto L8a
            ldy r6 = defpackage.ldz.a
            ldz r6 = r6.a()
            boolean r6 = r6.b()
            if (r6 == 0) goto L85
            goto L8a
        L85:
            gjk r6 = defpackage.gjk.d
            float r6 = r6.k
            goto L8e
        L8a:
            gjk r6 = defpackage.gjk.c
            float r6 = r6.k
        L8e:
            float r4 = defpackage.dll.a(r4)
            float r6 = r6 + r6
            r5 = 0
            float r6 = r6 + r5
            float r4 = r4 - r6
            float r4 = r4 + r5
            r6 = -1044381696(0xffffffffc1c00000, float:-24.0)
            float r4 = r4 + r6
            float r4 = r4 + r5
            float r1 = java.lang.Math.min(r4, r1)
        L9f:
            r3.c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myy.<init>(long, mwy):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v17 */
    public final void a(Bitmap bitmap, final GhIcon ghIcon, final boolean z, cfy cfyVar, ltr ltrVar, bux buxVar, int i) {
        int i2;
        Object obj;
        cfy cfyVar2;
        cfv cfvVar;
        bvv bvvVar;
        boolean z2;
        long j;
        cfv cfvVar2;
        ?? r5;
        cjv cjvVar;
        bvv bvvVar2;
        long jO;
        long jI;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(911489975);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(bitmap) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(ghIcon) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z) ? 128 : 256;
        }
        int i4 = i2 | 3072;
        if ((i & 24576) == 0) {
            obj = ltrVar;
            i4 |= true != buxVarC.E(obj) ? 8192 : 16384;
        } else {
            obj = ltrVar;
        }
        if ((196608 & i) == 0) {
            i4 |= true != ((262144 & i) == 0 ? buxVarC.C(this) : buxVarC.E(this)) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i4) != 74898, i4 & 1)) {
            cfv cfvVar3 = cfy.e;
            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVarC, 0);
            bvv bvvVar3 = (bvv) buxVarC;
            int iG = a.g(bvvVar3.u);
            ccx ccxVarAh = bvvVar3.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfvVar3);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar3.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            if (!myv.l(dll.a(this.b), true) || ghIcon == null) {
                cfvVar = cfvVar3;
                bvvVar = bvvVar3;
                z2 = true;
                buxVarC.v(1285521146);
                b(bitmap, ltrVar, null, buxVarC, (i4 & 14) | ((i4 >> 9) & 112) | ((i4 >> 6) & 7168));
                bvvVar.Y(false);
            } else {
                buxVarC.v(1284432240);
                float f = this.c;
                int iA = dlj.a(f, 180.0f);
                float f2 = dlj.a(f, 180.0f) < 0 ? gjk.a.k : (-gjk.b.k) + BitmapDescriptorFactory.HUE_RED;
                long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
                long j2 = jFloatToRawIntBits << 32;
                mwy mwyVar = this.a;
                cjv cjvVar2 = null;
                if (mwyVar == null) {
                    buxVarC.v(1285127910);
                    bvvVar3.Y(false);
                    cfvVar2 = cfvVar3;
                    j = jFloatToRawIntBits2;
                    cjvVar = null;
                    r5 = 0;
                    bvvVar2 = bvvVar3;
                } else {
                    buxVarC.v(41455739);
                    j = jFloatToRawIntBits2;
                    cfvVar2 = cfvVar3;
                    r5 = 0;
                    bvv bvvVar4 = bvvVar3;
                    long jI2 = cjn.i(mwyVar.d(mwyVar.a.e, 26, 26, 90, buxVarC));
                    bvvVar4.Y(false);
                    cjvVar = new cjv(jI2);
                    bvvVar2 = bvvVar4;
                }
                if (cjvVar == null) {
                    buxVarC.v(41457147);
                    jO = kfn.i(buxVarC).O();
                    bvvVar2.Y(r5);
                } else {
                    buxVarC.v(41455504);
                    bvvVar2.Y(r5);
                    jO = cjvVar.a;
                }
                if (z) {
                    buxVarC.v(1285263598);
                    if (mwyVar == null) {
                        buxVarC.v(1285270820);
                        bvvVar2.Y(r5);
                    } else {
                        buxVarC.v(41460349);
                        long jC = mwyVar.c(buxVarC);
                        bvvVar2.Y(r5);
                        cjvVar2 = new cjv(jC);
                    }
                    if (cjvVar2 == null) {
                        buxVarC.v(41461821);
                        jI = kfn.i(buxVarC).t();
                        bvvVar2.Y(r5);
                    } else {
                        buxVarC.v(41460116);
                        bvvVar2.Y(r5);
                        jI = cjvVar2.a;
                    }
                    bvvVar2.Y(r5);
                } else {
                    buxVarC.v(1285353126);
                    bvvVar2.Y(r5);
                    jI = cjn.i(r5);
                }
                final float f3 = iA < 0 ? 24.0f : 32.0f;
                cfvVar = cfvVar2;
                z2 = true;
                kfl.m(bxc.i(-237732793, true, new afeg() { // from class: myx
                    @Override // defpackage.afeg
                    public final Object invoke(Object obj2, Object obj3) throws Exception {
                        bux buxVar2 = (bux) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        int i5 = iIntValue & 3;
                        if (buxVar2.I(i5 != 2, iIntValue & 1)) {
                            cjv cjvVar3 = null;
                            if (z) {
                                myy myyVar = this;
                                buxVar2.v(103520651);
                                mwy mwyVar2 = myyVar.a;
                                if (mwyVar2 == null) {
                                    buxVar2.v(103520650);
                                    buxVar2.o();
                                } else {
                                    buxVar2.v(-827944617);
                                    long jC2 = mwyVar2.c(buxVar2);
                                    buxVar2.o();
                                    cjvVar3 = new cjv(jC2);
                                }
                            } else {
                                buxVar2.v(103542102);
                            }
                            buxVar2.o();
                            myi.l(ghIcon, cjvVar3, f3, asl.H(cfy.e, gjk.a.k), buxVar2, 0, 0);
                        } else {
                            buxVar2.s();
                        }
                        return afak.a;
                    }
                }, buxVarC), null, f3, j2 | (j & 4294967295L), jO, null, jI, bxc.i(-768602720, true, new brf(this, bitmap, obj, 20, (char[]) null), buxVarC), buxVarC, 12582918, 34);
                buxVarC = buxVarC;
                bvvVar = bvvVar2;
                bvvVar.Y(false);
            }
            bvvVar.Y(z2);
            cfyVar2 = cfvVar;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new boa(this, bitmap, ghIcon, z, cfyVar2, ltrVar, i, 4);
        }
    }

    public final void b(Bitmap bitmap, ltr ltrVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        bcm bcmVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1374712501);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(bitmap) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(ltrVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= true != ((i & 4096) == 0 ? buxVarC.C(this) : buxVarC.E(this)) ? 1024 : 2048;
        }
        if (buxVarC.I((i4 & 1171) != 1170, i4 & 1)) {
            float f = this.c;
            cfyVar2 = cfy.e;
            cfy cfyVarAv = ca.av(awd.l(cfyVar2, Float.NaN, 64.0f, Float.NaN, f), true);
            if (dlj.a(f, 180.0f) < 0) {
                buxVarC.v(-1546556322);
                bcmVar = czz.au(buxVarC).a;
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-1546493981);
                bcmVar = czz.au(buxVarC).b;
                ((bvv) buxVarC).Y(false);
            }
            cfy cfyVarG = cjn.g(cfyVarAv, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bcmVar, true, 0, 1042431);
            if (ltrVar != null) {
                buxVarC.v(-1546393076);
                myi.C(ltrVar, f, cfyVarG, buxVarC, (i4 >> 3) & 14);
                ((bvv) buxVarC).Y(false);
            } else if (bitmap != null) {
                buxVarC.v(-1546290063);
                myi.K(new nbh(bitmap).a, cfyVarG, csh.a, buxVarC, 3120);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-1546099785);
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dmh(this, bitmap, ltrVar, cfyVar2, i, 13);
        }
    }
}
