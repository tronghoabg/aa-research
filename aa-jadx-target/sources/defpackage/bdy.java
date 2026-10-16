package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bdy {
    public static final defpackage.bdy a;
    public static final defpackage.bdy b;
    public static final defpackage.bdy c;
    private static final /* synthetic */ defpackage.bdy[] d;

    static {
        defpackage.bdy bdyVar = new defpackage.bdy("Cursor", 0);
        a = bdyVar;
        defpackage.bdy bdyVar2 = new defpackage.bdy("SelectionStart", 1);
        b = bdyVar2;
        defpackage.bdy bdyVar3 = new defpackage.bdy("SelectionEnd", 2);
        c = bdyVar3;
        defpackage.bdy[] bdyVarArr = {bdyVar, bdyVar2, bdyVar3};
        d = bdyVarArr;
        defpackage.afga.p(bdyVarArr);
    }

    public static defpackage.bdy valueOf(java.lang.String str) {
        return (defpackage.bdy) java.lang.Enum.valueOf(defpackage.bdy.class, str);
    }

    public static defpackage.bdy[] values() {
        return (defpackage.bdy[]) d.clone();
    }
}
