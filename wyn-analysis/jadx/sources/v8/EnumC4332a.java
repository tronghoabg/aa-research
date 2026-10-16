package v8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: v8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC4332a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC4332a f47024a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC4332a f47025b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC4332a[] f47026c;

    static {
        EnumC4332a enumC4332a = new EnumC4332a("GRANTED", 0);
        f47024a = enumC4332a;
        EnumC4332a enumC4332a2 = new EnumC4332a("DENIED", 1);
        f47025b = enumC4332a2;
        f47026c = new EnumC4332a[]{enumC4332a, enumC4332a2};
    }

    public static EnumC4332a valueOf(String str) {
        return (EnumC4332a) Enum.valueOf(EnumC4332a.class, str);
    }

    public static EnumC4332a[] values() {
        return (EnumC4332a[]) f47026c.clone();
    }
}
