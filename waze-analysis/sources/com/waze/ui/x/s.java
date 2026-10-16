package com.waze.ui.x;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class s extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f43836a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MutableState f43837b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ State f43838c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(ModalBottomSheetState modalBottomSheetState, MutableState mutableState, State state, h.c.e eVar) {
        super(2, eVar);
        this.f43836a = modalBottomSheetState;
        this.f43837b = mutableState;
        this.f43838c = state;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new s(this.f43836a, this.f43837b, this.f43838c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((s) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ModalBottomSheetState modalBottomSheetState = this.f43836a;
        if (modalBottomSheetState.getCurrentValue() != ModalBottomSheetValue.Hidden) {
            this.f43837b.setValue(true);
        }
        if (((Boolean) this.f43837b.getValue()).booleanValue() && modalBottomSheetState.getCurrentValue() == ModalBottomSheetValue.Hidden && modalBottomSheetState.getTargetValue() == ModalBottomSheetValue.Hidden) {
            a.a.q(this.f43838c).invoke(l.f43823b);
        }
        return ab.f48028a;
    }
}
