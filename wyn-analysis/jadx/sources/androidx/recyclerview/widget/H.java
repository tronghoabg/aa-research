package androidx.recyclerview.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final H f18775a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ H[] f18776b;

    static {
        H h10 = new H("ALLOW", 0);
        f18775a = h10;
        f18776b = new H[]{h10, new H("PREVENT_WHEN_EMPTY", 1), new H("PREVENT", 2)};
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f18776b.clone();
    }
}
