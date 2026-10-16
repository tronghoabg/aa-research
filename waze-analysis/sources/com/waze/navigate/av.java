package com.waze.navigate;

import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class av extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f31019a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f31020b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f31021c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    av(com.waze.av.d.k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f31021c = i2;
        this.f31020b = kVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlinx.coroutines.am] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f31021c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? new av((kotlinx.coroutines.am) this.f31020b, eVar, 4) : new av((dz) this.f31020b, eVar, 3) : new av((cb) this.f31020b, eVar, 2) : new av((com.waze.av.d.k) this.f31020b, eVar, 1) : new av((CompletableDeferred) this.f31020b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f31021c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? ((av) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((av) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((av) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((av) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((av) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlinx.coroutines.am] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f31021c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f31019a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            this.f31019a = 1;
            Object objC = this.f31020b.c(this);
            return objC == aVar ? aVar : objC;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f31019a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            Object obj2 = this.f31020b;
            this.f31019a = 1;
            Object objD = com.waze.av.d.t.d((com.waze.av.d.k) obj2, this);
            return objD == aVar2 ? aVar2 : objD;
        }
        if (i2 == 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f31019a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            this.f31019a = 1;
            Object objB = ((cb) this.f31020b).f31160a.b(this);
            return objB == aVar3 ? aVar3 : objB;
        }
        if (i2 != 3) {
            h.c.a.a aVar4 = h.c.a.a.f48038a;
            if (this.f31019a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            this.f31019a = 1;
            Object objC2 = this.f31020b.c(this);
            return objC2 == aVar4 ? aVar4 : objC2;
        }
        h.c.a.a aVar5 = h.c.a.a.f48038a;
        if (this.f31019a == 0) {
            e.b.c.b(obj);
            dz dzVar = (dz) this.f31020b;
            this.f31019a = 1;
            if (dzVar.ab().collect(new dx(dzVar), this) == aVar5) {
                return aVar5;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    av(cb cbVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f31021c = i2;
        this.f31020b = cbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    av(dz dzVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f31021c = i2;
        this.f31020b = dzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    av(CompletableDeferred completableDeferred, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f31021c = i2;
        this.f31020b = completableDeferred;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    av(kotlinx.coroutines.am amVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f31021c = i2;
        this.f31020b = amVar;
    }
}
