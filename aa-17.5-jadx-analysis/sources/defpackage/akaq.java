package defpackage;

@Deprecated
/* loaded from: classes2.dex */
public abstract class akaq implements akas {
    protected akaq() {
    }

    @Override // defpackage.akas
    public final int c(String str, int i) {
        Object objA = a(str);
        return objA == null ? i : ((Integer) objA).intValue();
    }

    @Override // defpackage.akas
    public final boolean d(String str, boolean z) {
        Object objA = a(str);
        return objA == null ? z : ((Boolean) objA).booleanValue();
    }

    @Override // defpackage.akas
    public final long e(long j) {
        Object objA = a("http.conn-manager.timeout");
        return objA == null ? j : ((Long) objA).longValue();
    }

    @Override // defpackage.akas
    public final boolean f() {
        return !d("http.protocol.allow-circular-redirects", false);
    }

    @Override // defpackage.akas
    public final boolean g() {
        return d("http.protocol.reject-relative-redirect", false);
    }

    @Override // defpackage.akas
    public final void h() {
        b("http.tcp.nodelay", Boolean.TRUE);
    }

    @Override // defpackage.akas
    public final void i(String str, int i) {
        b(str, Integer.valueOf(i));
    }
}
