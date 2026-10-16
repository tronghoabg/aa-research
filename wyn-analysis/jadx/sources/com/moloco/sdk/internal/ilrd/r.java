package com.moloco.sdk.internal.ilrd;

import A7.AbstractC0279p0;
import E5.Q;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2532p;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.k f28636a;

    /* renamed from: b, reason: collision with root package name */
    public final q f28637b;

    /* renamed from: c, reason: collision with root package name */
    public final C2532p f28638c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28639d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f28640e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28641f;

    public r(com.moloco.sdk.internal.services.k timeProvider, String str) {
        long jCurrentTimeMillis;
        o oVar;
        AbstractC3340k.e(timeProvider, "timeProvider");
        this.f28636a = timeProvider;
        q qVar = null;
        if (str != null) {
            try {
                Xf.b bVar = Xf.c.f16251d;
                bVar.getClass();
                qVar = (q) bVar.a(str, q.Companion.serializer());
            } catch (Exception e7) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "IlrdActiveSession", "Error deserializing session data", e7, false, 8, null);
            }
        }
        this.f28637b = qVar;
        this.f28638c = Fe.c.z(new Af.q(this, 8));
        if (qVar != null) {
            jCurrentTimeMillis = qVar.f28635d;
        } else {
            this.f28636a.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.f28639d = jCurrentTimeMillis;
        this.f28640e = new AtomicReference((qVar == null || (oVar = qVar.f28633b) == null) ? new o(-1L, 0, 0, 0, 0, 0) : oVar);
        this.f28641f = qVar != null ? qVar.f28634c : false;
    }

    public final void a(t ilrdData) {
        o oVarA;
        AbstractC3340k.e(ilrdData, "ilrdData");
        if (!(ilrdData instanceof t)) {
            throw new Q((byte) 0, 9);
        }
        String strJ = ilrdData.f28644a.j();
        AbstractC3340k.d(strJ, "getAdFormat(...)");
        String upperCase = strJ.toUpperCase(Locale.ROOT);
        AbstractC3340k.d(upperCase, "toUpperCase(...)");
        this.f28636a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AtomicReference atomicReference = this.f28640e;
        o oVar = (o) atomicReference.get();
        if (Bf.k.n0(upperCase, "BANNER", false)) {
            oVarA = o.a(oVar, jCurrentTimeMillis, oVar.f28604b + 1, 0, 0, 0, 0, 60);
        } else if (Bf.k.n0(upperCase, "MREC", false)) {
            oVarA = o.a(oVar, jCurrentTimeMillis, 0, oVar.f28605c + 1, 0, 0, 0, 58);
        } else if (Bf.k.n0(upperCase, "NATIVE", false)) {
            oVarA = o.a(oVar, jCurrentTimeMillis, 0, 0, oVar.f28606d + 1, 0, 0, 54);
        } else if (Bf.k.n0(upperCase, "INTER", false)) {
            oVarA = o.a(oVar, jCurrentTimeMillis, 0, 0, 0, oVar.f28607e + 1, 0, 46);
        } else {
            if (!Bf.k.n0(upperCase, "REWARD", false)) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdActiveSession", "Unknown ad format for Applovin: ".concat(upperCase), null, false, 12, null);
                return;
            }
            oVarA = o.a(oVar, jCurrentTimeMillis, 0, 0, 0, 0, oVar.f28608f + 1, 30);
        }
        atomicReference.set(oVarA);
    }

    public final o b() {
        Object obj = this.f28640e.get();
        AbstractC3340k.d(obj, "get(...)");
        return (o) obj;
    }

    public final String c() {
        return (String) this.f28638c.getValue();
    }

    public final String toString() {
        o oVarB = b();
        int i5 = oVarB.f28604b;
        int i10 = oVarB.f28605c;
        int i11 = oVarB.f28606d;
        int i12 = oVarB.f28607e;
        int i13 = oVarB.f28608f;
        StringBuilder sb2 = new StringBuilder("IlrdActiveSession(id=");
        sb2.append(c());
        sb2.append(", startTs=");
        sb2.append(this.f28639d);
        sb2.append(", expired=");
        sb2.append(this.f28641f);
        sb2.append(", impressions=");
        sb2.append(i5 + i10 + i11 + i12 + i13);
        sb2.append(" [banner=");
        R8.v.i(i5, i10, ", mrec=", ", native=", sb2);
        R8.v.i(i11, i12, ", interstitial=", ", rewarded=", sb2);
        return AbstractC0279p0.j(i13, "])", sb2);
    }
}
