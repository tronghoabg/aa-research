package androidx.media;

import android.media.VolumeProvider;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes3.dex */
public abstract class VolumeProviderCompat {
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;
    private Callback mCallback;
    private final String mControlId;
    private final int mControlType;
    private int mCurrentVolume;
    private final int mMaxVolume;
    private VolumeProvider mVolumeProviderFwk;

    /* compiled from: WazeSource */
    class Api21Impl {
        private Api21Impl() {
        }

        static void setCurrentVolume(VolumeProvider volumeProvider, int i2) {
            volumeProvider.setCurrentVolume(i2);
        }
    }

    /* compiled from: WazeSource */
    public abstract class Callback {
        public abstract void onVolumeChanged(VolumeProviderCompat volumeProviderCompat);
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ControlType {
    }

    public VolumeProviderCompat(int i2, int i3, int i4, String str) {
        this.mControlType = i2;
        this.mMaxVolume = i3;
        this.mCurrentVolume = i4;
        this.mControlId = str;
    }

    public final int getCurrentVolume() {
        return this.mCurrentVolume;
    }

    public final int getMaxVolume() {
        return this.mMaxVolume;
    }

    public final int getVolumeControl() {
        return this.mControlType;
    }

    public final String getVolumeControlId() {
        return this.mControlId;
    }

    public Object getVolumeProvider() {
        VolumeProviderCompat volumeProviderCompat;
        if (this.mVolumeProviderFwk == null) {
            int i2 = Build.VERSION.SDK_INT;
            int i3 = this.mControlType;
            if (i2 >= 30) {
                volumeProviderCompat = this;
                volumeProviderCompat.mVolumeProviderFwk = new VolumeProvider(i3, this.mMaxVolume, this.mCurrentVolume, this.mControlId) { // from class: androidx.media.VolumeProviderCompat.1
                    @Override // android.media.VolumeProvider
                    public void onAdjustVolume(int i4) {
                        VolumeProviderCompat.this.onAdjustVolume(i4);
                    }

                    @Override // android.media.VolumeProvider
                    public void onSetVolumeTo(int i4) {
                        VolumeProviderCompat.this.onSetVolumeTo(i4);
                    }
                };
            } else {
                volumeProviderCompat = this;
                volumeProviderCompat.mVolumeProviderFwk = new VolumeProvider(i3, volumeProviderCompat.mMaxVolume, volumeProviderCompat.mCurrentVolume) { // from class: androidx.media.VolumeProviderCompat.2
                    @Override // android.media.VolumeProvider
                    public void onAdjustVolume(int i4) {
                        VolumeProviderCompat.this.onAdjustVolume(i4);
                    }

                    @Override // android.media.VolumeProvider
                    public void onSetVolumeTo(int i4) {
                        VolumeProviderCompat.this.onSetVolumeTo(i4);
                    }
                };
            }
        } else {
            volumeProviderCompat = this;
        }
        return volumeProviderCompat.mVolumeProviderFwk;
    }

    public void onAdjustVolume(int i2) {
    }

    public void onSetVolumeTo(int i2) {
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public final void setCurrentVolume(int i2) {
        this.mCurrentVolume = i2;
        Api21Impl.setCurrentVolume((VolumeProvider) getVolumeProvider(), i2);
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.onVolumeChanged(this);
        }
    }

    public VolumeProviderCompat(int i2, int i3, int i4) {
        this(i2, i3, i4, null);
    }
}
