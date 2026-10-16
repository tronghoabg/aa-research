package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.image.ImageDecoder;
import com.google.d.b.an;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ExternallyLoadedImageDecoder implements ImageDecoder {
    private final BitmapResolver bitmapResolver;
    private final DecoderInputBuffer inputBuffer;
    private final ImageOutputBuffer outputBuffer;
    private bm<Bitmap> pendingDecode;
    private long pendingDecodeTimeUs;
    private boolean pendingEndOfStream;

    /* compiled from: WazeSource */
    public interface BitmapResolver {
        bm<Bitmap> resolve(ExternalImageRequest externalImageRequest);
    }

    /* compiled from: WazeSource */
    public final class ExternalImageRequest {
        public final Uri uri;

        public ExternalImageRequest(Uri uri) {
            this.uri = uri;
        }
    }

    /* compiled from: WazeSource */
    public final class Factory implements ImageDecoder.Factory {
        private final BitmapResolver bitmapResolver;

        public Factory(BitmapResolver bitmapResolver) {
            this.bitmapResolver = bitmapResolver;
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public ExternallyLoadedImageDecoder createImageDecoder() {
            return new ExternallyLoadedImageDecoder(this.bitmapResolver);
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public int supportsFormat(Format format) {
            return RendererCapabilities.CC.create(Objects.equals(format.sampleMimeType, MimeTypes.APPLICATION_EXTERNALLY_LOADED_IMAGE) ? 4 : MimeTypes.isImage(format.sampleMimeType) ? 1 : 0);
        }
    }

    private ExternallyLoadedImageDecoder(BitmapResolver bitmapResolver) {
        this.bitmapResolver = bitmapResolver;
        this.inputBuffer = new DecoderInputBuffer(1);
        this.outputBuffer = new ImageOutputBuffer(this) { // from class: androidx.media3.exoplayer.image.ExternallyLoadedImageDecoder.1
            {
                Objects.requireNonNull(this);
            }

            @Override // androidx.media3.decoder.DecoderOutputBuffer
            public void release() {
                clear();
            }
        };
    }

    private void resetState() {
        bm<Bitmap> bmVar = this.pendingDecode;
        if (bmVar != null) {
            bmVar.cancel(false);
            this.pendingDecode = null;
        }
        this.pendingEndOfStream = false;
        this.inputBuffer.clear();
        this.outputBuffer.release();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.decoder.Decoder
    public DecoderInputBuffer dequeueInputBuffer() {
        if (this.pendingDecode == null) {
            return this.inputBuffer;
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.decoder.Decoder
    public ImageOutputBuffer dequeueOutputBuffer() {
        if (this.pendingEndOfStream) {
            this.outputBuffer.addFlag(4);
            this.pendingEndOfStream = false;
            return this.outputBuffer;
        }
        bm<Bitmap> bmVar = this.pendingDecode;
        if (bmVar != null) {
            try {
                if (bmVar.isDone()) {
                    try {
                        try {
                            this.outputBuffer.bitmap = (Bitmap) bd.o(this.pendingDecode);
                            ImageOutputBuffer imageOutputBuffer = this.outputBuffer;
                            imageOutputBuffer.timeUs = this.pendingDecodeTimeUs;
                            return imageOutputBuffer;
                        } catch (ExecutionException e2) {
                            throw new ImageDecoderException(e2.getCause());
                        }
                    } catch (CancellationException e3) {
                        throw new ImageDecoderException(e3);
                    }
                }
            } finally {
                this.pendingDecode = null;
            }
        }
        return null;
    }

    @Override // androidx.media3.decoder.Decoder
    public void flush() {
        resetState();
    }

    @Override // androidx.media3.decoder.Decoder
    public String getName() {
        return "externallyLoadedImageDecoder";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.decoder.Decoder
    public void queueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        if (decoderInputBuffer.isEndOfStream()) {
            this.pendingEndOfStream = true;
            decoderInputBuffer.clear();
            return;
        }
        ByteBuffer byteBuffer = decoderInputBuffer.data;
        an.B(byteBuffer);
        an.u(byteBuffer.hasArray());
        this.pendingDecode = this.bitmapResolver.resolve(new ExternalImageRequest(Uri.parse(new String(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.remaining(), StandardCharsets.UTF_8))));
        this.pendingDecodeTimeUs = decoderInputBuffer.timeUs;
        decoderInputBuffer.clear();
    }

    @Override // androidx.media3.decoder.Decoder
    public void release() {
        resetState();
    }

    @Override // androidx.media3.decoder.Decoder
    public /* synthetic */ void setCallback(Decoder.Callback callback, Executor executor) {
    }

    @Override // androidx.media3.decoder.Decoder
    public void setOutputStartTimeUs(long j2) {
    }
}
