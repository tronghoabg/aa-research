package io.ktor.utils.io;

import lf.AbstractC3464c;

/* renamed from: io.ktor.utils.io.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2881n extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37415a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2884q f37416b;

    /* renamed from: c, reason: collision with root package name */
    public int f37417c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2881n(C2884q c2884q, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f37416b = c2884q;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f37415a = obj;
        this.f37417c |= Integer.MIN_VALUE;
        return this.f37416b.a(this);
    }
}
