package androidx.media3.common.video;

import android.graphics.Bitmap;
import android.hardware.DataSpace;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.core.util.HalfKt$$ExternalSyntheticApiModelOutline0;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.video.DefaultHardwareBufferFrame;
import androidx.media3.common.video.FrameWriter;
import androidx.media3.common.video.HardwareBufferPool;
import com.google.d.b.an;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SurfaceHolderFrameWriter implements FrameWriter, SurfaceHolder.Callback {
    private static final int CAPACITY = 2;
    private Format currentFormat;
    private long currentUsageFlags;
    private final HardwareBufferNativeHelpers hardwareBufferNativeHelpers;
    private final HardwareBufferPool hardwareBufferPool;
    private ImageWriter imageWriter;
    private boolean isSurfaceChangeRequested;
    private HardwareBuffer lastQueuedHardwareBuffer;
    private final Listener listener;
    private final Executor listenerExecutor;
    private final Object lock;
    private Surface surface;
    private SurfaceHolder surfaceHolder;
    private final Executor surfaceHolderExecutor;
    private Runnable wakeupListener;

    /* compiled from: WazeSource */
    final class InternalImage {
        final Image image;
        final ImageWriter imageWriter;
        final boolean needsCopy;

        InternalImage(Image image, ImageWriter imageWriter, boolean z) {
            this.image = image;
            this.imageWriter = imageWriter;
            this.needsCopy = z;
        }
    }

    /* compiled from: WazeSource */
    public interface Listener {
        void onEnded();

        void onError(VideoFrameProcessingException videoFrameProcessingException);

        void onFrameAboutToBeRendered(long j2, long j3, Format format);
    }

    private SurfaceHolderFrameWriter(SurfaceHolder surfaceHolder, Executor executor, Listener listener, Executor executor2, HardwareBufferNativeHelpers hardwareBufferNativeHelpers) {
        if (Build.VERSION.SDK_INT < 33) {
            an.u(hardwareBufferNativeHelpers != null);
        }
        this.lock = new Object();
        this.surfaceHolder = surfaceHolder;
        this.surfaceHolderExecutor = executor;
        this.listener = listener;
        this.listenerExecutor = executor2;
        this.hardwareBufferNativeHelpers = hardwareBufferNativeHelpers;
        this.hardwareBufferPool = new HardwareBufferPool(2);
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this);
        }
    }

    private static int colorRangeToDataSpaceRange(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? 0 : 268435456;
        }
        return 134217728;
    }

    private static int colorSpaceToDataSpaceStandard(int i2) {
        if (i2 == 1) {
            return 65536;
        }
        if (i2 != 2) {
            return i2 != 6 ? 0 : 393216;
        }
        return 131072;
    }

    private static int colorTransferToDataSpaceTransfer(int i2) {
        if (i2 == 1) {
            return 4194304;
        }
        if (i2 == 2) {
            return 8388608;
        }
        if (i2 == 3) {
            return 12582912;
        }
        if (i2 != 6) {
            return i2 != 7 ? i2 != 10 ? 0 : 16777216 : GroupFlagsKt.HasAuxSlotFlag;
        }
        return 29360128;
    }

    public static SurfaceHolderFrameWriter create(SurfaceHolder surfaceHolder, Executor executor, Listener listener, Executor executor2) {
        return new SurfaceHolderFrameWriter(surfaceHolder, executor, listener, executor2, null);
    }

    private InternalImage dequeueInternalImage(boolean z) {
        ImageWriter imageWriter = this.imageWriter;
        an.B(imageWriter);
        Image imageDequeueInputImage = imageWriter.dequeueInputImage();
        ImageWriter imageWriter2 = this.imageWriter;
        an.B(imageWriter2);
        return new InternalImage(imageDequeueInputImage, imageWriter2, z);
    }

    private static Bitmap.Config getBitmapConfig(int i2) {
        boolean z = true;
        if (i2 != 43) {
            if (i2 == 1) {
                i2 = 1;
            } else {
                z = false;
            }
        }
        an.l(z);
        return (i2 != 43 || Build.VERSION.SDK_INT < 33) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_1010102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dequeueInputFrame$1(IllegalStateException illegalStateException) {
        this.listener.onError(new VideoFrameProcessingException(illegalStateException));
    }

    static /* synthetic */ boolean lambda$getInfo$0(Format format, long j2) {
        ColorInfo colorInfo = format.colorInfo;
        if (colorInfo != null) {
            return (!ColorInfo.isTransferHdr(colorInfo) || Build.VERSION.SDK_INT >= 33) && format.width > 0 && format.height > 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queueInputFrame$0(IOException iOException) {
        this.listener.onError(new VideoFrameProcessingException(iOException));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queueInputFrame$1() {
        this.listener.onError(new VideoFrameProcessingException("Failed to copy HardwareBuffer via JNI."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queueInputFrame$2(IllegalStateException illegalStateException) {
        this.listener.onError(new VideoFrameProcessingException(illegalStateException));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queueInputFrame$3(DefaultHardwareBufferFrame defaultHardwareBufferFrame, long j2) {
        this.listener.onFrameAboutToBeRendered(defaultHardwareBufferFrame.getContentTimeUs(), j2, defaultHardwareBufferFrame.getFormat());
    }

    private void maybeRestoreBackupFrame() {
        HardwareBuffer hardwareBuffer;
        ImageWriter imageWriter = this.imageWriter;
        if (imageWriter == null || (hardwareBuffer = this.lastQueuedHardwareBuffer) == null || hardwareBuffer.isClosed()) {
            return;
        }
        Image imageDequeueInputImage = imageWriter.dequeueInputImage();
        if (imageDequeueInputImage.getWidth() != hardwareBuffer.getWidth() || imageDequeueInputImage.getHeight() != hardwareBuffer.getHeight() || imageDequeueInputImage.getFormat() != hardwareBuffer.getFormat()) {
            imageDequeueInputImage.close();
            return;
        }
        HardwareBufferNativeHelpers hardwareBufferNativeHelpers = this.hardwareBufferNativeHelpers;
        if (hardwareBufferNativeHelpers != null) {
            HardwareBuffer hardwareBuffer2 = imageDequeueInputImage.getHardwareBuffer();
            an.B(hardwareBuffer2);
            an.u(hardwareBufferNativeHelpers.nativeCopyHardwareBufferToHardwareBuffer(hardwareBuffer, HalfKt$$ExternalSyntheticApiModelOutline0.m11754m((Object) hardwareBuffer2)));
        } else {
            Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
            an.B(bitmapWrapHardwareBuffer);
            Bitmap bitmapCopy = bitmapWrapHardwareBuffer.copy(getBitmapConfig(hardwareBuffer.getFormat()), false);
            if (bitmapCopy != null) {
                ByteBuffer buffer = imageDequeueInputImage.getPlanes()[0].getBuffer();
                buffer.rewind();
                bitmapCopy.copyPixelsToBuffer(buffer);
            }
        }
        imageWriter.queueInputImage(imageDequeueInputImage);
    }

    private void releaseFrameResources(DefaultHardwareBufferFrame defaultHardwareBufferFrame) {
        defaultHardwareBufferFrame.getHardwareBuffer().close();
        InternalImage internalImage = (InternalImage) defaultHardwareBufferFrame.getInternalImage();
        an.B(internalImage);
        internalImage.image.close();
    }

    @Override // androidx.media3.common.video.FrameWriter, java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            HardwareBuffer hardwareBuffer = this.lastQueuedHardwareBuffer;
            if (hardwareBuffer != null) {
                hardwareBuffer.close();
                this.lastQueuedHardwareBuffer = null;
            }
            ImageWriter imageWriter = this.imageWriter;
            if (imageWriter != null) {
                imageWriter.close();
                this.imageWriter = null;
            }
            SurfaceHolder surfaceHolder = this.surfaceHolder;
            if (surfaceHolder != null) {
                surfaceHolder.removeCallback(this);
                this.surfaceHolder = null;
            }
        }
    }

    @Override // androidx.media3.common.video.FrameWriter
    public void configure(Format format, long j2) {
        an.l(format.colorInfo != null);
        an.l(format.width > 0);
        an.l(format.height > 0);
        synchronized (this.lock) {
            if (format.equals(this.currentFormat) && j2 == this.currentUsageFlags) {
                return;
            }
            this.currentFormat = format;
            this.currentUsageFlags = j2;
            HardwareBuffer hardwareBuffer = this.lastQueuedHardwareBuffer;
            if (hardwareBuffer != null) {
                hardwareBuffer.close();
                this.lastQueuedHardwareBuffer = null;
            }
            ImageWriter imageWriter = this.imageWriter;
            if (imageWriter != null) {
                imageWriter.close();
                this.imageWriter = null;
            }
            final SurfaceHolder surfaceHolder = this.surfaceHolder;
            if (surfaceHolder == null) {
                return;
            }
            this.isSurfaceChangeRequested = true;
            this.surfaceHolderExecutor.execute(new Runnable() { // from class: androidx.media3.common.video.SurfaceHolderFrameWriter$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    surfaceHolder.setFixedSize(1, 1);
                }
            });
        }
    }

    @Override // androidx.media3.common.video.FrameWriter
    public AsyncFrame dequeueInputFrame(final Executor executor, final Runnable runnable) {
        synchronized (this.lock) {
            Format format = this.currentFormat;
            long j2 = this.currentUsageFlags;
            an.v(format != null, "configure() must be called before dequeueInputFrame()");
            if (this.imageWriter == null || this.isSurfaceChangeRequested) {
                this.wakeupListener = new Runnable() { // from class: androidx.media3.common.video.SurfaceHolderFrameWriter$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        executor.execute(runnable);
                    }
                };
                return null;
            }
            try {
                if (Build.VERSION.SDK_INT < 33 && j2 != 0 && j2 != 48) {
                    an.u(this.hardwareBufferNativeHelpers != null);
                    HardwareBufferPool.HardwareBufferWithFence hardwareBufferWithFence = this.hardwareBufferPool.get(format, j2 | 3, new Runnable() { // from class: androidx.media3.common.video.SurfaceHolderFrameWriter$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            executor.execute(runnable);
                        }
                    });
                    if (hardwareBufferWithFence == null) {
                        return null;
                    }
                    InternalImage internalImageDequeueInternalImage = dequeueInternalImage(true);
                    DefaultHardwareBufferFrame.Builder builder = new DefaultHardwareBufferFrame.Builder(hardwareBufferWithFence.hardwareBuffer);
                    builder.setInternalImage(internalImageDequeueInternalImage);
                    builder.setFormat(format);
                    return new AsyncFrame(builder.build(), hardwareBufferWithFence.acquireFence);
                }
                InternalImage internalImageDequeueInternalImage2 = dequeueInternalImage(false);
                HardwareBuffer hardwareBuffer = internalImageDequeueInternalImage2.image.getHardwareBuffer();
                an.B(hardwareBuffer);
                DefaultHardwareBufferFrame.Builder builder2 = new DefaultHardwareBufferFrame.Builder(HalfKt$$ExternalSyntheticApiModelOutline0.m11754m((Object) hardwareBuffer));
                builder2.setInternalImage(internalImageDequeueInternalImage2);
                builder2.setFormat(format);
                return new AsyncFrame(builder2.build(), null);
            } catch (IllegalStateException e2) {
                this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.common.video.SurfaceHolderFrameWriter$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$dequeueInputFrame$1(e2);
                    }
                });
                return null;
            }
        }
    }

    @Override // androidx.media3.common.video.FrameWriter
    public FrameWriter.Info getInfo() {
        return new FrameWriter.Info() { // from class: androidx.media3.common.video.SurfaceHolderFrameWriter$$ExternalSyntheticLambda10
            @Override // androidx.media3.common.video.FrameWriter.Info
            public final boolean isSupported(Format format, long j2) {
                return SurfaceHolderFrameWriter.lambda$getInfo$0(format, j2);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[Catch: all -> 0x00ee, TryCatch #4 {, blocks: (B:5:0x0019, B:8:0x001f, B:11:0x0028, B:12:0x0038, B:14:0x003a, B:16:0x003e, B:17:0x0041, B:19:0x0043, B:21:0x0048, B:25:0x004f, B:29:0x0076, B:30:0x0079, B:33:0x0084, B:42:0x0099, B:44:0x009d, B:45:0x00a2, B:47:0x00c2, B:49:0x00cc, B:51:0x00d0, B:55:0x00e2, B:54:0x00d5, B:40:0x0091, B:39:0x008e, B:41:0x0092, B:26:0x005d, B:28:0x0069, B:32:0x007b, B:36:0x0089), top: B:68:0x0019, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[Catch: all -> 0x00ee, TryCatch #4 {, blocks: (B:5:0x0019, B:8:0x001f, B:11:0x0028, B:12:0x0038, B:14:0x003a, B:16:0x003e, B:17:0x0041, B:19:0x0043, B:21:0x0048, B:25:0x004f, B:29:0x0076, B:30:0x0079, B:33:0x0084, B:42:0x0099, B:44:0x009d, B:45:0x00a2, B:47:0x00c2, B:49:0x00cc, B:51:0x00d0, B:55:0x00e2, B:54:0x00d5, B:40:0x0091, B:39:0x008e, B:41:0x0092, B:26:0x005d, B:28:0x0069, B:32:0x007b, B:36:0x0089), top: B:68:0x0019, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[Catch: all -> 0x00ee, TryCatch #4 {, blocks: (B:5:0x0019, B:8:0x001f, B:11:0x0028, B:12:0x0038, B:14:0x003a, B:16:0x003e, B:17:0x0041, B:19:0x0043, B:21:0x0048, B:25:0x004f, B:29:0x0076, B:30:0x0079, B:33:0x0084, B:42:0x0099, B:44:0x009d, B:45:0x00a2, B:47:0x00c2, B:49:0x00cc, B:51:0x00d0, B:55:0x00e2, B:54:0x00d5, B:40:0x0091, B:39:0x008e, B:41:0x0092, B:26:0x005d, B:28:0x0069, B:32:0x007b, B:36:0x0089), top: B:68:0x0019, inners: #0, #1, #2, #3 }] */
    @Override // androidx.media3.common.video.FrameWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void queueInputFrame(androidx.media3.common.video.Frame r9, androidx.media3.common.video.SyncFenceWrapper r10) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.video.SurfaceHolderFrameWriter.queueInputFrame(androidx.media3.common.video.Frame, androidx.media3.common.video.SyncFenceWrapper):void");
    }

    public void setSurfaceHolder(final SurfaceHolder surfaceHolder) {
        synchronized (this.lock) {
            SurfaceHolder surfaceHolder2 = this.surfaceHolder;
            if (surfaceHolder2 != null) {
                surfaceHolder2.removeCallback(this);
            }
            this.surfaceHolder = surfaceHolder;
            HardwareBuffer hardwareBuffer = this.lastQueuedHardwareBuffer;
            if (hardwareBuffer != null) {
                hardwareBuffer.close();
                this.lastQueuedHardwareBuffer = null;
            }
            ImageWriter imageWriter = this.imageWriter;
            if (imageWriter != null) {
                imageWriter.close();
                this.imageWriter = null;
            }
            if (surfaceHolder != null) {
                surfaceHolder.addCallback(this);
                if (this.currentFormat != null) {
                    this.isSurfaceChangeRequested = true;
                    this.surfaceHolderExecutor.execute(new Runnable() { // from class: androidx.media3.common.video.SurfaceHolderFrameWriter$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            surfaceHolder.setFixedSize(1, 1);
                        }
                    });
                }
            }
        }
    }

    @Override // androidx.media3.common.video.FrameWriter
    public void signalEndOfStream() {
        final Listener listener = this.listener;
        Objects.requireNonNull(listener);
        this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.common.video.SurfaceHolderFrameWriter$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                listener.onEnded();
            }
        });
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        synchronized (this.lock) {
            if (surfaceHolder != this.surfaceHolder) {
                return;
            }
            Format format = this.currentFormat;
            if (format == null) {
                return;
            }
            int i5 = format.pixelFormat;
            if (i5 == -1) {
                i5 = true != ColorInfo.isTransferHdr(format.colorInfo) ? 1 : 43;
            }
            int i6 = format.width;
            if (i3 == i6 && i4 == format.height && i2 == i5) {
                ImageWriter imageWriter = this.imageWriter;
                if (imageWriter != null) {
                    if (surfaceHolder.getSurface().equals(this.surface)) {
                        return;
                    } else {
                        imageWriter.close();
                    }
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    ImageWriter.Builder hardwareBufferFormat = new ImageWriter.Builder(surfaceHolder.getSurface()).setMaxImages(2).setUsage(this.currentUsageFlags | 51).setHardwareBufferFormat(i5);
                    ColorInfo colorInfo = format.colorInfo;
                    an.B(colorInfo);
                    int iColorSpaceToDataSpaceStandard = colorSpaceToDataSpaceStandard(colorInfo.colorSpace);
                    ColorInfo colorInfo2 = format.colorInfo;
                    this.imageWriter = hardwareBufferFormat.setDataSpace(DataSpace.pack(iColorSpaceToDataSpaceStandard, colorTransferToDataSpaceTransfer(colorInfo2.colorTransfer), colorRangeToDataSpaceRange(colorInfo2.colorRange))).build();
                } else {
                    this.imageWriter = ImageWriter.newInstance(surfaceHolder.getSurface(), 2);
                }
                this.surface = surfaceHolder.getSurface();
                this.isSurfaceChangeRequested = false;
                maybeRestoreBackupFrame();
                Runnable runnable = this.wakeupListener;
                this.wakeupListener = null;
                if (runnable != null) {
                    runnable.run();
                }
                return;
            }
            this.surface = null;
            surfaceHolder.setFixedSize(i6, format.height);
            surfaceHolder.setFormat(i5);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        synchronized (this.lock) {
            ImageWriter imageWriter = this.imageWriter;
            if (imageWriter != null) {
                imageWriter.close();
                this.imageWriter = null;
            }
        }
    }

    public static SurfaceHolderFrameWriter create(SurfaceHolder surfaceHolder, Executor executor, Listener listener, Executor executor2, HardwareBufferNativeHelpers hardwareBufferNativeHelpers) {
        return new SurfaceHolderFrameWriter(surfaceHolder, executor, listener, executor2, hardwareBufferNativeHelpers);
    }
}
