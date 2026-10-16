package com.waze.main_screen.p.a.b.a;

import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.Density;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class a extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Ref f26738a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f26739b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f26740c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Density f26741d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(Ref ref, int i2, int i3, Density density, h.c.e eVar) {
        super(2, eVar);
        this.f26738a = ref;
        this.f26739b = i2;
        this.f26740c = i3;
        this.f26741d = density;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new a(this.f26738a, this.f26739b, this.f26740c, this.f26741d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((a) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Ref ref = this.f26738a;
        com.waze.main_screen.bottom_bars.a.b bVar = (com.waze.main_screen.bottom_bars.a.b) ref.getValue();
        if (bVar != null) {
            bVar.d();
        }
        com.waze.main_screen.bottom_bars.a.b bVar2 = (com.waze.main_screen.bottom_bars.a.b) ref.getValue();
        if (bVar2 != null) {
            bVar2.g(this.f26739b);
        }
        h.k kVar = this.f26740c == 0 ? new h.k(new Integer(17), new Integer(0)) : new h.k(new Integer(49), new Integer(this.f26741d.mo2121roundToPx0680j_4(8.0f)));
        int iIntValue = ((Number) kVar.a()).intValue();
        int iIntValue2 = ((Number) kVar.b()).intValue();
        com.waze.main_screen.bottom_bars.a.b bVar3 = (com.waze.main_screen.bottom_bars.a.b) ref.getValue();
        if (bVar3 != null) {
            bVar3.f(iIntValue, iIntValue2);
        }
        return h.ab.f48028a;
    }
}
