package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class zew {
    private final java.lang.reflect.TypeVariable a;

    public zew(java.lang.reflect.TypeVariable typeVariable) {
        typeVariable.getClass();
        this.a = typeVariable;
    }

    static defpackage.zew a(java.lang.reflect.Type type) {
        if (type instanceof java.lang.reflect.TypeVariable) {
            return new defpackage.zew((java.lang.reflect.TypeVariable) type);
        }
        return null;
    }

    private final boolean c(java.lang.reflect.TypeVariable typeVariable) {
        java.lang.reflect.TypeVariable typeVariable2 = this.a;
        return typeVariable2.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && typeVariable2.getName().equals(typeVariable.getName());
    }

    final boolean b(java.lang.reflect.Type type) {
        if (type instanceof java.lang.reflect.TypeVariable) {
            return c((java.lang.reflect.TypeVariable) type);
        }
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.zew) {
            return c(((defpackage.zew) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        java.lang.reflect.TypeVariable typeVariable = this.a;
        return j$.util.Objects.hash(typeVariable.getGenericDeclaration(), typeVariable.getName());
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
