package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bxh {
    public static final defpackage.bxh a;
    public static final defpackage.bxh b;
    public static final defpackage.bxh c;
    public static final defpackage.bxh d;
    public static final defpackage.bxh e;
    public static final defpackage.bxh f;
    public static final defpackage.bxh g;
    private static final /* synthetic */ defpackage.bxh[] h;

    static {
        defpackage.bxh bxhVar = new defpackage.bxh("Invalid", 0);
        a = bxhVar;
        defpackage.bxh bxhVar2 = new defpackage.bxh("Cancelled", 1);
        b = bxhVar2;
        defpackage.bxh bxhVar3 = new defpackage.bxh("InitialPending", 2);
        c = bxhVar3;
        defpackage.bxh bxhVar4 = new defpackage.bxh("RecomposePending", 3);
        d = bxhVar4;
        defpackage.bxh bxhVar5 = new defpackage.bxh("Recomposing", 4);
        e = bxhVar5;
        defpackage.bxh bxhVar6 = new defpackage.bxh("ApplyPending", 5);
        f = bxhVar6;
        defpackage.bxh bxhVar7 = new defpackage.bxh("Applied", 6);
        g = bxhVar7;
        defpackage.bxh[] bxhVarArr = {bxhVar, bxhVar2, bxhVar3, bxhVar4, bxhVar5, bxhVar6, bxhVar7};
        h = bxhVarArr;
        defpackage.afga.p(bxhVarArr);
    }

    public static defpackage.bxh valueOf(java.lang.String str) {
        return (defpackage.bxh) java.lang.Enum.valueOf(defpackage.bxh.class, str);
    }

    public static defpackage.bxh[] values() {
        return (defpackage.bxh[]) h.clone();
    }
}
