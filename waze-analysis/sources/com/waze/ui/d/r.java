package com.waze.ui.d;

import androidx.compose.runtime.MutableFloatState;
import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f42164a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f42165b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MutableFloatState f42166c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(t tVar, MutableFloatState mutableFloatState, h.c.e eVar) {
        super(2, eVar);
        this.f42165b = tVar;
        this.f42166c = mutableFloatState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new r(this.f42165b, this.f42166c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((r) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.f42164a;
        e.b.c.b(obj);
        do {
            MutableFloatState mutableFloatState = this.f42166c;
            if (s.l(mutableFloatState) > 1.0f) {
                return ab.f48028a;
            }
            t tVar = this.f42165b;
            mutableFloatState.setFloatValue(s.m(tVar.c(), tVar.a()));
            this.f42164a = 1;
        } while (aj.q(16L, this) != aVar);
        return aVar;
    }
}
