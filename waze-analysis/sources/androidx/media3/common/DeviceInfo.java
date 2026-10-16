package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DeviceInfo {
    public static final int PLAYBACK_TYPE_LOCAL = 0;
    public static final int PLAYBACK_TYPE_REMOTE = 1;
    public final int maxVolume;
    public final int minVolume;
    public final int playbackType;
    public final String routingControllerId;
    public static final DeviceInfo UNKNOWN = new Builder(0).build();
    private static final String FIELD_PLAYBACK_TYPE = Util.intToStringMaxRadix(0);
    private static final String FIELD_MIN_VOLUME = Util.intToStringMaxRadix(1);
    private static final String FIELD_MAX_VOLUME = Util.intToStringMaxRadix(2);
    private static final String FIELD_ROUTING_CONTROLLER_ID = Util.intToStringMaxRadix(3);

    /* compiled from: WazeSource */
    public final class Builder {
        private int maxVolume;
        private int minVolume;
        private final int playbackType;
        private String routingControllerId;

        public Builder(int i2) {
            this.playbackType = i2;
        }

        public DeviceInfo build() {
            an.l(this.minVolume <= this.maxVolume);
            return new DeviceInfo(this);
        }

        public Builder setMaxVolume(int i2) {
            this.maxVolume = i2;
            return this;
        }

        public Builder setMinVolume(int i2) {
            this.minVolume = i2;
            return this;
        }

        public Builder setRoutingControllerId(String str) {
            boolean z = true;
            if (this.playbackType == 0 && str != null) {
                z = false;
            }
            an.l(z);
            this.routingControllerId = str;
            return this;
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackType {
    }

    private DeviceInfo(Builder builder) {
        this.playbackType = builder.playbackType;
        this.minVolume = builder.minVolume;
        this.maxVolume = builder.maxVolume;
        this.routingControllerId = builder.routingControllerId;
    }

    public static DeviceInfo fromBundle(Bundle bundle) {
        int i2 = bundle.getInt(FIELD_PLAYBACK_TYPE, 0);
        int i3 = bundle.getInt(FIELD_MIN_VOLUME, 0);
        int i4 = bundle.getInt(FIELD_MAX_VOLUME, 0);
        String string = bundle.getString(FIELD_ROUTING_CONTROLLER_ID);
        Builder builder = new Builder(i2);
        builder.setMinVolume(i3);
        builder.setMaxVolume(i4);
        builder.setRoutingControllerId(string);
        return builder.build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return this.playbackType == deviceInfo.playbackType && this.minVolume == deviceInfo.minVolume && this.maxVolume == deviceInfo.maxVolume && Objects.equals(this.routingControllerId, deviceInfo.routingControllerId);
    }

    public int hashCode() {
        String str = this.routingControllerId;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i2 = this.playbackType;
        return ((((((i2 + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + this.minVolume) * 31) + this.maxVolume) * 31) + iHashCode;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i2 = this.playbackType;
        if (i2 != 0) {
            bundle.putInt(FIELD_PLAYBACK_TYPE, i2);
        }
        int i3 = this.minVolume;
        if (i3 != 0) {
            bundle.putInt(FIELD_MIN_VOLUME, i3);
        }
        int i4 = this.maxVolume;
        if (i4 != 0) {
            bundle.putInt(FIELD_MAX_VOLUME, i4);
        }
        String str = this.routingControllerId;
        if (str != null) {
            bundle.putString(FIELD_ROUTING_CONTROLLER_ID, str);
        }
        return bundle;
    }

    @Deprecated
    public DeviceInfo(int i2, int i3, int i4) {
        Builder builder = new Builder(i2);
        builder.setMinVolume(i3);
        builder.setMaxVolume(i4);
        this(builder);
    }
}
