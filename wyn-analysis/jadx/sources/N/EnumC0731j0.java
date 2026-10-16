package N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: N.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0731j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0731j0 f7793a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0731j0 f7794b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0731j0 f7795c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0731j0 f7796d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0731j0 f7797e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0731j0 f7798f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0731j0[] f7799g;

    static {
        EnumC0731j0 enumC0731j0 = new EnumC0731j0("ShutDown", 0);
        f7793a = enumC0731j0;
        EnumC0731j0 enumC0731j02 = new EnumC0731j0("ShuttingDown", 1);
        f7794b = enumC0731j02;
        EnumC0731j0 enumC0731j03 = new EnumC0731j0("Inactive", 2);
        f7795c = enumC0731j03;
        EnumC0731j0 enumC0731j04 = new EnumC0731j0("InactivePendingWork", 3);
        f7796d = enumC0731j04;
        EnumC0731j0 enumC0731j05 = new EnumC0731j0("Idle", 4);
        f7797e = enumC0731j05;
        EnumC0731j0 enumC0731j06 = new EnumC0731j0("PendingWork", 5);
        f7798f = enumC0731j06;
        f7799g = new EnumC0731j0[]{enumC0731j0, enumC0731j02, enumC0731j03, enumC0731j04, enumC0731j05, enumC0731j06};
    }

    public static EnumC0731j0 valueOf(String str) {
        return (EnumC0731j0) Enum.valueOf(EnumC0731j0.class, str);
    }

    public static EnumC0731j0[] values() {
        return (EnumC0731j0[]) f7799g.clone();
    }
}
