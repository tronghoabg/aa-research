package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ysp extends defpackage.yrr {
    public static final defpackage.yrr a = new defpackage.ysp();

    @Override // defpackage.yrr
    public final defpackage.ypp a(java.lang.Class<?> cls, int i) {
        java.lang.StackTraceElement stackTraceElementA = defpackage.ytj.a(cls, i + 1);
        return stackTraceElementA != null ? new defpackage.yqh(stackTraceElementA) : defpackage.ypp.a;
    }

    @Override // defpackage.yrr
    public final java.lang.String b(java.lang.Class<? extends defpackage.yox<?>> cls) {
        java.lang.StackTraceElement stackTraceElementA = defpackage.ytj.a(cls, 1);
        if (stackTraceElementA != null) {
            return stackTraceElementA.getClassName();
        }
        throw new java.lang.IllegalStateException("no caller found on the stack for: ".concat(java.lang.String.valueOf(cls.getName())));
    }

    public final java.lang.String toString() {
        return "Default stack-based caller finder";
    }
}
