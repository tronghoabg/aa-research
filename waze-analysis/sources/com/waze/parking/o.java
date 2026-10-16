package com.waze.parking;

import androidx.compose.runtime.State;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class o extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f32981a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f32982b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ State f32983c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(y yVar, State state, h.c.e eVar) {
        super(2, eVar);
        this.f32982b = yVar;
        this.f32983c = state;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new o(this.f32982b, this.f32983c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((o) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f32981a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f32981a = 1;
            obj = this.f32982b.e(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        a.a.q(this.f32983c).invoke(bool);
        return ab.f48028a;
    }
}
