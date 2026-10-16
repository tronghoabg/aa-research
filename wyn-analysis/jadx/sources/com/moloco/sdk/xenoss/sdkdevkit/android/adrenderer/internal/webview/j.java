package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import Hf.InterfaceC0592c0;
import Hf.InterfaceC0602l;
import Hf.x0;
import N.C0718d;
import N.C0732k;
import N.C0740o;
import N.P;
import N.V;
import android.webkit.WebView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t;
import ef.C2515C;
import ef.C2532p;
import tf.p;

/* loaded from: classes4.dex */
public final class j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f32332b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0592c0 f32333c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tf.l f32335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tf.a f32336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tf.a f32337g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f32338h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f32339i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f32340j;
    public final /* synthetic */ L0.d k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f32341l;

    public /* synthetic */ j(WebView webView, InterfaceC0592c0 interfaceC0592c0, int i5, tf.l lVar, tf.a aVar, tf.a aVar2, long j8, p pVar, t tVar, L0.d dVar, boolean z2, int i10) {
        this.f32331a = i10;
        this.f32332b = webView;
        this.f32333c = interfaceC0592c0;
        this.f32334d = i5;
        this.f32335e = lVar;
        this.f32336f = aVar;
        this.f32337g = aVar2;
        this.f32338h = j8;
        this.f32339i = pVar;
        this.f32340j = tVar;
        this.k = dVar;
        this.f32341l = z2;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C2515C c2515c = C2515C.f34653a;
        switch (this.f32331a) {
            case 0:
                C0740o c0740o = (C0740o) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0740o.x()) {
                    c0740o.M(1335699884);
                    Object objF = c0740o.F();
                    Object obj3 = C0732k.f7800a;
                    if (objF == obj3) {
                        C2532p c2532p = com.moloco.sdk.service_locator.i.f29853a;
                        objF = new S();
                        c0740o.U(objF);
                    }
                    S s10 = (S) objF;
                    c0740o.p(false);
                    c0740o.M(1335704710);
                    WebView webView = this.f32332b;
                    boolean zE = c0740o.e(webView);
                    Object objF2 = c0740o.F();
                    if (zE || objF2 == obj3) {
                        objF2 = s10.a(webView);
                        c0740o.U(objF2);
                    }
                    InterfaceC0602l interfaceC0602l = (InterfaceC0602l) objF2;
                    c0740o.p(false);
                    c0740o.M(1335709359);
                    Object objF3 = c0740o.F();
                    InterfaceC0592c0 interfaceC0592c0 = this.f32333c;
                    if (objF3 == obj3) {
                        objF3 = C0718d.G(((x0) interfaceC0592c0).getValue(), P.f7730f);
                        c0740o.U(objF3);
                    }
                    V v2 = (V) objF3;
                    c0740o.p(false);
                    c0740o.M(1335713196);
                    boolean zE2 = c0740o.e(v2) | c0740o.e(interfaceC0592c0);
                    Object objF4 = c0740o.F();
                    if (zE2 || objF4 == obj3) {
                        objF4 = new i(v2, interfaceC0592c0, null);
                        c0740o.U(objF4);
                    }
                    c0740o.p(false);
                    C0718d.d(c0740o, c2515c, (p) objF4);
                    tf.c cVar = (tf.c) this.f32339i.invoke(c0740o, 0);
                    float f10 = this.k.f6795a;
                    k.c(this.f32332b, this.f32334d, v2, this.f32335e, this.f32336f, this.f32337g, null, this.f32338h, cVar, this.f32340j, f10, this.f32341l, interfaceC0602l, c0740o, 384);
                    break;
                } else {
                    c0740o.I();
                    break;
                }
                break;
            default:
                C0740o c0740o2 = (C0740o) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0740o2.x()) {
                    p pVar = this.f32339i;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.a(false, V.e.b(c0740o2, -101529568, new j(this.f32332b, this.f32333c, this.f32334d, this.f32335e, this.f32336f, this.f32337g, this.f32338h, pVar, this.f32340j, this.k, this.f32341l, 0)), c0740o2, 48);
                    break;
                } else {
                    c0740o2.I();
                    break;
                }
                break;
        }
        return c2515c;
    }
}
