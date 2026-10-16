package defpackage;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.widget.Toast;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.settings.LauncherAppSettingsActivity;
import com.google.android.projection.gearhead.companion.settings.Material3ManageCarsFragment;
import j$.util.Optional;

/* loaded from: classes3.dex */
public final /* synthetic */ class wzf implements rbv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ wzf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.rbv
    public final void a(rbu rbuVar) {
        int i = this.b;
        if (i == 0) {
            Log.e("GH.DHUService", "Failed to connect to car services");
            Toast.makeText((Context) this.a, "Car services currently unavailable, please try again later", 0).show();
            return;
        }
        if (i == 1) {
            Object obj = this.a;
            synchronized (((kpz) obj).h) {
                ((kpz) obj).i = Optional.empty();
                ((ype) ((ype) kpz.a.h()).ai(3369)).y("Connection listener registration failed | %s", rbuVar);
                ((eqj) obj).p();
            }
            return;
        }
        if (i == 2) {
            ((ype) ((ype) LauncherAppSettingsActivity.m.h()).ai((char) 9999)).y("Car client connection failed, unable to populate apps: %s", rbuVar);
            Object obj2 = this.a;
            Toast.makeText((Context) obj2, R.string.settings_customize_app_launcher_unable_to_get_apps, 1).show();
            ((LauncherAppSettingsActivity) obj2).finish();
            return;
        }
        if (i == 3) {
            yph yphVar = xbo.f;
            ((ype) ((ype) yphVar.h()).ai((char) 10019)).y("Car Client connection failed: %s", rbuVar);
            if (!acwi.g()) {
                tss.q("GH.CarPreference", "Car Api Connection Failed %s", rbuVar);
                return;
            }
            Object obj3 = this.a;
            ((ype) ((ype) yphVar.f()).ai((char) 10020)).u("Reconnecting Car Client connection");
            ((xbo) obj3).r.e();
            return;
        }
        if (i != 4) {
            if (rbuVar.a == 2) {
                ((ype) xco.a.l().ai((char) 10090)).y("onConnectionFailed: %s", rbuVar);
                throw null;
            }
            Object obj4 = this.a;
            ((ype) ((ype) xco.a.g()).ai((char) 10089)).y("onConnectionFailed: %s", rbuVar);
            ((xco) obj4).i(false, true);
            return;
        }
        Object obj5 = this.a;
        Fragment fragment = (Fragment) obj5;
        if (fragment.isAdded()) {
            ((ype) ((ype) Material3ManageCarsFragment.f.g()).ai((char) 10039)).u("Failed to connect to api client. Finishing.");
            fragment.requireActivity().finish();
        } else {
            ((Material3ManageCarsFragment) obj5).l = true;
            ((ype) ((ype) Material3ManageCarsFragment.f.g()).ai((char) 10038)).u("Failed to connect to api client when not attached.");
        }
    }
}
