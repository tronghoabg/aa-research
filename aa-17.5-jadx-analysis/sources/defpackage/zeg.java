package defpackage;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zeg implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;
    private final yfq b;
    private final Class c;

    public zeg(Type type, Class cls, Type[] typeArr) {
        cls.getClass();
        woy.N(typeArr.length == cls.getTypeParameters().length);
        zek.e(typeArr, "type parameter");
        this.a = type;
        this.c = cls;
        this.b = zee.e.a(typeArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return this.c.equals(parameterizedType.getRawType()) && Objects.equals(this.a, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return zek.f(this.b);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.c;
    }

    public final int hashCode() {
        Type type = this.a;
        return this.c.hashCode() ^ ((type == null ? 0 : type.hashCode()) ^ this.b.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Type type = this.a;
        if (type != null) {
            zee zeeVar = zee.e;
            if (zeeVar.ordinal() != 3) {
                sb.append(zeeVar.b(type));
                sb.append('.');
            }
        }
        sb.append(this.c.getName());
        sb.append('<');
        yfq yfqVar = this.b;
        xxd xxdVar = zek.a;
        zee zeeVar2 = zee.e;
        zeeVar2.getClass();
        sb.append(xxdVar.b(yrm.am(yfqVar, new rgf(zeeVar2, 18))));
        sb.append('>');
        return sb.toString();
    }
}
