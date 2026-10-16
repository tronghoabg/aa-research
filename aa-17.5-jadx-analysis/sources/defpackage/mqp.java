package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mqp extends mqz {
    private static final yph a = yph.c("GH.AppLauncherItem");
    private final int b;

    public mqp(mqc mqcVar, GhIcon ghIcon, String str, int i) {
        super(mqcVar, ghIcon, str, mqcVar.a.b == mqa.a ? R.drawable.ic_work_badge : 0, null);
        this.b = i;
    }

    public static mqp b(mqc mqcVar) {
        int iA;
        yzy yzyVar;
        Context context = mki.a.c;
        ComponentName componentNameA = mqcVar.a();
        int i = -1;
        CarInfo carInfo = null;
        if (!mkn.e.equals(componentNameA)) {
            mon monVar = new mon(context, componentNameA);
            try {
                monVar.e();
                if (monVar.d() != null) {
                    return new mqp(mqcVar, GhIcon.j(componentNameA), monVar.c().replaceFirst("Google Play", "Play").replaceFirst("YouTube Music", "YT Music"), -1);
                }
                ((ype) ((ype) a.h()).ai((char) 5184)).y("Version name for component %s is null", componentNameA);
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                ((ype) ((ype) a.h()).ai((char) 5185)).y("Component was not found: %s", componentNameA);
                return null;
            }
        }
        CarInfo carInfoB = juw.b().b();
        yph yphVar = mqv.a;
        if (kjf.e(carInfoB, acxa.G())) {
            ((ype) ((ype) mqv.a.f()).ai(5192)).y("Removing OEM exit icon for manufacturer: %s", carInfoB.a);
            return null;
        }
        if (carInfoB == null) {
            iA = mqv.a(1);
        } else {
            iA = mqv.a(carInfoB.r);
            carInfo = carInfoB;
        }
        yph yphVar2 = mqv.a;
        ((ype) yphVar2.l().ai(5201)).w("Generic Launcher Res Id: %d", iA);
        int i2 = 0;
        if (carInfo == null || TextUtils.isEmpty(carInfo.a)) {
            ((ype) yphVar2.l().ai((char) 5202)).u("Car info is missing, using default icon");
        } else {
            String strC = jfr.c(carInfo.a);
            if (tgx.d(new miw(16), acxa.N()).anyMatch(new mqu(jfr.c(strC), i2))) {
                ((ype) yphVar2.l().ai((char) 5204)).y("Manufacturer %s is excluded. Using default icon", strC);
            } else {
                int identifier = context.getResources().getIdentifier("ic_oem_".concat(String.valueOf(strC)), "drawable", context.getPackageName());
                iA = identifier != 0 ? identifier : ((Integer) mqv.c.getOrDefault(strC, Integer.valueOf(iA))).intValue();
                ((ype) yphVar2.l().ai(5203)).K("Launcher Icon Res Id used for Manufacturer %s is %d", carInfo.a, iA);
            }
        }
        String string = context.getResources().getString(R.string.gearhead_oem_exit);
        if (carInfoB == null) {
            ((ype) yphVar2.l().ai((char) 5200)).u("null carInfo");
            yzyVar = yzy.ln;
        } else if (mqv.c(iA)) {
            yzyVar = yzy.lp;
            ((ype) yphVar2.l().ai(5199)).y("%s doesn't have a custom icon.", carInfoB.a);
        } else if (jfr.e(carInfoB.a, carInfoB.b, carInfoB.c, acxa.P())) {
            yzyVar = yzy.lq;
            ((ype) yphVar2.l().ai((char) 5198)).y("In make model year deny list for label, %s", carInfoB);
        } else if (!jfr.e(carInfoB.a, carInfoB.b, carInfoB.c, acxa.L()) && mqv.d(carInfoB.q)) {
            string = mqv.b(carInfoB.q);
            yzyVar = yzy.lr;
            ((ype) yphVar2.l().ai((char) 5197)).y("Using displayName: %s", string);
        } else if (mqv.d(carInfoB.a)) {
            yzyVar = yzy.ls;
            string = mqv.b(carInfoB.a);
            ((ype) yphVar2.l().ai((char) 5196)).y("Using make: %s", string);
        } else {
            ((ype) yphVar2.l().ai((char) 5195)).u("No valid alternative exit label, using default");
            yzyVar = yzy.lm;
        }
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.EXIT_APP, yzyVar).l());
        if (carInfoB == null || mqv.c(iA) || TextUtils.isEmpty(carInfoB.a)) {
            ((ype) yphVar2.l().ai((char) 5193)).u("Using default white background");
        } else {
            boolean zContains = mqv.b.contains(jfr.c(carInfoB.a));
            ((ype) yphVar2.l().ai((char) 5194)).y("Transparent background = %b", Boolean.valueOf(zContains));
            if (zContains) {
                i = 0;
            }
        }
        return new mqp(new mqc(componentNameA), GhIcon.p(context, iA), string, i);
    }

    @Override // defpackage.mqz
    protected final int a() {
        return this.b;
    }

    @Override // defpackage.mqz
    public final void c() {
        mqc mqcVar = this.c;
        ComponentName componentNameA = mqcVar.a();
        Intent intentA = mqcVar.a.a();
        intentA.putExtra("ANDROID_AUTO_APP_LAUNCHER_INTENT", true);
        if (!componentNameA.equals(mkn.q)) {
            mpe.a().i(intentA);
            return;
        }
        qql qqlVar = new qql();
        qqlVar.e = new CarRegionId(3, CarDisplayId.a);
        mpe.a().k(intentA, qqlVar);
    }
}
