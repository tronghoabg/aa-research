package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class olb extends defpackage.oke {
    final /* synthetic */ defpackage.olc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olb(defpackage.olc olcVar) {
        super(olcVar);
        this.a = olcVar;
    }

    @Override // defpackage.oke
    public final java.lang.String a() {
        return this.a.a.a.getString(com.google.android.projection.gearhead.R.string.developer_options_action);
    }

    @Override // defpackage.oke
    public final void b(android.content.Context context) {
        context.startActivity(new android.content.Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS"));
    }
}
