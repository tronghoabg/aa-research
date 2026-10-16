package androidx.media3.extractor.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.compose.foundation.style.StylePropertiesKt;
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
import androidx.work.WorkInfo;
import com.google.d.d.bn;
import com.waze.strings.DisplayStrings;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DvbParser implements SubtitleParser {
    public static final int CUE_REPLACEMENT_BEHAVIOR = 2;
    private static final int DATA_TYPE_24_TABLE_DATA = 32;
    private static final int DATA_TYPE_28_TABLE_DATA = 33;
    private static final int DATA_TYPE_2BP_CODE_STRING = 16;
    private static final int DATA_TYPE_48_TABLE_DATA = 34;
    private static final int DATA_TYPE_4BP_CODE_STRING = 17;
    private static final int DATA_TYPE_8BP_CODE_STRING = 18;
    private static final int DATA_TYPE_END_LINE = 240;
    private static final int OBJECT_CODING_PIXELS = 0;
    private static final int OBJECT_CODING_STRING = 1;
    private static final int PAGE_STATE_NORMAL = 0;
    private static final int REGION_DEPTH_4_BIT = 2;
    private static final int REGION_DEPTH_8_BIT = 3;
    private static final int SEGMENT_TYPE_CLUT_DEFINITION = 18;
    private static final int SEGMENT_TYPE_DISPLAY_DEFINITION = 20;
    private static final int SEGMENT_TYPE_OBJECT_DATA = 19;
    private static final int SEGMENT_TYPE_PAGE_COMPOSITION = 16;
    private static final int SEGMENT_TYPE_REGION_COMPOSITION = 17;
    private static final String TAG = "DvbParser";
    private static final byte[] defaultMap2To4 = {0, 7, 8, StylePropertiesKt.RightId};
    private static final byte[] defaultMap2To8 = {0, 119, -120, -1};
    private static final byte[] defaultMap4To8 = {0, StylePropertiesKt.MinWidthId, StylePropertiesKt.BackgroundColorId, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private Bitmap bitmap;
    private final Canvas canvas;
    private final ClutDefinition defaultClutDefinition;
    private final DisplayDefinition defaultDisplayDefinition;
    private final Paint defaultPaint;
    private final Paint fillRegionPaint;
    private final SubtitleService subtitleService;

    /* compiled from: WazeSource */
    final class ClutDefinition {
        public final int[] clutEntries2Bit;
        public final int[] clutEntries4Bit;
        public final int[] clutEntries8Bit;
        public final int id;

        public ClutDefinition(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
            this.id = i2;
            this.clutEntries2Bit = iArr;
            this.clutEntries4Bit = iArr2;
            this.clutEntries8Bit = iArr3;
        }
    }

    /* compiled from: WazeSource */
    final class DisplayDefinition {
        public final int height;
        public final int horizontalPositionMaximum;
        public final int horizontalPositionMinimum;
        public final int verticalPositionMaximum;
        public final int verticalPositionMinimum;
        public final int width;

        public DisplayDefinition(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.width = i2;
            this.height = i3;
            this.horizontalPositionMinimum = i4;
            this.horizontalPositionMaximum = i5;
            this.verticalPositionMinimum = i6;
            this.verticalPositionMaximum = i7;
        }
    }

    /* compiled from: WazeSource */
    final class ObjectData {
        public final byte[] bottomFieldData;
        public final int id;
        public final boolean nonModifyingColorFlag;
        public final byte[] topFieldData;

        public ObjectData(int i2, boolean z, byte[] bArr, byte[] bArr2) {
            this.id = i2;
            this.nonModifyingColorFlag = z;
            this.topFieldData = bArr;
            this.bottomFieldData = bArr2;
        }
    }

    /* compiled from: WazeSource */
    final class PageComposition {
        public final SparseArray<PageRegion> regions;
        public final int state;
        public final int timeOutSecs;
        public final int version;

        public PageComposition(int i2, int i3, int i4, SparseArray<PageRegion> sparseArray) {
            this.timeOutSecs = i2;
            this.version = i3;
            this.state = i4;
            this.regions = sparseArray;
        }
    }

    /* compiled from: WazeSource */
    final class PageRegion {
        public final int horizontalAddress;
        public final int verticalAddress;

        public PageRegion(int i2, int i3) {
            this.horizontalAddress = i2;
            this.verticalAddress = i3;
        }
    }

    /* compiled from: WazeSource */
    final class RegionComposition {
        public final int clutId;
        public final int depth;
        public final boolean fillFlag;
        public final int height;
        public final int id;
        public final int levelOfCompatibility;
        public final int pixelCode2Bit;
        public final int pixelCode4Bit;
        public final int pixelCode8Bit;
        public final SparseArray<RegionObject> regionObjects;
        public final int width;

        public RegionComposition(int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, SparseArray<RegionObject> sparseArray) {
            this.id = i2;
            this.fillFlag = z;
            this.width = i3;
            this.height = i4;
            this.levelOfCompatibility = i5;
            this.depth = i6;
            this.clutId = i7;
            this.pixelCode8Bit = i8;
            this.pixelCode4Bit = i9;
            this.pixelCode2Bit = i10;
            this.regionObjects = sparseArray;
        }

        public void mergeFrom(RegionComposition regionComposition) {
            SparseArray<RegionObject> sparseArray = regionComposition.regionObjects;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                this.regionObjects.put(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
            }
        }
    }

    /* compiled from: WazeSource */
    final class RegionObject {
        public final int backgroundPixelCode;
        public final int foregroundPixelCode;
        public final int horizontalPosition;
        public final int provider;
        public final int type;
        public final int verticalPosition;

        public RegionObject(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.type = i2;
            this.provider = i3;
            this.horizontalPosition = i4;
            this.verticalPosition = i5;
            this.foregroundPixelCode = i6;
            this.backgroundPixelCode = i7;
        }
    }

    /* compiled from: WazeSource */
    final class SubtitleService {
        public final int ancillaryPageId;
        public DisplayDefinition displayDefinition;
        public PageComposition pageComposition;
        public final int subtitlePageId;
        public final SparseArray<RegionComposition> regions = new SparseArray<>();
        public final SparseArray<ClutDefinition> cluts = new SparseArray<>();
        public final SparseArray<ObjectData> objects = new SparseArray<>();
        public final SparseArray<ClutDefinition> ancillaryCluts = new SparseArray<>();
        public final SparseArray<ObjectData> ancillaryObjects = new SparseArray<>();

        public SubtitleService(int i2, int i3) {
            this.subtitlePageId = i2;
            this.ancillaryPageId = i3;
        }

        public void reset() {
            this.regions.clear();
            this.cluts.clear();
            this.objects.clear();
            this.ancillaryCluts.clear();
            this.ancillaryObjects.clear();
            this.displayDefinition = null;
            this.pageComposition = null;
        }
    }

    public DvbParser(List<byte[]> list) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(list.get(0));
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        Paint paint = new Paint();
        this.defaultPaint = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.fillRegionPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.canvas = new Canvas();
        this.defaultDisplayDefinition = new DisplayDefinition(719, DisplayStrings.DS_REPORT_MENU_V2_MAP_ISSUE_NO_ROAD_LABEL, 0, 719, 0, DisplayStrings.DS_REPORT_MENU_V2_MAP_ISSUE_NO_ROAD_LABEL);
        this.defaultClutDefinition = new ClutDefinition(0, generateDefault2BitClutEntries(), generateDefault4BitClutEntries(), generateDefault8BitClutEntries());
        this.subtitleService = new SubtitleService(unsignedShort, unsignedShort2);
    }

    private static byte[] buildClutMapTable(int i2, int i3, ParsableBitArray parsableBitArray) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) parsableBitArray.readBits(i3);
        }
        return bArr;
    }

    private static int[] generateDefault2BitClutEntries() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] generateDefault4BitClutEntries() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            int i3 = i2 & 4;
            int i4 = i2 & 2;
            int i5 = i2 & 1;
            if (i2 < 8) {
                iArr[i2] = getColor(255, 1 != i5 ? 0 : 255, i4 != 0 ? 255 : 0, i3 != 0 ? 255 : 0);
            } else {
                iArr[i2] = getColor(255, 1 != i5 ? 0 : 127, i4 != 0 ? 127 : 0, i3 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] generateDefault8BitClutEntries() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = getColor(63, 1 != (i2 & 1) ? 0 : 255, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = getColor(255, (1 != (i2 & 1) ? 0 : 85) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = getColor(127, (1 != (i2 & 1) ? 0 : 85) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = getColor(255, (1 != (i2 & 1) ? 0 : 43) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = getColor(255, (1 != (i2 & 1) ? 0 : 43) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int getColor(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    private static int paint2BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z;
        int i4;
        int bits;
        int bits2;
        boolean z2 = false;
        while (true) {
            int bits3 = parsableBitArray.readBits(2);
            if (bits3 != 0) {
                z = z2;
                i4 = 1;
            } else {
                if (parsableBitArray.readBit()) {
                    bits = parsableBitArray.readBits(3) + 3;
                    bits2 = parsableBitArray.readBits(2);
                } else {
                    if (parsableBitArray.readBit()) {
                        z = z2;
                        i4 = 1;
                    } else {
                        int bits4 = parsableBitArray.readBits(2);
                        if (bits4 == 0) {
                            z = true;
                        } else if (bits4 == 1) {
                            z = z2;
                            i4 = 2;
                        } else if (bits4 == 2) {
                            bits = parsableBitArray.readBits(4) + 12;
                            bits2 = parsableBitArray.readBits(2);
                        } else if (bits4 != 3) {
                            z = z2;
                        } else {
                            bits = parsableBitArray.readBits(8) + 29;
                            bits2 = parsableBitArray.readBits(2);
                        }
                        bits3 = 0;
                        i4 = 0;
                    }
                    bits3 = 0;
                }
                z = z2;
                i4 = bits;
                bits3 = bits2;
            }
            if (i4 != 0 && paint != null) {
                if (bArr != null) {
                    bits3 = bArr[bits3];
                }
                paint.setColor(iArr[bits3]);
                canvas.drawRect(i2, i3, i2 + i4, 1 + i3, paint);
            }
            i2 += i4;
            if (z) {
                return i2;
            }
            z2 = z;
        }
    }

    private static int paint4BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z;
        int i4;
        int bits;
        int bits2;
        boolean z2 = false;
        while (true) {
            int bits3 = parsableBitArray.readBits(4);
            if (bits3 != 0) {
                z = z2;
                i4 = 1;
            } else if (parsableBitArray.readBit()) {
                if (parsableBitArray.readBit()) {
                    int bits4 = parsableBitArray.readBits(2);
                    if (bits4 == 0) {
                        z = z2;
                        i4 = 1;
                        bits3 = 0;
                    } else if (bits4 == 1) {
                        bits3 = 0;
                        i4 = 2;
                        z = z2;
                    } else if (bits4 == 2) {
                        bits = parsableBitArray.readBits(4) + 9;
                        bits2 = parsableBitArray.readBits(4);
                    } else if (bits4 != 3) {
                        z = z2;
                        bits3 = 0;
                        i4 = 0;
                    } else {
                        bits = parsableBitArray.readBits(8) + 25;
                        bits2 = parsableBitArray.readBits(4);
                    }
                } else {
                    bits = parsableBitArray.readBits(2) + 4;
                    bits2 = parsableBitArray.readBits(4);
                }
                z = z2;
                i4 = bits;
                bits3 = bits2;
            } else {
                int bits5 = parsableBitArray.readBits(3);
                if (bits5 != 0) {
                    z = z2;
                    i4 = bits5 + 2;
                    bits3 = 0;
                } else {
                    z = true;
                    bits3 = 0;
                    i4 = 0;
                }
            }
            if (i4 != 0 && paint != null) {
                if (bArr != null) {
                    bits3 = bArr[bits3];
                }
                paint.setColor(iArr[bits3]);
                canvas.drawRect(i2, i3, i2 + i4, 1 + i3, paint);
            }
            i2 += i4;
            if (z) {
                return i2;
            }
            z2 = z;
        }
    }

    private static int paint8BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z;
        int bits;
        boolean z2 = false;
        while (true) {
            int bits2 = parsableBitArray.readBits(8);
            if (bits2 != 0) {
                z = z2;
                bits = 1;
            } else if (parsableBitArray.readBit()) {
                z = z2;
                bits = parsableBitArray.readBits(7);
                bits2 = parsableBitArray.readBits(8);
            } else {
                int bits3 = parsableBitArray.readBits(7);
                if (bits3 != 0) {
                    z = z2;
                    bits = bits3;
                    bits2 = 0;
                } else {
                    z = true;
                    bits2 = 0;
                    bits = 0;
                }
            }
            if (bits != 0 && paint != null) {
                if (bArr != null) {
                    bits2 = bArr[bits2];
                }
                paint.setColor(iArr[bits2]);
                canvas.drawRect(i2, i3, i2 + bits, 1 + i3, paint);
            }
            i2 += bits;
            if (z) {
                return i2;
            }
            z2 = z;
        }
    }

    private static void paintPixelDataSubBlock(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        Canvas canvas2;
        byte[] bArr2;
        Paint paint2;
        byte[] bArr3;
        byte[] bArr4;
        Paint paint3;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        byte[] bArrBuildClutMapTable = null;
        byte[] bArrBuildClutMapTable2 = null;
        int iPaint2BitPixelCodeString = i3;
        int i5 = i4;
        byte[] bArrBuildClutMapTable3 = null;
        while (parsableBitArray.bitsLeft() != 0) {
            int bits = parsableBitArray.readBits(8);
            if (bits != 240) {
                switch (bits) {
                    case 16:
                        int[] iArr2 = iArr;
                        Paint paint4 = paint;
                        canvas2 = canvas;
                        if (i2 != 3) {
                            if (i2 != 2) {
                                bArr2 = null;
                                paint2 = paint4;
                            } else if (bArrBuildClutMapTable2 == null) {
                                bArr3 = defaultMap2To4;
                                paint2 = paint4;
                                bArr2 = bArr3;
                            } else {
                                paint2 = paint4;
                                bArr2 = bArrBuildClutMapTable2;
                            }
                            iPaint2BitPixelCodeString = paint2BitPixelCodeString(parsableBitArray, iArr2, bArr2, iPaint2BitPixelCodeString, i5, paint2, canvas2);
                            parsableBitArray.byteAlign();
                            iArr = iArr2;
                            paint = paint2;
                        } else if (bArrBuildClutMapTable3 == null) {
                            bArr3 = defaultMap2To8;
                            paint2 = paint4;
                            bArr2 = bArr3;
                            iPaint2BitPixelCodeString = paint2BitPixelCodeString(parsableBitArray, iArr2, bArr2, iPaint2BitPixelCodeString, i5, paint2, canvas2);
                            parsableBitArray.byteAlign();
                            iArr = iArr2;
                            paint = paint2;
                            break;
                        } else {
                            paint2 = paint4;
                            bArr2 = bArrBuildClutMapTable3;
                            iPaint2BitPixelCodeString = paint2BitPixelCodeString(parsableBitArray, iArr2, bArr2, iPaint2BitPixelCodeString, i5, paint2, canvas2);
                            parsableBitArray.byteAlign();
                            iArr = iArr2;
                            paint = paint2;
                        }
                    case 17:
                        int[] iArr3 = iArr;
                        Paint paint5 = paint;
                        canvas2 = canvas;
                        if (i2 != 3) {
                            bArr4 = null;
                            paint3 = paint5;
                        } else if (bArrBuildClutMapTable == null) {
                            paint3 = paint5;
                            bArr4 = defaultMap4To8;
                        } else {
                            paint3 = paint5;
                            bArr4 = bArrBuildClutMapTable;
                        }
                        iPaint2BitPixelCodeString = paint4BitPixelCodeString(parsableBitArray, iArr3, bArr4, iPaint2BitPixelCodeString, i5, paint3, canvas2);
                        parsableBitArray.byteAlign();
                        paint = paint3;
                        iArr = iArr3;
                        break;
                    case 18:
                        iPaint2BitPixelCodeString = paint8BitPixelCodeString(parsableBitArray, iArr, null, iPaint2BitPixelCodeString, i5, paint, canvas);
                        continue;
                    default:
                        switch (bits) {
                            case 32:
                                bArrBuildClutMapTable2 = buildClutMapTable(4, 4, parsableBitArray);
                                break;
                            case 33:
                                bArrBuildClutMapTable3 = buildClutMapTable(4, 8, parsableBitArray);
                                break;
                            case 34:
                                bArrBuildClutMapTable = buildClutMapTable(16, 8, parsableBitArray);
                                break;
                            default:
                                continue;
                        }
                }
                canvas = canvas2;
            } else {
                i5 += 2;
                iPaint2BitPixelCodeString = i3;
            }
        }
    }

    private static void paintPixelDataSubBlocks(ObjectData objectData, ClutDefinition clutDefinition, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        int[] iArr = i2 == 3 ? clutDefinition.clutEntries8Bit : i2 == 2 ? clutDefinition.clutEntries4Bit : clutDefinition.clutEntries2Bit;
        paintPixelDataSubBlock(objectData.topFieldData, iArr, i2, i3, i4, paint, canvas);
        paintPixelDataSubBlock(objectData.bottomFieldData, iArr, i2, i3, i4 + 1, paint, canvas);
    }

    private CuesWithTiming parse(ParsableBitArray parsableBitArray) {
        float f2;
        float f3;
        SparseArray<PageRegion> sparseArray;
        int i2;
        while (parsableBitArray.bitsLeft() >= 48 && parsableBitArray.readBits(8) == 15) {
            parseSubtitlingSegment(parsableBitArray, this.subtitleService);
        }
        SubtitleService subtitleService = this.subtitleService;
        PageComposition pageComposition = subtitleService.pageComposition;
        if (pageComposition == null) {
            return new CuesWithTiming(bn.p(), C.TIME_UNSET, C.TIME_UNSET);
        }
        DisplayDefinition displayDefinition = subtitleService.displayDefinition;
        if (displayDefinition == null) {
            displayDefinition = this.defaultDisplayDefinition;
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap == null || displayDefinition.width + 1 != bitmap.getWidth() || displayDefinition.height + 1 != this.bitmap.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(displayDefinition.width + 1, displayDefinition.height + 1, Bitmap.Config.ARGB_8888);
            this.bitmap = bitmapCreateBitmap;
            this.canvas.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<PageRegion> sparseArray2 = pageComposition.regions;
        int i3 = 0;
        while (i3 < sparseArray2.size()) {
            this.canvas.save();
            PageRegion pageRegionValueAt = sparseArray2.valueAt(i3);
            RegionComposition regionComposition = this.subtitleService.regions.get(sparseArray2.keyAt(i3));
            int i4 = pageRegionValueAt.horizontalAddress + displayDefinition.horizontalPositionMinimum;
            int i5 = pageRegionValueAt.verticalAddress + displayDefinition.verticalPositionMinimum;
            this.canvas.clipRect(i4, i5, Math.min(regionComposition.width + i4, displayDefinition.horizontalPositionMaximum), Math.min(regionComposition.height + i5, displayDefinition.verticalPositionMaximum));
            ClutDefinition clutDefinition = this.subtitleService.cluts.get(regionComposition.clutId);
            if (clutDefinition == null && (clutDefinition = this.subtitleService.ancillaryCluts.get(regionComposition.clutId)) == null) {
                clutDefinition = this.defaultClutDefinition;
            }
            ClutDefinition clutDefinition2 = clutDefinition;
            SparseArray<RegionObject> sparseArray3 = regionComposition.regionObjects;
            int i6 = 0;
            while (i6 < sparseArray3.size()) {
                int iKeyAt = sparseArray3.keyAt(i6);
                RegionObject regionObjectValueAt = sparseArray3.valueAt(i6);
                ObjectData objectData = this.subtitleService.objects.get(iKeyAt);
                if (objectData == null) {
                    objectData = this.subtitleService.ancillaryObjects.get(iKeyAt);
                }
                if (objectData != null) {
                    sparseArray = sparseArray2;
                    i2 = i6;
                    paintPixelDataSubBlocks(objectData, clutDefinition2, regionComposition.depth, regionObjectValueAt.horizontalPosition + i4, regionObjectValueAt.verticalPosition + i5, objectData.nonModifyingColorFlag ? null : this.defaultPaint, this.canvas);
                } else {
                    sparseArray = sparseArray2;
                    i2 = i6;
                }
                i6 = i2 + 1;
                sparseArray2 = sparseArray;
            }
            SparseArray<PageRegion> sparseArray4 = sparseArray2;
            float f4 = i5;
            float f5 = i4;
            if (regionComposition.fillFlag) {
                int i7 = regionComposition.depth;
                this.fillRegionPaint.setColor(i7 == 3 ? clutDefinition2.clutEntries8Bit[regionComposition.pixelCode8Bit] : i7 == 2 ? clutDefinition2.clutEntries4Bit[regionComposition.pixelCode4Bit] : clutDefinition2.clutEntries2Bit[regionComposition.pixelCode2Bit]);
                f2 = f4;
                f3 = f5;
                this.canvas.drawRect(f3, f2, regionComposition.width + i4, regionComposition.height + i5, this.fillRegionPaint);
            } else {
                f2 = f4;
                f3 = f5;
            }
            Cue.Builder builder = new Cue.Builder();
            builder.setBitmap(Bitmap.createBitmap(this.bitmap, i4, i5, regionComposition.width, regionComposition.height));
            builder.setPosition(f3 / displayDefinition.width);
            builder.setPositionAnchor(0);
            builder.setLine(f2 / displayDefinition.height, 0);
            builder.setLineAnchor(0);
            builder.setSize(regionComposition.width / displayDefinition.width);
            builder.setBitmapHeight(regionComposition.height / displayDefinition.height);
            arrayList.add(builder.build());
            this.canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            this.canvas.restore();
            i3++;
            sparseArray2 = sparseArray4;
        }
        return new CuesWithTiming(arrayList, C.TIME_UNSET, C.TIME_UNSET);
    }

    private static ClutDefinition parseClutDefinition(ParsableBitArray parsableBitArray, int i2) {
        int bits;
        int bits2;
        int bits3;
        int bits4;
        ParsableBitArray parsableBitArray2 = parsableBitArray;
        int i3 = 8;
        int bits5 = parsableBitArray2.readBits(8);
        parsableBitArray2.skipBits(8);
        int[] iArrGenerateDefault2BitClutEntries = generateDefault2BitClutEntries();
        int[] iArrGenerateDefault4BitClutEntries = generateDefault4BitClutEntries();
        int[] iArrGenerateDefault8BitClutEntries = generateDefault8BitClutEntries();
        int i4 = i2 - 2;
        while (i4 > 0) {
            int bits6 = parsableBitArray2.readBits(i3);
            int bits7 = parsableBitArray2.readBits(i3);
            int[] iArr = (bits7 & 128) != 0 ? iArrGenerateDefault2BitClutEntries : (bits7 & 64) != 0 ? iArrGenerateDefault4BitClutEntries : iArrGenerateDefault8BitClutEntries;
            if ((bits7 & 1) != 0) {
                bits3 = parsableBitArray2.readBits(i3);
                bits4 = parsableBitArray2.readBits(i3);
                bits = parsableBitArray2.readBits(i3);
                bits2 = parsableBitArray2.readBits(i3);
                i4 -= 6;
            } else {
                int bits8 = parsableBitArray2.readBits(6) << 2;
                int bits9 = parsableBitArray2.readBits(4) << 4;
                i4 -= 4;
                bits = parsableBitArray2.readBits(4) << 4;
                bits2 = parsableBitArray2.readBits(2) << 6;
                bits3 = bits8;
                bits4 = bits9;
            }
            if (bits3 == 0) {
                bits2 = 255;
            }
            if (bits3 == 0) {
                bits = 0;
            }
            if (bits3 == 0) {
                bits4 = 0;
            }
            int i5 = bits + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            double d2 = bits3;
            double d3 = bits4 + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            double d4 = i5;
            iArr[bits6] = getColor((byte) (255 - (bits2 & 255)), Util.constrainValue((int) (d2 + (1.402d * d3)), 0, 255), Util.constrainValue((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), Util.constrainValue((int) (d2 + (d4 * 1.772d)), 0, 255));
            parsableBitArray2 = parsableBitArray;
            bits5 = bits5;
            i3 = 8;
        }
        return new ClutDefinition(bits5, iArrGenerateDefault2BitClutEntries, iArrGenerateDefault4BitClutEntries, iArrGenerateDefault8BitClutEntries);
    }

    private static DisplayDefinition parseDisplayDefinition(ParsableBitArray parsableBitArray) {
        int i2;
        int i3;
        int i4;
        int bits;
        parsableBitArray.skipBits(4);
        boolean bit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int bits2 = parsableBitArray.readBits(16);
        int bits3 = parsableBitArray.readBits(16);
        if (bit) {
            int bits4 = parsableBitArray.readBits(16);
            int bits5 = parsableBitArray.readBits(16);
            int bits6 = parsableBitArray.readBits(16);
            bits = parsableBitArray.readBits(16);
            i4 = bits5;
            i3 = bits6;
            i2 = bits4;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = bits2;
            bits = bits3;
        }
        return new DisplayDefinition(bits2, bits3, i2, i4, i3, bits);
    }

    private static ObjectData parseObjectData(ParsableBitArray parsableBitArray) {
        byte[] bArr;
        int bits = parsableBitArray.readBits(16);
        parsableBitArray.skipBits(4);
        int bits2 = parsableBitArray.readBits(2);
        boolean bit = parsableBitArray.readBit();
        parsableBitArray.skipBits(1);
        byte[] bArr2 = Util.EMPTY_BYTE_ARRAY;
        if (bits2 != 1) {
            if (bits2 == 0) {
                int bits3 = parsableBitArray.readBits(16);
                int bits4 = parsableBitArray.readBits(16);
                if (bits3 > 0) {
                    bArr2 = new byte[bits3];
                    parsableBitArray.readBytes(bArr2, 0, bits3);
                }
                if (bits4 > 0) {
                    bArr = new byte[bits4];
                    parsableBitArray.readBytes(bArr, 0, bits4);
                }
            }
            return new ObjectData(bits, bit, bArr2, bArr);
        }
        parsableBitArray.skipBits(parsableBitArray.readBits(8) * 16);
        bArr = bArr2;
        return new ObjectData(bits, bit, bArr2, bArr);
    }

    private static PageComposition parsePageComposition(ParsableBitArray parsableBitArray, int i2) {
        int bits = parsableBitArray.readBits(8);
        int bits2 = parsableBitArray.readBits(4);
        int bits3 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i2 - 2; i3 > 0; i3 -= 6) {
            int bits4 = parsableBitArray.readBits(8);
            parsableBitArray.skipBits(8);
            sparseArray.put(bits4, new PageRegion(parsableBitArray.readBits(16), parsableBitArray.readBits(16)));
        }
        return new PageComposition(bits, bits2, bits3, sparseArray);
    }

    private static RegionComposition parseRegionComposition(ParsableBitArray parsableBitArray, int i2) {
        int i3;
        int bits;
        int bits2;
        char c2;
        int bits3 = parsableBitArray.readBits(8);
        int i4 = 4;
        parsableBitArray.skipBits(4);
        boolean bit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int i5 = 16;
        int bits4 = parsableBitArray.readBits(16);
        int bits5 = parsableBitArray.readBits(16);
        int bits6 = parsableBitArray.readBits(3);
        int bits7 = parsableBitArray.readBits(3);
        int i6 = 2;
        parsableBitArray.skipBits(2);
        int bits8 = parsableBitArray.readBits(8);
        int bits9 = parsableBitArray.readBits(8);
        int bits10 = parsableBitArray.readBits(4);
        int bits11 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        SparseArray sparseArray = new SparseArray();
        int i7 = i2 - 10;
        while (i7 > 0) {
            int bits12 = parsableBitArray.readBits(i5);
            int bits13 = parsableBitArray.readBits(i6);
            int bits14 = parsableBitArray.readBits(i6);
            int bits15 = parsableBitArray.readBits(12);
            parsableBitArray.skipBits(i4);
            int bits16 = parsableBitArray.readBits(12);
            int i8 = i7 - 6;
            if (bits13 != 1) {
                i3 = 2;
                if (bits13 == 2) {
                    bits13 = 2;
                } else {
                    bits2 = 0;
                    bits = 0;
                    i7 = i8;
                    c2 = '\b';
                    sparseArray.put(bits12, new RegionObject(bits13, bits14, bits15, bits16, bits2, bits));
                    i5 = 16;
                    i6 = i3;
                    i4 = 4;
                }
            } else {
                i3 = 2;
            }
            c2 = '\b';
            i7 -= 8;
            bits2 = parsableBitArray.readBits(8);
            bits = parsableBitArray.readBits(8);
            sparseArray.put(bits12, new RegionObject(bits13, bits14, bits15, bits16, bits2, bits));
            i5 = 16;
            i6 = i3;
            i4 = 4;
        }
        return new RegionComposition(bits3, bit, bits4, bits5, bits6, bits7, bits8, bits9, bits10, bits11, sparseArray);
    }

    private static void parseSubtitlingSegment(ParsableBitArray parsableBitArray, SubtitleService subtitleService) {
        RegionComposition regionComposition;
        int bits = parsableBitArray.readBits(8);
        int bits2 = parsableBitArray.readBits(16);
        int bits3 = parsableBitArray.readBits(16);
        int bytePosition = parsableBitArray.getBytePosition() + bits3;
        if (bits3 * 8 > parsableBitArray.bitsLeft()) {
            Log.w(TAG, "Data field length exceeds limit");
            parsableBitArray.skipBits(parsableBitArray.bitsLeft());
            return;
        }
        switch (bits) {
            case 16:
                if (bits2 == subtitleService.subtitlePageId) {
                    PageComposition pageComposition = subtitleService.pageComposition;
                    PageComposition pageComposition2 = parsePageComposition(parsableBitArray, bits3);
                    if (pageComposition2.state == 0) {
                        if (pageComposition != null) {
                            if (pageComposition.version != pageComposition2.version) {
                                subtitleService.pageComposition = pageComposition2;
                                break;
                            }
                        }
                    } else {
                        subtitleService.pageComposition = pageComposition2;
                        subtitleService.regions.clear();
                        subtitleService.cluts.clear();
                        subtitleService.objects.clear();
                        break;
                    }
                }
                break;
            case 17:
                PageComposition pageComposition3 = subtitleService.pageComposition;
                if (bits2 == subtitleService.subtitlePageId && pageComposition3 != null) {
                    RegionComposition regionComposition2 = parseRegionComposition(parsableBitArray, bits3);
                    if (pageComposition3.state == 0 && (regionComposition = subtitleService.regions.get(regionComposition2.id)) != null) {
                        regionComposition2.mergeFrom(regionComposition);
                    }
                    subtitleService.regions.put(regionComposition2.id, regionComposition2);
                    break;
                }
                break;
            case 18:
                if (bits2 != subtitleService.subtitlePageId) {
                    if (bits2 == subtitleService.ancillaryPageId) {
                        ClutDefinition clutDefinition = parseClutDefinition(parsableBitArray, bits3);
                        subtitleService.ancillaryCluts.put(clutDefinition.id, clutDefinition);
                        break;
                    }
                } else {
                    ClutDefinition clutDefinition2 = parseClutDefinition(parsableBitArray, bits3);
                    subtitleService.cluts.put(clutDefinition2.id, clutDefinition2);
                    break;
                }
                break;
            case 19:
                if (bits2 != subtitleService.subtitlePageId) {
                    if (bits2 == subtitleService.ancillaryPageId) {
                        ObjectData objectData = parseObjectData(parsableBitArray);
                        subtitleService.ancillaryObjects.put(objectData.id, objectData);
                        break;
                    }
                } else {
                    ObjectData objectData2 = parseObjectData(parsableBitArray);
                    subtitleService.objects.put(objectData2.id, objectData2);
                    break;
                }
                break;
            case 20:
                if (bits2 == subtitleService.subtitlePageId) {
                    subtitleService.displayDefinition = parseDisplayDefinition(parsableBitArray);
                    break;
                }
                break;
        }
        parsableBitArray.skipBytes(bytePosition - parsableBitArray.getBytePosition());
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
    public void reset() {
        this.subtitleService.reset();
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ void parse(byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        parse(bArr, 0, bArr.length, outputOptions, consumer);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i2, int i3, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, i3 + i2);
        parsableBitArray.setPosition(i2);
        consumer.accept(parse(parsableBitArray));
    }
}
