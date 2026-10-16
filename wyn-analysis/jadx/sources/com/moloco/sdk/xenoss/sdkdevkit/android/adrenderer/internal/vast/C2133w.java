package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C2084b;
import java.util.ArrayList;
import lf.AbstractC3464c;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2133w extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public E f32168a;

    /* renamed from: b, reason: collision with root package name */
    public C2084b f32169b;

    /* renamed from: c, reason: collision with root package name */
    public C2093n f32170c;

    /* renamed from: d, reason: collision with root package name */
    public com.moloco.sdk.common_adapter_internal.a f32171d;

    /* renamed from: e, reason: collision with root package name */
    public String f32172e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f32173f;

    /* renamed from: g, reason: collision with root package name */
    public double f32174g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f32175h;

    /* renamed from: i, reason: collision with root package name */
    public int f32176i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f32177j;
    public final /* synthetic */ E k;

    /* renamed from: l, reason: collision with root package name */
    public int f32178l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2133w(E e7, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.k = e7;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f32177j = obj;
        this.f32178l |= Integer.MIN_VALUE;
        return E.c(this.k, null, null, 0.0d, null, false, null, this);
    }
}
