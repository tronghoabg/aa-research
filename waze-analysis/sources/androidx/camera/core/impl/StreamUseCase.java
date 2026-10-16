package androidx.camera.core.impl;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class StreamUseCase {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ StreamUseCase[] $VALUES;
    private final long value;
    public static final StreamUseCase DEFAULT = new StreamUseCase("DEFAULT", 0, 0);
    public static final StreamUseCase PREVIEW = new StreamUseCase("PREVIEW", 1, 1);
    public static final StreamUseCase VIDEO_RECORD = new StreamUseCase("VIDEO_RECORD", 2, 3);
    public static final StreamUseCase STILL_CAPTURE = new StreamUseCase("STILL_CAPTURE", 3, 2);
    public static final StreamUseCase VIDEO_CALL = new StreamUseCase("VIDEO_CALL", 4, 5);
    public static final StreamUseCase PREVIEW_VIDEO_STILL = new StreamUseCase("PREVIEW_VIDEO_STILL", 5, 4);
    public static final StreamUseCase CROPPED_RAW = new StreamUseCase("CROPPED_RAW", 6, 6);

    private static final /* synthetic */ StreamUseCase[] $values() {
        return new StreamUseCase[]{DEFAULT, PREVIEW, VIDEO_RECORD, STILL_CAPTURE, VIDEO_CALL, PREVIEW_VIDEO_STILL, CROPPED_RAW};
    }

    static {
        StreamUseCase[] streamUseCaseArr$values = $values();
        $VALUES = streamUseCaseArr$values;
        $ENTRIES = b.a(streamUseCaseArr$values);
    }

    private StreamUseCase(String str, int i2, int i3) {
        this.value = i3;
    }

    public static a<StreamUseCase> getEntries() {
        return $ENTRIES;
    }

    public static StreamUseCase valueOf(String str) {
        return (StreamUseCase) Enum.valueOf(StreamUseCase.class, str);
    }

    public static StreamUseCase[] values() {
        return (StreamUseCase[]) $VALUES.clone();
    }

    public final long getValue() {
        return this.value;
    }
}
