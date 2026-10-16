package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.Quirk;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class IncorrectJpegMetadataQuirk implements Quirk {
    private static final Set<String> SAMSUNG_DEVICES = new HashSet(Arrays.asList("A24", "BEYOND0", "BEYOND2"));

    private boolean canParseSosMarker(byte[] bArr) {
        int i2 = 2;
        while (i2 + 4 <= bArr.length && bArr[i2] == -1) {
            if (bArr[i2 + 1] == -38) {
                return true;
            }
            i2 += (((bArr[i2 + 2] & 255) << 8) | (bArr[i2 + 3] & 255)) + 2;
        }
        return false;
    }

    private int findSecondFfd8Position(byte[] bArr) {
        int i2 = 2;
        while (true) {
            int i3 = i2 + 1;
            if (i3 > bArr.length) {
                return -1;
            }
            if (bArr[i2] == -1 && bArr[i3] == -40) {
                return i2;
            }
            i2 = i3;
        }
    }

    private static boolean isSamsungProblematicDevice() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && SAMSUNG_DEVICES.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    static boolean load() {
        return isSamsungProblematicDevice();
    }

    public byte[] jpegImageToJpegByteArray(ImageProxy imageProxy) {
        int iFindSecondFfd8Position = 0;
        ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        buffer.rewind();
        byte[] bArr = new byte[buffer.remaining()];
        buffer.get(bArr);
        return (canParseSosMarker(bArr) || (iFindSecondFfd8Position = findSecondFfd8Position(bArr)) != -1) ? Arrays.copyOfRange(bArr, iFindSecondFfd8Position, buffer.limit()) : bArr;
    }
}
