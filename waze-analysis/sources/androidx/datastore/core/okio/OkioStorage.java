package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.Storage;
import androidx.datastore.core.StorageConnection;
import h.f;
import h.g;
import h.g.a.a;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.LinkedHashSet;
import java.util.Set;
import k.ab;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class OkioStorage<T> implements Storage<T> {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Synchronizer activeFilesLock = new Synchronizer();
    private final f canonicalPath$delegate;
    private final p<ab, k.p, InterProcessCoordinator> coordinatorProducer;
    private final k.p fileSystem;
    private final a<ab> producePath;
    private final OkioSerializer<T> serializer;

    /* JADX WARN: Multi-variable type inference failed */
    public OkioStorage(k.p pVar, OkioSerializer<T> okioSerializer, p<? super ab, ? super k.p, ? extends InterProcessCoordinator> pVar2, a<ab> aVar) {
        x.f(pVar, "fileSystem");
        x.f(okioSerializer, "serializer");
        x.f(pVar2, "coordinatorProducer");
        x.f(aVar, "producePath");
        this.fileSystem = pVar;
        this.serializer = okioSerializer;
        this.coordinatorProducer = pVar2;
        this.producePath = aVar;
        this.canonicalPath$delegate = g.a(new a() { // from class: androidx.datastore.core.okio.OkioStorage$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return OkioStorage.canonicalPath_delegate$lambda$0(this.f$0);
            }
        });
    }

    static final InterProcessCoordinator _init_$lambda$0(ab abVar, k.p pVar) {
        x.f(abVar, "path");
        x.f(pVar, "<unused var>");
        return OkioStorageKt.createSingleProcessCoordinator(abVar);
    }

    static final ab canonicalPath_delegate$lambda$0(OkioStorage okioStorage) {
        ab abVarInvoke = okioStorage.producePath.invoke();
        if (abVarInvoke.m()) {
            return abVarInvoke.h();
        }
        throw new IllegalStateException("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + okioStorage.producePath + ", instead got " + abVarInvoke);
    }

    static final h.ab createConnection$lambda$1(OkioStorage okioStorage) {
        synchronized (activeFilesLock) {
            activeFiles.remove(okioStorage.getCanonicalPath().toString());
        }
        return h.ab.f48028a;
    }

    private final ab getCanonicalPath() {
        return (ab) this.canonicalPath$delegate.getValue();
    }

    @Override // androidx.datastore.core.Storage
    public StorageConnection<T> createConnection() {
        String string = getCanonicalPath().toString();
        synchronized (activeFilesLock) {
            Set<String> set = activeFiles;
            if (set.contains(string)) {
                throw new IllegalStateException("There are multiple DataStores active for the same file: " + string + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).");
            }
            set.add(string);
        }
        return new OkioStorageConnection(this.fileSystem, getCanonicalPath(), this.serializer, this.coordinatorProducer.invoke(getCanonicalPath(), this.fileSystem), new a() { // from class: androidx.datastore.core.okio.OkioStorage$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return OkioStorage.createConnection$lambda$1(this.f$0);
            }
        });
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Set<String> getActiveFiles$datastore_core_okio() {
            return OkioStorage.activeFiles;
        }

        public final Synchronizer getActiveFilesLock() {
            return OkioStorage.activeFilesLock;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ OkioStorage(k.p pVar, OkioSerializer okioSerializer, p pVar2, a aVar, int i2, o oVar) {
        this(pVar, okioSerializer, (i2 & 4) != 0 ? new p() { // from class: androidx.datastore.core.okio.OkioStorage$$ExternalSyntheticLambda1
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return OkioStorage._init_$lambda$0((ab) obj, (k.p) obj2);
            }
        } : pVar2, aVar);
    }
}
