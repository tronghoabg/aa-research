package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nkk {
    public static final defpackage.nkk a;
    public static final defpackage.nkk b;
    public static final defpackage.nkk c;
    private static final /* synthetic */ defpackage.nkk[] d;

    static {
        defpackage.nkk nkkVar = new defpackage.nkk("Driver", 0);
        a = nkkVar;
        defpackage.nkk nkkVar2 = new defpackage.nkk("Passenger", 1);
        b = nkkVar2;
        defpackage.nkk nkkVar3 = new defpackage.nkk("None", 2);
        c = nkkVar3;
        defpackage.nkk[] nkkVarArr = {nkkVar, nkkVar2, nkkVar3};
        d = nkkVarArr;
        defpackage.afga.p(nkkVarArr);
    }

    public static defpackage.nkk valueOf(java.lang.String str) {
        return (defpackage.nkk) java.lang.Enum.valueOf(defpackage.nkk.class, str);
    }

    public static defpackage.nkk[] values() {
        return (defpackage.nkk[]) d.clone();
    }
}
