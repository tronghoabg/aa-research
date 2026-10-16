package com.waze.main_screen.af.b;

import androidx.compose.runtime.MutableIntState;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f25788a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MutableIntState f25789b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(int i2, MutableIntState mutableIntState, h.c.e eVar) {
        super(2, eVar);
        this.f25788a = i2;
        this.f25789b = mutableIntState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new b(this.f25788a, this.f25789b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f25789b.setIntValue(this.f25788a);
        return ab.f48028a;
    }
}
