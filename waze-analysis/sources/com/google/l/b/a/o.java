package com.google.l.b.a;

import j$.util.Objects;
import java.io.IOException;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class o extends com.google.l.u {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.l.u f12300a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.l.u f12301b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.l.b.w f12302c;

    o(p pVar, com.google.l.u uVar, com.google.l.u uVar2, com.google.l.b.w wVar) {
        Objects.requireNonNull(pVar);
        this.f12300a = uVar;
        this.f12301b = uVar2;
        this.f12302c = wVar;
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) throws IOException {
        int iR = bVar.r();
        if (iR == 9) {
            bVar.m();
            return null;
        }
        Map map = (Map) this.f12302c.a();
        if (iR != 1) {
            bVar.j();
            while (bVar.p()) {
                com.google.l.b.m.f12382a.a(bVar);
                Object objB = this.f12300a.b(bVar);
                Object objB2 = this.f12301b.b(bVar);
                if (map.containsKey(objB)) {
                    throw new com.google.l.q("duplicate key: ".concat(String.valueOf(String.valueOf(objB))));
                }
                map.put(objB, objB2);
            }
            bVar.l();
            return map;
        }
        bVar.i();
        while (bVar.p()) {
            bVar.i();
            Object objB3 = this.f12300a.b(bVar);
            Object objB4 = this.f12301b.b(bVar);
            if (map.containsKey(objB3)) {
                throw new com.google.l.q("duplicate key: ".concat(String.valueOf(String.valueOf(objB3))));
            }
            map.put(objB3, objB4);
            bVar.k();
        }
        bVar.k();
        return map;
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            cVar.g();
            return;
        }
        cVar.c();
        for (Map.Entry entry : map.entrySet()) {
            cVar.f(String.valueOf(entry.getKey()));
            this.f12301b.d(cVar, entry.getValue());
        }
        cVar.e();
    }
}
