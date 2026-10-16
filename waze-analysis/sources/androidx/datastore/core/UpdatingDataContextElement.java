package androidx.datastore.core;

import h.c.h;
import h.c.i;
import h.c.j;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class UpdatingDataContextElement implements h {
    public static final Companion Companion = new Companion(null);
    private static final String NESTED_UPDATE_ERROR_MESSAGE = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";
    private final DataStoreImpl<?> instance;
    private final UpdatingDataContextElement parent;

    public UpdatingDataContextElement(UpdatingDataContextElement updatingDataContextElement, DataStoreImpl<?> dataStoreImpl) {
        x.f(dataStoreImpl, "instance");
        this.parent = updatingDataContextElement;
        this.instance = dataStoreImpl;
    }

    public final void checkNotUpdating(DataStore<?> dataStore) {
        x.f(dataStore, "candidate");
        if (this.instance == dataStore) {
            throw new IllegalStateException(NESTED_UPDATE_ERROR_MESSAGE.toString());
        }
        UpdatingDataContextElement updatingDataContextElement = this.parent;
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(dataStore);
        }
    }

    @Override // h.c.j
    public /* bridge */ <R> R fold(R r, p<? super R, ? super h, ? extends R> pVar) {
        return (R) h.c.a.h.e(this, r, pVar);
    }

    @Override // h.c.h, h.c.j
    public /* bridge */ <E extends h> E get(i<E> iVar) {
        return (E) h.c.a.h.f(this, iVar);
    }

    @Override // h.c.h
    public i<?> getKey() {
        return Companion.Key.INSTANCE;
    }

    @Override // h.c.j
    public /* bridge */ j minusKey(i<?> iVar) {
        return h.c.a.h.g(this, iVar);
    }

    @Override // h.c.j
    public /* bridge */ j plus(j jVar) {
        return h.c.a.h.h(this, jVar);
    }

    /* compiled from: WazeSource */
    public final class Companion {

        /* compiled from: WazeSource */
        public final class Key implements i<UpdatingDataContextElement> {
            public static final Key INSTANCE = new Key();

            private Key() {
            }
        }

        private Companion() {
        }

        public final String getNESTED_UPDATE_ERROR_MESSAGE$datastore_core() {
            return UpdatingDataContextElement.NESTED_UPDATE_ERROR_MESSAGE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
