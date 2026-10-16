package androidx.camera.core.internal.compat.workaround;

import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class InvalidJpegDataParser {
    private final LargeJpegImageQuirk mQuirk = (LargeJpegImageQuirk) DeviceQuirks.get(LargeJpegImageQuirk.class);

    public static int getJfifEoiMarkEndPosition(byte[] bArr) {
        int i2 = 2;
        while (i2 + 4 <= bArr.length && bArr[i2] == -1) {
            int i3 = i2 + 2;
            int i4 = bArr[i3] & 255;
            int i5 = bArr[i2 + 3] & 255;
            if (bArr[i2 + 1] == -38) {
                while (true) {
                    int i6 = i3 + 2;
                    if (i6 > bArr.length) {
                        return -1;
                    }
                    int i7 = i3 + 1;
                    if (bArr[i3] == -1 && bArr[i7] == -39) {
                        return i6;
                    }
                    i3 = i7;
                }
            } else {
                i2 += ((i4 << 8) | i5) + 2;
            }
        }
        return -1;
    }

    public int getValidDataLength(byte[] bArr) {
        LargeJpegImageQuirk largeJpegImageQuirk = this.mQuirk;
        if (largeJpegImageQuirk == null || !largeJpegImageQuirk.shouldCheckInvalidJpegData(bArr)) {
            return bArr.length;
        }
        int jfifEoiMarkEndPosition = getJfifEoiMarkEndPosition(bArr);
        return jfifEoiMarkEndPosition != -1 ? jfifEoiMarkEndPosition : bArr.length;
    }
}
