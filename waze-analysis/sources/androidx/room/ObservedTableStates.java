package androidx.room;

import h.ab;
import h.d.a;
import h.d.b;
import h.g.a.l;
import h.g.b.x;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ObservedTableStates {
    private volatile boolean inProgressSync;
    private volatile boolean needsSync;
    private final boolean[] tableObservedState;
    private final long[] tableObserversCount;
    private final ReentrantLock lock = new ReentrantLock();
    private final ReentrantLock onSyncLock = new ReentrantLock();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class ObserveOp {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ObserveOp[] $VALUES;
        public static final ObserveOp NO_OP = new ObserveOp("NO_OP", 0);
        public static final ObserveOp ADD = new ObserveOp("ADD", 1);
        public static final ObserveOp REMOVE = new ObserveOp("REMOVE", 2);

        private static final /* synthetic */ ObserveOp[] $values() {
            return new ObserveOp[]{NO_OP, ADD, REMOVE};
        }

        static {
            ObserveOp[] observeOpArr$values = $values();
            $VALUES = observeOpArr$values;
            $ENTRIES = b.a(observeOpArr$values);
        }

        private ObserveOp(String str, int i2) {
        }

        public static a<ObserveOp> getEntries() {
            return $ENTRIES;
        }

        public static ObserveOp valueOf(String str) {
            return (ObserveOp) Enum.valueOf(ObserveOp.class, str);
        }

        public static ObserveOp[] values() {
            return (ObserveOp[]) $VALUES.clone();
        }
    }

    public ObservedTableStates(int i2) {
        this.tableObserversCount = new long[i2];
        this.tableObservedState = new boolean[i2];
    }

    public final void forceNeedSync$room_runtime() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.needsSync = true;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onObserverAdded$room_runtime(int[] r13) {
        /*
            r12 = this;
            java.lang.String r0 = "tableIds"
            h.g.b.x.f(r13, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r12.lock
            r0.lock()
            int r1 = r13.length     // Catch: java.lang.Throwable -> L37
            r2 = 0
            r3 = r2
            r4 = r3
        Le:
            r5 = 1
            if (r3 >= r1) goto L28
            r6 = r13[r3]     // Catch: java.lang.Throwable -> L37
            long[] r7 = r12.tableObserversCount     // Catch: java.lang.Throwable -> L37
            r8 = r7[r6]     // Catch: java.lang.Throwable -> L37
            r10 = 1
            long r10 = r10 + r8
            r7[r6] = r10     // Catch: java.lang.Throwable -> L37
            r6 = 0
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L25
            r12.needsSync = r5     // Catch: java.lang.Throwable -> L37
            r4 = r5
        L25:
            int r3 = r3 + 1
            goto Le
        L28:
            if (r4 != 0) goto L32
            boolean r13 = r12.needsSync     // Catch: java.lang.Throwable -> L37
            if (r13 != 0) goto L32
            boolean r12 = r12.inProgressSync     // Catch: java.lang.Throwable -> L37
            if (r12 == 0) goto L33
        L32:
            r2 = r5
        L33:
            r0.unlock()
            return r2
        L37:
            r12 = move-exception
            r0.unlock()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.ObservedTableStates.onObserverAdded$room_runtime(int[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onObserverRemoved$room_runtime(int[] r13) {
        /*
            r12 = this;
            java.lang.String r0 = "tableIds"
            h.g.b.x.f(r13, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r12.lock
            r0.lock()
            int r1 = r13.length     // Catch: java.lang.Throwable -> L37
            r2 = 0
            r3 = r2
            r4 = r3
        Le:
            r5 = 1
            if (r3 >= r1) goto L28
            r6 = r13[r3]     // Catch: java.lang.Throwable -> L37
            long[] r7 = r12.tableObserversCount     // Catch: java.lang.Throwable -> L37
            r8 = r7[r6]     // Catch: java.lang.Throwable -> L37
            r10 = -1
            long r10 = r10 + r8
            r7[r6] = r10     // Catch: java.lang.Throwable -> L37
            r6 = 1
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L25
            r12.needsSync = r5     // Catch: java.lang.Throwable -> L37
            r4 = r5
        L25:
            int r3 = r3 + 1
            goto Le
        L28:
            if (r4 != 0) goto L32
            boolean r13 = r12.needsSync     // Catch: java.lang.Throwable -> L37
            if (r13 != 0) goto L32
            boolean r12 = r12.inProgressSync     // Catch: java.lang.Throwable -> L37
            if (r12 == 0) goto L33
        L32:
            r2 = r5
        L33:
            r0.unlock()
            return r2
        L37:
            r12 = move-exception
            r0.unlock()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.ObservedTableStates.onObserverRemoved$room_runtime(int[]):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final void onSync$room_runtime(l<? super ObserveOp[], ab> lVar) {
        Object[] objArr;
        ObserveOp observeOp;
        x.f(lVar, "action");
        ReentrantLock reentrantLock = this.onSyncLock;
        reentrantLock.lock();
        try {
            this.inProgressSync = true;
            ReentrantLock reentrantLock2 = this.lock;
            reentrantLock2.lock();
            try {
                ?? r6 = 0;
                r6 = 0;
                if (this.needsSync) {
                    this.needsSync = false;
                    int length = this.tableObserversCount.length;
                    ObserveOp[] observeOpArr = new ObserveOp[length];
                    int i2 = 0;
                    Object[] objArr2 = false;
                    while (i2 < length) {
                        boolean z = this.tableObserversCount[i2] > 0;
                        if (z != this.tableObservedState[i2]) {
                            this.tableObservedState[i2] = z;
                            observeOp = z ? ObserveOp.ADD : ObserveOp.REMOVE;
                            objArr = true;
                        } else {
                            objArr = objArr2;
                            observeOp = ObserveOp.NO_OP;
                        }
                        observeOpArr[i2] = observeOp;
                        i2++;
                        objArr2 = objArr;
                    }
                    if (objArr2 != false) {
                        r6 = observeOpArr;
                    }
                }
                if (r6 != 0) {
                    try {
                        if (r6.length != 0) {
                            lVar.invoke(r6);
                        }
                    } finally {
                        this.inProgressSync = false;
                    }
                }
            } finally {
                reentrantLock2.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void resetTriggerState$room_runtime() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean[] zArr = this.tableObservedState;
            int length = zArr.length;
            x.f(zArr, "<this>");
            Arrays.fill(zArr, 0, length, false);
            this.needsSync = true;
        } finally {
            reentrantLock.unlock();
        }
    }
}
