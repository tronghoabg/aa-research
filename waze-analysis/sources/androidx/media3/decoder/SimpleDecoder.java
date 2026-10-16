package androidx.media3.decoder;

import androidx.media3.common.C;
import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.DecoderOutputBuffer;
import com.google.d.b.an;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends DecoderOutputBuffer, E extends DecoderException> implements Decoder<I, O, E> {
    private int availableInputBufferCount;
    private final I[] availableInputBuffers;
    private int availableOutputBufferCount;
    private final O[] availableOutputBuffers;
    private final Thread decodeThread;
    private I dequeuedInputBuffer;
    private E exception;
    private Executor executor;
    private boolean flushed;
    private Runnable onInputBufferAvailableRunnable;
    private Runnable onOutputBufferAvailableRunnable;
    private boolean released;
    private int skippedOutputBufferCount;
    private final Object lock = new Object();
    private long outputStartTimeUs = C.TIME_UNSET;
    private final ArrayDeque<I> queuedInputBuffers = new ArrayDeque<>();
    private final ArrayDeque<O> queuedOutputBuffers = new ArrayDeque<>();

    protected SimpleDecoder(I[] iArr, O[] oArr) {
        this.availableInputBuffers = iArr;
        this.availableInputBufferCount = iArr.length;
        for (int i2 = 0; i2 < this.availableInputBufferCount; i2++) {
            ((I[]) this.availableInputBuffers)[i2] = createInputBuffer();
        }
        this.availableOutputBuffers = oArr;
        this.availableOutputBufferCount = oArr.length;
        for (int i3 = 0; i3 < this.availableOutputBufferCount; i3++) {
            ((O[]) this.availableOutputBuffers)[i3] = createOutputBuffer();
        }
        Thread thread = new Thread(this, "ExoPlayer:SimpleDecoder") { // from class: androidx.media3.decoder.SimpleDecoder.1
            final /* synthetic */ SimpleDecoder this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                this.this$0.run();
            }
        };
        this.decodeThread = thread;
        thread.start();
    }

    private boolean canDecodeBuffer() {
        return !this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0;
    }

    private boolean decode() {
        E e2;
        synchronized (this.lock) {
            while (!this.released && !canDecodeBuffer()) {
                this.lock.wait();
            }
            if (this.released) {
                return false;
            }
            I iRemoveFirst = this.queuedInputBuffers.removeFirst();
            O[] oArr = this.availableOutputBuffers;
            int i2 = this.availableOutputBufferCount - 1;
            this.availableOutputBufferCount = i2;
            O o = oArr[i2];
            boolean z = this.flushed;
            this.flushed = false;
            if (iRemoveFirst.isEndOfStream()) {
                o.addFlag(4);
            } else {
                o.timeUs = iRemoveFirst.timeUs;
                if (iRemoveFirst.isFirstSample()) {
                    o.addFlag(134217728);
                }
                if (!isAtLeastOutputStartTimeUs(iRemoveFirst.timeUs)) {
                    o.shouldBeSkipped = true;
                }
                try {
                    e2 = (E) decode(iRemoveFirst, o, z);
                } catch (OutOfMemoryError e3) {
                    e2 = (E) createUnexpectedDecodeException(e3);
                } catch (RuntimeException e4) {
                    e2 = (E) createUnexpectedDecodeException(e4);
                }
                if (e2 != null) {
                    synchronized (this.lock) {
                        this.exception = e2;
                    }
                    return false;
                }
            }
            synchronized (this.lock) {
                if (this.flushed) {
                    o.release();
                } else {
                    boolean z2 = o.shouldBeSkipped;
                    int i3 = this.skippedOutputBufferCount;
                    if (z2) {
                        this.skippedOutputBufferCount = i3 + 1;
                        o.release();
                    } else {
                        o.skippedOutputBufferCount = i3;
                        this.skippedOutputBufferCount = 0;
                        this.queuedOutputBuffers.addLast(o);
                        Runnable runnable = this.onOutputBufferAvailableRunnable;
                        Executor executor = this.executor;
                        if (runnable != null && executor != null) {
                            executor.execute(runnable);
                        }
                    }
                }
                releaseInputBufferInternal(iRemoveFirst, true);
            }
            return true;
        }
    }

    private void maybeNotifyDecodeLoop() {
        if (canDecodeBuffer()) {
            this.lock.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends androidx.media3.decoder.DecoderException */
    private void maybeThrowException() throws E {
        E e2 = this.exception;
        if (e2 != null) {
            throw e2;
        }
    }

    private void releaseInputBufferInternal(I i2, boolean z) {
        i2.clear();
        int i3 = this.availableInputBufferCount;
        this.availableInputBufferCount = i3 + 1;
        this.availableInputBuffers[i3] = i2;
        Runnable runnable = this.onInputBufferAvailableRunnable;
        Executor executor = this.executor;
        if (!z || runnable == null || executor == null) {
            return;
        }
        executor.execute(runnable);
    }

    private void releaseOutputBufferInternal(O o) {
        o.clear();
        int i2 = this.availableOutputBufferCount;
        this.availableOutputBufferCount = i2 + 1;
        this.availableOutputBuffers[i2] = o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void run() {
        do {
            try {
            } catch (InterruptedException e2) {
                throw new IllegalStateException(e2);
            }
        } while (decode());
    }

    protected abstract I createInputBuffer();

    protected abstract O createOutputBuffer();

    protected abstract E createUnexpectedDecodeException(Throwable th);

    protected abstract E decode(I i2, O o, boolean z);

    @Override // androidx.media3.decoder.Decoder
    public final I dequeueInputBuffer() {
        I i2;
        synchronized (this.lock) {
            maybeThrowException();
            an.u(this.dequeuedInputBuffer == null);
            int i3 = this.availableInputBufferCount;
            if (i3 == 0) {
                i2 = null;
            } else {
                I[] iArr = this.availableInputBuffers;
                int i4 = i3 - 1;
                this.availableInputBufferCount = i4;
                i2 = iArr[i4];
            }
            this.dequeuedInputBuffer = i2;
        }
        return i2;
    }

    @Override // androidx.media3.decoder.Decoder
    public final O dequeueOutputBuffer() {
        synchronized (this.lock) {
            maybeThrowException();
            if (this.queuedOutputBuffers.isEmpty()) {
                return null;
            }
            return this.queuedOutputBuffers.removeFirst();
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void flush() {
        synchronized (this.lock) {
            this.flushed = true;
            this.skippedOutputBufferCount = 0;
            I i2 = this.dequeuedInputBuffer;
            if (i2 != null) {
                releaseInputBufferInternal(i2, false);
                this.dequeuedInputBuffer = null;
            }
            while (!this.queuedInputBuffers.isEmpty()) {
                releaseInputBufferInternal(this.queuedInputBuffers.removeFirst(), false);
            }
            while (!this.queuedOutputBuffers.isEmpty()) {
                this.queuedOutputBuffers.removeFirst().release();
            }
        }
    }

    protected final boolean isAtLeastOutputStartTimeUs(long j2) {
        boolean z;
        synchronized (this.lock) {
            long j3 = this.outputStartTimeUs;
            z = true;
            if (j3 != C.TIME_UNSET && j2 < j3) {
                z = false;
            }
        }
        return z;
    }

    @Override // androidx.media3.decoder.Decoder
    public final void queueInputBuffer(I i2) {
        synchronized (this.lock) {
            maybeThrowException();
            an.l(i2 == this.dequeuedInputBuffer);
            this.queuedInputBuffers.addLast(i2);
            maybeNotifyDecodeLoop();
            this.dequeuedInputBuffer = null;
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public void release() throws InterruptedException {
        synchronized (this.lock) {
            this.released = true;
            this.lock.notify();
        }
        try {
            this.decodeThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void releaseOutputBuffer(O o) {
        synchronized (this.lock) {
            releaseOutputBufferInternal(o);
            maybeNotifyDecodeLoop();
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void setCallback(final Decoder.Callback callback, Executor executor) {
        Runnable runnable;
        synchronized (this.lock) {
            this.executor = executor;
            Runnable runnable2 = null;
            if (callback != null) {
                Objects.requireNonNull(callback);
                runnable = new Runnable() { // from class: androidx.media3.decoder.SimpleDecoder$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        callback.onOutputBufferAvailable();
                    }
                };
            } else {
                runnable = null;
            }
            this.onOutputBufferAvailableRunnable = runnable;
            if (callback != null) {
                Objects.requireNonNull(callback);
                runnable2 = new Runnable() { // from class: androidx.media3.decoder.SimpleDecoder$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        callback.onInputBufferAvailable();
                    }
                };
            }
            this.onInputBufferAvailableRunnable = runnable2;
        }
    }

    protected final void setInitialInputBufferSize(int i2) {
        an.u(this.availableInputBufferCount == this.availableInputBuffers.length);
        for (I i3 : this.availableInputBuffers) {
            i3.ensureSpaceForWrite(i2);
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void setOutputStartTimeUs(long j2) {
        synchronized (this.lock) {
            boolean z = true;
            if (this.availableInputBufferCount != this.availableInputBuffers.length && !this.flushed) {
                z = false;
            }
            an.u(z);
            this.outputStartTimeUs = j2;
        }
    }
}
