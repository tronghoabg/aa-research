package defpackage;

/* loaded from: classes3.dex */
public final class yrk extends yqm {
    public static final yqm a = new yrk();

    @Override // defpackage.yqm
    public final yok a(Class<?> cls, int i) {
        StackTraceElement stackTraceElementA = yse.a(cls, i + 1);
        return stackTraceElementA != null ? new ypc(stackTraceElementA) : yok.a;
    }

    @Override // defpackage.yqm
    public final String b(Class<? extends yns<?>> cls) {
        StackTraceElement stackTraceElementA = yse.a(cls, 1);
        if (stackTraceElementA != null) {
            return stackTraceElementA.getClassName();
        }
        throw new IllegalStateException("no caller found on the stack for: ".concat(String.valueOf(cls.getName())));
    }

    public final String toString() {
        return "Default stack-based caller finder";
    }
}
