package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class oli extends defpackage.oke {
    final /* synthetic */ defpackage.olj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oli(defpackage.olj oljVar) {
        super(oljVar);
        this.a = oljVar;
    }

    @Override // defpackage.oke
    public final java.lang.String a() {
        return this.a.a.getString(com.google.android.projection.gearhead.R.string.turn_wifi_on_resolution_text);
    }

    @Override // defpackage.oke
    public final void b(android.content.Context context) {
        context.startActivity(new android.content.Intent("android.settings.WIFI_SETTINGS").addFlags(268435456));
    }
}
