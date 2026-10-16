package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bxo {
    public static final defpackage.bxo a;
    public static final defpackage.bxo b;
    public static final defpackage.bxo c;
    public static final defpackage.bxo d;
    public static final defpackage.bxo e;
    public static final defpackage.bxo f;
    private static final /* synthetic */ defpackage.bxo[] g;

    static {
        defpackage.bxo bxoVar = new defpackage.bxo("ShutDown", 0);
        a = bxoVar;
        defpackage.bxo bxoVar2 = new defpackage.bxo("ShuttingDown", 1);
        b = bxoVar2;
        defpackage.bxo bxoVar3 = new defpackage.bxo("Inactive", 2);
        c = bxoVar3;
        defpackage.bxo bxoVar4 = new defpackage.bxo("InactivePendingWork", 3);
        d = bxoVar4;
        defpackage.bxo bxoVar5 = new defpackage.bxo("Idle", 4);
        e = bxoVar5;
        defpackage.bxo bxoVar6 = new defpackage.bxo("PendingWork", 5);
        f = bxoVar6;
        defpackage.bxo[] bxoVarArr = {bxoVar, bxoVar2, bxoVar3, bxoVar4, bxoVar5, bxoVar6};
        g = bxoVarArr;
        defpackage.afga.p(bxoVarArr);
    }

    public static defpackage.bxo valueOf(java.lang.String str) {
        return (defpackage.bxo) java.lang.Enum.valueOf(defpackage.bxo.class, str);
    }

    public static defpackage.bxo[] values() {
        return (defpackage.bxo[]) g.clone();
    }
}
