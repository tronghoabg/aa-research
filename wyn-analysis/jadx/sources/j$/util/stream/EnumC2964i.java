package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2964i {
    public static final EnumC2964i CONCURRENT;
    public static final EnumC2964i IDENTITY_FINISH;
    public static final EnumC2964i UNORDERED;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ EnumC2964i[] f38221a;

    public static EnumC2964i valueOf(String str) {
        return (EnumC2964i) Enum.valueOf(EnumC2964i.class, str);
    }

    public static EnumC2964i[] values() {
        return (EnumC2964i[]) f38221a.clone();
    }

    static {
        EnumC2964i enumC2964i = new EnumC2964i("CONCURRENT", 0);
        CONCURRENT = enumC2964i;
        EnumC2964i enumC2964i2 = new EnumC2964i("UNORDERED", 1);
        UNORDERED = enumC2964i2;
        EnumC2964i enumC2964i3 = new EnumC2964i("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = enumC2964i3;
        f38221a = new EnumC2964i[]{enumC2964i, enumC2964i2, enumC2964i3};
    }
}
