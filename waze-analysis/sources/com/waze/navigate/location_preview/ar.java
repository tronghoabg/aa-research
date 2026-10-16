package com.waze.navigate.location_preview;

import androidx.compose.ui.platform.ComposeView;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ar extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f31565a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f31566b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f31567c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f31568d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(at atVar, com.waze.ui.m.cb cbVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f31568d = i2;
        this.f31566b = atVar;
        this.f31567c = cbVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlinx.coroutines.b.bq] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f31568d != 0) {
            return new ar((kotlinx.coroutines.b.bq) this.f31567c, (ComposeView) this.f31566b, eVar, 1);
        }
        return new ar((at) this.f31566b, (com.waze.ui.m.cb) this.f31567c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f31568d != 0 ? ((ar) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ar) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlinx.coroutines.b.bq] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f31568d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f31565a == 0) {
                e.b.c.b(obj);
                this.f31565a = 1;
                if (this.f31567c.collect(new n((ComposeView) this.f31566b), this) == aVar) {
                    return aVar;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f31565a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            bn bnVar = ((at) this.f31566b).f31575c;
            if (bnVar == null) {
                h.g.b.x.j("viewModel");
                bnVar = null;
            }
            Object obj2 = this.f31567c;
            this.f31565a = 1;
            if (bnVar.b((com.waze.ui.m.cb) obj2, this) == aVar2) {
                return aVar2;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(kotlinx.coroutines.b.bq bqVar, ComposeView composeView, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f31568d = i2;
        this.f31567c = bqVar;
        this.f31566b = composeView;
    }
}
