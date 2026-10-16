package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hqc {
    public static final hqc a;
    public static final hqc b;
    public static final hqc c;
    public static final hqc d;
    public static final /* synthetic */ afdf e;
    private static final /* synthetic */ hqc[] g;
    public final int f;

    static {
        hqc hqcVar = new hqc("SMALL", 0, 2);
        a = hqcVar;
        hqc hqcVar2 = new hqc("HALF", 1, 3);
        b = hqcVar2;
        hqc hqcVar3 = new hqc("MEDIUM", 2, 4);
        c = hqcVar3;
        hqc hqcVar4 = new hqc("LARGE", 3, 6);
        d = hqcVar4;
        hqc[] hqcVarArr = {hqcVar, hqcVar2, hqcVar3, hqcVar4};
        g = hqcVarArr;
        e = affa.p(hqcVarArr);
    }

    private hqc(String str, int i, int i2) {
        this.f = i2;
    }

    public static hqc valueOf(String str) {
        return (hqc) Enum.valueOf(hqc.class, str);
    }

    public static hqc[] values() {
        return (hqc[]) g.clone();
    }
}
