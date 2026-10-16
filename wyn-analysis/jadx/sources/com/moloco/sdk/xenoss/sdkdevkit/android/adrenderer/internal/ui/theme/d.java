package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme;

import K.AbstractC0682g;
import K.C0680e;
import N.C0729i0;
import N.C0740o;
import N.L0;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e0.C2465q;
import e0.z;
import ef.C2515C;
import tf.p;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0680e f31044a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0680e f31045b;

    static {
        long j8 = a.f31040a;
        long j10 = C2465q.f34375d;
        L0 l02 = AbstractC0682g.f6260a;
        long jC = z.c(4279374354L);
        long jC2 = z.c(4279374354L);
        long jC3 = z.c(4291782265L);
        long j11 = C2465q.f34373b;
        f31044a = new C0680e(j8, j8, j10, j10, jC, jC2, jC3, j11, j11, j10, j10, j11, false);
        f31045b = AbstractC0682g.c(j8, j8, 4088, j10);
    }

    public static final void a(final boolean z2, V.d dVar, C0740o c0740o, final int i5) {
        final V.d dVar2;
        C0740o c0740o2;
        c0740o.N(156854067);
        if (((i5 | 2) & 19) == 18 && c0740o.x()) {
            c0740o.I();
            dVar2 = dVar;
            c0740o2 = c0740o;
        } else {
            c0740o.K();
            if ((i5 & 1) == 0 || c0740o.w()) {
                z2 = (((Configuration) c0740o.j(AndroidCompositionLocals_androidKt.f18011a)).uiMode & 48) == 32;
            } else {
                c0740o.I();
            }
            c0740o.q();
            dVar2 = dVar;
            c0740o2 = c0740o;
            Fe.c.c(z2 ? f31044a : f31045b, e.f31046a, b.f31041a, dVar2, c0740o2, 3504, 0);
        }
        C0729i0 c0729i0R = c0740o2.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new p(z2, dVar2, i5) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.c

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f31042a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ V.d f31043b;

                @Override // tf.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    V.d dVar3 = this.f31043b;
                    d.a(this.f31042a, dVar3, (C0740o) obj, 49);
                    return C2515C.f34653a;
                }
            };
        }
    }
}
