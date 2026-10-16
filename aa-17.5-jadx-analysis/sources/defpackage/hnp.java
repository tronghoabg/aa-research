package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hnp {
    public static final hnp a;
    public static final hnp b;
    public static final hnp c;
    public static final /* synthetic */ afdf d;
    private static final /* synthetic */ hnp[] f;
    public final String e;

    static {
        hnp hnpVar = new hnp("UNKNOWN", 0, "unknown");
        a = hnpVar;
        hnp hnpVar2 = new hnp("HOME", 1, "home");
        b = hnpVar2;
        hnp hnpVar3 = new hnp("CONVERSATION", 2, "conversation");
        c = hnpVar3;
        hnp[] hnpVarArr = {hnpVar, hnpVar2, hnpVar3};
        f = hnpVarArr;
        d = affa.p(hnpVarArr);
    }

    private hnp(String str, int i, String str2) {
        this.e = str2;
    }

    public static hnp valueOf(String str) {
        return (hnp) Enum.valueOf(hnp.class, str);
    }

    public static hnp[] values() {
        return (hnp[]) f.clone();
    }
}
