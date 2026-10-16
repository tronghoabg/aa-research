package q5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q5.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3870e {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3870e f44125a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3870e f44126b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3870e f44127c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC3870e[] f44128d;

    static {
        EnumC3870e enumC3870e = new EnumC3870e("DEFAULT", 0);
        f44125a = enumC3870e;
        EnumC3870e enumC3870e2 = new EnumC3870e("VERY_LOW", 1);
        f44126b = enumC3870e2;
        EnumC3870e enumC3870e3 = new EnumC3870e("HIGHEST", 2);
        f44127c = enumC3870e3;
        f44128d = new EnumC3870e[]{enumC3870e, enumC3870e2, enumC3870e3};
    }

    public static EnumC3870e valueOf(String str) {
        return (EnumC3870e) Enum.valueOf(EnumC3870e.class, str);
    }

    public static EnumC3870e[] values() {
        return (EnumC3870e[]) f44128d.clone();
    }
}
