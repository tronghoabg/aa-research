package com.waze.cg.b;

import h.ab;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f22289a;

    c(e eVar) {
        this.f22289a = eVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        e eVar2 = this.f22289a;
        eVar2.f22297f.a("zero speed state changed, in zero speed: " + zBooleanValue);
        if (!zBooleanValue) {
            return ab.f48028a;
        }
        Object objC = e.c(eVar2, eVar);
        return objC == h.c.a.a.f48038a ? objC : ab.f48028a;
    }
}
