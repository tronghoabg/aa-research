package com.moloco.sdk.internal.ilrd;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class j extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public m f28570a;

    /* renamed from: b, reason: collision with root package name */
    public Nf.a f28571b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f28572c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f28573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f28574e;

    /* renamed from: f, reason: collision with root package name */
    public int f28575f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f28574e = mVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f28573d = obj;
        this.f28575f |= Integer.MIN_VALUE;
        return m.d(this.f28574e, this);
    }
}
