package io.ktor.utils.io;

import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class W extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f37373b;

    /* renamed from: c, reason: collision with root package name */
    public int f37374c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x5, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f37373b = x5;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f37372a = obj;
        this.f37374c |= Integer.MIN_VALUE;
        return this.f37373b.g(0, this);
    }
}
