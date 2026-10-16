package com.waze.main_screen.u.b;

import androidx.compose.runtime.State;
import com.waze.ui.u.s;
import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class e extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f27694a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ State f27695b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(a aVar, State state, h.c.e eVar) {
        super(2, eVar);
        this.f27694a = aVar;
        this.f27695b = state;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new e(this.f27694a, this.f27695b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f27694a.d(f.g(this.f27695b) instanceof s);
        return ab.f48028a;
    }
}
