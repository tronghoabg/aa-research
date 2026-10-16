package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioOffloadSupport;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DefaultAudioOffloadSupportProvider implements DefaultAudioSink.AudioOffloadSupportProvider {
    private static final String OFFLOAD_VARIABLE_RATE_SUPPORTED_KEY = "offloadVariableRateSupported";
    private final Context context;
    private Boolean isOffloadVariableRateSupported;

    public DefaultAudioOffloadSupportProvider(Context context) {
        this.context = context == null ? null : context.getApplicationContext();
    }

    private static AudioOffloadSupport getOffloadedPlaybackSupportV29(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        AudioOffloadSupport.Builder builder = new AudioOffloadSupport.Builder();
        builder.setIsFormatSupported(true);
        builder.setIsSpeedChangeSupported(z);
        return builder.build();
    }

    private static AudioOffloadSupport getOffloadedPlaybackSupportV31(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        AudioOffloadSupport.Builder builder = new AudioOffloadSupport.Builder();
        boolean z2 = false;
        if (Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2) {
            z2 = true;
        }
        builder.setIsFormatSupported(true);
        builder.setIsGaplessSupported(z2);
        builder.setIsSpeedChangeSupported(z);
        return builder.build();
    }

    private static AudioOffloadSupport getOffloadedPlaybackSupportV33(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(audioFormat, audioAttributes);
        if ((directPlaybackSupport & 1) == 0) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        boolean z2 = (directPlaybackSupport & 3) == 3;
        AudioOffloadSupport.Builder builder = new AudioOffloadSupport.Builder();
        builder.setIsFormatSupported(true);
        builder.setIsGaplessSupported(z2);
        builder.setIsSpeedChangeSupported(z);
        return builder.build();
    }

    private boolean isOffloadVariableRateSupported(Context context) {
        Boolean boolValueOf;
        Boolean bool = this.isOffloadVariableRateSupported;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        if (context != null) {
            String parameters = AudioManagerCompat.getAudioManager(context).getParameters(OFFLOAD_VARIABLE_RATE_SUPPORTED_KEY);
            if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                z = true;
            }
            boolValueOf = Boolean.valueOf(z);
            this.isOffloadVariableRateSupported = boolValueOf;
        } else {
            boolValueOf = false;
            this.isOffloadVariableRateSupported = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioOffloadSupportProvider
    public AudioOffloadSupport getAudioOffloadSupport(Format format, androidx.media3.common.AudioAttributes audioAttributes) {
        an.B(format);
        an.B(audioAttributes);
        if (format.sampleRate == -1) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        boolean zIsOffloadVariableRateSupported = isOffloadVariableRateSupported(this.context);
        String str = format.sampleMimeType;
        an.B(str);
        int encoding = MimeTypes.getEncoding(str, format.codecs);
        if (encoding == 0 || Build.VERSION.SDK_INT < Util.getApiLevelThatAudioFormatIntroducedAudioEncoding(encoding)) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(format);
        if (audioTrackChannelConfig == 0) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        try {
            AudioFormat audioFormat = Util.getAudioFormat(format.sampleRate, audioTrackChannelConfig, encoding);
            return Build.VERSION.SDK_INT >= 33 ? getOffloadedPlaybackSupportV33(audioFormat, audioAttributes.getPlatformAudioAttributes(), zIsOffloadVariableRateSupported) : Build.VERSION.SDK_INT >= 31 ? getOffloadedPlaybackSupportV31(audioFormat, audioAttributes.getPlatformAudioAttributes(), zIsOffloadVariableRateSupported) : getOffloadedPlaybackSupportV29(audioFormat, audioAttributes.getPlatformAudioAttributes(), zIsOffloadVariableRateSupported);
        } catch (IllegalArgumentException unused) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
    }

    public DefaultAudioOffloadSupportProvider() {
        this(null);
    }
}
