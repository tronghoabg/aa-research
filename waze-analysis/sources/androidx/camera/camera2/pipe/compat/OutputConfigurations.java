package androidx.camera.camera2.pipe.compat;

import android.view.Surface;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.StreamId;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class OutputConfigurations {
    private final List<OutputConfigurationWrapper> all;
    private final Map<StreamId, OutputConfigurationWrapper> deferred;
    private final Map<OutputId, Surface> outputSurfaceMap;
    private final OutputConfigurationWrapper postviewOutput;

    /* JADX WARN: Multi-variable type inference failed */
    public OutputConfigurations(List<? extends OutputConfigurationWrapper> list, Map<StreamId, ? extends OutputConfigurationWrapper> map, OutputConfigurationWrapper outputConfigurationWrapper, Map<OutputId, ? extends Surface> map2) {
        x.f(list, TtmlNode.COMBINE_ALL);
        x.f(map, "deferred");
        x.f(map2, "outputSurfaceMap");
        this.all = list;
        this.deferred = map;
        this.postviewOutput = outputConfigurationWrapper;
        this.outputSurfaceMap = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OutputConfigurations copy$default(OutputConfigurations outputConfigurations, List list, Map map, OutputConfigurationWrapper outputConfigurationWrapper, Map map2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = outputConfigurations.all;
        }
        if ((i2 & 2) != 0) {
            map = outputConfigurations.deferred;
        }
        if ((i2 & 4) != 0) {
            outputConfigurationWrapper = outputConfigurations.postviewOutput;
        }
        if ((i2 & 8) != 0) {
            map2 = outputConfigurations.outputSurfaceMap;
        }
        return outputConfigurations.copy(list, map, outputConfigurationWrapper, map2);
    }

    public final List<OutputConfigurationWrapper> component1() {
        return this.all;
    }

    public final Map<StreamId, OutputConfigurationWrapper> component2() {
        return this.deferred;
    }

    public final OutputConfigurationWrapper component3() {
        return this.postviewOutput;
    }

    public final Map<OutputId, Surface> component4() {
        return this.outputSurfaceMap;
    }

    public final OutputConfigurations copy(List<? extends OutputConfigurationWrapper> list, Map<StreamId, ? extends OutputConfigurationWrapper> map, OutputConfigurationWrapper outputConfigurationWrapper, Map<OutputId, ? extends Surface> map2) {
        x.f(list, TtmlNode.COMBINE_ALL);
        x.f(map, "deferred");
        x.f(map2, "outputSurfaceMap");
        return new OutputConfigurations(list, map, outputConfigurationWrapper, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OutputConfigurations)) {
            return false;
        }
        OutputConfigurations outputConfigurations = (OutputConfigurations) obj;
        return x.n(this.all, outputConfigurations.all) && x.n(this.deferred, outputConfigurations.deferred) && x.n(this.postviewOutput, outputConfigurations.postviewOutput) && x.n(this.outputSurfaceMap, outputConfigurations.outputSurfaceMap);
    }

    public final List<OutputConfigurationWrapper> getAll() {
        return this.all;
    }

    public final Map<StreamId, OutputConfigurationWrapper> getDeferred() {
        return this.deferred;
    }

    public final Map<OutputId, Surface> getOutputSurfaceMap() {
        return this.outputSurfaceMap;
    }

    public final OutputConfigurationWrapper getPostviewOutput() {
        return this.postviewOutput;
    }

    public int hashCode() {
        int iHashCode = (this.all.hashCode() * 31) + this.deferred.hashCode();
        OutputConfigurationWrapper outputConfigurationWrapper = this.postviewOutput;
        return (((iHashCode * 31) + (outputConfigurationWrapper == null ? 0 : outputConfigurationWrapper.hashCode())) * 31) + this.outputSurfaceMap.hashCode();
    }

    public String toString() {
        return "OutputConfigurations(all=" + this.all + ", deferred=" + this.deferred + ", postviewOutput=" + this.postviewOutput + ", outputSurfaceMap=" + this.outputSurfaceMap + ")";
    }
}
