package p0;

import A.W;
import E5.C0441b;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.moloco.sdk.internal.publisher.H;
import com.unity3d.services.UnityAdsConstants;
import d0.C2384c;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3906k;
import t0.y;

/* loaded from: classes.dex */
public final class q extends n {

    /* renamed from: c, reason: collision with root package name */
    public int f43167c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f43168d;

    public q(r rVar) {
        this.f43168d = rVar;
    }

    public final void A(f fVar) {
        List list = fVar.f43133a;
        int size = list.size();
        int i5 = 0;
        while (true) {
            r rVar = this.f43168d;
            if (i5 >= size) {
                InterfaceC3906k interfaceC3906k = this.f43163a;
                if (interfaceC3906k == null) {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
                H.u0(fVar, ((y) interfaceC3906k).W(C2384c.f33931b), new W(21, this, rVar), false);
                if (this.f43167c == 2) {
                    int size2 = list.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((k) list.get(i10)).a();
                    }
                    C0441b c0441b = fVar.f43134b;
                    if (c0441b == null) {
                        return;
                    }
                    c0441b.f3290b = !rVar.f43171c;
                    return;
                }
                return;
            }
            if (((k) list.get(i5)).b()) {
                if (this.f43167c == 2) {
                    InterfaceC3906k interfaceC3906k2 = this.f43163a;
                    if (interfaceC3906k2 == null) {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                    H.u0(fVar, ((y) interfaceC3906k2).W(C2384c.f33931b), new p(rVar, 0), true);
                }
                this.f43167c = 3;
                return;
            }
            i5++;
        }
    }

    @Override // p0.n
    public final void a() {
        if (this.f43167c == 2) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            r rVar = this.f43168d;
            p pVar = new p(rVar, 1);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            motionEventObtain.setSource(0);
            pVar.invoke(motionEventObtain);
            motionEventObtain.recycle();
            this.f43167c = 1;
            rVar.f43171c = false;
        }
    }

    @Override // p0.n
    public final void n(f pointerEvent, g gVar, long j8) {
        boolean z2;
        AbstractC3340k.e(pointerEvent, "pointerEvent");
        r rVar = this.f43168d;
        boolean z10 = rVar.f43171c;
        List list = pointerEvent.f43133a;
        if (z10) {
            z2 = true;
            break;
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            k kVar = (k) list.get(i5);
            if (android.support.v4.media.session.b.N(kVar) || android.support.v4.media.session.b.P(kVar)) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        int i10 = this.f43167c;
        g gVar2 = g.f43138c;
        if (i10 != 3) {
            if (gVar == g.f43136a && z2) {
                A(pointerEvent);
            }
            if (gVar == gVar2 && !z2) {
                A(pointerEvent);
            }
        }
        if (gVar == gVar2) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (!android.support.v4.media.session.b.P((k) list.get(i11))) {
                    return;
                }
            }
            this.f43167c = 1;
            rVar.f43171c = false;
        }
    }
}
