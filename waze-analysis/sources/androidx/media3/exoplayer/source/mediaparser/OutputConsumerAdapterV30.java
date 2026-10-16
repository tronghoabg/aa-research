package androidx.media3.exoplayer.source.mediaparser;

import android.media.DrmInitData;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.MediaParser$InputReader;
import android.media.MediaParser$OutputConsumer;
import android.util.Pair;
import androidx.collection.SieveCacheKt;
import androidx.core.os.EnvironmentCompat;
import androidx.media3.common.C;
import androidx.media3.common.C$$ExternalSyntheticApiModelOutline0;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.NoOpExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.d.b.an;
import com.google.d.d.bn;
import e.a.b.a.ap$$ExternalSyntheticApiModelOutline1;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class OutputConsumerAdapterV30 implements MediaParser$OutputConsumer {
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS = "chunk-index-long-us-durations";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS = "chunk-index-long-offsets";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES = "chunk-index-int-sizes";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES = "chunk-index-long-us-times";
    private static final String MEDIA_FORMAT_KEY_TRACK_TYPE = "track-type-string";
    private static final String TAG = "OConsumerAdapterV30";
    private String containerMimeType;
    private MediaParser.SeekMap dummySeekMap;
    private final boolean expectDummySeekMap;
    private ExtractorOutput extractorOutput;
    private ChunkIndex lastChunkIndex;
    private final ArrayList<TrackOutput.CryptoData> lastOutputCryptoDatas;
    private final ArrayList<MediaCodec.CryptoInfo> lastReceivedCryptoInfos;
    private MediaParser.SeekMap lastSeekMap;
    private List<Format> muxedCaptionFormats;
    private int primaryTrackIndex;
    private final Format primaryTrackManifestFormat;
    private final int primaryTrackType;
    private long sampleTimestampUpperLimitFilterUs;
    private final DataReaderAdapter scratchDataReaderAdapter;
    private boolean seekingDisabled;
    private TimestampAdjuster timestampAdjuster;
    private final ArrayList<Format> trackFormats;
    private final ArrayList<TrackOutput> trackOutputs;
    private boolean tracksEnded;
    private boolean tracksFoundCalled;
    private static final Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> SEEK_POINT_PAIR_START = Pair.create(MediaParser.SeekPoint.START, MediaParser.SeekPoint.START);
    private static final Pattern REGEX_CRYPTO_INFO_PATTERN = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");

    /* compiled from: WazeSource */
    final class DataReaderAdapter implements DataReader {
        public MediaParser$InputReader input;

        private DataReaderAdapter() {
        }

        @Override // androidx.media3.common.DataReader
        public int read(byte[] bArr, int i2, int i3) {
            MediaParser$InputReader mediaParser$InputReader = this.input;
            int i4 = Util.SDK_INT;
            return ap$$ExternalSyntheticApiModelOutline1.m29304m((Object) mediaParser$InputReader).read(bArr, i2, i3);
        }
    }

    /* compiled from: WazeSource */
    final class SeekMapAdapter implements SeekMap {
        private final MediaParser.SeekMap adaptedSeekMap;

        public SeekMapAdapter(MediaParser.SeekMap seekMap) {
            this.adaptedSeekMap = seekMap;
        }

        private static SeekPoint asExoPlayerSeekPoint(MediaParser.SeekPoint seekPoint) {
            return new SeekPoint(seekPoint.timeMicros, seekPoint.position);
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            long durationMicros = this.adaptedSeekMap.getDurationMicros();
            return durationMicros != SieveCacheKt.NodeMetaAndPreviousMask ? durationMicros : C.TIME_UNSET;
        }

        @Override // androidx.media3.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j2) {
            Pair seekPoints = this.adaptedSeekMap.getSeekPoints(j2);
            return seekPoints.first == seekPoints.second ? new SeekMap.SeekPoints(asExoPlayerSeekPoint(C$$ExternalSyntheticApiModelOutline0.m(seekPoints.first))) : new SeekMap.SeekPoints(asExoPlayerSeekPoint(C$$ExternalSyntheticApiModelOutline0.m(seekPoints.first)), asExoPlayerSeekPoint(C$$ExternalSyntheticApiModelOutline0.m(seekPoints.second)));
        }

        @Override // androidx.media3.extractor.SeekMap
        public /* synthetic */ boolean isEstimated() {
            return false;
        }

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return this.adaptedSeekMap.isSeekable();
        }
    }

    public OutputConsumerAdapterV30(Format format, int i2, boolean z) {
        this.expectDummySeekMap = z;
        this.primaryTrackManifestFormat = format;
        this.primaryTrackType = i2;
        this.trackOutputs = new ArrayList<>();
        this.trackFormats = new ArrayList<>();
        this.lastReceivedCryptoInfos = new ArrayList<>();
        this.lastOutputCryptoDatas = new ArrayList<>();
        this.scratchDataReaderAdapter = new DataReaderAdapter();
        this.extractorOutput = new NoOpExtractorOutput();
        this.sampleTimestampUpperLimitFilterUs = C.TIME_UNSET;
        this.muxedCaptionFormats = bn.p();
    }

    private void ensureSpaceForTrackIndex(int i2) {
        for (int size = this.trackOutputs.size(); size <= i2; size++) {
            this.trackOutputs.add(null);
            this.trackFormats.add(null);
            this.lastReceivedCryptoInfos.add(null);
            this.lastOutputCryptoDatas.add(null);
        }
    }

    private static int getFlag(MediaFormat mediaFormat, String str, int i2) {
        if (mediaFormat.getInteger(str, 0) != 0) {
            return i2;
        }
        return 0;
    }

    private static List<byte[]> getInitializationData(MediaFormat mediaFormat) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-" + i2);
            if (byteBuffer == null) {
                return arrayList;
            }
            arrayList.add(MediaFormatUtil.getArray(byteBuffer));
            i2++;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    private static String getMimeType(String str) {
        switch (str.hashCode()) {
            case -2063506020:
                if (str.equals("android.media.mediaparser.Mp4Parser")) {
                    return MimeTypes.VIDEO_MP4;
                }
                break;
            case -1870824006:
                if (str.equals("android.media.mediaparser.OggParser")) {
                    return MimeTypes.AUDIO_OGG;
                }
                break;
            case -1566427438:
                if (str.equals("android.media.mediaparser.TsParser")) {
                    return MimeTypes.VIDEO_MP2T;
                }
                break;
            case -900207883:
                if (str.equals("android.media.mediaparser.AdtsParser")) {
                    return "audio/mp4a-latm";
                }
                break;
            case -589864617:
                if (str.equals("android.media.mediaparser.WavParser")) {
                    return MimeTypes.AUDIO_RAW;
                }
                break;
            case 52265814:
                if (str.equals("android.media.mediaparser.PsParser")) {
                    return MimeTypes.VIDEO_PS;
                }
                break;
            case 116768877:
                if (str.equals("android.media.mediaparser.FragmentedMp4Parser")) {
                    return MimeTypes.VIDEO_MP4;
                }
                break;
            case 376876796:
                if (str.equals("android.media.mediaparser.Ac3Parser")) {
                    return MimeTypes.AUDIO_AC3;
                }
                break;
            case 703268017:
                if (str.equals("android.media.mediaparser.AmrParser")) {
                    return MimeTypes.AUDIO_AMR;
                }
                break;
            case 768643067:
                if (str.equals("android.media.mediaparser.FlacParser")) {
                    return MimeTypes.AUDIO_FLAC;
                }
                break;
            case 965962719:
                if (str.equals("android.media.mediaparser.MatroskaParser")) {
                    return MimeTypes.VIDEO_WEBM;
                }
                break;
            case 1264380477:
                if (str.equals("android.media.mediaparser.Ac4Parser")) {
                    return MimeTypes.AUDIO_AC4;
                }
                break;
            case 1343957595:
                if (str.equals("android.media.mediaparser.Mp3Parser")) {
                    return MimeTypes.AUDIO_MPEG;
                }
                break;
            case 2063134683:
                if (str.equals("android.media.mediaparser.FlvParser")) {
                    return MimeTypes.VIDEO_FLV;
                }
                break;
        }
        throw new IllegalArgumentException("Illegal parser name: ".concat(String.valueOf(str)));
    }

    private static int getSelectionFlags(MediaFormat mediaFormat) {
        return getFlag(mediaFormat, "is-forced-subtitle", 2) | getFlag(mediaFormat, "is-autoselect", 4) | getFlag(mediaFormat, "is-default", 1);
    }

    private void maybeEndTracks() {
        if (!this.tracksFoundCalled || this.tracksEnded) {
            return;
        }
        int size = this.trackOutputs.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.trackOutputs.get(i2) == null) {
                return;
            }
        }
        this.extractorOutput.endTracks();
        this.tracksEnded = true;
    }

    private boolean maybeObtainChunkIndex(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES);
        if (byteBuffer == null) {
            return false;
        }
        IntBuffer intBufferAsIntBuffer = byteBuffer.asIntBuffer();
        ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS);
        an.B(byteBuffer2);
        LongBuffer longBufferAsLongBuffer = byteBuffer2.asLongBuffer();
        ByteBuffer byteBuffer3 = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS);
        an.B(byteBuffer3);
        LongBuffer longBufferAsLongBuffer2 = byteBuffer3.asLongBuffer();
        ByteBuffer byteBuffer4 = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES);
        an.B(byteBuffer4);
        LongBuffer longBufferAsLongBuffer3 = byteBuffer4.asLongBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        long[] jArr = new long[longBufferAsLongBuffer.remaining()];
        long[] jArr2 = new long[longBufferAsLongBuffer2.remaining()];
        long[] jArr3 = new long[longBufferAsLongBuffer3.remaining()];
        intBufferAsIntBuffer.get(iArr);
        longBufferAsLongBuffer.get(jArr);
        longBufferAsLongBuffer2.get(jArr2);
        longBufferAsLongBuffer3.get(jArr3);
        ChunkIndex chunkIndex = new ChunkIndex(iArr, jArr, jArr2, jArr3);
        this.lastChunkIndex = chunkIndex;
        this.extractorOutput.seekMap(chunkIndex);
        return true;
    }

    private TrackOutput.CryptoData toExoPlayerCryptoData(int i2, MediaCodec.CryptoInfo cryptoInfo) throws NumberFormatException {
        int i3;
        int i4;
        if (cryptoInfo == null) {
            return null;
        }
        if (this.lastReceivedCryptoInfos.get(i2) == cryptoInfo) {
            TrackOutput.CryptoData cryptoData = this.lastOutputCryptoDatas.get(i2);
            an.B(cryptoData);
            return cryptoData;
        }
        try {
            Matcher matcher = REGEX_CRYPTO_INFO_PATTERN.matcher(cryptoInfo.toString());
            matcher.find();
            String strGroup = matcher.group(1);
            int i5 = Util.SDK_INT;
            String str = strGroup;
            i3 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            String str2 = strGroup2;
            i4 = Integer.parseInt(strGroup2);
        } catch (RuntimeException e2) {
            Log.e(TAG, "Unexpected error while parsing CryptoInfo: ".concat(cryptoInfo.toString()), e2);
            i3 = 0;
            i4 = 0;
        }
        TrackOutput.CryptoData cryptoData2 = new TrackOutput.CryptoData(cryptoInfo.mode, cryptoInfo.key, i3, i4);
        this.lastReceivedCryptoInfos.set(i2, cryptoInfo);
        this.lastOutputCryptoDatas.set(i2, cryptoData2);
        return cryptoData2;
    }

    private static DrmInitData toExoPlayerDrmInitData(String str, android.media.DrmInitData drmInitData) {
        if (drmInitData == null) {
            return null;
        }
        int schemeInitDataCount = drmInitData.getSchemeInitDataCount();
        DrmInitData.SchemeData[] schemeDataArr = new DrmInitData.SchemeData[schemeInitDataCount];
        for (int i2 = 0; i2 < schemeInitDataCount; i2++) {
            DrmInitData.SchemeInitData schemeInitDataAt = drmInitData.getSchemeInitDataAt(i2);
            schemeDataArr[i2] = new DrmInitData.SchemeData(schemeInitDataAt.uuid, schemeInitDataAt.mimeType, schemeInitDataAt.data);
        }
        return new androidx.media3.common.DrmInitData(str, schemeDataArr);
    }

    private Format toExoPlayerFormat(MediaParser.TrackData trackData) {
        MediaFormat mediaFormat = trackData.mediaFormat;
        String string = mediaFormat.getString("mime");
        int integer = mediaFormat.getInteger("caption-service-number", -1);
        Format.Builder builder = new Format.Builder();
        builder.setDrmInitData(toExoPlayerDrmInitData(mediaFormat.getString("crypto-mode-fourcc"), trackData.drmInitData));
        builder.setContainerMimeType(this.containerMimeType);
        builder.setPeakBitrate(mediaFormat.getInteger("bitrate", -1));
        builder.setChannelCount(mediaFormat.getInteger("channel-count", -1));
        builder.setColorInfo(MediaFormatUtil.getColorInfo(mediaFormat));
        builder.setSampleMimeType(string);
        builder.setCodecs(mediaFormat.getString("codecs-string"));
        builder.setFrameRate(mediaFormat.getFloat("frame-rate", -1.0f));
        builder.setWidth(mediaFormat.getInteger("width", -1));
        builder.setHeight(mediaFormat.getInteger("height", -1));
        builder.setInitializationData(getInitializationData(mediaFormat));
        builder.setLanguage(mediaFormat.getString("language"));
        builder.setMaxInputSize(mediaFormat.getInteger("max-input-size", -1));
        builder.setPcmEncoding(mediaFormat.getInteger("exo-pcm-encoding", -1));
        int i2 = 0;
        builder.setRotationDegrees(mediaFormat.getInteger("rotation-degrees", 0));
        builder.setSampleRate(mediaFormat.getInteger("sample-rate", -1));
        builder.setSelectionFlags(getSelectionFlags(mediaFormat));
        builder.setEncoderDelay(mediaFormat.getInteger("encoder-delay", 0));
        builder.setEncoderPadding(mediaFormat.getInteger("encoder-padding", 0));
        builder.setPixelWidthHeightRatio(mediaFormat.getFloat("pixel-width-height-ratio-float", 1.0f));
        builder.setSubsampleOffsetUs(mediaFormat.getLong("subsample-offset-us-long", Long.MAX_VALUE));
        builder.setAccessibilityChannel(integer);
        while (true) {
            if (i2 >= this.muxedCaptionFormats.size()) {
                break;
            }
            Format format = this.muxedCaptionFormats.get(i2);
            if (Objects.equals(format.sampleMimeType, string) && format.accessibilityChannel == integer) {
                builder.setLanguage(format.language);
                builder.setRoleFlags(format.roleFlags);
                builder.setSelectionFlags(format.selectionFlags);
                builder.setLabel(format.label);
                builder.setLabels(format.labels);
                builder.setMetadata(format.metadata);
                break;
            }
            i2++;
        }
        return builder.build();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int toTrackTypeConstant(String str) {
        if (str == null) {
            return -1;
        }
        switch (str.hashCode()) {
            case -450004177:
                if (str.equals(TtmlNode.TAG_METADATA)) {
                    return 5;
                }
                break;
            case -284840886:
                if (str.equals(EnvironmentCompat.MEDIA_UNKNOWN)) {
                    return -1;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    return 3;
                }
                break;
            case 93166550:
                if (str.equals(MimeTypes.BASE_TYPE_AUDIO)) {
                    return 1;
                }
                break;
            case 112202875:
                if (str.equals(MimeTypes.BASE_TYPE_VIDEO)) {
                    return 2;
                }
                break;
        }
        return MimeTypes.getTrackType(str);
    }

    public void disableSeeking() {
        this.seekingDisabled = true;
    }

    public ChunkIndex getChunkIndex() {
        return this.lastChunkIndex;
    }

    public MediaParser.SeekMap getDummySeekMap() {
        return this.dummySeekMap;
    }

    public Format[] getSampleFormats() {
        if (!this.tracksFoundCalled) {
            return null;
        }
        Format[] formatArr = new Format[this.trackFormats.size()];
        for (int i2 = 0; i2 < this.trackFormats.size(); i2++) {
            Format format = this.trackFormats.get(i2);
            an.B(format);
            formatArr[i2] = format;
        }
        return formatArr;
    }

    public Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> getSeekPoints(long j2) {
        MediaParser.SeekMap seekMap = this.lastSeekMap;
        return seekMap != null ? seekMap.getSeekPoints(j2) : SEEK_POINT_PAIR_START;
    }

    public void onSampleCompleted(int i2, long j2, int i3, int i4, int i5, MediaCodec.CryptoInfo cryptoInfo) {
        long j3 = this.sampleTimestampUpperLimitFilterUs;
        if (j3 == C.TIME_UNSET || j2 < j3) {
            TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
            if (timestampAdjuster != null) {
                j2 = timestampAdjuster.adjustSampleTimestamp(j2);
            }
            TrackOutput trackOutput = this.trackOutputs.get(i2);
            an.B(trackOutput);
            trackOutput.sampleMetadata(j2, i3, i4, i5, toExoPlayerCryptoData(i2, cryptoInfo));
        }
    }

    public void onSampleDataFound(int i2, MediaParser$InputReader mediaParser$InputReader) {
        ensureSpaceForTrackIndex(i2);
        this.scratchDataReaderAdapter.input = mediaParser$InputReader;
        TrackOutput trackOutputTrack = this.trackOutputs.get(i2);
        if (trackOutputTrack == null) {
            trackOutputTrack = this.extractorOutput.track(i2, -1);
            this.trackOutputs.set(i2, trackOutputTrack);
        }
        trackOutputTrack.sampleData((DataReader) this.scratchDataReaderAdapter, (int) mediaParser$InputReader.getLength(), true);
    }

    public void onSeekMapFound(MediaParser.SeekMap seekMap) {
        SeekMap seekMapAdapter;
        if (this.expectDummySeekMap && this.dummySeekMap == null) {
            this.dummySeekMap = seekMap;
            return;
        }
        this.lastSeekMap = seekMap;
        long durationMicros = seekMap.getDurationMicros();
        ExtractorOutput extractorOutput = this.extractorOutput;
        if (this.seekingDisabled) {
            if (durationMicros == SieveCacheKt.NodeMetaAndPreviousMask) {
                durationMicros = C.TIME_UNSET;
            }
            seekMapAdapter = new SeekMap.Unseekable(durationMicros);
        } else {
            seekMapAdapter = new SeekMapAdapter(seekMap);
        }
        extractorOutput.seekMap(seekMapAdapter);
    }

    public void onTrackCountFound(int i2) {
        this.tracksFoundCalled = true;
        maybeEndTracks();
    }

    public void onTrackDataFound(int i2, MediaParser.TrackData trackData) {
        if (maybeObtainChunkIndex(trackData.mediaFormat)) {
            return;
        }
        ensureSpaceForTrackIndex(i2);
        TrackOutput trackOutput = this.trackOutputs.get(i2);
        if (trackOutput == null) {
            String string = trackData.mediaFormat.getString(MEDIA_FORMAT_KEY_TRACK_TYPE);
            String string2 = string != null ? string : trackData.mediaFormat.getString("mime");
            int i3 = this.primaryTrackType;
            int trackTypeConstant = toTrackTypeConstant(string2);
            if (trackTypeConstant == i3) {
                this.primaryTrackIndex = i2;
            }
            TrackOutput trackOutputTrack = this.extractorOutput.track(i2, trackTypeConstant);
            this.trackOutputs.set(i2, trackOutputTrack);
            if (string != null) {
                return;
            } else {
                trackOutput = trackOutputTrack;
            }
        }
        if (trackData.mediaFormat.containsKey("durationUs")) {
            trackOutput.durationUs(trackData.mediaFormat.getLong("durationUs"));
        }
        Format exoPlayerFormat = toExoPlayerFormat(trackData);
        Format format = this.primaryTrackManifestFormat;
        trackOutput.format((format == null || i2 != this.primaryTrackIndex) ? exoPlayerFormat : exoPlayerFormat.withManifestFormatInfo(format));
        this.trackFormats.set(i2, exoPlayerFormat);
        maybeEndTracks();
    }

    public void setExtractorOutput(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    public void setMuxedCaptionFormats(List<Format> list) {
        this.muxedCaptionFormats = list;
    }

    public void setSampleTimestampUpperLimitFilterUs(long j2) {
        this.sampleTimestampUpperLimitFilterUs = j2;
    }

    public void setSelectedParserName(String str) {
        this.containerMimeType = getMimeType(str);
    }

    public void setTimestampAdjuster(TimestampAdjuster timestampAdjuster) {
        this.timestampAdjuster = timestampAdjuster;
    }

    public OutputConsumerAdapterV30() {
        this(null, -2, false);
    }
}
