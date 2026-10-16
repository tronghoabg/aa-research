package l4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3393i {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3393i f40002a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3393i f40003b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3393i f40004c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC3393i[] f40005d;

    static {
        EnumC3393i enumC3393i = new EnumC3393i("ALWAYS", 0);
        f40002a = enumC3393i;
        EnumC3393i enumC3393i2 = new EnumC3393i("ADAPTIVE", 1);
        f40003b = enumC3393i2;
        EnumC3393i enumC3393i3 = new EnumC3393i("NEVER", 2);
        f40004c = enumC3393i3;
        f40005d = new EnumC3393i[]{enumC3393i, enumC3393i2, enumC3393i3};
    }

    public static EnumC3393i valueOf(String str) {
        return (EnumC3393i) Enum.valueOf(EnumC3393i.class, str);
    }

    public static EnumC3393i[] values() {
        return (EnumC3393i[]) f40005d.clone();
    }
}
