package ad;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ad.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC1379y {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1379y f17617a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1379y f17618b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC1379y[] f17619c;

    static {
        EnumC1379y enumC1379y = new EnumC1379y("NOT_READY", 0);
        f17617a = enumC1379y;
        EnumC1379y enumC1379y2 = new EnumC1379y("READY", 1);
        f17618b = enumC1379y2;
        f17619c = new EnumC1379y[]{enumC1379y, enumC1379y2};
    }

    public static EnumC1379y valueOf(String str) {
        return (EnumC1379y) Enum.valueOf(EnumC1379y.class, str);
    }

    public static EnumC1379y[] values() {
        return (EnumC1379y[]) f17619c.clone();
    }
}
