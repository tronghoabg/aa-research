package androidx.camera.camera2.pipe.compat;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SessionSequencer {
    private final ConcurrentSessionSequencer concurrentSequencer;
    private final kotlinx.a.d<State> state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class State {
        private static final /* synthetic */ h.d.a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State PENDING = new State("PENDING", 0);
        public static final State CREATING = new State("CREATING", 1);
        public static final State CREATED = new State("CREATED", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{PENDING, CREATING, CREATED};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = h.d.b.a(stateArr$values);
        }

        private State(String str, int i2) {
        }

        public static h.d.a<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.SessionSequencer$awaitSessionLock$1, reason: invalid class name */
    final class AnonymousClass1 extends h.c.b.a.c {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(h.c.e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionSequencer.this.awaitSessionLock(this);
        }
    }

    public SessionSequencer(ConcurrentSessionSequencer concurrentSessionSequencer) {
        x.f(concurrentSessionSequencer, "concurrentSequencer");
        this.concurrentSequencer = concurrentSessionSequencer;
        this.state = h.e.b.h(State.PENDING);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitSessionLock(h.c.e<? super h.ab> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.camera.camera2.pipe.compat.SessionSequencer.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.camera.camera2.pipe.compat.SessionSequencer$awaitSessionLock$1 r0 = (androidx.camera.camera2.pipe.compat.SessionSequencer.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.compat.SessionSequencer$awaitSessionLock$1 r0 = new androidx.camera.camera2.pipe.compat.SessionSequencer$awaitSessionLock$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r5)
            androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencer r5 = r4.concurrentSequencer
            kotlinx.coroutines.h.a r5 = r5.getSharedMutex()
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.i.c.b(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            kotlinx.a.d<androidx.camera.camera2.pipe.compat.SessionSequencer$State> r5 = r4.state
            androidx.camera.camera2.pipe.compat.SessionSequencer$State r0 = androidx.camera.camera2.pipe.compat.SessionSequencer.State.PENDING
            androidx.camera.camera2.pipe.compat.SessionSequencer$State r1 = androidx.camera.camera2.pipe.compat.SessionSequencer.State.CREATING
            boolean r5 = r5.e(r0, r1)
            if (r5 != 0) goto L56
            androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencer r4 = r4.concurrentSequencer
            kotlinx.coroutines.h.a r4 = r4.getSharedMutex()
            kotlinx.coroutines.i.c.d(r4)
        L56:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.SessionSequencer.awaitSessionLock(h.c.e):java.lang.Object");
    }

    public final void release() {
        if (this.state.a(State.CREATED) == State.CREATING) {
            this.concurrentSequencer.getSharedMutex().unlock(null);
        }
    }
}
