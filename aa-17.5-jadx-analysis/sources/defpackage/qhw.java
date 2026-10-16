package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
final class qhw {
    public static final qhw a;
    public static final qhw b;
    public static final qhw c;
    public static final qhw d;
    private static final /* synthetic */ qhw[] e;

    static {
        qhw qhwVar = new qhw("CLOSED", 0);
        a = qhwVar;
        qhw qhwVar2 = new qhw("PENDING_OPEN", 1);
        b = qhwVar2;
        qhw qhwVar3 = new qhw("OPEN", 2);
        c = qhwVar3;
        qhw qhwVar4 = new qhw("PENDING_CLOSE", 3);
        d = qhwVar4;
        e = new qhw[]{qhwVar, qhwVar2, qhwVar3, qhwVar4};
    }

    public static qhw valueOf(String str) {
        return (qhw) Enum.valueOf(qhw.class, str);
    }

    public static qhw[] values() {
        return (qhw[]) e.clone();
    }
}
