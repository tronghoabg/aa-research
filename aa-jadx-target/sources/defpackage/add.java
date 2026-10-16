package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class add {
    public static final defpackage.add a;
    public static final defpackage.add b;
    public static final defpackage.add c;
    public static final defpackage.add d;
    public static final defpackage.add e;
    private static final /* synthetic */ defpackage.add[] f;

    static {
        defpackage.add addVar = new defpackage.add("Idle", 0);
        a = addVar;
        defpackage.add addVar2 = new defpackage.add("MutatingPendingCatchUp", 1);
        b = addVar2;
        defpackage.add addVar3 = new defpackage.add("MutatingCatchingUp", 2);
        c = addVar3;
        defpackage.add addVar4 = new defpackage.add("Mutating", 3);
        d = addVar4;
        defpackage.add addVar5 = new defpackage.add("Handoff", 4);
        e = addVar5;
        defpackage.add[] addVarArr = {addVar, addVar2, addVar3, addVar4, addVar5};
        f = addVarArr;
        defpackage.afga.p(addVarArr);
    }

    public static defpackage.add valueOf(java.lang.String str) {
        return (defpackage.add) java.lang.Enum.valueOf(defpackage.add.class, str);
    }

    public static defpackage.add[] values() {
        return (defpackage.add[]) f.clone();
    }
}
