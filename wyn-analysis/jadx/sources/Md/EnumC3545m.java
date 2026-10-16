package md;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: md.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC3545m {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3545m f40692a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3545m f40693b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3545m f40694c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC3545m f40695d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC3545m f40696e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC3545m[] f40697f;

    static {
        EnumC3545m enumC3545m = new EnumC3545m("CONNECTING", 0);
        f40692a = enumC3545m;
        EnumC3545m enumC3545m2 = new EnumC3545m("READY", 1);
        f40693b = enumC3545m2;
        EnumC3545m enumC3545m3 = new EnumC3545m("TRANSIENT_FAILURE", 2);
        f40694c = enumC3545m3;
        EnumC3545m enumC3545m4 = new EnumC3545m("IDLE", 3);
        f40695d = enumC3545m4;
        EnumC3545m enumC3545m5 = new EnumC3545m("SHUTDOWN", 4);
        f40696e = enumC3545m5;
        f40697f = new EnumC3545m[]{enumC3545m, enumC3545m2, enumC3545m3, enumC3545m4, enumC3545m5};
    }

    public static EnumC3545m valueOf(String str) {
        return (EnumC3545m) Enum.valueOf(EnumC3545m.class, str);
    }

    public static EnumC3545m[] values() {
        return (EnumC3545m[]) f40697f.clone();
    }
}
