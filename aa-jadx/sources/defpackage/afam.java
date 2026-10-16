package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class afam {
    public static final defpackage.afam a;
    public static final defpackage.afam b;
    public static final defpackage.afam c;
    private static final /* synthetic */ defpackage.afam[] d;

    static {
        defpackage.afam afamVar = new defpackage.afam("WARNING", 0);
        a = afamVar;
        defpackage.afam afamVar2 = new defpackage.afam("ERROR", 1);
        b = afamVar2;
        defpackage.afam afamVar3 = new defpackage.afam("HIDDEN", 2);
        c = afamVar3;
        defpackage.afam[] afamVarArr = {afamVar, afamVar2, afamVar3};
        d = afamVarArr;
        defpackage.afga.p(afamVarArr);
    }

    public static defpackage.afam valueOf(java.lang.String str) {
        return (defpackage.afam) java.lang.Enum.valueOf(defpackage.afam.class, str);
    }

    public static defpackage.afam[] values() {
        return (defpackage.afam[]) d.clone();
    }
}
