package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class okl extends defpackage.oke {
    final /* synthetic */ defpackage.okm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okl(defpackage.okm okmVar) {
        super(okmVar);
        this.a = okmVar;
    }

    @Override // defpackage.oke
    public final java.lang.String a() {
        return this.a.a.a.getString(com.google.android.projection.gearhead.R.string.online_help_resolution_text);
    }

    @Override // defpackage.oke
    public final void b(android.content.Context context) {
        context.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://support.google.com/androidauto/answer/6348029")));
    }
}
