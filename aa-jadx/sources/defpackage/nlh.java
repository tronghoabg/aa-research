package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v6 nlh[], still in use, count: 1, list:
  (r6v6 nlh[]) from 0x0086: INVOKE (r6v6 nlh[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:135)
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
public final class nlh {
    AC_ON(new defpackage.ncv(7), true, true),
    AC_OFF(new defpackage.ncv(8), false, true),
    SYNC(new defpackage.ncv(9), true, false),
    AUTO(new defpackage.ncv(10), true, false),
    CONTROL_OFF_DISABLED(new defpackage.ncv(11), false, false),
    CONTROL_OFF_ENABLED(new defpackage.ncv(12), true, false);

    public final defpackage.affg g;
    public final boolean h;
    public final boolean i;

    static {
        defpackage.afga.p(nlhVarArr);
    }

    private nlh(defpackage.affg affgVar, boolean z, boolean z2) {
        super(str, i);
        this.g = affgVar;
        this.h = z;
        this.i = z2;
    }

    public static defpackage.nlh valueOf(java.lang.String str) {
        return (defpackage.nlh) java.lang.Enum.valueOf(defpackage.nlh.class, str);
    }

    public static defpackage.nlh[] values() {
        return (defpackage.nlh[]) j.clone();
    }
}
