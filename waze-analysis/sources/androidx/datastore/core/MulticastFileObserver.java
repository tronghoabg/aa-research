package androidx.datastore.core;

import android.os.FileObserver;
import androidx.datastore.core.MulticastFileObserver;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.ax;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MulticastFileObserver extends FileObserver {
    public static final Companion Companion = new Companion(null);
    private static final Object LOCK = new Object();
    private static final Map<String, MulticastFileObserver> fileObservers = new LinkedHashMap();
    private final CopyOnWriteArrayList<l<String, ab>> delegates;
    private final String path;

    private MulticastFileObserver(String str) {
        super(str, 128);
        this.path = str;
        this.delegates = new CopyOnWriteArrayList<>();
    }

    public final String getPath() {
        return this.path;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i2, String str) {
        Iterator<T> it = this.delegates.iterator();
        while (it.hasNext()) {
            ((l) it.next()).invoke(str);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getFileObservers$datastore_core$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ax observe(File file, final l<? super String, ab> lVar) {
            final String path = file.getCanonicalFile().getPath();
            synchronized (MulticastFileObserver.LOCK) {
                Map<String, MulticastFileObserver> fileObservers$datastore_core = MulticastFileObserver.Companion.getFileObservers$datastore_core();
                MulticastFileObserver multicastFileObserver = fileObservers$datastore_core.get(path);
                if (multicastFileObserver == null) {
                    x.c(path);
                    multicastFileObserver = new MulticastFileObserver(path, null);
                    fileObservers$datastore_core.put(path, multicastFileObserver);
                }
                MulticastFileObserver multicastFileObserver2 = multicastFileObserver;
                multicastFileObserver2.delegates.add(lVar);
                if (multicastFileObserver2.delegates.size() == 1) {
                    multicastFileObserver2.startWatching();
                }
            }
            return new ax() { // from class: androidx.datastore.core.MulticastFileObserver$Companion$$ExternalSyntheticLambda0
                @Override // kotlinx.coroutines.ax
                public final void dispose() {
                    MulticastFileObserver.Companion.observe$lambda$1(path, lVar);
                }
            };
        }

        static final void observe$lambda$1(String str, l lVar) {
            synchronized (MulticastFileObserver.LOCK) {
                MulticastFileObserver multicastFileObserver = MulticastFileObserver.Companion.getFileObservers$datastore_core().get(str);
                if (multicastFileObserver != null) {
                    multicastFileObserver.delegates.remove(lVar);
                    if (multicastFileObserver.delegates.isEmpty()) {
                        MulticastFileObserver.Companion.getFileObservers$datastore_core().remove(str);
                        multicastFileObserver.stopWatching();
                    }
                }
            }
        }

        public final Map<String, MulticastFileObserver> getFileObservers$datastore_core() {
            return MulticastFileObserver.fileObservers;
        }

        public final void removeAllObservers$datastore_core() {
            synchronized (MulticastFileObserver.LOCK) {
                Iterator<T> it = MulticastFileObserver.Companion.getFileObservers$datastore_core().values().iterator();
                while (it.hasNext()) {
                    ((MulticastFileObserver) it.next()).stopWatching();
                }
                MulticastFileObserver.Companion.getFileObservers$datastore_core().clear();
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final k<ab> observe(File file) {
            x.f(file, "file");
            return ai.p(new MulticastFileObserver$Companion$observe$1(file, null));
        }
    }

    public /* synthetic */ MulticastFileObserver(String str, o oVar) {
        this(str);
    }
}
