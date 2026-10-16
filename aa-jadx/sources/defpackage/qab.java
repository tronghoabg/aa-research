package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qab implements defpackage.qag {
    public static final java.lang.Long a = 101L;
    public static final java.lang.Long b = 999999999L;
    private final defpackage.xyn c;
    private final defpackage.qaf d;
    private final java.lang.Long e;

    public qab(defpackage.xyn xynVar, defpackage.qaf qafVar, java.lang.Long l) {
        this.c = xynVar;
        this.d = qafVar;
        this.e = l;
    }

    @Override // defpackage.qag
    public final long a() {
        return this.e.longValue();
    }

    @Override // defpackage.qag
    public final defpackage.qaf b() {
        return this.d;
    }

    @Override // defpackage.qag
    public final defpackage.xyn c() {
        return this.c;
    }

    @Override // defpackage.qag
    public final java.lang.String d() {
        return this.d.toString();
    }

    @Override // defpackage.qag
    public final void e() {
    }
}
