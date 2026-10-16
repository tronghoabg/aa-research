package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v3 ksk[], still in use, count: 1, list:
  (r10v3 ksk[]) from 0x0058: INVOKE (r10v3 ksk[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:89)
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
public final class ksk {
    L0(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED),
    L1(1.0f),
    L2(3.0f),
    L3(6.0f),
    L4(8.0f),
    L5(12.0f);

    public final float g;

    static {
        defpackage.afga.p(kskVarArr);
    }

    private ksk(float f) {
        super(str, i);
        this.g = f;
    }

    public static defpackage.ksk valueOf(java.lang.String str) {
        return (defpackage.ksk) java.lang.Enum.valueOf(defpackage.ksk.class, str);
    }

    public static defpackage.ksk[] values() {
        return (defpackage.ksk[]) h.clone();
    }
}
