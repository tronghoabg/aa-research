package com.waze.main_screen.a.b.a;

import com.waze.main_screen.a.b.i;
import h.ab;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class a implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f25572a;

    a(g gVar) {
        this.f25572a = gVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object objD;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        bn bnVar = this.f25572a.f25585e;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, new i(zBooleanValue)));
        return ab.f48028a;
    }
}
