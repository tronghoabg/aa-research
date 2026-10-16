package androidx.room;

import androidx.lifecycle.LiveData;
import androidx.sqlite.SQLiteConnection;
import h.g.a.l;
import h.g.b.x;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class InvalidationLiveDataContainer {
    private final RoomDatabase database;
    private final Set<LiveData<?>> liveDataSet;

    public InvalidationLiveDataContainer(RoomDatabase roomDatabase) {
        x.f(roomDatabase, "database");
        this.database = roomDatabase;
        Set<LiveData<?>> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        x.e(setNewSetFromMap, "newSetFromMap(...)");
        this.liveDataSet = setNewSetFromMap;
    }

    public final <T> LiveData<T> create(String[] strArr, boolean z, Callable<T> callable) {
        x.f(strArr, "tableNames");
        x.f(callable, "callableFunction");
        return new RoomCallableTrackingLiveData(this.database, this, z, strArr, callable);
    }

    public final Set<LiveData<?>> getLiveDataSet$room_runtime() {
        return this.liveDataSet;
    }

    public final void onActive(LiveData<?> liveData) {
        x.f(liveData, "liveData");
        this.liveDataSet.add(liveData);
    }

    public final void onInactive(LiveData<?> liveData) {
        x.f(liveData, "liveData");
        this.liveDataSet.remove(liveData);
    }

    public final <T> LiveData<T> create(String[] strArr, boolean z, l<? super SQLiteConnection, ? extends T> lVar) {
        x.f(strArr, "tableNames");
        x.f(lVar, "lambdaFunction");
        return new RoomLambdaTrackingLiveData(this.database, this, z, strArr, lVar);
    }
}
