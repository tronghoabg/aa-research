package defpackage;

import j$.util.Objects;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes3.dex */
final class zdq {
    private final TypeVariable a;

    public zdq(TypeVariable typeVariable) {
        typeVariable.getClass();
        this.a = typeVariable;
    }

    static zdq a(Type type) {
        if (type instanceof TypeVariable) {
            return new zdq((TypeVariable) type);
        }
        return null;
    }

    private final boolean c(TypeVariable typeVariable) {
        TypeVariable typeVariable2 = this.a;
        return typeVariable2.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && typeVariable2.getName().equals(typeVariable.getName());
    }

    final boolean b(Type type) {
        if (type instanceof TypeVariable) {
            return c((TypeVariable) type);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zdq) {
            return c(((zdq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        TypeVariable typeVariable = this.a;
        return Objects.hash(typeVariable.getGenericDeclaration(), typeVariable.getName());
    }

    public final String toString() {
        return this.a.toString();
    }
}
