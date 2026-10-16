package androidx.room;

import android.content.Context;
import android.content.Intent;
import androidx.autofill.HintConstants;
import androidx.lifecycle.LiveData;
import androidx.room.coroutines.RunBlockingUninterruptible_androidKt;
import androidx.room.support.AutoCloser;
import androidx.sqlite.SQLiteConnection;
import e.b.c;
import h.a.i;
import h.a.r;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class InvalidationTracker {
    public static final Companion Companion = new Companion(null);
    private AutoCloser autoCloser;
    private final RoomDatabase database;
    private final TriggerBasedInvalidationTracker implementation;
    private final InvalidationLiveDataContainer invalidationLiveDataContainer;
    private MultiInstanceInvalidationClient multiInstanceInvalidationClient;
    private Intent multiInstanceInvalidationIntent;
    private final Map<Observer, ObserverWrapper> observerMap;
    private final ReentrantLock observerMapLock;
    private final a<ab> onRefreshCompleted;
    private final a<ab> onRefreshScheduled;
    private final Map<String, String> shadowTablesMap;
    private final String[] tableNames;
    private final Object trackerLock;
    private final Map<String, Set<String>> viewTables;

    /* compiled from: WazeSource */
    final class MultiInstanceClientInitState {
        private final Context context;
        private final String name;
        private final Intent serviceIntent;

        public MultiInstanceClientInitState(Context context, String str, Intent intent) {
            x.f(context, "context");
            x.f(str, HintConstants.AUTOFILL_HINT_NAME);
            x.f(intent, "serviceIntent");
            this.context = context;
            this.name = str;
            this.serviceIntent = intent;
        }

        public static /* synthetic */ MultiInstanceClientInitState copy$default(MultiInstanceClientInitState multiInstanceClientInitState, Context context, String str, Intent intent, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                context = multiInstanceClientInitState.context;
            }
            if ((i2 & 2) != 0) {
                str = multiInstanceClientInitState.name;
            }
            if ((i2 & 4) != 0) {
                intent = multiInstanceClientInitState.serviceIntent;
            }
            return multiInstanceClientInitState.copy(context, str, intent);
        }

        public final Context component1() {
            return this.context;
        }

        public final String component2() {
            return this.name;
        }

        public final Intent component3() {
            return this.serviceIntent;
        }

        public final MultiInstanceClientInitState copy(Context context, String str, Intent intent) {
            x.f(context, "context");
            x.f(str, HintConstants.AUTOFILL_HINT_NAME);
            x.f(intent, "serviceIntent");
            return new MultiInstanceClientInitState(context, str, intent);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiInstanceClientInitState)) {
                return false;
            }
            MultiInstanceClientInitState multiInstanceClientInitState = (MultiInstanceClientInitState) obj;
            return x.n(this.context, multiInstanceClientInitState.context) && x.n(this.name, multiInstanceClientInitState.name) && x.n(this.serviceIntent, multiInstanceClientInitState.serviceIntent);
        }

        public final Context getContext() {
            return this.context;
        }

        public final String getName() {
            return this.name;
        }

        public final Intent getServiceIntent() {
            return this.serviceIntent;
        }

        public int hashCode() {
            return (((this.context.hashCode() * 31) + this.name.hashCode()) * 31) + this.serviceIntent.hashCode();
        }

        public String toString() {
            return "MultiInstanceClientInitState(context=" + this.context + ", name=" + this.name + ", serviceIntent=" + this.serviceIntent + ')';
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.InvalidationTracker$addObserver$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return InvalidationTracker.this.new AnonymousClass1(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (InvalidationTracker.this.implementation.syncTriggers$room_runtime(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.InvalidationTracker$refreshVersionsSync$1, reason: invalid class name and case insensitive filesystem */
    final class C04471 extends g implements p<af, e<? super ab>, Object> {
        int label;

        C04471(e<? super C04471> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return InvalidationTracker.this.new C04471(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C04471) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                InvalidationTracker invalidationTracker = InvalidationTracker.this;
                this.label = 1;
                if (invalidationTracker.implementation.refreshInvalidation$room_runtime(new String[0], invalidationTracker.onRefreshScheduled, invalidationTracker.onRefreshCompleted, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.InvalidationTracker$removeObserver$1, reason: invalid class name and case insensitive filesystem */
    final class C04481 extends g implements p<af, e<? super ab>, Object> {
        int label;

        C04481(e<? super C04481> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return InvalidationTracker.this.new C04481(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C04481) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (InvalidationTracker.this.implementation.syncTriggers$room_runtime(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    public InvalidationTracker(RoomDatabase roomDatabase, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        x.f(roomDatabase, "database");
        x.f(map, "shadowTablesMap");
        x.f(map2, "viewTables");
        x.f(strArr, "tableNames");
        this.database = roomDatabase;
        this.shadowTablesMap = map;
        this.viewTables = map2;
        this.tableNames = strArr;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = new TriggerBasedInvalidationTracker(roomDatabase, map, map2, strArr, roomDatabase.getUseTempTrackingTable$room_runtime(), new InvalidationTracker$implementation$1(this));
        this.implementation = triggerBasedInvalidationTracker;
        this.observerMap = new LinkedHashMap();
        this.observerMapLock = new ReentrantLock();
        this.onRefreshScheduled = new a() { // from class: androidx.room.InvalidationTracker$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return InvalidationTracker.onRefreshScheduled$lambda$0(this.f$0);
            }
        };
        this.onRefreshCompleted = new a() { // from class: androidx.room.InvalidationTracker$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return InvalidationTracker.onRefreshCompleted$lambda$1(this.f$0);
            }
        };
        this.invalidationLiveDataContainer = new InvalidationLiveDataContainer(roomDatabase);
        this.trackerLock = new Object();
        triggerBasedInvalidationTracker.setOnAllowRefresh$room_runtime(new a() { // from class: androidx.room.InvalidationTracker$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(InvalidationTracker._init_$lambda$2(this.f$0));
            }
        });
    }

    static final boolean _init_$lambda$2(InvalidationTracker invalidationTracker) {
        return !invalidationTracker.database.inCompatibilityMode() || invalidationTracker.database.isOpenInternal$room_runtime();
    }

    private final boolean addObserverOnly(Observer observer) {
        k<String[], int[]> kVarValidateTableNames$room_runtime = this.implementation.validateTableNames$room_runtime(observer.getTables$room_runtime());
        String[] strArr = (String[]) kVarValidateTableNames$room_runtime.a();
        int[] iArr = (int[]) kVarValidateTableNames$room_runtime.b();
        ObserverWrapper observerWrapper = new ObserverWrapper(observer, iArr, strArr);
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            boolean zContainsKey = this.observerMap.containsKey(observer);
            Map<Observer, ObserverWrapper> map = this.observerMap;
            return (zContainsKey ? (ObserverWrapper) r.h(map, observer) : map.put(observer, observerWrapper)) == null && this.implementation.onObserverAdded$room_runtime(iArr);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static /* synthetic */ kotlinx.coroutines.b.k createFlow$default(InvalidationTracker invalidationTracker, String[] strArr, boolean z, int i2, Object obj) {
        if (obj == null) {
            return invalidationTracker.createFlow(strArr, z | (!((i2 & 2) == 0)));
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFlow");
    }

    private final List<Observer> getAllObservers() {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            return i.ao(this.observerMap.keySet());
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyInvalidatedObservers(Set<Integer> set) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List listAo = i.ao(this.observerMap.values());
            reentrantLock.unlock();
            Iterator it = listAo.iterator();
            while (it.hasNext()) {
                ((ObserverWrapper) it.next()).notifyByTableIds$room_runtime(set);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAutoCloseCallback() {
        synchronized (this.trackerLock) {
            MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
            if (multiInstanceInvalidationClient != null) {
                List<Observer> allObservers = getAllObservers();
                ArrayList arrayList = new ArrayList();
                for (Object obj : allObservers) {
                    if (!((Observer) obj).isRemote$room_runtime()) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    multiInstanceInvalidationClient.stop();
                }
            }
            this.implementation.resetSync$room_runtime();
        }
    }

    static final ab onRefreshCompleted$lambda$1(InvalidationTracker invalidationTracker) {
        AutoCloser autoCloser = invalidationTracker.autoCloser;
        if (autoCloser != null) {
            autoCloser.decrementCountAndScheduleClose();
        }
        return ab.f48028a;
    }

    static final ab onRefreshScheduled$lambda$0(InvalidationTracker invalidationTracker) {
        AutoCloser autoCloser = invalidationTracker.autoCloser;
        if (autoCloser != null) {
            autoCloser.incrementCountAndEnsureDbIsOpen();
        }
        return ab.f48028a;
    }

    private final boolean removeObserverOnly(Observer observer) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            ObserverWrapper observerWrapperRemove = this.observerMap.remove(observer);
            return observerWrapperRemove != null && this.implementation.onObserverRemoved$room_runtime(observerWrapperRemove.getTableIds$room_runtime());
        } finally {
            reentrantLock.unlock();
        }
    }

    public void addObserver(Observer observer) {
        x.f(observer, "observer");
        if (addObserverOnly(observer)) {
            RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new AnonymousClass1(null));
        }
    }

    public final void addRemoteObserver$room_runtime(Observer observer) {
        x.f(observer, "observer");
        if (!observer.isRemote$room_runtime()) {
            throw new IllegalStateException("isRemote was false of observer argument");
        }
        addObserverOnly(observer);
    }

    public void addWeakObserver(Observer observer) {
        x.f(observer, "observer");
        addObserver(new WeakObserver(this, observer));
    }

    public final kotlinx.coroutines.b.k<Set<String>> createFlow(String[] strArr, boolean z) {
        x.f(strArr, "tables");
        k<String[], int[]> kVarValidateTableNames$room_runtime = this.implementation.validateTableNames$room_runtime(strArr);
        String[] strArr2 = (String[]) kVarValidateTableNames$room_runtime.a();
        kotlinx.coroutines.b.k<Set<String>> kVarCreateFlow$room_runtime = this.implementation.createFlow$room_runtime(strArr2, (int[]) kVarValidateTableNames$room_runtime.b(), z);
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
        kotlinx.coroutines.b.k<Set<String>> kVarCreateFlow = multiInstanceInvalidationClient != null ? multiInstanceInvalidationClient.createFlow(strArr2) : null;
        return kVarCreateFlow != null ? ai.I(kVarCreateFlow$room_runtime, kVarCreateFlow) : kVarCreateFlow$room_runtime;
    }

    public <T> LiveData<T> createLiveData(String[] strArr, boolean z, Callable<T> callable) {
        x.f(strArr, "tableNames");
        x.f(callable, "computeFunction");
        this.implementation.validateTableNames$room_runtime(strArr);
        return this.invalidationLiveDataContainer.create(strArr, z, callable);
    }

    public final RoomDatabase getDatabase$room_runtime() {
        return this.database;
    }

    public final String[] getTableNames$room_runtime() {
        return this.tableNames;
    }

    public final void initMultiInstanceInvalidation$room_runtime(Context context, String str, Intent intent) {
        x.f(context, "context");
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(intent, "serviceIntent");
        this.multiInstanceInvalidationIntent = intent;
        this.multiInstanceInvalidationClient = new MultiInstanceInvalidationClient(context, str, this);
    }

    public final void internalInit$room_runtime(SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "connection");
        this.implementation.configureConnection(sQLiteConnection);
        synchronized (this.trackerLock) {
            MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
            if (multiInstanceInvalidationClient != null) {
                Intent intent = this.multiInstanceInvalidationIntent;
                if (intent == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                multiInstanceInvalidationClient.start(intent);
            }
        }
    }

    public final void notifyObserversByTableNames$room_runtime(Set<String> set) {
        x.f(set, "tables");
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List<ObserverWrapper> listAo = i.ao(this.observerMap.values());
            reentrantLock.unlock();
            for (ObserverWrapper observerWrapper : listAo) {
                if (!observerWrapper.getObserver$room_runtime().isRemote$room_runtime()) {
                    observerWrapper.notifyByTableNames$room_runtime(set);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Object refresh(String[] strArr, e<? super Boolean> eVar) {
        return this.implementation.refreshInvalidation$room_runtime(strArr, this.onRefreshScheduled, this.onRefreshCompleted, eVar);
    }

    public final void refreshAsync() {
        this.implementation.refreshInvalidationAsync$room_runtime(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    public void refreshVersionsAsync() {
        this.implementation.refreshInvalidationAsync$room_runtime(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    public void refreshVersionsSync() {
        RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new C04471(null));
    }

    public void removeObserver(Observer observer) {
        x.f(observer, "observer");
        if (removeObserverOnly(observer)) {
            RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new C04481(null));
        }
    }

    public final void setAutoCloser$room_runtime(AutoCloser autoCloser) {
        x.f(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.setAutoCloseCallback(new InvalidationTracker$setAutoCloser$1(this));
    }

    public final void stop$room_runtime() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.stop();
        }
    }

    public final Object sync$room_runtime(e<? super ab> eVar) throws Throwable {
        Object objSyncTriggers$room_runtime = this.implementation.syncTriggers$room_runtime(eVar);
        return objSyncTriggers$room_runtime == h.c.a.a.f48038a ? objSyncTriggers$room_runtime : ab.f48028a;
    }

    public final void syncBlocking$room_runtime() {
        RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new InvalidationTracker$syncBlocking$1(this, null));
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public <T> LiveData<T> createLiveData(String[] strArr, Callable<T> callable) {
        x.f(strArr, "tableNames");
        x.f(callable, "computeFunction");
        return createLiveData(strArr, false, (Callable) callable);
    }

    public final <T> LiveData<T> createLiveData(String[] strArr, boolean z, l<? super SQLiteConnection, ? extends T> lVar) {
        x.f(strArr, "tableNames");
        x.f(lVar, "computeFunction");
        this.implementation.validateTableNames$room_runtime(strArr);
        return this.invalidationLiveDataContainer.create(strArr, z, lVar);
    }

    /* compiled from: WazeSource */
    public abstract class Observer {
        private final String[] tables;

        protected Observer(String str, String... strArr) {
            x.f(str, "firstTable");
            x.f(strArr, "rest");
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(str);
            x.q(strArr, arrayList);
            this((String[]) arrayList.toArray(new String[arrayList.size()]));
        }

        public final String[] getTables$room_runtime() {
            return this.tables;
        }

        public boolean isRemote$room_runtime() {
            return false;
        }

        public abstract void onInvalidated(Set<String> set);

        public Observer(String[] strArr) {
            x.f(strArr, "tables");
            this.tables = strArr;
        }
    }

    public final kotlinx.coroutines.b.k<Set<String>> createFlow(String... strArr) {
        x.f(strArr, "tables");
        return createFlow$default(this, strArr, false, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InvalidationTracker(RoomDatabase roomDatabase, String... strArr) {
        this(roomDatabase, r.j(), r.j(), (String[]) Arrays.copyOf(strArr, strArr.length));
        x.f(roomDatabase, "database");
        x.f(strArr, "tableNames");
    }
}
