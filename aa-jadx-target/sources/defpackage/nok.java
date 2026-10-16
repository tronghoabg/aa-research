package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nok {
    public static final defpackage.nok a;
    public static final defpackage.nok b;
    public static final defpackage.nok c;
    public static final defpackage.nok d;
    private static final /* synthetic */ defpackage.nok[] e;

    static {
        defpackage.nok nokVar = new defpackage.nok("INACTIVE", 0);
        a = nokVar;
        defpackage.nok nokVar2 = new defpackage.nok("IN_CALL", 1);
        b = nokVar2;
        defpackage.nok nokVar3 = new defpackage.nok("NAVIGATION", 2);
        c = nokVar3;
        defpackage.nok nokVar4 = new defpackage.nok("MEDIA", 3);
        d = nokVar4;
        defpackage.nok[] nokVarArr = {nokVar, nokVar2, nokVar3, nokVar4};
        e = nokVarArr;
        defpackage.afga.p(nokVarArr);
    }

    public static defpackage.nok valueOf(java.lang.String str) {
        return (defpackage.nok) java.lang.Enum.valueOf(defpackage.nok.class, str);
    }

    public static defpackage.nok[] values() {
        return (defpackage.nok[]) e.clone();
    }
}
