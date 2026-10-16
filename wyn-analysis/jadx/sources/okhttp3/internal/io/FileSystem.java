package okhttp3.internal.io;

import cg.AbstractC1613b;
import cg.C1614c;
import cg.C1615d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/io/FileSystem;", "", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FileSystem {

    /* renamed from: a, reason: collision with root package name */
    public static final FileSystem f42855a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/io/FileSystem$Companion;", "", "()V", "SYSTEM", "Lokhttp3/internal/io/FileSystem;", "SystemFileSystem", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f42856a = 0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/io/FileSystem$Companion$SystemFileSystem;", "Lokhttp3/internal/io/FileSystem;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            public final C1614c appendingSink(File file) {
                AbstractC3340k.e(file, "file");
                try {
                    return AbstractC1613b.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return AbstractC1613b.a(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public final void delete(File file) throws IOException {
                AbstractC3340k.e(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException(AbstractC3340k.k(file, "failed to delete "));
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public final void deleteContents(File directory) throws IOException {
                AbstractC3340k.e(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException(AbstractC3340k.k(directory, "not a readable directory: "));
                }
                int length = fileArrListFiles.length;
                int i5 = 0;
                while (i5 < length) {
                    File file = fileArrListFiles[i5];
                    i5++;
                    if (file.isDirectory()) {
                        deleteContents(file);
                    }
                    if (!file.delete()) {
                        throw new IOException(AbstractC3340k.k(file, "failed to delete "));
                    }
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public final boolean exists(File file) {
                AbstractC3340k.e(file, "file");
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public final void rename(File from, File to) throws IOException {
                AbstractC3340k.e(from, "from");
                AbstractC3340k.e(to, "to");
                delete(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // okhttp3.internal.io.FileSystem
            public final C1614c sink(File file) {
                AbstractC3340k.e(file, "file");
                try {
                    return AbstractC1613b.k(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return AbstractC1613b.k(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public final long size(File file) {
                AbstractC3340k.e(file, "file");
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            public final C1615d source(File file) {
                AbstractC3340k.e(file, "file");
                return AbstractC1613b.l(file);
            }

            public final String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }

    static {
        int i5 = Companion.f42856a;
        f42855a = new Companion.SystemFileSystem();
    }

    C1614c appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    C1614c sink(File file);

    long size(File file);

    C1615d source(File file);
}
