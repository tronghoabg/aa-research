package androidx.camera.core.impl.utils;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class MappingRedirectableLiveData<I, O> extends MediatorLiveData<O> {
    private final O initialValue;
    private LiveData<I> liveDataSource;
    private final Function<I, O> mapFunction;

    public MappingRedirectableLiveData(O o, Function<I, O> function) {
        x.f(function, "mapFunction");
        this.initialValue = o;
        this.mapFunction = function;
    }

    static final void redirectTo$lambda$0(LiveData liveData, final MappingRedirectableLiveData mappingRedirectableLiveData, LiveData liveData2) {
        if (liveData != null) {
            super.removeSource(liveData);
        }
        final l lVar = new l() { // from class: androidx.camera.core.impl.utils.MappingRedirectableLiveData$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return MappingRedirectableLiveData.redirectTo$lambda$0$0(this.f$0, obj);
            }
        };
        super.addSource(liveData2, new Observer() { // from class: androidx.camera.core.impl.utils.MappingRedirectableLiveData$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                lVar.invoke(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab redirectTo$lambda$0$0(MappingRedirectableLiveData mappingRedirectableLiveData, Object obj) {
        mappingRedirectableLiveData.setValue(mappingRedirectableLiveData.mapFunction.apply(obj));
        return ab.f48028a;
    }

    @Override // androidx.lifecycle.MediatorLiveData
    public <S> void addSource(LiveData<S> liveData, Observer<? super S> observer) {
        x.f(liveData, "source");
        x.f(observer, "onChanged");
        throw new UnsupportedOperationException();
    }

    @Override // androidx.lifecycle.LiveData
    public O getValue() {
        LiveData<I> liveData = this.liveDataSource;
        return liveData == null ? this.initialValue : this.mapFunction.apply(liveData.getValue());
    }

    public final void redirectTo(final LiveData<I> liveData) {
        x.f(liveData, "liveDataSource");
        final LiveData<I> liveData2 = this.liveDataSource;
        this.liveDataSource = liveData;
        Threads.runOnMain(new Runnable() { // from class: androidx.camera.core.impl.utils.MappingRedirectableLiveData$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                MappingRedirectableLiveData.redirectTo$lambda$0(liveData2, this, liveData);
            }
        });
    }
}
