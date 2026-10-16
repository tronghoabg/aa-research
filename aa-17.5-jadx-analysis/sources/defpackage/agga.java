package defpackage;

/* loaded from: classes3.dex */
public final class agga implements aggb {
    public static final agga INSTANCE = new agga();

    private agga() {
    }

    @Override // defpackage.aggb
    public boolean isFunctionAvailable(agba agbaVar, agdv agdvVar) {
        agbaVar.getClass();
        agdvVar.getClass();
        return !agdvVar.getAnnotations().hasAnnotation(aggc.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME());
    }
}
