package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 oaz[], still in use, count: 1, list:
  (r3v2 oaz[]) from 0x0021: INVOKE (r3v2 oaz[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:34)
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
public final class oaz {
    Vertical(36.0f, 56.0f),
    Horizontal(56.0f, 36.0f);

    public final float c;
    public final float d;

    static {
        defpackage.afga.p(oazVarArr);
    }

    private oaz(float f, float f2) {
        super(str, i);
        this.c = f;
        this.d = f2;
    }

    public static defpackage.oaz valueOf(java.lang.String str) {
        return (defpackage.oaz) java.lang.Enum.valueOf(defpackage.oaz.class, str);
    }

    public static defpackage.oaz[] values() {
        return (defpackage.oaz[]) e.clone();
    }
}
