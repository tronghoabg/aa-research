package S8;

import Bf.k;
import E5.I;
import E5.Q;
import Ef.H;
import Hf.x0;
import R8.C0805a;
import android.opengl.GLSurfaceView;
import android.os.Looper;
import android.view.View;
import androidx.activity.w;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C1984c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2028q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.H0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.R0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.A;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.B;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.C;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.C2099b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.D;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.C3338i;
import u6.AbstractC4256a;

/* loaded from: classes4.dex */
public final /* synthetic */ class d extends C3338i implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11032a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i5, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i5, obj, cls, str, str2, i10);
        this.f11032a = i11;
    }

    @Override // tf.a
    public final Object invoke() {
        switch (this.f11032a) {
            case 0:
                ((e) this.receiver).getClass();
                String threadName = Thread.currentThread().getName();
                AbstractC3340k.d(threadName, "threadName");
                return Boolean.valueOf(k.n0(threadName, "Firebase Background Thread #", false));
            case 1:
                ((e) this.receiver).getClass();
                String threadName2 = Thread.currentThread().getName();
                AbstractC3340k.d(threadName2, "threadName");
                return Boolean.valueOf(k.n0(threadName2, "Firebase Blocking Thread #", false));
            case 2:
                ((e) this.receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
            case 3:
                ((w) this.receiver).d();
                return C2515C.f34653a;
            case 4:
                ((w) this.receiver).d();
                return C2515C.f34653a;
            case 5:
                ((com.moloco.sdk.internal.publisher.nativead.c) this.receiver).handleGeneralAdClick();
                return C2515C.f34653a;
            case 6:
                ((C1984c) this.receiver).destroy();
                return C2515C.f34653a;
            case 7:
                x0 x0Var = ((C1984c) this.receiver).f30069o;
                Boolean bool = Boolean.TRUE;
                x0Var.getClass();
                x0Var.k(null, bool);
                return C2515C.f34653a;
            case 8:
                x0 x0Var2 = ((C2028q) this.receiver).f30492h;
                Boolean bool2 = Boolean.FALSE;
                x0Var2.getClass();
                x0Var2.k(null, bool2);
                return C2515C.f34653a;
            case 9:
                L l10 = (L) this.receiver;
                x0 x0Var3 = l10.f29983j;
                Boolean bool3 = Boolean.TRUE;
                x0Var3.getClass();
                x0Var3.k(null, bool3);
                Boolean bool4 = Boolean.FALSE;
                x0 x0Var4 = l10.f29981h;
                x0Var4.getClass();
                x0Var4.k(null, bool4);
                return C2515C.f34653a;
            case 10:
                t tVar = (t) this.receiver;
                tVar.getClass();
                H.D(tVar.f30448b, null, new r(tVar, u.f30455a, null), 3);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar = tVar.f30450d;
                if (kVar != null) {
                    kVar.d("");
                }
                return C2515C.f34653a;
            case 11:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c.b((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c) this.receiver);
                return C2515C.f34653a;
            case 12:
                ((q) ((y) this.receiver)).f();
                return C2515C.f34653a;
            case 13:
                ((H0) this.receiver).d();
                return C2515C.f34653a;
            case 14:
                ((q) this.receiver).f();
                return C2515C.f34653a;
            case 15:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c) this.receiver).f31978j.f10441f;
                if (eVar != null) {
                    eVar.invoke();
                }
                return C2515C.f34653a;
            case 16:
                C0805a c0805a = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c) this.receiver).f31978j;
                String str = (String) c0805a.f10436a;
                if (str != null) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e) c0805a.f10440e;
                    if (eVar2 != null) {
                        eVar2.invoke();
                    }
                    ((G0) c0805a.f10439d).a(str);
                }
                return C2515C.f34653a;
            case 17:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e) ((h) this.receiver).f32044s.f10441f;
                if (eVar3 != null) {
                    eVar3.invoke();
                }
                return C2515C.f34653a;
            case 18:
                C0805a c0805a2 = ((h) this.receiver).f32044s;
                String str2 = (String) c0805a2.f10436a;
                if (str2 != null) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e) c0805a2.f10440e;
                    if (eVar4 != null) {
                        eVar4.invoke();
                    }
                    ((G0) c0805a2.f10439d).a(str2);
                }
                return C2515C.f34653a;
            case 19:
                q qVar = (q) ((y) this.receiver);
                qVar.a();
                qVar.c(C2099b.f31611f);
                return C2515C.f34653a;
            case 20:
                D d3 = (D) ((q) ((y) this.receiver)).f31644d.getValue();
                if (d3 instanceof z) {
                    i iVar = ((z) d3).f31664a;
                    g position = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.i.f32052a;
                    AbstractC3340k.e(position, "position");
                    String str3 = iVar.f31684a.f31668d;
                    if (str3 != null) {
                        iVar.f31693j.c(position);
                        iVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a.f31672a);
                        iVar.f31689f.a(str3);
                    }
                } else if (d3 instanceof B) {
                    h hVar = ((B) d3).f31603a;
                    g position2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.i.f32052a;
                    AbstractC3340k.e(position2, "position");
                    hVar.b(true, position2);
                } else if (d3 instanceof A) {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty CTA DEC playlist item reached", null, false, 12, null);
                } else if (d3 instanceof C) {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty CTA Mraid playlist item reached", null, false, 12, null);
                } else {
                    if (d3 != null) {
                        throw new Q((byte) 0, 9);
                    }
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty CTA playlist item reached", null, false, 12, null);
                }
                return C2515C.f34653a;
            case 21:
                j jVar = (j) this.receiver;
                jVar.getClass();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "Init exo player", null, false, 12, null);
                s6.C c10 = jVar.f32241l;
                if (c10 != null) {
                    if (jVar.f32245p == null) {
                        E5.r rVar = new E5.r(jVar.f32231a);
                        AbstractC4256a.i(!rVar.f3533s);
                        Looper looper = jVar.f32244o;
                        looper.getClass();
                        rVar.f3522g = looper;
                        AbstractC4256a.i(!rVar.f3533s);
                        rVar.f3531q = true;
                        AbstractC4256a.i(!rVar.f3533s);
                        rVar.f3533s = true;
                        I i5 = new I(rVar);
                        c10.setPlayer(i5);
                        jVar.f32245p = i5;
                        i5.I0(false);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h hVar2 = jVar.f32248s;
                        hVar2.getClass();
                        i5.f3091l.d(hVar2);
                        j.b(i5, jVar.f32243n);
                        jVar.a(i5, jVar.f32242m);
                        long j8 = jVar.f32250u;
                        int iL0 = i5.l0();
                        i5.Q0();
                        i5.E0(j8, iL0, false);
                        if (jVar.f32247r) {
                            i5.I0(true);
                        } else {
                            i5.I0(false);
                        }
                        if (AbstractC3340k.a(jVar.f32237g.getValue(), m.f32073a)) {
                            o oVar = new o(i5.r0());
                            x0 x0Var5 = jVar.f32236f;
                            x0Var5.getClass();
                            x0Var5.k(null, oVar);
                        }
                    }
                    View view = c10.f45056d;
                    if (view instanceof GLSurfaceView) {
                        ((GLSurfaceView) view).onResume();
                    }
                }
                return C2515C.f34653a;
            case 22:
                ((j) this.receiver).c();
                return C2515C.f34653a;
            case 23:
                ((R0) this.receiver).setAdView(null);
                return C2515C.f34653a;
            default:
                ((R0) this.receiver).b();
                return C2515C.f34653a;
        }
    }
}
