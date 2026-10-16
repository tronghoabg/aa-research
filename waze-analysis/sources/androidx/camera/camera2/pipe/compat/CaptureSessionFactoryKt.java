package androidx.camera.camera2.pipe.compat;

import a.a$$ExternalSyntheticApiModelOutline0;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.compat.AndroidOutputConfiguration;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.media.AndroidMultiResolutionImageReader;
import androidx.camera.camera2.pipe.media.ImageSource;
import h.a.i;
import h.a.r;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CaptureSessionFactoryKt {
    public static final OutputConfigurations buildOutputConfigurations(CameraGraph.Config config, StreamGraphImpl streamGraphImpl, Map<StreamId, ? extends Surface> map) {
        LinkedHashMap linkedHashMap;
        x.f(config, "graphConfig");
        x.f(streamGraphImpl, "streamGraph");
        x.f(map, "surfaces");
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry<StreamId, ImageSource> entry : streamGraphImpl.getImageSourceMap$camera_camera2_pipe().entrySet()) {
            int iM980unboximpl = entry.getKey().m980unboximpl();
            ImageSource value = entry.getValue();
            CameraStream cameraStreamMo962getaKI5c8E = streamGraphImpl.mo962getaKI5c8E(iM980unboximpl);
            if (cameraStreamMo962getaKI5c8E == null) {
                throw new IllegalStateException("Required value was null.");
            }
            List<OutputStream> outputs = cameraStreamMo962getaKI5c8E.getOutputs();
            if (outputs.size() != 1) {
                if (Build.VERSION.SDK_INT < 31) {
                    throw new IllegalArgumentException("Cannot configure multiple outputs pre-S!");
                }
                Object objUnwrapAs = value.unwrapAs((Class<Object>) AndroidMultiResolutionImageReader.class);
                if (objUnwrapAs == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                List<OutputConfiguration> outputConfigurations$camera_camera2_pipe = ((AndroidMultiResolutionImageReader) objUnwrapAs).getOutputConfigurations$camera_camera2_pipe();
                if (outputConfigurations$camera_camera2_pipe.size() != outputs.size()) {
                    throw new IllegalStateException("Check failed.");
                }
                int size = outputs.size();
                for (int i2 = 0; i2 < size; i2++) {
                    OutputStream outputStream = outputs.get(i2);
                    OutputConfiguration outputConfigurationM4m = a$$ExternalSyntheticApiModelOutline0.m4m((Object) outputConfigurations$camera_camera2_pipe.get(i2));
                    StreamGraphImpl.OutputConfig outputConfig = streamGraphImpl.getOutputConfigMap$camera_camera2_pipe().get(outputStream);
                    if (outputConfig == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    StreamGraphImpl.OutputConfig outputConfig2 = outputConfig;
                    if (outputConfig2.getExternalOutputConfig() != null) {
                        throw new IllegalStateException("External OutputConfiguration shouldn't be set in multi-output streams configured with ImageSource.Config");
                    }
                    linkedHashMap4.put(outputConfig2, outputConfigurationM4m);
                }
            }
        }
        for (CameraStream cameraStream : streamGraphImpl.getStreams()) {
            List<OutputStream> outputs2 = cameraStream.getOutputs();
            if (outputs2.size() == 1) {
                Surface surface = map.get(StreamId.m974boximpl(cameraStream.m578getIdptHMqGs()));
                if (surface != null) {
                    linkedHashMap3.put(OutputId.m734boximpl(((OutputStream) i.X(outputs2)).mo758getId4LaLFng()), surface);
                }
            } else {
                for (OutputStream outputStream2 : outputs2) {
                    StreamGraphImpl.OutputConfig outputConfig3 = streamGraphImpl.getOutputConfigMap$camera_camera2_pipe().get(outputStream2);
                    if (outputConfig3 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    StreamGraphImpl.OutputConfig outputConfig4 = outputConfig3;
                    OutputConfiguration externalOutputConfig = outputConfig4.getExternalOutputConfig();
                    if (externalOutputConfig == null) {
                        externalOutputConfig = a$$ExternalSyntheticApiModelOutline0.m4m(linkedHashMap4.get(outputConfig4));
                    }
                    Surface surface2 = externalOutputConfig != null ? externalOutputConfig.getSurface() : map.get(StreamId.m974boximpl(cameraStream.m578getIdptHMqGs()));
                    if (surface2 != null) {
                        linkedHashMap3.put(OutputId.m734boximpl(outputStream2.mo758getId4LaLFng()), surface2);
                    }
                }
            }
        }
        OutputConfigurationWrapper outputConfigurationWrapper = null;
        for (StreamGraphImpl.OutputConfig outputConfig5 : streamGraphImpl.getOutputConfigs$camera_camera2_pipe()) {
            List<CameraStream> streams = outputConfig5.getStreams();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = streams.iterator();
            while (it.hasNext()) {
                Surface surface3 = map.get(StreamId.m974boximpl(((CameraStream) it.next()).m578getIdptHMqGs()));
                if (surface3 != null) {
                    arrayList2.add(surface3);
                }
            }
            ArrayList arrayList3 = arrayList2;
            OutputConfiguration externalOutputConfig2 = outputConfig5.getExternalOutputConfig();
            if (externalOutputConfig2 == null) {
                externalOutputConfig2 = a$$ExternalSyntheticApiModelOutline0.m4m(linkedHashMap4.get(outputConfig5));
            }
            OutputConfiguration outputConfiguration = externalOutputConfig2;
            if (outputConfiguration == null) {
                if (outputConfig5.getDeferrable()) {
                    linkedHashMap = linkedHashMap4;
                    if (arrayList3.size() != outputConfig5.getStreams().size()) {
                        AndroidOutputConfiguration.Companion companion = AndroidOutputConfiguration.Companion;
                        Size size2 = outputConfig5.getSize();
                        OutputStream.OutputType deferredOutputType = outputConfig5.getDeferredOutputType();
                        x.c(deferredOutputType);
                        OutputStream.MirrorMode mirrorModeM1197getMirrorModedO1_9xk = outputConfig5.m1197getMirrorModedO1_9xk();
                        OutputStream.TimestampBase timestampBaseM1200getTimestampBasepcPfPbY = outputConfig5.m1200getTimestampBasepcPfPbY();
                        OutputStream.DynamicRangeProfile dynamicRangeProfileM1194getDynamicRangeProfileOoVcG5w = outputConfig5.m1194getDynamicRangeProfileOoVcG5w();
                        OutputStream.StreamUseCase streamUseCaseM1198getStreamUseCase8x2ez34 = outputConfig5.m1198getStreamUseCase8x2ez34();
                        List<OutputStream.SensorPixelMode> sensorPixelModes = outputConfig5.getSensorPixelModes();
                        boolean surfaceSharing = outputConfig5.getSurfaceSharing();
                        Integer groupNumber = outputConfig5.getGroupNumber();
                        OutputConfigurationWrapper outputConfigurationWrapperM998creategWWoySg$default = AndroidOutputConfiguration.Companion.m998creategWWoySg$default(companion, null, null, deferredOutputType, mirrorModeM1197getMirrorModedO1_9xk, timestampBaseM1200getTimestampBasepcPfPbY, dynamicRangeProfileM1194getDynamicRangeProfileOoVcG5w, streamUseCaseM1198getStreamUseCase8x2ez34, sensorPixelModes, size2, surfaceSharing, groupNumber != null ? groupNumber.intValue() : -1, !CameraId.m549equalsimpl0(outputConfig5.m1193getCameraDz_R5H8(), config.m505getCameraDz_R5H8()) ? outputConfig5.m1193getCameraDz_R5H8() : null, 2, null);
                        if (outputConfigurationWrapperM998creategWWoySg$default != null) {
                            arrayList.add(outputConfigurationWrapperM998creategWWoySg$default);
                            Iterator<CameraStream> it2 = outputConfig5.getStreamBuilder$camera_camera2_pipe().iterator();
                            while (it2.hasNext()) {
                                linkedHashMap2.put(StreamId.m974boximpl(it2.next().m578getIdptHMqGs()), outputConfigurationWrapperM998creategWWoySg$default);
                            }
                        } else if (Log.INSTANCE.getWARN_LOGGABLE()) {
                            Objects.toString(outputConfig5);
                            android.util.Log.w(Log.TAG, "Failed to create AndroidOutputConfiguration for ".concat(String.valueOf(outputConfig5)));
                        }
                    }
                } else {
                    linkedHashMap = linkedHashMap4;
                }
                if (arrayList3.size() != outputConfig5.getStreams().size()) {
                    List<CameraStream> streams2 = outputConfig5.getStreams();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj : streams2) {
                        if (!map.containsKey(StreamId.m974boximpl(((CameraStream) obj).m578getIdptHMqGs()))) {
                            arrayList4.add(obj);
                        }
                    }
                    throw new IllegalStateException("Surfaces are not yet available for " + outputConfig5 + "! Missing surfaces for " + arrayList4 + "!");
                }
                AndroidOutputConfiguration.Companion companion2 = AndroidOutputConfiguration.Companion;
                Surface surface4 = (Surface) i.P(arrayList3);
                OutputStream.MirrorMode mirrorModeM1197getMirrorModedO1_9xk2 = outputConfig5.m1197getMirrorModedO1_9xk();
                OutputStream.TimestampBase timestampBaseM1200getTimestampBasepcPfPbY2 = outputConfig5.m1200getTimestampBasepcPfPbY();
                OutputStream.DynamicRangeProfile dynamicRangeProfileM1194getDynamicRangeProfileOoVcG5w2 = outputConfig5.m1194getDynamicRangeProfileOoVcG5w();
                OutputStream.StreamUseCase streamUseCaseM1198getStreamUseCase8x2ez342 = outputConfig5.m1198getStreamUseCase8x2ez34();
                List<OutputStream.SensorPixelMode> sensorPixelModes2 = outputConfig5.getSensorPixelModes();
                Size size3 = outputConfig5.getSize();
                boolean surfaceSharing2 = outputConfig5.getSurfaceSharing();
                Integer groupNumber2 = outputConfig5.getGroupNumber();
                OutputConfigurationWrapper outputConfigurationWrapperM998creategWWoySg$default2 = AndroidOutputConfiguration.Companion.m998creategWWoySg$default(companion2, surface4, null, null, mirrorModeM1197getMirrorModedO1_9xk2, timestampBaseM1200getTimestampBasepcPfPbY2, dynamicRangeProfileM1194getDynamicRangeProfileOoVcG5w2, streamUseCaseM1198getStreamUseCase8x2ez342, sensorPixelModes2, size3, surfaceSharing2, groupNumber2 != null ? groupNumber2.intValue() : -1, !CameraId.m549equalsimpl0(outputConfig5.m1193getCameraDz_R5H8(), config.m505getCameraDz_R5H8()) ? outputConfig5.m1193getCameraDz_R5H8() : null, 6, null);
                if (outputConfigurationWrapperM998creategWWoySg$default2 != null) {
                    try {
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                    }
                    try {
                        Iterator it3 = i.ab(arrayList3, 1).iterator();
                        while (it3.hasNext()) {
                            outputConfigurationWrapperM998creategWWoySg$default2.addSurface((Surface) it3.next());
                        }
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        IllegalArgumentException illegalArgumentException = e;
                        if (Log.INSTANCE.getERROR_LOGGABLE()) {
                            Objects.toString(outputConfigurationWrapperM998creategWWoySg$default2);
                            android.util.Log.e(Log.TAG, "Failed to add Surfaces to ".concat(outputConfigurationWrapperM998creategWWoySg$default2.toString()), illegalArgumentException);
                        }
                        linkedHashMap4 = linkedHashMap;
                    }
                    if (config.getPostviewStream() != null) {
                        CameraStream cameraStream2 = streamGraphImpl.get(config.getPostviewStream());
                        if (cameraStream2 == null) {
                            throw new IllegalStateException("Postview Stream in StreamGraph cannot be null for reprocessing request");
                        }
                        if (outputConfigurationWrapper == null && outputConfig5.getStreams().contains(cameraStream2)) {
                            outputConfigurationWrapper = outputConfigurationWrapperM998creategWWoySg$default2;
                            linkedHashMap4 = linkedHashMap;
                        } else {
                            arrayList.add(outputConfigurationWrapperM998creategWWoySg$default2);
                        }
                    } else {
                        arrayList.add(outputConfigurationWrapperM998creategWWoySg$default2);
                    }
                    linkedHashMap4 = linkedHashMap;
                } else if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    Objects.toString(outputConfig5);
                    android.util.Log.w(Log.TAG, "Failed to create AndroidOutputConfiguration for ".concat(String.valueOf(outputConfig5)));
                }
            } else {
                if (arrayList3.size() != outputConfig5.getStreams().size()) {
                    List<CameraStream> streams3 = outputConfig5.getStreams();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj2 : streams3) {
                        if (!map.containsKey(StreamId.m974boximpl(((CameraStream) obj2).m578getIdptHMqGs()))) {
                            arrayList5.add(obj2);
                        }
                    }
                    throw new IllegalStateException("Surfaces are not yet available for " + outputConfig5 + "! Missing surfaces for " + arrayList5 + "!");
                }
                arrayList.add(new AndroidOutputConfiguration(outputConfiguration, false, 1, null, null));
                linkedHashMap = linkedHashMap4;
            }
            linkedHashMap4 = linkedHashMap;
        }
        return new OutputConfigurations(arrayList, linkedHashMap2, outputConfigurationWrapper, linkedHashMap3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<OutputId, Surface> buildSimpleOutputSurfaceMap(Map<StreamId, ? extends Surface> map, StreamGraphImpl streamGraphImpl) {
        Map mapC = r.c();
        for (CameraStream cameraStream : streamGraphImpl.getStreams()) {
            Surface surface = map.get(StreamId.m974boximpl(cameraStream.m578getIdptHMqGs()));
            if (surface != null) {
                Iterator<OutputStream> it = cameraStream.getOutputs().iterator();
                while (it.hasNext()) {
                    mapC.put(OutputId.m734boximpl(it.next().mo758getId4LaLFng()), surface);
                }
            }
        }
        return r.b(mapC);
    }
}
