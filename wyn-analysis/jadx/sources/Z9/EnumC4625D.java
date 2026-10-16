package z9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z9.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC4625D {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC4625D f48426a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC4625D f48427b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC4625D f48428c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC4625D f48429d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC4625D[] f48430e;

    static {
        EnumC4625D enumC4625D = new EnumC4625D("UNSPECIFIED_RENDER_ERROR", 0);
        f48426a = enumC4625D;
        EnumC4625D enumC4625D2 = new EnumC4625D("IMAGE_FETCH_ERROR", 1);
        f48427b = enumC4625D2;
        EnumC4625D enumC4625D3 = new EnumC4625D("IMAGE_DISPLAY_ERROR", 2);
        f48428c = enumC4625D3;
        EnumC4625D enumC4625D4 = new EnumC4625D("IMAGE_UNSUPPORTED_FORMAT", 3);
        f48429d = enumC4625D4;
        f48430e = new EnumC4625D[]{enumC4625D, enumC4625D2, enumC4625D3, enumC4625D4};
    }

    public static EnumC4625D valueOf(String str) {
        return (EnumC4625D) Enum.valueOf(EnumC4625D.class, str);
    }

    public static EnumC4625D[] values() {
        return (EnumC4625D[]) f48430e.clone();
    }
}
