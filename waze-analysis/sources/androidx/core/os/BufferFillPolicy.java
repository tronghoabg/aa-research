package androidx.core.os;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class BufferFillPolicy {
    public static final Companion Companion = new Companion(null);
    public static final BufferFillPolicy DISCARD = new Discard();
    public static final BufferFillPolicy RING_BUFFER = new RingBuffer();
    private final int value;

    /* compiled from: WazeSource */
    final class Discard extends BufferFillPolicy {
        public Discard() {
            super(1, null);
        }
    }

    /* compiled from: WazeSource */
    final class RingBuffer extends BufferFillPolicy {
        public RingBuffer() {
            super(2, null);
        }
    }

    private BufferFillPolicy(int i2) {
        this.value = i2;
    }

    public final int getValue$core() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ BufferFillPolicy(int i2, o oVar) {
        this(i2);
    }
}
