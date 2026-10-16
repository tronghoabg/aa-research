package androidx.compose.runtime.tooling;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposeStackTrace {
    public static final int $stable = 8;
    private final List<ComposeStackTraceFrame> frames;
    private final boolean hasSourceInformation;

    public ComposeStackTrace(List<ComposeStackTraceFrame> list, boolean z) {
        this.frames = list;
        this.hasSourceInformation = z;
    }

    public final List<ComposeStackTraceFrame> getFrames() {
        return this.frames;
    }

    public final boolean getHasSourceInformation() {
        return this.hasSourceInformation;
    }
}
