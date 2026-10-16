package androidx.camera.core.internal;

import androidx.camera.core.UseCase;
import androidx.camera.core.impl.StreamSpec;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class StreamSpecQueryResult {
    private final int maxSupportedFrameRate;
    private final Map<UseCase, StreamSpec> streamSpecs;

    public /* synthetic */ StreamSpecQueryResult(Map map, int i2, int i3, o oVar) {
        this((i3 & 1) != 0 ? r.j() : map, (i3 & 2) != 0 ? Integer.MAX_VALUE : i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StreamSpecQueryResult copy$default(StreamSpecQueryResult streamSpecQueryResult, Map map, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            map = streamSpecQueryResult.streamSpecs;
        }
        if ((i3 & 2) != 0) {
            i2 = streamSpecQueryResult.maxSupportedFrameRate;
        }
        return streamSpecQueryResult.copy(map, i2);
    }

    public final Map<UseCase, StreamSpec> component1() {
        return this.streamSpecs;
    }

    public final int component2() {
        return this.maxSupportedFrameRate;
    }

    public final StreamSpecQueryResult copy(Map<UseCase, ? extends StreamSpec> map, int i2) {
        x.f(map, "streamSpecs");
        return new StreamSpecQueryResult(map, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamSpecQueryResult)) {
            return false;
        }
        StreamSpecQueryResult streamSpecQueryResult = (StreamSpecQueryResult) obj;
        return x.n(this.streamSpecs, streamSpecQueryResult.streamSpecs) && this.maxSupportedFrameRate == streamSpecQueryResult.maxSupportedFrameRate;
    }

    public final int getMaxSupportedFrameRate() {
        return this.maxSupportedFrameRate;
    }

    public final Map<UseCase, StreamSpec> getStreamSpecs() {
        return this.streamSpecs;
    }

    public int hashCode() {
        return (this.streamSpecs.hashCode() * 31) + this.maxSupportedFrameRate;
    }

    public String toString() {
        return "StreamSpecQueryResult(streamSpecs=" + this.streamSpecs + ", maxSupportedFrameRate=" + this.maxSupportedFrameRate + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StreamSpecQueryResult(Map<UseCase, ? extends StreamSpec> map, int i2) {
        x.f(map, "streamSpecs");
        this.streamSpecs = map;
        this.maxSupportedFrameRate = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StreamSpecQueryResult() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }
}
