package com.waze.uid.c;

import androidx.compose.ui.focus.FocusRequester;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ax extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FocusRequester f44237a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f44238b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ax(FocusRequester focusRequester, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f44238b = i2;
        this.f44237a = focusRequester;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f44238b != 0 ? new ax(this.f44237a, eVar, 1, null) : new ax(this.f44237a, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f44238b != 0 ? ((ax) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ax) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f44238b != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            FocusRequester.m7885requestFocus3ESFkO8$default(this.f44237a, 0, 1, null);
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        FocusRequester.m7885requestFocus3ESFkO8$default(this.f44237a, 0, 1, null);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ax(FocusRequester focusRequester, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f44238b = i2;
        this.f44237a = focusRequester;
    }
}
