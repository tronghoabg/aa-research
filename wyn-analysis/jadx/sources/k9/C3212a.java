package k9;

/* renamed from: k9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3212a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f39323a;

    public C3212a(int i5) {
        this.f39323a = i5;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        C3212a c3212a = (C3212a) ((e) obj);
        if (this.f39323a != c3212a.f39323a) {
            return false;
        }
        Object obj2 = d.f39325a;
        c3212a.getClass();
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f39323a) + (d.f39325a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f39323a + "intEncoding=" + d.f39325a + ')';
    }
}
