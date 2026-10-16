package androidx.media3.extractor;

import androidx.media3.common.util.Util;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Av1Config {
    private static final String TAG = "Av1Config";
    public final int bitdepth;
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;

    private Av1Config(int i2, String str, int i3, int i4, int i5) {
        this.bitdepth = i2;
        this.codecs = str;
        this.colorSpace = i3;
        this.colorRange = i4;
        this.colorTransfer = i5;
    }

    private static String buildCodecString(int i2, int i3, boolean z, int i4) {
        String invariant = Util.formatInvariant("%02d", Integer.valueOf(i3));
        String invariant2 = Util.formatInvariant("%02d", Integer.valueOf(i4));
        StringBuilder sb = new StringBuilder("av01.");
        sb.append(i2);
        sb.append(".");
        sb.append(invariant);
        sb.append(true != z ? "M" : "H");
        sb.append(".");
        sb.append(invariant2);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0160 A[Catch: RuntimeException -> 0x019c, TryCatch #0 {RuntimeException -> 0x019c, blocks: (B:3:0x0004, B:6:0x0018, B:8:0x0029, B:14:0x004e, B:16:0x005d, B:18:0x0063, B:20:0x006d, B:22:0x0082, B:24:0x0088, B:26:0x0093, B:28:0x009c, B:30:0x00a4, B:32:0x00af, B:34:0x00bc, B:36:0x00c7, B:38:0x00cd, B:40:0x00d8, B:42:0x00de, B:44:0x00e9, B:46:0x00f1, B:48:0x00fa, B:49:0x00fd, B:50:0x0100, B:52:0x0116, B:53:0x0119, B:55:0x0123, B:56:0x0126, B:61:0x0133, B:63:0x0139, B:65:0x013e, B:66:0x0141, B:69:0x014c, B:72:0x0153, B:75:0x015a, B:77:0x0160, B:79:0x0166, B:89:0x0185, B:93:0x0190, B:88:0x0181, B:59:0x012d), top: B:98:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0166 A[Catch: RuntimeException -> 0x019c, TryCatch #0 {RuntimeException -> 0x019c, blocks: (B:3:0x0004, B:6:0x0018, B:8:0x0029, B:14:0x004e, B:16:0x005d, B:18:0x0063, B:20:0x006d, B:22:0x0082, B:24:0x0088, B:26:0x0093, B:28:0x009c, B:30:0x00a4, B:32:0x00af, B:34:0x00bc, B:36:0x00c7, B:38:0x00cd, B:40:0x00d8, B:42:0x00de, B:44:0x00e9, B:46:0x00f1, B:48:0x00fa, B:49:0x00fd, B:50:0x0100, B:52:0x0116, B:53:0x0119, B:55:0x0123, B:56:0x0126, B:61:0x0133, B:63:0x0139, B:65:0x013e, B:66:0x0141, B:69:0x014c, B:72:0x0153, B:75:0x015a, B:77:0x0160, B:79:0x0166, B:89:0x0185, B:93:0x0190, B:88:0x0181, B:59:0x012d), top: B:98:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.extractor.Av1Config parse(byte[] r20) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.Av1Config.parse(byte[]):androidx.media3.extractor.Av1Config");
    }

    private Av1Config(int i2, String str) {
        this(i2, str, -1, -1, -1);
    }
}
