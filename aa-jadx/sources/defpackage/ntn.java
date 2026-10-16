package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ntn extends defpackage.jri {
    private static final defpackage.yqm a = defpackage.yqm.m();

    @Override // defpackage.jri, defpackage.ovs, defpackage.qso, defpackage.qsk, defpackage.qrd
    public final void a(android.os.Bundle bundle) {
        android.support.v4.app.Fragment ntpVar;
        super.a(bundle);
        defpackage.lem.a();
        boolean z = true;
        setTheme(true != defpackage.lem.a().b() ? com.google.android.projection.gearhead.R.style.Theme_Gearhead_Coolwalk_Dark : com.google.android.projection.gearhead.R.style.Theme_Gearhead_Coolwalk_DayNight);
        v(com.google.android.projection.gearhead.R.layout.navigation_fallback_activity);
        if (S().e(com.google.android.projection.gearhead.R.id.fragment_holder) == null) {
            defpackage.kit kitVarB = defpackage.kit.b();
            if (defpackage.acyc.V() && kitVarB.r()) {
                java.lang.String strD = defpackage.lfr.c().d();
                try {
                    getPackageManager().getPackageInfo(strD, 0);
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 5425)).y("Expected maps package %s is not installed", strD);
                    z = false;
                }
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(5424)).N("Maps package %s installed: %b", strD, z);
                ntpVar = !z ? new defpackage.ntm() : new defpackage.ntp();
            } else {
                ntpVar = new defpackage.ntp();
            }
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5423)).y("Selected fragment: %s", ntpVar.getClass().getSimpleName());
            defpackage.w wVar = new defpackage.w(S());
            wVar.q(com.google.android.projection.gearhead.R.id.fragment_holder, ntpVar, null);
            wVar.c();
        }
    }
}
