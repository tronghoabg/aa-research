package com.moloco.sdk.acm.http;

import Jd.v;
import ef.C2530n;
import java.io.Serializable;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class f extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public g f28435a;

    /* renamed from: b, reason: collision with root package name */
    public v f28436b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f28437c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f28438d;

    /* renamed from: e, reason: collision with root package name */
    public int f28439e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f28438d = gVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f28437c = obj;
        this.f28439e |= Integer.MIN_VALUE;
        Serializable serializableA = this.f28438d.a(0L, null, null, this);
        return serializableA == kf.a.f39711a ? serializableA : new C2530n(serializableA);
    }
}
