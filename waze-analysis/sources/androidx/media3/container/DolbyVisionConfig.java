package androidx.media3.container;

import androidx.media3.common.util.ParsableByteArray;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DolbyVisionConfig {
    public final String codecs;
    public final int level;
    public final int profile;

    private DolbyVisionConfig(int i2, int i3, String str) {
        this.profile = i2;
        this.level = i3;
        this.codecs = str;
    }

    public static DolbyVisionConfig parse(ParsableByteArray parsableByteArray) {
        String str;
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = unsignedByte >> 1;
        int i3 = unsignedByte & 1;
        int unsignedByte2 = parsableByteArray.readUnsignedByte() >> 3;
        if (i2 == 4 || i2 == 5 || i2 == 7 || i2 == 8) {
            str = "dvhe";
        } else if (i2 == 9) {
            str = "dvav";
        } else {
            if (i2 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i4 = unsignedByte2 | (i3 << 5);
        StringBuilder sb = new StringBuilder(str);
        sb.append(i2 < 10 ? ".0" : ".");
        sb.append(i2);
        sb.append(i4 >= 10 ? "." : ".0");
        sb.append(i4);
        return new DolbyVisionConfig(i2, i4, sb.toString());
    }
}
