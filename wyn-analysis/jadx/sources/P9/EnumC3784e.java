package p9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: p9.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3784e {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3784e f43347a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3784e f43348b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3784e f43349c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC3784e f43350d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC3784e[] f43351e;

    static {
        EnumC3784e enumC3784e = new EnumC3784e("REMOVED", 0);
        f43347a = enumC3784e;
        EnumC3784e enumC3784e2 = new EnumC3784e("ADDED", 1);
        f43348b = enumC3784e2;
        EnumC3784e enumC3784e3 = new EnumC3784e("MODIFIED", 2);
        f43349c = enumC3784e3;
        EnumC3784e enumC3784e4 = new EnumC3784e("METADATA", 3);
        f43350d = enumC3784e4;
        f43351e = new EnumC3784e[]{enumC3784e, enumC3784e2, enumC3784e3, enumC3784e4};
    }

    public static EnumC3784e valueOf(String str) {
        return (EnumC3784e) Enum.valueOf(EnumC3784e.class, str);
    }

    public static EnumC3784e[] values() {
        return (EnumC3784e[]) f43351e.clone();
    }
}
