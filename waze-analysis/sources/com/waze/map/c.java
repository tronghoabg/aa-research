package com.waze.map;

import com.waze.jni.protos.navigate.PolylineGeometry;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class c {
    public static com.waze.coroutines.b a(bc bcVar, String str, h.g.a.l lVar) {
        h.g.b.x.f(bcVar, "<this>");
        h.g.b.x.f(str, "markerTag");
        h.g.b.x.f(lVar, "onClick");
        return new com.waze.coroutines.b(bcVar, new com.waze.coroutines.b(str, lVar));
    }

    public static com.waze.coroutines.b b(bc bcVar) {
        h.g.b.x.f(bcVar, "<this>");
        return new com.waze.coroutines.b(bcVar, (com.waze.coroutines.b) null);
    }

    public static com.waze.google_assistant.ah d(com.waze.map.b.fi fiVar) {
        h.g.b.x.f(fiVar, "<this>");
        return new com.waze.google_assistant.ah(fiVar, (com.waze.coroutines.b) null);
    }

    public PolylineGeometry getGeometry(byte[] bArr) {
        h.g.b.x.f(bArr, "buffer");
        byte[] geometryNTV = ((CompressedPolylineNativeManager) this).getGeometryNTV(bArr);
        if (geometryNTV != null) {
            try {
                return (PolylineGeometry) PolylineGeometry.parser().c(geometryNTV);
            } catch (com.google.v.eu unused) {
            }
        }
        return null;
    }
}
