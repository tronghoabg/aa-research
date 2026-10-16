package com.waze.network;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aq extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f31893a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ar f31894b;

    /* renamed from: c, reason: collision with root package name */
    int f31895c;

    /* renamed from: d, reason: collision with root package name */
    ar f31896d;

    /* renamed from: e, reason: collision with root package name */
    String f31897e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aq(ar arVar, h.c.e eVar) {
        super(eVar);
        this.f31894b = arVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31893a = obj;
        this.f31895c |= Integer.MIN_VALUE;
        return ar.a(this.f31894b, this);
    }
}
