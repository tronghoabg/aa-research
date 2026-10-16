package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.d.b.an;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SilenceMediaSource extends BaseMediaSource {
    private static final int CHANNEL_COUNT = 2;
    private static final Format FORMAT;
    public static final String MEDIA_ID = "SilenceMediaSource";
    private static final MediaItem MEDIA_ITEM;
    private static final int PCM_ENCODING = 2;
    private static final int SAMPLE_RATE_HZ = 44100;
    private static final byte[] SILENCE_SAMPLE;
    private final long durationUs;
    private MediaItem mediaItem;

    /* compiled from: WazeSource */
    public final class Factory {
        private long durationUs;
        private Object tag;

        public SilenceMediaSource createMediaSource() {
            an.u(this.durationUs > 0);
            long j2 = this.durationUs;
            MediaItem.Builder builderBuildUpon = SilenceMediaSource.MEDIA_ITEM.buildUpon();
            builderBuildUpon.setTag(this.tag);
            return new SilenceMediaSource(j2, builderBuildUpon.build());
        }

        public Factory setDurationUs(long j2) {
            this.durationUs = j2;
            return this;
        }

        public Factory setTag(Object obj) {
            this.tag = obj;
            return this;
        }
    }

    /* compiled from: WazeSource */
    final class SilenceMediaPeriod implements MediaPeriod {
        private static final TrackGroupArray TRACKS = new TrackGroupArray(new TrackGroup(SilenceMediaSource.FORMAT));
        private final long durationUs;
        private final ArrayList<SampleStream> sampleStreams = new ArrayList<>();

        public SilenceMediaPeriod(long j2) {
            this.durationUs = j2;
        }

        private long constrainSeekPosition(long j2) {
            return Util.constrainValue(j2, 0L, this.durationUs);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean continueLoading(LoadingInfo loadingInfo) {
            return false;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void discardBuffer(long j2, boolean z) {
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j2, SeekParameters seekParameters) {
            return constrainSeekPosition(j2);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public /* synthetic */ List getStreamKeys(List list) {
            return Collections.EMPTY_LIST;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return TRACKS;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean isLoading() {
            return false;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void maybeThrowPrepareError() {
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void prepare(MediaPeriod.Callback callback, long j2) {
            callback.onPrepared(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long readDiscontinuity() {
            return C.TIME_UNSET;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public void reevaluateBuffer(long j2) {
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long seekToUs(long j2) {
            long jConstrainSeekPosition = constrainSeekPosition(j2);
            for (int i2 = 0; i2 < this.sampleStreams.size(); i2++) {
                ((SilenceSampleStream) this.sampleStreams.get(i2)).seekTo(jConstrainSeekPosition);
            }
            return jConstrainSeekPosition;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
            long jConstrainSeekPosition = constrainSeekPosition(j2);
            for (int i2 = 0; i2 < exoTrackSelectionArr.length; i2++) {
                SampleStream sampleStream = sampleStreamArr[i2];
                if (sampleStream != null && (exoTrackSelectionArr[i2] == null || !zArr[i2])) {
                    this.sampleStreams.remove(sampleStream);
                    sampleStream = null;
                    sampleStreamArr[i2] = null;
                }
                if (sampleStream == null && exoTrackSelectionArr[i2] != null) {
                    SilenceSampleStream silenceSampleStream = new SilenceSampleStream(this.durationUs);
                    silenceSampleStream.seekTo(jConstrainSeekPosition);
                    this.sampleStreams.add(silenceSampleStream);
                    sampleStreamArr[i2] = silenceSampleStream;
                    zArr2[i2] = true;
                }
            }
            return jConstrainSeekPosition;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public /* synthetic */ long setEndPositionUs(long j2) {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public /* synthetic */ void setUsesStreamPrerollFlags() {
        }
    }

    /* compiled from: WazeSource */
    final class SilenceSampleStream implements SampleStream {
        private final long durationBytes;
        private long positionBytes;
        private boolean sentFormat;

        public SilenceSampleStream(long j2) {
            this.durationBytes = SilenceMediaSource.getAudioByteCount(j2);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public /* synthetic */ int getFlags() {
            return 0;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return true;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() {
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            if (!this.sentFormat || (i2 & 2) != 0) {
                formatHolder.format = SilenceMediaSource.FORMAT;
                this.sentFormat = true;
                return -5;
            }
            long j2 = this.durationBytes;
            long j3 = this.positionBytes;
            long j4 = j2 - j3;
            if (j4 == 0) {
                decoderInputBuffer.addFlag(4);
                return -4;
            }
            decoderInputBuffer.timeUs = SilenceMediaSource.getAudioPositionUs(j3);
            decoderInputBuffer.addFlag(1);
            int iMin = (int) Math.min(SilenceMediaSource.SILENCE_SAMPLE.length, j4);
            if ((i2 & 4) == 0) {
                decoderInputBuffer.ensureSpaceForWrite(iMin);
                decoderInputBuffer.data.put(SilenceMediaSource.SILENCE_SAMPLE, 0, iMin);
            }
            if ((i2 & 1) == 0) {
                this.positionBytes += iMin;
            }
            return -4;
        }

        public void seekTo(long j2) {
            this.positionBytes = Util.constrainValue(SilenceMediaSource.getAudioByteCount(j2), 0L, this.durationBytes);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j2) {
            long j3 = this.positionBytes;
            seekTo(j2);
            return (int) ((this.positionBytes - j3) / SilenceMediaSource.SILENCE_SAMPLE.length);
        }
    }

    static {
        Format.Builder builder = new Format.Builder();
        builder.setSampleMimeType(MimeTypes.AUDIO_RAW);
        builder.setChannelCount(2);
        builder.setSampleRate(44100);
        builder.setPcmEncoding(2);
        Format formatBuild = builder.build();
        FORMAT = formatBuild;
        MediaItem.Builder builder2 = new MediaItem.Builder();
        builder2.setMediaId(MEDIA_ID);
        builder2.setUri(Uri.EMPTY);
        builder2.setMimeType(formatBuild.sampleMimeType);
        MEDIA_ITEM = builder2.build();
        SILENCE_SAMPLE = new byte[Util.getPcmFrameSize(2, 2) * 1024];
    }

    private SilenceMediaSource(long j2, MediaItem mediaItem) {
        an.l(j2 >= 0);
        this.durationUs = j2;
        this.mediaItem = mediaItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getAudioByteCount(long j2) {
        return Util.getPcmFrameSize(2, 2) * Util.durationUsToSampleCount(j2, 44100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getAudioPositionUs(long j2) {
        return Util.sampleCountToDurationUs(j2 / Util.getPcmFrameSize(2, 2), 44100);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        return new SilenceMediaPeriod(this.durationUs);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void prepareSourceInternal(TransferListener transferListener) {
        refreshSourceInfo(new SinglePeriodTimeline(this.durationUs, true, false, false, (Object) null, getMediaItem()));
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    public SilenceMediaSource(long j2) {
        this(j2, MEDIA_ITEM);
    }
}
