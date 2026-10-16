package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class zdn extends zea {
    public final Map a = new HashMap();

    @Override // defpackage.zea
    public final void a(Class cls) {
        f(cls.getGenericSuperclass());
        f(cls.getGenericInterfaces());
    }

    @Override // defpackage.zea
    public final void b(ParameterizedType parameterizedType) {
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        woy.Z(typeParameters.length == actualTypeArguments.length);
        for (int i = 0; i < typeParameters.length; i++) {
            zdq zdqVar = new zdq(typeParameters[i]);
            Type type = actualTypeArguments[i];
            Map map = this.a;
            if (!map.containsKey(zdqVar)) {
                Type type2 = type;
                while (true) {
                    if (type2 == null) {
                        map.put(zdqVar, type);
                        break;
                    } else if (zdqVar.b(type2)) {
                        while (type != null) {
                            type = (Type) map.remove(zdq.a(type));
                        }
                    } else {
                        type2 = (Type) map.get(zdq.a(type2));
                    }
                }
            }
        }
        f(cls);
        f(parameterizedType.getOwnerType());
    }

    @Override // defpackage.zea
    public final void c(TypeVariable typeVariable) {
        f(typeVariable.getBounds());
    }

    @Override // defpackage.zea
    public final void d(WildcardType wildcardType) {
        f(wildcardType.getUpperBounds());
    }
}
