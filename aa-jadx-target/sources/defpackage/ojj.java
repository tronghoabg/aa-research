package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v7 ojj[], still in use, count: 1, list:
  (r6v7 ojj[]) from 0x009e: INVOKE (r6v7 ojj[]) STATIC call: afga.p(java.lang.Enum[]):afef A[MD:(java.lang.Enum[]):afef (m)] (LINE:159)
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
public final class ojj {
    UNKNOWN(0, 0, null, null, null, null),
    HOTSPOT(2132085393, 2131231827, defpackage.zbd.vy, defpackage.zbd.vJ, defpackage.zbd.vE, defpackage.zbd.vu),
    WIRELESS_CHARGING(2132085395, 2131231701, defpackage.zbd.vz, defpackage.zbd.vK, defpackage.zbd.vF, null),
    FLASHLIGHT(2132085392, 2131231669, defpackage.zbd.vx, defpackage.zbd.vI, defpackage.zbd.vD, defpackage.zbd.vt),
    CAMERA(2132085390, 2131231748, defpackage.zbd.vw, defpackage.zbd.vH, defpackage.zbd.vC, defpackage.zbd.vs),
    DISPLAY(2132085391, 2131231807, defpackage.zbd.vv, defpackage.zbd.vG, defpackage.zbd.vB, defpackage.zbd.vr);

    public final int g;
    public final int h;
    public final defpackage.zbd i;
    public final defpackage.zbd j;
    public final defpackage.zbd k;
    public final defpackage.zbd l;

    static {
        defpackage.afga.p(ojjVarArr);
    }

    private ojj(int i, int i2, defpackage.zbd zbdVar, defpackage.zbd zbdVar2, defpackage.zbd zbdVar3, defpackage.zbd zbdVar4) {
        super(str, i);
        this.g = i;
        this.h = i2;
        this.i = zbdVar;
        this.j = zbdVar2;
        this.k = zbdVar3;
        this.l = zbdVar4;
    }

    public static defpackage.ojj valueOf(java.lang.String str) {
        return (defpackage.ojj) java.lang.Enum.valueOf(defpackage.ojj.class, str);
    }

    public static defpackage.ojj[] values() {
        return (defpackage.ojj[]) m.clone();
    }
}
