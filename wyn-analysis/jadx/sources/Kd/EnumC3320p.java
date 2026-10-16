package kd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: kd.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC3320p {

    /* renamed from: b, reason: collision with root package name */
    public static final ae.d f39683b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3320p f39684c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC3320p f39685d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC3320p f39686e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC3320p f39687f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC3320p[] f39688g;

    /* renamed from: a, reason: collision with root package name */
    public final int f39689a;

    static {
        EnumC3320p enumC3320p = new EnumC3320p("OPEN", 0, 0);
        f39684c = enumC3320p;
        EnumC3320p enumC3320p2 = new EnumC3320p("OPEN_MULTIPLE", 1, 1);
        f39685d = enumC3320p2;
        EnumC3320p enumC3320p3 = new EnumC3320p("SAVE", 2, 2);
        f39686e = enumC3320p3;
        EnumC3320p enumC3320p4 = new EnumC3320p("UNKNOWN", 3, 3);
        f39687f = enumC3320p4;
        EnumC3320p[] enumC3320pArr = {enumC3320p, enumC3320p2, enumC3320p3, enumC3320p4};
        f39688g = enumC3320pArr;
        ic.d.t(enumC3320pArr);
        f39683b = new ae.d(8);
    }

    public EnumC3320p(String str, int i5, int i10) {
        this.f39689a = i10;
    }

    public static EnumC3320p valueOf(String str) {
        return (EnumC3320p) Enum.valueOf(EnumC3320p.class, str);
    }

    public static EnumC3320p[] values() {
        return (EnumC3320p[]) f39688g.clone();
    }
}
