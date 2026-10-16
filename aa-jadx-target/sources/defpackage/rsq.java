package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rsq {
    public static final defpackage.rsq a;
    public static final defpackage.rsq b;
    public static final defpackage.rsq c;
    private static final /* synthetic */ defpackage.rsq[] d;

    static {
        defpackage.rsq rsqVar = new defpackage.rsq("UNKNOWN", 0);
        a = rsqVar;
        defpackage.rsq rsqVar2 = new defpackage.rsq("USB", 1);
        b = rsqVar2;
        defpackage.rsq rsqVar3 = new defpackage.rsq("WIFI", 2);
        c = rsqVar3;
        d = new defpackage.rsq[]{rsqVar, rsqVar2, rsqVar3};
    }

    public static defpackage.rsq valueOf(java.lang.String str) {
        return (defpackage.rsq) java.lang.Enum.valueOf(defpackage.rsq.class, str);
    }

    public static defpackage.rsq[] values() {
        return (defpackage.rsq[]) d.clone();
    }
}
