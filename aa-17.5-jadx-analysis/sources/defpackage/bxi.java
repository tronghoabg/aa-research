package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bxi {
    public static final bxi a;
    public static final bxi b;
    public static final bxi c;
    public static final bxi d;
    public static final bxi e;
    public static final bxi f;
    private static final /* synthetic */ bxi[] g;

    static {
        bxi bxiVar = new bxi("ShutDown", 0);
        a = bxiVar;
        bxi bxiVar2 = new bxi("ShuttingDown", 1);
        b = bxiVar2;
        bxi bxiVar3 = new bxi("Inactive", 2);
        c = bxiVar3;
        bxi bxiVar4 = new bxi("InactivePendingWork", 3);
        d = bxiVar4;
        bxi bxiVar5 = new bxi("Idle", 4);
        e = bxiVar5;
        bxi bxiVar6 = new bxi("PendingWork", 5);
        f = bxiVar6;
        bxi[] bxiVarArr = {bxiVar, bxiVar2, bxiVar3, bxiVar4, bxiVar5, bxiVar6};
        g = bxiVarArr;
        affa.p(bxiVarArr);
    }

    public static bxi valueOf(String str) {
        return (bxi) Enum.valueOf(bxi.class, str);
    }

    public static bxi[] values() {
        return (bxi[]) g.clone();
    }
}
