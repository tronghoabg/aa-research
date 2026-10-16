package md;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f40647a;

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f40648b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h0[] f40649c;

    static {
        h0 h0Var = new h0("NONE", 0);
        f40647a = h0Var;
        h0 h0Var2 = new h0("INTEGRITY", 1);
        h0 h0Var3 = new h0("PRIVACY_AND_INTEGRITY", 2);
        f40648b = h0Var3;
        f40649c = new h0[]{h0Var, h0Var2, h0Var3};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f40649c.clone();
    }
}
