package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class oky extends defpackage.oke {
    final /* synthetic */ defpackage.okz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oky(defpackage.okz okzVar) {
        super(okzVar);
        this.a = okzVar;
    }

    @Override // defpackage.oke
    public final java.lang.String a() {
        return this.a.a.a.getString(com.google.android.projection.gearhead.R.string.startup_diagnostic_resolution_text);
    }

    @Override // defpackage.oke
    public final void b(android.content.Context context) {
        context.startActivity(defpackage.ola.c());
    }
}
