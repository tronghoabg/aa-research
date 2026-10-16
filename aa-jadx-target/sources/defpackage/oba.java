package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v5 oba[], still in use, count: 1, list:
  (r3v5 oba[]) from 0x0044: INVOKE (r3v5 oba[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:69)
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
public final class oba {
    Exit(2131231663, new defpackage.nyn(5)),
    Smaller(2131231681, new defpackage.nyn(6)),
    Larger(2131233717, new defpackage.nyn(7));

    public final int d;
    public final defpackage.afer e;

    static {
        defpackage.afga.p(obaVarArr);
    }

    private oba(int i, defpackage.afer aferVar) {
        super(str, i);
        this.d = i;
        this.e = aferVar;
    }

    public static defpackage.oba valueOf(java.lang.String str) {
        return (defpackage.oba) java.lang.Enum.valueOf(defpackage.oba.class, str);
    }

    public static defpackage.oba[] values() {
        return (defpackage.oba[]) f.clone();
    }
}
