package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afu {
    public static final defpackage.afu a;
    public static final defpackage.afu b;
    public static final defpackage.afu c;
    private static final /* synthetic */ defpackage.afu[] d;

    static {
        defpackage.afu afuVar = new defpackage.afu("Default", 0);
        a = afuVar;
        defpackage.afu afuVar2 = new defpackage.afu("UserInput", 1);
        b = afuVar2;
        defpackage.afu afuVar3 = new defpackage.afu("PreventUserInput", 2);
        c = afuVar3;
        defpackage.afu[] afuVarArr = {afuVar, afuVar2, afuVar3};
        d = afuVarArr;
        defpackage.afga.p(afuVarArr);
    }

    public static defpackage.afu valueOf(java.lang.String str) {
        return (defpackage.afu) java.lang.Enum.valueOf(defpackage.afu.class, str);
    }

    public static defpackage.afu[] values() {
        return (defpackage.afu[]) d.clone();
    }
}
