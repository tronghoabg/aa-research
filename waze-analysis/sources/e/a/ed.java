package e.a;

import androidx.compose.foundation.style.StylePropertiesKt;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ed implements cl {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f47400a = {StylePropertiesKt.LetterSpacingId, StylePropertiesKt.LineBreakId, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    private static boolean c(byte b2) {
        return b2 < 32 || b2 >= 126 || b2 == 37;
    }

    @Override // e.a.cl
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        int length;
        int i2 = 0;
        while (true) {
            length = bArr.length;
            if (i2 >= length) {
                return new String(bArr, 0);
            }
            byte b2 = bArr[i2];
            if (b2 < 32 || b2 >= 126 || (b2 == 37 && i2 + 2 < length)) {
                break;
            }
            i2++;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        int i3 = 0;
        while (true) {
            int length2 = bArr.length;
            if (i3 >= length2) {
                return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), StandardCharsets.UTF_8);
            }
            int i4 = i3 + 1;
            if (bArr[i3] == 37 && i3 + 2 < length2) {
                try {
                    byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i4, 2, StandardCharsets.US_ASCII), 16));
                    i3 += 3;
                } catch (NumberFormatException unused) {
                }
            }
            byteBufferAllocate.put(bArr[i3]);
            i3 = i4;
        }
    }

    @Override // e.a.cl
    public final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        byte[] bytes = ((String) obj).getBytes(StandardCharsets.UTF_8);
        int i2 = 0;
        while (true) {
            int length = bytes.length;
            if (i2 >= length) {
                return bytes;
            }
            if (c(bytes[i2])) {
                byte[] bArr = new byte[((length - i2) * 3) + i2];
                if (i2 != 0) {
                    System.arraycopy(bytes, 0, bArr, 0, i2);
                }
                int i3 = i2;
                while (i2 < bytes.length) {
                    int i4 = i3 + 1;
                    byte b2 = bytes[i2];
                    if (c(b2)) {
                        bArr[i3] = StylePropertiesKt.ContentColorId;
                        byte[] bArr2 = f47400a;
                        bArr[i4] = bArr2[(b2 >> 4) & 15];
                        bArr[i3 + 2] = bArr2[b2 & StylePropertiesKt.RightId];
                        i3 += 3;
                    } else {
                        bArr[i3] = b2;
                        i3 = i4;
                    }
                    i2++;
                }
                return Arrays.copyOf(bArr, i3);
            }
            i2++;
        }
    }
}
