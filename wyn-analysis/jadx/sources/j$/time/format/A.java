package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class A {
    public static final A FULL;
    public static final A FULL_STANDALONE;
    public static final A NARROW;
    public static final A NARROW_STANDALONE;
    public static final A SHORT;
    public static final A SHORT_STANDALONE;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ A[] f37561a;

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f37561a.clone();
    }

    static {
        A a5 = new A("FULL", 0);
        FULL = a5;
        A a10 = new A("FULL_STANDALONE", 1);
        FULL_STANDALONE = a10;
        A a11 = new A("SHORT", 2);
        SHORT = a11;
        A a12 = new A("SHORT_STANDALONE", 3);
        SHORT_STANDALONE = a12;
        A a13 = new A("NARROW", 4);
        NARROW = a13;
        A a14 = new A("NARROW_STANDALONE", 5);
        NARROW_STANDALONE = a14;
        f37561a = new A[]{a5, a10, a11, a12, a13, a14};
    }
}
