package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class t3 {
    public static final j$.util.stream.t3 OP;
    public static final j$.util.stream.t3 SPLITERATOR;
    public static final j$.util.stream.t3 STREAM;
    public static final j$.util.stream.t3 TERMINAL_OP;
    public static final j$.util.stream.t3 UPSTREAM_TERMINAL_OP;
    public static final /* synthetic */ j$.util.stream.t3[] a;

    static {
        j$.util.stream.t3 t3Var = new j$.util.stream.t3("SPLITERATOR", 0);
        SPLITERATOR = t3Var;
        j$.util.stream.t3 t3Var2 = new j$.util.stream.t3("STREAM", 1);
        STREAM = t3Var2;
        j$.util.stream.t3 t3Var3 = new j$.util.stream.t3("OP", 2);
        OP = t3Var3;
        j$.util.stream.t3 t3Var4 = new j$.util.stream.t3("TERMINAL_OP", 3);
        TERMINAL_OP = t3Var4;
        j$.util.stream.t3 t3Var5 = new j$.util.stream.t3("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = t3Var5;
        a = new j$.util.stream.t3[]{t3Var, t3Var2, t3Var3, t3Var4, t3Var5};
    }

    public static j$.util.stream.t3 valueOf(java.lang.String str) {
        return (j$.util.stream.t3) java.lang.Enum.valueOf(j$.util.stream.t3.class, str);
    }

    public static j$.util.stream.t3[] values() {
        return (j$.util.stream.t3[]) a.clone();
    }
}
