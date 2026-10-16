package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.NalUnitUtil;
import com.google.d.d.bn;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class VvcConfig {
    public final int bitdepthLuma;
    public final String codecs;
    public final List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;

    private VvcConfig(List<byte[]> list, int i2, String str, int i3) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i2;
        this.codecs = str;
        this.bitdepthLuma = i3;
    }

    public static VvcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        String str;
        int unsignedByte;
        int unsignedByte2;
        int i2;
        int i3;
        int i4;
        try {
            if (parsableByteArray.readInt() != 0) {
                throw ParserException.createForMalformedContainer("Unsupported VVC version", null);
            }
            int unsignedByte3 = parsableByteArray.readUnsignedByte();
            int i5 = unsignedByte3 >> 1;
            int i6 = 1;
            str = "L";
            if ((unsignedByte3 & 1) != 0) {
                parsableByteArray.skipBytes(1);
                int unsignedByte4 = parsableByteArray.readUnsignedByte() >> 4;
                unsignedByte = parsableByteArray.readUnsignedByte() >> 5;
                int unsignedByte5 = parsableByteArray.readUnsignedByte() & 63;
                int unsignedByte6 = parsableByteArray.readUnsignedByte();
                i2 = unsignedByte6 >> 1;
                str = (unsignedByte6 & 1) != 0 ? "H" : "L";
                unsignedByte2 = parsableByteArray.readUnsignedByte();
                parsableByteArray.skipBytes(unsignedByte5);
                int i7 = unsignedByte4 & 7;
                if (i7 > 1) {
                    int unsignedByte7 = parsableByteArray.readUnsignedByte();
                    for (int i8 = 0; i8 < i7 - 1; i8++) {
                        if (((unsignedByte7 >> (7 - i8)) & 1) != 0) {
                            parsableByteArray.skipBytes(1);
                        }
                    }
                }
                parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte() * 4);
                parsableByteArray.skipBytes(6);
            } else {
                unsignedByte = 0;
                unsignedByte2 = 0;
                i2 = 0;
            }
            int unsignedByte8 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i9 = 0;
            int i10 = 0;
            while (true) {
                i3 = 12;
                i4 = 13;
                if (i9 >= unsignedByte8) {
                    break;
                }
                int unsignedByte9 = parsableByteArray.readUnsignedByte() & 31;
                int unsignedShort = (unsignedByte9 == 13 || unsignedByte9 == 12) ? 1 : parsableByteArray.readUnsignedShort();
                for (int i11 = 0; i11 < unsignedShort; i11++) {
                    int unsignedShort2 = parsableByteArray.readUnsignedShort();
                    i10 += unsignedShort2 + 4;
                    parsableByteArray.skipBytes(unsignedShort2);
                }
                i9++;
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i10];
            int i12 = 0;
            int i13 = 0;
            while (i12 < unsignedByte8) {
                int unsignedByte10 = parsableByteArray.readUnsignedByte() & 31;
                int unsignedShort3 = (unsignedByte10 == i4 || unsignedByte10 == i3) ? i6 : parsableByteArray.readUnsignedShort();
                int i14 = i6;
                for (int i15 = 0; i15 < unsignedShort3; i15++) {
                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                    System.arraycopy(NalUnitUtil.NAL_START_CODE, 0, bArr, i13, 4);
                    int i16 = i13 + 4;
                    parsableByteArray.readBytes(bArr, i16, unsignedShort4);
                    i13 = i16 + unsignedShort4;
                }
                i12++;
                i6 = i14;
                i3 = 12;
                i4 = 13;
            }
            int i17 = i6;
            Locale locale = Locale.US;
            Integer numValueOf = Integer.valueOf(i2);
            Integer numValueOf2 = Integer.valueOf(unsignedByte2);
            Object[] objArr = new Object[3];
            objArr[0] = numValueOf;
            objArr[i17] = str;
            objArr[2] = numValueOf2;
            return new VvcConfig(bn.q(bArr), (i5 & 3) + 1, String.format(locale, "vvc1.%d.%s%d", objArr), unsignedByte + 8);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ParserException.createForMalformedContainer("Error parsing VVC configuration", e2);
        }
    }
}
