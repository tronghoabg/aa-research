package Af;

import Cd.C0340h;
import Cd.T;
import Cd.V;
import Cd.W;
import E5.Q;
import Ef.C0505o0;
import Ef.C0517x;
import Ef.H;
import Ef.H0;
import Ef.I0;
import Ef.U;
import Hf.x0;
import Jd.AbstractC0668b;
import U8.v0;
import Va.X7;
import Wf.Y;
import Wf.q0;
import Wf.r0;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.l0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C1984c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.R0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E;
import e0.C2452d;
import ef.C2515C;
import ff.AbstractC2646a;
import ff.AbstractC2652g;
import g0.InterfaceC2663d;
import java.util.List;
import java.util.Map;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.O;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes5.dex */
public final /* synthetic */ class r implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1321b;

    public /* synthetic */ r(E e7, com.moloco.sdk.common_adapter_internal.a aVar) {
        this.f1320a = 22;
        this.f1321b = aVar;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlinx.serialization.descriptors.SerialDescriptor] */
    @Override // tf.l
    public final Object invoke(Object it) {
        int i5;
        String strValueOf;
        ff.v vVar = ff.v.f35432a;
        int i10 = 2;
        boolean z2 = true;
        int i11 = 0;
        C2515C c2515c = C2515C.f34653a;
        ?? r13 = this.f1321b;
        switch (this.f1320a) {
            case 0:
                AbstractC3340k.e(it, "it");
                return ((DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1) r13).invoke();
            case 1:
                C0340h install = (C0340h) it;
                AbstractC3340k.e(install, "$this$install");
                ((com.moloco.sdk.internal.http.a) r13).invoke(install);
                return c2515c;
            case 2:
                ((C0505o0) r13).Y();
                return c2515c;
            case 3:
                Throwable th = (Throwable) it;
                vg.b bVar = T.f2035a;
                I0 i02 = (I0) r13;
                if (th != null) {
                    bVar.s("Cancelling request because engine Job failed with error: " + th);
                    H.k(i02, "Engine failed", th);
                } else {
                    bVar.s("Cancelling request because engine Job completed");
                    i02.Y();
                }
                return c2515c;
            case 4:
                ((U) r13).dispose();
                return c2515c;
            case 5:
                Throwable th2 = (Throwable) it;
                I0 i03 = ((Fd.c) r13).f4049e;
                AbstractC3340k.c(i03, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
                if (th2 == null) {
                    i03.Y();
                } else {
                    i03.K(new C0517x(false, th2));
                }
                return c2515c;
            case 6:
                ((H0) r13).cancel(null);
                return c2515c;
            case 7:
                Byte b5 = (Byte) it;
                byte bByteValue = b5.byteValue();
                StringBuilder sb2 = (StringBuilder) r13;
                if (bByteValue == 32) {
                    sb2.append("%20");
                } else if (AbstractC0668b.f6042a.contains(b5) || AbstractC0668b.f6044c.contains(b5)) {
                    sb2.append((char) bByteValue);
                } else {
                    sb2.append(AbstractC0668b.g(bByteValue));
                }
                return c2515c;
            case 8:
                Uf.a buildSerialDescriptor = (Uf.a) it;
                AbstractC3340k.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                ((Sf.a) r13).getClass();
                buildSerialDescriptor.f12795b = vVar;
                return c2515c;
            case 9:
                Uf.a buildSerialDescriptor2 = (Uf.a) it;
                AbstractC3340k.e(buildSerialDescriptor2, "$this$buildSerialDescriptor");
                Uf.a.a(buildSerialDescriptor2, "type", q0.f15626b);
                Uf.a.a(buildSerialDescriptor2, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, Fe.g.t("kotlinx.serialization.Polymorphic<" + ((Sf.d) r13).f11119a.getSimpleName() + '>', Uf.i.f12829p, new SerialDescriptor[0]));
                buildSerialDescriptor2.f12795b = vVar;
                return c2515c;
            case 10:
                Uf.a buildSerialDescriptor3 = (Uf.a) it;
                AbstractC3340k.e(buildSerialDescriptor3, "$this$buildSerialDescriptor");
                ((Y) r13).getClass();
                buildSerialDescriptor3.f12795b = vVar;
                return c2515c;
            case 11:
                int iIntValue = ((Integer) it).intValue();
                return r13.e(iIntValue) + ": " + r13.g(iIntValue).h();
            case 12:
                Uf.a buildClassSerialDescriptor = (Uf.a) it;
                AbstractC3340k.e(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                r0 r0Var = (r0) r13;
                Uf.a.a(buildClassSerialDescriptor, "first", r0Var.f15628a.getDescriptor());
                Uf.a.a(buildClassSerialDescriptor, "second", r0Var.f15629b.getDescriptor());
                Uf.a.a(buildClassSerialDescriptor, "third", r0Var.f15630c.getDescriptor());
                return c2515c;
            case 13:
                kotlinx.serialization.json.b node = (kotlinx.serialization.json.b) it;
                AbstractC3340k.e(node, "node");
                Yf.u uVar = (Yf.u) r13;
                uVar.N((String) ff.o.y0(uVar.f16877a), node);
                return c2515c;
            case 14:
                kotlinx.serialization.json.b it2 = (kotlinx.serialization.json.b) it;
                AbstractC3340k.e(it2, "it");
                ((G) r13).f39740a = it2;
                return c2515c;
            case 15:
                com.moloco.sdk.acm.db.e eVar = (com.moloco.sdk.acm.db.e) r13;
                eVar.getClass();
                return com.moloco.sdk.internal.publisher.H.K(eVar, (InterfaceC3103c) it);
            case 16:
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d button = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) it;
                AbstractC3340k.e(button, "button");
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s) r13).a(button);
                return c2515c;
            case 17:
                ((Long) it).longValue();
                return new Cf.a(((l0) r13).k.a());
            case 18:
                InterfaceC2663d Canvas = (InterfaceC2663d) it;
                AbstractC3340k.e(Canvas, "$this$Canvas");
                C2452d c2452d = (C2452d) r13;
                Bitmap bitmap = c2452d.f34361a;
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                float fD = d0.f.d(Canvas.c());
                float fB = d0.f.b(Canvas.c());
                for (float f10 = 0.0f; f10 < fD; f10 += width) {
                    for (float f11 = 0.0f; f11 < fB; f11 += height) {
                        Canvas.d(c2452d, v0.f(f10, f11), g0.f.f35488b);
                    }
                }
                return c2515c;
            case 19:
                String url = (String) it;
                AbstractC3340k.e(url, "url");
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t tVar = ((C1984c) r13).f30060e;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g position = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.i.f32052a;
                AbstractC3340k.e(position, "position");
                H.D(tVar.f30448b, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r(tVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u.f30456b, null), 3);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar = tVar.f30450d;
                if (kVar != null) {
                    kVar.a(url);
                }
                return c2515c;
            case 20:
                Cd.Y retry = (Cd.Y) it;
                AbstractC3340k.e(retry, "$this$retry");
                retry.f2044c = new Bf.s(new Cd.U(15), i10);
                retry.f2043b = new V(z2);
                W w2 = new W(i11);
                retry.f2047f = 10;
                retry.f2042a = w2;
                retry.f2046e = new Bf.s((X7) r13, 7);
                return c2515c;
            case 21:
                Cd.Y retry2 = (Cd.Y) it;
                AbstractC3340k.e(retry2, "$this$retry");
                retry2.f2044c = new Bf.s(new Cd.U(16), i10);
                retry2.f2043b = new V(z2);
                W w3 = new W(i11);
                retry2.f2047f = 10;
                retry2.f2042a = w3;
                retry2.f2046e = new Bf.s((Dd.c) r13, 8);
                return c2515c;
            case 22:
                List it3 = (List) it;
                AbstractC3340k.e(it3, "it");
                return E.a(it3, (com.moloco.sdk.common_adapter_internal.a) r13);
            case 23:
                boolean zBooleanValue = ((Boolean) it).booleanValue();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h) r13;
                R1.q qVar = hVar.f32050y;
                if (!zBooleanValue) {
                    qVar.getClass();
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "LinearGoNextActionImpl", "Canceling timer", null, false, 12, null);
                    H0 h02 = (H0) qVar.f10161e;
                    if (h02 != null) {
                        h02.cancel(null);
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z zVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z(Long.valueOf((!((Boolean) hVar.f32038m.getValue()).booleanValue() || (i5 = hVar.f32039n) <= 0) ? hVar.f32026A : i5 - 10));
                    x0 x0Var = hVar.k;
                    x0Var.getClass();
                    x0Var.k(null, zVar);
                } else if (Integer.compare(qVar.f10157a ^ Integer.MIN_VALUE, Integer.MIN_VALUE) > 0) {
                    qVar.l(qVar.f10157a & 4294967295L);
                }
                return c2515c;
            case 24:
                Context it4 = (Context) it;
                AbstractC3340k.e(it4, "it");
                FrameLayout frameLayout = new FrameLayout(it4);
                frameLayout.addView((View) r13, new ViewGroup.LayoutParams(-1, -1));
                return frameLayout;
            case 25:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d it5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) it;
                AbstractC3340k.e(it5, "it");
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i adShowListener = ((R0) r13).getAdShowListener();
                if (adShowListener != null) {
                    adShowListener.e(gc.b.c(it5));
                }
                return c2515c;
            case 26:
                List list = Jd.p.f6064a;
                ((Jd.n) it).z(HttpHeaders.CONTENT_ENCODING, (String) r13);
                return c2515c;
            case 27:
                return it == ((AbstractC2646a) r13) ? "(this Collection)" : String.valueOf(it);
            case 28:
                Map.Entry it6 = (Map.Entry) it;
                AbstractC3340k.e(it6, "it");
                AbstractC2652g abstractC2652g = (AbstractC2652g) r13;
                StringBuilder sb3 = new StringBuilder();
                Object key = it6.getKey();
                sb3.append(key == abstractC2652g ? "(this Map)" : String.valueOf(key));
                sb3.append('=');
                Object value = it6.getValue();
                sb3.append(value != abstractC2652g ? String.valueOf(value) : "(this Map)");
                return sb3.toString();
            default:
                KTypeProjection it7 = (KTypeProjection) it;
                AbstractC3340k.e(it7, "it");
                ((O) r13).getClass();
                if (it7.getVariance() == null) {
                    return "*";
                }
                KType type = it7.getType();
                O o7 = type instanceof O ? (O) type : null;
                if (o7 == null || (strValueOf = o7.a(true)) == null) {
                    strValueOf = String.valueOf(it7.getType());
                }
                int i12 = N.f39749a[it7.getVariance().ordinal()];
                if (i12 == 1) {
                    return strValueOf;
                }
                if (i12 == 2) {
                    return "in ".concat(strValueOf);
                }
                if (i12 == 3) {
                    return "out ".concat(strValueOf);
                }
                throw new Q((byte) 0, 9);
        }
    }

    public /* synthetic */ r(Object obj, int i5) {
        this.f1320a = i5;
        this.f1321b = obj;
    }
}
