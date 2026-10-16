package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jke {
    public static final defpackage.jke a;
    public static final defpackage.jke b;
    public static final defpackage.jke c;
    public static final defpackage.jke d;
    private static final /* synthetic */ defpackage.jke[] i;
    public final j$.time.Duration e;
    public final defpackage.zbd f;
    public final j$.time.Duration g;
    public final j$.time.Duration h;

    static {
        defpackage.jke jkeVar = new defpackage.jke("RESIZE", 0, defpackage.ysr.cE(5), defpackage.zbd.Lz, defpackage.ysr.cE(1), null, 8);
        a = jkeVar;
        j$.time.Duration duration = null;
        defpackage.jke jkeVar2 = new defpackage.jke("STARTUP", 1, defpackage.ysr.cE(12), defpackage.zbd.Ly, null, duration, 12);
        b = jkeVar2;
        defpackage.jke jkeVar3 = new defpackage.jke("VIDEO_FOCUS", 2, defpackage.ysr.cE(4), defpackage.zbd.LA, duration, defpackage.ysr.cD(1), 4);
        c = jkeVar3;
        defpackage.jke jkeVar4 = new defpackage.jke("STARTUP_NO_TIMEOUT", 3, null, defpackage.zbd.Ly, null, null, 12);
        d = jkeVar4;
        defpackage.jke[] jkeVarArr = {jkeVar, jkeVar2, jkeVar3, jkeVar4};
        i = jkeVarArr;
        defpackage.afga.p(jkeVarArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jke(java.lang.String str, int i2, j$.time.Duration duration, defpackage.zbd zbdVar, j$.time.Duration duration2, j$.time.Duration duration3, int i3) {
        super(str, i2);
        if ((i3 & 4) != 0) {
            duration2 = j$.time.Duration.ofSeconds(2L);
            duration2.getClass();
        }
        if ((i3 & 8) != 0) {
            duration3 = j$.time.Duration.ZERO;
            duration3.getClass();
        }
        this.e = duration;
        this.f = zbdVar;
        this.g = duration2;
        this.h = duration3;
    }

    public static defpackage.jke valueOf(java.lang.String str) {
        return (defpackage.jke) java.lang.Enum.valueOf(defpackage.jke.class, str);
    }

    public static defpackage.jke[] values() {
        return (defpackage.jke[]) i.clone();
    }
}
