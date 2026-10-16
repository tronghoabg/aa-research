package A;

import A7.AbstractC0279p0;
import N.K0;
import android.view.View;
import androidx.lifecycle.InterfaceC1457v;
import com.unity3d.services.UnityAdsConstants;
import e.C2434b;
import e0.C2439B;
import e0.C2447J;
import ef.C2515C;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import t0.C4048M;
import t0.C4070r;
import t0.InterfaceC4044I;
import u0.C4184l;
import u0.C4188n;

/* renamed from: A.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208a extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f101j;
    public final /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f102l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0208a(Object obj, Object obj2, Object obj3, int i5) {
        super(1);
        this.f100i = i5;
        this.f101j = obj;
        this.k = obj2;
        this.f102l = obj3;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.jvm.internal.n, tf.a] */
    @Override // tf.l
    public final Object invoke(Object obj) {
        int i5 = 1;
        C2515C c2515c = C2515C.f34653a;
        Object obj2 = this.f102l;
        Object obj3 = this.k;
        Object obj4 = this.f101j;
        switch (this.f100i) {
            case 0:
                C0215h animate = (C0215h) obj;
                AbstractC3340k.e(animate, "$this$animate");
                C0212e c0212e = (C0212e) obj4;
                AbstractC0226t.k(animate, c0212e.f143c);
                N.Y y10 = animate.f160d;
                Object objA = C0212e.a(c0212e, y10.getValue());
                if (!AbstractC3340k.a(objA, y10.getValue())) {
                    ((N.Y) c0212e.f143c.f170f).setValue(objA);
                    ((N.Y) ((C0217j) obj3).f170f).setValue(objA);
                    animate.f164h.setValue(Boolean.FALSE);
                    animate.f159c.invoke();
                    ((kotlin.jvm.internal.C) obj2).f39736a = true;
                }
                return c2515c;
            case 1:
                r0.s layout = (r0.s) obj;
                AbstractC3340k.e(layout, "$this$layout");
                E.D d3 = (E.D) obj4;
                boolean z2 = d3.f2674d;
                r0.t tVar = (r0.t) obj3;
                float f10 = d3.f2673c;
                float f11 = d3.f2672b;
                C4070r c4070r = (C4070r) obj2;
                if (z2) {
                    c4070r.getClass();
                    r0.s.c(layout, tVar, AbstractC0279p0.a(c4070r, f11), AbstractC0279p0.a(c4070r, f10));
                } else {
                    c4070r.getClass();
                    r0.s.a(tVar, AbstractC0279p0.a(c4070r, f11), AbstractC0279p0.a(c4070r, f10), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return c2515c;
            case 2:
                r0.s layout2 = (r0.s) obj;
                AbstractC3340k.e(layout2, "$this$layout");
                E.E e7 = (E.E) obj4;
                boolean z10 = e7.f2679f;
                r0.t tVar2 = (r0.t) obj3;
                float f12 = e7.f2676c;
                float f13 = e7.f2675b;
                C4070r c4070r2 = (C4070r) obj2;
                if (z10) {
                    c4070r2.getClass();
                    r0.s.c(layout2, tVar2, AbstractC0279p0.a(c4070r2, f13), AbstractC0279p0.a(c4070r2, f12));
                } else {
                    c4070r2.getClass();
                    r0.s.a(tVar2, AbstractC0279p0.a(c4070r2, f13), AbstractC0279p0.a(c4070r2, f12), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return c2515c;
            case 3:
                AbstractC3340k.e((r0.s) obj, "$this$layout");
                E.G g9 = (E.G) obj2;
                E.F f14 = g9.f2684b;
                C4070r c4070r3 = (C4070r) obj3;
                L0.i layoutDirection = c4070r3.f45488a.f45525p;
                f14.getClass();
                AbstractC3340k.e(layoutDirection, "layoutDirection");
                r0.s.a((r0.t) obj4, AbstractC0279p0.a(c4070r3, layoutDirection == L0.i.f6806a ? f14.f2680a : f14.f2682c), AbstractC0279p0.a(c4070r3, g9.f2684b.f2681b), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return c2515c;
            case 4:
                InterfaceC4044I owner = (InterfaceC4044I) obj;
                AbstractC3340k.e(owner, "owner");
                C4188n c4188n = owner instanceof C4188n ? (C4188n) owner : null;
                M0.o oVar = (M0.o) obj4;
                if (c4188n != null) {
                    t0.t tVar3 = (t0.t) obj3;
                    c4188n.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(oVar, tVar3);
                    c4188n.getAndroidViewsHandler$ui_release().addView(oVar);
                    c4188n.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(tVar3, oVar);
                    WeakHashMap weakHashMap = k1.S.f38779a;
                    oVar.setImportantForAccessibility(1);
                    k1.S.m(oVar, new C4184l(tVar3, c4188n, c4188n));
                }
                Object obj5 = ((kotlin.jvm.internal.G) obj2).f39740a;
                if (obj5 != null) {
                    oVar.setView$ui_release((View) obj5);
                }
                return c2515c;
            case 5:
                N.C DisposableEffect = (N.C) obj;
                AbstractC3340k.e(DisposableEffect, "$this$DisposableEffect");
                return new X(((W.c) obj4).a((String) obj3, new A0.p((C4048M) obj2, 10)), i5);
            case 6:
                C2434b c2434b = (C2434b) obj2;
                ((androidx.activity.w) obj4).a((InterfaceC1457v) obj3, c2434b);
                return new X(c2434b, 4);
            default:
                C2439B graphicsLayer = (C2439B) obj;
                AbstractC3340k.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.f34327c = ((Number) ((K0) obj4).getValue()).floatValue();
                O o7 = (O) obj3;
                graphicsLayer.f34325a = ((Number) o7.f66h.getValue()).floatValue();
                graphicsLayer.f34326b = ((Number) o7.f66h.getValue()).floatValue();
                graphicsLayer.f34332h = ((C2447J) ((O) obj2).f66h.getValue()).f34355a;
                return c2515c;
        }
    }
}
