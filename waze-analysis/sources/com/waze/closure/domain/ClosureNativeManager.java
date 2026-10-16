package com.waze.closure.domain;

import com.waze.jni.protos.ClosureCandidateJni;
import com.waze.jni.protos.Position;
import com.waze.map.cc;
import com.waze.native_managers.WazeNativeLooperDispatcher;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ClosureNativeManager extends f implements c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClosureNativeManager(WazeNativeLooperDispatcher wazeNativeLooperDispatcher) {
        super(wazeNativeLooperDispatcher);
        x.f(wazeNativeLooperDispatcher, "wazeNativeLooperDispatcher");
    }

    private final com.waze.closure.a.a toClosureCandidate(ClosureCandidateJni closureCandidateJni) {
        int tileId = closureCandidateJni.getTileId();
        int lineId = closureCandidateJni.getLineId();
        int fromNode = closureCandidateJni.getFromNode();
        int toNode = closureCandidateJni.getToNode();
        Position.IntPosition fromCoordinate = closureCandidateJni.getFromCoordinate();
        if (true != closureCandidateJni.hasFromCoordinate()) {
            fromCoordinate = null;
        }
        if (fromCoordinate != null) {
            com.waze.shared_infra.h.c cVarA = cc.a(fromCoordinate);
            Position.IntPosition toCoordinate = closureCandidateJni.getToCoordinate();
            if (true != closureCandidateJni.hasToCoordinate()) {
                toCoordinate = null;
            }
            if (toCoordinate != null) {
                com.waze.shared_infra.h.c cVarA2 = cc.a(toCoordinate);
                List<Position.IntPosition> polylineList = closureCandidateJni.getPolylineList();
                x.e(polylineList, "getPolylineList(...)");
                List<Position.IntPosition> list = polylineList;
                ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
                for (Position.IntPosition intPosition : list) {
                    x.c(intPosition);
                    arrayList.add(cc.a(intPosition));
                }
                ArrayList arrayList2 = arrayList;
                String streetName = closureCandidateJni.getStreetName();
                if (true != closureCandidateJni.hasStreetName()) {
                    streetName = null;
                }
                return new com.waze.closure.a.a(tileId, lineId, fromNode, toNode, cVarA, cVarA2, arrayList2, streetName, closureCandidateJni.getIsOnRoute());
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.closure.domain.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getClosureCandidates(int r6, h.c.e<? super java.util.List<com.waze.closure.a.a>> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.closure.domain.d
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.closure.domain.d r0 = (com.waze.closure.domain.d) r0
            int r1 = r0.f22500c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22500c = r1
            goto L18
        L13:
            com.waze.closure.domain.d r0 = new com.waze.closure.domain.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f22498a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22500c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L4b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r7)
            r7 = r5
            com.waze.closure.domain.f r7 = (com.waze.closure.domain.f) r7
            r0.f22500c = r3
            kotlinx.coroutines.CompletableDeferred r2 = kotlinx.coroutines.bo.j()
            com.waze.c.e.a.a r3 = new com.waze.c.e.a.a
            r4 = 11
            r3.<init>(r2, r4)
            r7.getClosureCandidates(r6, r3)
            java.lang.Object r7 = r2.c(r0)
            if (r7 == r1) goto L97
        L4b:
            byte[][] r7 = (byte[][]) r7
            if (r7 != 0) goto L54
            java.util.List r5 = h.a.i.h()
            return r5
        L54:
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Collection r6 = (java.util.Collection) r6
            int r0 = r7.length
            r1 = 0
        L5f:
            if (r1 >= r0) goto L94
            r2 = r7[r1]
            byte[] r2 = (byte[]) r2
            r3 = r5
            com.waze.closure.domain.ClosureNativeManager r3 = (com.waze.closure.domain.ClosureNativeManager) r3     // Catch: java.lang.Throwable -> L6d
            com.waze.jni.protos.ClosureCandidateJni r2 = com.waze.jni.protos.ClosureCandidateJni.parseFrom(r2)     // Catch: java.lang.Throwable -> L6d
            goto L72
        L6d:
            r2 = move-exception
            java.lang.Object r2 = e.b.c.a(r2)
        L72:
            java.lang.Throwable r3 = h.m.c(r2)
            r4 = 0
            if (r3 != 0) goto L7a
            goto L7f
        L7a:
            boolean r2 = r3 instanceof com.google.v.eu
            if (r2 == 0) goto L93
            r2 = r4
        L7f:
            e.b.c.b(r2)
            com.waze.jni.protos.ClosureCandidateJni r2 = (com.waze.jni.protos.ClosureCandidateJni) r2
            if (r2 != 0) goto L87
            goto L8b
        L87:
            com.waze.closure.a.a r4 = r5.toClosureCandidate(r2)
        L8b:
            if (r4 == 0) goto L90
            r6.add(r4)
        L90:
            int r1 = r1 + 1
            goto L5f
        L93:
            throw r3
        L94:
            java.util.List r6 = (java.util.List) r6
            return r6
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.closure.domain.ClosureNativeManager.getClosureCandidates(int, h.c.e):java.lang.Object");
    }

    public final native byte[][] getClosureCandidatesNTV(int i2);
}
