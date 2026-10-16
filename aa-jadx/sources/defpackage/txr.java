package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
final class txr {
    public static final defpackage.txr a;
    public static final defpackage.txr b;
    public static final defpackage.txr c;
    public static final defpackage.txr d;
    public static final defpackage.txr e;
    public static final defpackage.txr f;
    private static final /* synthetic */ defpackage.txr[] g;

    static {
        defpackage.txr txrVar = new defpackage.txr("PAN_UP", 0);
        a = txrVar;
        defpackage.txr txrVar2 = new defpackage.txr("PAN_DOWN", 1);
        b = txrVar2;
        defpackage.txr txrVar3 = new defpackage.txr("PAN_LEFT", 2);
        c = txrVar3;
        defpackage.txr txrVar4 = new defpackage.txr("PAN_RIGHT", 3);
        d = txrVar4;
        defpackage.txr txrVar5 = new defpackage.txr("ZOOM_IN", 4);
        e = txrVar5;
        defpackage.txr txrVar6 = new defpackage.txr("ZOOM_OUT", 5);
        f = txrVar6;
        g = new defpackage.txr[]{txrVar, txrVar2, txrVar3, txrVar4, txrVar5, txrVar6};
    }

    public static defpackage.txr valueOf(java.lang.String str) {
        return (defpackage.txr) java.lang.Enum.valueOf(defpackage.txr.class, str);
    }

    public static defpackage.txr[] values() {
        return (defpackage.txr[]) g.clone();
    }
}
