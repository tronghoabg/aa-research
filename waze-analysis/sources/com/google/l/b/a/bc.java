package com.google.l.b.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bc implements com.google.l.v {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Class f12258a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.l.u f12259b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f12260c;

    bc(Class cls, com.google.l.u uVar, int i2) {
        this.f12260c = i2;
        this.f12258a = cls;
        this.f12259b = uVar;
    }

    @Override // com.google.l.v
    public final com.google.l.u a(com.google.l.d dVar, com.google.l.c.a aVar) {
        if (this.f12260c != 0) {
            if (aVar.c() == this.f12258a) {
                return this.f12259b;
            }
            return null;
        }
        Class<?> clsC = aVar.c();
        if (this.f12258a.isAssignableFrom(clsC)) {
            return new bb(this, this.f12259b, clsC);
        }
        return null;
    }

    public final String toString() {
        int i2 = this.f12260c;
        Class cls = this.f12258a;
        com.google.l.u uVar = this.f12259b;
        if (i2 != 0) {
            return "Factory[type=" + cls.getName() + ",adapter=" + String.valueOf(uVar) + "]";
        }
        return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + String.valueOf(uVar) + "]";
    }
}
