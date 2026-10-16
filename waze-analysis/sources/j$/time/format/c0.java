package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class c0 {
    public static final c0 ALWAYS;
    public static final c0 EXCEEDS_PAD;
    public static final c0 NEVER;
    public static final c0 NORMAL;
    public static final c0 NOT_NEGATIVE;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c0[] f49934a;

    static {
        c0 c0Var = new c0("NORMAL", 0);
        NORMAL = c0Var;
        c0 c0Var2 = new c0("ALWAYS", 1);
        ALWAYS = c0Var2;
        c0 c0Var3 = new c0("NEVER", 2);
        NEVER = c0Var3;
        c0 c0Var4 = new c0("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = c0Var4;
        c0 c0Var5 = new c0("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = c0Var5;
        f49934a = new c0[]{c0Var, c0Var2, c0Var3, c0Var4, c0Var5};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f49934a.clone();
    }
}
