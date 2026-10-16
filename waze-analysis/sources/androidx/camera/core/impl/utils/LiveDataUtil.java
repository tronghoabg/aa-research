package androidx.camera.core.impl.utils;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class LiveDataUtil {
    public static final LiveDataUtil INSTANCE = new LiveDataUtil();

    private LiveDataUtil() {
    }

    public static final <I, O> LiveData<O> map(LiveData<I> liveData, Function<I, O> function) {
        x.f(liveData, "source");
        x.f(function, "mapFunction");
        MappingRedirectableLiveData mappingRedirectableLiveData = new MappingRedirectableLiveData(function.apply(liveData.getValue()), function);
        mappingRedirectableLiveData.redirectTo(liveData);
        return mappingRedirectableLiveData;
    }
}
