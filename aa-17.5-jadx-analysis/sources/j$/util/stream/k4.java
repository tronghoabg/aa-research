package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class k4 {
    public static final k4 MAYBE_MORE;
    public static final k4 NO_MORE;
    public static final k4 UNLIMITED;
    public static final /* synthetic */ k4[] a;

    static {
        k4 k4Var = new k4("NO_MORE", 0);
        NO_MORE = k4Var;
        k4 k4Var2 = new k4("MAYBE_MORE", 1);
        MAYBE_MORE = k4Var2;
        k4 k4Var3 = new k4("UNLIMITED", 2);
        UNLIMITED = k4Var3;
        a = new k4[]{k4Var, k4Var2, k4Var3};
    }

    public static k4 valueOf(String str) {
        return (k4) Enum.valueOf(k4.class, str);
    }

    public static k4[] values() {
        return (k4[]) a.clone();
    }
}
