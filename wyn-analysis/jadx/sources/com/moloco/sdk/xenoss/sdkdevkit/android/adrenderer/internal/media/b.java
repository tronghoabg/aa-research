package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import Va.X7;
import java.io.File;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class b extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public X7 f30236a;

    /* renamed from: b, reason: collision with root package name */
    public File f30237b;

    /* renamed from: c, reason: collision with root package name */
    public Gd.a f30238c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f30239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X7 f30240e;

    /* renamed from: f, reason: collision with root package name */
    public int f30241f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(X7 x72, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f30240e = x72;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f30239d = obj;
        this.f30241f |= Integer.MIN_VALUE;
        return X7.f(this.f30240e, null, null, this);
    }
}
