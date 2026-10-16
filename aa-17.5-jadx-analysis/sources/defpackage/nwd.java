package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class nwd {
    public static final nwd a;
    public static final nwd b;
    public static final nwd c;
    private static final /* synthetic */ nwd[] d;

    static {
        nwd nwdVar = new nwd("HIDDEN_INITIAL", 0);
        a = nwdVar;
        nwd nwdVar2 = new nwd("VISIBLE", 1);
        b = nwdVar2;
        nwd nwdVar3 = new nwd("HIDDEN_EXIT", 2);
        c = nwdVar3;
        nwd[] nwdVarArr = {nwdVar, nwdVar2, nwdVar3};
        d = nwdVarArr;
        affa.p(nwdVarArr);
    }

    public static nwd valueOf(String str) {
        return (nwd) Enum.valueOf(nwd.class, str);
    }

    public static nwd[] values() {
        return (nwd[]) d.clone();
    }
}
