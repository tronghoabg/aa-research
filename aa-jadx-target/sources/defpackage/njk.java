package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 njk[], still in use, count: 1, list:
  (r2v3 njk[]) from 0x002d: INVOKE (r2v3 njk[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:46)
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
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class njk {
    DASHBOARD(2131231133, 2131231134, 2131231132),
    LAUNCHER(2131231131, 2131231131, 2131231131);

    public final int c;
    public final int d;
    public final int e;

    static {
        defpackage.afga.p(njkVarArr);
    }

    private njk(int i, int i2, int i3) {
        super(str, i);
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public static defpackage.njk valueOf(java.lang.String str) {
        return (defpackage.njk) java.lang.Enum.valueOf(defpackage.njk.class, str);
    }

    public static defpackage.njk[] values() {
        return (defpackage.njk[]) f.clone();
    }
}
