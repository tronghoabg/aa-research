package com.moloco.sdk.internal.services.bidtoken;

import R8.C0805a;
import ef.C2530n;
import java.io.Serializable;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class s extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C0805a f29538a;

    /* renamed from: b, reason: collision with root package name */
    public com.moloco.sdk.acm.recorder.b f29539b;

    /* renamed from: c, reason: collision with root package name */
    public String f29540c;

    /* renamed from: d, reason: collision with root package name */
    public g f29541d;

    /* renamed from: e, reason: collision with root package name */
    public Nf.d f29542e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f29543f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0805a f29544g;

    /* renamed from: h, reason: collision with root package name */
    public int f29545h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C0805a c0805a, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29544g = c0805a;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29543f = obj;
        this.f29545h |= Integer.MIN_VALUE;
        Serializable serializableA = this.f29544g.a(null, null, null, this);
        return serializableA == kf.a.f39711a ? serializableA : new C2530n(serializableA);
    }
}
