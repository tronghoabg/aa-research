package androidx.datastore.core;

import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FileStorage<T> implements Storage<T> {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Object activeFilesLock = new Object();
    private final l<File, InterProcessCoordinator> coordinatorProducer;
    private final a<File> produceFile;
    private final Serializer<T> serializer;

    /* JADX WARN: Multi-variable type inference failed */
    public FileStorage(Serializer<T> serializer, l<? super File, ? extends InterProcessCoordinator> lVar, a<? extends File> aVar) {
        x.f(serializer, "serializer");
        x.f(lVar, "coordinatorProducer");
        x.f(aVar, "produceFile");
        this.serializer = serializer;
        this.coordinatorProducer = lVar;
        this.produceFile = aVar;
    }

    static final InterProcessCoordinator _init_$lambda$0(File file) {
        x.f(file, "it");
        return InterProcessCoordinator_jvmKt.createSingleProcessCoordinator(file);
    }

    static final ab createConnection$lambda$1(File file) {
        synchronized (activeFilesLock) {
            activeFiles.remove(file.getAbsolutePath());
        }
        return ab.f48028a;
    }

    @Override // androidx.datastore.core.Storage
    public StorageConnection<T> createConnection() throws IOException {
        final File canonicalFile = this.produceFile.invoke().getCanonicalFile();
        synchronized (activeFilesLock) {
            String absolutePath = canonicalFile.getAbsolutePath();
            Set<String> set = activeFiles;
            if (set.contains(absolutePath)) {
                throw new IllegalStateException("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).");
            }
            if (absolutePath == null) {
                x.g();
            }
            set.add(absolutePath);
        }
        if (canonicalFile == null) {
            x.g();
        }
        return new FileStorageConnection(canonicalFile, this.serializer, this.coordinatorProducer.invoke(canonicalFile), new a() { // from class: androidx.datastore.core.FileStorage$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return FileStorage.createConnection$lambda$1(canonicalFile);
            }
        });
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Set<String> getActiveFiles$datastore_core() {
            return FileStorage.activeFiles;
        }

        public final Object getActiveFilesLock$datastore_core() {
            return FileStorage.activeFilesLock;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ FileStorage(Serializer serializer, l lVar, a aVar, int i2, o oVar) {
        this(serializer, (i2 & 2) != 0 ? new l() { // from class: androidx.datastore.core.FileStorage$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FileStorage._init_$lambda$0((File) obj);
            }
        } : lVar, aVar);
    }
}
