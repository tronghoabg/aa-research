package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class npt {
    public static final npt a;
    public static final npt b;
    private static final /* synthetic */ npt[] d;
    public final int c;

    static {
        npt nptVar = new npt("CELSIUS", 0, 48);
        a = nptVar;
        npt nptVar2 = new npt("FAHRENHEIT", 1, 49);
        b = nptVar2;
        npt[] nptVarArr = {nptVar, nptVar2};
        d = nptVarArr;
        affa.p(nptVarArr);
    }

    private npt(String str, int i, int i2) {
        this.c = i2;
    }

    public static npt valueOf(String str) {
        return (npt) Enum.valueOf(npt.class, str);
    }

    public static npt[] values() {
        return (npt[]) d.clone();
    }
}
