package androidx.media3.common;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.common.util.Util;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AudioAttributes {
    public final int allowedCapturePolicy;
    public final int contentType;
    public final int flags;
    public final boolean hapticChannelsMuted;
    public final boolean isContentSpatialized;
    private android.media.AudioAttributes platformAudioAttributes;
    public final int spatializationBehavior;
    public final int usage;
    public static final AudioAttributes DEFAULT = new Builder().build();
    private static final String FIELD_CONTENT_TYPE = Util.intToStringMaxRadix(0);
    private static final String FIELD_FLAGS = Util.intToStringMaxRadix(1);
    private static final String FIELD_USAGE = Util.intToStringMaxRadix(2);
    private static final String FIELD_ALLOWED_CAPTURE_POLICY = Util.intToStringMaxRadix(3);
    private static final String FIELD_SPATIALIZATION_BEHAVIOR = Util.intToStringMaxRadix(4);
    private static final String FIELD_IS_CONTENT_SPATIALIZED = Util.intToStringMaxRadix(5);
    private static final String FIELD_HAPTIC_CHANNELS_MUTED = Util.intToStringMaxRadix(6);

    /* compiled from: WazeSource */
    final class Api29 {
        private Api29() {
        }

        public static void setAllowedCapturePolicy(AudioAttributes.Builder builder, int i2) {
            builder.setAllowedCapturePolicy(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void setHapticChannelsMuted(AudioAttributes.Builder builder, boolean z) {
            builder.setHapticChannelsMuted(z);
        }
    }

    /* compiled from: WazeSource */
    final class Api32 {
        private Api32() {
        }

        public static void setIsContentSpatialized(AudioAttributes.Builder builder, boolean z) {
            builder.setIsContentSpatialized(z);
        }

        public static void setSpatializationBehavior(AudioAttributes.Builder builder, int i2) {
            builder.setSpatializationBehavior(i2);
        }
    }

    /* compiled from: WazeSource */
    @Deprecated
    public final class AudioAttributesV21 {
        public final android.media.AudioAttributes audioAttributes;

        private AudioAttributesV21(android.media.AudioAttributes audioAttributes) {
            this.audioAttributes = audioAttributes;
        }
    }

    private AudioAttributes(int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        this.contentType = i2;
        this.flags = i3;
        this.usage = i4;
        this.allowedCapturePolicy = i5;
        this.spatializationBehavior = i6;
        this.isContentSpatialized = z;
        this.hapticChannelsMuted = z2;
    }

    public static AudioAttributes fromBundle(Bundle bundle) {
        Builder builder = new Builder();
        String str = FIELD_CONTENT_TYPE;
        if (bundle.containsKey(str)) {
            builder.setContentType(bundle.getInt(str));
        }
        String str2 = FIELD_FLAGS;
        if (bundle.containsKey(str2)) {
            builder.setFlags(bundle.getInt(str2));
        }
        String str3 = FIELD_USAGE;
        if (bundle.containsKey(str3)) {
            builder.setUsage(bundle.getInt(str3));
        }
        String str4 = FIELD_ALLOWED_CAPTURE_POLICY;
        if (bundle.containsKey(str4)) {
            builder.setAllowedCapturePolicy(bundle.getInt(str4));
        }
        String str5 = FIELD_SPATIALIZATION_BEHAVIOR;
        if (bundle.containsKey(str5)) {
            builder.setSpatializationBehavior(bundle.getInt(str5));
        }
        String str6 = FIELD_IS_CONTENT_SPATIALIZED;
        if (bundle.containsKey(str6)) {
            builder.setIsContentSpatialized(bundle.getBoolean(str6));
        }
        String str7 = FIELD_HAPTIC_CHANNELS_MUTED;
        if (bundle.containsKey(str7)) {
            builder.setHapticChannelsMuted(bundle.getBoolean(str7));
        }
        return builder.build();
    }

    public static AudioAttributes fromPlatformAudioAttributes(android.media.AudioAttributes audioAttributes) {
        Builder builder = new Builder();
        builder.setContentType(audioAttributes.getContentType());
        builder.setFlags(audioAttributes.getFlags());
        builder.setUsage(audioAttributes.getUsage());
        builder.setAllowedCapturePolicy(audioAttributes.getAllowedCapturePolicy());
        builder.setHapticChannelsMuted(audioAttributes.areHapticChannelsMuted());
        if (Build.VERSION.SDK_INT >= 32) {
            builder.setSpatializationBehavior(audioAttributes.getSpatializationBehavior());
            builder.setIsContentSpatialized(audioAttributes.isContentSpatialized());
        }
        return builder.build();
    }

    private int getStreamTypeInternal() {
        try {
            int volumeControlStream = getPlatformAudioAttributes().getVolumeControlStream();
            if (volumeControlStream == Integer.MIN_VALUE) {
                return 3;
            }
            return volumeControlStream;
        } catch (RuntimeException unused) {
            return 3;
        }
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AudioAttributes audioAttributes = (AudioAttributes) obj;
            if (this.contentType == audioAttributes.contentType && this.flags == audioAttributes.flags && this.usage == audioAttributes.usage && this.allowedCapturePolicy == audioAttributes.allowedCapturePolicy && this.spatializationBehavior == audioAttributes.spatializationBehavior && this.isContentSpatialized == audioAttributes.isContentSpatialized && this.hapticChannelsMuted == audioAttributes.hapticChannelsMuted) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public AudioAttributesV21 getAudioAttributesV21() {
        return new AudioAttributesV21(getPlatformAudioAttributes());
    }

    public android.media.AudioAttributes getPlatformAudioAttributes() {
        android.media.AudioAttributes audioAttributes = this.platformAudioAttributes;
        if (audioAttributes != null) {
            return audioAttributes;
        }
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.contentType).setFlags(this.flags).setUsage(this.usage);
        Api29.setAllowedCapturePolicy(usage, this.allowedCapturePolicy);
        Api29.setHapticChannelsMuted(usage, this.hapticChannelsMuted);
        if (Build.VERSION.SDK_INT >= 32) {
            Api32.setSpatializationBehavior(usage, this.spatializationBehavior);
            Api32.setIsContentSpatialized(usage, this.isContentSpatialized);
        }
        android.media.AudioAttributes audioAttributesBuild = usage.build();
        this.platformAudioAttributes = audioAttributesBuild;
        return audioAttributesBuild;
    }

    @Deprecated
    public int getStreamType() {
        return getStreamTypeInternal();
    }

    public int getVolumeControlStream() {
        return getStreamTypeInternal();
    }

    public int hashCode() {
        return ((((((((((((this.contentType + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + this.flags) * 31) + this.usage) * 31) + this.allowedCapturePolicy) * 31) + this.spatializationBehavior) * 31) + (this.isContentSpatialized ? 1 : 0)) * 31) + (this.hapticChannelsMuted ? 1 : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i2 = this.contentType;
        if (i2 != 0) {
            bundle.putInt(FIELD_CONTENT_TYPE, i2);
        }
        int i3 = this.flags;
        if (i3 != 0) {
            bundle.putInt(FIELD_FLAGS, i3);
        }
        int i4 = this.usage;
        if (i4 != 1) {
            bundle.putInt(FIELD_USAGE, i4);
        }
        int i5 = this.allowedCapturePolicy;
        if (i5 != 1) {
            bundle.putInt(FIELD_ALLOWED_CAPTURE_POLICY, i5);
        }
        int i6 = this.spatializationBehavior;
        if (i6 != 0) {
            bundle.putInt(FIELD_SPATIALIZATION_BEHAVIOR, i6);
        }
        if (this.isContentSpatialized) {
            bundle.putBoolean(FIELD_IS_CONTENT_SPATIALIZED, true);
        }
        if (!this.hapticChannelsMuted) {
            bundle.putBoolean(FIELD_HAPTIC_CHANNELS_MUTED, false);
        }
        return bundle;
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private int allowedCapturePolicy;
        private int contentType;
        private int flags;
        private boolean hapticChannelsMuted;
        private boolean isContentSpatialized;
        private int spatializationBehavior;
        private int usage;

        private Builder(AudioAttributes audioAttributes) {
            this.contentType = audioAttributes.contentType;
            this.flags = audioAttributes.flags;
            this.usage = audioAttributes.usage;
            this.allowedCapturePolicy = audioAttributes.allowedCapturePolicy;
            this.spatializationBehavior = audioAttributes.spatializationBehavior;
            this.isContentSpatialized = audioAttributes.isContentSpatialized;
            this.hapticChannelsMuted = audioAttributes.hapticChannelsMuted;
        }

        public AudioAttributes build() {
            return new AudioAttributes(this.contentType, this.flags, this.usage, this.allowedCapturePolicy, this.spatializationBehavior, this.isContentSpatialized, this.hapticChannelsMuted);
        }

        public Builder setAllowedCapturePolicy(int i2) {
            this.allowedCapturePolicy = i2;
            return this;
        }

        public Builder setContentType(int i2) {
            this.contentType = i2;
            return this;
        }

        public Builder setFlags(int i2) {
            this.flags = i2;
            return this;
        }

        public Builder setHapticChannelsMuted(boolean z) {
            this.hapticChannelsMuted = z;
            return this;
        }

        public Builder setIsContentSpatialized(boolean z) {
            this.isContentSpatialized = z;
            return this;
        }

        public Builder setSpatializationBehavior(int i2) {
            this.spatializationBehavior = i2;
            return this;
        }

        public Builder setUsage(int i2) {
            this.usage = i2;
            return this;
        }

        public Builder() {
            this.contentType = 0;
            this.flags = 0;
            this.usage = 1;
            this.allowedCapturePolicy = 1;
            this.spatializationBehavior = 0;
            this.isContentSpatialized = false;
            this.hapticChannelsMuted = true;
        }
    }
}
