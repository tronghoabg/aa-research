package com.google.l.b.a;

import java.lang.reflect.Type;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class af extends com.google.l.u {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.l.d f12244a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.l.u f12245b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f12246c;

    af(com.google.l.d dVar, com.google.l.u uVar, Type type) {
        this.f12244a = dVar;
        this.f12245b = uVar;
        this.f12246c = type;
    }

    @Override // com.google.l.u
    public final Object b(com.google.l.d.b bVar) {
        return this.f12245b.b(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // com.google.l.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.google.l.d.c r4, java.lang.Object r5) {
        /*
            r3 = this;
            java.lang.reflect.Type r0 = r3.f12246c
            if (r5 == 0) goto L11
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto Lc
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L11
        Lc:
            java.lang.Class r1 = r5.getClass()
            goto L12
        L11:
            r1 = r0
        L12:
            com.google.l.u r2 = r3.f12245b
            if (r1 == r0) goto L3c
            com.google.l.d r3 = r3.f12244a
            com.google.l.c.a r0 = com.google.l.c.a.b(r1)
            com.google.l.u r3 = r3.a(r0)
            boolean r0 = r3 instanceof com.google.l.b.a.v
            if (r0 != 0) goto L25
            goto L3b
        L25:
            r0 = r2
        L26:
            boolean r1 = r0 instanceof com.google.l.b.a.ab
            if (r1 == 0) goto L36
            r1 = r0
            com.google.l.b.a.ab r1 = (com.google.l.b.a.ab) r1
            com.google.l.u r1 = r1.a()
            if (r1 != r0) goto L34
            goto L36
        L34:
            r0 = r1
            goto L26
        L36:
            boolean r0 = r0 instanceof com.google.l.b.a.v
            if (r0 != 0) goto L3b
            goto L3c
        L3b:
            r2 = r3
        L3c:
            r2.d(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.l.b.a.af.d(com.google.l.d.c, java.lang.Object):void");
    }
}
