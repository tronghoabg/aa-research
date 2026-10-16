package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mdz implements defpackage.mdx {
    private final /* synthetic */ int a;
    private final java.lang.Object b;

    public mdz(int i) {
        this.a = i;
        this.b = defpackage.mdp.d();
    }

    @Override // defpackage.mdv
    public final defpackage.zbe a() {
        int i = this.a;
        if (i != 0) {
            return i != 1 ? defpackage.zbe.SENSITIVE_PERMISSION_POLLER_LOCATION_SERVICES : defpackage.zbe.SENSITIVE_PERMISSION_POLLER_BATTERY_SAVER;
        }
        return defpackage.zbe.SENSITIVE_PERMISSION_POLLER_ACCESS_FINE_LOCATION;
    }

    @Override // defpackage.mdv
    public final java.lang.String b() {
        int i = this.a;
        if (i != 0) {
            return i != 1 ? "LOCATION_SERVICES_SETTING" : "BATTERY_SAVER";
        }
        return "LOCATION_PERMISSION";
    }

    @Override // defpackage.mdv
    public final void c(android.content.Context context) {
        int i = this.a;
        if (i == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            android.net.Uri uriFromParts = android.net.Uri.fromParts("package", context.getPackageName(), null);
            intent.setFlags(1073741824);
            intent.setData(uriFromParts);
            context.startActivity(intent);
            return;
        }
        if (i != 1) {
            android.content.Intent intent2 = new android.content.Intent("android.settings.LOCATION_SOURCE_SETTINGS");
            intent2.setFlags(1073741824);
            context.startActivity(intent2);
        } else {
            android.content.Intent intent3 = new android.content.Intent("android.settings.BATTERY_SAVER_SETTINGS");
            intent3.setFlags(1073741824);
            context.startActivity(intent3);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, mds] */
    @Override // defpackage.mdv
    public final boolean d() {
        int i = this.a;
        if (i == 0) {
            return this.b.t();
        }
        java.lang.Object obj = this.b;
        if (i != 1) {
            return ((android.location.LocationManager) ((android.content.Context) obj).getSystemService("location")).isProviderEnabled("gps");
        }
        return !((android.os.PowerManager) ((android.content.Context) obj).getSystemService("power")).isPowerSaveMode();
    }

    @Override // defpackage.mdx
    public final int e() {
        int i = this.a;
        if (i != 0) {
            return i != 1 ? com.google.android.projection.gearhead.R.string.location_services_setting_prompt_description : com.google.android.projection.gearhead.R.string.battery_saver_setting_prompt_description;
        }
        return com.google.android.projection.gearhead.R.string.location_permission_prompt_description;
    }

    @Override // defpackage.mdx
    public final int f() {
        return this.a != 0 ? com.google.android.projection.gearhead.R.string.sensitive_permission_deny : com.google.android.projection.gearhead.R.string.sensitive_permission_close;
    }

    @Override // defpackage.mdx
    public final int g() {
        int i = this.a;
        if (i != 0) {
            return i != 1 ? com.google.android.projection.gearhead.R.string.sensitive_permission_turn_on : com.google.android.projection.gearhead.R.string.sensitive_permission_turn_off;
        }
        return com.google.android.projection.gearhead.R.string.sensitive_permission_settings;
    }

    @Override // defpackage.mdx
    public final int h() {
        int i = this.a;
        if (i != 0) {
            return i != 1 ? com.google.android.projection.gearhead.R.string.location_services_setting_prompt_title : com.google.android.projection.gearhead.R.string.battery_saver_setting_prompt_title;
        }
        return com.google.android.projection.gearhead.R.string.location_permission_prompt_title;
    }

    public mdz(android.content.Context context, int i) {
        this.a = i;
        this.b = context;
    }
}
