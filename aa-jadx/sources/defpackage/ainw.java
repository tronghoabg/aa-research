package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ainw {
    private final defpackage.aihl inProjection;
    private final defpackage.aihl outProjection;
    private final defpackage.agfe typeParameter;

    public ainw(defpackage.agfe agfeVar, defpackage.aihl aihlVar, defpackage.aihl aihlVar2) {
        agfeVar.getClass();
        aihlVar.getClass();
        aihlVar2.getClass();
        this.typeParameter = agfeVar;
        this.inProjection = aihlVar;
        this.outProjection = aihlVar2;
    }

    public final defpackage.aihl getInProjection() {
        return this.inProjection;
    }

    public final defpackage.aihl getOutProjection() {
        return this.outProjection;
    }

    public final defpackage.agfe getTypeParameter() {
        return this.typeParameter;
    }

    public final boolean isConsistent() {
        return defpackage.aikp.DEFAULT.isSubtypeOf(this.inProjection, this.outProjection);
    }
}
