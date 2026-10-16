package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class czg {
    public static final defpackage.czg a;
    public static final defpackage.czg b;
    public static final defpackage.czg c;
    private static final /* synthetic */ defpackage.czg[] d;

    static {
        defpackage.czg czgVar = new defpackage.czg("ContinueTraversal", 0);
        a = czgVar;
        defpackage.czg czgVar2 = new defpackage.czg("SkipSubtreeAndContinueTraversal", 1);
        b = czgVar2;
        defpackage.czg czgVar3 = new defpackage.czg("CancelTraversal", 2);
        c = czgVar3;
        defpackage.czg[] czgVarArr = {czgVar, czgVar2, czgVar3};
        d = czgVarArr;
        defpackage.afga.p(czgVarArr);
    }

    public static defpackage.czg valueOf(java.lang.String str) {
        return (defpackage.czg) java.lang.Enum.valueOf(defpackage.czg.class, str);
    }

    public static defpackage.czg[] values() {
        return (defpackage.czg[]) d.clone();
    }
}
