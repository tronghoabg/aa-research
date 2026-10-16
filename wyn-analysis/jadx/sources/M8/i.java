package M8;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final i f7556a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i[] f7557b;

    static {
        i iVar = new i("INSTANCE", 0);
        f7556a = iVar;
        f7557b = new i[]{iVar};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f7557b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
