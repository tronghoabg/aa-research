package androidx.datastore.core;

import h.g.b.x;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DataStoreInMemoryCache<T> {
    private final bn<State<T>> cachedValue;

    public DataStoreInMemoryCache() {
        UnInitialized unInitialized = UnInitialized.INSTANCE;
        x.d(unInitialized, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.cachedValue = ck.b(unInitialized);
    }

    public final State<T> getCurrentState() {
        return (State) this.cachedValue.d();
    }

    public final k<State<T>> getFlow() {
        return this.cachedValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.datastore.core.State<T> tryUpdate(androidx.datastore.core.State<T> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            h.g.b.x.f(r6, r0)
        L5:
            kotlinx.coroutines.b.bn<androidx.datastore.core.State<T>> r0 = r5.cachedValue
            java.lang.Object r1 = r0.d()
            r2 = r1
            androidx.datastore.core.State r2 = (androidx.datastore.core.State) r2
            boolean r3 = r2 instanceof androidx.datastore.core.ReadException
            if (r3 != 0) goto L44
            androidx.datastore.core.UnInitialized r3 = androidx.datastore.core.UnInitialized.INSTANCE
            boolean r3 = h.g.b.x.n(r2, r3)
            if (r3 == 0) goto L1b
            goto L44
        L1b:
            boolean r3 = r2 instanceof androidx.datastore.core.Data
            if (r3 == 0) goto L2d
            int r3 = r6.getVersion()
            r4 = r2
            androidx.datastore.core.Data r4 = (androidx.datastore.core.Data) r4
            int r4 = r4.getVersion()
            if (r3 <= r4) goto L45
            goto L44
        L2d:
            boolean r3 = r2 instanceof androidx.datastore.core.Final
            if (r3 == 0) goto L32
            goto L45
        L32:
            boolean r5 = r2 instanceof androidx.datastore.core.NoValueDataState
            if (r5 == 0) goto L3e
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r5.<init>(r6)
            throw r5
        L3e:
            h.i r5 = new h.i
            r5.<init>()
            throw r5
        L44:
            r2 = r6
        L45:
            boolean r0 = r0.f(r1, r2)
            if (r0 == 0) goto L5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreInMemoryCache.tryUpdate(androidx.datastore.core.State):androidx.datastore.core.State");
    }

    private static /* synthetic */ void getCachedValue$annotations() {
    }
}
