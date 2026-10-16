package com.waze.ui.e;

import androidx.compose.runtime.MutableState;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y f42185a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f42186b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f42187c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ MutableState f42188d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(y yVar, float f2, float f3, MutableState mutableState, h.c.e eVar) {
        super(2, eVar);
        this.f42185a = yVar;
        this.f42186b = f2;
        this.f42187c = f3;
        this.f42188d = mutableState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new b(this.f42185a, this.f42186b, this.f42187c, this.f42188d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return h.ab.f48028a;
    }
}
