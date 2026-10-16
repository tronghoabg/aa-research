package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v3 aits[], still in use, count: 1, list:
  (r12v3 aits[]) from 0x0067: INVOKE (r12v3 aits[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:104)
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
public final class aits {
    NANOSECONDS(java.util.concurrent.TimeUnit.NANOSECONDS),
    MICROSECONDS(java.util.concurrent.TimeUnit.MICROSECONDS),
    MILLISECONDS(java.util.concurrent.TimeUnit.MILLISECONDS),
    SECONDS(java.util.concurrent.TimeUnit.SECONDS),
    MINUTES(java.util.concurrent.TimeUnit.MINUTES),
    HOURS(java.util.concurrent.TimeUnit.HOURS),
    DAYS(java.util.concurrent.TimeUnit.DAYS);

    public final java.util.concurrent.TimeUnit h;

    static {
        defpackage.afga.p(aitsVarArr);
    }

    private aits(java.util.concurrent.TimeUnit timeUnit) {
        super(str, i);
        this.h = timeUnit;
    }

    public static defpackage.aits valueOf(java.lang.String str) {
        return (defpackage.aits) java.lang.Enum.valueOf(defpackage.aits.class, str);
    }

    public static defpackage.aits[] values() {
        return (defpackage.aits[]) i.clone();
    }
}
