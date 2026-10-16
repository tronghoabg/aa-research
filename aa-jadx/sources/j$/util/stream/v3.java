package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class v3 {
    public static final j$.util.stream.v3 DOUBLE_VALUE;
    public static final j$.util.stream.v3 INT_VALUE;
    public static final j$.util.stream.v3 LONG_VALUE;
    public static final j$.util.stream.v3 REFERENCE;
    public static final /* synthetic */ j$.util.stream.v3[] a;

    static {
        j$.util.stream.v3 v3Var = new j$.util.stream.v3("REFERENCE", 0);
        REFERENCE = v3Var;
        j$.util.stream.v3 v3Var2 = new j$.util.stream.v3("INT_VALUE", 1);
        INT_VALUE = v3Var2;
        j$.util.stream.v3 v3Var3 = new j$.util.stream.v3("LONG_VALUE", 2);
        LONG_VALUE = v3Var3;
        j$.util.stream.v3 v3Var4 = new j$.util.stream.v3("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = v3Var4;
        a = new j$.util.stream.v3[]{v3Var, v3Var2, v3Var3, v3Var4};
    }

    public static j$.util.stream.v3 valueOf(java.lang.String str) {
        return (j$.util.stream.v3) java.lang.Enum.valueOf(j$.util.stream.v3.class, str);
    }

    public static j$.util.stream.v3[] values() {
        return (j$.util.stream.v3[]) a.clone();
    }
}
