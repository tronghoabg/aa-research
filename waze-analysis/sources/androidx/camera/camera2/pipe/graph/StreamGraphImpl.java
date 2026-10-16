package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraController;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.CameraStreamConfigurationMap;
import androidx.camera.camera2.pipe.InputStream;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.compat.Api24Compat;
import androidx.camera.camera2.pipe.config.CameraGraphScope;
import androidx.camera.camera2.pipe.media.ImageSource;
import androidx.camera.camera2.pipe.media.ImageSources;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import kotlinx.a.b;

/* compiled from: WazeSource */
@CameraGraphScope
/* loaded from: classes2.dex */
public final class StreamGraphImpl implements StreamGraph, AutoCloseable {
    private final Map<CameraStream.Config, CameraStream> _streamMap;
    private final g.a.a<CameraController> cameraControllerProvider;
    private final CameraMetadata cameraMetadata;
    private final CameraGraph.Config graphConfig;
    private final Map<StreamId, ImageSource> imageSourceMap;
    private final ImageSources imageSources;
    private final List<InputStream> inputs;
    private final Map<OutputStream, OutputConfig> outputConfigMap;
    private final List<OutputConfig> outputConfigs;
    private final List<OutputStream> outputs;
    private final Set<StreamId> streamIds$1;
    private final List<CameraStream> streams;
    public static final Companion Companion = new Companion(null);
    private static final b streamIds = h.e.b.f(0);
    private static final b outputIds = h.e.b.f(0);
    private static final b inputIds = h.e.b.f(0);
    private static final b configIds = h.e.b.f(0);
    private static final b groupIds = h.e.b.f(0);
    private static final List<OutputStream.OutputType> previewOutputTypes = i.i(OutputStream.OutputType.Companion.getSURFACE_VIEW(), OutputStream.OutputType.Companion.getSURFACE_TEXTURE());
    private static final Comparator<CameraStream> previewOutputTypesComparator = new Comparator() { // from class: androidx.camera.camera2.pipe.graph.StreamGraphImpl$special$$inlined$compareBy$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Iterator<T> it = ((CameraStream) t).getOutputs().iterator();
            if (it.hasNext()) {
                Integer numValueOf = Integer.valueOf(i.I(StreamGraphImpl.previewOutputTypes, ((OutputStream) it.next()).getOutputType()));
                while (it.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(i.I(StreamGraphImpl.previewOutputTypes, ((OutputStream) it.next()).getOutputType()));
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                Iterator<T> it2 = ((CameraStream) t2).getOutputs().iterator();
                if (it2.hasNext()) {
                    Integer numValueOf3 = Integer.valueOf(i.I(StreamGraphImpl.previewOutputTypes, ((OutputStream) it2.next()).getOutputType()));
                    while (it2.hasNext()) {
                        Integer numValueOf4 = Integer.valueOf(i.I(StreamGraphImpl.previewOutputTypes, ((OutputStream) it2.next()).getOutputType()));
                        if (numValueOf3.compareTo(numValueOf4) < 0) {
                            numValueOf3 = numValueOf4;
                        }
                    }
                    return h.b.a.a(numValueOf, numValueOf3);
                }
            }
            throw new NoSuchElementException();
        }
    };
    private static final List<StreamFormat> previewFormats = i.i(StreamFormat.m918boximpl(StreamFormat.Companion.m950getUNKNOWN8FPWQzE()), StreamFormat.m918boximpl(StreamFormat.Companion.m942getPRIVATE8FPWQzE()));
    private static final Comparator<CameraStream> previewFormatComparator = new Comparator() { // from class: androidx.camera.camera2.pipe.graph.StreamGraphImpl$special$$inlined$compareBy$2
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Iterator<T> it = ((CameraStream) t).getOutputs().iterator();
            if (it.hasNext()) {
                Integer numValueOf = Integer.valueOf(StreamGraphImpl.previewFormats.indexOf(StreamFormat.m918boximpl(((OutputStream) it.next()).mo757getFormat8FPWQzE())));
                while (it.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(StreamGraphImpl.previewFormats.indexOf(StreamFormat.m918boximpl(((OutputStream) it.next()).mo757getFormat8FPWQzE())));
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                Iterator<T> it2 = ((CameraStream) t2).getOutputs().iterator();
                if (it2.hasNext()) {
                    Integer numValueOf3 = Integer.valueOf(StreamGraphImpl.previewFormats.indexOf(StreamFormat.m918boximpl(((OutputStream) it2.next()).mo757getFormat8FPWQzE())));
                    while (it2.hasNext()) {
                        Integer numValueOf4 = Integer.valueOf(StreamGraphImpl.previewFormats.indexOf(StreamFormat.m918boximpl(((OutputStream) it2.next()).mo757getFormat8FPWQzE())));
                        if (numValueOf3.compareTo(numValueOf4) < 0) {
                            numValueOf3 = numValueOf4;
                        }
                    }
                    return h.b.a.a(numValueOf, numValueOf3);
                }
            }
            throw new NoSuchElementException();
        }
    };

    /* compiled from: WazeSource */
    public interface SurfaceListener {
        void onSurfaceMapUpdated(Map<StreamId, ? extends Surface> map);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StreamGraphImpl(androidx.camera.camera2.pipe.CameraMetadata r29, androidx.camera.camera2.pipe.CameraGraph.Config r30, androidx.camera.camera2.pipe.media.ImageSources r31, g.a.a<androidx.camera.camera2.pipe.CameraController> r32) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.StreamGraphImpl.<init>(androidx.camera.camera2.pipe.CameraMetadata, androidx.camera.camera2.pipe.CameraGraph$Config, androidx.camera.camera2.pipe.media.ImageSources, g.a.a):void");
    }

    private final boolean computeIfDeferredStreamsAreSupported(CameraMetadata cameraMetadata, CameraGraph.Config config) {
        return (!CameraGraph.OperatingMode.m530equalsimpl0(config.m509getSessionMode2uNL3no(), CameraGraph.OperatingMode.Companion.m537getNORMAL2uNL3no()) || CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata) || CameraMetadata.Companion.isHardwareLevelLimited(cameraMetadata) || CameraMetadata.Companion.isHardwareLevelExternal(cameraMetadata)) ? false : true;
    }

    private final int computeNextSurfaceGroupId(CameraGraph.Config config) {
        List<Integer> existingGroupNumbers = readExistingGroupNumbers(config.getStreams());
        int iNextGroupId$camera_camera2_pipe = Companion.nextGroupId$camera_camera2_pipe();
        while (existingGroupNumbers.contains(Integer.valueOf(iNextGroupId$camera_camera2_pipe))) {
            iNextGroupId$camera_camera2_pipe = Companion.nextGroupId$camera_camera2_pipe();
        }
        return iNextGroupId$camera_camera2_pipe;
    }

    private final OutputConfiguration getOutputConfigurationOrNull(OutputStream.Config config) {
        if (Build.VERSION.SDK_INT >= 33) {
            OutputStream.Config.ExternalOutputConfig externalOutputConfig = config instanceof OutputStream.Config.ExternalOutputConfig ? (OutputStream.Config.ExternalOutputConfig) config : null;
            if (externalOutputConfig != null) {
                return externalOutputConfig.getOutput();
            }
        }
        return null;
    }

    private final List<Integer> readExistingGroupNumbers(List<CameraStream.Config> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            i.aD(arrayList, ((CameraStream.Config) it.next()).getOutputs());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof OutputStream.Config.ExternalOutputConfig) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Integer numValueOf = Integer.valueOf(Api24Compat.getSurfaceGroupId(((OutputStream.Config.ExternalOutputConfig) it2.next()).getOutput()));
            if (!arrayList3.contains(numValueOf)) {
                arrayList3.add(numValueOf);
            }
        }
        return arrayList3;
    }

    private final List<CameraStream> sortOutputsByPreviewStream(List<CameraStream> list) {
        List<CameraStream> list2 = list;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            List<OutputStream> outputs = ((CameraStream) obj).getOutputs();
            if (!(outputs instanceof Collection) || !outputs.isEmpty()) {
                Iterator<T> it = outputs.iterator();
                while (it.hasNext()) {
                    OutputStream.StreamUseCase streamUseCaseMo760getStreamUseCase8x2ez34 = ((OutputStream) it.next()).mo760getStreamUseCase8x2ez34();
                    if (streamUseCaseMo760getStreamUseCase8x2ez34 == null ? false : OutputStream.StreamUseCase.m817equalsimpl0(streamUseCaseMo760getStreamUseCase8x2ez34.m820unboximpl(), OutputStream.StreamUseCase.Companion.m823getPREVIEWvrKr8v8())) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
            arrayList2.add(obj);
        }
        k kVar = new k(arrayList, arrayList2);
        List list3 = (List) kVar.a();
        List list4 = (List) kVar.b();
        List list5 = list3;
        if (!list5.isEmpty()) {
            return i.af(list5, list4);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list2) {
            List<OutputStream> outputs2 = ((CameraStream) obj2).getOutputs();
            if (!(outputs2 instanceof Collection) || !outputs2.isEmpty()) {
                Iterator<T> it2 = outputs2.iterator();
                while (it2.hasNext()) {
                    if (i.ax(previewOutputTypes, ((OutputStream) it2.next()).getOutputType())) {
                        arrayList3.add(obj2);
                        break;
                    }
                }
            }
            arrayList4.add(obj2);
        }
        k kVar2 = new k(arrayList3, arrayList4);
        List list6 = (List) kVar2.a();
        List list7 = (List) kVar2.b();
        if (!list6.isEmpty()) {
            return i.af(i.al(list6, previewOutputTypesComparator), list7);
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : list2) {
            List<OutputStream> outputs3 = ((CameraStream) obj3).getOutputs();
            if (!(outputs3 instanceof Collection) || !outputs3.isEmpty()) {
                Iterator<T> it3 = outputs3.iterator();
                while (it3.hasNext()) {
                    if (previewFormats.contains(StreamFormat.m918boximpl(((OutputStream) it3.next()).mo757getFormat8FPWQzE()))) {
                        arrayList5.add(obj3);
                        break;
                    }
                }
            }
            arrayList6.add(obj3);
        }
        k kVar3 = new k(arrayList5, arrayList6);
        List list8 = (List) kVar3.a();
        return !list8.isEmpty() ? i.af(i.al(list8, previewFormatComparator), (List) kVar3.b()) : list;
    }

    private final List<CameraStream> sortOutputsByVideoStream(List<CameraStream> list) {
        List<CameraStream> list2 = list;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            List<OutputStream> outputs = ((CameraStream) obj).getOutputs();
            if (!(outputs instanceof Collection) || !outputs.isEmpty()) {
                Iterator<T> it = outputs.iterator();
                while (it.hasNext()) {
                    OutputStream.StreamUseCase streamUseCaseMo760getStreamUseCase8x2ez34 = ((OutputStream) it.next()).mo760getStreamUseCase8x2ez34();
                    if (streamUseCaseMo760getStreamUseCase8x2ez34 == null ? false : OutputStream.StreamUseCase.m817equalsimpl0(streamUseCaseMo760getStreamUseCase8x2ez34.m820unboximpl(), OutputStream.StreamUseCase.Companion.m827getVIDEO_RECORDvrKr8v8())) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
            arrayList2.add(obj);
        }
        k kVar = new k(arrayList, arrayList2);
        List list3 = (List) kVar.a();
        List list4 = (List) kVar.b();
        if (!list3.isEmpty()) {
            return i.af(list4, list3);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list2) {
            List<OutputStream> outputs2 = ((CameraStream) obj2).getOutputs();
            if (!(outputs2 instanceof Collection) || !outputs2.isEmpty()) {
                Iterator<T> it2 = outputs2.iterator();
                while (it2.hasNext()) {
                    OutputStream.StreamUseHint streamUseHintMo761getStreamUseHintHIPxoCc = ((OutputStream) it2.next()).mo761getStreamUseHintHIPxoCc();
                    if (streamUseHintMo761getStreamUseHintHIPxoCc == null ? false : OutputStream.StreamUseHint.m831equalsimpl0(streamUseHintMo761getStreamUseHintHIPxoCc.m834unboximpl(), OutputStream.StreamUseHint.Companion.m836getVIDEO_RECORD4VYZOf8())) {
                        arrayList3.add(obj2);
                        break;
                    }
                }
            }
            arrayList4.add(obj2);
        }
        k kVar2 = new k(arrayList3, arrayList4);
        List list5 = (List) kVar2.a();
        return !list5.isEmpty() ? i.af((List) kVar2.b(), list5) : list;
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        Iterator<ImageSource> it = this.imageSourceMap.values().iterator();
        while (it.hasNext()) {
            StreamGraphImpl$$ExternalSyntheticAutoCloseableDispatcher0.m(it.next());
        }
    }

    @Override // androidx.camera.camera2.pipe.StreamGraph
    public CameraStream get(CameraStream.Config config) {
        x.f(config, "config");
        return this._streamMap.get(config);
    }

    @Override // androidx.camera.camera2.pipe.StreamGraph
    /* renamed from: get-aKI5c8E */
    public /* synthetic */ CameraStream mo962getaKI5c8E(int i2) {
        return StreamGraph.CC.m966$default$getaKI5c8E(this, i2);
    }

    @Override // androidx.camera.camera2.pipe.StreamGraph
    /* renamed from: get-iYJqvbA */
    public /* synthetic */ OutputStream mo963getiYJqvbA(int i2) {
        return StreamGraph.CC.m967$default$getiYJqvbA(this, i2);
    }

    public final CameraMetadata getCameraMetadata() {
        return this.cameraMetadata;
    }

    /* renamed from: getCameraStreamConfig-aKI5c8E, reason: not valid java name */
    public final CameraStream.Config m1188getCameraStreamConfigaKI5c8E(int i2) {
        Object next;
        Iterator<T> it = this._streamMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StreamId.m977equalsimpl0(((CameraStream) ((Map.Entry) next).getValue()).m578getIdptHMqGs(), i2)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (CameraStream.Config) entry.getKey();
        }
        return null;
    }

    public final CameraGraph.Config getGraphConfig() {
        return this.graphConfig;
    }

    @Override // androidx.camera.camera2.pipe.StreamGraph
    /* renamed from: getImageSource-aKI5c8E */
    public ImageSource mo964getImageSourceaKI5c8E(int i2) {
        return this.imageSourceMap.get(StreamId.m974boximpl(i2));
    }

    public final Map<StreamId, ImageSource> getImageSourceMap$camera_camera2_pipe() {
        return this.imageSourceMap;
    }

    public final ImageSources getImageSources() {
        return this.imageSources;
    }

    @Override // androidx.camera.camera2.pipe.StreamGraph
    public List<InputStream> getInputs() {
        return this.inputs;
    }

    public final Map<OutputStream, OutputConfig> getOutputConfigMap$camera_camera2_pipe() {
        return this.outputConfigMap;
    }

    public final List<OutputConfig> getOutputConfigs$camera_camera2_pipe() {
        return this.outputConfigs;
    }

    @Override // androidx.camera.camera2.pipe.StreamGraph
    /* renamed from: getOutputLatency-IL232MI */
    public StreamGraph.OutputLatency mo965getOutputLatencyIL232MI(int i2, OutputId outputId) {
        StreamGraph.OutputLatency outputLatencyMo424getOutputLatencyn5Pu2dI = this.cameraControllerProvider.get().mo424getOutputLatencyn5Pu2dI(StreamId.m974boximpl(i2));
        if (outputLatencyMo424getOutputLatencyn5Pu2dI != null) {
            return outputLatencyMo424getOutputLatencyn5Pu2dI;
        }
        CameraStream cameraStreamMo962getaKI5c8E = mo962getaKI5c8E(i2);
        OutputStream outputStreamMo963getiYJqvbA = outputId != null ? mo963getiYJqvbA(outputId.m740unboximpl()) : null;
        if (cameraStreamMo962getaKI5c8E == null) {
            throw new IllegalStateException("No stream found for given streamId ".concat(StreamId.m979toStringimpl(i2)));
        }
        if (cameraStreamMo962getaKI5c8E.getOutputs().size() == 1) {
            outputStreamMo963getiYJqvbA = (OutputStream) i.X(cameraStreamMo962getaKI5c8E.getOutputs());
        } else if (outputStreamMo963getiYJqvbA == null) {
            Objects.toString(outputId);
            throw new IllegalStateException("Output must be specified for MultiResolution use case. No output found for given outputId ".concat(String.valueOf(outputId)));
        }
        CameraStreamConfigurationMap streamConfigurationMap = CameraMetadata.Companion.getStreamConfigurationMap(this.cameraMetadata);
        Long lValueOf = streamConfigurationMap != null ? Long.valueOf(streamConfigurationMap.mo585getOutputStallDurationlomOqCM(outputStreamMo963getiYJqvbA.mo757getFormat8FPWQzE(), outputStreamMo963getiYJqvbA.getSize())) : null;
        if (lValueOf != null) {
            return new StreamGraph.OutputLatency(lValueOf.longValue(), 0L);
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.StreamGraph
    public List<OutputStream> getOutputs() {
        return this.outputs;
    }

    @Override // androidx.camera.camera2.pipe.StreamGraph
    public Set<StreamId> getStreamIds() {
        return this.streamIds$1;
    }

    @Override // androidx.camera.camera2.pipe.StreamGraph
    public List<CameraStream> getStreams() {
        return this.streams;
    }

    public String toString() {
        return "StreamGraph(" + this._streamMap + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: nextConfigId-hoCEiqs$camera_camera2_pipe, reason: not valid java name */
        public final int m1189nextConfigIdhoCEiqs$camera_camera2_pipe() {
            return StreamGraphImpl.configIds.e();
        }

        public final int nextGroupId$camera_camera2_pipe() {
            return StreamGraphImpl.groupIds.e();
        }

        /* renamed from: nextInputId-m1bwn9M$camera_camera2_pipe, reason: not valid java name */
        public final int m1190nextInputIdm1bwn9M$camera_camera2_pipe() {
            return StreamGraphImpl.inputIds.e();
        }

        /* renamed from: nextOutputId-4LaLFng$camera_camera2_pipe, reason: not valid java name */
        public final int m1191nextOutputId4LaLFng$camera_camera2_pipe() {
            return StreamGraphImpl.outputIds.e();
        }

        /* renamed from: nextStreamId-ptHMqGs$camera_camera2_pipe, reason: not valid java name */
        public final int m1192nextStreamIdptHMqGs$camera_camera2_pipe() {
            return StreamGraphImpl.streamIds.e();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    final class InputStreamImpl implements InputStream {
        private final int format;
        private final int id;
        private final int maxImages;

        private InputStreamImpl(int i2, int i3, int i4) {
            this.id = i2;
            this.maxImages = i3;
            this.format = i4;
        }

        @Override // androidx.camera.camera2.pipe.InputStream
        /* renamed from: getFormat-8FPWQzE */
        public int mo707getFormat8FPWQzE() {
            return this.format;
        }

        @Override // androidx.camera.camera2.pipe.InputStream
        /* renamed from: getId-m1bwn9M */
        public int mo708getIdm1bwn9M() {
            return this.id;
        }

        @Override // androidx.camera.camera2.pipe.InputStream
        public int getMaxImages() {
            return this.maxImages;
        }

        public /* synthetic */ InputStreamImpl(int i2, int i3, int i4, o oVar) {
            this(i2, i3, i4);
        }
    }

    /* compiled from: WazeSource */
    public final class OutputStreamImpl implements OutputStream {
        private final String camera;
        private final OutputStream.DynamicRangeProfile dynamicRangeProfile;
        private final int format;
        private final int id;
        private final OutputStream.MirrorMode mirrorMode;
        private final OutputStream.OutputType outputType;
        private final Size size;
        public CameraStream stream;
        private final OutputStream.StreamUseCase streamUseCase;
        private final OutputStream.StreamUseHint streamUseHint;
        private final OutputStream.TimestampBase timestampBase;

        public /* synthetic */ OutputStreamImpl(int i2, Size size, int i3, String str, OutputStream.MirrorMode mirrorMode, OutputStream.TimestampBase timestampBase, OutputStream.DynamicRangeProfile dynamicRangeProfile, OutputStream.StreamUseCase streamUseCase, OutputStream.OutputType outputType, OutputStream.StreamUseHint streamUseHint, int i4, o oVar) {
            this(i2, size, i3, str, (i4 & 16) != 0 ? null : mirrorMode, (i4 & 32) != 0 ? null : timestampBase, (i4 & 64) != 0 ? null : dynamicRangeProfile, (i4 & 128) != 0 ? null : streamUseCase, (i4 & 256) != 0 ? null : outputType, (i4 & 512) != 0 ? null : streamUseHint, null);
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* renamed from: getCamera-Dz_R5H8 */
        public String mo755getCameraDz_R5H8() {
            return this.camera;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* renamed from: getDynamicRangeProfile-OoVcG5w */
        public OutputStream.DynamicRangeProfile mo756getDynamicRangeProfileOoVcG5w() {
            return this.dynamicRangeProfile;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* renamed from: getFormat-8FPWQzE */
        public int mo757getFormat8FPWQzE() {
            return this.format;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* renamed from: getId-4LaLFng */
        public int mo758getId4LaLFng() {
            return this.id;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* renamed from: getMirrorMode-dO1_9xk */
        public OutputStream.MirrorMode mo759getMirrorModedO1_9xk() {
            return this.mirrorMode;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        public OutputStream.OutputType getOutputType() {
            return this.outputType;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        public Size getSize() {
            return this.size;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        public CameraStream getStream() {
            CameraStream cameraStream = this.stream;
            if (cameraStream != null) {
                return cameraStream;
            }
            x.j("stream");
            return null;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* renamed from: getStreamUseCase-8x2ez34 */
        public OutputStream.StreamUseCase mo760getStreamUseCase8x2ez34() {
            return this.streamUseCase;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* renamed from: getStreamUseHint-HIPxoCc */
        public OutputStream.StreamUseHint mo761getStreamUseHintHIPxoCc() {
            return this.streamUseHint;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* renamed from: getTimestampBase-pcPfPbY */
        public OutputStream.TimestampBase mo762getTimestampBasepcPfPbY() {
            return this.timestampBase;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        public /* synthetic */ boolean isValidForHighSpeedOperatingMode() {
            return OutputStream.CC.$default$isValidForHighSpeedOperatingMode(this);
        }

        public void setStream(CameraStream cameraStream) {
            x.f(cameraStream, "<set-?>");
            this.stream = cameraStream;
        }

        public String toString() {
            return OutputId.m739toStringimpl(mo758getId4LaLFng());
        }

        public /* synthetic */ OutputStreamImpl(int i2, Size size, int i3, String str, OutputStream.MirrorMode mirrorMode, OutputStream.TimestampBase timestampBase, OutputStream.DynamicRangeProfile dynamicRangeProfile, OutputStream.StreamUseCase streamUseCase, OutputStream.OutputType outputType, OutputStream.StreamUseHint streamUseHint, o oVar) {
            this(i2, size, i3, str, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, outputType, streamUseHint);
        }

        private OutputStreamImpl(int i2, Size size, int i3, String str, OutputStream.MirrorMode mirrorMode, OutputStream.TimestampBase timestampBase, OutputStream.DynamicRangeProfile dynamicRangeProfile, OutputStream.StreamUseCase streamUseCase, OutputStream.OutputType outputType, OutputStream.StreamUseHint streamUseHint) {
            x.f(size, "size");
            x.f(str, "camera");
            this.id = i2;
            this.size = size;
            this.format = i3;
            this.camera = str;
            this.mirrorMode = mirrorMode;
            this.timestampBase = timestampBase;
            this.dynamicRangeProfile = dynamicRangeProfile;
            this.streamUseCase = streamUseCase;
            this.outputType = outputType;
            this.streamUseHint = streamUseHint;
        }
    }

    /* compiled from: WazeSource */
    public final class OutputConfig {
        private final String camera;
        private final OutputStream.OutputType deferredOutputType;
        private final OutputStream.DynamicRangeProfile dynamicRangeProfile;
        private final OutputConfiguration externalOutputConfig;
        private final int format;
        private final Integer groupNumber;
        private final int id;
        private final OutputStream.MirrorMode mirrorMode;
        private final List<OutputStream.SensorPixelMode> sensorPixelModes;
        private final Size size;
        private final List<CameraStream> streamBuilder;
        private final OutputStream.StreamUseCase streamUseCase;
        private final OutputStream.StreamUseHint streamUseHint;
        private final OutputStream.TimestampBase timestampBase;

        private OutputConfig(int i2, Size size, int i3, String str, Integer num, OutputConfiguration outputConfiguration, OutputStream.OutputType outputType, OutputStream.MirrorMode mirrorMode, OutputStream.TimestampBase timestampBase, OutputStream.DynamicRangeProfile dynamicRangeProfile, OutputStream.StreamUseCase streamUseCase, OutputStream.StreamUseHint streamUseHint, List<OutputStream.SensorPixelMode> list) {
            x.f(size, "size");
            x.f(str, "camera");
            x.f(list, "sensorPixelModes");
            this.id = i2;
            this.size = size;
            this.format = i3;
            this.camera = str;
            this.groupNumber = num;
            this.externalOutputConfig = outputConfiguration;
            this.deferredOutputType = outputType;
            this.mirrorMode = mirrorMode;
            this.timestampBase = timestampBase;
            this.dynamicRangeProfile = dynamicRangeProfile;
            this.streamUseCase = streamUseCase;
            this.streamUseHint = streamUseHint;
            this.sensorPixelModes = list;
            this.streamBuilder = new ArrayList();
        }

        /* renamed from: getCamera-Dz_R5H8, reason: not valid java name */
        public final String m1193getCameraDz_R5H8() {
            return this.camera;
        }

        public final boolean getDeferrable() {
            return this.deferredOutputType != null;
        }

        public final OutputStream.OutputType getDeferredOutputType() {
            return this.deferredOutputType;
        }

        /* renamed from: getDynamicRangeProfile-OoVcG5w, reason: not valid java name */
        public final OutputStream.DynamicRangeProfile m1194getDynamicRangeProfileOoVcG5w() {
            return this.dynamicRangeProfile;
        }

        public final OutputConfiguration getExternalOutputConfig() {
            return this.externalOutputConfig;
        }

        /* renamed from: getFormat-8FPWQzE, reason: not valid java name */
        public final int m1195getFormat8FPWQzE() {
            return this.format;
        }

        public final Integer getGroupNumber() {
            return this.groupNumber;
        }

        /* renamed from: getId-hoCEiqs, reason: not valid java name */
        public final int m1196getIdhoCEiqs() {
            return this.id;
        }

        /* renamed from: getMirrorMode-dO1_9xk, reason: not valid java name */
        public final OutputStream.MirrorMode m1197getMirrorModedO1_9xk() {
            return this.mirrorMode;
        }

        public final List<OutputStream.SensorPixelMode> getSensorPixelModes() {
            return this.sensorPixelModes;
        }

        public final Size getSize() {
            return this.size;
        }

        public final List<CameraStream> getStreamBuilder$camera_camera2_pipe() {
            return this.streamBuilder;
        }

        /* renamed from: getStreamUseCase-8x2ez34, reason: not valid java name */
        public final OutputStream.StreamUseCase m1198getStreamUseCase8x2ez34() {
            return this.streamUseCase;
        }

        /* renamed from: getStreamUseHint-HIPxoCc, reason: not valid java name */
        public final OutputStream.StreamUseHint m1199getStreamUseHintHIPxoCc() {
            return this.streamUseHint;
        }

        public final List<CameraStream> getStreams() {
            return this.streamBuilder;
        }

        public final boolean getSurfaceSharing() {
            return this.streamBuilder.size() > 1;
        }

        /* renamed from: getTimestampBase-pcPfPbY, reason: not valid java name */
        public final OutputStream.TimestampBase m1200getTimestampBasepcPfPbY() {
            return this.timestampBase;
        }

        public String toString() {
            return OutputConfigId.m1169toStringimpl(this.id);
        }

        public /* synthetic */ OutputConfig(int i2, Size size, int i3, String str, Integer num, OutputConfiguration outputConfiguration, OutputStream.OutputType outputType, OutputStream.MirrorMode mirrorMode, OutputStream.TimestampBase timestampBase, OutputStream.DynamicRangeProfile dynamicRangeProfile, OutputStream.StreamUseCase streamUseCase, OutputStream.StreamUseHint streamUseHint, List list, o oVar) {
            this(i2, size, i3, str, num, outputConfiguration, outputType, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, list);
        }
    }
}
