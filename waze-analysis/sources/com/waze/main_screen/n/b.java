package com.waze.main_screen.n;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.LifecycleOwner;
import com.waze.car_lib.au;
import com.waze.map.main.aa;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.v;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f26675a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.main_screen.m.p f26676b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LifecycleOwner f26677c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.ui.p.g f26678d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(com.waze.main_screen.m.p pVar, LifecycleOwner lifecycleOwner, com.waze.ui.p.g gVar, e eVar) {
        super(2, eVar);
        this.f26676b = pVar;
        this.f26677c = lifecycleOwner;
        this.f26678d = gVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new b(this.f26676b, this.f26677c, this.f26678d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((af) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f26675a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.main_screen.m.p pVar = this.f26676b;
            aa aaVarC = pVar.c();
            Animatable animatable = new Animatable(new Integer(aaVarC.a()), VectorConvertersKt.getVectorConverter(v.f48128a), null, null, 12, null);
            this.f26675a = 1;
            if (ai.e(FlowExtKt.flowWithLifecycle$default(ai.y(SnapshotStateKt.snapshotFlow(new au(pVar, 10))), this.f26677c.getLifecycle(), null, 2, null), new a(animatable, this.f26678d, null), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
