package androidx.camera.camera2.pipe.core;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Trace;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.ConcurrentCameraGraphs;
import androidx.camera.camera2.pipe.InputStream;
import androidx.camera.camera2.pipe.InputStreamId;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.media.ImageReaderImageSource;
import androidx.camera.camera2.pipe.media.ImageSource;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.a.c;
import h.a.i;
import h.b.a;
import h.g.a.l;
import h.g.b.x;
import h.k;
import h.n.o;
import h.o.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Debug {
    public static final boolean ENABLE_LOGGING = true;
    public static final boolean ENABLE_TRACING = true;
    public static final Debug INSTANCE = new Debug();
    private static final SystemTimeSource systemTimeSource = new SystemTimeSource();

    private Debug() {
    }

    private final void appendParameters(StringBuilder sb, String str, Map<?, ? extends Object> map) {
        if (map.isEmpty()) {
            sb.append(String.valueOf(str).concat(": (None)\n"));
            return;
        }
        sb.append(String.valueOf(str).concat("\n"));
        Iterator<T> it = INSTANCE.parametersToSortedStringPairs(map).iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            sb.append("  " + o.aa((String) kVar.c(), 50) + " " + kVar.d() + "\n");
        }
    }

    public static /* synthetic */ String formatParameterMap$default(Debug debug, Map map, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        return debug.formatParameterMap(map, i2);
    }

    static final CharSequence formatParameterMap$lambda$0(k kVar) {
        x.f(kVar, "it");
        return kVar.c() + "=" + kVar.d();
    }

    public static /* synthetic */ String formatParameterMapToLineSeparatedList$default(Debug debug, Map map, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        return debug.formatParameterMapToLineSeparatedList(map, i2);
    }

    static final CharSequence formatParameterMapToLineSeparatedList$lambda$0(k kVar) {
        x.f(kVar, "it");
        return kVar.c() + "=" + kVar.d();
    }

    private final String keyNameToString(Object obj) {
        if (obj instanceof CameraCharacteristics.Key) {
            String name = ((CameraCharacteristics.Key) obj).getName();
            x.e(name, "getName(...)");
            return name;
        }
        if (obj instanceof CaptureRequest.Key) {
            String name2 = ((CaptureRequest.Key) obj).getName();
            x.e(name2, "getName(...)");
            return name2;
        }
        if (!(obj instanceof CaptureResult.Key)) {
            return String.valueOf(obj);
        }
        String name3 = ((CaptureResult.Key) obj).getName();
        x.e(name3, "getName(...)");
        return name3;
    }

    private final List<k<String, String>> parametersToSortedStringPairs(Map<?, ? extends Object> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<?, ? extends Object> entry : map.entrySet()) {
            Debug debug = INSTANCE;
            arrayList.add(new k(debug.keyNameToString(entry.getKey()), debug.valueToString(entry.getValue())));
        }
        return i.al(arrayList, new Comparator() { // from class: androidx.camera.camera2.pipe.core.Debug$parametersToSortedStringPairs$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return a.a((String) ((k) t).c(), (String) ((k) t2).c());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String valueToString(Object obj) {
        return obj instanceof Object[] ? c.aE((Object[]) obj, null, "[", "]", new l() { // from class: androidx.camera.camera2.pipe.core.Debug$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj2) {
                return Debug.INSTANCE.valueToString(obj2);
            }
        }, 25) : String.valueOf(obj);
    }

    public final String formatCameraGraphProperties(CameraMetadata cameraMetadata, CameraGraph.Config config, CameraGraph cameraGraph) {
        int i2;
        Iterator<CameraStream> it;
        Iterator it2;
        CameraGraph cameraGraph2 = cameraGraph;
        x.f(cameraMetadata, TtmlNode.TAG_METADATA);
        x.f(config, "graphConfig");
        x.f(cameraGraph2, "cameraGraph");
        ConcurrentCameraGraphs concurrentCameraGraphs$camera_camera2_pipe = config.getConcurrentCameraGraphs$camera_camera2_pipe();
        Set<CameraId> cameraIds = concurrentCameraGraphs$camera_camera2_pipe != null ? concurrentCameraGraphs$camera_camera2_pipe.getCameraIds() : null;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        x.e(key, "LENS_FACING");
        Integer num = (Integer) cameraMetadata.get(key);
        String str = "External";
        String str2 = "Unknown";
        String str3 = (num != null && num.intValue() == 0) ? "Front" : (num != null && num.intValue() == 1) ? "Back" : (num != null && num.intValue() == 2) ? "External" : "Unknown";
        CameraCharacteristics.Key key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        x.e(key2, "INFO_SUPPORTED_HARDWARE_LEVEL");
        Integer num2 = (Integer) cameraMetadata.get(key2);
        if (num2 != null && num2.intValue() == 0) {
            str = "Limited";
        } else if (num2 != null && num2.intValue() == 1) {
            str = "Full";
        } else if (num2 != null && num2.intValue() == 2) {
            str = "Legacy";
        } else if (num2 != null && num2.intValue() == 3) {
            str = "Level 3";
        } else if (num2 == null || num2.intValue() != 4) {
            str = "Unknown";
        }
        int iM509getSessionMode2uNL3no = config.m509getSessionMode2uNL3no();
        if (CameraGraph.OperatingMode.m530equalsimpl0(iM509getSessionMode2uNL3no, CameraGraph.OperatingMode.Companion.m536getHIGH_SPEED2uNL3no())) {
            str2 = "High Speed";
        } else if (CameraGraph.OperatingMode.m530equalsimpl0(iM509getSessionMode2uNL3no, CameraGraph.OperatingMode.Companion.m537getNORMAL2uNL3no())) {
            str2 = "Normal";
        } else if (CameraGraph.OperatingMode.m530equalsimpl0(iM509getSessionMode2uNL3no, CameraGraph.OperatingMode.Companion.m535getEXTENSION2uNL3no())) {
            str2 = "Extension";
        }
        CameraCharacteristics.Key key3 = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        x.e(key3, "REQUEST_AVAILABLE_CAPABILITIES");
        int[] iArr = (int[]) cameraMetadata.get(key3);
        String str4 = (iArr == null || !c.ah(iArr, 11)) ? "Physical" : "Logical";
        StringBuilder sb = new StringBuilder();
        sb.append(cameraGraph2 + " (Camera " + config.m505getCameraDz_R5H8() + ")\n");
        if (cameraIds != null) {
            sb.append("  Concurrent: " + cameraIds + "\n");
        }
        sb.append("  Facing:    " + str3 + " (" + str4 + ", " + str + ")\n");
        StringBuilder sb2 = new StringBuilder("  Mode:      ");
        sb2.append(str2);
        sb2.append("\n");
        sb.append(sb2.toString());
        sb.append("Outputs:\n");
        Iterator<CameraStream> it3 = cameraGraph2.getStreams().getStreams().iterator();
        while (true) {
            int i3 = 12;
            if (!it3.hasNext()) {
                break;
            }
            CameraStream next = it3.next();
            ImageSource imageSourceMo964getImageSourceaKI5c8E = cameraGraph2.getStreams().mo964getImageSourceaKI5c8E(next.m578getIdptHMqGs());
            ImageReaderImageSource imageReaderImageSource = imageSourceMo964getImageSourceaKI5c8E != null ? (ImageReaderImageSource) imageSourceMo964getImageSourceaKI5c8E.unwrapAs(ImageReaderImageSource.class) : null;
            Integer numValueOf = imageReaderImageSource != null ? Integer.valueOf(imageReaderImageSource.getMaxImages$camera_camera2_pipe()) : null;
            Long usageFlags$camera_camera2_pipe = imageReaderImageSource != null ? imageReaderImageSource.getUsageFlags$camera_camera2_pipe() : null;
            Iterator it4 = next.getOutputs().iterator();
            int i4 = 0;
            while (it4.hasNext()) {
                Object next2 = it4.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    i.p();
                }
                OutputStream outputStream = (OutputStream) next2;
                sb.append("  ");
                sb.append(o.aa(i4 == 0 ? StreamId.m979toStringimpl(outputStream.getStream().m578getIdptHMqGs()) : "", i3));
                sb.append(o.aa(OutputId.m739toStringimpl(outputStream.mo758getId4LaLFng()), i3));
                String string = outputStream.getSize().toString();
                x.e(string, "toString(...)");
                sb.append(o.aa(string, i3));
                sb.append(o.aa(StreamFormat.m924getNameimpl(outputStream.mo757getFormat8FPWQzE()), 16));
                OutputStream.MirrorMode mirrorModeMo759getMirrorModedO1_9xk = outputStream.mo759getMirrorModedO1_9xk();
                if (mirrorModeMo759getMirrorModedO1_9xk != null) {
                    i2 = 16;
                    sb.append(" [" + OutputStream.MirrorMode.m799toStringimpl(mirrorModeMo759getMirrorModedO1_9xk.m800unboximpl()) + "]");
                } else {
                    i2 = 16;
                }
                OutputStream.TimestampBase timestampBaseMo762getTimestampBasepcPfPbY = outputStream.mo762getTimestampBasepcPfPbY();
                if (timestampBaseMo762getTimestampBasepcPfPbY != null) {
                    sb.append(" [" + OutputStream.TimestampBase.m842toStringimpl(timestampBaseMo762getTimestampBasepcPfPbY.m843unboximpl()) + "]");
                }
                OutputStream.DynamicRangeProfile dynamicRangeProfileMo756getDynamicRangeProfileOoVcG5w = outputStream.mo756getDynamicRangeProfileOoVcG5w();
                if (dynamicRangeProfileMo756getDynamicRangeProfileOoVcG5w != null) {
                    sb.append(" [" + OutputStream.DynamicRangeProfile.m779toStringimpl(dynamicRangeProfileMo756getDynamicRangeProfileOoVcG5w.m780unboximpl()) + "]");
                }
                OutputStream.StreamUseCase streamUseCaseMo760getStreamUseCase8x2ez34 = outputStream.mo760getStreamUseCase8x2ez34();
                if (streamUseCaseMo760getStreamUseCase8x2ez34 != null) {
                    sb.append(" [" + OutputStream.StreamUseCase.m819toStringimpl(streamUseCaseMo760getStreamUseCase8x2ez34.m820unboximpl()) + "]");
                }
                OutputStream.StreamUseHint streamUseHintMo761getStreamUseHintHIPxoCc = outputStream.mo761getStreamUseHintHIPxoCc();
                if (streamUseHintMo761getStreamUseHintHIPxoCc != null) {
                    sb.append(" [" + OutputStream.StreamUseHint.m833toStringimpl(streamUseHintMo761getStreamUseHintHIPxoCc.m834unboximpl()) + "]");
                }
                if (numValueOf != null) {
                    sb.append(" " + numValueOf.intValue() + " images/stream");
                }
                if (usageFlags$camera_camera2_pipe != null) {
                    it = it3;
                    long jLongValue = usageFlags$camera_camera2_pipe.longValue();
                    h.m.k.y(i2);
                    String string2 = Long.toString(jLongValue, i2);
                    x.e(string2, "toString(...)");
                    it2 = it4;
                    sb.append(" (usageFlags: " + jLongValue + " [0x" + string2 + "])");
                } else {
                    it = it3;
                    it2 = it4;
                }
                if (!CameraId.m549equalsimpl0(outputStream.mo755getCameraDz_R5H8(), config.m505getCameraDz_R5H8())) {
                    sb.append(" [");
                    sb.append(CameraId.m546boximpl(outputStream.mo755getCameraDz_R5H8()));
                    sb.append("]");
                }
                sb.append("\n");
                i4 = i5;
                it3 = it;
                it4 = it2;
                i3 = 12;
            }
            cameraGraph2 = cameraGraph;
        }
        if (!cameraGraph.getStreams().getInputs().isEmpty()) {
            sb.append("Inputs:\n");
            for (InputStream inputStream : cameraGraph.getStreams().getInputs()) {
                sb.append(" ");
                sb.append(o.aa(InputStreamId.m716toStringimpl(inputStream.mo708getIdm1bwn9M()), 12));
                sb.append(o.aa(StreamFormat.m928toStringimpl(inputStream.mo707getFormat8FPWQzE()), 12));
                sb.append(o.aa(String.valueOf(inputStream.getMaxImages()), 12));
                sb.append("\n");
            }
        }
        sb.append("Session Template: " + RequestTemplate.m891getNameimpl(config.m510getSessionTemplatefGx8uWA()) + "\n");
        Debug debug = INSTANCE;
        debug.appendParameters(sb, "Session Parameters", config.getSessionParameters());
        sb.append("Default Template: " + RequestTemplate.m891getNameimpl(config.m507getDefaultTemplatefGx8uWA()) + "\n");
        debug.appendParameters(sb, "Default Parameters", config.getDefaultParameters());
        debug.appendParameters(sb, "Required Parameters", config.getRequiredParameters());
        String string3 = sb.toString();
        x.e(string3, "toString(...)");
        return string3;
    }

    public final String formatParameterMap(Map<?, ? extends Object> map, int i2) {
        x.f(map, "parameters");
        return i.aM(parametersToSortedStringPairs(map), null, "{", "}", i2, new l() { // from class: androidx.camera.camera2.pipe.core.Debug$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Debug.formatParameterMap$lambda$0((k) obj);
            }
        }, 17);
    }

    public final String formatParameterMapToLineSeparatedList(Map<?, ? extends Object> map, int i2) {
        x.f(map, "parameters");
        return i.aM(parametersToSortedStringPairs(map), ",\n", "{\n", "\n}", i2, new l() { // from class: androidx.camera.camera2.pipe.core.Debug$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Debug.formatParameterMapToLineSeparatedList$lambda$0((k) obj);
            }
        }, 16);
    }

    public final String formatSurfaceMap(Map<StreamId, ? extends Surface> map) {
        x.f(map, "surfaceMap");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<StreamId, ? extends Surface> entry : map.entrySet()) {
            arrayList.add(o.w(StreamId.m979toStringimpl(entry.getKey().m980unboximpl()), 10, ' ') + " -> " + entry.getValue());
        }
        return i.aM(arrayList, "\n", null, null, 0, null, 62);
    }

    public final SystemTimeSource getSystemTimeSource$camera_camera2_pipe() {
        return systemTimeSource;
    }

    public final <T> T instrument$camera_camera2_pipe(String str, h.g.a.a<? extends T> aVar) {
        x.f(str, "label");
        x.f(aVar, "block");
        long jMo1117nowvQl9yQU = getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
        try {
            Trace.beginSection(str);
            T tInvoke = aVar.invoke();
            Trace.endSection();
            long jMo1117nowvQl9yQU2 = getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
            h.o.c cVar = h.o.a.f48264a;
            long j2 = h.o.c.j(jMo1117nowvQl9yQU2 - jMo1117nowvQl9yQU, d.f48270a);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                String str2 = String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(h.o.a.b(j2, d.f48272c))}, 1));
                x.e(str2, "format(...)");
                android.util.Log.d(Log.TAG, str + " - " + str2);
            }
            return tInvoke;
        } catch (Throwable th) {
            Trace.endSection();
            long jMo1117nowvQl9yQU3 = getSystemTimeSource$camera_camera2_pipe().mo1117nowvQl9yQU();
            h.o.c cVar2 = h.o.a.f48264a;
            long j3 = h.o.c.j(jMo1117nowvQl9yQU3 - jMo1117nowvQl9yQU, d.f48270a);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                String str3 = String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(h.o.a.b(j3, d.f48272c))}, 1));
                x.e(str3, "format(...)");
                android.util.Log.d(Log.TAG, str + " - " + str3);
            }
            throw th;
        }
    }

    public final <T> T trace(String str, h.g.a.a<? extends T> aVar) {
        x.f(str, "label");
        x.f(aVar, "block");
        try {
            Trace.beginSection(str);
            return aVar.invoke();
        } finally {
            Trace.endSection();
        }
    }

    public final void traceStart(h.g.a.a<String> aVar) {
        x.f(aVar, "label");
        Trace.beginSection(aVar.invoke());
    }

    public final void traceStop() {
        Trace.endSection();
    }
}
