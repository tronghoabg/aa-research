package p8;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class n implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final n f43298a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ n[] f43299b;

    static {
        n nVar = new n("INSTANCE", 0);
        f43298a = nVar;
        f43299b = new n[]{nVar};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f43299b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
