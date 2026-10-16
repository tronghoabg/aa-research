package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v3 ajja[], still in use, count: 1, list:
  (r13v3 ajja[]) from 0x0067: INVOKE (r13v3 ajja[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:104)
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
public final class ajja {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    HTTP_3("h3");

    public final java.lang.String h;

    static {
        defpackage.afga.p(ajjaVarArr);
    }

    private ajja(java.lang.String str) {
        super(str, i);
        this.h = str;
    }

    public static defpackage.ajja valueOf(java.lang.String str) {
        return (defpackage.ajja) java.lang.Enum.valueOf(defpackage.ajja.class, str);
    }

    public static defpackage.ajja[] values() {
        return (defpackage.ajja[]) i.clone();
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.h;
    }
}
