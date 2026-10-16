package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 msk[], still in use, count: 1, list:
  (r1v1 msk[]) from 0x000f: INVOKE (r1v1 msk[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:16)
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
public final class msk {
    CORNER_RADIUS;

    public final float b;

    static {
        defpackage.afga.p(mskVarArr);
    }

    private msk() {
        super("CORNER_RADIUS", 0);
        this.b = 32.0f;
    }

    public static defpackage.msk valueOf(java.lang.String str) {
        return (defpackage.msk) java.lang.Enum.valueOf(defpackage.msk.class, str);
    }

    public static defpackage.msk[] values() {
        return (defpackage.msk[]) c.clone();
    }
}
