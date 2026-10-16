package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Path;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class dtd {
    static Notification.Style a() {
        return new Notification.DecoratedCustomViewStyle();
    }

    public static Path b(String str) {
        Path path = new Path();
        try {
            c(d(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(String.valueOf(str)), e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static void c(dvf[] dvfVarArr, Path path) {
        int i;
        float[] fArr;
        int i2;
        dvf dvfVar;
        int i3;
        char c;
        int i4;
        float f;
        boolean z;
        float f2;
        float f3;
        dvf dvfVar2;
        boolean z2;
        float f4;
        float f5;
        float f6;
        float f7;
        boolean z3;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        dvf[] dvfVarArr2 = dvfVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = dvfVarArr2.length;
        int i5 = 0;
        int i6 = 0;
        char c2 = 'm';
        while (i6 < length) {
            dvf dvfVar3 = dvfVarArr2[i6];
            char c3 = dvfVar3.a;
            float[] fArr3 = dvfVar3.b;
            float f15 = fArr2[i5];
            float f16 = fArr2[1];
            float f17 = fArr2[2];
            float f18 = fArr2[3];
            float f19 = fArr2[4];
            int i7 = i5;
            float f20 = fArr2[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                    i = 2;
                    break;
            }
            float f21 = f19;
            float f22 = f20;
            float f23 = f15;
            float f24 = f16;
            int i8 = i7;
            while (i8 < fArr3.length) {
                if (c3 == 'A') {
                    fArr = fArr3;
                    i2 = i8;
                    dvfVar = dvfVar3;
                    float f25 = f23;
                    float f26 = f24;
                    i3 = i6;
                    c = c3;
                    int i9 = i2 + 6;
                    int i10 = i2 + 5;
                    int i11 = i2 + 4;
                    float f27 = fArr[i10];
                    float f28 = fArr[i9];
                    float f29 = fArr[i2];
                    float f30 = fArr[i2 + 1];
                    float f31 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != BitmapDescriptorFactory.HUE_RED) {
                        i4 = i11;
                        f = f30;
                        z = 1;
                    } else {
                        i4 = i11;
                        f = f30;
                        z = i7;
                    }
                    dvf.a(path, f25, f26, f27, f28, f29, f, f31, z, fArr[i4] != BitmapDescriptorFactory.HUE_RED ? 1 : i7);
                    f17 = fArr[i10];
                    f2 = fArr[i9];
                    f18 = f2;
                    f3 = f17;
                } else if (c3 == 'C') {
                    fArr = fArr3;
                    i2 = i8;
                    i3 = i6;
                    dvfVar = dvfVar3;
                    c = c3;
                    int i12 = i2 + 5;
                    int i13 = i2 + 4;
                    int i14 = i2 + 3;
                    int i15 = i2 + 2;
                    path2.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i15], fArr[i14], fArr[i13], fArr[i12]);
                    float f32 = fArr[i13];
                    float f33 = fArr[i12];
                    f17 = fArr[i15];
                    f18 = fArr[i14];
                    f2 = f33;
                    f3 = f32;
                } else if (c3 == 'H') {
                    fArr = fArr3;
                    i2 = i8;
                    dvfVar = dvfVar3;
                    c = c3;
                    f2 = f24;
                    i3 = i6;
                    path2.lineTo(fArr[i2], f2);
                    f3 = fArr[i2];
                } else if (c3 == 'Q') {
                    fArr = fArr3;
                    i2 = i8;
                    i3 = i6;
                    dvfVar = dvfVar3;
                    c = c3;
                    int i16 = i2 + 3;
                    int i17 = i2 + 2;
                    int i18 = i2 + 1;
                    path2.quadTo(fArr[i2], fArr[i18], fArr[i17], fArr[i16]);
                    float f34 = fArr[i2];
                    float f35 = fArr[i18];
                    f3 = fArr[i17];
                    f18 = f35;
                    f2 = fArr[i16];
                    f17 = f34;
                } else if (c3 == 'V') {
                    fArr = fArr3;
                    i2 = i8;
                    i3 = i6;
                    dvfVar = dvfVar3;
                    f3 = f23;
                    c = c3;
                    path2.lineTo(f3, fArr[i2]);
                    f2 = fArr[i2];
                } else if (c3 != 'a') {
                    if (c3 == 'c') {
                        fArr = fArr3;
                        i2 = i8;
                        int i19 = i2 + 5;
                        int i20 = i2 + 4;
                        int i21 = i2 + 3;
                        int i22 = i2 + 2;
                        path2.rCubicTo(fArr[i2], fArr[i2 + 1], fArr[i22], fArr[i21], fArr[i20], fArr[i19]);
                        float f36 = fArr[i22] + f23;
                        float f37 = fArr[i21] + f24;
                        f23 += fArr[i20];
                        f24 += fArr[i19];
                        f17 = f36;
                        f18 = f37;
                    } else if (c3 == 'h') {
                        fArr = fArr3;
                        i2 = i8;
                        path2.rLineTo(fArr[i2], BitmapDescriptorFactory.HUE_RED);
                        f23 += fArr[i2];
                    } else if (c3 != 'q') {
                        if (c3 != 'v') {
                            if (c3 != 'L') {
                                if (c3 == 'M') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    f9 = fArr[i2];
                                    f10 = fArr[i2 + 1];
                                    if (i2 > 0) {
                                        path2.lineTo(f9, f10);
                                    } else {
                                        path2.moveTo(f9, f10);
                                        f21 = f9;
                                        f2 = f10;
                                        f22 = f2;
                                        i3 = i6;
                                        c = c3;
                                        f3 = f21;
                                    }
                                } else if (c3 == 'S') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    int i23 = i2 + 3;
                                    int i24 = i2 + 2;
                                    int i25 = i2 + 1;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f24 = (f24 + f24) - f18;
                                        f23 = (f23 + f23) - f17;
                                    }
                                    path2.cubicTo(f23, f24, fArr[i2], fArr[i25], fArr[i24], fArr[i23]);
                                    f17 = fArr[i2];
                                    f18 = fArr[i25];
                                    f3 = fArr[i24];
                                    i3 = i6;
                                    c = c3;
                                    f2 = fArr[i23];
                                } else if (c3 == 'T') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    int i26 = i2 + 1;
                                    if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                        f24 = (f24 + f24) - f18;
                                        f23 = (f23 + f23) - f17;
                                    }
                                    path2.quadTo(f23, f24, fArr[i2], fArr[i26]);
                                    float f38 = fArr[i2];
                                    f2 = fArr[i26];
                                    f17 = f23;
                                    f18 = f24;
                                    f3 = f38;
                                    i3 = i6;
                                    dvfVar = dvfVar3;
                                    c = c3;
                                } else if (c3 == 'l') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    int i27 = i2 + 1;
                                    path2.rLineTo(fArr[i2], fArr[i27]);
                                    f23 += fArr[i2];
                                    f8 = fArr[i27];
                                } else if (c3 == 'm') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    float f39 = fArr[i2];
                                    f23 += f39;
                                    float f40 = fArr[i2 + 1];
                                    f24 += f40;
                                    if (i2 > 0) {
                                        path2.rLineTo(f39, f40);
                                    } else {
                                        path2.rMoveTo(f39, f40);
                                        dvfVar = dvfVar3;
                                        f3 = f23;
                                        f21 = f3;
                                        f2 = f24;
                                        f22 = f2;
                                        i3 = i6;
                                        c = c3;
                                    }
                                } else if (c3 != 's') {
                                    if (c3 == 't') {
                                        int i28 = i8 + 1;
                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                            f13 = f24 - f18;
                                            f14 = f23 - f17;
                                        } else {
                                            f13 = BitmapDescriptorFactory.HUE_RED;
                                            f14 = BitmapDescriptorFactory.HUE_RED;
                                        }
                                        path2.rQuadTo(f14, f13, fArr3[i8], fArr3[i28]);
                                        float f41 = f14 + f23;
                                        float f42 = f13 + f24;
                                        f23 += fArr3[i8];
                                        f24 += fArr3[i28];
                                        f18 = f42;
                                        f17 = f41;
                                    }
                                    fArr = fArr3;
                                    i2 = i8;
                                    dvfVar = dvfVar3;
                                    f3 = f23;
                                    f2 = f24;
                                    i3 = i6;
                                    c = c3;
                                } else {
                                    int i29 = i8 + 3;
                                    int i30 = i8 + 2;
                                    int i31 = i8 + 1;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f11 = f24 - f18;
                                        f12 = f23 - f17;
                                    } else {
                                        f12 = BitmapDescriptorFactory.HUE_RED;
                                        f11 = BitmapDescriptorFactory.HUE_RED;
                                    }
                                    int i32 = i8;
                                    fArr = fArr3;
                                    i2 = i32;
                                    path2.rCubicTo(f12, f11, fArr3[i32], fArr3[i31], fArr3[i30], fArr3[i29]);
                                    float f43 = fArr[i2] + f23;
                                    float f44 = fArr[i31] + f24;
                                    f23 += fArr[i30];
                                    f24 += fArr[i29];
                                    f17 = f43;
                                    f18 = f44;
                                }
                                dvfVar = dvfVar3;
                            } else {
                                fArr = fArr3;
                                i2 = i8;
                                int i33 = i2 + 1;
                                path2.lineTo(fArr[i2], fArr[i33]);
                                f9 = fArr[i2];
                                f10 = fArr[i33];
                            }
                            f2 = f10;
                            i3 = i6;
                            c = c3;
                            f3 = f9;
                            dvfVar = dvfVar3;
                        } else {
                            fArr = fArr3;
                            i2 = i8;
                            path2.rLineTo(BitmapDescriptorFactory.HUE_RED, fArr[i2]);
                            f8 = fArr[i2];
                        }
                        f24 += f8;
                    } else {
                        fArr = fArr3;
                        i2 = i8;
                        int i34 = i2 + 3;
                        int i35 = i2 + 2;
                        int i36 = i2 + 1;
                        path2.rQuadTo(fArr[i2], fArr[i36], fArr[i35], fArr[i34]);
                        float f45 = fArr[i2] + f23;
                        float f46 = fArr[i36] + f24;
                        f23 += fArr[i35];
                        f24 += fArr[i34];
                        f18 = f46;
                        f17 = f45;
                    }
                    dvfVar = dvfVar3;
                    f3 = f23;
                    f2 = f24;
                    i3 = i6;
                    c = c3;
                } else {
                    fArr = fArr3;
                    i2 = i8;
                    int i37 = i2 + 6;
                    int i38 = i2 + 5;
                    int i39 = i2 + 4;
                    float f47 = fArr[i38] + f23;
                    float f48 = fArr[i37] + f24;
                    float f49 = fArr[i2];
                    float f50 = fArr[i2 + 1];
                    float f51 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != BitmapDescriptorFactory.HUE_RED) {
                        dvfVar2 = dvfVar3;
                        z2 = 1;
                    } else {
                        dvfVar2 = dvfVar3;
                        z2 = i7;
                    }
                    if (fArr[i39] != BitmapDescriptorFactory.HUE_RED) {
                        f4 = f50;
                        f5 = f24;
                        i3 = i6;
                        f6 = f51;
                        f7 = f23;
                        c = c3;
                        z3 = 1;
                    } else {
                        f4 = f50;
                        f5 = f24;
                        i3 = i6;
                        f6 = f51;
                        f7 = f23;
                        c = c3;
                        z3 = i7;
                    }
                    dvfVar = dvfVar2;
                    dvf.a(path, f7, f5, f47, f48, f49, f4, f6, z2, z3);
                    f3 = f7 + fArr[i38];
                    f2 = f5 + fArr[i37];
                    f17 = f3;
                    f18 = f2;
                }
                i8 = i2 + i;
                path2 = path;
                dvfVar3 = dvfVar;
                c3 = c;
                i6 = i3;
                f23 = f3;
                f24 = f2;
                c2 = c3;
                fArr3 = fArr;
            }
            fArr2[i7] = f23;
            fArr2[1] = f24;
            fArr2[2] = f17;
            fArr2[3] = f18;
            fArr2[4] = f21;
            fArr2[5] = f22;
            c2 = dvfVar3.a;
            i6++;
            dvfVarArr2 = dvfVarArr;
            path2 = path;
            i5 = i7;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1 A[Catch: NumberFormatException -> 0x00d4, LOOP:3: B:32:0x0084->B:51:0x00b1, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:29:0x0070, B:32:0x0084, B:34:0x008a, B:38:0x0096, B:51:0x00b1, B:53:0x00b7, B:56:0x00c8, B:58:0x00cd), top: B:67:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7 A[Catch: NumberFormatException -> 0x00d4, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:29:0x0070, B:32:0x0084, B:34:0x008a, B:38:0x0096, B:51:0x00b1, B:53:0x00b7, B:56:0x00c8, B:58:0x00cd), top: B:67:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8 A[Catch: NumberFormatException -> 0x00d4, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:29:0x0070, B:32:0x0084, B:34:0x008a, B:38:0x0096, B:51:0x00b1, B:53:0x00b7, B:56:0x00c8, B:58:0x00cd), top: B:67:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dvf[] d(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtd.d(java.lang.String):dvf[]");
    }

    public static dvf[] e(dvf[] dvfVarArr) {
        dvf[] dvfVarArr2 = new dvf[dvfVarArr.length];
        for (int i = 0; i < dvfVarArr.length; i++) {
            dvfVarArr2[i] = new dvf(dvfVarArr[i]);
        }
        return dvfVarArr2;
    }

    public static float[] f(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int iMin = Math.min(i, fArr.length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static final eip g(eiw eiwVar, byte[] bArr) {
        if (eiwVar.b() == 0) {
            return new ein(bArr);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public static final void h(Object obj, cfy cfyVar, cmw cmwVar, cmw cmwVar2, cmw cmwVar3, afec afecVar, cfn cfnVar, csi csiVar, float f, cjw cjwVar, int i, bux buxVar, int i2, int i3) {
        int i4;
        cfy cfyVar2;
        cfn cfnVar2;
        csi csiVar2;
        int i5;
        cjw cjwVar2;
        cmw cmwVar4;
        int i6;
        cmw cmwVar5;
        int i7;
        cmw cmwVar6;
        ugn ugnVar;
        int i8 = i2 & 6;
        bux buxVarC = buxVar.c(2027616330);
        if (i8 == 0) {
            i4 = (true != buxVarC.E(obj) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != buxVarC.C(null) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            cfyVar2 = cfyVar;
            i4 |= true != buxVarC.C(cfyVar2) ? 128 : 256;
        } else {
            cfyVar2 = cfyVar;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != ((i2 & 4096) == 0 ? buxVarC.C(cmwVar) : buxVarC.E(cmwVar)) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != ((i2 & 32768) == 0 ? buxVarC.C(cmwVar2) : buxVarC.E(cmwVar2)) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= 65536;
        }
        int i9 = i4 | 1572864;
        if ((12582912 & i2) == 0) {
            i9 |= true != buxVarC.E(afecVar) ? 4194304 : 8388608;
        }
        int i10 = i9 | 100663296;
        if ((805306368 & i2) == 0) {
            cfnVar2 = cfnVar;
            i10 |= true != buxVarC.C(cfnVar2) ? 268435456 : 536870912;
        } else {
            cfnVar2 = cfnVar;
        }
        if ((i3 & 6) == 0) {
            csiVar2 = csiVar;
            i5 = i3 | (true != buxVarC.C(csiVar2) ? 2 : 4);
        } else {
            csiVar2 = csiVar;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != buxVarC.z(f) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            cjwVar2 = cjwVar;
            i5 |= true != buxVarC.C(cjwVar2) ? 128 : 256;
        } else {
            cjwVar2 = cjwVar;
        }
        if ((i3 & 3072) == 0) {
            i5 |= 1024;
        }
        if (buxVarC.I(((306783379 & i10) == 306783378 && (i5 & 1171) == 1170) ? false : true, i10 & 1)) {
            int i11 = i5 & (-7169);
            int i12 = (-458753) & i10;
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i2 & 1) == 0 || buxVarC.F()) {
                cmwVar5 = cmwVar2;
                i7 = 1;
            } else {
                buxVarC.s();
                cmwVar5 = cmwVar3;
                i7 = i;
            }
            buxVarC.l();
            ugn ugnVar2 = (ugn) buxVarC.f(fqg.a);
            if (ugnVar2 == null) {
                buxVarC.v(-805878595);
                ugn ugnVarA = fpn.a((Context) buxVarC.f(daa.b));
                bvvVar.Y(false);
                cmw cmwVar7 = cmwVar5;
                ugnVar = ugnVarA;
                cmwVar6 = cmwVar7;
            } else {
                cmwVar6 = cmwVar5;
                buxVarC.v(-805879866);
                bvvVar.Y(false);
                ugnVar = ugnVar2;
            }
            int i13 = i12 << 3;
            int i14 = i11 << 3;
            i6 = i7;
            cfy cfyVar3 = cfyVar2;
            cmwVar4 = cmwVar6;
            p(obj, ugnVar, cfyVar3, cmwVar, cmwVar2, cmwVar4, afecVar, cfnVar2, csiVar2, f, cjwVar2, i6, buxVarC, (i13 & 1879048192) | (i10 & 126) | (i13 & 7168) | 32768 | (57344 & i13) | 262144 | (458752 & i13) | 2097152 | (29360128 & i13) | (234881024 & i13), (i14 & 7168) | ((i10 >> 27) & 14) | (i14 & 112) | (i14 & 896));
        } else {
            buxVarC.s();
            cmwVar4 = cmwVar3;
            i6 = i;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new lfo(obj, cfyVar, cmwVar, cmwVar2, cmwVar4, afecVar, cfnVar, csiVar, f, cjwVar, i6, i2, i3, 1);
        }
    }

    static /* synthetic */ void i(String str) {
        s(str, a.bq(str, "If you wish to display this ", ", use androidx.compose.foundation.Image."));
    }

    public static final void j(cfy cfyVar, cmw cmwVar, cfn cfnVar, csi csiVar, float f, cjw cjwVar, bux buxVar, int i) {
        int i2;
        cfn cfnVar2;
        csi csiVar2;
        float f2;
        cjw cjwVar2;
        cfyVar.getClass();
        cmwVar.getClass();
        cfnVar.getClass();
        csiVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(10290533);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(cmwVar) : buxVarC.E(cmwVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            cfnVar2 = cfnVar;
            i2 |= true != buxVarC.C(cfnVar2) ? 1024 : 2048;
        } else {
            cfnVar2 = cfnVar;
        }
        if ((i & 24576) == 0) {
            csiVar2 = csiVar;
            i2 |= true != buxVarC.C(csiVar2) ? 8192 : 16384;
        } else {
            csiVar2 = csiVar;
        }
        if ((196608 & i) == 0) {
            f2 = f;
            i2 |= true != buxVarC.z(f2) ? 65536 : 131072;
        } else {
            f2 = f;
        }
        if ((1572864 & i) == 0) {
            cjwVar2 = cjwVar;
            i2 |= true != buxVarC.C(cjwVar2) ? 524288 : 1048576;
        } else {
            cjwVar2 = cjwVar;
        }
        if (buxVarC.I((599187 & i2) != 599186, i2 & 1)) {
            cfy cfyVarA = cjn.g(cfyVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, true, 0, 1044479).a(new fqf(cmwVar, cfnVar2, csiVar2, f2, cjwVar2));
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = dna.c;
                bvvVar.ad(objS);
            }
            ctp ctpVar = (ctp) objS;
            int iG = a.g(bvvVar.u);
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarA);
            ccx ccxVarAh = bvvVar.ah();
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVar, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new fzq(cfyVar, cmwVar, cfnVar, csiVar, f, cjwVar, i, 1);
        }
    }

    public static final void k(fse fseVar, Class cls, List list) {
        list.add(new aezu(fseVar, cls));
    }

    public static final void l(frl frlVar, Class cls, List list) {
        list.add(new aezu(frlVar, cls));
    }

    public static final void m(fsb fsbVar, Class cls, List list) {
        list.add(new aezu(fsbVar, cls));
    }

    public static final fqd n(Object obj, ugn ugnVar, afec afecVar, afec afecVar2, csi csiVar, int i, bux buxVar) {
        fsy fsyVarD = fqh.d(obj, buxVar);
        Object obj2 = fsyVarD.b;
        if (obj2 instanceof fsw) {
            s("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new aezp();
        }
        if (obj2 instanceof cjj) {
            i("ImageBitmap");
            throw new aezp();
        }
        if (obj2 instanceof cng) {
            i("ImageVector");
            throw new aezp();
        }
        if (obj2 instanceof cmw) {
            i("Painter");
            throw new aezp();
        }
        if (fsyVarD.c != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
        bvv bvvVar = (bvv) buxVar;
        Object objS = bvvVar.S();
        if (objS == buw.a) {
            objS = new fqd(fsyVarD, ugnVar);
            bvvVar.ad(objS);
        }
        fqd fqdVar = (fqd) objS;
        fqdVar.b = afecVar;
        fqdVar.c = afecVar2;
        csiVar.getClass();
        fqdVar.d = csiVar;
        fqdVar.e = i;
        fqdVar.f = ((Boolean) buxVar.f(dbo.a)).booleanValue();
        fqdVar.h.b(ugnVar);
        fsyVarD.getClass();
        fqdVar.g.b(fsyVarD);
        fqdVar.eo();
        return fqdVar;
    }

    public static final void o(final Object obj, final ugn ugnVar, final cfy cfyVar, final afec afecVar, final afec afecVar2, final cfn cfnVar, final csi csiVar, final float f, final cjw cjwVar, final int i, bux buxVar, final int i2, final int i3) {
        int i4;
        afec afecVar3;
        afec afecVar4;
        cfn cfnVar2;
        float f2;
        cjw cjwVar2;
        int i5;
        int i6;
        fto ftlVar;
        boolean z;
        int i7 = i2 & 6;
        bux buxVarC = buxVar.c(-2030202961);
        if (i7 == 0) {
            i4 = (true != buxVarC.E(obj) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != buxVarC.C(null) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != ((i2 & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(ugnVar) : buxVarC.E(ugnVar)) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != buxVarC.C(cfyVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            afecVar3 = afecVar;
            i4 |= true != buxVarC.E(afecVar3) ? 8192 : 16384;
        } else {
            afecVar3 = afecVar;
        }
        if ((196608 & i2) == 0) {
            afecVar4 = afecVar2;
            i4 |= true != buxVarC.E(afecVar4) ? 65536 : 131072;
        } else {
            afecVar4 = afecVar2;
        }
        if ((1572864 & i2) == 0) {
            cfnVar2 = cfnVar;
            i4 |= true != buxVarC.C(cfnVar2) ? 524288 : 1048576;
        } else {
            cfnVar2 = cfnVar;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != buxVarC.C(csiVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            f2 = f;
            i4 |= true != buxVarC.z(f2) ? 33554432 : 67108864;
        } else {
            f2 = f;
        }
        if ((805306368 & i2) == 0) {
            cjwVar2 = cjwVar;
            i4 |= true != buxVarC.C(cjwVar2) ? 268435456 : 536870912;
        } else {
            cjwVar2 = cjwVar;
        }
        int i8 = i4;
        if ((i3 & 6) == 0) {
            i5 = i;
            i6 = i3 | (true != buxVarC.A(i5) ? 2 : 4);
        } else {
            i5 = i;
            i6 = i3;
        }
        if (buxVarC.I(((i8 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true, i8 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i2 & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            fsy fsyVarD = fqh.d(obj, buxVarC);
            fsyVarD.getClass();
            csiVar.getClass();
            if (fsyVarD.x.a == null) {
                buxVarC.v(-279205842);
                if (affa.f(csiVar, csh.f)) {
                    buxVarC.v(-279144524);
                    bvvVar.Y(false);
                    ftlVar = new ftl(ftn.a);
                    z = false;
                } else {
                    buxVarC.v(-279083795);
                    Object objS = bvvVar.S();
                    if (objS == buw.a) {
                        objS = new fqe();
                        bvvVar.ad(objS);
                    }
                    ftlVar = (fqe) objS;
                    z = false;
                    bvvVar.Y(false);
                }
                fsw fswVarA = fsy.a(fsyVarD);
                fswVarA.e(ftlVar);
                fsyVarD = fswVarA.a();
                bvvVar.Y(z);
            } else {
                buxVarC.v(-278956044);
                bvvVar.Y(false);
            }
            int i9 = i8 >> 9;
            fsy fsyVar = fsyVarD;
            fqd fqdVarN = n(fsyVar, ugnVar, afecVar3, afecVar4, csiVar, i5, buxVarC);
            fto ftoVar = fsyVar.v;
            j(ftoVar instanceof fqe ? cfyVar.a((cfy) ftoVar) : cfyVar, fqdVarN, cfnVar2, csiVar, f2, cjwVar2, buxVarC, (57344 & i9) | ((i8 << 3) & 896) | (i9 & 7168) | (458752 & i9) | (3670016 & i9));
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: fpu
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    Object obj4 = obj;
                    ugn ugnVar2 = ugnVar;
                    cfy cfyVar2 = cfyVar;
                    afec afecVar5 = afecVar;
                    afec afecVar6 = afecVar2;
                    cfn cfnVar3 = cfnVar;
                    int i10 = i2;
                    csi csiVar2 = csiVar;
                    int i11 = i3;
                    int i12 = i10 | 1;
                    int i13 = i11 & 306783378;
                    int i14 = 306783378 & i12;
                    cjw cjwVar3 = cjwVar;
                    int i15 = i11 & 613566756;
                    int i16 = i12 & 613566756;
                    int i17 = i;
                    dtd.o(obj4, ugnVar2, cfyVar2, afecVar5, afecVar6, cfnVar3, csiVar2, f, cjwVar3, i17, (bux) obj2, (i12 & (-920350135)) | i14 | (i16 >> 1) | ((i14 + i14) & i16), (i11 & (-920350135)) | i13 | (i15 >> 1) | ((i13 + i13) & i15));
                    return afak.a;
                }
            };
        }
    }

    public static final void p(final Object obj, final ugn ugnVar, final cfy cfyVar, final cmw cmwVar, final cmw cmwVar2, final cmw cmwVar3, final afec afecVar, final cfn cfnVar, final csi csiVar, final float f, final cjw cjwVar, final int i, bux buxVar, final int i2, final int i3) {
        Object obj2;
        int i4;
        cfy cfyVar2;
        cfn cfnVar2;
        int i5;
        float f2;
        ugnVar.getClass();
        int i6 = i2 & 6;
        bux buxVarC = buxVar.c(-245964807);
        if (i6 == 0) {
            obj2 = obj;
            i4 = (true != buxVarC.E(obj2) ? 2 : 4) | i2;
        } else {
            obj2 = obj;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != buxVarC.C(null) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != ((i2 & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(ugnVar) : buxVarC.E(ugnVar)) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            cfyVar2 = cfyVar;
            i4 |= true != buxVarC.C(cfyVar2) ? 1024 : 2048;
        } else {
            cfyVar2 = cfyVar;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != ((32768 & i2) == 0 ? buxVarC.C(cmwVar) : buxVarC.E(cmwVar)) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != ((262144 & i2) == 0 ? buxVarC.C(cmwVar2) : buxVarC.E(cmwVar2)) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != ((2097152 & i2) == 0 ? buxVarC.C(cmwVar3) : buxVarC.E(cmwVar3)) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != buxVarC.E(null) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != buxVarC.E(afecVar) ? 33554432 : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != buxVarC.E(null) ? 268435456 : 536870912;
        }
        if ((i3 & 6) == 0) {
            cfnVar2 = cfnVar;
            i5 = i3 | (true != buxVarC.C(cfnVar2) ? 2 : 4);
        } else {
            cfnVar2 = cfnVar;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != buxVarC.C(csiVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            f2 = f;
            i5 |= true == buxVarC.z(f2) ? 256 : 128;
        } else {
            f2 = f;
        }
        if ((i3 & 3072) == 0) {
            i5 |= true == buxVarC.C(cjwVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= true == buxVarC.A(i) ? 16384 : 8192;
        }
        if (buxVarC.I(((306783379 & i4) == 306783378 && (i5 & 9363) == 9362) ? false : true, i4 & 1)) {
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i2 & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            int i7 = i5 << 18;
            o(obj2, ugnVar, cfyVar2, fqh.c(cmwVar, cmwVar2, cmwVar3), fqh.b(null, afecVar, null), cfnVar2, csiVar, f2, cjwVar, i, buxVarC, (i4 & 8190) | (3670016 & i7) | (29360128 & i7) | (234881024 & i7) | (i7 & 1879048192), (i5 >> 12) & 14);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: fpt
                @Override // defpackage.afeg
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    Object obj5 = obj;
                    ugn ugnVar2 = ugnVar;
                    cfy cfyVar3 = cfyVar;
                    cmw cmwVar4 = cmwVar;
                    cmw cmwVar5 = cmwVar2;
                    cmw cmwVar6 = cmwVar3;
                    afec afecVar2 = afecVar;
                    cfn cfnVar3 = cfnVar;
                    int i8 = i2;
                    csi csiVar2 = csiVar;
                    int i9 = i3;
                    int i10 = i8 | 1;
                    int i11 = i9 & 306783378;
                    int i12 = 306783378 & i10;
                    cjw cjwVar2 = cjwVar;
                    int i13 = i9 & 613566756;
                    int i14 = i10 & 613566756;
                    int i15 = i;
                    dtd.p(obj5, ugnVar2, cfyVar3, cmwVar4, cmwVar5, cmwVar6, afecVar2, cfnVar3, csiVar2, f, cjwVar2, i15, (bux) obj3, (i10 & (-920350135)) | i12 | (i14 >> 1) | ((i12 + i12) & i14), (i9 & (-920350135)) | i11 | (i13 >> 1) | ((i11 + i11) & i13));
                    return afak.a;
                }
            };
        }
    }

    public static final ajdr q(List list, List list2, List list3, List list4, List list5) {
        return new ajdr(a.bd(list), a.bd(list2), a.bd(list3), a.bd(list4), a.bd(list5));
    }

    private static void r(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new dvf(c, fArr));
    }

    private static final void s(String str, String str2) {
        throw new IllegalArgumentException(a.bM(str2, str, "Unsupported type: ", ". "));
    }
}
