package com.waze.sound;

/* loaded from: classes7.dex */
public final class fg extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40007a;

    /* renamed from: b, reason: collision with root package name */
    int f40008b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ fh f40009c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(fh fhVar, h.c.e eVar) {
        super(eVar);
        this.f40009c = fhVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40007a = obj;
        this.f40008b |= Integer.MIN_VALUE;
        return this.f40009c.emit(null, this);
    }
}
