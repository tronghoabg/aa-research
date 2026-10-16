package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class syk extends defpackage.sym {
    public syk(java.lang.String str, java.lang.Boolean bool) {
        super(str, bool);
    }

    @Override // defpackage.sym
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        android.content.ContentResolver contentResolver = defpackage.sym.a;
        boolean zBooleanValue = ((java.lang.Boolean) this.c).booleanValue();
        return java.lang.Boolean.valueOf(defpackage.syd.a.a(contentResolver, this.b, zBooleanValue));
    }
}
