package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class nua {
    public static final nua a;
    public static final nua b;
    public static final nua c;
    private static final /* synthetic */ nua[] d;

    static {
        nua nuaVar = new nua("HIDDEN", 0);
        a = nuaVar;
        nua nuaVar2 = new nua("RELATIVE", 1);
        b = nuaVar2;
        nua nuaVar3 = new nua("CHRONOMETER", 2);
        c = nuaVar3;
        d = new nua[]{nuaVar, nuaVar2, nuaVar3};
    }

    public static nua valueOf(String str) {
        return (nua) Enum.valueOf(nua.class, str);
    }

    public static nua[] values() {
        return (nua[]) d.clone();
    }
}
