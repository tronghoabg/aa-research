package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fu implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gb f40045a;

    fu(gb gbVar) {
        this.f40045a = gbVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        gb gbVar = this.f40045a;
        gbVar.f40074g.a("observeRouteSoundToSpeakers collected: " + zBooleanValue);
        Object objG = gb.g(gbVar, zBooleanValue, eVar);
        return objG == h.c.a.a.f48038a ? objG : h.ab.f48028a;
    }
}
