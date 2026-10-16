package ka;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Y0 f39392a;

    /* renamed from: b, reason: collision with root package name */
    public static final Y0 f39393b;

    /* renamed from: c, reason: collision with root package name */
    public static final Y0 f39394c;

    /* renamed from: d, reason: collision with root package name */
    public static final Y0 f39395d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Y0[] f39396e;

    static {
        Y0 y02 = new Y0("COMPOSITE_FILTER", 0);
        f39392a = y02;
        Y0 y03 = new Y0("FIELD_FILTER", 1);
        f39393b = y03;
        Y0 y04 = new Y0("UNARY_FILTER", 2);
        f39394c = y04;
        Y0 y05 = new Y0("FILTERTYPE_NOT_SET", 3);
        f39395d = y05;
        f39396e = new Y0[]{y02, y03, y04, y05};
    }

    public static Y0 valueOf(String str) {
        return (Y0) Enum.valueOf(Y0.class, str);
    }

    public static Y0[] values() {
        return (Y0[]) f39396e.clone();
    }
}
