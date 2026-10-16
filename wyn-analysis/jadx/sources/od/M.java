package od;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public static final M f41643a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ M[] f41644b;

    static {
        M m10 = new M("INSTANCE", 0);
        f41643a = m10;
        f41644b = new M[]{m10};
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) f41644b.clone();
    }
}
