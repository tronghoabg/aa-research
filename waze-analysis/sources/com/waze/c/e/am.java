package com.waze.c.e;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.Interaction;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class am implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f18525a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f18526b;

    am(Object obj, int i2) {
        this.f18526b = i2;
        this.f18525a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [h.g.a.a, java.lang.Object] */
    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        int i2 = this.f18526b;
        if (i2 == 0) {
            com.waze.ui.b.o oVar = com.waze.ui.b.o.f42079a;
            int iOrdinal = ((com.waze.ui.b.o) obj).ordinal();
            if (iOrdinal == 0) {
                ((bk) this.f18525a).l();
            } else {
                if (iOrdinal != 1) {
                    throw new h.i();
                }
                ((bk) this.f18525a).k();
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            if (((Interaction) obj) instanceof DragInteraction.Stop) {
                this.f18525a.invoke();
            }
            return h.ab.f48028a;
        }
        com.waze.c.d.t tVar = (com.waze.c.d.t) obj;
        bc bcVar = (bc) this.f18525a;
        bcVar.f18577k.e(tVar);
        Object objJ = bcVar.f18578l.j(tVar, eVar);
        return objJ == h.c.a.a.f48038a ? objJ : h.ab.f48028a;
    }
}
