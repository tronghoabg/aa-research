package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class mju {
    public static final defpackage.mju a;
    public static final defpackage.mju b;
    public static final defpackage.mju c;
    public static final defpackage.mju d;
    private static final /* synthetic */ defpackage.mju[] e;

    static {
        defpackage.mju mjuVar = new defpackage.mju("DAB", 0);
        a = mjuVar;
        defpackage.mju mjuVar2 = new defpackage.mju("FM", 1);
        b = mjuVar2;
        defpackage.mju mjuVar3 = new defpackage.mju("AM", 2);
        c = mjuVar3;
        defpackage.mju mjuVar4 = new defpackage.mju("OTHER", 3);
        d = mjuVar4;
        e = new defpackage.mju[]{mjuVar, mjuVar2, mjuVar3, mjuVar4};
    }

    public static defpackage.mju valueOf(java.lang.String str) {
        return (defpackage.mju) java.lang.Enum.valueOf(defpackage.mju.class, str);
    }

    public static defpackage.mju[] values() {
        return (defpackage.mju[]) e.clone();
    }
}
