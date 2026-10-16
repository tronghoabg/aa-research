package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ebg extends defpackage.ebi {
    public ebg(java.lang.Class cls) {
        super(com.google.android.projection.gearhead.R.id.tag_accessibility_heading, cls, 0, 28);
    }

    @Override // defpackage.ebi
    public final /* bridge */ /* synthetic */ java.lang.Object a(android.view.View view) {
        return java.lang.Boolean.valueOf(defpackage.ebp.e(view));
    }

    @Override // defpackage.ebi
    public final /* bridge */ /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.ebp.b(view, ((java.lang.Boolean) obj).booleanValue());
    }

    @Override // defpackage.ebi
    public final /* bridge */ /* synthetic */ boolean c(java.lang.Object obj, java.lang.Object obj2) {
        return !f((java.lang.Boolean) obj, (java.lang.Boolean) obj2);
    }
}
