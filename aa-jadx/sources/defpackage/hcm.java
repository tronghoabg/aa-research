package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v2 hcm[], still in use, count: 1, list:
  (r13v2 hcm[]) from 0x0059: INVOKE (r13v2 hcm[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:90)
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
public final class hcm {
    ROW(3),
    GRID_SMALL(3),
    GRID_MEDIUM(3),
    GRID_LARGE(3),
    GRID_EXTRA_LARGE(1),
    CONDENSED_ITEM(3),
    BANNER(3);

    public final int h;

    static {
        defpackage.afga.p(hcmVarArr);
    }

    private hcm(int i2) {
        super(str, i);
        this.h = i2;
    }

    public static defpackage.hcm valueOf(java.lang.String str) {
        return (defpackage.hcm) java.lang.Enum.valueOf(defpackage.hcm.class, str);
    }

    public static defpackage.hcm[] values() {
        return (defpackage.hcm[]) i.clone();
    }

    public final float a() {
        return ordinal() != 5 ? com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED : defpackage.gjr.P1.k;
    }

    public final float b() {
        return ordinal() != 5 ? com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED : defpackage.gjr.P1.k;
    }
}
