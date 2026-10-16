package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class adkh {
    public static final defpackage.adkh a;
    public static final defpackage.adkh b;
    public static final defpackage.adkh c;
    public static final defpackage.adkh d;
    public static final defpackage.adkh e;
    private static final /* synthetic */ defpackage.adkh[] f;

    static {
        defpackage.adkh adkhVar = new defpackage.adkh("CONNECTING", 0);
        a = adkhVar;
        defpackage.adkh adkhVar2 = new defpackage.adkh("READY", 1);
        b = adkhVar2;
        defpackage.adkh adkhVar3 = new defpackage.adkh("TRANSIENT_FAILURE", 2);
        c = adkhVar3;
        defpackage.adkh adkhVar4 = new defpackage.adkh("IDLE", 3);
        d = adkhVar4;
        defpackage.adkh adkhVar5 = new defpackage.adkh("SHUTDOWN", 4);
        e = adkhVar5;
        f = new defpackage.adkh[]{adkhVar, adkhVar2, adkhVar3, adkhVar4, adkhVar5};
    }

    public static defpackage.adkh valueOf(java.lang.String str) {
        return (defpackage.adkh) java.lang.Enum.valueOf(defpackage.adkh.class, str);
    }

    public static defpackage.adkh[] values() {
        return (defpackage.adkh[]) f.clone();
    }
}
