package defpackage;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
final class afii implements ParameterizedType, Type {
    private final Class a;
    private final Type b;
    private final Type[] c;

    public afii(Class cls, Type type, List list) {
        this.a = cls;
        this.b = type;
        this.c = (Type[]) list.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return affa.f(this.a, parameterizedType.getRawType()) && affa.f(this.b, parameterizedType.getOwnerType()) && Arrays.equals(this.c, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() throws IOException {
        StringBuilder sb = new StringBuilder();
        Type type = this.b;
        if (type != null) {
            sb.append(afik.a(type));
            sb.append("$");
            sb.append(this.a.getSimpleName());
        } else {
            sb.append(afik.a(this.a));
        }
        Type[] typeArr = this.c;
        if (typeArr.length != 0) {
            woy.dx(typeArr, sb, ", ", "<", ">", -1, "...", afih.a);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        Type type = this.b;
        return Arrays.hashCode(this.c) ^ (iHashCode ^ (type != null ? type.hashCode() : 0));
    }

    public final String toString() {
        return getTypeName();
    }
}
