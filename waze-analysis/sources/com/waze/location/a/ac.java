package com.waze.location.a;

/* loaded from: classes6.dex */
public final class ac extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25179a;

    /* renamed from: b, reason: collision with root package name */
    int f25180b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ aa f25181c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(aa aaVar, h.c.e eVar) {
        super(eVar);
        this.f25181c = aaVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25179a = obj;
        this.f25180b |= Integer.MIN_VALUE;
        return this.f25181c.emit(null, this);
    }
}
