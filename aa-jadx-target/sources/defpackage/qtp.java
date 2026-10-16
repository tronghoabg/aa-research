package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qtp implements defpackage.rgn {
    private static final defpackage.yqk c = defpackage.omv.n("CAR.SETTING");
    private static defpackage.qtp d;
    public final defpackage.ris a;
    public final android.content.SharedPreferences b;

    public qtp(android.content.Context context, defpackage.ris risVar) {
        this.a = risVar;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("carservice", 0);
        this.b = sharedPreferences;
        defpackage.yqk yqkVar = c;
        if (yqkVar.l().Z()) {
            for (java.util.Map.Entry<java.lang.String, ?> entry : sharedPreferences.getAll().entrySet()) {
                yqkVar.l().ai(7911).M("%s: %s", entry.getKey(), entry.getValue());
            }
        }
    }

    public static synchronized defpackage.qtp a(android.content.Context context) {
        defpackage.qtp qtpVar;
        qtpVar = d;
        if (qtpVar == null) {
            qtpVar = new defpackage.qtp(context.getApplicationContext(), defpackage.rit.INSTANCE);
            d = qtpVar;
        }
        return qtpVar;
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2) {
        return this.b.getString(str, str2);
    }

    public final void c(java.lang.String str, boolean z) {
        if ("car_telemetry_enabled".equals(str)) {
            return;
        }
        this.b.edit().putBoolean(str, z).apply();
    }

    public final boolean d(java.lang.String str, boolean z) {
        return this.b.getBoolean(str, z);
    }

    @Override // defpackage.rgn
    public final boolean e() {
        return this.b.getBoolean("car_save_audio", false);
    }

    public final int f() {
        return this.b.getInt("DONT_SHOW_AGAIN_DISMISS_COUNT", 0);
    }

    public final boolean g() {
        return this.b.getBoolean("android_go_device_screen_shown", false);
    }

    public final void h() {
        android.content.SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putBoolean("android_go_device_screen_shown", true);
        editorEdit.apply();
    }

    public final void i() {
        android.content.SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putInt("car_connection_count", 0);
        editorEdit.apply();
    }
}
