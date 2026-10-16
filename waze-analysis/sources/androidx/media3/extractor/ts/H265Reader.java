package androidx.media3.extractor.ts;

import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import com.google.d.b.an;
import java.util.Collections;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class H265Reader implements ElementaryStreamReader {
    private final String containerMimeType;
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private SampleReader sampleReader;
    private final SeiReader seiReader;
    private long totalBytesWritten;
    private final boolean[] prefixFlags = new boolean[3];
    private final NalUnitTargetBuffer vps = new NalUnitTargetBuffer(32, 128);
    private final NalUnitTargetBuffer sps = new NalUnitTargetBuffer(33, 128);
    private final NalUnitTargetBuffer pps = new NalUnitTargetBuffer(34, 128);
    private final NalUnitTargetBuffer prefixSei = new NalUnitTargetBuffer(39, 128);
    private final NalUnitTargetBuffer suffixSei = new NalUnitTargetBuffer(40, 128);
    private long pesTimeUs = C.TIME_UNSET;
    private final ParsableByteArray seiWrapper = new ParsableByteArray();

    /* compiled from: WazeSource */
    final class SampleReader {
        private static final int FIRST_SLICE_FLAG_OFFSET = 2;
        private boolean isFirstPrefixNalUnit;
        private boolean isFirstSlice;
        private boolean lookingForFirstSliceFlag;
        private int nalUnitBytesRead;
        private boolean nalUnitHasKeyframeData;
        private long nalUnitPosition;
        private long nalUnitTimeUs;
        private final TrackOutput output;
        private boolean readingPrefix;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;

        public SampleReader(TrackOutput trackOutput) {
            this.output = trackOutput;
        }

        private static boolean isPrefixNalUnit(int i2) {
            return (i2 >= 32 && i2 <= 35) || i2 == 39;
        }

        private static boolean isVclBodyNalUnit(int i2) {
            return i2 < 32 || i2 == 40;
        }

        private void outputSample(int i2) {
            long j2 = this.sampleTimeUs;
            if (j2 != C.TIME_UNSET) {
                long j3 = this.nalUnitPosition;
                long j4 = this.samplePosition;
                if (j3 == j4) {
                    return;
                }
                int i3 = (int) (j3 - j4);
                this.output.sampleMetadata(j2, this.sampleIsKeyframe ? 1 : 0, i3, i2, null);
            }
        }

        public void endNalUnit(long j2, int i2, boolean z) {
            if (this.readingPrefix && this.isFirstSlice) {
                this.sampleIsKeyframe = this.nalUnitHasKeyframeData;
                this.readingPrefix = false;
            } else if (this.isFirstPrefixNalUnit || this.isFirstSlice) {
                if (z && this.readingSample) {
                    outputSample(i2 + ((int) (j2 - this.nalUnitPosition)));
                }
                this.samplePosition = this.nalUnitPosition;
                this.sampleTimeUs = this.nalUnitTimeUs;
                this.sampleIsKeyframe = this.nalUnitHasKeyframeData;
                this.readingSample = true;
            }
        }

        public void readNalUnitData(byte[] bArr, int i2, int i3) {
            if (this.lookingForFirstSliceFlag) {
                int i4 = this.nalUnitBytesRead;
                int i5 = (i2 + 2) - i4;
                if (i5 >= i3) {
                    this.nalUnitBytesRead = i4 + (i3 - i2);
                } else {
                    this.isFirstSlice = (bArr[i5] & 128) != 0;
                    this.lookingForFirstSliceFlag = false;
                }
            }
        }

        public void reset() {
            this.lookingForFirstSliceFlag = false;
            this.isFirstSlice = false;
            this.isFirstPrefixNalUnit = false;
            this.readingSample = false;
            this.readingPrefix = false;
        }

        public void startNalUnit(long j2, int i2, int i3, long j3, boolean z) {
            this.isFirstSlice = false;
            this.isFirstPrefixNalUnit = false;
            this.nalUnitTimeUs = j3;
            this.nalUnitBytesRead = 0;
            this.nalUnitPosition = j2;
            if (!isVclBodyNalUnit(i3)) {
                if (this.readingSample && !this.readingPrefix) {
                    if (z) {
                        outputSample(i2);
                    }
                    this.readingSample = false;
                }
                if (isPrefixNalUnit(i3)) {
                    this.isFirstPrefixNalUnit = !this.readingPrefix;
                    this.readingPrefix = true;
                }
            }
            boolean z2 = i3 >= 16 && i3 <= 21;
            this.nalUnitHasKeyframeData = z2;
            this.lookingForFirstSliceFlag = z2 || i3 <= 9;
        }
    }

    public H265Reader(SeiReader seiReader, String str) {
        this.seiReader = seiReader;
        this.containerMimeType = str;
    }

    private void assertTracksCreated() {
        an.B(this.output);
        int i2 = Util.SDK_INT;
    }

    private void endNalUnit(long j2, int i2, int i3, long j3) {
        this.sampleReader.endNalUnit(j2, i2, this.hasOutputFormat);
        if (!this.hasOutputFormat) {
            this.vps.endNalUnit(i3);
            this.sps.endNalUnit(i3);
            this.pps.endNalUnit(i3);
            if (this.vps.isCompleted() && this.sps.isCompleted() && this.pps.isCompleted()) {
                Format mediaFormat = parseMediaFormat(this.formatId, this.vps, this.sps, this.pps, this.containerMimeType);
                this.output.format(mediaFormat);
                an.u(mediaFormat.maxNumReorderSamples != -1);
                this.seiReader.setReorderingQueueSize(mediaFormat.maxNumReorderSamples);
                this.hasOutputFormat = true;
            }
        }
        if (this.prefixSei.endNalUnit(i3)) {
            NalUnitTargetBuffer nalUnitTargetBuffer = this.prefixSei;
            this.seiWrapper.reset(this.prefixSei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer.nalData, nalUnitTargetBuffer.nalLength));
            this.seiWrapper.skipBytes(5);
            this.seiReader.consume(j3, this.seiWrapper);
        }
        if (this.suffixSei.endNalUnit(i3)) {
            NalUnitTargetBuffer nalUnitTargetBuffer2 = this.suffixSei;
            this.seiWrapper.reset(this.suffixSei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
            this.seiWrapper.skipBytes(5);
            this.seiReader.consume(j3, this.seiWrapper);
        }
    }

    private void nalUnitData(byte[] bArr, int i2, int i3) {
        this.sampleReader.readNalUnitData(bArr, i2, i3);
        if (!this.hasOutputFormat) {
            this.vps.appendToNalUnit(bArr, i2, i3);
            this.sps.appendToNalUnit(bArr, i2, i3);
            this.pps.appendToNalUnit(bArr, i2, i3);
        }
        this.prefixSei.appendToNalUnit(bArr, i2, i3);
        this.suffixSei.appendToNalUnit(bArr, i2, i3);
    }

    private static Format parseMediaFormat(String str, NalUnitTargetBuffer nalUnitTargetBuffer, NalUnitTargetBuffer nalUnitTargetBuffer2, NalUnitTargetBuffer nalUnitTargetBuffer3, String str2) {
        int i2 = nalUnitTargetBuffer.nalLength;
        byte[] bArr = new byte[nalUnitTargetBuffer2.nalLength + i2 + nalUnitTargetBuffer3.nalLength];
        System.arraycopy(nalUnitTargetBuffer.nalData, 0, bArr, 0, i2);
        System.arraycopy(nalUnitTargetBuffer2.nalData, 0, bArr, nalUnitTargetBuffer.nalLength, nalUnitTargetBuffer2.nalLength);
        System.arraycopy(nalUnitTargetBuffer3.nalData, 0, bArr, nalUnitTargetBuffer.nalLength + nalUnitTargetBuffer2.nalLength, nalUnitTargetBuffer3.nalLength);
        String strBuildHevcCodecString = null;
        NalUnitUtil.H265SpsData h265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(nalUnitTargetBuffer2.nalData, 3, nalUnitTargetBuffer2.nalLength, null);
        NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel = h265SpsNalUnit.profileTierLevel;
        if (h265ProfileTierLevel != null) {
            int i3 = h265ProfileTierLevel.generalLevelIdc;
            int[] iArr = h265ProfileTierLevel.constraintBytes;
            int i4 = h265ProfileTierLevel.generalProfileCompatibilityFlags;
            int i5 = h265ProfileTierLevel.generalProfileIdc;
            strBuildHevcCodecString = CodecSpecificDataUtil.buildHevcCodecString(h265ProfileTierLevel.generalProfileSpace, h265ProfileTierLevel.generalTierFlag, i5, i4, iArr, i3);
        }
        Format.Builder builder = new Format.Builder();
        builder.setId(str);
        builder.setContainerMimeType(str2);
        builder.setSampleMimeType(MimeTypes.VIDEO_H265);
        builder.setCodecs(strBuildHevcCodecString);
        builder.setWidth(h265SpsNalUnit.width);
        builder.setHeight(h265SpsNalUnit.height);
        builder.setDecodedWidth(h265SpsNalUnit.decodedWidth);
        builder.setDecodedHeight(h265SpsNalUnit.decodedHeight);
        ColorInfo.Builder builder2 = new ColorInfo.Builder();
        builder2.setColorSpace(h265SpsNalUnit.colorSpace);
        builder2.setColorRange(h265SpsNalUnit.colorRange);
        builder2.setColorTransfer(h265SpsNalUnit.colorTransfer);
        builder2.setLumaBitdepth(h265SpsNalUnit.bitDepthLumaMinus8 + 8);
        builder2.setChromaBitdepth(h265SpsNalUnit.bitDepthChromaMinus8 + 8);
        builder.setColorInfo(builder2.build());
        builder.setPixelWidthHeightRatio(h265SpsNalUnit.pixelWidthHeightRatio);
        builder.setMaxNumReorderSamples(h265SpsNalUnit.maxNumReorderPics);
        builder.setMaxSubLayers(h265SpsNalUnit.maxSubLayersMinus1 + 1);
        builder.setInitializationData(Collections.singletonList(bArr));
        return builder.build();
    }

    private void startNalUnit(long j2, int i2, int i3, long j3) {
        this.sampleReader.startNalUnit(j2, i2, i3, j3, this.hasOutputFormat);
        if (!this.hasOutputFormat) {
            this.vps.startNalUnit(i3);
            this.sps.startNalUnit(i3);
            this.pps.startNalUnit(i3);
        }
        this.prefixSei.startNalUnit(i3);
        this.suffixSei.startNalUnit(i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void consume(androidx.media3.common.util.ParsableByteArray r16) {
        /*
            r15 = this;
            r15.assertTracksCreated()
        L3:
            int r1 = r16.bytesLeft()
            if (r1 <= 0) goto L6f
            int r1 = r16.getPosition()
            int r7 = r16.limit()
            byte[] r8 = r16.getData()
            long r2 = r15.totalBytesWritten
            int r4 = r16.bytesLeft()
            long r4 = (long) r4
            long r2 = r2 + r4
            r15.totalBytesWritten = r2
            androidx.media3.extractor.TrackOutput r2 = r15.output
            int r3 = r16.bytesLeft()
            r9 = r16
            r2.sampleData(r9, r3)
        L2a:
            if (r1 >= r7) goto L3
            boolean[] r2 = r15.prefixFlags
            int r2 = androidx.media3.container.NalUnitUtil.findNalUnit(r8, r1, r7, r2)
            if (r2 != r7) goto L38
            r15.nalUnitData(r8, r1, r7)
            return
        L38:
            int r10 = androidx.media3.container.NalUnitUtil.getH265NalUnitType(r8, r2)
            r3 = 3
            if (r2 <= 0) goto L49
            int r4 = r2 + (-1)
            r5 = r8[r4]
            if (r5 != 0) goto L49
            r3 = 4
            r12 = r3
            r11 = r4
            goto L4b
        L49:
            r11 = r2
            r12 = r3
        L4b:
            int r2 = r11 - r1
            if (r2 <= 0) goto L52
            r15.nalUnitData(r8, r1, r11)
        L52:
            int r3 = r7 - r11
            long r4 = r15.totalBytesWritten
            long r13 = (long) r3
            long r4 = r4 - r13
            if (r2 >= 0) goto L5c
            int r1 = -r2
            goto L5d
        L5c:
            r1 = 0
        L5d:
            r13 = r4
            long r5 = r15.pesTimeUs
            r0 = r15
            r4 = r1
            r1 = r13
            r0.endNalUnit(r1, r3, r4, r5)
            long r5 = r15.pesTimeUs
            r4 = r10
            r0.startNalUnit(r1, r3, r4, r5)
            int r1 = r11 + r12
            goto L2a
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.H265Reader.consume(androidx.media3.common.util.ParsableByteArray):void");
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.sampleReader = new SampleReader(this.output);
        this.seiReader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void endOfInputReached() {
        assertTracksCreated();
        this.seiReader.flush();
        endNalUnit(this.totalBytesWritten, 0, 0, this.pesTimeUs);
        startNalUnit(this.totalBytesWritten, 0, 48, this.pesTimeUs);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public /* synthetic */ void packetFinished() {
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j2, int i2) {
        this.pesTimeUs = j2;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.totalBytesWritten = 0L;
        this.pesTimeUs = C.TIME_UNSET;
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.vps.reset();
        this.sps.reset();
        this.pps.reset();
        this.prefixSei.reset();
        this.suffixSei.reset();
        this.seiReader.clear();
        SampleReader sampleReader = this.sampleReader;
        if (sampleReader != null) {
            sampleReader.reset();
        }
    }
}
