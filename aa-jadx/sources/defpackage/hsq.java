package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hsq {
    public static final defpackage.hsq a;
    public static final defpackage.hsq b;
    public static final defpackage.hsq c;
    public static final defpackage.hsq d;
    private static final /* synthetic */ defpackage.hsq[] e;

    static {
        defpackage.hsq hsqVar = new defpackage.hsq("IMMEDIATE", 0);
        a = hsqVar;
        defpackage.hsq hsqVar2 = new defpackage.hsq("HIGH", 1);
        b = hsqVar2;
        defpackage.hsq hsqVar3 = new defpackage.hsq("NORMAL", 2);
        c = hsqVar3;
        defpackage.hsq hsqVar4 = new defpackage.hsq("LOW", 3);
        d = hsqVar4;
        e = new defpackage.hsq[]{hsqVar, hsqVar2, hsqVar3, hsqVar4};
    }

    public static defpackage.hsq valueOf(java.lang.String str) {
        return (defpackage.hsq) java.lang.Enum.valueOf(defpackage.hsq.class, str);
    }

    public static defpackage.hsq[] values() {
        return (defpackage.hsq[]) e.clone();
    }
}
