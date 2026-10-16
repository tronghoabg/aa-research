package androidx.camera.camera2.pipe.media;

import a.a$$ExternalSyntheticApiModelOutline0;
import android.hardware.camera2.MultiResolutionImageReader;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraOnActiveOutputSurfacesListener;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.PlatformApiCompat;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.media.ImageReaderWrapper;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import e.c.d.a;
import h.a.i;
import h.a.r;
import h.e.b;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import h.l.c;
import h.m.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import kotlinx.a.d;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidMultiResolutionImageReader implements ImageReaderWrapper, ImageReader.OnImageAvailableListener, CameraOnActiveOutputSurfacesListener {
    public static final Companion Companion = new Companion(null);
    private final int capacity;
    private final boolean concurrentOutputsEnabled;
    private final CopyOnWriteArraySet<ImageReader> imageReaderSet;
    private final MultiResolutionImageReader multiResolutionImageReader;
    private final d onExpectedOutputsListener$delegate;
    private final d onImageListener$delegate;
    private final List<OutputConfiguration> outputConfigurations;
    private final Map<Surface, Set<OutputId>> singleOutputIdSets;
    private final int streamFormat;
    private final int streamId;
    private final Map<MultiResolutionStreamInfo, OutputId> streamInfoToOutputIdMap;
    private final Map<Surface, OutputId> surfaceToOutputIdMap;
    private final Long usageFlags;

    private AndroidMultiResolutionImageReader(MultiResolutionImageReader multiResolutionImageReader, int i2, int i3, Long l2, int i4, List<OutputConfiguration> list, Map<MultiResolutionStreamInfo, OutputId> map, Map<Surface, OutputId> map2, boolean z) {
        x.f(multiResolutionImageReader, "multiResolutionImageReader");
        x.f(list, "outputConfigurations");
        x.f(map, "streamInfoToOutputIdMap");
        x.f(map2, "surfaceToOutputIdMap");
        this.multiResolutionImageReader = multiResolutionImageReader;
        this.streamFormat = i2;
        this.capacity = i3;
        this.usageFlags = l2;
        this.streamId = i4;
        this.outputConfigurations = list;
        this.streamInfoToOutputIdMap = map;
        this.surfaceToOutputIdMap = map2;
        this.concurrentOutputsEnabled = z;
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.a(map2.size()));
        Iterator<T> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), a.o(entry.getValue()));
        }
        this.singleOutputIdSets = linkedHashMap;
        this.imageReaderSet = new CopyOnWriteArraySet<>();
        this.onImageListener$delegate = b.h(null);
        this.onExpectedOutputsListener$delegate = b.h(null);
    }

    static final CharSequence toString$lambda$0(MultiResolutionStreamInfo multiResolutionStreamInfo) {
        x.f(multiResolutionStreamInfo, "it");
        return multiResolutionStreamInfo.getPhysicalCameraId() + ":w" + multiResolutionStreamInfo.getWidth() + CmcdData.STREAMING_FORMAT_HLS + multiResolutionStreamInfo.getHeight();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.multiResolutionImageReader.close();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public void discardFreeBuffers() {
        Iterator<ImageReader> it = this.imageReaderSet.iterator();
        x.e(it, "iterator(...)");
        while (it.hasNext()) {
            try {
                it.next().discardFreeBuffers();
            } catch (IllegalStateException unused) {
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, "Failed to discardFreeBuffers on " + this + ". Expected if invoked after close().");
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public void flush() {
        try {
            this.multiResolutionImageReader.flush();
        } catch (IllegalStateException unused) {
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, "Failed to flush " + this + ". Expected if invoked after close().");
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public int getCapacity() {
        return this.capacity;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public ImageReaderWrapper.OnExpectedOutputsListener getOnExpectedOutputsListener() {
        return (ImageReaderWrapper.OnExpectedOutputsListener) this.onExpectedOutputsListener$delegate.b();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public ImageReaderWrapper.OnImageListener getOnImageListener() {
        return (ImageReaderWrapper.OnImageListener) this.onImageListener$delegate.b();
    }

    public final List<OutputConfiguration> getOutputConfigurations$camera_camera2_pipe() {
        return this.outputConfigurations;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public Surface getSurface() {
        Surface surface = this.multiResolutionImageReader.getSurface();
        x.e(surface, "getSurface(...)");
        return surface;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public Long getUsageFlags() {
        return this.usageFlags;
    }

    @Override // androidx.camera.camera2.pipe.CameraOnActiveOutputSurfacesListener
    public void onActiveOutputSurfaces(List<? extends Surface> list, long j2, long j3) {
        Set<OutputId> setAu;
        x.f(list, "activeOutputSurfaces");
        if (list.size() == 1) {
            Surface surface = list.get(0);
            Set<OutputId> set = this.singleOutputIdSets.get(surface);
            if (set == null) {
                throw new IllegalStateException("Unrecognized active surface in " + StreamId.m979toStringimpl(this.streamId) + ": " + surface);
            }
            setAu = set;
        } else {
            List<? extends Surface> list2 = list;
            ArrayList arrayList = new ArrayList(i.q(list2, 10));
            for (Surface surface2 : list2) {
                OutputId outputId = this.surfaceToOutputIdMap.get(surface2);
                if (outputId == null) {
                    throw new IllegalStateException("Unrecognized active surface in " + StreamId.m979toStringimpl(this.streamId) + ": " + surface2);
                }
                arrayList.add(OutputId.m734boximpl(outputId.m740unboximpl()));
            }
            setAu = i.au(arrayList);
        }
        ImageReaderWrapper.OnExpectedOutputsListener onExpectedOutputsListener = getOnExpectedOutputsListener();
        if (onExpectedOutputsListener != null) {
            onExpectedOutputsListener.onExpectedOutputs(j2, setAu);
        }
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(ImageReader imageReader) {
        ImageReaderWrapper.OnExpectedOutputsListener onExpectedOutputsListener;
        if (imageReader != null) {
            this.imageReaderSet.add(imageReader);
        }
        Image imageAcquireNextImage = imageReader != null ? imageReader.acquireNextImage() : null;
        if (imageAcquireNextImage != null) {
            ImageReaderWrapper.OnImageListener onImageListener = getOnImageListener();
            if (onImageListener == null) {
                imageAcquireNextImage.close();
                return;
            }
            MultiResolutionStreamInfo streamInfoForImageReader = this.multiResolutionImageReader.getStreamInfoForImageReader(imageReader);
            x.e(streamInfoForImageReader, "getStreamInfoForImageReader(...)");
            OutputId outputId = this.streamInfoToOutputIdMap.get(streamInfoForImageReader);
            if (outputId != null) {
                int iM740unboximpl = outputId.m740unboximpl();
                if (!this.concurrentOutputsEnabled && (onExpectedOutputsListener = getOnExpectedOutputsListener()) != null) {
                    onExpectedOutputsListener.onExpectedOutputs(imageAcquireNextImage.getTimestamp(), a.o(OutputId.m734boximpl(iM740unboximpl)));
                }
                onImageListener.mo1259onImageAQuxepk(this.streamId, iM740unboximpl, new AndroidImage(imageAcquireNextImage));
                return;
            }
            throw new IllegalStateException(this + ": Failed to find OutputId for " + imageReader + " based on streamInfo " + streamInfoForImageReader + "!");
        }
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public void setOnExpectedOutputsListener(ImageReaderWrapper.OnExpectedOutputsListener onExpectedOutputsListener) {
        this.onExpectedOutputsListener$delegate.d(onExpectedOutputsListener);
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public void setOnImageListener(ImageReaderWrapper.OnImageListener onImageListener) {
        this.onImageListener$delegate.d(onImageListener);
    }

    public String toString() throws IOException {
        String strAM = i.aM(this.streamInfoToOutputIdMap.keySet(), null, "[", "]", 0, new l() { // from class: androidx.camera.camera2.pipe.media.AndroidMultiResolutionImageReader$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AndroidMultiResolutionImageReader.toString$lambda$0(bi$$ExternalSyntheticApiModelOutline0.m123m(obj));
            }
        }, 25);
        int iHashCode = super.hashCode();
        k.y(16);
        String string = Integer.toString(iHashCode, 16);
        x.e(string, "toString(...)");
        return "MultiResolutionImageReader@" + string + "-" + StreamFormat.m924getNameimpl(this.streamFormat) + "-" + strAM;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (x.n(cls, AndroidMultiResolutionImageReader.class)) {
            return (T) this;
        }
        if (x.n(cls, bi$$ExternalSyntheticApiModelOutline0.m$3())) {
            return (T) this.multiResolutionImageReader;
        }
        return null;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final ImageReaderWrapper create(CameraStream cameraStream, int i2, Executor executor, Long l2, boolean z, PlatformApiCompat platformApiCompat) {
            x.f(cameraStream, "cameraStream");
            x.f(executor, "executor");
            List<OutputStream> outputs = cameraStream.getOutputs();
            if (!outputs.isEmpty()) {
                return m1256createwJp1_LU(((OutputStream) i.P(outputs)).mo757getFormat8FPWQzE(), cameraStream.m578getIdptHMqGs(), outputs, i2, executor, l2, z, platformApiCompat);
            }
            Objects.toString(cameraStream);
            throw new IllegalArgumentException(String.valueOf(cameraStream).concat(" outputs cannot be empty!"));
        }

        /* renamed from: create-wJp1_LU, reason: not valid java name */
        public final ImageReaderWrapper m1256createwJp1_LU(int i2, int i3, List<? extends OutputStream> list, int i4, Executor executor, Long l2, boolean z, PlatformApiCompat platformApiCompat) {
            PlatformApiCompat platformApiCompat2;
            int i5;
            MultiResolutionImageReader multiResolutionImageReader;
            MultiResolutionImageReader multiResolutionImageReaderBuildMultiResolutionImageReader;
            x.f(list, "outputs");
            x.f(executor, "executor");
            if (i4 <= 0) {
                throw new IllegalArgumentException("Capacity (" + i4 + ") must be > 0");
            }
            if (z && (platformApiCompat == null || !platformApiCompat.isMultiResolutionConcurrentReadersEnabled())) {
                throw new IllegalArgumentException("Concurrent MultiResolutionImageReaders are not supported on this device");
            }
            if (l2 != null && Build.VERSION.SDK_INT < 36 && Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Usage flags are only supported for API >= 36. Creating multiresolution image reader without usage flag.");
            }
            List<? extends OutputStream> list2 = list;
            LinkedHashMap linkedHashMap = new LinkedHashMap(n.h(r.a(i.q(list2, 10)), 16));
            for (OutputStream outputStream : list2) {
                h.k kVar = new h.k(new MultiResolutionStreamInfo(outputStream.getSize().getWidth(), outputStream.getSize().getHeight(), outputStream.mo755getCameraDz_R5H8()), OutputId.m734boximpl(outputStream.mo758getId4LaLFng()));
                linkedHashMap.put(kVar.c(), kVar.d());
            }
            Set setKeySet = linkedHashMap.keySet();
            if (platformApiCompat == null || !platformApiCompat.isMultiResolutionConcurrentReadersEnabled()) {
                platformApiCompat2 = platformApiCompat;
                if (l2 == null || Build.VERSION.SDK_INT < 36) {
                    i5 = i4;
                    multiResolutionImageReader = new MultiResolutionImageReader(setKeySet, i2, i5);
                } else {
                    i5 = i4;
                    multiResolutionImageReader = new MultiResolutionImageReader(setKeySet, i2, i5, l2.longValue());
                }
                multiResolutionImageReaderBuildMultiResolutionImageReader = multiResolutionImageReader;
            } else {
                i5 = i4;
                multiResolutionImageReaderBuildMultiResolutionImageReader = platformApiCompat.buildMultiResolutionImageReader(setKeySet, i2, i5, l2, Boolean.valueOf(z));
                platformApiCompat2 = platformApiCompat;
            }
            Collection collectionCreateInstancesForMultiResolutionOutput = OutputConfiguration.createInstancesForMultiResolutionOutput(multiResolutionImageReaderBuildMultiResolutionImageReader);
            x.e(collectionCreateInstancesForMultiResolutionOutput, "createInstancesForMultiResolutionOutput(...)");
            List listAo = i.ao(collectionCreateInstancesForMultiResolutionOutput);
            if (listAo.size() != list.size()) {
                throw new IllegalStateException("Check failed.");
            }
            Map mapC = r.c();
            for (h.k kVar2 : i.ar(listAo, list2)) {
                OutputConfiguration outputConfigurationM4m = a$$ExternalSyntheticApiModelOutline0.m4m(kVar2.a());
                OutputStream outputStream2 = (OutputStream) kVar2.b();
                Surface surface = outputConfigurationM4m.getSurface();
                if (surface == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                mapC.put(surface, OutputId.m734boximpl(outputStream2.mo758getId4LaLFng()));
            }
            AndroidMultiResolutionImageReader androidMultiResolutionImageReader = new AndroidMultiResolutionImageReader(multiResolutionImageReaderBuildMultiResolutionImageReader, i2, i5, l2, i3, listAo, linkedHashMap, r.b(mapC), z, null);
            if (platformApiCompat2 != null && platformApiCompat2.isMultiResolutionConcurrentReadersEnabled() && z) {
                platformApiCompat2.setOnActiveOutputSurfacesListener(multiResolutionImageReaderBuildMultiResolutionImageReader, executor, androidMultiResolutionImageReader);
            }
            multiResolutionImageReaderBuildMultiResolutionImageReader.setOnImageAvailableListener(androidMultiResolutionImageReader, executor);
            return androidMultiResolutionImageReader;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }

    public /* synthetic */ AndroidMultiResolutionImageReader(MultiResolutionImageReader multiResolutionImageReader, int i2, int i3, Long l2, int i4, List list, Map map, Map map2, boolean z, o oVar) {
        this(multiResolutionImageReader, i2, i3, l2, i4, list, map, map2, z);
    }
}
