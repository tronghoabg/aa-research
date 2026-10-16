package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahex<A, C> extends defpackage.aher<A> {
    private final java.util.Map<defpackage.ahgn, C> annotationParametersDefaultValues;
    private final java.util.Map<defpackage.ahgn, java.util.List<A>> memberAnnotations;
    private final java.util.Map<defpackage.ahgn, C> propertyConstants;

    /* JADX WARN: Multi-variable type inference failed */
    public ahex(java.util.Map<defpackage.ahgn, ? extends java.util.List<? extends A>> map, java.util.Map<defpackage.ahgn, ? extends C> map2, java.util.Map<defpackage.ahgn, ? extends C> map3) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.memberAnnotations = map;
        this.propertyConstants = map2;
        this.annotationParametersDefaultValues = map3;
    }

    public final java.util.Map<defpackage.ahgn, C> getAnnotationParametersDefaultValues() {
        return this.annotationParametersDefaultValues;
    }

    @Override // defpackage.aher
    public java.util.Map<defpackage.ahgn, java.util.List<A>> getMemberAnnotations() {
        return this.memberAnnotations;
    }

    public final java.util.Map<defpackage.ahgn, C> getPropertyConstants() {
        return this.propertyConstants;
    }
}
