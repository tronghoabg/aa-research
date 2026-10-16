package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class dob implements Executor {
    public static final dob a;
    private static final /* synthetic */ dob[] b;

    static {
        dob dobVar = new dob();
        a = dobVar;
        b = new dob[]{dobVar};
    }

    private dob() {
    }

    public static dob valueOf(String str) {
        return (dob) Enum.valueOf(dob.class, str);
    }

    public static dob[] values() {
        return (dob[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
