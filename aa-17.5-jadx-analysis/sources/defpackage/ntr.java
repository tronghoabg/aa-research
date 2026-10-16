package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ntr {
    public static final ntr a;
    public static final ntr b;
    public static final ntr c;
    public static final ntr d;
    private static final /* synthetic */ ntr[] e;

    static {
        ntr ntrVar = new ntr("UNKNOWN", 0);
        a = ntrVar;
        ntr ntrVar2 = new ntr("AIRPLANE", 1);
        b = ntrVar2;
        ntr ntrVar3 = new ntr("CELLULAR", 2);
        c = ntrVar3;
        ntr ntrVar4 = new ntr("SATELLITE", 3);
        d = ntrVar4;
        e = new ntr[]{ntrVar, ntrVar2, ntrVar3, ntrVar4};
    }

    public static ntr valueOf(String str) {
        return (ntr) Enum.valueOf(ntr.class, str);
    }

    public static ntr[] values() {
        return (ntr[]) e.clone();
    }
}
