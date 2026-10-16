package com.google.firebase.components;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ag implements d {

    /* renamed from: a, reason: collision with root package name */
    private final Set f8921a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f8922b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f8923c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f8924d;

    /* renamed from: e, reason: collision with root package name */
    private final d f8925e;

    ag(c cVar, d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r rVar : cVar.k()) {
            if (rVar.l()) {
                if (rVar.n()) {
                    hashSet4.add(rVar.j());
                } else {
                    hashSet.add(rVar.j());
                }
            } else if (rVar.k()) {
                hashSet3.add(rVar.j());
            } else if (rVar.n()) {
                hashSet5.add(rVar.j());
            } else {
                hashSet2.add(rVar.j());
            }
        }
        if (!cVar.m().isEmpty()) {
            hashSet.add(new ae(ad.class, com.google.firebase.e.b.class));
        }
        this.f8921a = DesugarCollections.unmodifiableSet(hashSet);
        this.f8922b = DesugarCollections.unmodifiableSet(hashSet2);
        this.f8923c = DesugarCollections.unmodifiableSet(hashSet3);
        this.f8924d = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        cVar.m();
        this.f8925e = dVar;
    }

    @Override // com.google.firebase.components.d
    public final com.google.firebase.g.b a(Class cls) {
        ae aeVar = new ae(ad.class, cls);
        if (!this.f8923c.contains(aeVar)) {
            throw new t(String.format("Attempting to request an undeclared dependency Deferred<%s>.", aeVar));
        }
        com.google.firebase.g.c cVarB = ((n) this.f8925e).b(aeVar);
        return cVarB == null ? ac.b() : cVarB instanceof ac ? (ac) cVarB : ac.c(cVarB);
    }

    @Override // com.google.firebase.components.d
    public final com.google.firebase.g.c b(ae aeVar) {
        if (this.f8922b.contains(aeVar)) {
            return this.f8925e.b(aeVar);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", aeVar));
    }

    @Override // com.google.firebase.components.d
    public final com.google.firebase.g.c c(Class cls) {
        return b(new ae(ad.class, cls));
    }

    @Override // com.google.firebase.components.d
    public final com.google.firebase.g.c d(ae aeVar) {
        throw null;
    }

    @Override // com.google.firebase.components.d
    public final Object e(ae aeVar) {
        if (this.f8921a.contains(aeVar)) {
            return q.c(this.f8925e, aeVar);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", aeVar));
    }

    @Override // com.google.firebase.components.d
    public final Object f(Class cls) {
        if (!this.f8921a.contains(new ae(ad.class, cls))) {
            throw new t(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objD = q.d(this.f8925e, cls);
        if (!cls.equals(com.google.firebase.e.b.class)) {
            return objD;
        }
        return new af();
    }

    @Override // com.google.firebase.components.d
    public final Set g(ae aeVar) {
        if (this.f8924d.contains(aeVar)) {
            return (Set) this.f8925e.d(aeVar).a();
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", aeVar));
    }
}
