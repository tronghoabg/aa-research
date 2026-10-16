package defpackage;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
final class zed implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;

    public zed(Type type) {
        this.a = zee.e.d(type);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return Objects.equals(this.a, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.valueOf(zek.b(this.a)).concat("[]");
    }
}
