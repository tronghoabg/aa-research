package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.Pair;
import androidx.car.app.model.CarColor;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class gbt {
    public static final djv a(bwq bwqVar) {
        return (djv) bwqVar.a();
    }

    public static final void b(boolean z, gbv gbvVar, cfy cfyVar, long j, afeg afegVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        afeg afegVar2;
        boolean z2;
        int i3;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(41148635);
        if (i4 == 0) {
            i2 = (true != buxVarC.D(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(gbvVar) : buxVarC.E(gbvVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.B(j) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 8192 : 16384;
        }
        if (buxVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            hir hirVar = gux.e(buxVarC).c;
            cfy cfyVarI = asl.I(cfyVar, BitmapDescriptorFactory.HUE_RED, 12.0f);
            cfr cfrVar = cfl.n;
            hir hirVar2 = gux.e(buxVarC).c;
            ctp ctpVarA = avv.a(new asz(16.0f, false, null), cfrVar, buxVarC, 48);
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
            afeg afegVar3 = cwb.e;
            byq.c(buxVarC, ctpVarA, afegVar3);
            afeg afegVar4 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar4);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar5 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar5);
            afec afecVar = cwb.g;
            byq.b(buxVarC, afecVar);
            afeg afegVar6 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar6);
            gbg gbgVar = gbvVar.d;
            avy avyVar = avy.a;
            buxVarC.v(-479666801);
            cfv cfvVar = cfy.e;
            int i5 = (i2 << 3) & 57344;
            int i6 = i2;
            gbf.d(gbgVar, awd.i(cfvVar, gux.g(buxVarC).d.d), null, null, new cjv(j), false, true, null, null, false, buxVarC, i5 | 1572864, 940);
            buxVar2 = buxVarC;
            bvvVar.Y(false);
            cfy cfyVarB = avyVar.b(cfvVar, 1.0f, true);
            ctp ctpVarB = atk.b(cfl.a, false);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVar2, cfyVarB);
            buxVar2.w();
            if (bvvVar.t) {
                buxVar2.j(afdrVar);
            } else {
                buxVar2.y();
            }
            byq.c(buxVar2, ctpVarB, afegVar3);
            byq.c(buxVar2, ccxVarAh2, afegVar4);
            byq.c(buxVar2, Integer.valueOf(iG2), afegVar5);
            byq.b(buxVar2, afecVar);
            byq.c(buxVar2, cfyVarJ2, afegVar6);
            if (z) {
                gcq gcqVar = gbvVar.b;
                buxVar2.v(1392911639);
                z2 = true;
                i3 = i6;
                fzc.g(gcqVar, null, 0, 0, j, czz.av(buxVar2).l, 0L, null, 0, 0, null, null, null, false, false, buxVar2, i5 | 8, 0, 65486);
                buxVar2 = buxVar2;
                bvvVar.Y(false);
            } else {
                z2 = true;
                i3 = i6;
                buxVar2.v(1393048349);
                bvvVar.Y(false);
            }
            afegVar2 = afegVar;
            afegVar2.invoke(buxVar2, Integer.valueOf((i3 >> 12) & 14));
            bvvVar.Y(z2);
            buxVar2.v(-478953181);
            bvvVar.Y(false);
            bvvVar.Y(z2);
        } else {
            buxVar2 = buxVarC;
            afegVar2 = afegVar;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gbr(z, gbvVar, cfyVar, j, afegVar2, i, 0);
        }
    }

    public static final void c(gbv gbvVar, long j, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 48;
        bux buxVarC = buxVar.c(-1564893286);
        if (i3 == 0) {
            i2 = (true != buxVarC.B(j) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 145) != 144, i2 & 1)) {
            cfy cfyVarD = das.d(cfyVar, "text_field_mic_button");
            ctp ctpVarB = atk.b(cfl.e, false);
            bvv bvvVar = (bvv) buxVarC;
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
            ca.bb(dao.b(R.drawable.gs_mic_vd_theme_24, buxVarC, 0), null, awd.i(cfy.e, gux.g(buxVarC).d.d), null, null, BitmapDescriptorFactory.HUE_RED, new cjp(j, 5), buxVarC, 56, 56);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gaw(gbvVar, j, cfyVar, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.gbv r50, defpackage.cfy r51, defpackage.ckv r52, defpackage.asf r53, defpackage.bux r54, int r55) {
        /*
            Method dump skipped, instructions count: 997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gbt.d(gbv, cfy, ckv, asf, bux, int):void");
    }

    public static final int e(int i) {
        if (a.Y(i, 7)) {
            return 129;
        }
        if (a.Y(i, 6)) {
            return 33;
        }
        if (a.Y(i, 3)) {
            return 2;
        }
        if (a.Y(i, 4)) {
            return 3;
        }
        return !a.Y(i, 8) ? 1 : 18;
    }

    public static int f(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        ServiceInfo serviceInfo;
        ApplicationInfo applicationInfo = null;
        try {
            serviceInfo = context.getPackageManager().getServiceInfo(componentName, 128);
        } catch (PackageManager.NameNotFoundException e) {
            gks.g("CarApp.H", e, "Component %s doesn't exist", componentName);
            serviceInfo = null;
        }
        int i = (serviceInfo == null || serviceInfo.metaData == null) ? 0 : serviceInfo.metaData.getInt("androidx.car.app.theme");
        if (i != 0) {
            return i;
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(componentName.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e2) {
            gks.g("CarApp.H", e2, "Package %s doesn't exist", componentName.getPackageName());
        }
        if (applicationInfo == null) {
            return 0;
        }
        int i2 = applicationInfo.metaData != null ? applicationInfo.metaData.getInt("androidx.car.app.theme") : 0;
        return i2 == 0 ? applicationInfo.theme : i2;
    }

    public static Context g(Context context, String str) {
        try {
            return context.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            gks.g("CarApp.H", e, "Package %s does not exist", str);
            return null;
        }
    }

    public static Pair h(Resources.Theme theme, String str, String str2, String str3, int i, int i2) {
        Resources resources = theme.getResources();
        int identifier = resources.getIdentifier(str2, "attr", str);
        int identifier2 = resources.getIdentifier(str3, "attr", str);
        if (identifier == 0 || identifier2 == 0) {
            return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        }
        int iQ = q(identifier, theme);
        int iQ2 = q(identifier2, theme);
        return (iQ == 0 || iQ2 == 0) ? new Pair(Integer.valueOf(i), Integer.valueOf(i2)) : new Pair(Integer.valueOf(iQ), Integer.valueOf(iQ2));
    }

    public static int i(float f) {
        return (int) Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(255.0f, f));
    }

    public static int j(int i, float f) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * (1.0f - f);
        return Color.HSVToColor(fArr);
    }

    public static int k(geu geuVar, CarColor carColor, boolean z, int i, ghv ghvVar, int i2) {
        CarColor carColor2;
        int i3;
        if (carColor == null) {
            return i;
        }
        try {
            if (ghvVar.a(carColor) != null) {
                jvb jvbVarG = geuVar.d().g();
                geuVar.u();
                return o(geuVar, z, carColor, jvbVarG, i, i2);
            }
            carColor2 = carColor;
            i3 = i;
            try {
                throw new IllegalArgumentException("Car color type is not allowed: ".concat(carColor2.toString()));
            } catch (IllegalArgumentException e) {
                e = e;
                gks.g("CarApp.H.Tem", e, "Validation failed for color %s, will use default", carColor2);
                return i3;
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
            carColor2 = carColor;
            i3 = i;
        }
    }

    public static boolean l(geu geuVar, CarColor carColor, int i) {
        geu geuVar2;
        CarColor carColor2;
        CarColor carColorCreateCustom;
        if (i == 0 || CarColor.DEFAULT.equals(carColor)) {
            return true;
        }
        if (carColor.getType() == 0) {
            geuVar2 = geuVar;
            carColorCreateCustom = carColor;
            carColor2 = carColorCreateCustom;
        } else {
            ghv ghvVar = ghv.a;
            geuVar2 = geuVar;
            carColor2 = carColor;
            carColorCreateCustom = CarColor.createCustom(k(geuVar2, carColor2, false, 0, ghvVar, 0), k(geuVar2, carColor2, true, 0, ghvVar, 0));
        }
        boolean z = m(carColorCreateCustom.getColor(), i, 4.5d) || m(carColorCreateCustom.getColorDark(), i, 4.5d);
        if (!z) {
            gks.k("CarApp.H.Tem", "Color contrast check failed, foreground car color: %s, background color: %d", carColor2, Integer.valueOf(i));
            geuVar2.A();
        }
        return z;
    }

    public static boolean m(int i, int i2, double d) {
        int iAlpha = Color.alpha(i2);
        if (iAlpha == 0) {
            return true;
        }
        if (iAlpha == 255) {
            return dvd.a(i, i2) > d;
        }
        Log.w("CarApp.H.Tem", a.bp(i2, "Background color is not opaque nor fully transparent, fails contrast check :"));
        return false;
    }

    public static jvb n(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String packageName = componentName.getPackageName();
        jvb jvbVarA = jvb.a(context);
        int iF = f(context, componentName);
        if (iF == 0) {
            gks.k("CarApp.H.Tem", "Cannot get the app theme from %s", packageName);
            return jvbVarA;
        }
        Context contextG = g(context, packageName);
        if (contextG == null) {
            gks.k("CarApp.H.Tem", "Cannot get the app context from %s", packageName);
            return jvbVarA;
        }
        contextG.setTheme(iF);
        int i = jvbVarA.d;
        int i2 = jvbVarA.a;
        Resources.Theme theme = contextG.getTheme();
        Pair pairH = h(theme, packageName, "carColorPrimary", "carColorPrimaryDark", i, i2);
        Pair pairH2 = h(theme, packageName, "carColorSecondary", "carColorSecondaryDark", jvbVarA.c, jvbVarA.b);
        return new jvb(((Integer) pairH.first).intValue(), ((Integer) pairH.second).intValue(), ((Integer) pairH2.first).intValue(), ((Integer) pairH2.second).intValue(), null);
    }

    public static int o(Context context, boolean z, CarColor carColor, jvb jvbVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int type = carColor.getType();
        Resources resources = context.getResources();
        switch (type) {
            case 0:
                return r(carColor.getColor(), carColor.getColorDark(), i2, i, z);
            case 1:
                return i;
            case 2:
                return r(jvbVar.d, jvbVar.a, i2, i, z);
            case 3:
                return r(jvbVar.c, jvbVar.b, i2, i, z);
            case 4:
                if (z) {
                    leh.a();
                    i3 = R.color.template_standard_red_dark_material;
                } else {
                    leh.a();
                    i3 = R.color.template_standard_red_material;
                }
                return resources.getColor(i3);
            case 5:
                if (z) {
                    leh.a();
                    i4 = R.color.template_standard_green_dark_material;
                } else {
                    leh.a();
                    i4 = R.color.template_standard_green_material;
                }
                return resources.getColor(i4);
            case 6:
                if (z) {
                    leh.a();
                    i5 = R.color.template_standard_blue_dark_material;
                } else {
                    leh.a();
                    i5 = R.color.template_standard_blue_material;
                }
                return resources.getColor(i5);
            case 7:
                if (z) {
                    leh.a();
                    i6 = R.color.template_standard_yellow_dark_material;
                } else {
                    leh.a();
                    i6 = R.color.template_standard_yellow_material;
                }
                return resources.getColor(i6);
            default:
                gks.e("CarApp.H.Tem", "Failed to resolve standard color id: %d", Integer.valueOf(type));
                return i;
        }
    }

    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [asf, byte[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4 */
    public static final void p(final afeg afegVar, final boolean z, final gbv gbvVar, final long j, final boolean z2, final ieb iebVar, final cil cilVar, final ckv ckvVar, bux buxVar, final int i) {
        int i2;
        ckv ckvVar2;
        bux buxVar2;
        float f;
        bvv bvvVar;
        boolean z3;
        int i3;
        ?? r11;
        boolean z4;
        bvv bvvVar2;
        bux buxVar3;
        float f2;
        cfy cfyVarX;
        int i4;
        int i5 = i & 6;
        bux buxVarC = buxVar.c(985722454);
        if (i5 == 0) {
            i2 = (true != buxVarC.E(afegVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(gbvVar) : buxVarC.E(gbvVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.B(j) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.D(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != ((i & 262144) == 0 ? buxVarC.C(iebVar) : buxVarC.E(iebVar)) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.C(cilVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            ckvVar2 = ckvVar;
            i2 |= true != buxVarC.C(ckvVar2) ? 4194304 : 8388608;
        } else {
            ckvVar2 = ckvVar;
        }
        if (buxVarC.I((4793491 & i2) != 4793490, i2 & 1)) {
            cfr cfrVar = cfl.n;
            cfv cfvVar = cfy.e;
            cfy cfyVarC = awd.c(cfvVar, 1.0f);
            ctp ctpVarA = avv.a(atd.a, cfrVar, buxVarC, 48);
            bvv bvvVar3 = (bvv) buxVarC;
            int iG = a.g(bvvVar3.u);
            ccx ccxVarAh = bvvVar3.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarC);
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
            avy avyVar = avy.a;
            buxVarC.v(336310300);
            hir hirVar = gux.e(buxVarC).c;
            bvvVar3.Y(false);
            afdr afdrVar2 = gbvVar.g;
            if (afdrVar2 != null) {
                buxVarC.v(336313212);
                bvvVar3.Y(false);
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                buxVarC.v(336313948);
                hir hirVar2 = gux.e(buxVarC).c;
                bvvVar3.Y(false);
                f = 24.0f;
            }
            buxVarC.v(336319556);
            cfv cfvVar2 = cfvVar;
            cfy cfyVarB = awd.b(cfvVar2, 1.0f);
            if (z2) {
                int i6 = i2 & 458752;
                i3 = 131072;
                r11 = 0;
                ckv ckvVar3 = ckvVar2;
                bvvVar = bvvVar3;
                cfy cfyVarA = ggh.a(cfyVarB, ckvVar3, 0L, 0L, null, null, null, false, false, buxVarC, (i2 >> 18) & 112, 254);
                cfvVar2 = cfvVar2;
                buxVarC = buxVarC;
                boolean z5 = i6 == 131072 || ((i2 & 262144) != 0 && buxVarC.E(iebVar));
                Object objS = bvvVar.S();
                if (z5 || objS == buw.a) {
                    z3 = true;
                    objS = new gbz(iebVar, 1 == true ? 1 : 0);
                    bvvVar.ad(objS);
                } else {
                    z3 = true;
                }
                cfyVarB = afp.x(cfyVarA, z3, null, null, (afdr) objS);
            } else {
                bvvVar = bvvVar3;
                z3 = true;
                i3 = 131072;
                r11 = 0;
            }
            bvvVar.Y(false);
            cfy cfyVarJ2 = bxc.j(das.d(asl.J(avyVar.b(cfyVarB, 1.0f, z3), 16.0f, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED), "text_field_leading_icon_and_text"), cilVar);
            int i7 = i2 >> 3;
            bvv bvvVar4 = bvvVar;
            cfv cfvVar3 = cfvVar2;
            int i8 = i2;
            b(z, gbvVar, cfyVarJ2, j, afegVar, buxVarC, (i2 & 7168) | (i7 & 112) | (i7 & 14) | 64 | ((i2 << 12) & 57344));
            if (afdrVar2 != null) {
                buxVarC.v(1836464546);
                buxVarC.v(336339883);
                cfy cfyVarB2 = awd.b(cfvVar3, 1.0f);
                if (z2) {
                    int i9 = i8 & 458752;
                    bux buxVar4 = buxVarC;
                    f2 = 16.0f;
                    z4 = true;
                    bvvVar2 = bvvVar4;
                    i4 = i8;
                    cfy cfyVarA2 = ggh.a(cfyVarB2, ckvVar, 0L, 0L, null, null, null, false, false, buxVar4, (i8 >> 18) & 112, 254);
                    buxVar3 = buxVar4;
                    boolean z6 = (i9 == i3 || ((i4 & 262144) != 0 && buxVar3.E(iebVar))) | ((i4 & 896) == 256 || ((i4 & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0 && buxVar3.E(gbvVar)));
                    Object objS2 = bvvVar2.S();
                    if (z6 || objS2 == buw.a) {
                        objS2 = new fwc(iebVar, gbvVar, 2, r11);
                        bvvVar2.ad(objS2);
                    }
                    cfyVarX = afp.x(cfyVarA2, true, r11, r11, (afdr) objS2);
                } else {
                    buxVar3 = buxVarC;
                    f2 = 16.0f;
                    z4 = true;
                    bvvVar2 = bvvVar4;
                    cfyVarX = cfyVarB2;
                    i4 = i8;
                }
                bvvVar2.Y(false);
                hir hirVar3 = gux.e(buxVar3).c;
                int i10 = i4 >> 6;
                bux buxVar5 = buxVar3;
                c(gbvVar, j, asl.I(cfyVarX, f2, BitmapDescriptorFactory.HUE_RED), buxVar5, (i10 & 112) | (i10 & 14) | 8);
                buxVar2 = buxVar5;
                bvvVar2.Y(false);
            } else {
                buxVar2 = buxVarC;
                z4 = true;
                bvvVar2 = bvvVar4;
                buxVar2.v(1837177608);
                bvvVar2.Y(false);
            }
            bvvVar2.Y(z4);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: gbq
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar6 = (bux) obj;
                    ((Integer) obj2).intValue();
                    afeg afegVar2 = afegVar;
                    boolean z7 = z;
                    gbv gbvVar2 = gbvVar;
                    long j2 = j;
                    int i11 = i | 1;
                    int i12 = 306783378 & i11;
                    int i13 = 613566756 & i11;
                    gbt.p(afegVar2, z7, gbvVar2, j2, z2, iebVar, cilVar, ckvVar, buxVar6, (i11 & (-920350135)) | i12 | (i13 >> 1) | ((i12 + i12) & i13));
                    return afak.a;
                }
            };
        }
    }

    private static int q(int i, Resources.Theme theme) {
        if (i == 0) {
            return 0;
        }
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    private static int r(int i, int i2, int i3, int i4, boolean z) {
        int[] iArr = new int[2];
        if (z) {
            iArr[0] = i2;
            iArr[1] = i;
        } else {
            iArr[0] = i;
            iArr[1] = i2;
        }
        for (int i5 = 0; i5 < 2; i5++) {
            int i6 = iArr[i5];
            if (m(i6, i3, 4.5d)) {
                return i6;
            }
        }
        return i4;
    }
}
