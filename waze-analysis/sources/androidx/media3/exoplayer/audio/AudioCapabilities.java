package androidx.media3.exoplayer.audio;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import com.google.d.d.bi;
import com.google.d.d.bn;
import com.google.d.d.bq;
import com.google.d.d.bs;
import com.google.d.d.cg;
import com.google.d.d.ci;
import com.google.d.d.fu;
import com.google.d.l.j;
import com.waze.sound.fl$$ExternalSyntheticApiModelOutline1;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AudioCapabilities {
    static final bs<Integer, Integer> ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS;
    public static final AudioCapabilities DEFAULT_AUDIO_CAPABILITIES;
    private static final bn<Integer> DEFAULT_EMPTY_SPATIALIZER_CHANNEL_MASKS;
    static final int DEFAULT_MAX_CHANNEL_COUNT = 10;
    static final int DEFAULT_SAMPLE_RATE_HZ = 48000;
    private static final bn<Integer> DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS;
    private static final bn<Integer> EXTERNAL_SURROUND_SOUND_ENCODINGS;
    private static final String EXTERNAL_SURROUND_SOUND_KEY = "external_surround_sound_enabled";
    private static final String FORCE_EXTERNAL_SURROUND_SOUND_KEY = "use_external_surround_sound_flag";
    private final SparseArray<AudioProfile> encodingToAudioProfile;
    private final int maxChannelCount;
    private final bn<Integer> spatializerChannelMasks;
    private final bn<Integer> speakerLayoutChannelMasks;

    /* compiled from: WazeSource */
    final class Api29 {
        private Api29() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static bn<Integer> getDirectPlaybackSupportedEncodings(AudioAttributes audioAttributes) {
            int i2 = bn.f7456d;
            bi biVar = new bi();
            fu fuVarListIterator = AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.keySet().listIterator();
            while (fuVarListIterator.hasNext()) {
                Integer num = (Integer) fuVarListIterator.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= Util.getApiLevelThatAudioFormatIntroducedAudioEncoding(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), audioAttributes.getPlatformAudioAttributes())) {
                    biVar.g(num);
                }
            }
            biVar.g(2);
            return biVar.f();
        }

        public static int getMaxSupportedChannelCountForPassthrough(int i2, int i3, AudioAttributes audioAttributes) {
            for (int i4 = 10; i4 > 0; i4--) {
                int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(i4);
                if (audioTrackChannelConfig != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i3).setChannelMask(audioTrackChannelConfig).build(), audioAttributes.getPlatformAudioAttributes())) {
                    return i4;
                }
            }
            return 0;
        }
    }

    /* compiled from: WazeSource */
    final class Api33 {
        private Api33() {
        }

        public static AudioCapabilities getCapabilitiesInternalForDirectPlayback(AudioManager audioManager, AudioAttributes audioAttributes, List<Integer> list, List<Integer> list2) {
            return new AudioCapabilities(AudioCapabilities.getAudioProfiles(audioManager.getDirectProfilesForAttributes(audioAttributes.getPlatformAudioAttributes())), list, list2);
        }

        public static AudioDeviceInfo getDefaultRoutedDeviceForAttributes(AudioManager audioManager, AudioAttributes audioAttributes) {
            an.B(audioManager);
            List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(audioAttributes.getPlatformAudioAttributes());
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return (AudioDeviceInfo) audioDevicesForAttributes.get(0);
        }
    }

    static {
        bn<Integer> bnVarQ = bn.q(12);
        DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS = bnVarQ;
        bn<Integer> bnVarP = bn.p();
        DEFAULT_EMPTY_SPATIALIZER_CHANNEL_MASKS = bnVarP;
        DEFAULT_AUDIO_CAPABILITIES = new AudioCapabilities(bn.q(AudioProfile.DEFAULT_AUDIO_PROFILE), bnVarQ, bnVarP);
        EXTERNAL_SURROUND_SOUND_ENCODINGS = bn.s(2, 5, 6);
        bq bqVar = new bq();
        bqVar.d(5, 6);
        bqVar.d(17, 6);
        bqVar.d(7, 6);
        bqVar.d(30, 10);
        bqVar.d(18, 6);
        bqVar.d(6, 8);
        bqVar.d(8, 8);
        bqVar.d(14, 8);
        ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS = bqVar.b();
    }

    private AudioCapabilities(List<AudioProfile> list, List<Integer> list2, List<Integer> list3) {
        this.encodingToAudioProfile = new SparseArray<>();
        for (int i2 = 0; i2 < list.size(); i2++) {
            AudioProfile audioProfile = list.get(i2);
            this.encodingToAudioProfile.put(audioProfile.encoding, audioProfile);
        }
        int iMax = 0;
        for (int i3 = 0; i3 < this.encodingToAudioProfile.size(); i3++) {
            iMax = Math.max(iMax, this.encodingToAudioProfile.valueAt(i3).maxChannelCount);
        }
        this.maxChannelCount = iMax;
        this.speakerLayoutChannelMasks = bn.n(list2);
        this.spatializerChannelMasks = bn.n(list3);
    }

    private static boolean deviceMaySetExternalSurroundSoundGlobalSetting() {
        return Build.MANUFACTURER.equals("Amazon") || Build.MANUFACTURER.equals("Xiaomi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static bn<AudioProfile> getAudioProfiles(List<android.media.AudioProfile> list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(j.m(12)));
        for (int i2 = 0; i2 < list.size(); i2++) {
            android.media.AudioProfile audioProfileM29264m = fl$$ExternalSyntheticApiModelOutline1.m29264m((Object) list.get(i2));
            if (audioProfileM29264m.getEncapsulationType() != 1) {
                int format = audioProfileM29264m.getFormat();
                if (Util.isEncodingLinearPcm(format) || ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(Integer.valueOf(format))) {
                    Integer numValueOf = Integer.valueOf(format);
                    if (map.containsKey(numValueOf)) {
                        Set set = (Set) map.get(numValueOf);
                        an.B(set);
                        set.addAll(j.m(audioProfileM29264m.getChannelMasks()));
                    } else {
                        map.put(numValueOf, new HashSet(j.m(audioProfileM29264m.getChannelMasks())));
                    }
                }
            }
        }
        int i3 = bn.f7456d;
        bi biVar = new bi();
        for (Map.Entry entry : map.entrySet()) {
            biVar.g(new AudioProfile(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
        }
        return biVar.f();
    }

    @Deprecated
    public static AudioCapabilities getCapabilities(Context context) {
        return getCapabilities(context, AudioAttributes.DEFAULT, null);
    }

    static AudioCapabilities getCapabilitiesInternal(Context context, Intent intent, AudioAttributes audioAttributes, AudioDeviceInfo audioDeviceInfo, List<Integer> list) {
        AudioManager audioManager = AudioManagerCompat.getAudioManager(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? Api33.getDefaultRoutedDeviceForAttributes(audioManager, audioAttributes) : null;
        }
        bn<Integer> loudspeakerLayoutChannelMasks = audioDeviceInfo != null ? SpeakerLayoutUtil.getLoudspeakerLayoutChannelMasks(audioDeviceInfo) : DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS;
        if (Build.VERSION.SDK_INT >= 33 && (Util.isTv(context) || Util.isAutomotive(context))) {
            return Api33.getCapabilitiesInternalForDirectPlayback(audioManager, audioAttributes, loudspeakerLayoutChannelMasks, list);
        }
        if (isBluetoothConnected(audioManager, audioDeviceInfo)) {
            return new AudioCapabilities(bn.q(AudioProfile.DEFAULT_AUDIO_PROFILE), loudspeakerLayoutChannelMasks, list);
        }
        cg cgVar = new cg();
        cgVar.b(2);
        if (Util.isTv(context) || Util.isAutomotive(context)) {
            cgVar.h(Api29.getDirectPlaybackSupportedEncodings(audioAttributes));
            return new AudioCapabilities(getAudioProfiles(j.o(cgVar.f()), 10), loudspeakerLayoutChannelMasks, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, FORCE_EXTERNAL_SURROUND_SOUND_KEY, 0) == 1;
        if ((z || deviceMaySetExternalSurroundSoundGlobalSetting()) && Settings.Global.getInt(contentResolver, EXTERNAL_SURROUND_SOUND_KEY, 0) == 1) {
            cgVar.h(EXTERNAL_SURROUND_SOUND_ENCODINGS);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new AudioCapabilities(getAudioProfiles(j.o(cgVar.f()), 10), loudspeakerLayoutChannelMasks, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            cgVar.h(j.m(intArrayExtra));
        }
        return new AudioCapabilities(getAudioProfiles(j.o(cgVar.f()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), loudspeakerLayoutChannelMasks, list);
    }

    private static int getChannelConfigForPassthrough(int i2, Format format) {
        String str = MediaLibraryInfo.TAG;
        int i3 = format.channelMask;
        return (i3 == -1 || format.channelCount != i2) ? Util.getAudioTrackChannelConfig(i2) : i3;
    }

    static Uri getExternalSurroundSoundGlobalSettingUri() {
        if (deviceMaySetExternalSurroundSoundGlobalSetting()) {
            return Settings.Global.getUriFor(EXTERNAL_SURROUND_SOUND_KEY);
        }
        return null;
    }

    private static boolean isBluetoothConnected(AudioManager audioManager, AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo[] devices;
        if (audioDeviceInfo == null) {
            an.B(audioManager);
            devices = audioManager.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[]{audioDeviceInfo};
        }
        for (AudioDeviceInfo audioDeviceInfo2 : devices) {
            if (DeviceTypeUtil.isBluetoothDevice(audioDeviceInfo2.getType())) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioCapabilities)) {
            return false;
        }
        AudioCapabilities audioCapabilities = (AudioCapabilities) obj;
        return Util.contentEquals(this.encodingToAudioProfile, audioCapabilities.encodingToAudioProfile) && this.maxChannelCount == audioCapabilities.maxChannelCount && Objects.equals(this.speakerLayoutChannelMasks, audioCapabilities.speakerLayoutChannelMasks) && Objects.equals(this.spatializerChannelMasks, audioCapabilities.spatializerChannelMasks);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038 A[PHI: r0
  0x0038: PHI (r0v3 int) = (r0v2 int), (r0v6 int) binds: [B:12:0x002c, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair<java.lang.Integer, java.lang.Integer> getEncodingAndChannelConfigForPassthrough(androidx.media3.common.Format r5, androidx.media3.common.AudioAttributes r6) {
        /*
            r4 = this;
            java.lang.String r0 = r5.sampleMimeType
            com.google.d.b.an.B(r0)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r5.codecs
            int r0 = androidx.media3.common.MimeTypes.getEncoding(r0, r1)
            com.google.d.d.bs<java.lang.Integer, java.lang.Integer> r1 = androidx.media3.exoplayer.audio.AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L1c
            goto L99
        L1c:
            r1 = 18
            if (r0 != r1) goto L29
            boolean r0 = r4.supportsEncoding(r1)
            if (r0 != 0) goto L28
            r0 = 6
            goto L43
        L28:
            r0 = r1
        L29:
            r2 = 7
            r3 = 8
            if (r0 != r3) goto L38
            boolean r0 = r4.supportsEncoding(r3)
            if (r0 == 0) goto L36
            r0 = r3
            goto L38
        L36:
            r0 = r2
            goto L43
        L38:
            r3 = 30
            if (r0 != r3) goto L43
            boolean r3 = r4.supportsEncoding(r3)
            if (r3 != 0) goto L43
            goto L36
        L43:
            boolean r2 = r4.supportsEncoding(r0)
            if (r2 == 0) goto L99
            android.util.SparseArray<androidx.media3.exoplayer.audio.AudioCapabilities$AudioProfile> r4 = r4.encodingToAudioProfile
            java.lang.Object r4 = r4.get(r0)
            androidx.media3.exoplayer.audio.AudioCapabilities$AudioProfile r4 = (androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile) r4
            com.google.d.b.an.B(r4)
            r2 = r4
            androidx.media3.exoplayer.audio.AudioCapabilities$AudioProfile r2 = (androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile) r2
            int r2 = r5.channelCount
            r3 = -1
            if (r2 == r3) goto L7b
            if (r0 != r1) goto L5f
            goto L7b
        L5f:
            java.lang.String r6 = r5.sampleMimeType
            java.lang.String r1 = "audio/vnd.dts.uhd;profile=p2"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L74
            int r6 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r6 >= r1) goto L74
            r4 = 10
            if (r2 <= r4) goto L86
            goto L99
        L74:
            boolean r4 = androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile.m12549$$Nest$msupportsChannelConfig(r4, r2, r5)
            if (r4 != 0) goto L86
            goto L99
        L7b:
            int r1 = r5.sampleRate
            if (r1 != r3) goto L82
            r1 = 48000(0xbb80, float:6.7262E-41)
        L82:
            int r2 = r4.getMaxSupportedChannelCountForPassthrough(r1, r6)
        L86:
            int r4 = getChannelConfigForPassthrough(r2, r5)
            if (r4 == 0) goto L99
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            android.util.Pair r4 = android.util.Pair.create(r5, r4)
            return r4
        L99:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.AudioCapabilities.getEncodingAndChannelConfigForPassthrough(androidx.media3.common.Format, androidx.media3.common.AudioAttributes):android.util.Pair");
    }

    public int getMaxChannelCount() {
        return this.maxChannelCount;
    }

    public bn<Integer> getSpatializerChannelMasks() {
        return this.spatializerChannelMasks;
    }

    public bn<Integer> getSpeakerLayoutChannelMasks() {
        return this.speakerLayoutChannelMasks;
    }

    public int hashCode() {
        return (((((this.maxChannelCount * 31) + Util.contentHashCode(this.encodingToAudioProfile)) * 31) + Objects.hashCode(this.speakerLayoutChannelMasks)) * 31) + Objects.hashCode(this.spatializerChannelMasks);
    }

    public boolean isPassthroughPlaybackSupported(Format format, AudioAttributes audioAttributes) {
        return getEncodingAndChannelConfigForPassthrough(format, audioAttributes) != null;
    }

    public boolean supportsEncoding(int i2) {
        return Util.contains(this.encodingToAudioProfile, i2);
    }

    public String toString() {
        bn<Integer> bnVar = this.spatializerChannelMasks;
        bn<Integer> bnVar2 = this.speakerLayoutChannelMasks;
        return "AudioCapabilities[maxChannelCount=" + this.maxChannelCount + ", audioProfiles=" + String.valueOf(this.encodingToAudioProfile) + ", speakerLayoutChannelMasks=" + String.valueOf(bnVar2) + ", spatializerChannelMasks=" + String.valueOf(bnVar) + "]";
    }

    @Deprecated
    public static AudioCapabilities getCapabilities(Context context, AudioAttributes audioAttributes, AudioDeviceInfo audioDeviceInfo) {
        return getCapabilities(context, audioAttributes, audioDeviceInfo, DEFAULT_EMPTY_SPATIALIZER_CHANNEL_MASKS);
    }

    public static AudioCapabilities getCapabilities(Context context, AudioAttributes audioAttributes, AudioDeviceInfo audioDeviceInfo, List<Integer> list) {
        return getCapabilitiesInternal(context, audioAttributes, audioDeviceInfo, list);
    }

    @Deprecated
    public boolean isPassthroughPlaybackSupported(Format format) {
        return isPassthroughPlaybackSupported(format, AudioAttributes.DEFAULT);
    }

    /* compiled from: WazeSource */
    final class AudioProfile {
        public static final AudioProfile DEFAULT_AUDIO_PROFILE;
        private final ci<Integer> channelMasks;
        public final int encoding;
        public final int maxChannelCount;

        static {
            DEFAULT_AUDIO_PROFILE = Build.VERSION.SDK_INT >= 33 ? new AudioProfile(2, getAllChannelMasksForMaxChannelCount(10)) : new AudioProfile(2, 10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AudioProfile(int i2, Set<Integer> set) {
            this.encoding = i2;
            ci<Integer> ciVarM = ci.m(set);
            this.channelMasks = ciVarM;
            fu fuVarListIterator = ciVarM.listIterator();
            int iMax = 0;
            while (fuVarListIterator.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(((Integer) fuVarListIterator.next()).intValue()));
            }
            this.maxChannelCount = iMax;
        }

        private static ci<Integer> getAllChannelMasksForMaxChannelCount(int i2) {
            cg cgVar = new cg();
            for (int i3 = 1; i3 <= i2; i3++) {
                cgVar.b(Integer.valueOf(Util.getAudioTrackChannelConfig(i3)));
            }
            return cgVar.f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean supportsChannelConfig(int i2, Format format) {
            if (this.channelMasks == null) {
                return i2 <= this.maxChannelCount;
            }
            int audioTrackChannelConfig = format.channelMask;
            if (audioTrackChannelConfig == -1 || format.channelCount != i2) {
                audioTrackChannelConfig = Util.getAudioTrackChannelConfig(i2);
            }
            if (audioTrackChannelConfig == 0) {
                return false;
            }
            return this.channelMasks.contains(Integer.valueOf(audioTrackChannelConfig));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioProfile)) {
                return false;
            }
            AudioProfile audioProfile = (AudioProfile) obj;
            return this.encoding == audioProfile.encoding && this.maxChannelCount == audioProfile.maxChannelCount && Objects.equals(this.channelMasks, audioProfile.channelMasks);
        }

        public int getMaxSupportedChannelCountForPassthrough(int i2, AudioAttributes audioAttributes) {
            return this.channelMasks != null ? this.maxChannelCount : Api29.getMaxSupportedChannelCountForPassthrough(this.encoding, i2, audioAttributes);
        }

        public int hashCode() {
            ci<Integer> ciVar = this.channelMasks;
            return (((this.encoding * 31) + this.maxChannelCount) * 31) + (ciVar == null ? 0 : ciVar.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.encoding + ", maxChannelCount=" + this.maxChannelCount + ", channelMasks=" + String.valueOf(this.channelMasks) + "]";
        }

        public AudioProfile(int i2, int i3) {
            this.encoding = i2;
            this.maxChannelCount = i3;
            this.channelMasks = null;
        }
    }

    @Deprecated
    public AudioCapabilities(int[] iArr, int i2) {
        this(getAudioProfiles(iArr, i2), DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS, DEFAULT_EMPTY_SPATIALIZER_CHANNEL_MASKS);
    }

    AudioCapabilities(int[] iArr, int i2, List<Integer> list, List<Integer> list2) {
        this(getAudioProfiles(iArr, i2), list, list2);
    }

    @Deprecated
    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(Format format) {
        return getEncodingAndChannelConfigForPassthrough(format, AudioAttributes.DEFAULT);
    }

    private static bn<AudioProfile> getAudioProfiles(int[] iArr, int i2) {
        int i3 = bn.f7456d;
        bi biVar = new bi();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i4 : iArr) {
            biVar.g(new AudioProfile(i4, i2));
        }
        return biVar.f();
    }

    static AudioCapabilities getCapabilitiesInternal(Context context, AudioAttributes audioAttributes, AudioDeviceInfo audioDeviceInfo, List<Integer> list) {
        return getCapabilitiesInternal(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), audioAttributes, audioDeviceInfo, list);
    }
}
