package androidx.media3.extractor.text;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.d.b.an;
import com.google.d.d.bn;
import com.google.d.l.j;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class SubtitleExtractor implements Extractor {
    private static final int DEFAULT_BUFFER_SIZE = 1024;
    private static final int STATE_CREATED = 0;
    private static final int STATE_EXTRACTING = 2;
    private static final int STATE_FINISHED = 4;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_RELEASED = 5;
    private static final int STATE_SEEKING = 3;
    public static final int TRACK_ID = 0;
    private int bytesRead;
    private ExtractorOutput extractorOutput;
    private final Format format;
    private final List<Sample> samples;
    private IndexSeekMap seekMap;
    private long seekTimeUs;
    private int state;
    private final SubtitleParser subtitleParser;
    private long[] timestamps;
    private TrackOutput trackOutput;
    private final CueEncoder cueEncoder = new CueEncoder();
    private byte[] subtitleData = Util.EMPTY_BYTE_ARRAY;
    private final ParsableByteArray scratchSampleArray = new ParsableByteArray();

    /* compiled from: WazeSource */
    class Sample implements Comparable<Sample> {
        private final byte[] data;
        private final long timeUs;

        private Sample(long j2, byte[] bArr) {
            this.timeUs = j2;
            this.data = bArr;
        }

        @Override // java.lang.Comparable
        public int compareTo(Sample sample) {
            return Long.compare(this.timeUs, sample.timeUs);
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface State {
    }

    public SubtitleExtractor(SubtitleParser subtitleParser, Format format) {
        Format formatBuild;
        this.subtitleParser = subtitleParser;
        if (format != null) {
            Format.Builder builderBuildUpon = format.buildUpon();
            builderBuildUpon.setSampleMimeType(MimeTypes.APPLICATION_MEDIA3_CUES);
            builderBuildUpon.setCodecs(format.sampleMimeType);
            builderBuildUpon.setCueReplacementBehavior(subtitleParser.getCueReplacementBehavior());
            formatBuild = builderBuildUpon.build();
        } else {
            formatBuild = null;
        }
        this.format = formatBuild;
        this.samples = new ArrayList();
        this.state = 0;
        this.timestamps = Util.EMPTY_LONG_ARRAY;
        this.seekTimeUs = C.TIME_UNSET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$parseAndWriteToOutput$0(AtomicLong atomicLong, CuesWithTiming cuesWithTiming) {
        Sample sample = new Sample(cuesWithTiming.startTimeUs, this.cueEncoder.encode(cuesWithTiming.cues, cuesWithTiming.durationUs));
        this.samples.add(sample);
        if (cuesWithTiming.endTimeUs != C.TIME_UNSET) {
            atomicLong.set(atomicLong.get() == C.TIME_UNSET ? cuesWithTiming.endTimeUs : Math.max(atomicLong.get(), cuesWithTiming.endTimeUs));
        }
        long j2 = this.seekTimeUs;
        if (j2 == C.TIME_UNSET || cuesWithTiming.endTimeUs >= j2) {
            writeToOutput(sample);
        }
    }

    private void parseAndWriteToOutput() throws ParserException {
        try {
            long j2 = this.seekTimeUs;
            SubtitleParser.OutputOptions outputOptionsCuesAfterThenRemainingCuesBefore = j2 != C.TIME_UNSET ? SubtitleParser.OutputOptions.cuesAfterThenRemainingCuesBefore(j2) : SubtitleParser.OutputOptions.allCues();
            final AtomicLong atomicLong = new AtomicLong(C.TIME_UNSET);
            this.subtitleParser.parse(this.subtitleData, 0, this.bytesRead, outputOptionsCuesAfterThenRemainingCuesBefore, new Consumer() { // from class: androidx.media3.extractor.text.SubtitleExtractor$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    this.f$0.lambda$parseAndWriteToOutput$0(atomicLong, (CuesWithTiming) obj);
                }
            });
            Collections.sort(this.samples);
            this.timestamps = new long[this.samples.size()];
            for (int i2 = 0; i2 < this.samples.size(); i2++) {
                this.timestamps[i2] = this.samples.get(i2).timeUs;
            }
            if (atomicLong.get() != C.TIME_UNSET) {
                TrackOutput trackOutput = this.trackOutput;
                an.B(trackOutput);
                trackOutput.durationUs(atomicLong.get());
                IndexSeekMap indexSeekMap = this.seekMap;
                if (indexSeekMap != null) {
                    indexSeekMap.setDurationUs(atomicLong.get());
                    ExtractorOutput extractorOutput = this.extractorOutput;
                    an.B(extractorOutput);
                    extractorOutput.seekMap(this.seekMap);
                }
            }
            this.subtitleData = Util.EMPTY_BYTE_ARRAY;
        } catch (RuntimeException e2) {
            throw ParserException.createForMalformedContainer("SubtitleParser failed.", e2);
        }
    }

    private boolean readFromInput(ExtractorInput extractorInput) {
        byte[] bArrCopyOf = this.subtitleData;
        int length = bArrCopyOf.length;
        if (length == this.bytesRead) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, length + 1024);
            this.subtitleData = bArrCopyOf;
        }
        int i2 = this.bytesRead;
        int i3 = extractorInput.read(bArrCopyOf, i2, bArrCopyOf.length - i2);
        if (i3 != -1) {
            this.bytesRead += i3;
        }
        long length2 = extractorInput.getLength();
        return (length2 != -1 && ((long) this.bytesRead) == length2) || i3 == -1;
    }

    private boolean skipInput(ExtractorInput extractorInput) {
        return extractorInput.skip((extractorInput.getLength() > (-1L) ? 1 : (extractorInput.getLength() == (-1L) ? 0 : -1)) != 0 ? j.h(extractorInput.getLength()) : 1024) == -1;
    }

    private void writeToOutput() {
        long j2 = this.seekTimeUs;
        for (int iBinarySearchFloor = j2 == C.TIME_UNSET ? 0 : Util.binarySearchFloor(this.timestamps, j2, true, true); iBinarySearchFloor < this.samples.size(); iBinarySearchFloor++) {
            writeToOutput(this.samples.get(iBinarySearchFloor));
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

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        an.u(this.state == 0);
        this.extractorOutput = extractorOutput;
        TrackOutput trackOutputTrack = extractorOutput.track(0, 3);
        this.trackOutput = trackOutputTrack;
        Format format = this.format;
        if (format != null) {
            trackOutputTrack.format(format);
            extractorOutput.endTracks();
            IndexSeekMap indexSeekMap = new IndexSeekMap(new long[]{0}, new long[]{0}, C.TIME_UNSET);
            this.seekMap = indexSeekMap;
            extractorOutput.seekMap(indexSeekMap);
        }
        this.state = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b A[RETURN] */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(androidx.media3.extractor.ExtractorInput r9, androidx.media3.extractor.PositionHolder r10) throws androidx.media3.common.ParserException {
        /*
            r8 = this;
            int r10 = r8.state
            r0 = 1
            r1 = 0
            if (r10 == 0) goto Lb
            r2 = 5
            if (r10 == r2) goto Lb
            r10 = r0
            goto Lc
        Lb:
            r10 = r1
        Lc:
            com.google.d.b.an.u(r10)
            int r10 = r8.state
            r2 = 2
            r3 = 4
            if (r10 != r0) goto L38
            long r4 = r9.getLength()
            r6 = -1
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 == 0) goto L28
            long r4 = r9.getLength()
            int r10 = com.google.d.l.j.h(r4)
            goto L2a
        L28:
            r10 = 1024(0x400, float:1.435E-42)
        L2a:
            byte[] r0 = r8.subtitleData
            int r0 = r0.length
            if (r10 <= r0) goto L33
            byte[] r10 = new byte[r10]
            r8.subtitleData = r10
        L33:
            r8.bytesRead = r1
            r8.state = r2
            goto L3a
        L38:
            if (r10 != r2) goto L45
        L3a:
            boolean r10 = r8.readFromInput(r9)
            if (r10 == 0) goto L45
            r8.parseAndWriteToOutput()
            r8.state = r3
        L45:
            int r10 = r8.state
            r0 = 3
            if (r10 != r0) goto L55
            boolean r9 = r8.skipInput(r9)
            if (r9 == 0) goto L55
            r8.writeToOutput()
            r8.state = r3
        L55:
            int r8 = r8.state
            if (r8 != r3) goto L5b
            r8 = -1
            return r8
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.SubtitleExtractor.read(androidx.media3.extractor.ExtractorInput, androidx.media3.extractor.PositionHolder):int");
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
        if (this.state == 5) {
            return;
        }
        this.subtitleParser.reset();
        this.state = 5;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j2, long j3) {
        int i2 = this.state;
        boolean z = false;
        if (i2 != 0 && i2 != 5) {
            z = true;
        }
        an.u(z);
        this.seekTimeUs = j3;
        int i3 = this.state;
        if (i3 == 2) {
            this.state = 1;
        } else if (i3 == 4) {
            this.state = 3;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        return true;
    }

    private void writeToOutput(Sample sample) {
        an.B(this.trackOutput);
        int length = sample.data.length;
        this.scratchSampleArray.reset(sample.data);
        this.trackOutput.sampleData(this.scratchSampleArray, length);
        this.trackOutput.sampleMetadata(sample.timeUs, 1, length, 0, null);
    }
}
