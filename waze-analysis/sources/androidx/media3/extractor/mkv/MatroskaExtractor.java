package androidx.media3.extractor.mkv;

import android.net.Uri;
import android.util.LongSparseArray;
import android.util.Pair;
import android.util.SparseArray;
import androidx.camera.video.AudioStats;
import androidx.collection.SieveCacheKt;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.WavUtil;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ChunkIndexProvider;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackAwareSeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.metadata.Chapter;
import androidx.media3.extractor.metadata.ThumbnailMetadata;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import androidx.media3.muxer.WebmConstants;
import com.google.d.b.an;
import com.google.d.d.bn;
import com.waze.strings.DisplayStrings;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class MatroskaExtractor implements Extractor {
    private static final int BLOCK_ADDITIONAL_ID_VP9_ITU_T_35 = 4;
    private static final int BLOCK_ADD_ID_TYPE_DVCC = 1685480259;
    private static final int BLOCK_ADD_ID_TYPE_DVVC = 1685485123;
    private static final int BLOCK_STATE_DATA = 2;
    private static final int BLOCK_STATE_HEADER = 1;
    private static final int BLOCK_STATE_START = 0;
    private static final String CODEC_ID_AAC = "A_AAC";
    private static final String CODEC_ID_AC3 = "A_AC3";
    private static final String CODEC_ID_ACM = "A_MS/ACM";
    private static final String CODEC_ID_ALAC = "A_ALAC";
    private static final String CODEC_ID_ASS = "S_TEXT/ASS";
    private static final String CODEC_ID_AV1 = "V_AV1";
    private static final String CODEC_ID_DTS = "A_DTS";
    private static final String CODEC_ID_DTS_EXPRESS = "A_DTS/EXPRESS";
    private static final String CODEC_ID_DTS_LOSSLESS = "A_DTS/LOSSLESS";
    private static final String CODEC_ID_DVBSUB = "S_DVBSUB";
    private static final String CODEC_ID_E_AC3 = "A_EAC3";
    private static final String CODEC_ID_FLAC = "A_FLAC";
    private static final String CODEC_ID_FOURCC = "V_MS/VFW/FOURCC";
    private static final String CODEC_ID_H264 = "V_MPEG4/ISO/AVC";
    private static final String CODEC_ID_H265 = "V_MPEGH/ISO/HEVC";
    private static final String CODEC_ID_MP2 = "A_MPEG/L2";
    private static final String CODEC_ID_MP3 = "A_MPEG/L3";
    private static final String CODEC_ID_MPEG2 = "V_MPEG2";
    private static final String CODEC_ID_MPEG4_AP = "V_MPEG4/ISO/AP";
    private static final String CODEC_ID_MPEG4_ASP = "V_MPEG4/ISO/ASP";
    private static final String CODEC_ID_MPEG4_SP = "V_MPEG4/ISO/SP";
    private static final String CODEC_ID_OPUS = "A_OPUS";
    private static final String CODEC_ID_PCM_FLOAT = "A_PCM/FLOAT/IEEE";
    private static final String CODEC_ID_PCM_INT_BIG = "A_PCM/INT/BIG";
    private static final String CODEC_ID_PCM_INT_LIT = "A_PCM/INT/LIT";
    private static final String CODEC_ID_PGS = "S_HDMV/PGS";
    private static final String CODEC_ID_SSA = "S_TEXT/SSA";
    private static final String CODEC_ID_SUBRIP = "S_TEXT/UTF8";
    private static final String CODEC_ID_THEORA = "V_THEORA";
    private static final String CODEC_ID_TRUEHD = "A_TRUEHD";
    private static final String CODEC_ID_VOBSUB = "S_VOBSUB";
    private static final String CODEC_ID_VORBIS = "A_VORBIS";
    private static final String CODEC_ID_VP8 = "V_VP8";
    private static final String CODEC_ID_VP9 = "V_VP9";
    private static final String CODEC_ID_VTT = "S_TEXT/WEBVTT";
    private static final String DOC_TYPE_MATROSKA = "matroska";
    private static final String DOC_TYPE_WEBM = "webm";
    private static final int ENCRYPTION_IV_SIZE = 8;
    public static final int FLAG_DISABLE_SEEK_FOR_CUES = 1;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 2;
    private static final int FOURCC_COMPRESSION_DIVX = 1482049860;
    private static final int FOURCC_COMPRESSION_H263 = 859189832;
    private static final int FOURCC_COMPRESSION_VC1 = 826496599;
    private static final int ID_AUDIO = 225;
    private static final int ID_AUDIO_BIT_DEPTH = 25188;
    private static final int ID_BLOCK = 161;
    private static final int ID_BLOCK_ADDITIONAL = 165;
    private static final int ID_BLOCK_ADDITIONS = 30113;
    private static final int ID_BLOCK_ADDITION_MAPPING = 16868;
    private static final int ID_BLOCK_ADD_ID = 238;
    private static final int ID_BLOCK_ADD_ID_EXTRA_DATA = 16877;
    private static final int ID_BLOCK_ADD_ID_TYPE = 16871;
    private static final int ID_BLOCK_DURATION = 155;
    private static final int ID_BLOCK_GROUP = 160;
    private static final int ID_BLOCK_MORE = 166;
    private static final int ID_CHANNELS = 159;
    private static final int ID_CHAPTERS = 272869232;
    private static final int ID_CHAPTER_ATOM = 182;
    private static final int ID_CHAPTER_DISPLAY = 128;
    private static final int ID_CHAPTER_FLAG_HIDDEN = 152;
    private static final int ID_CHAPTER_TIME_END = 146;
    private static final int ID_CHAPTER_TIME_START = 145;
    private static final int ID_CHAPTER_TRACK = 143;
    private static final int ID_CHAPTER_TRACK_UID = 137;
    private static final int ID_CHAPTER_UID = 29636;
    private static final int ID_CHAP_LANGUAGE = 17276;
    private static final int ID_CHAP_STRING = 133;
    private static final int ID_CLUSTER = 524531317;
    private static final int ID_CODEC_DELAY = 22186;
    private static final int ID_CODEC_ID = 134;
    private static final int ID_CODEC_PRIVATE = 25506;
    private static final int ID_COLOUR = 21936;
    private static final int ID_COLOUR_BITS_PER_CHANNEL = 21938;
    private static final int ID_COLOUR_PRIMARIES = 21947;
    private static final int ID_COLOUR_RANGE = 21945;
    private static final int ID_COLOUR_TRANSFER = 21946;
    private static final int ID_CONTENT_COMPRESSION = 20532;
    private static final int ID_CONTENT_COMPRESSION_ALGORITHM = 16980;
    private static final int ID_CONTENT_COMPRESSION_SETTINGS = 16981;
    private static final int ID_CONTENT_ENCODING = 25152;
    private static final int ID_CONTENT_ENCODINGS = 28032;
    private static final int ID_CONTENT_ENCODING_ORDER = 20529;
    private static final int ID_CONTENT_ENCODING_SCOPE = 20530;
    private static final int ID_CONTENT_ENCRYPTION = 20533;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS = 18407;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE = 18408;
    private static final int ID_CONTENT_ENCRYPTION_ALGORITHM = 18401;
    private static final int ID_CONTENT_ENCRYPTION_KEY_ID = 18402;
    private static final int ID_CUES = 475249515;
    private static final int ID_CUE_CLUSTER_POSITION = 241;
    private static final int ID_CUE_POINT = 187;
    private static final int ID_CUE_RELATIVE_POSITION = 240;
    private static final int ID_CUE_TIME = 179;
    private static final int ID_CUE_TRACK = 247;
    private static final int ID_CUE_TRACK_POSITIONS = 183;
    private static final int ID_DEFAULT_DURATION = 2352003;
    private static final int ID_DISCARD_PADDING = 30114;
    private static final int ID_DISPLAY_HEIGHT = 21690;
    private static final int ID_DISPLAY_UNIT = 21682;
    private static final int ID_DISPLAY_WIDTH = 21680;
    private static final int ID_DOC_TYPE = 17026;
    private static final int ID_DOC_TYPE_READ_VERSION = 17029;
    private static final int ID_DURATION = 17545;
    private static final int ID_EBML = 440786851;
    private static final int ID_EBML_READ_VERSION = 17143;
    private static final int ID_EDITION_ENTRY = 17849;
    private static final int ID_FLAG_DEFAULT = 136;
    private static final int ID_FLAG_FORCED = 21930;
    private static final int ID_INFO = 357149030;
    private static final int ID_LANGUAGE = 2274716;
    private static final int ID_LUMNINANCE_MAX = 21977;
    private static final int ID_LUMNINANCE_MIN = 21978;
    private static final int ID_MASTERING_METADATA = 21968;
    private static final int ID_MAX_BLOCK_ADDITION_ID = 21998;
    private static final int ID_MAX_CLL = 21948;
    private static final int ID_MAX_FALL = 21949;
    private static final int ID_NAME = 21358;
    private static final int ID_PIXEL_HEIGHT = 186;
    private static final int ID_PIXEL_WIDTH = 176;
    private static final int ID_PRIMARY_B_CHROMATICITY_X = 21973;
    private static final int ID_PRIMARY_B_CHROMATICITY_Y = 21974;
    private static final int ID_PRIMARY_G_CHROMATICITY_X = 21971;
    private static final int ID_PRIMARY_G_CHROMATICITY_Y = 21972;
    private static final int ID_PRIMARY_R_CHROMATICITY_X = 21969;
    private static final int ID_PRIMARY_R_CHROMATICITY_Y = 21970;
    private static final int ID_PROJECTION = 30320;
    private static final int ID_PROJECTION_POSE_PITCH = 30324;
    private static final int ID_PROJECTION_POSE_ROLL = 30325;
    private static final int ID_PROJECTION_POSE_YAW = 30323;
    private static final int ID_PROJECTION_PRIVATE = 30322;
    private static final int ID_PROJECTION_TYPE = 30321;
    private static final int ID_REFERENCE_BLOCK = 251;
    private static final int ID_SAMPLING_FREQUENCY = 181;
    private static final int ID_SEEK = 19899;
    private static final int ID_SEEK_HEAD = 290298740;
    private static final int ID_SEEK_ID = 21419;
    private static final int ID_SEEK_POSITION = 21420;
    private static final int ID_SEEK_PRE_ROLL = 22203;
    private static final int ID_SEGMENT = 408125543;
    private static final int ID_SEGMENT_INFO = 357149030;
    private static final int ID_SIMPLE_BLOCK = 163;
    private static final int ID_STEREO_MODE = 21432;
    private static final int ID_TIMECODE_SCALE = 2807729;
    private static final int ID_TIME_CODE = 231;
    private static final int ID_TRACKS = 374648427;
    private static final int ID_TRACK_ENTRY = 174;
    private static final int ID_TRACK_NUMBER = 215;
    private static final int ID_TRACK_TYPE = 131;
    private static final int ID_TRACK_UID = 29637;
    private static final int ID_VIDEO = 224;
    private static final int ID_WHITE_POINT_CHROMATICITY_X = 21975;
    private static final int ID_WHITE_POINT_CHROMATICITY_Y = 21976;
    private static final int LACING_EBML = 3;
    private static final int LACING_FIXED_SIZE = 2;
    private static final int LACING_NONE = 0;
    private static final int LACING_XIPH = 1;
    private static final int MAX_CHUNKS_TO_SCAN_FOR_THUMBNAIL = 20;
    private static final long MAX_DURATION_US_TO_SCAN_FOR_THUMBNAIL = 10000000;
    private static final int OPUS_MAX_INPUT_SIZE = 5760;
    private static final int SSA_PREFIX_END_TIMECODE_OFFSET = 21;
    private static final String SSA_TIMECODE_FORMAT = "%01d:%02d:%02d:%02d";
    private static final long SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR = 10000;
    private static final int SUBRIP_PREFIX_END_TIMECODE_OFFSET = 19;
    private static final String SUBRIP_TIMECODE_FORMAT = "%02d:%02d:%02d,%03d";
    private static final long SUBRIP_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final String TAG = "MatroskaExtractor";
    private static final Map<String, Integer> TRACK_NAME_TO_ROTATION_DEGREES;
    private static final int UNSET_ENTRY_ID = -1;
    private static final int VORBIS_MAX_INPUT_SIZE = 8192;
    private static final int VTT_PREFIX_END_TIMECODE_OFFSET = 25;
    private static final String VTT_TIMECODE_FORMAT = "%02d:%02d:%02d.%03d";
    private static final long VTT_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final int WAVE_FORMAT_EXTENSIBLE = 65534;
    private static final int WAVE_FORMAT_PCM = 1;
    private static final int WAVE_FORMAT_SIZE = 18;
    private int blockAdditionalId;
    private long blockDurationUs;
    private int blockFlags;
    private long blockGroupDiscardPaddingNs;
    private boolean blockHasReferenceBlock;
    private int blockSampleCount;
    private int blockSampleIndex;
    private int[] blockSampleSizes;
    private int blockState;
    private long blockTimeUs;
    private int blockTrackNumber;
    private int blockTrackNumberLength;
    private final LongSparseArray<ChapterEntry> chapters;
    private long clusterTimecodeUs;
    private long cuesContentPosition;
    private ChapterEntry currentChapter;
    private long currentCueClusterPosition;
    private long currentCueRelativePosition;
    private long currentCueTimeUs;
    private int currentCueTrackNumber;
    private Track currentTrack;
    private long durationTimecode;
    private long durationUs;
    private final ParsableByteArray encryptionInitializationVector;
    private final ParsableByteArray encryptionSubsampleData;
    private ByteBuffer encryptionSubsampleDataBuffer;
    private ExtractorOutput extractorOutput;
    private boolean haveOutputSample;
    private boolean inCuesElement;
    private boolean isWebm;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private final boolean parseSubtitlesDuringExtraction;
    private boolean pendingEndTracks;
    private final SparseArray<List<MatroskaSeekMap.CuePointData>> perTrackCues;
    private int primarySeekTrackNumber;
    private boolean readTracks;
    private final EbmlReader reader;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private boolean sampleEncodingHandled;
    private boolean sampleInitializationVectorRead;
    private int samplePartitionCount;
    private boolean samplePartitionCountRead;
    private byte sampleSignalByte;
    private boolean sampleSignalByteRead;
    private final ParsableByteArray sampleStrippedBytes;
    private final ParsableByteArray scratch;
    private int seekEntryId;
    private final ParsableByteArray seekEntryIdBytes;
    private long seekEntryPosition;
    private boolean seekForCues;
    private final boolean seekForCuesEnabled;
    private boolean seekForTracks;
    private long seekPositionAfterBuildingCues;
    private long seekPositionAfterReadingTracks;
    private long segmentContentPosition;
    private long segmentContentSize;
    private boolean sentSeekMap;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final ParsableByteArray subtitleSample;
    private final ParsableByteArray supplementalData;
    private long timecodeScale;
    private final SparseArray<Track> tracks;
    private long tracksContentPosition;
    private final VarintReader varintReader;
    private final ParsableByteArray vorbisNumPageSamples;

    @Deprecated
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.mkv.MatroskaExtractor$$ExternalSyntheticLambda1
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return MatroskaExtractor.lambda$static$0();
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
    private static final byte[] SUBRIP_PREFIX = {StylePropertiesKt.LineBreakId, 10, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, 58, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, 58, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.HyphensId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.ZIndexId, StylePropertiesKt.FontSynthesisId, StylePropertiesKt.FontSynthesisId, 62, StylePropertiesKt.ZIndexId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, 58, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, 58, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.HyphensId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, 10};
    private static final byte[] SSA_DIALOGUE_FORMAT = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] SSA_PREFIX = {68, 105, 97, 108, 111, 103, 117, 101, 58, StylePropertiesKt.ZIndexId, StylePropertiesKt.LetterSpacingId, 58, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, 58, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, 58, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.HyphensId, StylePropertiesKt.LetterSpacingId, 58, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, 58, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, 58, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.HyphensId};
    private static final byte[] VTT_PREFIX = {87, 69, 66, 86, 84, 84, 10, 10, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, 58, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, 58, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.FontSizeId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.ZIndexId, StylePropertiesKt.FontSynthesisId, StylePropertiesKt.FontSynthesisId, 62, StylePropertiesKt.ZIndexId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, 58, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, 58, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.FontSizeId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LetterSpacingId, 10};
    private static final UUID WAVE_SUBFORMAT_PCM = new UUID(72057594037932032L, -9223371306706625679L);

    /* compiled from: WazeSource */
    public final class ChapterEntry {
        public String chapLanguage;
        public String chapString;
        public String currentDisplayLanguage;
        public String currentDisplayString;
        public boolean flagHidden;
        public long trackUid;
        public long uid;
        public long timeStartNs = C.TIME_UNSET;
        public long timeEndNs = C.TIME_UNSET;
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* compiled from: WazeSource */
    final class InnerEbmlProcessor implements EbmlProcessor {
        final /* synthetic */ MatroskaExtractor this$0;

        private InnerEbmlProcessor(MatroskaExtractor matroskaExtractor) {
            Objects.requireNonNull(matroskaExtractor);
            this.this$0 = matroskaExtractor;
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void binaryElement(int i2, int i3, ExtractorInput extractorInput) throws ParserException {
            this.this$0.binaryElement(i2, i3, extractorInput);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void endMasterElement(int i2) throws ParserException {
            this.this$0.endMasterElement(i2);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void floatElement(int i2, double d2) throws ParserException {
            this.this$0.floatElement(i2, d2);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public int getElementType(int i2) {
            return this.this$0.getElementType(i2);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void integerElement(int i2, long j2) throws ParserException {
            this.this$0.integerElement(i2, j2);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public boolean isLevel1Element(int i2) {
            return this.this$0.isLevel1Element(i2);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void startMasterElement(int i2, long j2, long j3) throws ParserException {
            this.this$0.startMasterElement(i2, j2, j3);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void stringElement(int i2, String str) throws ParserException {
            this.this$0.stringElement(i2, str);
        }
    }

    /* compiled from: WazeSource */
    public final class Track {
        private static final int DEFAULT_MAX_CLL = 1000;
        private static final int DEFAULT_MAX_FALL = 200;
        private static final int DISPLAY_UNIT_PIXELS = 0;
        private static final int MAX_CHROMATICITY = 50000;
        private int blockAddIdType;
        private boolean chaptersMetadataAdded;
        public String codecId;
        public byte[] codecPrivate;
        public TrackOutput.CryptoData cryptoData;
        public int defaultSampleDurationNs;
        public byte[] dolbyVisionConfigBytes;
        public DrmInitData drmInitData;
        public boolean flagForced;
        public Format format;
        public boolean hasContentEncryption;
        public boolean isWebm;
        public int maxBlockAdditionId;
        public int nalUnitLengthFieldLength;
        public String name;
        public int number;
        public TrackOutput output;
        public byte[] sampleStrippedBytes;
        private boolean thumbnailMetadataAdded;
        public TrueHdSampleRechunker trueHdSampleRechunker;
        public int type;
        public long uid;
        public int width = -1;
        public int height = -1;
        public int bitsPerChannel = -1;
        public int displayWidth = -1;
        public int displayHeight = -1;
        public int displayUnit = 0;
        public int projectionType = -1;
        public float projectionPoseYaw = 0.0f;
        public float projectionPosePitch = 0.0f;
        public float projectionPoseRoll = 0.0f;
        public byte[] projectionData = null;
        public int stereoMode = -1;
        public int containerColorSpace = -1;
        public int containerColorTransfer = -1;
        public int containerColorRange = -1;
        public int maxContentLuminance = 1000;
        public int maxFrameAverageLuminance = 200;
        public float primaryRChromaticityX = -1.0f;
        public float primaryRChromaticityY = -1.0f;
        public float primaryGChromaticityX = -1.0f;
        public float primaryGChromaticityY = -1.0f;
        public float primaryBChromaticityX = -1.0f;
        public float primaryBChromaticityY = -1.0f;
        public float whitePointChromaticityX = -1.0f;
        public float whitePointChromaticityY = -1.0f;
        public float maxMasteringLuminance = -1.0f;
        public float minMasteringLuminance = -1.0f;
        public int channelCount = 1;
        public int audioBitDepth = -1;
        public int channelMask = -1;
        public int sampleRate = 8000;
        public long codecDelayNs = 0;
        public long seekPreRollNs = 0;
        public boolean waitingForDtsAnalysis = false;
        public boolean flagDefault = true;
        private String language = "eng";

        protected Track() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void assertOutputInitialized() {
            an.B(this.output);
        }

        private static long findBestThumbnailPresentationTimeUs(List<MatroskaSeekMap.CuePointData> list, long j2, long j3, long j4) {
            long j5;
            long j6;
            if (list.isEmpty()) {
                return C.TIME_UNSET;
            }
            int iMin = Math.min(list.size(), 20);
            int i2 = 0;
            double d2 = AudioStats.AUDIO_AMPLITUDE_NONE;
            int i3 = -1;
            while (i2 < iMin) {
                MatroskaSeekMap.CuePointData cuePointData = list.get(i2);
                if (cuePointData.timeUs > MatroskaExtractor.MAX_DURATION_US_TO_SCAN_FOR_THUMBNAIL) {
                    break;
                }
                int i4 = i2 + 1;
                if (i2 < list.size() - 1) {
                    MatroskaSeekMap.CuePointData cuePointData2 = list.get(i4);
                    long j7 = cuePointData2.clusterPosition + cuePointData2.relativePosition;
                    long j8 = cuePointData.clusterPosition + cuePointData.relativePosition;
                    j6 = cuePointData2.timeUs - cuePointData.timeUs;
                    j5 = j7 - j8;
                } else {
                    j5 = (j3 + j4) - (cuePointData.clusterPosition + cuePointData.relativePosition);
                    j6 = j2 - cuePointData.timeUs;
                }
                if (j6 > 0) {
                    double d3 = j5 / j6;
                    if (d3 > d2) {
                        i3 = i2;
                        d2 = d3;
                    }
                }
                i2 = i4;
            }
            return i3 != -1 ? list.get(i3).timeUs : C.TIME_UNSET;
        }

        private byte[] getCodecPrivate(String str) throws ParserException {
            byte[] bArr = this.codecPrivate;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.createForMalformedContainer("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
        }

        private byte[] getHdrStaticInfo() {
            if (this.primaryRChromaticityX == -1.0f || this.primaryRChromaticityY == -1.0f || this.primaryGChromaticityX == -1.0f || this.primaryGChromaticityY == -1.0f || this.primaryBChromaticityX == -1.0f || this.primaryBChromaticityY == -1.0f || this.whitePointChromaticityX == -1.0f || this.whitePointChromaticityY == -1.0f || this.maxMasteringLuminance == -1.0f || this.minMasteringLuminance == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.primaryRChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryRChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryGChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryGChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryBChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryBChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.whitePointChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.whitePointChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.maxMasteringLuminance + 0.5f));
            byteBufferOrder.putShort((short) (this.minMasteringLuminance + 0.5f));
            byteBufferOrder.putShort((short) this.maxContentLuminance);
            byteBufferOrder.putShort((short) this.maxFrameAverageLuminance);
            return bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void maybeAddChaptersMetadata(LongSparseArray<ChapterEntry> longSparseArray) {
            if (this.chaptersMetadataAdded || longSparseArray.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(longSparseArray.size());
            for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                ChapterEntry chapterEntryValueAt = longSparseArray.valueAt(i2);
                long j2 = chapterEntryValueAt.trackUid;
                if (j2 == 0 || j2 == this.uid) {
                    Chapter.Builder builder = new Chapter.Builder();
                    builder.setStartTimeMs(Util.nsToMs(chapterEntryValueAt.timeStartNs));
                    builder.setEndTimeMs(Util.nsToMs(chapterEntryValueAt.timeEndNs));
                    builder.setHidden(chapterEntryValueAt.flagHidden);
                    if (chapterEntryValueAt.chapString != null) {
                        builder.setTitle(new Label(chapterEntryValueAt.chapLanguage, chapterEntryValueAt.chapString));
                    }
                    arrayList.add(builder.build());
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Format format = this.format;
            an.B(format);
            Format.Builder builderBuildUpon = format.buildUpon();
            Metadata metadata = this.format.metadata;
            builderBuildUpon.setMetadata(metadata != null ? metadata.copyWithAppendedEntries((Metadata.Entry[]) arrayList.toArray(new Chapter[0])) : new Metadata(arrayList));
            this.format = builderBuildUpon.build();
            this.chaptersMetadataAdded = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void maybeAddThumbnailMetadata(SparseArray<List<MatroskaSeekMap.CuePointData>> sparseArray, long j2, long j3, long j4) {
            if (this.type != 2) {
                return;
            }
            List<MatroskaSeekMap.CuePointData> list = sparseArray.get(this.number);
            if (this.thumbnailMetadataAdded || list == null || list.isEmpty()) {
                return;
            }
            long jFindBestThumbnailPresentationTimeUs = findBestThumbnailPresentationTimeUs(list, j2, j3, j4);
            if (jFindBestThumbnailPresentationTimeUs != C.TIME_UNSET) {
                Format format = this.format;
                an.B(format);
                Metadata metadata = format.metadata;
                ThumbnailMetadata thumbnailMetadata = new ThumbnailMetadata(jFindBestThumbnailPresentationTimeUs);
                Metadata metadata2 = metadata == null ? new Metadata(thumbnailMetadata) : metadata.copyWithAppendedEntries(thumbnailMetadata);
                Format.Builder builderBuildUpon = this.format.buildUpon();
                builderBuildUpon.setMetadata(metadata2);
                this.format = builderBuildUpon.build();
                this.thumbnailMetadataAdded = true;
            }
        }

        private static Pair<String, List<byte[]>> parseFourCcPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                parsableByteArray.skipBytes(16);
                long littleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
                if (littleEndianUnsignedInt == 1482049860) {
                    return new Pair<>(MimeTypes.VIDEO_DIVX, null);
                }
                if (littleEndianUnsignedInt == 859189832) {
                    return new Pair<>(MimeTypes.VIDEO_H263, null);
                }
                if (littleEndianUnsignedInt != 826496599) {
                    Log.w(MatroskaExtractor.TAG, "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>(MimeTypes.VIDEO_UNKNOWN, null);
                }
                int position = parsableByteArray.getPosition() + 20;
                byte[] data = parsableByteArray.getData();
                while (true) {
                    int length = data.length;
                    if (position >= length - 4) {
                        throw ParserException.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
                    }
                    int i2 = position + 1;
                    if (data[position] == 0 && data[i2] == 0 && data[position + 2] == 1 && data[position + 3] == 15) {
                        return new Pair<>(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(data, position, length)));
                    }
                    position = i2;
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        private boolean parseMsAcmCodecPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                if (littleEndianUnsignedShort == 1) {
                    return true;
                }
                if (littleEndianUnsignedShort == 65534) {
                    parsableByteArray.setPosition(20);
                    int littleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
                    if (WavUtil.isChannelMaskValid(littleEndianUnsignedIntToInt, this.channelCount)) {
                        this.channelMask = WavUtil.mapToAudioFormatChannelMask(littleEndianUnsignedIntToInt);
                    }
                    if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits()) {
                        if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) throws ParserException {
            int i2;
            int i3;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i4 = 0;
                int i5 = 1;
                while (true) {
                    int i6 = bArr[i5];
                    i5++;
                    i2 = i6 & 255;
                    if (i2 != 255) {
                        break;
                    }
                    i4 += 255;
                }
                int i7 = i4 + i2;
                int i8 = 0;
                while (true) {
                    int i9 = bArr[i5];
                    i5++;
                    i3 = i9 & 255;
                    if (i3 != 255) {
                        break;
                    }
                    i8 += 255;
                }
                int i10 = i8 + i3;
                if (bArr[i5] != 1) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i7];
                System.arraycopy(bArr, i5, bArr2, 0, i7);
                int i11 = i5 + i7;
                if (bArr[i11] != 3) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i12 = i11 + i10;
                if (bArr[i12] != 5) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int length = bArr.length - i12;
                byte[] bArr3 = new byte[length];
                System.arraycopy(bArr, i12, bArr3, 0, length);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean samplesHaveSupplementalData(boolean z) {
            return MatroskaExtractor.CODEC_ID_OPUS.equals(this.codecId) ? z : this.maxBlockAdditionId > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x02b2, code lost:
        
            if (r2 == 0) goto L159;
         */
        /* JADX WARN: Code restructure failed: missing block: B:141:0x02c5, code lost:
        
            if (r2 == 0) goto L159;
         */
        /* JADX WARN: Code restructure failed: missing block: B:143:0x02c9, code lost:
        
            r21 = r1;
            r1 = r2;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:110:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:190:0x0445  */
        /* JADX WARN: Removed duplicated region for block: B:193:0x045d  */
        /* JADX WARN: Removed duplicated region for block: B:196:0x046c  */
        /* JADX WARN: Removed duplicated region for block: B:197:0x046f  */
        /* JADX WARN: Removed duplicated region for block: B:200:0x047e  */
        /* JADX WARN: Removed duplicated region for block: B:201:0x0492  */
        /* JADX WARN: Removed duplicated region for block: B:260:0x057b  */
        /* JADX WARN: Removed duplicated region for block: B:279:0x05cb  */
        /* JADX WARN: Removed duplicated region for block: B:284:0x05e6  */
        /* JADX WARN: Removed duplicated region for block: B:285:0x05e9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void initializeFormat(int r25) throws androidx.media3.common.ParserException {
            /*
                Method dump skipped, instructions count: 1772
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mkv.MatroskaExtractor.Track.initializeFormat(int):void");
        }

        public void outputPendingSampleMetadata() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.outputPendingSampleMetadata(this.output, this.cryptoData);
            }
        }

        public void reset() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", Integer.valueOf(DisplayStrings.DS_TRIP_OVERVIEW_NO_NAME_ORIGIN));
        TRACK_NAME_TO_ROTATION_DEGREES = DesugarCollections.unmodifiableMap(map);
    }

    MatroskaExtractor(EbmlReader ebmlReader, int i2, SubtitleParser.Factory factory) {
        this.segmentContentPosition = -1L;
        this.timecodeScale = C.TIME_UNSET;
        this.durationTimecode = C.TIME_UNSET;
        this.durationUs = C.TIME_UNSET;
        this.currentCueTimeUs = C.TIME_UNSET;
        this.currentCueTrackNumber = -1;
        this.currentCueClusterPosition = -1L;
        this.currentCueRelativePosition = -1L;
        this.primarySeekTrackNumber = -1;
        this.cuesContentPosition = -1L;
        this.seekPositionAfterBuildingCues = -1L;
        this.tracksContentPosition = -1L;
        this.seekPositionAfterReadingTracks = -1L;
        this.clusterTimecodeUs = C.TIME_UNSET;
        this.reader = ebmlReader;
        ebmlReader.init(new InnerEbmlProcessor());
        this.subtitleParserFactory = factory;
        this.perTrackCues = new SparseArray<>();
        this.seekForCuesEnabled = 1 == ((i2 & 1) ^ 1);
        this.parseSubtitlesDuringExtraction = (i2 & 2) == 0;
        this.varintReader = new VarintReader();
        this.chapters = new LongSparseArray<>();
        this.tracks = new SparseArray<>();
        this.scratch = new ParsableByteArray(4);
        this.vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.seekEntryIdBytes = new ParsableByteArray(4);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleStrippedBytes = new ParsableByteArray();
        this.subtitleSample = new ParsableByteArray();
        this.encryptionInitializationVector = new ParsableByteArray(8);
        this.encryptionSubsampleData = new ParsableByteArray();
        this.supplementalData = new ParsableByteArray();
        this.blockSampleSizes = new int[1];
        this.pendingEndTracks = true;
    }

    private void assertInCues(int i2) throws ParserException {
        if (this.inCuesElement) {
            return;
        }
        throw ParserException.createForMalformedContainer("Element " + i2 + " must be in a Cues", null);
    }

    private void assertInEditionEntry(int i2) throws ParserException {
        if (this.currentChapter != null) {
            return;
        }
        throw ParserException.createForMalformedContainer("Element " + i2 + " must be in an EditionEntry", null);
    }

    private void assertInTrackEntry(int i2) throws ParserException {
        if (this.currentTrack != null) {
            return;
        }
        throw ParserException.createForMalformedContainer("Element " + i2 + " must be in a TrackEntry", null);
    }

    private void assertInitialized() {
        an.B(this.extractorOutput);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void commitSampleToOutput(androidx.media3.extractor.mkv.MatroskaExtractor.Track r18, long r19, int r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            androidx.media3.extractor.TrueHdSampleRechunker r2 = r1.trueHdSampleRechunker
            r9 = 1
            if (r2 == 0) goto L1c
            r3 = r2
            androidx.media3.extractor.TrackOutput r2 = r1.output
            androidx.media3.extractor.TrackOutput$CryptoData r8 = r1.cryptoData
            r5 = r21
            r6 = r22
            r7 = r23
            r1 = r3
            r3 = r19
            r1.sampleMetadata(r2, r3, r5, r6, r7, r8)
            goto Lc8
        L1c:
            java.lang.String r2 = r1.codecId
            java.lang.String r3 = "S_TEXT/UTF8"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L3e
            java.lang.String r3 = "S_TEXT/ASS"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L3e
            java.lang.String r3 = "S_TEXT/SSA"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L3e
            java.lang.String r3 = "S_TEXT/WEBVTT"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L5a
        L3e:
            int r3 = r0.blockSampleCount
            java.lang.String r4 = "MatroskaExtractor"
            if (r3 <= r9) goto L4a
            java.lang.String r2 = "Skipping subtitle sample in laced block."
            androidx.media3.common.util.Log.w(r4, r2)
            goto L5a
        L4a:
            long r5 = r0.blockDurationUs
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L5d
            java.lang.String r2 = "Skipping subtitle sample with no duration."
            androidx.media3.common.util.Log.w(r4, r2)
        L5a:
            r2 = r22
            goto L9a
        L5d:
            androidx.media3.common.util.ParsableByteArray r3 = r0.subtitleSample
            byte[] r3 = r3.getData()
            setSubtitleEndTime(r2, r5, r3)
            androidx.media3.common.util.ParsableByteArray r2 = r0.subtitleSample
            int r2 = r2.getPosition()
        L6c:
            androidx.media3.common.util.ParsableByteArray r3 = r0.subtitleSample
            int r3 = r3.limit()
            if (r2 >= r3) goto L87
            androidx.media3.common.util.ParsableByteArray r3 = r0.subtitleSample
            byte[] r3 = r3.getData()
            r3 = r3[r2]
            if (r3 != 0) goto L84
            androidx.media3.common.util.ParsableByteArray r3 = r0.subtitleSample
            r3.setLimit(r2)
            goto L87
        L84:
            int r2 = r2 + 1
            goto L6c
        L87:
            androidx.media3.extractor.TrackOutput r2 = r1.output
            androidx.media3.common.util.ParsableByteArray r3 = r0.subtitleSample
            int r4 = r3.limit()
            r2.sampleData(r3, r4)
            androidx.media3.common.util.ParsableByteArray r2 = r0.subtitleSample
            int r2 = r2.limit()
            int r2 = r22 + r2
        L9a:
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r3 = r21 & r3
            if (r3 == 0) goto Lb8
            int r3 = r0.blockSampleCount
            androidx.media3.common.util.ParsableByteArray r4 = r0.supplementalData
            if (r3 <= r9) goto Lab
            r3 = 0
            r4.reset(r3)
            goto Lb8
        Lab:
            int r3 = r4.limit()
            androidx.media3.extractor.TrackOutput r4 = r1.output
            androidx.media3.common.util.ParsableByteArray r5 = r0.supplementalData
            r6 = 2
            r4.sampleData(r5, r3, r6)
            int r2 = r2 + r3
        Lb8:
            r14 = r2
            androidx.media3.extractor.TrackOutput r10 = r1.output
            androidx.media3.extractor.TrackOutput$CryptoData r1 = r1.cryptoData
            r11 = r19
            r13 = r21
            r15 = r23
            r16 = r1
            r10.sampleMetadata(r11, r13, r14, r15, r16)
        Lc8:
            r0.haveOutputSample = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mkv.MatroskaExtractor.commitSampleToOutput(androidx.media3.extractor.mkv.MatroskaExtractor$Track, long, int, int, int):void");
    }

    private static int[] ensureArrayCapacity(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        int length = iArr.length;
        return length >= i2 ? iArr : new int[Math.max(length + length, i2)];
    }

    private int finishWriteSampleData() {
        int i2 = this.sampleBytesWritten;
        resetWriteSampleData();
        return i2;
    }

    private static byte[] formatSubtitleTimecode(long j2, String str, long j3) {
        an.l(j2 != C.TIME_UNSET);
        int i2 = (int) (j2 / 3600000000L);
        long j4 = j2 - (i2 * 3600000000L);
        int i3 = (int) (j4 / 60000000);
        long j5 = j4 - (i3 * 60000000);
        int i4 = (int) (j5 / 1000000);
        return Util.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j5 - (i4 * 1000000)) / j3))));
    }

    private static boolean isCodecSupported(String str) {
        switch (str.hashCode()) {
            case -2095576542:
                return str.equals(CODEC_ID_MPEG4_AP);
            case -2095575984:
                return str.equals(CODEC_ID_MPEG4_SP);
            case -1985379776:
                return str.equals(CODEC_ID_ACM);
            case -1784763192:
                return str.equals(CODEC_ID_TRUEHD);
            case -1730367663:
                return str.equals(CODEC_ID_VORBIS);
            case -1482641358:
                return str.equals(CODEC_ID_MP2);
            case -1482641357:
                return str.equals(CODEC_ID_MP3);
            case -1373388978:
                return str.equals(CODEC_ID_FOURCC);
            case -933872740:
                return str.equals(CODEC_ID_DVBSUB);
            case -538363189:
                return str.equals(CODEC_ID_MPEG4_ASP);
            case -538363109:
                return str.equals(CODEC_ID_H264);
            case -425012669:
                return str.equals(CODEC_ID_VOBSUB);
            case -356037306:
                return str.equals(CODEC_ID_DTS_LOSSLESS);
            case 62923557:
                return str.equals(CODEC_ID_AAC);
            case 62923603:
                return str.equals(CODEC_ID_AC3);
            case 62927045:
                return str.equals(CODEC_ID_DTS);
            case 82318131:
                return str.equals(CODEC_ID_AV1);
            case 82338133:
                return str.equals(CODEC_ID_VP8);
            case 82338134:
                return str.equals(CODEC_ID_VP9);
            case 99146302:
                return str.equals(CODEC_ID_PGS);
            case 444813526:
                return str.equals(CODEC_ID_THEORA);
            case 542569478:
                return str.equals(CODEC_ID_DTS_EXPRESS);
            case 635596514:
                return str.equals(CODEC_ID_PCM_FLOAT);
            case 725948237:
                return str.equals(CODEC_ID_PCM_INT_BIG);
            case 725957860:
                return str.equals(CODEC_ID_PCM_INT_LIT);
            case 738597099:
                return str.equals(CODEC_ID_ASS);
            case 738614379:
                return str.equals(CODEC_ID_SSA);
            case 855502857:
                return str.equals(CODEC_ID_H265);
            case 1045209816:
                return str.equals(CODEC_ID_VTT);
            case 1422270023:
                return str.equals(CODEC_ID_SUBRIP);
            case 1809237540:
                return str.equals(CODEC_ID_MPEG2);
            case 1950640843:
                return str.equals(CODEC_ID_ALAC);
            case 1950749482:
                return str.equals(CODEC_ID_E_AC3);
            case 1950789798:
                return str.equals(CODEC_ID_FLAC);
            case 1951062397:
                return str.equals(CODEC_ID_OPUS);
            default:
                return false;
        }
    }

    static /* synthetic */ Extractor[] lambda$newFactory$0(SubtitleParser.Factory factory) {
        return new Extractor[]{new MatroskaExtractor(factory)};
    }

    static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new MatroskaExtractor(SubtitleParser.Factory.UNSUPPORTED, 2)};
    }

    private void maybeEndTracks() {
        if (this.pendingEndTracks) {
            if (this.tracksContentPosition == -1 || this.readTracks) {
                for (int i2 = 0; i2 < this.tracks.size(); i2++) {
                    if (this.tracks.valueAt(i2).waitingForDtsAnalysis) {
                        return;
                    }
                }
                ExtractorOutput extractorOutput = this.extractorOutput;
                an.B(extractorOutput);
                extractorOutput.endTracks();
                this.pendingEndTracks = false;
            }
        }
    }

    private boolean maybeSeekForCues(PositionHolder positionHolder, long j2) {
        if (this.seekForCues) {
            this.seekPositionAfterBuildingCues = j2;
            positionHolder.position = this.cuesContentPosition;
            this.seekForCues = false;
            return true;
        }
        if (this.sentSeekMap) {
            long j3 = this.seekPositionAfterBuildingCues;
            if (j3 != -1) {
                positionHolder.position = j3;
                this.seekPositionAfterBuildingCues = -1L;
                return true;
            }
        }
        return false;
    }

    private boolean maybeSeekForTracks(PositionHolder positionHolder, long j2) {
        if (this.seekForTracks) {
            this.seekPositionAfterReadingTracks = j2;
            positionHolder.position = this.tracksContentPosition;
            this.seekForTracks = false;
            return true;
        }
        if (this.readTracks) {
            long j3 = this.seekPositionAfterReadingTracks;
            if (j3 != -1) {
                positionHolder.position = j3;
                this.seekPositionAfterReadingTracks = -1L;
                return true;
            }
        }
        return false;
    }

    public static ExtractorsFactory newFactory(final SubtitleParser.Factory factory) {
        return new ExtractorsFactory() { // from class: androidx.media3.extractor.mkv.MatroskaExtractor$$ExternalSyntheticLambda0
            @Override // androidx.media3.extractor.ExtractorsFactory
            public final Extractor[] createExtractors() {
                return MatroskaExtractor.lambda$newFactory$0(factory);
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

    private void readScratch(ExtractorInput extractorInput, int i2) {
        if (this.scratch.limit() >= i2) {
            return;
        }
        if (this.scratch.capacity() < i2) {
            ParsableByteArray parsableByteArray = this.scratch;
            int iCapacity = parsableByteArray.capacity();
            parsableByteArray.ensureCapacity(Math.max(iCapacity + iCapacity, i2));
        }
        ParsableByteArray parsableByteArray2 = this.scratch;
        extractorInput.readFully(parsableByteArray2.getData(), parsableByteArray2.limit(), i2 - parsableByteArray2.limit());
        this.scratch.setLimit(i2);
    }

    private void resetWriteSampleData() {
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.sampleEncodingHandled = false;
        this.sampleSignalByteRead = false;
        this.samplePartitionCountRead = false;
        this.samplePartitionCount = 0;
        this.sampleSignalByte = (byte) 0;
        this.sampleInitializationVectorRead = false;
        this.sampleStrippedBytes.reset(0);
    }

    private long scaleTimecodeToUs(long j2) throws ParserException {
        long j3 = this.timecodeScale;
        if (j3 != C.TIME_UNSET) {
            return Util.scaleLargeTimestamp(j2, j3, 1000L);
        }
        throw ParserException.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r3.equals(androidx.media3.extractor.mkv.MatroskaExtractor.CODEC_ID_SSA) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r3.equals(androidx.media3.extractor.mkv.MatroskaExtractor.CODEC_ID_ASS) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        r3 = formatSubtitleTimecode(r4, androidx.media3.extractor.mkv.MatroskaExtractor.SSA_TIMECODE_FORMAT, 10000);
        r4 = 21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void setSubtitleEndTime(java.lang.String r3, long r4, byte[] r6) {
        /*
            int r0 = r3.hashCode()
            r1 = 1000(0x3e8, double:4.94E-321)
            switch(r0) {
                case 738597099: goto L35;
                case 738614379: goto L2c;
                case 1045209816: goto L1b;
                case 1422270023: goto La;
                default: goto L9;
            }
        L9:
            goto L4d
        La:
            java.lang.String r0 = "S_TEXT/UTF8"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L4d
            java.lang.String r3 = "%02d:%02d:%02d,%03d"
            byte[] r3 = formatSubtitleTimecode(r4, r3, r1)
            r4 = 19
            goto L47
        L1b:
            java.lang.String r0 = "S_TEXT/WEBVTT"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L4d
            java.lang.String r3 = "%02d:%02d:%02d.%03d"
            byte[] r3 = formatSubtitleTimecode(r4, r3, r1)
            r4 = 25
            goto L47
        L2c:
            java.lang.String r0 = "S_TEXT/SSA"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L4d
            goto L3d
        L35:
            java.lang.String r0 = "S_TEXT/ASS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L4d
        L3d:
            java.lang.String r3 = "%01d:%02d:%02d:%02d"
            r0 = 10000(0x2710, double:4.9407E-320)
            byte[] r3 = formatSubtitleTimecode(r4, r3, r0)
            r4 = 21
        L47:
            r5 = 0
            int r0 = r3.length
            java.lang.System.arraycopy(r3, r5, r6, r4, r0)
            return
        L4d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mkv.MatroskaExtractor.setSubtitleEndTime(java.lang.String, long, byte[]):void");
    }

    private void updateTrackFormatWithMetadata(Track track) {
        track.maybeAddChaptersMetadata(this.chapters);
        track.maybeAddThumbnailMetadata(this.perTrackCues, this.durationUs, this.segmentContentPosition, this.segmentContentSize);
    }

    private int writeSampleData(ExtractorInput extractorInput, Track track, int i2, boolean z) throws ParserException {
        int i3;
        String str = track.codecId;
        if (CODEC_ID_SUBRIP.equals(str)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i2);
            return finishWriteSampleData();
        }
        if (CODEC_ID_ASS.equals(str) || CODEC_ID_SSA.equals(str)) {
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i2);
            return finishWriteSampleData();
        }
        if (CODEC_ID_VTT.equals(str)) {
            writeSubtitleSampleData(extractorInput, VTT_PREFIX, i2);
            return finishWriteSampleData();
        }
        if (track.waitingForDtsAnalysis) {
            an.B(track.format);
            track.format = DtsUtil.updateFormatWithDtsHdInfo(extractorInput, i2, track.format);
            track.output.format(track.format);
            track.waitingForDtsAnalysis = false;
            maybeEndTracks();
        }
        TrackOutput trackOutput = track.output;
        if (!this.sampleEncodingHandled) {
            if (track.hasContentEncryption) {
                this.blockFlags &= -1073741825;
                if (!this.sampleSignalByteRead) {
                    extractorInput.readFully(this.scratch.getData(), 0, 1);
                    this.sampleBytesRead++;
                    if ((this.scratch.getData()[0] & 128) == 128) {
                        throw ParserException.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.sampleSignalByte = this.scratch.getData()[0];
                    this.sampleSignalByteRead = true;
                }
                byte b2 = this.sampleSignalByte;
                if ((b2 & 1) == 1) {
                    int i4 = b2 & 2;
                    this.blockFlags |= 1073741824;
                    if (!this.sampleInitializationVectorRead) {
                        extractorInput.readFully(this.encryptionInitializationVector.getData(), 0, 8);
                        this.sampleBytesRead += 8;
                        this.sampleInitializationVectorRead = true;
                        this.scratch.getData()[0] = (byte) ((i4 != 2 ? 0 : 128) | 8);
                        this.scratch.setPosition(0);
                        trackOutput.sampleData(this.scratch, 1, 1);
                        this.sampleBytesWritten++;
                        this.encryptionInitializationVector.setPosition(0);
                        trackOutput.sampleData(this.encryptionInitializationVector, 8, 1);
                        this.sampleBytesWritten += 8;
                    }
                    if (i4 == 2) {
                        if (!this.samplePartitionCountRead) {
                            extractorInput.readFully(this.scratch.getData(), 0, 1);
                            this.sampleBytesRead++;
                            this.scratch.setPosition(0);
                            this.samplePartitionCount = this.scratch.readUnsignedByte();
                            this.samplePartitionCountRead = true;
                        }
                        int i5 = this.samplePartitionCount * 4;
                        this.scratch.reset(i5);
                        extractorInput.readFully(this.scratch.getData(), 0, i5);
                        this.sampleBytesRead += i5;
                        short s = (short) ((this.samplePartitionCount / 2) + 1);
                        int i6 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                        if (byteBuffer == null || byteBuffer.capacity() < i6) {
                            this.encryptionSubsampleDataBuffer = ByteBuffer.allocate(i6);
                        }
                        this.encryptionSubsampleDataBuffer.position(0);
                        this.encryptionSubsampleDataBuffer.putShort(s);
                        int i7 = 0;
                        int i8 = 0;
                        while (true) {
                            i3 = this.samplePartitionCount;
                            if (i7 >= i3) {
                                break;
                            }
                            int i9 = i7 % 2;
                            int unsignedIntToInt = this.scratch.readUnsignedIntToInt();
                            int i10 = unsignedIntToInt - i8;
                            ByteBuffer byteBuffer2 = this.encryptionSubsampleDataBuffer;
                            if (i9 == 0) {
                                byteBuffer2.putShort((short) i10);
                            } else {
                                byteBuffer2.putInt(i10);
                            }
                            i7++;
                            i8 = unsignedIntToInt;
                        }
                        int i11 = (i2 - this.sampleBytesRead) - i8;
                        int i12 = i3 % 2;
                        ByteBuffer byteBuffer3 = this.encryptionSubsampleDataBuffer;
                        if (i12 == 1) {
                            byteBuffer3.putInt(i11);
                        } else {
                            byteBuffer3.putShort((short) i11);
                            this.encryptionSubsampleDataBuffer.putInt(0);
                        }
                        this.encryptionSubsampleData.reset(this.encryptionSubsampleDataBuffer.array(), i6);
                        trackOutput.sampleData(this.encryptionSubsampleData, i6, 1);
                        this.sampleBytesWritten += i6;
                    }
                }
            } else {
                byte[] bArr = track.sampleStrippedBytes;
                if (bArr != null) {
                    this.sampleStrippedBytes.reset(bArr, bArr.length);
                }
            }
            if (track.samplesHaveSupplementalData(z)) {
                this.blockFlags |= 268435456;
                this.supplementalData.reset(0);
                int iLimit = (this.sampleStrippedBytes.limit() + i2) - this.sampleBytesRead;
                this.scratch.reset(4);
                this.scratch.getData()[0] = (byte) ((iLimit >> 24) & 255);
                this.scratch.getData()[1] = (byte) ((iLimit >> 16) & 255);
                this.scratch.getData()[2] = (byte) ((iLimit >> 8) & 255);
                this.scratch.getData()[3] = (byte) (iLimit & 255);
                trackOutput.sampleData(this.scratch, 4, 2);
                this.sampleBytesWritten += 4;
            }
            this.sampleEncodingHandled = true;
        }
        int iLimit2 = i2 + this.sampleStrippedBytes.limit();
        String str2 = track.codecId;
        if (!CODEC_ID_H264.equals(str2) && !CODEC_ID_H265.equals(str2)) {
            if (track.trueHdSampleRechunker != null) {
                an.u(this.sampleStrippedBytes.limit() == 0);
                track.trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i13 = this.sampleBytesRead;
                if (i13 >= iLimit2) {
                    break;
                }
                int iWriteToOutput = writeToOutput(extractorInput, trackOutput, iLimit2 - i13);
                this.sampleBytesRead += iWriteToOutput;
                this.sampleBytesWritten += iWriteToOutput;
            }
        } else {
            byte[] data = this.nalLength.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i14 = track.nalUnitLengthFieldLength;
            int i15 = 4 - i14;
            while (this.sampleBytesRead < iLimit2) {
                int i16 = this.sampleCurrentNalBytesRemaining;
                if (i16 == 0) {
                    writeToTarget(extractorInput, data, i15, i14);
                    this.sampleBytesRead += i14;
                    this.nalLength.setPosition(0);
                    this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                } else {
                    int iWriteToOutput2 = writeToOutput(extractorInput, trackOutput, i16);
                    this.sampleBytesRead += iWriteToOutput2;
                    this.sampleBytesWritten += iWriteToOutput2;
                    this.sampleCurrentNalBytesRemaining -= iWriteToOutput2;
                }
            }
        }
        if (CODEC_ID_VORBIS.equals(track.codecId)) {
            this.vorbisNumPageSamples.setPosition(0);
            trackOutput.sampleData(this.vorbisNumPageSamples, 4);
            this.sampleBytesWritten += 4;
        }
        return finishWriteSampleData();
    }

    private void writeSubtitleSampleData(ExtractorInput extractorInput, byte[] bArr, int i2) {
        int length = bArr.length;
        int i3 = length + i2;
        int iCapacity = this.subtitleSample.capacity();
        ParsableByteArray parsableByteArray = this.subtitleSample;
        if (iCapacity < i3) {
            parsableByteArray.reset(Arrays.copyOf(bArr, i3 + i2));
        } else {
            System.arraycopy(bArr, 0, parsableByteArray.getData(), 0, length);
        }
        extractorInput.readFully(this.subtitleSample.getData(), length, i2);
        this.subtitleSample.setPosition(0);
        this.subtitleSample.setLimit(i3);
    }

    private int writeToOutput(ExtractorInput extractorInput, TrackOutput trackOutput, int i2) {
        int iBytesLeft = this.sampleStrippedBytes.bytesLeft();
        if (iBytesLeft <= 0) {
            return trackOutput.sampleData((DataReader) extractorInput, i2, false);
        }
        int iMin = Math.min(i2, iBytesLeft);
        trackOutput.sampleData(this.sampleStrippedBytes, iMin);
        return iMin;
    }

    private void writeToTarget(ExtractorInput extractorInput, byte[] bArr, int i2, int i3) {
        int iMin = Math.min(i3, this.sampleStrippedBytes.bytesLeft());
        extractorInput.readFully(bArr, i2 + iMin, i3 - iMin);
        if (iMin > 0) {
            this.sampleStrippedBytes.readBytes(bArr, i2, iMin);
        }
    }

    protected void binaryElement(int i2, int i3, ExtractorInput extractorInput) throws ParserException {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j2;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14 = i2;
        ExtractorInput extractorInput2 = extractorInput;
        int i15 = 2;
        int i16 = 0;
        if (i14 != 161 && i14 != 163) {
            if (i14 == 165) {
                if (this.blockState != 2) {
                    return;
                }
                handleBlockAdditionalData(this.tracks.get(this.blockTrackNumber), this.blockAdditionalId, extractorInput2, i3);
                return;
            }
            if (i14 == ID_BLOCK_ADD_ID_EXTRA_DATA) {
                handleBlockAddIDExtraData(getCurrentTrack(i2), extractorInput2, i3);
                return;
            }
            if (i14 == ID_CONTENT_COMPRESSION_SETTINGS) {
                assertInTrackEntry(i2);
                Track track = this.currentTrack;
                track.sampleStrippedBytes = new byte[i3];
                extractorInput2.readFully(track.sampleStrippedBytes, 0, i3);
                return;
            }
            if (i14 == ID_CONTENT_ENCRYPTION_KEY_ID) {
                byte[] bArr = new byte[i3];
                extractorInput2.readFully(bArr, 0, i3);
                getCurrentTrack(i2).cryptoData = new TrackOutput.CryptoData(1, bArr, 0, 0);
                return;
            }
            if (i14 == 21419) {
                Arrays.fill(this.seekEntryIdBytes.getData(), (byte) 0);
                extractorInput2.readFully(this.seekEntryIdBytes.getData(), 4 - i3, i3);
                this.seekEntryIdBytes.setPosition(0);
                this.seekEntryId = (int) this.seekEntryIdBytes.readUnsignedInt();
                return;
            }
            if (i14 == 25506) {
                assertInTrackEntry(i2);
                Track track2 = this.currentTrack;
                track2.codecPrivate = new byte[i3];
                extractorInput2.readFully(track2.codecPrivate, 0, i3);
                return;
            }
            if (i14 != ID_PROJECTION_PRIVATE) {
                throw ParserException.createForMalformedContainer("Unexpected id: " + i14, null);
            }
            assertInTrackEntry(i2);
            Track track3 = this.currentTrack;
            track3.projectionData = new byte[i3];
            extractorInput2.readFully(track3.projectionData, 0, i3);
            return;
        }
        int i17 = 8;
        if (this.blockState == 0) {
            this.blockTrackNumber = (int) this.varintReader.readUnsignedVarint(extractorInput2, false, true, 8);
            this.blockTrackNumberLength = this.varintReader.getLastLength();
            this.blockDurationUs = C.TIME_UNSET;
            this.blockState = 1;
            this.scratch.reset(0);
        }
        Track track4 = this.tracks.get(this.blockTrackNumber);
        if (track4 == null) {
            extractorInput2.skipFully(i3 - this.blockTrackNumberLength);
            this.blockState = 0;
            return;
        }
        track4.assertOutputInitialized();
        if (this.blockState == 1) {
            readScratch(extractorInput2, 3);
            int i18 = (this.scratch.getData()[2] & 6) >> 1;
            if (i18 == 0) {
                this.blockSampleCount = 1;
                int[] iArrEnsureArrayCapacity = ensureArrayCapacity(this.blockSampleSizes, 1);
                this.blockSampleSizes = iArrEnsureArrayCapacity;
                iArrEnsureArrayCapacity[0] = (i3 - this.blockTrackNumberLength) - 3;
            } else {
                readScratch(extractorInput2, 4);
                int i19 = (this.scratch.getData()[3] & 255) + 1;
                this.blockSampleCount = i19;
                int[] iArrEnsureArrayCapacity2 = ensureArrayCapacity(this.blockSampleSizes, i19);
                this.blockSampleSizes = iArrEnsureArrayCapacity2;
                if (i18 == 2) {
                    int i20 = (i3 - this.blockTrackNumberLength) - 4;
                    int i21 = this.blockSampleCount;
                    Arrays.fill(iArrEnsureArrayCapacity2, 0, i21, i20 / i21);
                } else {
                    if (i18 != 1) {
                        if (i18 != 3) {
                            throw ParserException.createForMalformedContainer("Unexpected lacing value: 2", null);
                        }
                        int i22 = 0;
                        int i23 = 0;
                        int i24 = 4;
                        while (true) {
                            int i25 = this.blockSampleCount - 1;
                            i5 = i16;
                            int[] iArr2 = this.blockSampleSizes;
                            if (i22 >= i25) {
                                i6 = i15;
                                iArr2[i25] = ((i3 - this.blockTrackNumberLength) - i24) - i23;
                                break;
                            }
                            iArr2[i22] = i5;
                            int i26 = i24 + 1;
                            readScratch(extractorInput2, i26);
                            if (this.scratch.getData()[i24] == 0) {
                                throw ParserException.createForMalformedContainer("No valid varint length mask found", null);
                            }
                            int i27 = i5;
                            while (true) {
                                if (i27 >= i17) {
                                    i7 = i15;
                                    i8 = i17;
                                    i9 = i22;
                                    j2 = 0;
                                    break;
                                }
                                i8 = i17;
                                int i28 = 1 << (7 - i27);
                                i7 = i15;
                                if ((this.scratch.getData()[i24] & i28) != 0) {
                                    i26 += i27;
                                    readScratch(extractorInput2, i26);
                                    int i29 = i24 + 1;
                                    j2 = this.scratch.getData()[i24] & 255 & (~i28);
                                    while (true) {
                                        int i30 = i29;
                                        if (i30 >= i26) {
                                            break;
                                        }
                                        i29 = i30 + 1;
                                        j2 = (j2 << i8) | (this.scratch.getData()[i30] & 255);
                                        i22 = i22;
                                    }
                                    i9 = i22;
                                    if (i9 > 0) {
                                        j2 -= (1 << ((i27 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i27++;
                                    extractorInput2 = extractorInput;
                                    i15 = i7;
                                    i17 = i8;
                                }
                            }
                            i24 = i26;
                            if (j2 < SieveCacheKt.NodeMetaAndPreviousMask || j2 > SieveCacheKt.NodeLinkMask) {
                                break;
                            }
                            int[] iArr3 = this.blockSampleSizes;
                            int i31 = (int) j2;
                            if (i9 != 0) {
                                i31 += iArr3[i9 - 1];
                            }
                            iArr3[i9] = i31;
                            i23 += i31;
                            i22 = i9 + 1;
                            extractorInput2 = extractorInput;
                            i16 = i5;
                            i15 = i7;
                            i17 = i8;
                        }
                        throw ParserException.createForMalformedContainer("EBML lacing sample size out of range.", null);
                    }
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 4;
                    while (true) {
                        i10 = this.blockSampleCount - 1;
                        iArr = this.blockSampleSizes;
                        if (i32 >= i10) {
                            break;
                        }
                        iArr[i32] = 0;
                        while (true) {
                            i11 = i34 + 1;
                            readScratch(extractorInput2, i11);
                            int i35 = this.scratch.getData()[i34] & 255;
                            int[] iArr4 = this.blockSampleSizes;
                            i12 = iArr4[i32] + i35;
                            iArr4[i32] = i12;
                            if (i35 != 255) {
                                break;
                            } else {
                                i34 = i11;
                            }
                        }
                        i33 += i12;
                        i32++;
                        i34 = i11;
                    }
                    iArr[i10] = ((i3 - this.blockTrackNumberLength) - i34) - i33;
                }
            }
            i6 = 2;
            i5 = 0;
            this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((this.scratch.getData()[i5] << 8) | (this.scratch.getData()[1] & 255));
            if (track4.type == 1) {
                i13 = 1;
            } else if (i14 == 163) {
                i13 = (this.scratch.getData()[i6] & 128) == 128 ? 1 : i5;
                i14 = 163;
            } else {
                i13 = i5;
            }
            this.blockFlags = i13;
            this.blockState = i6;
            this.blockSampleIndex = i5;
            i4 = 163;
        } else {
            i4 = 163;
        }
        if (i14 == i4) {
            while (true) {
                int i36 = this.blockSampleIndex;
                if (i36 >= this.blockSampleCount) {
                    this.blockState = 0;
                    return;
                }
                int iWriteSampleData = writeSampleData(extractorInput, track4, this.blockSampleSizes[i36], false);
                Track track5 = track4;
                commitSampleToOutput(track5, this.blockTimeUs + ((this.blockSampleIndex * track4.defaultSampleDurationNs) / 1000), this.blockFlags, iWriteSampleData, 0);
                this.blockSampleIndex++;
                track4 = track5;
            }
        } else {
            while (true) {
                int i37 = this.blockSampleIndex;
                if (i37 >= this.blockSampleCount) {
                    return;
                }
                int[] iArr5 = this.blockSampleSizes;
                iArr5[i37] = writeSampleData(extractorInput, track4, iArr5[i37], true);
                this.blockSampleIndex++;
            }
        }
    }

    protected void endMasterElement(int i2) throws ParserException {
        String str;
        int i3;
        SparseArray<List<MatroskaSeekMap.CuePointData>> sparseArray;
        int i4;
        assertInitialized();
        if (i2 == 128) {
            ChapterEntry chapterEntry = this.currentChapter;
            an.B(chapterEntry);
            if (chapterEntry.chapString != null || (str = chapterEntry.currentDisplayString) == null) {
                return;
            }
            chapterEntry.chapString = str;
            String str2 = chapterEntry.currentDisplayLanguage;
            if (str2 != null) {
                chapterEntry.chapLanguage = str2;
                return;
            }
            return;
        }
        int i5 = 0;
        if (i2 == 160) {
            if (this.blockState == 2) {
                Track track = this.tracks.get(this.blockTrackNumber);
                track.assertOutputInitialized();
                if (this.blockGroupDiscardPaddingNs > 0 && CODEC_ID_OPUS.equals(track.codecId)) {
                    this.supplementalData.reset(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.blockGroupDiscardPaddingNs).array());
                }
                int i6 = 0;
                for (int i7 = 0; i7 < this.blockSampleCount; i7++) {
                    i6 += this.blockSampleSizes[i7];
                }
                int i8 = 0;
                while (i8 < this.blockSampleCount) {
                    long j2 = this.blockTimeUs + ((track.defaultSampleDurationNs * i8) / 1000);
                    int i9 = this.blockFlags;
                    if (i8 == 0) {
                        if (!this.blockHasReferenceBlock) {
                            i9 |= 1;
                        }
                        i3 = 0;
                    } else {
                        i3 = i8;
                    }
                    int i10 = this.blockSampleSizes[i3];
                    int i11 = i6 - i10;
                    commitSampleToOutput(track, j2, i9, i10, i11);
                    i8 = i3 + 1;
                    i6 = i11;
                }
                this.blockState = 0;
                return;
            }
            return;
        }
        if (i2 == 174) {
            Track track2 = this.currentTrack;
            an.B(track2);
            String str3 = track2.codecId;
            if (str3 == null) {
                throw ParserException.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
            }
            if (isCodecSupported(str3)) {
                track2.initializeFormat(track2.number);
                track2.output = this.extractorOutput.track(track2.number, track2.type);
                this.tracks.put(track2.number, track2);
            }
            this.currentTrack = null;
            return;
        }
        if (i2 == ID_EDITION_ENTRY) {
            while (i5 < this.tracks.size()) {
                updateTrackFormatWithMetadata(this.tracks.valueAt(i5));
                i5++;
            }
            return;
        }
        if (i2 == 19899) {
            int i12 = this.seekEntryId;
            if (i12 != -1) {
                long j3 = this.seekEntryPosition;
                if (j3 != -1) {
                    if (i12 == 475249515) {
                        this.cuesContentPosition = j3;
                        return;
                    } else {
                        if (i12 == 374648427) {
                            this.tracksContentPosition = j3;
                            return;
                        }
                        return;
                    }
                }
            }
            throw ParserException.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i2 == ID_CONTENT_ENCODING) {
            assertInTrackEntry(i2);
            Track track3 = this.currentTrack;
            if (track3.hasContentEncryption) {
                if (track3.cryptoData == null) {
                    throw ParserException.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                track3.drmInitData = new DrmInitData(new DrmInitData.SchemeData(C.UUID_NIL, MimeTypes.VIDEO_WEBM, this.currentTrack.cryptoData.encryptionKey));
                return;
            }
            return;
        }
        if (i2 == ID_CONTENT_ENCODINGS) {
            assertInTrackEntry(i2);
            Track track4 = this.currentTrack;
            if (track4.hasContentEncryption && track4.sampleStrippedBytes != null) {
                throw ParserException.createForMalformedContainer("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i2 == 357149030) {
            if (this.timecodeScale == C.TIME_UNSET) {
                this.timecodeScale = 1000000L;
            }
            long j4 = this.durationTimecode;
            if (j4 != C.TIME_UNSET) {
                this.durationUs = scaleTimecodeToUs(j4);
                return;
            }
            return;
        }
        if (i2 == 374648427) {
            if (this.tracks.size() == 0) {
                throw ParserException.createForMalformedContainer("No valid tracks were found", null);
            }
            boolean z = !this.seekForCuesEnabled || this.cuesContentPosition == -1 || this.sentSeekMap;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            for (int i17 = 0; i17 < this.tracks.size(); i17++) {
                Track trackValueAt = this.tracks.valueAt(i17);
                int i18 = trackValueAt.type;
                if (i18 == 2) {
                    if (trackValueAt.flagDefault) {
                        i13 = trackValueAt.number;
                    }
                    if (i14 == -1) {
                        i14 = trackValueAt.number;
                    }
                } else if (i18 == 1) {
                    if (trackValueAt.flagDefault) {
                        i15 = trackValueAt.number;
                    }
                    if (i16 == -1) {
                        i16 = trackValueAt.number;
                    }
                }
                if (z && !trackValueAt.waitingForDtsAnalysis) {
                    updateTrackFormatWithMetadata(trackValueAt);
                    trackValueAt.assertOutputInitialized();
                    TrackOutput trackOutput = trackValueAt.output;
                    Format format = trackValueAt.format;
                    an.B(format);
                    trackOutput.format(format);
                }
            }
            if (i13 != -1) {
                this.primarySeekTrackNumber = i13;
            } else if (i14 != -1) {
                this.primarySeekTrackNumber = i14;
            } else if (i15 != -1) {
                this.primarySeekTrackNumber = i15;
            } else if (i16 != -1) {
                this.primarySeekTrackNumber = i16;
            } else {
                this.primarySeekTrackNumber = this.tracks.size() > 0 ? this.tracks.valueAt(0).number : -1;
            }
            this.readTracks = true;
            if (z) {
                maybeEndTracks();
                return;
            }
            return;
        }
        if (i2 != 475249515) {
            if (i2 == 182) {
                ChapterEntry chapterEntry2 = this.currentChapter;
                an.B(chapterEntry2);
                long j5 = chapterEntry2.uid;
                if (j5 != 0) {
                    this.chapters.put(j5, chapterEntry2);
                }
                this.currentChapter = null;
                return;
            }
            if (i2 == 183 && !this.sentSeekMap) {
                assertInCues(i2);
                if (this.currentCueTimeUs == C.TIME_UNSET || (i4 = this.currentCueTrackNumber) == -1 || this.currentCueClusterPosition == -1) {
                    return;
                }
                List<MatroskaSeekMap.CuePointData> arrayList = this.perTrackCues.get(i4);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.perTrackCues.put(this.currentCueTrackNumber, arrayList);
                }
                arrayList.add(new MatroskaSeekMap.CuePointData(this.currentCueTimeUs, this.segmentContentPosition + this.currentCueClusterPosition, this.currentCueRelativePosition));
                return;
            }
            return;
        }
        if (this.sentSeekMap) {
            return;
        }
        int i19 = 0;
        while (true) {
            if (i19 >= this.perTrackCues.size()) {
                break;
            }
            if (this.perTrackCues.valueAt(i19).isEmpty()) {
                i19++;
            } else {
                if (this.durationUs == C.TIME_UNSET) {
                    break;
                }
                int i20 = 0;
                while (true) {
                    int size = this.perTrackCues.size();
                    sparseArray = this.perTrackCues;
                    if (i20 >= size) {
                        break;
                    }
                    Collections.sort(sparseArray.valueAt(i20));
                    i20++;
                }
                this.extractorOutput.seekMap(new MatroskaSeekMap(sparseArray, this.durationUs, this.primarySeekTrackNumber, this.segmentContentPosition, this.segmentContentSize));
            }
        }
        this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
        this.sentSeekMap = true;
        this.inCuesElement = false;
        while (i5 < this.tracks.size()) {
            Track trackValueAt2 = this.tracks.valueAt(i5);
            if (!trackValueAt2.waitingForDtsAnalysis) {
                updateTrackFormatWithMetadata(trackValueAt2);
                trackValueAt2.assertOutputInitialized();
                TrackOutput trackOutput2 = trackValueAt2.output;
                Format format2 = trackValueAt2.format;
                an.B(format2);
                trackOutput2.format(format2);
            }
            i5++;
        }
        maybeEndTracks();
    }

    protected void floatElement(int i2, double d2) throws ParserException {
        if (i2 == 181) {
            getCurrentTrack(i2).sampleRate = (int) d2;
            return;
        }
        if (i2 == 17545) {
            this.durationTimecode = (long) d2;
            return;
        }
        switch (i2) {
            case 21969:
                getCurrentTrack(i2).primaryRChromaticityX = (float) d2;
                break;
            case 21970:
                getCurrentTrack(i2).primaryRChromaticityY = (float) d2;
                break;
            case 21971:
                getCurrentTrack(i2).primaryGChromaticityX = (float) d2;
                break;
            case 21972:
                getCurrentTrack(i2).primaryGChromaticityY = (float) d2;
                break;
            case 21973:
                getCurrentTrack(i2).primaryBChromaticityX = (float) d2;
                break;
            case 21974:
                getCurrentTrack(i2).primaryBChromaticityY = (float) d2;
                break;
            case 21975:
                getCurrentTrack(i2).whitePointChromaticityX = (float) d2;
                break;
            case 21976:
                getCurrentTrack(i2).whitePointChromaticityY = (float) d2;
                break;
            case 21977:
                getCurrentTrack(i2).maxMasteringLuminance = (float) d2;
                break;
            case 21978:
                getCurrentTrack(i2).minMasteringLuminance = (float) d2;
                break;
            default:
                switch (i2) {
                    case ID_PROJECTION_POSE_YAW /* 30323 */:
                        getCurrentTrack(i2).projectionPoseYaw = (float) d2;
                        break;
                    case ID_PROJECTION_POSE_PITCH /* 30324 */:
                        getCurrentTrack(i2).projectionPosePitch = (float) d2;
                        break;
                    case ID_PROJECTION_POSE_ROLL /* 30325 */:
                        getCurrentTrack(i2).projectionPoseRoll = (float) d2;
                        break;
                }
        }
    }

    protected ChapterEntry getCurrentChapter(int i2) throws ParserException {
        assertInEditionEntry(i2);
        return this.currentChapter;
    }

    protected Track getCurrentTrack(int i2) throws ParserException {
        assertInTrackEntry(i2);
        return this.currentTrack;
    }

    protected int getElementType(int i2) {
        switch (i2) {
            case 128:
            case 143:
            case 160:
            case 166:
            case 174:
            case 182:
            case 183:
            case 187:
            case 224:
            case 225:
            case ID_BLOCK_ADDITION_MAPPING /* 16868 */:
            case ID_EDITION_ENTRY /* 17849 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS /* 18407 */:
            case 19899:
            case ID_CONTENT_COMPRESSION /* 20532 */:
            case ID_CONTENT_ENCRYPTION /* 20533 */:
            case 21936:
            case 21968:
            case ID_CONTENT_ENCODING /* 25152 */:
            case ID_CONTENT_ENCODINGS /* 28032 */:
            case 30113:
            case ID_PROJECTION /* 30320 */:
            case ID_CHAPTERS /* 272869232 */:
            case 290298740:
            case WebmConstants.MkvEbmlElement.INFO /* 357149030 */:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 131:
            case 136:
            case 137:
            case 145:
            case 146:
            case 152:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 240:
            case 241:
            case 247:
            case 251:
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
            case 17029:
            case 17143:
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
            case ID_CONTENT_ENCODING_ORDER /* 20529 */:
            case ID_CONTENT_ENCODING_SCOPE /* 20530 */:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case ID_COLOUR_BITS_PER_CHANNEL /* 21938 */:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case ID_CODEC_DELAY /* 22186 */:
            case ID_SEEK_PRE_ROLL /* 22203 */:
            case 25188:
            case ID_CHAPTER_UID /* 29636 */:
            case 29637:
            case ID_DISCARD_PADDING /* 30114 */:
            case ID_PROJECTION_TYPE /* 30321 */:
            case 2352003:
            case 2807729:
                return 2;
            case 133:
            case 134:
            case 17026:
            case ID_CHAP_LANGUAGE /* 17276 */:
            case 21358:
            case 2274716:
                return 3;
            case 161:
            case 163:
            case 165:
            case ID_BLOCK_ADD_ID_EXTRA_DATA /* 16877 */:
            case ID_CONTENT_COMPRESSION_SETTINGS /* 16981 */:
            case ID_CONTENT_ENCRYPTION_KEY_ID /* 18402 */:
            case 21419:
            case 25506:
            case ID_PROJECTION_PRIVATE /* 30322 */:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case ID_PROJECTION_POSE_YAW /* 30323 */:
            case ID_PROJECTION_POSE_PITCH /* 30324 */:
            case ID_PROJECTION_POSE_ROLL /* 30325 */:
                return 5;
            default:
                return 0;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public /* synthetic */ List getSniffFailureDetails() {
        return bn.p();
    }

    @Override // androidx.media3.extractor.Extractor
    public /* synthetic */ Extractor getUnderlyingImplementation() {
        return this;
    }

    protected void handleBlockAddIDExtraData(Track track, ExtractorInput extractorInput, int i2) {
        if (track.blockAddIdType != 1685485123 && track.blockAddIdType != 1685480259) {
            extractorInput.skipFully(i2);
        } else {
            track.dolbyVisionConfigBytes = new byte[i2];
            extractorInput.readFully(track.dolbyVisionConfigBytes, 0, i2);
        }
    }

    protected void handleBlockAdditionalData(Track track, int i2, ExtractorInput extractorInput, int i3) {
        if (i2 != 4 || !CODEC_ID_VP9.equals(track.codecId)) {
            extractorInput.skipFully(i3);
        } else {
            this.supplementalData.reset(i3);
            extractorInput.readFully(this.supplementalData.getData(), 0, i3);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        if (this.parseSubtitlesDuringExtraction) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
    }

    protected void integerElement(int i2, long j2) throws ParserException {
        if (i2 == 136) {
            getCurrentTrack(i2).flagDefault = j2 == 1;
            return;
        }
        if (i2 == 137) {
            getCurrentChapter(i2).trackUid = j2;
            return;
        }
        if (i2 == 145) {
            getCurrentChapter(i2).timeStartNs = j2;
            return;
        }
        if (i2 == 146) {
            getCurrentChapter(i2).timeEndNs = j2;
            return;
        }
        if (i2 == 240) {
            if (this.sentSeekMap) {
                return;
            }
            assertInCues(i2);
            if (this.currentCueRelativePosition == -1) {
                this.currentCueRelativePosition = j2;
                return;
            }
            return;
        }
        if (i2 == 241) {
            if (this.sentSeekMap) {
                return;
            }
            assertInCues(i2);
            if (this.currentCueClusterPosition == -1) {
                this.currentCueClusterPosition = j2;
                return;
            }
            return;
        }
        if (i2 == ID_CONTENT_ENCODING_ORDER) {
            if (j2 == 0) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingOrder " + j2 + " not supported", null);
        }
        if (i2 == ID_CONTENT_ENCODING_SCOPE) {
            if (j2 == 1) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingScope " + j2 + " not supported", null);
        }
        if (i2 == ID_CHAPTER_UID) {
            getCurrentChapter(i2).uid = j2;
            return;
        }
        if (i2 == 29637) {
            getCurrentTrack(i2).uid = j2;
            return;
        }
        switch (i2) {
            case 131:
                int i3 = (int) j2;
                if (i3 == 1) {
                    getCurrentTrack(i2).type = 2;
                    return;
                }
                if (i3 == 2) {
                    getCurrentTrack(i2).type = 1;
                    return;
                }
                if (i3 == 17) {
                    getCurrentTrack(i2).type = 3;
                    return;
                } else if (i3 != 33) {
                    getCurrentTrack(i2).type = -1;
                    return;
                } else {
                    getCurrentTrack(i2).type = 5;
                    return;
                }
            case 152:
                getCurrentChapter(i2).flagHidden = j2 == 1;
                return;
            case 155:
                this.blockDurationUs = scaleTimecodeToUs(j2);
                return;
            case 159:
                getCurrentTrack(i2).channelCount = (int) j2;
                return;
            case 176:
                getCurrentTrack(i2).width = (int) j2;
                return;
            case 179:
                if (this.sentSeekMap) {
                    return;
                }
                assertInCues(i2);
                this.currentCueTimeUs = scaleTimecodeToUs(j2);
                return;
            case 186:
                getCurrentTrack(i2).height = (int) j2;
                return;
            case 215:
                getCurrentTrack(i2).number = (int) j2;
                return;
            case 231:
                this.clusterTimecodeUs = scaleTimecodeToUs(j2);
                return;
            case 238:
                this.blockAdditionalId = (int) j2;
                return;
            case 247:
                if (this.sentSeekMap) {
                    return;
                }
                assertInCues(i2);
                this.currentCueTrackNumber = (int) j2;
                return;
            case 251:
                this.blockHasReferenceBlock = true;
                return;
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
                getCurrentTrack(i2).blockAddIdType = (int) j2;
                return;
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
                if (j2 == 3) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentCompAlgo " + j2 + " not supported", null);
            case 17029:
                if (j2 < 1 || j2 > 2) {
                    throw ParserException.createForMalformedContainer("DocTypeReadVersion " + j2 + " not supported", null);
                }
                return;
            case 17143:
                if (j2 == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("EBMLReadVersion " + j2 + " not supported", null);
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
                if (j2 == 5) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentEncAlgo " + j2 + " not supported", null);
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
                if (j2 == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("AESSettingsCipherMode " + j2 + " not supported", null);
            case 21420:
                this.seekEntryPosition = j2 + this.segmentContentPosition;
                return;
            case 21432:
                int i4 = (int) j2;
                assertInTrackEntry(i2);
                if (i4 == 0) {
                    this.currentTrack.stereoMode = 0;
                    return;
                }
                if (i4 == 1) {
                    this.currentTrack.stereoMode = 2;
                    return;
                } else if (i4 == 3) {
                    this.currentTrack.stereoMode = 1;
                    return;
                } else {
                    if (i4 != 15) {
                        return;
                    }
                    this.currentTrack.stereoMode = 3;
                    return;
                }
            case 21680:
                getCurrentTrack(i2).displayWidth = (int) j2;
                return;
            case 21682:
                getCurrentTrack(i2).displayUnit = (int) j2;
                return;
            case 21690:
                getCurrentTrack(i2).displayHeight = (int) j2;
                return;
            case 21930:
                getCurrentTrack(i2).flagForced = j2 == 1;
                return;
            case ID_COLOUR_BITS_PER_CHANNEL /* 21938 */:
                assertInTrackEntry(i2);
                this.currentTrack.bitsPerChannel = (int) j2;
                return;
            case 21998:
                getCurrentTrack(i2).maxBlockAdditionId = (int) j2;
                return;
            case ID_CODEC_DELAY /* 22186 */:
                getCurrentTrack(i2).codecDelayNs = j2;
                return;
            case ID_SEEK_PRE_ROLL /* 22203 */:
                getCurrentTrack(i2).seekPreRollNs = j2;
                return;
            case 25188:
                getCurrentTrack(i2).audioBitDepth = (int) j2;
                return;
            case ID_DISCARD_PADDING /* 30114 */:
                this.blockGroupDiscardPaddingNs = j2;
                return;
            case ID_PROJECTION_TYPE /* 30321 */:
                int i5 = (int) j2;
                assertInTrackEntry(i2);
                if (i5 == 0) {
                    this.currentTrack.projectionType = 0;
                    return;
                }
                if (i5 == 1) {
                    this.currentTrack.projectionType = 1;
                    return;
                } else if (i5 == 2) {
                    this.currentTrack.projectionType = 2;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.currentTrack.projectionType = 3;
                    return;
                }
            case 2352003:
                getCurrentTrack(i2).defaultSampleDurationNs = (int) j2;
                return;
            case 2807729:
                this.timecodeScale = j2;
                return;
            default:
                switch (i2) {
                    case 21945:
                        int i6 = (int) j2;
                        assertInTrackEntry(i2);
                        if (i6 == 1) {
                            this.currentTrack.containerColorRange = 2;
                            return;
                        } else {
                            if (i6 != 2) {
                                return;
                            }
                            this.currentTrack.containerColorRange = 1;
                            return;
                        }
                    case 21946:
                        assertInTrackEntry(i2);
                        int iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer((int) j2);
                        if (iIsoTransferCharacteristicsToColorTransfer != -1) {
                            this.currentTrack.containerColorTransfer = iIsoTransferCharacteristicsToColorTransfer;
                            return;
                        }
                        return;
                    case 21947:
                        assertInTrackEntry(i2);
                        int iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace((int) j2);
                        if (iIsoColorPrimariesToColorSpace != -1) {
                            this.currentTrack.containerColorSpace = iIsoColorPrimariesToColorSpace;
                            return;
                        }
                        return;
                    case 21948:
                        getCurrentTrack(i2).maxContentLuminance = (int) j2;
                        return;
                    case 21949:
                        getCurrentTrack(i2).maxFrameAverageLuminance = (int) j2;
                        return;
                    default:
                        return;
                }
        }
    }

    protected boolean isLevel1Element(int i2) {
        return i2 == 357149030 || i2 == ID_CHAPTERS || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
    }

    @Override // androidx.media3.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        this.haveOutputSample = false;
        while (!this.haveOutputSample) {
            boolean z = this.reader.read(extractorInput);
            if (z && (maybeSeekForTracks(positionHolder, extractorInput.getPosition()) || maybeSeekForCues(positionHolder, extractorInput.getPosition()))) {
                return 1;
            }
            if (!z) {
                for (int i2 = 0; i2 < this.tracks.size(); i2++) {
                    Track trackValueAt = this.tracks.valueAt(i2);
                    trackValueAt.assertOutputInitialized();
                    trackValueAt.outputPendingSampleMetadata();
                }
                return -1;
            }
        }
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j2, long j3) {
        this.clusterTimecodeUs = C.TIME_UNSET;
        this.blockState = 0;
        this.reader.reset();
        this.varintReader.reset();
        resetWriteSampleData();
        this.inCuesElement = false;
        this.currentCueTimeUs = C.TIME_UNSET;
        this.currentCueTrackNumber = -1;
        this.currentCueClusterPosition = -1L;
        this.currentCueRelativePosition = -1L;
        if (!this.sentSeekMap) {
            this.perTrackCues.clear();
        }
        for (int i2 = 0; i2 < this.tracks.size(); i2++) {
            this.tracks.valueAt(i2).reset();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        return new Sniffer().sniff(extractorInput);
    }

    protected void startMasterElement(int i2, long j2, long j3) throws ParserException {
        assertInitialized();
        if (i2 == 128) {
            getCurrentChapter(i2).currentDisplayString = null;
            getCurrentChapter(i2).currentDisplayLanguage = null;
            return;
        }
        if (i2 == 160) {
            this.blockHasReferenceBlock = false;
            this.blockGroupDiscardPaddingNs = 0L;
            return;
        }
        if (i2 == 174) {
            Track track = new Track();
            this.currentTrack = track;
            track.isWebm = this.isWebm;
            return;
        }
        if (i2 == 187) {
            if (this.sentSeekMap) {
                return;
            }
            assertInCues(i2);
            this.currentCueTimeUs = C.TIME_UNSET;
            return;
        }
        if (i2 == 19899) {
            this.seekEntryId = -1;
            this.seekEntryPosition = -1L;
            return;
        }
        if (i2 == ID_CONTENT_ENCRYPTION) {
            getCurrentTrack(i2).hasContentEncryption = true;
            return;
        }
        if (i2 == 408125543) {
            long j4 = this.segmentContentPosition;
            if (j4 != -1 && j4 != j2) {
                throw ParserException.createForMalformedContainer("Multiple Segment elements not supported", null);
            }
            this.segmentContentPosition = j2;
            this.segmentContentSize = j3;
            return;
        }
        if (i2 == 475249515) {
            if (this.sentSeekMap) {
                return;
            }
            this.inCuesElement = true;
            return;
        }
        if (i2 != 524531317) {
            if (i2 == 182) {
                this.currentChapter = new ChapterEntry();
                return;
            }
            if (i2 == 183 && !this.sentSeekMap) {
                assertInCues(i2);
                this.currentCueTrackNumber = -1;
                this.currentCueClusterPosition = -1L;
                this.currentCueRelativePosition = -1L;
                return;
            }
            return;
        }
        if (this.tracksContentPosition != -1 && !this.readTracks) {
            this.seekForTracks = true;
        }
        if (this.sentSeekMap) {
            return;
        }
        if (this.seekForCuesEnabled && this.cuesContentPosition != -1) {
            this.seekForCues = true;
        } else {
            this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
            this.sentSeekMap = true;
        }
    }

    protected void stringElement(int i2, String str) throws ParserException {
        if (i2 == 133) {
            getCurrentChapter(i2).currentDisplayString = str;
            return;
        }
        if (i2 == 134) {
            getCurrentTrack(i2).codecId = str;
            return;
        }
        if (i2 == 17026) {
            if (DOC_TYPE_WEBM.equals(str) || DOC_TYPE_MATROSKA.equals(str)) {
                this.isWebm = Objects.equals(str, DOC_TYPE_WEBM);
                return;
            }
            throw ParserException.createForMalformedContainer("DocType " + str + " not supported", null);
        }
        if (i2 == ID_CHAP_LANGUAGE) {
            getCurrentChapter(i2).currentDisplayLanguage = str;
        } else if (i2 == 21358) {
            getCurrentTrack(i2).name = str;
        } else {
            if (i2 != 2274716) {
                return;
            }
            getCurrentTrack(i2).language = str;
        }
    }

    /* compiled from: WazeSource */
    final class MatroskaSeekMap implements TrackAwareSeekMap, ChunkIndexProvider {
        private final ChunkIndex chunkIndex;
        private final long durationUs;
        private final SparseArray<List<CuePointData>> perTrackCues;
        private final int primarySeekTrackNumber;

        /* compiled from: WazeSource */
        final class CuePointData implements Comparable<CuePointData> {
            private final long clusterPosition;
            private final long relativePosition;
            private final long timeUs;

            private CuePointData(long j2, long j3, long j4) {
                this.timeUs = j2;
                this.clusterPosition = j3;
                this.relativePosition = j4;
            }

            @Override // java.lang.Comparable
            public int compareTo(CuePointData cuePointData) {
                return Long.compare(this.timeUs, cuePointData.timeUs);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CuePointData)) {
                    return false;
                }
                CuePointData cuePointData = (CuePointData) obj;
                return this.timeUs == cuePointData.timeUs && this.clusterPosition == cuePointData.clusterPosition && this.relativePosition == cuePointData.relativePosition;
            }

            public int hashCode() {
                return Objects.hash(Long.valueOf(this.timeUs), Long.valueOf(this.clusterPosition), Long.valueOf(this.relativePosition));
            }
        }

        public MatroskaSeekMap(SparseArray<List<CuePointData>> sparseArray, long j2, int i2, long j3, long j4) {
            this.perTrackCues = sparseArray;
            this.durationUs = j2;
            this.primarySeekTrackNumber = i2;
            this.chunkIndex = buildChunkIndex(sparseArray, j2, i2, j3, j4);
        }

        private static ChunkIndex buildChunkIndex(SparseArray<List<CuePointData>> sparseArray, long j2, int i2, long j3, long j4) {
            int i3;
            List<CuePointData> list = sparseArray.get(i2);
            if (list == null || list.isEmpty()) {
                return null;
            }
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                CuePointData cuePointData = list.get(i5);
                jArrCopyOf3[i5] = cuePointData.timeUs;
                jArrCopyOf[i5] = cuePointData.clusterPosition;
            }
            while (true) {
                i3 = size - 1;
                if (i4 >= i3) {
                    break;
                }
                int i6 = i4 + 1;
                iArrCopyOf[i4] = (int) (jArrCopyOf[i6] - jArrCopyOf[i4]);
                jArrCopyOf2[i4] = jArrCopyOf3[i6] - jArrCopyOf3[i4];
                i4 = i6;
            }
            int i7 = i3;
            while (i7 > 0 && jArrCopyOf3[i7] >= j2) {
                i7--;
            }
            iArrCopyOf[i7] = (int) ((j3 + j4) - jArrCopyOf[i7]);
            jArrCopyOf2[i7] = j2 - jArrCopyOf3[i7];
            if (i7 < i3) {
                Log.w(MatroskaExtractor.TAG, "Discarding trailing cue points with timestamps greater than total duration.");
                int i8 = i7 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i8);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i8);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i8);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i8);
            }
            return new ChunkIndex(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }

        @Override // androidx.media3.extractor.ChunkIndexProvider
        public ChunkIndex getChunkIndex() {
            return this.chunkIndex;
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // androidx.media3.extractor.TrackAwareSeekMap
        public SeekMap.SeekPoints getSeekPoints(long j2, int i2) {
            int i3;
            int i4;
            List<CuePointData> list = this.perTrackCues.get(i2);
            if ((list == null || list.isEmpty()) && i2 != (i3 = this.primarySeekTrackNumber)) {
                list = this.perTrackCues.get(i3);
            }
            if (list == null || list.isEmpty()) {
                return new SeekMap.SeekPoints(SeekPoint.START);
            }
            long j3 = -1;
            int iBinarySearchFloor = Util.binarySearchFloor((List<? extends Comparable<? super CuePointData>>) list, new CuePointData(j2, j3, j3), true, false);
            if (iBinarySearchFloor == -1) {
                CuePointData cuePointData = list.get(0);
                return new SeekMap.SeekPoints(new SeekPoint(cuePointData.timeUs, cuePointData.clusterPosition));
            }
            CuePointData cuePointData2 = list.get(iBinarySearchFloor);
            SeekPoint seekPoint = new SeekPoint(cuePointData2.timeUs, cuePointData2.clusterPosition);
            if (cuePointData2.timeUs >= j2 || (i4 = iBinarySearchFloor + 1) >= list.size()) {
                return new SeekMap.SeekPoints(seekPoint);
            }
            CuePointData cuePointData3 = list.get(i4);
            return new SeekMap.SeekPoints(seekPoint, new SeekPoint(cuePointData3.timeUs, cuePointData3.clusterPosition));
        }

        @Override // androidx.media3.extractor.SeekMap
        public /* synthetic */ boolean isEstimated() {
            return false;
        }

        @Override // androidx.media3.extractor.TrackAwareSeekMap
        public boolean isSeekable(int i2) {
            List<CuePointData> list = this.perTrackCues.get(i2);
            return (list == null || list.isEmpty()) ? false : true;
        }

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return isSeekable(this.primarySeekTrackNumber);
        }

        @Override // androidx.media3.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j2) {
            ChunkIndex chunkIndex = this.chunkIndex;
            return chunkIndex != null ? chunkIndex.getSeekPoints(j2) : new SeekMap.SeekPoints(SeekPoint.START);
        }
    }

    @Deprecated
    public MatroskaExtractor(int i2) {
        this(new DefaultEbmlReader(), i2 | 2, SubtitleParser.Factory.UNSUPPORTED);
    }

    @Deprecated
    public MatroskaExtractor() {
        this(new DefaultEbmlReader(), 2, SubtitleParser.Factory.UNSUPPORTED);
    }

    public MatroskaExtractor(SubtitleParser.Factory factory) {
        this(new DefaultEbmlReader(), 0, factory);
    }

    public MatroskaExtractor(SubtitleParser.Factory factory, int i2) {
        this(new DefaultEbmlReader(), i2, factory);
    }
}
