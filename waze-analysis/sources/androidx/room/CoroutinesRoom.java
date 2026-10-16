package androidx.room;

import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.coroutines.FlowUtil;
import androidx.sqlite.SQLiteConnection;
import h.c.e;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.concurrent.Callable;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class CoroutinesRoom {
    public static final Companion Companion = new Companion(null);

    private CoroutinesRoom() {
    }

    public static final <R> k<R> createFlow(RoomDatabase roomDatabase, boolean z, String[] strArr, Callable<R> callable) {
        return Companion.createFlow(roomDatabase, z, strArr, callable);
    }

    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z, CancellationSignal cancellationSignal, Callable<R> callable, e<? super R> eVar) {
        return Companion.execute(roomDatabase, z, cancellationSignal, callable, eVar);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final Object createFlow$lambda$1(Callable callable, SQLiteConnection sQLiteConnection) {
            x.f(sQLiteConnection, "it");
            return callable.call();
        }

        public final <R> k<R> createFlow(RoomDatabase roomDatabase, boolean z, String[] strArr, final Callable<R> callable) {
            x.f(roomDatabase, "db");
            x.f(strArr, "tableNames");
            x.f(callable, "callable");
            return FlowUtil.createFlow(roomDatabase, z, strArr, new l() { // from class: androidx.room.CoroutinesRoom$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return CoroutinesRoom.Companion.createFlow$lambda$1(callable, (SQLiteConnection) obj);
                }
            });
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <R> java.lang.Object execute(androidx.room.RoomDatabase r6, boolean r7, final android.os.CancellationSignal r8, java.util.concurrent.Callable<R> r9, h.c.e<? super R> r10) {
            /*
                r5 = this;
                boolean r0 = r10 instanceof androidx.room.CoroutinesRoom$Companion$execute$3
                if (r0 == 0) goto L13
                r0 = r10
                androidx.room.CoroutinesRoom$Companion$execute$3 r0 = (androidx.room.CoroutinesRoom$Companion$execute$3) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.room.CoroutinesRoom$Companion$execute$3 r0 = new androidx.room.CoroutinesRoom$Companion$execute$3
                r0.<init>(r5, r10)
            L18:
                java.lang.Object r5 = r0.result
                h.c.a.a r10 = h.c.a.a.f48038a
                int r1 = r0.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L54
                if (r1 == r3) goto L42
                if (r1 != r2) goto L3a
                java.lang.Object r6 = r0.L$3
                h.c.j r6 = (h.c.j) r6
                java.lang.Object r6 = r0.L$2
                java.util.concurrent.Callable r6 = (java.util.concurrent.Callable) r6
                java.lang.Object r6 = r0.L$1
                android.os.CancellationSignal r6 = (android.os.CancellationSignal) r6
                java.lang.Object r6 = r0.L$0
                androidx.room.RoomDatabase r6 = (androidx.room.RoomDatabase) r6
                e.b.c.b(r5)
                return r5
            L3a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L42:
                java.lang.Object r6 = r0.L$2
                r9 = r6
                java.util.concurrent.Callable r9 = (java.util.concurrent.Callable) r9
                java.lang.Object r6 = r0.L$1
                r8 = r6
                android.os.CancellationSignal r8 = (android.os.CancellationSignal) r8
                java.lang.Object r6 = r0.L$0
                androidx.room.RoomDatabase r6 = (androidx.room.RoomDatabase) r6
                e.b.c.b(r5)
                goto L77
            L54:
                e.b.c.b(r5)
                boolean r5 = r6.isOpenInternal$room_runtime()
                if (r5 == 0) goto L68
                boolean r5 = r6.inTransaction()
                if (r5 == 0) goto L68
                java.lang.Object r5 = r9.call()
                return r5
            L68:
                r0.L$0 = r6
                r0.L$1 = r8
                r0.L$2 = r9
                r0.label = r3
                java.lang.Object r5 = androidx.room.util.DBUtil.getCoroutineContext(r6, r7, r0)
                if (r5 != r10) goto L77
                goto Lba
            L77:
                h.c.j r5 = (h.c.j) r5
                r0.L$0 = r6
                r0.L$1 = r8
                r0.L$2 = r9
                r0.L$3 = r5
                r0.label = r2
                h.c.e r0 = (h.c.e) r0
                kotlinx.coroutines.l r7 = new kotlinx.coroutines.l
                h.c.e r1 = h.c.a.h.d(r0)
                r7.<init>(r1, r3)
                r7.u()
                r1 = r7
                kotlinx.coroutines.k r1 = (kotlinx.coroutines.k) r1
                kotlinx.coroutines.af r6 = r6.getCoroutineScope()
                androidx.room.CoroutinesRoom$Companion$execute$4$job$1 r3 = new androidx.room.CoroutinesRoom$Companion$execute$4$job$1
                r4 = 0
                r3.<init>(r9, r1, r4)
                h.g.a.p r3 = (h.g.a.p) r3
                kotlinx.coroutines.br r5 = kotlinx.coroutines.aj.z(r6, r5, r4, r3, r2)
                androidx.room.CoroutinesRoom$Companion$execute$4$1 r6 = new androidx.room.CoroutinesRoom$Companion$execute$4$1
                r6.<init>()
                h.g.a.l r6 = (h.g.a.l) r6
                r1.c(r6)
                java.lang.Object r5 = r7.j()
                if (r5 != r10) goto Lb7
                h.d.b.c(r0)
            Lb7:
                if (r5 == r10) goto Lba
                return r5
            Lba:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.CoroutinesRoom.Companion.execute(androidx.room.RoomDatabase, boolean, android.os.CancellationSignal, java.util.concurrent.Callable, h.c.e):java.lang.Object");
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <R> java.lang.Object execute(androidx.room.RoomDatabase r5, boolean r6, java.util.concurrent.Callable<R> r7, h.c.e<? super R> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.room.CoroutinesRoom$Companion$execute$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.room.CoroutinesRoom$Companion$execute$1 r0 = (androidx.room.CoroutinesRoom$Companion$execute$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.room.CoroutinesRoom$Companion$execute$1 r0 = new androidx.room.CoroutinesRoom$Companion$execute$1
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r4 = r0.result
                h.c.a.a r8 = h.c.a.a.f48038a
                int r1 = r0.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3b
                if (r1 == r3) goto L32
                if (r1 != r2) goto L2a
                e.b.c.b(r4)
                return r4
            L2a:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L32:
                java.lang.Object r5 = r0.L$0
                r7 = r5
                java.util.concurrent.Callable r7 = (java.util.concurrent.Callable) r7
                e.b.c.b(r4)
                goto L5a
            L3b:
                e.b.c.b(r4)
                boolean r4 = r5.isOpenInternal$room_runtime()
                if (r4 == 0) goto L4f
                boolean r4 = r5.inTransaction()
                if (r4 == 0) goto L4f
                java.lang.Object r4 = r7.call()
                return r4
            L4f:
                r0.L$0 = r7
                r0.label = r3
                java.lang.Object r4 = androidx.room.util.DBUtil.getCoroutineContext(r5, r6, r0)
                if (r4 != r8) goto L5a
                goto L6e
            L5a:
                h.c.j r4 = (h.c.j) r4
                androidx.room.CoroutinesRoom$Companion$execute$2 r5 = new androidx.room.CoroutinesRoom$Companion$execute$2
                r6 = 0
                r5.<init>(r7, r6)
                h.g.a.p r5 = (h.g.a.p) r5
                r0.L$0 = r6
                r0.label = r2
                java.lang.Object r4 = kotlinx.coroutines.aj.v(r4, r5, r0)
                if (r4 != r8) goto L6f
            L6e:
                return r8
            L6f:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.CoroutinesRoom.Companion.execute(androidx.room.RoomDatabase, boolean, java.util.concurrent.Callable, h.c.e):java.lang.Object");
        }
    }

    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z, Callable<R> callable, e<? super R> eVar) {
        return Companion.execute(roomDatabase, z, callable, eVar);
    }
}
