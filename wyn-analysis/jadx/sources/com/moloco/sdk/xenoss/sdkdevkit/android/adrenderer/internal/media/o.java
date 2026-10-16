package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import E5.Q;
import Ef.H;
import Ef.S;
import U8.v0;
import Va.X7;
import com.moloco.sdk.internal.A;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.y;
import com.moloco.sdk.internal.z;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.HashSet;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Dd.c f30308a;

    /* renamed from: b, reason: collision with root package name */
    public final X7 f30309b;

    /* renamed from: c, reason: collision with root package name */
    public final G4.c f30310c;

    /* renamed from: d, reason: collision with root package name */
    public final Kd.a f30311d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f30312e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f30313f;

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f30314g;

    public o(p mediaConfig, Dd.c cVar, X7 x72, G4.c cVar2) {
        AbstractC3340k.e(mediaConfig, "mediaConfig");
        this.f30308a = cVar;
        this.f30309b = x72;
        this.f30310c = cVar2;
        Lf.e eVar = S.f3698a;
        Lf.d dVar = Lf.d.f7120b;
        this.f30311d = H.c(dVar);
        this.f30312e = new ConcurrentHashMap();
        this.f30313f = new HashSet();
        this.f30314g = new ConcurrentHashMap();
        H.c(dVar);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h a(String url) {
        AbstractC3340k.e(url, "url");
        A aB = b();
        if (aB instanceof y) {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h) ((y) aB).f29793a;
        }
        if (!(aB instanceof z)) {
            throw new Q((byte) 0, 9);
        }
        File file = new File((File) ((z) aB).f29794a, v0.k(url));
        if (file.exists() && this.f30309b.j(file)) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d(file);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) this.f30314g.get(url);
        return cVar != null ? cVar.f30324a : new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f(file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.i.f30335a);
    }

    public final A b() {
        A aC = c();
        if (!(aC instanceof y)) {
            if (aC instanceof z) {
                return new z(((z) aC).f29794a);
            }
            throw new Q((byte) 0, 9);
        }
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb2 = new StringBuilder("Failed to retrieve storageDir with error code: ");
        com.moloco.sdk.internal.n nVar = (com.moloco.sdk.internal.n) ((y) aC).f29793a;
        sb2.append(nVar.f28666b);
        MolocoLogger.warn$default(molocoLogger, "MediaCacheRepository", sb2.toString(), null, false, 12, null);
        switch (nVar.f28666b) {
            case 100:
                return new y(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e(f.f30267c));
            case 101:
                return new y(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e(f.f30266b));
            case 102:
                return new y(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e(f.f30265a));
            default:
                return new y(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e(f.f30268d));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[Catch: Exception -> 0x002a, SecurityException -> 0x002d, IOException -> 0x0030, TRY_LEAVE, TryCatch #4 {IOException -> 0x0030, SecurityException -> 0x002d, Exception -> 0x002a, blocks: (B:3:0x0010, B:5:0x0016, B:7:0x0024, B:14:0x0033), top: B:44:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce A[Catch: Exception -> 0x00c5, SecurityException -> 0x00c8, IOException -> 0x00cb, TRY_LEAVE, TryCatch #3 {IOException -> 0x00cb, SecurityException -> 0x00c8, Exception -> 0x00c5, blocks: (B:22:0x0099, B:24:0x009f, B:26:0x00b1, B:33:0x00ce), top: B:47:0x0099 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.moloco.sdk.internal.A c() {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o.c():com.moloco.sdk.internal.A");
    }
}
