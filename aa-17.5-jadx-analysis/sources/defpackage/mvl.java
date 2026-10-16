package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class mvl {
    public static final mvl a;
    public static final mvl b;
    public static final mvl c;
    public static final mvl d;
    public static final mvl e;
    public static final mvl f;
    private static final /* synthetic */ mvl[] g;

    static {
        mvl mvlVar = new mvl("NAVIGATION_ALERT", 0);
        a = mvlVar;
        mvl mvlVar2 = new mvl("NEW_MESSAGES", 1);
        b = mvlVar2;
        mvl mvlVar3 = new mvl("FEEDBACK", 2);
        c = mvlVar3;
        mvl mvlVar4 = new mvl("ASSISTANT_SUGGESTIONS", 3);
        d = mvlVar4;
        mvl mvlVar5 = new mvl("THIRD_PARTY_SUGGESTIONS", 4);
        e = mvlVar5;
        mvl mvlVar6 = new mvl("OLD_MESSAGES", 5);
        f = mvlVar6;
        mvl[] mvlVarArr = {mvlVar, mvlVar2, mvlVar3, mvlVar4, mvlVar5, mvlVar6};
        g = mvlVarArr;
        affa.p(mvlVarArr);
    }

    public static mvl valueOf(String str) {
        return (mvl) Enum.valueOf(mvl.class, str);
    }

    public static mvl[] values() {
        return (mvl[]) g.clone();
    }
}
