package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.StreamVolumeManager;
import com.google.d.b.an;
import com.google.d.b.t;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class StreamVolumeManager {
    private static final String TAG = "StreamVolumeManager";
    private static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private final Context applicationContext;
    private AudioManager audioManager;
    private final Listener listener;
    private VolumeChangeReceiver receiver;
    private final BackgroundThreadStateHandler<StreamVolumeState> stateHandler;
    private int volumeBeforeMute;

    /* compiled from: WazeSource */
    public interface Listener {
        void onStreamTypeChanged(int i2);

        void onStreamVolumeChanged(int i2, boolean z);
    }

    /* compiled from: WazeSource */
    final class StreamVolumeState {
        public final int maxVolume;
        public final int minVolume;
        public final boolean muted;
        public final int streamType;
        public final int volume;

        public StreamVolumeState(int i2, int i3, boolean z, int i4, int i5) {
            this.streamType = i2;
            this.volume = i3;
            this.muted = z;
            this.minVolume = i4;
            this.maxVolume = i5;
        }
    }

    /* compiled from: WazeSource */
    final class VolumeChangeReceiver extends BroadcastReceiver {
        final /* synthetic */ StreamVolumeManager this$0;

        private VolumeChangeReceiver(StreamVolumeManager streamVolumeManager) {
            Objects.requireNonNull(streamVolumeManager);
            this.this$0 = streamVolumeManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceive$0() {
            if (this.this$0.receiver == null) {
                return;
            }
            int i2 = ((StreamVolumeState) this.this$0.stateHandler.get()).streamType;
            StreamVolumeManager streamVolumeManager = this.this$0;
            streamVolumeManager.stateHandler.setStateInBackground(streamVolumeManager.generateState(i2));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            this.this$0.stateHandler.runInBackground(new Runnable() { // from class: androidx.media3.exoplayer.StreamVolumeManager$VolumeChangeReceiver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onReceive$0();
                }
            });
        }
    }

    /* renamed from: $r8$lambda$NOnCdCgaywOGZm3GlR-NFkAgJug, reason: not valid java name */
    public static /* synthetic */ StreamVolumeState m12527$r8$lambda$NOnCdCgaywOGZm3GlRNFkAgJug(StreamVolumeManager streamVolumeManager, StreamVolumeState streamVolumeState) {
        streamVolumeManager.lambda$release$1(streamVolumeState);
        return streamVolumeState;
    }

    public StreamVolumeManager(Context context, Listener listener, final int i2, Looper looper, Looper looper2, Clock clock) {
        this.applicationContext = context.getApplicationContext();
        this.listener = listener;
        BackgroundThreadStateHandler<StreamVolumeState> backgroundThreadStateHandler = new BackgroundThreadStateHandler<>(new StreamVolumeState(i2, 0, false, 0, 0), looper, looper2, clock, new BackgroundThreadStateHandler.StateChangeListener() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
            public final void onStateChanged(Object obj, Object obj2) {
                this.f$0.onStreamVolumeStateChanged((StreamVolumeManager.StreamVolumeState) obj, (StreamVolumeManager.StreamVolumeState) obj2);
            }
        });
        this.stateHandler = backgroundThreadStateHandler;
        backgroundThreadStateHandler.runInBackground(new Runnable() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$new$0(i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StreamVolumeState generateState(int i2) {
        an.B(this.audioManager);
        return new StreamVolumeState(i2, AudioManagerCompat.getStreamVolume(this.audioManager, i2), AudioManagerCompat.isStreamMute(this.audioManager, i2), AudioManagerCompat.getStreamMinVolume(this.audioManager, i2), AudioManagerCompat.getStreamMaxVolume(this.audioManager, i2));
    }

    static /* synthetic */ StreamVolumeState lambda$decreaseVolume$0(StreamVolumeState streamVolumeState) {
        int i2 = streamVolumeState.streamType;
        int i3 = streamVolumeState.volume;
        int i4 = streamVolumeState.minVolume;
        return new StreamVolumeState(i2, i3 > i4 ? i3 - 1 : i4, i3 <= 1, i4, streamVolumeState.maxVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StreamVolumeState lambda$decreaseVolume$1(int i2, StreamVolumeState streamVolumeState) {
        if (streamVolumeState.volume <= streamVolumeState.minVolume) {
            return streamVolumeState;
        }
        AudioManager audioManager = this.audioManager;
        an.B(audioManager);
        audioManager.adjustStreamVolume(streamVolumeState.streamType, -1, i2);
        return generateState(streamVolumeState.streamType);
    }

    static /* synthetic */ StreamVolumeState lambda$increaseVolume$0(StreamVolumeState streamVolumeState) {
        int i2 = streamVolumeState.streamType;
        int i3 = streamVolumeState.volume;
        int i4 = streamVolumeState.maxVolume;
        return new StreamVolumeState(i2, i3 < i4 ? i3 + 1 : i4, false, streamVolumeState.minVolume, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StreamVolumeState lambda$increaseVolume$1(int i2, StreamVolumeState streamVolumeState) {
        if (streamVolumeState.volume >= streamVolumeState.maxVolume) {
            return streamVolumeState;
        }
        AudioManager audioManager = this.audioManager;
        an.B(audioManager);
        audioManager.adjustStreamVolume(streamVolumeState.streamType, 1, i2);
        return generateState(streamVolumeState.streamType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i2) {
        AudioManager audioManager = (AudioManager) this.applicationContext.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        an.B(audioManager);
        this.audioManager = audioManager;
        VolumeChangeReceiver volumeChangeReceiver = new VolumeChangeReceiver();
        try {
            this.applicationContext.registerReceiver(volumeChangeReceiver, new IntentFilter(VOLUME_CHANGED_ACTION));
            this.receiver = volumeChangeReceiver;
        } catch (RuntimeException e2) {
            Log.w(TAG, "Error registering stream volume receiver", e2);
        }
        this.stateHandler.setStateInBackground(generateState(i2));
    }

    static /* synthetic */ StreamVolumeState lambda$release$0(StreamVolumeState streamVolumeState) {
        return streamVolumeState;
    }

    private /* synthetic */ StreamVolumeState lambda$release$1(StreamVolumeState streamVolumeState) {
        VolumeChangeReceiver volumeChangeReceiver = this.receiver;
        if (volumeChangeReceiver != null) {
            try {
                this.applicationContext.unregisterReceiver(volumeChangeReceiver);
            } catch (RuntimeException e2) {
                Log.w(TAG, "Error unregistering stream volume receiver", e2);
            }
            this.receiver = null;
        }
        return streamVolumeState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StreamVolumeState lambda$setMuted$0(boolean z, StreamVolumeState streamVolumeState) {
        return new StreamVolumeState(streamVolumeState.streamType, streamVolumeState.muted == z ? streamVolumeState.volume : z ? 0 : this.volumeBeforeMute, z, streamVolumeState.minVolume, streamVolumeState.maxVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StreamVolumeState lambda$setMuted$1(boolean z, int i2, StreamVolumeState streamVolumeState) {
        if (streamVolumeState.muted == z) {
            return streamVolumeState;
        }
        an.B(this.audioManager);
        this.audioManager.adjustStreamVolume(streamVolumeState.streamType, true != z ? 100 : -100, i2);
        return generateState(streamVolumeState.streamType);
    }

    static /* synthetic */ StreamVolumeState lambda$setStreamType$0(int i2, StreamVolumeState streamVolumeState) {
        return new StreamVolumeState(i2, streamVolumeState.volume, streamVolumeState.muted, streamVolumeState.minVolume, streamVolumeState.maxVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StreamVolumeState lambda$setStreamType$1(int i2, StreamVolumeState streamVolumeState) {
        return streamVolumeState.streamType == i2 ? streamVolumeState : generateState(i2);
    }

    static /* synthetic */ StreamVolumeState lambda$setVolume$0(int i2, StreamVolumeState streamVolumeState) {
        int i3 = streamVolumeState.streamType;
        int i4 = streamVolumeState.minVolume;
        return new StreamVolumeState(i3, (i2 < i4 || i2 > streamVolumeState.maxVolume) ? streamVolumeState.volume : i2, i2 == 0, i4, streamVolumeState.maxVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StreamVolumeState lambda$setVolume$1(int i2, int i3, StreamVolumeState streamVolumeState) {
        if (i2 == streamVolumeState.volume || i2 < streamVolumeState.minVolume || i2 > streamVolumeState.maxVolume) {
            return streamVolumeState;
        }
        AudioManager audioManager = this.audioManager;
        an.B(audioManager);
        audioManager.setStreamVolume(streamVolumeState.streamType, i2, i3);
        return generateState(streamVolumeState.streamType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStreamVolumeStateChanged(StreamVolumeState streamVolumeState, StreamVolumeState streamVolumeState2) {
        boolean z = streamVolumeState.muted;
        if (!z && streamVolumeState2.muted) {
            this.volumeBeforeMute = streamVolumeState.volume;
        }
        int i2 = streamVolumeState.volume;
        int i3 = streamVolumeState2.volume;
        if (i2 != i3 || z != streamVolumeState2.muted) {
            this.listener.onStreamVolumeChanged(i3, streamVolumeState2.muted);
        }
        int i4 = streamVolumeState.streamType;
        int i5 = streamVolumeState2.streamType;
        if (i4 == i5 && streamVolumeState.minVolume == streamVolumeState2.minVolume && streamVolumeState.maxVolume == streamVolumeState2.maxVolume) {
            return;
        }
        this.listener.onStreamTypeChanged(i5);
    }

    public void decreaseVolume(final int i2) {
        this.stateHandler.updateStateAsync(new t() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda2
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return StreamVolumeManager.lambda$decreaseVolume$0((StreamVolumeManager.StreamVolumeState) obj);
            }
        }, new t() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda3
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return this.f$0.lambda$decreaseVolume$1(i2, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }

    public int getMaxVolume() {
        return this.stateHandler.get().maxVolume;
    }

    public int getMinVolume() {
        return this.stateHandler.get().minVolume;
    }

    public int getVolume() {
        return this.stateHandler.get().volume;
    }

    public void increaseVolume(final int i2) {
        this.stateHandler.updateStateAsync(new t() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda12
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return StreamVolumeManager.lambda$increaseVolume$0((StreamVolumeManager.StreamVolumeState) obj);
            }
        }, new t() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda13
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return this.f$0.lambda$increaseVolume$1(i2, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }

    public boolean isMuted() {
        return this.stateHandler.get().muted;
    }

    public void release() {
        this.stateHandler.updateStateAsync(new t() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda10
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return (StreamVolumeManager.StreamVolumeState) obj;
            }
        }, new t() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda11
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                StreamVolumeManager.StreamVolumeState streamVolumeState = (StreamVolumeManager.StreamVolumeState) obj;
                StreamVolumeManager.m12527$r8$lambda$NOnCdCgaywOGZm3GlRNFkAgJug(this.f$0, streamVolumeState);
                return streamVolumeState;
            }
        });
    }

    public void setMuted(final boolean z, final int i2) {
        this.stateHandler.updateStateAsync(new t() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda8
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return this.f$0.lambda$setMuted$0(z, (StreamVolumeManager.StreamVolumeState) obj);
            }
        }, new t() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda9
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return this.f$0.lambda$setMuted$1(z, i2, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }

    public void setStreamType(final int i2) {
        this.stateHandler.updateStateAsync(new t() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda6
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return StreamVolumeManager.lambda$setStreamType$0(i2, (StreamVolumeManager.StreamVolumeState) obj);
            }
        }, new t() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda7
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return this.f$0.lambda$setStreamType$1(i2, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }

    public void setVolume(final int i2, final int i3) {
        this.stateHandler.updateStateAsync(new t() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda4
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return StreamVolumeManager.lambda$setVolume$0(i2, (StreamVolumeManager.StreamVolumeState) obj);
            }
        }, new t() { // from class: androidx.media3.exoplayer.StreamVolumeManager$$ExternalSyntheticLambda5
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return this.f$0.lambda$setVolume$1(i2, i3, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }
}
