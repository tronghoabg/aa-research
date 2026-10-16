package md;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: md.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC3529A {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3529A f40558a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3529A f40559b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3529A f40560c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC3529A[] f40561d;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3529A EF4;

    static {
        EnumC3529A enumC3529A = new EnumC3529A("CT_UNKNOWN", 0);
        EnumC3529A enumC3529A2 = new EnumC3529A("CT_INFO", 1);
        f40558a = enumC3529A2;
        EnumC3529A enumC3529A3 = new EnumC3529A("CT_WARNING", 2);
        f40559b = enumC3529A3;
        EnumC3529A enumC3529A4 = new EnumC3529A("CT_ERROR", 3);
        f40560c = enumC3529A4;
        f40561d = new EnumC3529A[]{enumC3529A, enumC3529A2, enumC3529A3, enumC3529A4};
    }

    public static EnumC3529A valueOf(String str) {
        return (EnumC3529A) Enum.valueOf(EnumC3529A.class, str);
    }

    public static EnumC3529A[] values() {
        return (EnumC3529A[]) f40561d.clone();
    }
}
