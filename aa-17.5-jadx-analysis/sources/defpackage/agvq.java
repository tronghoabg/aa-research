package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class agvq implements agfk {
    private final aieb<agzf, agfc> annotationDescriptors;
    private final agzh annotationOwner;
    private final boolean areAnnotationsFreshlySupported;
    private final agvu c;

    public agvq(agvu agvuVar, agzh agzhVar, boolean z) {
        agvuVar.getClass();
        agzhVar.getClass();
        this.c = agvuVar;
        this.annotationOwner = agzhVar;
        this.areAnnotationsFreshlySupported = z;
        this.annotationDescriptors = agvuVar.getComponents().getStorageManager().createMemoizedFunctionWithNullableValues(new agvp(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agfc annotationDescriptors$lambda$0(agvq agvqVar, agzf agzfVar) {
        agzfVar.getClass();
        return aguh.INSTANCE.mapOrResolveJavaAnnotation(agzfVar, agvqVar.c, agvqVar.areAnnotationsFreshlySupported);
    }

    @Override // defpackage.agfk
    public agfc findAnnotation(ahnf ahnfVar) {
        agfc agfcVarInvoke;
        ahnfVar.getClass();
        agzf agzfVarFindAnnotation = this.annotationOwner.findAnnotation(ahnfVar);
        return (agzfVarFindAnnotation == null || (agfcVarInvoke = this.annotationDescriptors.invoke(agzfVarFindAnnotation)) == null) ? aguh.INSTANCE.findMappedJavaAnnotation(ahnfVar, this.annotationOwner, this.c) : agfcVarInvoke;
    }

    @Override // defpackage.agfk
    public /* bridge */ boolean hasAnnotation(ahnf ahnfVar) {
        return agfj.hasAnnotation(this, ahnfVar);
    }

    @Override // defpackage.agfk
    public boolean isEmpty() {
        return this.annotationOwner.getAnnotations().isEmpty() && !this.annotationOwner.isDeprecatedInJavaDoc();
    }

    @Override // java.lang.Iterable
    public Iterator<agfc> iterator() {
        return new airz((airk) afrg.n(afrg.s(afrg.q(woy.cm(this.annotationOwner.getAnnotations()), this.annotationDescriptors), aguh.INSTANCE.findMappedJavaAnnotation(afyn.deprecated, this.annotationOwner, this.c))), 1);
    }

    public /* synthetic */ agvq(agvu agvuVar, agzh agzhVar, boolean z, int i, afeu afeuVar) {
        this(agvuVar, agzhVar, z & ((i & 4) == 0));
    }
}
