package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adlh {
    public static final defpackage.adlh a;
    public static final defpackage.adlh b;
    public static final defpackage.adlh c;
    public static final defpackage.adlh d;
    private static final /* synthetic */ defpackage.adlh[] e;

    static {
        defpackage.adlh adlhVar = new defpackage.adlh("CT_UNKNOWN", 0);
        a = adlhVar;
        defpackage.adlh adlhVar2 = new defpackage.adlh("CT_INFO", 1);
        b = adlhVar2;
        defpackage.adlh adlhVar3 = new defpackage.adlh("CT_WARNING", 2);
        c = adlhVar3;
        defpackage.adlh adlhVar4 = new defpackage.adlh("CT_ERROR", 3);
        d = adlhVar4;
        e = new defpackage.adlh[]{adlhVar, adlhVar2, adlhVar3, adlhVar4};
    }

    public static defpackage.adlh valueOf(java.lang.String str) {
        return (defpackage.adlh) java.lang.Enum.valueOf(defpackage.adlh.class, str);
    }

    public static defpackage.adlh[] values() {
        return (defpackage.adlh[]) e.clone();
    }
}
