package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ar implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ at f38348a;

    ar(at atVar) {
        this.f38348a = atVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        at atVar = this.f38348a;
        com.waze.sharedrive.g.z zVar = (com.waze.sharedrive.g.z) atVar.f38362k.d();
        if (zBooleanValue && zVar == null) {
            atVar.f38362k.e(atVar.y(true));
        } else if (zVar != null && !zBooleanValue) {
            atVar.f38362k.e(null);
            at.B(zVar);
        }
        return h.ab.f48028a;
    }
}
