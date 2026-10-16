package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class lam implements lhg {
    public static final yph a = yph.c("GH.DeprecationAlertGen");
    private final Context b = mki.a.c;

    private final void a() {
        Handler handler = new Handler(Looper.getMainLooper());
        num numVar = new num();
        numVar.a = nup.HIGH;
        boolean zD = acuo.d();
        Context context = this.b;
        numVar.m = zD ? context.getString(R.string.car_os_deprecation_title_text) : context.getString(R.string.os_deprecation_title_text);
        boolean zD2 = acuo.d();
        Context context2 = this.b;
        numVar.n = zD2 ? context2.getString(R.string.car_os_deprecation_body_text) : context2.getString(R.string.os_deprecation_body_text);
        numVar.f = "com.google.android.projection.gearhead";
        numVar.k = false;
        numVar.h = 0;
        numVar.x = nuo.a;
        numVar.b = GhIcon.p(this.b, true != acuo.d() ? R.drawable.quantum_gm_ic_info_vd_theme_24 : R.drawable.gs_warning_vd_theme_24);
        handler.postDelayed(new kyl(numVar.b(), 5), 5000L);
    }

    @Override // defpackage.lhg
    public final void c() {
        if (Build.VERSION.SDK_INT < ((int) acuo.b())) {
            if (acuo.f()) {
                if (jri.a()) {
                    a();
                }
                Context context = this.b;
                mas.c();
                dsx dsxVar = new dsx(context, "gearhead_alerts");
                dsxVar.n(R.drawable.gs_android_auto_vd_24);
                dsxVar.i(context.getString(R.string.phone_os_deprecation_notification_title));
                dsxVar.h(context.getString(R.string.phone_os_deprecation_notification_content));
                dsw dswVar = new dsw();
                dswVar.d(context.getString(R.string.phone_os_deprecation_notification_content));
                dsxVar.o(dswVar);
                dsxVar.i = 2;
                new dug(context).b(null, R.id.phone_deprecation_notification_id, dsxVar.a());
                return;
            }
            if (jri.a()) {
                a();
                return;
            }
            ((ype) ((ype) a.f()).ai((char) 3690)).u("Adding OS deprecation card to Vanagon");
            mob mobVar = new mob();
            mobVar.j = yzr.OS_DEPRECATION;
            mobVar.c("deprecation");
            Context context2 = this.b;
            mobVar.s = context2.getString(R.string.os_deprecation_title_text);
            mobVar.t = context2.getString(R.string.os_deprecation_body_text);
            mobVar.i = "com.google.android.projection.gearhead";
            mobVar.w = 0;
            mobVar.n = 5000;
            mobVar.o = true;
            mobVar.v = R.drawable.quantum_gm_ic_info_vd_theme_24;
            mlq.e().j(new moc(mobVar));
        }
    }

    @Override // defpackage.lhg
    public final void d() {
    }
}
