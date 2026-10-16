package androidx.camera.camera2.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import androidx.camera.camera2.compat.workaround.OutputSizesCorrector;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class StreamConfigurationMapCompat_Factory implements c<StreamConfigurationMapCompat> {
    private final e<StreamConfigurationMap> mapProvider;
    private final e<OutputSizesCorrector> outputSizesCorrectorProvider;

    private StreamConfigurationMapCompat_Factory(e<StreamConfigurationMap> eVar, e<OutputSizesCorrector> eVar2) {
        this.mapProvider = eVar;
        this.outputSizesCorrectorProvider = eVar2;
    }

    public static StreamConfigurationMapCompat_Factory create(e<StreamConfigurationMap> eVar, e<OutputSizesCorrector> eVar2) {
        return new StreamConfigurationMapCompat_Factory(eVar, eVar2);
    }

    public static StreamConfigurationMapCompat newInstance(StreamConfigurationMap streamConfigurationMap, OutputSizesCorrector outputSizesCorrector) {
        return new StreamConfigurationMapCompat(streamConfigurationMap, outputSizesCorrector);
    }

    @Override // g.a.a, f.a.a
    public StreamConfigurationMapCompat get() {
        return newInstance(this.mapProvider.get(), this.outputSizesCorrectorProvider.get());
    }
}
