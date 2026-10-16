package Ef;

import Hf.C0588a0;
import Hf.C0611v;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.moloco.sdk.internal.C1880b;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C1890d;
import com.moloco.sdk.internal.ortb.model.C1904s;
import com.moloco.sdk.internal.ortb.model.C1906u;
import com.moloco.sdk.internal.ortb.model.C1908w;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C1984c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C1999j0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2138x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C2047h;
import ef.C2515C;
import ef.C2532p;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.C3338i;

/* renamed from: Ef.p0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0507p0 extends C3338i implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3761a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0507p0(int i5, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i5, obj, cls, str, str2, i10);
        this.f3761a = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.moloco.sdk.internal.publisher.D] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L0] */
    /* JADX WARN: Type inference failed for: r6v23, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View, android.view.ViewGroup, com.moloco.sdk.internal.publisher.V, com.moloco.sdk.publisher.Banner, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.K0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S] */
    @Override // tf.l
    public final Object invoke(Object obj) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar;
        Hf.v0 v0VarIsLoaded;
        C1904s c1904s;
        C1904s c1904s2;
        com.moloco.sdk.internal.ortb.model.U u10;
        Boolean bool;
        boolean zBooleanValue = true;
        C2515C c2515c = C2515C.f34653a;
        switch (this.f3761a) {
            case 0:
                ((AbstractC0509q0) this.receiver).j((Throwable) obj);
                return c2515c;
            case 1:
                C1906u p02 = (C1906u) obj;
                AbstractC3340k.e(p02, "p0");
                final ?? r72 = (com.moloco.sdk.internal.publisher.V) this.receiver;
                r72.getClass();
                Bf.i iVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y0.f32363a;
                String adm = p02.f28864a;
                AbstractC3340k.e(adm, "adm");
                r72.f28961p = Bf.k.n0(adm, "<VAST", true);
                r72.b(null);
                com.moloco.sdk.internal.services.B p62 = r72.f28957l;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s p72 = r72.f28966u;
                com.moloco.sdk.internal.publisher.E e7 = r72.f28953g;
                Context p03 = r72.f28947a;
                com.moloco.sdk.internal.services.events.c p12 = r72.f28949c;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0 p32 = r72.f28952f;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar = r72.f28954h;
                C1880b p52 = r72.f28956j;
                e7.getClass();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v p42 = vVar;
                AbstractC3340k.e(p03, "p0");
                AbstractC3340k.e(p12, "p1");
                AbstractC3340k.e(p32, "p3");
                AbstractC3340k.e(p42, "p4");
                AbstractC3340k.e(p52, "p5");
                AbstractC3340k.e(p62, "p6");
                AbstractC3340k.e(p72, "p7");
                com.moloco.sdk.internal.ortb.model.h0 h0Var = p02.f28867d.f28872a;
                if (h0Var != null) {
                    C2532p c2532p = com.moloco.sdk.internal.i.f28530a;
                    F4.f fVarA = com.moloco.sdk.internal.i.a(h0Var, true);
                    kVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k(com.moloco.sdk.internal.i.e(h0Var, true), fVarA, fVarA);
                } else {
                    com.moloco.sdk.internal.ortb.model.h0 h0Var2 = (com.moloco.sdk.internal.ortb.model.h0) com.moloco.sdk.internal.i.f28530a.getValue();
                    AbstractC3340k.e(h0Var2, "<this>");
                    F4.f fVarA2 = com.moloco.sdk.internal.i.a(h0Var2, true);
                    kVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k(com.moloco.sdk.internal.i.e(h0Var2, true), fVarA2, fVarA2);
                }
                Lf.e eVar = S.f3698a;
                C1999j0 c1999j0 = new C1999j0(p03, p12, p02, kVar, p32, p42, p52, H.c(Jf.n.f6132a.plus(H.f())), p62, p72);
                R0.e eVar2 = r72.f28965t;
                eVar2.f10052d = c1999j0;
                C1908w c1908w = p02.f28867d;
                eVar2.f10053e = c1908w.f28875d;
                String str = p02.f28866c;
                eVar2.f10054f = str != null ? new com.moloco.sdk.internal.publisher.D(str) : null;
                com.moloco.sdk.internal.ortb.model.b0 b0Var = c1908w.f28876e;
                eVar2.f10056h = (b0Var == null || (c1904s2 = b0Var.f28777a) == null) ? null : c1904s2.f28861b;
                eVar2.f10057i = (b0Var == null || (c1904s = b0Var.f28777a) == null) ? null : c1904s.f28860a;
                eVar2.f10051c = (b0Var != null ? b0Var.f28777a : null) != null;
                c1999j0.setAdShowListener(r72.f28970y);
                boolean z2 = r72.f28960o == AdFormatType.MREC && r72.f28961p;
                int i5 = 3;
                Kd.a aVar = r72.f28964s;
                if (z2) {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "BannerViewImpl", "MREC: Using ViewVisibilityTracker(ImpressionViewVisibilityTracker) to track ad display state.", false, 4, null);
                    H0 h02 = (H0) eVar2.f10055g;
                    if (h02 != null) {
                        h02.cancel(null);
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e) eVar2.f10052d;
                    if (eVar3 != null && (v0VarIsLoaded = eVar3.isLoaded()) != null) {
                        eVar2.f10055g = Hf.k0.u(new Hf.Z(new C0611v(new C0588a0(v0VarIsLoaded, r72.f28959n.a(r72), new com.moloco.sdk.internal.publisher.L(i5, interfaceC3103c, 0)), new com.moloco.sdk.internal.publisher.M(2, null)), new com.moloco.sdk.internal.publisher.N(r72, eVar2, null), 0), aVar);
                    }
                } else {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "BannerViewImpl", "Banner: Using isAdShowing function to track ad display state.", false, 4, null);
                    H0 h03 = (H0) eVar2.f10055g;
                    if (h03 != null) {
                        h03.cancel(null);
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e) eVar2.f10052d;
                    eVar2.f10055g = Hf.k0.u(new Hf.Z(new C0611v((r72.f28951e || eVar4 == null) ? r72.getIsViewShown() : eVar4.l(), new com.moloco.sdk.internal.publisher.O(2, null)), new com.moloco.sdk.internal.publisher.P(r72, eVar2, null), 0), aVar);
                }
                com.moloco.sdk.internal.m mVar = r72.k;
                int i10 = (int) (mVar.f28663a * Resources.getSystem().getDisplayMetrics().density);
                float f10 = mVar.f28664b;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, (int) (Resources.getSystem().getDisplayMetrics().density * f10));
                layoutParams.gravity = 1;
                r72.addView(c1999j0, layoutParams);
                boolean z10 = eVar2.f10051c;
                Context context = r72.f28947a;
                if (z10) {
                    AbstractC3340k.e(context, "context");
                    final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.O o7 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.O(context);
                    o7.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    o7.setBackgroundColor(0);
                    final Hf.j0 j0VarB = Hf.k0.b(0, 0, 7);
                    H.D(aVar, null, new com.moloco.sdk.internal.publisher.S(j0VarB, r72, null), 3);
                    o7.setOnTouchListener(new View.OnTouchListener() { // from class: com.moloco.sdk.internal.publisher.K
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            V v2 = r72;
                            Ef.H.D(v2.f28964s, null, new T(motionEvent, o7, v2, j0VarB, null), 3);
                            return false;
                        }
                    });
                    r72.addView(o7, new FrameLayout.LayoutParams(-1, (int) (f10 * Resources.getSystem().getDisplayMetrics().density)));
                }
                C2047h c2047h = new C2047h(r72.f28952f, context);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 8388691;
                c2047h.setPadding(12, 0, 0, 12);
                c2047h.setPrivacyUrl("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html");
                c2047h.setOnButtonRenderedListener(new com.moloco.sdk.internal.publisher.I(r72, 1));
                c2047h.setLayoutParams(layoutParams2);
                r72.addView(c2047h);
                return c1999j0;
            case 2:
                C1906u p04 = (C1906u) obj;
                AbstractC3340k.e(p04, "p0");
                com.moloco.sdk.internal.publisher.l0 l0Var = (com.moloco.sdk.internal.publisher.l0) this.receiver;
                l0Var.getClass();
                l0Var.b(null);
                C1908w c1908w2 = p04.f28867d;
                com.moloco.sdk.internal.ortb.model.d0 d0Var = c1908w2.f28874c;
                boolean zA = d0Var != null ? AbstractC3340k.a(d0Var.f28792a, Boolean.TRUE) : false;
                C8.i iVar2 = l0Var.f29064h;
                com.moloco.sdk.acm.recorder.c cVar = l0Var.f29067l;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar2 = l0Var.f29066j;
                com.moloco.sdk.internal.services.events.c cVar2 = l0Var.f29059c;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0 g02 = l0Var.f29062f;
                Context context2 = l0Var.f29057a;
                C1890d c1890d = c1908w2.f28875d;
                String str2 = p04.f28866c;
                if (!zA) {
                    tf.l lVar = l0Var.f29063g;
                    com.moloco.sdk.internal.ortb.model.h0 h0Var3 = c1908w2.f28872a;
                    l0Var.f29072q = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k) lVar.invoke(h0Var3);
                    l0Var.f29073r = h0Var3 != null ? h0Var3.f28826g : null;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.s0 s0Var = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.s0(context2, cVar2, p04, g02, vVar2, cVar);
                    iVar2.f1939b = s0Var;
                    iVar2.f1940c = c1890d;
                    iVar2.f1941d = str2 != null ? new com.moloco.sdk.internal.publisher.D(str2) : null;
                    return s0Var;
                }
                com.moloco.sdk.internal.ortb.model.d0 d0Var2 = c1908w2.f28874c;
                if (d0Var2 != null && (u10 = d0Var2.f28793b) != null && (bool = u10.f28748a) != null) {
                    zBooleanValue = bool.booleanValue();
                }
                boolean z11 = zBooleanValue;
                com.moloco.sdk.internal.services.B b5 = new com.moloco.sdk.internal.services.B(g02, cVar2);
                String adm2 = p04.f28864a;
                AbstractC3340k.e(adm2, "adm");
                C2138x c2138x = new C2138x(context2, adm2, b5, vVar2, com.moloco.sdk.service_locator.i.a(), com.moloco.sdk.service_locator.j.b(), cVar, z11);
                iVar2.f1939b = c2138x;
                iVar2.f1940c = c1890d;
                iVar2.f1941d = str2 != null ? new com.moloco.sdk.internal.publisher.D(str2) : null;
                return c2138x;
            case 3:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d p05 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj;
                AbstractC3340k.e(p05, "p0");
                C1984c c1984c = (C1984c) this.receiver;
                if (c1984c.f30066l) {
                    com.moloco.sdk.internal.publisher.i0 i0Var = c1984c.k;
                    if (i0Var != null) {
                        i0Var.e(gc.b.f(p05));
                    }
                } else {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar = c1984c.f30065j;
                    if (gVar != null) {
                        gVar.e(gc.b.f(p05));
                    }
                }
                return c2515c;
            case 4:
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d p06 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj;
                AbstractC3340k.e(p06, "p0");
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c) this.receiver).getClass();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.g gVar2 = StaticAdActivity.f30521d;
                if (gVar2 != null) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.i iVar3 = gVar2.f30541d;
                    iVar3.getClass();
                    iVar3.f30551c.a(p06);
                }
                return c2515c;
            case 5:
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d p07 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj;
                AbstractC3340k.e(p07, "p0");
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y) this.receiver)).e(p07);
                return c2515c;
            case 6:
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.H0) this.receiver).b((InterfaceC3103c) obj);
            case 7:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l p08 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l) obj;
                AbstractC3340k.e(p08, "p0");
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h) this.receiver;
                hVar.getClass();
                hVar.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c(p08));
                return c2515c;
            case 8:
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h hVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h) this.receiver;
                Hf.x0 x0Var = hVar2.f32035i;
                x0Var.getClass();
                x0Var.k(null, bool2);
                String str3 = hVar2.f32034h;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l lVar2 = hVar2.f32049x;
                if (zBooleanValue2) {
                    Integer numValueOf = Integer.valueOf(hVar2.f32026A);
                    ?? r42 = lVar2.f32059c;
                    if (r42 != 0) {
                        lVar2.k.a(r42, null, numValueOf, str3);
                    }
                } else {
                    Integer numValueOf2 = Integer.valueOf(hVar2.f32026A);
                    ?? r43 = lVar2.f32060d;
                    if (r43 != 0) {
                        lVar2.k.a(r43, null, numValueOf2, str3);
                    }
                }
                return c2515c;
            case 9:
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d p09 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj;
                AbstractC3340k.e(p09, "p0");
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y) this.receiver)).e(p09);
                return c2515c;
            case 10:
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d p010 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj;
                AbstractC3340k.e(p010, "p0");
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y) this.receiver)).e(p010);
                return c2515c;
            case 11:
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w) this.receiver).b((InterfaceC3103c) obj);
            default:
                return ((io.ktor.utils.io.J) this.receiver).f((InterfaceC3103c) obj);
        }
    }
}
