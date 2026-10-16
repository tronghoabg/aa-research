package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.w;
import h.g.b.y;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GlobalSnapshotManager {
    public static final GlobalSnapshotManager INSTANCE = new GlobalSnapshotManager();
    private static final AtomicBoolean started = new AtomicBoolean(false);
    private static final AtomicBoolean sent = new AtomicBoolean(false);
    public static final int $stable = 8;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ o<ab> $channel;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(o<ab> oVar, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$channel = oVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$channel, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #0 {all -> 0x005a, blocks: (B:6:0x0011, B:15:0x0037, B:17:0x003f, B:12:0x002a, B:11:0x0025), top: B:26:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0034 -> B:15:0x0037). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r1 = r5.L$1
                kotlinx.coroutines.a.q r1 = (kotlinx.coroutines.a.q) r1
                java.lang.Object r3 = r5.L$0
                kotlinx.coroutines.a.af r3 = (kotlinx.coroutines.a.af) r3
                e.b.c.b(r6)     // Catch: java.lang.Throwable -> L5a
                goto L37
            L15:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1d:
                e.b.c.b(r6)
                kotlinx.coroutines.a.o<h.ab> r6 = r5.$channel
                r3 = r6
                kotlinx.coroutines.a.af r3 = (kotlinx.coroutines.a.af) r3
                kotlinx.coroutines.a.q r6 = r3.p()     // Catch: java.lang.Throwable -> L5a
                r1 = r6
            L2a:
                r5.L$0 = r3     // Catch: java.lang.Throwable -> L5a
                r5.L$1 = r1     // Catch: java.lang.Throwable -> L5a
                r5.label = r2     // Catch: java.lang.Throwable -> L5a
                java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> L5a
                if (r6 != r0) goto L37
                return r0
            L37:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L5a
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L5a
                if (r6 == 0) goto L53
                java.lang.Object r6 = r1.b()     // Catch: java.lang.Throwable -> L5a
                h.ab r6 = (h.ab) r6     // Catch: java.lang.Throwable -> L5a
                java.util.concurrent.atomic.AtomicBoolean r6 = androidx.compose.ui.platform.GlobalSnapshotManager.access$getSent$p()     // Catch: java.lang.Throwable -> L5a
                r4 = 0
                r6.set(r4)     // Catch: java.lang.Throwable -> L5a
                androidx.compose.runtime.snapshots.Snapshot$Companion r6 = androidx.compose.runtime.snapshots.Snapshot.Companion     // Catch: java.lang.Throwable -> L5a
                r6.sendApplyNotifications()     // Catch: java.lang.Throwable -> L5a
                goto L2a
            L53:
                r5 = 0
                kotlinx.coroutines.a.ab.f(r3, r5)
                h.ab r5 = h.ab.f48028a
                return r5
            L5a:
                r5 = move-exception
                throw r5     // Catch: java.lang.Throwable -> L5c
            L5c:
                r6 = move-exception
                kotlinx.coroutines.a.ab.f(r3, r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private GlobalSnapshotManager() {
    }

    public final void ensureStarted() {
        if (started.compareAndSet(false, true)) {
            o oVarC = w.c(1, null, null, 6);
            aj.z(aj.e(AndroidUiDispatcher.Companion.getMain()), null, null, new AnonymousClass1(oVarC, null), 3);
            Snapshot.Companion.registerGlobalWriteObserver(new AnonymousClass2(oVarC));
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2, reason: invalid class name */
    final class AnonymousClass2 extends y implements l<Object, ab> {
        final /* synthetic */ o<ab> $channel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(o<ab> oVar) {
            super(1);
            this.$channel = oVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
            if (GlobalSnapshotManager.sent.compareAndSet(false, true)) {
                this.$channel.i(ab.f48028a);
            }
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(Object obj) {
            invoke2(obj);
            return ab.f48028a;
        }
    }
}
