package com.waze.search.v2;

import java.util.Collection;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ei extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f36429a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fi f36430b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f36431c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Collection f36432d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f36433e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ei(fi fiVar, com.waze.ev.f fVar, Set set, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f36433e = i2;
        this.f36430b = fiVar;
        this.f36431c = fVar;
        this.f36432d = set;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Collection, java.util.Set] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f36433e != 0) {
            ei eiVar = new ei(this.f36430b, (com.waze.ev.g) this.f36431c, this.f36432d, eVar, 1);
            eiVar.f36429a = ((Boolean) obj).booleanValue();
            return eiVar;
        }
        ei eiVar2 = new ei(this.f36430b, (com.waze.ev.f) this.f36431c, (Set) this.f36432d, eVar, 0);
        eiVar2.f36429a = ((Boolean) obj).booleanValue();
        return eiVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.f36433e != 0) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((ei) create(bool, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
        }
        Boolean bool2 = (Boolean) obj;
        bool2.booleanValue();
        return ((ei) create(bool2, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection, java.util.Set] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f36433e != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            Collection collection = this.f36432d;
            Object obj2 = this.f36431c;
            this.f36430b.aa(new bq(((com.waze.ev.g) obj2).a(), this.f36429a, collection));
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ?? r4 = this.f36432d;
        Object obj3 = this.f36431c;
        this.f36430b.aa(new br(((com.waze.ev.f) obj3).d(), this.f36429a, r4));
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ei(fi fiVar, com.waze.ev.g gVar, Collection collection, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f36433e = i2;
        this.f36430b = fiVar;
        this.f36431c = gVar;
        this.f36432d = collection;
    }
}
