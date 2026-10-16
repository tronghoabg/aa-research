package Ze;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a implements Callable, Le.c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17083a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f17084b;

    static {
        a aVar = new a("INSTANCE", 0);
        f17083a = aVar;
        f17084b = new a[]{aVar};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f17084b.clone();
    }

    @Override // Le.c
    public final Object apply(Object obj) {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new ArrayList();
    }
}
