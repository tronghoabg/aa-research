package com.waze.main_screen.r.a;

import androidx.compose.runtime.State;
import com.waze.sound.e.j;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class a extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ State f27409a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f27410b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(j jVar, State state, h.c.e eVar) {
        super(2, eVar);
        this.f27410b = jVar;
        this.f27409a = state;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new a(this.f27410b, this.f27409a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((a) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        String strI = b.i(this.f27409a);
        j jVar = this.f27410b;
        if (strI == null) {
            jVar.j();
        } else {
            jVar.k();
        }
        return ab.f48028a;
    }
}
