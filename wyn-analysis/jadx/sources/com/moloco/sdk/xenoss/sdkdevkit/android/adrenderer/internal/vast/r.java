package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C2092j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C2102b;
import ef.InterfaceC2525i;
import java.util.Iterator;
import java.util.List;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class r extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public E f31569a;

    /* renamed from: b, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t f31570b;

    /* renamed from: c, reason: collision with root package name */
    public C2079l f31571c;

    /* renamed from: d, reason: collision with root package name */
    public com.moloco.sdk.common_adapter_internal.a f31572d;

    /* renamed from: e, reason: collision with root package name */
    public String f31573e;

    /* renamed from: f, reason: collision with root package name */
    public List f31574f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC2525i f31575g;

    /* renamed from: h, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i f31576h;

    /* renamed from: i, reason: collision with root package name */
    public C2102b f31577i;

    /* renamed from: j, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k f31578j;
    public Iterator k;

    /* renamed from: l, reason: collision with root package name */
    public C2092j f31579l;

    /* renamed from: m, reason: collision with root package name */
    public double f31580m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f31581n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f31582o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ E f31583p;

    /* renamed from: q, reason: collision with root package name */
    public int f31584q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(E e7, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f31583p = e7;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f31582o = obj;
        this.f31584q |= Integer.MIN_VALUE;
        return E.d(this.f31583p, null, null, 0.0d, null, false, null, this);
    }
}
