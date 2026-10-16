package androidx.compose.ui;

import h.c.e;
import h.g.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class SessionMutex<T> {
    private final AtomicReference<Session<T>> currentSessionHolder;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final class Session<T> {
        private final br job;
        private final T value;

        public Session(br brVar, T t) {
            this.job = brVar;
            this.value = t;
        }

        public final br getJob() {
            return this.job;
        }

        public final T getValue() {
            return this.value;
        }
    }

    private /* synthetic */ SessionMutex(AtomicReference atomicReference) {
        this.currentSessionHolder = atomicReference;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SessionMutex m7661boximpl(AtomicReference atomicReference) {
        return new SessionMutex(atomicReference);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> AtomicReference<Session<T>> m7662constructorimpl() {
        return new AtomicReference<>(null);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7664equalsimpl(AtomicReference<Session<T>> atomicReference, Object obj) {
        return (obj instanceof SessionMutex) && x.n(atomicReference, ((SessionMutex) obj).m7670unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7665equalsimpl0(AtomicReference<Session<Object>> atomicReference, AtomicReference<Session<Object>> atomicReference2) {
        return x.n(atomicReference, atomicReference2);
    }

    /* renamed from: getCurrentSession-impl, reason: not valid java name */
    public static final T m7666getCurrentSessionimpl(AtomicReference<Session<T>> atomicReference) {
        Session<T> session = atomicReference.get();
        if (session != null) {
            return session.getValue();
        }
        return null;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7667hashCodeimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7668toStringimpl(AtomicReference<Session<T>> atomicReference) {
        return "SessionMutex(currentSessionHolder=" + atomicReference + ')';
    }

    /* renamed from: withSessionCancellingPrevious-impl, reason: not valid java name */
    public static final <R> Object m7669withSessionCancellingPreviousimpl(AtomicReference<Session<T>> atomicReference, l<? super af, ? extends T> lVar, p<? super T, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar) {
        return aj.d(new SessionMutex$withSessionCancellingPrevious$2(lVar, atomicReference, pVar, null), eVar);
    }

    public boolean equals(Object obj) {
        return m7664equalsimpl(this.currentSessionHolder, obj);
    }

    public int hashCode() {
        return m7667hashCodeimpl(this.currentSessionHolder);
    }

    public String toString() {
        return m7668toStringimpl(this.currentSessionHolder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ AtomicReference m7670unboximpl() {
        return this.currentSessionHolder;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static <T> AtomicReference<Session<T>> m7663constructorimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference;
    }
}
