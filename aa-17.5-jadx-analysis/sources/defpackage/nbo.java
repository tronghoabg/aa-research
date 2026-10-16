package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class nbo {
    public static final nbo a;
    public static final nbo b;
    public static final nbo c;
    private static final /* synthetic */ nbo[] e;
    public final int d;

    static {
        nbo nboVar = new nbo("NONE", 0, 0);
        a = nboVar;
        nbo nboVar2 = new nbo("PREV", 1, -1);
        b = nboVar2;
        nbo nboVar3 = new nbo("NEXT", 2, 1);
        c = nboVar3;
        nbo[] nboVarArr = {nboVar, nboVar2, nboVar3};
        e = nboVarArr;
        affa.p(nboVarArr);
    }

    private nbo(String str, int i, int i2) {
        this.d = i2;
    }

    public static nbo valueOf(String str) {
        return (nbo) Enum.valueOf(nbo.class, str);
    }

    public static nbo[] values() {
        return (nbo[]) e.clone();
    }
}
