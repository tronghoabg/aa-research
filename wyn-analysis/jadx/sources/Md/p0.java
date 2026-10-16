package md;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f40709a;

    /* renamed from: b, reason: collision with root package name */
    public static final p0 f40710b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ p0[] f40711c;

    /* JADX INFO: Fake field, exist only in values array */
    p0 EF3;

    static {
        p0 p0Var = new p0("FAKE", 0);
        p0 p0Var2 = new p0("MTLS", 1);
        f40709a = p0Var2;
        p0 p0Var3 = new p0("CUSTOM_MANAGERS", 2);
        f40710b = p0Var3;
        f40711c = new p0[]{p0Var, p0Var2, p0Var3};
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f40711c.clone();
    }
}
