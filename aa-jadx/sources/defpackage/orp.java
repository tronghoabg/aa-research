package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class orp {
    public static final defpackage.orp a;
    public static final defpackage.orp b;
    public static final defpackage.orp c;
    public static final defpackage.orp d;
    public static final defpackage.orp e;
    private static final /* synthetic */ defpackage.orp[] f;

    static {
        defpackage.orp orpVar = new defpackage.orp("CONNECTED", 0);
        a = orpVar;
        defpackage.orp orpVar2 = new defpackage.orp("CONNECTING", 1);
        b = orpVar2;
        defpackage.orp orpVar3 = new defpackage.orp("DISCONNECTING", 2);
        c = orpVar3;
        defpackage.orp orpVar4 = new defpackage.orp("DISCONNECTED", 3);
        d = orpVar4;
        defpackage.orp orpVar5 = new defpackage.orp("UNKNOWN", 4);
        e = orpVar5;
        f = new defpackage.orp[]{orpVar, orpVar2, orpVar3, orpVar4, orpVar5};
    }

    public static defpackage.orp valueOf(java.lang.String str) {
        return (defpackage.orp) java.lang.Enum.valueOf(defpackage.orp.class, str);
    }

    public static defpackage.orp[] values() {
        return (defpackage.orp[]) f.clone();
    }
}
