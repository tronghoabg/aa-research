package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class agkk extends agli implements agzi {
    private final Collection<agzf> annotations;
    private final agli componentType;
    private final boolean isDeprecatedInJavaDoc;
    private final Type reflectType;

    public agkk(Type type) {
        agli agliVarCreate;
        type.getClass();
        this.reflectType = type;
        Type reflectType = getReflectType();
        if (!(reflectType instanceof GenericArrayType)) {
            if (reflectType instanceof Class) {
                Class cls = (Class) reflectType;
                if (cls.isArray()) {
                    aglh aglhVar = agli.Factory;
                    Class<?> componentType = cls.getComponentType();
                    componentType.getClass();
                    agliVarCreate = aglhVar.create(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + getReflectType().getClass() + "): " + getReflectType());
        }
        aglh aglhVar2 = agli.Factory;
        Type genericComponentType = ((GenericArrayType) reflectType).getGenericComponentType();
        genericComponentType.getClass();
        agliVarCreate = aglhVar2.create(genericComponentType);
        this.componentType = agliVarCreate;
        this.annotations = afbe.a;
    }

    @Override // defpackage.agzh
    public Collection<agzf> getAnnotations() {
        return this.annotations;
    }

    @Override // defpackage.agli
    protected Type getReflectType() {
        return this.reflectType;
    }

    @Override // defpackage.agzh
    public boolean isDeprecatedInJavaDoc() {
        return this.isDeprecatedInJavaDoc;
    }

    @Override // defpackage.agzi
    public agli getComponentType() {
        return this.componentType;
    }
}
