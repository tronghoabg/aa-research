package Hf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f5159a;

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f5160b;

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f5161c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ m0[] f5162d;

    static {
        m0 m0Var = new m0("START", 0);
        f5159a = m0Var;
        m0 m0Var2 = new m0("STOP", 1);
        f5160b = m0Var2;
        m0 m0Var3 = new m0("STOP_AND_RESET_REPLAY_CACHE", 2);
        f5161c = m0Var3;
        m0[] m0VarArr = {m0Var, m0Var2, m0Var3};
        f5162d = m0VarArr;
        ic.d.t(m0VarArr);
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f5162d.clone();
    }
}
