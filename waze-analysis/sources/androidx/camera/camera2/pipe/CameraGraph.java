package androidx.camera.camera2.pipe;

import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.InputStream;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.compat.Camera2Quirks;
import androidx.camera.camera2.pipe.core.Log;
import h.a.i;
import h.a.r;
import h.c.e;
import h.d.b;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraGraph extends CameraGraphBase<Session>, CameraControls3A {

    /* compiled from: WazeSource */
    public final class ConcurrentConfig {
        private final List<Config> graphConfigs;

        public ConcurrentConfig(List<Config> list) {
            x.f(list, "graphConfigs");
            this.graphConfigs = list;
            if (list.size() < 2) {
                throw new IllegalStateException("Cannot create ConcurrentGraphConfig without 2 or more CameraGraph.Config(s)");
            }
            Config config = (Config) i.P(list);
            List<Config> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    String strM506getCameraBackendIdAKmI2lo = ((Config) it.next()).m506getCameraBackendIdAKmI2lo();
                    String strM506getCameraBackendIdAKmI2lo2 = config.m506getCameraBackendIdAKmI2lo();
                    boolean zM385equalsimpl0 = false;
                    if (strM506getCameraBackendIdAKmI2lo == null) {
                        if (strM506getCameraBackendIdAKmI2lo2 == null) {
                            zM385equalsimpl0 = true;
                        }
                    } else if (strM506getCameraBackendIdAKmI2lo2 != null) {
                        zM385equalsimpl0 = CameraBackendId.m385equalsimpl0(strM506getCameraBackendIdAKmI2lo, strM506getCameraBackendIdAKmI2lo2);
                    }
                    if (!zM385equalsimpl0) {
                        throw new IllegalStateException("Each CameraGraph.Config must use the same camera backend!");
                    }
                }
            }
            List<Config> list3 = this.graphConfigs;
            ArrayList arrayList = new ArrayList(i.q(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList.add(CameraId.m546boximpl(((Config) it2.next()).m505getCameraDz_R5H8()));
            }
            if (i.aa(arrayList).size() != this.graphConfigs.size()) {
                throw new IllegalStateException("Each CameraGraph.Config must have a distinct camera id!");
            }
        }

        public final List<Config> getGraphConfigs() {
            return this.graphConfigs;
        }
    }

    /* compiled from: WazeSource */
    public final class Constants3A {
        public static final int DEFAULT_FRAME_LIMIT = 60;
        public static final int DEFAULT_TIME_LIMIT_MS = 3000;
        public static final long DEFAULT_TIME_LIMIT_NS = 3000000000L;
        public static final Constants3A INSTANCE = new Constants3A();
        private static final MeteringRectangle[] METERING_REGIONS_EMPTY = new MeteringRectangle[0];
        private static final MeteringRectangle[] METERING_REGIONS_DEFAULT = {new MeteringRectangle(0, 0, 0, 0, 0)};
        private static final long FRAME_NUMBER_INVALID = -1;

        private Constants3A() {
        }

        /* renamed from: getFRAME_NUMBER_INVALID-Ugla2oM, reason: not valid java name */
        public final long m511getFRAME_NUMBER_INVALIDUgla2oM() {
            return FRAME_NUMBER_INVALID;
        }

        public final MeteringRectangle[] getMETERING_REGIONS_DEFAULT() {
            return METERING_REGIONS_DEFAULT;
        }

        public final MeteringRectangle[] getMETERING_REGIONS_EMPTY() {
            return METERING_REGIONS_EMPTY;
        }
    }

    /* compiled from: WazeSource */
    public final class Flags {
        private final boolean abortCapturesOnStop;
        private final RepeatingRequestRequirementsBeforeCapture awaitRepeatingRequestBeforeCapture;
        private final Boolean awaitRepeatingRequestOnDisconnect;
        private final boolean closeCameraDeviceOnClose;
        private final boolean closeCaptureSessionOnDisconnect;
        private final boolean configureBlankSessionOnStop;
        private final boolean enableRestartDelays;
        private final int finalizeSessionOnCloseBehavior;

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Flags(boolean z, boolean z2, RepeatingRequestRequirementsBeforeCapture repeatingRequestRequirementsBeforeCapture, Boolean bool, int i2, boolean z3, boolean z4, boolean z5, int i3, o oVar) {
            this(1 == (((i3 & 1) ^ 1) & (z ? 1 : 0)) ? 1 : 0, (i3 & 2) != 0 ? Build.VERSION.SDK_INT >= 30 : z2, (i3 & 4) != 0 ? new RepeatingRequestRequirementsBeforeCapture(0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : repeatingRequestRequirementsBeforeCapture, (i3 & 8) == 0 ? bool : null, (i3 & 16) != 0 ? FinalizeSessionOnCloseBehavior.Companion.m524getOFFBm6Tfm4() : i2, (i3 & 32) != 0 ? Camera2Quirks.Companion.shouldCloseCaptureSessionOnDisconnect$camera_camera2_pipe() : z3, ((i3 & 64) == 0) & z4, ((i3 & 128) == 0) & z5, null);
        }

        /* renamed from: copy-LsLUW-E$default, reason: not valid java name */
        public static /* synthetic */ Flags m512copyLsLUWE$default(Flags flags, boolean z, boolean z2, RepeatingRequestRequirementsBeforeCapture repeatingRequestRequirementsBeforeCapture, Boolean bool, int i2, boolean z3, boolean z4, boolean z5, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                z = flags.configureBlankSessionOnStop;
            }
            if ((i3 & 2) != 0) {
                z2 = flags.abortCapturesOnStop;
            }
            if ((i3 & 4) != 0) {
                repeatingRequestRequirementsBeforeCapture = flags.awaitRepeatingRequestBeforeCapture;
            }
            if ((i3 & 8) != 0) {
                bool = flags.awaitRepeatingRequestOnDisconnect;
            }
            if ((i3 & 16) != 0) {
                i2 = flags.finalizeSessionOnCloseBehavior;
            }
            if ((i3 & 32) != 0) {
                z3 = flags.closeCaptureSessionOnDisconnect;
            }
            if ((i3 & 64) != 0) {
                z4 = flags.closeCameraDeviceOnClose;
            }
            if ((i3 & 128) != 0) {
                z5 = flags.enableRestartDelays;
            }
            boolean z6 = z4;
            boolean z7 = z5;
            int i4 = i2;
            boolean z8 = z3;
            return flags.m514copyLsLUWE(z, z2, repeatingRequestRequirementsBeforeCapture, bool, i4, z8, z6, z7);
        }

        public final boolean component1() {
            return this.configureBlankSessionOnStop;
        }

        public final boolean component2() {
            return this.abortCapturesOnStop;
        }

        public final RepeatingRequestRequirementsBeforeCapture component3() {
            return this.awaitRepeatingRequestBeforeCapture;
        }

        public final Boolean component4() {
            return this.awaitRepeatingRequestOnDisconnect;
        }

        /* renamed from: component5-Bm6Tfm4, reason: not valid java name */
        public final int m513component5Bm6Tfm4() {
            return this.finalizeSessionOnCloseBehavior;
        }

        public final boolean component6() {
            return this.closeCaptureSessionOnDisconnect;
        }

        public final boolean component7() {
            return this.closeCameraDeviceOnClose;
        }

        public final boolean component8() {
            return this.enableRestartDelays;
        }

        /* renamed from: copy-LsLUW-E, reason: not valid java name */
        public final Flags m514copyLsLUWE(boolean z, boolean z2, RepeatingRequestRequirementsBeforeCapture repeatingRequestRequirementsBeforeCapture, Boolean bool, int i2, boolean z3, boolean z4, boolean z5) {
            x.f(repeatingRequestRequirementsBeforeCapture, "awaitRepeatingRequestBeforeCapture");
            return new Flags(z, z2, repeatingRequestRequirementsBeforeCapture, bool, i2, z3, z4, z5, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Flags)) {
                return false;
            }
            Flags flags = (Flags) obj;
            return this.configureBlankSessionOnStop == flags.configureBlankSessionOnStop && this.abortCapturesOnStop == flags.abortCapturesOnStop && x.n(this.awaitRepeatingRequestBeforeCapture, flags.awaitRepeatingRequestBeforeCapture) && x.n(this.awaitRepeatingRequestOnDisconnect, flags.awaitRepeatingRequestOnDisconnect) && FinalizeSessionOnCloseBehavior.m519equalsimpl0(this.finalizeSessionOnCloseBehavior, flags.finalizeSessionOnCloseBehavior) && this.closeCaptureSessionOnDisconnect == flags.closeCaptureSessionOnDisconnect && this.closeCameraDeviceOnClose == flags.closeCameraDeviceOnClose && this.enableRestartDelays == flags.enableRestartDelays;
        }

        public final boolean getAbortCapturesOnStop() {
            return this.abortCapturesOnStop;
        }

        public final RepeatingRequestRequirementsBeforeCapture getAwaitRepeatingRequestBeforeCapture() {
            return this.awaitRepeatingRequestBeforeCapture;
        }

        public final Boolean getAwaitRepeatingRequestOnDisconnect() {
            return this.awaitRepeatingRequestOnDisconnect;
        }

        public final boolean getCloseCameraDeviceOnClose() {
            return this.closeCameraDeviceOnClose;
        }

        public final boolean getCloseCaptureSessionOnDisconnect() {
            return this.closeCaptureSessionOnDisconnect;
        }

        public final boolean getConfigureBlankSessionOnStop() {
            return this.configureBlankSessionOnStop;
        }

        public final boolean getEnableRestartDelays() {
            return this.enableRestartDelays;
        }

        /* renamed from: getFinalizeSessionOnCloseBehavior-Bm6Tfm4, reason: not valid java name */
        public final int m515getFinalizeSessionOnCloseBehaviorBm6Tfm4() {
            return this.finalizeSessionOnCloseBehavior;
        }

        public int hashCode() {
            int iM = (((CameraGraph$Flags$$ExternalSyntheticBackport0.m(this.configureBlankSessionOnStop) * 31) + CameraGraph$Flags$$ExternalSyntheticBackport0.m(this.abortCapturesOnStop)) * 31) + this.awaitRepeatingRequestBeforeCapture.hashCode();
            Boolean bool = this.awaitRepeatingRequestOnDisconnect;
            return (((((((((iM * 31) + (bool == null ? 0 : bool.hashCode())) * 31) + this.finalizeSessionOnCloseBehavior) * 31) + CameraGraph$Flags$$ExternalSyntheticBackport0.m(this.closeCaptureSessionOnDisconnect)) * 31) + CameraGraph$Flags$$ExternalSyntheticBackport0.m(this.closeCameraDeviceOnClose)) * 31) + CameraGraph$Flags$$ExternalSyntheticBackport0.m(this.enableRestartDelays);
        }

        public String toString() {
            return "Flags(configureBlankSessionOnStop=" + this.configureBlankSessionOnStop + ", abortCapturesOnStop=" + this.abortCapturesOnStop + ", awaitRepeatingRequestBeforeCapture=" + this.awaitRepeatingRequestBeforeCapture + ", awaitRepeatingRequestOnDisconnect=" + this.awaitRepeatingRequestOnDisconnect + ", finalizeSessionOnCloseBehavior=" + FinalizeSessionOnCloseBehavior.m521toStringimpl(this.finalizeSessionOnCloseBehavior) + ", closeCaptureSessionOnDisconnect=" + this.closeCaptureSessionOnDisconnect + ", closeCameraDeviceOnClose=" + this.closeCameraDeviceOnClose + ", enableRestartDelays=" + this.enableRestartDelays + ")";
        }

        /* compiled from: WazeSource */
        @h.g.a
        public final class FinalizeSessionOnCloseBehavior {
            private final int value;
            public static final Companion Companion = new Companion(null);
            private static final int OFF = 0;
            private static final int IMMEDIATE = 1;
            private static final int TIMEOUT = 2;

            private /* synthetic */ FinalizeSessionOnCloseBehavior(int i2) {
                this.value = i2;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ FinalizeSessionOnCloseBehavior m516boximpl(int i2) {
                return new FinalizeSessionOnCloseBehavior(i2);
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m518equalsimpl(int i2, Object obj) {
                return (obj instanceof FinalizeSessionOnCloseBehavior) && i2 == ((FinalizeSessionOnCloseBehavior) obj).m522unboximpl();
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m519equalsimpl0(int i2, int i3) {
                return i2 == i3;
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m521toStringimpl(int i2) {
                return a.a(i2, "FinalizeSessionOnCloseBehavior(value=", ")");
            }

            public boolean equals(Object obj) {
                return m518equalsimpl(this.value, obj);
            }

            public final int getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value;
            }

            public String toString() {
                return m521toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ int m522unboximpl() {
                return this.value;
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                /* renamed from: getIMMEDIATE-Bm6Tfm4, reason: not valid java name */
                public final int m523getIMMEDIATEBm6Tfm4() {
                    return FinalizeSessionOnCloseBehavior.IMMEDIATE;
                }

                /* renamed from: getOFF-Bm6Tfm4, reason: not valid java name */
                public final int m524getOFFBm6Tfm4() {
                    return FinalizeSessionOnCloseBehavior.OFF;
                }

                /* renamed from: getTIMEOUT-Bm6Tfm4, reason: not valid java name */
                public final int m525getTIMEOUTBm6Tfm4() {
                    return FinalizeSessionOnCloseBehavior.TIMEOUT;
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            private static int m517constructorimpl(int i2) {
                return i2;
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m520hashCodeimpl(int i2) {
                return i2;
            }
        }

        public /* synthetic */ Flags(boolean z, boolean z2, RepeatingRequestRequirementsBeforeCapture repeatingRequestRequirementsBeforeCapture, Boolean bool, int i2, boolean z3, boolean z4, boolean z5, o oVar) {
            this(z, z2, repeatingRequestRequirementsBeforeCapture, bool, i2, z3, z4, z5);
        }

        private Flags(boolean z, boolean z2, RepeatingRequestRequirementsBeforeCapture repeatingRequestRequirementsBeforeCapture, Boolean bool, int i2, boolean z3, boolean z4, boolean z5) {
            x.f(repeatingRequestRequirementsBeforeCapture, "awaitRepeatingRequestBeforeCapture");
            this.configureBlankSessionOnStop = z;
            this.abortCapturesOnStop = z2;
            this.awaitRepeatingRequestBeforeCapture = repeatingRequestRequirementsBeforeCapture;
            this.awaitRepeatingRequestOnDisconnect = bool;
            this.finalizeSessionOnCloseBehavior = i2;
            this.closeCaptureSessionOnDisconnect = z3;
            this.closeCameraDeviceOnClose = z4;
            this.enableRestartDelays = z5;
        }
    }

    /* compiled from: WazeSource */
    @h.g.a
    public final class OperatingMode {
        private final int mode;
        public static final Companion Companion = new Companion(null);
        private static final int NORMAL = 0;
        private static final int HIGH_SPEED = 1;
        private static final int EXTENSION = 2;

        private /* synthetic */ OperatingMode(int i2) {
            this.mode = i2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ OperatingMode m527boximpl(int i2) {
            return new OperatingMode(i2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m529equalsimpl(int i2, Object obj) {
            return (obj instanceof OperatingMode) && i2 == ((OperatingMode) obj).m533unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m530equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m532toStringimpl(int i2) {
            return a.a(i2, "OperatingMode(mode=", ")");
        }

        public boolean equals(Object obj) {
            return m529equalsimpl(this.mode, obj);
        }

        public int hashCode() {
            return this.mode;
        }

        public String toString() {
            return m532toStringimpl(this.mode);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m533unboximpl() {
            return this.mode;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: custom-EP6OhB0, reason: not valid java name */
            public final int m534customEP6OhB0(int i2) {
                if (i2 != m537getNORMAL2uNL3no() && i2 != m536getHIGH_SPEED2uNL3no()) {
                    return i2;
                }
                if (Log.INSTANCE.getERROR_LOGGABLE()) {
                    android.util.Log.e(Log.TAG, a.a(i2, "Custom operating mode ", " conflicts with standard modes"));
                }
                throw new IllegalArgumentException("kotlin.Unit");
            }

            /* renamed from: getEXTENSION-2uNL3no, reason: not valid java name */
            public final int m535getEXTENSION2uNL3no() {
                return OperatingMode.EXTENSION;
            }

            /* renamed from: getHIGH_SPEED-2uNL3no, reason: not valid java name */
            public final int m536getHIGH_SPEED2uNL3no() {
                return OperatingMode.HIGH_SPEED;
            }

            /* renamed from: getNORMAL-2uNL3no, reason: not valid java name */
            public final int m537getNORMAL2uNL3no() {
                return OperatingMode.NORMAL;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: access$constructor-impl, reason: not valid java name */
        public static final /* synthetic */ int m526access$constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m528constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m531hashCodeimpl(int i2) {
            return i2;
        }
    }

    /* compiled from: WazeSource */
    public interface Session extends CameraControls3A, AutoCloseable {
        void abort();

        FrameCapture capture(Request request);

        List<FrameCapture> capture(List<Request> list);

        Request getRepeatingRequest();

        /* renamed from: lock3A--tS25XM, reason: not valid java name */
        Object mo539lock3AtS25XM(AeMode aeMode, AfMode afMode, AwbMode awbMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode2, l<? super FrameMetadata, Boolean> lVar, l<? super FrameMetadata, Boolean> lVar2, int i2, long j2, long j3, e<? super am<Result3A>> eVar);

        Object lock3AForCapture(l<? super FrameMetadata, Boolean> lVar, int i2, long j2, e<? super am<Result3A>> eVar);

        Object lock3AForCapture(boolean z, boolean z2, int i2, long j2, e<? super am<Result3A>> eVar);

        void setRepeatingRequest(Request request);

        void startRepeating(Request request);

        void stopRepeating();

        void submit(Request request);

        void submit(List<Request> list);

        Object unlock3A(Boolean bool, Boolean bool2, Boolean bool3, l<? super FrameMetadata, Boolean> lVar, int i2, long j2, e<? super am<Result3A>> eVar);

        Object unlock3APostCapture(boolean z, e<? super am<Result3A>> eVar);

        /* compiled from: WazeSource */
        public final class DefaultImpls {
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.camera.camera2.pipe.CameraGraph$Session$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: lock3A--tS25XM$default, reason: not valid java name */
            public static /* synthetic */ Object m540lock3AtS25XM$default(Session session, AeMode aeMode, AfMode afMode, AwbMode awbMode, List list, List list2, List list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode2, l lVar, l lVar2, int i2, long j2, long j3, e eVar, int i3, Object obj) {
                if (obj == null) {
                    return session.mo539lock3AtS25XM(1 == (i3 & 1) ? null : aeMode, (i3 & 2) != 0 ? null : afMode, (i3 & 4) != 0 ? null : awbMode, (i3 & 8) != 0 ? null : list, (i3 & 16) != 0 ? null : list2, (i3 & 32) != 0 ? null : list3, (i3 & 64) != 0 ? null : lock3ABehavior, (i3 & 128) != 0 ? null : lock3ABehavior2, (i3 & 256) != 0 ? null : lock3ABehavior3, (i3 & 512) != 0 ? null : aeMode2, (i3 & 1024) != 0 ? null : lVar, (i3 & 2048) != 0 ? null : lVar2, (i3 & 4096) != 0 ? 60 : i2, (i3 & 8192) != 0 ? 3000000000L : j2, (i3 & 16384) != 0 ? 3000000000L : j3, eVar);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock3A--tS25XM");
            }

            public static /* synthetic */ Object lock3AForCapture$default(Session session, boolean z, boolean z2, int i2, long j2, e eVar, int i3, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock3AForCapture");
                }
                int i4 = (z ? 1 : 0) | (i3 & 1);
                boolean z3 = ((i3 & 2) == 0) & z2;
                if ((i3 & 4) != 0) {
                    i2 = 60;
                }
                return session.lock3AForCapture(1 == i4, z3, i2, (i3 & 8) != 0 ? 3000000000L : j2, eVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Object unlock3A$default(Session session, Boolean bool, Boolean bool2, Boolean bool3, l lVar, int i2, long j2, e eVar, int i3, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock3A");
                }
                if (1 == (i3 & 1)) {
                    bool = null;
                }
                if ((i3 & 2) != 0) {
                    bool2 = null;
                }
                if ((i3 & 4) != 0) {
                    bool3 = null;
                }
                if ((i3 & 8) != 0) {
                    lVar = null;
                }
                if ((i3 & 16) != 0) {
                    i2 = 60;
                }
                if ((i3 & 32) != 0) {
                    j2 = Constants3A.DEFAULT_TIME_LIMIT_NS;
                }
                return session.unlock3A(bool, bool2, bool3, lVar, i2, j2, eVar);
            }

            public static /* synthetic */ Object unlock3APostCapture$default(Session session, boolean z, e eVar, int i2, Object obj) {
                if (obj == null) {
                    return session.unlock3APostCapture(1 == ((z ? 1 : 0) | (i2 & 1)), eVar);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock3APostCapture");
            }

            public static /* synthetic */ Object lock3AForCapture$default(Session session, l lVar, int i2, long j2, e eVar, int i3, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock3AForCapture");
                }
                if (1 == (i3 & 1)) {
                    lVar = null;
                }
                if ((i3 & 2) != 0) {
                    i2 = 60;
                }
                if ((i3 & 4) != 0) {
                    j2 = Constants3A.DEFAULT_TIME_LIMIT_NS;
                }
                return session.lock3AForCapture(lVar, i2, j2, eVar);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class RepeatingRequestRequirementsBeforeCapture {
        private final CompletionBehavior completionBehavior;
        private final int repeatingFramesToComplete;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WazeSource */
        public final class CompletionBehavior {
            private static final /* synthetic */ h.d.a $ENTRIES;
            private static final /* synthetic */ CompletionBehavior[] $VALUES;
            public static final CompletionBehavior AT_LEAST = new CompletionBehavior("AT_LEAST", 0);
            public static final CompletionBehavior EXACT = new CompletionBehavior("EXACT", 1);

            private static final /* synthetic */ CompletionBehavior[] $values() {
                return new CompletionBehavior[]{AT_LEAST, EXACT};
            }

            static {
                CompletionBehavior[] completionBehaviorArr$values = $values();
                $VALUES = completionBehaviorArr$values;
                $ENTRIES = b.a(completionBehaviorArr$values);
            }

            private CompletionBehavior(String str, int i2) {
            }

            public static h.d.a<CompletionBehavior> getEntries() {
                return $ENTRIES;
            }

            public static CompletionBehavior valueOf(String str) {
                return (CompletionBehavior) Enum.valueOf(CompletionBehavior.class, str);
            }

            public static CompletionBehavior[] values() {
                return (CompletionBehavior[]) $VALUES.clone();
            }
        }

        public /* synthetic */ RepeatingRequestRequirementsBeforeCapture(int i2, CompletionBehavior completionBehavior, int i3, o oVar) {
            this(1 == (i3 & 1) ? 0 : i2, (i3 & 2) != 0 ? CompletionBehavior.AT_LEAST : completionBehavior, null);
        }

        public final CompletionBehavior getCompletionBehavior() {
            return this.completionBehavior;
        }

        /* renamed from: getRepeatingFramesToComplete-pVg5ArA, reason: not valid java name */
        public final int m538getRepeatingFramesToCompletepVg5ArA() {
            return this.repeatingFramesToComplete;
        }

        public /* synthetic */ RepeatingRequestRequirementsBeforeCapture(int i2, CompletionBehavior completionBehavior, o oVar) {
            this(i2, completionBehavior);
        }

        private RepeatingRequestRequirementsBeforeCapture(int i2, CompletionBehavior completionBehavior) {
            x.f(completionBehavior, "completionBehavior");
            this.repeatingFramesToComplete = i2;
            this.completionBehavior = completionBehavior;
        }
    }

    /* compiled from: WazeSource */
    public final class Config {
        private final String camera;
        private final String cameraBackendId;
        private ConcurrentCameraGraphs concurrentCameraGraphs;
        private final CameraBackendFactory customCameraBackend;
        private final List<Request.Listener> defaultListeners;
        private final Map<?, Object> defaultParameters;
        private final int defaultTemplate;
        private final List<List<CameraStream.Config>> exclusiveStreamGroups;
        private final Flags flags;
        private final List<GraphStateListener> graphStateListeners;
        private final List<InputStream.Config> input;
        private final MetadataTransform metadataTransform;
        private final CameraStream.Config postviewStream;
        private final Map<?, Object> requiredParameters;
        private final String sessionColorSpace;
        private final int sessionMode;
        private final Map<?, Object> sessionParameters;
        private final int sessionTemplate;
        private final List<CameraStream.Config> streams;

        public /* synthetic */ Config(String str, List list, List list2, List list3, CameraStream.Config config, int i2, Map map, int i3, int i4, Map map2, List list4, List list5, Map map3, String str2, CameraBackendFactory cameraBackendFactory, MetadataTransform metadataTransform, Flags flags, String str3, int i5, o oVar) {
            this(str, list, (i5 & 4) != 0 ? i.h() : list2, (i5 & 8) != 0 ? null : list3, (i5 & 16) != 0 ? null : config, (i5 & 32) != 0 ? 1 : i2, (i5 & 64) != 0 ? r.j() : map, (i5 & 128) != 0 ? OperatingMode.Companion.m537getNORMAL2uNL3no() : i3, (i5 & 256) != 0 ? 1 : i4, (i5 & 512) != 0 ? r.j() : map2, (i5 & 1024) != 0 ? i.h() : list4, (i5 & 2048) != 0 ? i.h() : list5, (i5 & 4096) != 0 ? r.j() : map3, (i5 & 8192) != 0 ? null : str2, (i5 & 16384) != 0 ? null : cameraBackendFactory, (32768 & i5) != 0 ? new MetadataTransform(0, 0, null, 7, null) : metadataTransform, (65536 & i5) != 0 ? new Flags(false, false, null, null, 0, false, false, false, 255, null) : flags, (i5 & 131072) != 0 ? null : str3, null);
        }

        /* renamed from: copy-evZ4KcE$default, reason: not valid java name */
        public static /* synthetic */ Config m497copyevZ4KcE$default(Config config, String str, List list, List list2, List list3, CameraStream.Config config2, int i2, Map map, int i3, int i4, Map map2, List list4, List list5, Map map3, String str2, CameraBackendFactory cameraBackendFactory, MetadataTransform metadataTransform, Flags flags, String str3, int i5, Object obj) {
            String str4;
            Flags flags2;
            String str5 = (i5 & 1) != 0 ? config.camera : str;
            List list6 = (i5 & 2) != 0 ? config.streams : list;
            List list7 = (i5 & 4) != 0 ? config.exclusiveStreamGroups : list2;
            List list8 = (i5 & 8) != 0 ? config.input : list3;
            CameraStream.Config config3 = (i5 & 16) != 0 ? config.postviewStream : config2;
            int i6 = (i5 & 32) != 0 ? config.sessionTemplate : i2;
            Map map4 = (i5 & 64) != 0 ? config.sessionParameters : map;
            int i7 = (i5 & 128) != 0 ? config.sessionMode : i3;
            int i8 = (i5 & 256) != 0 ? config.defaultTemplate : i4;
            Map map5 = (i5 & 512) != 0 ? config.defaultParameters : map2;
            List list9 = (i5 & 1024) != 0 ? config.defaultListeners : list4;
            List list10 = (i5 & 2048) != 0 ? config.graphStateListeners : list5;
            Map map6 = (i5 & 4096) != 0 ? config.requiredParameters : map3;
            String str6 = (i5 & 8192) != 0 ? config.cameraBackendId : str2;
            String str7 = str5;
            CameraBackendFactory cameraBackendFactory2 = (i5 & 16384) != 0 ? config.customCameraBackend : cameraBackendFactory;
            MetadataTransform metadataTransform2 = (i5 & 32768) != 0 ? config.metadataTransform : metadataTransform;
            Flags flags3 = (i5 & 65536) != 0 ? config.flags : flags;
            if ((i5 & 131072) != 0) {
                flags2 = flags3;
                str4 = config.sessionColorSpace;
            } else {
                str4 = str3;
                flags2 = flags3;
            }
            return config.m504copyevZ4KcE(str7, list6, list7, list8, config3, i6, map4, i7, i8, map5, list9, list10, map6, str6, cameraBackendFactory2, metadataTransform2, flags2, str4);
        }

        /* renamed from: component1-Dz_R5H8, reason: not valid java name */
        public final String m498component1Dz_R5H8() {
            return this.camera;
        }

        public final Map<?, Object> component10() {
            return this.defaultParameters;
        }

        public final List<Request.Listener> component11() {
            return this.defaultListeners;
        }

        public final List<GraphStateListener> component12() {
            return this.graphStateListeners;
        }

        public final Map<?, Object> component13() {
            return this.requiredParameters;
        }

        /* renamed from: component14-AKmI2lo, reason: not valid java name */
        public final String m499component14AKmI2lo() {
            return this.cameraBackendId;
        }

        public final CameraBackendFactory component15() {
            return this.customCameraBackend;
        }

        public final MetadataTransform component16() {
            return this.metadataTransform;
        }

        public final Flags component17() {
            return this.flags;
        }

        /* renamed from: component18-dxVZaPA, reason: not valid java name */
        public final String m500component18dxVZaPA() {
            return this.sessionColorSpace;
        }

        public final List<CameraStream.Config> component2() {
            return this.streams;
        }

        public final List<List<CameraStream.Config>> component3() {
            return this.exclusiveStreamGroups;
        }

        public final List<InputStream.Config> component4() {
            return this.input;
        }

        public final CameraStream.Config component5() {
            return this.postviewStream;
        }

        /* renamed from: component6-fGx8uWA, reason: not valid java name */
        public final int m501component6fGx8uWA() {
            return this.sessionTemplate;
        }

        public final Map<?, Object> component7() {
            return this.sessionParameters;
        }

        /* renamed from: component8-2uNL3no, reason: not valid java name */
        public final int m502component82uNL3no() {
            return this.sessionMode;
        }

        /* renamed from: component9-fGx8uWA, reason: not valid java name */
        public final int m503component9fGx8uWA() {
            return this.defaultTemplate;
        }

        /* renamed from: copy-evZ4KcE, reason: not valid java name */
        public final Config m504copyevZ4KcE(String str, List<CameraStream.Config> list, List<? extends List<CameraStream.Config>> list2, List<InputStream.Config> list3, CameraStream.Config config, int i2, Map<?, ? extends Object> map, int i3, int i4, Map<?, ? extends Object> map2, List<? extends Request.Listener> list4, List<? extends GraphStateListener> list5, Map<?, ? extends Object> map3, String str2, CameraBackendFactory cameraBackendFactory, MetadataTransform metadataTransform, Flags flags, String str3) {
            x.f(str, "camera");
            x.f(list, "streams");
            x.f(list2, "exclusiveStreamGroups");
            x.f(map, "sessionParameters");
            x.f(map2, "defaultParameters");
            x.f(list4, "defaultListeners");
            x.f(list5, "graphStateListeners");
            x.f(map3, "requiredParameters");
            x.f(metadataTransform, "metadataTransform");
            x.f(flags, "flags");
            return new Config(str, list, list2, list3, config, i2, map, i3, i4, map2, list4, list5, map3, str2, cameraBackendFactory, metadataTransform, flags, str3, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            if (!CameraId.m549equalsimpl0(this.camera, config.camera) || !x.n(this.streams, config.streams) || !x.n(this.exclusiveStreamGroups, config.exclusiveStreamGroups) || !x.n(this.input, config.input) || !x.n(this.postviewStream, config.postviewStream) || !RequestTemplate.m890equalsimpl0(this.sessionTemplate, config.sessionTemplate) || !x.n(this.sessionParameters, config.sessionParameters) || !OperatingMode.m530equalsimpl0(this.sessionMode, config.sessionMode) || !RequestTemplate.m890equalsimpl0(this.defaultTemplate, config.defaultTemplate) || !x.n(this.defaultParameters, config.defaultParameters) || !x.n(this.defaultListeners, config.defaultListeners) || !x.n(this.graphStateListeners, config.graphStateListeners) || !x.n(this.requiredParameters, config.requiredParameters)) {
                return false;
            }
            String str = this.cameraBackendId;
            String str2 = config.cameraBackendId;
            if (str != null ? !(str2 == null || !CameraBackendId.m385equalsimpl0(str, str2)) : str2 == null) {
                if (!x.n(this.customCameraBackend, config.customCameraBackend) || !x.n(this.metadataTransform, config.metadataTransform) || !x.n(this.flags, config.flags)) {
                    return false;
                }
                String str3 = this.sessionColorSpace;
                String str4 = config.sessionColorSpace;
                if (str3 != null ? !(str4 == null || !CameraColorSpace.m393equalsimpl0(str3, str4)) : str4 == null) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: getCamera-Dz_R5H8, reason: not valid java name */
        public final String m505getCameraDz_R5H8() {
            return this.camera;
        }

        /* renamed from: getCameraBackendId-AKmI2lo, reason: not valid java name */
        public final String m506getCameraBackendIdAKmI2lo() {
            return this.cameraBackendId;
        }

        public final ConcurrentCameraGraphs getConcurrentCameraGraphs$camera_camera2_pipe() {
            return this.concurrentCameraGraphs;
        }

        public final CameraBackendFactory getCustomCameraBackend() {
            return this.customCameraBackend;
        }

        public final List<Request.Listener> getDefaultListeners() {
            return this.defaultListeners;
        }

        public final Map<?, Object> getDefaultParameters() {
            return this.defaultParameters;
        }

        /* renamed from: getDefaultTemplate-fGx8uWA, reason: not valid java name */
        public final int m507getDefaultTemplatefGx8uWA() {
            return this.defaultTemplate;
        }

        public final List<List<CameraStream.Config>> getExclusiveStreamGroups() {
            return this.exclusiveStreamGroups;
        }

        public final Flags getFlags() {
            return this.flags;
        }

        public final List<GraphStateListener> getGraphStateListeners() {
            return this.graphStateListeners;
        }

        public final List<InputStream.Config> getInput() {
            return this.input;
        }

        public final MetadataTransform getMetadataTransform() {
            return this.metadataTransform;
        }

        public final CameraStream.Config getPostviewStream() {
            return this.postviewStream;
        }

        public final Map<?, Object> getRequiredParameters() {
            return this.requiredParameters;
        }

        /* renamed from: getSessionColorSpace-dxVZaPA, reason: not valid java name */
        public final String m508getSessionColorSpacedxVZaPA() {
            return this.sessionColorSpace;
        }

        /* renamed from: getSessionMode-2uNL3no, reason: not valid java name */
        public final int m509getSessionMode2uNL3no() {
            return this.sessionMode;
        }

        public final Map<?, Object> getSessionParameters() {
            return this.sessionParameters;
        }

        /* renamed from: getSessionTemplate-fGx8uWA, reason: not valid java name */
        public final int m510getSessionTemplatefGx8uWA() {
            return this.sessionTemplate;
        }

        public final List<CameraStream.Config> getStreams() {
            return this.streams;
        }

        public int hashCode() {
            int iM550hashCodeimpl = (((CameraId.m550hashCodeimpl(this.camera) * 31) + this.streams.hashCode()) * 31) + this.exclusiveStreamGroups.hashCode();
            List<InputStream.Config> list = this.input;
            int iHashCode = ((iM550hashCodeimpl * 31) + (list == null ? 0 : list.hashCode())) * 31;
            CameraStream.Config config = this.postviewStream;
            int iHashCode2 = (((((((((((((((((iHashCode + (config == null ? 0 : config.hashCode())) * 31) + this.sessionTemplate) * 31) + this.sessionParameters.hashCode()) * 31) + this.sessionMode) * 31) + this.defaultTemplate) * 31) + this.defaultParameters.hashCode()) * 31) + this.defaultListeners.hashCode()) * 31) + this.graphStateListeners.hashCode()) * 31) + this.requiredParameters.hashCode()) * 31;
            String str = this.cameraBackendId;
            int iM386hashCodeimpl = (iHashCode2 + (str == null ? 0 : CameraBackendId.m386hashCodeimpl(str))) * 31;
            CameraBackendFactory cameraBackendFactory = this.customCameraBackend;
            int iHashCode3 = (((((iM386hashCodeimpl + (cameraBackendFactory == null ? 0 : cameraBackendFactory.hashCode())) * 31) + this.metadataTransform.hashCode()) * 31) + this.flags.hashCode()) * 31;
            String str2 = this.sessionColorSpace;
            return iHashCode3 + (str2 != null ? CameraColorSpace.m395hashCodeimpl(str2) : 0);
        }

        public final void setConcurrentCameraGraphs$camera_camera2_pipe(ConcurrentCameraGraphs concurrentCameraGraphs) {
            this.concurrentCameraGraphs = concurrentCameraGraphs;
        }

        public String toString() {
            String str = this.cameraBackendId;
            int i2 = this.defaultTemplate;
            int i3 = this.sessionMode;
            String strM893toStringimpl = RequestTemplate.m893toStringimpl(this.sessionTemplate);
            String strM532toStringimpl = OperatingMode.m532toStringimpl(i3);
            String strM893toStringimpl2 = RequestTemplate.m893toStringimpl(i2);
            String strM387toStringimpl = str == null ? "null" : CameraBackendId.m387toStringimpl(str);
            CameraBackendFactory cameraBackendFactory = this.customCameraBackend;
            MetadataTransform metadataTransform = this.metadataTransform;
            Flags flags = this.flags;
            String str2 = this.sessionColorSpace;
            String strM397toStringimpl = str2 != null ? CameraColorSpace.m397toStringimpl(str2) : "null";
            String str3 = this.camera;
            Map<?, Object> map = this.requiredParameters;
            List<GraphStateListener> list = this.graphStateListeners;
            List<Request.Listener> list2 = this.defaultListeners;
            Map<?, Object> map2 = this.defaultParameters;
            Map<?, Object> map3 = this.sessionParameters;
            CameraStream.Config config = this.postviewStream;
            List<InputStream.Config> list3 = this.input;
            String str4 = strM397toStringimpl;
            List<List<CameraStream.Config>> list4 = this.exclusiveStreamGroups;
            return "Config(camera=" + CameraId.m552toStringimpl(str3) + ", streams=" + this.streams + ", exclusiveStreamGroups=" + list4 + ", input=" + list3 + ", postviewStream=" + config + ", sessionTemplate=" + strM893toStringimpl + ", sessionParameters=" + map3 + ", sessionMode=" + strM532toStringimpl + ", defaultTemplate=" + strM893toStringimpl2 + ", defaultParameters=" + map2 + ", defaultListeners=" + list2 + ", graphStateListeners=" + list + ", requiredParameters=" + map + ", cameraBackendId=" + strM387toStringimpl + ", customCameraBackend=" + cameraBackendFactory + ", metadataTransform=" + metadataTransform + ", flags=" + flags + ", sessionColorSpace=" + str4 + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Config(String str, List<CameraStream.Config> list, List<? extends List<CameraStream.Config>> list2, List<InputStream.Config> list3, CameraStream.Config config, int i2, Map<?, ? extends Object> map, int i3, int i4, Map<?, ? extends Object> map2, List<? extends Request.Listener> list4, List<? extends GraphStateListener> list5, Map<?, ? extends Object> map3, String str2, CameraBackendFactory cameraBackendFactory, MetadataTransform metadataTransform, Flags flags, String str3) {
            x.f(str, "camera");
            x.f(list, "streams");
            x.f(list2, "exclusiveStreamGroups");
            x.f(map, "sessionParameters");
            x.f(map2, "defaultParameters");
            x.f(list4, "defaultListeners");
            x.f(list5, "graphStateListeners");
            x.f(map3, "requiredParameters");
            x.f(metadataTransform, "metadataTransform");
            x.f(flags, "flags");
            this.camera = str;
            this.streams = list;
            this.exclusiveStreamGroups = list2;
            this.input = list3;
            this.postviewStream = config;
            this.sessionTemplate = i2;
            this.sessionParameters = map;
            this.sessionMode = i3;
            this.defaultTemplate = i4;
            this.defaultParameters = map2;
            this.defaultListeners = list4;
            this.graphStateListeners = list5;
            this.requiredParameters = map3;
            this.cameraBackendId = str2;
            this.customCameraBackend = cameraBackendFactory;
            this.metadataTransform = metadataTransform;
            this.flags = flags;
            this.sessionColorSpace = str3;
            if (str2 != null && cameraBackendFactory != null) {
                throw new IllegalStateException("Setting both cameraBackendId and customCameraBackend is not supported.");
            }
        }

        public /* synthetic */ Config(String str, List list, List list2, List list3, CameraStream.Config config, int i2, Map map, int i3, int i4, Map map2, List list4, List list5, Map map3, String str2, CameraBackendFactory cameraBackendFactory, MetadataTransform metadataTransform, Flags flags, String str3, o oVar) {
            this(str, list, list2, list3, config, i2, map, i3, i4, map2, list4, list5, map3, str2, cameraBackendFactory, metadataTransform, flags, str3);
        }
    }
}
