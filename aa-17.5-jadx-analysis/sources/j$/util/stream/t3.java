package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class t3 {
    public static final t3 OP;
    public static final t3 SPLITERATOR;
    public static final t3 STREAM;
    public static final t3 TERMINAL_OP;
    public static final t3 UPSTREAM_TERMINAL_OP;
    public static final /* synthetic */ t3[] a;

    static {
        t3 t3Var = new t3("SPLITERATOR", 0);
        SPLITERATOR = t3Var;
        t3 t3Var2 = new t3("STREAM", 1);
        STREAM = t3Var2;
        t3 t3Var3 = new t3("OP", 2);
        OP = t3Var3;
        t3 t3Var4 = new t3("TERMINAL_OP", 3);
        TERMINAL_OP = t3Var4;
        t3 t3Var5 = new t3("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = t3Var5;
        a = new t3[]{t3Var, t3Var2, t3Var3, t3Var4, t3Var5};
    }

    public static t3 valueOf(String str) {
        return (t3) Enum.valueOf(t3.class, str);
    }

    public static t3[] values() {
        return (t3[]) a.clone();
    }
}
