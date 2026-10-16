package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.ImageView;
import com.google.android.libraries.handwriting.gui.ImeUiUtils;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.projection.gearhead.companion.settings.Material3SettingsActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public /* synthetic */ class wpq {
    public static wpq c;

    public wpq(char[] cArr) {
    }

    public static /* synthetic */ boolean A(int i) {
        return z(i) != 0;
    }

    public static void B(InputConnection inputConnection, xee xeeVar) {
        if (xeeVar.h()) {
            return;
        }
        String strE = xeeVar.e();
        if (strE != null) {
            inputConnection.commitText(strE, 1);
        }
        xeeVar.f();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void C(android.view.inputmethod.InputConnection r11, defpackage.xee r12, int r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpq.C(android.view.inputmethod.InputConnection, xee, int, boolean, boolean):void");
    }

    public static boolean D(int i) {
        return i >= 12593 && i <= 12643;
    }

    public static float E(float f) {
        return (float) (f * 0.017453292519943295d);
    }

    public static int F(int[] iArr) {
        return iArr[0];
    }

    public static int G(int[] iArr) {
        return iArr[1];
    }

    public static float H(float f, float f2, float f3, float f4) {
        float f5 = f3 * 0.5f;
        float f6 = f2 - f5;
        float f7 = f2 * f;
        float f8 = f5 + f4;
        float f9 = f6 - f4;
        return f8 > f9 ? f7 : afpt.d(f7, f8, f9);
    }

    public static boolean I(Map map) {
        xsn xsnVar = xsw.a;
        xsn xsnVar2 = xsw.I;
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        if (((Number) ah(map, xsnVar2, fValueOf)).floatValue() > BitmapDescriptorFactory.HUE_RED || ((Number) ah(map, xsw.af, fValueOf)).floatValue() > BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        if (((Number) ah(map, xsw.s, fValueOf)).floatValue() > BitmapDescriptorFactory.HUE_RED && ((Number) ah(map, xsw.x, fValueOf)).floatValue() > BitmapDescriptorFactory.HUE_RED && ((Number) ah(map, xsw.v, fValueOf)).floatValue() > BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        if (((Number) ah(map, xsw.C, fValueOf)).floatValue() <= BitmapDescriptorFactory.HUE_RED || ((Number) ah(map, xsw.E, fValueOf)).floatValue() <= BitmapDescriptorFactory.HUE_RED || ((Number) ah(map, xsw.D, fValueOf)).floatValue() <= BitmapDescriptorFactory.HUE_RED) {
            return ((Number) ah(map, xsw.F, fValueOf)).floatValue() > BitmapDescriptorFactory.HUE_RED && ((Number) ah(map, xsw.H, fValueOf)).floatValue() > BitmapDescriptorFactory.HUE_RED && ((Number) ah(map, xsw.G, fValueOf)).floatValue() > BitmapDescriptorFactory.HUE_RED;
        }
        return true;
    }

    public static Object J(xsy xsyVar, Object obj, Object obj2, float f) {
        long jI;
        long jI2;
        long jE;
        if (xsyVar instanceof xsn) {
            return Float.valueOf(((1.0f - f) * ((Float) obj).floatValue()) + (f * ((Float) obj2).floatValue()));
        }
        if (xsyVar instanceof xsr) {
            float f2 = 1.0f - f;
            long j = ((cja) obj).a;
            long j2 = ((cja) obj2).a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f2;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
            float fIntBitsToFloat3 = f2 * Float.intBitsToFloat((int) (j & 4294967295L));
            float fIntBitsToFloat4 = f * Float.intBitsToFloat((int) (j2 & 4294967295L));
            return new cja((Float.floatToRawIntBits(fIntBitsToFloat + fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3 + fIntBitsToFloat4) & 4294967295L));
        }
        if (!(xsyVar instanceof xsi)) {
            if (!(xsyVar instanceof xsm)) {
                if (!(xsyVar instanceof xsp) && !(xsyVar instanceof xso) && !(xsyVar instanceof xsq) && !(xsyVar instanceof xst) && !(xsyVar instanceof xsu) && !(xsyVar instanceof xsx)) {
                    throw new aezs();
                }
                String strConcat = "Linear interpolation (lerp) is not supported for IntUniforms. Uniform name: ".concat(xsyVar.a());
                Log.w("UniformInterpolators", strConcat);
                throw new IllegalArgumentException(strConcat);
            }
            float[] fArr = (float[]) obj;
            float[] fArr2 = (float[]) obj2;
            int length = fArr.length;
            if (length != fArr2.length) {
                throw new IllegalArgumentException("FloatArray sizes must match");
            }
            float[] fArr3 = new float[length];
            for (int i = 0; i < length; i++) {
                fArr3[i] = ((1.0f - f) * fArr[i]) + (fArr2[i] * f);
            }
            return fArr3;
        }
        if (obj instanceof cjv) {
            jI = ((cjv) obj).a;
        } else {
            if (!(obj instanceof Integer)) {
                throw new IllegalArgumentException("Unsupported start color type: ".concat(String.valueOf(affw.b(obj.getClass()).getSimpleName())));
            }
            jI = cjn.i(((Number) obj).intValue());
        }
        if (obj2 instanceof cjv) {
            jI2 = ((cjv) obj2).a;
        } else {
            if (!(obj2 instanceof Integer)) {
                throw new IllegalArgumentException("Unsupported end color type: ".concat(String.valueOf(affw.b(obj2.getClass()).getSimpleName())));
            }
            jI2 = cjn.i(((Number) obj2).intValue());
        }
        float fA = cjv.a(jI);
        float fA2 = cjv.a(jI2);
        if (fA == BitmapDescriptorFactory.HUE_RED && fA2 == BitmapDescriptorFactory.HUE_RED) {
            jE = cjn.i(0);
        } else if (fA == BitmapDescriptorFactory.HUE_RED) {
            jE = cjv.h(jI2, fA2 * f);
        } else if (fA2 == BitmapDescriptorFactory.HUE_RED) {
            jE = cjv.h(jI, fA * (1.0f - f));
        } else {
            float[] fArr4 = clj.a;
            clh clhVar = clj.x;
            long jE2 = cjv.e(jI, clhVar);
            long jE3 = cjv.e(jI2, clhVar);
            float fA3 = cjv.a(jE2);
            float fD = cjv.d(jE2);
            float fC = cjv.c(jE2);
            float fB = cjv.b(jE2);
            float fA4 = cjv.a(jE3);
            float fD2 = cjv.d(jE3);
            float fC2 = cjv.c(jE3);
            float fB2 = cjv.b(jE3);
            if (f < BitmapDescriptorFactory.HUE_RED) {
                f = 0.0f;
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            float f3 = 1.0f - f;
            jE = cjv.e(cjn.k((fD * f3) + (fD2 * f), (fC * f3) + (fC2 * f), (fB * f3) + (fB2 * f), (f3 * fA3) + (f * fA4), clhVar), clj.y[(int) (63 & jI2)]);
        }
        return new cjv(jE);
    }

    public static void K(StringBuilder sb, String str) {
        sb.append(afyh.a("\n        finalColor = calculateBorderLight(finalColor, mainSdf, center, yFract, pRotated, blurredSdfMask * ripple,\n            inBorderLightAlpha" + str + ", inBorderLightTopBlurRadius" + str + ", inBorderLightBottomBlurRadius" + str + ",\n            inBorderLightTopIntensity" + str + ", inBorderLightBottomIntensity" + str + ", inBorderLightStrokeWidth" + str + ",\n            inBorderLightDistortionSpeed" + str + ", inBorderLightDistortionFrequency" + str + ", inBorderLightDistortionAmplitude" + str + ",\n            inBorderLightColor" + str + ");\n        "));
        sb.append('\n');
    }

    public static String L(String str) {
        return afyh.a("\n            uniform float inBorderLightAlpha" + str + ";\n            uniform float inBorderLightTopBlurRadius" + str + ";\n            uniform float inBorderLightBottomBlurRadius" + str + ";\n            uniform float inBorderLightTopIntensity" + str + ";\n            uniform float inBorderLightBottomIntensity" + str + ";\n            uniform float inBorderLightStrokeWidth" + str + ";\n            uniform float inBorderLightDistortionSpeed" + str + ";\n            uniform float inBorderLightDistortionFrequency" + str + ";\n            uniform float inBorderLightDistortionAmplitude" + str + ";\n            layout(color) uniform vec4 inBorderLightColor" + str + ";\n\n            ");
    }

    public static Map M(xqq xqqVar, Map map) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        xsn xsnVar = xsw.a;
        linkedHashSet.addAll(xsw.ar);
        linkedHashSet.add(xsw.a);
        if (xqqVar.b != null) {
            linkedHashSet.addAll(xsw.as);
        }
        if (xqqVar.c != null) {
            linkedHashSet.addAll(xsw.at);
        }
        if (xqqVar.d != null) {
            linkedHashSet.addAll(xsw.au);
        }
        if (xqqVar.e != null) {
            linkedHashSet.addAll(xsw.av);
        }
        xqm xqmVar = xqqVar.f;
        if (xqmVar != null) {
            linkedHashSet.addAll(new xsv(xqmVar.a).k);
        }
        xqm xqmVar2 = xqqVar.g;
        if (xqmVar2 != null) {
            linkedHashSet.addAll(new xsv(xqmVar2.a).k);
        }
        if (xqqVar.h != null) {
            linkedHashSet.addAll(xsw.aw);
        }
        if (xqqVar.i != null) {
            linkedHashSet.addAll(xsw.ax);
            linkedHashSet.add(xsw.b);
        }
        if (xqqVar.j != null) {
            linkedHashSet.addAll(xsw.ay);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            xqp xqpVar = (xqp) entry.getKey();
            xrd xrdVar = (xrd) entry.getValue();
            List<xrg> list = xrdVar.a;
            ArrayList arrayList = new ArrayList(woy.bp(list, 10));
            for (xrg xrgVar : list) {
                List list2 = xrgVar.d;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    xsy xsyVar = ((xrc) obj).a;
                    if (linkedHashSet.contains(xsyVar)) {
                        arrayList2.add(obj);
                    } else {
                        Log.w(xsh.a, "State " + xqpVar + ": Filtering out keyframe for uniform '" + xsyVar.a() + "' as it's not active in the current shader config.");
                    }
                }
                arrayList.add(new xrg(xrgVar.a, xrgVar.b, xrgVar.c, arrayList2));
            }
            boolean z = xrdVar.b;
            wpq wpqVar = xrdVar.c;
            linkedHashMap.put(key, new xrd(arrayList, z));
        }
        return linkedHashMap;
    }

    public static /* synthetic */ cfy N(cfy cfyVar, xqq xqqVar, xqp xqpVar, Map map, afeg afegVar, Executor executor, xqq xqqVar2, int i) {
        tic ticVar = new tic(9);
        cfyVar.getClass();
        xqpVar.getClass();
        map.getClass();
        afegVar.getClass();
        xsh xshVar = new xsh(xqqVar, xqpVar, map, afegVar, (i & 16) != 0 ? null : executor, (i & 32) != 0 ? null : xqqVar2, ticVar);
        float[] fArr = xqqVar.a.g;
        return cfyVar.a(asl.J(xshVar, xta.c(fArr) + BitmapDescriptorFactory.HUE_RED, xta.e(fArr) + BitmapDescriptorFactory.HUE_RED, xta.d(fArr) + BitmapDescriptorFactory.HUE_RED, xta.a(fArr) + BitmapDescriptorFactory.HUE_RED));
    }

    public static xqm O(afec afecVar) {
        xrk xrkVar = new xrk((byte[]) null);
        afecVar.invoke(xrkVar);
        return xrkVar.a();
    }

    public static xqm P(xqm xqmVar, afec afecVar) {
        xrk xrkVar = new xrk(xqmVar);
        afecVar.invoke(xrkVar);
        return xrkVar.a();
    }

    public static xqn Q(xqn xqnVar, afec afecVar) {
        xru xruVar = new xru(xqnVar);
        afecVar.invoke(xruVar);
        return xruVar.a();
    }

    public static xqn R(afec afecVar) {
        xru xruVar = new xru((byte[]) null);
        afecVar.invoke(xruVar);
        return xruVar.a();
    }

    public static xqq S(xqq xqqVar, afec afecVar) {
        xrx xrxVar = new xrx(xqqVar);
        afecVar.invoke(xrxVar);
        return xrxVar.d();
    }

    public static xqq T(afec afecVar) {
        xrx xrxVar = new xrx((byte[]) null);
        afecVar.invoke(xrxVar);
        return xrxVar.d();
    }

    public static xqu U(xqu xquVar, afec afecVar) {
        xquVar.getClass();
        xry xryVar = new xry(xquVar);
        afecVar.invoke(xryVar);
        return xryVar.a();
    }

    public static xqu V(afec afecVar) {
        xry xryVar = new xry((byte[]) null);
        afecVar.invoke(xryVar);
        return xryVar.a();
    }

    public static xqv W(xqv xqvVar, afec afecVar) {
        xrz xrzVar = new xrz(xqvVar);
        afecVar.invoke(xrzVar);
        return new xqv(xrzVar.a, xrzVar.b, xrzVar.c, xrzVar.d, xrzVar.e, xrzVar.f, xrzVar.g, xrzVar.h, xrzVar.i, xrzVar.j, xrzVar.k, xrzVar.l);
    }

    public static xqw X(xqw xqwVar, afec afecVar) {
        xsa xsaVar = new xsa(xqwVar);
        afecVar.invoke(xsaVar);
        return xsaVar.a();
    }

    public static xqw Y(afec afecVar) {
        xsa xsaVar = new xsa((byte[]) null);
        afecVar.invoke(xsaVar);
        return xsaVar.a();
    }

    public static xqx Z(xqx xqxVar, afec afecVar) {
        xsb xsbVar = new xsb(xqxVar);
        afecVar.invoke(xsbVar);
        return xsbVar.a();
    }

    public static xqx aa(afec afecVar) {
        xsb xsbVar = new xsb((byte[]) null);
        afecVar.invoke(xsbVar);
        return xsbVar.a();
    }

    public static xqy ab(xqy xqyVar, afec afecVar) {
        xsc xscVar = new xsc(xqyVar);
        afecVar.invoke(xscVar);
        return new xqy(xscVar.a, xscVar.c, xscVar.b);
    }

    public static xqz ac(xqz xqzVar, afec afecVar) {
        xsd xsdVar = new xsd(xqzVar);
        afecVar.invoke(xsdVar);
        return xsdVar.a();
    }

    public static xrb ad(xrb xrbVar, afec afecVar) {
        xse xseVar = new xse(xrbVar);
        afecVar.invoke(xseVar);
        return xseVar.a();
    }

    public static xrb ae(afec afecVar) {
        xse xseVar = new xse((byte[]) null);
        afecVar.invoke(xseVar);
        return xseVar.a();
    }

    public static xqq af(final List list) {
        xqq xqqVar = (xqq) woy.bH(list);
        if (xqqVar == null) {
            xqqVar = new xqq(null);
        }
        return S(xqqVar, new afec() { // from class: xrv
            @Override // defpackage.afec
            public final Object invoke(Object obj) {
                xqv xqvVar;
                Object next;
                xqn xqnVar;
                Object next2;
                xqz xqzVar;
                Object next3;
                xqm xqmVar;
                Object next4;
                xqm xqmVar2;
                Object next5;
                xrb xrbVar;
                Object next6;
                xqy xqyVar;
                Object next7;
                xqx xqxVar;
                Object next8;
                xqw xqwVar;
                xrx xrxVar = (xrx) obj;
                xrxVar.getClass();
                xqw xqwVar2 = xrxVar.b;
                List list2 = list;
                Object obj2 = null;
                if (xqwVar2 == null) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next8 = null;
                            break;
                        }
                        next8 = it.next();
                        if (((xqq) next8).b != null) {
                            break;
                        }
                    }
                    xqq xqqVar2 = (xqq) next8;
                    if (xqqVar2 != null && (xqwVar = xqqVar2.b) != null) {
                        xrxVar.b = wpq.X(xqwVar, new xrw(0));
                    }
                }
                if (xrxVar.c == null) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next7 = null;
                            break;
                        }
                        next7 = it2.next();
                        if (((xqq) next7).c != null) {
                            break;
                        }
                    }
                    xqq xqqVar3 = (xqq) next7;
                    if (xqqVar3 != null && (xqxVar = xqqVar3.c) != null) {
                        xrxVar.c = wpq.Z(xqxVar, new xrw(2));
                    }
                }
                if (xrxVar.d == null) {
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next6 = null;
                            break;
                        }
                        next6 = it3.next();
                        if (((xqq) next6).d != null) {
                            break;
                        }
                    }
                    xqq xqqVar4 = (xqq) next6;
                    if (xqqVar4 != null && (xqyVar = xqqVar4.d) != null) {
                        xrxVar.d = wpq.ab(xqyVar, new xrw(3));
                    }
                }
                if (xrxVar.e == null) {
                    Iterator it4 = list2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next5 = null;
                            break;
                        }
                        next5 = it4.next();
                        if (((xqq) next5).e != null) {
                            break;
                        }
                    }
                    xqq xqqVar5 = (xqq) next5;
                    if (xqqVar5 != null && (xrbVar = xqqVar5.e) != null) {
                        xrxVar.e = wpq.ad(xrbVar, new xrw(4));
                    }
                }
                if (xrxVar.f == null) {
                    Iterator it5 = list2.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            next4 = null;
                            break;
                        }
                        next4 = it5.next();
                        if (((xqq) next4).f != null) {
                            break;
                        }
                    }
                    xqq xqqVar6 = (xqq) next4;
                    if (xqqVar6 != null && (xqmVar2 = xqqVar6.f) != null) {
                        xrxVar.f = wpq.P(xqmVar2, new xrw(5));
                    }
                }
                if (xrxVar.g == null) {
                    Iterator it6 = list2.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it6.next();
                        if (((xqq) next3).g != null) {
                            break;
                        }
                    }
                    xqq xqqVar7 = (xqq) next3;
                    if (xqqVar7 != null && (xqmVar = xqqVar7.g) != null) {
                        xrxVar.g = wpq.P(xqmVar, new xrw(6));
                    }
                }
                if (xrxVar.h == null) {
                    Iterator it7 = list2.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it7.next();
                        if (((xqq) next2).h != null) {
                            break;
                        }
                    }
                    xqq xqqVar8 = (xqq) next2;
                    if (xqqVar8 != null && (xqzVar = xqqVar8.h) != null) {
                        xrxVar.h = wpq.ac(xqzVar, new xrw(7));
                    }
                }
                if (xrxVar.i == null) {
                    Iterator it8 = list2.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it8.next();
                        if (((xqq) next).i != null) {
                            break;
                        }
                    }
                    xqq xqqVar9 = (xqq) next;
                    if (xqqVar9 != null && (xqnVar = xqqVar9.i) != null) {
                        xrxVar.i = wpq.Q(xqnVar, new xrw(8));
                    }
                }
                if (xrxVar.j == null) {
                    Iterator it9 = list2.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            break;
                        }
                        Object next9 = it9.next();
                        if (((xqq) next9).j != null) {
                            obj2 = next9;
                            break;
                        }
                    }
                    xqq xqqVar10 = (xqq) obj2;
                    if (xqqVar10 != null && (xqvVar = xqqVar10.j) != null) {
                        xrxVar.j = wpq.W(xqvVar, new xrw(9));
                    }
                }
                return afak.a;
            }
        });
    }

    public static xrf ag(afec afecVar) {
        xrf xrfVar = new xrf();
        afecVar.invoke(xrfVar);
        return xrfVar;
    }

    public static Object ah(Map map, xsy xsyVar, Object obj) {
        xsyVar.getClass();
        return map.containsKey(xsyVar) ? map.get(xsyVar) : obj;
    }

    public static List ai(xqq xqqVar) {
        String str;
        char c2;
        xqo xqoVar;
        Boolean boolValueOf = Boolean.valueOf(xqqVar.b != null);
        Boolean boolValueOf2 = Boolean.valueOf(xqqVar.c != null);
        Boolean boolValueOf3 = Boolean.valueOf(xqqVar.d != null);
        Boolean boolValueOf4 = Boolean.valueOf(xqqVar.e != null);
        Boolean boolValueOf5 = Boolean.valueOf(xqqVar.f != null);
        Boolean boolValueOf6 = Boolean.valueOf(xqqVar.g != null);
        Boolean boolValueOf7 = Boolean.valueOf(xqqVar.h != null);
        xqn xqnVar = xqqVar.i;
        Boolean boolValueOf8 = Boolean.valueOf(xqnVar != null);
        xqv xqvVar = xqqVar.j;
        Boolean boolValueOf9 = Boolean.valueOf(xqvVar != null);
        if (xqnVar != null) {
            str = xqnVar.a;
        } else {
            xqnVar = null;
            str = null;
        }
        if (str != null) {
            c2 = 1;
            xqoVar = new xqo(str);
        } else {
            c2 = 1;
            xqoVar = null;
        }
        Boolean bool = xqnVar != null ? false : null;
        Boolean boolValueOf10 = Boolean.valueOf(!affa.e(xqvVar != null ? Float.valueOf(xqvVar.k) : null, BitmapDescriptorFactory.HUE_RED));
        Object[] objArr = new Object[13];
        objArr[0] = boolValueOf;
        objArr[c2] = boolValueOf2;
        objArr[2] = boolValueOf3;
        objArr[3] = boolValueOf4;
        objArr[4] = boolValueOf5;
        objArr[5] = boolValueOf6;
        objArr[6] = boolValueOf7;
        objArr[7] = boolValueOf8;
        objArr[8] = boolValueOf9;
        objArr[9] = xqoVar;
        objArr[10] = bool;
        objArr[11] = boolValueOf10;
        objArr[12] = false;
        return woy.bi(objArr);
    }

    public static void aj(xqm xqmVar, Map map) {
        xsv xsvVar = new xsv(xqmVar.a);
        map.put(xsvVar.b, Float.valueOf(xqmVar.b));
        map.put(xsvVar.c, Float.valueOf(xqmVar.c));
        map.put(xsvVar.d, Float.valueOf(xqmVar.d));
        map.put(xsvVar.e, Float.valueOf(xqmVar.e));
        map.put(xsvVar.f, Float.valueOf(xqmVar.f));
        map.put(xsvVar.g, Integer.valueOf(xqmVar.j));
        map.put(xsvVar.j, Float.valueOf(xqmVar.g));
        map.put(xsvVar.h, Float.valueOf(xqmVar.i));
        map.put(xsvVar.i, Float.valueOf(xqmVar.h));
        map.put(xsvVar.a, Float.valueOf(xqmVar.k));
    }

    public static void ak(boolean z) {
        xqp.a.b(Boolean.valueOf(z));
    }

    public static /* synthetic */ String al(int i) {
        switch (i) {
            case 2:
                return "STATUS_PHONE_WIFI_DISABLED";
            case 3:
                return "STATUS_INSTRUCT_USER_TO_CHECK_THE_PHONE";
            case 4:
                return "STATUS_NO_SUPPORTED_WIFI_CHANNELS";
            case 5:
                return "STATUS_INVALID_HOST";
            case 6:
                return "STATUS_WIFI_NOT_YET_STARTED";
            case 7:
                return "STATUS_WIFI_DISABLED";
            case 8:
                return "STATUS_PROJECTION_ALREADY_STARTED";
            case 9:
                return "STATUS_WIFI_INCORRECT_CREDENTIALS";
            case 10:
                return "STATUS_WIFI_INACCESSIBLE_CHANNEL";
            case 11:
                return "STATUS_NO_COMPATIBLE_VERSION";
            case 12:
                return "STATUS_SUCCESS";
            case 13:
                return "STATUS_UNSOLICITED_MESSAGE";
            default:
                return "STATUS_WIFI_NETWORK_UNAVAILABLE";
        }
    }

    public static int am(int i) {
        switch (i) {
            case ImeUiUtils.IME_ACTION_LEAVE_EMOJI_MODE /* -11 */:
                return 1;
            case ImeUiUtils.IME_ACTION_EMOJI_MODE /* -10 */:
                return 2;
            case -9:
                return 3;
            case -8:
                return 4;
            case -7:
                return 5;
            case -6:
                return 6;
            case -5:
                return 7;
            case -4:
                return 8;
            case -3:
                return 9;
            case -2:
                return 10;
            case -1:
                return 11;
            case 0:
                return 12;
            case 1:
                return 13;
            default:
                return 0;
        }
    }

    private static int[] an(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int length2 = drawableState2.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, length + length2);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, length2);
        return iArrCopyOf;
    }

    private static void ao(CheckableImageButton checkableImageButton) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        checkableImageButton.setFocusable(zHasOnClickListeners);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.c = zHasOnClickListeners;
        checkableImageButton.setLongClickable(false);
        checkableImageButton.setImportantForAccessibility(true != zHasOnClickListeners ? 2 : 1);
    }

    public static boolean c() {
        String str = Build.MANUFACTURER;
        return (str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu");
    }

    public static Typeface d(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, dlz.j(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    public static float e(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    public static void f(View view, int i) {
        view.animate().alpha(i == 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED).setDuration(100L).withEndAction(new rgm(view, i, 16));
    }

    public static void g(View view) {
        new Handler(Looper.getMainLooper()).postDelayed(new wxj(view, 8), 100L);
    }

    public static Intent h(Context context, Class cls) {
        return new Intent(context, (Class<?>) Material3SettingsActivity.class).putExtra("fragment_name", cls.getName());
    }

    public static ImageView.ScaleType i(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static void j(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(an(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void k(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(an(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void l(CheckableImageButton checkableImageButton, int i) {
        checkableImageButton.setMinimumWidth(i);
        checkableImageButton.setMinimumHeight(i);
    }

    public static void m(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        ao(checkableImageButton);
    }

    public static void n(CheckableImageButton checkableImageButton) {
        checkableImageButton.setOnLongClickListener(null);
        ao(checkableImageButton);
    }

    public static void o(CheckableImageButton checkableImageButton, CharSequence charSequence) {
        if (true != checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        checkableImageButton.setTooltipText(charSequence);
    }

    public static int p(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            default:
                return 0;
        }
    }

    public static /* synthetic */ xic q(abnp abnpVar) {
        abnv abnvVarQ = abnpVar.q();
        abnvVarQ.getClass();
        return (xic) abnvVarQ;
    }

    public static void r(xgl xglVar, abnp abnpVar) {
        abnpVar.t();
        xic xicVar = (xic) abnpVar.b;
        aboe aboeVar = xic.a;
        xicVar.e = xglVar;
        xicVar.d = 1;
    }

    public static /* synthetic */ void s(xgh xghVar, abnp abnpVar) {
        abnpVar.t();
        xic xicVar = (xic) abnpVar.b;
        aboe aboeVar = xic.a;
        abod abodVar = xicVar.g;
        if (!abodVar.c()) {
            xicVar.g = abnv.G(abodVar);
        }
        xicVar.g.g(xghVar.a());
    }

    public static void t(int i, abnp abnpVar) {
        abnpVar.t();
        xic xicVar = (xic) abnpVar.b;
        aboe aboeVar = xic.a;
        xicVar.h = aclh.c(i);
        xicVar.c |= 2;
    }

    public static /* synthetic */ void u(abnp abnpVar) {
        new abof(((xic) abnpVar.b).g, xic.a);
    }

    public static /* synthetic */ xga v(abnp abnpVar) {
        abnv abnvVarQ = abnpVar.q();
        abnvVarQ.getClass();
        return (xga) abnvVarQ;
    }

    public static void w(int i, abnp abnpVar) {
        abnpVar.t();
        xga xgaVar = (xga) abnpVar.b;
        xga xgaVar2 = xga.a;
        xgaVar.c = aclh.f(i);
        xgaVar.b |= 1;
    }

    public static /* synthetic */ xgb x(abnp abnpVar) {
        abnv abnvVarQ = abnpVar.q();
        abnvVarQ.getClass();
        return (xgb) abnvVarQ;
    }

    public static void y(xga xgaVar, abnp abnpVar) {
        abnpVar.t();
        xgb xgbVar = (xgb) abnpVar.b;
        xgb xgbVar2 = xgb.a;
        xgbVar.c = xgaVar;
        xgbVar.b |= 1;
    }

    public static /* synthetic */ int z(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public void a() {
    }

    public void b(int i) {
    }
}
