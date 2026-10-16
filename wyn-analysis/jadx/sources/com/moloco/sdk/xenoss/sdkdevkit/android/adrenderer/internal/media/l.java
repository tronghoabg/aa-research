package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import E5.Q;
import Ef.E;
import Ef.H;
import U8.v0;
import com.moloco.sdk.internal.A;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.y;
import com.moloco.sdk.internal.z;
import ef.C2515C;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.HashSet;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class l extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public Nf.a f30296a;

    /* renamed from: b, reason: collision with root package name */
    public o f30297b;

    /* renamed from: c, reason: collision with root package name */
    public String f30298c;

    /* renamed from: d, reason: collision with root package name */
    public String f30299d;

    /* renamed from: e, reason: collision with root package name */
    public int f30300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f30301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f30302g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f30303h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, o oVar, String str2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30301f = str;
        this.f30302g = oVar;
        this.f30303h = str2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new l(this.f30301f, this.f30302g, this.f30303h, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        Nf.a aVar;
        o oVar;
        String str;
        String str2;
        Object objPutIfAbsent;
        Object objPutIfAbsent2;
        kf.a aVar2 = kf.a.f39711a;
        int i5 = this.f30300e;
        if (i5 == 0) {
            Fe.e.U(obj);
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("Streaming media for: ");
            String str3 = this.f30301f;
            sb2.append(str3);
            MolocoLogger.info$default(molocoLogger, "MediaCacheRepository", sb2.toString(), null, false, 12, null);
            if (str3.length() == 0) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e(f.k);
            }
            o oVar2 = this.f30302g;
            ConcurrentHashMap concurrentHashMap = oVar2.f30312e;
            Object objA = concurrentHashMap.get(str3);
            if (objA == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str3, (objA = Nf.e.a()))) != null) {
                objA = objPutIfAbsent;
            }
            aVar = (Nf.a) objA;
            this.f30296a = aVar;
            this.f30297b = oVar2;
            this.f30298c = str3;
            String str4 = this.f30303h;
            this.f30299d = str4;
            this.f30300e = 1;
            if (aVar.b(this) == aVar2) {
                return aVar2;
            }
            oVar = oVar2;
            str = str4;
            str2 = str3;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str5 = this.f30299d;
            str2 = this.f30298c;
            oVar = this.f30297b;
            aVar = this.f30296a;
            Fe.e.U(obj);
            str = str5;
        }
        try {
            A aB = oVar.b();
            if (aB instanceof y) {
                return ((y) aB).f29793a;
            }
            if (!(aB instanceof z)) {
                throw new Q((byte) 0, 9);
            }
            File file = new File((File) ((z) aB).f29794a, v0.k(str2));
            MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger2, "MediaCacheRepository", "Going to download the media file to location: " + file.getAbsolutePath(), null, false, 12, null);
            ConcurrentHashMap concurrentHashMap2 = oVar.f30314g;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) concurrentHashMap2.get(str2);
            HashSet hashSet = oVar.f30313f;
            boolean zContains = hashSet.contains(str2);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g gVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.i.f30335a;
            if (zContains) {
                MolocoLogger.info$default(molocoLogger2, "MediaCacheRepository", "Media file is already being downloaded, so returning in progress status for url: ".concat(str2), null, false, 12, null);
                return cVar != null ? cVar.f30324a : new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f(file, gVar);
            }
            if (oVar.f30309b.j(file)) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d(file);
            }
            MolocoLogger.info$default(molocoLogger2, "MediaCacheRepository", "Media file needs to be downloaded: ".concat(str2), null, false, 12, null);
            hashSet.add(str2);
            Object cVar2 = concurrentHashMap2.get(str2);
            if (cVar2 == null && (objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(str2, (cVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f(file, gVar))))) != null) {
                cVar2 = objPutIfAbsent2;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) cVar2;
            H.D(oVar.f30311d, null, new k(oVar, str2, file, str, cVar3, null), 3);
            return cVar3.f30324a;
        } finally {
            aVar.a(null);
        }
    }
}
