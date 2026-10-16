package androidx.media3.extractor.mp4;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.collection.SieveCacheKt;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.container.Mp4Box;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.container.ReorderingBufferQueue;
import androidx.media3.extractor.CeaUtil;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.SniffFailure;
import androidx.media3.extractor.TrackAwareSeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.metadata.emsg.EventMessageEncoder;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import com.google.d.b.an;
import com.google.d.b.t;
import com.google.d.d.bn;
import com.google.d.l.d;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class FragmentedMp4Extractor implements Extractor {
    private static final Format EMSG_FORMAT;
    private static final int EXTRA_TRACKS_BASE_ID = 100;
    public static final int FLAG_DISABLE_ARTWORK_METADATA = 1024;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 32;
    public static final int FLAG_ENABLE_EMSG_TRACK = 4;
    public static final int FLAG_MERGE_FRAGMENTED_SIDX = 256;
    public static final int FLAG_READ_MFRA_FOR_SEEK_MAP = 512;
    public static final int FLAG_READ_WITHIN_GOP_SAMPLE_DEPENDENCIES = 64;
    public static final int FLAG_READ_WITHIN_GOP_SAMPLE_DEPENDENCIES_H265 = 128;
    public static final int FLAG_WORKAROUND_EVERY_VIDEO_FRAME_IS_SYNC_FRAME = 1;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 16;
    public static final int FLAG_WORKAROUND_IGNORE_TFDT_BOX = 2;
    private static final int MFRO_FIXED_BOX_SIZE = 16;
    private static final int SAMPLE_GROUP_TYPE_seig = 1936025959;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_ENCRYPTION_DATA = 2;
    private static final int STATE_READING_MFRA = 6;
    private static final int STATE_READING_MFRO = 5;
    private static final int STATE_READING_SAMPLE_CONTINUE = 4;
    private static final int STATE_READING_SAMPLE_START = 3;
    private static final String TAG = "FragmentedMp4Extractor";
    private final TrackOutput additionalEmsgTrackOutput;
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private TrackOutput[] ceaTrackOutputs;
    private final ChunkIndexMerger chunkIndexMerger;
    private final List<Format> closedCaptionFormats;
    private final ArrayDeque<Mp4Box.ContainerBox> containerAtoms;
    private TrackBundle currentTrackBundle;
    private long durationUs;
    private TrackOutput[] emsgTrackOutputs;
    private long endOfMdatPosition;
    private final EventMessageEncoder eventMessageEncoder;
    private ExtractorOutput extractorOutput;
    private final int flags;
    private boolean haveOutputSeekMap;
    private boolean isSampleDependedOn;
    private bn<SniffFailure> lastSniffFailures;
    private final ParsableByteArray nalPrefix;
    private final ParsableByteArray nalStartCode;
    private final ParsableByteArray nalUnitWithoutHeaderBuffer;
    private int parserState;
    private int pendingMetadataSampleBytes;
    private final ArrayDeque<MetadataSampleInfo> pendingMetadataSampleInfos;
    private long pendingSeekTimeUs;
    private boolean processSeiNalUnitPayload;
    private final ReorderingBufferQueue reorderingBufferQueue;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleSize;
    private final ParsableByteArray scratch;
    private final byte[] scratchBytes;
    private long seekPositionBeforeMfraProcessing;
    private long seekPositionBeforeSidxProcessing;
    private long segmentIndexEarliestPresentationTimeUs;
    private final Track sideloadedTrack;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final TimestampAdjuster timestampAdjuster;
    private final SparseArray<TrackBundle> trackBundles;
    private boolean upfrontSidxScanComplete;

    @Deprecated
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.mp4.FragmentedMp4Extractor$$ExternalSyntheticLambda1
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return FragmentedMp4Extractor.lambda$static$0();
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
    private static final byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE = {-94, 57, 79, 82, 90, -101, 79, StylePropertiesKt.MaxHeightId, -94, 68, 108, 66, 124, 100, -115, -12};

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* compiled from: WazeSource */
    final class MetadataSampleInfo {
        public final boolean sampleTimeIsRelative;
        public final long sampleTimeUs;
        public final int size;

        public MetadataSampleInfo(long j2, boolean z, int i2) {
            this.sampleTimeUs = j2;
            this.sampleTimeIsRelative = z;
            this.size = i2;
        }
    }

    /* compiled from: WazeSource */
    final class TrackBundle {
        private static final int SINGLE_SUBSAMPLE_ENCRYPTION_DATA_LENGTH = 8;
        private Format baseFormat;
        public int currentSampleInTrackRun;
        public int currentSampleIndex;
        public int currentTrackRunIndex;
        private boolean currentlyInFragment;
        public DefaultSampleValues defaultSampleValues;
        public int firstSampleToOutputIndex;
        public TrackSampleTable moovSampleTable;
        public final TrackOutput output;
        private Format pendingFormat;
        public final TrackFragment fragment = new TrackFragment();
        public final ParsableByteArray scratch = new ParsableByteArray();
        private final ParsableByteArray encryptionSignalByte = new ParsableByteArray(1);
        private final ParsableByteArray defaultInitializationVector = new ParsableByteArray();

        public TrackBundle(TrackOutput trackOutput, TrackSampleTable trackSampleTable, DefaultSampleValues defaultSampleValues, Format format) {
            this.output = trackOutput;
            this.moovSampleTable = trackSampleTable;
            this.defaultSampleValues = defaultSampleValues;
            this.baseFormat = format;
            if (DtsUtil.isDtsBaseAudioMimeType(format.sampleMimeType)) {
                this.pendingFormat = format;
            }
            reset(trackSampleTable, defaultSampleValues);
        }

        public int getCurrentSampleFlags() {
            int i2 = !this.currentlyInFragment ? this.moovSampleTable.flags[this.currentSampleIndex] : this.fragment.sampleIsSyncFrameTable[this.currentSampleIndex] ? 1 : 0;
            return getEncryptionBoxIfEncrypted() != null ? 1073741824 | i2 : i2;
        }

        public long getCurrentSampleOffset() {
            return !this.currentlyInFragment ? this.moovSampleTable.offsets[this.currentSampleIndex] : this.fragment.trunDataPosition[this.currentTrackRunIndex];
        }

        public long getCurrentSamplePresentationTimeUs() {
            return !this.currentlyInFragment ? this.moovSampleTable.timestampsUs[this.currentSampleIndex] : this.fragment.getSamplePresentationTimeUs(this.currentSampleIndex);
        }

        public int getCurrentSampleSize() {
            return !this.currentlyInFragment ? this.moovSampleTable.sizes[this.currentSampleIndex] : this.fragment.sampleSizeTable[this.currentSampleIndex];
        }

        public TrackEncryptionBox getEncryptionBoxIfEncrypted() {
            if (!this.currentlyInFragment) {
                return null;
            }
            DefaultSampleValues defaultSampleValues = this.fragment.header;
            int i2 = Util.SDK_INT;
            int i3 = defaultSampleValues.sampleDescriptionIndex;
            TrackEncryptionBox sampleDescriptionEncryptionBox = this.fragment.trackEncryptionBox;
            if (sampleDescriptionEncryptionBox == null) {
                sampleDescriptionEncryptionBox = this.moovSampleTable.track.getSampleDescriptionEncryptionBox(i3);
            }
            if (sampleDescriptionEncryptionBox == null || !sampleDescriptionEncryptionBox.isEncrypted) {
                return null;
            }
            return sampleDescriptionEncryptionBox;
        }

        public boolean next() {
            this.currentSampleIndex++;
            if (!this.currentlyInFragment) {
                return false;
            }
            int i2 = this.currentSampleInTrackRun + 1;
            this.currentSampleInTrackRun = i2;
            int[] iArr = this.fragment.trunLength;
            int i3 = this.currentTrackRunIndex;
            if (i2 != iArr[i3]) {
                return true;
            }
            this.currentTrackRunIndex = i3 + 1;
            this.currentSampleInTrackRun = 0;
            return false;
        }

        public int outputSampleEncryptionData(int i2, int i3) {
            ParsableByteArray parsableByteArray;
            boolean z;
            TrackEncryptionBox encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return 0;
            }
            int i4 = encryptionBoxIfEncrypted.perSampleIvSize;
            if (i4 != 0) {
                parsableByteArray = this.fragment.sampleEncryptionData;
            } else {
                byte[] bArr = encryptionBoxIfEncrypted.defaultInitializationVector;
                int i5 = Util.SDK_INT;
                ParsableByteArray parsableByteArray2 = this.defaultInitializationVector;
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                parsableByteArray2.reset(bArr2, length);
                parsableByteArray = this.defaultInitializationVector;
                i4 = length;
            }
            boolean zSampleHasSubsampleEncryptionTable = this.fragment.sampleHasSubsampleEncryptionTable(this.currentSampleIndex);
            if (zSampleHasSubsampleEncryptionTable || i3 != 0) {
                z = true;
            } else {
                i3 = 0;
                z = false;
            }
            this.encryptionSignalByte.getData()[0] = (byte) ((true != z ? 0 : 128) | i4);
            this.encryptionSignalByte.setPosition(0);
            this.output.sampleData(this.encryptionSignalByte, 1, 1);
            this.output.sampleData(parsableByteArray, i4, 1);
            if (!z) {
                return i4 + 1;
            }
            if (!zSampleHasSubsampleEncryptionTable) {
                this.scratch.reset(8);
                byte[] data = this.scratch.getData();
                data[0] = 0;
                data[1] = 1;
                data[2] = (byte) ((i3 >> 8) & 255);
                data[3] = (byte) (i3 & 255);
                data[4] = (byte) ((i2 >> 24) & 255);
                data[5] = (byte) ((i2 >> 16) & 255);
                data[6] = (byte) ((i2 >> 8) & 255);
                data[7] = (byte) (i2 & 255);
                this.output.sampleData(this.scratch, 8, 1);
                return i4 + 9;
            }
            int i6 = i4 + 1;
            ParsableByteArray parsableByteArray3 = this.fragment.sampleEncryptionData;
            int unsignedShort = parsableByteArray3.readUnsignedShort();
            parsableByteArray3.skipBytes(-2);
            int i7 = (unsignedShort * 6) + 2;
            if (i3 != 0) {
                this.scratch.reset(i7);
                byte[] data2 = this.scratch.getData();
                parsableByteArray3.readBytes(data2, 0, i7);
                int i8 = (((data2[2] & 255) << 8) | (data2[3] & 255)) + i3;
                data2[2] = (byte) ((i8 >> 8) & 255);
                data2[3] = (byte) (i8 & 255);
                parsableByteArray3 = this.scratch;
            }
            this.output.sampleData(parsableByteArray3, i7, 1);
            return i6 + i7;
        }

        public void reset(TrackSampleTable trackSampleTable, DefaultSampleValues defaultSampleValues) {
            this.moovSampleTable = trackSampleTable;
            this.defaultSampleValues = defaultSampleValues;
            if (this.pendingFormat == null) {
                this.output.format(this.baseFormat);
            }
            resetFragmentInfo();
        }

        public void resetFragmentInfo() {
            this.fragment.reset();
            this.currentSampleIndex = 0;
            this.currentTrackRunIndex = 0;
            this.currentSampleInTrackRun = 0;
            this.firstSampleToOutputIndex = 0;
            this.currentlyInFragment = false;
        }

        public void seek(long j2) {
            int i2 = this.currentSampleIndex;
            while (true) {
                TrackFragment trackFragment = this.fragment;
                if (i2 >= trackFragment.sampleCount || trackFragment.getSamplePresentationTimeUs(i2) > j2) {
                    return;
                }
                if (this.fragment.sampleIsSyncFrameTable[i2]) {
                    this.firstSampleToOutputIndex = i2;
                }
                i2++;
            }
        }

        public void skipSampleEncryptionData() {
            TrackEncryptionBox encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return;
            }
            TrackFragment trackFragment = this.fragment;
            int i2 = encryptionBoxIfEncrypted.perSampleIvSize;
            ParsableByteArray parsableByteArray = trackFragment.sampleEncryptionData;
            if (i2 != 0) {
                parsableByteArray.skipBytes(i2);
            }
            if (this.fragment.sampleHasSubsampleEncryptionTable(this.currentSampleIndex)) {
                parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort() * 6);
            }
        }

        public void updateDrmInitData(DrmInitData drmInitData) {
            Track track = this.moovSampleTable.track;
            DefaultSampleValues defaultSampleValues = this.fragment.header;
            int i2 = Util.SDK_INT;
            TrackEncryptionBox sampleDescriptionEncryptionBox = track.getSampleDescriptionEncryptionBox(defaultSampleValues.sampleDescriptionIndex);
            DrmInitData drmInitDataCopyWithSchemeType = drmInitData.copyWithSchemeType(sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null);
            Format.Builder builderBuildUpon = this.baseFormat.buildUpon();
            builderBuildUpon.setDrmInitData(drmInitDataCopyWithSchemeType);
            Format formatBuild = builderBuildUpon.build();
            if (this.pendingFormat != null) {
                this.pendingFormat = formatBuild;
            } else {
                this.output.format(formatBuild);
            }
        }
    }

    static {
        Format.Builder builder = new Format.Builder();
        builder.setSampleMimeType(MimeTypes.APPLICATION_EMSG);
        EMSG_FORMAT = builder.build();
    }

    public FragmentedMp4Extractor(SubtitleParser.Factory factory, int i2, TimestampAdjuster timestampAdjuster, Track track, List<Format> list, TrackOutput trackOutput) {
        this.subtitleParserFactory = factory;
        this.flags = i2;
        this.timestampAdjuster = timestampAdjuster;
        this.sideloadedTrack = track;
        this.closedCaptionFormats = DesugarCollections.unmodifiableList(list);
        this.additionalEmsgTrackOutput = trackOutput;
        this.eventMessageEncoder = new EventMessageEncoder();
        this.atomHeader = new ParsableByteArray(16);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalPrefix = new ParsableByteArray(6);
        this.nalUnitWithoutHeaderBuffer = new ParsableByteArray();
        byte[] bArr = new byte[16];
        this.scratchBytes = bArr;
        this.scratch = new ParsableByteArray(bArr);
        this.containerAtoms = new ArrayDeque<>();
        this.pendingMetadataSampleInfos = new ArrayDeque<>();
        this.trackBundles = new SparseArray<>();
        this.lastSniffFailures = bn.p();
        this.durationUs = C.TIME_UNSET;
        this.pendingSeekTimeUs = C.TIME_UNSET;
        this.segmentIndexEarliestPresentationTimeUs = C.TIME_UNSET;
        this.extractorOutput = ExtractorOutput.PLACEHOLDER;
        this.emsgTrackOutputs = new TrackOutput[0];
        this.ceaTrackOutputs = new TrackOutput[0];
        this.reorderingBufferQueue = new ReorderingBufferQueue(new ReorderingBufferQueue.OutputConsumer() { // from class: androidx.media3.extractor.mp4.FragmentedMp4Extractor$$ExternalSyntheticLambda3
            @Override // androidx.media3.container.ReorderingBufferQueue.OutputConsumer
            public final void consume(long j2, ParsableByteArray parsableByteArray) {
                this.f$0.lambda$new$0(j2, parsableByteArray);
            }
        });
        this.chunkIndexMerger = new ChunkIndexMerger();
        this.seekPositionBeforeSidxProcessing = -1L;
        this.seekPositionBeforeMfraProcessing = -1L;
    }

    private boolean canReadWithinGopSampleDependencies(Format format) {
        int i2;
        if (!Objects.equals(format.sampleMimeType, "video/avc")) {
            i2 = Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_H265) ? 128 : 64;
        }
        return (this.flags & i2) != 0;
    }

    private static int checkNonNegative(int i2) throws ParserException {
        if (i2 >= 0) {
            return i2;
        }
        throw ParserException.createForMalformedContainer("Unexpected negative value: " + i2, null);
    }

    public static int codecsToParseWithinGopSampleDependenciesAsFlags(int i2) {
        int i3 = 1 != (i2 & 1) ? 0 : 64;
        return (i2 & 2) != 0 ? i3 | 128 : i3;
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private DefaultSampleValues getDefaultSampleValues(SparseArray<DefaultSampleValues> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        DefaultSampleValues defaultSampleValues = sparseArray.get(i2);
        an.B(defaultSampleValues);
        return defaultSampleValues;
    }

    private static DrmInitData getDrmInitDataFromAtoms(List<Mp4Box.LeafBox> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            Mp4Box.LeafBox leafBox = list.get(i2);
            if (leafBox.type == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] data = leafBox.data.getData();
                UUID uuid = PsshAtomUtil.parseUuid(data);
                if (uuid == null) {
                    Log.w(TAG, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuid, MimeTypes.VIDEO_MP4, data));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private static TrackBundle getNextTrackBundle(SparseArray<TrackBundle> sparseArray) {
        int size = sparseArray.size();
        long j2 = Long.MAX_VALUE;
        TrackBundle trackBundle = null;
        for (int i2 = 0; i2 < size; i2++) {
            TrackBundle trackBundleValueAt = sparseArray.valueAt(i2);
            if ((trackBundleValueAt.currentlyInFragment || trackBundleValueAt.currentSampleIndex != trackBundleValueAt.moovSampleTable.sampleCount) && (!trackBundleValueAt.currentlyInFragment || trackBundleValueAt.currentTrackRunIndex != trackBundleValueAt.fragment.trunCount)) {
                long currentSampleOffset = trackBundleValueAt.getCurrentSampleOffset();
                if (currentSampleOffset < j2) {
                    trackBundle = trackBundleValueAt;
                    j2 = currentSampleOffset;
                }
            }
        }
        return trackBundle;
    }

    private void initExtraTracks() {
        int i2;
        TrackOutput[] trackOutputArr = new TrackOutput[2];
        this.emsgTrackOutputs = trackOutputArr;
        TrackOutput trackOutput = this.additionalEmsgTrackOutput;
        int i3 = 0;
        if (trackOutput != null) {
            trackOutputArr[0] = trackOutput;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = 100;
        if ((this.flags & 4) != 0) {
            trackOutputArr[i2] = this.extractorOutput.track(100, 5);
            i4 = 101;
            i2++;
        }
        TrackOutput[] trackOutputArr2 = (TrackOutput[]) Util.nullSafeArrayCopy(this.emsgTrackOutputs, i2);
        this.emsgTrackOutputs = trackOutputArr2;
        for (TrackOutput trackOutput2 : trackOutputArr2) {
            trackOutput2.format(EMSG_FORMAT);
        }
        this.ceaTrackOutputs = new TrackOutput[this.closedCaptionFormats.size()];
        while (i3 < this.ceaTrackOutputs.length) {
            TrackOutput trackOutputTrack = this.extractorOutput.track(i4, 3);
            trackOutputTrack.format(this.closedCaptionFormats.get(i3));
            this.ceaTrackOutputs[i3] = trackOutputTrack;
            i3++;
            i4++;
        }
    }

    private static boolean isEdtsListDurationForEntireMediaTimeline(Track track) {
        d dVar = track.editListDurations;
        return dVar != null && dVar.a() == 1 && track.editListMediaTimes != null && (dVar.b(0) == 0 || Util.scaleLargeTimestamp(track.editListDurations.b(0), 1000000L, track.movieTimescale) + Util.scaleLargeTimestamp(track.editListMediaTimes.b(0), 1000000L, track.timescale) >= track.durationUs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(long j2, ParsableByteArray parsableByteArray) {
        CeaUtil.consume(j2, parsableByteArray, this.ceaTrackOutputs);
    }

    static /* synthetic */ Extractor[] lambda$newFactory$0(SubtitleParser.Factory factory) {
        return new Extractor[]{new FragmentedMp4Extractor(factory)};
    }

    static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new FragmentedMp4Extractor(SubtitleParser.Factory.UNSUPPORTED, 32)};
    }

    private void maybeSkipRemainingMetaAtomHeaderBytes(ExtractorInput extractorInput) {
        this.scratch.reset(8);
        extractorInput.peekFully(this.scratch.getData(), 0, 8);
        BoxParser.maybeSkipRemainingMetaBoxHeaderBytes(this.scratch);
        extractorInput.skipFully(this.scratch.getPosition());
        extractorInput.resetPeekPosition();
    }

    public static ExtractorsFactory newFactory(final SubtitleParser.Factory factory) {
        return new ExtractorsFactory() { // from class: androidx.media3.extractor.mp4.FragmentedMp4Extractor$$ExternalSyntheticLambda2
            @Override // androidx.media3.extractor.ExtractorsFactory
            public final Extractor[] createExtractors() {
                return FragmentedMp4Extractor.lambda$newFactory$0(factory);
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

    private void onContainerAtomRead(Mp4Box.ContainerBox containerBox) throws ParserException, NumberFormatException {
        int i2 = containerBox.type;
        if (i2 == 1836019574) {
            onMoovContainerAtomRead(containerBox);
        } else if (i2 == 1836019558) {
            onMoofContainerAtomRead(containerBox);
        } else {
            if (this.containerAtoms.isEmpty()) {
                return;
            }
            this.containerAtoms.peek().add(containerBox);
        }
    }

    private void onEmsgLeafAtomRead(ParsableByteArray parsableByteArray) {
        String nullTerminatedString;
        String nullTerminatedString2;
        long jScaleLargeTimestamp;
        long jScaleLargeTimestamp2;
        long unsignedInt;
        long jAdjustSampleTimestamp;
        if (this.emsgTrackOutputs.length == 0) {
            return;
        }
        parsableByteArray.setPosition(8);
        int fullBoxVersion = BoxParser.parseFullBoxVersion(parsableByteArray.readInt());
        if (fullBoxVersion == 0) {
            nullTerminatedString = parsableByteArray.readNullTerminatedString();
            an.B(nullTerminatedString);
            nullTerminatedString2 = parsableByteArray.readNullTerminatedString();
            an.B(nullTerminatedString2);
            long unsignedInt2 = parsableByteArray.readUnsignedInt();
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000000L, unsignedInt2);
            long j2 = this.segmentIndexEarliestPresentationTimeUs;
            long j3 = j2 != C.TIME_UNSET ? j2 + jScaleLargeTimestamp : -9223372036854775807L;
            jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, unsignedInt2);
            unsignedInt = parsableByteArray.readUnsignedInt();
            jAdjustSampleTimestamp = j3;
        } else {
            if (fullBoxVersion != 1) {
                Log.w(TAG, "Skipping unsupported emsg version: " + fullBoxVersion);
                return;
            }
            long unsignedInt3 = parsableByteArray.readUnsignedInt();
            jAdjustSampleTimestamp = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedLongToLong(), 1000000L, unsignedInt3);
            long jScaleLargeTimestamp3 = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, unsignedInt3);
            long unsignedInt4 = parsableByteArray.readUnsignedInt();
            nullTerminatedString = parsableByteArray.readNullTerminatedString();
            an.B(nullTerminatedString);
            nullTerminatedString2 = parsableByteArray.readNullTerminatedString();
            an.B(nullTerminatedString2);
            jScaleLargeTimestamp2 = jScaleLargeTimestamp3;
            unsignedInt = unsignedInt4;
            jScaleLargeTimestamp = -9223372036854775807L;
        }
        String str = nullTerminatedString;
        String str2 = nullTerminatedString2;
        byte[] bArr = new byte[parsableByteArray.bytesLeft()];
        parsableByteArray.readBytes(bArr, 0, parsableByteArray.bytesLeft());
        ParsableByteArray parsableByteArray2 = new ParsableByteArray(this.eventMessageEncoder.encode(new EventMessage(str, str2, jScaleLargeTimestamp2, unsignedInt, bArr)));
        int iBytesLeft = parsableByteArray2.bytesLeft();
        for (TrackOutput trackOutput : this.emsgTrackOutputs) {
            parsableByteArray2.setPosition(0);
            trackOutput.sampleData(parsableByteArray2, iBytesLeft);
        }
        ArrayDeque<MetadataSampleInfo> arrayDeque = this.pendingMetadataSampleInfos;
        if (jAdjustSampleTimestamp == C.TIME_UNSET) {
            arrayDeque.addLast(new MetadataSampleInfo(jScaleLargeTimestamp, true, iBytesLeft));
            this.pendingMetadataSampleBytes += iBytesLeft;
            return;
        }
        if (!arrayDeque.isEmpty()) {
            this.pendingMetadataSampleInfos.addLast(new MetadataSampleInfo(jAdjustSampleTimestamp, false, iBytesLeft));
            this.pendingMetadataSampleBytes += iBytesLeft;
            return;
        }
        TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster != null && !timestampAdjuster.isInitialized()) {
            this.pendingMetadataSampleInfos.addLast(new MetadataSampleInfo(jAdjustSampleTimestamp, false, iBytesLeft));
            this.pendingMetadataSampleBytes += iBytesLeft;
            return;
        }
        if (timestampAdjuster != null) {
            jAdjustSampleTimestamp = timestampAdjuster.adjustSampleTimestamp(jAdjustSampleTimestamp);
        }
        long j4 = jAdjustSampleTimestamp;
        for (TrackOutput trackOutput2 : this.emsgTrackOutputs) {
            trackOutput2.sampleMetadata(j4, 1, iBytesLeft, 0, null);
        }
    }

    private void onLeafAtomRead(Mp4Box.LeafBox leafBox, ExtractorInput extractorInput) throws ParserException {
        if (!this.containerAtoms.isEmpty()) {
            this.containerAtoms.peek().add(leafBox);
            return;
        }
        int i2 = leafBox.type;
        if (i2 != 1936286840) {
            if (i2 == 1701671783) {
                onEmsgLeafAtomRead(leafBox.data);
                return;
            }
            return;
        }
        Pair<Long, ChunkIndex> sidx = parseSidx(leafBox.data, extractorInput.getPosition());
        this.chunkIndexMerger.add((ChunkIndex) sidx.second);
        this.segmentIndexEarliestPresentationTimeUs = ((Long) sidx.first).longValue();
        if (!this.upfrontSidxScanComplete) {
            this.extractorOutput.seekMap(this.chunkIndexMerger.size() == 1 ? (SeekMap) sidx.second : this.chunkIndexMerger.merge());
            this.haveOutputSeekMap = true;
        }
        if ((this.flags & 256) == 0 || this.upfrontSidxScanComplete || this.chunkIndexMerger.size() <= 1) {
            return;
        }
        this.seekPositionBeforeSidxProcessing = extractorInput.getPosition();
    }

    private void onMfraProcessingFinished(SeekMap seekMap, PositionHolder positionHolder) {
        this.extractorOutput.seekMap(seekMap);
        this.haveOutputSeekMap = true;
        positionHolder.position = this.seekPositionBeforeMfraProcessing;
        enterReadingAtomHeaderState();
    }

    private void onMoofContainerAtomRead(Mp4Box.ContainerBox containerBox) throws ParserException {
        parseMoof(containerBox, this.trackBundles, this.sideloadedTrack != null, this.flags, this.scratchBytes);
        DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(containerBox.leafChildren);
        if (drmInitDataFromAtoms != null) {
            int size = this.trackBundles.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.trackBundles.valueAt(i2).updateDrmInitData(drmInitDataFromAtoms);
            }
        }
        if (this.pendingSeekTimeUs != C.TIME_UNSET) {
            int size2 = this.trackBundles.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.trackBundles.valueAt(i3).seek(this.pendingSeekTimeUs);
            }
            this.pendingSeekTimeUs = C.TIME_UNSET;
        }
    }

    private void onMoovContainerAtomRead(Mp4Box.ContainerBox containerBox) throws NumberFormatException {
        long j2;
        boolean z;
        GaplessInfoHolder gaplessInfoHolder;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        an.v(this.sideloadedTrack == null, "Unexpected moov box.");
        DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(containerBox.leafChildren);
        Mp4Box.ContainerBox containerBoxOfType = containerBox.getContainerBoxOfType(Mp4Box.TYPE_mvex);
        an.B(containerBoxOfType);
        SparseArray<DefaultSampleValues> sparseArray = new SparseArray<>();
        int size = containerBoxOfType.leafChildren.size();
        long mehd = C.TIME_UNSET;
        for (int i2 = 0; i2 < size; i2++) {
            Mp4Box.LeafBox leafBox = containerBoxOfType.leafChildren.get(i2);
            int i3 = leafBox.type;
            if (i3 == 1953654136) {
                Pair<Integer, DefaultSampleValues> trex = parseTrex(leafBox.data);
                sparseArray.put(((Integer) trex.first).intValue(), (DefaultSampleValues) trex.second);
            } else if (i3 == 1835362404) {
                mehd = parseMehd(leafBox.data);
            }
        }
        Mp4Box.ContainerBox containerBoxOfType2 = containerBox.getContainerBoxOfType(Mp4Box.TYPE_meta);
        Metadata udta = null;
        Metadata mdtaFromMeta = containerBoxOfType2 != null ? BoxParser.parseMdtaFromMeta(containerBoxOfType2) : null;
        GaplessInfoHolder gaplessInfoHolder2 = new GaplessInfoHolder();
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_udta);
        if (leafBoxOfType != null) {
            udta = BoxParser.parseUdta(leafBoxOfType, (this.flags & 1024) != 0);
            gaplessInfoHolder2.setFromMetadata(udta);
        }
        Metadata metadata = udta;
        Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_mvhd);
        an.B(leafBoxOfType2);
        Metadata metadata2 = new Metadata(BoxParser.parseMvhd(leafBoxOfType2.data));
        if ((this.flags & 16) != 0) {
            j2 = mehd;
            z = true;
        } else {
            j2 = mehd;
            z = false;
        }
        List<TrackSampleTable> traks = BoxParser.parseTraks(containerBox, gaplessInfoHolder2, j2, drmInitDataFromAtoms, z, false, new t() { // from class: androidx.media3.extractor.mp4.FragmentedMp4Extractor$$ExternalSyntheticLambda0
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return this.f$0.modifyTrack((Track) obj);
            }
        }, false);
        int size2 = traks.size();
        if (this.trackBundles.size() != 0) {
            int i4 = 0;
            for (int i5 = 0; i5 < size2; i5++) {
                if (traks.get(i5).track.shouldBeExposed) {
                    i4++;
                }
            }
            an.u(this.trackBundles.size() == i4);
            for (int i6 = 0; i6 < size2; i6++) {
                TrackSampleTable trackSampleTable = traks.get(i6);
                Track track = trackSampleTable.track;
                if (track.shouldBeExposed) {
                    this.trackBundles.get(track.id).reset(trackSampleTable, getDefaultSampleValues(sparseArray, track.id));
                }
            }
            return;
        }
        String containerMimeType = MimeTypeResolver.getContainerMimeType(traks);
        int i7 = 0;
        while (i7 < size2) {
            TrackSampleTable trackSampleTable2 = traks.get(i7);
            Track track2 = trackSampleTable2.track;
            if (track2.shouldBeExposed) {
                TrackOutput trackOutputTrack = this.extractorOutput.track(i7, track2.type);
                boolean z6 = z4;
                z3 = z5;
                trackOutputTrack.durationUs(track2.durationUs);
                Format.Builder builderBuildUpon = track2.format.buildUpon();
                builderBuildUpon.setContainerMimeType(containerMimeType);
                MetadataUtil.setFormatGaplessInfo(track2.type, gaplessInfoHolder2, builderBuildUpon);
                int i8 = track2.type;
                z2 = z6;
                Metadata metadata3 = track2.format.metadata;
                gaplessInfoHolder = gaplessInfoHolder2;
                Metadata[] metadataArr = new Metadata[2];
                metadataArr[z3 ? 1 : 0] = metadata;
                metadataArr[z2 ? 1 : 0] = metadata2;
                MetadataUtil.setFormatMetadata(i8, mdtaFromMeta, builderBuildUpon, metadata3, metadataArr);
                this.trackBundles.put(track2.id, new TrackBundle(trackOutputTrack, trackSampleTable2, getDefaultSampleValues(sparseArray, track2.id), builderBuildUpon.build()));
                this.durationUs = Math.max(this.durationUs, track2.durationUs);
            } else {
                gaplessInfoHolder = gaplessInfoHolder2;
                z2 = z4;
                z3 = z5;
            }
            i7++;
            z4 = z2;
            z5 = z3;
            gaplessInfoHolder2 = gaplessInfoHolder;
        }
        this.extractorOutput.endTracks();
    }

    private void outputPendingMetadataSamples(long j2) {
        while (!this.pendingMetadataSampleInfos.isEmpty()) {
            MetadataSampleInfo metadataSampleInfoRemoveFirst = this.pendingMetadataSampleInfos.removeFirst();
            this.pendingMetadataSampleBytes -= metadataSampleInfoRemoveFirst.size;
            long jAdjustSampleTimestamp = metadataSampleInfoRemoveFirst.sampleTimeUs;
            if (metadataSampleInfoRemoveFirst.sampleTimeIsRelative) {
                jAdjustSampleTimestamp += j2;
            }
            TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
            if (timestampAdjuster != null) {
                jAdjustSampleTimestamp = timestampAdjuster.adjustSampleTimestamp(jAdjustSampleTimestamp);
            }
            long j3 = jAdjustSampleTimestamp;
            for (TrackOutput trackOutput : this.emsgTrackOutputs) {
                trackOutput.sampleMetadata(j3, 1, metadataSampleInfoRemoveFirst.size, this.pendingMetadataSampleBytes, null);
            }
        }
    }

    private static long parseMehd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return BoxParser.parseFullBoxVersion(parsableByteArray.readInt()) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
    }

    private static void parseMoof(Mp4Box.ContainerBox containerBox, SparseArray<TrackBundle> sparseArray, boolean z, int i2, byte[] bArr) throws ParserException {
        int size = containerBox.containerChildren.size();
        for (int i3 = 0; i3 < size; i3++) {
            Mp4Box.ContainerBox containerBox2 = containerBox.containerChildren.get(i3);
            if (containerBox2.type == 1953653094) {
                parseTraf(containerBox2, sparseArray, z, i2, bArr);
            }
        }
    }

    private static void parseSaio(ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        parsableByteArray.setPosition(8);
        int i2 = parsableByteArray.readInt();
        if ((BoxParser.parseFullBoxFlags(i2) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (unsignedIntToInt == 1) {
            trackFragment.auxiliaryDataPosition += BoxParser.parseFullBoxVersion(i2) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
        } else {
            throw ParserException.createForMalformedContainer("Unexpected saio entry count: " + unsignedIntToInt, null);
        }
    }

    private static void parseSaiz(TrackEncryptionBox trackEncryptionBox, ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        int i2;
        int i3 = trackEncryptionBox.perSampleIvSize;
        parsableByteArray.setPosition(8);
        if ((BoxParser.parseFullBoxFlags(parsableByteArray.readInt()) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        int i4 = trackFragment.sampleCount;
        if (unsignedIntToInt > i4) {
            throw ParserException.createForMalformedContainer("Saiz sample count " + unsignedIntToInt + " is greater than fragment sample count" + i4, null);
        }
        if (unsignedByte == 0) {
            boolean[] zArr = trackFragment.sampleHasSubsampleEncryptionTable;
            i2 = 0;
            for (int i5 = 0; i5 < unsignedIntToInt; i5++) {
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                i2 += unsignedByte2;
                zArr[i5] = unsignedByte2 > i3;
            }
        } else {
            i2 = unsignedByte * unsignedIntToInt;
            Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, unsignedIntToInt, unsignedByte > i3);
        }
        Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, unsignedIntToInt, trackFragment.sampleCount, false);
        if (i2 > 0) {
            trackFragment.initEncryptionData(i2);
        }
    }

    private static void parseSampleGroups(Mp4Box.ContainerBox containerBox, String str, TrackFragment trackFragment) throws ParserException {
        byte[] bArr = null;
        ParsableByteArray parsableByteArray = null;
        ParsableByteArray parsableByteArray2 = null;
        for (int i2 = 0; i2 < containerBox.leafChildren.size(); i2++) {
            Mp4Box.LeafBox leafBox = containerBox.leafChildren.get(i2);
            ParsableByteArray parsableByteArray3 = leafBox.data;
            int i3 = leafBox.type;
            if (i3 == 1935828848) {
                parsableByteArray3.setPosition(12);
                if (parsableByteArray3.readInt() == SAMPLE_GROUP_TYPE_seig) {
                    parsableByteArray = parsableByteArray3;
                }
            } else if (i3 == 1936158820) {
                parsableByteArray3.setPosition(12);
                if (parsableByteArray3.readInt() == SAMPLE_GROUP_TYPE_seig) {
                    parsableByteArray2 = parsableByteArray3;
                }
            }
        }
        if (parsableByteArray == null || parsableByteArray2 == null) {
            return;
        }
        parsableByteArray.setPosition(8);
        int fullBoxVersion = BoxParser.parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        if (fullBoxVersion == 1) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.readInt() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
        }
        parsableByteArray2.setPosition(8);
        int fullBoxVersion2 = BoxParser.parseFullBoxVersion(parsableByteArray2.readInt());
        parsableByteArray2.skipBytes(4);
        long unsignedInt = fullBoxVersion2 > 0 ? parsableByteArray2.readUnsignedInt() : 0L;
        if (fullBoxVersion2 >= 2) {
            parsableByteArray2.skipBytes(4);
        }
        if (parsableByteArray2.readUnsignedInt() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
        }
        if (fullBoxVersion2 > 0 && unsignedInt == 0) {
            parsableByteArray2.skipBytes(4);
        }
        parsableByteArray2.skipBytes(1);
        int unsignedByte = parsableByteArray2.readUnsignedByte();
        int i4 = (unsignedByte & 240) >> 4;
        int i5 = unsignedByte & 15;
        if (parsableByteArray2.readUnsignedByte() == 1) {
            int unsignedByte2 = parsableByteArray2.readUnsignedByte();
            byte[] bArr2 = new byte[16];
            parsableByteArray2.readBytes(bArr2, 0, 16);
            if (unsignedByte2 == 0) {
                int unsignedByte3 = parsableByteArray2.readUnsignedByte();
                bArr = new byte[unsignedByte3];
                parsableByteArray2.readBytes(bArr, 0, unsignedByte3);
            }
            trackFragment.definesEncryptionData = true;
            trackFragment.trackEncryptionBox = new TrackEncryptionBox(true, str, unsignedByte2, bArr2, i4, i5, bArr);
        }
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, int i2, TrackFragment trackFragment) throws ParserException {
        parsableByteArray.setPosition(i2 + 8);
        int fullBoxFlags = BoxParser.parseFullBoxFlags(parsableByteArray.readInt());
        if ((fullBoxFlags & 1) != 0) {
            throw ParserException.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (fullBoxFlags & 2) != 0;
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (unsignedIntToInt == 0) {
            Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, trackFragment.sampleCount, false);
            return;
        }
        int i3 = trackFragment.sampleCount;
        if (unsignedIntToInt == i3) {
            Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, unsignedIntToInt, z);
            trackFragment.initEncryptionData(parsableByteArray.bytesLeft());
            trackFragment.fillEncryptionData(parsableByteArray);
        } else {
            throw ParserException.createForMalformedContainer("Senc sample count " + unsignedIntToInt + " is different from fragment sample count" + i3, null);
        }
    }

    private static Pair<Long, ChunkIndex> parseSidx(ParsableByteArray parsableByteArray, long j2) throws ParserException {
        long unsignedLongToLong;
        long unsignedLongToLong2;
        parsableByteArray.setPosition(8);
        int fullBoxVersion = BoxParser.parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        if (fullBoxVersion == 0) {
            unsignedLongToLong = parsableByteArray.readUnsignedInt();
            unsignedLongToLong2 = parsableByteArray.readUnsignedInt();
        } else {
            unsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            unsignedLongToLong2 = parsableByteArray.readUnsignedLongToLong();
        }
        long j3 = j2 + unsignedLongToLong2;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(unsignedLongToLong, 1000000L, unsignedInt);
        parsableByteArray.skipBytes(2);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int[] iArr = new int[unsignedShort];
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        long[] jArr3 = new long[unsignedShort];
        long j4 = j3;
        long jScaleLargeTimestamp2 = jScaleLargeTimestamp;
        int i2 = 0;
        while (i2 < unsignedShort) {
            int i3 = parsableByteArray.readInt();
            if ((Integer.MIN_VALUE & i3) != 0) {
                throw ParserException.createForMalformedContainer("Unhandled indirect reference", null);
            }
            long unsignedInt2 = parsableByteArray.readUnsignedInt();
            iArr[i2] = i3 & Integer.MAX_VALUE;
            jArr[i2] = j4;
            jArr3[i2] = jScaleLargeTimestamp2;
            unsignedLongToLong += unsignedInt2;
            long[] jArr4 = jArr3;
            jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(unsignedLongToLong, 1000000L, unsignedInt);
            jArr2[i2] = jScaleLargeTimestamp2 - jArr4[i2];
            parsableByteArray.skipBytes(4);
            j4 += iArr[i2];
            i2++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jScaleLargeTimestamp), new ChunkIndex(iArr, jArr, jArr2, jArr3));
    }

    private static long parseTfdt(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return BoxParser.parseFullBoxVersion(parsableByteArray.readInt()) == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
    }

    private static TrackBundle parseTfhd(ParsableByteArray parsableByteArray, SparseArray<TrackBundle> sparseArray, boolean z) {
        parsableByteArray.setPosition(8);
        int fullBoxFlags = BoxParser.parseFullBoxFlags(parsableByteArray.readInt());
        TrackBundle trackBundleValueAt = z ? sparseArray.valueAt(0) : sparseArray.get(parsableByteArray.readInt());
        if (trackBundleValueAt == null) {
            return null;
        }
        if ((fullBoxFlags & 1) != 0) {
            long unsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            TrackFragment trackFragment = trackBundleValueAt.fragment;
            trackFragment.dataPosition = unsignedLongToLong;
            trackFragment.auxiliaryDataPosition = unsignedLongToLong;
        }
        DefaultSampleValues defaultSampleValues = trackBundleValueAt.defaultSampleValues;
        trackBundleValueAt.fragment.header = new DefaultSampleValues((fullBoxFlags & 2) != 0 ? parsableByteArray.readInt() - 1 : defaultSampleValues.sampleDescriptionIndex, (fullBoxFlags & 8) != 0 ? parsableByteArray.readInt() : defaultSampleValues.duration, (fullBoxFlags & 16) != 0 ? parsableByteArray.readInt() : defaultSampleValues.size, (fullBoxFlags & 32) != 0 ? parsableByteArray.readInt() : defaultSampleValues.flags);
        return trackBundleValueAt;
    }

    private static void parseTraf(Mp4Box.ContainerBox containerBox, SparseArray<TrackBundle> sparseArray, boolean z, int i2, byte[] bArr) throws ParserException {
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_tfhd);
        an.B(leafBoxOfType);
        TrackBundle tfhd = parseTfhd(leafBoxOfType.data, sparseArray, z);
        if (tfhd == null) {
            return;
        }
        TrackFragment trackFragment = tfhd.fragment;
        long j2 = trackFragment.nextFragmentDecodeTime;
        boolean z2 = trackFragment.nextFragmentDecodeTimeIncludesMoov;
        tfhd.resetFragmentInfo();
        tfhd.currentlyInFragment = true;
        Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_tfdt);
        if (leafBoxOfType2 == null || (i2 & 2) != 0) {
            trackFragment.nextFragmentDecodeTime = j2;
            trackFragment.nextFragmentDecodeTimeIncludesMoov = z2;
        } else {
            trackFragment.nextFragmentDecodeTime = parseTfdt(leafBoxOfType2.data);
            trackFragment.nextFragmentDecodeTimeIncludesMoov = true;
        }
        parseTruns(containerBox, tfhd, i2);
        Track track = tfhd.moovSampleTable.track;
        DefaultSampleValues defaultSampleValues = trackFragment.header;
        an.B(defaultSampleValues);
        TrackEncryptionBox sampleDescriptionEncryptionBox = track.getSampleDescriptionEncryptionBox(defaultSampleValues.sampleDescriptionIndex);
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_saiz);
        if (leafBoxOfType3 != null) {
            an.B(sampleDescriptionEncryptionBox);
            parseSaiz(sampleDescriptionEncryptionBox, leafBoxOfType3.data, trackFragment);
        }
        Mp4Box.LeafBox leafBoxOfType4 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_saio);
        if (leafBoxOfType4 != null) {
            parseSaio(leafBoxOfType4.data, trackFragment);
        }
        Mp4Box.LeafBox leafBoxOfType5 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_senc);
        if (leafBoxOfType5 != null) {
            parseSenc(leafBoxOfType5.data, trackFragment);
        }
        parseSampleGroups(containerBox, sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null, trackFragment);
        int size = containerBox.leafChildren.size();
        for (int i3 = 0; i3 < size; i3++) {
            Mp4Box.LeafBox leafBox = containerBox.leafChildren.get(i3);
            if (leafBox.type == 1970628964) {
                parseUuid(leafBox.data, trackFragment, bArr);
            }
        }
    }

    private static Pair<Integer, DefaultSampleValues> parseTrex(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(12);
        return Pair.create(Integer.valueOf(parsableByteArray.readInt()), new DefaultSampleValues(parsableByteArray.readInt() - 1, parsableByteArray.readInt(), parsableByteArray.readInt(), parsableByteArray.readInt()));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int parseTrun(androidx.media3.extractor.mp4.FragmentedMp4Extractor.TrackBundle r28, int r29, int r30, androidx.media3.common.util.ParsableByteArray r31, int r32) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.FragmentedMp4Extractor.parseTrun(androidx.media3.extractor.mp4.FragmentedMp4Extractor$TrackBundle, int, int, androidx.media3.common.util.ParsableByteArray, int):int");
    }

    private static void parseTruns(Mp4Box.ContainerBox containerBox, TrackBundle trackBundle, int i2) throws ParserException {
        List<Mp4Box.LeafBox> list = containerBox.leafChildren;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Mp4Box.LeafBox leafBox = list.get(i5);
            if (leafBox.type == 1953658222) {
                ParsableByteArray parsableByteArray = leafBox.data;
                parsableByteArray.setPosition(12);
                int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
                if (unsignedIntToInt > 0) {
                    i4 += unsignedIntToInt;
                    i3++;
                }
            }
        }
        trackBundle.currentTrackRunIndex = 0;
        trackBundle.currentSampleInTrackRun = 0;
        trackBundle.currentSampleIndex = 0;
        trackBundle.fragment.initTables(i3, i4);
        int i6 = 0;
        int trun = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Mp4Box.LeafBox leafBox2 = list.get(i7);
            if (leafBox2.type == 1953658222) {
                trun = parseTrun(trackBundle, i6, i2, leafBox2.data, trun);
                i6++;
            }
        }
    }

    private static void parseUuid(ParsableByteArray parsableByteArray, TrackFragment trackFragment, byte[] bArr) throws ParserException {
        parsableByteArray.setPosition(8);
        parsableByteArray.readBytes(bArr, 0, 16);
        if (Arrays.equals(bArr, PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE)) {
            parseSenc(parsableByteArray, 16, trackFragment);
        }
    }

    private void processAtomEnded(long j2) throws ParserException, NumberFormatException {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j2) {
            onContainerAtomRead(this.containerAtoms.pop());
        }
        enterReadingAtomHeaderState();
    }

    private boolean readAtomHeader(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException, NumberFormatException {
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
                length = !this.containerAtoms.isEmpty() ? this.containerAtoms.peek().endPosition : -1L;
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
            j3 = j4;
        }
        if (this.seekPositionBeforeSidxProcessing != -1) {
            if (this.atomType == 1936286840) {
                this.scratch.reset((int) j3);
                System.arraycopy(this.atomHeader.getData(), 0, this.scratch.getData(), 0, 8);
                extractorInput.readFully(this.scratch.getData(), 8, (int) (this.atomSize - this.atomHeaderBytesRead));
                this.chunkIndexMerger.add((ChunkIndex) parseSidx(new Mp4Box.LeafBox(Mp4Box.TYPE_sidx, this.scratch).data, extractorInput.getPeekPosition()).second);
            } else {
                extractorInput.skipFully((int) (j3 - j4), true);
            }
            enterReadingAtomHeaderState();
            return true;
        }
        long position = extractorInput.getPosition() - this.atomHeaderBytesRead;
        int i3 = this.atomType;
        if ((i3 == 1836019558 || i3 == 1835295092) && !this.haveOutputSeekMap) {
            if (extractorInput.getLength() != -1 && this.seekPositionBeforeMfraProcessing == -1 && (this.flags & 512) != 0) {
                this.seekPositionBeforeMfraProcessing = position;
                positionHolder.position = extractorInput.getLength() - 16;
                this.parserState = 5;
                return true;
            }
            this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs, position));
            this.haveOutputSeekMap = true;
        }
        if (this.atomType == 1836019558) {
            int size = this.trackBundles.size();
            for (int i4 = 0; i4 < size; i4++) {
                TrackFragment trackFragment = this.trackBundles.valueAt(i4).fragment;
                trackFragment.atomPosition = position;
                trackFragment.auxiliaryDataPosition = position;
                trackFragment.dataPosition = position;
            }
        }
        int i5 = this.atomType;
        if (i5 == 1835295092) {
            this.currentTrackBundle = null;
            this.endOfMdatPosition = position + this.atomSize;
            this.parserState = 2;
            return true;
        }
        if (shouldParseContainerAtom(i5)) {
            long position2 = extractorInput.getPosition();
            long j5 = this.atomSize;
            long j6 = position2 + j5;
            if (j5 != this.atomHeaderBytesRead && this.atomType == 1835365473) {
                maybeSkipRemainingMetaAtomHeaderBytes(extractorInput);
            }
            long j7 = j6 - 8;
            this.containerAtoms.push(new Mp4Box.ContainerBox(this.atomType, j7));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(j7);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(i5)) {
            if (this.atomHeaderBytesRead != 8) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.atomSize > SieveCacheKt.NodeLinkMask) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
            }
            ParsableByteArray parsableByteArray = new ParsableByteArray((int) this.atomSize);
            System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.atomData = parsableByteArray;
            this.parserState = 1;
        } else {
            if (this.atomSize > SieveCacheKt.NodeLinkMask) {
                throw ParserException.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    private void readAtomPayload(ExtractorInput extractorInput) throws ParserException, NumberFormatException {
        int i2 = (int) (this.atomSize - this.atomHeaderBytesRead);
        ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            extractorInput.readFully(parsableByteArray.getData(), 8, i2);
            onLeafAtomRead(new Mp4Box.LeafBox(this.atomType, parsableByteArray), extractorInput);
        } else {
            extractorInput.skipFully(i2);
        }
        processAtomEnded(extractorInput.getPosition());
    }

    private void readEncryptionData(ExtractorInput extractorInput) throws ParserException {
        int size = this.trackBundles.size();
        long j2 = Long.MAX_VALUE;
        TrackBundle trackBundleValueAt = null;
        for (int i2 = 0; i2 < size; i2++) {
            TrackFragment trackFragment = this.trackBundles.valueAt(i2).fragment;
            if (trackFragment.sampleEncryptionDataNeedsFill) {
                long j3 = trackFragment.auxiliaryDataPosition;
                if (j3 < j2) {
                    trackBundleValueAt = this.trackBundles.valueAt(i2);
                    j2 = j3;
                }
            }
        }
        if (trackBundleValueAt == null) {
            this.parserState = 3;
            return;
        }
        int position = (int) (j2 - extractorInput.getPosition());
        if (position < 0) {
            throw ParserException.createForMalformedContainer("Offset to encryption data was negative.", null);
        }
        extractorInput.skipFully(position);
        trackBundleValueAt.fragment.fillEncryptionData(extractorInput);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void readMfra(androidx.media3.extractor.ExtractorInput r28, androidx.media3.extractor.PositionHolder r29) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.FragmentedMp4Extractor.readMfra(androidx.media3.extractor.ExtractorInput, androidx.media3.extractor.PositionHolder):void");
    }

    private void readMfro(ExtractorInput extractorInput, PositionHolder positionHolder) {
        this.scratch.reset(16);
        if (!extractorInput.readFully(this.scratch.getData(), 0, 16, true)) {
            onMfraProcessingFinished(new SeekMap.Unseekable(this.durationUs, this.seekPositionBeforeMfraProcessing), positionHolder);
            return;
        }
        this.scratch.setPosition(0);
        ParsableByteArray parsableByteArray = this.scratch;
        int i2 = parsableByteArray.readInt();
        int i3 = parsableByteArray.readInt();
        if (i2 != 16 || i3 != 1835430511) {
            onMfraProcessingFinished(new SeekMap.Unseekable(this.durationUs, this.seekPositionBeforeMfraProcessing), positionHolder);
            return;
        }
        this.scratch.skipBytes(4);
        long unsignedInt = this.scratch.readUnsignedInt();
        long length = extractorInput.getLength() - unsignedInt;
        if (unsignedInt <= 0 || unsignedInt > SieveCacheKt.NodeLinkMask || length < 0 || length < this.seekPositionBeforeMfraProcessing) {
            onMfraProcessingFinished(new SeekMap.Unseekable(this.durationUs, this.seekPositionBeforeMfraProcessing), positionHolder);
        } else {
            positionHolder.position = length;
            this.parserState = 6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean readSample(androidx.media3.extractor.ExtractorInput r17) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.FragmentedMp4Extractor.readSample(androidx.media3.extractor.ExtractorInput):boolean");
    }

    private static boolean shouldParseContainerAtom(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1836019558 || i2 == 1953653094 || i2 == 1836475768 || i2 == 1701082227 || i2 == 1835365473;
    }

    private static boolean shouldParseLeafAtom(int i2) {
        return i2 == 1751411826 || i2 == 1835296868 || i2 == 1836476516 || i2 == 1936286840 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1668576371 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1937011571 || i2 == 1952867444 || i2 == 1952868452 || i2 == 1953196132 || i2 == 1953654136 || i2 == 1953658222 || i2 == 1886614376 || i2 == 1935763834 || i2 == 1935763823 || i2 == 1936027235 || i2 == 1970628964 || i2 == 1935828848 || i2 == 1936158820 || i2 == 1701606260 || i2 == 1835362404 || i2 == 1701671783 || i2 == 1969517665 || i2 == 1801812339 || i2 == 1768715124;
    }

    @Override // androidx.media3.extractor.Extractor
    public /* synthetic */ Extractor getUnderlyingImplementation() {
        return this;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = (this.flags & 32) == 0 ? new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory) : extractorOutput;
        enterReadingAtomHeaderState();
        initExtraTracks();
        Track track = this.sideloadedTrack;
        if (track != null) {
            Format format = track.format;
            Format.Builder builderBuildUpon = format.buildUpon();
            builderBuildUpon.setContainerMimeType(MimeTypeResolver.getContainerMimeType(format));
            this.trackBundles.put(0, new TrackBundle(this.extractorOutput.track(0, this.sideloadedTrack.type), new TrackSampleTable(this.sideloadedTrack, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0), new DefaultSampleValues(0, 0, 0, 0), builderBuildUpon.build()));
            this.extractorOutput.endTracks();
        }
    }

    protected Track modifyTrack(Track track) {
        return track;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        return 1;
     */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(androidx.media3.extractor.ExtractorInput r6, androidx.media3.extractor.PositionHolder r7) throws androidx.media3.common.ParserException, java.lang.NumberFormatException {
        /*
            r5 = this;
        L0:
            int r0 = r5.parserState
            r1 = 5
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 == r2) goto L2e
            r3 = 2
            if (r0 == r3) goto L2a
            r3 = 6
            if (r0 == r1) goto L20
            if (r0 == r3) goto L18
            boolean r0 = r5.readSample(r6)
            if (r0 == 0) goto L0
            r5 = 0
            return r5
        L18:
            r5.readMfra(r6, r7)
            int r0 = r5.parserState
            if (r0 != 0) goto L0
            return r2
        L20:
            r5.readMfro(r6, r7)
            int r0 = r5.parserState
            if (r0 == r3) goto L29
            if (r0 != 0) goto L0
        L29:
            return r2
        L2a:
            r5.readEncryptionData(r6)
            goto L0
        L2e:
            r5.readAtomPayload(r6)
            goto L0
        L32:
            boolean r0 = r5.readAtomHeader(r6, r7)
            if (r0 != 0) goto L59
            long r0 = r5.seekPositionBeforeSidxProcessing
            r3 = -1
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L52
            r7.position = r0
            r5.seekPositionBeforeSidxProcessing = r3
            androidx.media3.extractor.ExtractorOutput r6 = r5.extractorOutput
            androidx.media3.extractor.ChunkIndexMerger r7 = r5.chunkIndexMerger
            androidx.media3.extractor.ChunkIndex r7 = r7.merge()
            r6.seekMap(r7)
            r5.upfrontSidxScanComplete = r2
            return r2
        L52:
            androidx.media3.container.ReorderingBufferQueue r5 = r5.reorderingBufferQueue
            r5.flush()
            r5 = -1
            return r5
        L59:
            int r0 = r5.parserState
            if (r0 != r1) goto L0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.FragmentedMp4Extractor.read(androidx.media3.extractor.ExtractorInput, androidx.media3.extractor.PositionHolder):int");
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j2, long j3) {
        int size = this.trackBundles.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.trackBundles.valueAt(i2).resetFragmentInfo();
        }
        this.pendingMetadataSampleInfos.clear();
        this.pendingMetadataSampleBytes = 0;
        this.reorderingBufferQueue.clear();
        this.pendingSeekTimeUs = j3;
        this.containerAtoms.clear();
        this.seekPositionBeforeMfraProcessing = -1L;
        enterReadingAtomHeaderState();
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        SniffFailure sniffFailureSniffFragmented = Sniffer.sniffFragmented(extractorInput);
        this.lastSniffFailures = sniffFailureSniffFragmented != null ? bn.q(sniffFailureSniffFragmented) : bn.p();
        return sniffFailureSniffFragmented == null;
    }

    @Override // androidx.media3.extractor.Extractor
    public bn<SniffFailure> getSniffFailureDetails() {
        return this.lastSniffFailures;
    }

    /* compiled from: WazeSource */
    final class MfraSeekMap implements TrackAwareSeekMap {
        private final long durationUs;
        private final long firstMediaDataPosition;
        private final int primaryTrackId;
        private final SparseArray<long[]> trackOffsets;
        private final SparseArray<long[]> trackTimesUs;

        private MfraSeekMap(SparseArray<long[]> sparseArray, SparseArray<long[]> sparseArray2, long j2, long j3, int i2) {
            this.trackTimesUs = sparseArray;
            this.trackOffsets = sparseArray2;
            this.durationUs = j2;
            this.firstMediaDataPosition = j3;
            this.primaryTrackId = i2;
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // androidx.media3.extractor.TrackAwareSeekMap
        public SeekMap.SeekPoints getSeekPoints(long j2, int i2) {
            long[] jArrValueAt = this.trackTimesUs.get(i2);
            long[] jArrValueAt2 = this.trackOffsets.get(i2);
            if (jArrValueAt == null || jArrValueAt2 == null) {
                jArrValueAt = this.trackTimesUs.get(this.primaryTrackId);
                jArrValueAt2 = this.trackOffsets.get(this.primaryTrackId);
                if (jArrValueAt == null || jArrValueAt2 == null) {
                    jArrValueAt = this.trackTimesUs.valueAt(0);
                    jArrValueAt2 = this.trackOffsets.valueAt(0);
                }
            }
            if (jArrValueAt.length == 0 || j2 < jArrValueAt[0]) {
                return new SeekMap.SeekPoints(new SeekPoint(0L, this.firstMediaDataPosition));
            }
            int iBinarySearchFloor = Util.binarySearchFloor(jArrValueAt, j2, true, true);
            return new SeekMap.SeekPoints(new SeekPoint(jArrValueAt[iBinarySearchFloor], jArrValueAt2[iBinarySearchFloor]));
        }

        @Override // androidx.media3.extractor.SeekMap
        public /* synthetic */ boolean isEstimated() {
            return false;
        }

        @Override // androidx.media3.extractor.TrackAwareSeekMap
        public boolean isSeekable(int i2) {
            return this.trackTimesUs.indexOfKey(i2) >= 0;
        }

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        @Override // androidx.media3.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j2) {
            return getSeekPoints(j2, this.primaryTrackId);
        }
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        parseSenc(parsableByteArray, 0, trackFragment);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i2) {
        this(SubtitleParser.Factory.UNSUPPORTED, i2 | 32, null, null, bn.p(), null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i2, TimestampAdjuster timestampAdjuster) {
        this(SubtitleParser.Factory.UNSUPPORTED, i2 | 32, timestampAdjuster, null, bn.p(), null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i2, TimestampAdjuster timestampAdjuster, Track track) {
        this(SubtitleParser.Factory.UNSUPPORTED, i2 | 32, timestampAdjuster, track, bn.p(), null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i2, TimestampAdjuster timestampAdjuster, Track track, List<Format> list) {
        this(SubtitleParser.Factory.UNSUPPORTED, i2 | 32, timestampAdjuster, track, list, null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i2, TimestampAdjuster timestampAdjuster, Track track, List<Format> list, TrackOutput trackOutput) {
        this(SubtitleParser.Factory.UNSUPPORTED, i2 | 32, timestampAdjuster, track, list, trackOutput);
    }

    public FragmentedMp4Extractor(SubtitleParser.Factory factory) {
        this(factory, 0, null, null, bn.p(), null);
    }

    public FragmentedMp4Extractor(SubtitleParser.Factory factory, int i2) {
        this(factory, i2, null, null, bn.p(), null);
    }

    @Deprecated
    public FragmentedMp4Extractor() {
        this(SubtitleParser.Factory.UNSUPPORTED, 32, null, null, bn.p(), null);
    }
}
