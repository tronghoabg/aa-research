package com.waze.main_screen.a;

import com.waze.cs;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.am;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class c extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f25600a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f25601b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ am f25602c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, am amVar, e eVar) {
        super(2, eVar);
        this.f25601b = dVar;
        this.f25602c = amVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new c(this.f25601b, this.f25602c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((af) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f25600a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            d dVar = this.f25601b;
            this.f25600a = 1;
            if (cs.d(dVar.f25604b).collect(new b(this.f25602c, dVar), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
