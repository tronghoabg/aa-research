package androidx.room;

import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import h.c.e;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class RoomLambdaTrackingLiveData<T> extends RoomTrackingLiveData<T> {
    private final l<SQLiteConnection, T> lambdaFunction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomLambdaTrackingLiveData(RoomDatabase roomDatabase, InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z, String[] strArr, l<? super SQLiteConnection, ? extends T> lVar) {
        super(roomDatabase, invalidationLiveDataContainer, z, strArr, null);
        x.f(roomDatabase, "database");
        x.f(invalidationLiveDataContainer, TtmlNode.RUBY_CONTAINER);
        x.f(strArr, "tableNames");
        x.f(lVar, "lambdaFunction");
        this.lambdaFunction = lVar;
    }

    @Override // androidx.room.RoomTrackingLiveData
    public Object compute(e<? super T> eVar) {
        return DBUtil.performSuspending(getDatabase(), true, getInTransaction(), this.lambdaFunction, eVar);
    }
}
