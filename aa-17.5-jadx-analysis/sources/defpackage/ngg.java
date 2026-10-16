package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ngg {
    public static final ngg a;
    public static final ngg b;
    private static final /* synthetic */ ngg[] c;

    static {
        ngg nggVar = new ngg("DRIVER", 0);
        a = nggVar;
        ngg nggVar2 = new ngg("PASSENGER", 1);
        b = nggVar2;
        ngg[] nggVarArr = {nggVar, nggVar2};
        c = nggVarArr;
        affa.p(nggVarArr);
    }

    public static ngg valueOf(String str) {
        return (ngg) Enum.valueOf(ngg.class, str);
    }

    public static ngg[] values() {
        return (ngg[]) c.clone();
    }
}
