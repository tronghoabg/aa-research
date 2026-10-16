package com.waze.parking;

import h.ab;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class w implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y f32999a;

    w(y yVar) {
        this.f32999a = yVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object objD;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        bn bnVar = this.f32999a.f33010h;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, r.d((r) objD, zBooleanValue, null, 5)));
        return ab.f48028a;
    }
}
