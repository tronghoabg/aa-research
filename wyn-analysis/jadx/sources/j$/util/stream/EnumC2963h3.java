package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2963h3 {
    public static final EnumC2963h3 DOUBLE_VALUE;
    public static final EnumC2963h3 INT_VALUE;
    public static final EnumC2963h3 LONG_VALUE;
    public static final EnumC2963h3 REFERENCE;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ EnumC2963h3[] f38220a;

    public static EnumC2963h3 valueOf(String str) {
        return (EnumC2963h3) Enum.valueOf(EnumC2963h3.class, str);
    }

    public static EnumC2963h3[] values() {
        return (EnumC2963h3[]) f38220a.clone();
    }

    static {
        EnumC2963h3 enumC2963h3 = new EnumC2963h3("REFERENCE", 0);
        REFERENCE = enumC2963h3;
        EnumC2963h3 enumC2963h32 = new EnumC2963h3("INT_VALUE", 1);
        INT_VALUE = enumC2963h32;
        EnumC2963h3 enumC2963h33 = new EnumC2963h3("LONG_VALUE", 2);
        LONG_VALUE = enumC2963h33;
        EnumC2963h3 enumC2963h34 = new EnumC2963h3("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = enumC2963h34;
        f38220a = new EnumC2963h3[]{enumC2963h3, enumC2963h32, enumC2963h33, enumC2963h34};
    }
}
