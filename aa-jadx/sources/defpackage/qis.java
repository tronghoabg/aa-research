package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class qis {
    public static final defpackage.qis a;
    public static final defpackage.qis b;
    public static final defpackage.qis c;
    public static final defpackage.qis d;
    private static final /* synthetic */ defpackage.qis[] e;

    static {
        defpackage.qis qisVar = new defpackage.qis("CLOSED", 0);
        a = qisVar;
        defpackage.qis qisVar2 = new defpackage.qis("PENDING_OPEN", 1);
        b = qisVar2;
        defpackage.qis qisVar3 = new defpackage.qis("OPEN", 2);
        c = qisVar3;
        defpackage.qis qisVar4 = new defpackage.qis("PENDING_CLOSE", 3);
        d = qisVar4;
        e = new defpackage.qis[]{qisVar, qisVar2, qisVar3, qisVar4};
    }

    public static defpackage.qis valueOf(java.lang.String str) {
        return (defpackage.qis) java.lang.Enum.valueOf(defpackage.qis.class, str);
    }

    public static defpackage.qis[] values() {
        return (defpackage.qis[]) e.clone();
    }
}
