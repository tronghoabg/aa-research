package com.waze.uid;

import com.waze.authentication.aw;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ak extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f44126a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f44127b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f44128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ak(aw awVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f44128c = i2;
        this.f44127b = awVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f44128c;
        Object obj2 = this.f44127b;
        return i2 != 0 ? new ak((aw) obj2, eVar, 1) : new ak((al) obj2, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f44128c != 0 ? ((ak) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ak) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f44128c == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f44126a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            this.f44126a = 1;
            Object objI = kotlinx.coroutines.b.ai.i(((al) this.f44127b).f44131c.a(), new aj(null, 0), this);
            return objI == aVar ? aVar : objI;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f44126a != 0) {
            e.b.c.b(obj);
            return obj;
        }
        e.b.c.b(obj);
        Object obj2 = this.f44127b;
        this.f44126a = 1;
        Object objD = ((aw) obj2).d(this);
        return objD == aVar2 ? aVar2 : objD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ak(al alVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f44128c = i2;
        this.f44127b = alVar;
    }
}
