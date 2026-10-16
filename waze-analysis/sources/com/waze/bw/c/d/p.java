package com.waze.bw.c.d;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.State;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class p extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f18152a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f18153b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f18154c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(ModalBottomSheetState modalBottomSheetState, h.g.a.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18154c = i2;
        this.f18153b = modalBottomSheetState;
        this.f18152a = lVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f18154c != 0) {
            return new p(this.f18152a, (State) this.f18153b, eVar, 1);
        }
        return new p((ModalBottomSheetState) this.f18153b, this.f18152a, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f18154c != 0 ? ((p) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((p) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f18154c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            if (((Boolean) this.f18153b.getValue()).booleanValue()) {
                this.f18152a.invoke(bh.f17988a);
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) this.f18153b;
        if (modalBottomSheetState.getCurrentValue() == ModalBottomSheetValue.Hidden && modalBottomSheetState.getTargetValue() == ModalBottomSheetValue.Hidden) {
            this.f18152a.invoke(com.waze.bw.c.d.a.t.f17944a);
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(h.g.a.l lVar, State state, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18154c = i2;
        this.f18152a = lVar;
        this.f18153b = state;
    }
}
