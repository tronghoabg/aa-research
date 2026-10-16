package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class fjf implements Executor {
    public static final fjf a;
    private static final /* synthetic */ fjf[] b;

    static {
        fjf fjfVar = new fjf();
        a = fjfVar;
        fjf[] fjfVarArr = {fjfVar};
        b = fjfVarArr;
        affa.p(fjfVarArr);
    }

    private fjf() {
    }

    public static fjf valueOf(String str) {
        return (fjf) Enum.valueOf(fjf.class, str);
    }

    public static fjf[] values() {
        return (fjf[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
