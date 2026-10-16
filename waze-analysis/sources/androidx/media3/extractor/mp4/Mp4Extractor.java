package androidx.media3.extractor.mp4;

import android.net.Uri;
import androidx.collection.SieveCacheKt;
import androidx.media3.common.C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4Box;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SniffFailure;
import androidx.media3.extractor.TrackAwareSeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.metadata.Chapter;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import com.google.d.b.ab;
import com.google.d.b.an;
import com.google.d.d.bn;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Mp4Extractor implements Extractor {

    @Deprecated
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.mp4.Mp4Extractor$$ExternalSyntheticLambda5
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return Mp4Extractor.lambda$static$0();
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ ExtractorsFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i2) {
            return this;
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
            return this;
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ ExtractorsFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            return this;
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return createExtractors();
        }
    };
    private static final int FILE_TYPE_MP4 = 0;
    private static final int FILE_TYPE_QUICKTIME = 1;
    public static final int FLAG_DISABLE_ARTWORK_METADATA = 512;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 16;
    public static final int FLAG_MARK_FIRST_VIDEO_TRACK_WITH_MAIN_ROLE = 8;
    public static final int FLAG_OMIT_TRACK_SAMPLE_TABLE = 256;
    public static final int FLAG_READ_AUXILIARY_TRACKS = 64;
    public static final int FLAG_READ_SEF_DATA = 4;
    public static final int FLAG_READ_WITHIN_GOP_SAMPLE_DEPENDENCIES = 32;
    public static final int FLAG_READ_WITHIN_GOP_SAMPLE_DEPENDENCIES_H265 = 128;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 1;
    private static final long MAXIMUM_READ_AHEAD_BYTES_STREAM = 10485760;
    private static final long MAX_DURATION_US_TO_SCAN_FOR_THUMBNAIL = 10000000;
    private static final int MAX_SYNC_SAMPLES_TO_SCAN_FOR_THUMBNAIL = 20;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_QUICKTIME_CHAPTERS = 4;
    private static final int STATE_READING_SAMPLE = 2;
    private static final int STATE_READING_SEF = 3;
    private long[][] accumulatedSampleSizes;
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private long axteAtomOffset;
    private int chapterSampleIndex;
    private final List<TrackSampleTable> chapterSampleTables;
    private int chapterTrackIndex;
    private final ArrayDeque<Mp4Box.ContainerBox> containerAtoms;
    private ExtractorOutput extractorOutput;
    private int fileType;
    private final int flags;
    private boolean isSampleDependedOn;
    private bn<SniffFailure> lastSniffFailures;
    private boolean moovAtomProcessed;
    private final ParsableByteArray nalPrefix;
    private final ParsableByteArray nalStartCode;
    private final boolean omitTrackSampleTable;
    private int parserState;
    private final List<Chapter> quickTimeChapters;
    private boolean readingAuxiliaryTracks;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private long sampleOffsetForAuxiliaryTracks;
    private int sampleTrackIndex;
    private final ParsableByteArray scratch;
    private boolean seekToAxteAtom;
    private boolean seenFtypAtom;
    private final SefReader sefReader;
    private final List<Metadata.Entry> slowMotionMetadataEntries;
    private final SubtitleParser.Factory subtitleParserFactory;
    private Mp4Track[] tracks;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface FileType {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* compiled from: WazeSource */
    final class Mp4Track {
        private Format pendingFormat;
        public int sampleIndex;
        public final TrackSampleTable sampleTable;
        public final Track track;
        public final TrackOutput trackOutput;
        public final TrueHdSampleRechunker trueHdSampleRechunker;

        public Mp4Track(Track track, TrackSampleTable trackSampleTable, TrackOutput trackOutput) {
            this.track = track;
            this.sampleTable = trackSampleTable;
            this.trackOutput = trackOutput;
            this.trueHdSampleRechunker = MimeTypes.AUDIO_TRUEHD.equals(track.format.sampleMimeType) ? new TrueHdSampleRechunker() : null;
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface State {
    }

    public Mp4Extractor(SubtitleParser.Factory factory, int i2) {
        this.subtitleParserFactory = factory;
        this.flags = i2;
        this.omitTrackSampleTable = (i2 & 256) != 0;
        this.lastSniffFailures = bn.p();
        this.parserState = (i2 & 4) != 0 ? 3 : 0;
        this.sefReader = new SefReader();
        this.slowMotionMetadataEntries = new ArrayList();
        this.atomHeader = new ParsableByteArray(16);
        this.containerAtoms = new ArrayDeque<>();
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalPrefix = new ParsableByteArray(6);
        this.scratch = new ParsableByteArray();
        this.sampleTrackIndex = -1;
        this.extractorOutput = ExtractorOutput.PLACEHOLDER;
        this.tracks = new Mp4Track[0];
        this.chapterSampleTables = new ArrayList();
        this.quickTimeChapters = new ArrayList();
    }

    private static int brandToFileType(int i2) {
        return i2 != 1903435808 ? 0 : 1;
    }

    private static long[][] calculateAccumulatedSampleSizes(Mp4Track[] mp4TrackArr) {
        int length = mp4TrackArr.length;
        long[][] jArr = new long[length][];
        int[] iArr = new int[length];
        long[] jArr2 = new long[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < mp4TrackArr.length; i2++) {
            jArr[i2] = new long[mp4TrackArr[i2].sampleTable.sampleCount];
            jArr2[i2] = mp4TrackArr[i2].sampleTable.timestampsUs[0];
        }
        long j2 = 0;
        int i3 = 0;
        while (i3 < mp4TrackArr.length) {
            int i4 = -1;
            long j3 = Long.MAX_VALUE;
            for (int i5 = 0; i5 < mp4TrackArr.length; i5++) {
                if (!zArr[i5]) {
                    long j4 = jArr2[i5];
                    if (j4 <= j3) {
                        i4 = i5;
                        j3 = j4;
                    }
                }
            }
            int i6 = iArr[i4];
            long[] jArr3 = jArr[i4];
            jArr3[i6] = j2;
            TrackSampleTable trackSampleTable = mp4TrackArr[i4].sampleTable;
            j2 += trackSampleTable.sizes[i6];
            int i7 = i6 + 1;
            iArr[i4] = i7;
            if (i7 < jArr3.length) {
                jArr2[i4] = trackSampleTable.timestampsUs[i7];
            } else {
                zArr[i4] = true;
                i3++;
            }
        }
        return jArr;
    }

    private boolean canReadWithinGopSampleDependencies(Format format) {
        int i2;
        if (Objects.equals(format.sampleMimeType, "video/avc")) {
            i2 = 32;
        } else {
            if (!Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_H265)) {
                return Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_APV);
            }
            i2 = 128;
        }
        return (this.flags & i2) != 0;
    }

    public static int codecsToParseWithinGopSampleDependenciesAsFlags(int i2) {
        int i3 = 1 != (i2 & 1) ? 0 : 32;
        return (i2 & 2) != 0 ? i3 | 128 : i3;
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private static long findBestThumbnailPresentationTimeUs(TrackSampleTable trackSampleTable, long j2) {
        int i2;
        if (MimeTypes.isVideo(trackSampleTable.track.format.sampleMimeType) && trackSampleTable.hasSampleTableData()) {
            int iMin = Math.min(trackSampleTable.hasOnlySyncSamples ? trackSampleTable.sampleCount : trackSampleTable.syncSampleIndices.length, 20);
            an.u(j2 != C.TIME_UNSET);
            long jMin = Math.min(j2, MAX_DURATION_US_TO_SCAN_FOR_THUMBNAIL);
            int i3 = -1;
            int i4 = 0;
            for (int i5 = 0; i5 < iMin; i5++) {
                int i6 = trackSampleTable.hasOnlySyncSamples ? i5 : trackSampleTable.syncSampleIndices[i5];
                long j3 = trackSampleTable.timestampsUs[i6];
                if (j3 > jMin) {
                    break;
                }
                if (j3 >= 0 && (i2 = trackSampleTable.sizes[i6]) > i4) {
                    i3 = i6;
                    i4 = i2;
                }
            }
            if (i3 != -1) {
                return trackSampleTable.timestampsUs[i3];
            }
        }
        return C.TIME_UNSET;
    }

    private List<Integer> getAuxiliaryTrackTypesForAuxiliaryTracks(Metadata metadata) {
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) metadata.getFirstMatchingEntry(MdtaMetadataEntry.class, new ab() { // from class: androidx.media3.extractor.mp4.Mp4Extractor$$ExternalSyntheticLambda6
            @Override // com.google.d.b.ab
            public final boolean apply(Object obj) {
                return ((MdtaMetadataEntry) obj).key.equals(MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_MAP);
            }
        });
        an.B(mdtaMetadataEntry);
        List<Integer> auxiliaryTrackTypesFromMap = mdtaMetadataEntry.getAuxiliaryTrackTypesFromMap();
        ArrayList arrayList = new ArrayList(auxiliaryTrackTypesFromMap.size());
        for (int i2 = 0; i2 < auxiliaryTrackTypesFromMap.size(); i2++) {
            int iIntValue = auxiliaryTrackTypesFromMap.get(i2).intValue();
            int i3 = 1;
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    i3 = 3;
                    if (iIntValue != 2) {
                        i3 = iIntValue != 3 ? 0 : 4;
                    }
                } else {
                    i3 = 2;
                }
            }
            arrayList.add(Integer.valueOf(i3));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getSynchronizationSampleIndex(TrackSampleTable trackSampleTable, long j2) {
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j2);
        return indexOfEarlierOrEqualSynchronizationSample == -1 ? trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j2) : indexOfEarlierOrEqualSynchronizationSample;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int getTrackIndexOfNextReadSample(long r23) {
        /*
            r22 = this;
            r0 = r22
            r2 = -1
            r6 = r2
            r7 = 0
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 1
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r15 = 1
        L16:
            androidx.media3.extractor.mp4.Mp4Extractor$Mp4Track[] r1 = r0.tracks
            int r3 = r1.length
            if (r7 >= r3) goto L68
            r1 = r1[r7]
            int r3 = r1.sampleIndex
            androidx.media3.extractor.mp4.TrackSampleTable r1 = r1.sampleTable
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = r1.sampleCount
            if (r3 != r4) goto L2b
            goto L65
        L2b:
            long[] r1 = r1.offsets
            r4 = r1[r3]
            long[][] r1 = r0.accumulatedSampleSizes
            com.google.d.b.an.B(r1)
            long[][] r1 = (long[][]) r1
            r1 = r1[r7]
            r18 = r1[r3]
            long r4 = r4 - r23
            r20 = 0
            int r1 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r1 < 0) goto L4c
            r20 = 262144(0x40000, double:1.295163E-318)
            int r1 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r1 < 0) goto L4a
            goto L4c
        L4a:
            r1 = 0
            goto L4d
        L4c:
            r1 = 1
        L4d:
            if (r1 != 0) goto L52
            if (r15 != 0) goto L58
            r15 = 0
        L52:
            if (r1 != r15) goto L5d
            int r3 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r3 >= 0) goto L5d
        L58:
            r15 = r1
            r13 = r4
            r6 = r7
            r11 = r18
        L5d:
            int r3 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r3 >= 0) goto L65
            r10 = r1
            r2 = r7
            r8 = r18
        L65:
            int r7 = r7 + 1
            goto L16
        L68:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 == 0) goto L7d
            if (r10 == 0) goto L7d
            r0 = 10485760(0xa00000, double:5.180654E-317)
            long r8 = r8 + r0
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 >= 0) goto L7c
            goto L7d
        L7c:
            return r2
        L7d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.Mp4Extractor.getTrackIndexOfNextReadSample(long):int");
    }

    static /* synthetic */ Extractor[] lambda$newFactory$0(SubtitleParser.Factory factory) {
        return new Extractor[]{new Mp4Extractor(factory)};
    }

    static /* synthetic */ Track lambda$processMoovAtom$0(Track track) {
        return track;
    }

    static /* synthetic */ boolean lambda$readQuickTimeChapters$0(Metadata.Entry entry) {
        return !(entry instanceof Chapter);
    }

    static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new Mp4Extractor(SubtitleParser.Factory.UNSUPPORTED, 16)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long maybeAdjustSeekOffset(TrackSampleTable trackSampleTable, long j2, long j3) {
        int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable, j2);
        return synchronizationSampleIndex == -1 ? j3 : Math.min(trackSampleTable.offsets[synchronizationSampleIndex], j3);
    }

    private void maybeSetDefaultSampleOffsetForAuxiliaryTracks(Metadata metadata) {
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) metadata.getFirstMatchingEntry(MdtaMetadataEntry.class, new ab() { // from class: androidx.media3.extractor.mp4.Mp4Extractor$$ExternalSyntheticLambda2
            @Override // com.google.d.b.ab
            public final boolean apply(Object obj) {
                return ((MdtaMetadataEntry) obj).key.equals(MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_INTERLEAVED);
            }
        });
        if (mdtaMetadataEntry == null || mdtaMetadataEntry.value[0] != 0) {
            return;
        }
        this.sampleOffsetForAuxiliaryTracks = this.axteAtomOffset + 16;
    }

    private void maybeSkipRemainingMetaAtomHeaderBytes(ExtractorInput extractorInput) {
        this.scratch.reset(8);
        extractorInput.peekFully(this.scratch.getData(), 0, 8);
        BoxParser.maybeSkipRemainingMetaBoxHeaderBytes(this.scratch);
        extractorInput.skipFully(this.scratch.getPosition());
        extractorInput.resetPeekPosition();
    }

    public static ExtractorsFactory newFactory(final SubtitleParser.Factory factory) {
        return new ExtractorsFactory() { // from class: androidx.media3.extractor.mp4.Mp4Extractor$$ExternalSyntheticLambda1
            @Override // androidx.media3.extractor.ExtractorsFactory
            public final Extractor[] createExtractors() {
                return Mp4Extractor.lambda$newFactory$0(factory);
            }

            @Override // androidx.media3.extractor.ExtractorsFactory
            public /* synthetic */ ExtractorsFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i2) {
                return this;
            }

            @Override // androidx.media3.extractor.ExtractorsFactory
            public /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
                return this;
            }

            @Override // androidx.media3.extractor.ExtractorsFactory
            public /* synthetic */ ExtractorsFactory setSubtitleParserFactory(SubtitleParser.Factory factory2) {
                return this;
            }

            @Override // androidx.media3.extractor.ExtractorsFactory
            public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
                return createExtractors();
            }
        };
    }

    private void processAtomEnded(long j2) throws NumberFormatException {
        while (true) {
            if (this.containerAtoms.isEmpty() || this.containerAtoms.peek().endPosition != j2) {
                break;
            }
            Mp4Box.ContainerBox containerBoxPop = this.containerAtoms.pop();
            if (containerBoxPop.type == 1836019574) {
                processMoovAtom(containerBoxPop);
                this.containerAtoms.clear();
                this.moovAtomProcessed = true;
                if (!this.seekToAxteAtom && !this.omitTrackSampleTable) {
                    this.parserState = true != this.chapterSampleTables.isEmpty() ? 4 : 2;
                }
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(containerBoxPop);
            }
        }
        int i2 = this.parserState;
        if (i2 == 4 || i2 == 2) {
            return;
        }
        enterReadingAtomHeaderState();
    }

    private static int processFtypAtom(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        if (brandToFileType(parsableByteArray.readInt()) != 0) {
            return 1;
        }
        parsableByteArray.skipBytes(4);
        while (parsableByteArray.bytesLeft() > 0) {
            if (brandToFileType(parsableByteArray.readInt()) != 0) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void processMoovAtom(androidx.media3.container.Mp4Box.ContainerBox r29) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.Mp4Extractor.processMoovAtom(androidx.media3.container.Mp4Box$ContainerBox):void");
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) throws ParserException, NumberFormatException {
        ParsableByteArray parsableByteArray;
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.getData(), 0, 8, true)) {
                return false;
            }
            this.atomHeaderBytesRead = 8;
            this.atomHeader.setPosition(0);
            this.atomSize = this.atomHeader.readUnsignedInt();
            this.atomType = this.atomHeader.readInt();
        }
        long j2 = this.atomSize;
        if (j2 == 1) {
            extractorInput.readFully(this.atomHeader.getData(), 8, 8);
            this.atomHeaderBytesRead += 8;
            this.atomSize = this.atomHeader.readUnsignedLongToLong();
        } else if (j2 == 0) {
            long length = extractorInput.getLength();
            if (length == -1) {
                Mp4Box.ContainerBox containerBoxPeek = this.containerAtoms.peek();
                length = containerBoxPeek != null ? containerBoxPeek.endPosition : -1L;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + this.atomHeaderBytesRead;
            }
        }
        long j3 = this.atomSize;
        int i2 = this.atomHeaderBytesRead;
        long j4 = i2;
        if (j3 < j4) {
            if (this.atomType != 1718773093 || i2 != 8) {
                throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
            }
            this.atomSize = j4;
            i2 = 8;
        }
        int i3 = this.atomType;
        if (shouldParseContainerAtom(i3)) {
            long position = extractorInput.getPosition();
            long j5 = this.atomSize;
            long j6 = position + j5;
            long j7 = this.atomHeaderBytesRead;
            if (j5 != j7 && this.atomType == 1835365473) {
                maybeSkipRemainingMetaAtomHeaderBytes(extractorInput);
            }
            long j8 = j6 - j7;
            this.containerAtoms.push(new Mp4Box.ContainerBox(this.atomType, j8));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(j8);
            } else {
                enterReadingAtomHeaderState();
            }
        } else {
            if (shouldParseLeafAtom(i3)) {
                an.u(i2 == 8);
                an.u(this.atomSize <= SieveCacheKt.NodeLinkMask);
                parsableByteArray = new ParsableByteArray((int) this.atomSize);
                System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            } else {
                parsableByteArray = null;
            }
            this.atomData = parsableByteArray;
            this.parserState = 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean readAtomPayload(androidx.media3.extractor.ExtractorInput r10, androidx.media3.extractor.PositionHolder r11) throws java.lang.NumberFormatException {
        /*
            r9 = this;
            long r0 = r9.atomSize
            int r2 = r9.atomHeaderBytesRead
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.getPosition()
            long r2 = r2 + r0
            androidx.media3.common.util.ParsableByteArray r4 = r9.atomData
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L47
            byte[] r7 = r4.getData()
            int r8 = r9.atomHeaderBytesRead
            int r0 = (int) r0
            r10.readFully(r7, r8, r0)
            int r10 = r9.atomType
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r0) goto L2c
            r9.seenFtypAtom = r5
            int r10 = processFtypAtom(r4)
            r9.fileType = r10
        L2a:
            r10 = r6
            goto L68
        L2c:
            java.util.ArrayDeque<androidx.media3.container.Mp4Box$ContainerBox> r10 = r9.containerAtoms
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L2a
            java.util.ArrayDeque<androidx.media3.container.Mp4Box$ContainerBox> r10 = r9.containerAtoms
            java.lang.Object r10 = r10.peek()
            androidx.media3.container.Mp4Box$ContainerBox r10 = (androidx.media3.container.Mp4Box.ContainerBox) r10
            androidx.media3.container.Mp4Box$LeafBox r0 = new androidx.media3.container.Mp4Box$LeafBox
            int r1 = r9.atomType
            r0.<init>(r1, r4)
            r10.add(r0)
            goto L2a
        L47:
            boolean r4 = r9.seenFtypAtom
            if (r4 != 0) goto L54
            int r4 = r9.atomType
            r7 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r4 != r7) goto L54
            r9.fileType = r5
        L54:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L60
            int r0 = (int) r0
            r10.skipFully(r0)
            goto L2a
        L60:
            long r7 = r10.getPosition()
            long r7 = r7 + r0
            r11.position = r7
            r10 = r5
        L68:
            r9.processAtomEnded(r2)
            boolean r0 = r9.seekToAxteAtom
            if (r0 == 0) goto L78
            r9.readingAuxiliaryTracks = r5
            long r0 = r9.axteAtomOffset
            r11.position = r0
            r9.seekToAxteAtom = r6
            goto L7a
        L78:
            if (r10 == 0) goto L80
        L7a:
            int r9 = r9.parserState
            r10 = 2
            if (r9 == r10) goto L80
            return r5
        L80:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.Mp4Extractor.readAtomPayload(androidx.media3.extractor.ExtractorInput, androidx.media3.extractor.PositionHolder):boolean");
    }

    private int readQuickTimeChapters(ExtractorInput extractorInput, PositionHolder positionHolder) {
        TrackSampleTable trackSampleTable = this.chapterSampleTables.get(this.chapterTrackIndex);
        int i2 = this.chapterSampleIndex;
        if (i2 < trackSampleTable.sampleCount) {
            long j2 = trackSampleTable.offsets[i2];
            if (extractorInput.getPosition() != j2) {
                positionHolder.position = j2;
                return 1;
            }
            int i3 = trackSampleTable.sizes[this.chapterSampleIndex];
            this.scratch.reset(i3);
            extractorInput.readFully(this.scratch.getData(), 0, i3);
            ParsableByteArray parsableByteArray = this.scratch;
            String string = this.scratch.readString(Math.min(parsableByteArray.readUnsignedShort(), parsableByteArray.bytesLeft()));
            long jUsToMs = Util.usToMs(trackSampleTable.timestampsUs[this.chapterSampleIndex]);
            int i4 = this.chapterSampleIndex + 1;
            long jUsToMs2 = i4 < trackSampleTable.sampleCount ? Util.usToMs(trackSampleTable.timestampsUs[i4]) : Util.usToMs(trackSampleTable.durationUs);
            List<Chapter> list = this.quickTimeChapters;
            Chapter.Builder builder = new Chapter.Builder();
            builder.setStartTimeMs(jUsToMs);
            builder.setEndTimeMs(jUsToMs2);
            builder.setTitle(new Label(null, string));
            list.add(builder.build());
            this.chapterSampleIndex++;
            return 0;
        }
        for (Mp4Track mp4Track : this.tracks) {
            if (mp4Track.track.chapterTrackId == trackSampleTable.track.id) {
                Format format = mp4Track.pendingFormat;
                an.B(format);
                Metadata metadata = format.metadata;
                ArrayList arrayList = new ArrayList();
                if (metadata != null) {
                    arrayList.addAll(metadata.getMatchingEntries(Metadata.Entry.class, new ab() { // from class: androidx.media3.extractor.mp4.Mp4Extractor$$ExternalSyntheticLambda0
                        @Override // com.google.d.b.ab
                        public final boolean apply(Object obj) {
                            return Mp4Extractor.lambda$readQuickTimeChapters$0((Metadata.Entry) obj);
                        }
                    }));
                }
                arrayList.addAll(this.quickTimeChapters);
                Format.Builder builderBuildUpon = format.buildUpon();
                builderBuildUpon.setMetadata(new Metadata(arrayList));
                Format formatBuild = builderBuildUpon.build();
                if (Objects.equals(formatBuild.sampleMimeType, MimeTypes.AUDIO_MPEG) || DtsUtil.isDtsBaseAudioMimeType(formatBuild.sampleMimeType)) {
                    mp4Track.pendingFormat = formatBuild;
                } else {
                    mp4Track.trackOutput.format(formatBuild);
                    mp4Track.pendingFormat = null;
                }
            }
        }
        this.chapterTrackIndex++;
        this.chapterSampleIndex = 0;
        this.quickTimeChapters.clear();
        if (this.chapterTrackIndex == this.chapterSampleTables.size()) {
            this.parserState = 2;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private int readSample(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException {
        ?? r1;
        int iNumberOfBytesInNalUnitHeader;
        long position = extractorInput.getPosition();
        int trackIndexOfNextReadSample = this.sampleTrackIndex;
        if (trackIndexOfNextReadSample == -1) {
            trackIndexOfNextReadSample = getTrackIndexOfNextReadSample(position);
            this.sampleTrackIndex = trackIndexOfNextReadSample;
            if (trackIndexOfNextReadSample == -1) {
                return -1;
            }
        }
        Mp4Track mp4Track = this.tracks[trackIndexOfNextReadSample];
        TrackOutput trackOutput = mp4Track.trackOutput;
        int i2 = mp4Track.sampleIndex;
        TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        long j2 = trackSampleTable.offsets[i2] + this.sampleOffsetForAuxiliaryTracks;
        int i3 = trackSampleTable.sizes[i2];
        TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.trueHdSampleRechunker;
        long j3 = (j2 - position) + this.sampleBytesRead;
        if (j3 < 0 || j3 >= RELOAD_MINIMUM_SEEK_DISTANCE) {
            positionHolder.position = j2;
            return 1;
        }
        if (mp4Track.track.sampleTransformation == 1) {
            j3 += 8;
            i3 -= 8;
        }
        extractorInput.skipFully((int) j3);
        if (!canReadWithinGopSampleDependencies(mp4Track.track.format)) {
            this.isSampleDependedOn = true;
        }
        if (mp4Track.track.nalUnitLengthFieldLength == 0) {
            Format formatBuild = mp4Track.pendingFormat;
            String str = mp4Track.track.format.sampleMimeType;
            if (MimeTypes.AUDIO_AC4.equals(str)) {
                if (this.sampleBytesWritten == 0) {
                    Ac4Util.getAc4SampleHeader(i3, this.scratch);
                    trackOutput.sampleData(this.scratch, 7);
                    this.sampleBytesWritten += 7;
                }
                i3 += 7;
            } else if (formatBuild != null && Objects.equals(str, MimeTypes.AUDIO_MPEG)) {
                this.scratch.reset(4);
                extractorInput.peekFully(this.scratch.getData(), 0, 4);
                extractorInput.resetPeekPosition();
                MpegAudioUtil.Header header = new MpegAudioUtil.Header();
                TrackOutput trackOutput2 = mp4Track.trackOutput;
                if (header.setForHeaderData(this.scratch.readInt()) && !Objects.equals(formatBuild.sampleMimeType, header.mimeType)) {
                    Format.Builder builderBuildUpon = formatBuild.buildUpon();
                    String str2 = header.mimeType;
                    an.B(str2);
                    builderBuildUpon.setSampleMimeType(str2);
                    formatBuild = builderBuildUpon.build();
                }
                trackOutput2.format(formatBuild);
                mp4Track.pendingFormat = null;
            } else if (formatBuild != null && DtsUtil.isDtsBaseAudioMimeType(mp4Track.track.format.sampleMimeType)) {
                mp4Track.trackOutput.format(DtsUtil.updateFormatWithDtsHdInfo(extractorInput, i3, formatBuild));
                mp4Track.pendingFormat = null;
            } else if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i4 = this.sampleBytesWritten;
                if (i4 >= i3) {
                    break;
                }
                int iSampleData = trackOutput.sampleData((DataReader) extractorInput, i3 - i4, false);
                this.sampleBytesRead += iSampleData;
                this.sampleBytesWritten += iSampleData;
                this.sampleCurrentNalBytesRemaining -= iSampleData;
            }
        } else {
            byte[] data = this.nalPrefix.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i5 = 4 - mp4Track.track.nalUnitLengthFieldLength;
            i3 += i5;
            while (this.sampleBytesWritten < i3) {
                int i6 = this.sampleCurrentNalBytesRemaining;
                if (i6 == 0) {
                    Track track = mp4Track.track;
                    int i7 = track.nalUnitLengthFieldLength;
                    if (this.isSampleDependedOn || NalUnitUtil.numberOfBytesInNalUnitHeader(track.format) + i7 > mp4Track.sampleTable.sizes[i2] - this.sampleBytesRead) {
                        iNumberOfBytesInNalUnitHeader = 0;
                    } else {
                        iNumberOfBytesInNalUnitHeader = NalUnitUtil.numberOfBytesInNalUnitHeader(mp4Track.track.format);
                        i7 = mp4Track.track.nalUnitLengthFieldLength + iNumberOfBytesInNalUnitHeader;
                    }
                    extractorInput.readFully(data, i5, i7);
                    this.sampleBytesRead += i7;
                    this.nalPrefix.setPosition(0);
                    int i8 = this.nalPrefix.readInt();
                    if (i8 < 0) {
                        throw ParserException.createForMalformedContainer("Invalid NAL length", null);
                    }
                    this.sampleCurrentNalBytesRemaining = i8 - iNumberOfBytesInNalUnitHeader;
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                    if (iNumberOfBytesInNalUnitHeader > 0) {
                        trackOutput.sampleData(this.nalPrefix, iNumberOfBytesInNalUnitHeader);
                        this.sampleBytesWritten += iNumberOfBytesInNalUnitHeader;
                        if (NalUnitUtil.isDependedOn(data, 4, iNumberOfBytesInNalUnitHeader, mp4Track.track.format)) {
                            this.isSampleDependedOn = true;
                        }
                    }
                } else {
                    int iSampleData2 = trackOutput.sampleData((DataReader) extractorInput, i6, false);
                    this.sampleBytesRead += iSampleData2;
                    this.sampleBytesWritten += iSampleData2;
                    this.sampleCurrentNalBytesRemaining -= iSampleData2;
                }
            }
        }
        int i9 = i3;
        TrackSampleTable trackSampleTable2 = mp4Track.sampleTable;
        long j4 = trackSampleTable2.timestampsUs[i2];
        int i10 = trackSampleTable2.flags[i2];
        if (!this.isSampleDependedOn) {
            i10 |= 67108864;
        }
        int i11 = i10;
        if (trueHdSampleRechunker != null) {
            boolean z = false;
            trueHdSampleRechunker.sampleMetadata(trackOutput, j4, i11, i9, 0, null);
            r1 = z;
            if (i2 + 1 == mp4Track.sampleTable.sampleCount) {
                trueHdSampleRechunker.outputPendingSampleMetadata(trackOutput, null);
                r1 = z;
            }
        } else {
            r1 = 0;
            trackOutput.sampleMetadata(j4, i11, i9, 0, null);
        }
        mp4Track.sampleIndex++;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = r1;
        this.sampleBytesWritten = r1;
        this.sampleCurrentNalBytesRemaining = r1;
        this.isSampleDependedOn = r1;
        return r1;
    }

    private int readSefData(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException {
        this.sefReader.read(extractorInput, positionHolder, this.slowMotionMetadataEntries);
        if (positionHolder.position == 0) {
            enterReadingAtomHeaderState();
        }
        return 1;
    }

    private static boolean shouldParseContainerAtom(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1701082227 || i2 == 1835365473 || i2 == 1635284069 || i2 == 1953654118;
    }

    private static boolean shouldParseLeafAtom(int i2) {
        return i2 == 1835296868 || i2 == 1836476516 || i2 == 1751411826 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1937011571 || i2 == 1668576371 || i2 == 1701606260 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1953196132 || i2 == 1718909296 || i2 == 1969517665 || i2 == 1801812339 || i2 == 1768715124 || i2 == 1667785072;
    }

    private boolean shouldSeekToAxteAtom(Metadata metadata) {
        MdtaMetadataEntry mdtaMetadataEntry;
        if (metadata == null || (this.flags & 64) == 0 || (mdtaMetadataEntry = (MdtaMetadataEntry) metadata.getFirstMatchingEntry(MdtaMetadataEntry.class, new ab() { // from class: androidx.media3.extractor.mp4.Mp4Extractor$$ExternalSyntheticLambda4
            @Override // com.google.d.b.ab
            public final boolean apply(Object obj) {
                return ((MdtaMetadataEntry) obj).key.equals(MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_OFFSET);
            }
        })) == null) {
            return false;
        }
        long unsignedLongToLong = new ParsableByteArray(mdtaMetadataEntry.value).readUnsignedLongToLong();
        if (unsignedLongToLong <= 0) {
            return false;
        }
        this.axteAtomOffset = unsignedLongToLong;
        return true;
    }

    private void updateSampleIndex(Mp4Track mp4Track, long j2) {
        TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j2);
        if (indexOfEarlierOrEqualSynchronizationSample == -1) {
            indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j2);
        }
        mp4Track.sampleIndex = indexOfEarlierOrEqualSynchronizationSample;
    }

    public long[] getSampleTimestampsUs(int i2) {
        Mp4Track[] mp4TrackArr = this.tracks;
        return mp4TrackArr.length <= i2 ? new long[0] : mp4TrackArr[i2].sampleTable.timestampsUs;
    }

    @Override // androidx.media3.extractor.Extractor
    public /* synthetic */ Extractor getUnderlyingImplementation() {
        return this;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        if ((this.flags & 16) == 0) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException {
        if (this.omitTrackSampleTable && this.moovAtomProcessed) {
            return -1;
        }
        while (true) {
            int i2 = this.parserState;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return readSample(extractorInput, positionHolder);
                    }
                    if (i2 == 3) {
                        readSefData(extractorInput, positionHolder);
                        return 1;
                    }
                    if (i2 == 4) {
                        return readQuickTimeChapters(extractorInput, positionHolder);
                    }
                    throw new IllegalStateException();
                }
                if (readAtomPayload(extractorInput, positionHolder)) {
                    return 1;
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j2, long j3) {
        this.containerAtoms.clear();
        this.atomHeaderBytesRead = 0;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.isSampleDependedOn = false;
        this.moovAtomProcessed = false;
        this.chapterTrackIndex = 0;
        this.chapterSampleIndex = 0;
        this.chapterSampleTables.clear();
        this.quickTimeChapters.clear();
        if (j2 == 0) {
            if (this.parserState != 3) {
                enterReadingAtomHeaderState();
                return;
            } else {
                this.sefReader.reset();
                this.slowMotionMetadataEntries.clear();
                return;
            }
        }
        for (Mp4Track mp4Track : this.tracks) {
            updateSampleIndex(mp4Track, j3);
            TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        SniffFailure sniffFailureSniffUnfragmented = Sniffer.sniffUnfragmented(extractorInput);
        this.lastSniffFailures = sniffFailureSniffUnfragmented != null ? bn.q(sniffFailureSniffUnfragmented) : bn.p();
        return sniffFailureSniffUnfragmented == null;
    }

    /* compiled from: WazeSource */
    final class Mp4SeekMap implements TrackAwareSeekMap {
        private final long durationUs;
        private final int firstVideoTrackIndex;
        private final Mp4Track[] tracks;

        public Mp4SeekMap(long j2, Mp4Track[] mp4TrackArr, int i2) {
            this.durationUs = j2;
            this.tracks = mp4TrackArr;
            this.firstVideoTrackIndex = i2;
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
        @Override // androidx.media3.extractor.TrackAwareSeekMap
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long r19, int r21) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                androidx.media3.extractor.mp4.Mp4Extractor$Mp4Track[] r3 = r0.tracks
                int r4 = r3.length
                if (r4 != 0) goto L11
                androidx.media3.extractor.SeekMap$SeekPoints r0 = new androidx.media3.extractor.SeekMap$SeekPoints
                androidx.media3.extractor.SeekPoint r1 = androidx.media3.extractor.SeekPoint.START
                r0.<init>(r1)
                return r0
            L11:
                r4 = -1
                r5 = r21
                if (r5 == r4) goto L18
                r6 = r5
                goto L1b
            L18:
                int r5 = r0.firstVideoTrackIndex
                r6 = r4
            L1b:
                r7 = -1
                r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                if (r5 == r4) goto L5d
                r3 = r3[r5]
                androidx.media3.extractor.mp4.TrackSampleTable r3 = r3.sampleTable
                int r5 = androidx.media3.extractor.mp4.Mp4Extractor.m13148$$Nest$smgetSynchronizationSampleIndex(r3, r1)
                if (r5 != r4) goto L36
                androidx.media3.extractor.SeekMap$SeekPoints r0 = new androidx.media3.extractor.SeekMap$SeekPoints
                androidx.media3.extractor.SeekPoint r1 = androidx.media3.extractor.SeekPoint.START
                r0.<init>(r1)
                return r0
            L36:
                long[] r11 = r3.timestampsUs
                r12 = r11[r5]
                long[] r11 = r3.offsets
                r14 = r11[r5]
                int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
                if (r11 >= 0) goto L63
                int r11 = r3.sampleCount
                int r11 = r11 + r4
                if (r5 >= r11) goto L63
                int r1 = r3.getIndexOfLaterOrEqualSynchronizationSample(r1)
                if (r1 == r4) goto L63
                if (r1 == r5) goto L63
                long[] r2 = r3.timestampsUs
                r7 = r2[r1]
                long[] r2 = r3.offsets
                r1 = r2[r1]
                r16 = r7
                r7 = r1
                r1 = r16
                goto L64
            L5d:
                r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = r1
            L63:
                r1 = r9
            L64:
                if (r6 != r4) goto L83
                r3 = 0
            L67:
                androidx.media3.extractor.mp4.Mp4Extractor$Mp4Track[] r4 = r0.tracks
                int r5 = r4.length
                if (r3 >= r5) goto L83
                int r5 = r0.firstVideoTrackIndex
                if (r3 == r5) goto L80
                r4 = r4[r3]
                androidx.media3.extractor.mp4.TrackSampleTable r4 = r4.sampleTable
                long r14 = androidx.media3.extractor.mp4.Mp4Extractor.m13149$$Nest$smmaybeAdjustSeekOffset(r4, r12, r14)
                int r5 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
                if (r5 == 0) goto L80
                long r7 = androidx.media3.extractor.mp4.Mp4Extractor.m13149$$Nest$smmaybeAdjustSeekOffset(r4, r1, r7)
            L80:
                int r3 = r3 + 1
                goto L67
            L83:
                androidx.media3.extractor.SeekPoint r0 = new androidx.media3.extractor.SeekPoint
                r0.<init>(r12, r14)
                int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
                if (r3 != 0) goto L92
                androidx.media3.extractor.SeekMap$SeekPoints r1 = new androidx.media3.extractor.SeekMap$SeekPoints
                r1.<init>(r0)
                return r1
            L92:
                androidx.media3.extractor.SeekPoint r3 = new androidx.media3.extractor.SeekPoint
                r3.<init>(r1, r7)
                androidx.media3.extractor.SeekMap$SeekPoints r1 = new androidx.media3.extractor.SeekMap$SeekPoints
                r1.<init>(r0, r3)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.Mp4Extractor.Mp4SeekMap.getSeekPoints(long, int):androidx.media3.extractor.SeekMap$SeekPoints");
        }

        @Override // androidx.media3.extractor.SeekMap
        public /* synthetic */ boolean isEstimated() {
            return false;
        }

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        @Override // androidx.media3.extractor.TrackAwareSeekMap
        public boolean isSeekable(int i2) {
            return true;
        }

        @Override // androidx.media3.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j2) {
            return getSeekPoints(j2, -1);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public bn<SniffFailure> getSniffFailureDetails() {
        return this.lastSniffFailures;
    }

    @Deprecated
    public Mp4Extractor(int i2) {
        this(SubtitleParser.Factory.UNSUPPORTED, i2);
    }

    public Mp4Extractor(SubtitleParser.Factory factory) {
        this(factory, 0);
    }

    @Deprecated
    public Mp4Extractor() {
        this(SubtitleParser.Factory.UNSUPPORTED, 16);
    }
}
