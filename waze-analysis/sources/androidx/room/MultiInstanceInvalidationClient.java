package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.room.IMultiInstanceInvalidationCallback;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.InvalidationTracker;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.g.b.x;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.a.a;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class MultiInstanceInvalidationClient {
    private final Context appContext;
    private int clientId;
    private final af coroutineScope;
    private final bm<Set<String>> invalidatedTables;
    private final IMultiInstanceInvalidationCallback invalidationCallback;
    private IMultiInstanceInvalidationService invalidationService;
    private final InvalidationTracker invalidationTracker;
    private final String name;
    private final MultiInstanceInvalidationClient$observer$1 observer;
    private final ServiceConnection serviceConnection;
    private final AtomicBoolean stopped;

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.room.MultiInstanceInvalidationClient$observer$1] */
    public MultiInstanceInvalidationClient(Context context, String str, InvalidationTracker invalidationTracker) {
        x.f(context, "context");
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(invalidationTracker, "invalidationTracker");
        this.name = str;
        this.invalidationTracker = invalidationTracker;
        this.appContext = context.getApplicationContext();
        this.coroutineScope = invalidationTracker.getDatabase$room_runtime().getCoroutineScope();
        this.stopped = new AtomicBoolean(true);
        this.invalidatedTables = bu.c(0, 0, a.f51271a);
        final String[] tableNames$room_runtime = invalidationTracker.getTableNames$room_runtime();
        this.observer = new InvalidationTracker.Observer(tableNames$room_runtime) { // from class: androidx.room.MultiInstanceInvalidationClient$observer$1
            @Override // androidx.room.InvalidationTracker.Observer
            public boolean isRemote$room_runtime() {
                return true;
            }

            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(Set<String> set) {
                x.f(set, "tables");
                if (this.this$0.stopped.get()) {
                    return;
                }
                try {
                    IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this.this$0.invalidationService;
                    if (iMultiInstanceInvalidationService != null) {
                        iMultiInstanceInvalidationService.broadcastInvalidation(this.this$0.clientId, (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException e2) {
                    Log.w(Room.LOG_TAG, "Cannot broadcast invalidation", e2);
                }
            }
        };
        this.invalidationCallback = new IMultiInstanceInvalidationCallback.Stub() { // from class: androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1
            @Override // androidx.room.IMultiInstanceInvalidationCallback
            public void onInvalidation(String[] strArr) {
                x.f(strArr, "tables");
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.this$0;
                aj.z(multiInstanceInvalidationClient.coroutineScope, null, null, new MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1(strArr, multiInstanceInvalidationClient, null), 3);
            }
        };
        this.serviceConnection = new ServiceConnection() { // from class: androidx.room.MultiInstanceInvalidationClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                x.f(componentName, HintConstants.AUTOFILL_HINT_NAME);
                x.f(iBinder, NotificationCompat.CATEGORY_SERVICE);
                this.this$0.invalidationService = IMultiInstanceInvalidationService.Stub.asInterface(iBinder);
                this.this$0.registerCallback();
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                x.f(componentName, HintConstants.AUTOFILL_HINT_NAME);
                this.this$0.invalidationService = null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerCallback() {
        try {
            IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this.invalidationService;
            if (iMultiInstanceInvalidationService != null) {
                this.clientId = iMultiInstanceInvalidationService.registerCallback(this.invalidationCallback, this.name);
            }
        } catch (RemoteException e2) {
            Log.w(Room.LOG_TAG, "Cannot register multi-instance invalidation callback", e2);
        }
    }

    public final k<Set<String>> createFlow(final String[] strArr) {
        x.f(strArr, "resolvedTableNames");
        final bm<Set<String>> bmVar = this.invalidatedTables;
        return (k) new k<Set<? extends String>>() { // from class: androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1

            /* compiled from: WazeSource */
            /* renamed from: androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements l {
                final /* synthetic */ String[] $resolvedTableNames$inlined;
                final /* synthetic */ l $this_unsafeFlow;

                /* compiled from: WazeSource */
                /* renamed from: androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(e eVar) {
                        super(eVar);
                    }

                    @Override // h.c.b.a.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(l lVar, String[] strArr) {
                    this.$this_unsafeFlow = lVar;
                    this.$resolvedTableNames$inlined = strArr;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.b.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, h.c.e r11) {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1 r0 = (androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1 r0 = new androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1
                        r0.<init>(r11)
                    L18:
                        java.lang.Object r11 = r0.result
                        h.c.a.a r1 = h.c.a.a.f48038a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        e.b.c.b(r11)
                        goto L7d
                    L27:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        throw r9
                    L2f:
                        e.b.c.b(r11)
                        kotlinx.coroutines.b.l r11 = r9.$this_unsafeFlow
                        r2 = r0
                        h.c.e r2 = (h.c.e) r2
                        java.util.Set r10 = (java.util.Set) r10
                        java.lang.String[] r9 = r9.$resolvedTableNames$inlined
                        java.util.Set r2 = e.c.d.a.m()
                        int r4 = r9.length
                        r5 = 0
                    L41:
                        if (r5 >= r4) goto L65
                        r6 = r9[r5]
                        r7 = r10
                        java.lang.Iterable r7 = (java.lang.Iterable) r7
                        java.util.Iterator r7 = r7.iterator()
                    L4c:
                        boolean r8 = r7.hasNext()
                        if (r8 == 0) goto L62
                        java.lang.Object r8 = r7.next()
                        java.lang.String r8 = (java.lang.String) r8
                        boolean r8 = h.n.o.m(r6, r8, r3)
                        if (r8 == 0) goto L4c
                        r2.add(r6)
                        goto L4c
                    L62:
                        int r5 = r5 + 1
                        goto L41
                    L65:
                        java.util.Set r9 = e.c.d.a.l(r2)
                        java.util.Collection r9 = (java.util.Collection) r9
                        boolean r10 = r9.isEmpty()
                        if (r3 != r10) goto L72
                        r9 = 0
                    L72:
                        if (r9 == 0) goto L7d
                        r0.label = r3
                        java.lang.Object r9 = r11.emit(r9, r0)
                        if (r9 != r1) goto L7d
                        return r1
                    L7d:
                        h.ab r9 = h.ab.f48028a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, h.c.e):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.b.k
            public Object collect(l<? super Set<? extends String>> lVar, e eVar) {
                Object objCollect = bmVar.collect(new AnonymousClass2(lVar, strArr), eVar);
                return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
            }
        };
    }

    public final InvalidationTracker getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public final String getName() {
        return this.name;
    }

    public final void start(Intent intent) {
        x.f(intent, "serviceIntent");
        if (this.stopped.compareAndSet(true, false)) {
            this.appContext.bindService(intent, this.serviceConnection, 1);
            this.invalidationTracker.addRemoteObserver$room_runtime(this.observer);
        }
    }

    public final void stop() {
        if (this.stopped.compareAndSet(false, true)) {
            this.invalidationTracker.removeObserver(this.observer);
            try {
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this.invalidationService;
                if (iMultiInstanceInvalidationService != null) {
                    iMultiInstanceInvalidationService.unregisterCallback(this.invalidationCallback, this.clientId);
                }
            } catch (RemoteException e2) {
                Log.w(Room.LOG_TAG, "Cannot unregister multi-instance invalidation callback", e2);
            }
            this.appContext.unbindService(this.serviceConnection);
        }
    }
}
