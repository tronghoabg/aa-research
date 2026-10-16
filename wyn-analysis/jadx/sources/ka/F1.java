package ka;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class F1 {

    /* renamed from: a, reason: collision with root package name */
    public static final F1 f39345a;

    /* renamed from: b, reason: collision with root package name */
    public static final F1 f39346b;

    /* renamed from: c, reason: collision with root package name */
    public static final F1 f39347c;

    /* renamed from: d, reason: collision with root package name */
    public static final F1 f39348d;

    /* renamed from: e, reason: collision with root package name */
    public static final F1 f39349e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ F1[] f39350f;

    static {
        F1 f1 = new F1("UPDATE", 0);
        f39345a = f1;
        F1 f12 = new F1("DELETE", 1);
        f39346b = f12;
        F1 f13 = new F1("VERIFY", 2);
        f39347c = f13;
        F1 f14 = new F1("TRANSFORM", 3);
        f39348d = f14;
        F1 f15 = new F1("OPERATION_NOT_SET", 4);
        f39349e = f15;
        f39350f = new F1[]{f1, f12, f13, f14, f15};
    }

    public static F1 valueOf(String str) {
        return (F1) Enum.valueOf(F1.class, str);
    }

    public static F1[] values() {
        return (F1[]) f39350f.clone();
    }
}
