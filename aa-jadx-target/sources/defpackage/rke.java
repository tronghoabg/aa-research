package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rke {
    public static final defpackage.rke a;
    public static final defpackage.rke b;
    public static final defpackage.rke c;
    public static final defpackage.rke d;
    private static final /* synthetic */ defpackage.rke[] e;

    static {
        defpackage.rke rkeVar = new defpackage.rke("MAIN", 0);
        a = rkeVar;
        defpackage.rke rkeVar2 = new defpackage.rke("CLUSTER", 1);
        b = rkeVar2;
        defpackage.rke rkeVar3 = new defpackage.rke("AUXILIARY", 2);
        c = rkeVar3;
        defpackage.rke rkeVar4 = new defpackage.rke("UNKNOWN", 3);
        d = rkeVar4;
        e = new defpackage.rke[]{rkeVar, rkeVar2, rkeVar3, rkeVar4};
    }

    public static defpackage.rke a(int i) {
        return i >= values().length ? d : values()[i];
    }

    public static defpackage.rke valueOf(java.lang.String str) {
        return (defpackage.rke) java.lang.Enum.valueOf(defpackage.rke.class, str);
    }

    public static defpackage.rke[] values() {
        return (defpackage.rke[]) e.clone();
    }
}
