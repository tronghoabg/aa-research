package defpackage;

/* loaded from: classes3.dex */
public final class ypc extends yok {
    private final StackTraceElement b;

    public ypc(StackTraceElement stackTraceElement) {
        this.b = stackTraceElement;
    }

    @Override // defpackage.yok
    public final int a() {
        return Math.max(this.b.getLineNumber(), 0);
    }

    @Override // defpackage.yok
    public final String b() {
        return this.b.getClassName();
    }

    @Override // defpackage.yok
    public final String c() {
        return this.b.getFileName();
    }

    @Override // defpackage.yok
    public final String d() {
        return this.b.getMethodName();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ypc) && this.b.equals(((ypc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
