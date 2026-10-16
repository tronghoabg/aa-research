package com.waze.uid.c;

import androidx.compose.ui.focus.FocusManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class q extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f44406a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f44407b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f44408c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ FocusManager f44409d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(String str, int i2, h.g.a.l lVar, FocusManager focusManager, h.c.e eVar) {
        super(2, eVar);
        this.f44406a = str;
        this.f44407b = i2;
        this.f44408c = lVar;
        this.f44409d = focusManager;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new q(this.f44406a, this.f44407b, this.f44408c, this.f44409d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((q) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        String str = this.f44406a;
        if (str.length() == this.f44407b) {
            this.f44408c.invoke(str);
            FocusManager.CC.clearFocus$default(this.f44409d, false, 1, null);
        }
        return h.ab.f48028a;
    }
}
