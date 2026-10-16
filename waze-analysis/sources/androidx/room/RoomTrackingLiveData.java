package androidx.room;

import androidx.lifecycle.LiveData;
import androidx.room.InvalidationTracker;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.c.j;
import h.c.k;
import h.g.a.p;
import h.g.b.o;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class RoomTrackingLiveData<T> extends LiveData<T> {
    private final AtomicBoolean computing;
    private final InvalidationLiveDataContainer container;
    private final RoomDatabase database;
    private final boolean inTransaction;
    private final AtomicBoolean invalid;
    private final j launchContext;
    private final InvalidationTracker.Observer observer;
    private final AtomicBoolean registeredObserver;

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.RoomTrackingLiveData$invalidated$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        int label;
        final /* synthetic */ RoomTrackingLiveData<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RoomTrackingLiveData<T> roomTrackingLiveData, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.this$0 = roomTrackingLiveData;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.this$0, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (this.this$0.refresh(this) == aVar) {
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
    /* renamed from: androidx.room.RoomTrackingLiveData$onActive$1, reason: invalid class name and case insensitive filesystem */
    final class C04511 extends g implements p<af, e<? super ab>, Object> {
        int label;
        final /* synthetic */ RoomTrackingLiveData<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04511(RoomTrackingLiveData<T> roomTrackingLiveData, e<? super C04511> eVar) {
            super(2, eVar);
            this.this$0 = roomTrackingLiveData;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new C04511(this.this$0, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C04511) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (this.this$0.refresh(this) == aVar) {
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
    /* renamed from: androidx.room.RoomTrackingLiveData$refresh$1, reason: invalid class name and case insensitive filesystem */
    final class C04521 extends h.c.b.a.c {
        int I$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RoomTrackingLiveData<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04521(RoomTrackingLiveData<T> roomTrackingLiveData, e<? super C04521> eVar) {
            super(eVar);
            this.this$0 = roomTrackingLiveData;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.refresh(this);
        }
    }

    private RoomTrackingLiveData(RoomDatabase roomDatabase, InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z, String[] strArr) {
        this.database = roomDatabase;
        this.container = invalidationLiveDataContainer;
        this.inTransaction = z;
        this.observer = new RoomTrackingLiveData$observer$1(strArr, this);
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.registeredObserver = new AtomicBoolean(false);
        this.launchContext = roomDatabase.inCompatibilityMode() ? z ? roomDatabase.getTransactionContext$room_runtime() : roomDatabase.getQueryContext() : k.f48060a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidated() {
        AtomicBoolean atomicBoolean = this.invalid;
        boolean zHasActiveObservers = hasActiveObservers();
        if (atomicBoolean.compareAndSet(false, true) && zHasActiveObservers) {
            RoomDatabase roomDatabase = this.database;
            aj.z(roomDatabase.getCoroutineScope(), this.launchContext, null, new AnonymousClass1(this, null), 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e A[Catch: all -> 0x002a, Exception -> 0x002c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:12:0x0026, B:28:0x005e), top: B:46:0x0026, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #1 {all -> 0x002a, blocks: (B:12:0x0026, B:26:0x0056, B:28:0x005e, B:35:0x0077, B:32:0x006b, B:33:0x0074), top: B:46:0x0026, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0054 -> B:26:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(h.c.e<? super h.ab> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.room.RoomTrackingLiveData.C04521
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.RoomTrackingLiveData$refresh$1 r0 = (androidx.room.RoomTrackingLiveData.C04521) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.RoomTrackingLiveData$refresh$1 r0 = new androidx.room.RoomTrackingLiveData$refresh$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            int r2 = r0.I$0
            e.b.c.b(r7)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            goto L56
        L2a:
            r7 = move-exception
            goto L80
        L2c:
            r7 = move-exception
            goto L6b
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            e.b.c.b(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.registeredObserver
            boolean r7 = r7.compareAndSet(r3, r4)
            if (r7 == 0) goto L4c
            androidx.room.RoomDatabase r7 = r6.database
            androidx.room.InvalidationTracker$Observer r2 = r6.observer
            androidx.room.InvalidationTracker r7 = r7.getInvalidationTracker()
            r7.addWeakObserver(r2)
        L4c:
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.computing
            boolean r7 = r7.compareAndSet(r3, r4)
            if (r7 == 0) goto L86
            r7 = 0
            r2 = r3
        L56:
            java.util.concurrent.atomic.AtomicBoolean r5 = r6.invalid     // Catch: java.lang.Throwable -> L2a
            boolean r5 = r5.compareAndSet(r4, r3)     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L75
            r0.I$0 = r4     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            r0.label = r4     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            java.lang.Object r7 = r6.compute(r0)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            if (r7 == r1) goto L6a
            r2 = r4
            goto L56
        L6a:
            return r1
        L6b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "Exception while computing database live data."
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r1, r7)     // Catch: java.lang.Throwable -> L2a
            throw r0     // Catch: java.lang.Throwable -> L2a
        L75:
            if (r2 == 0) goto L7a
            r6.postValue(r7)     // Catch: java.lang.Throwable -> L2a
        L7a:
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.computing
            r7.set(r3)
            goto L87
        L80:
            java.util.concurrent.atomic.AtomicBoolean r6 = r6.computing
            r6.set(r3)
            throw r7
        L86:
            r2 = r3
        L87:
            if (r2 == 0) goto L92
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.invalid
            boolean r7 = r7.get()
            if (r7 == 0) goto L92
            goto L4c
        L92:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomTrackingLiveData.refresh(h.c.e):java.lang.Object");
    }

    public abstract Object compute(e<? super T> eVar);

    protected final RoomDatabase getDatabase() {
        return this.database;
    }

    protected final boolean getInTransaction() {
        return this.inTransaction;
    }

    @Override // androidx.lifecycle.LiveData
    protected void onActive() {
        this.container.onActive(this);
        aj.z(this.database.getCoroutineScope(), this.launchContext, null, new C04511(this, null), 2);
    }

    @Override // androidx.lifecycle.LiveData
    protected void onInactive() {
        this.container.onInactive(this);
    }

    public /* synthetic */ RoomTrackingLiveData(RoomDatabase roomDatabase, InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z, String[] strArr, o oVar) {
        this(roomDatabase, invalidationLiveDataContainer, z, strArr);
    }
}
