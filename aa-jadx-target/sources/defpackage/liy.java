package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class liy {
    public static final defpackage.liy a;
    public static final defpackage.liy b;
    public static final defpackage.liy c;
    private static final /* synthetic */ defpackage.liy[] d;

    static {
        defpackage.liy liyVar = new defpackage.liy("CAR_MOVING", 0);
        a = liyVar;
        defpackage.liy liyVar2 = new defpackage.liy("CAR_PARKED", 1);
        b = liyVar2;
        defpackage.liy liyVar3 = new defpackage.liy("UNKNOWN", 2);
        c = liyVar3;
        d = new defpackage.liy[]{liyVar, liyVar2, liyVar3};
    }

    public static defpackage.liy valueOf(java.lang.String str) {
        return (defpackage.liy) java.lang.Enum.valueOf(defpackage.liy.class, str);
    }

    public static defpackage.liy[] values() {
        return (defpackage.liy[]) d.clone();
    }
}
