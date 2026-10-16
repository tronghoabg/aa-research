package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rso {
    public static final defpackage.rso a;
    public static final defpackage.rso b;
    public static final defpackage.rso c;
    private static final /* synthetic */ defpackage.rso[] d;

    static {
        defpackage.rso rsoVar = new defpackage.rso("GEARHEAD_PROJECTION", 0);
        a = rsoVar;
        defpackage.rso rsoVar2 = new defpackage.rso("GEARHEAD_CAR", 1);
        b = rsoVar2;
        defpackage.rso rsoVar3 = new defpackage.rso("GMSCORE_CAR", 2);
        c = rsoVar3;
        d = new defpackage.rso[]{rsoVar, rsoVar2, rsoVar3};
    }

    public static defpackage.rso valueOf(java.lang.String str) {
        return (defpackage.rso) java.lang.Enum.valueOf(defpackage.rso.class, str);
    }

    public static defpackage.rso[] values() {
        return (defpackage.rso[]) d.clone();
    }
}
