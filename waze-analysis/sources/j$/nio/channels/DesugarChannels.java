package j$.nio.channels;

import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class DesugarChannels {
    public static FileChannel convertMaybeLegacyFileChannelFromLibrary(FileChannel fileChannel) {
        if (fileChannel == null) {
            return null;
        }
        if (j$.adapter.a.f49636a) {
            return fileChannel;
        }
        if (!(fileChannel instanceof j$.desugar.sun.nio.fs.e)) {
            return new j$.desugar.sun.nio.fs.e(fileChannel, false, false, null);
        }
        int i2 = j$.desugar.sun.nio.fs.e.f49658e;
        return (j$.desugar.sun.nio.fs.e) fileChannel;
    }
}
