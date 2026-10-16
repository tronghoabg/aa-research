package androidx.camera.core.impl;

import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SurfaceStreamSpecQueryResult {
    private final Map<AttachedSurfaceInfo, StreamSpec> attachedSurfaceStreamSpecs;
    private final int maxSupportedFrameRate;
    private final Map<UseCaseConfig<?>, StreamSpec> useCaseStreamSpecs;

    /* JADX WARN: Multi-variable type inference failed */
    public SurfaceStreamSpecQueryResult(Map<UseCaseConfig<?>, ? extends StreamSpec> map, Map<AttachedSurfaceInfo, ? extends StreamSpec> map2, int i2) {
        x.f(map, "useCaseStreamSpecs");
        x.f(map2, "attachedSurfaceStreamSpecs");
        this.useCaseStreamSpecs = map;
        this.attachedSurfaceStreamSpecs = map2;
        this.maxSupportedFrameRate = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SurfaceStreamSpecQueryResult copy$default(SurfaceStreamSpecQueryResult surfaceStreamSpecQueryResult, Map map, Map map2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            map = surfaceStreamSpecQueryResult.useCaseStreamSpecs;
        }
        if ((i3 & 2) != 0) {
            map2 = surfaceStreamSpecQueryResult.attachedSurfaceStreamSpecs;
        }
        if ((i3 & 4) != 0) {
            i2 = surfaceStreamSpecQueryResult.maxSupportedFrameRate;
        }
        return surfaceStreamSpecQueryResult.copy(map, map2, i2);
    }

    public final Map<UseCaseConfig<?>, StreamSpec> component1() {
        return this.useCaseStreamSpecs;
    }

    public final Map<AttachedSurfaceInfo, StreamSpec> component2() {
        return this.attachedSurfaceStreamSpecs;
    }

    public final int component3() {
        return this.maxSupportedFrameRate;
    }

    public final SurfaceStreamSpecQueryResult copy(Map<UseCaseConfig<?>, ? extends StreamSpec> map, Map<AttachedSurfaceInfo, ? extends StreamSpec> map2, int i2) {
        x.f(map, "useCaseStreamSpecs");
        x.f(map2, "attachedSurfaceStreamSpecs");
        return new SurfaceStreamSpecQueryResult(map, map2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurfaceStreamSpecQueryResult)) {
            return false;
        }
        SurfaceStreamSpecQueryResult surfaceStreamSpecQueryResult = (SurfaceStreamSpecQueryResult) obj;
        return x.n(this.useCaseStreamSpecs, surfaceStreamSpecQueryResult.useCaseStreamSpecs) && x.n(this.attachedSurfaceStreamSpecs, surfaceStreamSpecQueryResult.attachedSurfaceStreamSpecs) && this.maxSupportedFrameRate == surfaceStreamSpecQueryResult.maxSupportedFrameRate;
    }

    public final Map<AttachedSurfaceInfo, StreamSpec> getAttachedSurfaceStreamSpecs() {
        return this.attachedSurfaceStreamSpecs;
    }

    public final int getMaxSupportedFrameRate() {
        return this.maxSupportedFrameRate;
    }

    public final Map<UseCaseConfig<?>, StreamSpec> getUseCaseStreamSpecs() {
        return this.useCaseStreamSpecs;
    }

    public int hashCode() {
        return (((this.useCaseStreamSpecs.hashCode() * 31) + this.attachedSurfaceStreamSpecs.hashCode()) * 31) + this.maxSupportedFrameRate;
    }

    public String toString() {
        return "SurfaceStreamSpecQueryResult(useCaseStreamSpecs=" + this.useCaseStreamSpecs + ", attachedSurfaceStreamSpecs=" + this.attachedSurfaceStreamSpecs + ", maxSupportedFrameRate=" + this.maxSupportedFrameRate + ")";
    }
}
