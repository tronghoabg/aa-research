package md;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f40628a;

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f40629b;

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f40630c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c0[] f40631d;

    static {
        c0 c0Var = new c0("UNARY", 0);
        f40628a = c0Var;
        c0 c0Var2 = new c0("CLIENT_STREAMING", 1);
        c0 c0Var3 = new c0("SERVER_STREAMING", 2);
        f40629b = c0Var3;
        c0 c0Var4 = new c0("BIDI_STREAMING", 3);
        f40630c = c0Var4;
        f40631d = new c0[]{c0Var, c0Var2, c0Var3, c0Var4, new c0("UNKNOWN", 4)};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f40631d.clone();
    }
}
