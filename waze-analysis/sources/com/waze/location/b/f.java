package com.waze.location.b;

import com.waze.location.x;
import com.waze.shared_infra.q.n;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class f extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f25312a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f25313b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n f25314c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f25315d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f25316e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(i iVar, n nVar, CompletableDeferred completableDeferred, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f25316e = i2;
        this.f25313b = iVar;
        this.f25314c = nVar;
        this.f25315d = completableDeferred;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f25316e != 0 ? new f(this.f25313b, this.f25314c, this.f25315d, eVar, 1, null) : new f(this.f25313b, this.f25314c, this.f25315d, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f25316e != 0 ? ((f) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((f) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f25316e != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f25312a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f25312a = 1;
                obj = this.f25313b.f25327b.b(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            h.o.c cVar = h.o.a.f48264a;
            c cVar2 = new c((com.waze.sharedui.e.c) obj, h.o.c.j(this.f25314c.a(), h.o.d.f48272c), b.f25301b);
            i iVar = this.f25313b;
            CompletableDeferred completableDeferred = this.f25315d;
            iVar.f25329d.a("LocationService - location found: " + cVar2 + ", checking for freshness");
            if (iVar.g(cVar2)) {
                completableDeferred.a(cVar2);
            }
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f25312a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f25312a = 1;
            obj = ai.j(this.f25313b.f25328c.b(), this);
            if (obj == aVar2) {
                return aVar2;
            }
        }
        x xVar = (x) obj;
        if (xVar != null) {
            n nVar = this.f25314c;
            i iVar2 = this.f25313b;
            CompletableDeferred completableDeferred2 = this.f25315d;
            com.waze.sharedui.e.c cVarG = com.waze.shared_infra.l.b.g(xVar.a());
            h.o.c cVar3 = h.o.a.f48264a;
            c cVar4 = new c(cVarG, h.o.c.j(nVar.a(), h.o.d.f48272c), b.f25300a);
            iVar2.f25329d.a("Raw Location - location found: " + cVar4 + ", checking for freshness");
            if (iVar2.g(cVar4)) {
                completableDeferred2.a(cVar4);
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(i iVar, n nVar, CompletableDeferred completableDeferred, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f25316e = i2;
        this.f25313b = iVar;
        this.f25314c = nVar;
        this.f25315d = completableDeferred;
    }
}
