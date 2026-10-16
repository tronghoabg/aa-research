package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ojr extends defpackage.oke {
    final /* synthetic */ defpackage.ojs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojr(defpackage.ojs ojsVar) {
        super(ojsVar);
        this.a = ojsVar;
    }

    @Override // defpackage.oke
    public final java.lang.String a() {
        return this.a.a.a.getString(com.google.android.projection.gearhead.R.string.bluetooth_connect_permission_resolution_text);
    }

    @Override // defpackage.oke
    public final void b(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS", android.net.Uri.fromParts("package", "com.google.android.projection.gearhead", null));
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
}
