package com.waze.sound;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cj {

    /* renamed from: a, reason: collision with root package name */
    private final Context f39667a;

    /* renamed from: b, reason: collision with root package name */
    private final kc f39668b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.h.i f39669c;

    public cj(Context context, kc kcVar, com.waze.h.i iVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(kcVar, "voicesFileCacheProvider");
        h.g.b.x.f(iVar, "audioAttributes");
        this.f39667a = context;
        this.f39668b = kcVar;
        this.f39669c = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object a(com.waze.sound.cj r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.sound.ci
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.sound.ci r0 = (com.waze.sound.ci) r0
            int r1 = r0.f39664d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39664d = r1
            goto L18
        L13:
            com.waze.sound.ci r0 = new com.waze.sound.ci
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f39662b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f39664d
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            androidx.media3.datasource.cache.CacheDataSource$Factory r5 = r0.f39666f
            r1 = r5
            androidx.media3.datasource.cache.CacheDataSource$Factory r1 = (androidx.media3.datasource.cache.CacheDataSource.Factory) r1
            java.lang.Object r1 = r0.f39661a
            androidx.media3.datasource.DataSource$Factory r1 = (androidx.media3.datasource.DataSource.Factory) r1
            com.waze.sound.cj r0 = r0.f39665e
            r2 = r0
            com.waze.sound.cj r2 = (com.waze.sound.cj) r2
            e.b.c.b(r6)
            goto L60
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            e.b.c.b(r6)
            androidx.media3.datasource.FileDataSource$Factory r6 = new androidx.media3.datasource.FileDataSource$Factory
            r6.<init>()
            androidx.media3.datasource.DataSource$Factory r6 = (androidx.media3.datasource.DataSource.Factory) r6
            androidx.media3.datasource.cache.CacheDataSource$Factory r2 = new androidx.media3.datasource.cache.CacheDataSource$Factory
            r2.<init>()
            com.waze.sound.kc r4 = r5.f39668b
            r0.f39665e = r5
            r0.f39661a = r6
            r0.f39666f = r2
            r0.f39664d = r3
            java.lang.Object r0 = r4.b(r0)
            if (r0 == r1) goto L94
            r1 = r6
            r6 = r0
            r0 = r5
            r5 = r2
        L60:
            androidx.media3.datasource.cache.Cache r6 = (androidx.media3.datasource.cache.Cache) r6
            r5.setCache(r6)
            r5.setUpstreamDataSourceFactory(r1)
            java.lang.String r6 = "setUpstreamDataSourceFactory(...)"
            h.g.b.x.e(r5, r6)
            androidx.media3.exoplayer.ExoPlayer$Builder r6 = new androidx.media3.exoplayer.ExoPlayer$Builder
            android.content.Context r1 = r0.f39667a
            r6.<init>(r1)
            androidx.media3.exoplayer.source.DefaultMediaSourceFactory r1 = new androidx.media3.exoplayer.source.DefaultMediaSourceFactory
            androidx.media3.datasource.DataSource$Factory r5 = (androidx.media3.datasource.DataSource.Factory) r5
            r1.<init>(r5)
            androidx.media3.exoplayer.source.MediaSource$Factory r1 = (androidx.media3.exoplayer.source.MediaSource.Factory) r1
            r6.setMediaSourceFactory(r1)
            com.waze.h.i r5 = r0.f39669c
            androidx.media3.common.AudioAttributes r5 = com.waze.app_nav.hub.b.m.e(r5)
            r0 = 0
            r6.setAudioAttributes(r5, r0)
            androidx.media3.exoplayer.ExoPlayer r5 = r6.build()
            java.lang.String r6 = "build(...)"
            h.g.b.x.e(r5, r6)
            return r5
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.cj.a(com.waze.sound.cj, h.c.e):java.lang.Object");
    }
}
