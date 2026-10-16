package od;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: od.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC3721s {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3721s f42082a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3721s f42083b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3721s f42084c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC3721s f42085d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC3721s[] f42086e;

    static {
        EnumC3721s enumC3721s = new EnumC3721s("PROCESSED", 0);
        f42082a = enumC3721s;
        EnumC3721s enumC3721s2 = new EnumC3721s("REFUSED", 1);
        f42083b = enumC3721s2;
        EnumC3721s enumC3721s3 = new EnumC3721s("DROPPED", 2);
        f42084c = enumC3721s3;
        EnumC3721s enumC3721s4 = new EnumC3721s("MISCARRIED", 3);
        f42085d = enumC3721s4;
        f42086e = new EnumC3721s[]{enumC3721s, enumC3721s2, enumC3721s3, enumC3721s4};
    }

    public static EnumC3721s valueOf(String str) {
        return (EnumC3721s) Enum.valueOf(EnumC3721s.class, str);
    }

    public static EnumC3721s[] values() {
        return (EnumC3721s[]) f42086e.clone();
    }
}
