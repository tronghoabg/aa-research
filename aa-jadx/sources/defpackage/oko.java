package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class oko extends defpackage.oke {
    final /* synthetic */ defpackage.okp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oko(defpackage.okp okpVar) {
        super(okpVar);
        this.a = okpVar;
    }

    @Override // defpackage.oke
    public final java.lang.String a() {
        return this.a.a.a.getString(com.google.android.projection.gearhead.R.string.allow_new_cars_action);
    }

    @Override // defpackage.oke
    public final void b(android.content.Context context) {
        context.startActivity(new android.content.Intent().setComponent(new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.companion.settings.Material3SettingsActivity")).putExtra(":android:show_fragment", "com.google.android.projection.gearhead.companion.settings.Material3ManageCarsFragment").putExtra(":android:no_headers", true).putExtra("highlight_only_known_cars", true).setFlags(335544320));
    }
}
