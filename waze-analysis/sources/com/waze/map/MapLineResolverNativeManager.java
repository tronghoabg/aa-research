package com.waze.map;

import androidx.collection.LruCache;
import com.waze.jni.protos.map.MapLine;
import com.waze.jni.protos.map.MapLineIntersectionMetadata;
import com.waze.native_managers.WazeNativeLooperDispatcher;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapLineResolverNativeManager extends ao implements ai {
    private final LruCache<com.waze.shared_infra.h.c, ag> cachedCoordinates;
    private final LruCache<com.waze.shared_infra.l.a, ag> cachedSegments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapLineResolverNativeManager(WazeNativeLooperDispatcher wazeNativeLooperDispatcher) {
        super(wazeNativeLooperDispatcher);
        h.g.b.x.f(wazeNativeLooperDispatcher, "wazeNativeLooperDispatcher");
        this.cachedCoordinates = new LruCache<>(16);
        this.cachedSegments = new LruCache<>(16);
    }

    static final h.ab findIntersectionMetadata_gIAlu_s$lambda$0(CompletableDeferred completableDeferred, MapLineIntersectionMetadata mapLineIntersectionMetadata) {
        completableDeferred.a(h.m.d(mapLineIntersectionMetadata != null ? com.waze.ae.e.d(mapLineIntersectionMetadata) : e.b.c.a(new NullPointerException("null from native layer"))));
        return h.ab.f48028a;
    }

    static final h.ab findNearestMapLine_gIAlu_s$lambda$1(MapLineResolverNativeManager mapLineResolverNativeManager, com.waze.shared_infra.h.c cVar, CompletableDeferred completableDeferred, MapLine mapLine) {
        mapLineResolverNativeManager.updateCache(mapLineResolverNativeManager.cachedCoordinates, cVar, mapLine);
        completableDeferred.a(h.m.d(mapLineResolverNativeManager.m28509resultSuccessOrNpeIoAF18A(mapLine)));
        return h.ab.f48028a;
    }

    static final h.ab resolveSegmentToMapLine_gIAlu_s$lambda$1(MapLineResolverNativeManager mapLineResolverNativeManager, com.waze.shared_infra.l.a aVar, CompletableDeferred completableDeferred, MapLine mapLine) {
        mapLineResolverNativeManager.updateCache(mapLineResolverNativeManager.cachedSegments, aVar, mapLine);
        completableDeferred.a(h.m.d(mapLineResolverNativeManager.m28509resultSuccessOrNpeIoAF18A(mapLine)));
        return h.ab.f48028a;
    }

    /* renamed from: resultSuccessOrNpe-IoAF18A, reason: not valid java name */
    private final Object m28509resultSuccessOrNpeIoAF18A(MapLine mapLine) {
        return mapLine != null ? com.waze.ae.e.i(mapLine) : e.b.c.a(new NullPointerException("null from native layer"));
    }

    private final <T> void updateCache(LruCache<T, ag> lruCache, T t, MapLine mapLine) {
        if (mapLine == null) {
            return;
        }
        lruCache.put(t, com.waze.ae.e.i(mapLine));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.map.ai
    /* renamed from: findIntersectionMetadata-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo28510findIntersectionMetadatagIAlus(com.waze.shared_infra.h.c r7, h.c.e<? super h.m<com.waze.map.ah>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.map.ak
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.map.ak r0 = (com.waze.map.ak) r0
            int r1 = r0.f27948c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27948c = r1
            goto L18
        L13:
            com.waze.map.ak r0 = new com.waze.map.ak
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f27946a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f27948c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r8)
            goto L50
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            e.b.c.b(r8)
            kotlinx.coroutines.CompletableDeferred r8 = kotlinx.coroutines.bo.j()
            int r2 = r7.c()
            int r7 = r7.d()
            com.waze.map.i r4 = new com.waze.map.i
            r5 = 6
            r4.<init>(r8, r5)
            r6.findIntersectionMetadata(r2, r7, r4)
            r0.f27948c = r3
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            h.m r8 = (h.m) r8
            java.lang.Object r6 = r8.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.MapLineResolverNativeManager.mo28510findIntersectionMetadatagIAlus(com.waze.shared_infra.h.c, h.c.e):java.lang.Object");
    }

    public final native byte[] findIntersectionMetadataNTV(int i2, int i3);

    public final native byte[] findNearestLineNTV(int i2, int i3);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.map.ai
    /* renamed from: findNearestMapLine-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo28511findNearestMapLinegIAlus(com.waze.shared_infra.h.c r8, h.c.e<? super h.m<com.waze.map.ag>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.waze.map.al
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.map.al r0 = (com.waze.map.al) r0
            int r1 = r0.f27951c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27951c = r1
            goto L18
        L13:
            com.waze.map.al r0 = new com.waze.map.al
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f27949a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f27951c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r9)
            goto L5a
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            e.b.c.b(r9)
            androidx.collection.LruCache<com.waze.shared_infra.h.c, com.waze.map.ag> r9 = r7.cachedCoordinates
            java.lang.Object r9 = r9.get(r8)
            com.waze.map.ag r9 = (com.waze.map.ag) r9
            if (r9 != 0) goto L61
            kotlinx.coroutines.CompletableDeferred r9 = kotlinx.coroutines.bo.j()
            int r2 = r8.c()
            int r4 = r8.d()
            com.waze.map.aj r5 = new com.waze.map.aj
            r6 = 0
            r5.<init>(r7, r8, r9, r6)
            r7.findNearestLine(r2, r4, r5)
            r0.f27951c = r3
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r1) goto L5a
            return r1
        L5a:
            h.m r9 = (h.m) r9
            java.lang.Object r7 = r9.b()
            return r7
        L61:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.MapLineResolverNativeManager.mo28511findNearestMapLinegIAlus(com.waze.shared_infra.h.c, h.c.e):java.lang.Object");
    }

    public final native byte[] resolveSegmentToLineNTV(byte[] bArr);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.map.ai
    /* renamed from: resolveSegmentToMapLine-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo28512resolveSegmentToMapLinegIAlus(com.waze.shared_infra.l.a r6, h.c.e<? super h.m<com.waze.map.ag>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.map.am
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.map.am r0 = (com.waze.map.am) r0
            int r1 = r0.f27954c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27954c = r1
            goto L18
        L13:
            com.waze.map.am r0 = new com.waze.map.am
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f27952a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f27954c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L55
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r7)
            androidx.collection.LruCache<com.waze.shared_infra.l.a, com.waze.map.ag> r7 = r5.cachedSegments
            java.lang.Object r7 = r7.get(r6)
            com.waze.map.ag r7 = (com.waze.map.ag) r7
            if (r7 != 0) goto L5c
            kotlinx.coroutines.CompletableDeferred r7 = kotlinx.coroutines.bo.j()
            com.waze.jni.protos.NavigationSegment r2 = com.waze.map.bv.b(r6)
            com.waze.map.aj r4 = new com.waze.map.aj
            r4.<init>(r5, r6, r7, r3)
            r5.resolveSegmentToLine(r2, r4)
            r0.f27954c = r3
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            h.m r7 = (h.m) r7
            java.lang.Object r5 = r7.b()
            return r5
        L5c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.MapLineResolverNativeManager.mo28512resolveSegmentToMapLinegIAlus(com.waze.shared_infra.l.a, h.c.e):java.lang.Object");
    }
}
