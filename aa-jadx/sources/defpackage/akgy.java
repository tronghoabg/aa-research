package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class akgy implements java.security.PrivilegedAction {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ defpackage.akgz b;

    public akgy(defpackage.akgz akgzVar, java.lang.String str) {
        this.a = str;
        this.b = akgzVar;
    }

    @Override // java.security.PrivilegedAction
    public final /* bridge */ /* synthetic */ java.lang.Object run() {
        java.lang.ClassLoader classLoader = this.b.a;
        java.lang.String str = this.a;
        return classLoader != null ? classLoader.getResourceAsStream(str) : java.lang.ClassLoader.getSystemResourceAsStream(str);
    }
}
