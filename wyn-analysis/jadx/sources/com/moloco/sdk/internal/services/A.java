package com.moloco.sdk.internal.services;

import Hf.InterfaceC0590b0;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class A extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public B f29369a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0590b0 f29370b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f29371c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f29372d;

    /* renamed from: e, reason: collision with root package name */
    public int f29373e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b5, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29372d = b5;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29371c = obj;
        this.f29373e |= Integer.MIN_VALUE;
        return this.f29372d.a(null, null, null, null, this);
    }
}
