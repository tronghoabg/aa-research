package androidx.media3.muxer;

import android.util.SparseArray;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.d.b.an;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class WebmWriter {
    private static final int MAX_CLUSTER_DURATION_US = 2000000;
    private static final int TIMESTAMP_SCALE = 1000000;
    private long infoElementStart;
    private final SeekableMuxerOutput muxerOutput;
    private final boolean sampleCopyEnabled;
    private long segmentDataStart;
    private long trackElementStart;
    private boolean writtenSegmentHeader;
    private final List<Track> addedTracks = new ArrayList();
    private final List<ByteBuffer> cuePoints = new ArrayList();
    private final SparseArray<Long> prevPresentationTimeOfTrack = new SparseArray<>();
    private long firstSampleTimestampUs = C.TIME_UNSET;
    private long lastSampleEndsAtTimestampUs = C.TIME_UNSET;

    /* compiled from: WazeSource */
    final class WebmFrame implements Comparable<WebmFrame> {
        private final BufferInfo bufferInfo;
        private final ByteBuffer data;
        private final Boolean isAudioFrame;
        private final int trackNumber;

        WebmFrame(int i2, ByteBuffer byteBuffer, BufferInfo bufferInfo, boolean z) {
            this.trackNumber = i2;
            this.data = byteBuffer;
            this.bufferInfo = bufferInfo;
            this.isAudioFrame = Boolean.valueOf(z);
        }

        @Override // java.lang.Comparable
        public int compareTo(WebmFrame webmFrame) {
            int iCompare = Long.compare(this.bufferInfo.presentationTimeUs, webmFrame.bufferInfo.presentationTimeUs);
            return iCompare != 0 ? iCompare : Boolean.compare(this.isAudioFrame.booleanValue(), webmFrame.isAudioFrame.booleanValue());
        }
    }

    WebmWriter(SeekableMuxerOutput seekableMuxerOutput, boolean z) {
        this.muxerOutput = seekableMuxerOutput;
        this.sampleCopyEnabled = z;
    }

    private void createCluster() {
        PriorityQueue priorityQueue = new PriorityQueue();
        int i2 = 0;
        boolean z = false;
        while (true) {
            if (i2 >= this.addedTracks.size()) {
                break;
            }
            Track track = this.addedTracks.get(i2);
            while (!track.pendingSamplesByteBuffer.isEmpty()) {
                boolean zIsAudio = MimeTypes.isAudio(track.format.sampleMimeType);
                WebmFrame webmFrame = new WebmFrame(true != zIsAudio ? 1 : 2, track.pendingSamplesByteBuffer.removeFirst(), track.pendingSamplesBufferInfo.removeFirst(), zIsAudio);
                priorityQueue.add(webmFrame);
                if (!webmFrame.isAudioFrame.booleanValue() && (webmFrame.bufferInfo.flags & 1) > 0) {
                    z = true;
                }
            }
            i2++;
        }
        if (priorityQueue.isEmpty()) {
            return;
        }
        WebmFrame webmFrame2 = (WebmFrame) priorityQueue.peek();
        an.B(webmFrame2);
        long j2 = webmFrame2.bufferInfo.presentationTimeUs;
        ArrayList arrayList = new ArrayList();
        long jUsToSegmentTicks = usToSegmentTicks(j2 - this.firstSampleTimestampUs);
        arrayList.add(WebmElements.createUnsignedIntElement(231L, jUsToSegmentTicks));
        while (!priorityQueue.isEmpty()) {
            WebmFrame webmFrame3 = (WebmFrame) priorityQueue.poll();
            an.B(webmFrame3);
            arrayList.add(WebmElements.createSimpleBlockElement(webmFrame3.trackNumber, usToSegmentTicks(webmFrame3.bufferInfo.presentationTimeUs - j2), 1 == (webmFrame3.bufferInfo.flags & 1), webmFrame3.data));
        }
        long position = this.muxerOutput.getPosition() - this.segmentDataStart;
        this.muxerOutput.write(WebmElements.wrapIntoElement(524531317L, arrayList));
        this.cuePoints.add(WebmElements.createCuePointElement(jUsToSegmentTicks, z ? 1 : webmFrame2.trackNumber, position));
    }

    private boolean shouldCreateCluster(Track track, BufferInfo bufferInfo) {
        if (track.pendingSamplesBufferInfo.isEmpty()) {
            return false;
        }
        if (MimeTypes.isVideo(track.format.sampleMimeType)) {
            return (bufferInfo.flags & 1) > 0;
        }
        return bufferInfo.presentationTimeUs - track.pendingSamplesBufferInfo.getFirst().presentationTimeUs > SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US;
    }

    private long usToSegmentTicks(long j2) {
        return Util.scaleLargeTimestamp(j2, 1000L, 1000000L);
    }

    private void writeSegmentHeader() {
        this.muxerOutput.write(WebmElements.createEbmlHeaderElement());
        this.muxerOutput.write(WebmElements.uintToMinimumLengthByteBuffer(408125543L));
        this.muxerOutput.write(WebmElements.uintToMinimumLengthByteBuffer(WebmConstants.MKV_UNKNOWN_LENGTH));
        this.segmentDataStart = this.muxerOutput.getPosition();
        this.muxerOutput.write(WebmElements.createVoidElement(72));
        this.infoElementStart = this.muxerOutput.getPosition();
        this.muxerOutput.write(WebmElements.createInfoElement(0.0f));
        this.trackElementStart = this.muxerOutput.getPosition();
        this.muxerOutput.write(WebmElements.createTrackElements(this.addedTracks));
    }

    public Track addTrack(int i2, Format format) {
        an.l(!this.writtenSegmentHeader);
        Track track = new Track(i2, format, 1, this.sampleCopyEnabled);
        this.addedTracks.add(track);
        return track;
    }

    public void close() {
        createCluster();
        List<ByteBuffer> list = this.cuePoints;
        SeekableMuxerOutput seekableMuxerOutput = this.muxerOutput;
        long position = seekableMuxerOutput.getPosition();
        seekableMuxerOutput.write(WebmElements.wrapIntoElement(475249515L, list));
        long position2 = this.muxerOutput.getPosition();
        long j2 = this.segmentDataStart;
        this.muxerOutput.setPosition(j2 - 8);
        this.muxerOutput.write(EbmlUtils.encodeVIntWithWidth(position2 - j2, 8));
        this.muxerOutput.setPosition(this.infoElementStart);
        this.muxerOutput.write(WebmElements.createInfoElement(usToSegmentTicks(this.lastSampleEndsAtTimestampUs - this.firstSampleTimestampUs)));
        an.u(this.muxerOutput.getPosition() == this.trackElementStart);
        this.muxerOutput.setPosition(this.segmentDataStart);
        long j3 = this.infoElementStart;
        long j4 = this.segmentDataStart;
        this.muxerOutput.write(WebmElements.createSeekHeadElement(j3 - j4, this.trackElementStart - j4, position - j4));
        this.muxerOutput.write(WebmElements.createVoidElement((int) (this.infoElementStart - this.muxerOutput.getPosition())));
    }

    public void writeSampleData(Track track, ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        if (!this.writtenSegmentHeader) {
            writeSegmentHeader();
            this.writtenSegmentHeader = true;
        }
        if (shouldCreateCluster(track, bufferInfo)) {
            createCluster();
        }
        track.writeSampleData(byteBuffer, bufferInfo);
        long j2 = this.firstSampleTimestampUs;
        this.firstSampleTimestampUs = j2 == C.TIME_UNSET ? bufferInfo.presentationTimeUs : Math.min(j2, bufferInfo.presentationTimeUs);
        long jLongValue = this.prevPresentationTimeOfTrack.get(track.id, Long.valueOf(bufferInfo.presentationTimeUs)).longValue();
        long j3 = this.lastSampleEndsAtTimestampUs;
        long j4 = bufferInfo.presentationTimeUs;
        this.lastSampleEndsAtTimestampUs = Math.max(j3, j4 + (j4 - jLongValue));
        this.prevPresentationTimeOfTrack.put(track.id, Long.valueOf(bufferInfo.presentationTimeUs));
    }
}
