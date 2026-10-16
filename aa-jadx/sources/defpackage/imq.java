package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class imq {
    public static final defpackage.imq a;
    public static final defpackage.imq b;
    public static final defpackage.imq c;
    public static final defpackage.imq d;
    public static final defpackage.imq e;
    private static final /* synthetic */ defpackage.imq[] f;

    static {
        defpackage.imq imqVar = new defpackage.imq("DISCONNECTED", 0);
        a = imqVar;
        defpackage.imq imqVar2 = new defpackage.imq("CONNECTION_SKIPPED_FOR_TEST", 1);
        b = imqVar2;
        defpackage.imq imqVar3 = new defpackage.imq("CONNECTING", 2);
        c = imqVar3;
        defpackage.imq imqVar4 = new defpackage.imq("CONNECTED", 3);
        d = imqVar4;
        defpackage.imq imqVar5 = new defpackage.imq("PROJECTION_STARTED", 4);
        e = imqVar5;
        f = new defpackage.imq[]{imqVar, imqVar2, imqVar3, imqVar4, imqVar5};
    }

    public static defpackage.imq valueOf(java.lang.String str) {
        return (defpackage.imq) java.lang.Enum.valueOf(defpackage.imq.class, str);
    }

    public static defpackage.imq[] values() {
        return (defpackage.imq[]) f.clone();
    }
}
