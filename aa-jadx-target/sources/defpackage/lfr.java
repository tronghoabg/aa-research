package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lfr implements defpackage.seg {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.AppInstallerUtil");
    public final android.content.Context b;
    public final android.content.pm.PackageInstaller c;
    public final defpackage.lfp d;
    public final java.util.List e;
    public final defpackage.kwv f;
    private final defpackage.lfp g;

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    public lfr(android.content.Context context) {
        defpackage.addf addfVar;
        this.b = context;
        this.c = context.getPackageManager().getPackageInstaller();
        defpackage.lfp lfpVar = new defpackage.lfp(defpackage.kil.a(), true);
        this.d = lfpVar;
        java.lang.String networkCountryIso = ((android.telephony.TelephonyManager) context.getSystemService("phone")).getNetworkCountryIso();
        ((defpackage.yqj) a.l().ai((char) 3883)).y("In getFrxMapsPackage, using country code: %s", networkCountryIso);
        defpackage.actn actnVar = defpackage.actn.a;
        defpackage.addg addgVarB = actnVar.fF().b();
        if ((addgVarB.b & 1) != 0) {
            addfVar = addgVarB.c;
            if (addfVar == null) {
                addfVar = defpackage.addf.a;
            }
        } else if (networkCountryIso == null || !j$.util.DesugarCollections.unmodifiableMap(addgVarB.e).containsKey(networkCountryIso)) {
            addfVar = addgVarB.d;
            if (addfVar == null) {
                addfVar = defpackage.addf.a;
            }
        } else {
            addfVar = (defpackage.addf) j$.util.DesugarCollections.unmodifiableMap(addgVarB.e).get(networkCountryIso);
        }
        java.lang.String str = addfVar.b == 1 ? (java.lang.String) addfVar.c : "";
        defpackage.acyc acycVar = defpackage.acyc.a;
        defpackage.lfp lfpVar2 = new defpackage.lfp(str, !acycVar.fF().T());
        this.g = lfpVar2;
        defpackage.lfp[] lfpVarArr = {lfpVar, new defpackage.lfp(actnVar.fF().c(), !acycVar.fF().T()), lfpVar2, new defpackage.lfp(actnVar.fF().d(), true)};
        java.util.ArrayList<defpackage.lfp> arrayList = new java.util.ArrayList();
        for (int i = 0; i < 4; i++) {
            defpackage.lfp lfpVar3 = lfpVarArr[i];
            if (!lfpVar3.a.isEmpty()) {
                arrayList.add(lfpVar3);
            }
        }
        this.e = arrayList;
        this.f = new defpackage.kwv();
        for (defpackage.lfp lfpVar4 : arrayList) {
            if (lfpVar4.d) {
                this.f.a.put(lfpVar4.a, new defpackage.lfo(lfpVar4.b(context), lfpVar4.b));
            }
        }
    }

    public static defpackage.lfr c() {
        return (defpackage.lfr) defpackage.mkp.a.i(defpackage.lfr.class);
    }

    public final android.content.pm.PackageInstaller.SessionInfo a(java.lang.String str) {
        for (android.content.pm.PackageInstaller.SessionInfo sessionInfo : this.c.getAllSessions()) {
            if (str.equals(sessionInfo.getAppPackageName())) {
                return sessionInfo;
            }
        }
        return null;
    }

    public final defpackage.lfp b() {
        for (defpackage.lfp lfpVar : this.e) {
            if (!lfpVar.d(this.b) && a(lfpVar.a) == null) {
                return lfpVar;
            }
        }
        return null;
    }

    public final java.lang.String d() {
        return this.g.a;
    }

    @Override // defpackage.seg
    public final java.util.List e() {
        java.util.List<defpackage.lfp> list = this.e;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (defpackage.lfp lfpVar : list) {
            if (!lfpVar.d(this.b)) {
                arrayList.add(lfpVar.a);
            }
        }
        return arrayList;
    }

    public final boolean f() {
        java.util.Iterator it = this.e.iterator();
        while (it.hasNext()) {
            if (!((defpackage.lfp) it.next()).d(this.b)) {
                return false;
            }
        }
        return true;
    }

    public final boolean g() {
        android.content.Context context = this.b;
        defpackage.lfp lfpVar = this.d;
        try {
            return (context.getPackageManager().getApplicationInfo(lfpVar.a, 128).flags & 129) != 0;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai(3873)).y("Unable to find package: %s", lfpVar.a);
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
