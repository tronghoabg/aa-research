package com.waze.ui.k;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusManager;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FocusManager f42451a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MutableState f42452b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(FocusManager focusManager, MutableState mutableState, h.c.e eVar) {
        super(2, eVar);
        this.f42451a = focusManager;
        this.f42452b = mutableState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new o(this.f42451a, this.f42452b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((o) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        MutableState mutableState = this.f42452b;
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            FocusManager.CC.clearFocus$default(this.f42451a, false, 1, null);
            mutableState.setValue(Boolean.valueOf(false));
        }
        return ab.f48028a;
    }
}
