package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import java.util.Map;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class b extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public UrlPostRequestWorker f32431a;

    /* renamed from: b, reason: collision with root package name */
    public Map f32432b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f32433c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UrlPostRequestWorker f32434d;

    /* renamed from: e, reason: collision with root package name */
    public int f32435e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(UrlPostRequestWorker urlPostRequestWorker, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f32434d = urlPostRequestWorker;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f32433c = obj;
        this.f32435e |= Integer.MIN_VALUE;
        return this.f32434d.doWork(this);
    }
}
