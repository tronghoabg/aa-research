package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class k4 {
    public static final j$.util.stream.k4 MAYBE_MORE;
    public static final j$.util.stream.k4 NO_MORE;
    public static final j$.util.stream.k4 UNLIMITED;
    public static final /* synthetic */ j$.util.stream.k4[] a;

    static {
        j$.util.stream.k4 k4Var = new j$.util.stream.k4("NO_MORE", 0);
        NO_MORE = k4Var;
        j$.util.stream.k4 k4Var2 = new j$.util.stream.k4("MAYBE_MORE", 1);
        MAYBE_MORE = k4Var2;
        j$.util.stream.k4 k4Var3 = new j$.util.stream.k4("UNLIMITED", 2);
        UNLIMITED = k4Var3;
        a = new j$.util.stream.k4[]{k4Var, k4Var2, k4Var3};
    }

    public static j$.util.stream.k4 valueOf(java.lang.String str) {
        return (j$.util.stream.k4) java.lang.Enum.valueOf(j$.util.stream.k4.class, str);
    }

    public static j$.util.stream.k4[] values() {
        return (j$.util.stream.k4[]) a.clone();
    }
}
