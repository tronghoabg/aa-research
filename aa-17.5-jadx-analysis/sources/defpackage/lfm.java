package defpackage;

import android.content.Context;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class lfm implements sdj {
    public static final yph a = yph.c("GH.AppInstallerUtil");
    public final Context b;
    public final PackageInstaller c;
    public final lfk d;
    public final List e;
    public final lds f;
    private final lfk g;

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    public lfm(Context context) {
        adcg adcgVar;
        this.b = context;
        this.c = context.getPackageManager().getPackageInstaller();
        lfk lfkVar = new lfk(kig.a(), true);
        this.d = lfkVar;
        String networkCountryIso = ((TelephonyManager) context.getSystemService("phone")).getNetworkCountryIso();
        ((ype) a.l().ai((char) 3880)).y("In getFrxMapsPackage, using country code: %s", networkCountryIso);
        acsl acslVar = acsl.a;
        adch adchVarB = acslVar.gu().b();
        if ((adchVarB.b & 1) != 0) {
            adcgVar = adchVarB.c;
            if (adcgVar == null) {
                adcgVar = adcg.a;
            }
        } else if (networkCountryIso == null || !DesugarCollections.unmodifiableMap(adchVarB.e).containsKey(networkCountryIso)) {
            adcgVar = adchVarB.d;
            if (adcgVar == null) {
                adcgVar = adcg.a;
            }
        } else {
            adcgVar = (adcg) DesugarCollections.unmodifiableMap(adchVarB.e).get(networkCountryIso);
        }
        String str = adcgVar.b == 1 ? (String) adcgVar.c : "";
        acxa acxaVar = acxa.a;
        lfk lfkVar2 = new lfk(str, !acxaVar.gu().S());
        this.g = lfkVar2;
        lfk[] lfkVarArr = {lfkVar, new lfk(acslVar.gu().c(), !acxaVar.gu().S()), lfkVar2, new lfk(acslVar.gu().d(), true)};
        ArrayList<lfk> arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            lfk lfkVar3 = lfkVarArr[i];
            if (!lfkVar3.a.isEmpty()) {
                arrayList.add(lfkVar3);
            }
        }
        this.e = arrayList;
        this.f = new lds((byte[]) null);
        for (lfk lfkVar4 : arrayList) {
            if (lfkVar4.d) {
                this.f.a.put(lfkVar4.a, new lfj(lfkVar4.b(context), lfkVar4.b));
            }
        }
    }

    public static lfm c() {
        return (lfm) mki.a.i(lfm.class);
    }

    public final PackageInstaller.SessionInfo a(String str) {
        for (PackageInstaller.SessionInfo sessionInfo : this.c.getAllSessions()) {
            if (str.equals(sessionInfo.getAppPackageName())) {
                return sessionInfo;
            }
        }
        return null;
    }

    public final lfk b() {
        for (lfk lfkVar : this.e) {
            if (!lfkVar.d(this.b) && a(lfkVar.a) == null) {
                return lfkVar;
            }
        }
        return null;
    }

    public final String d() {
        return this.g.a;
    }

    @Override // defpackage.sdj
    public final List e() {
        List<lfk> list = this.e;
        ArrayList arrayList = new ArrayList(list.size());
        for (lfk lfkVar : list) {
            if (!lfkVar.d(this.b)) {
                arrayList.add(lfkVar.a);
            }
        }
        return arrayList;
    }

    public final boolean f() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            if (!((lfk) it.next()).d(this.b)) {
                return false;
            }
        }
        return true;
    }

    public final boolean g() {
        Context context = this.b;
        lfk lfkVar = this.d;
        try {
            return (context.getPackageManager().getApplicationInfo(lfkVar.a, 128).flags & 129) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai(3870)).y("Unable to find package: %s", lfkVar.a);
            return false;
        }
    }

    public final boolean h() {
        return this.d.d(this.b);
    }

    public final boolean i() {
        return h() || a(this.d.a) != null;
    }
}
