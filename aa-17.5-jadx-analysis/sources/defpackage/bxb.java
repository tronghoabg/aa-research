package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bxb {
    public static final bxb a;
    public static final bxb b;
    public static final bxb c;
    public static final bxb d;
    public static final bxb e;
    public static final bxb f;
    public static final bxb g;
    private static final /* synthetic */ bxb[] h;

    static {
        bxb bxbVar = new bxb("Invalid", 0);
        a = bxbVar;
        bxb bxbVar2 = new bxb("Cancelled", 1);
        b = bxbVar2;
        bxb bxbVar3 = new bxb("InitialPending", 2);
        c = bxbVar3;
        bxb bxbVar4 = new bxb("RecomposePending", 3);
        d = bxbVar4;
        bxb bxbVar5 = new bxb("Recomposing", 4);
        e = bxbVar5;
        bxb bxbVar6 = new bxb("ApplyPending", 5);
        f = bxbVar6;
        bxb bxbVar7 = new bxb("Applied", 6);
        g = bxbVar7;
        bxb[] bxbVarArr = {bxbVar, bxbVar2, bxbVar3, bxbVar4, bxbVar5, bxbVar6, bxbVar7};
        h = bxbVarArr;
        affa.p(bxbVarArr);
    }

    public static bxb valueOf(String str) {
        return (bxb) Enum.valueOf(bxb.class, str);
    }

    public static bxb[] values() {
        return (bxb[]) h.clone();
    }
}
