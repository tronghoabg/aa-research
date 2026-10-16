package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class txs {
    public static final txs a;
    public static final txs b;
    public static final txs c;
    private static final /* synthetic */ txs[] d;

    static {
        txs txsVar = new txs("ENABLE_AT_STARTUP", 0);
        a = txsVar;
        txs txsVar2 = new txs("ENABLE_AFTER_STARTUP", 1);
        b = txsVar2;
        txs txsVar3 = new txs("ENABLE_WHEN_INTENTED", 2);
        c = txsVar3;
        d = new txs[]{txsVar, txsVar2, txsVar3};
    }

    public static txs valueOf(String str) {
        return (txs) Enum.valueOf(txs.class, str);
    }

    public static txs[] values() {
        return (txs[]) d.clone();
    }
}
