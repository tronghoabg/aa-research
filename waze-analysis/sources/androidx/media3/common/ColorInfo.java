package androidx.media3.common;

import android.os.Bundle;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.common.util.Util;
import com.waze.strings.DisplayStrings;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ColorInfo {
    private static final String FIELD_CHROMA_BITDEPTH;
    private static final String FIELD_COLOR_RANGE;
    private static final String FIELD_COLOR_SPACE;
    private static final String FIELD_COLOR_TRANSFER;
    private static final String FIELD_HDR_STATIC_INFO;
    private static final String FIELD_LUMA_BITDEPTH;
    public static final ColorInfo SDR_BT709_LIMITED;
    public static final ColorInfo SRGB_BT709_FULL;
    public final int chromaBitdepth;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    private int hashCode;
    public final byte[] hdrStaticInfo;
    public final int lumaBitdepth;

    static {
        Builder builder = new Builder();
        builder.setColorSpace(1);
        builder.setColorRange(2);
        builder.setColorTransfer(3);
        SDR_BT709_LIMITED = builder.build();
        Builder builder2 = new Builder();
        builder2.setColorSpace(1);
        builder2.setColorRange(1);
        builder2.setColorTransfer(2);
        SRGB_BT709_FULL = builder2.build();
        FIELD_COLOR_SPACE = Util.intToStringMaxRadix(0);
        FIELD_COLOR_RANGE = Util.intToStringMaxRadix(1);
        FIELD_COLOR_TRANSFER = Util.intToStringMaxRadix(2);
        FIELD_HDR_STATIC_INFO = Util.intToStringMaxRadix(3);
        FIELD_LUMA_BITDEPTH = Util.intToStringMaxRadix(4);
        FIELD_CHROMA_BITDEPTH = Util.intToStringMaxRadix(5);
    }

    private ColorInfo(int i2, int i3, int i4, byte[] bArr, int i5, int i6) {
        this.colorSpace = i2;
        this.colorRange = i3;
        this.colorTransfer = i4;
        this.hdrStaticInfo = bArr;
        this.lumaBitdepth = i5;
        this.chromaBitdepth = i6;
    }

    private static String chromaBitdepthToString(int i2) {
        if (i2 == -1) {
            return "NA";
        }
        return i2 + "bit Chroma";
    }

    private static String colorRangeToString(int i2) {
        if (i2 == -1) {
            return "Unset color range";
        }
        if (i2 == 1) {
            return "Full range";
        }
        if (i2 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i2;
    }

    public static int colorSpaceToIsoColorPrimaries(int i2) {
        if (i2 != 2) {
            return i2 != 6 ? 1 : 9;
        }
        return 5;
    }

    public static int colorSpaceToIsoMatrixCoefficients(int i2) {
        if (i2 != 2) {
            return i2 != 6 ? 1 : 9;
        }
        return 6;
    }

    private static String colorSpaceToString(int i2) {
        if (i2 == -1) {
            return "Unset color space";
        }
        if (i2 == 6) {
            return "BT2020";
        }
        if (i2 == 1) {
            return "BT709";
        }
        if (i2 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i2;
    }

    public static int colorTransferToIsoTransferCharacteristics(int i2) {
        if (i2 == 1) {
            return 8;
        }
        if (i2 == 2) {
            return 13;
        }
        if (i2 == 6) {
            return 16;
        }
        if (i2 != 7) {
            return i2 != 10 ? 1 : 4;
        }
        return 18;
    }

    private static String colorTransferToString(int i2) {
        if (i2 == -1) {
            return "Unset color transfer";
        }
        if (i2 == 10) {
            return "Gamma 2.2";
        }
        if (i2 == 1) {
            return "Linear";
        }
        if (i2 == 2) {
            return "sRGB";
        }
        if (i2 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i2 == 6) {
            return "ST2084 PQ";
        }
        if (i2 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i2;
    }

    public static ColorInfo fromBundle(Bundle bundle) {
        return new ColorInfo(bundle.getInt(FIELD_COLOR_SPACE, -1), bundle.getInt(FIELD_COLOR_RANGE, -1), bundle.getInt(FIELD_COLOR_TRANSFER, -1), bundle.getByteArray(FIELD_HDR_STATIC_INFO), bundle.getInt(FIELD_LUMA_BITDEPTH, -1), bundle.getInt(FIELD_CHROMA_BITDEPTH, -1));
    }

    public static boolean isEquivalentToAssumedSdrDefault(ColorInfo colorInfo) {
        if (colorInfo == null) {
            return true;
        }
        int i2 = colorInfo.colorSpace;
        if (i2 != -1 && i2 != 1 && i2 != 2) {
            return false;
        }
        int i3 = colorInfo.colorRange;
        if (i3 != -1 && i3 != 2) {
            return false;
        }
        int i4 = colorInfo.colorTransfer;
        if ((i4 != -1 && i4 != 3) || colorInfo.hdrStaticInfo != null) {
            return false;
        }
        int i5 = colorInfo.chromaBitdepth;
        if (i5 != -1 && i5 != 8) {
            return false;
        }
        int i6 = colorInfo.lumaBitdepth;
        return i6 == -1 || i6 == 8;
    }

    public static boolean isTransferHdr(ColorInfo colorInfo) {
        if (colorInfo == null) {
            return false;
        }
        int i2 = colorInfo.colorTransfer;
        return i2 == 7 || i2 == 6;
    }

    public static int isoColorPrimariesToColorSpace(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int isoTransferCharacteristicsToColorTransfer(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 4) {
            return 10;
        }
        if (i2 == 13) {
            return 2;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String lumaBitdepthToString(int i2) {
        if (i2 == -1) {
            return "NA";
        }
        return i2 + "bit Luma";
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ColorInfo colorInfo = (ColorInfo) obj;
            if (this.colorSpace == colorInfo.colorSpace && this.colorRange == colorInfo.colorRange && this.colorTransfer == colorInfo.colorTransfer && Arrays.equals(this.hdrStaticInfo, colorInfo.hdrStaticInfo) && this.lumaBitdepth == colorInfo.lumaBitdepth && this.chromaBitdepth == colorInfo.chromaBitdepth) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = ((((((((((this.colorSpace + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + this.colorRange) * 31) + this.colorTransfer) * 31) + Arrays.hashCode(this.hdrStaticInfo)) * 31) + this.lumaBitdepth) * 31) + this.chromaBitdepth;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    public boolean isBitdepthValid() {
        return (this.lumaBitdepth == -1 || this.chromaBitdepth == -1) ? false : true;
    }

    public boolean isDataSpaceValid() {
        return (this.colorSpace == -1 || this.colorRange == -1 || this.colorTransfer == -1) ? false : true;
    }

    public boolean isValid() {
        return isBitdepthValid() || isDataSpaceValid();
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(FIELD_COLOR_SPACE, this.colorSpace);
        bundle.putInt(FIELD_COLOR_RANGE, this.colorRange);
        bundle.putInt(FIELD_COLOR_TRANSFER, this.colorTransfer);
        bundle.putByteArray(FIELD_HDR_STATIC_INFO, this.hdrStaticInfo);
        bundle.putInt(FIELD_LUMA_BITDEPTH, this.lumaBitdepth);
        bundle.putInt(FIELD_CHROMA_BITDEPTH, this.chromaBitdepth);
        return bundle;
    }

    public String toLogString() {
        String str;
        String invariant = isDataSpaceValid() ? Util.formatInvariant("%s/%s/%s", colorSpaceToString(this.colorSpace), colorRangeToString(this.colorRange), colorTransferToString(this.colorTransfer)) : "NA/NA/NA";
        if (isBitdepthValid()) {
            str = this.lumaBitdepth + DomExceptionUtils.SEPARATOR + this.chromaBitdepth;
        } else {
            str = "NA/NA";
        }
        return invariant + DomExceptionUtils.SEPARATOR + str;
    }

    public String toString() {
        int i2 = this.chromaBitdepth;
        int i3 = this.lumaBitdepth;
        int i4 = this.colorTransfer;
        int i5 = this.colorRange;
        String strColorSpaceToString = colorSpaceToString(this.colorSpace);
        String strColorRangeToString = colorRangeToString(i5);
        String strColorTransferToString = colorTransferToString(i4);
        String strLumaBitdepthToString = lumaBitdepthToString(i3);
        String strChromaBitdepthToString = chromaBitdepthToString(i2);
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(strColorSpaceToString);
        sb.append(", ");
        sb.append(strColorRangeToString);
        sb.append(", ");
        sb.append(strColorTransferToString);
        sb.append(", ");
        sb.append(this.hdrStaticInfo != null);
        sb.append(", ");
        sb.append(strLumaBitdepthToString);
        sb.append(", ");
        sb.append(strChromaBitdepthToString);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private int chromaBitdepth;
        private int colorRange;
        private int colorSpace;
        private int colorTransfer;
        private byte[] hdrStaticInfo;
        private int lumaBitdepth;

        private Builder(ColorInfo colorInfo) {
            this.colorSpace = colorInfo.colorSpace;
            this.colorRange = colorInfo.colorRange;
            this.colorTransfer = colorInfo.colorTransfer;
            this.hdrStaticInfo = colorInfo.hdrStaticInfo;
            this.lumaBitdepth = colorInfo.lumaBitdepth;
            this.chromaBitdepth = colorInfo.chromaBitdepth;
        }

        public ColorInfo build() {
            return new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, this.hdrStaticInfo, this.lumaBitdepth, this.chromaBitdepth);
        }

        public Builder setChromaBitdepth(int i2) {
            this.chromaBitdepth = i2;
            return this;
        }

        public Builder setColorRange(int i2) {
            this.colorRange = i2;
            return this;
        }

        public Builder setColorSpace(int i2) {
            this.colorSpace = i2;
            return this;
        }

        public Builder setColorTransfer(int i2) {
            this.colorTransfer = i2;
            return this;
        }

        public Builder setHdrStaticInfo(byte[] bArr) {
            this.hdrStaticInfo = bArr;
            return this;
        }

        public Builder setLumaBitdepth(int i2) {
            this.lumaBitdepth = i2;
            return this;
        }

        public Builder() {
            this.colorSpace = -1;
            this.colorRange = -1;
            this.colorTransfer = -1;
            this.lumaBitdepth = -1;
            this.chromaBitdepth = -1;
        }
    }
}
