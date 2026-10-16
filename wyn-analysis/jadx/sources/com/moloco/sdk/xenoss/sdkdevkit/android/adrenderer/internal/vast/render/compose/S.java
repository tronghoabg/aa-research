package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import N.C0740o;
import ef.C2515C;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final class S implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y f31801b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f31802c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tf.p f31803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tf.p f31804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tf.p f31805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tf.p f31806g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ tf.p f31807h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C2121s f31808i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ tf.p f31809j;
    public final /* synthetic */ tf.p k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ tf.p f31810l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S f31811m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f31812n;

    public /* synthetic */ S(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y yVar, long j8, tf.p pVar, tf.p pVar2, tf.p pVar3, tf.p pVar4, tf.p pVar5, C2121s c2121s, tf.p pVar6, tf.p pVar7, tf.p pVar8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S s10, boolean z2, int i5) {
        this.f31800a = i5;
        this.f31801b = yVar;
        this.f31802c = j8;
        this.f31803d = pVar;
        this.f31804e = pVar2;
        this.f31805f = pVar3;
        this.f31806g = pVar4;
        this.f31807h = pVar5;
        this.f31808i = c2121s;
        this.f31809j = pVar6;
        this.k = pVar7;
        this.f31810l = pVar8;
        this.f31811m = s10;
        this.f31812n = z2;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31800a) {
            case 0:
                C0740o c0740o = (C0740o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0740o.x()) {
                    c0740o.I();
                } else {
                    AbstractC3935e.f(this.f31801b, null, this.f31802c, (tf.u) this.f31803d.invoke(c0740o, 0), (tf.c) this.f31804e.invoke(c0740o, 0), (tf.c) this.f31805f.invoke(c0740o, 0), (tf.c) this.f31806g.invoke(c0740o, 0), (tf.u) this.f31807h.invoke(c0740o, 0), this.f31808i, (tf.s) this.f31809j.invoke(c0740o, 0), (tf.t) this.k.invoke(c0740o, 0), (tf.u) this.f31810l.invoke(c0740o, 0), this.f31811m, this.f31812n, c0740o, 0, 2);
                }
                break;
            default:
                C0740o c0740o2 = (C0740o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0740o2.x()) {
                    c0740o2.I();
                } else {
                    tf.p pVar = this.k;
                    tf.p pVar2 = this.f31810l;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.a(false, V.e.b(c0740o2, 2103457343, new S(this.f31801b, this.f31802c, this.f31803d, this.f31804e, this.f31805f, this.f31806g, this.f31807h, this.f31808i, this.f31809j, pVar, pVar2, this.f31811m, this.f31812n, 0)), c0740o2, 48);
                }
                break;
        }
        return C2515C.f34653a;
    }
}
