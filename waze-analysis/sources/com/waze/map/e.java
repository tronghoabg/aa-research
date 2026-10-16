package com.waze.map;

import com.waze.jni.protos.navigate.PolylineGeometry;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    private final CompressedPolylineNativeManager f28785a;

    public e(CompressedPolylineNativeManager compressedPolylineNativeManager) {
        h.g.b.x.f(compressedPolylineNativeManager, "compressedPolylineNativeManager");
        this.f28785a = compressedPolylineNativeManager;
    }

    @Override // com.waze.map.d
    public final PolylineGeometry a(byte[] bArr) {
        h.g.b.x.f(bArr, "buffer");
        return this.f28785a.getGeometry(bArr);
    }
}
