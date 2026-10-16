package androidx.camera.core.impl.stabilization;

import h.d.a;
import h.d.b;
import h.g.b.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class VideoStabilization {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VideoStabilization[] $VALUES;
    public static final Companion Companion;
    public static final VideoStabilization UNSPECIFIED = new VideoStabilization("UNSPECIFIED", 0);
    public static final VideoStabilization OFF = new VideoStabilization("OFF", 1);
    public static final VideoStabilization ON = new VideoStabilization("ON", 2);
    public static final VideoStabilization PREVIEW = new VideoStabilization("PREVIEW", 3);

    private static final /* synthetic */ VideoStabilization[] $values() {
        return new VideoStabilization[]{UNSPECIFIED, OFF, ON, PREVIEW};
    }

    static {
        VideoStabilization[] videoStabilizationArr$values = $values();
        $VALUES = videoStabilizationArr$values;
        $ENTRIES = b.a(videoStabilizationArr$values);
        Companion = new Companion(null);
    }

    private VideoStabilization(String str, int i2) {
    }

    public static a<VideoStabilization> getEntries() {
        return $ENTRIES;
    }

    public static VideoStabilization valueOf(String str) {
        return (VideoStabilization) Enum.valueOf(VideoStabilization.class, str);
    }

    public static VideoStabilization[] values() {
        return (VideoStabilization[]) $VALUES.clone();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ VideoStabilization from$camera_core$default(Companion companion, int i2, int i3, int i4, Object obj) {
            if (1 == (i4 & 1)) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = 0;
            }
            return companion.from$camera_core(i2, i3);
        }

        public final VideoStabilization from$camera_core(int i2, int i3) {
            return (i2 == 1 || i3 == 1) ? VideoStabilization.OFF : i2 == 2 ? VideoStabilization.PREVIEW : i3 == 2 ? VideoStabilization.ON : VideoStabilization.UNSPECIFIED;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
