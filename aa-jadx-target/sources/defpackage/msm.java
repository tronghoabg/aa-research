package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class msm {
    public static final defpackage.msm a;
    public static final defpackage.msm b;
    public static final defpackage.msm c;
    public static final defpackage.msm d;
    public static final /* synthetic */ defpackage.afef e;
    private static final /* synthetic */ defpackage.msm[] f;

    static {
        defpackage.msm msmVar = new defpackage.msm("TOP_LEFT", 0);
        a = msmVar;
        defpackage.msm msmVar2 = new defpackage.msm("TOP_RIGHT", 1);
        b = msmVar2;
        defpackage.msm msmVar3 = new defpackage.msm("BOTTOM_LEFT", 2);
        c = msmVar3;
        defpackage.msm msmVar4 = new defpackage.msm("BOTTOM_RIGHT", 3);
        d = msmVar4;
        defpackage.msm[] msmVarArr = {msmVar, msmVar2, msmVar3, msmVar4};
        f = msmVarArr;
        e = defpackage.afga.p(msmVarArr);
    }

    public static defpackage.msm valueOf(java.lang.String str) {
        return (defpackage.msm) java.lang.Enum.valueOf(defpackage.msm.class, str);
    }

    public static defpackage.msm[] values() {
        return (defpackage.msm[]) f.clone();
    }
}
