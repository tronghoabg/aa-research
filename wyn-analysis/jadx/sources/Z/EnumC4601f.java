package z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4601f {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC4601f f48218a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC4601f f48219b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC4601f f48220c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC4601f[] f48221d;

    static {
        EnumC4601f enumC4601f = new EnumC4601f("PreEnter", 0);
        f48218a = enumC4601f;
        EnumC4601f enumC4601f2 = new EnumC4601f("Visible", 1);
        f48219b = enumC4601f2;
        EnumC4601f enumC4601f3 = new EnumC4601f("PostExit", 2);
        f48220c = enumC4601f3;
        f48221d = new EnumC4601f[]{enumC4601f, enumC4601f2, enumC4601f3};
    }

    public static EnumC4601f valueOf(String str) {
        return (EnumC4601f) Enum.valueOf(EnumC4601f.class, str);
    }

    public static EnumC4601f[] values() {
        return (EnumC4601f[]) f48221d.clone();
    }
}
