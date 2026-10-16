package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 hjv[], still in use, count: 1, list:
  (r4v3 hjv[]) from 0x002d: INVOKE (r4v3 hjv[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:46)
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
public final class hjv {
    COMPACT(0),
    WIDE(1100),
    EXTRA_WIDE(1500);

    public final int d;

    static {
        defpackage.afga.p(hjvVarArr);
    }

    private hjv(int i) {
        super(str, i);
        this.d = i;
    }

    public static defpackage.hjv valueOf(java.lang.String str) {
        return (defpackage.hjv) java.lang.Enum.valueOf(defpackage.hjv.class, str);
    }

    public static defpackage.hjv[] values() {
        return (defpackage.hjv[]) e.clone();
    }
}
