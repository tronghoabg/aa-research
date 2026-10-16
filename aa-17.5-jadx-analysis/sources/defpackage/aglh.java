package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: classes3.dex */
public final class aglh {
    private aglh() {
    }

    public final agli create(Type type) {
        type.getClass();
        boolean z = type instanceof Class;
        if (z) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                return new aglf(cls);
            }
        }
        return ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new agkk(type) : type instanceof WildcardType ? new agll((WildcardType) type) : new agkv(type);
    }

    public /* synthetic */ aglh(afeu afeuVar) {
        this();
    }
}
