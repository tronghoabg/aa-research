package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class phm {
    public static final defpackage.phm a;
    public static final defpackage.phm b;
    public static final defpackage.phm c;
    private static final /* synthetic */ defpackage.phm[] d;

    static {
        defpackage.phm phmVar = new defpackage.phm("STOPPED", 0);
        a = phmVar;
        defpackage.phm phmVar2 = new defpackage.phm("TCP_STARTED", 1);
        b = phmVar2;
        defpackage.phm phmVar3 = new defpackage.phm("RFCOMM_STARTED", 2);
        c = phmVar3;
        d = new defpackage.phm[]{phmVar, phmVar2, phmVar3};
    }

    public static defpackage.phm valueOf(java.lang.String str) {
        return (defpackage.phm) java.lang.Enum.valueOf(defpackage.phm.class, str);
    }

    public static defpackage.phm[] values() {
        return (defpackage.phm[]) d.clone();
    }
}
