package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class czz {
    public czz() {
    }

    public static long A(long j, float f, float f2) {
        if (Float.isNaN(f)) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if (Float.isNaN(f2)) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static void B(col colVar, Map map, bux buxVar, int i) {
        int i2;
        cok cokVar;
        int i3;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-446179233);
        int i5 = 1;
        if (i4 == 0) {
            i2 = (true != buxVarC.C(colVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(map) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cok cokVar2 = new cok(colVar);
            while (cokVar2.hasNext()) {
                czz czzVarA = cokVar2.next();
                if (czzVarA instanceof cop) {
                    buxVarC.v(798472779);
                    cop copVar = (cop) czzVarA;
                    String str = copVar.a;
                    coj cooVar = (coj) map.get(str);
                    if (cooVar == null) {
                        cooVar = new coo(i5);
                    }
                    bux buxVar2 = buxVarC;
                    cokVar = cokVar2;
                    i3 = 1;
                    rl.h((List) cooVar.a(cos.a, copVar.b), copVar.c, str, (cjs) cooVar.a(coq.a, copVar.d), ((Number) cooVar.a(cor.a, Float.valueOf(copVar.e))).floatValue(), (cjs) cooVar.a(coy.a, copVar.f), ((Number) cooVar.a(coz.a, Float.valueOf(copVar.g))).floatValue(), ((Number) cooVar.a(cpa.a, Float.valueOf(copVar.h))).floatValue(), copVar.i, copVar.j, copVar.k, ((Number) cooVar.a(cpf.a, Float.valueOf(copVar.l))).floatValue(), ((Number) cooVar.a(cpd.a, Float.valueOf(copVar.m))).floatValue(), ((Number) cooVar.a(cpe.a, Float.valueOf(copVar.n))).floatValue(), buxVar2, 0, 0);
                    buxVarC = buxVar2;
                    ((bvv) buxVarC).Y(false);
                } else {
                    cokVar = cokVar2;
                    i3 = i5;
                    if (czzVarA instanceof col) {
                        buxVarC.v(799887340);
                        col colVar2 = (col) czzVarA;
                        String str2 = colVar2.a;
                        coj cooVar2 = (coj) map.get(str2);
                        if (cooVar2 == null) {
                            cooVar2 = new coo(0);
                        }
                        i3 = 1;
                        rl.g(str2, ((Number) cooVar2.a(cov.a, Float.valueOf(colVar2.b))).floatValue(), ((Number) cooVar2.a(cot.a, Float.valueOf(colVar2.c))).floatValue(), ((Number) cooVar2.a(cou.a, Float.valueOf(colVar2.d))).floatValue(), ((Number) cooVar2.a(cow.a, Float.valueOf(colVar2.e))).floatValue(), ((Number) cooVar2.a(cox.a, Float.valueOf(colVar2.f))).floatValue(), ((Number) cooVar2.a(cpb.a, Float.valueOf(colVar2.g))).floatValue(), ((Number) cooVar2.a(cpc.a, Float.valueOf(colVar2.h))).floatValue(), (List) cooVar2.a(cos.a, colVar2.i), bxc.i(1450046638, true, new bmc(czzVarA, map, 9), buxVarC), buxVarC, 805306368);
                        ((bvv) buxVarC).Y(false);
                    } else {
                        buxVarC.v(800893507);
                        ((bvv) buxVarC).Y(false);
                    }
                }
                i5 = i3;
                cokVar2 = cokVar;
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bro(colVar, map, i, 2);
        }
    }

    public static void C(cnd cndVar, col colVar) {
        List list = colVar.j;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            czz czzVar = (czz) list.get(i);
            if (czzVar instanceof cop) {
                cnh cnhVar = new cnh();
                cop copVar = (cop) czzVar;
                cnhVar.e(copVar.b);
                cnhVar.f(copVar.c);
                String str = copVar.a;
                cnhVar.q();
                cnhVar.a(copVar.d);
                cnhVar.d(copVar.e);
                cnhVar.g(copVar.f);
                cnhVar.i(copVar.g);
                cnhVar.m(copVar.h);
                cnhVar.j(copVar.i);
                cnhVar.k(copVar.j);
                cnhVar.l(copVar.k);
                cnhVar.p(copVar.l);
                cnhVar.n(copVar.m);
                cnhVar.o(copVar.n);
                cndVar.d(i, cnhVar);
            } else if (czzVar instanceof col) {
                cnd cndVar2 = new cnd();
                col colVar2 = (col) czzVar;
                cndVar2.i(colVar2.a);
                cndVar2.l(colVar2.b);
                cndVar2.m(colVar2.e);
                cndVar2.n(colVar2.f);
                cndVar2.o(colVar2.g);
                cndVar2.p(colVar2.h);
                cndVar2.j(colVar2.c);
                cndVar2.k(colVar2.d);
                cndVar2.g(colVar2.i);
                C(cndVar2, colVar2);
                cndVar.d(i, cndVar2);
            }
        }
    }

    public static con D(cng cngVar, bux buxVar) {
        dlg dlgVar = (dlg) buxVar.f(dbc.d);
        boolean zB = buxVar.B((Float.floatToRawIntBits(cngVar.l) << 32) | (Float.floatToRawIntBits(dlgVar.a()) & 4294967295L));
        Object objG = buxVar.g();
        if (zB || objG == buw.a) {
            cnd cndVar = new cnd();
            C(cndVar, cngVar.h);
            long jZ = z(dlgVar, cngVar.d, cngVar.e);
            long jA = A(jZ, cngVar.f, cngVar.g);
            con conVar = new con(cndVar);
            String str = cngVar.c;
            long j = cngVar.i;
            cjp cjpVar = j != 16 ? new cjp(j, cngVar.j) : null;
            boolean z = cngVar.k;
            conVar.j(jZ);
            conVar.g(z);
            conVar.h(cjpVar);
            conVar.k(jA);
            conVar.i(str);
            buxVar.x(conVar);
            objG = conVar;
        }
        return (con) objG;
    }

    public static void E(List list, cjm cjmVar) {
        int i;
        float f;
        int i2;
        cob cobVar;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        List list2 = list;
        cjm cjmVar2 = cjmVar;
        int iA = cjmVar2.a();
        cjmVar2.k();
        cjmVar2.l(iA);
        cob cobVar2 = list2.isEmpty() ? cnj.a : (cob) list2.get(0);
        int size = list2.size();
        float f16 = BitmapDescriptorFactory.HUE_RED;
        int i3 = 0;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        while (i3 < size) {
            cob cobVar3 = (cob) list2.get(i3);
            if (cobVar3 instanceof cnj) {
                cjmVar2.a.close();
                i = size;
                f = f16;
                i2 = i3;
                cobVar = cobVar3;
                f17 = f21;
                f20 = f17;
                f18 = f22;
                f19 = f18;
            } else {
                if (cobVar3 instanceof cnv) {
                    cnv cnvVar = (cnv) cobVar3;
                    float f23 = cnvVar.a;
                    f19 += f23;
                    float f24 = cnvVar.b;
                    f20 += f24;
                    cjmVar2.a.rMoveTo(f23, f24);
                    i = size;
                    f = f16;
                    i2 = i3;
                    f22 = f19;
                    f21 = f20;
                } else {
                    if (cobVar3 instanceof cnn) {
                        cnn cnnVar = (cnn) cobVar3;
                        float f25 = cnnVar.a;
                        float f26 = cnnVar.b;
                        cjmVar2.e(f25, f26);
                        f20 = f26;
                        f21 = f20;
                        f19 = f25;
                        f22 = f19;
                    } else {
                        if (cobVar3 instanceof cnu) {
                            cnu cnuVar = (cnu) cobVar3;
                            float f27 = cnuVar.a;
                            f15 = cnuVar.b;
                            cjmVar2.h(f27, f15);
                            f19 += f27;
                        } else {
                            if (cobVar3 instanceof cnm) {
                                cnm cnmVar = (cnm) cobVar3;
                                f4 = cnmVar.a;
                                f5 = cnmVar.b;
                                cjmVar2.d(f4, f5);
                            } else if (cobVar3 instanceof cnt) {
                                float f28 = ((cnt) cobVar3).a;
                                cjmVar2.h(f28, f16);
                                f19 += f28;
                            } else if (cobVar3 instanceof cnl) {
                                float f29 = ((cnl) cobVar3).a;
                                cjmVar2.d(f29, f20);
                                f19 = f29;
                            } else if (cobVar3 instanceof cnz) {
                                f15 = ((cnz) cobVar3).a;
                                cjmVar2.h(f16, f15);
                            } else if (cobVar3 instanceof coa) {
                                float f30 = ((coa) cobVar3).a;
                                cjmVar2.d(f19, f30);
                                f20 = f30;
                            } else {
                                if (cobVar3 instanceof cns) {
                                    cns cnsVar = (cns) cobVar3;
                                    float f31 = cnsVar.a;
                                    float f32 = cnsVar.b;
                                    f11 = cnsVar.c;
                                    f12 = cnsVar.d;
                                    f13 = cnsVar.e;
                                    f14 = cnsVar.f;
                                    cjmVar2.g(f31, f32, f11, f12, f13, f14);
                                } else {
                                    if (cobVar3 instanceof cnk) {
                                        cnk cnkVar = (cnk) cobVar3;
                                        float f33 = cnkVar.a;
                                        float f34 = cnkVar.b;
                                        f18 = cnkVar.c;
                                        f6 = cnkVar.d;
                                        f7 = cnkVar.e;
                                        f8 = cnkVar.f;
                                        cjmVar.c(f33, f34, f18, f6, f7, f8);
                                    } else if (cobVar3 instanceof cnx) {
                                        if (cobVar2.h) {
                                            f9 = f19 - f18;
                                            f10 = f20 - f17;
                                        } else {
                                            f9 = f16;
                                            f10 = f9;
                                        }
                                        cnx cnxVar = (cnx) cobVar3;
                                        f11 = cnxVar.a;
                                        f12 = cnxVar.b;
                                        f13 = cnxVar.c;
                                        f14 = cnxVar.d;
                                        cjmVar.g(f9, f10, f11, f12, f13, f14);
                                    } else if (cobVar3 instanceof cnp) {
                                        if (cobVar2.h) {
                                            f20 = (f20 + f20) - f17;
                                            f19 = (f19 + f19) - f18;
                                        }
                                        cnp cnpVar = (cnp) cobVar3;
                                        f18 = cnpVar.a;
                                        f6 = cnpVar.b;
                                        f7 = cnpVar.c;
                                        f8 = cnpVar.d;
                                        cjmVar.c(f19, f20, f18, f6, f7, f8);
                                    } else if (cobVar3 instanceof cnw) {
                                        cnw cnwVar = (cnw) cobVar3;
                                        float f35 = cnwVar.a;
                                        float f36 = cnwVar.b;
                                        float f37 = cnwVar.c;
                                        float f38 = cnwVar.d;
                                        cjmVar.i(f35, f36, f37, f38);
                                        float f39 = f35 + f19;
                                        float f40 = f36 + f20;
                                        f19 += f37;
                                        f20 += f38;
                                        f18 = f39;
                                        f17 = f40;
                                    } else if (cobVar3 instanceof cno) {
                                        cno cnoVar = (cno) cobVar3;
                                        float f41 = cnoVar.a;
                                        float f42 = cnoVar.b;
                                        f4 = cnoVar.c;
                                        f5 = cnoVar.d;
                                        cjmVar.f(f41, f42, f4, f5);
                                        f18 = f41;
                                        f17 = f42;
                                    } else if (cobVar3 instanceof cny) {
                                        if (cobVar2.i) {
                                            f2 = f20 - f17;
                                            f3 = f19 - f18;
                                        } else {
                                            f2 = f16;
                                            f3 = f2;
                                        }
                                        cny cnyVar = (cny) cobVar3;
                                        float f43 = cnyVar.a;
                                        float f44 = cnyVar.b;
                                        cjmVar.i(f3, f2, f43, f44);
                                        float f45 = f3 + f19;
                                        float f46 = f2 + f20;
                                        f19 += f43;
                                        f20 += f44;
                                        f18 = f45;
                                        i = size;
                                        f = f16;
                                        i2 = i3;
                                        cobVar = cobVar3;
                                        f17 = f46;
                                    } else if (cobVar3 instanceof cnq) {
                                        if (cobVar2.i) {
                                            f20 = (f20 + f20) - f17;
                                            f19 = (f19 + f19) - f18;
                                        }
                                        cnq cnqVar = (cnq) cobVar3;
                                        float f47 = cnqVar.a;
                                        float f48 = cnqVar.b;
                                        cjmVar.f(f19, f20, f47, f48);
                                        i = size;
                                        f = f16;
                                        i2 = i3;
                                        f18 = f19;
                                        cobVar = cobVar3;
                                        f19 = f47;
                                        f17 = f20;
                                        f20 = f48;
                                    } else if (cobVar3 instanceof cnr) {
                                        double d = f19;
                                        cnr cnrVar = (cnr) cobVar3;
                                        float f49 = cnrVar.f + f19;
                                        float f50 = cnrVar.g + f20;
                                        f = 0.0f;
                                        i2 = i3;
                                        i = size;
                                        b(cjmVar, d, f20, f49, f50, cnrVar.a, cnrVar.b, cnrVar.c, cnrVar.d, cnrVar.e);
                                        f18 = f49;
                                        f19 = f18;
                                        f17 = f50;
                                        f20 = f17;
                                        cobVar = cobVar3;
                                    } else {
                                        i = size;
                                        f = f16;
                                        i2 = i3;
                                        if (!(cobVar3 instanceof cni)) {
                                            throw new aezs();
                                        }
                                        cni cniVar = (cni) cobVar3;
                                        float f51 = cniVar.f;
                                        float f52 = cniVar.g;
                                        cobVar = cobVar3;
                                        b(cjmVar, f19, f20, f51, f52, cniVar.a, cniVar.b, cniVar.c, cniVar.d, cniVar.e);
                                        f18 = f51;
                                        f19 = f18;
                                        f17 = f52;
                                        f20 = f17;
                                    }
                                    f17 = f6;
                                    f19 = f7;
                                    f20 = f8;
                                }
                                f18 = f11 + f19;
                                float f53 = f12 + f20;
                                f19 += f13;
                                f20 += f14;
                                f17 = f53;
                            }
                            f20 = f5;
                            f19 = f4;
                        }
                        f20 += f15;
                    }
                    i = size;
                    f = f16;
                    i2 = i3;
                }
                cobVar = cobVar3;
            }
            i3 = i2 + 1;
            list2 = list;
            cjmVar2 = cjmVar;
            size = i;
            cobVar2 = cobVar;
            f16 = f;
        }
    }

    public static /* synthetic */ void F(cjk cjkVar, BlurMaskFilter blurMaskFilter, int i, int i2) {
        cjkVar.j(1 != (i2 & 1) ? 0L : -72057594037927936L);
        cjkVar.i((i2 & 2) != 0 ? 3 : 0);
        cjkVar.r(i & ((i2 & 8) != 0 ? 0 : 1));
        Paint paintC = cjn.c(cjkVar);
        if ((i2 & 4) != 0) {
            blurMaskFilter = null;
        }
        paintC.setMaskFilter(blurMaskFilter);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void G(defpackage.cmd r27, defpackage.cmi r28) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czz.G(cmd, cmi):void");
    }

    public static /* synthetic */ void H(cmd cmdVar, long j, long j2, long j3, long j4, float f, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        if ((i & 4) != 0) {
            j3 = aclh.y(cmdVar.o(), j2);
        }
        if ((i & 8) != 0) {
            j4 = 0;
        }
        cmf cmfVar = (i & 16) != 0 ? cmf.a : null;
        if ((i & 32) != 0) {
            f = 1.0f;
        }
        cmdVar.B(j, j2, j3, j4, cmfVar, f);
    }

    public static /* synthetic */ void I(cmd cmdVar, long j, long j2, long j3, float f, cjw cjwVar, int i) {
        long j4 = (i & 2) != 0 ? 0L : j2;
        cmdVar.t(j, j4, (i & 4) != 0 ? aclh.y(cmdVar.o(), j4) : j3, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? cmf.a : null, (i & 32) != 0 ? null : cjwVar, (i & 64) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void J(cmd cmdVar, cjj cjjVar, long j, long j2, long j3, float f, cjw cjwVar, int i, int i2) {
        long jB = (i2 & 4) != 0 ? (cjjVar.b() & 4294967295L) | (cjjVar.c() << 32) : j2;
        cmdVar.C(cjjVar, (i2 & 2) != 0 ? 0L : j, jB, (i2 & 16) != 0 ? jB : j3, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? cmf.a : null, (i2 & 128) != 0 ? null : cjwVar, (i2 & 256) != 0 ? 3 : 0, (((i2 & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? 1 : 0) ^ 1) | i);
    }

    public static /* synthetic */ void K(cmd cmdVar, cjj cjjVar, long j, float f, cjw cjwVar, int i, int i2) {
        cmf cmfVar = (i2 & 8) != 0 ? cmf.a : null;
        cjw cjwVar2 = (i2 & 16) != 0 ? null : cjwVar;
        int i3 = (i2 & 32) != 0 ? 3 : i;
        int i4 = i2 & 2;
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if (i4 != 0) {
            j = 0;
        }
        cmb cmbVar = ((cxd) cmdVar).a;
        cmbVar.a.c.s(cjjVar, j, cmbVar.u(null, cmfVar, f2, cjwVar2, i3, 1));
    }

    public static float L(float[] fArr) {
        int length = fArr.length;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < BitmapDescriptorFactory.HUE_RED ? -f7 : f7;
    }

    public static boolean M(double d, clo cloVar, clo cloVar2) {
        return Math.abs(cloVar.a(d) - cloVar2.a(d)) <= 0.001d;
    }

    public static double N(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    public static double O(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d6) : d4 * d;
    }

    public static clh P(clh clhVar, clx clxVar, clf clfVar) {
        if (clhVar.b == 12884901888L) {
            clhVar.getClass();
            clv clvVar = (clv) clhVar;
            clx clxVar2 = clvVar.d;
            if (!Q(clxVar2, clxVar)) {
                return new clv(clvVar.a, clvVar.h, clxVar, T(R(clfVar.c, clxVar2.a(), clxVar.a()), clvVar.i), clvVar.k, clvVar.n, clvVar.e, clvVar.f, clvVar.g, -1);
            }
        }
        return clhVar;
    }

    public static boolean Q(clx clxVar, clx clxVar2) {
        if (clxVar != clxVar2) {
            return Math.abs(clxVar.a - clxVar2.a) < 0.001f && Math.abs(clxVar.b - clxVar2.b) < 0.001f;
        }
        return true;
    }

    public static float[] R(float[] fArr, float[] fArr2, float[] fArr3) {
        U(fArr, fArr2);
        U(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrS = S(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return T(fArrS, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    public static float[] S(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        int length = fArr.length;
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        return new float[]{f10 / f13, f11 / f13, f12 / f13, ((f3 * f8) - (f2 * f9)) / f13, ((f9 * f) - (f3 * f7)) / f13, ((f7 * f2) - (f8 * f)) / f13, ((f2 * f6) - (f3 * f5)) / f13, ((f3 * f4) - (f6 * f)) / f13, ((f * f5) - (f2 * f4)) / f13};
    }

    public static float[] T(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        int length2 = fArr2.length;
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = fArr[1];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = (f8 * f2) + (f9 * f4) + (f10 * f6);
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[8];
        float f15 = (f2 * f12) + (f4 * f13) + (f6 * f14);
        float f16 = fArr2[3];
        float f17 = fArr2[4];
        float f18 = fArr2[5];
        float f19 = (f * f16) + (f3 * f17) + (f5 * f18);
        float f20 = (f8 * f16) + (f9 * f17) + (f10 * f18);
        float f21 = (f16 * f12) + (f17 * f13) + (f18 * f14);
        float f22 = fArr2[6];
        float f23 = fArr2[7];
        float f24 = fArr2[8];
        return new float[]{f7, f11, f15, f19, f20, f21, (f * f22) + (f3 * f23) + (f5 * f24), (f8 * f22) + (f9 * f23) + (f10 * f24), (f12 * f22) + (f13 * f23) + (f14 * f24)};
    }

    public static void U(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    public static clm V(clh clhVar, clh clhVar2) {
        if (clhVar == clhVar2) {
            return new clk(clhVar);
        }
        if (clhVar.b != 12884901888L || clhVar2.b != 12884901888L) {
            return new clm(clhVar, clhVar2);
        }
        clhVar.getClass();
        clhVar2.getClass();
        return new cll((clv) clhVar, (clv) clhVar2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public static void W(cjm cjmVar, String str) {
        coc cocVar = new coc();
        cocVar.a(str);
        ?? r2 = cocVar.a;
        if (r2 != 0) {
            E(r2, cjmVar);
        } else {
            new cjm((byte[]) null);
        }
    }

    public static boolean X(float[] fArr) {
        return fArr[0] == 1.0f && fArr[1] == BitmapDescriptorFactory.HUE_RED && fArr[2] == BitmapDescriptorFactory.HUE_RED && fArr[3] == BitmapDescriptorFactory.HUE_RED && fArr[4] == BitmapDescriptorFactory.HUE_RED && fArr[5] == 1.0f && fArr[6] == BitmapDescriptorFactory.HUE_RED && fArr[7] == BitmapDescriptorFactory.HUE_RED && fArr[8] == BitmapDescriptorFactory.HUE_RED && fArr[9] == BitmapDescriptorFactory.HUE_RED && fArr[10] == 1.0f && fArr[11] == BitmapDescriptorFactory.HUE_RED && fArr[12] == BitmapDescriptorFactory.HUE_RED && fArr[13] == BitmapDescriptorFactory.HUE_RED && fArr[14] == BitmapDescriptorFactory.HUE_RED && fArr[15] == 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ defpackage.cjj Y(int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czz.Y(int, int, int, int):cjj");
    }

    public static int Z(cgf cgfVar) {
        return cgfVar.a;
    }

    private static float a(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        float f = fArr[i3] * fArr2[i2];
        float f2 = fArr[i3 + 1] * fArr2[i2 + 4];
        return f + f2 + (fArr[i3 + 2] * fArr2[i2 + 8]) + (fArr[i3 + 3] * fArr2[i2 + 12]);
    }

    public static void aA(cfy cfyVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1854833411);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 16 : 32;
        }
        int i5 = 18;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = atj.d;
                bvvVar.ad(objS);
            }
            ctp ctpVar = (ctp) objS;
            long j = bvvVar.u;
            long j2 = j ^ (j >>> 32);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            int i6 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVar, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf((int) j2), cwb.f);
            buxVarC.i(afak.a, new alx(cwb.g, i4));
            byq.c(buxVarC, cfyVarJ, cwb.c);
            afegVar.invoke(buxVarC, Integer.valueOf((i6 >> 6) & 14));
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afz(cfyVar, afegVar, i, i5);
        }
    }

    public static cjb aB(cst cstVar) {
        cjb cjbVarI = crt.i(cstVar, true);
        long jN = cstVar.n(cjbVarI.c());
        float f = cjbVarI.d;
        float f2 = cjbVarI.e;
        long j = jN >> 32;
        long jN2 = cstVar.n((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        return new cjb(Float.intBitsToFloat((int) j), Float.intBitsToFloat((int) (jN & 4294967295L)), Float.intBitsToFloat((int) (jN2 >> 32)), Float.intBitsToFloat((int) (jN2 & 4294967295L)));
    }

    public static int aC(dft dftVar, int i) {
        deu deuVar = dftVar.a.a;
        if (deuVar.a() != 0) {
            int iG = dftVar.g(i);
            if ((i != 0 && iG == dftVar.g(i - 1)) || (i != deuVar.a() && iG == dftVar.g(i + 1))) {
                return dftVar.p(i);
            }
        }
        return dftVar.q(i);
    }

    public static void aD(bii biiVar, Context context, bel belVar, boolean z, afdr afdrVar, afdr afdrVar2) {
        Resources resources = context.getResources();
        bee beeVar = new bee(afdrVar2, afdrVar, 8, null);
        if (z) {
            asl.U(biiVar, belVar.f, resources.getString(belVar.g), belVar.h, beeVar);
        }
    }

    public static void aE(bii biiVar, aitx aitxVar, Context context, bel belVar, boolean z, afec afecVar) {
        aD(biiVar, context, belVar, z, null, new aiy(aitxVar, afecVar, 19, null));
    }

    public static /* synthetic */ void aF(cmd cmdVar, long j, float f, float f2, long j2, long j3, czz czzVar, int i) {
        long j4 = (i & 16) != 0 ? 0L : j2;
        cmdVar.z(j, f, f2, j4, (i & 32) != 0 ? aclh.y(cmdVar.o(), j4) : j3, czzVar);
    }

    public static /* synthetic */ void aG(cmd cmdVar, cjs cjsVar, long j, long j2, long j3, czz czzVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            j2 = aclh.y(cmdVar.o(), j);
        }
        if ((i & 8) != 0) {
            j3 = 0;
        }
        float f = (i & 16) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED;
        if ((i & 32) != 0) {
            czzVar = cmf.a;
        }
        cmdVar.A(cjsVar, j, j2, j3, f, czzVar);
    }

    public static /* synthetic */ void aH(cmd cmdVar, long j, float f, long j2, czz czzVar, int i) {
        if ((i & 2) != 0) {
            f = cjd.b(cmdVar.o()) / 2.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            j2 = cmdVar.n();
        }
        cmdVar.v(j, f2, j2, (i & 8) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED, (i & 16) != 0 ? cmf.a : czzVar, (i & 64) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void aI(cmd cmdVar, cjm cjmVar, cjs cjsVar, float f, czz czzVar, int i) {
        if ((i & 8) != 0) {
            czzVar = cmf.a;
        }
        czz czzVar2 = czzVar;
        int i2 = (i & 32) != 0 ? 3 : 0;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        cmdVar.x(cjmVar, cjsVar, f, czzVar2, i2);
    }

    public static /* synthetic */ void aJ(cmd cmdVar, cjm cjmVar, long j, czz czzVar, int i) {
        if ((i & 8) != 0) {
            czzVar = cmf.a;
        }
        cmdVar.y(cjmVar, j, (i & 4) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED, czzVar, (i & 32) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void aK(cmd cmdVar, cjs cjsVar, long j, long j2, czz czzVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        cmdVar.w(cjsVar, j3, (i2 & 4) != 0 ? aclh.y(cmdVar.o(), j3) : j2, (i2 & 8) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED, (i2 & 16) != 0 ? cmf.a : czzVar, (i2 & 64) != 0 ? 3 : i);
    }

    public static /* synthetic */ void aL(cmd cmdVar, ckm ckmVar, long j, czz czzVar, int i) {
        czz czzVar2 = (i & 8) != 0 ? cmf.a : czzVar;
        float f = (i & 4) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED;
        if (ckmVar instanceof ckk) {
            cjb cjbVar = ((ckk) ckmVar).a;
            long jFloatToRawIntBits = Float.floatToRawIntBits(cjbVar.b);
            float f2 = cjbVar.c;
            cmdVar.t(j, (4294967295L & Float.floatToRawIntBits(f2)) | (jFloatToRawIntBits << 32), (Float.floatToRawIntBits(cjbVar.e - f2) & 4294967295L) | (Float.floatToRawIntBits(cjbVar.d - r1) << 32), f, czzVar2, null, 3);
            return;
        }
        if (!(ckmVar instanceof ckl)) {
            if (!(ckmVar instanceof ckj)) {
                throw new aezs();
            }
            cmdVar.y(((ckj) ckmVar).a, j, f, czzVar2, 3);
            return;
        }
        ckl cklVar = (ckl) ckmVar;
        cjm cjmVar = cklVar.b;
        if (cjmVar != null) {
            cmdVar.y(cjmVar, j, f, czzVar2, 3);
            return;
        }
        cjc cjcVar = cklVar.a;
        long j2 = cjcVar.h >> 32;
        float f3 = cjcVar.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) j2);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(cjcVar.b);
        float fB = cjcVar.b();
        float fA = cjcVar.a();
        cmdVar.B(j, (jFloatToRawIntBits2 << 32) | (jFloatToRawIntBits3 & 4294967295L), (Float.floatToRawIntBits(fB) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), czzVar2, f);
    }

    public static boolean aa(ddr ddrVar) {
        if (affa.f(ddrVar.g(ddx.s), cgk.a)) {
            return false;
        }
        aan aanVar = ddrVar.c;
        return aan.f(aanVar, ddq.g) || aan.f(aanVar, ddq.h);
    }

    public static boolean ab(cfw cfwVar, afec afecVar) {
        return ((Boolean) afecVar.invoke(cfwVar)).booleanValue();
    }

    public static cfy ac(cfy cfyVar, cfy cfyVar2) {
        return cfyVar2 == cfy.e ? cfyVar : new cft(cfyVar, cfyVar2);
    }

    public static Object[] ad(Object[] objArr, int i, Object obj, Object obj2) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 2];
        woy.dB(objArr, objArr2, 0, i, 6);
        objArr.getClass();
        System.arraycopy(objArr, i, objArr2, i + 2, length - i);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static Object[] ae(Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 2];
        woy.dB(objArr, objArr2, 0, i, 6);
        woy.dq(objArr, objArr2, i, i + 2, length);
        return objArr2;
    }

    public static Object[] af(Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 1];
        woy.dB(objArr, objArr2, 0, i, 6);
        woy.dq(objArr, objArr2, i, i + 1, length);
        return objArr2;
    }

    public static Object[] ag(Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static bwj ah(afco afcoVar) {
        bwj bwjVar = (bwj) afcoVar.get(bwj.b);
        if (bwjVar != null) {
            return bwjVar;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static Object ai(afec afecVar, afck afckVar) {
        return ah(afckVar.hH()).a(new ado(afecVar, 4), afckVar);
    }

    public static Object aj(afec afecVar, afck afckVar) {
        return ah(afckVar.hH()).a(afecVar, afckVar);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [byr, java.lang.Object] */
    public static ccx ak(bxe[] bxeVarArr, ccx ccxVar, ccx ccxVar2) {
        ccw ccwVar = new ccw(ccx.d);
        for (bxe bxeVar : bxeVarArr) {
            bvf bvfVar = bxeVar.a;
            if (bxeVar.g || !ccxVar.containsKey(bvfVar)) {
                ?? r5 = ccxVar2.get(bvfVar);
                bxeVar.getClass();
                ccwVar.put(bvfVar, bvf.d(bxeVar, r5));
            }
        }
        return ccwVar.b();
    }

    public static Object al(ccx ccxVar, bvf bvfVar) {
        bvfVar.getClass();
        Object objA = ccxVar.get(bvfVar);
        if (objA == null) {
            objA = bvfVar.a();
        }
        return ((byr) objA).a(ccxVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void am(defpackage.bxe r10, defpackage.afeg r11, defpackage.bux r12, int r13) {
        /*
            r0 = -149765515(0xfffffffff712c275, float:-2.9766383E33)
            bux r12 = r12.c(r0)
            r0 = r12
            bvv r0 = (defpackage.bvv) r0
            ccx r1 = r0.ah()
            java.lang.Object r2 = defpackage.buz.c
            r3 = 201(0xc9, float:2.82E-43)
            r4 = 0
            r5 = 0
            r0.ab(r3, r2, r4, r5)
            java.lang.Object r2 = r0.S()
            java.lang.Object r3 = defpackage.buw.a
            boolean r3 = defpackage.affa.f(r2, r3)
            if (r3 == 0) goto L25
            r2 = r5
            goto L2a
        L25:
            r2.getClass()
            byr r2 = (defpackage.byr) r2
        L2a:
            bvf r3 = r10.a
            byr r6 = defpackage.bvf.d(r10, r2)
            boolean r2 = defpackage.affa.f(r6, r2)
            if (r2 != 0) goto L39
            r0.ad(r6)
        L39:
            boolean r7 = r0.t
            r8 = 1
            if (r7 == 0) goto L50
            boolean r2 = r10.g
            if (r2 != 0) goto L48
            boolean r2 = r1.containsKey(r3)
            if (r2 != 0) goto L4c
        L48:
            ccx r1 = r1.g(r3, r6)
        L4c:
            r0.p = r8
        L4e:
            r2 = r4
            goto L89
        L50:
            bzf r7 = r0.m
            int r9 = r7.f
            java.lang.Object r7 = r7.j(r9)
            r7.getClass()
            ccx r7 = (defpackage.ccx) r7
            boolean r9 = r0.H()
            if (r9 == 0) goto L65
            if (r2 != 0) goto L70
        L65:
            boolean r9 = r10.g
            if (r9 != 0) goto L7e
            boolean r9 = r1.containsKey(r3)
            if (r9 != 0) goto L70
            goto L7e
        L70:
            if (r2 == 0) goto L77
            boolean r2 = r0.h
            if (r2 != 0) goto L77
            goto L7c
        L77:
            boolean r2 = r0.h
            if (r2 == 0) goto L7c
            goto L82
        L7c:
            r1 = r7
            goto L82
        L7e:
            ccx r1 = r1.g(r3, r6)
        L82:
            boolean r2 = r0.i
            if (r2 != 0) goto L88
            if (r7 == r1) goto L4e
        L88:
            r2 = r8
        L89:
            if (r2 == 0) goto L92
            boolean r3 = r0.t
            if (r3 != 0) goto L92
            r0.aj(r1)
        L92:
            vtn r3 = r0.x
            boolean r6 = r0.h
            r3.e(r6)
            r0.h = r2
            r0.v = r1
            java.lang.Object r2 = defpackage.buz.d
            r6 = 202(0xca, float:2.83E-43)
            r0.ab(r6, r2, r4, r1)
            int r1 = r13 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.invoke(r12, r1)
            r0.Y(r4)
            r0.Y(r4)
            int r1 = r3.c()
            if (r1 == 0) goto Lbc
            r4 = r8
        Lbc:
            r0.h = r4
            r0.v = r5
            bxf r12 = r12.J()
            if (r12 == 0) goto Lcf
            afz r0 = new afz
            r1 = 19
            r0.<init>(r10, r11, r13, r1)
            r12.c = r0
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czz.am(bxe, afeg, bux, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void an(defpackage.bxe[] r9, defpackage.afeg r10, defpackage.bux r11, int r12) {
        /*
            r0 = 415205898(0x18bf8a0a, float:4.9511727E-24)
            bux r11 = r11.c(r0)
            r0 = r11
            bvv r0 = (defpackage.bvv) r0
            ccx r1 = r0.ah()
            java.lang.Object r2 = defpackage.buz.c
            r3 = 201(0xc9, float:2.82E-43)
            r4 = 0
            r5 = 0
            r0.ab(r3, r2, r4, r5)
            boolean r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L2a
            ccx r2 = defpackage.ccx.d
            ccx r2 = ak(r9, r1, r2)
            ccx r1 = r0.ai(r1, r2)
            r0.p = r3
        L28:
            r2 = r4
            goto L69
        L2a:
            bzf r2 = r0.m
            java.lang.Object r2 = r2.k(r4)
            r2.getClass()
            ccx r2 = (defpackage.ccx) r2
            bzf r6 = r0.m
            java.lang.Object r6 = r6.k(r3)
            r6.getClass()
            ccx r6 = (defpackage.ccx) r6
            ccx r7 = ak(r9, r1, r6)
            boolean r8 = r0.H()
            if (r8 == 0) goto L5a
            boolean r8 = r0.i
            if (r8 != 0) goto L5a
            boolean r6 = defpackage.affa.f(r6, r7)
            if (r6 != 0) goto L55
            goto L5a
        L55:
            r0.aa()
            r1 = r2
            goto L28
        L5a:
            ccx r1 = r0.ai(r1, r7)
            boolean r6 = r0.i
            if (r6 != 0) goto L68
            boolean r2 = defpackage.affa.f(r1, r2)
            if (r2 != 0) goto L28
        L68:
            r2 = r3
        L69:
            if (r2 == 0) goto L72
            boolean r6 = r0.t
            if (r6 != 0) goto L72
            r0.aj(r1)
        L72:
            vtn r6 = r0.x
            boolean r7 = r0.h
            r6.e(r7)
            r0.h = r2
            r0.v = r1
            java.lang.Object r2 = defpackage.buz.d
            r7 = 202(0xca, float:2.83E-43)
            r0.ab(r7, r2, r4, r1)
            int r1 = r12 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.invoke(r11, r1)
            r0.Y(r4)
            r0.Y(r4)
            int r1 = r6.c()
            if (r1 == 0) goto L9c
            r4 = r3
        L9c:
            r0.h = r4
            r0.v = r5
            bxf r11 = r11.J()
            if (r11 == 0) goto Lb3
            afz r0 = new afz
            r4 = 20
            r5 = 0
            r1 = r9
            r2 = r10
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r11.c = r0
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czz.an(bxe[], afeg, bux, int):void");
    }

    public static void ao(long j, dfw dfwVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-684938728);
        if (i3 == 0) {
            i2 = (true != buxVarC.B(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(dfwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            bvf bvfVar = brp.a;
            an(new bxe[]{bnm.a.b(new cjv(j)), bvfVar.b(((dfw) buxVarC.f(bvfVar)).j(dfwVar))}, afegVar, buxVarC, ((i2 >> 3) & 112) | 8);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new btf(j, dfwVar, afegVar, i, 0);
        }
    }

    public static dfw ap(int i, bux buxVar) {
        bry bryVarAv = av(buxVar);
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 0:
                return bryVarAv.j;
            case 1:
                return bryVarAv.k;
            case 2:
                return bryVarAv.l;
            case 3:
                return bryVarAv.a;
            case 4:
                return bryVarAv.b;
            case 5:
                return bryVarAv.c;
            case 6:
                return bryVarAv.d;
            case 7:
                return bryVarAv.e;
            case 8:
                return bryVarAv.f;
            case 9:
                return bryVarAv.m;
            case 10:
                return bryVarAv.n;
            case 11:
            default:
                return bryVarAv.o;
            case 12:
                return bryVarAv.g;
            case 13:
                return bryVarAv.h;
            case 14:
                return bryVarAv.i;
        }
    }

    public static ckv aq(bpu bpuVar, int i) {
        switch (i - 1) {
            case 1:
                return bpuVar.e;
            case 2:
                return bpuVar.g;
            case 3:
                bcm bcmVar = bpuVar.e;
                bcm bcmVar2 = bpt.a;
                bcn bcnVar = bpt.i;
                return bcm.b(bcmVar, null, null, bcnVar, bcnVar, 3);
            case 4:
                return bpuVar.a;
            case 5:
                bcm bcmVar3 = bpuVar.a;
                bcm bcmVar4 = bpt.a;
                bcn bcnVar2 = bpt.i;
                return bcm.b(bcmVar3, null, null, bcnVar2, bcnVar2, 3);
            case 6:
                return bcr.a;
            case 7:
                return bpuVar.d;
            case 8:
                bcm bcmVar5 = bpuVar.d;
                bcm bcmVar6 = bpt.a;
                bcn bcnVar3 = bpt.i;
                return bcm.b(bcmVar5, bcnVar3, null, null, bcnVar3, 6);
            case 9:
                return bpuVar.f;
            case 10:
            default:
                bcm bcmVar7 = bpuVar.d;
                bcm bcmVar8 = bpt.a;
                bcn bcnVar4 = bpt.i;
                return bcm.b(bcmVar7, null, bcnVar4, bcnVar4, null, 9);
            case 11:
                bcm bcmVar9 = bpuVar.d;
                bcm bcmVar10 = bpt.a;
                bcn bcnVar5 = bpt.i;
                return bcm.b(bcmVar9, null, null, bcnVar5, bcnVar5, 3);
            case 12:
                return bpuVar.c;
        }
    }

    public static ckv ar(int i, bux buxVar) {
        return aq(((bog) buxVar.f(boh.a)).c, i);
    }

    public static void as(afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(442516910);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != buxVarC.E(afegVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            buxVarC.v(1766838549);
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.Y(false);
            buxVarC.v(1767392772);
            afegVar.invoke(buxVarC, Integer.valueOf(i2 & 14));
            bvvVar.Y(false);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqv(afegVar, i, i4);
        }
    }

    public static bng at(bux buxVar) {
        return ((bog) buxVar.f(boh.a)).a;
    }

    public static bpu au(bux buxVar) {
        return ((bog) buxVar.f(boh.a)).c;
    }

    public static bry av(bux buxVar) {
        return ((bog) buxVar.f(boh.a)).b;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void aw(final defpackage.afdr r28, defpackage.cfy r29, boolean r30, defpackage.ckv r31, defpackage.bmn r32, defpackage.bmr r33, defpackage.ajh r34, defpackage.avp r35, defpackage.asf r36, final defpackage.afeh r37, defpackage.bux r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czz.aw(afdr, cfy, boolean, ckv, bmn, bmr, ajh, avp, asf, afeh, bux, int, int):void");
    }

    public static void ax(final afdr afdrVar, cfy cfyVar, boolean z, ckv ckvVar, bmn bmnVar, ajh ajhVar, avp avpVar, final afeh afehVar, bux buxVar, final int i) {
        afdr afdrVar2;
        int i2;
        afeh afehVar2;
        bux buxVar2;
        final cfy cfyVar2;
        final boolean z2;
        final ckv ckvVar2;
        final bmn bmnVar2;
        final ajh ajhVar2;
        final avp avpVar2;
        ajh ajhVarB;
        boolean z3;
        avp avpVar3;
        ckv ckvVar3;
        bmn bmnVar3;
        cfy cfyVar3;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(399974542);
        if (i3 == 0) {
            afdrVar2 = afdrVar;
            i2 = (true != buxVarC.E(afdrVar2) ? 2 : 4) | i;
        } else {
            afdrVar2 = afdrVar;
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i & 3072) == 0) {
            i4 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        int i5 = 196608 | i4;
        if ((1572864 & i) == 0) {
            i5 = i4 | 720896;
        }
        int i6 = i5 | 113246208;
        if ((805306368 & i) == 0) {
            afehVar2 = afehVar;
            i6 |= true != buxVarC.E(afehVar2) ? 268435456 : 536870912;
        } else {
            afehVar2 = afehVar;
        }
        if (buxVarC.I((306783379 & i6) != 306783378, i6 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                cfv cfvVar = cfy.e;
                avp avpVar4 = bmo.a;
                ckv ckvVarAr = ar(7, buxVarC);
                bng bngVarAt = at(buxVarC);
                bmn bmnVar4 = bngVarAt.X;
                if (bmnVar4 == null) {
                    bmn bmnVar5 = new bmn(cjn.i(0), bnh.e(bngVarAt, 19), cjn.i(0), cjv.h(bnh.e(bngVarAt, 19), 0.38f));
                    bngVarAt.X = bmnVar5;
                    bmnVar4 = bmnVar5;
                }
                buxVarC.v(-112362814);
                long jF = bnh.f(25, buxVarC);
                bvvVar.Y(false);
                ajhVarB = afp.B(1.0f, jF);
                z3 = true;
                avpVar3 = bmo.a;
                ckvVar3 = ckvVarAr;
                bmnVar3 = bmnVar4;
                cfyVar3 = cfvVar;
            } else {
                buxVarC.s();
                cfyVar3 = cfyVar;
                z3 = z;
                ckvVar3 = ckvVar;
                bmnVar3 = bmnVar;
                ajhVarB = ajhVar;
                avpVar3 = avpVar;
            }
            buxVarC.l();
            buxVar2 = buxVarC;
            aw(afdrVar2, cfyVar3, z3, ckvVar3, bmnVar3, null, ajhVarB, avpVar3, null, afehVar2, buxVar2, i6 & 2143749118, 0);
            cfyVar2 = cfyVar3;
            z2 = z3;
            ckvVar2 = ckvVar3;
            bmnVar2 = bmnVar3;
            ajhVar2 = ajhVarB;
            avpVar2 = avpVar3;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            cfyVar2 = cfyVar;
            z2 = z;
            ckvVar2 = ckvVar;
            bmnVar2 = bmnVar;
            ajhVar2 = ajhVar;
            avpVar2 = avpVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: bms
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar3 = (bux) obj;
                    ((Integer) obj2).intValue();
                    afdr afdrVar3 = afdrVar;
                    cfy cfyVar4 = cfyVar2;
                    boolean z4 = z2;
                    ckv ckvVar4 = ckvVar2;
                    int i7 = i | 1;
                    int i8 = 306783378 & i7;
                    int i9 = 613566756 & i7;
                    czz.ax(afdrVar3, cfyVar4, z4, ckvVar4, bmnVar2, ajhVar2, avpVar2, afehVar, buxVar3, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9));
                    return afak.a;
                }
            };
        }
    }

    public static boolean ay(blr blrVar, boolean z) {
        cst cstVarE;
        bed bedVar = blrVar.d;
        if (bedVar != null && (cstVarE = bedVar.e()) != null) {
            cjb cjbVarAB = aB(cstVarE);
            long jA = blrVar.a(z);
            float f = cjbVarAB.b;
            float f2 = cjbVarAB.d;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
            if (f <= fIntBitsToFloat && fIntBitsToFloat <= f2) {
                float f3 = cjbVarAB.c;
                float f4 = cjbVarAB.e;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA & 4294967295L));
                if (f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void az(final boolean z, int i, final blr blrVar, bux buxVar, final int i2) {
        int i3;
        final int i4;
        bff bffVarD;
        int i5 = i2 & 6;
        bux buxVarC = buxVar.c(-1344558920);
        if (i5 == 0) {
            i3 = (true != buxVarC.D(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.A(i + (-1)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != buxVarC.E(blrVar) ? 128 : 256;
        }
        if (buxVarC.I((i3 & 147) != 146, i3 & 1)) {
            boolean z2 = (i3 & 14) == 4;
            boolean zC = buxVarC.C(blrVar) | z2;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                objS = new bll(blrVar, z);
                bvvVar.ad(objS);
            }
            ben benVar = (ben) objS;
            boolean zE = buxVarC.E(blrVar) | z2;
            Object objS2 = bvvVar.S();
            if (zE || objS2 == buw.a) {
                objS2 = new blt(blrVar, z);
                bvvVar.ad(objS2);
            }
            bjy bjyVar = (bjy) objS2;
            boolean zJ = dfv.j(blrVar.f().b);
            int i6 = (int) (z ? blrVar.f().b >> 32 : blrVar.f().b & 4294967295L);
            bed bedVar = blrVar.d;
            float fD = BitmapDescriptorFactory.HUE_RED;
            if (bedVar != null && (bffVarD = bedVar.d()) != null && i6 >= 0) {
                dft dftVar = bffVarD.a;
                if (dftVar.a.a.a() != 0) {
                    dfb dfbVar = dftVar.b;
                    int iMin = Math.min(dfbVar.d(i6), Math.min(dfbVar.b - 1, dfbVar.f - 1));
                    if (i6 <= dfbVar.c(iMin, false)) {
                        dfbVar.k(iMin);
                        List list = dfbVar.h;
                        dfd dfdVar = (dfd) list.get(das.f(list, iMin));
                        fD = dfdVar.g.d(dfdVar.f(iMin));
                    }
                }
            }
            cfv cfvVar = cfy.e;
            boolean zE2 = buxVarC.E(benVar);
            Object objS3 = bvvVar.S();
            if (zE2 || objS3 == buw.a) {
                objS3 = new bas(benVar, 7);
                bvvVar.ad(objS3);
            }
            i4 = i;
            awx.D(bjyVar, z, i4, zJ, 0L, fD, crh.a(cfvVar, benVar, (PointerInputEventHandler) objS3), buxVarC, (i3 << 3) & 1008);
        } else {
            i4 = i;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: bls
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i7 = i2 | 1;
                    int i8 = 306783378 & i7;
                    int i9 = i4;
                    int i10 = 613566756 & i7;
                    blr blrVar2 = blrVar;
                    czz.az(z, i9, blrVar2, (bux) obj, (i7 & (-920350135)) | i8 | (i10 >> 1) | ((i8 + i8) & i10));
                    return afak.a;
                }
            };
        }
    }

    private static void b(cjm cjmVar, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = (((-d) * dSin) + (d2 * dCos)) / d6;
        double d13 = (((-d3) * dSin) + (d4 * dCos)) / d6;
        double d14 = d12 - d13;
        double d15 = ((d * dCos) + (d2 * dSin)) / d10;
        double d16 = ((d3 * dCos) + (d4 * dSin)) / d10;
        double d17 = d15 - d16;
        double d18 = (d17 * d17) + (d14 * d14);
        if (d18 == 0.0d) {
            return;
        }
        double d19 = (1.0d / d18) - 0.25d;
        if (d19 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d18) / 1.99999d);
            b(cjmVar, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d19);
        double d20 = (d12 + d13) / 2.0d;
        double d21 = d17 * dSqrt2;
        double d22 = (d15 + d16) / 2.0d;
        double d23 = dSqrt2 * d14;
        if (z == z2) {
            d8 = d22 - d23;
            d9 = d20 + d21;
        } else {
            d8 = d22 + d23;
            d9 = d20 - d21;
        }
        double d24 = d9;
        double dAtan2 = Math.atan2(d12 - d9, d15 - d8);
        double dAtan22 = Math.atan2(d13 - d9, d16 - d8) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 += dAtan22 > 0.0d ? -6.283185307179586d : 6.283185307179586d;
        }
        double d25 = d8 * d10;
        double d26 = d24 * d6;
        double d27 = d25 * dCos;
        double d28 = d26 * dSin;
        double d29 = d25 * dSin;
        double d30 = d26 * dCos;
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d31 = -d10;
        double d32 = d31 * dCos2;
        double d33 = d32 * dSin3;
        double d34 = d6 * dSin2;
        double d35 = d34 * dCos3;
        double d36 = d31 * dSin2;
        double d37 = d6 * dCos2;
        double d38 = (dSin3 * d36) + (dCos3 * d37);
        double d39 = d2;
        double d40 = dAtan22;
        double d41 = d33 - d35;
        int i = 0;
        double d42 = d38;
        double d43 = dAtan2;
        double d44 = d;
        while (i < iCeil) {
            int i2 = i;
            double d45 = d43 + (d40 / iCeil);
            double dSin4 = Math.sin(d45);
            double dCos4 = Math.cos(d45);
            double d46 = d45 - d43;
            double dTan = Math.tan(d46 / 2.0d);
            double dSin5 = (Math.sin(d46) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
            double d47 = d39 + (d42 * dSin5);
            int i3 = iCeil;
            double d48 = d29 + d30 + (d10 * dSin2 * dCos4) + (d37 * dSin4);
            double d49 = ((d27 - d28) + ((d10 * dCos2) * dCos4)) - (d34 * dSin4);
            d42 = (dSin4 * d36) + (dCos4 * d37);
            d41 = (d32 * dSin4) - (d34 * dCos4);
            cjmVar.c((float) (d44 + (d41 * dSin5)), (float) d47, (float) (d49 - (dSin5 * d41)), (float) (d48 - (dSin5 * d42)), (float) d49, (float) d48);
            i = i2 + 1;
            d43 = d45;
            d44 = d49;
            dCos2 = dCos2;
            d36 = d36;
            d39 = d48;
            iCeil = i3;
            dSin2 = dSin2;
            d10 = d5;
        }
    }

    public static void i(float[] fArr, float[] fArr2) {
        float fA = a(fArr2, 0, fArr, 0);
        float fA2 = a(fArr2, 0, fArr, 1);
        float fA3 = a(fArr2, 0, fArr, 2);
        float fA4 = a(fArr2, 0, fArr, 3);
        float fA5 = a(fArr2, 1, fArr, 0);
        float fA6 = a(fArr2, 1, fArr, 1);
        float fA7 = a(fArr2, 1, fArr, 2);
        float fA8 = a(fArr2, 1, fArr, 3);
        float fA9 = a(fArr2, 2, fArr, 0);
        float fA10 = a(fArr2, 2, fArr, 1);
        float fA11 = a(fArr2, 2, fArr, 2);
        float fA12 = a(fArr2, 2, fArr, 3);
        float fA13 = a(fArr2, 3, fArr, 0);
        float fA14 = a(fArr2, 3, fArr, 1);
        float fA15 = a(fArr2, 3, fArr, 2);
        float fA16 = a(fArr2, 3, fArr, 3);
        fArr[0] = fA;
        fArr[1] = fA2;
        fArr[2] = fA3;
        fArr[3] = fA4;
        fArr[4] = fA5;
        fArr[5] = fA6;
        fArr[6] = fA7;
        fArr[7] = fA8;
        fArr[8] = fA9;
        fArr[9] = fA10;
        fArr[10] = fA11;
        fArr[11] = fA12;
        fArr[12] = fA13;
        fArr[13] = fA14;
        fArr[14] = fA15;
        fArr[15] = fA16;
    }

    public static void j(float[] fArr, float f, float f2, float[] fArr2) {
        cki.c(fArr2);
        cki.g(fArr2, f, f2);
        i(fArr, fArr2);
    }

    public static boolean k(View view, View view2) {
        if (affa.f(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean m() {
        try {
            if (czq.a == null) {
                czq.a = Class.forName("android.os.SystemProperties");
            }
            if (czq.b == null) {
                Class cls = czq.a;
                czq.b = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = czq.b;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", false) : null;
            return affa.f(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, true);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [cfx] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [cfx] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [byw] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [byw] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void n(cyz cyzVar, afec afecVar) {
        cxx cxxVar;
        if (!cyzVar.M().A) {
            crt.c("visitAncestors called on an unattached node");
        }
        cfx cfxVar = cyzVar.M().t;
        cxb cxbVarQ = bzi.q(cyzVar);
        while (cxbVarQ != null) {
            if ((cxbVarQ.v.f.s & 262144) != 0) {
                while (cfxVar != null) {
                    if ((cfxVar.r & 262144) != 0) {
                        cwe cweVarN = cfxVar;
                        ?? bywVar = 0;
                        while (cweVarN != 0) {
                            if (cweVarN instanceof cyz) {
                                cyz cyzVar2 = (cyz) cweVarN;
                                if (affa.f(cyzVar.ep(), cyzVar2.ep()) && bzi.l(cyzVar, cyzVar2) && !((Boolean) afecVar.invoke(cyzVar2)).booleanValue()) {
                                    return;
                                }
                            } else if ((cweVarN.r & 262144) != 0 && (cweVarN instanceof cwe)) {
                                cfx cfxVar2 = cweVarN.C;
                                int i = 0;
                                cweVarN = cweVarN;
                                bywVar = bywVar;
                                while (cfxVar2 != null) {
                                    if ((cfxVar2.r & 262144) != 0) {
                                        i++;
                                        bywVar = bywVar;
                                        if (i == 1) {
                                            cweVarN = cfxVar2;
                                        } else {
                                            if (bywVar == 0) {
                                                bywVar = new byw(new cfx[16]);
                                            }
                                            if (cweVarN != 0) {
                                                bywVar.n(cweVarN);
                                            }
                                            bywVar.n(cfxVar2);
                                            cweVarN = 0;
                                        }
                                    }
                                    cfxVar2 = cfxVar2.u;
                                    cweVarN = cweVarN;
                                    bywVar = bywVar;
                                }
                                if (i != 1) {
                                }
                            }
                            cweVarN = bzi.n(bywVar);
                        }
                    }
                    cfxVar = cfxVar.t;
                }
            }
            cxbVarQ = cxbVarQ.l();
            cfxVar = (cxbVarQ == null || (cxxVar = cxbVarQ.v) == null) ? null : cxxVar.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [cfx] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [cfx] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [byw] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [byw] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static void o(cwd cwdVar, Object obj, afec afecVar) {
        cxx cxxVar;
        if (!cwdVar.M().A) {
            crt.c("visitAncestors called on an unattached node");
        }
        cfx cfxVar = cwdVar.M().t;
        cxb cxbVarQ = bzi.q(cwdVar);
        while (cxbVarQ != null) {
            if ((cxbVarQ.v.f.s & 262144) != 0) {
                while (cfxVar != null) {
                    if ((cfxVar.r & 262144) != 0) {
                        cwe cweVarN = cfxVar;
                        ?? bywVar = 0;
                        while (cweVarN != 0) {
                            if (cweVarN instanceof cyz) {
                                cyz cyzVar = (cyz) cweVarN;
                                if (affa.f(obj, cyzVar.ep()) && !((Boolean) afecVar.invoke(cyzVar)).booleanValue()) {
                                    return;
                                }
                            } else if ((cweVarN.r & 262144) != 0 && (cweVarN instanceof cwe)) {
                                cfx cfxVar2 = cweVarN.C;
                                int i = 0;
                                cweVarN = cweVarN;
                                bywVar = bywVar;
                                while (cfxVar2 != null) {
                                    if ((cfxVar2.r & 262144) != 0) {
                                        i++;
                                        bywVar = bywVar;
                                        if (i == 1) {
                                            cweVarN = cfxVar2;
                                        } else {
                                            if (bywVar == 0) {
                                                bywVar = new byw(new cfx[16]);
                                            }
                                            if (cweVarN != 0) {
                                                bywVar.n(cweVarN);
                                            }
                                            bywVar.n(cfxVar2);
                                            cweVarN = 0;
                                        }
                                    }
                                    cfxVar2 = cfxVar2.u;
                                    cweVarN = cweVarN;
                                    bywVar = bywVar;
                                }
                                if (i != 1) {
                                }
                            }
                            cweVarN = bzi.n(bywVar);
                        }
                    }
                    cfxVar = cfxVar.t;
                }
            }
            cxbVarQ = cxbVarQ.l();
            cfxVar = (cxbVarQ == null || (cxxVar = cxbVarQ.v) == null) ? null : cxxVar.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [cfx] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [cfx] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [byw] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [byw] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static void p(cyz cyzVar, afec afecVar) {
        if (!cyzVar.M().A) {
            crt.c("visitSubtreeIf called on an unattached node");
        }
        byw bywVar = new byw(new cfx[16]);
        cfx cfxVar = cyzVar.M().u;
        if (cfxVar == null) {
            bzi.w(bywVar, cyzVar.M());
        } else {
            bywVar.n(cfxVar);
        }
        while (true) {
            int i = bywVar.b;
            if (i == 0) {
                return;
            }
            cfx cfxVar2 = (cfx) bywVar.c(i - 1);
            if ((cfxVar2.s & 262144) != 0) {
                for (cfx cfxVar3 = cfxVar2; cfxVar3 != null && cfxVar3.A; cfxVar3 = cfxVar3.u) {
                    if ((cfxVar3.r & 262144) != 0) {
                        cwe cweVarN = cfxVar3;
                        ?? bywVar2 = 0;
                        while (cweVarN != 0) {
                            if (cweVarN instanceof cyz) {
                                cyz cyzVar2 = (cyz) cweVarN;
                                cyy cyyVar = (affa.f(cyzVar.ep(), cyzVar2.ep()) && bzi.l(cyzVar, cyzVar2)) ? (cyy) afecVar.invoke(cyzVar2) : cyy.a;
                                if (cyyVar == cyy.c) {
                                    return;
                                }
                                if (cyyVar == cyy.b) {
                                    break;
                                }
                            } else if ((cweVarN.r & 262144) != 0 && (cweVarN instanceof cwe)) {
                                cfx cfxVar4 = cweVarN.C;
                                int i2 = 0;
                                cweVarN = cweVarN;
                                bywVar2 = bywVar2;
                                while (cfxVar4 != null) {
                                    if ((cfxVar4.r & 262144) != 0) {
                                        i2++;
                                        bywVar2 = bywVar2;
                                        if (i2 == 1) {
                                            cweVarN = cfxVar4;
                                        } else {
                                            if (bywVar2 == 0) {
                                                bywVar2 = new byw(new cfx[16]);
                                            }
                                            if (cweVarN != 0) {
                                                bywVar2.n(cweVarN);
                                            }
                                            bywVar2.n(cfxVar4);
                                            cweVarN = 0;
                                        }
                                    }
                                    cfxVar4 = cfxVar4.u;
                                    cweVarN = cweVarN;
                                    bywVar2 = bywVar2;
                                }
                                if (i2 != 1) {
                                }
                            }
                            cweVarN = bzi.n(bywVar2);
                        }
                    }
                }
            }
            bzi.w(bywVar, cfxVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [cfx] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [cfx] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [byw] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [byw] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void q(cwd cwdVar, Object obj, afec afecVar) {
        if (!cwdVar.M().A) {
            crt.c("visitSubtreeIf called on an unattached node");
        }
        byw bywVar = new byw(new cfx[16]);
        cfx cfxVar = cwdVar.M().u;
        if (cfxVar == null) {
            bzi.w(bywVar, cwdVar.M());
        } else {
            bywVar.n(cfxVar);
        }
        while (true) {
            int i = bywVar.b;
            if (i == 0) {
                return;
            }
            cfx cfxVar2 = (cfx) bywVar.c(i - 1);
            if ((cfxVar2.s & 262144) != 0) {
                for (cfx cfxVar3 = cfxVar2; cfxVar3 != null && cfxVar3.A; cfxVar3 = cfxVar3.u) {
                    if ((cfxVar3.r & 262144) != 0) {
                        cwe cweVarN = cfxVar3;
                        ?? bywVar2 = 0;
                        while (cweVarN != 0) {
                            if (cweVarN instanceof cyz) {
                                cyz cyzVar = (cyz) cweVarN;
                                cyy cyyVar = affa.f(obj, cyzVar.ep()) ? (cyy) afecVar.invoke(cyzVar) : cyy.a;
                                if (cyyVar == cyy.c) {
                                    return;
                                }
                                if (cyyVar == cyy.b) {
                                    break;
                                }
                            } else if ((cweVarN.r & 262144) != 0 && (cweVarN instanceof cwe)) {
                                cfx cfxVar4 = cweVarN.C;
                                int i2 = 0;
                                cweVarN = cweVarN;
                                bywVar2 = bywVar2;
                                while (cfxVar4 != null) {
                                    if ((cfxVar4.r & 262144) != 0) {
                                        i2++;
                                        bywVar2 = bywVar2;
                                        if (i2 == 1) {
                                            cweVarN = cfxVar4;
                                        } else {
                                            if (bywVar2 == 0) {
                                                bywVar2 = new byw(new cfx[16]);
                                            }
                                            if (cweVarN != 0) {
                                                bywVar2.n(cweVarN);
                                            }
                                            bywVar2.n(cfxVar4);
                                            cweVarN = 0;
                                        }
                                    }
                                    cfxVar4 = cfxVar4.u;
                                    cweVarN = cweVarN;
                                    bywVar2 = bywVar2;
                                }
                                if (i2 != 1) {
                                }
                            }
                            cweVarN = bzi.n(bywVar2);
                        }
                    }
                }
            }
            bzi.w(bywVar, cfxVar2);
        }
    }

    public static cjb r(cfx cfxVar, boolean z, boolean z2) {
        if (!cfxVar.q.A) {
            return cjb.a;
        }
        if (z) {
            return bzi.r(cfxVar, 8).ad();
        }
        cyc cycVarR = bzi.r(cfxVar, 8);
        return crt.j(cycVarR).o(cycVarR, z2);
    }

    public static boolean s(ddr ddrVar) {
        return ddrVar.g(ddq.b) != null;
    }

    public static long t(int i, int i2) {
        if (i < 0 || i2 < 0) {
            dka.c(a.bB(i2, i, "start and end cannot be negative. [start: ", ", end: ", "]"));
        }
        return (i2 & 4294967295L) | (i << 32);
    }

    public static long u(long j, int i) {
        long j2 = dfv.a;
        int i2 = (int) (4294967295L & j);
        int i3 = i2 < 0 ? 0 : i2;
        if (i3 > i) {
            i3 = i;
        }
        int i4 = (int) (j >> 32);
        int i5 = i4 >= 0 ? i4 : 0;
        if (i5 <= i) {
            i = i5;
        }
        return (i == i4 && i3 == i2) ? j : t(i, i3);
    }

    public static det v(det detVar) {
        Object obj = detVar.a;
        obj.getClass();
        return new det(((dfo) obj).a, detVar.b, detVar.c, detVar.d);
    }

    public static afdr w(czd czdVar, ept eptVar) {
        if (eptVar.a().compareTo(eps.a) <= 0) {
            throw new IllegalStateException(a.bw(eptVar, czdVar, "Cannot configure ", " to disposeComposition at Lifecycle ON_DESTROY: ", "is already destroyed"));
        }
        ny nyVar = new ny(czdVar, 4);
        eptVar.c(nyVar);
        return new bws(eptVar, nyVar, 6);
    }

    public static float x(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static cjs y(duw duwVar) {
        if (!duwVar.d()) {
            return null;
        }
        Object obj = duwVar.b;
        return obj != null ? new cjt((Shader) obj) : new ckx(duwVar.a << 32);
    }

    public static long z(dlg dlgVar, float f, float f2) {
        float fEA = dlgVar.eA(f);
        float fEA2 = dlgVar.eA(f2);
        return (Float.floatToRawIntBits(fEA) << 32) | (Float.floatToRawIntBits(fEA2) & 4294967295L);
    }

    public final View l(int i, View view) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = czq.f;
            if (declaredMethod == null) {
                declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", null);
                czq.f = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (affa.f(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewL = l(i, viewGroup.getChildAt(i2));
                    if (viewL != null) {
                        return viewL;
                    }
                }
            }
        }
        return null;
    }

    public czz(byte[] bArr) {
    }
}
