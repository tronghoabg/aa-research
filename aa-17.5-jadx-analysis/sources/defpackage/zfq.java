package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zfq implements Executor {
    public static final zfq a;
    private static final /* synthetic */ zfq[] b;

    static {
        zfq zfqVar = new zfq();
        a = zfqVar;
        b = new zfq[]{zfqVar};
    }

    private zfq() {
    }

    public static zfq valueOf(String str) {
        return (zfq) Enum.valueOf(zfq.class, str);
    }

    public static zfq[] values() {
        return (zfq[]) b.clone();
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
