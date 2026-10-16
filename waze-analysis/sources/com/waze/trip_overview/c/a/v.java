package com.waze.trip_overview.c.a;

import androidx.compose.runtime.State;
import com.waze.trip_overview.ex;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class v extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f41263a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ State f41264b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(ab abVar, State state, h.c.e eVar) {
        super(2, eVar);
        this.f41263a = abVar;
        this.f41264b = state;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new v(this.f41263a, this.f41264b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((v) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        if (ab.M(this.f41264b) != null) {
            this.f41263a.h().l(ex.f41448a);
        }
        return h.ab.f48028a;
    }
}
