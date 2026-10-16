package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nbf {
    public static final defpackage.nbf a;
    public static final defpackage.nbf b;
    public static final defpackage.nbf c;
    private static final /* synthetic */ defpackage.nbf[] d;

    static {
        defpackage.nbf nbfVar = new defpackage.nbf("LOADING", 0);
        a = nbfVar;
        defpackage.nbf nbfVar2 = new defpackage.nbf("VALID", 1);
        b = nbfVar2;
        defpackage.nbf nbfVar3 = new defpackage.nbf("EMPTY", 2);
        c = nbfVar3;
        defpackage.nbf[] nbfVarArr = {nbfVar, nbfVar2, nbfVar3};
        d = nbfVarArr;
        defpackage.afga.p(nbfVarArr);
    }

    public static defpackage.nbf valueOf(java.lang.String str) {
        return (defpackage.nbf) java.lang.Enum.valueOf(defpackage.nbf.class, str);
    }

    public static defpackage.nbf[] values() {
        return (defpackage.nbf[]) d.clone();
    }
}
