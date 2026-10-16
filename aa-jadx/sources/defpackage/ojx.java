package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ojx extends defpackage.oke {
    final /* synthetic */ defpackage.ojy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojx(defpackage.ojy ojyVar) {
        super(ojyVar);
        this.a = ojyVar;
    }

    @Override // defpackage.oke
    public final java.lang.String a() {
        return this.a.a.a.getString(com.google.android.projection.gearhead.R.string.resolve_issue_resolution_text);
    }

    @Override // defpackage.oke
    public final void b(android.content.Context context) {
        context.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(defpackage.acyl.c())));
    }
}
