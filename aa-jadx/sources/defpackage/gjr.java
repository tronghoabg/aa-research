package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v4 gjr[], still in use, count: 1, list:
  (r8v4 gjr[]) from 0x00c0: INVOKE (r8v4 gjr[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:193)
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
public final class gjr {
    P0(4.0f, com.google.android.projection.gearhead.R.dimen.padding_p0),
    P1(8.0f, com.google.android.projection.gearhead.R.dimen.padding_p1),
    P2(12.0f, com.google.android.projection.gearhead.R.dimen.padding_p2),
    P3(16.0f, com.google.android.projection.gearhead.R.dimen.padding_p3),
    P4(24.0f, com.google.android.projection.gearhead.R.dimen.padding_p4),
    P5(32.0f, com.google.android.projection.gearhead.R.dimen.padding_p5),
    P6(48.0f, com.google.android.projection.gearhead.R.dimen.padding_p6),
    P7(64.0f, com.google.android.projection.gearhead.R.dimen.padding_p7),
    P8(72.0f, com.google.android.projection.gearhead.R.dimen.padding_p8),
    P9(96.0f, com.google.android.projection.gearhead.R.dimen.padding_p9);

    public final float k;
    private final int m;

    static {
        defpackage.afga.p(gjrVarArr);
    }

    private gjr(float f, int i) {
        super(str, i);
        this.k = f;
        this.m = i;
    }

    public static defpackage.gjr valueOf(java.lang.String str) {
        return (defpackage.gjr) java.lang.Enum.valueOf(defpackage.gjr.class, str);
    }

    public static defpackage.gjr[] values() {
        return (defpackage.gjr[]) l.clone();
    }

    public final int a(android.content.Context context) {
        context.getClass();
        return (int) context.getResources().getDimension(this.m);
    }
}
