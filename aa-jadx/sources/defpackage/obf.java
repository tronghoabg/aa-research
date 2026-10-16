package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class obf extends defpackage.eqp {
    private final defpackage.obe a = new defpackage.obe(this, new android.os.Handler(android.os.Looper.getMainLooper()));

    public static final boolean a() {
        android.content.ContentResolver contentResolver = defpackage.mkp.a.c.getContentResolver();
        int i = android.provider.Settings.System.getInt(contentResolver, "status_bar_show_battery_percent", -1);
        return !(i == -1 && (i = android.provider.Settings.System.getInt(contentResolver, "display_battery_percentage", -1)) == -1) && i == 1;
    }

    @Override // defpackage.eqp
    protected final void c() {
        android.content.Context context = defpackage.mkp.a.c;
        context.getClass();
        android.content.ContentResolver contentResolver = context.getContentResolver();
        android.net.Uri uriFor = android.provider.Settings.System.getUriFor("status_bar_show_battery_percent");
        defpackage.obe obeVar = this.a;
        contentResolver.registerContentObserver(uriFor, false, obeVar);
        context.getContentResolver().registerContentObserver(android.provider.Settings.System.getUriFor("display_battery_percentage"), false, obeVar);
        m(java.lang.Boolean.valueOf(a()));
    }

    @Override // defpackage.eqp
    protected final void d() {
        defpackage.mkp.a.c.getContentResolver().unregisterContentObserver(this.a);
    }
}
