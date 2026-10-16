package io.ktor.utils.io;

import lf.AbstractC3464c;

/* renamed from: io.ktor.utils.io.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2882o extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2884q f37419b;

    /* renamed from: c, reason: collision with root package name */
    public int f37420c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2882o(C2884q c2884q, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f37419b = c2884q;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f37418a = obj;
        this.f37420c |= Integer.MIN_VALUE;
        return this.f37419b.c(this);
    }
}
