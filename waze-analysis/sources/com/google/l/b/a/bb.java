package com.google.l.b.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bb extends com.google.l.u {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.l.u f12256a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Class f12257b;

    bb(bc bcVar, com.google.l.u uVar, Class cls) {
        this.f12256a = uVar;
        this.f12257b = cls;
        Objects.requireNonNull(bcVar);
    }

    @Override // com.google.l.u
    public final Object b(com.google.l.d.b bVar) {
        Object objB = this.f12256a.b(bVar);
        if (objB != null) {
            Class cls = this.f12257b;
            if (!cls.isInstance(objB)) {
                Class<?> cls2 = objB.getClass();
                throw new com.google.l.q("Expected a " + cls.getName() + " but was " + cls2.getName() + "; at path " + bVar.f());
            }
        }
        return objB;
    }

    @Override // com.google.l.u
    public final void d(com.google.l.d.c cVar, Object obj) {
        this.f12256a.d(cVar, obj);
    }
}
