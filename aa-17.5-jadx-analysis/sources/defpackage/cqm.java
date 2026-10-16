package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cqm {
    public static final cqm a;
    public static final cqm b;
    public static final cqm c;
    private static final /* synthetic */ cqm[] d;

    static {
        cqm cqmVar = new cqm("Initial", 0);
        a = cqmVar;
        cqm cqmVar2 = new cqm("Main", 1);
        b = cqmVar2;
        cqm cqmVar3 = new cqm("Final", 2);
        c = cqmVar3;
        cqm[] cqmVarArr = {cqmVar, cqmVar2, cqmVar3};
        d = cqmVarArr;
        affa.p(cqmVarArr);
    }

    public static cqm valueOf(String str) {
        return (cqm) Enum.valueOf(cqm.class, str);
    }

    public static cqm[] values() {
        return (cqm[]) d.clone();
    }
}
