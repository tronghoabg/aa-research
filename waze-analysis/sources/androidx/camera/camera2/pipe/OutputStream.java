package androidx.camera.camera2.pipe;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.pipe.compat.Api33Compat;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface OutputStream {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.OutputStream$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$isValidForHighSpeedOperatingMode(OutputStream outputStream) {
            if (outputStream.mo760getStreamUseCase8x2ez34() == null) {
                return true;
            }
            StreamUseCase streamUseCaseMo760getStreamUseCase8x2ez34 = outputStream.mo760getStreamUseCase8x2ez34();
            long jM822getDEFAULTvrKr8v8 = StreamUseCase.Companion.m822getDEFAULTvrKr8v8();
            if (streamUseCaseMo760getStreamUseCase8x2ez34 != null && StreamUseCase.m817equalsimpl0(streamUseCaseMo760getStreamUseCase8x2ez34.m820unboximpl(), jM822getDEFAULTvrKr8v8)) {
                return true;
            }
            StreamUseCase streamUseCaseMo760getStreamUseCase8x2ez342 = outputStream.mo760getStreamUseCase8x2ez34();
            long jM823getPREVIEWvrKr8v8 = StreamUseCase.Companion.m823getPREVIEWvrKr8v8();
            if (streamUseCaseMo760getStreamUseCase8x2ez342 != null && StreamUseCase.m817equalsimpl0(streamUseCaseMo760getStreamUseCase8x2ez342.m820unboximpl(), jM823getPREVIEWvrKr8v8)) {
                return true;
            }
            StreamUseCase streamUseCaseMo760getStreamUseCase8x2ez343 = outputStream.mo760getStreamUseCase8x2ez34();
            long jM827getVIDEO_RECORDvrKr8v8 = StreamUseCase.Companion.m827getVIDEO_RECORDvrKr8v8();
            if ((streamUseCaseMo760getStreamUseCase8x2ez343 != null && StreamUseCase.m817equalsimpl0(streamUseCaseMo760getStreamUseCase8x2ez343.m820unboximpl(), jM827getVIDEO_RECORDvrKr8v8)) || outputStream.mo761getStreamUseHintHIPxoCc() == null) {
                return true;
            }
            StreamUseHint streamUseHintMo761getStreamUseHintHIPxoCc = outputStream.mo761getStreamUseHintHIPxoCc();
            long jM835getDEFAULT4VYZOf8 = StreamUseHint.Companion.m835getDEFAULT4VYZOf8();
            if (streamUseHintMo761getStreamUseHintHIPxoCc != null && StreamUseHint.m831equalsimpl0(streamUseHintMo761getStreamUseHintHIPxoCc.m834unboximpl(), jM835getDEFAULT4VYZOf8)) {
                return true;
            }
            StreamUseHint streamUseHintMo761getStreamUseHintHIPxoCc2 = outputStream.mo761getStreamUseHintHIPxoCc();
            return streamUseHintMo761getStreamUseHintHIPxoCc2 != null && StreamUseHint.m831equalsimpl0(streamUseHintMo761getStreamUseHintHIPxoCc2.m834unboximpl(), StreamUseHint.Companion.m836getVIDEO_RECORD4VYZOf8());
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static boolean isValidForHighSpeedOperatingMode(OutputStream outputStream) {
            return CC.$default$isValidForHighSpeedOperatingMode(outputStream);
        }
    }

    /* renamed from: getCamera-Dz_R5H8, reason: not valid java name */
    String mo755getCameraDz_R5H8();

    /* renamed from: getDynamicRangeProfile-OoVcG5w, reason: not valid java name */
    DynamicRangeProfile mo756getDynamicRangeProfileOoVcG5w();

    /* renamed from: getFormat-8FPWQzE, reason: not valid java name */
    int mo757getFormat8FPWQzE();

    /* renamed from: getId-4LaLFng, reason: not valid java name */
    int mo758getId4LaLFng();

    /* renamed from: getMirrorMode-dO1_9xk, reason: not valid java name */
    MirrorMode mo759getMirrorModedO1_9xk();

    OutputType getOutputType();

    Size getSize();

    CameraStream getStream();

    /* renamed from: getStreamUseCase-8x2ez34, reason: not valid java name */
    StreamUseCase mo760getStreamUseCase8x2ez34();

    /* renamed from: getStreamUseHint-HIPxoCc, reason: not valid java name */
    StreamUseHint mo761getStreamUseHintHIPxoCc();

    /* renamed from: getTimestampBase-pcPfPbY, reason: not valid java name */
    TimestampBase mo762getTimestampBasepcPfPbY();

    boolean isValidForHighSpeedOperatingMode();

    /* compiled from: WazeSource */
    public abstract class Config {
        public static final Companion Companion = new Companion(null);
        private final String camera;
        private final DynamicRangeProfile dynamicRangeProfile;
        private final int format;
        private final MirrorMode mirrorMode;
        private final List<SensorPixelMode> sensorPixelModes;
        private final Size size;
        private final StreamUseCase streamUseCase;
        private final StreamUseHint streamUseHint;
        private final TimestampBase timestampBase;

        private Config(Size size, int i2, String str, MirrorMode mirrorMode, TimestampBase timestampBase, DynamicRangeProfile dynamicRangeProfile, StreamUseCase streamUseCase, StreamUseHint streamUseHint, List<SensorPixelMode> list) {
            x.f(size, "size");
            x.f(list, "sensorPixelModes");
            this.size = size;
            this.format = i2;
            this.camera = str;
            this.mirrorMode = mirrorMode;
            this.timestampBase = timestampBase;
            this.dynamicRangeProfile = dynamicRangeProfile;
            this.streamUseCase = streamUseCase;
            this.streamUseHint = streamUseHint;
            this.sensorPixelModes = list;
        }

        /* renamed from: getCamera-1LO98Z0, reason: not valid java name */
        public final String m763getCamera1LO98Z0() {
            return this.camera;
        }

        /* renamed from: getDynamicRangeProfile-OoVcG5w, reason: not valid java name */
        public final DynamicRangeProfile m764getDynamicRangeProfileOoVcG5w() {
            return this.dynamicRangeProfile;
        }

        /* renamed from: getFormat-8FPWQzE, reason: not valid java name */
        public final int m765getFormat8FPWQzE() {
            return this.format;
        }

        /* renamed from: getMirrorMode-dO1_9xk, reason: not valid java name */
        public final MirrorMode m766getMirrorModedO1_9xk() {
            return this.mirrorMode;
        }

        public final List<SensorPixelMode> getSensorPixelModes() {
            return this.sensorPixelModes;
        }

        public final Size getSize() {
            return this.size;
        }

        /* renamed from: getStreamUseCase-8x2ez34, reason: not valid java name */
        public final StreamUseCase m767getStreamUseCase8x2ez34() {
            return this.streamUseCase;
        }

        /* renamed from: getStreamUseHint-HIPxoCc, reason: not valid java name */
        public final StreamUseHint m768getStreamUseHintHIPxoCc() {
            return this.streamUseHint;
        }

        /* renamed from: getTimestampBase-pcPfPbY, reason: not valid java name */
        public final TimestampBase m769getTimestampBasepcPfPbY() {
            return this.timestampBase;
        }

        public String toString() {
            String str = this.camera;
            String strM928toStringimpl = StreamFormat.m928toStringimpl(this.format);
            String strM552toStringimpl = str == null ? "null" : CameraId.m552toStringimpl(str);
            return "Config(size=" + this.size + ", format=" + strM928toStringimpl + ", camera=" + strM552toStringimpl + ", mirrorMode=" + this.mirrorMode + ", timestampBase=" + this.timestampBase + ", dynamicRangeProfile=" + this.dynamicRangeProfile + ", streamUseCase=" + this.streamUseCase + ", streamUseHint=" + this.streamUseHint + ", sensorPixelModes=" + this.sensorPixelModes + ")";
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: create-vBYXiEU$default, reason: not valid java name */
            public static /* synthetic */ Config m770createvBYXiEU$default(Companion companion, Size size, int i2, String str, OutputType outputType, MirrorMode mirrorMode, TimestampBase timestampBase, DynamicRangeProfile dynamicRangeProfile, StreamUseCase streamUseCase, StreamUseHint streamUseHint, List list, int i3, Object obj) {
                String str2;
                Companion companion2;
                Size size2;
                int i4;
                OutputType surface = (i3 & 8) != 0 ? OutputType.Companion.getSURFACE() : outputType;
                MirrorMode mirrorMode2 = (i3 & 16) != 0 ? null : mirrorMode;
                TimestampBase timestampBase2 = (i3 & 32) != 0 ? null : timestampBase;
                DynamicRangeProfile dynamicRangeProfile2 = (i3 & 64) != 0 ? null : dynamicRangeProfile;
                StreamUseCase streamUseCase2 = (i3 & 128) != 0 ? null : streamUseCase;
                StreamUseHint streamUseHint2 = (i3 & 256) != 0 ? null : streamUseHint;
                List listH = (i3 & 512) != 0 ? i.h() : list;
                if ((i3 & 4) != 0) {
                    str2 = null;
                    size2 = size;
                    i4 = i2;
                    companion2 = companion;
                } else {
                    str2 = str;
                    companion2 = companion;
                    size2 = size;
                    i4 = i2;
                }
                return companion2.m772createvBYXiEU(size2, i4, str2, surface, mirrorMode2, timestampBase2, dynamicRangeProfile2, streamUseCase2, streamUseHint2, listH);
            }

            /* renamed from: external-4cjX7jI$default, reason: not valid java name */
            public static /* synthetic */ Config m771external4cjX7jI$default(Companion companion, Size size, int i2, String str, OutputConfiguration outputConfiguration, StreamUseHint streamUseHint, List list, int i3, Object obj) {
                if ((i3 & 32) != 0) {
                    list = i.h();
                }
                List list2 = list;
                if ((i3 & 4) != 0) {
                    str = null;
                }
                return companion.m773external4cjX7jI(size, i2, str, outputConfiguration, streamUseHint, list2);
            }

            private final boolean isLazilyConfigurable(OutputType outputType) {
                if (x.n(outputType, OutputType.Companion.getSURFACE_TEXTURE()) || x.n(outputType, OutputType.Companion.getSURFACE_VIEW())) {
                    return true;
                }
                return (x.n(outputType, OutputType.Companion.getMEDIA_CODEC()) || x.n(outputType, OutputType.Companion.getMEDIA_RECORDER())) && Build.VERSION.SDK_INT >= 35;
            }

            /* renamed from: create-vBYXiEU, reason: not valid java name */
            public final Config m772createvBYXiEU(Size size, int i2, String str, OutputType outputType, MirrorMode mirrorMode, TimestampBase timestampBase, DynamicRangeProfile dynamicRangeProfile, StreamUseCase streamUseCase, StreamUseHint streamUseHint, List<SensorPixelMode> list) {
                x.f(size, "size");
                x.f(outputType, "outputType");
                x.f(list, "sensorPixelModes");
                if (isLazilyConfigurable(outputType)) {
                    return new LazyOutputConfig(size, i2, str, outputType, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, list, null);
                }
                if (x.n(outputType, OutputType.Companion.getSURFACE())) {
                    return new SimpleOutputConfig(size, i2, str, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, list, null);
                }
                throw new IllegalStateException("Check failed.");
            }

            /* renamed from: external-4cjX7jI, reason: not valid java name */
            public final Config m773external4cjX7jI(Size size, int i2, String str, OutputConfiguration outputConfiguration, StreamUseHint streamUseHint, List<SensorPixelMode> list) {
                x.f(size, "size");
                x.f(outputConfiguration, "externalOutputConfig");
                x.f(list, "sensorPixelModes");
                return new ExternalOutputConfig(size, i2, str, outputConfiguration, streamUseHint, list, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* compiled from: WazeSource */
        public final class SimpleOutputConfig extends Config {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private SimpleOutputConfig(Size size, int i2, String str, MirrorMode mirrorMode, TimestampBase timestampBase, DynamicRangeProfile dynamicRangeProfile, StreamUseCase streamUseCase, StreamUseHint streamUseHint, List<SensorPixelMode> list) {
                super(size, i2, str, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, list, null);
                x.f(size, "size");
                x.f(list, "sensorPixelModes");
            }

            public /* synthetic */ SimpleOutputConfig(Size size, int i2, String str, MirrorMode mirrorMode, TimestampBase timestampBase, DynamicRangeProfile dynamicRangeProfile, StreamUseCase streamUseCase, StreamUseHint streamUseHint, List list, o oVar) {
                this(size, i2, str, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, list);
            }
        }

        public /* synthetic */ Config(Size size, int i2, String str, MirrorMode mirrorMode, TimestampBase timestampBase, DynamicRangeProfile dynamicRangeProfile, StreamUseCase streamUseCase, StreamUseHint streamUseHint, List list, o oVar) {
            this(size, i2, str, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, list);
        }

        /* compiled from: WazeSource */
        public final class LazyOutputConfig extends Config {
            private final OutputType outputType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private LazyOutputConfig(Size size, int i2, String str, OutputType outputType, MirrorMode mirrorMode, TimestampBase timestampBase, DynamicRangeProfile dynamicRangeProfile, StreamUseCase streamUseCase, StreamUseHint streamUseHint, List<SensorPixelMode> list) {
                super(size, i2, str, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, list, null);
                x.f(size, "size");
                x.f(outputType, "outputType");
                x.f(list, "sensorPixelModes");
                this.outputType = outputType;
            }

            public final OutputType getOutputType$camera_camera2_pipe() {
                return this.outputType;
            }

            public /* synthetic */ LazyOutputConfig(Size size, int i2, String str, OutputType outputType, MirrorMode mirrorMode, TimestampBase timestampBase, DynamicRangeProfile dynamicRangeProfile, StreamUseCase streamUseCase, StreamUseHint streamUseHint, List list, o oVar) {
                this(size, i2, str, outputType, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, list);
            }
        }

        /* compiled from: WazeSource */
        public final class ExternalOutputConfig extends Config {
            private final OutputConfiguration output;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private ExternalOutputConfig(Size size, int i2, String str, OutputConfiguration outputConfiguration, StreamUseHint streamUseHint, List<SensorPixelMode> list) {
                super(size, i2, str, MirrorMode.m794boximpl(Api33Compat.getMirrorMode(outputConfiguration)), TimestampBase.m837boximpl(Api33Compat.getTimestampBase(outputConfiguration)), DynamicRangeProfile.m774boximpl(Api33Compat.getDynamicRangeProfile(outputConfiguration)), StreamUseCase.m814boximpl(Api33Compat.getStreamUseCase(outputConfiguration)), streamUseHint, list, null);
                x.f(size, "size");
                x.f(outputConfiguration, "output");
                x.f(list, "sensorPixelModes");
                this.output = outputConfiguration;
            }

            public final OutputConfiguration getOutput() {
                return this.output;
            }

            public /* synthetic */ ExternalOutputConfig(Size size, int i2, String str, OutputConfiguration outputConfiguration, StreamUseHint streamUseHint, List list, o oVar) {
                this(size, i2, str, outputConfiguration, streamUseHint, list);
            }
        }
    }

    /* compiled from: WazeSource */
    @h.g.a
    public final class DynamicRangeProfile {
        private final long value;
        public static final Companion Companion = new Companion(null);
        private static final long STANDARD = 1;
        private static final long HLG10 = 2;
        private static final long HDR10 = 4;
        private static final long HDR10_PLUS = 8;
        private static final long DOLBY_VISION_10B_HDR_REF = 16;
        private static final long DOLBY_VISION_10B_HDR_REF_PO = 32;
        private static final long DOLBY_VISION_10B_HDR_OEM = 64;
        private static final long DOLBY_VISION_10B_HDR_OEM_PO = 128;
        private static final long DOLBY_VISION_8B_HDR_REF = 256;
        private static final long DOLBY_VISION_8B_HDR_REF_PO = 512;
        private static final long DOLBY_VISION_8B_HDR_OEM = 1024;
        private static final long DOLBY_VISION_8B_HDR_OEM_PO = androidx.media3.common.video.Frame.USAGE_COMPOSER_OVERLAY;
        private static final long PUBLIC_MAX = 4096;

        private /* synthetic */ DynamicRangeProfile(long j2) {
            this.value = j2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ DynamicRangeProfile m774boximpl(long j2) {
            return new DynamicRangeProfile(j2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m776equalsimpl(long j2, Object obj) {
            return (obj instanceof DynamicRangeProfile) && j2 == ((DynamicRangeProfile) obj).m780unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m777equalsimpl0(long j2, long j3) {
            return j2 == j3;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m778hashCodeimpl(long j2) {
            return OutputStream$DynamicRangeProfile$$ExternalSyntheticBackport0.m(j2);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m779toStringimpl(long j2) {
            return "DynamicRangeProfile(value=" + j2 + ")";
        }

        public boolean equals(Object obj) {
            return m776equalsimpl(this.value, obj);
        }

        public final long getValue() {
            return this.value;
        }

        public int hashCode() {
            return m778hashCodeimpl(this.value);
        }

        public String toString() {
            return m779toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m780unboximpl() {
            return this.value;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getDOLBY_VISION_10B_HDR_OEM-fFAQAUE, reason: not valid java name */
            public final long m781getDOLBY_VISION_10B_HDR_OEMfFAQAUE() {
                return DynamicRangeProfile.DOLBY_VISION_10B_HDR_OEM;
            }

            /* renamed from: getDOLBY_VISION_10B_HDR_OEM_PO-fFAQAUE, reason: not valid java name */
            public final long m782getDOLBY_VISION_10B_HDR_OEM_POfFAQAUE() {
                return DynamicRangeProfile.DOLBY_VISION_10B_HDR_OEM_PO;
            }

            /* renamed from: getDOLBY_VISION_10B_HDR_REF-fFAQAUE, reason: not valid java name */
            public final long m783getDOLBY_VISION_10B_HDR_REFfFAQAUE() {
                return DynamicRangeProfile.DOLBY_VISION_10B_HDR_REF;
            }

            /* renamed from: getDOLBY_VISION_10B_HDR_REF_PO-fFAQAUE, reason: not valid java name */
            public final long m784getDOLBY_VISION_10B_HDR_REF_POfFAQAUE() {
                return DynamicRangeProfile.DOLBY_VISION_10B_HDR_REF_PO;
            }

            /* renamed from: getDOLBY_VISION_8B_HDR_OEM-fFAQAUE, reason: not valid java name */
            public final long m785getDOLBY_VISION_8B_HDR_OEMfFAQAUE() {
                return DynamicRangeProfile.DOLBY_VISION_8B_HDR_OEM;
            }

            /* renamed from: getDOLBY_VISION_8B_HDR_OEM_PO-fFAQAUE, reason: not valid java name */
            public final long m786getDOLBY_VISION_8B_HDR_OEM_POfFAQAUE() {
                return DynamicRangeProfile.DOLBY_VISION_8B_HDR_OEM_PO;
            }

            /* renamed from: getDOLBY_VISION_8B_HDR_REF-fFAQAUE, reason: not valid java name */
            public final long m787getDOLBY_VISION_8B_HDR_REFfFAQAUE() {
                return DynamicRangeProfile.DOLBY_VISION_8B_HDR_REF;
            }

            /* renamed from: getDOLBY_VISION_8B_HDR_REF_PO-fFAQAUE, reason: not valid java name */
            public final long m788getDOLBY_VISION_8B_HDR_REF_POfFAQAUE() {
                return DynamicRangeProfile.DOLBY_VISION_8B_HDR_REF_PO;
            }

            /* renamed from: getHDR10-fFAQAUE, reason: not valid java name */
            public final long m789getHDR10fFAQAUE() {
                return DynamicRangeProfile.HDR10;
            }

            /* renamed from: getHDR10_PLUS-fFAQAUE, reason: not valid java name */
            public final long m790getHDR10_PLUSfFAQAUE() {
                return DynamicRangeProfile.HDR10_PLUS;
            }

            /* renamed from: getHLG10-fFAQAUE, reason: not valid java name */
            public final long m791getHLG10fFAQAUE() {
                return DynamicRangeProfile.HLG10;
            }

            /* renamed from: getPUBLIC_MAX-fFAQAUE, reason: not valid java name */
            public final long m792getPUBLIC_MAXfFAQAUE() {
                return DynamicRangeProfile.PUBLIC_MAX;
            }

            /* renamed from: getSTANDARD-fFAQAUE, reason: not valid java name */
            public final long m793getSTANDARDfFAQAUE() {
                return DynamicRangeProfile.STANDARD;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m775constructorimpl(long j2) {
            return j2;
        }
    }

    /* compiled from: WazeSource */
    @h.g.a
    public final class MirrorMode {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int MIRROR_MODE_AUTO = 0;
        private static final int MIRROR_MODE_NONE = 1;
        private static final int MIRROR_MODE_H = 2;
        private static final int MIRROR_MODE_V = 3;

        private /* synthetic */ MirrorMode(int i2) {
            this.value = i2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ MirrorMode m794boximpl(int i2) {
            return new MirrorMode(i2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m796equalsimpl(int i2, Object obj) {
            return (obj instanceof MirrorMode) && i2 == ((MirrorMode) obj).m800unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m797equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m799toStringimpl(int i2) {
            return a.a(i2, "MirrorMode(value=", ")");
        }

        public boolean equals(Object obj) {
            return m796equalsimpl(this.value, obj);
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return m799toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m800unboximpl() {
            return this.value;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getMIRROR_MODE_AUTO-DrUKqn0, reason: not valid java name */
            public final int m801getMIRROR_MODE_AUTODrUKqn0() {
                return MirrorMode.MIRROR_MODE_AUTO;
            }

            /* renamed from: getMIRROR_MODE_H-DrUKqn0, reason: not valid java name */
            public final int m802getMIRROR_MODE_HDrUKqn0() {
                return MirrorMode.MIRROR_MODE_H;
            }

            /* renamed from: getMIRROR_MODE_NONE-DrUKqn0, reason: not valid java name */
            public final int m803getMIRROR_MODE_NONEDrUKqn0() {
                return MirrorMode.MIRROR_MODE_NONE;
            }

            /* renamed from: getMIRROR_MODE_V-DrUKqn0, reason: not valid java name */
            public final int m804getMIRROR_MODE_VDrUKqn0() {
                return MirrorMode.MIRROR_MODE_V;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m795constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m798hashCodeimpl(int i2) {
            return i2;
        }
    }

    /* compiled from: WazeSource */
    public final class OutputType {
        public static final Companion Companion = new Companion(null);
        private static final OutputType SURFACE = new OutputType();
        private static final OutputType SURFACE_VIEW = new OutputType();
        private static final OutputType SURFACE_TEXTURE = new OutputType();
        private static final OutputType SURFACE_DEFERRED_FOR_QUERY_ONLY = new OutputType();
        private static final OutputType MEDIA_CODEC = new OutputType();
        private static final OutputType MEDIA_RECORDER = new OutputType();

        private OutputType() {
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final OutputType getMEDIA_CODEC() {
                return OutputType.MEDIA_CODEC;
            }

            public final OutputType getMEDIA_RECORDER() {
                return OutputType.MEDIA_RECORDER;
            }

            public final OutputType getSURFACE() {
                return OutputType.SURFACE;
            }

            public final OutputType getSURFACE_DEFERRED_FOR_QUERY_ONLY$camera_camera2_pipe() {
                return OutputType.SURFACE_DEFERRED_FOR_QUERY_ONLY;
            }

            public final OutputType getSURFACE_TEXTURE() {
                return OutputType.SURFACE_TEXTURE;
            }

            public final OutputType getSURFACE_VIEW() {
                return OutputType.SURFACE_VIEW;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }

    /* compiled from: WazeSource */
    @h.g.a
    public final class SensorPixelMode {
        public static final Companion Companion = new Companion(null);
        private static final int DEFAULT = 0;
        private static final int MAXIMUM_RESOLUTION = 1;
        private final int value;

        private /* synthetic */ SensorPixelMode(int i2) {
            this.value = i2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ SensorPixelMode m805boximpl(int i2) {
            return new SensorPixelMode(i2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m807equalsimpl(int i2, Object obj) {
            return (obj instanceof SensorPixelMode) && i2 == ((SensorPixelMode) obj).m811unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m808equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m810toStringimpl(int i2) {
            return a.a(i2, "SensorPixelMode(value=", ")");
        }

        public boolean equals(Object obj) {
            return m807equalsimpl(this.value, obj);
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return m810toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m811unboximpl() {
            return this.value;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getDEFAULT-ApWyzMw, reason: not valid java name */
            public final int m812getDEFAULTApWyzMw() {
                return SensorPixelMode.DEFAULT;
            }

            /* renamed from: getMAXIMUM_RESOLUTION-ApWyzMw, reason: not valid java name */
            public final int m813getMAXIMUM_RESOLUTIONApWyzMw() {
                return SensorPixelMode.MAXIMUM_RESOLUTION;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m806constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m809hashCodeimpl(int i2) {
            return i2;
        }
    }

    /* compiled from: WazeSource */
    @h.g.a
    public final class StreamUseCase {
        private final long value;
        public static final Companion Companion = new Companion(null);
        private static final long DEFAULT = 0;
        private static final long PREVIEW = 1;
        private static final long STILL_CAPTURE = 2;
        private static final long VIDEO_RECORD = 3;
        private static final long PREVIEW_VIDEO_STILL = 4;
        private static final long VIDEO_CALL = 5;
        private static final long CROPPED_RAW = 6;

        private /* synthetic */ StreamUseCase(long j2) {
            this.value = j2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ StreamUseCase m814boximpl(long j2) {
            return new StreamUseCase(j2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m816equalsimpl(long j2, Object obj) {
            return (obj instanceof StreamUseCase) && j2 == ((StreamUseCase) obj).m820unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m817equalsimpl0(long j2, long j3) {
            return j2 == j3;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m818hashCodeimpl(long j2) {
            return OutputStream$StreamUseCase$$ExternalSyntheticBackport0.m(j2);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m819toStringimpl(long j2) {
            return "StreamUseCase(value=" + j2 + ")";
        }

        public boolean equals(Object obj) {
            return m816equalsimpl(this.value, obj);
        }

        public final long getValue() {
            return this.value;
        }

        public int hashCode() {
            return m818hashCodeimpl(this.value);
        }

        public String toString() {
            return m819toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m820unboximpl() {
            return this.value;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getCROPPED_RAW-vrKr8v8, reason: not valid java name */
            public final long m821getCROPPED_RAWvrKr8v8() {
                return StreamUseCase.CROPPED_RAW;
            }

            /* renamed from: getDEFAULT-vrKr8v8, reason: not valid java name */
            public final long m822getDEFAULTvrKr8v8() {
                return StreamUseCase.DEFAULT;
            }

            /* renamed from: getPREVIEW-vrKr8v8, reason: not valid java name */
            public final long m823getPREVIEWvrKr8v8() {
                return StreamUseCase.PREVIEW;
            }

            /* renamed from: getPREVIEW_VIDEO_STILL-vrKr8v8, reason: not valid java name */
            public final long m824getPREVIEW_VIDEO_STILLvrKr8v8() {
                return StreamUseCase.PREVIEW_VIDEO_STILL;
            }

            /* renamed from: getSTILL_CAPTURE-vrKr8v8, reason: not valid java name */
            public final long m825getSTILL_CAPTUREvrKr8v8() {
                return StreamUseCase.STILL_CAPTURE;
            }

            /* renamed from: getVIDEO_CALL-vrKr8v8, reason: not valid java name */
            public final long m826getVIDEO_CALLvrKr8v8() {
                return StreamUseCase.VIDEO_CALL;
            }

            /* renamed from: getVIDEO_RECORD-vrKr8v8, reason: not valid java name */
            public final long m827getVIDEO_RECORDvrKr8v8() {
                return StreamUseCase.VIDEO_RECORD;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m815constructorimpl(long j2) {
            return j2;
        }
    }

    /* compiled from: WazeSource */
    @h.g.a
    public final class StreamUseHint {
        public static final Companion Companion = new Companion(null);
        private static final long DEFAULT = 0;
        private static final long VIDEO_RECORD = 1;
        private final long value;

        private /* synthetic */ StreamUseHint(long j2) {
            this.value = j2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ StreamUseHint m828boximpl(long j2) {
            return new StreamUseHint(j2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m830equalsimpl(long j2, Object obj) {
            return (obj instanceof StreamUseHint) && j2 == ((StreamUseHint) obj).m834unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m831equalsimpl0(long j2, long j3) {
            return j2 == j3;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m832hashCodeimpl(long j2) {
            return OutputStream$StreamUseHint$$ExternalSyntheticBackport0.m(j2);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m833toStringimpl(long j2) {
            return "StreamUseHint(value=" + j2 + ")";
        }

        public boolean equals(Object obj) {
            return m830equalsimpl(this.value, obj);
        }

        public final long getValue() {
            return this.value;
        }

        public int hashCode() {
            return m832hashCodeimpl(this.value);
        }

        public String toString() {
            return m833toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m834unboximpl() {
            return this.value;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getDEFAULT-4VYZOf8, reason: not valid java name */
            public final long m835getDEFAULT4VYZOf8() {
                return StreamUseHint.DEFAULT;
            }

            /* renamed from: getVIDEO_RECORD-4VYZOf8, reason: not valid java name */
            public final long m836getVIDEO_RECORD4VYZOf8() {
                return StreamUseHint.VIDEO_RECORD;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m829constructorimpl(long j2) {
            return j2;
        }
    }

    /* compiled from: WazeSource */
    @h.g.a
    public final class TimestampBase {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int TIMESTAMP_BASE_DEFAULT = 0;
        private static final int TIMESTAMP_BASE_SENSOR = 1;
        private static final int TIMESTAMP_BASE_MONOTONIC = 2;
        private static final int TIMESTAMP_BASE_REALTIME = 3;
        private static final int TIMESTAMP_BASE_CHOREOGRAPHER_SYNCED = 4;

        private /* synthetic */ TimestampBase(int i2) {
            this.value = i2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ TimestampBase m837boximpl(int i2) {
            return new TimestampBase(i2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m839equalsimpl(int i2, Object obj) {
            return (obj instanceof TimestampBase) && i2 == ((TimestampBase) obj).m843unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m840equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m842toStringimpl(int i2) {
            return a.a(i2, "TimestampBase(value=", ")");
        }

        public boolean equals(Object obj) {
            return m839equalsimpl(this.value, obj);
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return m842toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m843unboximpl() {
            return this.value;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getTIMESTAMP_BASE_CHOREOGRAPHER_SYNCED-6HVI0MA, reason: not valid java name */
            public final int m844getTIMESTAMP_BASE_CHOREOGRAPHER_SYNCED6HVI0MA() {
                return TimestampBase.TIMESTAMP_BASE_CHOREOGRAPHER_SYNCED;
            }

            /* renamed from: getTIMESTAMP_BASE_DEFAULT-6HVI0MA, reason: not valid java name */
            public final int m845getTIMESTAMP_BASE_DEFAULT6HVI0MA() {
                return TimestampBase.TIMESTAMP_BASE_DEFAULT;
            }

            /* renamed from: getTIMESTAMP_BASE_MONOTONIC-6HVI0MA, reason: not valid java name */
            public final int m846getTIMESTAMP_BASE_MONOTONIC6HVI0MA() {
                return TimestampBase.TIMESTAMP_BASE_MONOTONIC;
            }

            /* renamed from: getTIMESTAMP_BASE_REALTIME-6HVI0MA, reason: not valid java name */
            public final int m847getTIMESTAMP_BASE_REALTIME6HVI0MA() {
                return TimestampBase.TIMESTAMP_BASE_REALTIME;
            }

            /* renamed from: getTIMESTAMP_BASE_SENSOR-6HVI0MA, reason: not valid java name */
            public final int m848getTIMESTAMP_BASE_SENSOR6HVI0MA() {
                return TimestampBase.TIMESTAMP_BASE_SENSOR;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m838constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m841hashCodeimpl(int i2) {
            return i2;
        }
    }
}
