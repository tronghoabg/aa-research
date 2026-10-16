package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class xyz extends defpackage.xxf {
    final /* synthetic */ defpackage.xxv g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyz(defpackage.xzd xzdVar, java.lang.CharSequence charSequence, defpackage.xxv xxvVar) {
        super(xzdVar, charSequence);
        this.g = xxvVar;
    }

    @Override // defpackage.xxf
    public final int a(int i) {
        return i + 1;
    }

    @Override // defpackage.xxf
    public final int b(int i) {
        return this.g.f(this.b, i);
    }
}
