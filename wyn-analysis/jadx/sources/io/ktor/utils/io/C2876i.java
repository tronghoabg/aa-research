package io.ktor.utils.io;

import lf.AbstractC3464c;

/* renamed from: io.ktor.utils.io.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2876i extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C2880m f37400a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2880m f37402c;

    /* renamed from: d, reason: collision with root package name */
    public int f37403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2876i(C2880m c2880m, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f37402c = c2880m;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f37401b = obj;
        this.f37403d |= Integer.MIN_VALUE;
        return this.f37402c.e(this);
    }
}
