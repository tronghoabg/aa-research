package androidx.media3.extractor.text.vobsub;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.core.view.ViewCompat;
import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.d.d.bn;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class VobsubParser implements SubtitleParser {
    public static final int CUE_REPLACEMENT_BEHAVIOR = 2;
    public static final CuesWithTiming EMPTY_CUES = new CuesWithTiming(bn.p(), C.TIME_UNSET, C.TIME_UNSET);
    private static final String TAG = "VobsubParser";
    private final CueBuilder cueBuilder;
    private Inflater inflater;
    private final ParsableByteArray scratch = new ParsableByteArray();
    private final ParsableByteArray inflatedScratch = new ParsableByteArray();

    /* compiled from: WazeSource */
    final class CueBuilder {
        private static final int CMD_ALPHA = 4;
        private static final int CMD_AREA = 5;
        private static final int CMD_COLORS = 3;
        private static final int CMD_END = 255;
        private static final int CMD_FORCE_START = 0;
        private static final int CMD_OFFSETS = 6;
        private static final int CMD_START = 1;
        private static final int CMD_STOP = 2;
        private Rect boundingBox;
        private boolean hasColors;
        private boolean hasPlane;
        private int[] palette;
        private int planeHeight;
        private int planeWidth;
        private long startTimeUs = C.TIME_UNSET;
        private long endTimeUs = C.TIME_UNSET;
        private final int[] colors = new int[4];
        private int dataOffset0 = -1;
        private int dataOffset1 = -1;

        /* compiled from: WazeSource */
        final class Run {
            public int colorIndex;
            public int length;

            private Run() {
            }
        }

        private static int getColor(int[] iArr, int i2) {
            return (i2 < 0 || i2 >= iArr.length) ? iArr[0] : iArr[i2];
        }

        private static int parseColor(String str) {
            try {
                return Integer.parseInt(str, 16);
            } catch (RuntimeException e2) {
                Log.w(VobsubParser.TAG, "Parsing color failed", e2);
                return 0;
            }
        }

        private boolean parseCommand(long j2, ParsableByteArray parsableByteArray) {
            int unsignedByte = parsableByteArray.readUnsignedByte();
            if (unsignedByte == 255) {
                return false;
            }
            switch (unsignedByte) {
                case 1:
                    this.startTimeUs = j2;
                case 0:
                    return true;
                case 2:
                    this.endTimeUs = j2;
                    return true;
                case 3:
                    return parseControlColors(parsableByteArray);
                case 4:
                    return parseControlAlpha(parsableByteArray);
                case 5:
                    return parseControlArea(parsableByteArray);
                case 6:
                    return parseControlOffsets(parsableByteArray);
                default:
                    Log.w(VobsubParser.TAG, "Unrecognized command: " + unsignedByte);
                    return false;
            }
        }

        private boolean parseControlAlpha(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.bytesLeft() < 2) {
                Log.w(VobsubParser.TAG, "Incomplete alpha command");
                return false;
            }
            if (!this.hasColors) {
                Log.w(VobsubParser.TAG, "Ignoring alpha command before color command");
                return false;
            }
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int[] iArr = this.colors;
            iArr[3] = setAlpha(iArr[3], unsignedByte >> 4);
            iArr[2] = setAlpha(iArr[2], unsignedByte & 15);
            iArr[1] = setAlpha(iArr[1], unsignedByte2 >> 4);
            iArr[0] = setAlpha(iArr[0], unsignedByte2 & 15);
            return true;
        }

        private boolean parseControlArea(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.bytesLeft() < 6) {
                Log.w(VobsubParser.TAG, "Incomplete area command");
                return false;
            }
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int i2 = unsignedByte2 >> 4;
            int unsignedByte3 = ((unsignedByte2 & 15) << 8) | parsableByteArray.readUnsignedByte();
            int unsignedByte4 = parsableByteArray.readUnsignedByte();
            int unsignedByte5 = parsableByteArray.readUnsignedByte();
            this.boundingBox = new Rect((unsignedByte << 4) | i2, (unsignedByte4 << 4) | (unsignedByte5 >> 4), unsignedByte3 + 1, (parsableByteArray.readUnsignedByte() | ((unsignedByte5 & 15) << 8)) + 1);
            return true;
        }

        private boolean parseControlColors(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.bytesLeft() < 2) {
                Log.w(VobsubParser.TAG, "Incomplete color command");
                return false;
            }
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            this.colors[3] = getColor(this.palette, unsignedByte >> 4);
            this.colors[2] = getColor(this.palette, unsignedByte & 15);
            this.colors[1] = getColor(this.palette, unsignedByte2 >> 4);
            this.colors[0] = getColor(this.palette, unsignedByte2 & 15);
            this.hasColors = true;
            return true;
        }

        private boolean parseControlOffsets(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.bytesLeft() < 4) {
                Log.w(VobsubParser.TAG, "Incomplete offsets command");
                return false;
            }
            this.dataOffset0 = parsableByteArray.readUnsignedShort();
            this.dataOffset1 = parsableByteArray.readUnsignedShort();
            return true;
        }

        private boolean parseControlSequence(ParsableByteArray parsableByteArray, int i2) {
            boolean z = false;
            if (parsableByteArray.bytesLeft() < 4) {
                return false;
            }
            int position = parsableByteArray.getPosition();
            int unsignedShort = parsableByteArray.readUnsignedShort() * 10000;
            int unsignedShort2 = i2 + parsableByteArray.readUnsignedShort();
            boolean command = true;
            if (unsignedShort2 != position && unsignedShort2 < parsableByteArray.limit()) {
                z = true;
            }
            int iLimit = z ? unsignedShort2 : parsableByteArray.limit();
            while (parsableByteArray.getPosition() < iLimit && command) {
                command = parseCommand(unsignedShort, parsableByteArray);
            }
            if (z) {
                parsableByteArray.setPosition(unsignedShort2);
            }
            return z;
        }

        private void parseRleData(ParsableBitArray parsableBitArray, boolean z, Rect rect, int[] iArr) {
            int i2 = !z ? 1 : 0;
            int iWidth = rect.width();
            int i3 = i2 * iWidth;
            int iHeight = rect.height();
            Run run = new Run();
            while (true) {
                int i4 = 0;
                do {
                    parseRun(parsableBitArray, iWidth, run);
                    int iMin = Math.min(run.length, iWidth - i4);
                    if (iMin > 0) {
                        int i5 = i3 + iMin;
                        Arrays.fill(iArr, i3, i5, this.colors[run.colorIndex]);
                        i4 += iMin;
                        i3 = i5;
                    }
                } while (i4 < iWidth);
                i2 += 2;
                if (i2 >= iHeight) {
                    return;
                }
                i3 = i2 * iWidth;
                parsableBitArray.byteAlign();
            }
        }

        private static void parseRun(ParsableBitArray parsableBitArray, int i2, Run run) {
            int bits = 0;
            for (int i3 = 1; bits < i3 && i3 <= 64; i3 <<= 2) {
                if (parsableBitArray.bitsLeft() < 4) {
                    run.colorIndex = -1;
                    run.length = 0;
                    return;
                }
                bits = (bits << 4) | parsableBitArray.readBits(4);
            }
            run.colorIndex = bits & 3;
            if (bits >= 4) {
                i2 = bits >> 2;
            }
            run.length = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void parseSpuControlSequenceTable(ParsableByteArray parsableByteArray) {
            if (this.palette == null) {
                Log.w(VobsubParser.TAG, "Skipping SPU (no palette)");
            } else {
                if (!this.hasPlane) {
                    Log.w(VobsubParser.TAG, "Skipping SPU (no plane)");
                    return;
                }
                int position = parsableByteArray.getPosition() - 2;
                parsableByteArray.setPosition(parsableByteArray.readUnsignedShort() + position);
                while (parseControlSequence(parsableByteArray, position)) {
                }
            }
        }

        private static int setAlpha(int i2, int i3) {
            return (i2 & ViewCompat.MEASURED_SIZE_MASK) | ((i3 * 17) << 24);
        }

        public Cue build(ParsableByteArray parsableByteArray) {
            Rect rect;
            if (this.palette == null || !this.hasPlane || !this.hasColors || (rect = this.boundingBox) == null || this.dataOffset0 == -1 || this.dataOffset1 == -1 || rect.width() < 2 || this.boundingBox.height() < 2) {
                return null;
            }
            Rect rect2 = this.boundingBox;
            int[] iArr = new int[rect2.width() * rect2.height()];
            ParsableBitArray parsableBitArray = new ParsableBitArray();
            parsableByteArray.setPosition(this.dataOffset0);
            parsableBitArray.reset(parsableByteArray);
            parseRleData(parsableBitArray, true, rect2, iArr);
            parsableByteArray.setPosition(this.dataOffset1);
            parsableBitArray.reset(parsableByteArray);
            parseRleData(parsableBitArray, false, rect2, iArr);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
            Cue.Builder builder = new Cue.Builder();
            builder.setBitmap(bitmapCreateBitmap);
            builder.setPosition(rect2.left / this.planeWidth);
            builder.setPositionAnchor(0);
            builder.setLine(rect2.top / this.planeHeight, 0);
            builder.setLineAnchor(0);
            builder.setSize(rect2.width() / this.planeWidth);
            builder.setBitmapHeight(rect2.height() / this.planeHeight);
            return builder.build();
        }

        public void parseIdx(String str) {
            for (String str2 : Util.split(str.trim(), "\\r?\\n")) {
                if (str2.startsWith("palette: ")) {
                    String[] strArrSplit = Util.split(str2.substring(9), ",");
                    this.palette = new int[strArrSplit.length];
                    for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                        this.palette[i2] = parseColor(strArrSplit[i2].trim());
                    }
                } else if (str2.startsWith("size: ")) {
                    String[] strArrSplit2 = Util.split(str2.substring(6).trim(), "x");
                    if (strArrSplit2.length != 2) {
                        Log.w(VobsubParser.TAG, "Ignoring malformed IDX size line: '" + str2 + "'");
                    } else {
                        try {
                            this.planeWidth = Integer.parseInt(strArrSplit2[0]);
                            this.planeHeight = Integer.parseInt(strArrSplit2[1]);
                            this.hasPlane = true;
                        } catch (RuntimeException e2) {
                            Log.w(VobsubParser.TAG, "Parsing IDX failed", e2);
                        }
                    }
                }
            }
        }

        public void reset() {
            this.startTimeUs = C.TIME_UNSET;
            this.endTimeUs = C.TIME_UNSET;
            this.hasColors = false;
            this.boundingBox = null;
            this.dataOffset0 = -1;
            this.dataOffset1 = -1;
        }
    }

    public VobsubParser(List<byte[]> list) {
        CueBuilder cueBuilder = new CueBuilder();
        this.cueBuilder = cueBuilder;
        cueBuilder.parseIdx(new String(list.get(0), StandardCharsets.UTF_8));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.media3.extractor.text.CuesWithTiming parse() {
        /*
            r12 = this;
            java.util.zip.Inflater r0 = r12.inflater
            if (r0 != 0) goto Lb
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            r12.inflater = r0
        Lb:
            androidx.media3.common.util.ParsableByteArray r1 = r12.scratch
            androidx.media3.common.util.ParsableByteArray r2 = r12.inflatedScratch
            boolean r0 = androidx.media3.common.util.Util.maybeInflate(r1, r2, r0)
            if (r0 == 0) goto L24
            androidx.media3.common.util.ParsableByteArray r0 = r12.scratch
            androidx.media3.common.util.ParsableByteArray r1 = r12.inflatedScratch
            byte[] r2 = r1.getData()
            int r1 = r1.limit()
            r0.reset(r2, r1)
        L24:
            androidx.media3.extractor.text.vobsub.VobsubParser$CueBuilder r0 = r12.cueBuilder
            r0.reset()
            androidx.media3.common.util.ParsableByteArray r0 = r12.scratch
            int r0 = r0.bytesLeft()
            r1 = 2
            if (r0 < r1) goto L9b
            androidx.media3.common.util.ParsableByteArray r1 = r12.scratch
            int r1 = r1.readUnsignedShort()
            if (r1 == r0) goto L3b
            goto L9b
        L3b:
            androidx.media3.extractor.text.vobsub.VobsubParser$CueBuilder r0 = r12.cueBuilder
            androidx.media3.common.util.ParsableByteArray r1 = r12.scratch
            androidx.media3.extractor.text.vobsub.VobsubParser.CueBuilder.m13188$$Nest$mparseSpuControlSequenceTable(r0, r1)
            androidx.media3.extractor.text.vobsub.VobsubParser$CueBuilder r0 = r12.cueBuilder
            androidx.media3.common.util.ParsableByteArray r1 = r12.scratch
            androidx.media3.common.text.Cue r1 = r0.build(r1)
            long r2 = androidx.media3.extractor.text.vobsub.VobsubParser.CueBuilder.m13186$$Nest$fgetendTimeUs(r0)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L82
            androidx.media3.extractor.text.vobsub.VobsubParser$CueBuilder r0 = r12.cueBuilder
            long r2 = androidx.media3.extractor.text.vobsub.VobsubParser.CueBuilder.m13187$$Nest$fgetstartTimeUs(r0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L7c
            androidx.media3.extractor.text.vobsub.VobsubParser$CueBuilder r0 = r12.cueBuilder
            long r2 = androidx.media3.extractor.text.vobsub.VobsubParser.CueBuilder.m13186$$Nest$fgetendTimeUs(r0)
            long r4 = androidx.media3.extractor.text.vobsub.VobsubParser.CueBuilder.m13187$$Nest$fgetstartTimeUs(r0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L7c
            androidx.media3.extractor.text.vobsub.VobsubParser$CueBuilder r0 = r12.cueBuilder
            long r2 = androidx.media3.extractor.text.vobsub.VobsubParser.CueBuilder.m13186$$Nest$fgetendTimeUs(r0)
            long r4 = androidx.media3.extractor.text.vobsub.VobsubParser.CueBuilder.m13187$$Nest$fgetstartTimeUs(r0)
            long r4 = r2 - r4
            goto L82
        L7c:
            androidx.media3.extractor.text.vobsub.VobsubParser$CueBuilder r0 = r12.cueBuilder
            long r4 = androidx.media3.extractor.text.vobsub.VobsubParser.CueBuilder.m13186$$Nest$fgetendTimeUs(r0)
        L82:
            r10 = r4
            androidx.media3.extractor.text.CuesWithTiming r6 = new androidx.media3.extractor.text.CuesWithTiming
            if (r1 == 0) goto L8c
            com.google.d.d.bn r0 = com.google.d.d.bn.q(r1)
            goto L90
        L8c:
            com.google.d.d.bn r0 = com.google.d.d.bn.p()
        L90:
            r7 = r0
            androidx.media3.extractor.text.vobsub.VobsubParser$CueBuilder r12 = r12.cueBuilder
            long r8 = androidx.media3.extractor.text.vobsub.VobsubParser.CueBuilder.m13187$$Nest$fgetstartTimeUs(r12)
            r6.<init>(r7, r8, r10)
            return r6
        L9b:
            androidx.media3.extractor.text.CuesWithTiming r12 = androidx.media3.extractor.text.vobsub.VobsubParser.EMPTY_CUES
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.vobsub.VobsubParser.parse():androidx.media3.extractor.text.CuesWithTiming");
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ Subtitle parseToLegacySubtitle(byte[] bArr, int i2, int i3) {
        return SubtitleParser.CC.$default$parseToLegacySubtitle(this, bArr, i2, i3);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ void reset() {
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ void parse(byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        parse(bArr, 0, bArr.length, outputOptions, consumer);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i2, int i3, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        this.scratch.reset(bArr, i3 + i2);
        this.scratch.setPosition(i2);
        consumer.accept(parse());
    }
}
