package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cyy {
    public static final cyy a;
    public static final cyy b;
    public static final cyy c;
    private static final /* synthetic */ cyy[] d;

    static {
        cyy cyyVar = new cyy("ContinueTraversal", 0);
        a = cyyVar;
        cyy cyyVar2 = new cyy("SkipSubtreeAndContinueTraversal", 1);
        b = cyyVar2;
        cyy cyyVar3 = new cyy("CancelTraversal", 2);
        c = cyyVar3;
        cyy[] cyyVarArr = {cyyVar, cyyVar2, cyyVar3};
        d = cyyVarArr;
        affa.p(cyyVarArr);
    }

    public static cyy valueOf(String str) {
        return (cyy) Enum.valueOf(cyy.class, str);
    }

    public static cyy[] values() {
        return (cyy[]) d.clone();
    }
}
