package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class nli {
    public static final nli a;
    public static final nli b;
    public static final nli c;
    private static final /* synthetic */ nli[] d;

    static {
        nli nliVar = new nli("HEATING", 0);
        a = nliVar;
        nli nliVar2 = new nli("COOLING", 1);
        b = nliVar2;
        nli nliVar3 = new nli("OFF", 2);
        c = nliVar3;
        nli[] nliVarArr = {nliVar, nliVar2, nliVar3};
        d = nliVarArr;
        affa.p(nliVarArr);
    }

    public static nli valueOf(String str) {
        return (nli) Enum.valueOf(nli.class, str);
    }

    public static nli[] values() {
        return (nli[]) d.clone();
    }
}
