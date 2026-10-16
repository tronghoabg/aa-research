package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 hju[], still in use, count: 1, list:
  (r4v3 hju[]) from 0x002d: INVOKE (r4v3 hju[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:46)
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
public final class hju {
    COMPACT(0),
    TALL(700),
    EXTRA_TALL(1200);

    public final int d;

    static {
        defpackage.afga.p(hjuVarArr);
    }

    private hju(int i) {
        super(str, i);
        this.d = i;
    }

    public static defpackage.hju valueOf(java.lang.String str) {
        return (defpackage.hju) java.lang.Enum.valueOf(defpackage.hju.class, str);
    }

    public static defpackage.hju[] values() {
        return (defpackage.hju[]) e.clone();
    }
}
