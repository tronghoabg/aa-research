package androidx.media3.extractor.avi;

import androidx.media3.common.util.ParsableByteArray;
import com.google.d.d.bi;
import com.google.d.d.bn;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ListChunk implements AviChunk {
    public final bn<AviChunk> children;
    private final int type;

    private ListChunk(int i2, bn<AviChunk> bnVar) {
        this.type = i2;
        this.children = bnVar;
    }

    private static AviChunk createBox(int i2, int i3, ParsableByteArray parsableByteArray) {
        switch (i2) {
            case AviExtractor.FOURCC_strf /* 1718776947 */:
                return StreamFormatChunk.parseFrom(i3, parsableByteArray);
            case AviExtractor.FOURCC_avih /* 1751742049 */:
                return AviMainHeaderChunk.parseFrom(parsableByteArray);
            case AviExtractor.FOURCC_strh /* 1752331379 */:
                return AviStreamHeaderChunk.parseFrom(parsableByteArray);
            case AviExtractor.FOURCC_strn /* 1852994675 */:
                return StreamNameChunk.parseFrom(parsableByteArray);
            default:
                return null;
        }
    }

    public static ListChunk parseFrom(int i2, ParsableByteArray parsableByteArray) {
        bi biVar = new bi();
        int iLimit = parsableByteArray.limit();
        int trackType = -2;
        while (parsableByteArray.bytesLeft() > 8) {
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int position = parsableByteArray.getPosition() + parsableByteArray.readLittleEndianInt();
            parsableByteArray.setLimit(position);
            AviChunk from = littleEndianInt == 1414744396 ? parseFrom(parsableByteArray.readLittleEndianInt(), parsableByteArray) : createBox(littleEndianInt, trackType, parsableByteArray);
            if (from != null) {
                if (from.getType() == 1752331379) {
                    trackType = ((AviStreamHeaderChunk) from).getTrackType();
                }
                biVar.g(from);
            }
            parsableByteArray.setPosition(position);
            parsableByteArray.setLimit(iLimit);
        }
        return new ListChunk(i2, biVar.f());
    }

    public <T extends AviChunk> T getChild(Class<T> cls) {
        bn<AviChunk> bnVar = this.children;
        int size = bnVar.size();
        int i2 = 0;
        while (i2 < size) {
            T t = (T) bnVar.get(i2);
            i2++;
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return this.type;
    }
}
