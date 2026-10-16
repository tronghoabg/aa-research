package com.waze.main_screen.p;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class be extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27180a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.main_screen.m.p f27181b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LifecycleOwner f27182c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Density f27183d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bf f27184e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f27185f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    be(com.waze.main_screen.m.p pVar, LifecycleOwner lifecycleOwner, Density density, bf bfVar, h.c.e eVar) {
        super(2, eVar);
        this.f27181b = pVar;
        this.f27182c = lifecycleOwner;
        this.f27183d = density;
        this.f27184e = bfVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        be beVar = new be(this.f27181b, this.f27182c, this.f27183d, this.f27184e, eVar);
        beVar.f27185f = obj;
        return beVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((be) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f27180a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f27185f;
            com.waze.main_screen.m.p pVar = this.f27181b;
            com.waze.map.main.aa aaVarC = pVar.c();
            Animatable animatable = new Animatable(new Integer(aaVarC.a()), VectorConvertersKt.getVectorConverter(h.g.b.v.f48128a), null, null, 12, null);
            kotlinx.coroutines.aj.z(afVar, null, null, new an(pVar, animatable, (h.c.e) null, 3), 3);
            kotlinx.coroutines.b.k kVarSnapshotFlow = SnapshotStateKt.snapshotFlow(new com.waze.car_lib.a.a(animatable, 6));
            Density density = this.f27183d;
            bf bfVar = this.f27184e;
            this.f27180a = 1;
            if (FlowExtKt.flowWithLifecycle$default(kotlinx.coroutines.b.ai.y(kotlinx.coroutines.b.ai.q(kVarSnapshotFlow, SnapshotStateKt.snapshotFlow(new com.waze.car_lib.e.d(density, bfVar, 9, null)), new bd(pVar, null))), this.f27182c.getLifecycle(), null, 2, null).collect(new aq(bfVar, 5), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
