package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mui {
    public static final defpackage.mui a;
    public static final defpackage.mui b;
    public static final defpackage.mui c;
    private static final /* synthetic */ defpackage.mui[] d;

    static {
        defpackage.mui muiVar = new defpackage.mui("SHOWN", 0);
        a = muiVar;
        defpackage.mui muiVar2 = new defpackage.mui("HIDDEN", 1);
        b = muiVar2;
        defpackage.mui muiVar3 = new defpackage.mui("FINISHED", 2);
        c = muiVar3;
        defpackage.mui[] muiVarArr = {muiVar, muiVar2, muiVar3};
        d = muiVarArr;
        defpackage.afga.p(muiVarArr);
    }

    public static defpackage.mui valueOf(java.lang.String str) {
        return (defpackage.mui) java.lang.Enum.valueOf(defpackage.mui.class, str);
    }

    public static defpackage.mui[] values() {
        return (defpackage.mui[]) d.clone();
    }
}
