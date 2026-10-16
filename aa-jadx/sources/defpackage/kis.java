package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@defpackage.zkg(a = defpackage.zke.a)
public final class kis {
    public static final defpackage.kis a;
    public static final defpackage.kis b;
    public static final defpackage.kis c;
    public static final defpackage.kis d;
    public static final defpackage.kis e;
    public static final defpackage.kis f;
    private static final /* synthetic */ defpackage.kis[] g;

    static {
        defpackage.kis kisVar = new defpackage.kis("UNINITIALIZED", 0);
        a = kisVar;
        defpackage.kis kisVar2 = new defpackage.kis("CLIENT_CONNECTION_FAILED", 1);
        b = kisVar2;
        defpackage.kis kisVar3 = new defpackage.kis("CLIENT_CONNECTED", 2);
        c = kisVar3;
        defpackage.kis kisVar4 = new defpackage.kis("CLIENT_CONNECTED_AND_CAR_CONNECTED", 3);
        d = kisVar4;
        defpackage.kis kisVar5 = new defpackage.kis("CLIENT_CONNECTED_AND_CAR_DISCONNECTED", 4);
        e = kisVar5;
        defpackage.kis kisVar6 = new defpackage.kis("CLIENT_CONNECTION_SUSPENDED", 5);
        f = kisVar6;
        g = new defpackage.kis[]{kisVar, kisVar2, kisVar3, kisVar4, kisVar5, kisVar6};
    }

    public static defpackage.kis valueOf(java.lang.String str) {
        return (defpackage.kis) java.lang.Enum.valueOf(defpackage.kis.class, str);
    }

    public static defpackage.kis[] values() {
        return (defpackage.kis[]) g.clone();
    }
}
