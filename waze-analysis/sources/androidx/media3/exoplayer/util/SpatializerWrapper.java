package androidx.media3.exoplayer.util;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AudioAttributes$$ExternalSyntheticApiModelOutline2;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import com.google.d.d.bn;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class SpatializerWrapper {
    private final Handler handler;
    private final Spatializer$OnSpatializerStateChangedListener listener;
    private final boolean spatializationSupported;
    private final Spatializer spatializer;

    public SpatializerWrapper(Context context, final Runnable runnable, Boolean bool) {
        AudioManager audioManager = context == null ? null : AudioManagerCompat.getAudioManager(context);
        if (audioManager == null || (bool != null && bool.booleanValue())) {
            this.spatializer = null;
            this.spatializationSupported = false;
            this.handler = null;
            this.listener = null;
            return;
        }
        Spatializer spatializer = audioManager.getSpatializer();
        this.spatializer = spatializer;
        this.spatializationSupported = spatializer.getImmersiveAudioLevel() != 0;
        if (runnable == null) {
            this.handler = null;
            this.listener = null;
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        an.B(looperMyLooper);
        final Handler handler = new Handler(looperMyLooper);
        this.handler = handler;
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = new Spatializer$OnSpatializerStateChangedListener(this) { // from class: androidx.media3.exoplayer.util.SpatializerWrapper.1
            {
                Objects.requireNonNull(this);
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer2, boolean z) {
                runnable.run();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer2, boolean z) {
                runnable.run();
            }
        };
        this.listener = spatializer$OnSpatializerStateChangedListener;
        Objects.requireNonNull(handler);
        spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: androidx.media3.exoplayer.util.SpatializerWrapper$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable2) {
                handler.post(runnable2);
            }
        }, spatializer$OnSpatializerStateChangedListener);
    }

    public boolean canBeSpatialized(AudioAttributes audioAttributes, Format format) throws IllegalArgumentException {
        int i2;
        if (!isSupportedAvailableAndEnabled()) {
            return false;
        }
        if (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_E_AC3_JOC)) {
            i2 = format.channelCount;
            if (i2 == 16) {
                i2 = 12;
            }
        } else if (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_IAMF)) {
            i2 = format.channelCount;
            if (i2 == -1) {
                i2 = 6;
            }
        } else if (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_AC4)) {
            i2 = format.channelCount;
            if (i2 == 18 || i2 == 21) {
                i2 = 24;
            }
        } else {
            i2 = format.channelCount;
        }
        int audioTrackChannelConfig = format.channelMask;
        if (audioTrackChannelConfig == -1 || format.channelCount != i2) {
            audioTrackChannelConfig = Util.getAudioTrackChannelConfig(i2);
        }
        if (audioTrackChannelConfig == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(audioTrackChannelConfig);
        int i3 = format.sampleRate;
        if (i3 != -1) {
            channelMask.setSampleRate(i3);
        }
        Spatializer spatializer = this.spatializer;
        an.B(spatializer);
        return AudioAttributes$$ExternalSyntheticApiModelOutline2.m((Object) spatializer).canBeSpatialized(audioAttributes.getPlatformAudioAttributes(), channelMask.build());
    }

    public List<Integer> getSpatializedChannelMasks() {
        if (!isSupportedAvailableAndEnabled()) {
            return bn.p();
        }
        if (Build.VERSION.SDK_INT < 36) {
            return bn.q(Integer.valueOf(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5));
        }
        Spatializer spatializer = this.spatializer;
        an.B(spatializer);
        return AudioAttributes$$ExternalSyntheticApiModelOutline2.m((Object) spatializer).getSpatializedChannelMasks();
    }

    public boolean isAvailable() {
        Spatializer spatializer = this.spatializer;
        return spatializer != null && spatializer.isAvailable();
    }

    public boolean isEnabled() {
        Spatializer spatializer = this.spatializer;
        return spatializer != null && spatializer.isEnabled();
    }

    public boolean isSpatializationSupported() {
        return this.spatializationSupported;
    }

    public boolean isSupportedAvailableAndEnabled() {
        return this.spatializer != null && this.spatializationSupported && isAvailable() && isEnabled();
    }

    public void release() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        Spatializer spatializer = this.spatializer;
        if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.listener) == null || this.handler == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        this.handler.removeCallbacksAndMessages(null);
    }
}
