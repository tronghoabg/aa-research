package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 njl[], still in use, count: 1, list:
  (r2v3 njl[]) from 0x002d: INVOKE (r2v3 njl[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:46)
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
public final class njl {
    DASHBOARD(2131231986, 2131231987, 2131231985),
    LAUNCHER(2131233082, 2131233082, 2131233082);

    private final int d;
    private final int e;
    private final int f;

    static {
        defpackage.afga.p(njlVarArr);
    }

    private njl(int i, int i2, int i3) {
        super(str, i);
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public static defpackage.njl valueOf(java.lang.String str) {
        return (defpackage.njl) java.lang.Enum.valueOf(defpackage.njl.class, str);
    }

    public static defpackage.njl[] values() {
        return (defpackage.njl[]) c.clone();
    }

    public final int a(defpackage.ntb ntbVar) {
        ntbVar.getClass();
        if (ntbVar.E()) {
            return this.f;
        }
        boolean zJ = ntbVar.J();
        defpackage.mmi.c();
        return zJ != defpackage.mmi.h() ? this.e : this.d;
    }
}
