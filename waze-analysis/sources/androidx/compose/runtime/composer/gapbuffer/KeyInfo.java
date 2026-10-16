package androidx.compose.runtime.composer.gapbuffer;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class KeyInfo {
    public static final int $stable = 8;
    private final int index;
    private final int key;
    private final int location;
    private final int nodes;
    private final Object objectKey;

    public KeyInfo(int i2, Object obj, int i3, int i4, int i5) {
        this.key = i2;
        this.objectKey = obj;
        this.location = i3;
        this.nodes = i4;
        this.index = i5;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getKey() {
        return this.key;
    }

    public final int getLocation() {
        return this.location;
    }

    public final int getNodes() {
        return this.nodes;
    }

    public final Object getObjectKey() {
        return this.objectKey;
    }
}
