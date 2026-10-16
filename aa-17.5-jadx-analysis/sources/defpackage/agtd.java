package defpackage;

/* loaded from: classes3.dex */
public final class agtd {
    public static final agtc Companion = new agtc(null);
    private final boolean disabledDefaultAnnotations;
    private final afec<ahnf, agtq> getReportLevelForAnnotation;
    private final agtg jsr305;

    /* JADX WARN: Multi-variable type inference failed */
    public agtd(agtg agtgVar, afec<? super ahnf, ? extends agtq> afecVar) {
        agtgVar.getClass();
        afecVar.getClass();
        this.jsr305 = agtgVar;
        this.getReportLevelForAnnotation = afecVar;
        boolean z = true;
        if (!agtgVar.isDisabled() && afecVar.invoke(agsy.getJSPECIFY_ANNOTATIONS_PACKAGE()) != agtq.IGNORE) {
            z = false;
        }
        this.disabledDefaultAnnotations = z;
    }

    public final boolean getDisabledDefaultAnnotations() {
        return this.disabledDefaultAnnotations;
    }

    public final afec<ahnf, agtq> getGetReportLevelForAnnotation() {
        return this.getReportLevelForAnnotation;
    }

    public final agtg getJsr305() {
        return this.jsr305;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.jsr305 + ')';
    }
}
