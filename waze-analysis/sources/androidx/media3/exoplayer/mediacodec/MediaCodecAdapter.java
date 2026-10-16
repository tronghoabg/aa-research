package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.media3.common.Format;
import androidx.media3.decoder.CryptoInfo;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface MediaCodecAdapter {

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.exoplayer.mediacodec.MediaCodecAdapter$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$registerOnBufferAvailableListener(MediaCodecAdapter mediaCodecAdapter, OnBufferAvailableListener onBufferAvailableListener) {
            return false;
        }
    }

    /* compiled from: WazeSource */
    public final class Configuration {
        public final MediaCodecInfo codecInfo;
        public final MediaCrypto crypto;
        public final Format format;
        public final LoudnessCodecController loudnessCodecController;
        public final MediaFormat mediaFormat;
        public final Surface surface;

        private Configuration(MediaCodecInfo mediaCodecInfo, MediaFormat mediaFormat, Format format, Surface surface, MediaCrypto mediaCrypto, LoudnessCodecController loudnessCodecController) {
            this.codecInfo = mediaCodecInfo;
            this.mediaFormat = mediaFormat;
            this.format = format;
            this.surface = surface;
            this.crypto = mediaCrypto;
            this.loudnessCodecController = loudnessCodecController;
        }

        public static Configuration createForAudioDecoding(MediaCodecInfo mediaCodecInfo, MediaFormat mediaFormat, Format format, MediaCrypto mediaCrypto, LoudnessCodecController loudnessCodecController) {
            return new Configuration(mediaCodecInfo, mediaFormat, format, null, mediaCrypto, loudnessCodecController);
        }

        public static Configuration createForVideoDecoding(MediaCodecInfo mediaCodecInfo, MediaFormat mediaFormat, Format format, Surface surface, MediaCrypto mediaCrypto) {
            return new Configuration(mediaCodecInfo, mediaFormat, format, surface, mediaCrypto, null);
        }
    }

    /* compiled from: WazeSource */
    public interface Factory {

        @Deprecated
        public static final Factory DEFAULT = new DefaultMediaCodecAdapterFactory();

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.exoplayer.mediacodec.MediaCodecAdapter$Factory$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static Factory getDefault(Context context) {
                return new DefaultMediaCodecAdapterFactory(context);
            }
        }

        MediaCodecAdapter createAdapter(Configuration configuration);
    }

    /* compiled from: WazeSource */
    public interface OnBufferAvailableListener {

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.exoplayer.mediacodec.MediaCodecAdapter$OnBufferAvailableListener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onInputBufferAvailable(OnBufferAvailableListener onBufferAvailableListener) {
            }

            public static void $default$onOutputBufferAvailable(OnBufferAvailableListener onBufferAvailableListener) {
            }
        }

        void onInputBufferAvailable();

        void onOutputBufferAvailable();
    }

    /* compiled from: WazeSource */
    public interface OnFrameRenderedListener {
        void onFrameRendered(MediaCodecAdapter mediaCodecAdapter, long j2, long j3);
    }

    int dequeueInputBufferIndex();

    int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo);

    void detachOutputSurface();

    void flush();

    ByteBuffer getInputBuffer(int i2);

    PersistableBundle getMetrics();

    ByteBuffer getOutputBuffer(int i2);

    MediaFormat getOutputFormat();

    boolean needsReconfiguration();

    void queueInputBuffer(int i2, int i3, int i4, long j2, int i5);

    void queueSecureInputBuffer(int i2, int i3, CryptoInfo cryptoInfo, long j2, int i4);

    boolean registerOnBufferAvailableListener(OnBufferAvailableListener onBufferAvailableListener);

    void release();

    void releaseOutputBuffer(int i2, long j2);

    void releaseOutputBuffer(int i2, boolean z);

    void setOnFrameRenderedListener(OnFrameRenderedListener onFrameRenderedListener, Handler handler);

    void setOutputSurface(Surface surface);

    void setParameters(Bundle bundle);

    void setVideoScalingMode(int i2);

    void subscribeToVendorParameters(List<String> list);

    void unsubscribeFromVendorParameters(List<String> list);

    void useInputBuffer(Runnable runnable);
}
