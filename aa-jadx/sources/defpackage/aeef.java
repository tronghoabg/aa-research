package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class aeef {
    public static final defpackage.aeef a;
    public static final defpackage.aeef b;
    public static final defpackage.aeef c;
    private static final /* synthetic */ defpackage.aeef[] d;

    static {
        defpackage.aeef aeefVar = new defpackage.aeef("BLOCKING", 0);
        a = aeefVar;
        defpackage.aeef aeefVar2 = new defpackage.aeef("FUTURE", 1);
        b = aeefVar2;
        defpackage.aeef aeefVar3 = new defpackage.aeef("ASYNC", 2);
        c = aeefVar3;
        d = new defpackage.aeef[]{aeefVar, aeefVar2, aeefVar3};
    }

    public static defpackage.aeef valueOf(java.lang.String str) {
        return (defpackage.aeef) java.lang.Enum.valueOf(defpackage.aeef.class, str);
    }

    public static defpackage.aeef[] values() {
        return (defpackage.aeef[]) d.clone();
    }
}
