package androidx.datastore.core;

import androidx.datastore.core.handlers.ReThrowCorruptionHandler;
import androidx.tracing.Tracer;
import h.a.i;
import h.c.e;
import h.c.j;
import h.g.a.p;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface DataStore<T> {

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class Builder<T> {
        private final j context;
        private CorruptionHandler<T> corruptionHandler;
        private List<? extends DataMigration<T>> migrations;
        private final Storage<T> storage;
        private Tracer tracer;

        public Builder(Storage<T> storage, j jVar) {
            x.f(storage, "storage");
            x.f(jVar, "context");
            this.storage = storage;
            this.context = jVar;
            this.corruptionHandler = new ReThrowCorruptionHandler();
            this.migrations = i.h();
        }

        public final Builder<T> addMigrations(List<? extends DataMigration<T>> list) {
            x.f(list, "migrations");
            this.migrations = i.af(this.migrations, list);
            return this;
        }

        public final DataStore<T> build() {
            CorruptionHandler<T> corruptionHandler = this.corruptionHandler;
            return new DataStoreImpl(this.storage, i.d(DataMigrationInitializer.Companion.getInitializer(this.migrations)), corruptionHandler, this.context, this.tracer);
        }

        public final Builder<T> setCorruptionHandler(CorruptionHandler<T> corruptionHandler) {
            x.f(corruptionHandler, "handler");
            this.corruptionHandler = corruptionHandler;
            return this;
        }

        public final Builder<T> setTracer(Tracer tracer) {
            x.f(tracer, "tracer");
            this.tracer = tracer;
            return this;
        }
    }

    k<T> getData();

    Object updateData(p<? super T, ? super e<? super T>, ? extends Object> pVar, e<? super T> eVar);
}
