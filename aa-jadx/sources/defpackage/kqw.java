package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class kqw {
    public static final defpackage.kqw a;
    public static final defpackage.kqw b;
    public static final defpackage.kqw c;
    public static final defpackage.kqw d;
    public static final defpackage.kqw e;
    public static final defpackage.kqw f;
    private static final /* synthetic */ defpackage.kqw[] g;

    static {
        defpackage.kqw kqwVar = new defpackage.kqw("NONE", 0);
        a = kqwVar;
        defpackage.kqw kqwVar2 = new defpackage.kqw("MTP", 1);
        b = kqwVar2;
        defpackage.kqw kqwVar3 = new defpackage.kqw("PTP", 2);
        c = kqwVar3;
        defpackage.kqw kqwVar4 = new defpackage.kqw("RNDIS", 3);
        d = kqwVar4;
        defpackage.kqw kqwVar5 = new defpackage.kqw("MIDI", 4);
        e = kqwVar5;
        defpackage.kqw kqwVar6 = new defpackage.kqw("NCM", 5);
        f = kqwVar6;
        g = new defpackage.kqw[]{kqwVar, kqwVar2, kqwVar3, kqwVar4, kqwVar5, kqwVar6};
    }

    public static defpackage.kqw valueOf(java.lang.String str) {
        return (defpackage.kqw) java.lang.Enum.valueOf(defpackage.kqw.class, str);
    }

    public static defpackage.kqw[] values() {
        return (defpackage.kqw[]) g.clone();
    }
}
