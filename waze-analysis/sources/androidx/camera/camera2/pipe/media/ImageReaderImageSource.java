package androidx.camera.camera2.pipe.media;

import android.view.Surface;
import androidx.camera.camera2.pipe.MemoryEstimator;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.media.ImageReaderWrapper;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.d.a;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import java.util.Set;
import kotlinx.a.b;
import kotlinx.a.d;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ImageReaderImageSource implements ImageSource {
    public static final int BUFFER_QUEUE_MAX_CAPACITY = 64;
    public static final Companion Companion = new Companion(null);
    public static final byte DEFAULT_PIPELINE_MAX_DEPTH = 10;
    public static final int IMAGE_SOURCE_CAPACITY_MARGIN = 2;
    private final d expectedOutputsListener$delegate;
    private final b imageCount;
    private final d imageListener$delegate;
    private final ImageReaderWrapper imageReader;
    private final int maxImages;
    private final MemoryEstimator memoryEstimator;
    private final d<State> state;
    private final Surface surface;
    private final Long usageFlags;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    final class State {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ACTIVE = new State("ACTIVE", 0);
        public static final State CLOSING = new State("CLOSING", 1);
        public static final State CLOSED = new State("CLOSED", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{ACTIVE, CLOSING, CLOSED};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = h.d.b.a(stateArr$values);
        }

        private State(String str, int i2) {
        }

        public static a<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public ImageReaderImageSource(ImageReaderWrapper imageReaderWrapper, int i2, Long l2, MemoryEstimator memoryEstimator) {
        x.f(imageReaderWrapper, "imageReader");
        x.f(memoryEstimator, "memoryEstimator");
        this.imageReader = imageReaderWrapper;
        this.maxImages = i2;
        this.usageFlags = l2;
        this.memoryEstimator = memoryEstimator;
        this.state = h.e.b.h(State.ACTIVE);
        this.imageCount = h.e.b.f(0);
        this.surface = imageReaderWrapper.getSurface();
        this.imageListener$delegate = h.e.b.h(null);
        this.expectedOutputsListener$delegate = h.e.b.h(null);
        imageReaderWrapper.setOnImageListener(new ImageReaderWrapper.OnImageListener() { // from class: androidx.camera.camera2.pipe.media.ImageReaderImageSource.1
            @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper.OnImageListener
            /* renamed from: onImage-AQuxepk, reason: not valid java name */
            public final void mo1259onImageAQuxepk(int i3, int i4, ImageWrapper imageWrapper) {
                x.f(imageWrapper, "image");
                ImageReaderImageSource.this.m1258onImageAQuxepk(i3, i4, imageWrapper);
            }
        });
        imageReaderWrapper.setOnExpectedOutputsListener(new ImageReaderWrapper.OnExpectedOutputsListener() { // from class: androidx.camera.camera2.pipe.media.ImageReaderImageSource$$ExternalSyntheticLambda3
            @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper.OnExpectedOutputsListener
            public final void onExpectedOutputs(long j2, Set set) {
                ImageReaderImageSource._init_$lambda$0(this.f$0, j2, set);
            }
        });
    }

    static final void _init_$lambda$0(ImageReaderImageSource imageReaderImageSource, long j2, Set set) {
        x.f(set, "outputIds");
        ExpectedOutputsListener expectedOutputsListener = imageReaderImageSource.getExpectedOutputsListener();
        if (expectedOutputsListener != null) {
            expectedOutputsListener.onExpectedOutputs(j2, set);
        }
    }

    private final void flushOrCloseIfEmpty() throws Exception {
        if (this.state.b() == State.CLOSED) {
            return;
        }
        if (this.imageCount.d() != 0) {
            this.imageReader.flush();
        } else if (this.state.e(State.CLOSING, State.CLOSED)) {
            ImageReaderImageSource$$ExternalSyntheticAutoCloseableDispatcher0.m(this.imageReader);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getEstimatedBytes(ImageWrapper imageWrapper) {
        return StreamFormat.Companion.m930bytesPerImage_EMV7EA(imageWrapper.getFormat(), imageWrapper.getWidth(), imageWrapper.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onImage-AQuxepk, reason: not valid java name */
    public final void m1258onImageAQuxepk(int i2, int i3, ImageWrapper imageWrapper) {
        int iE = this.imageCount.e();
        ImageListener imageListener = getImageListener();
        if (imageListener == null) {
            closeAndDecrementImageCount$camera_camera2_pipe(imageWrapper);
            return;
        }
        boolean z = this.state.b() != State.ACTIVE;
        int i4 = this.maxImages;
        boolean zCanAllocate = this.memoryEstimator.canAllocate(getEstimatedBytes(imageWrapper));
        if (iE <= i4 && !z && zCanAllocate) {
            imageListener.mo1209onImage2cgRUCs(i2, i3, imageWrapper.getTimestamp(), new TrackedOutputImage(this, imageWrapper, i2, i3, this.memoryEstimator, null));
            return;
        }
        boolean z2 = z;
        if (zCanAllocate) {
            if (z2) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "Dropping image from " + StreamId.m979toStringimpl(i2) + " at " + imageWrapper.getTimestamp() + " because ImageSource is not active. State: " + this.state.b() + ".");
                }
            } else if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String strM979toStringimpl = StreamId.m979toStringimpl(i2);
                int maxImages$camera_camera2_pipe = getMaxImages$camera_camera2_pipe();
                StringBuilder sb = new StringBuilder("Dropping ");
                sb.append(imageWrapper);
                sb.append(" from ");
                sb.append(strM979toStringimpl);
                sb.append(", ");
                sb.append(iE - 1);
                sb.append(" / ");
                sb.append(maxImages$camera_camera2_pipe);
                sb.append(" acquired.");
                android.util.Log.w(Log.TAG, sb.toString());
            }
        } else if (Log.INSTANCE.getWARN_LOGGABLE()) {
            android.util.Log.w(Log.TAG, "Dropping image from " + StreamId.m979toStringimpl(i2) + " at " + imageWrapper.getTimestamp() + " due to low memory budget. Usage: " + this.memoryEstimator.getUsage().d() + " bytes, requested: " + getEstimatedBytes(imageWrapper) + " bytes.");
        }
        long timestamp = imageWrapper.getTimestamp();
        closeAndDecrementImageCount$camera_camera2_pipe(imageWrapper);
        imageListener.mo1209onImage2cgRUCs(i2, i3, timestamp, null);
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        if (this.state.e(State.ACTIVE, State.CLOSING)) {
            flushOrCloseIfEmpty();
        }
    }

    public final void closeAndDecrementImageCount$camera_camera2_pipe(ImageWrapper imageWrapper) {
        x.f(imageWrapper, "image");
        ImageReaderImageSource$$ExternalSyntheticAutoCloseableDispatcher0.m(imageWrapper);
        this.imageCount.a();
        if (this.state.b() != State.ACTIVE) {
            flushOrCloseIfEmpty();
        }
    }

    @Override // androidx.camera.camera2.pipe.media.ImageSource
    public void discardFreeBuffers() {
        if (this.state.b() != State.CLOSED) {
            this.imageReader.discardFreeBuffers();
        } else if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            android.util.Log.d(Log.TAG, "Calling discardFreeBuffers on " + this + " on closed image source.");
        }
    }

    @Override // androidx.camera.camera2.pipe.media.ImageSource
    public void flush() {
        if (this.state.b() != State.CLOSED) {
            this.imageReader.flush();
        } else if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            android.util.Log.d(Log.TAG, "Calling flush on " + this + " on closed image source.");
        }
    }

    @Override // androidx.camera.camera2.pipe.media.ImageSource
    public ExpectedOutputsListener getExpectedOutputsListener() {
        return (ExpectedOutputsListener) this.expectedOutputsListener$delegate.b();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageSource
    public ImageListener getImageListener() {
        return (ImageListener) this.imageListener$delegate.b();
    }

    public final int getMaxImages$camera_camera2_pipe() {
        return this.maxImages;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageSource
    public Surface getSurface() {
        return this.surface;
    }

    public final Long getUsageFlags$camera_camera2_pipe() {
        return this.usageFlags;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageSource
    public void setExpectedOutputsListener(ExpectedOutputsListener expectedOutputsListener) {
        this.expectedOutputsListener$delegate.d(expectedOutputsListener);
    }

    @Override // androidx.camera.camera2.pipe.media.ImageSource
    public void setImageListener(ImageListener imageListener) {
        this.imageListener$delegate.d(imageListener);
    }

    public String toString() {
        return "ImageSource(" + this.imageReader + ")";
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return x.n(cls, ImageReaderImageSource.class) ? (T) this : (T) this.imageReader.unwrapAs(cls);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final ImageSource create(ImageReaderWrapper imageReaderWrapper, MemoryEstimator memoryEstimator) {
            x.f(imageReaderWrapper, "imageReader");
            x.f(memoryEstimator, "memoryEstimator");
            return new ImageReaderImageSource(imageReaderWrapper, imageReaderWrapper.getCapacity() - 2, null, memoryEstimator, 4, null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }

    public /* synthetic */ ImageReaderImageSource(ImageReaderWrapper imageReaderWrapper, int i2, Long l2, MemoryEstimator memoryEstimator, int i3, o oVar) {
        this(imageReaderWrapper, i2, (i3 & 4) != 0 ? imageReaderWrapper.getUsageFlags() : l2, memoryEstimator);
    }
}
