package androidx.media3.extractor.text.pgs;

import android.graphics.Bitmap;
import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PgsParser implements SubtitleParser {
    public static final int CUE_REPLACEMENT_BEHAVIOR = 2;
    private static final int SECTION_TYPE_BITMAP_PICTURE = 21;
    private static final int SECTION_TYPE_END = 128;
    private static final int SECTION_TYPE_IDENTIFIER = 22;
    private static final int SECTION_TYPE_PALETTE = 20;
    private Inflater inflater;
    private final ParsableByteArray buffer = new ParsableByteArray();
    private final ParsableByteArray inflatedBuffer = new ParsableByteArray();
    private final CueBuilder cueBuilder = new CueBuilder();

    /* compiled from: WazeSource */
    final class CueBuilder {
        private int bitmapHeight;
        private int bitmapWidth;
        private int bitmapX;
        private int bitmapY;
        private boolean colorsSet;
        private int planeHeight;
        private int planeWidth;
        private final ParsableByteArray bitmapData = new ParsableByteArray();
        private final int[] colors = new int[256];

        /* JADX INFO: Access modifiers changed from: private */
        public void parseBitmapSection(ParsableByteArray parsableByteArray, int i2) {
            int unsignedInt24;
            if (i2 < 4) {
                return;
            }
            parsableByteArray.skipBytes(3);
            int i3 = i2 - 4;
            if ((parsableByteArray.readUnsignedByte() & 128) != 0) {
                if (i3 < 7 || (unsignedInt24 = parsableByteArray.readUnsignedInt24()) < 4) {
                    return;
                }
                this.bitmapWidth = parsableByteArray.readUnsignedShort();
                this.bitmapHeight = parsableByteArray.readUnsignedShort();
                this.bitmapData.reset(unsignedInt24 - 4);
                i3 = i2 - 11;
            }
            ParsableByteArray parsableByteArray2 = this.bitmapData;
            int position = parsableByteArray2.getPosition();
            int iLimit = parsableByteArray2.limit();
            if (position >= iLimit || i3 <= 0) {
                return;
            }
            ParsableByteArray parsableByteArray3 = this.bitmapData;
            int iMin = Math.min(i3, iLimit - position);
            parsableByteArray.readBytes(parsableByteArray3.getData(), position, iMin);
            this.bitmapData.setPosition(position + iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void parseIdentifierSection(ParsableByteArray parsableByteArray, int i2) {
            if (i2 < 19) {
                return;
            }
            this.planeWidth = parsableByteArray.readUnsignedShort();
            this.planeHeight = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(11);
            this.bitmapX = parsableByteArray.readUnsignedShort();
            this.bitmapY = parsableByteArray.readUnsignedShort();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void parsePaletteSection(ParsableByteArray parsableByteArray, int i2) {
            if (i2 % 5 != 2) {
                return;
            }
            parsableByteArray.skipBytes(2);
            int i3 = 0;
            Arrays.fill(this.colors, 0);
            int i4 = i2 / 5;
            int i5 = 0;
            while (i5 < i4) {
                int unsignedByte = parsableByteArray.readUnsignedByte();
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                int unsignedByte3 = parsableByteArray.readUnsignedByte();
                int unsignedByte4 = parsableByteArray.readUnsignedByte();
                int unsignedByte5 = parsableByteArray.readUnsignedByte();
                double d2 = unsignedByte2;
                int i6 = unsignedByte3 + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                int i7 = unsignedByte4 + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                int[] iArr = this.colors;
                double d3 = i6;
                int iConstrainValue = Util.constrainValue((int) ((1.402d * d3) + d2), i3, 255) << 16;
                double d4 = i7;
                iArr[unsignedByte] = Util.constrainValue((int) (d2 + (d4 * 1.772d)), 0, 255) | (unsignedByte5 << 24) | iConstrainValue | (Util.constrainValue((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255) << 8);
                i5++;
                i3 = 0;
            }
            this.colorsSet = true;
        }

        public Cue build() {
            int i2;
            if (this.planeWidth == 0 || this.planeHeight == 0 || this.bitmapWidth == 0 || this.bitmapHeight == 0 || this.bitmapData.limit() == 0) {
                return null;
            }
            ParsableByteArray parsableByteArray = this.bitmapData;
            if (parsableByteArray.getPosition() != parsableByteArray.limit() || !this.colorsSet) {
                return null;
            }
            this.bitmapData.setPosition(0);
            int i3 = this.bitmapWidth * this.bitmapHeight;
            int[] iArr = new int[i3];
            int i4 = 0;
            while (i4 < i3) {
                int unsignedByte = this.bitmapData.readUnsignedByte();
                if (unsignedByte != 0) {
                    i2 = i4 + 1;
                    iArr[i4] = this.colors[unsignedByte];
                } else {
                    int unsignedByte2 = this.bitmapData.readUnsignedByte();
                    if (unsignedByte2 != 0) {
                        int unsignedByte3 = unsignedByte2 & 63;
                        if ((unsignedByte2 & 64) != 0) {
                            unsignedByte3 = (unsignedByte3 << 8) | this.bitmapData.readUnsignedByte();
                        }
                        int i5 = unsignedByte2 & 128;
                        int[] iArr2 = this.colors;
                        i2 = unsignedByte3 + i4;
                        Arrays.fill(iArr, i4, i2, i5 == 0 ? iArr2[0] : iArr2[this.bitmapData.readUnsignedByte()]);
                    }
                }
                i4 = i2;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.bitmapWidth, this.bitmapHeight, Bitmap.Config.ARGB_8888);
            Cue.Builder builder = new Cue.Builder();
            builder.setBitmap(bitmapCreateBitmap);
            builder.setPosition(this.bitmapX / this.planeWidth);
            builder.setPositionAnchor(0);
            builder.setLine(this.bitmapY / this.planeHeight, 0);
            builder.setLineAnchor(0);
            builder.setSize(this.bitmapWidth / this.planeWidth);
            builder.setBitmapHeight(this.bitmapHeight / this.planeHeight);
            return builder.build();
        }

        public void reset() {
            this.planeWidth = 0;
            this.planeHeight = 0;
            this.bitmapX = 0;
            this.bitmapY = 0;
            this.bitmapWidth = 0;
            this.bitmapHeight = 0;
            this.bitmapData.reset(0);
            this.colorsSet = false;
        }
    }

    private static Cue readNextSection(ParsableByteArray parsableByteArray, CueBuilder cueBuilder) {
        int iLimit = parsableByteArray.limit();
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition() + unsignedShort;
        Cue cueBuild = null;
        if (position > iLimit) {
            parsableByteArray.setPosition(iLimit);
            return null;
        }
        if (unsignedByte != 128) {
            switch (unsignedByte) {
                case 20:
                    cueBuilder.parsePaletteSection(parsableByteArray, unsignedShort);
                    break;
                case 21:
                    cueBuilder.parseBitmapSection(parsableByteArray, unsignedShort);
                    break;
                case 22:
                    cueBuilder.parseIdentifierSection(parsableByteArray, unsignedShort);
                    break;
            }
        } else {
            cueBuild = cueBuilder.build();
            cueBuilder.reset();
        }
        parsableByteArray.setPosition(position);
        return cueBuild;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i2, int i3, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        this.buffer.reset(bArr, i3 + i2);
        this.buffer.setPosition(i2);
        Inflater inflater = this.inflater;
        if (inflater == null) {
            inflater = new Inflater();
            this.inflater = inflater;
        }
        if (Util.maybeInflate(this.buffer, this.inflatedBuffer, inflater)) {
            ParsableByteArray parsableByteArray = this.buffer;
            ParsableByteArray parsableByteArray2 = this.inflatedBuffer;
            parsableByteArray.reset(parsableByteArray2.getData(), parsableByteArray2.limit());
        }
        this.cueBuilder.reset();
        ArrayList arrayList = new ArrayList();
        while (this.buffer.bytesLeft() >= 3) {
            Cue nextSection = readNextSection(this.buffer, this.cueBuilder);
            if (nextSection != null) {
                arrayList.add(nextSection);
            }
        }
        consumer.accept(new CuesWithTiming(arrayList, C.TIME_UNSET, C.TIME_UNSET));
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
}
