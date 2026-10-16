package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class i7 {
    public static final i7 OP;
    public static final i7 SPLITERATOR;
    public static final i7 STREAM;
    public static final i7 TERMINAL_OP;
    public static final i7 UPSTREAM_TERMINAL_OP;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ i7[] f50455a;

    static {
        i7 i7Var = new i7("SPLITERATOR", 0);
        SPLITERATOR = i7Var;
        i7 i7Var2 = new i7("STREAM", 1);
        STREAM = i7Var2;
        i7 i7Var3 = new i7("OP", 2);
        OP = i7Var3;
        i7 i7Var4 = new i7("TERMINAL_OP", 3);
        TERMINAL_OP = i7Var4;
        i7 i7Var5 = new i7("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = i7Var5;
        f50455a = new i7[]{i7Var, i7Var2, i7Var3, i7Var4, i7Var5};
    }

    public static i7 valueOf(String str) {
        return (i7) Enum.valueOf(i7.class, str);
    }

    public static i7[] values() {
        return (i7[]) f50455a.clone();
    }
}
