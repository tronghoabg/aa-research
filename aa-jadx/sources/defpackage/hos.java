package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 hos[], still in use, count: 1, list:
  (r1v1 hos[]) from 0x000f: INVOKE (r1v1 hos[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m), WRAPPED] (LINE:16)
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
public final class hos {
    CONTAINS_PII;

    public static final /* synthetic */ defpackage.afef b;

    static {
        b = defpackage.afga.p(hosVarArr);
    }

    private hos() {
        super("CONTAINS_PII", 0);
    }

    public static defpackage.hos valueOf(java.lang.String str) {
        return (defpackage.hos) java.lang.Enum.valueOf(defpackage.hos.class, str);
    }

    public static defpackage.hos[] values() {
        return (defpackage.hos[]) c.clone();
    }
}
