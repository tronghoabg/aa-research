package com.waze.main_screen.af.b;

import androidx.compose.runtime.MutableIntState;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.asks.ah;
import com.waze.asks.as;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f25797a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ as f25798b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MutableIntState f25799c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ l f25800d;

    g(i iVar, as asVar, MutableIntState mutableIntState, l lVar) {
        this.f25797a = iVar;
        this.f25798b = asVar;
        this.f25799c = mutableIntState;
        this.f25800d = lVar;
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ah ahVar = (ah) obj;
        x.f(ahVar, "it");
        LifecycleOwner viewLifecycleOwner = ahVar.getViewLifecycleOwner();
        x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        aj.z(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new e(this.f25799c, ahVar, null), 3);
        i iVar = this.f25797a;
        iVar.f(this.f25798b);
        ahVar.h(new f(this.f25800d, iVar));
        return ab.f48028a;
    }
}
