package com.waze.reports_v2.presentation.a;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.reports_v2.presentation.bg;
import com.waze.reports_v2.presentation.bw;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ac implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f34627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34629c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f34630d;

    public /* synthetic */ ac(MutableState mutableState, h.g.a.l lVar, h.g.a.l lVar2, int i2) {
        this.f34630d = i2;
        this.f34627a = mutableState;
        this.f34628b = lVar;
        this.f34629c = lVar2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        if (this.f34630d != 0) {
            com.waze.reports_v2.presentation.ap apVar = (com.waze.reports_v2.presentation.ap) obj;
            h.g.b.x.f(apVar, "it");
            ab abVar = (ab) this.f34628b;
            abVar.l(apVar);
            apVar.o(new v(abVar, this.f34629c));
            apVar.p((bg) this.f34627a);
            return h.ab.f48028a;
        }
        bw bwVar = (bw) obj;
        h.g.b.x.f(bwVar, "it");
        LifecycleOwner viewLifecycleOwner = bwVar.getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new al(this.f34627a, bwVar, null), 3);
        bwVar.s(new am(this.f34628b, this.f34629c));
        return h.ab.f48028a;
    }

    public /* synthetic */ ac(ab abVar, h.g.a.a aVar, bg bgVar, int i2) {
        this.f34630d = i2;
        this.f34628b = abVar;
        this.f34629c = aVar;
        this.f34627a = bgVar;
    }
}
