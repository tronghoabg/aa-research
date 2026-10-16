package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
final class nka {
    public static final nka a;
    public static final nka b;
    private static final /* synthetic */ nka[] c;

    static {
        nka nkaVar = new nka("Hotseat", 0);
        a = nkaVar;
        nka nkaVar2 = new nka("RailWidget", 1);
        b = nkaVar2;
        nka[] nkaVarArr = {nkaVar, nkaVar2};
        c = nkaVarArr;
        affa.p(nkaVarArr);
    }

    public static nka valueOf(String str) {
        return (nka) Enum.valueOf(nka.class, str);
    }

    public static nka[] values() {
        return (nka[]) c.clone();
    }
}
