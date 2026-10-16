package com.waze.main_screen.t;

import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class w implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f27633a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f27634b;

    w(Object obj, int i2) {
        this.f27634b = i2;
        this.f27633a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.compose.runtime.ProduceStateScope, java.lang.Object] */
    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object objD;
        Object objD2;
        int i2 = this.f27634b;
        if (i2 == 0) {
            if (((Boolean) obj).booleanValue()) {
                ((am) this.f27633a).f().b(com.waze.ui.u.n.f43463a);
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            ((am) this.f27633a).r().t();
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            ((com.waze.main_screen.m.p) this.f27633a).d(new com.waze.main_screen.m.e(((Number) obj).intValue()));
            return h.ab.f48028a;
        }
        if (i2 == 3) {
            this.f27633a.setValue(Boolean.valueOf(((h.ab) obj) != null));
            return h.ab.f48028a;
        }
        if (i2 == 4) {
            ((com.waze.main_screen.m.p) this.f27633a).d(new com.waze.main_screen.m.f(((Number) obj).intValue()));
            return h.ab.f48028a;
        }
        if (i2 == 5) {
            com.waze.br.c.o oVar = (com.waze.br.c.o) obj;
            bn bnVar = ((aw) this.f27633a).C;
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, as.m((as) objD, null, null, null, null, null, null, false, null, null, oVar, false, null, 14335)));
            return h.ab.f48028a;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        aw awVar = (aw) this.f27633a;
        awVar.f27526c.a("navigation state changed to " + zBooleanValue);
        bn bnVar2 = awVar.C;
        do {
            objD2 = bnVar2.d();
        } while (!bnVar2.f(objD2, as.m((as) objD2, null, null, null, null, null, null, false, null, null, null, zBooleanValue, null, 12287)));
        return h.ab.f48028a;
    }
}
