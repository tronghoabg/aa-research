package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.d.m.a.bm;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class InputBufferImpl implements InputBuffer {
    private final int mBufferIndex;
    private final ByteBuffer mByteBuffer;
    private final MediaCodec mMediaCodec;
    private final CallbackToFutureAdapter.Completer<Void> mTerminationCompleter;
    private final bm<Void> mTerminationFuture;
    private final AtomicBoolean mTerminated = new AtomicBoolean(false);
    private long mPresentationTimeUs = 0;
    private boolean mIsEndOfStream = false;

    InputBufferImpl(MediaCodec mediaCodec, int i2) {
        Preconditions.checkNotNull(mediaCodec);
        this.mMediaCodec = mediaCodec;
        Preconditions.checkArgumentNonnegative(i2);
        this.mBufferIndex = i2;
        this.mByteBuffer = mediaCodec.getInputBuffer(i2);
        final AtomicReference atomicReference = new AtomicReference();
        this.mTerminationFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.encoder.InputBufferImpl$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return InputBufferImpl.lambda$new$0(atomicReference, completer);
            }
        });
        CallbackToFutureAdapter.Completer<Void> completer = (CallbackToFutureAdapter.Completer) atomicReference.get();
        Preconditions.checkNotNull(completer);
        this.mTerminationCompleter = completer;
    }

    static /* synthetic */ Object lambda$new$0(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        atomicReference.set(completer);
        return "Terminate InputBuffer";
    }

    private void throwIfTerminated() {
        if (this.mTerminated.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public boolean cancel() throws MediaCodec.CryptoException {
        if (this.mTerminated.getAndSet(true)) {
            return false;
        }
        try {
            this.mMediaCodec.queueInputBuffer(this.mBufferIndex, 0, 0, 0L, 0);
            this.mTerminationCompleter.set(null);
        } catch (IllegalStateException e2) {
            this.mTerminationCompleter.setException(e2);
        }
        return true;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public ByteBuffer getByteBuffer() {
        throwIfTerminated();
        return this.mByteBuffer;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public bm<Void> getTerminationFuture() {
        return Futures.nonCancellationPropagating(this.mTerminationFuture);
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public void setEndOfStream(boolean z) {
        throwIfTerminated();
        this.mIsEndOfStream = z;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public void setPresentationTimeUs(long j2) {
        throwIfTerminated();
        Preconditions.checkArgument(j2 >= 0);
        this.mPresentationTimeUs = j2;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public boolean submit() throws MediaCodec.CryptoException {
        if (this.mTerminated.getAndSet(true)) {
            return false;
        }
        try {
            this.mMediaCodec.queueInputBuffer(this.mBufferIndex, this.mByteBuffer.position(), this.mByteBuffer.limit(), this.mPresentationTimeUs, true != this.mIsEndOfStream ? 0 : 4);
            this.mTerminationCompleter.set(null);
            return true;
        } catch (IllegalStateException e2) {
            this.mTerminationCompleter.setException(e2);
            return false;
        }
    }
}
