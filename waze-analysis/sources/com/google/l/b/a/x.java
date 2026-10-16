package com.google.l.b.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class x extends v {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.l.b.w f12322a;

    x(com.google.l.b.w wVar, y yVar) {
        super(yVar);
        this.f12322a = wVar;
    }

    @Override // com.google.l.b.a.v
    final Object a() {
        return this.f12322a.a();
    }

    @Override // com.google.l.b.a.v
    final Object c(Object obj) {
        return obj;
    }

    @Override // com.google.l.b.a.v
    final void f(Object obj, com.google.l.d.b bVar, w wVar) throws IllegalAccessException, IllegalArgumentException {
        Object objB = wVar.f12319g.b(bVar);
        if (objB == null && wVar.f12320h) {
            return;
        }
        if (wVar.f12316d) {
            aa.b(obj, wVar.f12314b);
        } else if (wVar.f12321i) {
            throw new com.google.l.j("Cannot set value of 'static final' ".concat(com.google.l.b.b.d.e(wVar.f12314b, false)));
        }
        wVar.f12314b.set(obj, objB);
    }
}
