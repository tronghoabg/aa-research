package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sbm {
    public static final defpackage.sbm a;
    public static final defpackage.sbm b;
    public static final defpackage.sbm c;
    private static final /* synthetic */ defpackage.sbm[] d;

    static {
        defpackage.sbm sbmVar = new defpackage.sbm("UNKNOWN", 0);
        a = sbmVar;
        defpackage.sbm sbmVar2 = new defpackage.sbm("ALLOWED", 1);
        b = sbmVar2;
        defpackage.sbm sbmVar3 = new defpackage.sbm("REJECTED", 2);
        c = sbmVar3;
        d = new defpackage.sbm[]{sbmVar, sbmVar2, sbmVar3};
    }

    public static defpackage.sbm valueOf(java.lang.String str) {
        return (defpackage.sbm) java.lang.Enum.valueOf(defpackage.sbm.class, str);
    }

    public static defpackage.sbm[] values() {
        return (defpackage.sbm[]) d.clone();
    }
}
