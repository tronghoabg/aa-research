package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class adjl implements Executor {
    public static final adjl a;
    private static final /* synthetic */ adjl[] b;

    static {
        adjl adjlVar = new adjl();
        a = adjlVar;
        b = new adjl[]{adjlVar};
    }

    private adjl() {
    }

    public static adjl valueOf(String str) {
        return (adjl) Enum.valueOf(adjl.class, str);
    }

    public static adjl[] values() {
        return (adjl[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Context.DirectExecutor";
    }
}
