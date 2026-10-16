package com.waze.sharedrive.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class m extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38113a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f38114b;

    /* renamed from: c, reason: collision with root package name */
    int f38115c;

    /* renamed from: d, reason: collision with root package name */
    String f38116d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(p pVar, h.c.e eVar) {
        super(eVar);
        this.f38114b = pVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38113a = obj;
        this.f38115c |= Integer.MIN_VALUE;
        return this.f38114b.j(null, null, this);
    }
}
