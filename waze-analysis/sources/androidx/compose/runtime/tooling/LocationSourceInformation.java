package androidx.compose.runtime.tooling;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LocationSourceInformation {
    public static final int $stable = 0;
    private final boolean isRepeatable;
    private final int length;
    private final int lineNumber;
    private final int offset;

    public LocationSourceInformation(int i2, int i3, int i4, boolean z) {
        this.lineNumber = i2;
        this.offset = i3;
        this.length = i4;
        this.isRepeatable = z;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getLineNumber() {
        return this.lineNumber;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final boolean isRepeatable() {
        return this.isRepeatable;
    }
}
