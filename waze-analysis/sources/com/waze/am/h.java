package com.waze.am;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.ab;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final bn f14319a = ck.b(new b(a.f14305a, true));

    public final Object a(a aVar, h.c.e eVar) {
        Object objD = ai.d(ai.Q(new e(this.f14319a), new f(aVar, null)), eVar);
        return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
    }

    public final Object b(h.c.e eVar) {
        Object objD = ai.d(ai.Q(this.f14319a, new g(null)), eVar);
        return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
    }

    public final void c() {
        bn bnVar;
        Object objD;
        do {
            bnVar = this.f14319a;
            objD = bnVar.d();
        } while (!bnVar.f(objD, b.c((b) objD, null, 1)));
    }

    public final void d(a aVar) {
        bn bnVar;
        Object objD;
        x.f(aVar, TypedValues.CycleType.S_WAVE_PHASE);
        Objects.toString(aVar);
        com.waze.shared_infra.i.h.j("Init phase set: ".concat(String.valueOf(aVar)));
        do {
            bnVar = this.f14319a;
            objD = bnVar.d();
        } while (!bnVar.f(objD, b.c((b) objD, aVar, 2)));
    }

    public final boolean e() {
        return ((b) this.f14319a.d()).b();
    }
}
