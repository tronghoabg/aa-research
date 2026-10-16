package androidx.media3.exoplayer.source.ads;

import android.os.Handler;
import android.util.Pair;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.StreamKey;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.KeyRequestInfo;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.EmptySampleStream;
import androidx.media3.exoplayer.source.ForwardingTimeline;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.d.b.an;
import com.google.d.d.ab;
import com.google.d.d.bh;
import com.google.d.d.bn;
import com.google.d.d.bs;
import com.google.d.d.dc;
import com.google.d.d.fo;
import com.google.d.d.fu;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ServerSideAdInsertionMediaSource extends BaseMediaSource implements MediaSource.MediaSourceCaller, MediaSourceEventListener, DrmSessionEventListener {
    private final AdPlaybackStateUpdater adPlaybackStateUpdater;
    private SharedMediaPeriod lastUsedMediaPeriod;
    private final MediaSource mediaSource;
    private Handler playbackHandler;
    private Timeline sourceTimeline;
    private Timeline splitTimeline;
    private final dc<Pair<Long, Object>, SharedMediaPeriod> mediaPeriods = ab.I();
    private bs<Object, AdPlaybackState> adPlaybackStates = bs.f();
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcherWithoutId = createEventDispatcher(null);
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcherWithoutId = createDrmEventDispatcher(null);
    private final Timeline.Period period = new Timeline.Period();

    /* compiled from: WazeSource */
    public interface AdPlaybackStateUpdater {
        boolean onAdPlaybackStateUpdateRequested(Timeline timeline);
    }

    /* compiled from: WazeSource */
    final class MediaPeriodImpl implements MediaPeriod {
        public MediaPeriod.Callback callback;
        public final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
        public long endPositionUs;
        public boolean[] hasNotifiedDownstreamFormatChange = new boolean[0];
        public boolean isPrepared;
        public long lastStartPositionUs;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
        public final SharedMediaPeriod sharedPeriod;

        public MediaPeriodImpl(SharedMediaPeriod sharedMediaPeriod, MediaSource.MediaPeriodId mediaPeriodId, long j2, MediaSourceEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener.EventDispatcher eventDispatcher2) {
            this.sharedPeriod = sharedMediaPeriod;
            this.mediaPeriodId = mediaPeriodId;
            this.endPositionUs = j2;
            this.mediaSourceEventDispatcher = eventDispatcher;
            this.drmEventDispatcher = eventDispatcher2;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean continueLoading(LoadingInfo loadingInfo) {
            return this.sharedPeriod.continueLoading(this, loadingInfo);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void discardBuffer(long j2, boolean z) {
            this.sharedPeriod.discardBuffer(this, j2, z);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j2, SeekParameters seekParameters) {
            return this.sharedPeriod.getAdjustedSeekPositionUs(this, j2, seekParameters);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return this.sharedPeriod.getBufferedPositionUs(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return this.sharedPeriod.getNextLoadPositionUs(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
            return this.sharedPeriod.getStreamKeys(list);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return this.sharedPeriod.getTrackGroups();
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean isLoading() {
            return this.sharedPeriod.isLoading(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void maybeThrowPrepareError() {
            this.sharedPeriod.maybeThrowPrepareError();
        }

        public void onPrepared() {
            MediaPeriod.Callback callback = this.callback;
            if (callback != null) {
                callback.onPrepared(this);
            }
            this.isPrepared = true;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void prepare(MediaPeriod.Callback callback, long j2) {
            this.callback = callback;
            this.sharedPeriod.prepare(this, j2);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long readDiscontinuity() {
            return this.sharedPeriod.readDiscontinuity(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public void reevaluateBuffer(long j2) {
            this.sharedPeriod.reevaluateBuffer(this, j2);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long seekToUs(long j2) {
            return this.sharedPeriod.seekToUs(this, j2);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
            if (this.hasNotifiedDownstreamFormatChange.length == 0) {
                this.hasNotifiedDownstreamFormatChange = new boolean[sampleStreamArr.length];
            }
            return this.sharedPeriod.selectTracks(this, exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j2);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long setEndPositionUs(long j2) {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void setUsesStreamPrerollFlags() {
            this.sharedPeriod.setUsesStreamPrerollFlags();
        }

        public void updateEndPositionUs(long j2) {
            this.endPositionUs = j2;
        }
    }

    /* compiled from: WazeSource */
    final class SampleStreamImpl implements SampleStream {
        private final MediaPeriodImpl mediaPeriod;
        private final int streamIndex;

        public SampleStreamImpl(MediaPeriodImpl mediaPeriodImpl, int i2) {
            this.mediaPeriod = mediaPeriodImpl;
            this.streamIndex = i2;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int getFlags() {
            SampleStream sampleStream = this.mediaPeriod.sharedPeriod.sampleStreams[this.streamIndex];
            int flags = sampleStream == null ? 0 : sampleStream.getFlags();
            MediaSource.MediaPeriodId mediaPeriodId = this.mediaPeriod.mediaPeriodId;
            return (mediaPeriodId.nextAdGroupIndex != -1 || mediaPeriodId.isAd()) ? flags & (-2) : flags;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return this.mediaPeriod.sharedPeriod.isReady(this.streamIndex);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() {
            this.mediaPeriod.sharedPeriod.maybeThrowError(this.streamIndex);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            MediaPeriodImpl mediaPeriodImpl = this.mediaPeriod;
            return mediaPeriodImpl.sharedPeriod.readData(mediaPeriodImpl, this.streamIndex, formatHolder, decoderInputBuffer, i2);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j2) {
            MediaPeriodImpl mediaPeriodImpl = this.mediaPeriod;
            return mediaPeriodImpl.sharedPeriod.skipData(mediaPeriodImpl, this.streamIndex, j2);
        }
    }

    /* compiled from: WazeSource */
    final class ServerSideAdInsertionTimeline extends ForwardingTimeline {
        private final bs<Object, AdPlaybackState> adPlaybackStates;

        public ServerSideAdInsertionTimeline(Timeline timeline, bs<Object, AdPlaybackState> bsVar) {
            super(timeline);
            an.u(timeline.getWindowCount() == 1);
            Timeline.Period period = new Timeline.Period();
            for (int i2 = 0; i2 < timeline.getPeriodCount(); i2++) {
                timeline.getPeriod(i2, period, true);
                Object obj = period.uid;
                an.B(obj);
                an.u(bsVar.containsKey(obj));
            }
            this.adPlaybackStates = bsVar;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i2, Timeline.Period period, boolean z) {
            super.getPeriod(i2, period, true);
            AdPlaybackState adPlaybackState = this.adPlaybackStates.get(period.uid);
            an.B(adPlaybackState);
            long j2 = period.durationUs;
            long mediaPeriodPositionUsForContent = j2 == C.TIME_UNSET ? adPlaybackState.contentDurationUs : ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(j2, -1, adPlaybackState);
            Timeline.Period period2 = new Timeline.Period();
            long mediaPeriodPositionUsForContent2 = 0;
            int i3 = 0;
            while (i3 < i2 + 1) {
                this.timeline.getPeriod(i3, period2, true);
                AdPlaybackState adPlaybackState2 = this.adPlaybackStates.get(period2.uid);
                an.B(adPlaybackState2);
                if (i3 == 0) {
                    mediaPeriodPositionUsForContent2 = -ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(-period2.getPositionInWindowUs(), -1, adPlaybackState2);
                    i3 = 0;
                }
                if (i3 != i2) {
                    mediaPeriodPositionUsForContent2 += ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(period2.durationUs, -1, adPlaybackState2);
                }
                i3++;
            }
            period.set(period.id, period.uid, period.windowIndex, mediaPeriodPositionUsForContent, mediaPeriodPositionUsForContent2, adPlaybackState, period.isPlaceholder);
            return period;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i2, Timeline.Window window, long j2) {
            super.getWindow(i2, window, j2);
            Timeline.Period period = new Timeline.Period();
            getPeriod(window.firstPeriodIndex, period, true);
            Object obj = period.uid;
            an.B(obj);
            AdPlaybackState adPlaybackState = this.adPlaybackStates.get(obj);
            an.B(adPlaybackState);
            long mediaPeriodPositionUsForContent = ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(window.positionInFirstPeriodUs, -1, adPlaybackState);
            if (window.durationUs == C.TIME_UNSET) {
                long j3 = adPlaybackState.contentDurationUs;
                if (j3 != C.TIME_UNSET) {
                    window.durationUs = j3 - mediaPeriodPositionUsForContent;
                }
            } else {
                Timeline.Period period2 = super.getPeriod(window.lastPeriodIndex, period, true);
                long j4 = period2.positionInWindowUs;
                AdPlaybackState adPlaybackState2 = this.adPlaybackStates.get(period2.uid);
                an.B(adPlaybackState2);
                Timeline.Period period3 = getPeriod(window.lastPeriodIndex, period);
                window.durationUs = period3.positionInWindowUs + ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(window.durationUs - j4, -1, adPlaybackState2);
            }
            window.positionInFirstPeriodUs = mediaPeriodPositionUsForContent;
            return window;
        }
    }

    /* compiled from: WazeSource */
    final class SharedMediaPeriod implements MediaPeriod.Callback {
        private final MediaPeriod actualMediaPeriod;
        private AdPlaybackState adPlaybackState;
        private boolean hasStartedPreparing;
        private boolean isPrepared;
        private MediaPeriodImpl loadingPeriod;
        private final Object periodUid;
        private final List<MediaPeriodImpl> mediaPeriods = new ArrayList();
        private final Map<Long, Pair<LoadEventInfo, MediaLoadData>> activeLoads = new HashMap();
        public ExoTrackSelection[] trackSelections = new ExoTrackSelection[0];
        public SampleStream[] sampleStreams = new SampleStream[0];
        public MediaLoadData[] lastDownstreamFormatChangeData = new MediaLoadData[0];

        public SharedMediaPeriod(MediaPeriod mediaPeriod, Object obj, AdPlaybackState adPlaybackState) {
            this.actualMediaPeriod = mediaPeriod;
            this.periodUid = obj;
            this.adPlaybackState = adPlaybackState;
        }

        private int findMatchingStreamIndex(MediaLoadData mediaLoadData) {
            String str;
            if (mediaLoadData.trackFormat != null) {
                int i2 = 0;
                loop0: while (true) {
                    ExoTrackSelection[] exoTrackSelectionArr = this.trackSelections;
                    if (i2 >= exoTrackSelectionArr.length) {
                        break;
                    }
                    ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i2];
                    if (exoTrackSelection != null) {
                        TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
                        boolean z = mediaLoadData.trackType == 0 && trackGroup.equals(getTrackGroups().get(0));
                        for (int i3 = 0; i3 < trackGroup.length; i3++) {
                            Format format = trackGroup.getFormat(i3);
                            if (format.equals(mediaLoadData.trackFormat) || (z && (str = format.id) != null && str.equals(mediaLoadData.trackFormat.id))) {
                                break loop0;
                            }
                        }
                    }
                    i2++;
                }
                return i2;
            }
            return -1;
        }

        private long getMediaPeriodPositionUsWithEndOfSourceHandling(MediaPeriodImpl mediaPeriodImpl, long j2) {
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            long mediaPeriodPositionUs = ServerSideAdInsertionUtil.getMediaPeriodPositionUs(j2, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
            long j3 = mediaPeriodImpl.endPositionUs;
            if (j3 == C.TIME_UNSET || mediaPeriodPositionUs < j3) {
                return mediaPeriodPositionUs;
            }
            return Long.MIN_VALUE;
        }

        private long getStreamPositionUsWithNotYetStartedHandling(MediaPeriodImpl mediaPeriodImpl, long j2) {
            long j3 = mediaPeriodImpl.lastStartPositionUs;
            return j2 < j3 ? ServerSideAdInsertionUtil.getStreamPositionUs(j3, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState) - (mediaPeriodImpl.lastStartPositionUs - j2) : ServerSideAdInsertionUtil.getStreamPositionUs(j2, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        private void maybeNotifyDownstreamFormatChanged(MediaPeriodImpl mediaPeriodImpl, int i2) {
            MediaLoadData mediaLoadData;
            boolean[] zArr = mediaPeriodImpl.hasNotifiedDownstreamFormatChange;
            if (zArr[i2] || (mediaLoadData = this.lastDownstreamFormatChangeData[i2]) == null) {
                return;
            }
            zArr[i2] = true;
            mediaPeriodImpl.mediaSourceEventDispatcher.downstreamFormatChanged(ServerSideAdInsertionMediaSource.correctMediaLoadData(mediaPeriodImpl, mediaLoadData, this.adPlaybackState));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsesStreamPrerollFlags() {
            this.actualMediaPeriod.setUsesStreamPrerollFlags();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateAdPlaybackState(Timeline timeline, AdPlaybackState adPlaybackState, Timeline.Period period) {
            this.adPlaybackState = adPlaybackState;
            for (int i2 = 0; i2 < this.mediaPeriods.size(); i2++) {
                MediaPeriodImpl mediaPeriodImpl = this.mediaPeriods.get(i2);
                mediaPeriodImpl.updateEndPositionUs(ServerSideAdInsertionMediaSource.getEndPositionInSplitPeriodUs(timeline, mediaPeriodImpl.mediaPeriodId, period));
            }
        }

        public void add(MediaPeriodImpl mediaPeriodImpl) {
            this.mediaPeriods.add(mediaPeriodImpl);
        }

        public boolean canReuseMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, long j2) {
            if (this.mediaPeriods.isEmpty()) {
                return false;
            }
            MediaPeriodImpl mediaPeriodImpl = (MediaPeriodImpl) fo.Q(this.mediaPeriods);
            long j3 = mediaPeriodImpl.endPositionUs;
            if (j3 == C.TIME_UNSET) {
                return false;
            }
            return ServerSideAdInsertionUtil.getStreamPositionUs(j2, mediaPeriodId, this.adPlaybackState) == ServerSideAdInsertionUtil.getStreamPositionUs(j3, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public boolean continueLoading(MediaPeriodImpl mediaPeriodImpl, LoadingInfo loadingInfo) {
            MediaPeriodImpl mediaPeriodImpl2 = this.loadingPeriod;
            if (mediaPeriodImpl2 != null && !mediaPeriodImpl.equals(mediaPeriodImpl2)) {
                for (Pair<LoadEventInfo, MediaLoadData> pair : this.activeLoads.values()) {
                    mediaPeriodImpl2.mediaSourceEventDispatcher.loadCompleted((LoadEventInfo) pair.first, ServerSideAdInsertionMediaSource.correctMediaLoadData(mediaPeriodImpl2, (MediaLoadData) pair.second, this.adPlaybackState));
                    mediaPeriodImpl.mediaSourceEventDispatcher.loadStarted((LoadEventInfo) pair.first, ServerSideAdInsertionMediaSource.correctMediaLoadData(mediaPeriodImpl, (MediaLoadData) pair.second, this.adPlaybackState), 0);
                }
            }
            this.loadingPeriod = mediaPeriodImpl;
            long streamPositionUsWithNotYetStartedHandling = getStreamPositionUsWithNotYetStartedHandling(mediaPeriodImpl, loadingInfo.playbackPositionUs);
            MediaPeriod mediaPeriod = this.actualMediaPeriod;
            LoadingInfo.Builder builderBuildUpon = loadingInfo.buildUpon();
            builderBuildUpon.setPlaybackPositionUs(streamPositionUsWithNotYetStartedHandling);
            return mediaPeriod.continueLoading(builderBuildUpon.build());
        }

        public void discardBuffer(MediaPeriodImpl mediaPeriodImpl, long j2, boolean z) {
            this.actualMediaPeriod.discardBuffer(ServerSideAdInsertionUtil.getStreamPositionUs(j2, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState), z);
        }

        public long getAdjustedSeekPositionUs(MediaPeriodImpl mediaPeriodImpl, long j2, SeekParameters seekParameters) {
            return ServerSideAdInsertionUtil.getMediaPeriodPositionUs(this.actualMediaPeriod.getAdjustedSeekPositionUs(ServerSideAdInsertionUtil.getStreamPositionUs(j2, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState), seekParameters), mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public long getBufferedPositionUs(MediaPeriodImpl mediaPeriodImpl) {
            return getMediaPeriodPositionUsWithEndOfSourceHandling(mediaPeriodImpl, this.actualMediaPeriod.getBufferedPositionUs());
        }

        public MediaPeriodImpl getMediaPeriodForEvent(MediaLoadData mediaLoadData) {
            if (mediaLoadData == null || mediaLoadData.mediaStartTimeMs == C.TIME_UNSET) {
                return null;
            }
            for (int i2 = 0; i2 < this.mediaPeriods.size(); i2++) {
                MediaPeriodImpl mediaPeriodImpl = this.mediaPeriods.get(i2);
                if (mediaPeriodImpl.isPrepared) {
                    long j2 = mediaLoadData.mediaStartTimeMs;
                    int i3 = Util.SDK_INT;
                    long mediaPeriodPositionUs = ServerSideAdInsertionUtil.getMediaPeriodPositionUs(Util.msToUs(j2), mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
                    if (mediaPeriodPositionUs >= 0) {
                        long j3 = mediaPeriodImpl.endPositionUs;
                        if (j3 == C.TIME_UNSET || mediaPeriodPositionUs < j3) {
                            return mediaPeriodImpl;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return null;
        }

        public long getNextLoadPositionUs(MediaPeriodImpl mediaPeriodImpl) {
            return getMediaPeriodPositionUsWithEndOfSourceHandling(mediaPeriodImpl, this.actualMediaPeriod.getNextLoadPositionUs());
        }

        public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
            return this.actualMediaPeriod.getStreamKeys(list);
        }

        public TrackGroupArray getTrackGroups() {
            return this.actualMediaPeriod.getTrackGroups();
        }

        public boolean isLoading(MediaPeriodImpl mediaPeriodImpl) {
            return mediaPeriodImpl.equals(this.loadingPeriod) && this.actualMediaPeriod.isLoading();
        }

        public boolean isReady(int i2) {
            SampleStream sampleStream = this.sampleStreams[i2];
            int i3 = Util.SDK_INT;
            return sampleStream.isReady();
        }

        public boolean isUnused() {
            return this.mediaPeriods.isEmpty();
        }

        public void maybeThrowError(int i2) {
            SampleStream sampleStream = this.sampleStreams[i2];
            int i3 = Util.SDK_INT;
            sampleStream.maybeThrowError();
        }

        public void maybeThrowPrepareError() {
            this.actualMediaPeriod.maybeThrowPrepareError();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
            MediaPeriodImpl mediaPeriodImpl = this.loadingPeriod;
            if (mediaPeriodImpl == null) {
                return;
            }
            MediaPeriod.Callback callback = mediaPeriodImpl.callback;
            an.B(callback);
            callback.onContinueLoadingRequested(this.loadingPeriod);
        }

        public void onDownstreamFormatChanged(MediaPeriodImpl mediaPeriodImpl, MediaLoadData mediaLoadData) {
            int iFindMatchingStreamIndex = findMatchingStreamIndex(mediaLoadData);
            if (iFindMatchingStreamIndex != -1) {
                this.lastDownstreamFormatChangeData[iFindMatchingStreamIndex] = mediaLoadData;
                mediaPeriodImpl.hasNotifiedDownstreamFormatChange[iFindMatchingStreamIndex] = true;
            }
        }

        public void onLoadFinished(LoadEventInfo loadEventInfo) {
            this.activeLoads.remove(Long.valueOf(loadEventInfo.loadTaskId));
        }

        public void onLoadStarted(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            this.activeLoads.put(Long.valueOf(loadEventInfo.loadTaskId), Pair.create(loadEventInfo, mediaLoadData));
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod mediaPeriod) {
            this.isPrepared = true;
            for (int i2 = 0; i2 < this.mediaPeriods.size(); i2++) {
                this.mediaPeriods.get(i2).onPrepared();
            }
        }

        public void prepare(MediaPeriodImpl mediaPeriodImpl, long j2) {
            mediaPeriodImpl.lastStartPositionUs = j2;
            if (this.hasStartedPreparing) {
                if (this.isPrepared) {
                    mediaPeriodImpl.onPrepared();
                }
            } else {
                this.hasStartedPreparing = true;
                this.actualMediaPeriod.prepare(this, ServerSideAdInsertionUtil.getStreamPositionUs(j2, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int readData(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl r10, int r11, androidx.media3.exoplayer.FormatHolder r12, androidx.media3.decoder.DecoderInputBuffer r13, int r14) {
            /*
                r9 = this;
                long r0 = r9.getBufferedPositionUs(r10)
                androidx.media3.exoplayer.source.SampleStream[] r2 = r9.sampleStreams
                r2 = r2[r11]
                int r3 = androidx.media3.common.util.Util.SDK_INT
                r3 = r2
                androidx.media3.exoplayer.source.SampleStream r3 = (androidx.media3.exoplayer.source.SampleStream) r3
                r3 = r14 | 5
                int r2 = r2.readData(r12, r13, r3)
                long r3 = r13.timeUs
                long r3 = r9.getMediaPeriodPositionUsWithEndOfSourceHandling(r10, r3)
                r5 = -9223372036854775808
                r7 = -4
                if (r2 != r7) goto L23
                int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r2 == 0) goto L2f
                r2 = r7
            L23:
                r8 = -3
                if (r2 != r8) goto L3b
                int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r0 != 0) goto L3a
                boolean r0 = r13.waitingForKeys
                if (r0 == 0) goto L2f
                goto L3a
            L2f:
                r9.maybeNotifyDownstreamFormatChanged(r10, r11)
                r13.clear()
                r9 = 4
                r13.addFlag(r9)
                return r7
            L3a:
                r2 = r8
            L3b:
                if (r2 != r7) goto L4c
                r9.maybeNotifyDownstreamFormatChanged(r10, r11)
                androidx.media3.exoplayer.source.SampleStream[] r9 = r9.sampleStreams
                r9 = r9[r11]
                r10 = r9
                androidx.media3.exoplayer.source.SampleStream r10 = (androidx.media3.exoplayer.source.SampleStream) r10
                r9.readData(r12, r13, r14)
                r13.timeUs = r3
            L4c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod.readData(androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource$MediaPeriodImpl, int, androidx.media3.exoplayer.FormatHolder, androidx.media3.decoder.DecoderInputBuffer, int):int");
        }

        public long readDiscontinuity(MediaPeriodImpl mediaPeriodImpl) {
            if (mediaPeriodImpl.equals(this.mediaPeriods.get(0))) {
                long discontinuity = this.actualMediaPeriod.readDiscontinuity();
                if (discontinuity != C.TIME_UNSET) {
                    return ServerSideAdInsertionUtil.getMediaPeriodPositionUs(discontinuity, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
                }
            }
            return C.TIME_UNSET;
        }

        public void reevaluateBuffer(MediaPeriodImpl mediaPeriodImpl, long j2) {
            this.actualMediaPeriod.reevaluateBuffer(getStreamPositionUsWithNotYetStartedHandling(mediaPeriodImpl, j2));
        }

        public void release(MediaSource mediaSource) {
            mediaSource.releasePeriod(this.actualMediaPeriod);
        }

        public void remove(MediaPeriodImpl mediaPeriodImpl) {
            if (mediaPeriodImpl.equals(this.loadingPeriod)) {
                this.loadingPeriod = null;
                this.activeLoads.clear();
            }
            this.mediaPeriods.remove(mediaPeriodImpl);
        }

        public long seekToUs(MediaPeriodImpl mediaPeriodImpl, long j2) {
            return ServerSideAdInsertionUtil.getMediaPeriodPositionUs(this.actualMediaPeriod.seekToUs(ServerSideAdInsertionUtil.getStreamPositionUs(j2, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState)), mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public long selectTracks(MediaPeriodImpl mediaPeriodImpl, ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
            mediaPeriodImpl.lastStartPositionUs = j2;
            if (!mediaPeriodImpl.equals(this.mediaPeriods.get(0))) {
                for (int i2 = 0; i2 < exoTrackSelectionArr.length; i2++) {
                    ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i2];
                    boolean z = true;
                    if (exoTrackSelection != null) {
                        if (zArr[i2] && sampleStreamArr[i2] != null) {
                            z = false;
                        }
                        zArr2[i2] = z;
                        if (z) {
                            sampleStreamArr[i2] = Objects.equals(this.trackSelections[i2], exoTrackSelection) ? new SampleStreamImpl(mediaPeriodImpl, i2) : new EmptySampleStream();
                        }
                    } else {
                        sampleStreamArr[i2] = null;
                        zArr2[i2] = true;
                    }
                }
                return j2;
            }
            int length = exoTrackSelectionArr.length;
            this.trackSelections = (ExoTrackSelection[]) Arrays.copyOf(exoTrackSelectionArr, length);
            long streamPositionUs = ServerSideAdInsertionUtil.getStreamPositionUs(j2, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
            SampleStream[] sampleStreamArr2 = this.sampleStreams;
            int length2 = sampleStreamArr2.length;
            SampleStream[] sampleStreamArr3 = length2 == 0 ? new SampleStream[length] : (SampleStream[]) Arrays.copyOf(sampleStreamArr2, length2);
            long jSelectTracks = this.actualMediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr3, zArr2, streamPositionUs);
            int length3 = sampleStreamArr3.length;
            this.sampleStreams = (SampleStream[]) Arrays.copyOf(sampleStreamArr3, length3);
            this.lastDownstreamFormatChangeData = (MediaLoadData[]) Arrays.copyOf(this.lastDownstreamFormatChangeData, length3);
            for (int i3 = 0; i3 < sampleStreamArr3.length; i3++) {
                if (sampleStreamArr3[i3] == null) {
                    sampleStreamArr[i3] = null;
                    this.lastDownstreamFormatChangeData[i3] = null;
                } else if (sampleStreamArr[i3] == null || zArr2[i3]) {
                    sampleStreamArr[i3] = new SampleStreamImpl(mediaPeriodImpl, i3);
                    this.lastDownstreamFormatChangeData[i3] = null;
                }
            }
            return ServerSideAdInsertionUtil.getMediaPeriodPositionUs(jSelectTracks, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public int skipData(MediaPeriodImpl mediaPeriodImpl, int i2, long j2) {
            long streamPositionUs = ServerSideAdInsertionUtil.getStreamPositionUs(j2, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
            SampleStream sampleStream = this.sampleStreams[i2];
            int i3 = Util.SDK_INT;
            return sampleStream.skipData(streamPositionUs);
        }
    }

    public ServerSideAdInsertionMediaSource(MediaSource mediaSource, AdPlaybackStateUpdater adPlaybackStateUpdater) {
        this.mediaSource = mediaSource;
        this.adPlaybackStateUpdater = adPlaybackStateUpdater;
        Timeline timeline = Timeline.EMPTY;
        this.sourceTimeline = timeline;
        this.splitTimeline = timeline;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaLoadData correctMediaLoadData(MediaPeriodImpl mediaPeriodImpl, MediaLoadData mediaLoadData, AdPlaybackState adPlaybackState) {
        return new MediaLoadData(mediaLoadData.dataType, mediaLoadData.trackType, mediaLoadData.trackFormat, mediaLoadData.trackSelectionReason, mediaLoadData.trackSelectionData, correctMediaLoadDataPositionMs(mediaLoadData.mediaStartTimeMs, mediaPeriodImpl, adPlaybackState), correctMediaLoadDataPositionMs(mediaLoadData.mediaEndTimeMs, mediaPeriodImpl, adPlaybackState));
    }

    private static long correctMediaLoadDataPositionMs(long j2, MediaPeriodImpl mediaPeriodImpl, AdPlaybackState adPlaybackState) {
        if (j2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        int i2 = Util.SDK_INT;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodImpl.mediaPeriodId;
        boolean zIsAd = mediaPeriodId.isAd();
        long jMsToUs = Util.msToUs(j2);
        return Util.usToMs(zIsAd ? ServerSideAdInsertionUtil.getMediaPeriodPositionUsForAd(jMsToUs, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState) : ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(jMsToUs, -1, adPlaybackState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getEndPositionInSplitPeriodUs(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Timeline.Period period) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, period);
        if (!mediaPeriodId.isAd()) {
            int i2 = mediaPeriodId.nextAdGroupIndex;
            long adGroupTimeUs = i2 == -1 ? Long.MIN_VALUE : period.getAdGroupTimeUs(i2);
            return adGroupTimeUs != Long.MIN_VALUE ? adGroupTimeUs : period.durationUs;
        }
        AdPlaybackState.AdGroup adGroup = period.adPlaybackState.getAdGroup(mediaPeriodId.adGroupIndex);
        if (adGroup.count == -1) {
            return 0L;
        }
        return adGroup.durationsUs[mediaPeriodId.adIndexInAdGroup];
    }

    private MediaPeriodImpl getMediaPeriodForEvent(MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData, boolean z) {
        if (mediaPeriodId == null) {
            return null;
        }
        List listG = this.mediaPeriods.g(new Pair(Long.valueOf(mediaPeriodId.windowSequenceNumber), mediaPeriodId.periodUid));
        if (listG.isEmpty()) {
            return null;
        }
        if (z) {
            SharedMediaPeriod sharedMediaPeriod = (SharedMediaPeriod) fo.Q(listG);
            return sharedMediaPeriod.loadingPeriod != null ? sharedMediaPeriod.loadingPeriod : (MediaPeriodImpl) fo.Q(sharedMediaPeriod.mediaPeriods);
        }
        for (int i2 = 0; i2 < listG.size(); i2++) {
            MediaPeriodImpl mediaPeriodForEvent = ((SharedMediaPeriod) listG.get(i2)).getMediaPeriodForEvent(mediaLoadData);
            if (mediaPeriodForEvent != null) {
                return mediaPeriodForEvent;
            }
        }
        return (MediaPeriodImpl) ((SharedMediaPeriod) listG.get(0)).mediaPeriods.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAdPlaybackStates$0(Timeline timeline, bs bsVar) {
        AdPlaybackState adPlaybackState;
        if (timeline.equals(this.sourceTimeline)) {
            this.adPlaybackStates = bsVar;
            this.splitTimeline = new ServerSideAdInsertionTimeline(this.sourceTimeline, bsVar);
            for (SharedMediaPeriod sharedMediaPeriod : this.mediaPeriods.A()) {
                AdPlaybackState adPlaybackState2 = (AdPlaybackState) bsVar.get(sharedMediaPeriod.periodUid);
                if (adPlaybackState2 != null) {
                    sharedMediaPeriod.updateAdPlaybackState(this.splitTimeline, adPlaybackState2, this.period);
                }
            }
            SharedMediaPeriod sharedMediaPeriod2 = this.lastUsedMediaPeriod;
            if (sharedMediaPeriod2 != null && (adPlaybackState = (AdPlaybackState) bsVar.get(sharedMediaPeriod2.periodUid)) != null) {
                this.lastUsedMediaPeriod.updateAdPlaybackState(this.splitTimeline, adPlaybackState, this.period);
            }
            refreshSourceInfo(this.splitTimeline);
        }
    }

    private void releaseLastUsedMediaPeriod() {
        SharedMediaPeriod sharedMediaPeriod = this.lastUsedMediaPeriod;
        if (sharedMediaPeriod != null) {
            sharedMediaPeriod.release(this.mediaSource);
            this.lastUsedMediaPeriod = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return this.mediaSource.canUpdateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        SharedMediaPeriod sharedMediaPeriod;
        Pair pair = new Pair(Long.valueOf(mediaPeriodId.windowSequenceNumber), mediaPeriodId.periodUid);
        SharedMediaPeriod sharedMediaPeriod2 = this.lastUsedMediaPeriod;
        boolean z = false;
        SharedMediaPeriod sharedMediaPeriod3 = null;
        if (sharedMediaPeriod2 != null) {
            boolean zEquals = sharedMediaPeriod2.periodUid.equals(mediaPeriodId.periodUid);
            SharedMediaPeriod sharedMediaPeriod4 = this.lastUsedMediaPeriod;
            if (zEquals) {
                this.mediaPeriods.y(pair, sharedMediaPeriod4);
                z = true;
            } else {
                sharedMediaPeriod4.release(this.mediaSource);
                sharedMediaPeriod4 = null;
            }
            this.lastUsedMediaPeriod = null;
            sharedMediaPeriod3 = sharedMediaPeriod4;
        }
        boolean z2 = z;
        if (sharedMediaPeriod3 != null || ((sharedMediaPeriod3 = (SharedMediaPeriod) fo.T(this.mediaPeriods.g(pair))) != null && sharedMediaPeriod3.canReuseMediaPeriod(mediaPeriodId, j2))) {
            sharedMediaPeriod = sharedMediaPeriod3;
        } else {
            AdPlaybackState adPlaybackState = this.adPlaybackStates.get(mediaPeriodId.periodUid);
            an.B(adPlaybackState);
            SharedMediaPeriod sharedMediaPeriod5 = new SharedMediaPeriod(this.mediaSource.createPeriod(new MediaSource.MediaPeriodId(mediaPeriodId.periodUid, mediaPeriodId.windowSequenceNumber), allocator, ServerSideAdInsertionUtil.getStreamPositionUs(j2, mediaPeriodId, adPlaybackState)), mediaPeriodId.periodUid, adPlaybackState);
            this.mediaPeriods.y(pair, sharedMediaPeriod5);
            sharedMediaPeriod = sharedMediaPeriod5;
        }
        MediaPeriodImpl mediaPeriodImpl = new MediaPeriodImpl(sharedMediaPeriod, mediaPeriodId, getEndPositionInSplitPeriodUs(this.splitTimeline, mediaPeriodId, this.period), createEventDispatcher(mediaPeriodId), createDrmEventDispatcher(mediaPeriodId));
        sharedMediaPeriod.add(mediaPeriodImpl);
        if (z2 && sharedMediaPeriod.trackSelections.length > 0) {
            mediaPeriodImpl.seekToUs(j2);
        }
        return mediaPeriodImpl;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void disableInternal() {
        releaseLastUsedMediaPeriod();
        this.mediaSource.disable(this);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void enableInternal() {
        this.mediaSource.enable(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaItem getMediaItem() {
        return this.mediaSource.getMediaItem();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
        this.mediaSource.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void onDownstreamFormatChanged(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, false);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.downstreamFormatChanged(mediaLoadData);
            return;
        }
        mediaPeriodForEvent.sharedPeriod.onDownstreamFormatChanged(mediaPeriodForEvent, mediaLoadData);
        AdPlaybackState adPlaybackState = this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid);
        an.B(adPlaybackState);
        mediaPeriodForEvent.mediaSourceEventDispatcher.downstreamFormatChanged(correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, adPlaybackState));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void onDrmKeysLoaded(int i2, MediaSource.MediaPeriodId mediaPeriodId, KeyRequestInfo keyRequestInfo) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmKeysLoaded(keyRequestInfo);
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmKeysLoaded(keyRequestInfo);
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void onDrmKeysRemoved(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmKeysRemoved();
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmKeysRemoved();
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void onDrmKeysRestored(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmKeysRestored();
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmKeysRestored();
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void onDrmSessionAcquired(int i2, MediaSource.MediaPeriodId mediaPeriodId, int i3) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, true);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmSessionAcquired(i3);
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmSessionAcquired(i3);
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void onDrmSessionManagerError(int i2, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmSessionManagerError(exc);
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmSessionManagerError(exc);
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void onDrmSessionReleased(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmSessionReleased();
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmSessionReleased();
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void onLoadCanceled(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadCanceled(loadEventInfo, mediaLoadData);
            return;
        }
        mediaPeriodForEvent.sharedPeriod.onLoadFinished(loadEventInfo);
        AdPlaybackState adPlaybackState = this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid);
        an.B(adPlaybackState);
        mediaPeriodForEvent.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, adPlaybackState));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void onLoadCompleted(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadCompleted(loadEventInfo, mediaLoadData);
            return;
        }
        mediaPeriodForEvent.sharedPeriod.onLoadFinished(loadEventInfo);
        AdPlaybackState adPlaybackState = this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid);
        an.B(adPlaybackState);
        mediaPeriodForEvent.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, adPlaybackState));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void onLoadError(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadError(loadEventInfo, mediaLoadData, iOException, z);
            return;
        }
        if (z) {
            mediaPeriodForEvent.sharedPeriod.onLoadFinished(loadEventInfo);
        }
        MediaSourceEventListener.EventDispatcher eventDispatcher = mediaPeriodForEvent.mediaSourceEventDispatcher;
        AdPlaybackState adPlaybackState = this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid);
        an.B(adPlaybackState);
        eventDispatcher.loadError(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, adPlaybackState), iOException, z);
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void onLoadStarted(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i3) {
        if (i3 == 0) {
            MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
            if (mediaPeriodForEvent == null) {
                this.mediaSourceEventDispatcherWithoutId.loadStarted(loadEventInfo, mediaLoadData, 0);
                return;
            }
            mediaPeriodForEvent.sharedPeriod.onLoadStarted(loadEventInfo, mediaLoadData);
            AdPlaybackState adPlaybackState = this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid);
            an.B(adPlaybackState);
            mediaPeriodForEvent.mediaSourceEventDispatcher.loadStarted(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, adPlaybackState), 0);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
    public void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
        this.sourceTimeline = timeline;
        AdPlaybackStateUpdater adPlaybackStateUpdater = this.adPlaybackStateUpdater;
        if ((adPlaybackStateUpdater == null || !adPlaybackStateUpdater.onAdPlaybackStateUpdateRequested(timeline)) && !this.adPlaybackStates.isEmpty()) {
            setAdPlaybackStates(this.adPlaybackStates, timeline);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void onUpstreamDiscarded(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, false);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.upstreamDiscarded(mediaLoadData);
            return;
        }
        AdPlaybackState adPlaybackState = this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid);
        an.B(adPlaybackState);
        mediaPeriodForEvent.mediaSourceEventDispatcher.upstreamDiscarded(correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, adPlaybackState));
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void prepareSourceInternal(TransferListener transferListener) {
        Handler handlerCreateHandlerForCurrentLooper = Util.createHandlerForCurrentLooper();
        synchronized (this) {
            this.playbackHandler = handlerCreateHandlerForCurrentLooper;
        }
        this.mediaSource.addEventListener(handlerCreateHandlerForCurrentLooper, this);
        this.mediaSource.addDrmEventListener(handlerCreateHandlerForCurrentLooper, this);
        this.mediaSource.prepareSource(this, getPlayerId(), getBandwidthMeter());
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        MediaPeriodImpl mediaPeriodImpl = (MediaPeriodImpl) mediaPeriod;
        mediaPeriodImpl.sharedPeriod.remove(mediaPeriodImpl);
        if (mediaPeriodImpl.sharedPeriod.isUnused()) {
            this.mediaPeriods.G(new Pair(Long.valueOf(mediaPeriodImpl.mediaPeriodId.windowSequenceNumber), mediaPeriodImpl.mediaPeriodId.periodUid), mediaPeriodImpl.sharedPeriod);
            if (this.mediaPeriods.F()) {
                this.lastUsedMediaPeriod = mediaPeriodImpl.sharedPeriod;
            } else {
                mediaPeriodImpl.sharedPeriod.release(this.mediaSource);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
        releaseLastUsedMediaPeriod();
        synchronized (this) {
            this.playbackHandler = null;
        }
        this.mediaSource.releaseSource(this);
        this.mediaSource.removeEventListener(this);
        this.mediaSource.removeDrmEventListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdPlaybackStates(final bs<Object, AdPlaybackState> bsVar, final Timeline timeline) {
        Handler handler;
        an.l(!bsVar.isEmpty());
        bh bhVarValues = bsVar.values();
        bhVarValues.g();
        Object obj = ((AdPlaybackState) ((bn) bhVarValues).get(0)).adsId;
        an.B(obj);
        fu fuVarListIterator = bsVar.entrySet().listIterator();
        while (fuVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) fuVarListIterator.next();
            Object key = entry.getKey();
            AdPlaybackState adPlaybackState = (AdPlaybackState) entry.getValue();
            an.l(Objects.equals(obj, adPlaybackState.adsId));
            AdPlaybackState adPlaybackState2 = this.adPlaybackStates.get(key);
            if (adPlaybackState2 != null) {
                int i2 = adPlaybackState.removedAdGroupCount;
                while (i2 < adPlaybackState.adGroupCount) {
                    int i3 = i2 + 1;
                    AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i2);
                    an.l(adGroup.isServerSideInserted);
                    if (i2 < adPlaybackState2.adGroupCount && ServerSideAdInsertionUtil.getAdCountInGroup(adPlaybackState, i2) < ServerSideAdInsertionUtil.getAdCountInGroup(adPlaybackState2, i2)) {
                        AdPlaybackState.AdGroup adGroup2 = adPlaybackState.getAdGroup(i3);
                        an.l(adGroup.contentResumeOffsetUs + adGroup2.contentResumeOffsetUs == adPlaybackState2.getAdGroup(i2).contentResumeOffsetUs);
                        an.l(adGroup.timeUs + adGroup.contentResumeOffsetUs == adGroup2.timeUs);
                    }
                    if (adGroup.timeUs == Long.MIN_VALUE) {
                        an.l(ServerSideAdInsertionUtil.getAdCountInGroup(adPlaybackState, i2) == 0);
                    }
                    i2 = i3;
                }
            }
        }
        synchronized (this) {
            handler = this.playbackHandler;
        }
        if (handler == null) {
            this.adPlaybackStates = bsVar;
        } else {
            Util.postOrRun(handler, new Runnable() { // from class: androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$setAdPlaybackStates$0(timeline, bsVar);
                }
            });
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(MediaItem mediaItem) {
        this.mediaSource.updateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public /* synthetic */ void onDrmKeysLoaded(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
    }
}
