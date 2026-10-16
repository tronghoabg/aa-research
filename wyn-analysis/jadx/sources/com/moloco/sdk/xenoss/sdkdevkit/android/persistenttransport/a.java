package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import java.util.Map;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class a extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public UrlGetRequestWorker f32426a;

    /* renamed from: b, reason: collision with root package name */
    public Map f32427b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f32428c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UrlGetRequestWorker f32429d;

    /* renamed from: e, reason: collision with root package name */
    public int f32430e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(UrlGetRequestWorker urlGetRequestWorker, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f32429d = urlGetRequestWorker;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f32428c = obj;
        this.f32430e |= Integer.MIN_VALUE;
        return this.f32429d.doWork(this);
    }
}
