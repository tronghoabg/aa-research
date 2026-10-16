package com.moloco.sdk.acm;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class e extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public m f28366a;

    /* renamed from: b, reason: collision with root package name */
    public Nf.d f28367b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f28368c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f28369d;

    /* renamed from: e, reason: collision with root package name */
    public int f28370e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.f28369d = fVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f28368c = obj;
        this.f28370e |= Integer.MIN_VALUE;
        return this.f28369d.c(null, this);
    }
}
