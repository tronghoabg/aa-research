package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class acw {
    public static final acw a;
    public static final acw b;
    public static final acw c;
    public static final acw d;
    public static final acw e;
    private static final /* synthetic */ acw[] f;

    static {
        acw acwVar = new acw("Idle", 0);
        a = acwVar;
        acw acwVar2 = new acw("MutatingPendingCatchUp", 1);
        b = acwVar2;
        acw acwVar3 = new acw("MutatingCatchingUp", 2);
        c = acwVar3;
        acw acwVar4 = new acw("Mutating", 3);
        d = acwVar4;
        acw acwVar5 = new acw("Handoff", 4);
        e = acwVar5;
        acw[] acwVarArr = {acwVar, acwVar2, acwVar3, acwVar4, acwVar5};
        f = acwVarArr;
        affa.p(acwVarArr);
    }

    public static acw valueOf(String str) {
        return (acw) Enum.valueOf(acw.class, str);
    }

    public static acw[] values() {
        return (acw[]) f.clone();
    }
}
