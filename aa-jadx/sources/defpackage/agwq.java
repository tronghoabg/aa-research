package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agwq implements defpackage.aggk {
    private final defpackage.aifb<defpackage.ahaf, defpackage.aggc> annotationDescriptors;
    private final defpackage.ahah annotationOwner;
    private final boolean areAnnotationsFreshlySupported;
    private final defpackage.agwu c;

    public agwq(defpackage.agwu agwuVar, defpackage.ahah ahahVar, boolean z) {
        agwuVar.getClass();
        ahahVar.getClass();
        this.c = agwuVar;
        this.annotationOwner = ahahVar;
        this.areAnnotationsFreshlySupported = z;
        this.annotationDescriptors = agwuVar.getComponents().getStorageManager().createMemoizedFunctionWithNullableValues(new defpackage.agwp(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.aggc annotationDescriptors$lambda$0(defpackage.agwq agwqVar, defpackage.ahaf ahafVar) {
        ahafVar.getClass();
        return defpackage.agvh.INSTANCE.mapOrResolveJavaAnnotation(ahafVar, agwqVar.c, agwqVar.areAnnotationsFreshlySupported);
    }

    @Override // defpackage.aggk
    public defpackage.aggc findAnnotation(defpackage.ahof ahofVar) {
        defpackage.aggc aggcVarInvoke;
        ahofVar.getClass();
        defpackage.ahaf ahafVarFindAnnotation = this.annotationOwner.findAnnotation(ahofVar);
        return (ahafVarFindAnnotation == null || (aggcVarInvoke = this.annotationDescriptors.invoke(ahafVarFindAnnotation)) == null) ? defpackage.agvh.INSTANCE.findMappedJavaAnnotation(ahofVar, this.annotationOwner, this.c) : aggcVarInvoke;
    }

    @Override // defpackage.aggk
    public /* bridge */ boolean hasAnnotation(defpackage.ahof ahofVar) {
        return defpackage.aggj.hasAnnotation(this, ahofVar);
    }

    @Override // defpackage.aggk
    public boolean isEmpty() {
        return this.annotationOwner.getAnnotations().isEmpty() && !this.annotationOwner.isDeprecatedInJavaDoc();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<defpackage.aggc> iterator() {
        return new defpackage.aisy((defpackage.aisk) defpackage.afsg.n(defpackage.afsg.s(defpackage.afsg.q(defpackage.afga.bg(this.annotationOwner.getAnnotations()), this.annotationDescriptors), defpackage.agvh.INSTANCE.findMappedJavaAnnotation(defpackage.afzn.deprecated, this.annotationOwner, this.c))), 1);
    }

    public /* synthetic */ agwq(defpackage.agwu agwuVar, defpackage.ahah ahahVar, boolean z, int i, defpackage.affu affuVar) {
        this(agwuVar, ahahVar, z & ((i & 4) == 0));
    }
}
