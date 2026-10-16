package com.waze.install;

/* loaded from: classes6.dex */
public final class ai extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f24743a;

    /* renamed from: b, reason: collision with root package name */
    int f24744b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ak f24745c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(ak akVar, h.c.e eVar) {
        super(eVar);
        this.f24745c = akVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f24743a = obj;
        this.f24744b |= Integer.MIN_VALUE;
        return this.f24745c.emit(null, this);
    }
}
