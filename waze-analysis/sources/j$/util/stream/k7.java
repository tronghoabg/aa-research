package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class k7 {
    public static final k7 DOUBLE_VALUE;
    public static final k7 INT_VALUE;
    public static final k7 LONG_VALUE;
    public static final k7 REFERENCE;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ k7[] f50490a;

    static {
        k7 k7Var = new k7("REFERENCE", 0);
        REFERENCE = k7Var;
        k7 k7Var2 = new k7("INT_VALUE", 1);
        INT_VALUE = k7Var2;
        k7 k7Var3 = new k7("LONG_VALUE", 2);
        LONG_VALUE = k7Var3;
        k7 k7Var4 = new k7("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = k7Var4;
        f50490a = new k7[]{k7Var, k7Var2, k7Var3, k7Var4};
    }

    public static k7 valueOf(String str) {
        return (k7) Enum.valueOf(k7.class, str);
    }

    public static k7[] values() {
        return (k7[]) f50490a.clone();
    }
}
