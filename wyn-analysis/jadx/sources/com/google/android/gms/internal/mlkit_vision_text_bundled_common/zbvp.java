package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import A7.AbstractC0279p0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
final class zbvp<T> implements zbvx<T> {
    private static final int[] zba = new int[0];
    private static final Unsafe zbb = zbws.zbg();
    private final int[] zbc;
    private final Object[] zbd;
    private final int zbe;
    private final int zbf;
    private final zbvm zbg;
    private final boolean zbh;
    private final int[] zbi;
    private final int zbj;
    private final int zbk;
    private final zbwl zbl;
    private final zbtq zbm;

    private zbvp(int[] iArr, Object[] objArr, int i5, int i10, zbvm zbvmVar, boolean z2, int[] iArr2, int i11, int i12, zbvs zbvsVar, zbuy zbuyVar, zbwl zbwlVar, zbtq zbtqVar, zbvh zbvhVar) {
        this.zbc = iArr;
        this.zbd = objArr;
        this.zbe = i5;
        this.zbf = i10;
        boolean z10 = false;
        if (zbtqVar != null && (zbvmVar instanceof zbub)) {
            z10 = true;
        }
        this.zbh = z10;
        this.zbi = iArr2;
        this.zbj = i11;
        this.zbk = i12;
        this.zbl = zbwlVar;
        this.zbm = zbtqVar;
        this.zbg = zbvmVar;
    }

    private static void zbA(Object obj) {
        if (!zbL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zbB(Object obj, Object obj2, int i5) {
        if (zbI(obj2, i5)) {
            int iZbs = zbs(i5) & 1048575;
            Unsafe unsafe = zbb;
            long j8 = iZbs;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zbc[i5] + " is present but null: " + obj2.toString());
            }
            zbvx zbvxVarZbv = zbv(i5);
            if (!zbI(obj, i5)) {
                if (zbL(object)) {
                    Object objZbe = zbvxVarZbv.zbe();
                    zbvxVarZbv.zbg(objZbe, object);
                    unsafe.putObject(obj, j8, objZbe);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                zbD(obj, i5);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!zbL(object2)) {
                Object objZbe2 = zbvxVarZbv.zbe();
                zbvxVarZbv.zbg(objZbe2, object2);
                unsafe.putObject(obj, j8, objZbe2);
                object2 = objZbe2;
            }
            zbvxVarZbv.zbg(object2, object);
        }
    }

    private final void zbC(Object obj, Object obj2, int i5) {
        int i10 = this.zbc[i5];
        if (zbM(obj2, i10, i5)) {
            int iZbs = zbs(i5) & 1048575;
            Unsafe unsafe = zbb;
            long j8 = iZbs;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zbc[i5] + " is present but null: " + obj2.toString());
            }
            zbvx zbvxVarZbv = zbv(i5);
            if (!zbM(obj, i10, i5)) {
                if (zbL(object)) {
                    Object objZbe = zbvxVarZbv.zbe();
                    zbvxVarZbv.zbg(objZbe, object);
                    unsafe.putObject(obj, j8, objZbe);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                zbE(obj, i10, i5);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!zbL(object2)) {
                Object objZbe2 = zbvxVarZbv.zbe();
                zbvxVarZbv.zbg(objZbe2, object2);
                unsafe.putObject(obj, j8, objZbe2);
                object2 = objZbe2;
            }
            zbvxVarZbv.zbg(object2, object);
        }
    }

    private final void zbD(Object obj, int i5) {
        int iZbp = zbp(i5);
        long j8 = 1048575 & iZbp;
        if (j8 == 1048575) {
            return;
        }
        zbws.zbq(obj, j8, (1 << (iZbp >>> 20)) | zbws.zbc(obj, j8));
    }

    private final void zbE(Object obj, int i5, int i10) {
        zbws.zbq(obj, zbp(i10) & 1048575, i5);
    }

    private final void zbF(Object obj, int i5, Object obj2) {
        zbb.putObject(obj, zbs(i5) & 1048575, obj2);
        zbD(obj, i5);
    }

    private final void zbG(Object obj, int i5, int i10, Object obj2) {
        zbb.putObject(obj, zbs(i10) & 1048575, obj2);
        zbE(obj, i5, i10);
    }

    private final boolean zbH(Object obj, Object obj2, int i5) {
        return zbI(obj, i5) == zbI(obj2, i5);
    }

    private final boolean zbI(Object obj, int i5) {
        int iZbp = zbp(i5);
        long j8 = iZbp & 1048575;
        if (j8 != 1048575) {
            return (zbws.zbc(obj, j8) & (1 << (iZbp >>> 20))) != 0;
        }
        int iZbs = zbs(i5);
        long j10 = iZbs & 1048575;
        switch (zbr(iZbs)) {
            case 0:
                return Double.doubleToRawLongBits(zbws.zba(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zbws.zbb(obj, j10)) != 0;
            case 2:
                return zbws.zbd(obj, j10) != 0;
            case 3:
                return zbws.zbd(obj, j10) != 0;
            case 4:
                return zbws.zbc(obj, j10) != 0;
            case 5:
                return zbws.zbd(obj, j10) != 0;
            case 6:
                return zbws.zbc(obj, j10) != 0;
            case 7:
                return zbws.zbw(obj, j10);
            case 8:
                Object objZbf = zbws.zbf(obj, j10);
                if (objZbf instanceof String) {
                    return !((String) objZbf).isEmpty();
                }
                if (objZbf instanceof zbtc) {
                    return !zbtc.zbb.equals(objZbf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zbws.zbf(obj, j10) != null;
            case 10:
                return !zbtc.zbb.equals(zbws.zbf(obj, j10));
            case 11:
                return zbws.zbc(obj, j10) != 0;
            case 12:
                return zbws.zbc(obj, j10) != 0;
            case 13:
                return zbws.zbc(obj, j10) != 0;
            case 14:
                return zbws.zbd(obj, j10) != 0;
            case 15:
                return zbws.zbc(obj, j10) != 0;
            case 16:
                return zbws.zbd(obj, j10) != 0;
            case 17:
                return zbws.zbf(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zbJ(Object obj, int i5, int i10, int i11, int i12) {
        return i10 == 1048575 ? zbI(obj, i5) : (i11 & i12) != 0;
    }

    private static boolean zbK(Object obj, int i5, zbvx zbvxVar) {
        return zbvxVar.zbk(zbws.zbf(obj, i5 & 1048575));
    }

    private static boolean zbL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zbuf) {
            return ((zbuf) obj).zbG();
        }
        return true;
    }

    private final boolean zbM(Object obj, int i5, int i10) {
        return zbws.zbc(obj, (long) (zbp(i10) & 1048575)) == i5;
    }

    private static boolean zbN(Object obj, long j8) {
        return ((Boolean) zbws.zbf(obj, j8)).booleanValue();
    }

    private static final int zbO(byte[] bArr, int i5, int i10, zbww zbwwVar, Class cls, zbsq zbsqVar) throws IOException {
        zbww zbwwVar2 = zbww.zba;
        switch (zbwwVar.ordinal()) {
            case 0:
                int i11 = i5 + 8;
                zbsqVar.zbc = Double.valueOf(Double.longBitsToDouble(zbsr.zbr(bArr, i5)));
                return i11;
            case 1:
                int i12 = i5 + 4;
                zbsqVar.zbc = Float.valueOf(Float.intBitsToFloat(zbsr.zbc(bArr, i5)));
                return i12;
            case 2:
            case 3:
                int iZbn = zbsr.zbn(bArr, i5, zbsqVar);
                zbsqVar.zbc = Long.valueOf(zbsqVar.zbb);
                return iZbn;
            case 4:
            case 12:
            case 13:
                int iZbk = zbsr.zbk(bArr, i5, zbsqVar);
                zbsqVar.zbc = Integer.valueOf(zbsqVar.zba);
                return iZbk;
            case 5:
            case 15:
                int i13 = i5 + 8;
                zbsqVar.zbc = Long.valueOf(zbsr.zbr(bArr, i5));
                return i13;
            case 6:
            case 14:
                int i14 = i5 + 4;
                zbsqVar.zbc = Integer.valueOf(zbsr.zbc(bArr, i5));
                return i14;
            case 7:
                int iZbn2 = zbsr.zbn(bArr, i5, zbsqVar);
                zbsqVar.zbc = Boolean.valueOf(zbsqVar.zbb != 0);
                return iZbn2;
            case 8:
                return zbsr.zbi(bArr, i5, zbsqVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zbsr.zbe(zbvu.zba().zbb(cls), bArr, i5, i10, zbsqVar);
            case 11:
                return zbsr.zba(bArr, i5, zbsqVar);
            case 16:
                int iZbk2 = zbsr.zbk(bArr, i5, zbsqVar);
                zbsqVar.zbc = Integer.valueOf(zbtg.zbb(zbsqVar.zba));
                return iZbk2;
            case 17:
                int iZbn3 = zbsr.zbn(bArr, i5, zbsqVar);
                zbsqVar.zbc = Long.valueOf(zbtg.zbc(zbsqVar.zbb));
                return iZbn3;
        }
    }

    private static final void zbP(int i5, Object obj, zbwy zbwyVar) throws IOException {
        if (obj instanceof String) {
            zbwyVar.zbH(i5, (String) obj);
        } else {
            zbwyVar.zbd(i5, (zbtc) obj);
        }
    }

    public static zbwm zbd(Object obj) {
        zbuf zbufVar = (zbuf) obj;
        zbwm zbwmVar = zbufVar.zbc;
        if (zbwmVar != zbwm.zbc()) {
            return zbwmVar;
        }
        zbwm zbwmVarZbf = zbwm.zbf();
        zbufVar.zbc = zbwmVarZbf;
        return zbwmVarZbf;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp zbl(java.lang.Class r32, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj r33, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvs r34, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuy r35, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl r36, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtq r37, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvh r38) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbl(java.lang.Class, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvs, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuy, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtq, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvh):com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp");
    }

    private static double zbm(Object obj, long j8) {
        return ((Double) zbws.zbf(obj, j8)).doubleValue();
    }

    private static float zbn(Object obj, long j8) {
        return ((Float) zbws.zbf(obj, j8)).floatValue();
    }

    private static int zbo(Object obj, long j8) {
        return ((Integer) zbws.zbf(obj, j8)).intValue();
    }

    private final int zbp(int i5) {
        return this.zbc[i5 + 2];
    }

    private final int zbq(int i5, int i10) {
        int length = (this.zbc.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = this.zbc[i12];
            if (i5 == i13) {
                return i12;
            }
            if (i5 < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    private static int zbr(int i5) {
        return (i5 >>> 20) & 255;
    }

    private final int zbs(int i5) {
        return this.zbc[i5 + 1];
    }

    private static long zbt(Object obj, long j8) {
        return ((Long) zbws.zbf(obj, j8)).longValue();
    }

    private final zbuj zbu(int i5) {
        int i10 = i5 / 3;
        return (zbuj) this.zbd[i10 + i10 + 1];
    }

    private final zbvx zbv(int i5) {
        Object[] objArr = this.zbd;
        int i10 = i5 / 3;
        int i11 = i10 + i10;
        zbvx zbvxVar = (zbvx) objArr[i11];
        if (zbvxVar != null) {
            return zbvxVar;
        }
        zbvx zbvxVarZbb = zbvu.zba().zbb((Class) objArr[i11 + 1]);
        this.zbd[i11] = zbvxVarZbb;
        return zbvxVarZbb;
    }

    private final Object zbw(int i5) {
        int i10 = i5 / 3;
        return this.zbd[i10 + i10];
    }

    private final Object zbx(Object obj, int i5) {
        zbvx zbvxVarZbv = zbv(i5);
        int iZbs = zbs(i5) & 1048575;
        if (!zbI(obj, i5)) {
            return zbvxVarZbv.zbe();
        }
        Object object = zbb.getObject(obj, iZbs);
        if (zbL(object)) {
            return object;
        }
        Object objZbe = zbvxVarZbv.zbe();
        if (object != null) {
            zbvxVarZbv.zbg(objZbe, object);
        }
        return objZbe;
    }

    private final Object zby(Object obj, int i5, int i10) {
        zbvx zbvxVarZbv = zbv(i10);
        if (!zbM(obj, i5, i10)) {
            return zbvxVarZbv.zbe();
        }
        Object object = zbb.getObject(obj, zbs(i10) & 1048575);
        if (zbL(object)) {
            return object;
        }
        Object objZbe = zbvxVarZbv.zbe();
        if (object != null) {
            zbvxVarZbv.zbg(objZbe, object);
        }
        return objZbe;
    }

    private static Field zbz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbR = AbstractC0279p0.r("Field ", str, " for ", name, " not found. Known fields are ");
            sbR.append(string);
            throw new RuntimeException(sbR.toString());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e1  */
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zba(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 2086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zba(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final int zbb(Object obj) {
        int i5;
        long jDoubleToLongBits;
        int i10;
        int iFloatToIntBits;
        int iZbc;
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < this.zbc.length; i13 += 3) {
            int iZbs = zbs(i13);
            int[] iArr = this.zbc;
            int i14 = 1048575 & iZbs;
            int iZbr = zbr(iZbs);
            int i15 = iArr[i13];
            long j8 = i14;
            int iHashCode = 37;
            switch (iZbr) {
                case 0:
                    i5 = i12 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zbws.zba(obj, j8));
                    byte[] bArr = zbuo.zbb;
                    iZbc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i5 + iZbc;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zbws.zbb(obj, j8));
                    i12 = iFloatToIntBits + i10;
                    break;
                case 2:
                    i5 = i12 * 53;
                    jDoubleToLongBits = zbws.zbd(obj, j8);
                    byte[] bArr2 = zbuo.zbb;
                    iZbc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i5 + iZbc;
                    break;
                case 3:
                    i5 = i12 * 53;
                    jDoubleToLongBits = zbws.zbd(obj, j8);
                    byte[] bArr3 = zbuo.zbb;
                    iZbc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i5 + iZbc;
                    break;
                case 4:
                    i5 = i12 * 53;
                    iZbc = zbws.zbc(obj, j8);
                    i12 = i5 + iZbc;
                    break;
                case 5:
                    i5 = i12 * 53;
                    jDoubleToLongBits = zbws.zbd(obj, j8);
                    byte[] bArr4 = zbuo.zbb;
                    iZbc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i5 + iZbc;
                    break;
                case 6:
                    i5 = i12 * 53;
                    iZbc = zbws.zbc(obj, j8);
                    i12 = i5 + iZbc;
                    break;
                case 7:
                    i10 = i12 * 53;
                    iFloatToIntBits = zbuo.zba(zbws.zbw(obj, j8));
                    i12 = iFloatToIntBits + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iFloatToIntBits = ((String) zbws.zbf(obj, j8)).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 9:
                    i11 = i12 * 53;
                    Object objZbf = zbws.zbf(obj, j8);
                    if (objZbf != null) {
                        iHashCode = objZbf.hashCode();
                    }
                    i12 = i11 + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iFloatToIntBits = zbws.zbf(obj, j8).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 11:
                    i5 = i12 * 53;
                    iZbc = zbws.zbc(obj, j8);
                    i12 = i5 + iZbc;
                    break;
                case 12:
                    i5 = i12 * 53;
                    iZbc = zbws.zbc(obj, j8);
                    i12 = i5 + iZbc;
                    break;
                case 13:
                    i5 = i12 * 53;
                    iZbc = zbws.zbc(obj, j8);
                    i12 = i5 + iZbc;
                    break;
                case 14:
                    i5 = i12 * 53;
                    jDoubleToLongBits = zbws.zbd(obj, j8);
                    byte[] bArr5 = zbuo.zbb;
                    iZbc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i5 + iZbc;
                    break;
                case 15:
                    i5 = i12 * 53;
                    iZbc = zbws.zbc(obj, j8);
                    i12 = i5 + iZbc;
                    break;
                case 16:
                    i5 = i12 * 53;
                    jDoubleToLongBits = zbws.zbd(obj, j8);
                    byte[] bArr6 = zbuo.zbb;
                    iZbc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i5 + iZbc;
                    break;
                case 17:
                    i11 = i12 * 53;
                    Object objZbf2 = zbws.zbf(obj, j8);
                    if (objZbf2 != null) {
                        iHashCode = objZbf2.hashCode();
                    }
                    i12 = i11 + iHashCode;
                    break;
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
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i12 * 53;
                    iFloatToIntBits = zbws.zbf(obj, j8).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iFloatToIntBits = zbws.zbf(obj, j8).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 51:
                    if (zbM(obj, i15, i13)) {
                        i5 = i12 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zbm(obj, j8));
                        byte[] bArr7 = zbuo.zbb;
                        iZbc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i5 + iZbc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zbM(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zbn(obj, j8));
                        i12 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zbM(obj, i15, i13)) {
                        i5 = i12 * 53;
                        jDoubleToLongBits = zbt(obj, j8);
                        byte[] bArr8 = zbuo.zbb;
                        iZbc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i5 + iZbc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zbM(obj, i15, i13)) {
                        i5 = i12 * 53;
                        jDoubleToLongBits = zbt(obj, j8);
                        byte[] bArr9 = zbuo.zbb;
                        iZbc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i5 + iZbc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zbM(obj, i15, i13)) {
                        i5 = i12 * 53;
                        iZbc = zbo(obj, j8);
                        i12 = i5 + iZbc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zbM(obj, i15, i13)) {
                        i5 = i12 * 53;
                        jDoubleToLongBits = zbt(obj, j8);
                        byte[] bArr10 = zbuo.zbb;
                        iZbc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i5 + iZbc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zbM(obj, i15, i13)) {
                        i5 = i12 * 53;
                        iZbc = zbo(obj, j8);
                        i12 = i5 + iZbc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zbM(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zbuo.zba(zbN(obj, j8));
                        i12 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zbM(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = ((String) zbws.zbf(obj, j8)).hashCode();
                        i12 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zbM(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zbws.zbf(obj, j8).hashCode();
                        i12 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zbM(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zbws.zbf(obj, j8).hashCode();
                        i12 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zbM(obj, i15, i13)) {
                        i5 = i12 * 53;
                        iZbc = zbo(obj, j8);
                        i12 = i5 + iZbc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zbM(obj, i15, i13)) {
                        i5 = i12 * 53;
                        iZbc = zbo(obj, j8);
                        i12 = i5 + iZbc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zbM(obj, i15, i13)) {
                        i5 = i12 * 53;
                        iZbc = zbo(obj, j8);
                        i12 = i5 + iZbc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zbM(obj, i15, i13)) {
                        i5 = i12 * 53;
                        jDoubleToLongBits = zbt(obj, j8);
                        byte[] bArr11 = zbuo.zbb;
                        iZbc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i5 + iZbc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zbM(obj, i15, i13)) {
                        i5 = i12 * 53;
                        iZbc = zbo(obj, j8);
                        i12 = i5 + iZbc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zbM(obj, i15, i13)) {
                        i5 = i12 * 53;
                        jDoubleToLongBits = zbt(obj, j8);
                        byte[] bArr12 = zbuo.zbb;
                        iZbc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i5 + iZbc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zbM(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zbws.zbf(obj, j8).hashCode();
                        i12 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = ((zbuf) obj).zbc.hashCode() + (i12 * 53);
        return this.zbh ? (iHashCode2 * 53) + ((zbub) obj).zbb.zba.hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zbc(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 4200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final Object zbe() {
        return ((zbuf) this.zbg).zbt();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zbf(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zbL(r8)
            if (r0 != 0) goto L8
            goto L95
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zbE(r2)
            r0.zba = r1
            r0.zbC()
        L1b:
            int[] r0 = r7.zbc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L87
            int r2 = r7.zbs(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zbr(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L71
            r5 = 60
            if (r2 == r5) goto L59
            r5 = 68
            if (r2 == r5) goto L59
            switch(r2) {
                case 17: goto L71;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L84
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L84
            r6 = r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg r6 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg) r6
            r6.zbc()
            r2.putObject(r8, r3, r5)
            goto L84
        L4f:
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r8, r3)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun) r2
            r2.zbb()
            goto L84
        L59:
            int[] r2 = r7.zbc
            r2 = r2[r1]
            boolean r2 = r7.zbM(r8, r2, r1)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r2 = r7.zbv(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zbf(r3)
            goto L84
        L71:
            boolean r2 = r7.zbI(r8, r1)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r2 = r7.zbv(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zbf(r3)
        L84:
            int r1 = r1 + 3
            goto L1d
        L87:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl r0 = r7.zbl
            r0.zbb(r8)
            boolean r0 = r7.zbh
            if (r0 == 0) goto L95
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtq r0 = r7.zbm
            r0.zba(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbg(Object obj, Object obj2) {
        zbA(obj);
        obj2.getClass();
        for (int i5 = 0; i5 < this.zbc.length; i5 += 3) {
            int iZbs = zbs(i5);
            int i10 = 1048575 & iZbs;
            int[] iArr = this.zbc;
            int iZbr = zbr(iZbs);
            int i11 = iArr[i5];
            long j8 = i10;
            switch (iZbr) {
                case 0:
                    if (zbI(obj2, i5)) {
                        zbws.zbo(obj, j8, zbws.zba(obj2, j8));
                        zbD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zbI(obj2, i5)) {
                        zbws.zbp(obj, j8, zbws.zbb(obj2, j8));
                        zbD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zbI(obj2, i5)) {
                        zbws.zbr(obj, j8, zbws.zbd(obj2, j8));
                        zbD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zbI(obj2, i5)) {
                        zbws.zbr(obj, j8, zbws.zbd(obj2, j8));
                        zbD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zbI(obj2, i5)) {
                        zbws.zbq(obj, j8, zbws.zbc(obj2, j8));
                        zbD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zbI(obj2, i5)) {
                        zbws.zbr(obj, j8, zbws.zbd(obj2, j8));
                        zbD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zbI(obj2, i5)) {
                        zbws.zbq(obj, j8, zbws.zbc(obj2, j8));
                        zbD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zbI(obj2, i5)) {
                        zbws.zbm(obj, j8, zbws.zbw(obj2, j8));
                        zbD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zbI(obj2, i5)) {
                        zbws.zbs(obj, j8, zbws.zbf(obj2, j8));
                        zbD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zbB(obj, obj2, i5);
                    break;
                case 10:
                    if (zbI(obj2, i5)) {
                        zbws.zbs(obj, j8, zbws.zbf(obj2, j8));
                        zbD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zbI(obj2, i5)) {
                        zbws.zbq(obj, j8, zbws.zbc(obj2, j8));
                        zbD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zbI(obj2, i5)) {
                        zbws.zbq(obj, j8, zbws.zbc(obj2, j8));
                        zbD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zbI(obj2, i5)) {
                        zbws.zbq(obj, j8, zbws.zbc(obj2, j8));
                        zbD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zbI(obj2, i5)) {
                        zbws.zbr(obj, j8, zbws.zbd(obj2, j8));
                        zbD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zbI(obj2, i5)) {
                        zbws.zbq(obj, j8, zbws.zbc(obj2, j8));
                        zbD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zbI(obj2, i5)) {
                        zbws.zbr(obj, j8, zbws.zbd(obj2, j8));
                        zbD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zbB(obj, obj2, i5);
                    break;
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
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zbun zbunVarZbd = (zbun) zbws.zbf(obj, j8);
                    zbun zbunVar = (zbun) zbws.zbf(obj2, j8);
                    int size = zbunVarZbd.size();
                    int size2 = zbunVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zbunVarZbd.zbc()) {
                            zbunVarZbd = zbunVarZbd.zbd(size2 + size);
                        }
                        zbunVarZbd.addAll(zbunVar);
                    }
                    if (size > 0) {
                        zbunVar = zbunVarZbd;
                    }
                    zbws.zbs(obj, j8, zbunVar);
                    break;
                case 50:
                    int i12 = zbvz.zba;
                    zbws.zbs(obj, j8, zbvh.zba(zbws.zbf(obj, j8), zbws.zbf(obj2, j8)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zbM(obj2, i11, i5)) {
                        zbws.zbs(obj, j8, zbws.zbf(obj2, j8));
                        zbE(obj, i11, i5);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zbC(obj, obj2, i5);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zbM(obj2, i11, i5)) {
                        zbws.zbs(obj, j8, zbws.zbf(obj2, j8));
                        zbE(obj, i11, i5);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zbC(obj, obj2, i5);
                    break;
            }
        }
        zbvz.zbp(this.zbl, obj, obj2);
        if (this.zbh) {
            zbvz.zbo(this.zbm, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbh(Object obj, byte[] bArr, int i5, int i10, zbsq zbsqVar) throws IOException {
        zbc(obj, bArr, i5, i10, 0, zbsqVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0219  */
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zbi(java.lang.Object r19, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbi(java.lang.Object, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final boolean zbj(Object obj, Object obj2) {
        boolean zZbE;
        for (int i5 = 0; i5 < this.zbc.length; i5 += 3) {
            int iZbs = zbs(i5);
            long j8 = iZbs & 1048575;
            switch (zbr(iZbs)) {
                case 0:
                    if (!zbH(obj, obj2, i5) || Double.doubleToLongBits(zbws.zba(obj, j8)) != Double.doubleToLongBits(zbws.zba(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zbH(obj, obj2, i5) || Float.floatToIntBits(zbws.zbb(obj, j8)) != Float.floatToIntBits(zbws.zbb(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zbH(obj, obj2, i5) || zbws.zbd(obj, j8) != zbws.zbd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zbH(obj, obj2, i5) || zbws.zbd(obj, j8) != zbws.zbd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zbH(obj, obj2, i5) || zbws.zbc(obj, j8) != zbws.zbc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zbH(obj, obj2, i5) || zbws.zbd(obj, j8) != zbws.zbd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zbH(obj, obj2, i5) || zbws.zbc(obj, j8) != zbws.zbc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zbH(obj, obj2, i5) || zbws.zbw(obj, j8) != zbws.zbw(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zbH(obj, obj2, i5) || !zbvz.zbE(zbws.zbf(obj, j8), zbws.zbf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zbH(obj, obj2, i5) || !zbvz.zbE(zbws.zbf(obj, j8), zbws.zbf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zbH(obj, obj2, i5) || !zbvz.zbE(zbws.zbf(obj, j8), zbws.zbf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zbH(obj, obj2, i5) || zbws.zbc(obj, j8) != zbws.zbc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zbH(obj, obj2, i5) || zbws.zbc(obj, j8) != zbws.zbc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zbH(obj, obj2, i5) || zbws.zbc(obj, j8) != zbws.zbc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zbH(obj, obj2, i5) || zbws.zbd(obj, j8) != zbws.zbd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zbH(obj, obj2, i5) || zbws.zbc(obj, j8) != zbws.zbc(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zbH(obj, obj2, i5) || zbws.zbd(obj, j8) != zbws.zbd(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zbH(obj, obj2, i5) || !zbvz.zbE(zbws.zbf(obj, j8), zbws.zbf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
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
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZbE = zbvz.zbE(zbws.zbf(obj, j8), zbws.zbf(obj2, j8));
                    break;
                case 50:
                    zZbE = zbvz.zbE(zbws.zbf(obj, j8), zbws.zbf(obj2, j8));
                    break;
                case 51:
                case 52:
                case 53:
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
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZbp = zbp(i5) & 1048575;
                    if (zbws.zbc(obj, jZbp) != zbws.zbc(obj2, jZbp) || !zbvz.zbE(zbws.zbf(obj, j8), zbws.zbf(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZbE) {
                return false;
            }
        }
        if (!((zbuf) obj).zbc.equals(((zbuf) obj2).zbc)) {
            return false;
        }
        if (this.zbh) {
            return ((zbub) obj).zbb.equals(((zbub) obj2).zbb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zbk(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbk(java.lang.Object):boolean");
    }
}
