package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class agll extends agli implements ahaa {
    private final Collection<agzf> annotations;
    private final boolean isDeprecatedInJavaDoc;
    private final WildcardType reflectType;

    public agll(WildcardType wildcardType) {
        wildcardType.getClass();
        this.reflectType = wildcardType;
        this.annotations = afbe.a;
    }

    @Override // defpackage.agzh
    public Collection<agzf> getAnnotations() {
        return this.annotations;
    }

    @Override // defpackage.ahaa
    public agli getBound() {
        int length;
        Type[] upperBounds = getReflectType().getUpperBounds();
        Type[] lowerBounds = getReflectType().getLowerBounds();
        int length2 = upperBounds.length;
        if (length2 > 1 || (length = lowerBounds.length) > 1) {
            WildcardType reflectType = getReflectType();
            Objects.toString(reflectType);
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: ".concat(String.valueOf(reflectType)));
        }
        if (length == 1) {
            aglh aglhVar = agli.Factory;
            lowerBounds.getClass();
            Object objCY = woy.cY(lowerBounds);
            objCY.getClass();
            return aglhVar.create((Type) objCY);
        }
        if (length2 != 1) {
            return null;
        }
        upperBounds.getClass();
        Type type = (Type) woy.cY(upperBounds);
        if (affa.f(type, Object.class)) {
            return null;
        }
        aglh aglhVar2 = agli.Factory;
        type.getClass();
        return aglhVar2.create(type);
    }

    @Override // defpackage.agzh
    public boolean isDeprecatedInJavaDoc() {
        return this.isDeprecatedInJavaDoc;
    }

    @Override // defpackage.ahaa
    public boolean isExtends() {
        Type[] upperBounds = getReflectType().getUpperBounds();
        upperBounds.getClass();
        return !affa.f(woy.cV(upperBounds), Object.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agli
    public WildcardType getReflectType() {
        return this.reflectType;
    }
}
