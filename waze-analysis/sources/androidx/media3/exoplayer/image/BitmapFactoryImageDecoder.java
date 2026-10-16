package androidx.media3.exoplayer.image;

import android.content.Context;
import android.graphics.Point;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.BitmapUtil;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.SimpleDecoder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.image.ImageDecoder;
import com.google.d.b.an;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BitmapFactoryImageDecoder extends SimpleDecoder<DecoderInputBuffer, ImageOutputBuffer, ImageDecoderException> implements ImageDecoder {
    private final Context context;
    private final int maxOutputSize;

    private BitmapFactoryImageDecoder(Context context, int i2) {
        super(new DecoderInputBuffer[1], new ImageOutputBuffer[1]);
        this.context = context;
        this.maxOutputSize = i2;
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    protected DecoderInputBuffer createInputBuffer() {
        return new DecoderInputBuffer(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.decoder.SimpleDecoder
    public ImageOutputBuffer createOutputBuffer() {
        return new ImageOutputBuffer(this) { // from class: androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.1
            final /* synthetic */ BitmapFactoryImageDecoder this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // androidx.media3.decoder.DecoderOutputBuffer
            public void release() {
                this.this$0.releaseOutputBuffer(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.decoder.SimpleDecoder
    public ImageDecoderException createUnexpectedDecodeException(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.decoder.SimpleDecoder
    public ImageDecoderException decode(DecoderInputBuffer decoderInputBuffer, ImageOutputBuffer imageOutputBuffer, boolean z) {
        ByteBuffer byteBuffer = decoderInputBuffer.data;
        an.B(byteBuffer);
        an.u(byteBuffer.hasArray());
        an.l(byteBuffer.arrayOffset() == 0);
        try {
            int i2 = this.maxOutputSize;
            if (i2 == -1) {
                Context context = this.context;
                if (context != null) {
                    Point currentDisplayModeSize = Util.getCurrentDisplayModeSize(context);
                    int i3 = currentDisplayModeSize.x;
                    int i4 = currentDisplayModeSize.y;
                    Format format = decoderInputBuffer.format;
                    if (format != null) {
                        int i5 = format.tileCountHorizontal;
                        if (i5 != -1) {
                            i3 *= i5;
                        }
                        int i6 = format.tileCountVertical;
                        if (i6 != -1) {
                            i4 *= i6;
                        }
                    }
                    int iMax = Math.max(i3, i4);
                    i2 = (iMax + iMax) - 1;
                } else {
                    i2 = 4096;
                }
            }
            imageOutputBuffer.bitmap = BitmapUtil.decode(byteBuffer.array(), byteBuffer.remaining(), null, i2);
            imageOutputBuffer.timeUs = decoderInputBuffer.timeUs;
            return null;
        } catch (ParserException e2) {
            return new ImageDecoderException("Could not decode image data with BitmapFactory.", e2);
        } catch (IOException e3) {
            return new ImageDecoderException(e3);
        }
    }

    @Override // androidx.media3.decoder.SimpleDecoder, androidx.media3.decoder.Decoder
    public /* bridge */ /* synthetic */ ImageOutputBuffer dequeueOutputBuffer() {
        return (ImageOutputBuffer) super.dequeueOutputBuffer();
    }

    @Override // androidx.media3.decoder.Decoder
    public String getName() {
        return "BitmapFactoryImageDecoder";
    }

    /* compiled from: WazeSource */
    public final class Factory implements ImageDecoder.Factory {
        private final Context context;
        private int maxOutputSize;

        public Factory(Context context) {
            an.B(context);
            this.context = context;
            this.maxOutputSize = -1;
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public BitmapFactoryImageDecoder createImageDecoder() {
            return new BitmapFactoryImageDecoder(this.context, this.maxOutputSize);
        }

        public Factory setMaxOutputSize(int i2) {
            boolean z = true;
            if (i2 != -1 && i2 <= 0) {
                z = false;
            }
            an.l(z);
            this.maxOutputSize = i2;
            return this;
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public int supportsFormat(Format format) {
            String str = format.sampleMimeType;
            if (str == null || !MimeTypes.isImage(str)) {
                return RendererCapabilities.CC.create(0);
            }
            return RendererCapabilities.CC.create(true == Util.isBitmapFactorySupportedMimeType(format.sampleMimeType) ? 4 : 1);
        }

        @Deprecated
        public Factory() {
            this.context = null;
            this.maxOutputSize = -1;
        }
    }
}
