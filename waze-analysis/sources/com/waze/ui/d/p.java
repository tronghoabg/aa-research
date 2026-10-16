package com.waze.ui.d;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.MutableIntState;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class p extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f42159a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f42160b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MutableIntState f42161c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(ModalBottomSheetState modalBottomSheetState, h.g.a.l lVar, MutableIntState mutableIntState, h.c.e eVar) {
        super(2, eVar);
        this.f42159a = modalBottomSheetState;
        this.f42160b = lVar;
        this.f42161c = mutableIntState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new p(this.f42159a, this.f42160b, this.f42161c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((p) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        if (this.f42159a.getCurrentValue() == ModalBottomSheetValue.Expanded) {
            this.f42160b.invoke(new g(this.f42161c.getIntValue()));
        }
        return ab.f48028a;
    }
}
