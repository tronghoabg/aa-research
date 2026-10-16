package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class v3 {
    public static final v3 DOUBLE_VALUE;
    public static final v3 INT_VALUE;
    public static final v3 LONG_VALUE;
    public static final v3 REFERENCE;
    public static final /* synthetic */ v3[] a;

    static {
        v3 v3Var = new v3("REFERENCE", 0);
        REFERENCE = v3Var;
        v3 v3Var2 = new v3("INT_VALUE", 1);
        INT_VALUE = v3Var2;
        v3 v3Var3 = new v3("LONG_VALUE", 2);
        LONG_VALUE = v3Var3;
        v3 v3Var4 = new v3("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = v3Var4;
        a = new v3[]{v3Var, v3Var2, v3Var3, v3Var4};
    }

    public static v3 valueOf(String str) {
        return (v3) Enum.valueOf(v3.class, str);
    }

    public static v3[] values() {
        return (v3[]) a.clone();
    }
}
