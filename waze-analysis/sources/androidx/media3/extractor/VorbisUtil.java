package androidx.media3.extractor;

import android.util.Base64;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.vorbis.VorbisComment;
import com.google.d.d.bn;
import com.google.d.l.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class VorbisUtil {
    private static final String TAG = "VorbisUtil";
    private static final b VORBIS_MAPPING_3 = b.h();
    private static final b VORBIS_MAPPING_5 = b.i();
    private static final b VORBIS_MAPPING_6 = b.j();
    private static final b VORBIS_MAPPING_7 = b.k(2, 1, 6, 5, 3, 4);
    private static final b VORBIS_MAPPING_8 = b.k(2, 1, 7, 5, 6, 3, 4);

    private VorbisUtil() {
    }

    public static b getVorbisToAndroidChannelLayoutMapping(int i2) {
        if (i2 == 3) {
            return VORBIS_MAPPING_3;
        }
        if (i2 == 5) {
            return VORBIS_MAPPING_5;
        }
        if (i2 == 6) {
            return VORBIS_MAPPING_6;
        }
        if (i2 == 7) {
            return VORBIS_MAPPING_7;
        }
        if (i2 != 8) {
            return null;
        }
        return VORBIS_MAPPING_8;
    }

    public static Metadata parseVorbisComments(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2);
            String[] strArrSplitAtFirst = Util.splitAtFirst(str, "=");
            if (strArrSplitAtFirst.length != 2) {
                Log.w(TAG, "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (strArrSplitAtFirst[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.fromPictureBlock(new ParsableByteArray(Base64.decode(strArrSplitAtFirst[1], 0))));
                } catch (RuntimeException e2) {
                    Log.w(TAG, "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new VorbisComment(strArrSplitAtFirst[0], strArrSplitAtFirst[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static bn<byte[]> parseVorbisCsdFromEsdsInitializationData(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        parsableByteArray.skipBytes(1);
        int i2 = 0;
        while (parsableByteArray.bytesLeft() > 0 && parsableByteArray.peekUnsignedByte() == 255) {
            parsableByteArray.skipBytes(1);
            i2 += 255;
        }
        int unsignedByte = i2 + parsableByteArray.readUnsignedByte();
        int i3 = 0;
        while (parsableByteArray.bytesLeft() > 0 && parsableByteArray.peekUnsignedByte() == 255) {
            parsableByteArray.skipBytes(1);
            i3 += 255;
        }
        int unsignedByte2 = i3 + parsableByteArray.readUnsignedByte();
        byte[] bArr2 = new byte[unsignedByte];
        int position = parsableByteArray.getPosition();
        System.arraycopy(bArr, position, bArr2, 0, unsignedByte);
        int i4 = position + unsignedByte + unsignedByte2;
        int length = bArr.length - i4;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i4, bArr3, 0, length);
        return bn.r(bArr2, bArr3);
    }
}
