package com.waze;

import com.waze.jni.protos.alerters.AlerterId;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class y {
    public /* synthetic */ y(byte[] bArr) {
    }

    public static k a(AlerterId alerterId) {
        h.g.b.x.f(alerterId, "<this>");
        String providerId = alerterId.getProviderId();
        h.g.b.x.e(providerId, "getProviderId(...)");
        String uniqueId = alerterId.getUniqueId();
        h.g.b.x.e(uniqueId, "getUniqueId(...)");
        String uuid = alerterId.getUuid();
        h.g.b.x.e(uuid, "getUuid(...)");
        return new k(providerId, uniqueId, uuid);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.waze.j b(com.waze.jni.protos.alerters.AlerterInfo r38) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.y.b(com.waze.jni.protos.alerters.AlerterInfo):com.waze.j");
    }

    private y() {
        throw null;
    }
}
