package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class zfj implements java.lang.reflect.GenericArrayType, java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final java.lang.reflect.Type a;

    public zfj(java.lang.reflect.Type type) {
        this.a = defpackage.zfk.e.d(type);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof java.lang.reflect.GenericArrayType) {
            return j$.util.Objects.equals(this.a, ((java.lang.reflect.GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final java.lang.reflect.Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(defpackage.zfq.b(this.a)).concat("[]");
    }
}
