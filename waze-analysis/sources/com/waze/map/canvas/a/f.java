package com.waze.map.canvas.a;

import com.waze.jni.protos.map.ExtendedPolyline;
import com.waze.jni.protos.map.ExtendedRouteData;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f28496a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.d f28497b;

    public f(com.waze.shared_infra.i.e eVar, com.waze.map.d dVar) {
        x.f(eVar, "logger");
        x.f(dVar, "compressedPolylineUtils");
        this.f28496a = eVar;
        this.f28497b = dVar;
    }

    private static final void b(ExtendedPolyline.Builder builder, ExtendedRouteData extendedRouteData) {
        if (extendedRouteData.hasAnimationParams()) {
            builder.setAnimationParams(extendedRouteData.getAnimationParams());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(java.util.List r18, h.g.a.l r19) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.canvas.a.f.a(java.util.List, h.g.a.l):java.util.List");
    }
}
