package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.MediaCodecAudioRenderer;
import androidx.media3.exoplayer.image.BitmapFactoryImageDecoder;
import androidx.media3.exoplayer.image.ImageDecoder;
import androidx.media3.exoplayer.image.ImageRenderer;
import androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionRenderer;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.d.b.an;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class DefaultRenderersFactory implements RenderersFactory {
    public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000;
    public static final int EXTENSION_RENDERER_MODE_OFF = 0;
    public static final int EXTENSION_RENDERER_MODE_ON = 1;
    public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
    public static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
    private static final int METADATA_RENDERER_COUNT = 4;
    private static final String TAG = "DefaultRenderersFactory";
    private final DefaultMediaCodecAdapterFactory codecAdapterFactory;
    private final Context context;
    private boolean enableAudioOutputPlaybackParameters;
    private boolean enableDecoderFallback;
    private boolean enableFloatOutput;
    private boolean enableMediaCodecBufferDecodeOnlyFlag;
    private boolean enableMediaCodecVideoRendererDurationToProgressUs;
    private boolean enableMediaCodecVideoRendererPrewarming;
    private int extensionRendererMode = 0;
    private long allowedVideoJoiningTimeMs = 5000;
    private MediaCodecSelector mediaCodecSelector = MediaCodecSelector.DEFAULT;
    private boolean parseAv1SampleDependencies = true;
    private long lateThresholdToDropDecoderInputUs = 15000;
    private long videoRendererEarlySchedulingThresholdUs = MediaCodecVideoRenderer.DEFAULT_EARLY_SCHEDULING_THRESHOLD_US;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtensionRendererMode {
    }

    public DefaultRenderersFactory(Context context) {
        this.context = context;
        this.codecAdapterFactory = new DefaultMediaCodecAdapterFactory(context);
    }

    protected void buildAudioRenderers(Context context, int i2, MediaCodecSelector mediaCodecSelector, boolean z, AudioSink audioSink, Handler handler, AudioRendererEventListener audioRendererEventListener, ArrayList<Renderer> arrayList) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        arrayList.add(new MediaCodecAudioRenderer(context, getCodecAdapterFactory(), mediaCodecSelector, z, handler, audioRendererEventListener, audioSink));
        if (i2 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i2 == 2) {
            size--;
        }
        try {
            try {
                int i3 = size + 1;
                try {
                    arrayList.add(size, (Renderer) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(context, handler, audioRendererEventListener, audioSink));
                    Log.i(TAG, "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused) {
                }
                size = i3;
            } catch (ClassNotFoundException unused2) {
            }
            try {
                try {
                    int i4 = size + 1;
                    try {
                        arrayList.add(size, (Renderer) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                        Log.i(TAG, "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                    }
                    size = i4;
                } catch (ClassNotFoundException unused4) {
                }
                try {
                    try {
                        int i5 = size + 1;
                        try {
                            arrayList.add(size, (Renderer) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                            Log.i(TAG, "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused5) {
                        }
                        size = i5;
                    } catch (ClassNotFoundException unused6) {
                    }
                    try {
                        try {
                            int i6 = size + 1;
                            try {
                                arrayList.add(size, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                                Log.i(TAG, "Loaded FfmpegAudioRenderer.");
                            } catch (ClassNotFoundException unused7) {
                            }
                            size = i6;
                        } catch (Exception e2) {
                            throw new IllegalStateException("Error instantiating FFmpeg extension", e2);
                        }
                    } catch (ClassNotFoundException unused8) {
                    }
                    try {
                        try {
                            Class<?> cls = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                            Object objNewInstance = cls.getConstructor(AudioSink.class).newInstance(audioSink);
                            cls.getMethod("setEventHandlerAndListener", Handler.class, AudioRendererEventListener.class).invoke(objNewInstance, handler, audioRendererEventListener);
                            Renderer renderer = (Renderer) cls.getMethod(JsonPOJOBuilder.DEFAULT_BUILD_METHOD, null).invoke(objNewInstance, null);
                            an.B(renderer);
                            int i7 = size + 1;
                            try {
                                arrayList.add(size, renderer);
                                Log.i(TAG, "Loaded IamfAudioRenderer.");
                            } catch (ReflectiveOperationException unused9) {
                            }
                            size = i7;
                        } catch (ReflectiveOperationException unused10) {
                        }
                        try {
                            arrayList.add(size, (Renderer) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                            Log.i(TAG, "Loaded MpeghAudioRenderer.");
                        } catch (ClassNotFoundException unused11) {
                        } catch (Exception e3) {
                            throw new IllegalStateException("Error instantiating MPEG-H extension", e3);
                        }
                    } catch (Exception e4) {
                        throw new IllegalStateException("Error instantiating IAMF extension", e4);
                    }
                } catch (Exception e5) {
                    throw new IllegalStateException("Error instantiating FLAC extension", e5);
                }
            } catch (Exception e6) {
                throw new IllegalStateException("Error instantiating Opus extension", e6);
            }
        } catch (Exception e7) {
            throw new IllegalStateException("Error instantiating MIDI extension", e7);
        }
    }

    protected AudioSink buildAudioSink(Context context, boolean z, boolean z2) {
        DefaultAudioSink.Builder builder = new DefaultAudioSink.Builder(context);
        builder.setEnableFloatOutput(z);
        builder.setEnableAudioOutputPlaybackParameters(z2);
        return builder.build();
    }

    protected void buildCameraMotionRenderers(Context context, int i2, ArrayList<Renderer> arrayList) {
        arrayList.add(new CameraMotionRenderer());
    }

    @Deprecated
    protected void buildImageRenderers(ArrayList<Renderer> arrayList) {
        arrayList.add(new ImageRenderer(getImageDecoderFactory(this.context), null));
    }

    protected void buildMetadataRenderers(Context context, MetadataOutput metadataOutput, Looper looper, int i2, ArrayList<Renderer> arrayList) {
        for (int i3 = 0; i3 < 4; i3++) {
            arrayList.add(new MetadataRenderer(metadataOutput, looper));
        }
    }

    protected void buildMiscellaneousRenderers(Context context, Handler handler, int i2, ArrayList<Renderer> arrayList) {
    }

    protected Renderer buildSecondaryVideoRenderer(Renderer renderer, Context context, int i2, MediaCodecSelector mediaCodecSelector, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, long j2) {
        if (!this.enableMediaCodecVideoRendererPrewarming || renderer.getClass() != MediaCodecVideoRenderer.class) {
            return null;
        }
        MediaCodecVideoRenderer.Builder builder = new MediaCodecVideoRenderer.Builder(context);
        builder.setCodecAdapterFactory(getCodecAdapterFactory());
        builder.setMediaCodecSelector(mediaCodecSelector);
        builder.setAllowedJoiningTimeMs(j2);
        builder.setEnableDecoderFallback(z);
        builder.setEventHandler(handler);
        builder.setEventListener(videoRendererEventListener);
        builder.setMaxDroppedFramesToNotify(50);
        builder.experimentalSetParseAv1SampleDependencies(this.parseAv1SampleDependencies);
        builder.experimentalSetLateThresholdToDropDecoderInputUs(this.lateThresholdToDropDecoderInputUs);
        if (Build.VERSION.SDK_INT >= 34) {
            builder.experimentalSetEnableMediaCodecBufferDecodeOnlyFlag(this.enableMediaCodecBufferDecodeOnlyFlag);
        }
        return builder.build();
    }

    protected void buildTextRenderers(Context context, TextOutput textOutput, Looper looper, int i2, ArrayList<Renderer> arrayList) {
        arrayList.add(new TextRenderer(textOutput, looper));
    }

    protected void buildVideoRenderers(Context context, int i2, MediaCodecSelector mediaCodecSelector, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, long j2, ArrayList<Renderer> arrayList) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        char c2;
        MediaCodecVideoRenderer.Builder builder = new MediaCodecVideoRenderer.Builder(context);
        builder.setCodecAdapterFactory(getCodecAdapterFactory());
        builder.setMediaCodecSelector(mediaCodecSelector);
        builder.setAllowedJoiningTimeMs(j2);
        builder.setEnableDecoderFallback(z);
        builder.setEventHandler(handler);
        builder.setEventListener(videoRendererEventListener);
        builder.setMaxDroppedFramesToNotify(50);
        builder.experimentalSetParseAv1SampleDependencies(this.parseAv1SampleDependencies);
        builder.experimentalSetLateThresholdToDropDecoderInputUs(this.lateThresholdToDropDecoderInputUs);
        builder.setEnableDurationToProgressUs(this.enableMediaCodecVideoRendererDurationToProgressUs);
        builder.setEarlySchedulingThresholdUs(this.videoRendererEarlySchedulingThresholdUs);
        if (Build.VERSION.SDK_INT >= 34) {
            builder.experimentalSetEnableMediaCodecBufferDecodeOnlyFlag(this.enableMediaCodecBufferDecodeOnlyFlag);
        }
        arrayList.add(builder.build());
        if (i2 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i2 == 2) {
            size--;
        }
        try {
            try {
                c2 = 3;
                try {
                    int i3 = size + 1;
                    try {
                        arrayList.add(size, (Renderer) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j2), handler, videoRendererEventListener, 50));
                        Log.i(TAG, "Loaded LibvpxVideoRenderer.");
                    } catch (ClassNotFoundException unused) {
                    }
                    size = i3;
                } catch (ClassNotFoundException unused2) {
                }
            } catch (Exception e2) {
                throw new IllegalStateException("Error instantiating VP9 extension", e2);
            }
        } catch (ClassNotFoundException unused3) {
            c2 = 3;
        }
        try {
            try {
                Class<?> cls = Class.forName("androidx.media3.decoder.av1.Libdav1dVideoRenderer");
                Class<?>[] clsArr = new Class[4];
                clsArr[0] = Long.TYPE;
                clsArr[1] = Handler.class;
                clsArr[2] = VideoRendererEventListener.class;
                clsArr[c2] = Integer.TYPE;
                Constructor<?> constructor = cls.getConstructor(clsArr);
                Object[] objArr = new Object[4];
                objArr[0] = Long.valueOf(j2);
                objArr[1] = handler;
                objArr[2] = videoRendererEventListener;
                objArr[c2] = 50;
                int i4 = size + 1;
                try {
                    arrayList.add(size, (Renderer) constructor.newInstance(objArr));
                    Log.i(TAG, "Loaded Libdav1dVideoRenderer.");
                } catch (ClassNotFoundException unused4) {
                }
                size = i4;
            } catch (Exception e3) {
                throw new IllegalStateException("Error instantiating AV1 extension", e3);
            }
        } catch (ClassNotFoundException unused5) {
        }
        try {
            Class<?> cls2 = Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer");
            Class<?>[] clsArr2 = new Class[4];
            clsArr2[0] = Long.TYPE;
            clsArr2[1] = Handler.class;
            clsArr2[2] = VideoRendererEventListener.class;
            clsArr2[c2] = Integer.TYPE;
            Constructor<?> constructor2 = cls2.getConstructor(clsArr2);
            Object[] objArr2 = new Object[4];
            objArr2[0] = Long.valueOf(j2);
            objArr2[1] = handler;
            objArr2[2] = videoRendererEventListener;
            objArr2[c2] = 50;
            arrayList.add(size, (Renderer) constructor2.newInstance(objArr2));
            Log.i(TAG, "Loaded FfmpegVideoRenderer.");
        } catch (ClassNotFoundException unused6) {
        } catch (Exception e4) {
            throw new IllegalStateException("Error instantiating FFmpeg extension", e4);
        }
    }

    @Override // androidx.media3.exoplayer.RenderersFactory
    public Renderer[] createRenderers(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Handler handler2;
        ArrayList<Renderer> arrayList = new ArrayList<>();
        buildVideoRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, handler, videoRendererEventListener, this.allowedVideoJoiningTimeMs, arrayList);
        AudioSink audioSinkBuildAudioSink = buildAudioSink(this.context, this.enableFloatOutput, this.enableAudioOutputPlaybackParameters);
        if (audioSinkBuildAudioSink != null) {
            handler2 = handler;
            buildAudioRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, audioSinkBuildAudioSink, handler2, audioRendererEventListener, arrayList);
        } else {
            handler2 = handler;
        }
        buildTextRenderers(this.context, textOutput, handler2.getLooper(), this.extensionRendererMode, arrayList);
        buildMetadataRenderers(this.context, metadataOutput, handler2.getLooper(), this.extensionRendererMode, arrayList);
        buildCameraMotionRenderers(this.context, this.extensionRendererMode, arrayList);
        buildImageRenderers(this.context, arrayList);
        buildMiscellaneousRenderers(this.context, handler2, this.extensionRendererMode, arrayList);
        return (Renderer[]) arrayList.toArray(new Renderer[0]);
    }

    @Override // androidx.media3.exoplayer.RenderersFactory
    public Renderer createSecondaryRenderer(Renderer renderer, Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) {
        if (renderer.getTrackType() == 2) {
            return buildSecondaryVideoRenderer(renderer, this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, handler, videoRendererEventListener, this.allowedVideoJoiningTimeMs);
        }
        return null;
    }

    public DefaultRenderersFactory experimentalSetEnableMediaCodecBufferDecodeOnlyFlag(boolean z) {
        this.enableMediaCodecBufferDecodeOnlyFlag = z;
        return this;
    }

    public final DefaultRenderersFactory experimentalSetEnableMediaCodecVideoRendererPrewarming(boolean z) {
        this.enableMediaCodecVideoRendererPrewarming = z;
        return this;
    }

    public final DefaultRenderersFactory experimentalSetLateThresholdToDropDecoderInputUs(long j2) {
        this.lateThresholdToDropDecoderInputUs = j2;
        return this;
    }

    public final DefaultRenderersFactory experimentalSetMediaCodecAsyncCryptoFlagEnabled(boolean z) {
        this.codecAdapterFactory.setAsyncCryptoFlagEnabled(z);
        return this;
    }

    public final DefaultRenderersFactory experimentalSetParseAv1SampleDependencies(boolean z) {
        this.parseAv1SampleDependencies = z;
        return this;
    }

    public final DefaultRenderersFactory forceDisableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.forceDisableAsynchronous();
        return this;
    }

    public final DefaultRenderersFactory forceEnableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.forceEnableAsynchronous();
        return this;
    }

    protected MediaCodecAdapter.Factory getCodecAdapterFactory() {
        return this.codecAdapterFactory;
    }

    protected ImageDecoder.Factory getImageDecoderFactory(Context context) {
        return new BitmapFactoryImageDecoder.Factory(context);
    }

    public final DefaultRenderersFactory setAllowedVideoJoiningTimeMs(long j2) {
        this.allowedVideoJoiningTimeMs = j2;
        return this;
    }

    public final DefaultRenderersFactory setEnableAudioFloatOutput(boolean z) {
        this.enableFloatOutput = z;
        return this;
    }

    public final DefaultRenderersFactory setEnableAudioOutputPlaybackParameters(boolean z) {
        this.enableAudioOutputPlaybackParameters = z;
        return this;
    }

    @Deprecated
    public final DefaultRenderersFactory setEnableAudioTrackPlaybackParams(boolean z) {
        setEnableAudioOutputPlaybackParameters(z);
        return this;
    }

    public final DefaultRenderersFactory setEnableDecoderFallback(boolean z) {
        this.enableDecoderFallback = z;
        return this;
    }

    public DefaultRenderersFactory setEnableMediaCodecVideoRendererDurationToProgressUs(boolean z) {
        this.enableMediaCodecVideoRendererDurationToProgressUs = z;
        return this;
    }

    public final DefaultRenderersFactory setExtensionRendererMode(int i2) {
        this.extensionRendererMode = i2;
        return this;
    }

    public final DefaultRenderersFactory setMediaCodecSelector(MediaCodecSelector mediaCodecSelector) {
        this.mediaCodecSelector = mediaCodecSelector;
        return this;
    }

    public final DefaultRenderersFactory setVideoRendererEarlySchedulingThresholdUs(long j2) {
        this.videoRendererEarlySchedulingThresholdUs = j2;
        return this;
    }

    protected void buildImageRenderers(Context context, ArrayList<Renderer> arrayList) {
        buildImageRenderers(arrayList);
    }
}
