package androidx.compose.runtime.tooling;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposeStackTraceFrame {
    public static final int $stable = 8;
    private final int groupKey;
    private final Integer groupOffset;
    private final SourceInformation sourceInfo;

    public ComposeStackTraceFrame(int i2, SourceInformation sourceInformation, Integer num) {
        this.groupKey = i2;
        this.sourceInfo = sourceInformation;
        this.groupOffset = num;
    }

    public static /* synthetic */ ComposeStackTraceFrame copy$default(ComposeStackTraceFrame composeStackTraceFrame, int i2, SourceInformation sourceInformation, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = composeStackTraceFrame.groupKey;
        }
        if ((i3 & 2) != 0) {
            sourceInformation = composeStackTraceFrame.sourceInfo;
        }
        if ((i3 & 4) != 0) {
            num = composeStackTraceFrame.groupOffset;
        }
        return composeStackTraceFrame.copy(i2, sourceInformation, num);
    }

    public final int component1() {
        return this.groupKey;
    }

    public final SourceInformation component2() {
        return this.sourceInfo;
    }

    public final Integer component3() {
        return this.groupOffset;
    }

    public final ComposeStackTraceFrame copy(int i2, SourceInformation sourceInformation, Integer num) {
        return new ComposeStackTraceFrame(i2, sourceInformation, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposeStackTraceFrame)) {
            return false;
        }
        ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) obj;
        return this.groupKey == composeStackTraceFrame.groupKey && x.n(this.sourceInfo, composeStackTraceFrame.sourceInfo) && x.n(this.groupOffset, composeStackTraceFrame.groupOffset);
    }

    public final int getGroupKey() {
        return this.groupKey;
    }

    public final Integer getGroupOffset() {
        return this.groupOffset;
    }

    public final SourceInformation getSourceInfo() {
        return this.sourceInfo;
    }

    public int hashCode() {
        SourceInformation sourceInformation = this.sourceInfo;
        int iHashCode = sourceInformation == null ? 0 : sourceInformation.hashCode();
        int i2 = this.groupKey;
        Integer num = this.groupOffset;
        return (((i2 * 31) + iHashCode) * 31) + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.groupKey + ", sourceInfo=" + this.sourceInfo + ", groupOffset=" + this.groupOffset + ')';
    }
}
