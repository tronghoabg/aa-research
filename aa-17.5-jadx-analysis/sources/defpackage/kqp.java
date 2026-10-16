package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
final class kqp {
    public static final kqp a;
    public static final kqp b;
    public static final kqp c;
    public static final kqp d;
    public static final kqp e;
    public static final kqp f;
    private static final /* synthetic */ kqp[] g;

    static {
        kqp kqpVar = new kqp("NONE", 0);
        a = kqpVar;
        kqp kqpVar2 = new kqp("MTP", 1);
        b = kqpVar2;
        kqp kqpVar3 = new kqp("PTP", 2);
        c = kqpVar3;
        kqp kqpVar4 = new kqp("RNDIS", 3);
        d = kqpVar4;
        kqp kqpVar5 = new kqp("MIDI", 4);
        e = kqpVar5;
        kqp kqpVar6 = new kqp("NCM", 5);
        f = kqpVar6;
        g = new kqp[]{kqpVar, kqpVar2, kqpVar3, kqpVar4, kqpVar5, kqpVar6};
    }

    public static kqp valueOf(String str) {
        return (kqp) Enum.valueOf(kqp.class, str);
    }

    public static kqp[] values() {
        return (kqp[]) g.clone();
    }
}
