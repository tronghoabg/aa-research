package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ebe extends defpackage.ebi {
    public ebe(java.lang.Class cls) {
        super(com.google.android.projection.gearhead.R.id.tag_accessibility_pane_title, cls, 8, 28);
    }

    @Override // defpackage.ebi
    public final /* synthetic */ java.lang.Object a(android.view.View view) {
        return defpackage.ebp.a(view);
    }

    @Override // defpackage.ebi
    public final /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.ebp.c(view, (java.lang.CharSequence) obj);
    }

    @Override // defpackage.ebi
    public final /* bridge */ /* synthetic */ boolean c(java.lang.Object obj, java.lang.Object obj2) {
        return !android.text.TextUtils.equals((java.lang.CharSequence) obj, (java.lang.CharSequence) obj2);
    }
}
