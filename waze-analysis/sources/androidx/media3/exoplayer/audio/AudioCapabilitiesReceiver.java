package androidx.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.util.SpatializerWrapper;
import com.google.d.b.an;
import com.google.d.d.bn;
import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AudioCapabilitiesReceiver {
    private AudioAttributes audioAttributes;
    private AudioCapabilities audioCapabilities;
    private final AudioDeviceCallback audioDeviceCallback;
    private final Context context;
    private final ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver;
    private final Handler handler;
    private final BroadcastReceiver hdmiAudioPlugBroadcastReceiver;
    private final Listener listener;
    private boolean registered;
    private AudioDeviceInfo routedDevice;
    private SpatializerWrapper spatializer;

    /* compiled from: WazeSource */
    final class AudioDeviceCallback extends android.media.AudioDeviceCallback {
        final /* synthetic */ AudioCapabilitiesReceiver this$0;

        private AudioDeviceCallback(AudioCapabilitiesReceiver audioCapabilitiesReceiver) {
            Objects.requireNonNull(audioCapabilitiesReceiver);
            this.this$0 = audioCapabilitiesReceiver;
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            this.this$0.updateCurrentAudioCapabilities();
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (Util.contains(audioDeviceInfoArr, this.this$0.routedDevice)) {
                this.this$0.routedDevice = null;
            }
            this.this$0.updateCurrentAudioCapabilities();
        }
    }

    /* compiled from: WazeSource */
    final class ExternalSurroundSoundSettingObserver extends ContentObserver {
        private final ContentResolver resolver;
        private final Uri settingUri;
        final /* synthetic */ AudioCapabilitiesReceiver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExternalSurroundSoundSettingObserver(AudioCapabilitiesReceiver audioCapabilitiesReceiver, Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            Objects.requireNonNull(audioCapabilitiesReceiver);
            this.this$0 = audioCapabilitiesReceiver;
            this.resolver = contentResolver;
            this.settingUri = uri;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            this.this$0.updateCurrentAudioCapabilities();
        }

        public void register() {
            this.resolver.registerContentObserver(this.settingUri, false, this);
        }

        public void unregister() {
            this.resolver.unregisterContentObserver(this);
        }
    }

    /* compiled from: WazeSource */
    final class HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver {
        final /* synthetic */ AudioCapabilitiesReceiver this$0;

        private HdmiAudioPlugBroadcastReceiver(AudioCapabilitiesReceiver audioCapabilitiesReceiver) {
            Objects.requireNonNull(audioCapabilitiesReceiver);
            this.this$0 = audioCapabilitiesReceiver;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.this$0;
            audioCapabilitiesReceiver.onNewAudioCapabilities(AudioCapabilities.getCapabilitiesInternal(context, intent, audioCapabilitiesReceiver.audioAttributes, audioCapabilitiesReceiver.routedDevice, audioCapabilitiesReceiver.getSpatializerChannelMasks()));
        }
    }

    /* compiled from: WazeSource */
    public interface Listener {
        void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioCapabilitiesReceiver(Context context, Listener listener, AudioAttributes audioAttributes, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        an.B(listener);
        this.listener = listener;
        this.audioAttributes = audioAttributes;
        this.routedDevice = audioDeviceInfo;
        Handler handlerCreateHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper();
        this.handler = handlerCreateHandlerForCurrentOrMainLooper;
        this.audioDeviceCallback = new AudioDeviceCallback();
        this.hdmiAudioPlugBroadcastReceiver = new HdmiAudioPlugBroadcastReceiver();
        Uri externalSurroundSoundGlobalSettingUri = AudioCapabilities.getExternalSurroundSoundGlobalSettingUri();
        this.externalSurroundSoundSettingObserver = externalSurroundSoundGlobalSettingUri != null ? new ExternalSurroundSoundSettingObserver(this, handlerCreateHandlerForCurrentOrMainLooper, applicationContext.getContentResolver(), externalSurroundSoundGlobalSettingUri) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Integer> getSpatializerChannelMasks() {
        SpatializerWrapper spatializerWrapper;
        return (Build.VERSION.SDK_INT < 32 || (spatializerWrapper = this.spatializer) == null) ? bn.p() : spatializerWrapper.getSpatializedChannelMasks();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNewAudioCapabilities(AudioCapabilities audioCapabilities) {
        if (!this.registered || audioCapabilities.equals(this.audioCapabilities)) {
            return;
        }
        this.audioCapabilities = audioCapabilities;
        this.listener.onAudioCapabilitiesChanged(audioCapabilities);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCurrentAudioCapabilities() {
        onNewAudioCapabilities(AudioCapabilities.getCapabilitiesInternal(this.context, this.audioAttributes, this.routedDevice, getSpatializerChannelMasks()));
    }

    public void overrideCapabilities(AudioCapabilities audioCapabilities) {
        onNewAudioCapabilities(audioCapabilities);
    }

    public AudioCapabilities register() {
        if (this.registered) {
            AudioCapabilities audioCapabilities = this.audioCapabilities;
            an.B(audioCapabilities);
            return audioCapabilities;
        }
        this.registered = true;
        ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver = this.externalSurroundSoundSettingObserver;
        if (externalSurroundSoundSettingObserver != null) {
            externalSurroundSoundSettingObserver.register();
        }
        Context context = this.context;
        AudioManagerCompat.getAudioManager(context).registerAudioDeviceCallback(this.audioDeviceCallback, this.handler);
        if (Build.VERSION.SDK_INT >= 32 && this.spatializer == null) {
            Context context2 = this.context;
            this.spatializer = new SpatializerWrapper(context2, new Runnable() { // from class: androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.updateCurrentAudioCapabilities();
                }
            }, Boolean.valueOf(Util.isTv(context2)));
        }
        AudioCapabilities capabilitiesInternal = AudioCapabilities.getCapabilitiesInternal(this.context, this.context.registerReceiver(this.hdmiAudioPlugBroadcastReceiver, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.handler), this.audioAttributes, this.routedDevice, getSpatializerChannelMasks());
        this.audioCapabilities = capabilitiesInternal;
        return capabilitiesInternal;
    }

    public void setAudioAttributes(AudioAttributes audioAttributes) {
        if (Objects.equals(audioAttributes, this.audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        onNewAudioCapabilities(AudioCapabilities.getCapabilitiesInternal(this.context, audioAttributes, this.routedDevice, getSpatializerChannelMasks()));
    }

    public void setRoutedDevice(AudioDeviceInfo audioDeviceInfo) {
        if (Objects.equals(audioDeviceInfo, this.routedDevice)) {
            return;
        }
        this.routedDevice = audioDeviceInfo;
        onNewAudioCapabilities(AudioCapabilities.getCapabilitiesInternal(this.context, this.audioAttributes, audioDeviceInfo, getSpatializerChannelMasks()));
    }

    public void unregister() {
        SpatializerWrapper spatializerWrapper;
        if (this.registered) {
            this.audioCapabilities = null;
            AudioManagerCompat.getAudioManager(this.context).unregisterAudioDeviceCallback(this.audioDeviceCallback);
            if (Build.VERSION.SDK_INT >= 32 && (spatializerWrapper = this.spatializer) != null) {
                spatializerWrapper.release();
                this.spatializer = null;
            }
            this.context.unregisterReceiver(this.hdmiAudioPlugBroadcastReceiver);
            ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver = this.externalSurroundSoundSettingObserver;
            if (externalSurroundSoundSettingObserver != null) {
                externalSurroundSoundSettingObserver.unregister();
            }
            this.registered = false;
        }
    }

    @Deprecated
    public AudioCapabilitiesReceiver(Context context, Listener listener) {
        this(context, listener, AudioAttributes.DEFAULT, null);
    }
}
