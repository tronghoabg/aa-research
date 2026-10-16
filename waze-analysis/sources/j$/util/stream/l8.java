package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class l8 {
    public static final l8 MAYBE_MORE;
    public static final l8 NO_MORE;
    public static final l8 UNLIMITED;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ l8[] f50506a;

    static {
        l8 l8Var = new l8("NO_MORE", 0);
        NO_MORE = l8Var;
        l8 l8Var2 = new l8("MAYBE_MORE", 1);
        MAYBE_MORE = l8Var2;
        l8 l8Var3 = new l8("UNLIMITED", 2);
        UNLIMITED = l8Var3;
        f50506a = new l8[]{l8Var, l8Var2, l8Var3};
    }

    public static l8 valueOf(String str) {
        return (l8) Enum.valueOf(l8.class, str);
    }

    public static l8[] values() {
        return (l8[]) f50506a.clone();
    }
}
