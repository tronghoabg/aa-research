package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ucb {
    public static final defpackage.ucb a;
    public static final defpackage.ucb b;
    public static final defpackage.ucb c;
    public static final defpackage.ucb d;
    private static final /* synthetic */ defpackage.ucb[] e;

    static {
        defpackage.ucb ucbVar = new defpackage.ucb("NONE", 0);
        a = ucbVar;
        defpackage.ucb ucbVar2 = new defpackage.ucb("IN", 1);
        b = ucbVar2;
        defpackage.ucb ucbVar3 = new defpackage.ucb("OUT", 2);
        c = ucbVar3;
        defpackage.ucb ucbVar4 = new defpackage.ucb("STEADY_STATE", 3);
        d = ucbVar4;
        e = new defpackage.ucb[]{ucbVar, ucbVar2, ucbVar3, ucbVar4};
    }

    public static defpackage.ucb valueOf(java.lang.String str) {
        return (defpackage.ucb) java.lang.Enum.valueOf(defpackage.ucb.class, str);
    }

    public static defpackage.ucb[] values() {
        return (defpackage.ucb[]) e.clone();
    }
}
