package com.google.firebase.d.c;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    private final int f9837a;

    /* renamed from: b, reason: collision with root package name */
    private final e f9838b;

    a(int i2, e eVar) {
        this.f9837a = i2;
        this.f9838b = eVar;
    }

    @Override // com.google.firebase.d.c.f
    public final int a() {
        return this.f9837a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return f.class;
    }

    @Override // com.google.firebase.d.c.f
    public final e b() {
        return this.f9838b;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f9837a == fVar.a() && this.f9838b.equals(fVar.b());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f9837a ^ 14552422) + (this.f9838b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f9837a + "intEncoding=" + this.f9838b + ')';
    }
}
