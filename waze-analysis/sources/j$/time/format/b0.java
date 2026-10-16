package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class b0 {
    public static final b0 LENIENT;
    public static final b0 SMART;
    public static final b0 STRICT;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b0[] f49932a;

    static {
        b0 b0Var = new b0("STRICT", 0);
        STRICT = b0Var;
        b0 b0Var2 = new b0("SMART", 1);
        SMART = b0Var2;
        b0 b0Var3 = new b0("LENIENT", 2);
        LENIENT = b0Var3;
        f49932a = new b0[]{b0Var, b0Var2, b0Var3};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f49932a.clone();
    }
}
