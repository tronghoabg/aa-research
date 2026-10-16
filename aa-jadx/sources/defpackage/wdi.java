package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class wdi {
    public final boolean a;
    public final boolean b;
    public final defpackage.yhx d;
    private final defpackage.xyd e;
    private volatile java.lang.String f = null;
    public final boolean c = false;

    public wdi(defpackage.xyd xydVar, boolean z, boolean z2, defpackage.yhx yhxVar) {
        this.e = xydVar;
        this.a = z;
        this.b = z2;
        this.d = yhxVar;
    }

    final java.lang.String a(android.content.Context context) {
        java.lang.String str = this.f;
        if (str != null) {
            return str;
        }
        java.lang.String str2 = (java.lang.String) this.e.a(context);
        this.f = str2;
        return str2;
    }
}
