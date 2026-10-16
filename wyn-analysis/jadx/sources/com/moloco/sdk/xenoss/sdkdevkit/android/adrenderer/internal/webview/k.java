package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import E.AbstractC0426p;
import E.C0427q;
import E.L;
import Hf.InterfaceC0592c0;
import Hf.InterfaceC0602l;
import Hf.k0;
import K.s;
import N.C0718d;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import N.P;
import N.V;
import U8.v0;
import a.AbstractC1304a;
import android.app.Activity;
import android.webkit.WebView;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.moloco.sdk.internal.publisher.H;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.O;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C2040a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C2045f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v;
import e0.C2465q;
import e0.z;
import ef.C2515C;
import ef.C2537u;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3909n;
import t0.C4054b;
import t0.C4056d;
import t0.InterfaceC4055c;
import tf.p;
import u0.InterfaceC4193p0;
import u0.M;
import vf.AbstractC4345a;

/* loaded from: classes4.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final float f32342a = 12;

    public static final void a(final Activity activity, final WebView webView, final int i5, final tf.l onButtonRendered, final tf.a onClose, final f adWebViewRenderer, final v vVar, final tf.a onCloseOrSkipButtonShown, C0740o c0740o, final int i10) {
        InterfaceC0592c0 interfaceC0592c0;
        AbstractC3340k.e(webView, "webView");
        AbstractC3340k.e(onButtonRendered, "onButtonRendered");
        AbstractC3340k.e(onClose, "onClose");
        AbstractC3340k.e(adWebViewRenderer, "adWebViewRenderer");
        AbstractC3340k.e(onCloseOrSkipButtonShown, "onCloseOrSkipButtonShown");
        c0740o.N(-204806360);
        int i11 = i10 | (c0740o.e(activity) ? 4 : 2) | (c0740o.e(webView) ? 32 : 16) | (c0740o.c(i5) ? 256 : 128) | (c0740o.e(onButtonRendered) ? 2048 : Segment.SHARE_MINIMUM) | (c0740o.e(onClose) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE) | (c0740o.e(adWebViewRenderer) ? 131072 : 65536) | (c0740o.e(vVar) ? 1048576 : 524288);
        if ((4793491 & i11) == 4793490 && c0740o.x()) {
            c0740o.I();
        } else {
            Z.k kVarL = v0.l(L.a(Z.i.f16922a), C2465q.f34373b, z.f34394a);
            c0740o.M(733328855);
            InterfaceC3909n interfaceC3909nC = AbstractC0426p.c(Z.a.f16900a, false, c0740o);
            c0740o.M(-1323940314);
            L0.b bVar = (L0.b) c0740o.j(M.f46143e);
            L0.i iVar = (L0.i) c0740o.j(M.k);
            InterfaceC4193p0 interfaceC4193p0 = (InterfaceC4193p0) c0740o.j(M.f46152o);
            InterfaceC4055c.g9.getClass();
            tf.a aVar = C4054b.f45453b;
            V.d dVarY = S3.f.y(kVarL);
            c0740o.O();
            if (c0740o.f7843O) {
                c0740o.k(aVar);
            } else {
                c0740o.X();
            }
            c0740o.f7867x = false;
            C0718d.M(c0740o, interfaceC3909nC, C4054b.f45456e);
            C0718d.M(c0740o, bVar, C4054b.f45455d);
            C0718d.M(c0740o, iVar, C4054b.f45457f);
            wg.b.d(0, dVarY, wg.b.b(c0740o, interfaceC4193p0, C4054b.f45458g, c0740o), c0740o, 2058660585);
            c0740o.M(-2137368960);
            c0740o.M(1609940259);
            boolean zC = c0740o.c(i5);
            Object objF = c0740o.F();
            Object obj = C0732k.f7800a;
            if (zC || objF == obj) {
                objF = k0.c(Boolean.valueOf(i5 == 0));
                c0740o.U(objF);
            }
            InterfaceC0592c0 interfaceC0592c02 = (InterfaceC0592c0) objF;
            c0740o.p(false);
            c0740o.M(1609947848);
            boolean zE = c0740o.e(adWebViewRenderer) | c0740o.e(webView) | c0740o.c(i5) | c0740o.e(interfaceC0592c02) | c0740o.e(onButtonRendered) | c0740o.e(onClose) | c0740o.e(onCloseOrSkipButtonShown) | c0740o.e(vVar);
            Object objF2 = c0740o.F();
            if (zE || objF2 == obj) {
                Object bVar2 = new b(adWebViewRenderer, webView, i5, interfaceC0592c02, onButtonRendered, onCloseOrSkipButtonShown, vVar, onClose);
                interfaceC0592c0 = interfaceC0592c02;
                c0740o.U(bVar2);
                objF2 = bVar2;
            } else {
                interfaceC0592c0 = interfaceC0592c02;
            }
            c0740o.p(false);
            AbstractC1304a.c((tf.l) objF2, null, null, c0740o, 0, 6);
            c0740o.M(1609961816);
            boolean zE2 = c0740o.e(interfaceC0592c0) | c0740o.e(onClose);
            Object objF3 = c0740o.F();
            if (zE2 || objF3 == obj) {
                objF3 = new c(interfaceC0592c0, onClose, 0);
                c0740o.U(objF3);
            }
            c0740o.p(false);
            AbstractC4345a.a(false, (tf.a) objF3, c0740o, 0);
            Fe.c.g(activity, c0740o, i11 & 14);
            c0740o.p(false);
            c0740o.p(false);
            c0740o.p(true);
            c0740o.p(false);
            c0740o.p(false);
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new p(activity, webView, i5, onButtonRendered, onClose, adWebViewRenderer, vVar, onCloseOrSkipButtonShown, i10) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.d

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Activity f32288a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ WebView f32289b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f32290c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ tf.l f32291d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ tf.a f32292e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ f f32293f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ v f32294g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ tf.a f32295h;

                @Override // tf.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    Activity activity2 = this.f32288a;
                    v vVar2 = this.f32294g;
                    tf.a aVar2 = this.f32295h;
                    k.a(activity2, this.f32289b, this.f32290c, this.f32291d, this.f32292e, this.f32293f, vVar2, aVar2, (C0740o) obj2, 12582913);
                    return C2515C.f34653a;
                }
            };
        }
    }

    public static final void b(final Activity activity, final q qVar, final O webView, final int i5, final tf.l onButtonRendered, tf.a onClose, final f adWebViewRenderer, final v vVar, final tf.c cVar, final V.d dVar, final tf.a onCloseOrSkipButtonShown, C0740o c0740o, final int i10) {
        tf.a aVar;
        C0740o c0740o2;
        AbstractC3340k.e(webView, "webView");
        AbstractC3340k.e(onButtonRendered, "onButtonRendered");
        AbstractC3340k.e(onClose, "onClose");
        AbstractC3340k.e(adWebViewRenderer, "adWebViewRenderer");
        AbstractC3340k.e(onCloseOrSkipButtonShown, "onCloseOrSkipButtonShown");
        c0740o.N(772404782);
        int i11 = i10 | (c0740o.e(activity) ? 4 : 2) | (c0740o.e(qVar) ? 32 : 16) | (c0740o.e(webView) ? 256 : 128) | (c0740o.c(i5) ? 2048 : Segment.SHARE_MINIMUM) | (c0740o.e(onClose) ? 131072 : 65536) | (c0740o.e(adWebViewRenderer) ? 1048576 : 524288) | (c0740o.e(vVar) ? 8388608 : 4194304) | (c0740o.e(cVar) ? 67108864 : 33554432) | (c0740o.e(dVar) ? 536870912 : 268435456);
        if ((306783379 & i11) == 306783378 && c0740o.x()) {
            c0740o.I();
            c0740o2 = c0740o;
            aVar = onClose;
        } else {
            Z.k kVarL = v0.l(L.a(Z.i.f16922a), C2465q.f34373b, z.f34394a);
            AbstractC3340k.e(kVarL, "<this>");
            Z.k kVarJ = Fe.g.J(kVarL, false, new s("MraidAdContainerScreen", 1));
            c0740o.M(733328855);
            InterfaceC3909n interfaceC3909nC = AbstractC0426p.c(Z.a.f16900a, false, c0740o);
            c0740o.M(-1323940314);
            L0.b bVar = (L0.b) c0740o.j(M.f46143e);
            L0.i iVar = (L0.i) c0740o.j(M.k);
            InterfaceC4193p0 interfaceC4193p0 = (InterfaceC4193p0) c0740o.j(M.f46152o);
            InterfaceC4055c.g9.getClass();
            C4056d c4056d = C4054b.f45453b;
            V.d dVarY = S3.f.y(kVarJ);
            c0740o.O();
            if (c0740o.f7843O) {
                c0740o.k(c4056d);
            } else {
                c0740o.X();
            }
            c0740o.f7867x = false;
            C0718d.M(c0740o, interfaceC3909nC, C4054b.f45456e);
            C0718d.M(c0740o, bVar, C4054b.f45455d);
            C0718d.M(c0740o, iVar, C4054b.f45457f);
            wg.b.d(0, dVarY, wg.b.b(c0740o, interfaceC4193p0, C4054b.f45458g, c0740o), c0740o, 2058660585);
            c0740o.M(-2137368960);
            c0740o.M(1204573178);
            boolean zC = c0740o.c(i5);
            Object objF = c0740o.F();
            P p10 = C0732k.f7800a;
            if (zC || objF == p10) {
                objF = k0.c(Boolean.valueOf(i5 == 0));
                c0740o.U(objF);
            }
            InterfaceC0592c0 interfaceC0592c0 = (InterfaceC0592c0) objF;
            c0740o.p(false);
            V vU = C0718d.u(qVar.f31645e, c0740o, 0);
            aVar = onClose;
            Fe.g.c((x) vU.getValue(), null, null, V.e.b(c0740o, -448887432, new h(i5, interfaceC0592c0, webView, adWebViewRenderer, vVar, onClose, onCloseOrSkipButtonShown, onButtonRendered)), c0740o, 3072, 6);
            c0740o2 = c0740o;
            tg.b.c(qVar, (x) vU.getValue(), dVar, cVar, null, c0740o2, (i11 & 112) | 6 | ((i11 >> 18) & 7168) | ((i11 >> 12) & 57344), 16);
            c0740o2.M(1204638639);
            boolean zE = c0740o2.e(interfaceC0592c0) | c0740o2.e(aVar);
            Object objF2 = c0740o2.F();
            if (zE || objF2 == p10) {
                objF2 = new c(interfaceC0592c0, aVar, 1);
                c0740o2.U(objF2);
            }
            c0740o2.p(false);
            AbstractC4345a.a(false, (tf.a) objF2, c0740o2, 0);
            Fe.c.g(activity, c0740o2, i11 & 14);
            c0740o2.p(false);
            c0740o2.p(false);
            c0740o2.p(true);
            c0740o2.p(false);
            c0740o2.p(false);
        }
        C0729i0 c0729i0R = c0740o2.r();
        if (c0729i0R != null) {
            final tf.a aVar2 = aVar;
            c0729i0R.f7788d = new p(activity, qVar, webView, i5, onButtonRendered, aVar2, adWebViewRenderer, vVar, cVar, dVar, onCloseOrSkipButtonShown, i10) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.e

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Activity f32296a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ q f32297b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ O f32298c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f32299d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ tf.l f32300e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ tf.a f32301f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ f f32302g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ v f32303h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ tf.c f32304i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ V.d f32305j;
                public final /* synthetic */ tf.a k;

                @Override // tf.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    Activity activity2 = this.f32296a;
                    q qVar2 = this.f32297b;
                    V.d dVar2 = this.f32305j;
                    tf.a aVar3 = this.k;
                    k.b(activity2, qVar2, this.f32298c, this.f32299d, this.f32300e, this.f32301f, this.f32302g, this.f32303h, this.f32304i, dVar2, aVar3, (C0740o) obj, 24577);
                    return C2515C.f34653a;
                }
            };
        }
    }

    public static final void c(final WebView webView, final int i5, final V v2, tf.l lVar, final tf.a aVar, final tf.a aVar2, Z.k kVar, final long j8, final tf.c cVar, final t tVar, final float f10, final boolean z2, final InterfaceC0602l interfaceC0602l, C0740o c0740o, final int i10) {
        Z.k kVar2;
        float f11;
        Z.i iVar;
        final tf.l lVar2;
        final Z.k kVar3;
        c0740o.N(-1361070397);
        int i11 = i10 | (c0740o.e(webView) ? 4 : 2) | (c0740o.c(i5) ? 32 : 16) | (c0740o.e(lVar) ? 2048 : Segment.SHARE_MINIMUM) | (c0740o.e(aVar) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE) | (c0740o.e(aVar2) ? 131072 : 65536) | 1572864 | (c0740o.d(j8) ? 8388608 : 4194304) | (c0740o.e(cVar) ? 67108864 : 33554432) | (c0740o.e(tVar) ? 536870912 : 268435456);
        int i12 = (c0740o.b(f10) ? 4 : 2) | (c0740o.f(z2) ? 32 : 16) | (c0740o.e(interfaceC0602l) ? 256 : 128);
        if ((i11 & 306783379) == 306783378 && (i12 & 147) == 146 && c0740o.x()) {
            c0740o.I();
            lVar2 = lVar;
            kVar3 = kVar;
        } else {
            c0740o.K();
            int i13 = i10 & 1;
            Z.i iVar2 = Z.i.f16922a;
            if (i13 == 0 || c0740o.w()) {
                kVar2 = iVar2;
            } else {
                c0740o.I();
                kVar2 = kVar;
            }
            c0740o.q();
            Z.k kVarL = v0.l(L.a(kVar2), j8, z.f34394a);
            c0740o.M(733328855);
            InterfaceC3909n interfaceC3909nC = AbstractC0426p.c(Z.a.f16900a, false, c0740o);
            c0740o.M(-1323940314);
            L0.b bVar = (L0.b) c0740o.j(M.f46143e);
            L0.i iVar3 = (L0.i) c0740o.j(M.k);
            InterfaceC4193p0 interfaceC4193p0 = (InterfaceC4193p0) c0740o.j(M.f46152o);
            InterfaceC4055c.g9.getClass();
            tf.a aVar3 = C4054b.f45453b;
            V.d dVarY = S3.f.y(kVarL);
            c0740o.O();
            if (c0740o.f7843O) {
                c0740o.k(aVar3);
            } else {
                c0740o.X();
            }
            c0740o.f7867x = false;
            C0718d.M(c0740o, interfaceC3909nC, C4054b.f45456e);
            C0718d.M(c0740o, bVar, C4054b.f45455d);
            C0718d.M(c0740o, iVar3, C4054b.f45457f);
            wg.b.d(0, dVarY, wg.b.b(c0740o, interfaceC4193p0, C4054b.f45458g, c0740o), c0740o, 2058660585);
            c0740o.M(-2137368960);
            C0427q c0427q = C0427q.f2765a;
            A6.c.f(webView, L.a(iVar2), tVar, c0740o, (i11 & 14) | 48 | ((i11 >> 21) & 896));
            c0740o.M(-1422940341);
            Object obj = C0732k.f7800a;
            if (cVar == null) {
                lVar2 = lVar;
                f11 = f10;
                iVar = iVar2;
            } else {
                c0740o.M(1485619765);
                boolean zC = c0740o.c(i5);
                Object objF = c0740o.F();
                if (zC || objF == obj) {
                    objF = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z(new C2537u(i5 < 0 ? 0 : i5));
                    c0740o.U(objF);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z zVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z) objF;
                c0740o.p(false);
                boolean zBooleanValue = ((Boolean) v2.getValue()).booleanValue();
                c0740o.M(1485632684);
                boolean zE = c0740o.e(v2) | c0740o.e(aVar2);
                Object objF2 = c0740o.F();
                if (zE || objF2 == obj) {
                    objF2 = new Bf.g(11, v2, aVar2);
                    c0740o.U(objF2);
                }
                c0740o.p(false);
                int i14 = i12 << 21;
                f11 = f10;
                iVar = iVar2;
                Fe.g.h(zVar, zBooleanValue, (tf.a) objF2, aVar, lVar, cVar, z2, interfaceC0602l, c0740o, ((i11 << 3) & 458752) | 390 | ((i11 << 9) & 3670016) | (i14 & 234881024) | (i14 & 1879048192));
                lVar2 = lVar;
            }
            c0740o.p(false);
            Z.k kVarF0 = H.f0(c0427q.a(iVar, Z.a.f16906g), f11);
            c0740o.M(-1806921710);
            G0 g0A = com.moloco.sdk.service_locator.i.a();
            c0740o.M(-763795258);
            boolean zE2 = c0740o.e(g0A) | c0740o.e("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html");
            Object objF3 = c0740o.F();
            if (zE2 || objF3 == obj) {
                objF3 = new C2040a(g0A, 1);
                c0740o.U(objF3);
            }
            c0740o.p(false);
            V.d dVarB = V.e.b(c0740o, -652534615, new C2045f(kVarF0, (tf.l) objF3));
            c0740o.p(false);
            dVarB.invoke(c0427q, lVar2, c0740o, Integer.valueOf(((i11 >> 6) & 112) | 6));
            wg.b.e(c0740o, false, false, true, false);
            c0740o.p(false);
            kVar3 = kVar2;
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new p(webView, i5, v2, lVar2, aVar, aVar2, kVar3, j8, cVar, tVar, f10, z2, interfaceC0602l, i10) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.g

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ WebView f32308a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f32309b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ V f32310c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ tf.l f32311d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ tf.a f32312e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ tf.a f32313f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Z.k f32314g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ long f32315h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ tf.c f32316i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ t f32317j;
                public final /* synthetic */ float k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ boolean f32318l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ InterfaceC0602l f32319m;

                @Override // tf.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    tf.a aVar4 = this.f32312e;
                    boolean z10 = this.f32318l;
                    InterfaceC0602l interfaceC0602l2 = this.f32319m;
                    k.c(this.f32308a, this.f32309b, this.f32310c, this.f32311d, aVar4, this.f32313f, this.f32314g, this.f32315h, this.f32316i, this.f32317j, this.k, z10, interfaceC0602l2, (C0740o) obj2, 385);
                    return C2515C.f34653a;
                }
            };
        }
    }
}
