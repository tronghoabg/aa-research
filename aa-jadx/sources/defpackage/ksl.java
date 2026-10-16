package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v3 ksl[], still in use, count: 1, list:
  (r5v3 ksl[]) from 0x00b4: INVOKE (r5v3 ksl[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:181)
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
/* JADX INFO: loaded from: classes.dex */
public final class ksl {
    P(new defpackage.krx(6)),
    S(new defpackage.krx(7)),
    T(new defpackage.krx(8)),
    N(new defpackage.krx(9)),
    NV(new defpackage.krx(10)),
    R(new defpackage.krx(11)),
    G(new defpackage.krx(12)),
    B(new defpackage.krx(13)),
    Y(new defpackage.krx(14));

    public final defpackage.affc j;

    static {
        defpackage.afga.p(kslVarArr);
    }

    private ksl(defpackage.affc affcVar) {
        super(str, i);
        this.j = affcVar;
    }

    public static defpackage.ksl valueOf(java.lang.String str) {
        return (defpackage.ksl) java.lang.Enum.valueOf(defpackage.ksl.class, str);
    }

    public static defpackage.ksl[] values() {
        return (defpackage.ksl[]) k.clone();
    }

    public final java.lang.String a() {
        java.lang.String lowerCase = name().toLowerCase(java.util.Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }
}
