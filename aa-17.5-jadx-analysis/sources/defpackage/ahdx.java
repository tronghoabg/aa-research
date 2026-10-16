package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ahdx<A, C> extends ahdr<A> {
    private final Map<ahfn, C> annotationParametersDefaultValues;
    private final Map<ahfn, List<A>> memberAnnotations;
    private final Map<ahfn, C> propertyConstants;

    /* JADX WARN: Multi-variable type inference failed */
    public ahdx(Map<ahfn, ? extends List<? extends A>> map, Map<ahfn, ? extends C> map2, Map<ahfn, ? extends C> map3) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.memberAnnotations = map;
        this.propertyConstants = map2;
        this.annotationParametersDefaultValues = map3;
    }

    public final Map<ahfn, C> getAnnotationParametersDefaultValues() {
        return this.annotationParametersDefaultValues;
    }

    @Override // defpackage.ahdr
    public Map<ahfn, List<A>> getMemberAnnotations() {
        return this.memberAnnotations;
    }

    public final Map<ahfn, C> getPropertyConstants() {
        return this.propertyConstants;
    }
}
