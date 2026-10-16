package com.google.d.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a extends aa {

    /* renamed from: a, reason: collision with root package name */
    static final a f7194a = new a();
    private static final long serialVersionUID = 0;

    private a() {
    }

    private Object readResolve() {
        return f7194a;
    }

    @Override // com.google.d.b.aa
    public final aa a(t tVar) {
        return f7194a;
    }

    @Override // com.google.d.b.aa
    public final Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.d.b.aa
    public final Object c(aj ajVar) {
        Object obj = ajVar.get();
        an.C(obj, "use Optional.orNull() instead of a Supplier that returns null");
        return obj;
    }

    @Override // com.google.d.b.aa
    public final Object d(Object obj) {
        return obj;
    }

    @Override // com.google.d.b.aa
    public final Object e() {
        return null;
    }

    @Override // com.google.d.b.aa
    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // com.google.d.b.aa
    public final boolean f() {
        return false;
    }

    @Override // com.google.d.b.aa
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
