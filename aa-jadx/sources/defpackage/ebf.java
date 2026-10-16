package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ebf extends defpackage.ebi {
    public ebf(java.lang.Class cls) {
        super(com.google.android.projection.gearhead.R.id.tag_state_description, cls, 64, 30);
    }

    @Override // defpackage.ebi
    public final /* synthetic */ java.lang.Object a(android.view.View view) {
        return defpackage.ebr.b(view);
    }

    @Override // defpackage.ebi
    public final /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.ebr.c(view, (java.lang.CharSequence) obj);
    }

    @Override // defpackage.ebi
    public final /* bridge */ /* synthetic */ boolean c(java.lang.Object obj, java.lang.Object obj2) {
        return !android.text.TextUtils.equals((java.lang.CharSequence) obj, (java.lang.CharSequence) obj2);
    }
}
