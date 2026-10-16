package androidx.camera.camera2.pipe.compat;

import a.a$$ExternalSyntheticApiModelOutline0;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.camera2.pipe.core.Log;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidOutputConfiguration implements OutputConfigurationWrapper {
    public static final Companion Companion = new Companion(null);
    private final int maxSharedSurfaceCount;
    private final OutputConfiguration output;
    private final String physicalCameraId;
    private final Surface surface;
    private final boolean surfaceSharing;

    private AndroidOutputConfiguration(OutputConfiguration outputConfiguration, boolean z, int i2, String str) {
        x.f(outputConfiguration, "output");
        this.output = outputConfiguration;
        this.surfaceSharing = z;
        this.maxSharedSurfaceCount = i2;
        this.physicalCameraId = str;
        this.surface = outputConfiguration.getSurface();
    }

    @Override // androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper
    public void addSurface(Surface surface) {
        x.f(surface, "surface");
        Api26Compat.addSurfaces(this.output, surface);
    }

    @Override // androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper
    public int getMaxSharedSurfaceCount() {
        return this.maxSharedSurfaceCount;
    }

    @Override // androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper
    /* renamed from: getPhysicalCameraId-1LO98Z0, reason: not valid java name */
    public String mo997getPhysicalCameraId1LO98Z0() {
        return this.physicalCameraId;
    }

    @Override // androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper
    public Surface getSurface() {
        return this.surface;
    }

    @Override // androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper
    public int getSurfaceGroupId() {
        return this.output.getSurfaceGroupId();
    }

    @Override // androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper
    public boolean getSurfaceSharing() {
        return this.surfaceSharing;
    }

    @Override // androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper
    public List<Surface> getSurfaces() {
        return Api26Compat.getSurfaces(this.output);
    }

    @Override // androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper
    public void removeSurface(Surface surface) {
        x.f(surface, "surface");
        Api28Compat.removeSurface(this.output, surface);
    }

    public String toString() {
        return this.output.toString();
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (!x.n(cls, a$$ExternalSyntheticApiModelOutline0.m16m())) {
            return null;
        }
        Parcelable parcelable = this.output;
        x.d(parcelable, "null cannot be cast to non-null type T of androidx.camera.camera2.pipe.compat.AndroidOutputConfiguration.unwrapAs");
        return (T) parcelable;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: create-gWWoySg$default, reason: not valid java name */
        public static /* synthetic */ OutputConfigurationWrapper m998creategWWoySg$default(Companion companion, Surface surface, Integer num, OutputStream.OutputType outputType, OutputStream.MirrorMode mirrorMode, OutputStream.TimestampBase timestampBase, OutputStream.DynamicRangeProfile dynamicRangeProfile, OutputStream.StreamUseCase streamUseCase, List list, Size size, boolean z, int i2, String str, int i3, Object obj) {
            OutputStream.OutputType surface2 = (i3 & 4) != 0 ? OutputStream.OutputType.Companion.getSURFACE() : outputType;
            OutputStream.MirrorMode mirrorMode2 = (i3 & 8) != 0 ? null : mirrorMode;
            OutputStream.TimestampBase timestampBase2 = (i3 & 16) != 0 ? null : timestampBase;
            OutputStream.DynamicRangeProfile dynamicRangeProfile2 = (i3 & 32) != 0 ? null : dynamicRangeProfile;
            OutputStream.StreamUseCase streamUseCase2 = (i3 & 64) != 0 ? null : streamUseCase;
            List listH = (i3 & 128) != 0 ? i.h() : list;
            return companion.m1000creategWWoySg(surface, (i3 & 2) != 0 ? null : num, surface2, mirrorMode2, timestampBase2, dynamicRangeProfile2, streamUseCase2, listH, (i3 & 256) != 0 ? null : size, ((i3 & 512) == 0) & z, (i3 & 1024) != 0 ? -1 : i2, (i3 & 2048) != 0 ? null : str);
        }

        private final void enableSurfaceSharingCompat(OutputConfiguration outputConfiguration) {
            Api26Compat.enableSurfaceSharing(outputConfiguration);
        }

        /* renamed from: setPhysicalCameraIdCompat-8Ri2elo, reason: not valid java name */
        private final void m999setPhysicalCameraIdCompat8Ri2elo(OutputConfiguration outputConfiguration, String str) {
            Api28Compat.setPhysicalCameraId(outputConfiguration, str);
        }

        private final Class<? extends Object> toKlass(OutputStream.OutputType outputType) {
            if (x.n(outputType, OutputStream.OutputType.Companion.getSURFACE_TEXTURE())) {
                return SurfaceTexture.class;
            }
            if (x.n(outputType, OutputStream.OutputType.Companion.getSURFACE_VIEW())) {
                return SurfaceHolder.class;
            }
            if (x.n(outputType, OutputStream.OutputType.Companion.getMEDIA_CODEC())) {
                if (Build.VERSION.SDK_INT >= 35) {
                    return MediaCodec.class;
                }
                throw new IllegalStateException("OutputType.MEDIA_CODEC requires API 35 or higher.");
            }
            if (!x.n(outputType, OutputStream.OutputType.Companion.getMEDIA_RECORDER())) {
                Objects.toString(outputType);
                throw new IllegalStateException("Unsupported OutputType: ".concat(String.valueOf(outputType)));
            }
            if (Build.VERSION.SDK_INT >= 35) {
                return MediaRecorder.class;
            }
            throw new IllegalStateException("OutputType.MEDIA_RECORDER requires API 35 or higher.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: create-gWWoySg, reason: not valid java name */
        public final OutputConfigurationWrapper m1000creategWWoySg(Surface surface, Integer num, OutputStream.OutputType outputType, OutputStream.MirrorMode mirrorMode, OutputStream.TimestampBase timestampBase, OutputStream.DynamicRangeProfile dynamicRangeProfile, OutputStream.StreamUseCase streamUseCase, List<OutputStream.SensorPixelMode> list, Size size, boolean z, int i2, String str) {
            OutputConfiguration outputConfigurationNewOutputConfiguration;
            x.f(outputType, "outputType");
            x.f(list, "sensorPixelModes");
            if (!x.n(outputType, OutputStream.OutputType.Companion.getSURFACE_DEFERRED_FOR_QUERY_ONLY$camera_camera2_pipe()) || Build.VERSION.SDK_INT < 35) {
                if (x.n(outputType, OutputStream.OutputType.Companion.getSURFACE())) {
                    if (surface == 0) {
                        Objects.toString(OutputStream.OutputType.Companion.getSURFACE());
                        throw new IllegalStateException("non-null surface!");
                    }
                    try {
                        surface = i2 != -1 ? new OutputConfiguration(i2, surface) : new OutputConfiguration(surface);
                        outputConfigurationNewOutputConfiguration = surface;
                    } catch (Throwable th) {
                        if (!Log.INSTANCE.getWARN_LOGGABLE()) {
                            return null;
                        }
                        android.util.Log.w(Log.TAG, a.a(surface, "Failed to create an OutputConfiguration for ", "!"), th);
                        return null;
                    }
                } else {
                    if (size == null) {
                        throw new IllegalStateException("Size must defined when creating a deferred OutputConfiguration.");
                    }
                    outputConfigurationNewOutputConfiguration = Api26Compat.newOutputConfiguration(size, toKlass(outputType));
                }
            } else {
                if (num == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (size == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                outputConfigurationNewOutputConfiguration = Api35Compat.newImageReaderOutputConfiguration(num.intValue(), size);
            }
            if (z) {
                enableSurfaceSharingCompat(outputConfigurationNewOutputConfiguration);
            }
            if (str != null) {
                m999setPhysicalCameraIdCompat8Ri2elo(outputConfigurationNewOutputConfiguration, str);
            }
            if (mirrorMode != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    Api33Compat.setMirrorMode(outputConfigurationNewOutputConfiguration, mirrorMode.m800unboximpl());
                } else {
                    if (!OutputStream.MirrorMode.m797equalsimpl0(mirrorMode.m800unboximpl(), OutputStream.MirrorMode.Companion.m801getMIRROR_MODE_AUTODrUKqn0()) && Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, "Cannot set mirrorMode to a non-default value on API " + Build.VERSION.SDK_INT + ". This may result in unexpected behavior. Requested " + OutputStream.MirrorMode.m799toStringimpl(mirrorMode.m800unboximpl()));
                    }
                }
            }
            if (timestampBase != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    Api33Compat.setTimestampBase(outputConfigurationNewOutputConfiguration, timestampBase.m843unboximpl());
                } else {
                    if (!OutputStream.TimestampBase.m840equalsimpl0(timestampBase.m843unboximpl(), OutputStream.TimestampBase.Companion.m845getTIMESTAMP_BASE_DEFAULT6HVI0MA()) && Log.INSTANCE.getINFO_LOGGABLE()) {
                        android.util.Log.i(Log.TAG, "The timestamp base on API " + Build.VERSION.SDK_INT + " will default to TIMESTAMP_BASE_DEFAULT, with which the camera device adjusts timestamps based on the output target. Requested " + OutputStream.TimestampBase.m842toStringimpl(timestampBase.m843unboximpl()));
                    }
                }
            }
            if (dynamicRangeProfile != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    Api33Compat.setDynamicRangeProfile(outputConfigurationNewOutputConfiguration, dynamicRangeProfile.m780unboximpl());
                } else {
                    if (!OutputStream.DynamicRangeProfile.m777equalsimpl0(dynamicRangeProfile.m780unboximpl(), OutputStream.DynamicRangeProfile.Companion.m793getSTANDARDfFAQAUE()) && Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, "Cannot set dynamicRangeProfile to a non-default value on API " + Build.VERSION.SDK_INT + ". This may result in unexpected behavior. Requested " + OutputStream.DynamicRangeProfile.m779toStringimpl(dynamicRangeProfile.m780unboximpl()));
                    }
                }
            }
            if (streamUseCase != null && Build.VERSION.SDK_INT >= 33) {
                Api33Compat.setStreamUseCase(outputConfigurationNewOutputConfiguration, streamUseCase.m820unboximpl());
            }
            if (!list.isEmpty()) {
                if (Build.VERSION.SDK_INT >= 31) {
                    Iterator<OutputStream.SensorPixelMode> it = list.iterator();
                    while (it.hasNext()) {
                        Api31Compat.addSensorPixelModeUsed(outputConfigurationNewOutputConfiguration, it.next().m811unboximpl());
                    }
                } else if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "Cannot add sensorPixelModeUsed value on API " + Build.VERSION.SDK_INT + ". This may result in unexpected behavior. Requested " + list);
                }
            }
            return new AndroidOutputConfiguration(outputConfigurationNewOutputConfiguration, z, Api28Compat.getMaxSharedSurfaceCount(outputConfigurationNewOutputConfiguration), str, null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ AndroidOutputConfiguration(OutputConfiguration outputConfiguration, boolean z, int i2, String str, o oVar) {
        this(outputConfiguration, z, i2, str);
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(h.l.c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }
}
