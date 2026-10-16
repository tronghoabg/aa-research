package androidx.media3.muxer;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import com.google.d.d.bi;
import com.google.d.d.bn;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class FragmentedMp4Writer {
    private final AnnexBToAvccConverter annexBToAvccConverter;
    private final long fragmentDurationUs;
    private boolean headerCreated;
    private long maxTrackDurationUs;
    private final MetadataCollector metadataCollector;
    private int nextTrackId;
    private final PositionTrackingOutputChannel outputChannel;
    private final boolean sampleCopyEnabled;
    private Track videoTrack;
    private final int lastSampleDurationBehavior = 1;
    private final List<Track> tracks = new ArrayList();
    private long minInputPresentationTimeUs = Long.MAX_VALUE;
    private int currentFragmentSequenceNumber = 1;
    private final LinearByteBufferAllocator linearByteBufferAllocator = new LinearByteBufferAllocator(0);

    /* compiled from: WazeSource */
    class PositionTrackingOutputChannel implements WritableByteChannel {
        private final WritableByteChannel outputChannel;
        private long position = 0;

        public PositionTrackingOutputChannel(WritableByteChannel writableByteChannel) {
            this.outputChannel = writableByteChannel;
        }

        @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.outputChannel.close();
        }

        public long getPosition() {
            return this.position;
        }

        @Override // java.nio.channels.Channel
        public boolean isOpen() {
            return this.outputChannel.isOpen();
        }

        @Override // java.nio.channels.WritableByteChannel
        public int write(ByteBuffer byteBuffer) throws IOException {
            int iWrite = this.outputChannel.write(byteBuffer);
            this.position += iWrite;
            return iWrite;
        }
    }

    /* compiled from: WazeSource */
    class ProcessedTrackInfo {
        public final boolean hasBFrame;
        public final bn<ByteBuffer> pendingSamplesByteBuffer;
        public final bn<SampleMetadata> pendingSamplesMetadata;
        public final int totalSamplesSize;
        public final Format trackFormat;
        public final int trackId;

        public ProcessedTrackInfo(int i2, Format format, int i3, boolean z, bn<ByteBuffer> bnVar, bn<SampleMetadata> bnVar2) {
            this.trackId = i2;
            this.trackFormat = format;
            this.totalSamplesSize = i3;
            this.hasBFrame = z;
            this.pendingSamplesByteBuffer = bnVar;
            this.pendingSamplesMetadata = bnVar2;
        }
    }

    /* compiled from: WazeSource */
    public class SampleMetadata {
        public final int compositionTimeOffsetVu;
        public final int durationVu;
        public final int flags;
        public final int size;

        public SampleMetadata(int i2, int i3, int i4, int i5) {
            this.durationVu = i2;
            this.size = i3;
            this.flags = i4;
            this.compositionTimeOffsetVu = i5;
        }
    }

    public FragmentedMp4Writer(WritableByteChannel writableByteChannel, MetadataCollector metadataCollector, AnnexBToAvccConverter annexBToAvccConverter, long j2, boolean z) {
        this.outputChannel = new PositionTrackingOutputChannel(writableByteChannel);
        this.metadataCollector = metadataCollector;
        this.annexBToAvccConverter = annexBToAvccConverter;
        this.fragmentDurationUs = j2 * 1000;
        this.sampleCopyEnabled = z;
    }

    private static int calculateMoofBoxSize(List<ProcessedTrackInfo> list) {
        int trunBoxContentSize = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            ProcessedTrackInfo processedTrackInfo = list.get(i2);
            trunBoxContentSize += Boxes.getTrunBoxContentSize(processedTrackInfo.pendingSamplesMetadata.size(), processedTrackInfo.hasBFrame) + 40;
        }
        return trunBoxContentSize + 24;
    }

    private void createFragment() throws IOException {
        PositionTrackingOutputChannel positionTrackingOutputChannel = this.outputChannel;
        bn<ProcessedTrackInfo> bnVarProcessAllTracks = processAllTracks();
        bn<ByteBuffer> bnVarCreateTrafBoxes = createTrafBoxes(bnVarProcessAllTracks, positionTrackingOutputChannel.getPosition());
        if (bnVarCreateTrafBoxes.isEmpty()) {
            return;
        }
        this.outputChannel.write(Boxes.moof(Boxes.mfhd(this.currentFragmentSequenceNumber), bnVarCreateTrafBoxes));
        writeMdatBox(bnVarProcessAllTracks);
        this.currentFragmentSequenceNumber++;
        this.maxTrackDurationUs = 0L;
    }

    private void createHeader() throws IOException {
        this.outputChannel.write(Boxes.ftyp());
        int i2 = this.lastSampleDurationBehavior;
        this.outputChannel.write(Boxes.moov(this.tracks, this.metadataCollector, true, i2));
    }

    private static bn<ByteBuffer> createTrafBoxes(List<ProcessedTrackInfo> list, long j2) {
        bi biVar = new bi();
        int iCalculateMoofBoxSize = calculateMoofBoxSize(list) + 8;
        for (int i2 = 0; i2 < list.size(); i2++) {
            ProcessedTrackInfo processedTrackInfo = list.get(i2);
            biVar.g(Boxes.traf(Boxes.tfhd(processedTrackInfo.trackId, j2), Boxes.trun(processedTrackInfo.trackFormat, processedTrackInfo.pendingSamplesMetadata, iCalculateMoofBoxSize, processedTrackInfo.hasBFrame)));
            iCalculateMoofBoxSize += processedTrackInfo.totalSamplesSize;
        }
        return biVar.f();
    }

    private bn<ProcessedTrackInfo> processAllTracks() {
        bi biVar = new bi();
        int i2 = 0;
        while (i2 < this.tracks.size()) {
            int i3 = i2 + 1;
            if (!this.tracks.get(i2).pendingSamplesBufferInfo.isEmpty()) {
                biVar.g(processTrack(i3, this.tracks.get(i2)));
            }
            i2 = i3;
        }
        return biVar.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ProcessedTrackInfo processTrack(int i2, Track track) {
        an.u(track.pendingSamplesByteBuffer.size() == track.pendingSamplesBufferInfo.size());
        bi biVar = new bi();
        bi biVar2 = new bi();
        if (AnnexBUtils.doesSampleContainAnnexBNalUnits(track.format)) {
            while (!track.pendingSamplesByteBuffer.isEmpty()) {
                ByteBuffer byteBufferProcess = this.annexBToAvccConverter.process(track.pendingSamplesByteBuffer.removeFirst(), this.linearByteBufferAllocator);
                biVar.g(byteBufferProcess);
                BufferInfo bufferInfoRemoveFirst = track.pendingSamplesBufferInfo.removeFirst();
                biVar2.g(new BufferInfo(bufferInfoRemoveFirst.presentationTimeUs, byteBufferProcess.remaining(), bufferInfoRemoveFirst.flags));
            }
        } else {
            biVar.i(track.pendingSamplesByteBuffer);
            track.pendingSamplesByteBuffer.clear();
            biVar2.i(track.pendingSamplesBufferInfo);
            track.pendingSamplesBufferInfo.clear();
        }
        bn bnVarF = biVar2.f();
        List<Integer> listConvertPresentationTimestampsToDurationsVu = Boxes.convertPresentationTimestampsToDurationsVu(bnVarF, track.videoUnitTimebase(), 1, track.endOfStreamTimestampUs);
        List<Integer> listCalculateSampleCompositionTimeOffsets = Boxes.calculateSampleCompositionTimeOffsets(bnVarF, listConvertPresentationTimestampsToDurationsVu, track.videoUnitTimebase());
        boolean zIsEmpty = listCalculateSampleCompositionTimeOffsets.isEmpty();
        boolean z = !zIsEmpty;
        bi biVar3 = new bi();
        int i3 = 0;
        for (int i4 = 0; i4 < bnVarF.size(); i4++) {
            i3 += ((BufferInfo) bnVarF.get(i4)).size;
            biVar3.g(new SampleMetadata(listConvertPresentationTimestampsToDurationsVu.get(i4).intValue(), ((BufferInfo) bnVarF.get(i4)).size, ((BufferInfo) bnVarF.get(i4)).flags, !zIsEmpty ? listCalculateSampleCompositionTimeOffsets.get(i4).intValue() : 0));
        }
        return new ProcessedTrackInfo(i2, track.format, i3, z, biVar.f(), biVar3.f());
    }

    private boolean shouldFlushPendingSamples(Track track, BufferInfo bufferInfo) {
        Track track2 = this.videoTrack;
        if (track2 == null) {
            return this.maxTrackDurationUs >= this.fragmentDurationUs;
        }
        if (track.equals(track2) && track.hadKeyframe && (bufferInfo.flags & 1) > 0) {
            BufferInfo bufferInfoPeekFirst = track.pendingSamplesBufferInfo.peekFirst();
            an.B(bufferInfoPeekFirst);
            BufferInfo bufferInfoPeekLast = track.pendingSamplesBufferInfo.peekLast();
            an.B(bufferInfoPeekLast);
            if (bufferInfoPeekLast.presentationTimeUs - bufferInfoPeekFirst.presentationTimeUs >= this.fragmentDurationUs) {
                return true;
            }
        }
        return false;
    }

    private void writeMdatBox(List<ProcessedTrackInfo> list) throws IOException {
        long jRemaining = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            for (int i3 = 0; i3 < list.get(i2).pendingSamplesByteBuffer.size(); i3++) {
                jRemaining += r4.pendingSamplesByteBuffer.get(i3).remaining();
            }
        }
        long j2 = jRemaining + 8;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        an.m(j2 <= MuxerUtil.UNSIGNED_INT_MAX_VALUE, "Only 32-bit long mdat size supported in the fragmented MP4");
        byteBufferAllocate.putInt((int) j2);
        byteBufferAllocate.put(Util.getUtf8Bytes("mdat"));
        byteBufferAllocate.flip();
        this.outputChannel.write(byteBufferAllocate);
        for (int i4 = 0; i4 < list.size(); i4++) {
            ProcessedTrackInfo processedTrackInfo = list.get(i4);
            for (int i5 = 0; i5 < processedTrackInfo.pendingSamplesByteBuffer.size(); i5++) {
                this.outputChannel.write(processedTrackInfo.pendingSamplesByteBuffer.get(i5));
            }
        }
        this.linearByteBufferAllocator.reset();
    }

    public Track addTrack(int i2, Format format) {
        int i3 = this.nextTrackId;
        this.nextTrackId = i3 + 1;
        Track track = new Track(i3, format, this.sampleCopyEnabled);
        this.tracks.add(track);
        if (MimeTypes.isVideo(format.sampleMimeType)) {
            this.videoTrack = track;
        }
        return track;
    }

    public void close() {
        try {
            createFragment();
        } finally {
            this.outputChannel.close();
        }
    }

    public void writeSampleData(Track track, ByteBuffer byteBuffer, BufferInfo bufferInfo) throws IOException {
        if (Objects.equals(track.format.sampleMimeType, MimeTypes.VIDEO_AV1) && track.format.initializationData.isEmpty() && track.parsedCsd == null) {
            track.parsedCsd = Av1ConfigUtil.createAv1CodecConfigurationRecord(byteBuffer.duplicate());
        }
        if (!this.headerCreated) {
            createHeader();
            this.headerCreated = true;
        }
        if (shouldFlushPendingSamples(track, bufferInfo)) {
            createFragment();
        }
        track.writeSampleData(byteBuffer, bufferInfo);
        BufferInfo bufferInfoPeekFirst = track.pendingSamplesBufferInfo.peekFirst();
        an.B(bufferInfoPeekFirst);
        BufferInfo bufferInfoPeekLast = track.pendingSamplesBufferInfo.peekLast();
        an.B(bufferInfoPeekLast);
        this.minInputPresentationTimeUs = Math.min(this.minInputPresentationTimeUs, bufferInfoPeekFirst.presentationTimeUs);
        this.maxTrackDurationUs = Math.max(this.maxTrackDurationUs, bufferInfoPeekLast.presentationTimeUs - bufferInfoPeekFirst.presentationTimeUs);
    }
}
