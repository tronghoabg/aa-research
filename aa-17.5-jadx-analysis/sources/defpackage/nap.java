package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nap {
    public static final nap a;
    public static final nap b;
    public static final nap c;
    private static final /* synthetic */ nap[] d;

    static {
        nap napVar = new nap("LOADING", 0);
        a = napVar;
        nap napVar2 = new nap("VALID", 1);
        b = napVar2;
        nap napVar3 = new nap("EMPTY", 2);
        c = napVar3;
        nap[] napVarArr = {napVar, napVar2, napVar3};
        d = napVarArr;
        affa.p(napVarArr);
    }

    public static nap valueOf(String str) {
        return (nap) Enum.valueOf(nap.class, str);
    }

    public static nap[] values() {
        return (nap[]) d.clone();
    }
}
