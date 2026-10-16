package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 kwh[], still in use, count: 1, list:
  (r8v3 kwh[]) from 0x004b: INVOKE (r8v3 kwh[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:76)
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
public final class kwh {
    Icon(defpackage.kwe.b),
    Outlined(defpackage.kwe.a),
    Tonal(defpackage.kwe.c),
    Filled(defpackage.kwe.d),
    Colored(defpackage.kwg.a);

    public final defpackage.kwd f;

    static {
        defpackage.afga.p(kwhVarArr);
    }

    private kwh(defpackage.kwd kwdVar) {
        super(str, i);
        this.f = kwdVar;
    }

    public static defpackage.kwh valueOf(java.lang.String str) {
        return (defpackage.kwh) java.lang.Enum.valueOf(defpackage.kwh.class, str);
    }

    public static defpackage.kwh[] values() {
        return (defpackage.kwh[]) g.clone();
    }
}
