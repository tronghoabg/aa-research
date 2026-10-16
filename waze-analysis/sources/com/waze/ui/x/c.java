package com.waze.ui.x;

import androidx.compose.material.ModalBottomSheetState;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f43809a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f43810b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(ModalBottomSheetState modalBottomSheetState, h.c.e eVar) {
        super(2, eVar);
        this.f43810b = modalBottomSheetState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new c(this.f43810b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f43809a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f43809a = 1;
            if (this.f43810b.show(this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
