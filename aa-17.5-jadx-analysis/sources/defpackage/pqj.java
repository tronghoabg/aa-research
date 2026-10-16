package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pqj {
    public static final pqj a;
    public static final pqj b;
    public static final pqj c;
    public static final pqj d;
    private static final /* synthetic */ pqj[] e;

    static {
        pqj pqjVar = new pqj("UNKNOWN", 0);
        a = pqjVar;
        pqj pqjVar2 = new pqj("EPOCH_FLIP", 1);
        b = pqjVar2;
        pqj pqjVar3 = new pqj("PACKAGE_REPLACED", 2);
        c = pqjVar3;
        pqj pqjVar4 = new pqj("DEV_AND_TESTING_ONLY", 3);
        d = pqjVar4;
        e = new pqj[]{pqjVar, pqjVar2, pqjVar3, pqjVar4};
    }

    public static pqj valueOf(String str) {
        return (pqj) Enum.valueOf(pqj.class, str);
    }

    public static pqj[] values() {
        return (pqj[]) e.clone();
    }
}
