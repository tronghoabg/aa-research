package androidx.media3.common;

import android.graphics.Rect;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.Util;
import com.google.d.b.aj;
import com.google.d.b.an;
import com.google.d.d.bi;
import com.google.d.d.bn;
import com.google.d.d.fo;
import com.google.d.m.a.ag;
import com.google.d.m.a.bm;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class SimpleBasePlayer extends BasePlayer {
    private static final long POSITION_DISCONTINUITY_THRESHOLD_MS = 1000;
    private final HandlerWrapper applicationHandler;
    private final Looper applicationLooper;
    private final ListenerSet<Player.Listener> listeners;
    private final Set<bm<?>> pendingOperations;
    private final Timeline.Period period;
    private boolean released;
    private State state;

    /* compiled from: WazeSource */
    public final class LivePositionSupplier implements PositionSupplier {
        private long finalValue = C.TIME_UNSET;
        private final PositionSupplier livePosition;

        public LivePositionSupplier(PositionSupplier positionSupplier) {
            this.livePosition = positionSupplier;
        }

        public void disconnect(long j2) {
            this.finalValue = j2;
        }

        @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
        public long get() {
            long j2 = this.finalValue;
            return j2 != C.TIME_UNSET ? j2 : this.livePosition.get();
        }
    }

    /* compiled from: WazeSource */
    final class PlaceholderUid {
        private PlaceholderUid() {
        }
    }

    /* compiled from: WazeSource */
    final class PlaylistTimeline extends Timeline {
        private final int[] firstPeriodIndexByWindowIndex;
        private final HashMap<Object, Integer> periodIndexByUid;
        private final bn<MediaItemData> playlist;
        private final int[] windowIndexByPeriodIndex;

        public PlaylistTimeline(List<MediaItemData> list) {
            int size = list.size();
            this.playlist = bn.n(list);
            this.firstPeriodIndexByWindowIndex = new int[size];
            int periodCountInMediaItem = 0;
            for (int i2 = 0; i2 < size; i2++) {
                MediaItemData mediaItemData = list.get(i2);
                this.firstPeriodIndexByWindowIndex[i2] = periodCountInMediaItem;
                periodCountInMediaItem += getPeriodCountInMediaItem(mediaItemData);
            }
            this.windowIndexByPeriodIndex = new int[periodCountInMediaItem];
            this.periodIndexByUid = new HashMap<>();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                MediaItemData mediaItemData2 = list.get(i4);
                for (int i5 = 0; i5 < getPeriodCountInMediaItem(mediaItemData2); i5++) {
                    this.periodIndexByUid.put(mediaItemData2.getPeriodUid(i5), Integer.valueOf(i3));
                    this.windowIndexByPeriodIndex[i3] = i4;
                    i3++;
                }
            }
        }

        private static int getPeriodCountInMediaItem(MediaItemData mediaItemData) {
            if (mediaItemData.periods.isEmpty()) {
                return 1;
            }
            return mediaItemData.periods.size();
        }

        @Override // androidx.media3.common.Timeline
        public int getFirstWindowIndex(boolean z) {
            return super.getFirstWindowIndex(z);
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            Integer num = this.periodIndexByUid.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // androidx.media3.common.Timeline
        public int getLastWindowIndex(boolean z) {
            return super.getLastWindowIndex(z);
        }

        @Override // androidx.media3.common.Timeline
        public int getNextWindowIndex(int i2, int i3, boolean z) {
            return super.getNextWindowIndex(i2, i3, z);
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i2, Timeline.Period period, boolean z) {
            int[] iArr = this.firstPeriodIndexByWindowIndex;
            int i3 = this.windowIndexByPeriodIndex[i2];
            MediaItemData.m12179$$Nest$mgetPeriod(this.playlist.get(i3), i3, i2 - iArr[i3], period);
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
            Integer num = this.periodIndexByUid.get(obj);
            an.B(num);
            getPeriod(num.intValue(), period, true);
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.windowIndexByPeriodIndex.length;
        }

        @Override // androidx.media3.common.Timeline
        public int getPreviousWindowIndex(int i2, int i3, boolean z) {
            return super.getPreviousWindowIndex(i2, i3, z);
        }

        @Override // androidx.media3.common.Timeline
        public Object getUidOfPeriod(int i2) {
            int[] iArr = this.firstPeriodIndexByWindowIndex;
            int i3 = this.windowIndexByPeriodIndex[i2];
            return this.playlist.get(i3).getPeriodUid(i2 - iArr[i3]);
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i2, Timeline.Window window, long j2) {
            MediaItemData.m12181$$Nest$mgetWindow(this.playlist.get(i2), this.firstPeriodIndexByWindowIndex[i2], window);
            return window;
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return this.playlist.size();
        }
    }

    /* compiled from: WazeSource */
    public interface PositionSupplier {
        public static final PositionSupplier ZERO = CC.getConstant(0);

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.common.SimpleBasePlayer$PositionSupplier$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int f1683a = 0;

            static {
                PositionSupplier positionSupplier = PositionSupplier.ZERO;
            }

            public static PositionSupplier getConstant(final long j2) {
                return new PositionSupplier() { // from class: androidx.media3.common.SimpleBasePlayer$PositionSupplier$$ExternalSyntheticLambda1
                    @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                    public final long get() {
                        long j3 = j2;
                        int i2 = SimpleBasePlayer.PositionSupplier.CC.f1683a;
                        return j3;
                    }
                };
            }

            public static PositionSupplier getExtrapolating(final long j2, final float f2) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                return new PositionSupplier() { // from class: androidx.media3.common.SimpleBasePlayer$PositionSupplier$$ExternalSyntheticLambda0
                    @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                    public final long get() {
                        return SimpleBasePlayer.PositionSupplier.CC.lambda$getExtrapolating$0(j2, jElapsedRealtime, f2);
                    }
                };
            }

            public static /* synthetic */ long lambda$getConstant$0(long j2) {
                return j2;
            }

            public static /* synthetic */ long lambda$getExtrapolating$0(long j2, long j3, float f2) {
                return j2 + ((long) ((SystemClock.elapsedRealtime() - j3) * f2));
            }
        }

        long get();
    }

    protected SimpleBasePlayer(Looper looper, Clock clock) {
        this.applicationLooper = looper;
        this.applicationHandler = clock.createHandler(looper, null);
        this.pendingOperations = fo.g();
        this.period = new Timeline.Period();
        this.listeners = new ListenerSet<>(looper, clock, new ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda47
            @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
            public final void invoke(Object obj, FlagSet flagSet) {
                this.f$0.lambda$new$0((Player.Listener) obj, flagSet);
            }
        });
    }

    private static List<MediaItemData> buildMutablePlaylistFromState(State state, Timeline.Period period, Timeline.Window window) {
        Timeline timeline = state.timeline;
        if (timeline instanceof PlaylistTimeline) {
            return new ArrayList(((PlaylistTimeline) timeline).playlist);
        }
        ArrayList arrayList = new ArrayList(timeline.getWindowCount());
        for (int i2 = 0; i2 < state.timeline.getWindowCount(); i2++) {
            arrayList.add(MediaItemData.buildFromState(state, i2, period, window));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static State buildStateForNewPosition(State.Builder builder, State state, long j2, Timeline timeline, int i2, long j3, boolean z, Timeline.Window window) {
        long defaultPositionMs;
        int i3 = i2;
        long positionOrDefaultInMediaItem = getPositionOrDefaultInMediaItem(j2, state, window);
        boolean z2 = false;
        if (timeline.isEmpty() || (i3 != -1 && i3 < timeline.getWindowCount())) {
            defaultPositionMs = j3;
        } else {
            defaultPositionMs = -9223372036854775807L;
            i3 = 0;
        }
        if (!timeline.isEmpty() && defaultPositionMs == C.TIME_UNSET) {
            defaultPositionMs = timeline.getWindow(i3, window).getDefaultPositionMs();
        }
        boolean z3 = state.timeline.isEmpty() || timeline.isEmpty();
        boolean z4 = (z3 || state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), window).uid.equals(timeline.getWindow(i3, window).uid)) ? false : true;
        if (timeline.isEmpty()) {
            builder.setPlaylist(timeline, Tracks.EMPTY, null);
        } else if (timeline instanceof PlaylistTimeline) {
            MediaItemData mediaItemData = (MediaItemData) ((PlaylistTimeline) timeline).playlist.get(i3);
            builder.setPlaylist(timeline, mediaItemData.tracks, mediaItemData.mediaMetadata);
        } else {
            if (!z3 && !z4) {
                z2 = true;
            }
            builder.setPlaylist(timeline, z2 ? state.currentTracks : Tracks.EMPTY, z2 ? state.currentMetadata : null);
        }
        if (z3 || z4 || defaultPositionMs < positionOrDefaultInMediaItem) {
            builder.setCurrentMediaItemIndex(i3);
            builder.setCurrentAd(-1, -1);
            builder.setContentPositionMs(defaultPositionMs);
            builder.setContentBufferedPositionMs(PositionSupplier.CC.getConstant(defaultPositionMs));
            builder.setTotalBufferedDurationMs(PositionSupplier.ZERO);
        } else if (defaultPositionMs == positionOrDefaultInMediaItem) {
            builder.setCurrentMediaItemIndex(i3);
            if (state.currentAdGroupIndex == -1 || !z) {
                builder.setCurrentAd(-1, -1);
                builder.setTotalBufferedDurationMs(PositionSupplier.CC.getConstant(getContentBufferedPositionMsInternal(state, window) - positionOrDefaultInMediaItem));
            } else {
                builder.setTotalBufferedDurationMs(PositionSupplier.CC.getConstant(state.adBufferedPositionMsSupplier.get() - state.adPositionMsSupplier.get()));
            }
        } else {
            long jMax = Math.max(getContentBufferedPositionMsInternal(state, window), defaultPositionMs);
            long jMax2 = Math.max(0L, state.totalBufferedDurationMsSupplier.get() - (defaultPositionMs - positionOrDefaultInMediaItem));
            builder.setCurrentMediaItemIndex(i3);
            builder.setCurrentAd(-1, -1);
            builder.setContentPositionMs(defaultPositionMs);
            builder.setContentBufferedPositionMs(PositionSupplier.CC.getConstant(jMax));
            builder.setTotalBufferedDurationMs(PositionSupplier.CC.getConstant(jMax2));
        }
        return builder.build();
    }

    private void clearVideoOutput(Object obj) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(27)) {
            updateStateForPendingOperation(handleClearVideoOutput(obj), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda55
                @Override // com.google.d.b.aj
                public final Object get() {
                    return SimpleBasePlayer.lambda$clearVideoOutput$0(state);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaMetadata getCombinedMediaMetadata(MediaItem mediaItem, Tracks tracks) {
        MediaMetadata.Builder builder = new MediaMetadata.Builder();
        int size = tracks.getGroups().size();
        for (int i2 = 0; i2 < size; i2++) {
            Tracks.Group group = tracks.getGroups().get(i2);
            for (int i3 = 0; i3 < group.length; i3++) {
                if (group.isTrackSelected(i3)) {
                    Format trackFormat = group.getTrackFormat(i3);
                    if (trackFormat.metadata != null) {
                        for (int i4 = 0; i4 < trackFormat.metadata.length(); i4++) {
                            trackFormat.metadata.get(i4).populateMediaMetadata(builder);
                        }
                    }
                }
            }
        }
        builder.populate(mediaItem.mediaMetadata);
        return builder.build();
    }

    private static long getContentBufferedPositionMsInternal(State state, Timeline.Window window) {
        return getPositionOrDefaultInMediaItem(state.contentBufferedPositionMsSupplier.get(), state, window);
    }

    private static long getContentPositionMsInternal(State state, Timeline.Window window) {
        return getPositionOrDefaultInMediaItem(state.contentPositionMsSupplier.get(), state, window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCurrentMediaItemIndexInternal(State state) {
        int i2 = state.currentMediaItemIndex;
        if (i2 != -1) {
            return i2;
        }
        return 0;
    }

    private static int getCurrentPeriodIndexInternal(State state, Timeline.Window window, Timeline.Period period) {
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        return state.timeline.isEmpty() ? currentMediaItemIndexInternal : getPeriodIndexFromWindowPosition(state.timeline, currentMediaItemIndexInternal, getContentPositionMsInternal(state, window), window, period);
    }

    private static long getCurrentPeriodOrAdPositionMs(State state, Object obj, Timeline.Period period, Timeline.Window window) {
        return state.currentAdGroupIndex != -1 ? state.adPositionMsSupplier.get() : getContentPositionMsInternal(state, window) - state.timeline.getPeriodByUid(obj, period).getPositionInWindowMs();
    }

    private static int getMediaItemIndexInNewPlaylist(Timeline timeline, Timeline timeline2, int i2, Timeline.Period period, Timeline.Window window) {
        if (!timeline.isEmpty()) {
            Object obj = timeline.getPeriod(timeline.getWindow(i2, window).firstPeriodIndex, period, true).uid;
            an.B(obj);
            if (timeline2.getIndexOfPeriod(obj) != -1) {
                return timeline2.getPeriodByUid(obj, period).windowIndex;
            }
        } else if (i2 < timeline2.getWindowCount()) {
            return i2;
        }
        return -1;
    }

    private static int getMediaItemTransitionReason(State state, State state2, int i2, boolean z, Timeline.Window window) {
        Timeline timeline = state.timeline;
        Timeline timeline2 = state2.timeline;
        if (timeline2.isEmpty() && timeline.isEmpty()) {
            return -1;
        }
        if (timeline2.isEmpty() != timeline.isEmpty()) {
            return 3;
        }
        Object obj = state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), window).uid;
        Object obj2 = state2.timeline.getWindow(getCurrentMediaItemIndexInternal(state2), window).uid;
        if ((obj instanceof PlaceholderUid) && !(obj2 instanceof PlaceholderUid)) {
            return -1;
        }
        if (!obj.equals(obj2)) {
            if (i2 == 0) {
                return 1;
            }
            return i2 == 1 ? 2 : 3;
        }
        if (i2 == 0) {
            if (getContentPositionMsInternal(state, window) > getContentPositionMsInternal(state2, window)) {
                return 0;
            }
        } else if (i2 == 1 && z) {
            return 2;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getPeriodIndexFromWindowPosition(Timeline timeline, int i2, long j2, Timeline.Window window, Timeline.Period period) {
        return timeline.getIndexOfPeriod(timeline.getPeriodPositionUs(window, period, i2, Util.msToUs(j2)).first);
    }

    private static long getPeriodOrAdDurationMs(State state, Object obj, Timeline.Period period) {
        state.timeline.getPeriodByUid(obj, period);
        int i2 = state.currentAdGroupIndex;
        return Util.usToMs(i2 == -1 ? period.durationUs : period.getAdDurationUs(i2, state.currentAdIndexInAdGroup));
    }

    private static int getPositionDiscontinuityReason(State state, State state2, boolean z, Timeline.Window window, Timeline.Period period) {
        if (state2.hasPositionDiscontinuity) {
            return state2.positionDiscontinuityReason;
        }
        if (z) {
            return 1;
        }
        if (state.timeline.isEmpty()) {
            return -1;
        }
        if (state2.timeline.isEmpty()) {
            return 4;
        }
        Object uidOfPeriod = state.timeline.getUidOfPeriod(getCurrentPeriodIndexInternal(state, window, period));
        Object uidOfPeriod2 = state2.timeline.getUidOfPeriod(getCurrentPeriodIndexInternal(state2, window, period));
        if ((uidOfPeriod instanceof PlaceholderUid) && !(uidOfPeriod2 instanceof PlaceholderUid)) {
            return -1;
        }
        if (uidOfPeriod2.equals(uidOfPeriod) && state.currentAdGroupIndex == state2.currentAdGroupIndex && state.currentAdIndexInAdGroup == state2.currentAdIndexInAdGroup) {
            long currentPeriodOrAdPositionMs = getCurrentPeriodOrAdPositionMs(state, uidOfPeriod, period, window);
            if (Math.abs(currentPeriodOrAdPositionMs - getCurrentPeriodOrAdPositionMs(state2, uidOfPeriod2, period, window)) < 1000) {
                return -1;
            }
            long periodOrAdDurationMs = getPeriodOrAdDurationMs(state, uidOfPeriod, period);
            return (periodOrAdDurationMs == C.TIME_UNSET || currentPeriodOrAdPositionMs < periodOrAdDurationMs) ? 5 : 0;
        }
        if (state2.timeline.getIndexOfPeriod(uidOfPeriod) == -1) {
            return 4;
        }
        long currentPeriodOrAdPositionMs2 = getCurrentPeriodOrAdPositionMs(state, uidOfPeriod, period, window);
        long periodOrAdDurationMs2 = getPeriodOrAdDurationMs(state, uidOfPeriod, period);
        return (periodOrAdDurationMs2 == C.TIME_UNSET || currentPeriodOrAdPositionMs2 < periodOrAdDurationMs2) ? 3 : 0;
    }

    private static Player.PositionInfo getPositionInfo(State state, boolean z, Timeline.Window window, Timeline.Period period) {
        Object obj;
        MediaItem mediaItem;
        Object obj2;
        long contentPositionMsInternal;
        long j2;
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        int currentPeriodIndexInternal = getCurrentPeriodIndexInternal(state, window, period);
        if (state.timeline.isEmpty()) {
            obj = null;
            mediaItem = null;
            obj2 = null;
        } else {
            Object obj3 = state.timeline.getPeriod(currentPeriodIndexInternal, period, true).uid;
            Object obj4 = state.timeline.getWindow(currentMediaItemIndexInternal, window).uid;
            obj2 = obj3;
            mediaItem = window.mediaItem;
            obj = obj4;
        }
        if (z) {
            j2 = state.discontinuityPositionMs;
            contentPositionMsInternal = state.currentAdGroupIndex == -1 ? j2 : getContentPositionMsInternal(state, window);
        } else {
            contentPositionMsInternal = getContentPositionMsInternal(state, window);
            j2 = state.currentAdGroupIndex != -1 ? state.adPositionMsSupplier.get() : contentPositionMsInternal;
        }
        return new Player.PositionInfo(obj, currentMediaItemIndexInternal, mediaItem, obj2, currentPeriodIndexInternal, j2, contentPositionMsInternal, state.currentAdGroupIndex, state.currentAdIndexInAdGroup);
    }

    private static long getPositionOrDefaultInMediaItem(long j2, State state, Timeline.Window window) {
        if (j2 != C.TIME_UNSET) {
            return j2;
        }
        if (state.timeline.isEmpty()) {
            return 0L;
        }
        return state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), window).getDefaultPositionMs();
    }

    private static State getStateWithNewPlaylist(State state, List<MediaItemData> list, Timeline.Period period, Timeline.Window window) {
        State.Builder builderBuildUpon = state.buildUpon();
        PlaylistTimeline playlistTimeline = new PlaylistTimeline(list);
        Timeline timeline = state.timeline;
        long j2 = state.contentPositionMsSupplier.get();
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        int mediaItemIndexInNewPlaylist = getMediaItemIndexInNewPlaylist(timeline, playlistTimeline, currentMediaItemIndexInternal, period, window);
        long j3 = mediaItemIndexInNewPlaylist == -1 ? C.TIME_UNSET : j2;
        int i2 = currentMediaItemIndexInternal + 1;
        while (true) {
            if (mediaItemIndexInNewPlaylist == -1) {
                if (i2 >= timeline.getWindowCount()) {
                    mediaItemIndexInNewPlaylist = -1;
                    break;
                }
                mediaItemIndexInNewPlaylist = getMediaItemIndexInNewPlaylist(timeline, playlistTimeline, i2, period, window);
                i2++;
            } else {
                break;
            }
        }
        if (state.playbackState != 1 && mediaItemIndexInNewPlaylist == -1) {
            builderBuildUpon.setPlaybackState(4);
            builderBuildUpon.setIsLoading(false);
            mediaItemIndexInNewPlaylist = -1;
        }
        return buildStateForNewPosition(builderBuildUpon, state, j2, playlistTimeline, mediaItemIndexInNewPlaylist, j3, true, window);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v9, types: [androidx.media3.common.Timeline] */
    private static State getStateWithNewPlaylistAndPosition(State state, List<MediaItemData> list, int i2, long j2, Timeline.Window window) {
        State.Builder builderBuildUpon = state.buildUpon();
        PlaylistTimeline playlistTimeline = list == null ? state.timeline : new PlaylistTimeline(list);
        if (state.playbackState != 1) {
            if (playlistTimeline.isEmpty() || (i2 != -1 && i2 >= playlistTimeline.getWindowCount())) {
                builderBuildUpon.setPlaybackState(4);
                builderBuildUpon.setIsLoading(false);
            } else {
                builderBuildUpon.setPlaybackState(2);
            }
        }
        return buildStateForNewPosition(builderBuildUpon, state, state.contentPositionMsSupplier.get(), playlistTimeline, i2, j2, false, window);
    }

    private static Size getSurfaceHolderSize(SurfaceHolder surfaceHolder) {
        if (!surfaceHolder.getSurface().isValid()) {
            return Size.ZERO;
        }
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        return new Size(surfaceFrame.width(), surfaceFrame.height());
    }

    private static int getTimelineChangeReason(Timeline timeline, Timeline timeline2, Timeline.Window window) {
        if (timeline.getWindowCount() != timeline2.getWindowCount()) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= timeline.getWindowCount()) {
                return 1;
            }
            Object obj = timeline.getWindow(i2, window).uid;
            Object obj2 = timeline2.getWindow(i2, window).uid;
            boolean z = (obj instanceof PlaceholderUid) && !(obj2 instanceof PlaceholderUid);
            if (!obj.equals(obj2) && !z) {
                return 0;
            }
            i2++;
        }
    }

    private static boolean isPlaying(State state) {
        return state.playWhenReady && state.playbackState == 3 && state.playbackSuppressionReason == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$addMediaItems$0(State state, List list, int i2) {
        List<MediaItemData> listBuildMutablePlaylistFromState = buildMutablePlaylistFromState(state, this.period, this.window);
        for (int i3 = 0; i3 < list.size(); i3++) {
            listBuildMutablePlaylistFromState.add(i3 + i2, getPlaceholderMediaItemData((MediaItem) list.get(i3)));
        }
        return !state.timeline.isEmpty() ? getStateWithNewPlaylist(state, listBuildMutablePlaylistFromState, this.period, this.window) : getStateWithNewPlaylistAndPosition(state, listBuildMutablePlaylistFromState, state.currentMediaItemIndex, state.contentPositionMsSupplier.get(), this.window);
    }

    static /* synthetic */ State lambda$clearVideoOutput$0(State state) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setSurfaceSize(Size.ZERO);
        return builderBuildUpon.build();
    }

    static /* synthetic */ State lambda$decreaseDeviceVolume$0(State state) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setDeviceVolume(Math.max(0, state.deviceVolume - 1));
        return builderBuildUpon.build();
    }

    static /* synthetic */ State lambda$decreaseDeviceVolume$1(State state) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setDeviceVolume(Math.max(0, state.deviceVolume - 1));
        return builderBuildUpon.build();
    }

    static /* synthetic */ bm lambda$handleReplaceMediaItems$0(bm bmVar, Object obj) {
        return bmVar;
    }

    static /* synthetic */ State lambda$increaseDeviceVolume$0(State state) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setDeviceVolume(state.deviceVolume + 1);
        return builderBuildUpon.build();
    }

    static /* synthetic */ State lambda$increaseDeviceVolume$1(State state) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setDeviceVolume(state.deviceVolume + 1);
        return builderBuildUpon.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$moveMediaItems$0(State state, int i2, int i3, int i4) {
        List<MediaItemData> listBuildMutablePlaylistFromState = buildMutablePlaylistFromState(state, this.period, this.window);
        Util.moveItems(listBuildMutablePlaylistFromState, i2, i3, i4);
        return getStateWithNewPlaylist(state, listBuildMutablePlaylistFromState, this.period, this.window);
    }

    static /* synthetic */ State lambda$mute$0(State state) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setVolume(0.0f);
        return builderBuildUpon.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Player.Listener listener, FlagSet flagSet) {
        listener.onEvents(this, new Player.Events(flagSet));
    }

    static /* synthetic */ State lambda$prepare$0(State state) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setPlayerError(null);
        builderBuildUpon.setPlaybackState(true != state.timeline.isEmpty() ? 2 : 4);
        return builderBuildUpon.build();
    }

    static /* synthetic */ State lambda$release$0(State state) {
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$removeMediaItems$0(State state, int i2, int i3) {
        List<MediaItemData> listBuildMutablePlaylistFromState = buildMutablePlaylistFromState(state, this.period, this.window);
        Util.removeRange(listBuildMutablePlaylistFromState, i2, i3);
        return getStateWithNewPlaylist(state, listBuildMutablePlaylistFromState, this.period, this.window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$replaceMediaItems$0(State state, List list, int i2, int i3) {
        List<MediaItemData> listBuildMutablePlaylistFromState = buildMutablePlaylistFromState(state, this.period, this.window);
        for (int i4 = 0; i4 < list.size(); i4++) {
            listBuildMutablePlaylistFromState.add(i4 + i2, getPlaceholderMediaItemData((MediaItem) list.get(i4)));
        }
        State stateWithNewPlaylist = !state.timeline.isEmpty() ? getStateWithNewPlaylist(state, listBuildMutablePlaylistFromState, this.period, this.window) : getStateWithNewPlaylistAndPosition(state, listBuildMutablePlaylistFromState, state.currentMediaItemIndex, state.contentPositionMsSupplier.get(), this.window);
        if (i3 >= i2) {
            return stateWithNewPlaylist;
        }
        Util.removeRange(listBuildMutablePlaylistFromState, i3, i2);
        return getStateWithNewPlaylist(stateWithNewPlaylist, listBuildMutablePlaylistFromState, this.period, this.window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$seekTo$0(boolean z, State state, int i2, long j2) {
        return z ? state : getStateWithNewPlaylistAndPosition(state, null, i2, j2, this.window);
    }

    static /* synthetic */ State lambda$setAudioAttributes$0(State state, AudioAttributes audioAttributes) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setAudioAttributes(audioAttributes);
        return builderBuildUpon.build();
    }

    static /* synthetic */ State lambda$setDeviceMuted$0(State state, boolean z) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setIsDeviceMuted(z);
        return builderBuildUpon.build();
    }

    static /* synthetic */ State lambda$setDeviceMuted$1(State state, boolean z) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setIsDeviceMuted(z);
        return builderBuildUpon.build();
    }

    static /* synthetic */ State lambda$setDeviceVolume$0(State state, int i2) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setDeviceVolume(i2);
        return builderBuildUpon.build();
    }

    static /* synthetic */ State lambda$setDeviceVolume$1(State state, int i2) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setDeviceVolume(i2);
        return builderBuildUpon.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$setMediaItemsInternal$0(List list, State state, int i2, long j2) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            arrayList.add(getPlaceholderMediaItemData((MediaItem) list.get(i3)));
        }
        return getStateWithNewPlaylistAndPosition(state, arrayList, i2, j2, this.window);
    }

    static /* synthetic */ State lambda$setPlayWhenReady$0(State state, boolean z) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setPlayWhenReady(z, 1);
        return builderBuildUpon.build();
    }

    static /* synthetic */ State lambda$setPlaybackParameters$0(State state, PlaybackParameters playbackParameters) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setPlaybackParameters(playbackParameters);
        return builderBuildUpon.build();
    }

    static /* synthetic */ State lambda$setPlaylistMetadata$0(State state, MediaMetadata mediaMetadata) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setPlaylistMetadata(mediaMetadata);
        return builderBuildUpon.build();
    }

    static /* synthetic */ State lambda$setRepeatMode$0(State state, int i2) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setRepeatMode(i2);
        return builderBuildUpon.build();
    }

    static /* synthetic */ State lambda$setShuffleModeEnabled$0(State state, boolean z) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setShuffleModeEnabled(z);
        return builderBuildUpon.build();
    }

    static /* synthetic */ State lambda$setTrackSelectionParameters$0(State state, TrackSelectionParameters trackSelectionParameters) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setTrackSelectionParameters(trackSelectionParameters);
        return builderBuildUpon.build();
    }

    static /* synthetic */ State lambda$setVideoSurface$0(State state) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setSurfaceSize(Size.UNKNOWN);
        return builderBuildUpon.build();
    }

    static /* synthetic */ State lambda$setVideoSurfaceHolder$0(State state, SurfaceHolder surfaceHolder) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setSurfaceSize(getSurfaceHolderSize(surfaceHolder));
        return builderBuildUpon.build();
    }

    static /* synthetic */ State lambda$setVideoSurfaceView$0(State state, SurfaceView surfaceView) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setSurfaceSize(getSurfaceHolderSize(surfaceView.getHolder()));
        return builderBuildUpon.build();
    }

    static /* synthetic */ State lambda$setVideoTextureView$0(State state, Size size) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setSurfaceSize(size);
        return builderBuildUpon.build();
    }

    static /* synthetic */ State lambda$setVolume$0(State state, float f2) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setVolume(f2);
        return builderBuildUpon.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$stop$0(State state) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setPlaybackState(1);
        builderBuildUpon.setTotalBufferedDurationMs(PositionSupplier.ZERO);
        builderBuildUpon.setContentBufferedPositionMs(PositionSupplier.CC.getConstant(getContentPositionMsInternal(state, this.window)));
        builderBuildUpon.setAdBufferedPositionMs(state.adPositionMsSupplier);
        builderBuildUpon.setIsLoading(false);
        return builderBuildUpon.build();
    }

    static /* synthetic */ State lambda$unmute$0(State state) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setVolume(state.unmuteVolume);
        return builderBuildUpon.build();
    }

    static /* synthetic */ void lambda$updateStateAndInformListeners$1(int i2, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, Player.Listener listener) {
        listener.onPositionDiscontinuity(i2);
        listener.onPositionDiscontinuity(positionInfo, positionInfo2, i2);
    }

    static /* synthetic */ void lambda$updateStateAndInformListeners$28(State state, Player.Listener listener) {
        listener.onCues(state.currentCues.cues);
        listener.onCues(state.currentCues);
    }

    static /* synthetic */ void lambda$updateStateAndInformListeners$4(State state, Player.Listener listener) {
        PlaybackException playbackException = state.playerError;
        int i2 = Util.SDK_INT;
        listener.onPlayerError(playbackException);
    }

    static /* synthetic */ void lambda$updateStateAndInformListeners$8(State state, Player.Listener listener) {
        listener.onLoadingChanged(state.isLoading);
        listener.onIsLoadingChanged(state.isLoading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateStateForPendingOperation$0(bm bmVar) {
        int i2 = Util.SDK_INT;
        this.pendingOperations.remove(bmVar);
        if (!this.pendingOperations.isEmpty() || this.released) {
            return;
        }
        updateStateAndInformListeners(getState(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOrRunOnApplicationHandler(Runnable runnable) {
        if (this.applicationHandler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.applicationHandler.post(runnable);
        }
    }

    private void setMediaItemsInternal(final List<MediaItem> list, final int i2, final long j2) {
        an.l(i2 == -1 || i2 >= 0);
        final State state = this.state;
        if (shouldHandleCommand(20) || (list.size() == 1 && shouldHandleCommand(31))) {
            updateStateForPendingOperation(handleSetMediaItems(list, i2, j2), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda38
                @Override // com.google.d.b.aj
                public final Object get() {
                    return this.f$0.lambda$setMediaItemsInternal$0(list, state, i2, j2);
                }
            });
        }
    }

    private boolean shouldHandleCommand(int i2) {
        return !this.released && this.state.availableCommands.contains(i2);
    }

    private void updateStateAndInformListeners(final State state, boolean z, boolean z2) {
        State state2 = this.state;
        this.state = state;
        if (state.hasPositionDiscontinuity || state.newlyRenderedFirstFrame) {
            State.Builder builderBuildUpon = this.state.buildUpon();
            builderBuildUpon.clearPositionDiscontinuity();
            builderBuildUpon.setNewlyRenderedFirstFrame(false);
            this.state = builderBuildUpon.build();
        }
        boolean z3 = state2.playWhenReady != state.playWhenReady;
        boolean z4 = state2.playbackState != state.playbackState;
        final int positionDiscontinuityReason = getPositionDiscontinuityReason(state2, state, z, this.window, this.period);
        boolean zEquals = state2.timeline.equals(state.timeline);
        final int mediaItemTransitionReason = getMediaItemTransitionReason(state2, state, positionDiscontinuityReason, z2, this.window);
        if (!zEquals) {
            final int timelineChangeReason = getTimelineChangeReason(state2.timeline, state.timeline, this.window);
            this.listeners.queueEvent(0, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    Player.Listener listener = (Player.Listener) obj;
                    listener.onTimelineChanged(state.timeline, timelineChangeReason);
                }
            });
        }
        if (positionDiscontinuityReason != -1) {
            final Player.PositionInfo positionInfo = getPositionInfo(state2, false, this.window, this.period);
            final Player.PositionInfo positionInfo2 = getPositionInfo(state, state.hasPositionDiscontinuity, this.window, this.period);
            this.listeners.queueEvent(11, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda15
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.lambda$updateStateAndInformListeners$1(positionDiscontinuityReason, positionInfo, positionInfo2, (Player.Listener) obj);
                }
            });
        }
        if (mediaItemTransitionReason != -1) {
            final MediaItem mediaItem = state.timeline.isEmpty() ? null : state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), this.window).mediaItem;
            this.listeners.queueEvent(1, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda26
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMediaItemTransition(mediaItem, mediaItemTransitionReason);
                }
            });
        }
        if (!Objects.equals(state2.playerError, state.playerError)) {
            this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda29
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlayerErrorChanged(state.playerError);
                }
            });
            if (state.playerError != null) {
                this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda30
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        SimpleBasePlayer.lambda$updateStateAndInformListeners$4(state, (Player.Listener) obj);
                    }
                });
            }
        }
        if (!state2.trackSelectionParameters.equals(state.trackSelectionParameters)) {
            this.listeners.queueEvent(19, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda31
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onTrackSelectionParametersChanged(state.trackSelectionParameters);
                }
            });
        }
        if (!state2.currentTracks.equals(state.currentTracks)) {
            this.listeners.queueEvent(2, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda32
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onTracksChanged(state.currentTracks);
                }
            });
        }
        if (!state2.currentMetadata.equals(state.currentMetadata)) {
            this.listeners.queueEvent(14, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda33
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMediaMetadataChanged(state.currentMetadata);
                }
            });
        }
        if (state2.isLoading != state.isLoading) {
            this.listeners.queueEvent(3, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda34
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.lambda$updateStateAndInformListeners$8(state, (Player.Listener) obj);
                }
            });
        }
        if (z3 || z4) {
            this.listeners.queueEvent(-1, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda35
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.State state3 = state;
                    ((Player.Listener) obj).onPlayerStateChanged(state3.playWhenReady, state3.playbackState);
                }
            });
        }
        if (z4) {
            this.listeners.queueEvent(4, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda5
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackStateChanged(state.playbackState);
                }
            });
        }
        if (z3 || state2.playWhenReadyChangeReason != state.playWhenReadyChangeReason) {
            this.listeners.queueEvent(5, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda6
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.State state3 = state;
                    ((Player.Listener) obj).onPlayWhenReadyChanged(state3.playWhenReady, state3.playWhenReadyChangeReason);
                }
            });
        }
        if (state2.playbackSuppressionReason != state.playbackSuppressionReason) {
            this.listeners.queueEvent(6, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda7
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackSuppressionReasonChanged(state.playbackSuppressionReason);
                }
            });
        }
        if (isPlaying(state2) != isPlaying(state)) {
            this.listeners.queueEvent(7, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda8
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onIsPlayingChanged(SimpleBasePlayer.isPlaying(state));
                }
            });
        }
        if (!state2.playbackParameters.equals(state.playbackParameters)) {
            this.listeners.queueEvent(12, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda9
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackParametersChanged(state.playbackParameters);
                }
            });
        }
        if (state2.repeatMode != state.repeatMode) {
            this.listeners.queueEvent(8, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda10
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onRepeatModeChanged(state.repeatMode);
                }
            });
        }
        if (state2.shuffleModeEnabled != state.shuffleModeEnabled) {
            this.listeners.queueEvent(9, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda11
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onShuffleModeEnabledChanged(state.shuffleModeEnabled);
                }
            });
        }
        if (state2.seekBackIncrementMs != state.seekBackIncrementMs) {
            this.listeners.queueEvent(16, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda12
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onSeekBackIncrementChanged(state.seekBackIncrementMs);
                }
            });
        }
        if (state2.seekForwardIncrementMs != state.seekForwardIncrementMs) {
            this.listeners.queueEvent(17, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda13
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onSeekForwardIncrementChanged(state.seekForwardIncrementMs);
                }
            });
        }
        if (state2.maxSeekToPreviousPositionMs != state.maxSeekToPreviousPositionMs) {
            this.listeners.queueEvent(18, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda14
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMaxSeekToPreviousPositionChanged(state.maxSeekToPreviousPositionMs);
                }
            });
        }
        if (!state2.audioAttributes.equals(state.audioAttributes)) {
            this.listeners.queueEvent(20, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda16
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onAudioAttributesChanged(state.audioAttributes);
                }
            });
        }
        if (state2.audioSessionId != state.audioSessionId) {
            this.listeners.queueEvent(21, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda17
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onAudioSessionIdChanged(state.audioSessionId);
                }
            });
        }
        if (!state2.videoSize.equals(state.videoSize)) {
            this.listeners.queueEvent(25, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda18
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onVideoSizeChanged(state.videoSize);
                }
            });
        }
        if (!state2.deviceInfo.equals(state.deviceInfo)) {
            this.listeners.queueEvent(29, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda19
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onDeviceInfoChanged(state.deviceInfo);
                }
            });
        }
        if (!state2.playlistMetadata.equals(state.playlistMetadata)) {
            this.listeners.queueEvent(15, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda20
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaylistMetadataChanged(state.playlistMetadata);
                }
            });
        }
        if (state.newlyRenderedFirstFrame) {
            this.listeners.queueEvent(26, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda21
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onRenderedFirstFrame();
                }
            });
        }
        if (!state2.surfaceSize.equals(state.surfaceSize)) {
            this.listeners.queueEvent(24, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda22
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.State state3 = state;
                    ((Player.Listener) obj).onSurfaceSizeChanged(state3.surfaceSize.getWidth(), state3.surfaceSize.getHeight());
                }
            });
        }
        if (state2.volume != state.volume) {
            this.listeners.queueEvent(22, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda23
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onVolumeChanged(state.volume);
                }
            });
        }
        if (state2.deviceVolume != state.deviceVolume || state2.isDeviceMuted != state.isDeviceMuted) {
            this.listeners.queueEvent(30, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda24
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.State state3 = state;
                    ((Player.Listener) obj).onDeviceVolumeChanged(state3.deviceVolume, state3.isDeviceMuted);
                }
            });
        }
        if (!state2.currentCues.equals(state.currentCues)) {
            this.listeners.queueEvent(27, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda25
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.lambda$updateStateAndInformListeners$28(state, (Player.Listener) obj);
                }
            });
        }
        if (!state2.timedMetadata.equals(state.timedMetadata) && state.timedMetadata.presentationTimeUs != C.TIME_UNSET) {
            this.listeners.queueEvent(28, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda27
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMetadata(state.timedMetadata);
                }
            });
        }
        if (!state2.availableCommands.equals(state.availableCommands)) {
            this.listeners.queueEvent(13, new ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda28
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onAvailableCommandsChanged(state.availableCommands);
                }
            });
        }
        this.listeners.flushEvents();
    }

    private void updateStateForPendingOperation(final bm<?> bmVar, aj<State> ajVar, boolean z, boolean z2) {
        if (bmVar.isDone() && this.pendingOperations.isEmpty()) {
            updateStateAndInformListeners(getState(), z, z2);
            return;
        }
        this.pendingOperations.add(bmVar);
        updateStateAndInformListeners(getPlaceholderState(ajVar.get()), z, z2);
        bmVar.addListener(new Runnable() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda40
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$updateStateForPendingOperation$0(bmVar);
            }
        }, new Executor() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda41
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f$0.postOrRunOnApplicationHandler(runnable);
            }
        });
    }

    private void verifyApplicationThreadAndInitState() {
        verifyApplicationThread();
        if (this.state == null) {
            this.state = getState();
        }
    }

    @Override // androidx.media3.common.Player
    public final void addListener(Player.Listener listener) {
        an.B(listener);
        this.listeners.add(listener);
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItems(int i2, final List<MediaItem> list) {
        verifyApplicationThreadAndInitState();
        an.l(i2 >= 0);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (!shouldHandleCommand(20) || list.isEmpty()) {
            return;
        }
        final int iMin = Math.min(i2, windowCount);
        updateStateForPendingOperation(handleAddMediaItems(iMin, list), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda43
            @Override // com.google.d.b.aj
            public final Object get() {
                return this.f$0.lambda$addMediaItems$0(state, list, iMin);
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurface() {
        clearVideoOutput(null);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        clearVideoOutput(surfaceHolder);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        clearVideoOutput(surfaceView);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoTextureView(TextureView textureView) {
        clearVideoOutput(textureView);
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void decreaseDeviceVolume() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleDecreaseDeviceVolume(1), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda46
                @Override // com.google.d.b.aj
                public final Object get() {
                    return SimpleBasePlayer.lambda$decreaseDeviceVolume$0(state);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final Looper getApplicationLooper() {
        return this.applicationLooper;
    }

    @Override // androidx.media3.common.Player
    public final AudioAttributes getAudioAttributes() {
        verifyApplicationThreadAndInitState();
        return this.state.audioAttributes;
    }

    @Override // androidx.media3.common.BasePlayer, androidx.media3.common.Player
    public final int getAudioSessionId() {
        verifyApplicationThreadAndInitState();
        return this.state.audioSessionId;
    }

    @Override // androidx.media3.common.Player
    public final Player.Commands getAvailableCommands() {
        verifyApplicationThreadAndInitState();
        return this.state.availableCommands;
    }

    @Override // androidx.media3.common.Player
    public final long getBufferedPosition() {
        verifyApplicationThreadAndInitState();
        return isPlayingAd() ? Math.max(this.state.adBufferedPositionMsSupplier.get(), this.state.adPositionMsSupplier.get()) : getContentBufferedPosition();
    }

    @Override // androidx.media3.common.Player
    public final long getContentBufferedPosition() {
        verifyApplicationThreadAndInitState();
        return Math.max(getContentBufferedPositionMsInternal(this.state, this.window), getContentPositionMsInternal(this.state, this.window));
    }

    @Override // androidx.media3.common.Player
    public final long getContentPosition() {
        verifyApplicationThreadAndInitState();
        return getContentPositionMsInternal(this.state, this.window);
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdGroupIndex() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdGroupIndex;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdIndexInAdGroup() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdIndexInAdGroup;
    }

    @Override // androidx.media3.common.Player
    public final CueGroup getCurrentCues() {
        verifyApplicationThreadAndInitState();
        return this.state.currentCues;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentMediaItemIndex() {
        verifyApplicationThreadAndInitState();
        return getCurrentMediaItemIndexInternal(this.state);
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentPeriodIndex() {
        verifyApplicationThreadAndInitState();
        return getCurrentPeriodIndexInternal(this.state, this.window, this.period);
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentPosition() {
        verifyApplicationThreadAndInitState();
        return isPlayingAd() ? this.state.adPositionMsSupplier.get() : getContentPosition();
    }

    @Override // androidx.media3.common.Player
    public final Timeline getCurrentTimeline() {
        verifyApplicationThreadAndInitState();
        return this.state.timeline;
    }

    @Override // androidx.media3.common.Player
    public final Tracks getCurrentTracks() {
        verifyApplicationThreadAndInitState();
        return this.state.currentTracks;
    }

    @Override // androidx.media3.common.Player
    public final DeviceInfo getDeviceInfo() {
        verifyApplicationThreadAndInitState();
        return this.state.deviceInfo;
    }

    @Override // androidx.media3.common.Player
    public final int getDeviceVolume() {
        verifyApplicationThreadAndInitState();
        return this.state.deviceVolume;
    }

    @Override // androidx.media3.common.Player
    public final long getDuration() {
        verifyApplicationThreadAndInitState();
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        this.state.timeline.getPeriod(getCurrentPeriodIndex(), this.period);
        Timeline.Period period = this.period;
        State state = this.state;
        return Util.usToMs(period.getAdDurationUs(state.currentAdGroupIndex, state.currentAdIndexInAdGroup));
    }

    @Override // androidx.media3.common.Player
    public final long getMaxSeekToPreviousPosition() {
        verifyApplicationThreadAndInitState();
        return this.state.maxSeekToPreviousPositionMs;
    }

    @Override // androidx.media3.common.Player
    public final MediaMetadata getMediaMetadata() {
        verifyApplicationThreadAndInitState();
        return this.state.currentMetadata;
    }

    protected MediaItemData getPlaceholderMediaItemData(MediaItem mediaItem) {
        MediaItemData.Builder builder = new MediaItemData.Builder(new PlaceholderUid());
        builder.setMediaItem(mediaItem);
        builder.setIsDynamic(true);
        builder.setIsPlaceholder(true);
        return builder.build();
    }

    protected State getPlaceholderState(State state) {
        return state;
    }

    @Override // androidx.media3.common.Player
    public final boolean getPlayWhenReady() {
        verifyApplicationThreadAndInitState();
        return this.state.playWhenReady;
    }

    @Override // androidx.media3.common.Player
    public final PlaybackParameters getPlaybackParameters() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackParameters;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackState() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackState;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackSuppressionReason() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackSuppressionReason;
    }

    @Override // androidx.media3.common.Player
    public final PlaybackException getPlayerError() {
        verifyApplicationThreadAndInitState();
        return this.state.playerError;
    }

    @Override // androidx.media3.common.Player
    public final MediaMetadata getPlaylistMetadata() {
        verifyApplicationThreadAndInitState();
        return this.state.playlistMetadata;
    }

    @Override // androidx.media3.common.Player
    public final int getRepeatMode() {
        verifyApplicationThreadAndInitState();
        return this.state.repeatMode;
    }

    @Override // androidx.media3.common.Player
    public final long getSeekBackIncrement() {
        verifyApplicationThreadAndInitState();
        return this.state.seekBackIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public final long getSeekForwardIncrement() {
        verifyApplicationThreadAndInitState();
        return this.state.seekForwardIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public final boolean getShuffleModeEnabled() {
        verifyApplicationThreadAndInitState();
        return this.state.shuffleModeEnabled;
    }

    protected abstract State getState();

    @Override // androidx.media3.common.Player
    public final Size getSurfaceSize() {
        verifyApplicationThreadAndInitState();
        return this.state.surfaceSize;
    }

    @Override // androidx.media3.common.Player
    public final long getTotalBufferedDuration() {
        verifyApplicationThreadAndInitState();
        return this.state.totalBufferedDurationMsSupplier.get();
    }

    @Override // androidx.media3.common.Player
    public final TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThreadAndInitState();
        return this.state.trackSelectionParameters;
    }

    @Override // androidx.media3.common.Player
    public final VideoSize getVideoSize() {
        verifyApplicationThreadAndInitState();
        return this.state.videoSize;
    }

    @Override // androidx.media3.common.Player
    public final float getVolume() {
        verifyApplicationThreadAndInitState();
        return this.state.volume;
    }

    protected bm<?> handleAddMediaItems(int i2, List<MediaItem> list) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    protected bm<?> handleClearVideoOutput(Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    protected bm<?> handleDecreaseDeviceVolume(int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    protected bm<?> handleIncreaseDeviceVolume(int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    protected bm<?> handleMoveMediaItems(int i2, int i3, int i4) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    protected bm<?> handlePrepare() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PREPARE");
    }

    protected bm<?> handleRelease() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_RELEASE");
    }

    protected bm<?> handleRemoveMediaItems(int i2, int i3) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    protected bm<?> handleReplaceMediaItems(int i2, int i3, List<MediaItem> list) {
        bm<?> bmVarHandleAddMediaItems = handleAddMediaItems(i3, list);
        if (i2 == i3) {
            return bmVarHandleAddMediaItems;
        }
        final bm<?> bmVarHandleRemoveMediaItems = handleRemoveMediaItems(i2, i3);
        return Util.transformFutureAsync(bmVarHandleAddMediaItems, new ag() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda61
            @Override // com.google.d.m.a.ag
            public final bm apply(Object obj) {
                return bmVarHandleRemoveMediaItems;
            }
        });
    }

    protected bm<?> handleSeek(int i2, long j2, int i3) {
        throw new IllegalStateException("Missing implementation to handle one of the COMMAND_SEEK_*");
    }

    protected bm<?> handleSetAudioAttributes(AudioAttributes audioAttributes, boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_AUDIO_ATTRIBUTES");
    }

    protected bm<?> handleSetDeviceMuted(boolean z, int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    protected bm<?> handleSetDeviceVolume(int i2, int i3) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_DEVICE_VOLUME or COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS");
    }

    protected bm<?> handleSetMediaItems(List<MediaItem> list, int i2, long j2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_MEDIA_ITEM(S)");
    }

    protected bm<?> handleSetPlayWhenReady(boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PLAY_PAUSE");
    }

    protected bm<?> handleSetPlaybackParameters(PlaybackParameters playbackParameters) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SPEED_AND_PITCH");
    }

    protected bm<?> handleSetPlaylistMetadata(MediaMetadata mediaMetadata) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_PLAYLIST_METADATA");
    }

    protected bm<?> handleSetRepeatMode(int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_REPEAT_MODE");
    }

    protected bm<?> handleSetShuffleModeEnabled(boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SHUFFLE_MODE");
    }

    protected bm<?> handleSetTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_TRACK_SELECTION_PARAMETERS");
    }

    protected bm<?> handleSetVideoOutput(Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    @Deprecated
    protected bm<?> handleSetVolume(float f2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VOLUME");
    }

    protected bm<?> handleStop() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_STOP");
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void increaseDeviceVolume() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleIncreaseDeviceVolume(1), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda57
                @Override // com.google.d.b.aj
                public final Object get() {
                    return SimpleBasePlayer.lambda$increaseDeviceVolume$0(state);
                }
            });
        }
    }

    protected final void invalidateState() {
        verifyApplicationThreadAndInitState();
        if (!this.pendingOperations.isEmpty() || this.released) {
            return;
        }
        updateStateAndInformListeners(getState(), false, false);
    }

    @Override // androidx.media3.common.Player
    public final boolean isDeviceMuted() {
        verifyApplicationThreadAndInitState();
        return this.state.isDeviceMuted;
    }

    @Override // androidx.media3.common.Player
    public final boolean isLoading() {
        verifyApplicationThreadAndInitState();
        return this.state.isLoading;
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlayingAd() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdGroupIndex != -1;
    }

    @Override // androidx.media3.common.Player
    public final void moveMediaItems(final int i2, int i3, int i4) {
        verifyApplicationThreadAndInitState();
        boolean z = false;
        if (i2 >= 0 && i3 >= i2 && i4 >= 0) {
            z = true;
        }
        an.l(z);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (!shouldHandleCommand(20) || windowCount == 0 || i2 >= windowCount) {
            return;
        }
        final int iMin = Math.min(i3, windowCount);
        final int iMin2 = Math.min(i4, windowCount - (iMin - i2));
        if (i2 == iMin || iMin2 == i2) {
            return;
        }
        updateStateForPendingOperation(handleMoveMediaItems(i2, iMin, iMin2), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda56
            @Override // com.google.d.b.aj
            public final Object get() {
                return this.f$0.lambda$moveMediaItems$0(state, i2, iMin, iMin2);
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void mute() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(24) && this.state.volume != 0.0f) {
            updateStateForPendingOperation(handleSetVolume(0.0f, 1), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda37
                @Override // com.google.d.b.aj
                public final Object get() {
                    return SimpleBasePlayer.lambda$mute$0(state);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void prepare() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(2)) {
            updateStateForPendingOperation(handlePrepare(), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda63
                @Override // com.google.d.b.aj
                public final Object get() {
                    return SimpleBasePlayer.lambda$prepare$0(state);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void release() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(32)) {
            updateStateForPendingOperation(handleRelease(), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda52
                @Override // com.google.d.b.aj
                public final Object get() {
                    return state;
                }
            });
            this.released = true;
            this.listeners.release();
            State.Builder builderBuildUpon = this.state.buildUpon();
            builderBuildUpon.setPlaybackState(1);
            builderBuildUpon.setTotalBufferedDurationMs(PositionSupplier.ZERO);
            builderBuildUpon.setContentBufferedPositionMs(PositionSupplier.CC.getConstant(getContentPositionMsInternal(state, this.window)));
            builderBuildUpon.setAdBufferedPositionMs(state.adPositionMsSupplier);
            builderBuildUpon.setIsLoading(false);
            this.state = builderBuildUpon.build();
        }
    }

    @Override // androidx.media3.common.Player
    public final void removeListener(Player.Listener listener) {
        verifyApplicationThreadAndInitState();
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.common.Player
    public final void removeMediaItems(final int i2, int i3) {
        final int iMin;
        verifyApplicationThreadAndInitState();
        boolean z = false;
        if (i2 >= 0 && i3 >= i2) {
            z = true;
        }
        an.l(z);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (!shouldHandleCommand(20) || windowCount == 0 || i2 >= windowCount || i2 == (iMin = Math.min(i3, windowCount))) {
            return;
        }
        updateStateForPendingOperation(handleRemoveMediaItems(i2, iMin), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda60
            @Override // com.google.d.b.aj
            public final Object get() {
                return this.f$0.lambda$removeMediaItems$0(state, i2, iMin);
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void replaceMediaItems(final int i2, int i3, final List<MediaItem> list) {
        verifyApplicationThreadAndInitState();
        boolean z = false;
        if (i2 >= 0 && i2 <= i3) {
            z = true;
        }
        an.l(z);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (!shouldHandleCommand(20) || i2 > windowCount) {
            return;
        }
        final int iMin = Math.min(i3, windowCount);
        updateStateForPendingOperation(handleReplaceMediaItems(i2, iMin, list), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda36
            @Override // com.google.d.b.aj
            public final Object get() {
                return this.f$0.lambda$replaceMediaItems$0(state, list, iMin, i2);
            }
        });
    }

    @Override // androidx.media3.common.BasePlayer
    protected final void seekTo(final int i2, final long j2, int i3, boolean z) {
        verifyApplicationThreadAndInitState();
        an.l(i2 == -1 || i2 >= 0);
        final State state = this.state;
        if (shouldHandleCommand(i3)) {
            final boolean z2 = i2 == -1 || isPlayingAd() || (!state.timeline.isEmpty() && i2 >= state.timeline.getWindowCount());
            updateStateForPendingOperation(handleSeek(i2, j2, i3), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda59
                @Override // com.google.d.b.aj
                public final Object get() {
                    return this.f$0.lambda$seekTo$0(z2, state, i2, j2);
                }
            }, !z2, z);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setAudioAttributes(final AudioAttributes audioAttributes, boolean z) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(35)) {
            updateStateForPendingOperation(handleSetAudioAttributes(audioAttributes, z), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda58
                @Override // com.google.d.b.aj
                public final Object get() {
                    return SimpleBasePlayer.lambda$setAudioAttributes$0(state, audioAttributes);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void setDeviceMuted(final boolean z) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleSetDeviceMuted(z, 1), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda54
                @Override // com.google.d.b.aj
                public final Object get() {
                    return SimpleBasePlayer.lambda$setDeviceMuted$0(state, z);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void setDeviceVolume(final int i2) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(25)) {
            updateStateForPendingOperation(handleSetDeviceVolume(i2, 1), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda2
                @Override // com.google.d.b.aj
                public final Object get() {
                    return SimpleBasePlayer.lambda$setDeviceVolume$0(state, i2);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(List<MediaItem> list, boolean z) {
        verifyApplicationThreadAndInitState();
        setMediaItemsInternal(list, z ? -1 : this.state.currentMediaItemIndex, z ? C.TIME_UNSET : this.state.contentPositionMsSupplier.get());
    }

    @Override // androidx.media3.common.Player
    public final void setPlayWhenReady(final boolean z) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(1)) {
            updateStateForPendingOperation(handleSetPlayWhenReady(z), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda1
                @Override // com.google.d.b.aj
                public final Object get() {
                    return SimpleBasePlayer.lambda$setPlayWhenReady$0(state, z);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setPlaybackParameters(final PlaybackParameters playbackParameters) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(13)) {
            updateStateForPendingOperation(handleSetPlaybackParameters(playbackParameters), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda65
                @Override // com.google.d.b.aj
                public final Object get() {
                    return SimpleBasePlayer.lambda$setPlaybackParameters$0(state, playbackParameters);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setPlaylistMetadata(final MediaMetadata mediaMetadata) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(19)) {
            updateStateForPendingOperation(handleSetPlaylistMetadata(mediaMetadata), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda48
                @Override // com.google.d.b.aj
                public final Object get() {
                    return SimpleBasePlayer.lambda$setPlaylistMetadata$0(state, mediaMetadata);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setRepeatMode(final int i2) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(15)) {
            updateStateForPendingOperation(handleSetRepeatMode(i2), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda49
                @Override // com.google.d.b.aj
                public final Object get() {
                    return SimpleBasePlayer.lambda$setRepeatMode$0(state, i2);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setShuffleModeEnabled(final boolean z) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(14)) {
            updateStateForPendingOperation(handleSetShuffleModeEnabled(z), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda44
                @Override // com.google.d.b.aj
                public final Object get() {
                    return SimpleBasePlayer.lambda$setShuffleModeEnabled$0(state, z);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setTrackSelectionParameters(final TrackSelectionParameters trackSelectionParameters) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(29)) {
            updateStateForPendingOperation(handleSetTrackSelectionParameters(trackSelectionParameters), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda67
                @Override // com.google.d.b.aj
                public final Object get() {
                    return SimpleBasePlayer.lambda$setTrackSelectionParameters$0(state, trackSelectionParameters);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurface(Surface surface) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(27)) {
            if (surface == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(handleSetVideoOutput(surface), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda39
                    @Override // com.google.d.b.aj
                    public final Object get() {
                        return SimpleBasePlayer.lambda$setVideoSurface$0(state);
                    }
                });
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceHolder(final SurfaceHolder surfaceHolder) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(27)) {
            if (surfaceHolder == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(handleSetVideoOutput(surfaceHolder), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda51
                    @Override // com.google.d.b.aj
                    public final Object get() {
                        return SimpleBasePlayer.lambda$setVideoSurfaceHolder$0(state, surfaceHolder);
                    }
                });
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceView(final SurfaceView surfaceView) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(27)) {
            if (surfaceView == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(handleSetVideoOutput(surfaceView), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda53
                    @Override // com.google.d.b.aj
                    public final Object get() {
                        return SimpleBasePlayer.lambda$setVideoSurfaceView$0(state, surfaceView);
                    }
                });
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoTextureView(TextureView textureView) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(27)) {
            if (textureView == null) {
                clearVideoSurface();
            } else {
                final Size size = textureView.isAvailable() ? new Size(textureView.getWidth(), textureView.getHeight()) : Size.ZERO;
                updateStateForPendingOperation(handleSetVideoOutput(textureView), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda3
                    @Override // com.google.d.b.aj
                    public final Object get() {
                        return SimpleBasePlayer.lambda$setVideoTextureView$0(state, size);
                    }
                });
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVolume(final float f2) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(24)) {
            updateStateForPendingOperation(handleSetVolume(f2, 0), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda50
                @Override // com.google.d.b.aj
                public final Object get() {
                    return SimpleBasePlayer.lambda$setVolume$0(state, f2);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void stop() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(3)) {
            updateStateForPendingOperation(handleStop(), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda62
                @Override // com.google.d.b.aj
                public final Object get() {
                    return this.f$0.lambda$stop$0(state);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void unmute() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(24) && this.state.volume == 0.0f) {
            updateStateForPendingOperation(handleSetVolume(state.unmuteVolume, 2), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda0
                @Override // com.google.d.b.aj
                public final Object get() {
                    return SimpleBasePlayer.lambda$unmute$0(state);
                }
            });
        }
    }

    protected final void verifyApplicationThread() {
        if (Thread.currentThread() != this.applicationLooper.getThread()) {
            throw new IllegalStateException(Util.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\n", Thread.currentThread().getName(), this.applicationLooper.getThread().getName()));
        }
    }

    /* compiled from: WazeSource */
    public final class State {
        public final PositionSupplier adBufferedPositionMsSupplier;
        public final PositionSupplier adPositionMsSupplier;
        public final AudioAttributes audioAttributes;
        public final int audioSessionId;
        public final Player.Commands availableCommands;
        public final PositionSupplier contentBufferedPositionMsSupplier;
        public final PositionSupplier contentPositionMsSupplier;
        public final int currentAdGroupIndex;
        public final int currentAdIndexInAdGroup;
        public final CueGroup currentCues;
        public final int currentMediaItemIndex;
        public final MediaMetadata currentMetadata;
        public final Tracks currentTracks;
        public final DeviceInfo deviceInfo;
        public final int deviceVolume;
        public final long discontinuityPositionMs;
        public final boolean hasPositionDiscontinuity;
        public final boolean isDeviceMuted;
        public final boolean isLoading;
        public final long maxSeekToPreviousPositionMs;
        public final boolean newlyRenderedFirstFrame;
        public final boolean playWhenReady;
        public final int playWhenReadyChangeReason;
        public final PlaybackParameters playbackParameters;
        public final int playbackState;
        public final int playbackSuppressionReason;
        public final PlaybackException playerError;
        public final MediaMetadata playlistMetadata;
        public final int positionDiscontinuityReason;
        public final int repeatMode;
        public final long seekBackIncrementMs;
        public final long seekForwardIncrementMs;
        public final boolean shuffleModeEnabled;
        public final Size surfaceSize;
        public final Metadata timedMetadata;
        public final Timeline timeline;
        public final PositionSupplier totalBufferedDurationMsSupplier;
        public final TrackSelectionParameters trackSelectionParameters;
        public final float unmuteVolume;
        private final boolean usesDerivedMediaMetadata;
        public final VideoSize videoSize;
        public final float volume;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:55:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x018a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private State(androidx.media3.common.SimpleBasePlayer.State.Builder r18) {
            /*
                Method dump skipped, instructions count: 684
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.SimpleBasePlayer.State.<init>(androidx.media3.common.SimpleBasePlayer$State$Builder):void");
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.playWhenReady == state.playWhenReady && this.playWhenReadyChangeReason == state.playWhenReadyChangeReason && this.availableCommands.equals(state.availableCommands) && this.playbackState == state.playbackState && this.playbackSuppressionReason == state.playbackSuppressionReason && Objects.equals(this.playerError, state.playerError) && this.repeatMode == state.repeatMode && this.shuffleModeEnabled == state.shuffleModeEnabled && this.isLoading == state.isLoading && this.seekBackIncrementMs == state.seekBackIncrementMs && this.seekForwardIncrementMs == state.seekForwardIncrementMs && this.maxSeekToPreviousPositionMs == state.maxSeekToPreviousPositionMs && this.playbackParameters.equals(state.playbackParameters) && this.trackSelectionParameters.equals(state.trackSelectionParameters) && this.audioAttributes.equals(state.audioAttributes) && this.volume == state.volume && this.unmuteVolume == state.unmuteVolume && this.videoSize.equals(state.videoSize) && this.currentCues.equals(state.currentCues) && this.deviceInfo.equals(state.deviceInfo) && this.deviceVolume == state.deviceVolume && this.isDeviceMuted == state.isDeviceMuted && this.surfaceSize.equals(state.surfaceSize) && this.newlyRenderedFirstFrame == state.newlyRenderedFirstFrame && this.timedMetadata.equals(state.timedMetadata) && this.timeline.equals(state.timeline) && this.currentTracks.equals(state.currentTracks) && this.currentMetadata.equals(state.currentMetadata) && this.playlistMetadata.equals(state.playlistMetadata) && this.currentMediaItemIndex == state.currentMediaItemIndex && this.currentAdGroupIndex == state.currentAdGroupIndex && this.currentAdIndexInAdGroup == state.currentAdIndexInAdGroup && this.contentPositionMsSupplier.equals(state.contentPositionMsSupplier) && this.adPositionMsSupplier.equals(state.adPositionMsSupplier) && this.contentBufferedPositionMsSupplier.equals(state.contentBufferedPositionMsSupplier) && this.adBufferedPositionMsSupplier.equals(state.adBufferedPositionMsSupplier) && this.totalBufferedDurationMsSupplier.equals(state.totalBufferedDurationMsSupplier) && this.hasPositionDiscontinuity == state.hasPositionDiscontinuity && this.positionDiscontinuityReason == state.positionDiscontinuityReason && this.discontinuityPositionMs == state.discontinuityPositionMs;
        }

        public bn<MediaItemData> getPlaylist() {
            Timeline timeline = this.timeline;
            if (timeline instanceof PlaylistTimeline) {
                return ((PlaylistTimeline) timeline).playlist;
            }
            Timeline.Window window = new Timeline.Window();
            Timeline.Period period = new Timeline.Period();
            bi biVarC = bn.c(this.timeline.getWindowCount());
            for (int i2 = 0; i2 < this.timeline.getWindowCount(); i2++) {
                biVarC.g(MediaItemData.buildFromState(this, i2, period, window));
            }
            return biVarC.f();
        }

        public int hashCode() {
            int iHashCode = this.availableCommands.hashCode() + DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_8;
            PlaybackException playbackException = this.playerError;
            int iHashCode2 = playbackException == null ? 0 : playbackException.hashCode();
            boolean z = this.playWhenReady;
            int i2 = this.playWhenReadyChangeReason;
            int i3 = ((((((((((((((iHashCode * 31) + (z ? 1 : 0)) * 31) + i2) * 31) + this.playbackState) * 31) + this.playbackSuppressionReason) * 31) + iHashCode2) * 31) + this.repeatMode) * 31) + (this.shuffleModeEnabled ? 1 : 0)) * 31;
            boolean z2 = this.isLoading;
            long j2 = this.seekBackIncrementMs;
            long j3 = this.seekForwardIncrementMs;
            long j4 = this.maxSeekToPreviousPositionMs;
            long j5 = j3 ^ (j3 >>> 32);
            int iHashCode3 = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((i3 + (z2 ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) j5)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.playbackParameters.hashCode()) * 31) + this.trackSelectionParameters.hashCode()) * 31) + this.audioAttributes.hashCode()) * 31) + Float.floatToRawIntBits(this.volume)) * 31) + Float.floatToRawIntBits(this.unmuteVolume)) * 31) + this.videoSize.hashCode()) * 31) + this.currentCues.hashCode()) * 31) + this.deviceInfo.hashCode()) * 31) + this.deviceVolume) * 31) + (this.isDeviceMuted ? 1 : 0)) * 31) + this.surfaceSize.hashCode()) * 31) + (this.newlyRenderedFirstFrame ? 1 : 0)) * 31) + this.timedMetadata.hashCode()) * 31) + this.timeline.hashCode()) * 31) + this.currentTracks.hashCode()) * 31) + this.currentMetadata.hashCode()) * 31) + this.playlistMetadata.hashCode()) * 31) + this.currentMediaItemIndex) * 31) + this.currentAdGroupIndex) * 31) + this.currentAdIndexInAdGroup) * 31) + this.contentPositionMsSupplier.hashCode()) * 31) + this.adPositionMsSupplier.hashCode()) * 31) + this.contentBufferedPositionMsSupplier.hashCode()) * 31) + this.adBufferedPositionMsSupplier.hashCode()) * 31) + this.totalBufferedDurationMsSupplier.hashCode()) * 31) + (this.hasPositionDiscontinuity ? 1 : 0)) * 31) + this.positionDiscontinuityReason) * 31;
            long j6 = this.discontinuityPositionMs;
            return iHashCode3 + ((int) (j6 ^ (j6 >>> 32)));
        }

        /* compiled from: WazeSource */
        public final class Builder {
            private PositionSupplier adBufferedPositionMsSupplier;
            private Long adPositionMs;
            private PositionSupplier adPositionMsSupplier;
            private AudioAttributes audioAttributes;
            private int audioSessionId;
            private Player.Commands availableCommands;
            private PositionSupplier contentBufferedPositionMsSupplier;
            private Long contentPositionMs;
            private PositionSupplier contentPositionMsSupplier;
            private int currentAdGroupIndex;
            private int currentAdIndexInAdGroup;
            private CueGroup currentCues;
            private int currentMediaItemIndex;
            private MediaMetadata currentMetadata;
            private Tracks currentTracks;
            private DeviceInfo deviceInfo;
            private int deviceVolume;
            private long discontinuityPositionMs;
            private boolean hasPositionDiscontinuity;
            private boolean isDeviceMuted;
            private boolean isLoading;
            private long maxSeekToPreviousPositionMs;
            private boolean newlyRenderedFirstFrame;
            private boolean playWhenReady;
            private int playWhenReadyChangeReason;
            private PlaybackParameters playbackParameters;
            private int playbackState;
            private int playbackSuppressionReason;
            private PlaybackException playerError;
            private bn<MediaItemData> playlist;
            private MediaMetadata playlistMetadata;
            private int positionDiscontinuityReason;
            private int repeatMode;
            private long seekBackIncrementMs;
            private long seekForwardIncrementMs;
            private boolean shuffleModeEnabled;
            private Size surfaceSize;
            private Metadata timedMetadata;
            private Timeline timeline;
            private PositionSupplier totalBufferedDurationMsSupplier;
            private TrackSelectionParameters trackSelectionParameters;
            private float unmuteVolume;
            private VideoSize videoSize;
            private float volume;

            private Builder(State state) {
                this.availableCommands = state.availableCommands;
                this.playWhenReady = state.playWhenReady;
                this.playWhenReadyChangeReason = state.playWhenReadyChangeReason;
                this.playbackState = state.playbackState;
                this.playbackSuppressionReason = state.playbackSuppressionReason;
                this.playerError = state.playerError;
                this.repeatMode = state.repeatMode;
                this.shuffleModeEnabled = state.shuffleModeEnabled;
                this.isLoading = state.isLoading;
                this.seekBackIncrementMs = state.seekBackIncrementMs;
                this.seekForwardIncrementMs = state.seekForwardIncrementMs;
                this.maxSeekToPreviousPositionMs = state.maxSeekToPreviousPositionMs;
                this.playbackParameters = state.playbackParameters;
                this.trackSelectionParameters = state.trackSelectionParameters;
                this.audioAttributes = state.audioAttributes;
                this.audioSessionId = state.audioSessionId;
                this.volume = state.volume;
                this.unmuteVolume = state.unmuteVolume;
                this.videoSize = state.videoSize;
                this.currentCues = state.currentCues;
                this.deviceInfo = state.deviceInfo;
                this.deviceVolume = state.deviceVolume;
                this.isDeviceMuted = state.isDeviceMuted;
                this.surfaceSize = state.surfaceSize;
                this.newlyRenderedFirstFrame = state.newlyRenderedFirstFrame;
                this.timedMetadata = state.timedMetadata;
                this.timeline = state.timeline;
                Timeline timeline = state.timeline;
                if (timeline instanceof PlaylistTimeline) {
                    this.playlist = ((PlaylistTimeline) timeline).playlist;
                } else {
                    this.currentTracks = state.currentTracks;
                    this.currentMetadata = state.usesDerivedMediaMetadata ? null : state.currentMetadata;
                }
                this.playlistMetadata = state.playlistMetadata;
                this.currentMediaItemIndex = state.currentMediaItemIndex;
                this.currentAdGroupIndex = state.currentAdGroupIndex;
                this.currentAdIndexInAdGroup = state.currentAdIndexInAdGroup;
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = state.contentPositionMsSupplier;
                this.adPositionMs = null;
                this.adPositionMsSupplier = state.adPositionMsSupplier;
                this.contentBufferedPositionMsSupplier = state.contentBufferedPositionMsSupplier;
                this.adBufferedPositionMsSupplier = state.adBufferedPositionMsSupplier;
                this.totalBufferedDurationMsSupplier = state.totalBufferedDurationMsSupplier;
                this.hasPositionDiscontinuity = state.hasPositionDiscontinuity;
                this.positionDiscontinuityReason = state.positionDiscontinuityReason;
                this.discontinuityPositionMs = state.discontinuityPositionMs;
            }

            public State build() {
                return new State(this);
            }

            public Builder clearPositionDiscontinuity() {
                this.hasPositionDiscontinuity = false;
                return this;
            }

            public Builder setAdBufferedPositionMs(PositionSupplier positionSupplier) {
                this.adBufferedPositionMsSupplier = positionSupplier;
                return this;
            }

            public Builder setAdPositionMs(long j2) {
                this.adPositionMs = Long.valueOf(j2);
                return this;
            }

            public Builder setAudioAttributes(AudioAttributes audioAttributes) {
                this.audioAttributes = audioAttributes;
                return this;
            }

            public Builder setAudioSessionId(int i2) {
                this.audioSessionId = i2;
                return this;
            }

            public Builder setAvailableCommands(Player.Commands commands) {
                this.availableCommands = commands;
                return this;
            }

            public Builder setContentBufferedPositionMs(PositionSupplier positionSupplier) {
                this.contentBufferedPositionMsSupplier = positionSupplier;
                return this;
            }

            public Builder setContentPositionMs(long j2) {
                this.contentPositionMs = Long.valueOf(j2);
                return this;
            }

            public Builder setCurrentAd(int i2, int i3) {
                an.l((i2 == -1) == (i3 == -1));
                this.currentAdGroupIndex = i2;
                this.currentAdIndexInAdGroup = i3;
                return this;
            }

            public Builder setCurrentCues(CueGroup cueGroup) {
                this.currentCues = cueGroup;
                return this;
            }

            public Builder setCurrentMediaItemIndex(int i2) {
                this.currentMediaItemIndex = i2;
                return this;
            }

            public Builder setDeviceInfo(DeviceInfo deviceInfo) {
                this.deviceInfo = deviceInfo;
                return this;
            }

            public Builder setDeviceVolume(int i2) {
                an.l(i2 >= 0);
                this.deviceVolume = i2;
                return this;
            }

            public Builder setIsDeviceMuted(boolean z) {
                this.isDeviceMuted = z;
                return this;
            }

            public Builder setIsLoading(boolean z) {
                this.isLoading = z;
                return this;
            }

            public Builder setMaxSeekToPreviousPositionMs(long j2) {
                this.maxSeekToPreviousPositionMs = j2;
                return this;
            }

            public Builder setNewlyRenderedFirstFrame(boolean z) {
                this.newlyRenderedFirstFrame = z;
                return this;
            }

            public Builder setPlayWhenReady(boolean z, int i2) {
                this.playWhenReady = z;
                this.playWhenReadyChangeReason = i2;
                return this;
            }

            public Builder setPlaybackParameters(PlaybackParameters playbackParameters) {
                this.playbackParameters = playbackParameters;
                return this;
            }

            public Builder setPlaybackState(int i2) {
                this.playbackState = i2;
                return this;
            }

            public Builder setPlaybackSuppressionReason(int i2) {
                this.playbackSuppressionReason = i2;
                return this;
            }

            public Builder setPlayerError(PlaybackException playbackException) {
                this.playerError = playbackException;
                return this;
            }

            public Builder setPlaylist(List<MediaItemData> list) {
                HashSet hashSet = new HashSet();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    an.m(hashSet.add(list.get(i2).uid), "Duplicate MediaItemData UID in playlist");
                }
                this.playlist = bn.n(list);
                this.timeline = new PlaylistTimeline(this.playlist);
                this.currentTracks = null;
                this.currentMetadata = null;
                return this;
            }

            public Builder setPlaylistMetadata(MediaMetadata mediaMetadata) {
                this.playlistMetadata = mediaMetadata;
                return this;
            }

            public Builder setPositionDiscontinuity(int i2, long j2) {
                this.hasPositionDiscontinuity = true;
                this.positionDiscontinuityReason = i2;
                this.discontinuityPositionMs = j2;
                return this;
            }

            public Builder setRepeatMode(int i2) {
                this.repeatMode = i2;
                return this;
            }

            public Builder setSeekBackIncrementMs(long j2) {
                this.seekBackIncrementMs = j2;
                return this;
            }

            public Builder setSeekForwardIncrementMs(long j2) {
                this.seekForwardIncrementMs = j2;
                return this;
            }

            public Builder setShuffleModeEnabled(boolean z) {
                this.shuffleModeEnabled = z;
                return this;
            }

            public Builder setSurfaceSize(Size size) {
                this.surfaceSize = size;
                return this;
            }

            public Builder setTimedMetadata(Metadata metadata) {
                this.timedMetadata = metadata;
                return this;
            }

            public Builder setTotalBufferedDurationMs(PositionSupplier positionSupplier) {
                this.totalBufferedDurationMsSupplier = positionSupplier;
                return this;
            }

            public Builder setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
                this.trackSelectionParameters = trackSelectionParameters;
                return this;
            }

            public Builder setUnmuteVolume(float f2) {
                boolean z = false;
                if (f2 >= 0.0f && f2 <= 1.0f) {
                    z = true;
                }
                an.l(z);
                this.unmuteVolume = f2;
                return this;
            }

            public Builder setVideoSize(VideoSize videoSize) {
                this.videoSize = videoSize;
                return this;
            }

            public Builder setVolume(float f2) {
                boolean z = false;
                if (f2 >= 0.0f && f2 <= 1.0f) {
                    z = true;
                }
                an.l(z);
                this.unmuteVolume = f2 != 0.0f ? f2 : this.volume;
                this.volume = f2;
                return this;
            }

            public Builder setAdPositionMs(PositionSupplier positionSupplier) {
                this.adPositionMs = null;
                this.adPositionMsSupplier = positionSupplier;
                return this;
            }

            public Builder setContentPositionMs(PositionSupplier positionSupplier) {
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = positionSupplier;
                return this;
            }

            public Builder setPlaylist(Timeline timeline, Tracks tracks, MediaMetadata mediaMetadata) {
                this.playlist = null;
                this.timeline = timeline;
                this.currentTracks = tracks;
                this.currentMetadata = mediaMetadata;
                return this;
            }

            public Builder() {
                this.availableCommands = Player.Commands.EMPTY;
                this.playWhenReady = false;
                this.playWhenReadyChangeReason = 1;
                this.playbackState = 1;
                this.playbackSuppressionReason = 0;
                this.playerError = null;
                this.repeatMode = 0;
                this.shuffleModeEnabled = false;
                this.isLoading = false;
                this.seekBackIncrementMs = 5000L;
                this.seekForwardIncrementMs = 15000L;
                this.maxSeekToPreviousPositionMs = C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
                this.playbackParameters = PlaybackParameters.DEFAULT;
                this.trackSelectionParameters = TrackSelectionParameters.DEFAULT;
                this.audioAttributes = AudioAttributes.DEFAULT;
                this.audioSessionId = 0;
                this.volume = 1.0f;
                this.unmuteVolume = 1.0f;
                this.videoSize = VideoSize.UNKNOWN;
                this.currentCues = CueGroup.EMPTY_TIME_ZERO;
                this.deviceInfo = DeviceInfo.UNKNOWN;
                this.deviceVolume = 0;
                this.isDeviceMuted = false;
                this.surfaceSize = Size.UNKNOWN;
                this.newlyRenderedFirstFrame = false;
                this.timedMetadata = new Metadata(C.TIME_UNSET, new Metadata.Entry[0]);
                this.playlist = bn.p();
                this.timeline = Timeline.EMPTY;
                this.currentTracks = null;
                this.currentMetadata = null;
                this.playlistMetadata = MediaMetadata.EMPTY;
                this.currentMediaItemIndex = -1;
                this.currentAdGroupIndex = -1;
                this.currentAdIndexInAdGroup = -1;
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = PositionSupplier.CC.getConstant(C.TIME_UNSET);
                this.adPositionMs = null;
                PositionSupplier positionSupplier = PositionSupplier.ZERO;
                this.adPositionMsSupplier = positionSupplier;
                this.contentBufferedPositionMsSupplier = PositionSupplier.CC.getConstant(C.TIME_UNSET);
                this.adBufferedPositionMsSupplier = positionSupplier;
                this.totalBufferedDurationMsSupplier = positionSupplier;
                this.hasPositionDiscontinuity = false;
                this.positionDiscontinuityReason = 5;
                this.discontinuityPositionMs = 0L;
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurface(Surface surface) {
        clearVideoOutput(surface);
    }

    protected bm<?> handleSetVolume(float f2, int i2) {
        return handleSetVolume(f2);
    }

    /* compiled from: WazeSource */
    public final class PeriodData {
        public final AdPlaybackState adPlaybackState;
        public final long durationUs;
        public final boolean isPlaceholder;
        public final Object uid;

        private PeriodData(Builder builder) {
            this.uid = builder.uid;
            this.durationUs = builder.durationUs;
            this.adPlaybackState = builder.adPlaybackState;
            this.isPlaceholder = builder.isPlaceholder;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PeriodData)) {
                return false;
            }
            PeriodData periodData = (PeriodData) obj;
            return this.uid.equals(periodData.uid) && this.durationUs == periodData.durationUs && this.adPlaybackState.equals(periodData.adPlaybackState) && this.isPlaceholder == periodData.isPlaceholder;
        }

        public int hashCode() {
            int iHashCode = this.uid.hashCode() + DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_8;
            long j2 = this.durationUs;
            return (((((iHashCode * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.adPlaybackState.hashCode()) * 31) + (this.isPlaceholder ? 1 : 0);
        }

        /* compiled from: WazeSource */
        public final class Builder {
            private AdPlaybackState adPlaybackState;
            private long durationUs;
            private boolean isPlaceholder;
            private Object uid;

            private Builder(PeriodData periodData) {
                this.uid = periodData.uid;
                this.durationUs = periodData.durationUs;
                this.adPlaybackState = periodData.adPlaybackState;
                this.isPlaceholder = periodData.isPlaceholder;
            }

            public PeriodData build() {
                return new PeriodData(this);
            }

            public Builder setAdPlaybackState(AdPlaybackState adPlaybackState) {
                this.adPlaybackState = adPlaybackState;
                return this;
            }

            public Builder setDurationUs(long j2) {
                boolean z = true;
                if (j2 != C.TIME_UNSET && j2 < 0) {
                    z = false;
                }
                an.l(z);
                this.durationUs = j2;
                return this;
            }

            public Builder setIsPlaceholder(boolean z) {
                this.isPlaceholder = z;
                return this;
            }

            public Builder setUid(Object obj) {
                this.uid = obj;
                return this;
            }

            public Builder(Object obj) {
                this.uid = obj;
                this.durationUs = 0L;
                this.adPlaybackState = AdPlaybackState.NONE;
                this.isPlaceholder = false;
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void decreaseDeviceVolume(int i2) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleDecreaseDeviceVolume(i2), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda64
                @Override // com.google.d.b.aj
                public final Object get() {
                    return SimpleBasePlayer.lambda$decreaseDeviceVolume$1(state);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void increaseDeviceVolume(int i2) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleIncreaseDeviceVolume(i2), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda42
                @Override // com.google.d.b.aj
                public final Object get() {
                    return SimpleBasePlayer.lambda$increaseDeviceVolume$1(state);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setDeviceMuted(final boolean z, int i2) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleSetDeviceMuted(z, i2), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda66
                @Override // com.google.d.b.aj
                public final Object get() {
                    return SimpleBasePlayer.lambda$setDeviceMuted$1(state, z);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setDeviceVolume(final int i2, int i3) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(33)) {
            updateStateForPendingOperation(handleSetDeviceVolume(i2, i3), new aj() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda45
                @Override // com.google.d.b.aj
                public final Object get() {
                    return SimpleBasePlayer.lambda$setDeviceVolume$1(state, i2);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(List<MediaItem> list, int i2, long j2) {
        verifyApplicationThreadAndInitState();
        if (i2 == -1) {
            State state = this.state;
            int i3 = state.currentMediaItemIndex;
            long j3 = state.contentPositionMsSupplier.get();
            i2 = i3;
            j2 = j3;
        }
        setMediaItemsInternal(list, i2, j2);
    }

    protected SimpleBasePlayer(Looper looper) {
        this(looper, Clock.DEFAULT);
    }

    private void updateStateForPendingOperation(bm<?> bmVar, aj<State> ajVar) {
        updateStateForPendingOperation(bmVar, ajVar, false, false);
    }

    /* compiled from: WazeSource */
    public final class MediaItemData {
        public final long defaultPositionUs;
        public final long durationUs;
        public final long elapsedRealtimeEpochOffsetMs;
        public final boolean isDynamic;
        public final boolean isPlaceholder;
        public final boolean isSeekable;
        public final MediaItem.LiveConfiguration liveConfiguration;
        public final Object manifest;
        public final MediaItem mediaItem;
        public final MediaMetadata mediaMetadata;
        private final long[] periodPositionInWindowUs;
        public final bn<PeriodData> periods;
        public final long positionInFirstPeriodUs;
        public final long presentationStartTimeMs;
        public final Tracks tracks;
        public final Object uid;
        public final long windowStartTimeMs;

        /* renamed from: -$$Nest$mgetPeriod, reason: not valid java name */
        static /* bridge */ /* synthetic */ Timeline.Period m12179$$Nest$mgetPeriod(MediaItemData mediaItemData, int i2, int i3, Timeline.Period period) {
            mediaItemData.getPeriod(i2, i3, period);
            return period;
        }

        /* renamed from: -$$Nest$mgetWindow, reason: not valid java name */
        static /* bridge */ /* synthetic */ Timeline.Window m12181$$Nest$mgetWindow(MediaItemData mediaItemData, int i2, Timeline.Window window) {
            mediaItemData.getWindow(i2, window);
            return window;
        }

        private MediaItemData(Builder builder) {
            int i2 = 0;
            if (builder.liveConfiguration == null) {
                an.m(builder.presentationStartTimeMs == C.TIME_UNSET, "presentationStartTimeMs can only be set if liveConfiguration != null");
                an.m(builder.windowStartTimeMs == C.TIME_UNSET, "windowStartTimeMs can only be set if liveConfiguration != null");
                an.m(builder.elapsedRealtimeEpochOffsetMs == C.TIME_UNSET, "elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null");
            } else if (builder.presentationStartTimeMs != C.TIME_UNSET && builder.windowStartTimeMs != C.TIME_UNSET) {
                an.m(builder.windowStartTimeMs >= builder.presentationStartTimeMs, "windowStartTimeMs can't be less than presentationStartTimeMs");
            }
            int size = builder.periods.size();
            if (builder.durationUs != C.TIME_UNSET) {
                an.m(builder.defaultPositionUs <= builder.durationUs, "defaultPositionUs can't be greater than durationUs");
            }
            this.uid = builder.uid;
            this.tracks = builder.tracks;
            this.mediaItem = builder.mediaItem;
            this.mediaMetadata = builder.mediaMetadata;
            this.manifest = builder.manifest;
            this.liveConfiguration = builder.liveConfiguration;
            this.presentationStartTimeMs = builder.presentationStartTimeMs;
            this.windowStartTimeMs = builder.windowStartTimeMs;
            this.elapsedRealtimeEpochOffsetMs = builder.elapsedRealtimeEpochOffsetMs;
            this.isSeekable = builder.isSeekable;
            this.isDynamic = builder.isDynamic;
            this.defaultPositionUs = builder.defaultPositionUs;
            this.durationUs = builder.durationUs;
            long j2 = builder.positionInFirstPeriodUs;
            this.positionInFirstPeriodUs = j2;
            this.isPlaceholder = builder.isPlaceholder;
            bn<PeriodData> bnVar = builder.periods;
            this.periods = bnVar;
            long[] jArr = new long[bnVar.size()];
            this.periodPositionInWindowUs = jArr;
            if (bnVar.isEmpty()) {
                return;
            }
            jArr[0] = -j2;
            while (i2 < size - 1) {
                long[] jArr2 = this.periodPositionInWindowUs;
                int i3 = i2 + 1;
                jArr2[i3] = jArr2[i2] + this.periods.get(i2).durationUs;
                i2 = i3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static MediaItemData buildFromState(State state, int i2, Timeline.Period period, Timeline.Window window) {
            int currentMediaItemIndexInternal = SimpleBasePlayer.getCurrentMediaItemIndexInternal(state);
            state.timeline.getWindow(i2, window);
            int i3 = bn.f7456d;
            bi biVar = new bi();
            int i4 = window.firstPeriodIndex;
            while (true) {
                if (i4 > window.lastPeriodIndex) {
                    break;
                }
                state.timeline.getPeriod(i4, period, true);
                Object obj = period.uid;
                an.B(obj);
                PeriodData.Builder builder = new PeriodData.Builder(obj);
                builder.setAdPlaybackState(period.adPlaybackState);
                builder.setDurationUs(period.durationUs);
                builder.setIsPlaceholder(period.isPlaceholder);
                biVar.g(builder.build());
                i4++;
            }
            boolean z = currentMediaItemIndexInternal == i2;
            Builder builder2 = new Builder(window.uid);
            builder2.setDefaultPositionUs(window.defaultPositionUs);
            builder2.setDurationUs(window.durationUs);
            builder2.setElapsedRealtimeEpochOffsetMs(window.elapsedRealtimeEpochOffsetMs);
            builder2.setIsDynamic(window.isDynamic);
            builder2.setIsPlaceholder(window.isPlaceholder);
            builder2.setIsSeekable(window.isSeekable);
            builder2.setLiveConfiguration(window.liveConfiguration);
            builder2.setManifest(window.manifest);
            builder2.setMediaItem(window.mediaItem);
            builder2.setMediaMetadata(z ? state.currentMetadata : null);
            builder2.setPeriods(biVar.f());
            builder2.setPositionInFirstPeriodUs(window.positionInFirstPeriodUs);
            builder2.setPresentationStartTimeMs(window.presentationStartTimeMs);
            builder2.setTracks(z ? state.currentTracks : Tracks.EMPTY);
            builder2.setWindowStartTimeMs(window.windowStartTimeMs);
            return builder2.build();
        }

        private Timeline.Period getPeriod(int i2, int i3, Timeline.Period period) {
            if (!this.periods.isEmpty()) {
                PeriodData periodData = this.periods.get(i3);
                Object obj = periodData.uid;
                period.set(obj, Pair.create(this.uid, obj), i2, periodData.durationUs, this.periodPositionInWindowUs[i3], periodData.adPlaybackState, periodData.isPlaceholder);
                return period;
            }
            Object obj2 = this.uid;
            long j2 = this.positionInFirstPeriodUs;
            long j3 = this.durationUs;
            long j4 = j2 + j3;
            period.set(obj2, obj2, i2, j4, -j2, AdPlaybackState.NONE, this.isPlaceholder);
            return period;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object getPeriodUid(int i2) {
            if (this.periods.isEmpty()) {
                return this.uid;
            }
            return Pair.create(this.uid, this.periods.get(i2).uid);
        }

        private Timeline.Window getWindow(int i2, Timeline.Window window) {
            window.set(this.uid, this.mediaItem, this.manifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, this.isSeekable, this.isDynamic, this.liveConfiguration, this.defaultPositionUs, this.durationUs, i2, (i2 + (this.periods.isEmpty() ? 1 : this.periods.size())) - 1, this.positionInFirstPeriodUs);
            window.isPlaceholder = this.isPlaceholder;
            return window;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaItemData)) {
                return false;
            }
            MediaItemData mediaItemData = (MediaItemData) obj;
            return this.uid.equals(mediaItemData.uid) && this.tracks.equals(mediaItemData.tracks) && this.mediaItem.equals(mediaItemData.mediaItem) && Objects.equals(this.mediaMetadata, mediaItemData.mediaMetadata) && Objects.equals(this.manifest, mediaItemData.manifest) && Objects.equals(this.liveConfiguration, mediaItemData.liveConfiguration) && this.presentationStartTimeMs == mediaItemData.presentationStartTimeMs && this.windowStartTimeMs == mediaItemData.windowStartTimeMs && this.elapsedRealtimeEpochOffsetMs == mediaItemData.elapsedRealtimeEpochOffsetMs && this.isSeekable == mediaItemData.isSeekable && this.isDynamic == mediaItemData.isDynamic && this.defaultPositionUs == mediaItemData.defaultPositionUs && this.durationUs == mediaItemData.durationUs && this.positionInFirstPeriodUs == mediaItemData.positionInFirstPeriodUs && this.isPlaceholder == mediaItemData.isPlaceholder && this.periods.equals(mediaItemData.periods);
        }

        public int hashCode() {
            int iHashCode = ((((this.uid.hashCode() + DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_8) * 31) + this.tracks.hashCode()) * 31) + this.mediaItem.hashCode();
            MediaMetadata mediaMetadata = this.mediaMetadata;
            int iHashCode2 = ((iHashCode * 31) + (mediaMetadata == null ? 0 : mediaMetadata.hashCode())) * 31;
            Object obj = this.manifest;
            int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            int iHashCode4 = liveConfiguration != null ? liveConfiguration.hashCode() : 0;
            long j2 = this.presentationStartTimeMs;
            int i2 = (((iHashCode3 + iHashCode4) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.windowStartTimeMs;
            int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.elapsedRealtimeEpochOffsetMs;
            int i4 = (((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.isSeekable ? 1 : 0)) * 31) + (this.isDynamic ? 1 : 0)) * 31;
            long j5 = this.defaultPositionUs;
            int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.durationUs;
            int i6 = (i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
            long j7 = this.positionInFirstPeriodUs;
            return ((((i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.isPlaceholder ? 1 : 0)) * 31) + this.periods.hashCode();
        }

        /* compiled from: WazeSource */
        public final class Builder {
            private long defaultPositionUs;
            private long durationUs;
            private long elapsedRealtimeEpochOffsetMs;
            private boolean isDynamic;
            private boolean isPlaceholder;
            private boolean isSeekable;
            private MediaItem.LiveConfiguration liveConfiguration;
            private Object manifest;
            private MediaItem mediaItem;
            private MediaMetadata mediaMetadata;
            private bn<PeriodData> periods;
            private long positionInFirstPeriodUs;
            private long presentationStartTimeMs;
            private Tracks tracks;
            private Object uid;
            private long windowStartTimeMs;

            private Builder(MediaItemData mediaItemData) {
                this.uid = mediaItemData.uid;
                this.tracks = mediaItemData.tracks;
                this.mediaItem = mediaItemData.mediaItem;
                this.mediaMetadata = mediaItemData.mediaMetadata;
                this.manifest = mediaItemData.manifest;
                this.liveConfiguration = mediaItemData.liveConfiguration;
                this.presentationStartTimeMs = mediaItemData.presentationStartTimeMs;
                this.windowStartTimeMs = mediaItemData.windowStartTimeMs;
                this.elapsedRealtimeEpochOffsetMs = mediaItemData.elapsedRealtimeEpochOffsetMs;
                this.isSeekable = mediaItemData.isSeekable;
                this.isDynamic = mediaItemData.isDynamic;
                this.defaultPositionUs = mediaItemData.defaultPositionUs;
                this.durationUs = mediaItemData.durationUs;
                this.positionInFirstPeriodUs = mediaItemData.positionInFirstPeriodUs;
                this.isPlaceholder = mediaItemData.isPlaceholder;
                this.periods = mediaItemData.periods;
            }

            public MediaItemData build() {
                return new MediaItemData(this);
            }

            public Builder setDefaultPositionUs(long j2) {
                an.l(j2 >= 0);
                this.defaultPositionUs = j2;
                return this;
            }

            public Builder setDurationUs(long j2) {
                boolean z = true;
                if (j2 != C.TIME_UNSET && j2 < 0) {
                    z = false;
                }
                an.l(z);
                this.durationUs = j2;
                return this;
            }

            public Builder setElapsedRealtimeEpochOffsetMs(long j2) {
                this.elapsedRealtimeEpochOffsetMs = j2;
                return this;
            }

            public Builder setIsDynamic(boolean z) {
                this.isDynamic = z;
                return this;
            }

            public Builder setIsPlaceholder(boolean z) {
                this.isPlaceholder = z;
                return this;
            }

            public Builder setIsSeekable(boolean z) {
                this.isSeekable = z;
                return this;
            }

            public Builder setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration) {
                this.liveConfiguration = liveConfiguration;
                return this;
            }

            public Builder setManifest(Object obj) {
                this.manifest = obj;
                return this;
            }

            public Builder setMediaItem(MediaItem mediaItem) {
                this.mediaItem = mediaItem;
                return this;
            }

            public Builder setMediaMetadata(MediaMetadata mediaMetadata) {
                this.mediaMetadata = mediaMetadata;
                return this;
            }

            public Builder setPeriods(List<PeriodData> list) {
                int size = list.size();
                int i2 = 0;
                while (i2 < size - 1) {
                    an.m(list.get(i2).durationUs != C.TIME_UNSET, "Periods other than last need a duration");
                    int i3 = i2 + 1;
                    for (int i4 = i3; i4 < size; i4++) {
                        an.m(!list.get(i2).uid.equals(list.get(i4).uid), "Duplicate PeriodData UIDs in period list");
                    }
                    i2 = i3;
                }
                this.periods = bn.n(list);
                return this;
            }

            public Builder setPositionInFirstPeriodUs(long j2) {
                an.l(j2 >= 0);
                this.positionInFirstPeriodUs = j2;
                return this;
            }

            public Builder setPresentationStartTimeMs(long j2) {
                this.presentationStartTimeMs = j2;
                return this;
            }

            public Builder setTracks(Tracks tracks) {
                this.tracks = tracks;
                return this;
            }

            public Builder setUid(Object obj) {
                this.uid = obj;
                return this;
            }

            public Builder setWindowStartTimeMs(long j2) {
                this.windowStartTimeMs = j2;
                return this;
            }

            public Builder(Object obj) {
                this.uid = obj;
                this.tracks = Tracks.EMPTY;
                this.mediaItem = MediaItem.EMPTY;
                this.mediaMetadata = null;
                this.manifest = null;
                this.liveConfiguration = null;
                this.presentationStartTimeMs = C.TIME_UNSET;
                this.windowStartTimeMs = C.TIME_UNSET;
                this.elapsedRealtimeEpochOffsetMs = C.TIME_UNSET;
                this.isSeekable = false;
                this.isDynamic = false;
                this.defaultPositionUs = 0L;
                this.durationUs = C.TIME_UNSET;
                this.positionInFirstPeriodUs = 0L;
                this.isPlaceholder = false;
                this.periods = bn.p();
            }
        }
    }
}
