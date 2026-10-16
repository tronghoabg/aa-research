package com.moloco.sdk.internal;

import E.AbstractC0419i;
import E.C0412b;
import E.E;
import E.J;
import E.L;
import K.I;
import N.C0718d;
import N.C0729i0;
import N.C0740o;
import U8.v0;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.moloco.sdk.internal.publisher.H;
import ef.C2515C;
import ka.AbstractC3230e0;
import r0.C3902g;
import r0.InterfaceC3909n;
import t0.C4054b;
import t0.C4056d;
import t0.InterfaceC4055c;
import u0.InterfaceC4193p0;
import u0.M;
import x0.C4435e;

/* loaded from: classes4.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final long f29792a = e0.z.c(4278354171L);

    public static final void a(final Z.k kVar, final String str, final String str2, final long j8, final long j10, final tf.a aVar, C0740o c0740o, final int i5) {
        int i10;
        String str3;
        c0740o.N(2035340272);
        if ((i5 & 6) == 0) {
            i10 = (c0740o.e(kVar) ? 4 : 2) | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            i10 |= c0740o.e(str) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            str3 = str2;
            i10 |= c0740o.e(str3) ? 256 : 128;
        } else {
            str3 = str2;
        }
        if ((i5 & 3072) == 0) {
            i10 |= c0740o.d(j8) ? 2048 : Segment.SHARE_MINIMUM;
        }
        if ((i5 & 24576) == 0) {
            i10 |= c0740o.d(j10) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE;
        }
        if ((196608 & i5) == 0) {
            i10 |= c0740o.e(aVar) ? 131072 : 65536;
        }
        if ((74899 & i10) == 74898 && c0740o.x()) {
            c0740o.I();
        } else {
            Z.i iVar = Z.i.f16922a;
            float f10 = 4;
            H.d dVarA = H.e.a(f10);
            Z.k kVarR = H.R(Fe.e.j(v0.l(ic.d.k(L.g(kVar, 164), dVarA), j10, e0.z.f34394a)), new C4435e(0), aVar, 1);
            C0412b c0412b = AbstractC0419i.f2745c;
            c0740o.M(693286680);
            InterfaceC3909n interfaceC3909nA = J.a(c0412b, c0740o);
            c0740o.M(-1323940314);
            L0.b bVar = (L0.b) c0740o.j(M.f46143e);
            L0.i iVar2 = (L0.i) c0740o.j(M.k);
            int i11 = i10;
            InterfaceC4193p0 interfaceC4193p0 = (InterfaceC4193p0) c0740o.j(M.f46152o);
            InterfaceC4055c.g9.getClass();
            C4056d c4056d = C4054b.f45453b;
            V.d dVarY = S3.f.y(kVarR);
            c0740o.O();
            if (c0740o.f7843O) {
                c0740o.k(c4056d);
            } else {
                c0740o.X();
            }
            c0740o.f7867x = false;
            C0718d.M(c0740o, interfaceC3909nA, C4054b.f45456e);
            C0718d.M(c0740o, bVar, C4054b.f45455d);
            C0718d.M(c0740o, iVar2, C4054b.f45457f);
            wg.b.d(0, dVarY, wg.b.b(c0740o, interfaceC4193p0, C4054b.f45458g, c0740o), c0740o, 2058660585);
            c0740o.M(-678309503);
            c0740o.M(-118884691);
            if (str != null) {
                AbstractC3230e0.b(c0740o, L.f(f10));
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.a(str, C3902g.f44297b, ic.d.k(L.c(iVar, 36), dVarA), c0740o, ((i11 >> 3) & 14) | 48);
            }
            c0740o.p(false);
            float f11 = 15;
            float f12 = 12;
            E e7 = new E(f11, f12, f11, f12);
            iVar.g(e7);
            I.b(str3, e7, j8, 0L, E0.l.f2800f, E0.o.f2803a, 0L, null, 0L, 0, false, 1, null, null, c0740o, ((i11 >> 6) & 14) | 196656 | ((i11 >> 3) & 896), 3072, 57240);
            wg.b.e(c0740o, false, false, true, false);
            c0740o.p(false);
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new tf.p() { // from class: com.moloco.sdk.internal.t
                @Override // tf.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int i12 = i5 | 1;
                    long j11 = j10;
                    tf.a aVar2 = aVar;
                    x.a(kVar, str, str2, j8, j11, aVar2, (C0740o) obj, i12);
                    return C2515C.f34653a;
                }
            };
        }
    }
}
