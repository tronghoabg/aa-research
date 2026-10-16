package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 nqm[], still in use, count: 1, list:
  (r2v3 nqm[]) from 0x0021: INVOKE (r2v3 nqm[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:34)
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
public final class nqm {
    CELSIUS(48),
    FAHRENHEIT(49);

    public final int c;

    static {
        defpackage.afga.p(nqmVarArr);
    }

    private nqm(int i) {
        super(str, i);
        this.c = i;
    }

    public static defpackage.nqm valueOf(java.lang.String str) {
        return (defpackage.nqm) java.lang.Enum.valueOf(defpackage.nqm.class, str);
    }

    public static defpackage.nqm[] values() {
        return (defpackage.nqm[]) d.clone();
    }
}
