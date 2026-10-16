package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class xsf {
    public static final xsf a;
    public static final xsf b;
    public static final xsf c;
    private static final /* synthetic */ xsf[] d;

    static {
        xsf xsfVar = new xsf("WAIT", 0);
        a = xsfVar;
        xsf xsfVar2 = new xsf("FINAL_MORPH", 1);
        b = xsfVar2;
        xsf xsfVar3 = new xsf("REVEAL", 2);
        c = xsfVar3;
        xsf[] xsfVarArr = {xsfVar, xsfVar2, xsfVar3};
        d = xsfVarArr;
        affa.p(xsfVarArr);
    }

    public static xsf valueOf(String str) {
        return (xsf) Enum.valueOf(xsf.class, str);
    }

    public static xsf[] values() {
        return (xsf[]) d.clone();
    }
}
