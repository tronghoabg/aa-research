package com.waze.main_screen.n;

import androidx.compose.animation.core.Animatable;
import com.waze.asks.ak;
import com.waze.map.main.aa;
import com.waze.z.a.x;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class a extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f26671a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26672b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Animatable f26673c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.ui.p.g f26674d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(Animatable animatable, com.waze.ui.p.g gVar, e eVar) {
        super(2, eVar);
        this.f26673c = animatable;
        this.f26674d = gVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        a aVar = new a(this.f26673c, this.f26674d, eVar);
        aVar.f26672b = obj;
        return aVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((a) create((aa) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f26671a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            aa aaVar = (aa) this.f26672b;
            this.f26671a = 1;
            if (Animatable.animateTo$default(this.f26673c, new Integer(aaVar.a()), com.waze.z.a.aa.c(x.f46210a), null, new ak(this.f26674d, aaVar, 16, null), this, 4, null) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
