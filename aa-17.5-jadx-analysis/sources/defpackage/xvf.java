package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class xvf {
    public static final xvf a;
    public static final xvf b;
    public static final xvf c;
    private static final /* synthetic */ xvf[] d;

    static {
        xvf xvfVar = new xvf("NEW", 0);
        a = xvfVar;
        xvf xvfVar2 = new xvf("ENQUEUED", 1);
        b = xvfVar2;
        xvf xvfVar3 = new xvf("EARLY_COMPLETED", 2);
        c = xvfVar3;
        d = new xvf[]{xvfVar, xvfVar2, xvfVar3};
    }

    public static xvf valueOf(String str) {
        return (xvf) Enum.valueOf(xvf.class, str);
    }

    public static xvf[] values() {
        return (xvf[]) d.clone();
    }
}
