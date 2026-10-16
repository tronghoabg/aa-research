package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v5 jjp[], still in use, count: 1, list:
  (r4v5 jjp[]) from 0x0047: INVOKE (r4v5 jjp[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m), WRAPPED] (LINE:72)
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
final class jjp {
    TOP_LEFT("TL", true, true),
    TOP_RIGHT("TR", false, true),
    BOTTOM_LEFT("BL", true, false),
    BOTTOM_RIGHT("BR", false, false);

    public static final /* synthetic */ defpackage.afef e;
    public final java.lang.String f;
    public final boolean g;
    public final boolean h;

    static {
        e = defpackage.afga.p(jjpVarArr);
    }

    private jjp(java.lang.String str, boolean z, boolean z2) {
        super(str, i);
        this.f = str;
        this.g = z;
        this.h = z2;
    }

    public static defpackage.jjp valueOf(java.lang.String str) {
        return (defpackage.jjp) java.lang.Enum.valueOf(defpackage.jjp.class, str);
    }

    public static defpackage.jjp[] values() {
        return (defpackage.jjp[]) i.clone();
    }
}
