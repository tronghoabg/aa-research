package com.waze.uid.c;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bz implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.uid.state_impl.g.w f44338a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f44339b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f44340c;

    bz(com.waze.uid.state_impl.g.w wVar, ModalBottomSheetState modalBottomSheetState, h.g.a.a aVar) {
        this.f44338a = wVar;
        this.f44339b = modalBottomSheetState;
        this.f44340c = aVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        com.waze.uid.state_impl.g.w wVar = this.f44338a;
        if ((wVar != null ? wVar.a() : null) == com.waze.uid.state_impl.g.x.f44700b) {
            ModalBottomSheetState modalBottomSheetState = this.f44339b;
            if (modalBottomSheetState.getCurrentValue() != ModalBottomSheetValue.Hidden && modalBottomSheetState.getTargetValue() == ModalBottomSheetValue.Hidden) {
                this.f44340c.invoke();
            }
        }
        return h.ab.f48028a;
    }
}
