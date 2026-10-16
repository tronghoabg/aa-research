package com.waze.ui.z;

import androidx.compose.runtime.State;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aj implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ State f43909a;

    aj(State state) {
        this.f43909a = state;
    }

    public final Object a(float f2) {
        if (!Float.isNaN(f2)) {
            a.a.q(this.f43909a).invoke(new Integer(h.h.a.b(f2)));
        }
        return h.ab.f48028a;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        return a(((Number) obj).floatValue());
    }
}
