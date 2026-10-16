package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import E.L;
import E5.Q;
import Hf.InterfaceC0592c0;
import N.C0732k;
import N.C0740o;
import a.AbstractC1304a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.O;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v;
import ef.C2515C;
import tf.q;

/* loaded from: classes4.dex */
public final class h implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f32320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f32321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32322c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0592c0 f32323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tf.l f32324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tf.a f32325f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tf.a f32326g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v f32327h;

    public h(int i5, InterfaceC0592c0 interfaceC0592c0, O o7, f fVar, v vVar, tf.a aVar, tf.a aVar2, tf.l lVar) {
        this.f32320a = fVar;
        this.f32321b = o7;
        this.f32322c = i5;
        this.f32323d = interfaceC0592c0;
        this.f32324e = lVar;
        this.f32325f = aVar;
        this.f32326g = aVar2;
        this.f32327h = vVar;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x xVar = (x) obj;
        C0740o c0740o = (C0740o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c0740o.e(xVar) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && c0740o.x()) {
            c0740o.I();
        } else if (xVar instanceof t) {
            c0740o.M(1827067735);
            c0740o.p(false);
        } else if (xVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.v) {
            c0740o.M(1827130231);
            c0740o.p(false);
        } else if (xVar instanceof u) {
            c0740o.M(-1880720211);
            gc.b.d(((u) xVar).f31658a, null, null, L.a(Z.i.f16922a), c0740o, 3504);
            c0740o.p(false);
        } else if (xVar instanceof w) {
            c0740o.M(-1880710707);
            c0740o.M(-1880709272);
            boolean zE = c0740o.e(this.f32320a) | c0740o.e(this.f32321b) | c0740o.c(this.f32322c) | c0740o.e(this.f32323d) | c0740o.e(this.f32324e) | c0740o.e(this.f32325f) | c0740o.e(this.f32326g) | c0740o.e(this.f32327h);
            Object objF = c0740o.F();
            if (zE || objF == C0732k.f7800a) {
                tf.l lVar = this.f32324e;
                v vVar = this.f32327h;
                b bVar = new b(this.f32322c, this.f32323d, this.f32321b, this.f32320a, vVar, this.f32325f, this.f32326g, lVar);
                c0740o.U(bVar);
                objF = bVar;
            }
            c0740o.p(false);
            AbstractC1304a.c((tf.l) objF, null, null, c0740o, 0, 6);
            c0740o.p(false);
        } else {
            if (xVar != null) {
                c0740o.M(-1880725732);
                c0740o.p(false);
                throw new Q((byte) 0, 9);
            }
            c0740o.M(1828380771);
            c0740o.p(false);
        }
        return C2515C.f34653a;
    }
}
