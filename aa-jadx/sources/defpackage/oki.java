package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class oki extends defpackage.oke {
    final /* synthetic */ defpackage.okj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oki(defpackage.okj okjVar) {
        super(okjVar);
        this.a = okjVar;
    }

    @Override // defpackage.oke
    public final java.lang.String a() {
        return this.a.a.getString(com.google.android.projection.gearhead.R.string.bluetooth_settings_action_text);
    }

    @Override // defpackage.oke
    public final void b(android.content.Context context) {
        context.startActivity(new android.content.Intent().setAction("android.settings.BLUETOOTH_SETTINGS").setFlags(335544320));
    }
}
