package androidx.camera.video.internal.config;

import android.util.Rational;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.MediaConstants;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;
import h.a.i;
import h.g.a.p;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AudioConfigUtil {
    private static final int AAC_DEFAULT_PROFILE = 2;
    public static final int AUDIO_CHANNEL_COUNT_DEFAULT = 1;
    private static final String AUDIO_ENCODER_MIME_MPEG4_DEFAULT = "audio/mp4a-latm";
    private static final String AUDIO_ENCODER_MIME_WEBM_DEFAULT = "audio/vorbis";
    public static final int AUDIO_SAMPLE_RATE_DEFAULT = 44100;
    public static final int AUDIO_SOURCE_DEFAULT = 5;
    public static final int AUDIO_SOURCE_FORMAT_DEFAULT = 2;
    public static final AudioConfigUtil INSTANCE = new AudioConfigUtil();
    private static final String TAG = "AudioConfigUtil";

    private AudioConfigUtil() {
    }

    public static final AudioEncoderConfig resolveAudioEncoderConfig(AudioMimeInfo audioMimeInfo, Timebase timebase, AudioSettings audioSettings, AudioSpec audioSpec) {
        x.f(audioMimeInfo, "audioMimeInfo");
        x.f(timebase, "inputTimebase");
        x.f(audioSettings, "audioSettings");
        x.f(audioSpec, "audioSpec");
        Object obj = (audioMimeInfo.getCompatibleAudioProfile() != null ? new AudioEncoderConfigAudioProfileResolver(audioMimeInfo.getMimeType(), audioMimeInfo.getProfile(), timebase, audioSpec, audioSettings, audioMimeInfo.getCompatibleAudioProfile()) : new AudioEncoderConfigDefaultResolver(audioMimeInfo.getMimeType(), audioMimeInfo.getProfile(), timebase, audioSpec, audioSettings)).get();
        x.e(obj, "get(...)");
        return (AudioEncoderConfig) obj;
    }

    private final AudioSettings resolveAudioSettings(AudioSpec audioSpec, int i2, int i3, List<Integer> list, Rational rational) {
        int iResolveAudioSource = resolveAudioSource(audioSpec);
        int iResolveAudioSourceFormat = resolveAudioSourceFormat(audioSpec);
        int i4 = -1;
        if (audioSpec.getChannelCount() != -1) {
            i2 = audioSpec.getChannelCount();
        }
        if (audioSpec.getSampleRate() != 0) {
            i3 = audioSpec.getSampleRate();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i2));
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(it.next().intValue());
            if (!arrayList.contains(numValueOf)) {
                arrayList.add(numValueOf);
            }
        }
        Iterator it2 = arrayList.iterator();
        CaptureEncodeRates captureEncodeRates = null;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            int iIntValue = ((Number) it2.next()).intValue();
            CaptureEncodeRates captureEncodeRatesResolveSampleRates$camera_video = resolveSampleRates$camera_video(i3, iIntValue, iResolveAudioSourceFormat, rational);
            if (captureEncodeRatesResolveSampleRates$camera_video != null) {
                i4 = iIntValue;
                captureEncodeRates = captureEncodeRatesResolveSampleRates$camera_video;
                break;
            }
            captureEncodeRates = captureEncodeRatesResolveSampleRates$camera_video;
        }
        if (captureEncodeRates == null) {
            Logger.w(TAG, "No sample rate found or supported by audio source. Falling back to default channel count 1 and sample rate of 44100 Hz");
            captureEncodeRates = new CaptureEncodeRates(44100, rational == null ? 44100 : CaptureEncodeRatesKt.toEncodeRate(44100, rational));
            i4 = 1;
        }
        AudioSettings.Builder builder = AudioSettings.builder();
        builder.setAudioSource(iResolveAudioSource);
        builder.setAudioFormat(iResolveAudioSourceFormat);
        builder.setChannelCount(i4);
        builder.setCaptureSampleRate(captureEncodeRates.getCaptureRate());
        builder.setEncodeSampleRate(captureEncodeRates.getEncodeRate());
        AudioSettings audioSettingsBuild = builder.build();
        x.e(audioSettingsBuild, "build(...)");
        return audioSettingsBuild;
    }

    public static /* synthetic */ AudioSettings resolveAudioSettings$default(AudioSpec audioSpec, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, Rational rational, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            audioProfileProxy = null;
        }
        if ((i2 & 4) != 0) {
            rational = null;
        }
        return resolveAudioSettings(audioSpec, audioProfileProxy, rational);
    }

    static final int selectSampleRateOrNearestSupported$lambda$0(int i2, int i3, int i4) {
        int iAbs = Math.abs(i3 - i2) - Math.abs(i4 - i2);
        return iAbs == 0 ? Integer.signum(i3 - i4) : Integer.signum(iAbs);
    }

    public final int audioMimeToAudioProfile(String str) {
        x.f(str, "audioMime");
        return x.n(str, "audio/mp4a-latm") ? 2 : -1;
    }

    public final String outputFormatToAudioMime(int i2) {
        return i2 == 1 ? "audio/vorbis" : "audio/mp4a-latm";
    }

    public final int resolveAudioSource(AudioSpec audioSpec) {
        x.f(audioSpec, "audioSpec");
        int source = audioSpec.getSource();
        if (source == -1) {
            Logger.d(TAG, "Using default AUDIO source: 5");
            return 5;
        }
        Logger.d(TAG, "Using provided AUDIO source: " + source);
        return source;
    }

    public final int resolveAudioSourceFormat(AudioSpec audioSpec) {
        x.f(audioSpec, "audioSpec");
        int sourceFormat = audioSpec.getSourceFormat();
        if (sourceFormat == -1) {
            Logger.d(TAG, "Using default AUDIO source format: 2");
            return 2;
        }
        Logger.d(TAG, "Using provided AUDIO source format: " + sourceFormat);
        return sourceFormat;
    }

    public final EncoderProfilesProxy.AudioProfileProxy resolveCompatibleAudioProfile(String str, List<? extends EncoderProfilesProxy.AudioProfileProxy> list) {
        Object next;
        x.f(str, "audioMime");
        x.f(list, "audioProfiles");
        int iAudioMimeToAudioProfile = audioMimeToAudioProfile(str);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = (EncoderProfilesProxy.AudioProfileProxy) next;
            if (x.n(str, MediaConstants.MIME_TYPE_UNSPECIFIED) || (x.n(audioProfileProxy.getMediaType(), str) && audioProfileProxy.getProfile() == iAudioMimeToAudioProfile)) {
                break;
            }
        }
        return (EncoderProfilesProxy.AudioProfileProxy) next;
    }

    public final CaptureEncodeRates resolveSampleRates$camera_video(int i2, int i3, int i4, Rational rational) {
        int iIntValue;
        int encodeRate;
        if (rational == null) {
            Integer numSelectSampleRateOrNearestSupported = selectSampleRateOrNearestSupported(i3, i4, i2);
            if (numSelectSampleRateOrNearestSupported == null) {
                return null;
            }
            iIntValue = numSelectSampleRateOrNearestSupported.intValue();
            encodeRate = iIntValue;
        } else {
            Integer numSelectSampleRateOrNearestSupported2 = selectSampleRateOrNearestSupported(i3, i4, CaptureEncodeRatesKt.toCaptureRate(i2, rational));
            if (numSelectSampleRateOrNearestSupported2 == null) {
                return null;
            }
            iIntValue = numSelectSampleRateOrNearestSupported2.intValue();
            encodeRate = CaptureEncodeRatesKt.toEncodeRate(iIntValue, rational);
        }
        Logger.d(TAG, "Resolved capture/encode sample rate " + iIntValue + "Hz/" + encodeRate + "Hz, [target sample rate: " + i2 + ", channel count: " + i3 + ", source format: " + i4 + ", capture to encode sample rate ratio: " + rational + "]");
        return new CaptureEncodeRates(iIntValue, encodeRate);
    }

    public final int scaleBitrate(int i2, int i3, int i4, int i5, int i6) {
        String str;
        int iDoubleValue = (int) (i2 * new Rational(i3, i4).doubleValue() * new Rational(i5, i6).doubleValue());
        if (Logger.isDebugEnabled(TAG)) {
            str = "Base Bitrate(" + i2 + "bps) * Channel Count Ratio(" + i3 + " / " + i4 + ") * Sample Rate Ratio(" + i5 + " / " + i6 + ") = " + iDoubleValue;
        } else {
            str = "";
        }
        Logger.d(TAG, str);
        return iDoubleValue;
    }

    public final Integer selectSampleRateOrNearestSupported(int i2, int i3, final int i4) {
        int i5 = 0;
        int iIntValue = i4;
        ArrayList arrayList = null;
        while (!AudioSource.isSettingsSupported(iIntValue, i2, i3)) {
            Logger.d(TAG, "Sample rate " + iIntValue + " Hz is not supported by audio source with channel count " + i2 + " and source format " + i3);
            if (arrayList == null) {
                Logger.d(TAG, "Trying common sample rates in proximity order to target " + i4 + " Hz");
                arrayList = new ArrayList(AudioSettings.COMMON_SAMPLE_RATES);
                final p pVar = new p() { // from class: androidx.camera.video.internal.config.AudioConfigUtil$$ExternalSyntheticLambda0
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return Integer.valueOf(AudioConfigUtil.selectSampleRateOrNearestSupported$lambda$0(i4, ((Integer) obj).intValue(), ((Integer) obj2).intValue()));
                    }
                };
                i.t(arrayList, new Comparator() { // from class: androidx.camera.video.internal.config.AudioConfigUtil$$ExternalSyntheticLambda1
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ((Number) pVar.invoke(obj, obj2)).intValue();
                    }
                });
            }
            if (i5 >= arrayList.size()) {
                return null;
            }
            iIntValue = ((Number) arrayList.get(i5)).intValue();
            i5++;
        }
        return Integer.valueOf(iIntValue);
    }

    public static final AudioSettings resolveAudioSettings(AudioSpec audioSpec, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, Rational rational) {
        Rational rational2;
        AudioSpec audioSpec2;
        AudioSettings audioSettingsResolveAudioSettings;
        x.f(audioSpec, "audioSpec");
        if (audioProfileProxy != null) {
            audioSettingsResolveAudioSettings = INSTANCE.resolveAudioSettings(audioSpec, audioProfileProxy.getChannels(), audioProfileProxy.getSampleRate(), i.i(Integer.valueOf(audioProfileProxy.getChannels()), 1), rational);
            audioSpec2 = audioSpec;
            rational2 = rational;
        } else {
            rational2 = rational;
            audioSpec2 = audioSpec;
            audioSettingsResolveAudioSettings = INSTANCE.resolveAudioSettings(audioSpec2, 1, 44100, i.d(1), rational2);
        }
        Logger.d(TAG, "Resolved AUDIO settings: " + audioSettingsResolveAudioSettings + " [audioSpec: " + audioSpec2 + ", compatibleAudioProfile: " + audioProfileProxy + ", captureToEncodeRatio: " + rational2 + "]");
        return audioSettingsResolveAudioSettings;
    }
}
