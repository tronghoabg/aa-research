package com.waze.sound;

import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ju implements jt {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ce.ab f40347a;

    public ju(com.waze.ce.ab abVar) {
        this.f40347a = abVar;
    }

    @Override // com.waze.sound.jt
    public final Object a(com.waze.ce.b bVar, long j2, h.c.e eVar) {
        com.waze.ce.ab abVar;
        com.waze.ce.ab abVar2 = this.f40347a;
        if (abVar2 == null || (abVar = (com.waze.ce.ab) abVar2.withDeadlineAfter(j2, TimeUnit.MILLISECONDS)) == null) {
            return null;
        }
        Object objA = abVar.a(bVar, new e.a.cm(), eVar);
        return objA == h.c.a.a.f48038a ? objA : (com.waze.ce.g) objA;
    }

    @Override // com.waze.sound.jt
    public final Object b(com.waze.ce.j jVar, long j2, h.c.e eVar) {
        com.waze.ce.ab abVar;
        com.waze.ce.ab abVar2 = this.f40347a;
        if (abVar2 == null || (abVar = (com.waze.ce.ab) abVar2.withDeadline(e.a.ad.c(j2, TimeUnit.MILLISECONDS))) == null) {
            return null;
        }
        Object objB = abVar.b(jVar, new e.a.cm(), eVar);
        return objB == h.c.a.a.f48038a ? objB : (com.waze.ce.l) objB;
    }

    @Override // com.waze.sound.jt
    public final Object c(com.waze.ce.n nVar, h.c.e eVar) {
        com.waze.ce.ab abVar = this.f40347a;
        if (abVar == null) {
            return null;
        }
        Object objC = abVar.c(nVar, new e.a.cm(), eVar);
        return objC == h.c.a.a.f48038a ? objC : (com.waze.ce.p) objC;
    }
}
