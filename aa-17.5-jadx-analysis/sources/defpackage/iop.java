package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class iop {
    public static final iop a;
    public static final iop b;
    public static final iop c;
    public static final iop d;
    private static final /* synthetic */ iop[] e;

    static {
        iop iopVar = new iop("CREATED", 0);
        a = iopVar;
        iop iopVar2 = new iop("STARTED", 1);
        b = iopVar2;
        iop iopVar3 = new iop("RESUMED", 2);
        c = iopVar3;
        iop iopVar4 = new iop("DESTROYED", 3);
        d = iopVar4;
        e = new iop[]{iopVar, iopVar2, iopVar3, iopVar4};
    }

    public static iop valueOf(String str) {
        return (iop) Enum.valueOf(iop.class, str);
    }

    public static iop[] values() {
        return (iop[]) e.clone();
    }
}
