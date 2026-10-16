package androidx.work;

import h.d.a;
import h.d.b;
import h.g.b.x;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class DirectExecutor implements Executor {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DirectExecutor[] $VALUES;
    public static final DirectExecutor INSTANCE = new DirectExecutor("INSTANCE", 0);

    private static final /* synthetic */ DirectExecutor[] $values() {
        return new DirectExecutor[]{INSTANCE};
    }

    static {
        DirectExecutor[] directExecutorArr$values = $values();
        $VALUES = directExecutorArr$values;
        $ENTRIES = b.a(directExecutorArr$values);
    }

    private DirectExecutor(String str, int i2) {
    }

    public static a<DirectExecutor> getEntries() {
        return $ENTRIES;
    }

    public static DirectExecutor valueOf(String str) {
        return (DirectExecutor) Enum.valueOf(DirectExecutor.class, str);
    }

    public static DirectExecutor[] values() {
        return (DirectExecutor[]) $VALUES.clone();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        x.f(runnable, "command");
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
