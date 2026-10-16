package androidx.media3.exoplayer.video;

import android.os.Build;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.media3.container.ObuParser;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Av1ObuUtil {
    private static final byte[] expectedAv1Hdr10PlusPayloadPrefix = {-75, 0, 60, 0, 1, 4};

    private Av1ObuUtil() {
    }

    private static boolean hasNonHdr10PlusMetadata(ObuParser.Obu obu) {
        if (obu.type == 5) {
            try {
                ObuParser.Metadata metadata = ObuParser.Metadata.parse(obu);
                if (metadata.type != 4) {
                    return false;
                }
                int iRemaining = metadata.payload.remaining();
                byte[] bArr = expectedAv1Hdr10PlusPayloadPrefix;
                int length = bArr.length;
                if (iRemaining < length) {
                    return true;
                }
                byte[] bArr2 = new byte[length];
                metadata.payload.asReadOnlyBuffer().get(bArr2);
                if (!Arrays.equals(bArr2, bArr)) {
                    return true;
                }
            } catch (BufferUnderflowException unused) {
            }
        }
        return false;
    }

    public static void maybeRewriteAv1MetadataObus(ByteBuffer byteBuffer) {
        if (Build.VERSION.SDK_INT >= 37) {
            return;
        }
        for (ObuParser.Obu obu : ObuParser.split(byteBuffer.asReadOnlyBuffer())) {
            if (hasNonHdr10PlusMetadata(obu)) {
                byteBuffer.put(obu.payload.position(), StylePropertiesKt.ClipId);
            }
        }
    }
}
