package com.google.d.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ae extends aa {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Object f7201a;

    ae(Object obj) {
        this.f7201a = obj;
    }

    @Override // com.google.d.b.aa
    public final aa a(t tVar) {
        Object objApply = tVar.apply(this.f7201a);
        an.C(objApply, "the Function passed to Optional.transform() must not return null.");
        return new ae(objApply);
    }

    @Override // com.google.d.b.aa
    public final Object b() {
        return this.f7201a;
    }

    @Override // com.google.d.b.aa
    public final Object c(aj ajVar) {
        return this.f7201a;
    }

    @Override // com.google.d.b.aa
    public final Object d(Object obj) {
        return this.f7201a;
    }

    @Override // com.google.d.b.aa
    public final Object e() {
        return this.f7201a;
    }

    @Override // com.google.d.b.aa
    public final boolean equals(Object obj) {
        if (obj instanceof ae) {
            return this.f7201a.equals(((ae) obj).f7201a);
        }
        return false;
    }

    @Override // com.google.d.b.aa
    public final boolean f() {
        return true;
    }

    @Override // com.google.d.b.aa
    public final int hashCode() {
        return this.f7201a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f7201a.toString() + ")";
    }
}
