package m9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m9.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3515n {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3515n f40497a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3515n f40498b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3515n f40499c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC3515n f40500d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC3515n[] f40501e;

    static {
        EnumC3515n enumC3515n = new EnumC3515n("NONE", 0);
        f40497a = enumC3515n;
        EnumC3515n enumC3515n2 = new EnumC3515n("ESTIMATE", 1);
        f40498b = enumC3515n2;
        EnumC3515n enumC3515n3 = new EnumC3515n("PREVIOUS", 2);
        f40499c = enumC3515n3;
        f40501e = new EnumC3515n[]{enumC3515n, enumC3515n2, enumC3515n3};
        f40500d = enumC3515n;
    }

    public static EnumC3515n valueOf(String str) {
        return (EnumC3515n) Enum.valueOf(EnumC3515n.class, str);
    }

    public static EnumC3515n[] values() {
        return (EnumC3515n[]) f40501e.clone();
    }
}
