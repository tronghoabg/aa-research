package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1450n {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1450n f18676a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1450n f18677b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1450n f18678c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1450n f18679d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1450n f18680e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1450n[] f18681f;

    static {
        EnumC1450n enumC1450n = new EnumC1450n("DESTROYED", 0);
        f18676a = enumC1450n;
        EnumC1450n enumC1450n2 = new EnumC1450n("INITIALIZED", 1);
        f18677b = enumC1450n2;
        EnumC1450n enumC1450n3 = new EnumC1450n("CREATED", 2);
        f18678c = enumC1450n3;
        EnumC1450n enumC1450n4 = new EnumC1450n("STARTED", 3);
        f18679d = enumC1450n4;
        EnumC1450n enumC1450n5 = new EnumC1450n("RESUMED", 4);
        f18680e = enumC1450n5;
        f18681f = new EnumC1450n[]{enumC1450n, enumC1450n2, enumC1450n3, enumC1450n4, enumC1450n5};
    }

    public static EnumC1450n valueOf(String str) {
        return (EnumC1450n) Enum.valueOf(EnumC1450n.class, str);
    }

    public static EnumC1450n[] values() {
        return (EnumC1450n[]) f18681f.clone();
    }
}
