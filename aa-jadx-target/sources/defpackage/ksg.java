package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 ksg[], still in use, count: 1, list:
  (r2v6 ksg[]) from 0x0052: INVOKE (r2v6 ksg[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:83)
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
public final class ksg implements defpackage.ksd {
    DEFAULT(2132150536, new defpackage.ksb(defpackage.acbc.b(3768063), defpackage.acbc.b(2591686), defpackage.acbc.b(1935675), defpackage.acbc.b(7829367), defpackage.acbc.b(7698550))),
    GREEN(2132150538, defpackage.kru.a(5227083));

    public final defpackage.ksb c;
    private final int e;

    static {
        defpackage.afga.p(ksgVarArr);
    }

    private ksg(int i, defpackage.ksb ksbVar) {
        super(str, i);
        this.e = i;
        this.c = ksbVar;
    }

    public static defpackage.ksg valueOf(java.lang.String str) {
        return (defpackage.ksg) java.lang.Enum.valueOf(defpackage.ksg.class, str);
    }

    public static defpackage.ksg[] values() {
        return (defpackage.ksg[]) d.clone();
    }

    @Override // defpackage.ksd
    public final android.content.Context a(android.content.Context context) {
        android.content.Context baseContext;
        defpackage.kse kseVar = context instanceof defpackage.kse ? (defpackage.kse) context : null;
        if (kseVar != null && (baseContext = kseVar.getBaseContext()) != null) {
            context = baseContext;
        }
        return new defpackage.kse(context, this.e);
    }

    @Override // defpackage.ksd
    public final defpackage.ksb b() {
        return this.c;
    }

    @Override // defpackage.ksd
    public final void d(android.content.Context context) {
        context.getTheme().applyStyle(this.e, true);
    }

    @Override // defpackage.ksd
    public final void c() {
    }
}
