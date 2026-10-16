package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bdz {
    public static final defpackage.bdz a;
    public static final defpackage.bdz b;
    public static final defpackage.bdz c;
    private static final /* synthetic */ defpackage.bdz[] d;

    static {
        defpackage.bdz bdzVar = new defpackage.bdz("None", 0);
        a = bdzVar;
        defpackage.bdz bdzVar2 = new defpackage.bdz("Selection", 1);
        b = bdzVar2;
        defpackage.bdz bdzVar3 = new defpackage.bdz("Cursor", 2);
        c = bdzVar3;
        defpackage.bdz[] bdzVarArr = {bdzVar, bdzVar2, bdzVar3};
        d = bdzVarArr;
        defpackage.afga.p(bdzVarArr);
    }

    public static defpackage.bdz valueOf(java.lang.String str) {
        return (defpackage.bdz) java.lang.Enum.valueOf(defpackage.bdz.class, str);
    }

    public static defpackage.bdz[] values() {
        return (defpackage.bdz[]) d.clone();
    }
}
