package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class agkv extends agli implements agzl {
    private final agzk classifier;
    private final Type reflectType;

    public agkv(Type type) {
        agzk agktVar;
        type.getClass();
        this.reflectType = type;
        Type reflectType = getReflectType();
        if (reflectType instanceof Class) {
            agktVar = new agkt((Class) reflectType);
        } else if (reflectType instanceof TypeVariable) {
            agktVar = new aglj((TypeVariable) reflectType);
        } else {
            if (!(reflectType instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + reflectType.getClass() + "): " + reflectType);
            }
            Type rawType = ((ParameterizedType) reflectType).getRawType();
            rawType.getClass();
            agktVar = new agkt((Class) rawType);
        }
        this.classifier = agktVar;
    }

    @Override // defpackage.agli, defpackage.agzh
    public agzf findAnnotation(ahnf ahnfVar) {
        ahnfVar.getClass();
        return null;
    }

    @Override // defpackage.agzh
    public Collection<agzf> getAnnotations() {
        return afbe.a;
    }

    @Override // defpackage.agzl
    public agzk getClassifier() {
        return this.classifier;
    }

    @Override // defpackage.agzl
    public String getClassifierQualifiedName() {
        Type reflectType = getReflectType();
        Objects.toString(reflectType);
        throw new UnsupportedOperationException("Type not found: ".concat(String.valueOf(reflectType)));
    }

    @Override // defpackage.agzl
    public String getPresentableText() {
        return getReflectType().toString();
    }

    @Override // defpackage.agli
    public Type getReflectType() {
        return this.reflectType;
    }

    @Override // defpackage.agzl
    public List<agzw> getTypeArguments() {
        List<Type> parameterizedTypeArguments = agkc.getParameterizedTypeArguments(getReflectType());
        aglh aglhVar = agli.Factory;
        ArrayList arrayList = new ArrayList(woy.bp(parameterizedTypeArguments, 10));
        Iterator<T> it = parameterizedTypeArguments.iterator();
        while (it.hasNext()) {
            arrayList.add(aglhVar.create((Type) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.agzh
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // defpackage.agzl
    public boolean isRaw() {
        Type reflectType = getReflectType();
        if (!(reflectType instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) reflectType).getTypeParameters();
        typeParameters.getClass();
        return typeParameters.length != 0;
    }
}
