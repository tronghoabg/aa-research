package defpackage;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class nta extends jrh {
    private static final yph a = yph.m();

    @Override // defpackage.jrh, defpackage.ouv, defpackage.qru, defpackage.qrq, defpackage.qqh
    public final void a(Bundle bundle) throws PackageManager.NameNotFoundException {
        Fragment ntcVar;
        super.a(bundle);
        leh.a();
        boolean z = true;
        setTheme(true != leh.a().b() ? R.style.Theme_Gearhead_Coolwalk_Dark : R.style.Theme_Gearhead_Coolwalk_DayNight);
        v(R.layout.navigation_fallback_activity);
        if (S().e(R.id.fragment_holder) == null) {
            kio kioVarB = kio.b();
            if (acxa.U() && kioVarB.r()) {
                String strD = lfm.c().d();
                try {
                    getPackageManager().getPackageInfo(strD, 0);
                } catch (PackageManager.NameNotFoundException e) {
                    ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 5422)).y("Expected maps package %s is not installed", strD);
                    z = false;
                }
                ((ype) ((ype) a.f()).ai(5421)).N("Maps package %s installed: %b", strD, z);
                ntcVar = !z ? new nsz() : new ntc();
            } else {
                ntcVar = new ntc();
            }
            ((ype) ((ype) a.f()).ai((char) 5420)).y("Selected fragment: %s", ntcVar.getClass().getSimpleName());
            w wVar = new w(S());
            wVar.q(R.id.fragment_holder, ntcVar, null);
            wVar.c();
        }
    }
}
