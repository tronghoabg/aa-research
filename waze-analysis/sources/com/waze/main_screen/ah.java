package com.waze.main_screen;

import androidx.lifecycle.ViewModel;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ah extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f25822a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f25823b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ViewModel f25824c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f25825d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(com.waze.bi.j jVar, ax axVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f25825d = i2;
        this.f25823b = jVar;
        this.f25824c = axVar;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [com.waze.br.a.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.waze.bi.j, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f25825d;
        if (i2 == 0) {
            return new ah((com.waze.sharedui.profile.b) this.f25823b, (ax) this.f25824c, eVar, 0);
        }
        if (i2 == 1) {
            return new ah((com.waze.main_screen.t.aw) this.f25824c, (com.waze.br.a.i) this.f25823b, eVar, 1);
        }
        if (i2 == 2) {
            return new ah((com.waze.bi.j) this.f25823b, (ax) this.f25824c, eVar, 2);
        }
        if (i2 == 3) {
            return new ah((ax) this.f25824c, (com.waze.ui.o.c) this.f25823b, eVar, 3);
        }
        ViewModel viewModel = this.f25824c;
        if (i2 != 4) {
            return new ah((ax) viewModel, (com.waze.ui.o.t) this.f25823b, eVar, 5);
        }
        return new ah((ax) viewModel, (com.waze.ui.o.c) this.f25823b, eVar, 4, null);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f25825d;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [com.waze.bi.j, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f25825d;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f25822a == 0) {
                e.b.c.b(obj);
                Object obj2 = this.f25823b;
                ViewModel viewModel = this.f25824c;
                this.f25822a = 1;
                if (((com.waze.sharedui.profile.b) obj2).f().collect(new ag(viewModel, 0), this) == aVar) {
                    return aVar;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f25822a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                ViewModel viewModel2 = this.f25824c;
                this.f25822a = 1;
                if (((com.waze.main_screen.t.aw) viewModel2).s(((com.waze.br.a.g) this.f25823b).a(), this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f25822a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                ?? r6 = this.f25823b;
                ViewModel viewModel3 = this.f25824c;
                this.f25822a = 1;
                if (r6.e().collect(new ag(viewModel3, 3), this) == aVar3) {
                    return aVar3;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 3) {
            h.c.a.a aVar4 = h.c.a.a.f48038a;
            if (this.f25822a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                ViewModel viewModel4 = this.f25824c;
                Object obj3 = this.f25823b;
                this.f25822a = 1;
                if (((ax) viewModel4).f25856e.a(((com.waze.ui.o.c) obj3).f(), this) == aVar4) {
                    return aVar4;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 4) {
            h.c.a.a aVar5 = h.c.a.a.f48038a;
            if (this.f25822a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                ViewModel viewModel5 = this.f25824c;
                Object obj4 = this.f25823b;
                this.f25822a = 1;
                if (((ax) viewModel5).m.emit(new al(((com.waze.ui.o.r) obj4).a()), this) == aVar5) {
                    return aVar5;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar6 = h.c.a.a.f48038a;
        if (this.f25822a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ViewModel viewModel6 = this.f25824c;
            Object obj5 = this.f25823b;
            this.f25822a = 1;
            if (((ax) viewModel6).f25856e.b(((com.waze.ui.o.c) obj5).f(), this) == aVar6) {
                return aVar6;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(ax axVar, com.waze.ui.o.c cVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f25825d = i2;
        this.f25824c = axVar;
        this.f25823b = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(ax axVar, com.waze.ui.o.c cVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f25825d = i2;
        this.f25824c = axVar;
        this.f25823b = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(ax axVar, com.waze.ui.o.t tVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f25825d = i2;
        this.f25824c = axVar;
        this.f25823b = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(com.waze.main_screen.t.aw awVar, com.waze.br.a.i iVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f25825d = i2;
        this.f25824c = awVar;
        this.f25823b = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(com.waze.sharedui.profile.b bVar, ax axVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f25825d = i2;
        this.f25823b = bVar;
        this.f25824c = axVar;
    }
}
