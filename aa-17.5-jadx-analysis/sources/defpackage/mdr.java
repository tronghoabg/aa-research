package defpackage;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import android.os.PowerManager;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mdr implements mdp {
    private final /* synthetic */ int a;
    private final Object b;

    public mdr(int i) {
        this.a = i;
        this.b = lgv.c();
    }

    @Override // defpackage.mdn
    public final yzz a() {
        int i = this.a;
        return i != 0 ? i != 1 ? yzz.SENSITIVE_PERMISSION_POLLER_LOCATION_SERVICES : yzz.SENSITIVE_PERMISSION_POLLER_BATTERY_SAVER : yzz.SENSITIVE_PERMISSION_POLLER_ACCESS_FINE_LOCATION;
    }

    @Override // defpackage.mdn
    public final String b() {
        int i = this.a;
        return i != 0 ? i != 1 ? "LOCATION_SERVICES_SETTING" : "BATTERY_SAVER" : "LOCATION_PERMISSION";
    }

    @Override // defpackage.mdn
    public final void c(Context context) {
        int i = this.a;
        if (i == 0) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            Uri uriFromParts = Uri.fromParts("package", context.getPackageName(), null);
            intent.setFlags(1073741824);
            intent.setData(uriFromParts);
            context.startActivity(intent);
            return;
        }
        if (i != 1) {
            Intent intent2 = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
            intent2.setFlags(1073741824);
            context.startActivity(intent2);
        } else {
            Intent intent3 = new Intent("android.settings.BATTERY_SAVER_SETTINGS");
            intent3.setFlags(1073741824);
            context.startActivity(intent3);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, mdk] */
    @Override // defpackage.mdn
    public final boolean d() {
        int i = this.a;
        if (i == 0) {
            return this.b.t();
        }
        Object obj = this.b;
        return i != 1 ? ((LocationManager) ((Context) obj).getSystemService("location")).isProviderEnabled("gps") : !((PowerManager) ((Context) obj).getSystemService("power")).isPowerSaveMode();
    }

    @Override // defpackage.mdp
    public final int e() {
        int i = this.a;
        return i != 0 ? i != 1 ? R.string.location_services_setting_prompt_description : R.string.battery_saver_setting_prompt_description : R.string.location_permission_prompt_description;
    }

    @Override // defpackage.mdp
    public final int f() {
        return this.a != 0 ? R.string.sensitive_permission_deny : R.string.sensitive_permission_close;
    }

    @Override // defpackage.mdp
    public final int g() {
        int i = this.a;
        return i != 0 ? i != 1 ? R.string.sensitive_permission_turn_on : R.string.sensitive_permission_turn_off : R.string.sensitive_permission_settings;
    }

    @Override // defpackage.mdp
    public final int h() {
        int i = this.a;
        return i != 0 ? i != 1 ? R.string.location_services_setting_prompt_title : R.string.battery_saver_setting_prompt_title : R.string.location_permission_prompt_title;
    }

    public mdr(Context context, int i) {
        this.a = i;
        this.b = context;
    }
}
