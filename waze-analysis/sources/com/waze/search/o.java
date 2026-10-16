package com.waze.search;

import androidx.compose.ui.focus.FocusRequester;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f35993a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FocusRequester f35994b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(boolean z, FocusRequester focusRequester, h.c.e eVar) {
        super(2, eVar);
        this.f35993a = z;
        this.f35994b = focusRequester;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new o(this.f35993a, this.f35994b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((o) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        if (this.f35993a) {
            FocusRequester.m7885requestFocus3ESFkO8$default(this.f35994b, 0, 1, null);
        }
        return h.ab.f48028a;
    }
}
