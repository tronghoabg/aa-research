package com.moloco.sdk.internal.services.init;

import kotlin.jvm.internal.G;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class q extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Object f29680a;

    /* renamed from: b, reason: collision with root package name */
    public Object f29681b;

    /* renamed from: c, reason: collision with root package name */
    public Object f29682c;

    /* renamed from: d, reason: collision with root package name */
    public Object f29683d;

    /* renamed from: e, reason: collision with root package name */
    public G f29684e;

    /* renamed from: f, reason: collision with root package name */
    public G f29685f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29686g;

    /* renamed from: h, reason: collision with root package name */
    public int f29687h;

    /* renamed from: i, reason: collision with root package name */
    public int f29688i;

    /* renamed from: j, reason: collision with root package name */
    public int f29689j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f29690l;

    /* renamed from: m, reason: collision with root package name */
    public int f29691m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29690l = sVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.f29691m |= Integer.MIN_VALUE;
        return this.f29690l.a(null, null, null, false, this);
    }
}
