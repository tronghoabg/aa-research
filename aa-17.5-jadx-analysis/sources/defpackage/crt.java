package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class crt {
    public static final Void a(String str) {
        throw new IllegalStateException(str);
    }

    public static final void b(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void c(String str) {
        throw new IllegalStateException(str);
    }

    public static final void d(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final cfy e(cfy cfyVar, afec afecVar) {
        return cfyVar.a(new crp(afecVar));
    }

    public static final afeg f(List list) {
        return new cct(1271844412, true, new bly(list, 9));
    }

    public static final void g(cfy cfyVar, afeg afegVar, ctp ctpVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1663319424);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(ctpVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            int iA = buxVarC.a();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            bvv bvvVar = (bvv) buxVarC;
            ccx ccxVarAh = bvvVar.ah();
            int i5 = 3;
            int i6 = ((i2 << 3) & 896) | 6;
            afdr afdrVar = cxb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVar, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            cmj cmjVar = new cmj(i5);
            if (bvvVar.t) {
                buxVarC.i(afak.a, new alx(cmjVar, 15));
            }
            buxVarC.i(afak.a, new alx(cwb.g, i4));
            byq.c(buxVarC, cfyVarJ, cwb.c);
            byq.c(buxVarC, Integer.valueOf(iA), cwb.f);
            afegVar.invoke(buxVarC, Integer.valueOf((i6 >> 6) & 14));
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new cuw(cfyVar, afegVar, ctpVar, i, 1, (byte[]) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final cjb h(cst cstVar) {
        cst cstVarQ = cstVar.q();
        if (cstVarQ != null) {
            return cstVarQ.o(cstVar, true);
        }
        long j = ((cuo) cstVar).c;
        return new cjb(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final cjb i(cst cstVar, boolean z) {
        float f;
        float f2;
        cst cstVarJ = j(cstVar);
        long jH = cstVarJ.h() >> 32;
        long jH2 = cstVarJ.h() & 4294967295L;
        cjb cjbVarO = cstVarJ.o(cstVar, z);
        float f3 = (int) jH;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        if (z) {
            f = cjbVarO.b;
            if (f < BitmapDescriptorFactory.HUE_RED) {
                f = 0.0f;
            }
            if (f > f3) {
                f = f3;
            }
        } else {
            f = cjbVarO.b;
        }
        float f5 = (int) jH2;
        if (z) {
            f2 = cjbVarO.c;
            if (f2 < BitmapDescriptorFactory.HUE_RED) {
                f2 = 0.0f;
            }
            if (f2 > f5) {
                f2 = f5;
            }
        } else {
            f2 = cjbVarO.c;
        }
        if (z) {
            float f6 = cjbVarO.d;
            if (f6 < BitmapDescriptorFactory.HUE_RED) {
                f6 = 0.0f;
            }
            if (f6 <= f3) {
                f3 = f6;
            }
        } else {
            f3 = cjbVarO.d;
        }
        if (z) {
            float f7 = cjbVarO.e;
            if (f7 >= BitmapDescriptorFactory.HUE_RED) {
                f4 = f7;
            }
            if (f4 <= f5) {
                f5 = f4;
            }
        } else {
            f5 = cjbVarO.e;
        }
        if (f == f3 || f2 == f5) {
            return cjb.a;
        }
        long jL = cstVarJ.l((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        float f8 = f5;
        long jL2 = cstVarJ.l((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        long jL3 = cstVarJ.l((Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        long jL4 = cstVarJ.l((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L));
        int i = (int) (jL2 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jL4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jL3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jL & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jL2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jL4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jL3 & 4294967295L));
        return new cjb(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final cst j(cst cstVar) {
        cst cstVar2;
        cyc cycVar;
        cst cstVarQ = cstVar.q();
        while (true) {
            cst cstVar3 = cstVarQ;
            cstVar2 = cstVar;
            cstVar = cstVar3;
            if (cstVar == null) {
                break;
            }
            cstVarQ = cstVar.q();
        }
        cyc cycVar2 = cstVar2 instanceof cyc ? (cyc) cstVar2 : null;
        if (cycVar2 == null) {
            return cstVar2;
        }
        do {
            cycVar = cycVar2;
            cycVar2 = cycVar2.x;
        } while (cycVar2 != null);
        return cycVar;
    }

    public static final void k(String str) {
        throw new IllegalArgumentException(a.bq(str, "No valid saved state was found for the key '", "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final String l(Collection collection) {
        return !collection.isEmpty() ? afyh.H(woy.cu(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static final String m(Collection collection) {
        return afyh.H(woy.cu(collection, ",", null, null, null, 62)).concat(afyh.H(" }"));
    }

    public static final String n(Collection collection) {
        return afyh.H(woy.cu(collection, ",", null, null, null, 62)).concat(afyh.H("},"));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean o(java.lang.String r8, java.lang.String r9) {
        /*
            boolean r0 = defpackage.affa.f(r8, r9)
            r1 = 1
            if (r0 != 0) goto L5c
            int r0 = r8.length()
            r2 = 0
            if (r0 == 0) goto L5b
            r0 = r2
            r3 = r0
            r4 = r3
        L11:
            int r5 = r8.length()
            if (r0 >= r5) goto L3f
            char r5 = r8.charAt(r0)
            int r6 = r4 + 1
            r7 = 40
            if (r4 != 0) goto L25
            if (r5 != r7) goto L5b
            r4 = r2
            r5 = r7
        L25:
            if (r5 == r7) goto L39
            r7 = 41
            if (r5 == r7) goto L2c
            goto L3b
        L2c:
            int r3 = r3 + (-1)
            if (r3 != 0) goto L3b
            int r5 = r8.length()
            int r5 = r5 + (-1)
            if (r4 == r5) goto L3b
            goto L5b
        L39:
            int r3 = r3 + 1
        L3b:
            int r0 = r0 + 1
            r4 = r6
            goto L11
        L3f:
            if (r3 != 0) goto L5b
            int r0 = r8.length()
            int r0 = r0 + (-1)
            java.lang.String r8 = r8.substring(r1, r0)
            r8.getClass()
            java.lang.CharSequence r8 = defpackage.afyh.k(r8)
            java.lang.String r8 = r8.toString()
            boolean r8 = defpackage.affa.f(r8, r9)
            return r8
        L5b:
            return r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crt.o(java.lang.String, java.lang.String):boolean");
    }

    public static final boolean p(fay fayVar, Object obj) {
        Set set;
        if (fayVar == obj) {
            return true;
        }
        if (!(obj instanceof fay)) {
            return false;
        }
        fay fayVar2 = (fay) obj;
        if (!affa.f(fayVar.a, fayVar2.a) || !affa.f(fayVar.b, fayVar2.b) || !affa.f(fayVar.c, fayVar2.c)) {
            return false;
        }
        Set set2 = fayVar.d;
        if (set2 == null || (set = fayVar2.d) == null) {
            return true;
        }
        return affa.f(set2, set);
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02f1 A[Catch: all -> 0x0324, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0324, blocks: (B:44:0x01a2, B:49:0x01bb, B:50:0x01c0, B:52:0x01c6, B:54:0x01d2, B:58:0x01e3, B:88:0x02e6, B:92:0x02f1, B:86:0x02da, B:98:0x0305, B:99:0x0308, B:101:0x030d, B:59:0x01ed, B:65:0x0219, B:66:0x0225, B:68:0x022b, B:70:0x0234, B:74:0x024a, B:76:0x0264, B:77:0x0283, B:79:0x0289, B:80:0x0299, B:81:0x02ba, B:83:0x02c0, B:84:0x02d0, B:96:0x0303), top: B:129:0x01a2, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.fay q(defpackage.fca r29, java.lang.String r30) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crt.q(fca, java.lang.String):fay");
    }

    public static final int r(fbk fbkVar, String str) {
        int i = ckf.i(fbkVar, str);
        if (i >= 0) {
            return i;
        }
        int i2 = ckf.i(fbkVar, "`" + str + '`');
        if (i2 >= 0) {
            return i2;
        }
        return -1;
    }
}
