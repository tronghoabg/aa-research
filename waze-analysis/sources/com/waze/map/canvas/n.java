package com.waze.map.canvas;

import com.waze.jni.protos.map.MapOrientationModeChanged;
import com.waze.jni.protos.map.canvas.MainCanvasCameraStateProto;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final MainCanvasCameraStateProto f28648a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f28649b;

    /* renamed from: c, reason: collision with root package name */
    private final MapOrientationModeChanged.OrientationMode f28650c;

    public n(MainCanvasCameraStateProto mainCanvasCameraStateProto, Float f2, MapOrientationModeChanged.OrientationMode orientationMode) {
        this.f28648a = mainCanvasCameraStateProto;
        this.f28649b = f2;
        this.f28650c = orientationMode;
    }

    public static /* synthetic */ n d(n nVar, MainCanvasCameraStateProto mainCanvasCameraStateProto, Float f2, MapOrientationModeChanged.OrientationMode orientationMode, int i2) {
        if ((i2 & 1) != 0) {
            mainCanvasCameraStateProto = nVar.f28648a;
        }
        if ((i2 & 2) != 0) {
            f2 = nVar.f28649b;
        }
        if ((i2 & 4) != 0) {
            orientationMode = nVar.f28650c;
        }
        return new n(mainCanvasCameraStateProto, f2, orientationMode);
    }

    public final MapOrientationModeChanged.OrientationMode a() {
        return this.f28650c;
    }

    public final MainCanvasCameraStateProto b() {
        return this.f28648a;
    }

    public final Float c() {
        return this.f28649b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f28648a == nVar.f28648a && h.g.b.x.n(this.f28649b, nVar.f28649b) && this.f28650c == nVar.f28650c;
    }

    public final int hashCode() {
        MainCanvasCameraStateProto mainCanvasCameraStateProto = this.f28648a;
        int iHashCode = mainCanvasCameraStateProto == null ? 0 : mainCanvasCameraStateProto.hashCode();
        Float f2 = this.f28649b;
        int iHashCode2 = f2 == null ? 0 : f2.hashCode();
        int i2 = iHashCode * 31;
        MapOrientationModeChanged.OrientationMode orientationMode = this.f28650c;
        return ((i2 + iHashCode2) * 31) + (orientationMode != null ? orientationMode.hashCode() : 0);
    }

    public final String toString() {
        return "MainCanvasLatestState(camera=" + this.f28648a + ", orientationDegrees=" + this.f28649b + ", orientationMode=" + this.f28650c + ")";
    }

    public n() {
        this(null);
    }

    public /* synthetic */ n(byte[] bArr) {
        this(null, null, null);
    }
}
