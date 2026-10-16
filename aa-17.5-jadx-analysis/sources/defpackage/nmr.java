package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nmr {
    public static final nmr a;
    public static final nmr b;
    public static final nmr c;
    public static final nmr d;
    public static final nmr e;
    private static final /* synthetic */ nmr[] f;

    static {
        nmr nmrVar = new nmr("NONE", 0);
        a = nmrVar;
        nmr nmrVar2 = new nmr("PRIMARY", 1);
        b = nmrVar2;
        nmr nmrVar3 = new nmr("LEFT", 2);
        c = nmrVar3;
        nmr nmrVar4 = new nmr("CENTER", 3);
        d = nmrVar4;
        nmr nmrVar5 = new nmr("RIGHT", 4);
        e = nmrVar5;
        nmr[] nmrVarArr = {nmrVar, nmrVar2, nmrVar3, nmrVar4, nmrVar5};
        f = nmrVarArr;
        affa.p(nmrVarArr);
    }

    public static nmr valueOf(String str) {
        return (nmr) Enum.valueOf(nmr.class, str);
    }

    public static nmr[] values() {
        return (nmr[]) f.clone();
    }
}
