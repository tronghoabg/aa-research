package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v2 dke[], still in use, count: 1, list:
  (r7v2 dke[]) from 0x0035: INVOKE (r7v2 dke[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:54)
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
public final class dke {
    StartInput(true),
    StopInput(false),
    ShowKeyboard(true),
    HideKeyboard(false);

    public final boolean e;

    static {
        defpackage.afga.p(dkeVarArr);
    }

    private dke(boolean z) {
        super(str, i);
        this.e = z;
    }

    public static defpackage.dke valueOf(java.lang.String str) {
        return (defpackage.dke) java.lang.Enum.valueOf(defpackage.dke.class, str);
    }

    public static defpackage.dke[] values() {
        return (defpackage.dke[]) f.clone();
    }
}
