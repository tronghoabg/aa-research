package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class wpu {
    public wpu(byte[] bArr, byte[] bArr2) {
        new java.util.LinkedHashSet();
        new java.util.LinkedHashSet();
        new java.util.LinkedHashSet();
    }

    public static void A(defpackage.xvq xvqVar) {
        if (C(xvqVar) || xvqVar.a() == null) {
            xvqVar.d();
            z(xvqVar);
        } else {
            A(xvqVar.a());
            z(xvqVar);
        }
    }

    public static void B(defpackage.xvq xvqVar) {
        if (C(xvqVar) || xvqVar.a() == null) {
            return;
        }
        B(xvqVar.a());
    }

    public static boolean C(defpackage.xvq xvqVar) {
        return xvqVar.e() != java.lang.Thread.currentThread();
    }

    public static float D(float f) {
        return (float) (((double) f) * 0.017453292519943295d);
    }

    public static float E(float f, float f2, float f3, float f4) {
        float f5 = f3 * 0.5f;
        float f6 = f2 - f5;
        float f7 = f2 * f;
        float f8 = f5 + f4;
        float f9 = f6 - f4;
        return f8 > f9 ? f7 : defpackage.afqt.d(f7, f8, f9);
    }

    public static boolean F(java.util.Map map) {
        xts xtsVar = xub.a;
        xts xtsVar2 = xub.L;
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        if (((java.lang.Number) defpackage.wva.x(map, xtsVar2, fValueOf)).floatValue() > 0.0f || ((java.lang.Number) defpackage.wva.x(map, xub.aq, fValueOf)).floatValue() > 0.0f) {
            return true;
        }
        if (((java.lang.Number) defpackage.wva.x(map, xub.t, fValueOf)).floatValue() > 0.0f && ((java.lang.Number) defpackage.wva.x(map, xub.y, fValueOf)).floatValue() > 0.0f && ((java.lang.Number) defpackage.wva.x(map, xub.w, fValueOf)).floatValue() > 0.0f) {
            return true;
        }
        if (((java.lang.Number) defpackage.wva.x(map, xub.F, fValueOf)).floatValue() <= 0.0f || ((java.lang.Number) defpackage.wva.x(map, xub.H, fValueOf)).floatValue() <= 0.0f || ((java.lang.Number) defpackage.wva.x(map, xub.G, fValueOf)).floatValue() <= 0.0f) {
            return ((java.lang.Number) defpackage.wva.x(map, xub.I, fValueOf)).floatValue() > 0.0f && ((java.lang.Number) defpackage.wva.x(map, xub.K, fValueOf)).floatValue() > 0.0f && ((java.lang.Number) defpackage.wva.x(map, xub.J, fValueOf)).floatValue() > 0.0f;
        }
        return true;
    }

    public static java.lang.Object G(xud xudVar, java.lang.Object obj, java.lang.Object obj2, float f) {
        long j;
        long j2;
        long jE;
        if (xudVar instanceof xts) {
            return java.lang.Float.valueOf(((1.0f - f) * ((java.lang.Float) obj).floatValue()) + (f * ((java.lang.Float) obj2).floatValue()));
        }
        if (xudVar instanceof xtw) {
            float f2 = 1.0f - f;
            long j3 = ((defpackage.cji) obj).a;
            long j4 = ((defpackage.cji) obj2).a;
            return new defpackage.cji((((long) java.lang.Float.floatToRawIntBits((java.lang.Float.intBitsToFloat((int) (j3 >> 32)) * f2) + (java.lang.Float.intBitsToFloat((int) (j4 >> 32)) * f))) << 32) | (((long) java.lang.Float.floatToRawIntBits((f2 * java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L))) + (f * java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L))))) & 4294967295L));
        }
        if (!(xudVar instanceof xtn)) {
            if (!(xudVar instanceof xtr)) {
                if (!(xudVar instanceof xtu) && !(xudVar instanceof xtt) && !(xudVar instanceof xtv) && !(xudVar instanceof xty) && !(xudVar instanceof xtz) && !(xudVar instanceof xuc)) {
                    throw new defpackage.afas();
                }
                java.lang.String strConcat = "Linear interpolation (lerp) is not supported for IntUniforms. Uniform name: ".concat(xudVar.a());
                android.util.Log.w("UniformInterpolators", strConcat);
                throw new java.lang.IllegalArgumentException(strConcat);
            }
            float[] fArr = (float[]) obj;
            float[] fArr2 = (float[]) obj2;
            int length = fArr.length;
            if (length != fArr2.length) {
                throw new java.lang.IllegalArgumentException("FloatArray sizes must match");
            }
            float[] fArr3 = new float[length];
            for (int i = 0; i < length; i++) {
                fArr3[i] = ((1.0f - f) * fArr[i]) + (fArr2[i] * f);
            }
            return fArr3;
        }
        if (obj instanceof defpackage.ckd) {
            j = ((defpackage.ckd) obj).a;
        } else {
            if (!(obj instanceof java.lang.Integer)) {
                throw new java.lang.IllegalArgumentException("Unsupported start color type: ".concat(java.lang.String.valueOf(defpackage.afgw.b(obj.getClass()).getSimpleName())));
            }
            j = defpackage.cjv.j(((java.lang.Number) obj).intValue());
        }
        if (obj2 instanceof defpackage.ckd) {
            j2 = ((defpackage.ckd) obj2).a;
        } else {
            if (!(obj2 instanceof java.lang.Integer)) {
                throw new java.lang.IllegalArgumentException("Unsupported end color type: ".concat(java.lang.String.valueOf(defpackage.afgw.b(obj2.getClass()).getSimpleName())));
            }
            j2 = defpackage.cjv.j(((java.lang.Number) obj2).intValue());
        }
        float fA = defpackage.ckd.a(j);
        float fA2 = defpackage.ckd.a(j2);
        if (fA == 0.0f && fA2 == 0.0f) {
            jE = defpackage.cjv.j(0);
        } else if (fA == 0.0f) {
            jE = defpackage.ckd.h(j2, fA2 * f);
        } else if (fA2 == 0.0f) {
            jE = defpackage.ckd.h(j, fA * (1.0f - f));
        } else {
            float[] fArr4 = defpackage.clr.a;
            defpackage.clp clpVar = defpackage.clr.x;
            long jE2 = defpackage.ckd.e(j, clpVar);
            long jE3 = defpackage.ckd.e(j2, clpVar);
            float fA3 = defpackage.ckd.a(jE2);
            float fD = defpackage.ckd.d(jE2);
            float fC = defpackage.ckd.c(jE2);
            float fB = defpackage.ckd.b(jE2);
            float fA4 = defpackage.ckd.a(jE3);
            float fD2 = defpackage.ckd.d(jE3);
            float fC2 = defpackage.ckd.c(jE3);
            float fB2 = defpackage.ckd.b(jE3);
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            float f3 = 1.0f - f;
            jE = defpackage.ckd.e(defpackage.cjv.l((fD * f3) + (fD2 * f), (fC * f3) + (fC2 * f), (fB * f3) + (fB2 * f), (f3 * fA3) + (f * fA4), clpVar), defpackage.clr.y[(int) (63 & j2)]);
        }
        return new defpackage.ckd(jE);
    }

    public static void H(boolean z, java.util.List list, java.lang.String str, java.lang.String str2, boolean z2) {
        if (!z2) {
            str2 = "vec4(0.0)";
        } else if (z) {
            str2 = "vec4(toLinearSrgb(" + str2 + ".rgb), " + str2 + ".a)";
        }
        list.add(defpackage.a.bB(str2, str, "    vec4 ", " = ", ";"));
    }

    public static void I(java.lang.StringBuilder sb, java.lang.String str) {
        sb.append(afzh.a("\n                finalColor = calculateBorderLight(finalColor, mainSdf, center, yFractEnergy,\n                    pRotated, blurredSdfMask * ripple,\n                    inBorderLightAlpha" + str + ", inBorderLightTopBlurRadius" + str + ",\n                    inBorderLightBottomBlurRadius" + str + ",\n                    inBorderLightTopIntensity" + str + ", inBorderLightBottomIntensity" + str + ",\n                    inBorderLightStrokeWidth" + str + ",\n                    inBorderLightDistortionSpeed" + str + ", inBorderLightDistortionFrequency" + str + ",\n                    inBorderLightDistortionAmplitude" + str + ",\n                    borderLightColor" + str + ",\n                    inBorderLightHdrBoost" + str + ");\n                "));
        sb.append('\n');
    }

    public static java.lang.String J(java.lang.String str) {
        return defpackage.a.bB(xse.a(str), str, "\n            ", "\n            float calculateShape(vec2 p, vec2 size, vec4 cornerRadius) {\n                return ", "(calculateRotation(p), size / 2.0, cornerRadius);\n            }\n            ");
    }

    public static java.lang.String K(java.lang.String str) {
        return afzh.a("\n            uniform float inBorderLightAlpha" + str + ";\n            uniform float inBorderLightTopBlurRadius" + str + ";\n            uniform float inBorderLightBottomBlurRadius" + str + ";\n            uniform float inBorderLightTopIntensity" + str + ";\n            uniform float inBorderLightBottomIntensity" + str + ";\n            uniform float inBorderLightStrokeWidth" + str + ";\n            uniform float inBorderLightDistortionSpeed" + str + ";\n            uniform float inBorderLightDistortionFrequency" + str + ";\n            uniform float inBorderLightDistortionAmplitude" + str + ";\n            uniform float inBorderLightHdrBoost" + str + ";\n            layout(color) uniform vec4 inBorderLightColor" + str + ";\n\n            ");
    }

    public static java.util.Map L(xrr xrrVar, java.util.Map map) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        xts xtsVar = xub.a;
        linkedHashSet.addAll(xub.aJ);
        linkedHashSet.add(xub.a);
        if (xrrVar.b != null) {
            linkedHashSet.addAll(xub.aK);
        }
        if (xrrVar.c != null) {
            linkedHashSet.addAll(xub.aL);
        }
        if (xrrVar.d != null) {
            linkedHashSet.addAll(xub.aM);
        }
        if (xrrVar.e != null) {
            linkedHashSet.addAll(xub.aN);
        }
        xrn xrnVar = xrrVar.f;
        if (xrnVar != null) {
            linkedHashSet.addAll(new xua(xrnVar.a).m);
        }
        xrn xrnVar2 = xrrVar.g;
        if (xrnVar2 != null) {
            linkedHashSet.addAll(new xua(xrnVar2.a).m);
        }
        if (xrrVar.h != null) {
            linkedHashSet.addAll(xub.aO);
        }
        if (xrrVar.i != null) {
            linkedHashSet.addAll(xub.aP);
        }
        if (xrrVar.j != null) {
            linkedHashSet.addAll(xub.aQ);
            linkedHashSet.add(xub.b);
        }
        if (xrrVar.k != null) {
            linkedHashSet.addAll(xub.aR);
        }
        if (xrrVar.l != null) {
            linkedHashSet.add(xub.aE);
            linkedHashSet.add(xub.aF);
            linkedHashSet.add(xub.aG);
            linkedHashSet.add(xub.aH);
            linkedHashSet.add(xub.aI);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.afga.P(map.size()));
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            xrq xrqVar = (xrq) entry.getKey();
            xsh xshVar = (xsh) entry.getValue();
            java.util.List<xsk> list = xshVar.a;
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(list, 10));
            for (xsk xskVar : list) {
                java.util.List list2 = xskVar.d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : list2) {
                    xud xudVar = ((xsg) obj).a;
                    if (linkedHashSet.contains(xudVar)) {
                        arrayList2.add(obj);
                    } else {
                        android.util.Log.w(xtm.a, "State " + xrqVar + ": Filtering out keyframe for uniform '" + xudVar.a() + "' as it's not active in the current shader config.");
                    }
                }
                arrayList.add(new xsk(xskVar.a, xskVar.b, xskVar.c, arrayList2));
            }
            boolean z = xshVar.b;
            defpackage.wpu wpuVar = xshVar.c;
            linkedHashMap.put(key, new xsh(arrayList, z));
        }
        return linkedHashMap;
    }

    public static /* synthetic */ defpackage.cgf M(defpackage.cgf cgfVar, xrr xrrVar, xrq xrqVar, java.util.Map map, defpackage.affg affgVar, java.util.concurrent.Executor executor, xrr xrrVar2, int i) {
        tja tjaVar = new tja(10);
        cgfVar.getClass();
        xrqVar.getClass();
        map.getClass();
        affgVar.getClass();
        xtm xtmVar = new xtm(xrrVar, xrqVar, map, affgVar, (i & 16) != 0 ? null : executor, (i & 32) != 0 ? null : xrrVar2, tjaVar);
        float[] fArr = xrrVar.a.g;
        return cgfVar.a(defpackage.asq.J(xtmVar, xuf.c(fArr) + 0.0f, xuf.e(fArr) + 0.0f, xuf.d(fArr) + 0.0f, xuf.a(fArr) + 0.0f));
    }

    public static xrn N(defpackage.affc affcVar) {
        xso xsoVar = new xso((byte[]) null);
        affcVar.invoke(xsoVar);
        return xsoVar.a();
    }

    public static xrn O(xrn xrnVar, defpackage.affc affcVar) {
        xso xsoVar = new xso(xrnVar);
        affcVar.invoke(xsoVar);
        return xsoVar.a();
    }

    public static xro P(xro xroVar, defpackage.affc affcVar) {
        xsx xsxVar = new xsx(xroVar);
        affcVar.invoke(xsxVar);
        return xsxVar.a();
    }

    public static xro Q(defpackage.affc affcVar) {
        xsx xsxVar = new xsx((byte[]) null);
        affcVar.invoke(xsxVar);
        return xsxVar.a();
    }

    public static xrr R(xrr xrrVar, defpackage.affc affcVar) {
        defpackage.xta xtaVar = new defpackage.xta(xrrVar);
        affcVar.invoke(xtaVar);
        return xtaVar.d();
    }

    public static xrr S(defpackage.affc affcVar) {
        defpackage.xta xtaVar = new defpackage.xta((byte[]) null);
        affcVar.invoke(xtaVar);
        return xtaVar.d();
    }

    public static xrt T(xrt xrtVar, defpackage.affc affcVar) {
        xtb xtbVar = new xtb(xrtVar);
        affcVar.invoke(xtbVar);
        return new xrt(xtbVar.a, xtbVar.b, xtbVar.c, xtbVar.d, xtbVar.e, xtbVar.f);
    }

    public static xry U(xry xryVar, defpackage.affc affcVar) {
        xryVar.getClass();
        xtd xtdVar = new xtd(xryVar);
        affcVar.invoke(xtdVar);
        return xtdVar.a();
    }

    public static xry V(defpackage.affc affcVar) {
        xtd xtdVar = new xtd((byte[]) null);
        affcVar.invoke(xtdVar);
        return xtdVar.a();
    }

    public static xrz W(xrz xrzVar, defpackage.affc affcVar) {
        xte xteVar = new xte(xrzVar);
        affcVar.invoke(xteVar);
        return new xrz(xteVar.a, xteVar.b, xteVar.c, xteVar.d, xteVar.e, xteVar.f, xteVar.g, xteVar.h, xteVar.i, xteVar.j, xteVar.k, xteVar.l, xteVar.m);
    }

    public static xsa X(xsa xsaVar, defpackage.affc affcVar) {
        xtf xtfVar = new xtf(xsaVar);
        affcVar.invoke(xtfVar);
        return xtfVar.a();
    }

    public static xsa Y(defpackage.affc affcVar) {
        xtf xtfVar = new xtf((byte[]) null);
        affcVar.invoke(xtfVar);
        return xtfVar.a();
    }

    public static xsb Z(xsb xsbVar, defpackage.affc affcVar) {
        xtg xtgVar = new xtg(xsbVar);
        affcVar.invoke(xtgVar);
        return xtgVar.a();
    }

    public static xsb aa(defpackage.affc affcVar) {
        xtg xtgVar = new xtg((byte[]) null);
        affcVar.invoke(xtgVar);
        return xtgVar.a();
    }

    public static xsc ab(xsc xscVar, defpackage.affc affcVar) {
        xth xthVar = new xth(xscVar);
        affcVar.invoke(xthVar);
        return new xsc(xthVar.a, xthVar.c, xthVar.b, xthVar.d);
    }

    public static xsd ac(xsd xsdVar, defpackage.affc affcVar) {
        xti xtiVar = new xti(xsdVar);
        affcVar.invoke(xtiVar);
        return xtiVar.a();
    }

    public static xsf ad(xsf xsfVar, defpackage.affc affcVar) {
        xtj xtjVar = new xtj(xsfVar);
        affcVar.invoke(xtjVar);
        return xtjVar.a();
    }

    public static xsf ae(defpackage.affc affcVar) {
        xtj xtjVar = new xtj((byte[]) null);
        affcVar.invoke(xtjVar);
        return xtjVar.a();
    }

    private static abvo af(abyp abypVar) {
        defpackage.abor aborVarN = abvo.a.n();
        for (abyo abyoVar : abypVar.b) {
            defpackage.abor aborVarN2 = abvn.a.n();
            int i = abyoVar.c;
            aborVarN2.t();
            aborVarN2.b.b = i;
            int i2 = abyoVar.d;
            aborVarN2.t();
            aborVarN2.b.c = i2;
            java.lang.String str = abyoVar.e;
            aborVarN2.t();
            abvn abvnVar = aborVarN2.b;
            str.getClass();
            abvnVar.d = str;
            boolean z = abyoVar.f;
            aborVarN2.t();
            aborVarN2.b.e = z;
            aborVarN.t();
            abvo abvoVar = aborVarN.b;
            abvn abvnVarN = aborVarN2.q();
            abvnVarN.getClass();
            defpackage.abpj abpjVar = abvoVar.b;
            if (!abpjVar.c()) {
                abvoVar.b = defpackage.abox.I(abpjVar);
            }
            abvoVar.b.add(abvnVarN);
        }
        return aborVarN.q();
    }

    static void b(android.graphics.Outline outline, android.graphics.Path path) {
        outline.setConvexPath(path);
    }

    public static double c(int i, double d, java.util.Map map) {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (map.get(numValueOf) == null) {
            map.put(numValueOf, java.lang.Double.valueOf(defpackage.woe.a(d, 200.0d, i).b));
        }
        return ((java.lang.Double) map.get(numValueOf)).doubleValue();
    }

    public static int d(acbe acbeVar, int[] iArr) {
        int i = acbeVar.b;
        int i2 = (i << 10) + (i << 6) + i;
        int i3 = acbeVar.d;
        int i4 = i3 << 5;
        int i5 = i2 + i4 + i3;
        int i6 = acbeVar.f;
        int i7 = iArr[i5 + i6];
        int i8 = acbeVar.e;
        int i9 = i7 - iArr[i5 + i8];
        int i10 = acbeVar.c;
        int i11 = i10 << 5;
        int i12 = i2 + i11 + i10;
        int i13 = (i9 - iArr[i12 + i6]) + iArr[i12 + i8];
        int i14 = acbeVar.a;
        int i15 = (i14 << 10) + (i14 << 6) + i14;
        int i16 = i4 + i15 + i3;
        int i17 = i15 + i11 + i10;
        return (((i13 - iArr[i16 + i6]) + iArr[i16 + i8]) + iArr[i6 + i17]) - iArr[i17 + i8];
    }

    static int e(acbe acbeVar, int i, int[] iArr) {
        int i2;
        int i3;
        int i4 = i - 1;
        if (i4 == 0) {
            int i5 = acbeVar.a;
            int i6 = acbeVar.d;
            int i7 = acbeVar.f;
            int i8 = (i5 << 10) + (i5 << 6) + i5;
            int i9 = (i6 << 5) + i8 + i6;
            int i10 = -iArr[i9 + i7];
            int i11 = acbeVar.e;
            int i12 = i10 + iArr[i9 + i11];
            int i13 = acbeVar.c;
            int i14 = i8 + (i13 << 5) + i13;
            i2 = i12 + iArr[i7 + i14];
            i3 = iArr[i14 + i11];
        } else if (i4 != 1) {
            int i15 = acbeVar.b;
            int i16 = acbeVar.d;
            int i17 = acbeVar.e;
            int i18 = i16 << 5;
            int i19 = (i15 << 10) + (i15 << 6) + i15;
            int i20 = -iArr[i19 + i18 + i16 + i17];
            int i21 = acbeVar.c;
            int i22 = i21 << 5;
            int i23 = i20 + iArr[i19 + i22 + i21 + i17];
            int i24 = acbeVar.a;
            int i25 = (i24 << 10) + (i24 << 6) + i24;
            i2 = i23 + iArr[i18 + i25 + i16 + i17];
            i3 = iArr[i25 + i22 + i21 + i17];
        } else {
            int i26 = acbeVar.b;
            int i27 = acbeVar.c;
            int i28 = acbeVar.f;
            int i29 = i27 << 5;
            int i30 = (i26 << 10) + (i26 << 6) + i26 + i29 + i27;
            int i31 = -iArr[i30 + i28];
            int i32 = acbeVar.e;
            int i33 = i31 + iArr[i30 + i32];
            int i34 = acbeVar.a;
            int i35 = (i34 << 10) + (i34 << 6) + i34 + i29 + i27;
            i2 = i33 + iArr[i28 + i35];
            i3 = iArr[i35 + i32];
        }
        return i2 - i3;
    }

    static int f(acbe acbeVar, int i, int i2, int[] iArr) {
        int i3;
        int i4;
        int i5 = i - 1;
        if (i5 == 0) {
            int i6 = acbeVar.d;
            int i7 = acbeVar.f;
            int i8 = (i2 << 10) + (i2 << 6) + i2;
            int i9 = (i6 << 5) + i8 + i6;
            int i10 = iArr[i9 + i7];
            int i11 = acbeVar.e;
            int i12 = i10 - iArr[i9 + i11];
            int i13 = acbeVar.c;
            int i14 = i8 + (i13 << 5) + i13;
            i3 = i12 - iArr[i7 + i14];
            i4 = iArr[i14 + i11];
        } else if (i5 != 1) {
            int i15 = acbeVar.b;
            int i16 = acbeVar.d;
            int i17 = i16 << 5;
            int i18 = (i15 << 10) + (i15 << 6) + i15;
            int i19 = iArr[i18 + i17 + i16 + i2];
            int i20 = acbeVar.c;
            int i21 = i20 << 5;
            int i22 = i19 - iArr[((i18 + i21) + i20) + i2];
            int i23 = acbeVar.a;
            int i24 = (i23 << 10) + (i23 << 6) + i23;
            i3 = i22 - iArr[((i17 + i24) + i16) + i2];
            i4 = iArr[i24 + i21 + i20 + i2];
        } else {
            int i25 = acbeVar.b;
            int i26 = acbeVar.f;
            int i27 = i2 << 5;
            int i28 = (i25 << 10) + (i25 << 6) + i25 + i27 + i2;
            int i29 = iArr[i28 + i26];
            int i30 = acbeVar.e;
            int i31 = i29 - iArr[i28 + i30];
            int i32 = acbeVar.a;
            int i33 = (i32 << 10) + (i32 << 6) + i32 + i27 + i2;
            i3 = i31 - iArr[i26 + i33];
            i4 = iArr[i33 + i30];
        }
        return i3 + i4;
    }

    public static acbf g(acbe acbeVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        acbe acbeVar2 = acbeVar;
        int i8 = i;
        int[] iArr5 = iArr;
        int[] iArr6 = iArr2;
        int iE = e(acbeVar2, i8, iArr6);
        int iE2 = e(acbeVar2, i8, iArr3);
        int iE3 = e(acbeVar2, i8, iArr4);
        int iE4 = e(acbeVar2, i8, iArr5);
        double d = 0.0d;
        int i9 = -1;
        int i10 = i2;
        while (i10 < i3) {
            int iF = f(acbeVar2, i8, i10, iArr6) + iE;
            int iF2 = iE2 + f(acbeVar2, i8, i10, iArr3);
            int iF3 = iE3 + f(acbeVar2, i8, i10, iArr4);
            int iF4 = iE4 + f(acbeVar2, i8, i10, iArr5);
            if (iF4 != 0) {
                int i11 = iF * iF;
                int i12 = iF2 * iF2;
                int i13 = iF3 * iF3;
                int i14 = i4 - iF;
                int i15 = i5 - iF2;
                int i16 = i6 - iF3;
                int i17 = i7 - iF4;
                if (i17 != 0) {
                    double d2 = (((double) ((i11 + i12) + i13)) / ((double) iF4)) + (((double) (((i14 * i14) + (i15 * i15)) + (i16 * i16))) / ((double) i17));
                    if (d2 > d) {
                        d = d2;
                        i9 = i10;
                    }
                }
            }
            i10++;
            acbeVar2 = acbeVar;
            i8 = i;
            iArr5 = iArr;
            iArr6 = iArr2;
        }
        return new acbf(i9, d);
    }

    public static double h(acbe acbeVar, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double[] dArr) {
        int iD = d(acbeVar, iArr2);
        int iD2 = d(acbeVar, iArr3);
        int iD3 = d(acbeVar, iArr4);
        int i = acbeVar.b;
        int i2 = (i << 10) + (i << 6) + i;
        int i3 = acbeVar.d;
        int i4 = i3 << 5;
        int i5 = i2 + i4 + i3;
        int i6 = acbeVar.f;
        double d = dArr[i5 + i6];
        int i7 = acbeVar.e;
        double d2 = d - dArr[i5 + i7];
        int i8 = acbeVar.c;
        int i9 = i8 << 5;
        int i10 = i2 + i9 + i8;
        double d3 = (d2 - dArr[i10 + i6]) + dArr[i10 + i7];
        int i11 = acbeVar.a;
        int i12 = (i11 << 10) + (i11 << 6) + i11;
        int i13 = i4 + i12 + i3;
        int i14 = i12 + i9 + i8;
        return ((((d3 - dArr[i13 + i6]) + dArr[i13 + i7]) + dArr[i6 + i14]) - dArr[i14 + i7]) - (((double) (((iD * iD) + (iD2 * iD2)) + (iD3 * iD3))) / ((double) d(acbeVar, iArr)));
    }

    public static android.graphics.Typeface i(android.content.res.Configuration configuration, android.graphics.Typeface typeface) {
        if (android.os.Build.VERSION.SDK_INT < 31 || a$.ExternalSyntheticApiModelOutline0.m(configuration) == Integer.MAX_VALUE || a$.ExternalSyntheticApiModelOutline0.m(configuration) == 0 || typeface == null) {
            return null;
        }
        return hh$.ExternalSyntheticApiModelOutline0.m(typeface, defpackage.duc.c(jx$.ExternalSyntheticApiModelOutline3.m(typeface) + a$.ExternalSyntheticApiModelOutline0.m(configuration), 1, 1000), typeface.isItalic());
    }

    public static float j(android.content.ContentResolver contentResolver) {
        return android.provider.Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    public static double k(double[] dArr, double[] dArr2) {
        double d = dArr[0] - dArr2[0];
        double d2 = dArr[1] - dArr2[1];
        double d3 = dArr[2] - dArr2[2];
        return (d * d) + (d2 * d2) + (d3 * d3);
    }

    public static double[] l(int i) {
        double[][] dArr = defpackage.wod.a;
        double dU = defpackage.a.u((i >> 16) & 255);
        double dU2 = defpackage.a.u((i >> 8) & 255);
        double dU3 = defpackage.a.u(i & 255);
        double[][] dArr2 = defpackage.wod.a;
        double[] dArr3 = dArr2[0];
        double d = dArr3[0] * dU;
        double d2 = dArr3[1] * dU2;
        double d3 = dArr3[2] * dU3;
        double[] dArr4 = dArr2[1];
        double d4 = dArr4[0] * dU;
        double d5 = dArr4[1] * dU2;
        double d6 = dArr4[2] * dU3;
        double[] dArr5 = dArr2[2];
        double d7 = dArr5[0] * dU;
        double d8 = dArr5[1] * dU2;
        double d9 = dArr5[2] * dU3;
        double[] dArr6 = defpackage.wod.c;
        double d10 = ((d + d2) + d3) / dArr6[0];
        double d11 = ((d4 + d5) + d6) / dArr6[1];
        double d12 = ((d7 + d8) + d9) / dArr6[2];
        double dS = defpackage.a.s(d10);
        double dS2 = defpackage.a.s(d11);
        double[] dArr7 = {(116.0d * dS2) - 16.0d, (dS - dS2) * 500.0d, (dS2 - defpackage.a.s(d12)) * 200.0d};
        return new double[]{dArr7[0], dArr7[1], dArr7[2]};
    }

    public static int m(int i) {
        int i2 = i % 360;
        return i2 < 0 ? i2 + 360 : i2;
    }

    public static void n(android.animation.AnimatorSet animatorSet, java.util.List list) {
        int size = list.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            android.animation.Animator animator = (android.animation.Animator) list.get(i);
            jMax = java.lang.Math.max(jMax, animator.getStartDelay() + animator.getDuration());
        }
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fa A[LOOP:0: B:67:0x00f4->B:69:0x00fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x010c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:75:0x0117  */
    /* JADX WARN: Code duplicated, block: B:79:0x0128 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x0129 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x012a  */
    /* JADX WARN: Code duplicated, block: B:83:0x012c A[RETURN] */
    public static boolean o(int i, abzq abzqVar, com.google.android.libraries.surveys.internal.model.Answer answer) {
        defpackage.ygw ygwVarH;
        java.util.ArrayList arrayList;
        abzh abzhVar;
        int i2;
        int iE;
        int i3;
        abzg abzgVar;
        abzf abzfVar;
        abzc abzcVar;
        java.util.Iterator<E> it;
        abze abzeVar;
        abzf abzfVar2;
        if (i >= abzqVar.g.size()) {
            return false;
        }
        abzw abzwVar = (abzw) abzqVar.g.get(i);
        if (!abzwVar.j) {
            return true;
        }
        int i4 = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        int iAw = defpackage.a.aw(abzwVar.i);
        if (iAw == 0) {
            iAw = 1;
        }
        int i5 = iAw - 2;
        if (i5 == 1) {
            abyp abypVar = (abzwVar.c == 4 ? (acag) abzwVar.d : acag.a).c;
            if (abypVar == null) {
                abypVar = abyp.a;
            }
            for (abyo abyoVar : abypVar.b) {
                if (abyoVar.f) {
                    ygrVar.i(java.lang.Integer.valueOf(abyoVar.d));
                }
            }
        } else {
            if (i5 != 2) {
                if (i5 == 3) {
                    ygwVarH = defpackage.ygw.o((abzwVar.c == 6 ? (abzy) abzwVar.d : abzy.a).d);
                }
                if (!ygwVarH.isEmpty()) {
                    return false;
                }
                arrayList = new java.util.ArrayList();
                abzhVar = answer.a;
                i2 = abzhVar.b;
                iE = acal.e(i2);
                if (iE != 0) {
                    throw null;
                }
                i3 = iE - 1;
                if (i3 != 0) {
                    if (i2 == 2) {
                        abzgVar = (abzg) abzhVar.c;
                    } else {
                        abzgVar = abzg.a;
                    }
                    abzfVar = abzgVar.c;
                    if (abzfVar == null) {
                        abzfVar = abzf.a;
                    }
                    arrayList.add(java.lang.Integer.valueOf(abzfVar.c));
                } else if (i3 != 1) {
                    if (i2 == 3) {
                        abzcVar = (abzc) abzhVar.c;
                    } else {
                        abzcVar = abzc.a;
                    }
                    it = abzcVar.b.iterator();
                    while (it.hasNext()) {
                        arrayList.add(java.lang.Integer.valueOf(((abzf) it.next()).c));
                    }
                } else if (i3 == 2) {
                    if (i2 == 4) {
                        abzeVar = (abze) abzhVar.c;
                    } else {
                        abzeVar = abze.a;
                    }
                    abzfVar2 = abzeVar.c;
                    if (abzfVar2 == null) {
                        abzfVar2 = abzf.a;
                    }
                    arrayList.add(java.lang.Integer.valueOf(abzfVar2.c));
                }
                if (java.util.Collections.disjoint(arrayList, ygwVarH)) {
                    return false;
                }
                return true;
            }
            abyp abypVar2 = (abzwVar.c == 5 ? (abzo) abzwVar.d : abzo.a).c;
            if (abypVar2 == null) {
                abypVar2 = abyp.a;
            }
            for (abyo abyoVar2 : abypVar2.b) {
                if (abyoVar2.f) {
                    ygrVar.i(java.lang.Integer.valueOf(abyoVar2.d));
                }
            }
        }
        ygwVarH = ygrVar.g();
        if (!ygwVarH.isEmpty()) {
            return false;
        }
        arrayList = new java.util.ArrayList();
        abzhVar = answer.a;
        i2 = abzhVar.b;
        iE = acal.e(i2);
        if (iE != 0) {
            throw null;
        }
        i3 = iE - 1;
        if (i3 != 0) {
            if (i2 == 2) {
                abzgVar = (abzg) abzhVar.c;
            } else {
                abzgVar = abzg.a;
            }
            abzfVar = abzgVar.c;
            if (abzfVar == null) {
                abzfVar = abzf.a;
            }
            arrayList.add(java.lang.Integer.valueOf(abzfVar.c));
        } else if (i3 != 1) {
            if (i2 == 3) {
                abzcVar = (abzc) abzhVar.c;
            } else {
                abzcVar = abzc.a;
            }
            it = abzcVar.b.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(((abzf) it.next()).c));
            }
        } else if (i3 == 2) {
            if (i2 == 4) {
                abzeVar = (abze) abzhVar.c;
            } else {
                abzeVar = abze.a;
            }
            abzfVar2 = abzeVar.c;
            if (abzfVar2 == null) {
                abzfVar2 = abzf.a;
            }
            arrayList.add(java.lang.Integer.valueOf(abzfVar2.c));
        }
        if (java.util.Collections.disjoint(arrayList, ygwVarH)) {
            return true;
        }
        return false;
    }

    public static boolean p(boolean z, abzq abzqVar, com.google.android.libraries.surveys.internal.model.Answer answer) {
        defpackage.wpu wpuVar = wiz.c;
        android.content.Context context = wiz.b;
        return wiz.b(true) && z && !o(0, abzqVar, answer);
    }

    public static abwb q(abzf abzfVar) {
        defpackage.abor aborVarN = abwb.a.n();
        int i = abzfVar.b;
        aborVarN.t();
        aborVarN.b.b = i;
        int i2 = abzfVar.c;
        aborVarN.t();
        aborVarN.b.c = i2;
        java.lang.String str = abzfVar.d;
        aborVarN.t();
        abwb abwbVar = aborVarN.b;
        str.getClass();
        abwbVar.d = str;
        return aborVarN.q();
    }

    public static void r(abym abymVar, abyn abynVar, wjb wjbVar, android.content.Context context, java.lang.String str) {
        int i;
        int i2;
        int i3;
        int i4;
        defpackage.wpu wpuVar = wiz.c;
        if (wiz.c(adhs.c(wiz.b))) {
            defpackage.abor aborVarN = abxj.a.n();
            int i5 = 1;
            if ((abymVar.b & 1) != 0) {
                acaj acajVar = abymVar.c;
                if (acajVar == null) {
                    acajVar = acaj.a;
                }
                defpackage.abor aborVarN2 = abxn.a.n();
                java.lang.String str2 = acajVar.b;
                aborVarN2.t();
                abxn abxnVar = aborVarN2.b;
                str2.getClass();
                abxnVar.b = str2;
                defpackage.abpj abpjVar = acajVar.c;
                aborVarN2.t();
                abxn abxnVar2 = aborVarN2.b;
                defpackage.abpj abpjVar2 = abxnVar2.c;
                if (!abpjVar2.c()) {
                    abxnVar2.c = defpackage.abox.I(abpjVar2);
                }
                defpackage.abnf.i(abpjVar, abxnVar2.c);
                boolean z = acajVar.d;
                aborVarN2.t();
                aborVarN2.b.d = z;
                abxn abxnVarN = aborVarN2.q();
                aborVarN.t();
                abxj abxjVar = aborVarN.b;
                abxnVarN.getClass();
                abxjVar.c = abxnVarN;
                abxjVar.b |= 1;
            }
            defpackage.abor aborVarN3 = abxk.a.n();
            java.lang.String str3 = abynVar.e;
            aborVarN3.t();
            abxk abxkVar = aborVarN3.b;
            str3.getClass();
            abxkVar.e = str3;
            java.lang.String str4 = abynVar.g;
            aborVarN3.t();
            abxk abxkVar2 = aborVarN3.b;
            str4.getClass();
            abxkVar2.g = str4;
            if ((abynVar.b & 1) != 0) {
                acaf acafVar = abynVar.c;
                if (acafVar == null) {
                    acafVar = acaf.a;
                }
                defpackage.abor aborVarN4 = abxf.a.n();
                java.lang.String str5 = acafVar.b;
                aborVarN4.t();
                abxf abxfVar = aborVarN4.b;
                str5.getClass();
                abxfVar.b = str5;
                defpackage.abnv abnvVar = acafVar.c;
                aborVarN4.t();
                abxf abxfVar2 = aborVarN4.b;
                abnvVar.getClass();
                abxfVar2.c = abnvVar;
                aborVarN3.t();
                abxk abxkVar3 = aborVarN3.b;
                abxf abxfVarN = aborVarN4.q();
                abxfVarN.getClass();
                abxkVar3.c = abxfVarN;
                abxkVar3.b |= 1;
            }
            if ((abynVar.b & 2) != 0) {
                abzq abzqVar = abynVar.d;
                if (abzqVar == null) {
                    abzqVar = abzq.a;
                }
                defpackage.abor aborVarN5 = abwt.a.n();
                if ((abzqVar.b & 1) != 0) {
                    abzm abzmVar = abzqVar.c;
                    if (abzmVar == null) {
                        abzmVar = abzm.a;
                    }
                    defpackage.abor aborVarN6 = abwj.a.n();
                    boolean z2 = abzmVar.b;
                    aborVarN6.t();
                    aborVarN6.b.b = z2;
                    java.lang.String str6 = abzmVar.c;
                    aborVarN6.t();
                    abwj abwjVar = aborVarN6.b;
                    str6.getClass();
                    abwjVar.c = str6;
                    aborVarN5.t();
                    abwt abwtVar = aborVarN5.b;
                    abwj abwjVarN = aborVarN6.q();
                    abwjVarN.getClass();
                    abwtVar.c = abwjVarN;
                    abwtVar.b |= 1;
                }
                if ((abzqVar.b & 2) != 0) {
                    abyx abyxVar = abzqVar.d;
                    if (abyxVar == null) {
                        abyxVar = abyx.b;
                    }
                    defpackage.abor aborVarN7 = abvu.a.n();
                    java.lang.String str7 = abyxVar.c;
                    aborVarN7.t();
                    abvu abvuVar = aborVarN7.b;
                    str7.getClass();
                    abvuVar.b = str7;
                    java.lang.String str8 = abyxVar.d;
                    aborVarN7.t();
                    abvu abvuVar2 = aborVarN7.b;
                    str8.getClass();
                    abvuVar2.c = str8;
                    java.lang.String str9 = abyxVar.e;
                    aborVarN7.t();
                    abvu abvuVar3 = aborVarN7.b;
                    str9.getClass();
                    abvuVar3.d = str9;
                    defpackage.wpu wpuVar2 = wiz.c;
                    if (wiz.c(adjc.c(wiz.b)) && abyxVar.f.size() > 0) {
                        defpackage.abpf abpfVar = abyxVar.f;
                        aborVarN7.t();
                        abvu abvuVar4 = aborVarN7.b;
                        defpackage.abpf abpfVar2 = abvuVar4.e;
                        if (!abpfVar2.c()) {
                            abvuVar4.e = defpackage.abox.G(abpfVar2);
                        }
                        java.util.Iterator<E> it = abpfVar.iterator();
                        while (it.hasNext()) {
                            abvuVar4.e.g(((java.lang.Integer) it.next()).intValue());
                        }
                    }
                    aborVarN5.t();
                    abwt abwtVar2 = aborVarN5.b;
                    abvu abvuVarN = aborVarN7.q();
                    abvuVarN.getClass();
                    abwtVar2.d = abvuVarN;
                    abwtVar2.b |= 2;
                }
                if ((abzqVar.b & 4) != 0) {
                    abza abzaVar = abzqVar.e;
                    if (abzaVar == null) {
                        abzaVar = abza.b;
                    }
                    defpackage.abor aborVarN8 = abvw.a.n();
                    int i6 = abzaVar.e;
                    aborVarN8.t();
                    aborVarN8.b.d = i6;
                    if ((abzaVar.c & 1) != 0) {
                        abyy abyyVar = abzaVar.d;
                        if (abyyVar == null) {
                            abyyVar = abyy.a;
                        }
                        defpackage.abor aborVarN9 = abvv.a.n();
                        defpackage.aboh abohVar = abyyVar.b;
                        if (abohVar == null) {
                            abohVar = defpackage.aboh.a;
                        }
                        aborVarN9.t();
                        abvv abvvVar = aborVarN9.b;
                        abohVar.getClass();
                        abvvVar.c = abohVar;
                        abvvVar.b |= 1;
                        defpackage.aboh abohVar2 = abyyVar.c;
                        if (abohVar2 == null) {
                            abohVar2 = defpackage.aboh.a;
                        }
                        aborVarN9.t();
                        abvv abvvVar2 = aborVarN9.b;
                        abohVar2.getClass();
                        abvvVar2.d = abohVar2;
                        abvvVar2.b |= 2;
                        aborVarN8.t();
                        abvw abvwVar = aborVarN8.b;
                        abvv abvvVarN = aborVarN9.q();
                        abvvVarN.getClass();
                        abvwVar.c = abvvVarN;
                        abvwVar.b |= 1;
                    }
                    defpackage.wpu wpuVar3 = wiz.c;
                    if (wiz.c(adjc.c(wiz.b)) && abzaVar.f.size() > 0) {
                        defpackage.abpf abpfVar3 = abzaVar.f;
                        aborVarN8.t();
                        abvw abvwVar2 = aborVarN8.b;
                        defpackage.abpf abpfVar4 = abvwVar2.e;
                        if (!abpfVar4.c()) {
                            abvwVar2.e = defpackage.abox.G(abpfVar4);
                        }
                        java.util.Iterator<E> it2 = abpfVar3.iterator();
                        while (it2.hasNext()) {
                            abvwVar2.e.g(((java.lang.Integer) it2.next()).intValue());
                        }
                    }
                    aborVarN5.t();
                    abwt abwtVar3 = aborVarN5.b;
                    abvw abvwVarN = aborVarN8.q();
                    abvwVarN.getClass();
                    abwtVar3.e = abvwVarN;
                    abwtVar3.b |= 4;
                } else {
                    i5 = 1;
                }
                if ((abzqVar.b & 8) != 0) {
                    abzr abzrVar = abzqVar.f;
                    if (abzrVar == null) {
                        abzrVar = abzr.a;
                    }
                    defpackage.abor aborVarN10 = abwu.a.n();
                    boolean z3 = abzrVar.b;
                    aborVarN10.t();
                    aborVarN10.b.b = z3;
                    boolean z4 = abzrVar.c;
                    aborVarN10.t();
                    aborVarN10.b.c = z4;
                    aborVarN5.t();
                    abwt abwtVar4 = aborVarN5.b;
                    abwu abwuVarN = aborVarN10.q();
                    abwuVarN.getClass();
                    abwtVar4.f = abwuVarN;
                    abwtVar4.b |= 8;
                }
                if (abzqVar.g.size() > 0) {
                    for (abzw abzwVar : abzqVar.g) {
                        defpackage.abor aborVarN11 = abwx.a.n();
                        int i7 = abzwVar.e;
                        aborVarN11.t();
                        aborVarN11.b.d = i7;
                        java.lang.String str10 = abzwVar.f;
                        aborVarN11.t();
                        abwx abwxVar = aborVarN11.b;
                        str10.getClass();
                        abwxVar.e = str10;
                        java.lang.String str11 = abzwVar.g;
                        aborVarN11.t();
                        abwx abwxVar2 = aborVarN11.b;
                        str11.getClass();
                        abwxVar2.f = str11;
                        int i8 = abzwVar.i;
                        aborVarN11.t();
                        aborVarN11.b.h = i8;
                        boolean z5 = abzwVar.j;
                        aborVarN11.t();
                        aborVarN11.b.i = z5;
                        if (abzwVar.h.size() > 0) {
                            for (acai acaiVar : abzwVar.h) {
                                defpackage.abor aborVarN12 = abxm.a.n();
                                java.lang.String str12 = acaiVar.d;
                                aborVarN12.t();
                                abxm abxmVar = aborVarN12.b;
                                str12.getClass();
                                abxmVar.d = str12;
                                if (acaiVar.b == 2) {
                                    defpackage.abor aborVarN13 = abxl.a.n();
                                    int i9 = (acaiVar.b == 2 ? (acah) acaiVar.c : acah.a).b;
                                    aborVarN13.t();
                                    aborVarN13.b.b = i9;
                                    aborVarN12.t();
                                    abxm abxmVar2 = aborVarN12.b;
                                    abxl abxlVarN = aborVarN13.q();
                                    abxlVarN.getClass();
                                    abxmVar2.c = abxlVarN;
                                    abxmVar2.b = 2;
                                }
                                aborVarN11.t();
                                abwx abwxVar3 = aborVarN11.b;
                                abxm abxmVarN = aborVarN12.q();
                                abxmVarN.getClass();
                                defpackage.abpj abpjVar3 = abwxVar3.g;
                                if (!abpjVar3.c()) {
                                    abwxVar3.g = defpackage.abox.I(abpjVar3);
                                }
                                abwxVar3.g.add(abxmVarN);
                            }
                        }
                        int i10 = abzwVar.c;
                        if (i10 == 0) {
                            i4 = 5;
                        } else if (i10 == 4) {
                            i4 = i5;
                        } else if (i10 == 5) {
                            i4 = 2;
                        } else if (i10 != 6) {
                            i4 = i10 != 7 ? 0 : 4;
                        } else {
                            i4 = 3;
                        }
                        int i11 = i4 - 1;
                        if (i4 == 0) {
                            throw null;
                        }
                        if (i11 != 0) {
                            if (i11 == i5) {
                                abzo abzoVar = i10 == 5 ? (abzo) abzwVar.d : abzo.a;
                                defpackage.abor aborVarN14 = abwr.a.n();
                                if ((abzoVar.b & 1) != 0) {
                                    abyp abypVar = abzoVar.c;
                                    if (abypVar == null) {
                                        abypVar = abyp.a;
                                    }
                                    abvo abvoVarAf = af(abypVar);
                                    aborVarN14.t();
                                    abwr abwrVar = aborVarN14.b;
                                    abvoVarAf.getClass();
                                    abwrVar.c = abvoVarAf;
                                    abwrVar.b |= 1;
                                }
                                aborVarN11.t();
                                abwx abwxVar4 = aborVarN11.b;
                                abwr abwrVarN = aborVarN14.q();
                                abwrVarN.getClass();
                                abwxVar4.c = abwrVarN;
                                abwxVar4.b = 5;
                            } else if (i11 == 2) {
                                abzy abzyVar = i10 == 6 ? (abzy) abzwVar.d : abzy.a;
                                defpackage.abor aborVarN15 = abwy.a.n();
                                int i12 = abzyVar.b;
                                aborVarN15.t();
                                aborVarN15.b.b = i12;
                                int i13 = abzyVar.c;
                                aborVarN15.t();
                                aborVarN15.b.c = i13;
                                java.lang.String str13 = abzyVar.e;
                                aborVarN15.t();
                                abwy abwyVar = aborVarN15.b;
                                str13.getClass();
                                abwyVar.e = str13;
                                java.lang.String str14 = abzyVar.f;
                                aborVarN15.t();
                                abwy abwyVar2 = aborVarN15.b;
                                str14.getClass();
                                abwyVar2.f = str14;
                                if (abzyVar.d.size() > 0) {
                                    defpackage.abpf abpfVar5 = abzyVar.d;
                                    aborVarN15.t();
                                    abwy abwyVar3 = aborVarN15.b;
                                    defpackage.abpf abpfVar6 = abwyVar3.d;
                                    if (!abpfVar6.c()) {
                                        abwyVar3.d = defpackage.abox.G(abpfVar6);
                                    }
                                    defpackage.abnf.i(abpfVar5, abwyVar3.d);
                                }
                                aborVarN11.t();
                                abwx abwxVar5 = aborVarN11.b;
                                abwy abwyVarN = aborVarN15.q();
                                abwyVarN.getClass();
                                abwxVar5.c = abwyVarN;
                                abwxVar5.b = 6;
                            } else if (i11 == 3) {
                                abzp abzpVar = i10 == 7 ? (abzp) abzwVar.d : abzp.a;
                                defpackage.abor aborVarN16 = abws.a.n();
                                java.lang.String str15 = abzpVar.b;
                                aborVarN16.t();
                                abws abwsVar = aborVarN16.b;
                                str15.getClass();
                                abwsVar.b = str15;
                                java.lang.String str16 = abzpVar.c;
                                aborVarN16.t();
                                abws abwsVar2 = aborVarN16.b;
                                str16.getClass();
                                abwsVar2.c = str16;
                                aborVarN11.t();
                                abwx abwxVar6 = aborVarN11.b;
                                abws abwsVarN = aborVarN16.q();
                                abwsVarN.getClass();
                                abwxVar6.c = abwsVarN;
                                abwxVar6.b = 7;
                            }
                            i5 = 1;
                        } else {
                            acag acagVar = i10 == 4 ? (acag) abzwVar.d : acag.a;
                            defpackage.abor aborVarN17 = abxg.a.n();
                            int i14 = acagVar.d;
                            aborVarN17.t();
                            aborVarN17.b.d = i14;
                            if ((acagVar.b & 1) != 0) {
                                abyp abypVar2 = acagVar.c;
                                if (abypVar2 == null) {
                                    abypVar2 = abyp.a;
                                }
                                abvo abvoVarAf2 = af(abypVar2);
                                aborVarN17.t();
                                abxg abxgVar = aborVarN17.b;
                                abvoVarAf2.getClass();
                                abxgVar.c = abvoVarAf2;
                                i5 = 1;
                                abxgVar.b |= 1;
                            } else {
                                i5 = 1;
                            }
                            aborVarN11.t();
                            abwx abwxVar7 = aborVarN11.b;
                            abxg abxgVarN = aborVarN17.q();
                            abxgVarN.getClass();
                            abwxVar7.c = abxgVarN;
                            abwxVar7.b = 4;
                        }
                        aborVarN5.t();
                        abwt abwtVar5 = aborVarN5.b;
                        abwx abwxVarN = aborVarN11.q();
                        abwxVarN.getClass();
                        defpackage.abpj abpjVar4 = abwtVar5.g;
                        if (!abpjVar4.c()) {
                            abwtVar5.g = defpackage.abox.I(abpjVar4);
                        }
                        abwtVar5.g.add(abwxVarN);
                    }
                }
                i = 7;
                i2 = 6;
                if (abzqVar.h.size() > 0) {
                    java.util.Iterator<E> it3 = abzqVar.h.iterator();
                    while (it3.hasNext()) {
                        int iIntValue = ((java.lang.Integer) it3.next()).intValue();
                        aborVarN5.t();
                        abwt abwtVar6 = aborVarN5.b;
                        defpackage.abpf abpfVar7 = abwtVar6.h;
                        if (!abpfVar7.c()) {
                            abwtVar6.h = defpackage.abox.G(abpfVar7);
                        }
                        abwtVar6.h.g(iIntValue);
                    }
                }
                aborVarN3.t();
                abxk abxkVar4 = aborVarN3.b;
                abwt abwtVarN = aborVarN5.q();
                abwtVarN.getClass();
                abxkVar4.d = abwtVarN;
                abxkVar4.b |= 2;
            } else {
                i = 7;
                i2 = 6;
            }
            if (abynVar.f.size() > 0) {
                java.util.Iterator<E> it4 = abynVar.f.iterator();
                while (it4.hasNext()) {
                    switch ((java.lang.String) it4.next()) {
                        case "FAILED_TO_FETCH_SURVEY":
                            i3 = 4;
                            break;
                        case "UNSUPPORTED_CRONET_ENGINE":
                            i3 = i;
                            break;
                        case "BACKEND_TIMEOUT":
                            i3 = 3;
                            break;
                        case "NO_AVAILABLE_SURVEY":
                            i3 = 5;
                            break;
                        case "TRIGGER_ID_NOT_SET":
                            i3 = i2;
                            break;
                        default:
                            i3 = 2;
                            break;
                    }
                    aborVarN3.t();
                    abxk abxkVar5 = aborVarN3.b;
                    defpackage.abpf abpfVar8 = abxkVar5.f;
                    if (!abpfVar8.c()) {
                        abxkVar5.f = defpackage.abox.G(abpfVar8);
                    }
                    abxkVar5.f.g(defpackage.adrq.z(i3));
                }
            }
            wja wjaVarA = wja.a();
            defpackage.abor aborVarN18 = abwi.a.n();
            aborVarN18.t();
            abwi abwiVar = aborVarN18.b;
            abxj abxjVarN = aborVarN.q();
            abxjVarN.getClass();
            abwiVar.c = abxjVarN;
            abwiVar.b = 2;
            aborVarN18.t();
            abwi abwiVar2 = aborVarN18.b;
            abxk abxkVarN = aborVarN3.q();
            abxkVarN.getClass();
            abwiVar2.e = abxkVarN;
            abwiVar2.d = 4;
            wjaVarA.b(aborVarN18.q(), wjbVar.b(), wjbVar.a(), context, str);
        }
    }

    public static void s(wjb wjbVar, android.content.Context context, java.lang.String str) {
        defpackage.wpu wpuVar = wiz.c;
        if (wiz.c(adhs.c(wiz.b))) {
            wja wjaVarA = wja.a();
            defpackage.abor aborVarN = abxp.a.n();
            aborVarN.t();
            aborVarN.b.b = defpackage.adrq.B(2);
            aborVarN.t();
            aborVarN.b.c = defpackage.adrq.A(6);
            wjaVarA.d(aborVarN.q(), wjbVar.b(), wjbVar.a(), context, str);
        }
    }

    public static void t(wjb wjbVar, android.content.Context context, java.lang.String str) {
        defpackage.wpu wpuVar = wiz.c;
        if (wiz.c(adhs.c(wiz.b))) {
            wja wjaVarA = wja.a();
            defpackage.abor aborVarN = abxp.a.n();
            aborVarN.t();
            aborVarN.b.b = defpackage.adrq.B(2);
            aborVarN.t();
            aborVarN.b.c = defpackage.adrq.A(8);
            wjaVarA.d(aborVarN.q(), wjbVar.b(), wjbVar.a(), context, str);
        }
    }

    public static void u(wjb wjbVar, android.content.Context context, java.lang.String str) {
        defpackage.wpu wpuVar = wiz.c;
        if (wiz.c(adhs.c(wiz.b))) {
            wja wjaVarA = wja.a();
            defpackage.abor aborVarN = abxp.a.n();
            aborVarN.t();
            aborVarN.b.b = defpackage.adrq.B(2);
            aborVarN.t();
            aborVarN.b.c = defpackage.adrq.A(7);
            wjaVarA.d(aborVarN.q(), wjbVar.b(), wjbVar.a(), context, str);
        }
    }

    public static java.lang.Comparable v(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        return comparable.compareTo(comparable2) >= 0 ? comparable : comparable2;
    }

    public static java.lang.Comparable w(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        return comparable.compareTo(comparable2) <= 0 ? comparable : comparable2;
    }

    public static java.lang.String x(java.util.Map map, defpackage.xyj xyjVar, java.lang.String str) {
        defpackage.yot yotVarE = ((defpackage.ymz) ((defpackage.ync) map).entrySet()).iterator();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            if (yotVarE.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) yotVarE.next();
                sb.append(xyjVar.a(entry.getKey()));
                sb.append((java.lang.CharSequence) "=");
                sb.append(xyjVar.a(entry.getValue()));
                while (yotVarE.hasNext()) {
                    sb.append((java.lang.CharSequence) xyjVar.c);
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) yotVarE.next();
                    sb.append(xyjVar.a(entry2.getKey()));
                    sb.append((java.lang.CharSequence) "=");
                    sb.append(xyjVar.a(entry2.getValue()));
                }
            }
            return sb.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public static defpackage.xvr y() {
        return new xwf(defpackage.xuy.a(null));
    }

    public static void z(defpackage.xvq xvqVar) {
        java.lang.String strC = xvqVar.c();
        java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.xuy.a;
        if (strC.length() > 127) {
            strC.substring(0, 127);
        }
    }

    public wpu(byte[] bArr) {
    }

    private wpu() {
    }

    public void a(defpackage.wvs wvsVar, float f, float f2) {
    }
}
