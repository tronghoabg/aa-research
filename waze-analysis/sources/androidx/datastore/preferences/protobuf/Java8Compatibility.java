package androidx.datastore.preferences.protobuf;

import java.nio.Buffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class Java8Compatibility {
    private Java8Compatibility() {
    }

    static void clear(Buffer buffer) {
        buffer.clear();
    }

    static void flip(Buffer buffer) {
        buffer.flip();
    }

    static void limit(Buffer buffer, int i2) {
        buffer.limit(i2);
    }

    static void mark(Buffer buffer) {
        buffer.mark();
    }

    static void position(Buffer buffer, int i2) {
        buffer.position(i2);
    }

    static void reset(Buffer buffer) {
        buffer.reset();
    }
}
