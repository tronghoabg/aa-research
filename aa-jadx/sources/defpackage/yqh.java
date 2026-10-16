package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yqh extends defpackage.ypp {
    private final java.lang.StackTraceElement b;

    public yqh(java.lang.StackTraceElement stackTraceElement) {
        this.b = stackTraceElement;
    }

    @Override // defpackage.ypp
    public final int a() {
        return java.lang.Math.max(this.b.getLineNumber(), 0);
    }

    @Override // defpackage.ypp
    public final java.lang.String b() {
        return this.b.getClassName();
    }

    @Override // defpackage.ypp
    public final java.lang.String c() {
        return this.b.getFileName();
    }

    @Override // defpackage.ypp
    public final java.lang.String d() {
        return this.b.getMethodName();
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.yqh) && this.b.equals(((defpackage.yqh) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
