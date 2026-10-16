package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public abstract class akbq implements defpackage.akbs {
    protected akbq() {
    }

    @Override // defpackage.akbs
    public final int c(java.lang.String str, int i) {
        java.lang.Object objA = a(str);
        return objA == null ? i : ((java.lang.Integer) objA).intValue();
    }

    @Override // defpackage.akbs
    public final boolean d(java.lang.String str, boolean z) {
        java.lang.Object objA = a(str);
        return objA == null ? z : ((java.lang.Boolean) objA).booleanValue();
    }

    @Override // defpackage.akbs
    public final long e(long j) {
        java.lang.Object objA = a("http.conn-manager.timeout");
        return objA == null ? j : ((java.lang.Long) objA).longValue();
    }

    @Override // defpackage.akbs
    public final boolean f() {
        return !d("http.protocol.allow-circular-redirects", false);
    }

    @Override // defpackage.akbs
    public final boolean g() {
        return d("http.protocol.reject-relative-redirect", false);
    }

    @Override // defpackage.akbs
    public final void h() {
        b("http.tcp.nodelay", java.lang.Boolean.TRUE);
    }

    @Override // defpackage.akbs
    public final void i(java.lang.String str, int i) {
        b(str, java.lang.Integer.valueOf(i));
    }
}
