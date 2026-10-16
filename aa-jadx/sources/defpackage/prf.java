package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class prf {
    public static final defpackage.prf a;
    public static final defpackage.prf b;
    public static final defpackage.prf c;
    public static final defpackage.prf d;
    private static final /* synthetic */ defpackage.prf[] e;

    static {
        defpackage.prf prfVar = new defpackage.prf("UNKNOWN", 0);
        a = prfVar;
        defpackage.prf prfVar2 = new defpackage.prf("EPOCH_FLIP", 1);
        b = prfVar2;
        defpackage.prf prfVar3 = new defpackage.prf("PACKAGE_REPLACED", 2);
        c = prfVar3;
        defpackage.prf prfVar4 = new defpackage.prf("DEV_AND_TESTING_ONLY", 3);
        d = prfVar4;
        e = new defpackage.prf[]{prfVar, prfVar2, prfVar3, prfVar4};
    }

    public static defpackage.prf valueOf(java.lang.String str) {
        return (defpackage.prf) java.lang.Enum.valueOf(defpackage.prf.class, str);
    }

    public static defpackage.prf[] values() {
        return (defpackage.prf[]) e.clone();
    }
}
