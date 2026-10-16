package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.JoinedKey;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class KeyInfo {
    public static final int $stable = 8;
    private final long handle;
    private final int index;
    private final int key;
    private final int nodes;
    private final Object objectKey;

    public KeyInfo(int i2, Object obj, long j2, int i3, int i4) {
        this.key = i2;
        this.objectKey = obj;
        this.handle = j2;
        this.nodes = i3;
        this.index = i4;
    }

    public final int getAddress() {
        return GroupHandleKt.getGroup(getHandle());
    }

    public final long getHandle() {
        return this.handle;
    }

    public final int getIndex() {
        return this.index;
    }

    public final Object getJoinedKey() {
        Object obj = this.objectKey;
        int i2 = this.key;
        return obj != null ? new JoinedKey(Integer.valueOf(i2), obj) : Integer.valueOf(i2);
    }

    public final int getKey() {
        return this.key;
    }

    public final int getNodes() {
        return this.nodes;
    }

    public final Object getObjectKey() {
        return this.objectKey;
    }
}
