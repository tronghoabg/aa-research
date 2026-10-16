package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.container.ParsableNalUnitBitArray;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import com.google.d.b.an;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class H264Reader implements ElementaryStreamReader {
    private final boolean allowNonIdrKeyframes;
    private final String containerMimeType;
    private final boolean detectAccessUnits;
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private boolean randomAccessIndicator;
    private SampleReader sampleReader;
    private final SeiReader seiReader;
    private long totalBytesWritten;
    private final boolean[] prefixFlags = new boolean[3];
    private final NalUnitTargetBuffer sps = new NalUnitTargetBuffer(7, 128);
    private final NalUnitTargetBuffer pps = new NalUnitTargetBuffer(8, 128);
    private final NalUnitTargetBuffer sei = new NalUnitTargetBuffer(6, 128);
    private long pesTimeUs = C.TIME_UNSET;
    private final ParsableByteArray seiWrapper = new ParsableByteArray();

    /* compiled from: WazeSource */
    final class SampleReader {
        private static final int DEFAULT_BUFFER_SIZE = 128;
        private final boolean allowNonIdrKeyframes;
        private int bufferLength;
        private final boolean detectAccessUnits;
        private boolean isFilling;
        private long nalUnitStartPosition;
        private long nalUnitTimeUs;
        private int nalUnitType;
        private final TrackOutput output;
        private SliceHeaderData previousSliceHeader;
        private boolean randomAccessIndicator;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;
        private SliceHeaderData sliceHeader;
        private final SparseArray<NalUnitUtil.SpsData> sps = new SparseArray<>();
        private final SparseArray<NalUnitUtil.PpsData> pps = new SparseArray<>();
        private byte[] buffer = new byte[128];
        private final ParsableNalUnitBitArray bitArray = new ParsableNalUnitBitArray(this.buffer, 0, 0);

        /* compiled from: WazeSource */
        final class SliceHeaderData {
            private static final int SLICE_TYPE_ALL_I = 7;
            private static final int SLICE_TYPE_I = 2;
            private boolean bottomFieldFlag;
            private boolean bottomFieldFlagPresent;
            private int deltaPicOrderCnt0;
            private int deltaPicOrderCnt1;
            private int deltaPicOrderCntBottom;
            private boolean fieldPicFlag;
            private int frameNum;
            private boolean hasSliceType;
            private boolean idrPicFlag;
            private int idrPicId;
            private boolean isComplete;
            private int nalRefIdc;
            private int picOrderCntLsb;
            private int picParameterSetId;
            private int sliceType;
            private NalUnitUtil.SpsData spsData;

            private SliceHeaderData() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean isFirstVclNalUnitOfPicture(SliceHeaderData sliceHeaderData) {
                if (!this.isComplete) {
                    return false;
                }
                if (!sliceHeaderData.isComplete) {
                    return true;
                }
                NalUnitUtil.SpsData spsData = this.spsData;
                an.B(spsData);
                NalUnitUtil.SpsData spsData2 = sliceHeaderData.spsData;
                an.B(spsData2);
                if (this.frameNum != sliceHeaderData.frameNum || this.picParameterSetId != sliceHeaderData.picParameterSetId || this.fieldPicFlag != sliceHeaderData.fieldPicFlag || (this.bottomFieldFlagPresent && sliceHeaderData.bottomFieldFlagPresent && this.bottomFieldFlag != sliceHeaderData.bottomFieldFlag)) {
                    return true;
                }
                int i2 = this.nalRefIdc;
                int i3 = sliceHeaderData.nalRefIdc;
                if (i2 != i3 && (i2 == 0 || i3 == 0)) {
                    return true;
                }
                int i4 = spsData.picOrderCountType;
                if (i4 == 0) {
                    if (spsData2.picOrderCountType == 0 && (this.picOrderCntLsb != sliceHeaderData.picOrderCntLsb || this.deltaPicOrderCntBottom != sliceHeaderData.deltaPicOrderCntBottom)) {
                        return true;
                    }
                } else if (i4 == 1 && spsData2.picOrderCountType == 1 && (this.deltaPicOrderCnt0 != sliceHeaderData.deltaPicOrderCnt0 || this.deltaPicOrderCnt1 != sliceHeaderData.deltaPicOrderCnt1)) {
                    return true;
                }
                boolean z = this.idrPicFlag;
                if (z == sliceHeaderData.idrPicFlag) {
                    return z && this.idrPicId != sliceHeaderData.idrPicId;
                }
                return true;
            }

            public void clear() {
                this.hasSliceType = false;
                this.isComplete = false;
            }

            public boolean isISlice() {
                if (!this.hasSliceType) {
                    return false;
                }
                int i2 = this.sliceType;
                return i2 == 7 || i2 == 2;
            }

            public void setAll(NalUnitUtil.SpsData spsData, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, int i6, int i7, int i8, int i9, int i10) {
                this.spsData = spsData;
                this.nalRefIdc = i2;
                this.sliceType = i3;
                this.frameNum = i4;
                this.picParameterSetId = i5;
                this.fieldPicFlag = z;
                this.bottomFieldFlagPresent = z2;
                this.bottomFieldFlag = z3;
                this.idrPicFlag = z4;
                this.idrPicId = i6;
                this.picOrderCntLsb = i7;
                this.deltaPicOrderCntBottom = i8;
                this.deltaPicOrderCnt0 = i9;
                this.deltaPicOrderCnt1 = i10;
                this.isComplete = true;
                this.hasSliceType = true;
            }

            public void setSliceType(int i2) {
                this.sliceType = i2;
                this.hasSliceType = true;
            }
        }

        public SampleReader(TrackOutput trackOutput, boolean z, boolean z2) {
            this.output = trackOutput;
            this.allowNonIdrKeyframes = z;
            this.detectAccessUnits = z2;
            this.previousSliceHeader = new SliceHeaderData();
            this.sliceHeader = new SliceHeaderData();
            reset();
        }

        private void outputSample(int i2) {
            long j2 = this.sampleTimeUs;
            if (j2 != C.TIME_UNSET) {
                long j3 = this.nalUnitStartPosition;
                long j4 = this.samplePosition;
                if (j3 == j4) {
                    return;
                }
                int i3 = (int) (j3 - j4);
                this.output.sampleMetadata(j2, this.sampleIsKeyframe ? 1 : 0, i3, i2, null);
            }
        }

        private void setSampleIsKeyframe() {
            boolean zIsISlice = this.allowNonIdrKeyframes ? this.sliceHeader.isISlice() : this.randomAccessIndicator;
            boolean z = this.sampleIsKeyframe;
            int i2 = this.nalUnitType;
            boolean z2 = true;
            if (i2 != 5 && (!zIsISlice || i2 != 1)) {
                z2 = false;
            }
            this.sampleIsKeyframe = z | z2;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0147  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void appendToNalUnit(byte[] r21, int r22, int r23) {
            /*
                Method dump skipped, instructions count: 413
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.H264Reader.SampleReader.appendToNalUnit(byte[], int, int):void");
        }

        public boolean endNalUnit(long j2, int i2, boolean z) {
            if (this.nalUnitType == 9 || (this.detectAccessUnits && this.sliceHeader.isFirstVclNalUnitOfPicture(this.previousSliceHeader))) {
                if (z && this.readingSample) {
                    outputSample(i2 + ((int) (j2 - this.nalUnitStartPosition)));
                }
                this.samplePosition = this.nalUnitStartPosition;
                this.sampleTimeUs = this.nalUnitTimeUs;
                this.sampleIsKeyframe = false;
                this.readingSample = true;
            }
            setSampleIsKeyframe();
            this.nalUnitType = 24;
            return this.sampleIsKeyframe;
        }

        public boolean needsSpsPps() {
            return this.detectAccessUnits;
        }

        public void putPps(NalUnitUtil.PpsData ppsData) {
            this.pps.append(ppsData.picParameterSetId, ppsData);
        }

        public void putSps(NalUnitUtil.SpsData spsData) {
            this.sps.append(spsData.seqParameterSetId, spsData);
        }

        public void reset() {
            this.isFilling = false;
            this.readingSample = false;
            this.sliceHeader.clear();
        }

        public void startNalUnit(long j2, int i2, long j3, boolean z) {
            this.nalUnitType = i2;
            this.nalUnitTimeUs = j3;
            this.nalUnitStartPosition = j2;
            this.randomAccessIndicator = z;
            if (!this.allowNonIdrKeyframes || i2 != 1) {
                if (!this.detectAccessUnits) {
                    return;
                }
                if (i2 != 5 && i2 != 1 && i2 != 2) {
                    return;
                }
            }
            SliceHeaderData sliceHeaderData = this.previousSliceHeader;
            this.previousSliceHeader = this.sliceHeader;
            this.sliceHeader = sliceHeaderData;
            sliceHeaderData.clear();
            this.bufferLength = 0;
            this.isFilling = true;
        }
    }

    public H264Reader(SeiReader seiReader, boolean z, boolean z2, String str) {
        this.seiReader = seiReader;
        this.allowNonIdrKeyframes = z;
        this.detectAccessUnits = z2;
        this.containerMimeType = str;
    }

    private void assertTracksCreated() {
        an.B(this.output);
        int i2 = Util.SDK_INT;
    }

    private void endNalUnit(long j2, int i2, int i3, long j3) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.endNalUnit(i3);
            this.pps.endNalUnit(i3);
            boolean z = this.hasOutputFormat;
            NalUnitTargetBuffer nalUnitTargetBuffer = this.sps;
            if (z) {
                if (nalUnitTargetBuffer.isCompleted()) {
                    NalUnitTargetBuffer nalUnitTargetBuffer2 = this.sps;
                    NalUnitUtil.SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit(nalUnitTargetBuffer2.nalData, 3, nalUnitTargetBuffer2.nalLength);
                    this.seiReader.setReorderingQueueSize(spsNalUnit.maxNumReorderFrames);
                    this.sampleReader.putSps(spsNalUnit);
                    this.sps.reset();
                } else if (this.pps.isCompleted()) {
                    NalUnitTargetBuffer nalUnitTargetBuffer3 = this.pps;
                    this.sampleReader.putPps(NalUnitUtil.parsePpsNalUnit(nalUnitTargetBuffer3.nalData, 3, nalUnitTargetBuffer3.nalLength));
                    this.pps.reset();
                }
            } else if (nalUnitTargetBuffer.isCompleted() && this.pps.isCompleted()) {
                ArrayList arrayList = new ArrayList();
                NalUnitTargetBuffer nalUnitTargetBuffer4 = this.sps;
                arrayList.add(Arrays.copyOf(nalUnitTargetBuffer4.nalData, nalUnitTargetBuffer4.nalLength));
                NalUnitTargetBuffer nalUnitTargetBuffer5 = this.pps;
                arrayList.add(Arrays.copyOf(nalUnitTargetBuffer5.nalData, nalUnitTargetBuffer5.nalLength));
                NalUnitTargetBuffer nalUnitTargetBuffer6 = this.sps;
                NalUnitUtil.SpsData spsNalUnit2 = NalUnitUtil.parseSpsNalUnit(nalUnitTargetBuffer6.nalData, 3, nalUnitTargetBuffer6.nalLength);
                NalUnitTargetBuffer nalUnitTargetBuffer7 = this.pps;
                NalUnitUtil.PpsData ppsNalUnit = NalUnitUtil.parsePpsNalUnit(nalUnitTargetBuffer7.nalData, 3, nalUnitTargetBuffer7.nalLength);
                String strBuildAvcCodecString = CodecSpecificDataUtil.buildAvcCodecString(spsNalUnit2.profileIdc, spsNalUnit2.constraintsFlagsAndReservedZero2Bits, spsNalUnit2.levelIdc);
                TrackOutput trackOutput = this.output;
                Format.Builder builder = new Format.Builder();
                builder.setId(this.formatId);
                builder.setContainerMimeType(this.containerMimeType);
                builder.setSampleMimeType("video/avc");
                builder.setCodecs(strBuildAvcCodecString);
                builder.setWidth(spsNalUnit2.width);
                builder.setHeight(spsNalUnit2.height);
                ColorInfo.Builder builder2 = new ColorInfo.Builder();
                builder2.setColorSpace(spsNalUnit2.colorSpace);
                builder2.setColorRange(spsNalUnit2.colorRange);
                builder2.setColorTransfer(spsNalUnit2.colorTransfer);
                builder2.setLumaBitdepth(spsNalUnit2.bitDepthLumaMinus8 + 8);
                builder2.setChromaBitdepth(spsNalUnit2.bitDepthChromaMinus8 + 8);
                builder.setColorInfo(builder2.build());
                builder.setPixelWidthHeightRatio(spsNalUnit2.pixelWidthHeightRatio);
                builder.setInitializationData(arrayList);
                builder.setMaxNumReorderSamples(spsNalUnit2.maxNumReorderFrames);
                trackOutput.format(builder.build());
                this.hasOutputFormat = true;
                this.seiReader.setReorderingQueueSize(spsNalUnit2.maxNumReorderFrames);
                this.sampleReader.putSps(spsNalUnit2);
                this.sampleReader.putPps(ppsNalUnit);
                this.sps.reset();
                this.pps.reset();
            }
        }
        if (this.sei.endNalUnit(i3)) {
            NalUnitTargetBuffer nalUnitTargetBuffer8 = this.sei;
            this.seiWrapper.reset(this.sei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer8.nalData, nalUnitTargetBuffer8.nalLength));
            this.seiWrapper.setPosition(4);
            this.seiReader.consume(j3, this.seiWrapper);
        }
        if (this.sampleReader.endNalUnit(j2, i2, this.hasOutputFormat)) {
            this.randomAccessIndicator = false;
        }
    }

    private void nalUnitData(byte[] bArr, int i2, int i3) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.appendToNalUnit(bArr, i2, i3);
            this.pps.appendToNalUnit(bArr, i2, i3);
        }
        this.sei.appendToNalUnit(bArr, i2, i3);
        this.sampleReader.appendToNalUnit(bArr, i2, i3);
    }

    private void startNalUnit(long j2, int i2, long j3) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.startNalUnit(i2);
            this.pps.startNalUnit(i2);
        }
        this.sei.startNalUnit(i2);
        this.sampleReader.startNalUnit(j2, i2, j3, this.randomAccessIndicator);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void consume(androidx.media3.common.util.ParsableByteArray r15) {
        /*
            r14 = this;
            r14.assertTracksCreated()
            int r1 = r15.getPosition()
            int r7 = r15.limit()
            byte[] r8 = r15.getData()
            long r2 = r14.totalBytesWritten
            int r4 = r15.bytesLeft()
            long r4 = (long) r4
            long r2 = r2 + r4
            r14.totalBytesWritten = r2
            androidx.media3.extractor.TrackOutput r2 = r14.output
            int r3 = r15.bytesLeft()
            r2.sampleData(r15, r3)
        L22:
            boolean[] r2 = r14.prefixFlags
            int r2 = androidx.media3.container.NalUnitUtil.findNalUnit(r8, r1, r7, r2)
            if (r2 != r7) goto L2e
            r14.nalUnitData(r8, r1, r7)
            return
        L2e:
            int r9 = androidx.media3.container.NalUnitUtil.getNalUnitType(r8, r2)
            r3 = 3
            if (r2 <= 0) goto L3f
            int r4 = r2 + (-1)
            r5 = r8[r4]
            if (r5 != 0) goto L3f
            r3 = 4
            r11 = r3
            r10 = r4
            goto L41
        L3f:
            r10 = r2
            r11 = r3
        L41:
            int r2 = r10 - r1
            if (r2 <= 0) goto L48
            r14.nalUnitData(r8, r1, r10)
        L48:
            int r3 = r7 - r10
            long r4 = r14.totalBytesWritten
            long r12 = (long) r3
            long r4 = r4 - r12
            if (r2 >= 0) goto L52
            int r1 = -r2
            goto L53
        L52:
            r1 = 0
        L53:
            r12 = r4
            long r5 = r14.pesTimeUs
            r0 = r14
            r4 = r1
            r1 = r12
            r0.endNalUnit(r1, r3, r4, r5)
            long r4 = r14.pesTimeUs
            r3 = r9
            r0.startNalUnit(r1, r3, r4)
            int r1 = r10 + r11
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.H264Reader.consume(androidx.media3.common.util.ParsableByteArray):void");
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.sampleReader = new SampleReader(this.output, this.allowNonIdrKeyframes, this.detectAccessUnits);
        this.seiReader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void endOfInputReached() {
        assertTracksCreated();
        this.seiReader.flush();
        endNalUnit(this.totalBytesWritten, 0, 0, this.pesTimeUs);
        startNalUnit(this.totalBytesWritten, 9, this.pesTimeUs);
        endNalUnit(this.totalBytesWritten, 0, 0, this.pesTimeUs);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public /* synthetic */ void packetFinished() {
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j2, int i2) {
        this.pesTimeUs = j2;
        int i3 = i2 & 2;
        this.randomAccessIndicator = (i3 != 0) | this.randomAccessIndicator;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.totalBytesWritten = 0L;
        this.randomAccessIndicator = false;
        this.pesTimeUs = C.TIME_UNSET;
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.sps.reset();
        this.pps.reset();
        this.sei.reset();
        this.seiReader.clear();
        SampleReader sampleReader = this.sampleReader;
        if (sampleReader != null) {
            sampleReader.reset();
        }
    }
}
