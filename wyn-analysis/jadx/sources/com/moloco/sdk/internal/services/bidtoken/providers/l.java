package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import ff.AbstractC2641B;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.I;

/* loaded from: classes4.dex */
public final class l implements j {

    /* renamed from: a, reason: collision with root package name */
    public final List f29497a;

    public l(List list) {
        this.f29497a = list;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        Iterator it = this.f29497a.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        List<j> list = this.f29497a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (j jVar : list) {
            boolean zB = jVar.b();
            if (zB) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ClientBidTokenSignalProviderImpl", "[CBT] Signal provider " + jVar.c() + " needs refresh", null, false, 12, null);
            }
            if (zB) {
                return true;
            }
        }
        return false;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "ClientBidTokenSignalProviderImpl";
    }

    public final Object d() {
        List list = this.f29497a;
        int iD = AbstractC2641B.D(ff.p.a0(list, 10));
        if (iD < 16) {
            iD = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD);
        for (Object obj : list) {
            linkedHashMap.put(H.f39741a.getOrCreateKotlinClass(((j) obj).getClass()), obj);
        }
        I i5 = H.f39741a;
        Object obj2 = linkedHashMap.get(i5.getOrCreateKotlinClass(v.class));
        AbstractC3340k.c(obj2, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.SDKInitStateSignalProvider");
        boolean z2 = ((v) obj2).f29527a;
        Object obj3 = linkedHashMap.get(i5.getOrCreateKotlinClass(u.class));
        AbstractC3340k.c(obj3, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.PrivacyStateSignalProvider");
        MolocoPrivacy.PrivacySettings privacySettings = ((u) obj3).f29526b;
        Object obj4 = linkedHashMap.get(i5.getOrCreateKotlinClass(r.class));
        AbstractC3340k.c(obj4, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.MemorySignalProvider");
        q qVar = ((r) obj4).f29518b;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", "[CBT] lm: " + qVar.f29514a + ", t: " + qVar.f29515b + ", tm: " + qVar.f29516c, false, 4, null);
        Object obj5 = linkedHashMap.get(i5.getOrCreateKotlinClass(e.class));
        AbstractC3340k.c(obj5, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.AppDirInfoSignalProvider");
        d dVar = ((e) obj5).f29476b;
        StringBuilder sb2 = new StringBuilder("[CBT] ADI providing ");
        sb2.append(dVar.f29474a);
        MolocoLogger.debugBuildLog$default(molocoLogger, "ADISignalProvider", sb2.toString(), false, 4, null);
        Object obj6 = linkedHashMap.get(i5.getOrCreateKotlinClass(t.class));
        AbstractC3340k.c(obj6, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.NetworkInfoSignalProvider");
        s sVar = ((t) obj6).f29524b;
        Object obj7 = linkedHashMap.get(i5.getOrCreateKotlinClass(i.class));
        AbstractC3340k.c(obj7, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.BatteryInfoSignalProvider");
        h hVar = ((i) obj7).f29485b;
        Object obj8 = linkedHashMap.get(i5.getOrCreateKotlinClass(c.class));
        AbstractC3340k.c(obj8, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.AdvertisingSignalProvider");
        Fe.c cVarD = ((c) obj8).d();
        Object obj9 = linkedHashMap.get(i5.getOrCreateKotlinClass(n.class));
        AbstractC3340k.c(obj9, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.DeviceSignalProvider");
        m mVar = ((n) obj9).f29503c;
        Object obj10 = linkedHashMap.get(i5.getOrCreateKotlinClass(g.class));
        AbstractC3340k.c(obj10, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.AudioSignalProvider");
        f fVar = ((g) obj10).f29480b;
        Object obj11 = linkedHashMap.get(i5.getOrCreateKotlinClass(b.class));
        AbstractC3340k.c(obj11, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.AccessibilitySignalProvider");
        a aVar = ((b) obj11).f29471b;
        Object obj12 = linkedHashMap.get(i5.getOrCreateKotlinClass(p.class));
        AbstractC3340k.c(obj12, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.IlrdSignalProvider");
        o oVar = ((p) obj12).f29513b;
        Object obj13 = linkedHashMap.get(i5.getOrCreateKotlinClass(x.class));
        AbstractC3340k.c(obj13, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.TestConfigSignalProvider");
        w wVar = ((x) obj13).f29533d;
        MolocoLogger.debugBuildLog$default(molocoLogger, "TCSignalProvider", "[CBT] TCS providing: " + wVar.f29528a, false, 4, null);
        return new k(z2, privacySettings, qVar, dVar, sVar, hVar, cVarD, mVar, fVar, aVar, oVar, wVar);
    }
}
