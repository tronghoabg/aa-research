package com.waze.main_screen.ac;

import androidx.compose.ui.geometry.Offset;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class c implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f25671a;

    c(e eVar) {
        this.f25671a = eVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        long jM7990unboximpl = ((Offset) obj).m7990unboximpl();
        e eVar2 = this.f25671a;
        if (!eVar2.f25675b.m8006containsk4lQ0M(jM7990unboximpl)) {
            eVar2.b().invoke();
        }
        return ab.f48028a;
    }
}
