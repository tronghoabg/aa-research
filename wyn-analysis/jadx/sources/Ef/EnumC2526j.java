package ef;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ef.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC2526j {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2526j f34667a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2526j f34668b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2526j f34669c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC2526j[] f34670d;

    static {
        EnumC2526j enumC2526j = new EnumC2526j("SYNCHRONIZED", 0);
        f34667a = enumC2526j;
        EnumC2526j enumC2526j2 = new EnumC2526j("PUBLICATION", 1);
        f34668b = enumC2526j2;
        EnumC2526j enumC2526j3 = new EnumC2526j("NONE", 2);
        f34669c = enumC2526j3;
        EnumC2526j[] enumC2526jArr = {enumC2526j, enumC2526j2, enumC2526j3};
        f34670d = enumC2526jArr;
        ic.d.t(enumC2526jArr);
    }

    public static EnumC2526j valueOf(String str) {
        return (EnumC2526j) Enum.valueOf(EnumC2526j.class, str);
    }

    public static EnumC2526j[] values() {
        return (EnumC2526j[]) f34670d.clone();
    }
}
