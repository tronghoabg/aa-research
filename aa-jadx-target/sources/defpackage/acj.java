package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acj {
    public static final defpackage.acj a;
    public static final defpackage.acj b;
    public static final defpackage.acj c;
    private static final /* synthetic */ defpackage.acj[] d;

    static {
        defpackage.acj acjVar = new defpackage.acj("PreEnter", 0);
        a = acjVar;
        defpackage.acj acjVar2 = new defpackage.acj("Visible", 1);
        b = acjVar2;
        defpackage.acj acjVar3 = new defpackage.acj("PostExit", 2);
        c = acjVar3;
        defpackage.acj[] acjVarArr = {acjVar, acjVar2, acjVar3};
        d = acjVarArr;
        defpackage.afga.p(acjVarArr);
    }

    public static defpackage.acj valueOf(java.lang.String str) {
        return (defpackage.acj) java.lang.Enum.valueOf(defpackage.acj.class, str);
    }

    public static defpackage.acj[] values() {
        return (defpackage.acj[]) d.clone();
    }
}
