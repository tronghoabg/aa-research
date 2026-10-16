package com.waze.ui.d;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class q extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f42162a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f42163b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(ModalBottomSheetState modalBottomSheetState, h.g.a.l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f42162a = modalBottomSheetState;
        this.f42163b = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new q(this.f42162a, this.f42163b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((q) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        if (this.f42162a.getTargetValue() != ModalBottomSheetValue.Expanded) {
            this.f42163b.invoke(j.f42147a);
        }
        return ab.f48028a;
    }
}
