package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import Va.X7;
import io.ktor.utils.io.InterfaceC2886t;
import java.io.File;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class d extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public X7 f30253a;

    /* renamed from: b, reason: collision with root package name */
    public File f30254b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC2886t f30255c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f30256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X7 f30257e;

    /* renamed from: f, reason: collision with root package name */
    public int f30258f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(X7 x72, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f30257e = x72;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f30256d = obj;
        this.f30258f |= Integer.MIN_VALUE;
        return X7.i(this.f30257e, null, null, this);
    }
}
