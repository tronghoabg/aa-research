package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v6 fxg[], still in use, count: 1, list:
  (r3v6 fxg[]) from 0x00e0: INVOKE (r3v6 fxg[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:225)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class fxg {
    FILLED(new defpackage.dnm(4), true, null, null, true, true),
    TONAL(new defpackage.dnm(5), true, null, null, false, true),
    OUTLINED(new defpackage.dnm(6), true, null, new defpackage.dnm(7), false, true),
    ICON(new defpackage.dnm(8), false, null, null, false, true),
    FAB(new defpackage.dnm(9), false, new defpackage.dnm(10), null, false, true),
    MAP(new defpackage.dnm(11), true, null, new defpackage.dnm(12), false, true),
    RADIO_ICON(new defpackage.dnm(13), true, null, null, false, false);

    public final defpackage.affg h;
    public final boolean i;
    public final defpackage.affg j;
    public final defpackage.affg k;
    public final boolean l;
    public final boolean m;

    static {
        defpackage.afga.p(fxgVarArr);
    }

    private fxg(defpackage.affg affgVar, boolean z, defpackage.affg affgVar2, defpackage.affg affgVar3, boolean z2, boolean z3) {
        super(str, i);
        this.h = affgVar;
        this.i = z;
        this.j = affgVar2;
        this.k = affgVar3;
        this.l = z2;
        this.m = z3;
    }

    public static defpackage.fxg valueOf(java.lang.String str) {
        return (defpackage.fxg) java.lang.Enum.valueOf(defpackage.fxg.class, str);
    }

    public static defpackage.fxg[] values() {
        return (defpackage.fxg[]) n.clone();
    }
}
