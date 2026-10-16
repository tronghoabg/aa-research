package com.waze.ui.a;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f41684a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f41685b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(ModalBottomSheetState modalBottomSheetState, h.g.a.a aVar, h.c.e eVar) {
        super(2, eVar);
        this.f41684a = modalBottomSheetState;
        this.f41685b = aVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new k(this.f41684a, this.f41685b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((k) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ModalBottomSheetState modalBottomSheetState = this.f41684a;
        if (modalBottomSheetState.getCurrentValue() != ModalBottomSheetValue.Hidden && modalBottomSheetState.getTargetValue() == ModalBottomSheetValue.Hidden) {
            this.f41685b.invoke();
        }
        return ab.f48028a;
    }
}
