package z9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z9.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC4624C {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC4624C f48421a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC4624C f48422b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC4624C f48423c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC4624C f48424d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC4624C[] f48425e;

    static {
        EnumC4624C enumC4624C = new EnumC4624C("UNKNOWN_DISMISS_TYPE", 0);
        f48421a = enumC4624C;
        EnumC4624C enumC4624C2 = new EnumC4624C("AUTO", 1);
        f48422b = enumC4624C2;
        EnumC4624C enumC4624C3 = new EnumC4624C("CLICK", 2);
        f48423c = enumC4624C3;
        EnumC4624C enumC4624C4 = new EnumC4624C("SWIPE", 3);
        f48424d = enumC4624C4;
        f48425e = new EnumC4624C[]{enumC4624C, enumC4624C2, enumC4624C3, enumC4624C4};
    }

    public static EnumC4624C valueOf(String str) {
        return (EnumC4624C) Enum.valueOf(EnumC4624C.class, str);
    }

    public static EnumC4624C[] values() {
        return (EnumC4624C[]) f48425e.clone();
    }
}
