package com.waze.map.main;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.MapPopupNativeInfo;
import com.waze.map.gu;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapPopupDataFetcherNativeManager extends bt implements bn {
    public static final int $stable = 0;

    static final h.ab fetchDetailsPopupInfo$lambda$0(CompletableDeferred completableDeferred, MapPopupNativeInfo.DetailsPopupInfo detailsPopupInfo) {
        completableDeferred.a(detailsPopupInfo != null ? com.waze.gas.a.a(detailsPopupInfo) : null);
        return h.ab.f48028a;
    }

    static final h.ab fetchMyLocationDetailsPopupInfo$lambda$0(CompletableDeferred completableDeferred, MapPopupNativeInfo.DetailsPopupInfo detailsPopupInfo) {
        completableDeferred.a(detailsPopupInfo != null ? com.waze.gas.a.a(detailsPopupInfo) : null);
        return h.ab.f48028a;
    }

    static final h.ab fetchWazerPopupInfo$lambda$0(CompletableDeferred completableDeferred, MapPopupNativeInfo.WazerPopupInfo wazerPopupInfo) {
        com.waze.map.bk bkVar = null;
        if (wazerPopupInfo != null) {
            h.g.b.x.f(wazerPopupInfo, "<this>");
            gu guVar = gu.f29191k;
            int id = wazerPopupInfo.getId();
            String name = wazerPopupInfo.getName();
            h.g.b.x.e(name, "getName(...)");
            String mood = wazerPopupInfo.getMood();
            h.g.b.x.e(mood, "getMood(...)");
            String addon = wazerPopupInfo.getAddon();
            if (true != wazerPopupInfo.hasAddon()) {
                addon = null;
            }
            String points = true != wazerPopupInfo.hasPoints() ? null : wazerPopupInfo.getPoints();
            String joined = true != wazerPopupInfo.hasJoined() ? null : wazerPopupInfo.getJoined();
            String speed = wazerPopupInfo.getSpeed();
            h.g.b.x.e(speed, "getSpeed(...)");
            int azimuth = wazerPopupInfo.getAzimuth();
            Position.IntPosition coordinate = wazerPopupInfo.getCoordinate();
            h.g.b.x.e(coordinate, "getCoordinate(...)");
            bkVar = new com.waze.map.bk(guVar, id, name, mood, addon, points, joined, speed, azimuth, com.waze.notifications.c.k.i(coordinate));
        }
        completableDeferred.a(bkVar);
        return h.ab.f48028a;
    }

    @Override // com.waze.map.main.bn
    public Object fetchDetailsPopupInfo(com.waze.shared_infra.h.c cVar, gu guVar, h.c.e<? super com.waze.map.bj> eVar) {
        CompletableDeferred completableDeferredJ = kotlinx.coroutines.bo.j();
        fetchDetailsPopupInfo(cVar.c(), cVar.d(), guVar.a().getNumber(), new at(completableDeferredJ, 10));
        return completableDeferredJ.c(eVar);
    }

    public final native byte[] fetchDetailsPopupInfoNTV(int i2, int i3, int i4);

    @Override // com.waze.map.main.bn
    public Object fetchMyLocationDetailsPopupInfo(h.c.e<? super com.waze.map.bj> eVar) {
        CompletableDeferred completableDeferredJ = kotlinx.coroutines.bo.j();
        fetchMyLocationPopupInfo(new at(completableDeferredJ, 9));
        return completableDeferredJ.c(eVar);
    }

    public final native byte[] fetchMyLocationPopupInfoNTV();

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if (r12 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r12 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.map.main.bn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object fetchParkingSuggestionPopupInfo(com.waze.shared_infra.h.c r9, int r10, java.lang.Integer r11, h.c.e<? super com.waze.map.bj> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.waze.map.main.bo
            if (r0 == 0) goto L13
            r0 = r12
            com.waze.map.main.bo r0 = (com.waze.map.main.bo) r0
            int r1 = r0.f29403c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29403c = r1
            goto L18
        L13:
            com.waze.map.main.bo r0 = new com.waze.map.main.bo
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.f29401a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f29403c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r12)
            goto L88
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            e.b.c.b(r12)
            goto L63
        L36:
            e.b.c.b(r12)
            if (r11 == 0) goto L66
            r2 = r8
            com.waze.map.main.bt r2 = (com.waze.map.main.bt) r2
            int r3 = r9.c()
            r8 = r4
            int r4 = r9.d()
            int r6 = r11.intValue()
            r0.f29403c = r8
            kotlinx.coroutines.CompletableDeferred r8 = kotlinx.coroutines.bo.j()
            com.waze.car_lib.b.n r7 = new com.waze.car_lib.b.n
            r9 = 11
            r7.<init>(r8, r9)
            r5 = r10
            r2.fetchParkingSuggestionPopupInfoWithEta(r3, r4, r5, r6, r7)
            java.lang.Object r12 = r8.c(r0)
            if (r12 != r1) goto L63
            goto L87
        L63:
            com.waze.jni.protos.map.MapPopupNativeInfo$DetailsPopupInfo r12 = (com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfo) r12
            goto L8a
        L66:
            r5 = r10
            com.waze.map.main.bt r8 = (com.waze.map.main.bt) r8
            int r10 = r9.c()
            int r9 = r9.d()
            r0.f29403c = r3
            kotlinx.coroutines.CompletableDeferred r11 = kotlinx.coroutines.bo.j()
            com.waze.car_lib.b.n r12 = new com.waze.car_lib.b.n
            r2 = 12
            r12.<init>(r11, r2)
            r8.fetchParkingSuggestionPopupInfo(r10, r9, r5, r12)
            java.lang.Object r12 = r11.c(r0)
            if (r12 != r1) goto L88
        L87:
            return r1
        L88:
            com.waze.jni.protos.map.MapPopupNativeInfo$DetailsPopupInfo r12 = (com.waze.jni.protos.map.MapPopupNativeInfo.DetailsPopupInfo) r12
        L8a:
            if (r12 == 0) goto L91
            com.waze.map.bj r8 = com.waze.gas.a.a(r12)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.main.MapPopupDataFetcherNativeManager.fetchParkingSuggestionPopupInfo(com.waze.shared_infra.h.c, int, java.lang.Integer, h.c.e):java.lang.Object");
    }

    public final native byte[] fetchParkingSuggestionPopupInfoNTV(int i2, int i3, int i4);

    public final native byte[] fetchParkingSuggestionPopupInfoWithEtaNTV(int i2, int i3, int i4, int i5);

    @Override // com.waze.map.main.bn
    public Object fetchWazerPopupInfo(com.waze.shared_infra.h.c cVar, int i2, h.c.e<? super com.waze.map.bk> eVar) {
        CompletableDeferred completableDeferredJ = kotlinx.coroutines.bo.j();
        fetchWazerPopupInfo(cVar.c(), cVar.d(), i2, new at(completableDeferredJ, 8));
        return completableDeferredJ.c(eVar);
    }

    public final native byte[] fetchWazerPopupInfoNTV(int i2, int i3, int i4);
}
