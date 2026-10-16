package io.ktor.utils.io;

import lf.AbstractC3464c;

/* renamed from: io.ktor.utils.io.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2875h extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public int f37395a;

    /* renamed from: b, reason: collision with root package name */
    public C2880m f37396b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f37397c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2880m f37398d;

    /* renamed from: e, reason: collision with root package name */
    public int f37399e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2875h(C2880m c2880m, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f37398d = c2880m;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f37397c = obj;
        this.f37399e |= Integer.MIN_VALUE;
        return this.f37398d.g(0, this);
    }
}
