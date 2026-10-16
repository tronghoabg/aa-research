package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 {
    public static final j$.time.format.d0 LENIENT;
    public static final j$.time.format.d0 SMART;
    public static final j$.time.format.d0 STRICT;
    public static final /* synthetic */ j$.time.format.d0[] a;

    static {
        j$.time.format.d0 d0Var = new j$.time.format.d0("STRICT", 0);
        STRICT = d0Var;
        j$.time.format.d0 d0Var2 = new j$.time.format.d0("SMART", 1);
        SMART = d0Var2;
        j$.time.format.d0 d0Var3 = new j$.time.format.d0("LENIENT", 2);
        LENIENT = d0Var3;
        a = new j$.time.format.d0[]{d0Var, d0Var2, d0Var3};
    }

    public static j$.time.format.d0 valueOf(java.lang.String str) {
        return (j$.time.format.d0) java.lang.Enum.valueOf(j$.time.format.d0.class, str);
    }

    public static j$.time.format.d0[] values() {
        return (j$.time.format.d0[]) a.clone();
    }
}
