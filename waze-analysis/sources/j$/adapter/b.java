package j$.adapter;

import android.os.StrictMode;
import j$.desugar.sun.nio.fs.d;
import j$.nio.file.spi.FileSystemProvider;
import java.net.URI;
import java.nio.file.FileSystems;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final FileSystemProvider f49639a;

    static {
        FileSystemProvider aVar;
        if (a.f49637b) {
            java.nio.file.spi.FileSystemProvider fileSystemProviderProvider = FileSystems.getDefault().provider();
            int i2 = j$.nio.file.spi.a.f49775f;
            aVar = fileSystemProviderProvider == null ? null : fileSystemProviderProvider instanceof j$.nio.file.spi.b ? ((j$.nio.file.spi.b) fileSystemProviderProvider).f49778a : new j$.nio.file.spi.a(fileSystemProviderProvider);
        } else {
            if (a.f49638c) {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitDiskReads().build());
            }
            aVar = d.f49657a;
        }
        f49639a = aVar;
        aVar.j(URI.create("file:///"));
    }
}
