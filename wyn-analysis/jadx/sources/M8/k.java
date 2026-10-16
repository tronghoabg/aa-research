package M8;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class k implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final k f7564a;

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f7565b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k[] f7566c;

    static {
        k kVar = new k("INSTANCE", 0);
        f7564a = kVar;
        f7566c = new k[]{kVar};
        f7565b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f7566c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f7565b.post(runnable);
    }
}
