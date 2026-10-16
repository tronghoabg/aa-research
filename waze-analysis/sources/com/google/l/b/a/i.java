package com.google.l.b.a;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i implements com.google.l.v {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.l.v f12284a = new g(2);

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.l.v f12285b = new g(2);

    /* renamed from: c, reason: collision with root package name */
    private final com.google.l.b.e f12286c;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentMap f12287d = new ConcurrentHashMap();

    public i(com.google.l.b.e eVar) {
        this.f12286c = eVar;
    }

    private final com.google.l.v d(Class cls, com.google.l.v vVar) {
        com.google.l.v vVar2 = (com.google.l.v) this.f12287d.putIfAbsent(cls, vVar);
        return vVar2 != null ? vVar2 : vVar;
    }

    private static com.google.l.a.a e(Class cls) {
        return (com.google.l.a.a) cls.getAnnotation(com.google.l.a.a.class);
    }

    private static Object f(com.google.l.b.e eVar, Class cls) {
        return eVar.a(com.google.l.c.a.a(cls), true).a();
    }

    @Override // com.google.l.v
    public final com.google.l.u a(com.google.l.d dVar, com.google.l.c.a aVar) {
        com.google.l.a.a aVarE = e(aVar.c());
        if (aVarE == null) {
            return null;
        }
        return b(this.f12286c, dVar, aVar, aVarE, true);
    }

    final com.google.l.u b(com.google.l.b.e eVar, com.google.l.d dVar, com.google.l.c.a aVar, com.google.l.a.a aVar2, boolean z) {
        com.google.l.p pVar;
        com.google.l.u uVarA;
        Object objF = f(eVar, aVar2.a());
        boolean z2 = objF instanceof com.google.l.u;
        boolean zB = aVar2.b();
        if (z2) {
            uVarA = (com.google.l.u) objF;
        } else if (objF instanceof com.google.l.v) {
            com.google.l.v vVarD = (com.google.l.v) objF;
            if (z) {
                vVarD = d(aVar.c(), vVarD);
            }
            uVarA = vVarD.a(dVar, aVar);
        } else {
            if (objF instanceof com.google.l.p) {
                pVar = (com.google.l.p) objF;
            } else {
                if (!(objF instanceof com.google.l.h)) {
                    throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objF.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                }
                pVar = null;
            }
            ae aeVar = new ae(pVar, objF instanceof com.google.l.h ? (com.google.l.h) objF : null, dVar, aVar, z ? f12284a : f12285b, zB);
            zB = false;
            uVarA = aeVar;
        }
        return (uVarA == null || !zB) ? uVarA : uVarA.e();
    }

    public final boolean c(com.google.l.c.a aVar, com.google.l.v vVar) {
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(vVar);
        if (vVar == f12284a) {
            return true;
        }
        Class clsC = aVar.c();
        com.google.l.v vVar2 = (com.google.l.v) this.f12287d.get(clsC);
        if (vVar2 != null) {
            return vVar2 == vVar;
        }
        com.google.l.a.a aVarE = e(clsC);
        if (aVarE == null) {
            return false;
        }
        Class clsA = aVarE.a();
        return com.google.l.v.class.isAssignableFrom(clsA) && d(clsC, (com.google.l.v) f(this.f12286c, clsA)) == vVar;
    }
}
