package com.waze.location.a;

/* loaded from: classes6.dex */
public final class t extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25215a;

    /* renamed from: b, reason: collision with root package name */
    int f25216b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ aa f25217c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(aa aaVar, h.c.e eVar) {
        super(eVar);
        this.f25217c = aaVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25215a = obj;
        this.f25216b |= Integer.MIN_VALUE;
        return this.f25217c.emit(null, this);
    }
}
