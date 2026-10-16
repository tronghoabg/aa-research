package j$.nio.channels;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public class DesugarChannels {
    public static java.nio.channels.FileChannel convertMaybeLegacyFileChannelFromLibrary(java.nio.channels.FileChannel fileChannel) {
        if (fileChannel == null) {
            return null;
        }
        if (j$.adapter.a.a) {
            return fileChannel;
        }
        if (!(fileChannel instanceof j$.desugar.sun.nio.fs.e)) {
            return new j$.desugar.sun.nio.fs.e(fileChannel, false, false, null);
        }
        int i = j$.desugar.sun.nio.fs.e.e;
        return (j$.desugar.sun.nio.fs.e) fileChannel;
    }
}
