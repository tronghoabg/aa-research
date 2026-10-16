package com.waze.sound;

import androidx.media3.datasource.cache.CacheSpan;
import androidx.media3.datasource.cache.SimpleCache;
import androidx.media3.exoplayer.ExoPlayer;
import com.waze.lh;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fy extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f40058a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f40059b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f40060c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fy(ExoPlayer exoPlayer, gb gbVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40060c = i2;
        this.f40058a = exoPlayer;
        this.f40059b = gbVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.ExoPlayer, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f40060c;
        if (i2 == 0) {
            return new fy((ExoPlayer) this.f40058a, (gb) this.f40059b, eVar, 0);
        }
        Object obj2 = this.f40059b;
        if (i2 != 1) {
            return new fy((ke) obj2, (SimpleCache) this.f40058a, eVar, 2);
        }
        return new fy((el) obj2, (com.waze.h.c.a) this.f40058a, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f40060c;
        return i2 != 0 ? i2 != 1 ? ((fy) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((fy) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((fy) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.media3.exoplayer.ExoPlayer, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f40060c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            this.f40058a.stop();
            gb.j((gb) this.f40059b);
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ((el) this.f40059b).f39932b.b((com.waze.h.c.a) this.f40058a);
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Object obj2 = this.f40058a;
        com.waze.sound.f.j jVar = ((ke) this.f40059b).f40367d;
        SimpleCache simpleCache = (SimpleCache) obj2;
        Set<String> keys = simpleCache.getKeys();
        h.g.b.x.e(keys, "getKeys(...)");
        Iterator<T> it = keys.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            NavigableSet<CacheSpan> cachedSpans = simpleCache.getCachedSpans((String) it.next());
            h.g.b.x.e(cachedSpans, "getCachedSpans(...)");
            Iterator<T> it2 = cachedSpans.iterator();
            long j3 = 0;
            while (it2.hasNext()) {
                j3 += ((CacheSpan) it2.next()).length;
            }
            j2 += j3;
        }
        Long lValueOf = Long.valueOf(j2);
        int i3 = lh.f25149a;
        lValueOf.getClass();
        Double dValueOf = Double.valueOf(j2 / 1024.0d);
        h.g.b.x.e(dValueOf, "convertBytesToKilobytes(...)");
        jVar.b((long) Math.ceil(dValueOf.doubleValue()), simpleCache.getKeys().size());
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fy(el elVar, com.waze.h.c.a aVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40060c = i2;
        this.f40059b = elVar;
        this.f40058a = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fy(ke keVar, SimpleCache simpleCache, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40060c = i2;
        this.f40059b = keVar;
        this.f40058a = simpleCache;
    }
}
