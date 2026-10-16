package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afdr {
    public static final defpackage.afdr a;
    public static final defpackage.afdr b;
    public static final defpackage.afdr c;
    private static final /* synthetic */ defpackage.afdr[] d;

    static {
        defpackage.afdr afdrVar = new defpackage.afdr("COROUTINE_SUSPENDED", 0);
        a = afdrVar;
        defpackage.afdr afdrVar2 = new defpackage.afdr("UNDECIDED", 1);
        b = afdrVar2;
        defpackage.afdr afdrVar3 = new defpackage.afdr("RESUMED", 2);
        c = afdrVar3;
        defpackage.afdr[] afdrVarArr = {afdrVar, afdrVar2, afdrVar3};
        d = afdrVarArr;
        defpackage.afga.p(afdrVarArr);
    }

    public static defpackage.afdr valueOf(java.lang.String str) {
        return (defpackage.afdr) java.lang.Enum.valueOf(defpackage.afdr.class, str);
    }

    public static defpackage.afdr[] values() {
        return (defpackage.afdr[]) d.clone();
    }
}
