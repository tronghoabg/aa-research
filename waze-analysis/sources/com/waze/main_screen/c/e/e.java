package com.waze.main_screen.c.e;

/* loaded from: classes6.dex */
public final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26203a;

    /* renamed from: b, reason: collision with root package name */
    int f26204b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f26205c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, h.c.e eVar) {
        super(eVar);
        this.f26205c = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26203a = obj;
        this.f26204b |= Integer.MIN_VALUE;
        return this.f26205c.emit(null, this);
    }
}
