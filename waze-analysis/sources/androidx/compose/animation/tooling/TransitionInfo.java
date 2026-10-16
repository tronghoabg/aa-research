package androidx.compose.animation.tooling;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TransitionInfo {
    private final long endTimeMillis;
    private final String label;
    private final String specType;
    private final long startTimeMillis;
    private final Map<Long, Object> values;

    public TransitionInfo(String str, String str2, long j2, long j3, Map<Long, ? extends Object> map) {
        this.label = str;
        this.specType = str2;
        this.startTimeMillis = j2;
        this.endTimeMillis = j3;
        this.values = map;
    }

    public final long getEndTimeMillis() {
        return this.endTimeMillis;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getSpecType() {
        return this.specType;
    }

    public final long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    public final Map<Long, Object> getValues() {
        return this.values;
    }
}
