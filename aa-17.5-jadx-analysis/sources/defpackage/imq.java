package defpackage;

import android.content.ComponentName;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import j$.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final /* synthetic */ class imq implements xyc {
    private final /* synthetic */ int a;

    public /* synthetic */ imq(int i) {
        this.a = i;
    }

    @Override // defpackage.xyc
    public final Object gu() {
        switch (this.a) {
            case 0:
                yph yphVar = ina.a;
                return Integer.valueOf((int) acvt.a.gu().g());
            case 1:
                return Boolean.valueOf(acso.a.gu().f());
            case 2:
                xyc xycVar = itx.a;
                return Build.VERSION.SDK_INT >= 30 ? new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.carservice.gmscorecompat.CarChimeraService") : new ComponentName("com.google.android.gms", "com.google.android.gms.car.CarService");
            case 3:
                xyc xycVar2 = itx.a;
                return Build.VERSION.SDK_INT >= 30 ? new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.carservice.gmscorecompat.CarSetupServiceImpl") : new ComponentName("com.google.android.gms", "com.google.android.gms.carsetup.CarSetupService");
            case 4:
                xyc xycVar3 = itx.a;
                return Build.VERSION.SDK_INT >= 30 ? new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.carservice.gmscorecompat.FirstActivityImpl") : new ComponentName("com.google.android.gms", "com.google.android.gms.car.FirstActivity");
            case 5:
                yph yphVar2 = iya.a;
                abru abruVarB = acma.a.gu().b();
                xxx xxxVar = iyh.a;
                yfy yfyVarB = tgx.b(new ilq(8), abruVarB);
                HashMap map = new HashMap();
                yno it = yfyVarB.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    List listI = iyh.a.i((CharSequence) entry.getKey());
                    if (listI.size() != 2) {
                        ((ype) ((ype) iyh.b.h()).ai((char) 1630)).y("Invalid flag entry for blocklist %s", entry);
                    } else {
                        String str = (String) listI.get(0);
                        ((Set) Map.EL.computeIfAbsent(map, str, new ilq(9))).add(new iyg(str, (String) listI.get(1), (Set) entry.getValue()));
                    }
                }
                return new iyh(map);
            case 6:
                int i = jhi.N;
                return Boolean.valueOf(acuc.f());
            case 7:
                yph yphVar3 = jkq.a;
                ygp ygpVar = new ygp();
                acyz acyzVar = acyz.a;
                ygpVar.k(acyzVar.gu().b().b);
                ygpVar.k(acyzVar.gu().a().b);
                return ygpVar.g();
            case 8:
                yph yphVar4 = jld.a;
                return new jlb(yfq.r("com.google.android.projection.gearhead", "com.google.android.gms"), true);
            case 9:
                yph yphVar5 = jnw.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    ((ype) ((ype) jnw.a.f()).ai((char) 2443)).u("Android is R+, so connecting to Gearhead car chimera service.");
                    return yxn.ESCAPE_POD_R;
                }
                ((ype) ((ype) jnw.a.f()).ai((char) 2442)).u("Obtaining car service delegate from GMS Core via connectionless.");
                return yxn.GMS_CAR_CONNECTIONLESS;
            case 10:
                return Executors.newSingleThreadExecutor();
            case 11:
                int i2 = kiv.p;
                return new Handler(Looper.getMainLooper());
            case 12:
                yph yphVar6 = kmr.a;
                return (kmr) mki.a.i(kmr.class);
            case 13:
                yph yphVar7 = oid.a;
                return oid.g(acot.a.gu().o());
            case 14:
                yph yphVar8 = oid.a;
                return oid.g(acot.a.gu().n());
            case 15:
                return Boolean.valueOf(adcd.c());
            case 16:
                int i3 = qer.g;
                return new ohr();
            case 17:
                int i4 = qer.g;
                return new lvq();
            case 18:
                int i5 = qer.g;
                return new lvo();
            case 19:
                int i6 = qer.g;
                return new mbp(jri.b);
            default:
                ypf ypfVar = qsr.a;
                spu spuVar = ssr.a;
                return spu.aF(1);
        }
    }
}
