package androidx.media3.muxer;

import androidx.collection.SieveCacheKt;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import com.google.d.b.an;
import com.google.d.d.er;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class Mp4Writer {
    private static final int DEFAULT_MOOV_BOX_SIZE_BYTES = 400000;
    private static final String FREE_BOX_TYPE = "free";
    private static final long INTERLEAVE_DURATION_US = 1000000;
    private static final long MOOV_BOX_UPDATE_INTERVAL_US = 1000000;
    private final AnnexBToAvccConverter annexBToAvccConverter;
    private boolean canWriteMoovAtStart;
    private final int freeSpaceAfterFtypInBytes;
    private final int lastSampleDurationBehavior;
    private long mdatDataEnd;
    private long mdatEnd;
    private long mdatStart;
    private final MetadataCollector metadataCollector;
    private final SeekableMuxerOutput muxerOutput;
    private long reservedMoovSpaceEnd;
    private long reservedMoovSpaceStart;
    private final boolean sampleBatchingEnabled;
    private final boolean sampleCopyEnabled;
    private final List<Track> tracks = new ArrayList();
    private final List<Track> auxiliaryTracks = new ArrayList();
    private final AtomicBoolean hasWrittenSamples = new AtomicBoolean(false);
    private er<Long> lastMoovWritten = er.c(0L, 0L);
    private long lastMoovWrittenAtSampleTimestampUs = 0;
    private final LinearByteBufferAllocator linearByteBufferAllocator = new LinearByteBufferAllocator(0);

    public Mp4Writer(SeekableMuxerOutput seekableMuxerOutput, MetadataCollector metadataCollector, AnnexBToAvccConverter annexBToAvccConverter, int i2, boolean z, boolean z2, boolean z3, int i3) {
        this.muxerOutput = seekableMuxerOutput;
        this.metadataCollector = metadataCollector;
        this.annexBToAvccConverter = annexBToAvccConverter;
        this.lastSampleDurationBehavior = i2;
        this.sampleCopyEnabled = z;
        this.sampleBatchingEnabled = z2;
        this.freeSpaceAfterFtypInBytes = i3;
        this.canWriteMoovAtStart = z3;
    }

    private ByteBuffer assembleCurrentMoovData() {
        return Boxes.moov(this.tracks, this.metadataCollector, false, this.lastSampleDurationBehavior);
    }

    private void doInterleave() {
        List<Track> list = this.auxiliaryTracks;
        boolean zMaybeWritePendingTrackSamples = maybeWritePendingTrackSamples(this.tracks);
        maybeWritePendingTrackSamples(list);
        if (zMaybeWritePendingTrackSamples && this.canWriteMoovAtStart) {
            maybeWriteMoovAtStart();
        }
    }

    private ByteBuffer getAxteBox() {
        ByteBuffer byteBufferFtyp = Boxes.ftyp();
        MetadataCollector metadataCollector = new MetadataCollector();
        MuxerUtil.populateAuxiliaryTracksMetadata(metadataCollector, this.metadataCollector.timestampData, true, this.auxiliaryTracks);
        return BoxUtils.concatenateBuffers(Boxes.getAxteBoxHeader(byteBufferFtyp.remaining() + r5.remaining()), byteBufferFtyp, Boxes.moov(this.auxiliaryTracks, metadataCollector, false, this.lastSampleDurationBehavior));
    }

    private long getMdatExtensionAmount(long j2) {
        return Math.min(C.NANOS_PER_SECOND, Math.max(500000L, (long) (j2 * 0.2f)));
    }

    private void maybeExtendMdatAndRewriteMoov(long j2) {
        if (this.canWriteMoovAtStart) {
            return;
        }
        long j3 = this.mdatDataEnd;
        if (j3 + j2 >= this.mdatEnd) {
            rewriteMoovWithMdatEmptySpace(getMdatExtensionAmount(j3) + j2);
        }
    }

    private void maybeWriteMoovAtStart() {
        ByteBuffer byteBufferAssembleCurrentMoovData = assembleCurrentMoovData();
        int iRemaining = byteBufferAssembleCurrentMoovData.remaining();
        int iRemaining2 = byteBufferAssembleCurrentMoovData.remaining() + 8;
        long j2 = this.reservedMoovSpaceEnd;
        long j3 = this.reservedMoovSpaceStart;
        if (iRemaining2 <= j2 - j3) {
            this.muxerOutput.setPosition(j3);
            this.muxerOutput.write(byteBufferAssembleCurrentMoovData);
            this.muxerOutput.write(BoxUtils.wrapIntoBox(FREE_BOX_TYPE, ByteBuffer.allocate((int) ((this.reservedMoovSpaceEnd - this.muxerOutput.getPosition()) - 8))));
        } else {
            this.canWriteMoovAtStart = false;
            long j4 = this.mdatDataEnd;
            this.mdatEnd = j4;
            this.muxerOutput.setPosition(j4);
            this.muxerOutput.write(byteBufferAssembleCurrentMoovData);
            this.lastMoovWritten = er.c(Long.valueOf(this.mdatEnd), Long.valueOf(this.mdatEnd + iRemaining));
            ByteBuffer byteBufferWrapIntoBox = BoxUtils.wrapIntoBox(FREE_BOX_TYPE, ByteBuffer.allocate((int) ((this.reservedMoovSpaceEnd - this.reservedMoovSpaceStart) - 8)));
            this.muxerOutput.setPosition(this.reservedMoovSpaceStart);
            this.muxerOutput.write(byteBufferWrapIntoBox);
        }
        updateMdatSize(this.mdatDataEnd - this.mdatStart);
    }

    private boolean maybeWritePendingTrackSamples(List<Track> list) {
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Track track = list.get(i2);
            if (track.pendingSamplesBufferInfo.size() > 2) {
                BufferInfo bufferInfoPeekFirst = track.pendingSamplesBufferInfo.peekFirst();
                an.B(bufferInfoPeekFirst);
                BufferInfo bufferInfoPeekLast = track.pendingSamplesBufferInfo.peekLast();
                an.B(bufferInfoPeekLast);
                if (bufferInfoPeekLast.presentationTimeUs - bufferInfoPeekFirst.presentationTimeUs > 1000000) {
                    writePendingTrackSamples(track);
                    z = true;
                }
            }
        }
        return z;
    }

    private void rewriteMoovWithMdatEmptySpace(long j2) {
        safelyReplaceMoovAtEnd(Math.max(this.mdatEnd + j2, ((Long) this.lastMoovWritten.f()).longValue()), assembleCurrentMoovData());
    }

    private void safelyReplaceMoovAtEnd(long j2, ByteBuffer byteBuffer) {
        an.u(j2 >= ((Long) this.lastMoovWritten.f()).longValue());
        an.u(j2 >= this.mdatEnd);
        this.muxerOutput.setPosition(j2);
        this.muxerOutput.write(BoxUtils.wrapIntoBox(FREE_BOX_TYPE, byteBuffer.duplicate()));
        long j3 = 8 + j2;
        this.mdatEnd = j3;
        updateMdatSize(j3 - this.mdatStart);
        this.lastMoovWritten = er.c(Long.valueOf(j2), Long.valueOf(j2 + byteBuffer.remaining()));
    }

    private void updateMdatSize(long j2) {
        this.muxerOutput.setPosition(this.mdatStart + 8);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(j2);
        byteBufferAllocate.flip();
        this.muxerOutput.write(byteBufferAllocate);
    }

    private void writeAxteBox() {
        MetadataCollector metadataCollector = this.metadataCollector;
        MdtaMetadataEntry auxiliaryTracksOffsetMetadata = MuxerUtil.getAuxiliaryTracksOffsetMetadata(0L);
        metadataCollector.addMetadata(auxiliaryTracksOffsetMetadata);
        ByteBuffer axteBox = getAxteBox();
        this.metadataCollector.addMetadata(MuxerUtil.getAuxiliaryTracksLengthMetadata(axteBox.remaining()));
        finalizeMoovBox();
        this.metadataCollector.removeMdtaMetadataEntry(auxiliaryTracksOffsetMetadata);
        this.metadataCollector.addMetadata(MuxerUtil.getAuxiliaryTracksOffsetMetadata(this.muxerOutput.getSize()));
        long size = this.muxerOutput.getSize();
        finalizeMoovBox();
        an.u(size == this.muxerOutput.getSize());
        SeekableMuxerOutput seekableMuxerOutput = this.muxerOutput;
        seekableMuxerOutput.setPosition(seekableMuxerOutput.getSize());
        this.muxerOutput.write(axteBox);
    }

    private void writeHeader() {
        this.muxerOutput.setPosition(0L);
        this.muxerOutput.write(Boxes.ftyp());
        int i2 = this.freeSpaceAfterFtypInBytes;
        if (i2 > 0) {
            this.muxerOutput.write(BoxUtils.wrapIntoBox(FREE_BOX_TYPE, ByteBuffer.allocate(i2)));
        }
        if (this.canWriteMoovAtStart) {
            this.reservedMoovSpaceStart = this.muxerOutput.getPosition();
            this.muxerOutput.write(BoxUtils.wrapIntoBox(FREE_BOX_TYPE, ByteBuffer.allocate(DEFAULT_MOOV_BOX_SIZE_BYTES)));
            this.reservedMoovSpaceEnd = this.muxerOutput.getPosition();
        }
        this.mdatStart = this.muxerOutput.getPosition();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.put(Util.getUtf8Bytes("mdat"));
        byteBufferAllocate.putLong(16L);
        byteBufferAllocate.flip();
        this.muxerOutput.write(byteBufferAllocate);
        long j2 = this.mdatStart + 16;
        this.mdatDataEnd = j2;
        if (true == this.canWriteMoovAtStart) {
            j2 = Long.MAX_VALUE;
        }
        this.mdatEnd = j2;
    }

    private void writePendingTrackSamples(Track track) {
        an.u(track.pendingSamplesByteBuffer.size() == track.pendingSamplesBufferInfo.size());
        if (track.pendingSamplesBufferInfo.isEmpty()) {
            return;
        }
        if (!this.hasWrittenSamples.getAndSet(true)) {
            writeHeader();
        }
        long jLimit = 0;
        while (track.pendingSamplesByteBuffer.iterator().hasNext()) {
            jLimit += r0.next().limit();
        }
        maybeExtendMdatAndRewriteMoov(jLimit);
        track.writtenChunkOffsets.add(Long.valueOf(this.mdatDataEnd));
        track.writtenChunkSampleCounts.add(Integer.valueOf(track.pendingSamplesBufferInfo.size()));
        do {
            BufferInfo bufferInfoRemoveFirst = track.pendingSamplesBufferInfo.removeFirst();
            ByteBuffer byteBufferRemoveFirst = track.pendingSamplesByteBuffer.removeFirst();
            if (AnnexBUtils.doesSampleContainAnnexBNalUnits(track.format)) {
                byteBufferRemoveFirst = this.annexBToAvccConverter.process(byteBufferRemoveFirst, this.linearByteBufferAllocator);
                bufferInfoRemoveFirst = new BufferInfo(bufferInfoRemoveFirst.presentationTimeUs, byteBufferRemoveFirst.remaining(), bufferInfoRemoveFirst.flags);
            }
            maybeExtendMdatAndRewriteMoov(byteBufferRemoveFirst.remaining());
            this.muxerOutput.setPosition(this.mdatDataEnd);
            this.mdatDataEnd += this.muxerOutput.write(byteBufferRemoveFirst);
            this.linearByteBufferAllocator.reset();
            track.writtenSamples.add(bufferInfoRemoveFirst);
        } while (!track.pendingSamplesBufferInfo.isEmpty());
        an.u(this.mdatDataEnd <= this.mdatEnd);
    }

    public Track addAuxiliaryTrack(int i2, int i3, Format format) {
        Track track = new Track(i2, format, i3, this.sampleCopyEnabled);
        this.auxiliaryTracks.add(track);
        Collections.sort(this.auxiliaryTracks, new Comparator() { // from class: androidx.media3.muxer.Mp4Writer$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((Track) obj).sortKey, ((Track) obj2).sortKey);
            }
        });
        return track;
    }

    public Track addTrack(int i2, int i3, Format format) {
        Track track = new Track(i2, format, i3, this.sampleCopyEnabled);
        this.tracks.add(track);
        Collections.sort(this.tracks, new Comparator() { // from class: androidx.media3.muxer.Mp4Writer$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((Track) obj).sortKey, ((Track) obj2).sortKey);
            }
        });
        return track;
    }

    public void finalizeMoovBox() {
        if (this.canWriteMoovAtStart) {
            maybeWriteMoovAtStart();
            return;
        }
        ByteBuffer byteBufferAssembleCurrentMoovData = assembleCurrentMoovData();
        int iRemaining = byteBufferAssembleCurrentMoovData.remaining();
        long j2 = iRemaining + 8;
        if (this.mdatEnd - this.mdatDataEnd < j2) {
            safelyReplaceMoovAtEnd(((Long) this.lastMoovWritten.f()).longValue() + j2, byteBufferAssembleCurrentMoovData);
            an.u(this.mdatEnd - this.mdatDataEnd >= j2);
        }
        long j3 = this.mdatDataEnd;
        this.muxerOutput.setPosition(j3);
        this.muxerOutput.write(byteBufferAssembleCurrentMoovData);
        long j4 = iRemaining + j3;
        long jLongValue = ((Long) this.lastMoovWritten.f()).longValue() - j4;
        an.u(jLongValue < SieveCacheKt.NodeLinkMask);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt((int) jLongValue);
        byteBufferAllocate.put(Util.getUtf8Bytes(FREE_BOX_TYPE));
        byteBufferAllocate.flip();
        this.muxerOutput.write(byteBufferAllocate);
        this.mdatEnd = j3;
        updateMdatSize(j3 - this.mdatStart);
        this.lastMoovWritten = er.c(Long.valueOf(j3), Long.valueOf(j3 + byteBufferAssembleCurrentMoovData.limit()));
        this.muxerOutput.truncate(j4);
    }

    public void finishWritingSamplesAndFinalizeMoovBox() {
        for (int i2 = 0; i2 < this.tracks.size(); i2++) {
            writePendingTrackSamples(this.tracks.get(i2));
        }
        for (int i3 = 0; i3 < this.auxiliaryTracks.size(); i3++) {
            writePendingTrackSamples(this.auxiliaryTracks.get(i3));
        }
        if (this.hasWrittenSamples.get()) {
            finalizeMoovBox();
            if (this.auxiliaryTracks.isEmpty()) {
                return;
            }
            writeAxteBox();
        }
    }

    public void writeSampleData(Track track, ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        if (track.format.initializationData.isEmpty() && track.parsedCsd == null) {
            if (Objects.equals(track.format.sampleMimeType, MimeTypes.VIDEO_AV1)) {
                track.parsedCsd = Av1ConfigUtil.createAv1CodecConfigurationRecord(byteBuffer.duplicate());
            } else if (Objects.equals(track.format.sampleMimeType, MimeTypes.VIDEO_VP9)) {
                track.parsedCsd = CodecSpecificDataUtil.buildVp9CodecPrivateFromUncompressedHeader(byteBuffer.duplicate());
            }
        }
        track.writeSampleData(byteBuffer, bufferInfo);
        if (this.sampleBatchingEnabled) {
            doInterleave();
            return;
        }
        writePendingTrackSamples(track);
        boolean zContains = this.tracks.contains(track);
        long j2 = bufferInfo.presentationTimeUs;
        if (zContains && this.canWriteMoovAtStart && j2 - this.lastMoovWrittenAtSampleTimestampUs >= 1000000) {
            maybeWriteMoovAtStart();
            this.lastMoovWrittenAtSampleTimestampUs = j2;
        }
    }
}
