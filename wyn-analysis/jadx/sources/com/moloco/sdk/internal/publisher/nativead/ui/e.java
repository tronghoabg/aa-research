package com.moloco.sdk.internal.publisher.nativead.ui;

import N.C0740o;
import Z.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.AbstractC2124v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C2121s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C2123u;
import com.wynauto.wyn.R;
import e0.C2465q;
import ef.C2515C;
import ff.AbstractC2641B;
import r7.AbstractC3935e;
import tf.p;

/* loaded from: classes4.dex */
public final class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f29254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S8.d f29255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f29256c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S f29257d;

    public e(g gVar, S8.d dVar, k kVar, S s10) {
        this.f29254a = gVar;
        this.f29255b = dVar;
        this.f29256c = kVar;
        this.f29257d = s10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C0740o c0740o = (C0740o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0740o.x()) {
            c0740o.I();
        } else {
            q qVar = this.f29254a.f29262a;
            long j8 = C2465q.f34373b;
            S8.d dVar = this.f29255b;
            C2121s c2121s = new C2121s(dVar, dVar, dVar);
            c0740o.M(-1062465295);
            V.d dVarB = AbstractC3935e.b(0L, 0L, 0L, Z.a.f16900a, null, C2465q.f34375d, AbstractC2641B.H(R.drawable.moloco_twotone_volume_off_24, c0740o), AbstractC2641B.H(R.drawable.moloco_twotone_volume_up_24, c0740o), c0740o, 559);
            c0740o.p(false);
            V.d dVar2 = h.f29265a;
            int i5 = AbstractC2124v.f31952a;
            c0740o.M(718660168);
            V.d dVarB2 = V.e.b(c0740o, 1901828083, new C2123u(dVar2));
            c0740o.p(false);
            AbstractC3935e.f(qVar, this.f29256c, j8, dVarB, null, null, null, null, c2121s, null, null, dVarB2, this.f29257d, false, c0740o, 818110848, 9280);
        }
        return C2515C.f34653a;
    }
}
