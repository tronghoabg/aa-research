package ya;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class n implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final n f48065a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ n[] f48066b;

    static {
        n nVar = new n("INSTANCE", 0);
        f48065a = nVar;
        f48066b = new n[]{nVar};
    }

    public static n[] values() {
        return (n[]) f48066b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f.a().f48047a.post(runnable);
    }
}
