package j$.adapter;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final j$.nio.file.spi.c a;

    static {
        j$.nio.file.spi.c aVar;
        if (j$.adapter.a.b) {
            java.nio.file.spi.FileSystemProvider fileSystemProviderProvider = java.nio.file.FileSystems.getDefault().provider();
            int i = j$.nio.file.spi.a.c;
            if (fileSystemProviderProvider == null) {
                aVar = null;
            } else {
                aVar = fileSystemProviderProvider instanceof j$.nio.file.spi.b ? ((j$.nio.file.spi.b) fileSystemProviderProvider).a : new j$.nio.file.spi.a(fileSystemProviderProvider);
            }
        } else {
            if (j$.adapter.a.c) {
                android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(android.os.StrictMode.getThreadPolicy()).permitDiskReads().build());
            }
            aVar = j$.desugar.sun.nio.fs.d.a;
        }
        a = aVar;
        aVar.j(java.net.URI.create("file:///"));
    }
}
