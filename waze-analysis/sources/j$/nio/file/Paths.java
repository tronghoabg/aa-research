package j$.nio.file;

import j$.nio.file.spi.FileSystemProvider;
import java.net.URI;
import java.nio.file.FileSystemNotFoundException;
import java.security.AccessController;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class Paths {
    public static Path get(URI uri) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            j$.time.f.b("Missing scheme");
            return null;
        }
        if (scheme.equalsIgnoreCase("file")) {
            return k.f49755a.v().getPath(uri);
        }
        if (FileSystemProvider.f49772b == null) {
            FileSystemProvider fileSystemProviderV = k.f49755a.v();
            synchronized (FileSystemProvider.f49771a) {
                try {
                    if (FileSystemProvider.f49772b == null) {
                        if (FileSystemProvider.f49773c) {
                            throw new Error("Circular loading of installed providers detected");
                        }
                        FileSystemProvider.f49773c = true;
                        List list = (List) AccessController.doPrivileged(new j(1));
                        list.add(0, fileSystemProviderV);
                        FileSystemProvider.f49772b = Collections.unmodifiableList(list);
                    }
                } finally {
                }
            }
        }
        for (FileSystemProvider fileSystemProvider : FileSystemProvider.f49772b) {
            if (fileSystemProvider.getScheme().equalsIgnoreCase(scheme)) {
                return fileSystemProvider.getPath(uri);
            }
        }
        throw new FileSystemNotFoundException(j$.desugar.sun.nio.fs.h.a("Provider \"", scheme, "\" not installed"));
    }

    public static Path get(String str, String... strArr) {
        return k.f49755a.g(str, strArr);
    }
}
