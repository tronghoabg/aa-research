package com.waze.sound;

import android.content.Context;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheSpan;
import androidx.media3.exoplayer.offline.Download;
import androidx.media3.exoplayer.offline.DownloadIndex;
import androidx.media3.exoplayer.offline.DownloadManager;
import com.waze.config.ConfigValues;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class jl implements iv {

    /* renamed from: a, reason: collision with root package name */
    private final Context f40322a;

    /* renamed from: b, reason: collision with root package name */
    private final kc f40323b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40324c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sound.f.j f40325d;

    /* renamed from: e, reason: collision with root package name */
    private final em f40326e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f40327f;

    /* renamed from: g, reason: collision with root package name */
    private volatile DownloadManager f40328g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.af f40329h;

    /* renamed from: i, reason: collision with root package name */
    private final HashSet f40330i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.h.a f40331j;

    public jl(Context context, kc kcVar, com.waze.shared_infra.i.e eVar, iw iwVar, com.waze.sound.f.j jVar, em emVar, com.waze.shared_infra.i.b bVar, kotlinx.coroutines.ab abVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(kcVar, "voicesFileCacheProvider");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(iwVar, "config");
        h.g.b.x.f(jVar, "voiceStatsSender");
        h.g.b.x.f(emVar, "soundConfig");
        h.g.b.x.f(bVar, "exceptionReporter");
        h.g.b.x.f(abVar, "ioDispatcher");
        this.f40322a = context;
        this.f40323b = kcVar;
        this.f40324c = eVar;
        this.f40325d = jVar;
        this.f40326e = emVar;
        this.f40327f = bVar;
        this.f40328g = null;
        this.f40329h = kotlinx.coroutines.aj.e(abVar);
        this.f40330i = new HashSet();
        this.f40331j = kotlinx.coroutines.h.i.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(String str, String str2, Integer num) {
        if (this.f40326e.getVoiceInfraStatSendingEnabled()) {
            com.waze.sound.f.j jVar = this.f40325d;
            com.waze.sound.f.h hVar = com.waze.sound.f.h.f39996c;
            Objects.toString(num);
            jVar.c(null, str, hVar, "DownloadManager failed with error code ".concat(num.toString()), str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(String str, String str2) {
        if (this.f40326e.getVoiceInfraStatSendingEnabled()) {
            this.f40325d.c(null, str, com.waze.sound.f.h.f39994a, null, str2);
        }
    }

    private final boolean C(String str, Integer num, Cache cache) {
        HashSet hashSet = this.f40330i;
        if (hashSet.contains(str)) {
            return true;
        }
        boolean zContains = cache.getKeys().contains(str);
        if (num == null || num.intValue() != 3 || !zContains) {
            return false;
        }
        if (hashSet.size() < 5000) {
            hashSet.add(str);
        } else {
            this.f40324c.g("TTS inMemoryCache reached max capacity of 5000. Can't add ".concat(String.valueOf(str)));
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object m(com.waze.sound.jl r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.sound.jb
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.sound.jb r0 = (com.waze.sound.jb) r0
            int r1 = r0.f40280c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40280c = r1
            goto L18
        L13:
            com.waze.sound.jb r0 = new com.waze.sound.jb
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f40278a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40280c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            com.waze.sound.jl r6 = r0.f40281d
            r0 = r6
            com.waze.sound.jl r0 = (com.waze.sound.jl) r0
            e.b.c.b(r7)
            goto L75
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            com.waze.sound.jl r6 = r0.f40281d
            r2 = r6
            com.waze.sound.jl r2 = (com.waze.sound.jl) r2
            e.b.c.b(r7)
            goto L56
        L40:
            e.b.c.b(r7)
            com.waze.shared_infra.i.e r7 = r6.f40324c
            java.lang.String r2 = "clear voice files cache"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r7.e(r2)
            r0.f40281d = r6
            r0.f40280c = r4
            java.lang.Object r7 = r6.y(r0)
            if (r7 == r1) goto L7d
        L56:
            androidx.media3.datasource.cache.Cache r7 = (androidx.media3.datasource.cache.Cache) r7
            r0.f40281d = r6
            r0.f40280c = r3
            kotlinx.coroutines.ab r2 = kotlinx.coroutines.av.b()
            h.c.j r2 = (h.c.j) r2
            com.waze.sound.aw r3 = new com.waze.sound.aw
            r5 = 0
            r3.<init>(r7, r5, r4)
            h.g.a.p r3 = (h.g.a.p) r3
            java.lang.Object r7 = kotlinx.coroutines.aj.v(r2, r3, r0)
            if (r7 == r1) goto L72
            h.ab r7 = h.ab.f48028a
        L72:
            if (r7 != r1) goto L75
            goto L7d
        L75:
            java.util.HashSet r6 = r6.f40330i
            r6.clear()
            h.ab r6 = h.ab.f48028a
            return r6
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.jl.m(com.waze.sound.jl, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object n(com.waze.sound.jl r4, java.lang.String r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.sound.jh
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.sound.jh r0 = (com.waze.sound.jh) r0
            int r1 = r0.f40303c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40303c = r1
            goto L18
        L13:
            com.waze.sound.jh r0 = new com.waze.sound.jh
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f40301a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40303c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.String r5 = r0.f40304d
            r4 = r5
            java.lang.String r4 = (java.lang.String) r4
            e.b.c.b(r6)
            goto L41
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r6)
            r0.f40304d = r5
            r0.f40303c = r3
            java.lang.Object r6 = r4.y(r0)
            if (r6 == r1) goto L78
        L41:
            androidx.media3.datasource.cache.Cache r6 = (androidx.media3.datasource.cache.Cache) r6
            java.util.NavigableSet r4 = r6.getCachedSpans(r5)
            java.lang.String r5 = "getCachedSpans(...)"
            h.g.b.x.e(r4, r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r4 = r4.iterator()
        L59:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L75
            java.lang.Object r6 = r4.next()
            androidx.media3.datasource.cache.CacheSpan r6 = (androidx.media3.datasource.cache.CacheSpan) r6
            java.io.File r6 = r6.file
            if (r6 == 0) goto L6e
            java.lang.String r6 = r6.getPath()
            goto L6f
        L6e:
            r6 = 0
        L6f:
            if (r6 == 0) goto L59
            r5.add(r6)
            goto L59
        L75:
            java.util.List r5 = (java.util.List) r5
            return r5
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.jl.n(com.waze.sound.jl, java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object o(com.waze.sound.jl r5, java.lang.String r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.sound.ji
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.sound.ji r0 = (com.waze.sound.ji) r0
            int r1 = r0.f40307c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40307c = r1
            goto L18
        L13:
            com.waze.sound.ji r0 = new com.waze.sound.ji
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f40305a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40307c
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Integer r5 = r0.f40310f
            r6 = r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.String r6 = r0.f40309e
            r1 = r6
            java.lang.String r1 = (java.lang.String) r1
            com.waze.sound.jl r0 = r0.f40308d
            r1 = r0
            com.waze.sound.jl r1 = (com.waze.sound.jl) r1
            e.b.c.b(r7)
            r4 = r7
            r7 = r5
            r5 = r0
            r0 = r4
            goto L57
        L3a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L42:
            e.b.c.b(r7)
            java.lang.Integer r7 = r5.i(r6)
            r0.f40308d = r5
            r0.f40309e = r6
            r0.f40310f = r7
            r0.f40307c = r3
            java.lang.Object r0 = r5.y(r0)
            if (r0 == r1) goto L62
        L57:
            androidx.media3.datasource.cache.Cache r0 = (androidx.media3.datasource.cache.Cache) r0
            boolean r5 = r5.C(r6, r7, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.jl.o(com.waze.sound.jl, java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object p(com.waze.sound.jl r4, java.lang.String r5, h.c.e r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof com.waze.sound.jj
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.sound.jj r0 = (com.waze.sound.jj) r0
            int r1 = r0.f40313c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40313c = r1
            goto L18
        L13:
            com.waze.sound.jj r0 = new com.waze.sound.jj
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f40311a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40313c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.String r5 = r0.f40314d
            r4 = r5
            java.lang.String r4 = (java.lang.String) r4
            e.b.c.b(r6)
            goto L41
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r6)
            r0.f40314d = r5
            r0.f40313c = r3
            java.lang.Object r6 = r4.z(r0)
            if (r6 == r1) goto L61
        L41:
            androidx.media3.exoplayer.offline.DownloadManager r6 = (androidx.media3.exoplayer.offline.DownloadManager) r6
            androidx.media3.exoplayer.offline.DownloadIndex r4 = r6.getDownloadIndex()
            androidx.media3.exoplayer.offline.Download r4 = r4.getDownload(r5)
            r5 = 0
            if (r4 != 0) goto L53
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            return r4
        L53:
            int r4 = r4.state
            if (r4 == 0) goto L5c
            r6 = 2
            if (r4 != r6) goto L5b
            goto L5c
        L5b:
            r3 = r5
        L5c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.jl.p(com.waze.sound.jl, java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object q(com.waze.sound.jl r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, h.c.e r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.jl.q(com.waze.sound.jl, java.lang.String, java.lang.String, java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c1, code lost:
    
        if (r11 != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object v(com.waze.sound.jl r8, java.lang.String r9, java.lang.String r10, h.c.e r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof com.waze.sound.ja
            if (r0 == 0) goto L13
            r0 = r11
            com.waze.sound.ja r0 = (com.waze.sound.ja) r0
            int r1 = r0.f40277f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40277f = r1
            goto L18
        L13:
            com.waze.sound.ja r0 = new com.waze.sound.ja
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f40275d
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40277f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4f
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f40273b
            androidx.media3.exoplayer.offline.DownloadManager r8 = (androidx.media3.exoplayer.offline.DownloadManager) r8
            java.lang.Object r9 = r0.f40272a
            androidx.media3.exoplayer.offline.DownloadManager$Listener r9 = (androidx.media3.exoplayer.offline.DownloadManager.Listener) r9
            e.b.c.b(r11)
            goto Lc3
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f40274c
            androidx.media3.exoplayer.offline.DownloadManager$Listener r8 = (androidx.media3.exoplayer.offline.DownloadManager.Listener) r8
            java.lang.Object r9 = r0.f40273b
            kotlinx.coroutines.CompletableDeferred r9 = (kotlinx.coroutines.CompletableDeferred) r9
            java.lang.Object r10 = r0.f40272a
            androidx.media3.exoplayer.offline.DownloadRequest r10 = (androidx.media3.exoplayer.offline.DownloadRequest) r10
            e.b.c.b(r11)
            r7 = r9
            r9 = r8
            r8 = r11
            r11 = r7
            goto Lac
        L4f:
            e.b.c.b(r11)
            com.waze.shared_infra.i.e r11 = r8.f40324c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Adding download for cache key "
            r2.<init>(r5)
            r2.append(r9)
            java.lang.String r5 = ", url "
            r2.append(r5)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r11.a(r2)
            androidx.media3.exoplayer.offline.DownloadRequest$Builder r11 = new androidx.media3.exoplayer.offline.DownloadRequest$Builder
            android.net.Uri r10 = android.net.Uri.parse(r10)
            r11.<init>(r9, r10)
            r11.setCustomCacheKey(r9)
            androidx.media3.exoplayer.offline.DownloadRequest r10 = r11.build()
            java.lang.String r11 = "build(...)"
            h.g.b.x.e(r10, r11)
            kotlinx.coroutines.CompletableDeferred r11 = kotlinx.coroutines.bo.j()
            com.waze.r.d r2 = new com.waze.r.d
            r5 = 18
            r2.<init>(r11, r5)
            com.waze.r.d r5 = new com.waze.r.d
            r6 = 19
            r5.<init>(r11, r6)
            com.waze.sound.jc r6 = new com.waze.sound.jc
            r6.<init>(r9, r8, r2, r5)
            androidx.media3.exoplayer.offline.DownloadManager$Listener r6 = (androidx.media3.exoplayer.offline.DownloadManager.Listener) r6
            r0.f40272a = r10
            r0.f40273b = r11
            r0.f40274c = r6
            r0.f40277f = r4
            java.lang.Object r8 = r8.z(r0)
            if (r8 == r1) goto Lc9
            r9 = r6
        Lac:
            androidx.media3.exoplayer.offline.DownloadManager r8 = (androidx.media3.exoplayer.offline.DownloadManager) r8
            r8.addListener(r9)
            r8.addDownload(r10)
            r0.f40272a = r9
            r0.f40273b = r8
            r10 = 0
            r0.f40274c = r10
            r0.f40277f = r3
            java.lang.Object r11 = r11.c(r0)
            if (r11 == r1) goto Lc9
        Lc3:
            com.waze.sound.iz r11 = (com.waze.sound.iz) r11
            r8.removeListener(r9)
            return r11
        Lc9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.jl.v(com.waze.sound.jl, java.lang.String, java.lang.String, h.c.e):java.lang.Object");
    }

    public static final String w(String str) {
        h.g.b.x.f(str, "url");
        return String.valueOf(str.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.waze.sound.jl] */
    /* JADX WARN: Type inference failed for: r12v4, types: [androidx.media3.database.DatabaseProvider] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(h.c.e r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.waze.sound.jd
            if (r0 == 0) goto L13
            r0 = r13
            com.waze.sound.jd r0 = (com.waze.sound.jd) r0
            int r1 = r0.f40290e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40290e = r1
            goto L18
        L13:
            com.waze.sound.jd r0 = new com.waze.sound.jd
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.f40288c
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40290e
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r12 = r0.f40287b
            androidx.media3.database.DatabaseProvider r12 = (androidx.media3.database.DatabaseProvider) r12
            java.lang.Object r1 = r0.f40286a
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.gms.f.v r2 = r0.f40292g
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            androidx.media3.datasource.DefaultHttpDataSource$Factory r0 = r0.f40291f
            r3 = r0
            androidx.media3.datasource.DefaultHttpDataSource$Factory r3 = (androidx.media3.datasource.DefaultHttpDataSource.Factory) r3
            e.b.c.b(r13)
            r8 = r12
            r7 = r1
            r11 = r2
            goto L70
        L3b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L43:
            e.b.c.b(r13)
            android.content.Context r13 = r12.f40322a
            androidx.media3.database.StandaloneDatabaseProvider r2 = new androidx.media3.database.StandaloneDatabaseProvider
            r2.<init>(r13)
            androidx.media3.datasource.DefaultHttpDataSource$Factory r4 = new androidx.media3.datasource.DefaultHttpDataSource$Factory
            r4.<init>()
            com.google.android.gms.f.v r5 = new com.google.android.gms.f.v
            r6 = 11
            r5.<init>(r6)
            androidx.media3.database.DatabaseProvider r2 = (androidx.media3.database.DatabaseProvider) r2
            r0.f40291f = r4
            r0.f40292g = r5
            r0.f40286a = r13
            r0.f40287b = r2
            r0.f40290e = r3
            java.lang.Object r12 = r12.y(r0)
            if (r12 == r1) goto L7c
            r7 = r13
            r8 = r2
            r0 = r4
            r11 = r5
            r13 = r12
        L70:
            r9 = r13
            androidx.media3.datasource.cache.Cache r9 = (androidx.media3.datasource.cache.Cache) r9
            r10 = r0
            androidx.media3.datasource.DataSource$Factory r10 = (androidx.media3.datasource.DataSource.Factory) r10
            androidx.media3.exoplayer.offline.DownloadManager r6 = new androidx.media3.exoplayer.offline.DownloadManager
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.jl.x(h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(h.c.e eVar) {
        return this.f40323b.b(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(h.c.e r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.waze.sound.je
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.sound.je r0 = (com.waze.sound.je) r0
            int r1 = r0.f40296d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40296d = r1
            goto L18
        L13:
            com.waze.sound.je r0 = new com.waze.sound.je
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f40294b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40296d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.f40293a
            kotlinx.coroutines.h.a r0 = (kotlinx.coroutines.h.a) r0
            e.b.c.b(r8)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r7 = move-exception
            goto L7d
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r2 = r0.f40293a
            kotlinx.coroutines.h.a r2 = (kotlinx.coroutines.h.a) r2
            e.b.c.b(r8)
            r8 = r2
            goto L56
        L42:
            e.b.c.b(r8)
            androidx.media3.exoplayer.offline.DownloadManager r8 = r7.f40328g
            if (r8 == 0) goto L4a
            return r8
        L4a:
            kotlinx.coroutines.h.a r8 = r7.f40331j
            r0.f40293a = r8
            r0.f40296d = r4
            java.lang.Object r2 = r8.lock(r5, r0)
            if (r2 == r1) goto L81
        L56:
            androidx.media3.exoplayer.offline.DownloadManager r2 = r7.f40328g     // Catch: java.lang.Throwable -> L7b
            if (r2 != 0) goto L77
            r0.f40293a = r8     // Catch: java.lang.Throwable -> L7b
            r0.f40296d = r3     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r7.x(r0)     // Catch: java.lang.Throwable -> L7b
            if (r0 == r1) goto L81
            r6 = r0
            r0 = r8
            r8 = r6
        L67:
            r2 = r8
            androidx.media3.exoplayer.offline.DownloadManager r2 = (androidx.media3.exoplayer.offline.DownloadManager) r2     // Catch: java.lang.Throwable -> L2f
            r7.f40328g = r2     // Catch: java.lang.Throwable -> L2f
            com.waze.sound.jg r8 = new com.waze.sound.jg     // Catch: java.lang.Throwable -> L2f
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L2f
            androidx.media3.exoplayer.offline.DownloadManager$Listener r8 = (androidx.media3.exoplayer.offline.DownloadManager.Listener) r8     // Catch: java.lang.Throwable -> L2f
            r2.addListener(r8)     // Catch: java.lang.Throwable -> L2f
            r8 = r0
        L77:
            r8.unlock(r5)
            return r2
        L7b:
            r7 = move-exception
            r0 = r8
        L7d:
            r0.unlock(r5)
            throw r7
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.jl.z(h.c.e):java.lang.Object");
    }

    @Override // com.waze.sound.iv
    public final Object a(h.c.e eVar) {
        return m(this, eVar);
    }

    @Override // com.waze.sound.iv
    public final Object b(String str, h.c.e eVar) {
        return n(this, str, eVar);
    }

    @Override // com.waze.sound.iv
    public final Object c(h.c.e eVar) throws Throwable {
        this.f40324c.e("initialize");
        Object objZ = z(eVar);
        return objZ == h.c.a.a.f48038a ? objZ : h.ab.f48028a;
    }

    @Override // com.waze.sound.iv
    public final Object d(String str, h.c.e eVar) {
        return o(this, str, eVar);
    }

    @Override // com.waze.sound.iv
    public final Object e(String str, String str2, String str3, h.c.e eVar) {
        return q(this, str, str2, str3, eVar);
    }

    @Override // com.waze.sound.iv
    public final Object f(List list, h.g.a.a aVar, h.c.e eVar) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(h.a.i.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            jl jlVar = this;
            h.g.a.a aVar2 = aVar;
            arrayList.add(kotlinx.coroutines.aj.y(this.f40329h, null, null, new hk(jlVar, (ak) it.next(), aVar2, (h.c.e) null, 2), 3));
            this = jlVar;
            aVar = aVar2;
        }
        Object objC = kotlinx.coroutines.aj.C(arrayList, eVar);
        return objC == h.c.a.a.f48038a ? objC : h.ab.f48028a;
    }

    @Override // com.waze.sound.iv
    public final boolean g(String str) {
        h.g.b.x.f(str, "key");
        if (this.f40330i.contains(str)) {
            return true;
        }
        if (this.f40328g == null) {
            this.f40327f.a(new RuntimeException("isCachedSync called before downloadManager instance is initialized!"), null);
            return false;
        }
        Cache cacheA = this.f40323b.a();
        if (cacheA != null) {
            return C(str, i(str), cacheA);
        }
        this.f40327f.a(new RuntimeException("isCachedSync called before cache instance is initialized!"), null);
        return false;
    }

    public final Integer i(String str) {
        DownloadIndex downloadIndex;
        Download download;
        h.g.b.x.f(str, "key");
        DownloadManager downloadManager = this.f40328g;
        if (downloadManager == null || (downloadIndex = downloadManager.getDownloadIndex()) == null || (download = downloadIndex.getDownload(str)) == null) {
            return null;
        }
        return Integer.valueOf(download.state);
    }

    public final void u(Cache cache) {
        h.g.b.x.f(cache, "cache");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Set<String> keys = cache.getKeys();
        h.g.b.x.e(keys, "getKeys(...)");
        for (String str : keys) {
            NavigableSet<CacheSpan> cachedSpans = cache.getCachedSpans(str);
            h.g.b.x.e(cachedSpans, "getCachedSpans(...)");
            if (!cachedSpans.isEmpty()) {
                long j2 = jCurrentTimeMillis - cachedSpans.first().lastTouchTimestamp;
                h.o.c cVar = h.o.a.f48264a;
                Long lB = ConfigValues.CONFIG_VALUE_VOICES_VOICE_FILE_EXPIRATION_DAYS.b();
                h.g.b.x.e(lB, "getValue(...)");
                if (j2 > h.o.a.m(h.o.c.j(lB.longValue(), h.o.d.f48276g))) {
                    this.f40324c.a(f.a(str, "File ", " removed from cache as TTL expired"));
                    cache.removeResource(str);
                }
            }
        }
        this.f40330i.clear();
    }
}
