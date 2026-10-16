package l4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3388d {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3388d f39952a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3388d f39953b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3388d f39954c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC3388d[] f39955d;

    static {
        EnumC3388d enumC3388d = new EnumC3388d("START", 0);
        f39952a = enumC3388d;
        EnumC3388d enumC3388d2 = new EnumC3388d("CENTER", 1);
        f39953b = enumC3388d2;
        EnumC3388d enumC3388d3 = new EnumC3388d("END", 2);
        f39954c = enumC3388d3;
        f39955d = new EnumC3388d[]{enumC3388d, enumC3388d2, enumC3388d3};
    }

    public static EnumC3388d valueOf(String str) {
        return (EnumC3388d) Enum.valueOf(EnumC3388d.class, str);
    }

    public static EnumC3388d[] values() {
        return (EnumC3388d[]) f39955d.clone();
    }

    public final int a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return 8388611;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 8388613;
        }
        throw new IllegalStateException("Invalid gravity constant");
    }
}
