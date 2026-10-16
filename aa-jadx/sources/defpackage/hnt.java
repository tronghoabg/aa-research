package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v3 hnt[], still in use, count: 1, list:
  (r5v3 hnt[]) from 0x00a1: INVOKE (r5v3 hnt[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m), WRAPPED] (LINE:162)
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
public final class hnt {
    ExampleEmbeddedInsightId(1),
    EmbeddedScrollInsightId(2),
    ClientActionInsightId(3),
    WeatherInsightId(4),
    EmptyRenderInsightId(5),
    CardInsightId(7),
    InsightGridId(8),
    ServerSideCloseInsightId(9),
    RenderTokenInsightId(10),
    ClientSignalInsightId(11),
    LoadingInsightId(12);

    public static final /* synthetic */ defpackage.afef l;
    public final int m;

    static {
        l = defpackage.afga.p(hntVarArr);
    }

    private hnt(int i) {
        super(str, i);
        this.m = i;
    }

    public static defpackage.hnt valueOf(java.lang.String str) {
        return (defpackage.hnt) java.lang.Enum.valueOf(defpackage.hnt.class, str);
    }

    public static defpackage.hnt[] values() {
        return (defpackage.hnt[]) n.clone();
    }
}
