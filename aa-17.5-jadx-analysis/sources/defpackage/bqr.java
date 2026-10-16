package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class bqr {
    public static final bqr a;
    public static final bqr b;
    public static final bqr c;
    private static final /* synthetic */ bqr[] d;

    static {
        bqr bqrVar = new bqr("StartToEnd", 0);
        a = bqrVar;
        bqr bqrVar2 = new bqr("EndToStart", 1);
        b = bqrVar2;
        bqr bqrVar3 = new bqr("Settled", 2);
        c = bqrVar3;
        bqr[] bqrVarArr = {bqrVar, bqrVar2, bqrVar3};
        d = bqrVarArr;
        affa.p(bqrVarArr);
    }

    public static bqr valueOf(String str) {
        return (bqr) Enum.valueOf(bqr.class, str);
    }

    public static bqr[] values() {
        return (bqr[]) d.clone();
    }
}
