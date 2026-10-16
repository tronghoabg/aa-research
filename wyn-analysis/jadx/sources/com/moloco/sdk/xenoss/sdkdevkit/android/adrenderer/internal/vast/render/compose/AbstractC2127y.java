package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import B.C0317h;
import K.AbstractC0676a;
import K.AbstractC0682g;
import K.C0680e;
import K.C0685j;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import N.L0;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import e0.C2444G;
import e0.C2465q;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2127y {

    /* renamed from: a, reason: collision with root package name */
    public static final float f31960a = 4;

    public static final void a(final Z.k kVar, final String str, final long j8, final tf.a onClick, C0740o c0740o, final int i5) {
        int i10;
        AbstractC3340k.e(onClick, "onClick");
        c0740o.N(-1735772917);
        if ((i5 & 6) == 0) {
            i10 = (c0740o.e(kVar) ? 4 : 2) | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            i10 |= c0740o.e(null) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i10 |= c0740o.e(str) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i10 |= c0740o.d(j8) ? 2048 : Segment.SHARE_MINIMUM;
        }
        if ((i5 & 24576) == 0) {
            i10 |= c0740o.e(onClick) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE;
        }
        if ((i10 & 9363) == 9362 && c0740o.x()) {
            c0740o.I();
        } else {
            c0740o.K();
            if ((i5 & 1) != 0 && !c0740o.w()) {
                c0740o.I();
            }
            c0740o.q();
            Z.k kVarJ = Fe.e.j(E.L.g(E.L.b(kVar, 48), 156));
            float f10 = 0;
            float f11 = f31960a;
            E.F f12 = new E.F(f11, f10, f11, f10);
            V.d dVarB = V.e.b(c0740o, 1553541117, new C2126x(str, j8));
            int i11 = ((i10 >> 12) & 14) | 905969664;
            c0740o.M(-1776134358);
            c0740o.M(-492369756);
            Object objF = c0740o.F();
            if (objF == C0732k.f7800a) {
                objF = new D.i();
                c0740o.U(objF);
            }
            c0740o.p(false);
            H.d dVar = ((K.z) c0740o.j(K.A.f6149a)).f6309a;
            E.F f13 = AbstractC0676a.f6216a;
            c0740o.M(-2091313033);
            L0 l02 = AbstractC0682g.f6260a;
            C0317h c0317h = new C0317h(AbstractC0676a.f6219d, new C2444G(C2465q.a(((C0680e) c0740o.j(l02)).a(), 0.12f)));
            c0740o.p(false);
            c0740o.M(-2124406093);
            long jC = ((C0680e) c0740o.j(l02)).c();
            long jB = ((C0680e) c0740o.j(l02)).b();
            long jA = ((C0680e) c0740o.j(l02)).a();
            Ba.c.y(c0740o);
            C0685j c0685j = new C0685j(jC, jB, jC, C2465q.a(jA, 0.38f));
            c0740o.p(false);
            A6.h.a(onClick, kVarJ, true, (D.i) objF, null, dVar, c0317h, c0685j, f12, dVarB, c0740o, i11 & 2147483646, 0);
            c0740o.p(false);
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new tf.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.w
                @Override // tf.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int i12 = i5 | 1;
                    String str2 = str;
                    long j10 = j8;
                    tf.a aVar = onClick;
                    AbstractC2127y.a(kVar, str2, j10, aVar, (C0740o) obj, i12);
                    return C2515C.f34653a;
                }
            };
        }
    }
}
