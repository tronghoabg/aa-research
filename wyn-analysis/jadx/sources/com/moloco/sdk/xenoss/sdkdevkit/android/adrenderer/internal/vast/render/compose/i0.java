package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import Ef.H0;
import Hf.k0;
import Hf.x0;
import N.C0718d;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import N.C0745t;
import a.AbstractC1304a;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.InterfaceC1457v;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Ff.e f31893a;

    static {
        Lf.e eVar = Ef.S.f3698a;
        f31893a = Jf.n.f6132a;
    }

    public static final void a(String uri, final boolean z2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z play, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z seekToMillis, final boolean z10, final tf.l isPlaying, final tf.l isVisible, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S s10, final tf.l onProgressChanged, final tf.l onError, final Z.k kVar, C0740o c0740o, final int i5) {
        int i10;
        String str;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z zVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z zVar2;
        AbstractC3340k.e(uri, "uri");
        AbstractC3340k.e(play, "play");
        AbstractC3340k.e(seekToMillis, "seekToMillis");
        AbstractC3340k.e(isPlaying, "isPlaying");
        AbstractC3340k.e(isVisible, "isVisible");
        AbstractC3340k.e(onProgressChanged, "onProgressChanged");
        AbstractC3340k.e(onError, "onError");
        c0740o.N(32444032);
        if ((i5 & 6) == 0) {
            i10 = (c0740o.e(uri) ? 4 : 2) | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            i10 |= c0740o.f(z2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i10 |= c0740o.e(play) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i10 |= c0740o.e(seekToMillis) ? 2048 : Segment.SHARE_MINIMUM;
        }
        if ((i5 & 24576) == 0) {
            i10 |= c0740o.f(z10) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE;
        }
        if ((196608 & i5) == 0) {
            i10 |= c0740o.e(isPlaying) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i10 |= c0740o.e(isVisible) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i10 |= c0740o.e(s10) ? 8388608 : 4194304;
        }
        if ((100663296 & i5) == 0) {
            i10 |= c0740o.e(onProgressChanged) ? 67108864 : 33554432;
        }
        if ((805306368 & i5) == 0) {
            i10 |= c0740o.e(onError) ? 536870912 : 268435456;
        }
        int i11 = c0740o.e(kVar) ? 4 : 2;
        if ((i10 & 306783379) == 306783378 && (i11 & 3) == 2 && c0740o.x()) {
            c0740o.I();
            str = uri;
            zVar = seekToMillis;
            zVar2 = play;
        } else {
            Context context = (Context) c0740o.j(AndroidCompositionLocals_androidKt.f18012b);
            AbstractC1451o lifecycle = ((InterfaceC1457v) c0740o.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
            c0740o.M(-794102752);
            boolean zE = c0740o.e(context) | c0740o.f(z2) | c0740o.e(lifecycle);
            Object objF = c0740o.F();
            Object obj = C0732k.f7800a;
            if (zE || objF == obj) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o oVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o) com.moloco.sdk.service_locator.g.f29851b.getValue();
                com.moloco.sdk.acm.recorder.b.Companion.getClass();
                Object oVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j(context, z2, oVar, lifecycle, new com.moloco.sdk.acm.recorder.c(null)), s10);
                c0740o.U(oVar2);
                objF = oVar2;
            }
            final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o oVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o) objF;
            c0740o.p(false);
            c0740o.M(773894976);
            c0740o.M(-492369756);
            Object objF2 = c0740o.F();
            if (objF2 == obj) {
                objF2 = new C0745t(C0718d.x(f31893a, c0740o));
                c0740o.U(objF2);
            }
            c0740o.p(false);
            final Kd.a aVar = ((C0745t) objF2).f7923a;
            c0740o.p(false);
            final N.V vI = C0718d.I(isPlaying, c0740o);
            final N.V vI2 = C0718d.I(isVisible, c0740o);
            Object[] objArr = new Object[0];
            c0740o.M(-794070732);
            Object objF3 = c0740o.F();
            if (objF3 == obj) {
                objF3 = new com.moloco.sdk.service_locator.h(20);
                c0740o.U(objF3);
            }
            c0740o.p(false);
            final N.V v2 = (N.V) gc.b.E(objArr, null, (tf.a) objF3, c0740o, 3072, 6);
            Object[] objArr2 = new Object[0];
            c0740o.M(-794067820);
            Object objF4 = c0740o.F();
            if (objF4 == obj) {
                objF4 = new com.moloco.sdk.service_locator.h(21);
                c0740o.U(objF4);
            }
            c0740o.p(false);
            final N.V v10 = (N.V) gc.b.E(objArr2, null, (tf.a) objF4, c0740o, 3072, 6);
            final N.V vI3 = C0718d.I(onProgressChanged, c0740o);
            final N.V vI4 = C0718d.I(onError, c0740o);
            c0740o.M(-794060174);
            boolean zE2 = c0740o.e(oVar3) | c0740o.e(vI) | c0740o.e(v10) | c0740o.e(v2) | c0740o.e(vI2) | c0740o.e(aVar) | c0740o.e(vI3) | c0740o.e(vI4);
            Object objF5 = c0740o.F();
            if (zE2 || objF5 == obj) {
                objF5 = new tf.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.V
                    @Override // tf.l
                    public final Object invoke(Object obj2) {
                        N.C DisposableEffect = (N.C) obj2;
                        AbstractC3340k.e(DisposableEffect, "$this$DisposableEffect");
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o oVar4 = oVar3;
                        x0 x0Var = oVar4.f32264d;
                        N.V v11 = vI;
                        Hf.Z z11 = new Hf.Z(x0Var, new X(v10, v2, oVar4, v11, vI2, null), 0);
                        Kd.a aVar2 = aVar;
                        H0 h0U = k0.u(z11, aVar2);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j jVar = oVar4.f32261a;
                        return new h0(AbstractC3935e.D(h0U, k0.u(new Hf.Z(jVar.f32237g, new Y(vI3, null), 0), aVar2), k0.u(new Hf.Z(new Hf.A(jVar.k, 1), new Z(vI4, null), 0), aVar2)), oVar4, v11);
                    }
                };
                c0740o.U(objF5);
            }
            c0740o.p(false);
            C0718d.c(oVar3, (tf.l) objF5, c0740o);
            C2515C c2515c = C2515C.f34653a;
            c0740o.M(-794023404);
            boolean zE3 = c0740o.e(oVar3);
            Object objF6 = c0740o.F();
            if (zE3 || objF6 == obj) {
                objF6 = new a0(oVar3, null);
                c0740o.U(objF6);
            }
            c0740o.p(false);
            C0718d.d(c0740o, c2515c, (tf.p) objF6);
            c0740o.M(-794011885);
            boolean zE4 = c0740o.e(oVar3) | c0740o.e(uri) | c0740o.e(seekToMillis) | c0740o.e(play);
            Object objF7 = c0740o.F();
            if (zE4 || objF7 == obj) {
                Object c0Var = new c0(oVar3, uri, seekToMillis, play, null);
                str = uri;
                zVar = seekToMillis;
                zVar2 = play;
                c0740o.U(c0Var);
                objF7 = c0Var;
            } else {
                str = uri;
                zVar = seekToMillis;
                zVar2 = play;
            }
            c0740o.p(false);
            C0718d.e(oVar3, str, zVar, (tf.p) objF7, c0740o);
            c0740o.M(-793995218);
            boolean zE5 = c0740o.e(oVar3) | c0740o.e(zVar2);
            Object objF8 = c0740o.F();
            if (zE5 || objF8 == obj) {
                objF8 = new e0(oVar3, zVar2, null);
                c0740o.U(objF8);
            }
            c0740o.p(false);
            C0718d.f(oVar3, zVar2, (tf.p) objF8, c0740o);
            Boolean boolValueOf = Boolean.valueOf(z10);
            c0740o.M(-793989594);
            boolean zE6 = c0740o.e(oVar3) | c0740o.f(z10);
            Object objF9 = c0740o.F();
            if (zE6 || objF9 == obj) {
                objF9 = new g0(oVar3, z10, null);
                c0740o.U(objF9);
            }
            c0740o.p(false);
            C0718d.f(oVar3, boolValueOf, (tf.p) objF9, c0740o);
            Object obj2 = oVar3.f32261a.f32241l;
            if (obj2 != null) {
                c0740o.M(-1928429689);
                boolean zE7 = c0740o.e(obj2);
                Object objF10 = c0740o.F();
                if (zE7 || objF10 == obj) {
                    objF10 = new Af.r(obj2, 24);
                    c0740o.U(objF10);
                }
                c0740o.p(false);
                AbstractC1304a.c((tf.l) objF10, kVar, null, c0740o, (i11 << 3) & 112, 4);
            }
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            final String str2 = str;
            final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z zVar3 = zVar2;
            final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z zVar4 = zVar;
            c0729i0R.f7788d = new tf.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.W
                @Override // tf.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int i12 = i5 | 1;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S s11 = s10;
                    tf.l lVar = onError;
                    Z.k kVar2 = kVar;
                    i0.a(str2, z2, zVar3, zVar4, z10, isPlaying, isVisible, s11, onProgressChanged, lVar, kVar2, (C0740o) obj3, i12);
                    return C2515C.f34653a;
                }
            };
        }
    }
}
