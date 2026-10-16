package com.waze.bw.c.d;

import androidx.compose.material.ModalBottomSheetState;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cl implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f18038a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f18039b;

    cl(Object obj, int i2) {
        this.f18039b = i2;
        this.f18038a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        if (this.f18039b != 0) {
            ((Boolean) obj).booleanValue();
            Object objHide = ((ModalBottomSheetState) this.f18038a).hide(eVar);
            return objHide == h.c.a.a.f48038a ? objHide : h.ab.f48028a;
        }
        if (((Boolean) obj).booleanValue()) {
            ct.l(this.f18038a, null);
        }
        return h.ab.f48028a;
    }
}
