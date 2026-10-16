package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adtj {
    public static final defpackage.adtj a;
    public static final defpackage.adtj b;
    public static final defpackage.adtj c;
    public static final defpackage.adtj d;
    private static final /* synthetic */ defpackage.adtj[] e;

    static {
        defpackage.adtj adtjVar = new defpackage.adtj("PROCESSED", 0);
        a = adtjVar;
        defpackage.adtj adtjVar2 = new defpackage.adtj("REFUSED", 1);
        b = adtjVar2;
        defpackage.adtj adtjVar3 = new defpackage.adtj("DROPPED", 2);
        c = adtjVar3;
        defpackage.adtj adtjVar4 = new defpackage.adtj("MISCARRIED", 3);
        d = adtjVar4;
        e = new defpackage.adtj[]{adtjVar, adtjVar2, adtjVar3, adtjVar4};
    }

    public static defpackage.adtj valueOf(java.lang.String str) {
        return (defpackage.adtj) java.lang.Enum.valueOf(defpackage.adtj.class, str);
    }

    public static defpackage.adtj[] values() {
        return (defpackage.adtj[]) e.clone();
    }
}
