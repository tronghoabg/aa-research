package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 tlb[], still in use, count: 1, list:
  (r2v3 tlb[]) from 0x0021: INVOKE (r2v3 tlb[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:34)
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
/* JADX INFO: loaded from: classes3.dex */
public final class tlb {
    QUARTER(0.25f),
    ONE_EIGHTH(0.125f);

    public final float c;

    static {
        defpackage.afga.p(tlbVarArr);
    }

    private tlb(float f) {
        super(str, i);
        this.c = f;
    }

    public static defpackage.tlb valueOf(java.lang.String str) {
        return (defpackage.tlb) java.lang.Enum.valueOf(defpackage.tlb.class, str);
    }

    public static defpackage.tlb[] values() {
        return (defpackage.tlb[]) d.clone();
    }
}
