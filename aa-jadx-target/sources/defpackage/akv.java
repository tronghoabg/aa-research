package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class akv {
    public static final defpackage.akv a;
    public static final defpackage.akv b;
    public static final defpackage.akv c;
    private static final /* synthetic */ defpackage.akv[] d;

    static {
        defpackage.akv akvVar = new defpackage.akv("Default", 0);
        a = akvVar;
        defpackage.akv akvVar2 = new defpackage.akv("UserInput", 1);
        b = akvVar2;
        defpackage.akv akvVar3 = new defpackage.akv("PreventUserInput", 2);
        c = akvVar3;
        defpackage.akv[] akvVarArr = {akvVar, akvVar2, akvVar3};
        d = akvVarArr;
        defpackage.afga.p(akvVarArr);
    }

    public static defpackage.akv valueOf(java.lang.String str) {
        return (defpackage.akv) java.lang.Enum.valueOf(defpackage.akv.class, str);
    }

    public static defpackage.akv[] values() {
        return (defpackage.akv[]) d.clone();
    }
}
