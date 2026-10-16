package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.publisher.MediationInfo;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class o extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public s f29668a;

    /* renamed from: b, reason: collision with root package name */
    public String f29669b;

    /* renamed from: c, reason: collision with root package name */
    public MediationInfo f29670c;

    /* renamed from: d, reason: collision with root package name */
    public com.moloco.sdk.acm.recorder.b f29671d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f29673f;

    /* renamed from: g, reason: collision with root package name */
    public int f29674g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29673f = sVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29672e = obj;
        this.f29674g |= Integer.MIN_VALUE;
        return this.f29673f.b(null, null, null, this);
    }
}
