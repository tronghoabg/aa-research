package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import N.C0729i0;
import N.C0732k;
import N.C0740o;
import a.AbstractC1304a;
import android.app.Activity;
import android.content.Context;
import com.applovin.shadow.okio.Segment;
import ef.C2527k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KFunction;
import vf.AbstractC4345a;

/* loaded from: classes4.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public static final A0.f f31162a = new A0.f(12);

    /* renamed from: b, reason: collision with root package name */
    public static final A0.f f31163b = new A0.f(13);

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g mediaResult) {
        AbstractC3340k.e(mediaResult, "mediaResult");
        if (mediaResult.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.f30279p)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f30163s;
        }
        if (mediaResult.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.f30265a)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f30164t;
        }
        if (mediaResult.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.f30266b)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f30166v;
        }
        if (mediaResult.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.f30267c)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f30165u;
        }
        if (mediaResult.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.f30268d)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f30167w;
        }
        if (mediaResult.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.f30270f)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f30160p;
        }
        if (mediaResult.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.f30271g)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f30161q;
        }
        if (mediaResult.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.f30281r)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f30142D;
        }
        if (mediaResult.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.f30269e)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.k;
        }
        if (mediaResult.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.f30272h)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f30156l;
        }
        if (mediaResult.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.f30277n)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f30157m;
        }
        if (mediaResult.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.k)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f30140B;
        }
        if (mediaResult.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.f30278o)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f30141C;
        }
        if (mediaResult.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.f30280q)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f30158n;
        }
        if (mediaResult.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.f30273i)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f30159o;
        }
        if (mediaResult.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.f30274j)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f30162r;
        }
        if (mediaResult.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.f30276m)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f30168x;
        }
        if (mediaResult.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.f30275l)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f30139A;
        }
        throw new E5.Q((byte) 0, 9);
    }

    public static final E b(Context context) {
        AbstractC3340k.e(context, "context");
        return new E((I) J0.f31197a.getValue(), com.moloco.sdk.service_locator.g.a(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o) com.moloco.sdk.service_locator.g.f29851b.getValue(), M0.a(), (com.moloco.sdk.internal.services.E) com.moloco.sdk.service_locator.e.f29842e.getValue(), com.moloco.sdk.service_locator.j.a(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p(context, 0));
    }

    public static final C2527k c(Double d3, Double d5) {
        if (d3 == null || d5 == null) {
            return new C2527k(Boolean.valueOf(d3 != null), Boolean.valueOf(d5 != null));
        }
        if (d3.doubleValue() == d5.doubleValue()) {
            Boolean bool = Boolean.TRUE;
            return new C2527k(bool, bool);
        }
        if (Math.abs(d3.doubleValue()) == Math.abs(d5.doubleValue())) {
            return new C2527k(Boolean.valueOf(d3.doubleValue() < 0.0d), Boolean.valueOf(d5.doubleValue() < 0.0d));
        }
        return Double.compare(Math.abs(d3.doubleValue()), Math.abs(d5.doubleValue())) < 0 ? new C2527k(Boolean.TRUE, Boolean.FALSE) : new C2527k(Boolean.FALSE, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Double d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v r7, double r8, java.lang.Long r10) {
        /*
            r0 = 0
            if (r10 != 0) goto L5
        L3:
            r7 = r0
            goto L48
        L5:
            java.lang.Integer r1 = r7.f31522f
            if (r1 == 0) goto L13
            int r7 = r1.intValue()
            double r1 = (double) r7
            java.lang.Double r7 = java.lang.Double.valueOf(r1)
            goto L2e
        L13:
            java.lang.Integer r1 = r7.f31524h
            if (r1 == 0) goto L2d
            java.lang.Integer r7 = r7.f31523g
            if (r7 == 0) goto L2d
            int r1 = r1.intValue()
            int r7 = r7.intValue()
            int r1 = r1 - r7
            double r1 = (double) r1
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = r1 / r3
            java.lang.Double r7 = java.lang.Double.valueOf(r1)
            goto L2e
        L2d:
            r7 = r0
        L2e:
            if (r7 == 0) goto L3
            double r1 = r7.doubleValue()
            long r3 = r10.longValue()
            double r3 = (double) r3
            r5 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 / r5
            r7 = 8192(0x2000, float:1.148E-41)
            double r5 = (double) r7
            double r1 = r1 / r5
            double r1 = r1 * r3
            java.lang.Double r7 = java.lang.Double.valueOf(r1)
        L48:
            if (r7 == 0) goto L54
            double r0 = r7.doubleValue()
            double r0 = r0 - r8
            java.lang.Double r7 = java.lang.Double.valueOf(r0)
            return r7
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.G.d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v, double, java.lang.Long):java.lang.Double");
    }

    public static final Double e(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num == null || num.intValue() == 0 || num2 == null || num2.intValue() == 0 || num3 == null || num3.intValue() == 0 || num4 == null || num4.intValue() == 0) {
            return null;
        }
        return Double.valueOf((num.intValue() * num2.intValue()) - (num3.intValue() * num4.intValue()));
    }

    public static final void f(Activity activity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q qVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.G g9, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar, C0740o c0740o, int i5) {
        C0740o c0740o2;
        c0740o.N(1851234025);
        int i10 = i5 | (c0740o.e(activity) ? 4 : 2) | (c0740o.e(qVar) ? 32 : 16) | (c0740o.e(g9) ? 256 : 128) | (c0740o.e(vVar) ? 2048 : Segment.SHARE_MINIMUM);
        if ((i10 & 1171) == 1170 && c0740o.x()) {
            c0740o.I();
            c0740o2 = c0740o;
        } else {
            c0740o.K();
            if ((i5 & 1) != 0 && !c0740o.w()) {
                c0740o.I();
            }
            c0740o.q();
            c0740o.M(1546094614);
            c0740o.M(1546093340);
            boolean zE = c0740o.e(g9) | c0740o.e(qVar);
            Object objF = c0740o.F();
            N.P p10 = C0732k.f7800a;
            if (zE || objF == p10) {
                objF = new Ff.d(7, g9, qVar);
                c0740o.U(objF);
            }
            c0740o.p(false);
            AbstractC1304a.c((tf.l) objF, null, null, c0740o, 0, 6);
            c0740o2 = c0740o;
            c0740o2.M(1546095379);
            if (vVar != null) {
                vVar.a(V.e.b(c0740o2, 1040652088, new C2077k(0)), c0740o2, ((i10 >> 6) & 112) | 6);
            }
            c0740o2.p(false);
            c0740o2.p(false);
            c0740o2.M(1546097303);
            boolean zE2 = c0740o2.e(qVar);
            Object objF2 = c0740o2.F();
            if (zE2 || objF2 == p10) {
                S8.d dVar = new S8.d(0, qVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q.class, "goNextAdPartOrDismissAd", "goNextAdPartOrDismissAd()V", 0, 14);
                c0740o2.U(dVar);
                objF2 = dVar;
            }
            c0740o2.p(false);
            AbstractC4345a.a(false, (tf.a) ((KFunction) objF2), c0740o2, 0);
            Fe.c.g(activity, c0740o2, i10 & 14);
        }
        C0729i0 c0729i0R = c0740o2.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new com.applovin.mediation.adapters.d(activity, qVar, g9, vVar, i5, 3);
        }
    }

    public static /* synthetic */ void g(L0 l02, List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.E e7, int i5) {
        if ((i5 & 2) != 0) {
            e7 = null;
        }
        l02.a(list, e7, null, null);
    }

    public static void h(L0 l02, List urls, ArrayList arrayList, com.moloco.sdk.internal.services.events.c customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g lastClickPosition) {
        l02.getClass();
        AbstractC3340k.e(urls, "urls");
        AbstractC3340k.e(customUserEventBuilderService, "customUserEventBuilderService");
        AbstractC3340k.e(lastClickPosition, "lastClickPosition");
        if (urls.isEmpty()) {
            return;
        }
        Ef.H.D(l02.f31237b, null, new K0(urls, customUserEventBuilderService, lastClickPosition, l02, arrayList, null, null, null, null), 3);
    }

    public static final int i(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.I i5) {
        if (i5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.F) {
            return 4;
        }
        if (i5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.H) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.H) i5).f31465a.f31433b == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n.f31493b ? 3 : 2;
        }
        if (i5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.G) {
            return 1;
        }
        throw new E5.Q((byte) 0, 9);
    }

    public static final Double j(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num == null || num.intValue() == 0 || num2 == null || num2.intValue() == 0 || num3 == null || num3.intValue() == 0 || num4 == null || num4.intValue() == 0) {
            return null;
        }
        return Double.valueOf((num.intValue() / num2.intValue()) - (num3.intValue() / num4.intValue()));
    }
}
