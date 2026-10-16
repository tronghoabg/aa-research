package androidx.room;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.c.e;
import h.g.b.x;
import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class RoomCallableTrackingLiveData<T> extends RoomTrackingLiveData<T> {
    private final Callable<T> callableFunction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomCallableTrackingLiveData(RoomDatabase roomDatabase, InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z, String[] strArr, Callable<T> callable) {
        super(roomDatabase, invalidationLiveDataContainer, z, strArr, null);
        x.f(roomDatabase, "database");
        x.f(invalidationLiveDataContainer, TtmlNode.RUBY_CONTAINER);
        x.f(strArr, "tableNames");
        x.f(callable, "callableFunction");
        this.callableFunction = callable;
    }

    @Override // androidx.room.RoomTrackingLiveData
    public Object compute(e<? super T> eVar) {
        return this.callableFunction.call();
    }
}
