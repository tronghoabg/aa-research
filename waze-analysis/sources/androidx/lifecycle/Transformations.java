package androidx.lifecycle;

import androidx.arch.core.util.Function;
import androidx.lifecycle.Transformations;
import h.ab;
import h.g.a.l;
import h.g.b.am;
import h.g.b.aq;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Transformations {

    /* compiled from: WazeSource */
    /* renamed from: androidx.lifecycle.Transformations$switchMap$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass2 implements Observer {
        final /* synthetic */ MediatorLiveData $result;
        final /* synthetic */ Function $switchMapFunction;
        private LiveData liveData;

        AnonymousClass2(Function function, MediatorLiveData mediatorLiveData) {
            this.$switchMapFunction = function;
            this.$result = mediatorLiveData;
        }

        static final ab onChanged$lambda$0(MediatorLiveData mediatorLiveData, Object obj) {
            mediatorLiveData.setValue(obj);
            return ab.f48028a;
        }

        public final LiveData getLiveData() {
            return this.liveData;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            LiveData liveData = (LiveData) this.$switchMapFunction.apply(obj);
            LiveData liveData2 = this.liveData;
            if (liveData2 == liveData) {
                return;
            }
            if (liveData2 != null) {
                this.$result.removeSource(liveData2);
            }
            this.liveData = liveData;
            if (liveData != null) {
                final MediatorLiveData mediatorLiveData = this.$result;
                mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new l() { // from class: androidx.lifecycle.Transformations$switchMap$2$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return Transformations.AnonymousClass2.onChanged$lambda$0(mediatorLiveData, obj2);
                    }
                }));
            }
        }

        public final void setLiveData(LiveData liveData) {
            this.liveData = liveData;
        }
    }

    public static final <X> LiveData<X> distinctUntilChanged(LiveData<X> liveData) {
        final MediatorLiveData mediatorLiveData;
        x.f(liveData, "<this>");
        final am amVar = new am();
        amVar.f48101a = true;
        if (liveData.isInitialized()) {
            amVar.f48101a = false;
            mediatorLiveData = new MediatorLiveData(liveData.getValue());
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new l() { // from class: androidx.lifecycle.Transformations$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Transformations.distinctUntilChanged$lambda$0(mediatorLiveData, amVar, obj);
            }
        }));
        return mediatorLiveData;
    }

    static final ab distinctUntilChanged$lambda$0(MediatorLiveData mediatorLiveData, am amVar, Object obj) {
        T value = mediatorLiveData.getValue();
        if (amVar.f48101a || ((value == 0 && obj != null) || (value != 0 && !x.n(value, obj)))) {
            amVar.f48101a = false;
            mediatorLiveData.setValue(obj);
        }
        return ab.f48028a;
    }

    public static final <X, Y> LiveData<Y> map(LiveData<X> liveData, final l<X, Y> lVar) {
        x.f(liveData, "<this>");
        x.f(lVar, "transform");
        final MediatorLiveData mediatorLiveData = liveData.isInitialized() ? new MediatorLiveData(lVar.invoke(liveData.getValue())) : new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new l() { // from class: androidx.lifecycle.Transformations$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Transformations.map$lambda$0(mediatorLiveData, lVar, obj);
            }
        }));
        return mediatorLiveData;
    }

    static final ab map$lambda$0(MediatorLiveData mediatorLiveData, l lVar, Object obj) {
        mediatorLiveData.setValue(lVar.invoke(obj));
        return ab.f48028a;
    }

    static final ab map$lambda$1(MediatorLiveData mediatorLiveData, Function function, Object obj) {
        mediatorLiveData.setValue(function.apply(obj));
        return ab.f48028a;
    }

    public static final <X, Y> LiveData<Y> switchMap(LiveData<X> liveData, final l<X, LiveData<Y>> lVar) {
        LiveData<Y> liveDataInvoke;
        x.f(liveData, "<this>");
        x.f(lVar, "transform");
        final aq aqVar = new aq();
        final MediatorLiveData mediatorLiveData = (liveData.isInitialized() && (liveDataInvoke = lVar.invoke(liveData.getValue())) != null && liveDataInvoke.isInitialized()) ? new MediatorLiveData(liveDataInvoke.getValue()) : new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new l() { // from class: androidx.lifecycle.Transformations$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Transformations.switchMap$lambda$0(lVar, aqVar, mediatorLiveData, obj);
            }
        }));
        return mediatorLiveData;
    }

    static final ab switchMap$lambda$0(l lVar, aq aqVar, final MediatorLiveData mediatorLiveData, Object obj) {
        LiveData liveData = (LiveData) lVar.invoke(obj);
        Object obj2 = aqVar.f48105a;
        if (obj2 != liveData) {
            if (obj2 != null) {
                mediatorLiveData.removeSource((LiveData) obj2);
            }
            aqVar.f48105a = liveData;
            Object obj3 = aqVar.f48105a;
            if (obj3 != null) {
                mediatorLiveData.addSource((LiveData) obj3, new Transformations$sam$androidx_lifecycle_Observer$0(new l() { // from class: androidx.lifecycle.Transformations$$ExternalSyntheticLambda2
                    @Override // h.g.a.l
                    public final Object invoke(Object obj4) {
                        return Transformations.switchMap$lambda$0$0(mediatorLiveData, obj4);
                    }
                }));
            }
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab switchMap$lambda$0$0(MediatorLiveData mediatorLiveData, Object obj) {
        mediatorLiveData.setValue(obj);
        return ab.f48028a;
    }

    public static final /* synthetic */ LiveData map(LiveData liveData, final Function function) {
        x.f(liveData, "<this>");
        x.f(function, "mapFunction");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new l() { // from class: androidx.lifecycle.Transformations$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Transformations.map$lambda$1(mediatorLiveData, function, obj);
            }
        }));
        return mediatorLiveData;
    }

    public static final /* synthetic */ LiveData switchMap(LiveData liveData, Function function) {
        x.f(liveData, "<this>");
        x.f(function, "switchMapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new AnonymousClass2(function, mediatorLiveData));
        return mediatorLiveData;
    }
}
