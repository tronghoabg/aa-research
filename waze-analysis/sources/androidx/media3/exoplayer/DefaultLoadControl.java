package androidx.media3.exoplayer;

import android.text.TextUtils;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.RawResourceDataSource;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocation;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import androidx.media3.exoplayer.upstream.PlayerIdAwareAllocator;
import com.google.d.b.an;
import com.google.d.d.bn;
import com.google.d.d.bs;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class DefaultLoadControl implements LoadControl {
    public static final int DEFAULT_AUDIO_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_BACK_BUFFER_DURATION_MS = 0;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_FOR_LOCAL_PLAYBACK_MS = 1000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 2000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_FOR_LOCAL_PLAYBACK_MS = 1000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 1000;
    public static final int DEFAULT_CAMERA_MOTION_BUFFER_SIZE = 131072;
    public static final int DEFAULT_IMAGE_BUFFER_SIZE = 26214400;
    public static final int DEFAULT_MAX_BUFFER_FOR_LOCAL_PLAYBACK_MS = 50000;
    public static final int DEFAULT_MAX_BUFFER_MS = 50000;
    public static final int DEFAULT_MAX_BUFFER_SIZE = 210239488;
    public static final int DEFAULT_METADATA_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MIN_BUFFER_FOR_LOCAL_PLAYBACK_MS = 1000;
    public static final int DEFAULT_MIN_BUFFER_MS = 50000;
    public static final int DEFAULT_MIN_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_MUXED_BUFFER_SIZE = 144310272;
    public static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS = false;
    public static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS_FOR_LOCAL_PLAYBACK = true;
    public static final boolean DEFAULT_RETAIN_BACK_BUFFER_FROM_KEYFRAME = false;
    public static final int DEFAULT_TARGET_BUFFER_BYTES = -1;
    public static final int DEFAULT_TARGET_BUFFER_BYTES_FOR_PRELOAD = 144179200;
    public static final int DEFAULT_TEXT_BUFFER_SIZE = 131072;
    public static final int DEFAULT_VIDEO_BUFFER_SIZE = 131072000;
    public static final int DEFAULT_VIDEO_BUFFER_SIZE_FOR_LOCAL_PLAYBACK = 19660800;
    public static final bn<String> LOCAL_PLAYBACK_SCHEMES = bn.u("file", "content", "data", "android.resource", RawResourceDataSource.RAW_RESOURCE_SCHEME, "asset");
    private static final String TAG = "DefaultLoadControl";
    private final DefaultAllocator allocator;
    private final long backBufferDurationUs;
    private final long bufferForPlaybackAfterRebufferForLocalPlaybackUs;
    private final long bufferForPlaybackAfterRebufferUs;
    private final long bufferForPlaybackForLocalPlaybackUs;
    private final long bufferForPlaybackUs;
    private final ConcurrentHashMap<PlayerId, PlayerLoadingState> loadingStates;
    private final long maxBufferForLocalPlaybackUs;
    private final long maxBufferUs;
    private final long minBufferForLocalPlaybackUs;
    private final long minBufferUs;
    private final Timeline.Period period;
    private final bs<String, Integer> playerTargetBufferBytesOverwrites;
    private final boolean prioritizeTimeOverSizeThresholds;
    private final boolean prioritizeTimeOverSizeThresholdsForLocalPlayback;
    private final boolean retainBackBufferFromKeyframe;
    private final int targetBufferBytesOverwrite;
    private long threadId;
    private final Timeline.Window window;

    /* compiled from: WazeSource */
    public final class Builder {
        private DefaultAllocator allocator;
        private int backBufferDurationMs;
        private int bufferForPlaybackAfterRebufferForLocalPlaybackMs;
        private int bufferForPlaybackAfterRebufferMs;
        private int bufferForPlaybackForLocalPlaybackMs;
        private int bufferForPlaybackMs;
        private boolean buildCalled;
        private int maxBufferForLocalPlaybackMs;
        private int maxBufferMs;
        private int minBufferForLocalPlaybackMs;
        private int minBufferMs;
        private Boolean onlyGenericConfigurationMethodsCalled;
        private final HashMap<String, Integer> playerTargetBufferBytes;
        private boolean prioritizeTimeOverSizeThresholds;
        private boolean prioritizeTimeOverSizeThresholdsForLocalPlayback;
        private boolean retainBackBufferFromKeyframe;
        private int targetBufferBytes;

        public Builder() {
            HashMap<String, Integer> map = new HashMap<>();
            this.playerTargetBufferBytes = map;
            map.put(PlayerId.PRELOAD.name, Integer.valueOf(DefaultLoadControl.DEFAULT_TARGET_BUFFER_BYTES_FOR_PRELOAD));
            this.minBufferMs = 50000;
            this.minBufferForLocalPlaybackMs = 1000;
            this.maxBufferMs = 50000;
            this.maxBufferForLocalPlaybackMs = 50000;
            this.bufferForPlaybackMs = 1000;
            this.bufferForPlaybackForLocalPlaybackMs = 1000;
            this.bufferForPlaybackAfterRebufferMs = 2000;
            this.bufferForPlaybackAfterRebufferForLocalPlaybackMs = 1000;
            this.targetBufferBytes = -1;
            this.prioritizeTimeOverSizeThresholds = false;
            this.prioritizeTimeOverSizeThresholdsForLocalPlayback = true;
            this.backBufferDurationMs = 0;
            this.retainBackBufferFromKeyframe = false;
        }

        public DefaultLoadControl build() {
            an.u(!this.buildCalled);
            this.buildCalled = true;
            if (this.allocator == null) {
                this.allocator = new DefaultAllocator(true, 65536);
            }
            Boolean bool = this.onlyGenericConfigurationMethodsCalled;
            if (bool != null && bool.booleanValue()) {
                this.minBufferForLocalPlaybackMs = this.minBufferMs;
                this.maxBufferForLocalPlaybackMs = this.maxBufferMs;
                this.bufferForPlaybackForLocalPlaybackMs = this.bufferForPlaybackMs;
                this.bufferForPlaybackAfterRebufferForLocalPlaybackMs = this.bufferForPlaybackAfterRebufferMs;
                this.prioritizeTimeOverSizeThresholdsForLocalPlayback = this.prioritizeTimeOverSizeThresholds;
            }
            return new DefaultLoadControl(this.allocator, this.minBufferMs, this.minBufferForLocalPlaybackMs, this.maxBufferMs, this.maxBufferForLocalPlaybackMs, this.bufferForPlaybackMs, this.bufferForPlaybackForLocalPlaybackMs, this.bufferForPlaybackAfterRebufferMs, this.bufferForPlaybackAfterRebufferForLocalPlaybackMs, this.targetBufferBytes, this.prioritizeTimeOverSizeThresholds, this.prioritizeTimeOverSizeThresholdsForLocalPlayback, this.backBufferDurationMs, this.retainBackBufferFromKeyframe, this.playerTargetBufferBytes);
        }

        public Builder setAllocator(DefaultAllocator defaultAllocator) {
            an.u(!this.buildCalled);
            this.allocator = defaultAllocator;
            return this;
        }

        public Builder setBackBuffer(int i2, boolean z) {
            an.u(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i2, 0, "backBufferDurationMs", "0");
            this.backBufferDurationMs = i2;
            this.retainBackBufferFromKeyframe = z;
            return this;
        }

        public Builder setBufferDurationsMs(int i2, int i3, int i4, int i5) {
            an.u(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i4, 0, "bufferForPlaybackMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i5, 0, "bufferForPlaybackAfterRebufferMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i2, i4, "minBufferMs", "bufferForPlaybackMs");
            DefaultLoadControl.assertGreaterOrEqual(i2, i5, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            DefaultLoadControl.assertGreaterOrEqual(i3, i2, "maxBufferMs", "minBufferMs");
            this.minBufferMs = i2;
            this.maxBufferMs = i3;
            this.bufferForPlaybackMs = i4;
            this.bufferForPlaybackAfterRebufferMs = i5;
            this.minBufferForLocalPlaybackMs = i2;
            this.maxBufferForLocalPlaybackMs = i3;
            this.bufferForPlaybackForLocalPlaybackMs = i4;
            this.bufferForPlaybackAfterRebufferForLocalPlaybackMs = i5;
            if (this.onlyGenericConfigurationMethodsCalled == null) {
                this.onlyGenericConfigurationMethodsCalled = true;
            }
            return this;
        }

        public Builder setBufferDurationsMsForLocalPlayback(int i2, int i3, int i4, int i5) {
            an.u(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i4, 0, "bufferForPlaybackMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i5, 0, "bufferForPlaybackAfterRebufferMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i2, i4, "minBufferMs", "bufferForPlaybackMs");
            DefaultLoadControl.assertGreaterOrEqual(i2, i5, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            DefaultLoadControl.assertGreaterOrEqual(i3, i2, "maxBufferMs", "minBufferMs");
            this.minBufferForLocalPlaybackMs = i2;
            this.maxBufferForLocalPlaybackMs = i3;
            this.bufferForPlaybackForLocalPlaybackMs = i4;
            this.bufferForPlaybackAfterRebufferForLocalPlaybackMs = i5;
            this.onlyGenericConfigurationMethodsCalled = false;
            return this;
        }

        public Builder setBufferDurationsMsForStreaming(int i2, int i3, int i4, int i5) {
            an.u(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i4, 0, "bufferForPlaybackMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i5, 0, "bufferForPlaybackAfterRebufferMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i2, i4, "minBufferMs", "bufferForPlaybackMs");
            DefaultLoadControl.assertGreaterOrEqual(i2, i5, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            DefaultLoadControl.assertGreaterOrEqual(i3, i2, "maxBufferMs", "minBufferMs");
            this.minBufferMs = i2;
            this.maxBufferMs = i3;
            this.bufferForPlaybackMs = i4;
            this.bufferForPlaybackAfterRebufferMs = i5;
            this.onlyGenericConfigurationMethodsCalled = false;
            return this;
        }

        public Builder setPlayerTargetBufferBytes(String str, int i2) {
            an.u(!this.buildCalled);
            this.playerTargetBufferBytes.put(str, Integer.valueOf(i2));
            return this;
        }

        public Builder setPrioritizeTimeOverSizeThresholds(boolean z) {
            an.u(!this.buildCalled);
            this.prioritizeTimeOverSizeThresholds = z;
            this.prioritizeTimeOverSizeThresholdsForLocalPlayback = z;
            if (this.onlyGenericConfigurationMethodsCalled == null) {
                this.onlyGenericConfigurationMethodsCalled = true;
            }
            return this;
        }

        public Builder setPrioritizeTimeOverSizeThresholdsForLocalPlayback(boolean z) {
            an.u(!this.buildCalled);
            this.prioritizeTimeOverSizeThresholdsForLocalPlayback = z;
            this.onlyGenericConfigurationMethodsCalled = false;
            return this;
        }

        public Builder setPrioritizeTimeOverSizeThresholdsForStreaming(boolean z) {
            an.u(!this.buildCalled);
            this.prioritizeTimeOverSizeThresholds = z;
            this.onlyGenericConfigurationMethodsCalled = false;
            return this;
        }

        public Builder setTargetBufferBytes(int i2) {
            an.u(!this.buildCalled);
            this.targetBufferBytes = i2;
            return this;
        }
    }

    /* compiled from: WazeSource */
    class PlayerLoadingState {
        private int allocatedCounts;
        public boolean isLoading;
        public int referenceCount = 1;
        public int targetBufferBytes;

        public synchronized void decreaseAllocatedCounts() {
            this.allocatedCounts--;
        }

        public synchronized int getAllocatedCounts() {
            return this.allocatedCounts;
        }

        public synchronized void increaseAllocatedCounts() {
            this.allocatedCounts++;
        }
    }

    protected DefaultLoadControl(DefaultAllocator defaultAllocator, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z, boolean z2, int i11, boolean z3, Map<String, Integer> map) {
        assertGreaterOrEqual(i6, 0, "bufferForPlaybackMs", "0");
        assertGreaterOrEqual(i7, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        assertGreaterOrEqual(i8, 0, "bufferForPlaybackAfterRebufferMs", "0");
        assertGreaterOrEqual(i9, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        assertGreaterOrEqual(i2, i6, "minBufferMs", "bufferForPlaybackMs");
        assertGreaterOrEqual(i3, i7, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        assertGreaterOrEqual(i2, i8, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        assertGreaterOrEqual(i3, i9, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        assertGreaterOrEqual(i4, i2, "maxBufferMs", "minBufferMs");
        assertGreaterOrEqual(i5, i3, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        assertGreaterOrEqual(i11, 0, "backBufferDurationMs", "0");
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.allocator = defaultAllocator;
        this.minBufferUs = Util.msToUs(i2);
        this.minBufferForLocalPlaybackUs = Util.msToUs(i3);
        this.maxBufferUs = Util.msToUs(i4);
        this.maxBufferForLocalPlaybackUs = Util.msToUs(i5);
        this.bufferForPlaybackUs = Util.msToUs(i6);
        this.bufferForPlaybackForLocalPlaybackUs = Util.msToUs(i7);
        this.bufferForPlaybackAfterRebufferUs = Util.msToUs(i8);
        this.bufferForPlaybackAfterRebufferForLocalPlaybackUs = Util.msToUs(i9);
        this.targetBufferBytesOverwrite = i10;
        this.prioritizeTimeOverSizeThresholds = z;
        this.prioritizeTimeOverSizeThresholdsForLocalPlayback = z2;
        this.backBufferDurationUs = Util.msToUs(i11);
        this.retainBackBufferFromKeyframe = z3;
        this.loadingStates = new ConcurrentHashMap<>();
        this.playerTargetBufferBytesOverwrites = bs.e(map);
        this.threadId = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertGreaterOrEqual(int i2, int i3, String str, String str2) {
        an.s(i2 >= i3, "%s cannot be less than %s", str, str2);
    }

    private long getBufferForPlaybackAfterRebufferUs(boolean z) {
        return z ? this.bufferForPlaybackAfterRebufferForLocalPlaybackUs : this.bufferForPlaybackAfterRebufferUs;
    }

    private long getBufferForPlaybackUs(boolean z) {
        return z ? this.bufferForPlaybackForLocalPlaybackUs : this.bufferForPlaybackUs;
    }

    private static int getDefaultBufferSize(int i2, boolean z) {
        switch (i2) {
            case -2:
                return 0;
            case -1:
                return 13107200;
            case 0:
                return DEFAULT_MUXED_BUFFER_SIZE;
            case 1:
                return 13107200;
            case 2:
                return z ? DEFAULT_VIDEO_BUFFER_SIZE_FOR_LOCAL_PLAYBACK : DEFAULT_VIDEO_BUFFER_SIZE;
            case 3:
                return 131072;
            case 4:
                return DEFAULT_IMAGE_BUFFER_SIZE;
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    private long getMaxBufferUs(boolean z) {
        return z ? this.maxBufferForLocalPlaybackUs : this.maxBufferUs;
    }

    private long getMinBufferUs(boolean z) {
        return z ? this.minBufferForLocalPlaybackUs : this.minBufferUs;
    }

    private int getTargetBufferBytes(PlayerId playerId) {
        PlayerLoadingState playerLoadingState = this.loadingStates.get(playerId);
        an.B(playerLoadingState);
        return playerLoadingState.targetBufferBytes;
    }

    private int getTargetBufferBytesOverwrite(PlayerId playerId) {
        Integer num = this.playerTargetBufferBytesOverwrites.get(playerId.name);
        return (num == null || num.intValue() == -1) ? this.targetBufferBytesOverwrite : num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTotalBufferBytesAllocated(PlayerId playerId) {
        PlayerLoadingState playerLoadingState = this.loadingStates.get(playerId);
        an.B(playerLoadingState);
        return playerLoadingState.getAllocatedCounts() * this.allocator.getIndividualAllocationLength();
    }

    private boolean heapHasEnoughHeadroomForPrioritizeTimeOverSizeThreshold() {
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory();
        return runtime.totalMemory() < jMaxMemory || runtime.freeMemory() + ((long) this.allocator.getUnusedBytesAllocated()) >= jMaxMemory / 25;
    }

    private boolean isLocalPlayback(LoadControl.Parameters parameters) {
        MediaItem.LocalConfiguration localConfiguration = parameters.timeline.getWindow(parameters.timeline.getPeriodByUid(parameters.mediaPeriodId.periodUid, this.period).windowIndex, this.window).mediaItem.localConfiguration;
        if (localConfiguration == null) {
            return false;
        }
        String scheme = localConfiguration.uri.getScheme();
        return TextUtils.isEmpty(scheme) || LOCAL_PLAYBACK_SCHEMES.contains(scheme);
    }

    private boolean prioritizeTimeOverSizeThresholds(boolean z) {
        return z ? this.prioritizeTimeOverSizeThresholdsForLocalPlayback : this.prioritizeTimeOverSizeThresholds;
    }

    private void removePlayer(PlayerId playerId) {
        PlayerLoadingState playerLoadingState = this.loadingStates.get(playerId);
        if (playerLoadingState != null) {
            int i2 = playerLoadingState.referenceCount - 1;
            playerLoadingState.referenceCount = i2;
            if (i2 == 0) {
                this.loadingStates.remove(playerId);
                updateAllocator();
            }
        }
    }

    private void resetPlayerLoadingState(PlayerId playerId) {
        PlayerLoadingState playerLoadingState = this.loadingStates.get(playerId);
        an.B(playerLoadingState);
        int targetBufferBytesOverwrite = getTargetBufferBytesOverwrite(playerId);
        if (targetBufferBytesOverwrite == -1) {
            targetBufferBytesOverwrite = 13107200;
        }
        playerLoadingState.targetBufferBytes = targetBufferBytesOverwrite;
        playerLoadingState.isLoading = false;
    }

    private void updateAllocator() {
        boolean zIsEmpty = this.loadingStates.isEmpty();
        DefaultAllocator defaultAllocator = this.allocator;
        if (zIsEmpty) {
            defaultAllocator.reset();
        } else {
            defaultAllocator.setTargetBufferSize(calculateTotalTargetBufferBytes());
        }
    }

    protected int calculateTargetBufferBytes(LoadControl.Parameters parameters, ExoTrackSelection[] exoTrackSelectionArr) {
        int iCalculateTargetBufferBytes = calculateTargetBufferBytes(exoTrackSelectionArr);
        if (iCalculateTargetBufferBytes != -1) {
            return iCalculateTargetBufferBytes;
        }
        boolean zIsLocalPlayback = isLocalPlayback(parameters);
        int defaultBufferSize = 0;
        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                defaultBufferSize += getDefaultBufferSize(exoTrackSelection.getTrackGroup().type, zIsLocalPlayback);
            }
        }
        return Util.constrainValue(defaultBufferSize, 13107200, DEFAULT_MAX_BUFFER_SIZE);
    }

    int calculateTotalTargetBufferBytes() {
        Iterator<PlayerLoadingState> it = this.loadingStates.values().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().targetBufferBytes;
        }
        return i2;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public Allocator getAllocator(PlayerId playerId) {
        return new PlayerIdFilteringAllocatorImpl(this, playerId);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ long getBackBufferDurationUs() {
        return LoadControl.CC.$default$getBackBufferDurationUs(this);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onPrepared(PlayerId playerId) {
        long id = Thread.currentThread().getId();
        long j2 = this.threadId;
        an.v(j2 == -1 || j2 == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.threadId = id;
        PlayerLoadingState playerLoadingState = this.loadingStates.get(playerId);
        if (playerLoadingState == null) {
            this.loadingStates.put(playerId, new PlayerLoadingState());
        } else {
            playerLoadingState.referenceCount++;
        }
        resetPlayerLoadingState(playerId);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onReleased(PlayerId playerId) {
        removePlayer(playerId);
        if (this.loadingStates.isEmpty()) {
            this.threadId = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ void onStopped() {
        LoadControl.CC.$default$onStopped(this);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onTracksSelected(LoadControl.Parameters parameters, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        int targetBufferBytesOverwrite = getTargetBufferBytesOverwrite(parameters.playerId);
        PlayerLoadingState playerLoadingState = this.loadingStates.get(parameters.playerId);
        an.B(playerLoadingState);
        if (targetBufferBytesOverwrite == -1) {
            targetBufferBytesOverwrite = calculateTargetBufferBytes(parameters, exoTrackSelectionArr);
        }
        playerLoadingState.targetBufferBytes = targetBufferBytesOverwrite;
        updateAllocator();
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ boolean retainBackBufferFromKeyframe() {
        return LoadControl.CC.$default$retainBackBufferFromKeyframe(this);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean shouldContinueLoading(LoadControl.Parameters parameters) {
        ConcurrentHashMap<PlayerId, PlayerLoadingState> concurrentHashMap = this.loadingStates;
        PlayerId playerId = parameters.playerId;
        PlayerLoadingState playerLoadingState = concurrentHashMap.get(playerId);
        an.B(playerLoadingState);
        int totalBufferBytesAllocated = getTotalBufferBytesAllocated(playerId);
        int targetBufferBytes = getTargetBufferBytes(playerId);
        boolean z = true;
        if (playerId.equals(PlayerId.PRELOAD)) {
            return totalBufferBytesAllocated < targetBufferBytes;
        }
        boolean zIsLocalPlayback = isLocalPlayback(parameters);
        long minBufferUs = getMinBufferUs(zIsLocalPlayback);
        long maxBufferUs = getMaxBufferUs(zIsLocalPlayback);
        float f2 = parameters.playbackSpeed;
        if (f2 > 1.0f) {
            minBufferUs = Math.min(Util.getMediaDurationForPlayoutDuration(minBufferUs, f2), maxBufferUs);
        }
        long jMax = Math.max(minBufferUs, 500000L);
        long j2 = parameters.bufferedDurationUs;
        if (j2 < jMax) {
            boolean zPrioritizeTimeOverSizeThresholds = prioritizeTimeOverSizeThresholds(zIsLocalPlayback);
            boolean zHeapHasEnoughHeadroomForPrioritizeTimeOverSizeThreshold = heapHasEnoughHeadroomForPrioritizeTimeOverSizeThreshold();
            if (!zPrioritizeTimeOverSizeThresholds ? totalBufferBytesAllocated >= targetBufferBytes : !zHeapHasEnoughHeadroomForPrioritizeTimeOverSizeThreshold && totalBufferBytesAllocated >= targetBufferBytes) {
                z = false;
            }
            playerLoadingState.isLoading = z;
            if (!z && zPrioritizeTimeOverSizeThresholds && !zHeapHasEnoughHeadroomForPrioritizeTimeOverSizeThreshold) {
                Log.i(TAG, "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!playerLoadingState.isLoading && parameters.bufferedDurationUs < 500000) {
                Log.w(TAG, "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= maxBufferUs || totalBufferBytesAllocated >= targetBufferBytes) {
            playerLoadingState.isLoading = false;
        }
        return playerLoadingState.isLoading;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean shouldContinuePreloading(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j2) {
        Iterator<PlayerLoadingState> it = this.loadingStates.values().iterator();
        while (it.hasNext()) {
            if (it.next().isLoading) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean shouldStartPlayback(LoadControl.Parameters parameters) {
        boolean zIsLocalPlayback = isLocalPlayback(parameters);
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(parameters.bufferedDurationUs, parameters.playbackSpeed);
        long bufferForPlaybackAfterRebufferUs = parameters.rebuffering ? getBufferForPlaybackAfterRebufferUs(zIsLocalPlayback) : getBufferForPlaybackUs(zIsLocalPlayback);
        long j2 = parameters.targetLiveOffsetUs;
        if (j2 != C.TIME_UNSET) {
            bufferForPlaybackAfterRebufferUs = Math.min(j2 / 2, bufferForPlaybackAfterRebufferUs);
        }
        if (bufferForPlaybackAfterRebufferUs <= 0 || playoutDurationForMediaDuration >= bufferForPlaybackAfterRebufferUs) {
            return true;
        }
        return !prioritizeTimeOverSizeThresholds(zIsLocalPlayback) && getTotalBufferBytesAllocated(parameters.playerId) >= getTargetBufferBytes(parameters.playerId);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onStopped(PlayerId playerId) {
        removePlayer(playerId);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public long getBackBufferDurationUs(PlayerId playerId) {
        return this.backBufferDurationUs;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean retainBackBufferFromKeyframe(PlayerId playerId) {
        return this.retainBackBufferFromKeyframe;
    }

    protected DefaultLoadControl(DefaultAllocator defaultAllocator, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z, boolean z2, int i11, boolean z3) {
        this(defaultAllocator, i2, i3, i4, i5, i6, i7, i8, i9, i10, z, z2, i11, z3, bs.f());
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ void onReleased() {
        LoadControl.CC.$default$onReleased(this);
    }

    public DefaultLoadControl() {
        this(new DefaultAllocator(true, 65536), 50000, 1000, 50000, 50000, 1000, 1000, 2000, 1000, -1, false, true, 0, false);
    }

    /* compiled from: WazeSource */
    final class PlayerIdFilteringAllocatorImpl implements PlayerIdAwareAllocator {
        private final HashMap<Allocation, PlayerId> allocationPlayerIdMap;
        private PlayerId playerId;
        final /* synthetic */ DefaultLoadControl this$0;

        public PlayerIdFilteringAllocatorImpl(DefaultLoadControl defaultLoadControl, PlayerId playerId) {
            Objects.requireNonNull(defaultLoadControl);
            this.this$0 = defaultLoadControl;
            this.allocationPlayerIdMap = new HashMap<>();
            this.playerId = playerId;
        }

        private void releaseInternal(Allocation allocation) {
            PlayerId playerIdRemove = this.allocationPlayerIdMap.remove(allocation);
            an.B(playerIdRemove);
            PlayerLoadingState playerLoadingState = (PlayerLoadingState) this.this$0.loadingStates.get(playerIdRemove);
            if (playerLoadingState != null) {
                playerLoadingState.decreaseAllocatedCounts();
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Allocator
        public synchronized Allocation allocate() {
            Allocation allocationAllocate;
            allocationAllocate = this.this$0.allocator.allocate();
            this.allocationPlayerIdMap.put(allocationAllocate, this.playerId);
            PlayerLoadingState playerLoadingState = (PlayerLoadingState) this.this$0.loadingStates.get(this.playerId);
            if (playerLoadingState != null) {
                playerLoadingState.increaseAllocatedCounts();
            }
            return allocationAllocate;
        }

        @Override // androidx.media3.exoplayer.upstream.Allocator
        public synchronized int getIndividualAllocationLength() {
            return this.this$0.allocator.getIndividualAllocationLength();
        }

        @Override // androidx.media3.exoplayer.upstream.PlayerIdAwareAllocator, androidx.media3.exoplayer.upstream.Allocator
        public synchronized int getTotalBytesAllocated() {
            return this.this$0.getTotalBufferBytesAllocated(this.playerId);
        }

        @Override // androidx.media3.exoplayer.upstream.Allocator
        public synchronized void release(Allocator.AllocationNode allocationNode) {
            this.this$0.allocator.release(allocationNode);
            while (allocationNode != null) {
                releaseInternal(allocationNode.getAllocation());
                allocationNode = allocationNode.next();
            }
        }

        @Override // androidx.media3.exoplayer.upstream.PlayerIdAwareAllocator
        public synchronized void setPlayerId(PlayerId playerId) {
            this.playerId = playerId;
        }

        @Override // androidx.media3.exoplayer.upstream.Allocator
        public synchronized void trim() {
            this.this$0.allocator.trim();
        }

        @Override // androidx.media3.exoplayer.upstream.Allocator
        public synchronized void release(Allocation allocation) {
            this.this$0.allocator.release(allocation);
            releaseInternal(allocation);
        }
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ void onTracksSelected(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        onTracksSelected(timeline, mediaPeriodId, rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ void onTracksSelected(Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        LoadControl.CC.$default$onTracksSelected(this, rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ void onTracksSelected(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        onTracksSelected(rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    @Deprecated
    protected int calculateTargetBufferBytes(ExoTrackSelection[] exoTrackSelectionArr) {
        return -1;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ void onPrepared() {
        LoadControl.CC.$default$onPrepared(this);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ boolean shouldStartPlayback(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j2, float f2, boolean z, long j3) {
        return shouldStartPlayback(j2, f2, z, j3);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ boolean shouldStartPlayback(long j2, float f2, boolean z, long j3) {
        return LoadControl.CC.$default$shouldStartPlayback(this, j2, f2, z, j3);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ boolean shouldContinueLoading(long j2, long j3, float f2) {
        return LoadControl.CC.$default$shouldContinueLoading(this, j2, j3, f2);
    }
}
