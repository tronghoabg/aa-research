package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class fwf {
    public static final fwf a;
    public static final fwf b;
    public static final fwf c;
    public static final fwf d;
    private static final /* synthetic */ fwf[] e;

    static {
        fwf fwfVar = new fwf("EXTRA_SMALL", 0);
        a = fwfVar;
        fwf fwfVar2 = new fwf("SMALL", 1);
        b = fwfVar2;
        fwf fwfVar3 = new fwf("MEDIUM", 2);
        c = fwfVar3;
        fwf fwfVar4 = new fwf("LARGE", 3);
        d = fwfVar4;
        fwf[] fwfVarArr = {fwfVar, fwfVar2, fwfVar3, fwfVar4};
        e = fwfVarArr;
        affa.p(fwfVarArr);
    }

    public static fwf valueOf(String str) {
        return (fwf) Enum.valueOf(fwf.class, str);
    }

    public static fwf[] values() {
        return (fwf[]) e.clone();
    }
}
