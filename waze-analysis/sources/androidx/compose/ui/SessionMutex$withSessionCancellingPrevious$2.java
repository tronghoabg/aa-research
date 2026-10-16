package androidx.compose.ui;

import androidx.compose.ui.SessionMutex;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.af;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SessionMutex$withSessionCancellingPrevious$2 extends g implements p<af, e, Object> {
    final /* synthetic */ AtomicReference<SessionMutex.Session<T>> $arg0;
    final /* synthetic */ p<T, e, Object> $session;
    final /* synthetic */ l<af, T> $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SessionMutex$withSessionCancellingPrevious$2(l<? super af, ? extends T> lVar, AtomicReference<SessionMutex.Session<T>> atomicReference, p<? super T, ? super e, ? extends Object> pVar, e<? super SessionMutex$withSessionCancellingPrevious$2> eVar) {
        super(2, eVar);
        this.$sessionInitializer = lVar;
        this.$arg0 = atomicReference;
        this.$session = pVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.$sessionInitializer, this.$arg0, this.$session, eVar);
        sessionMutex$withSessionCancellingPrevious$2.L$0 = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e eVar) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        SessionMutex.Session session;
        br job;
        SessionMutex.Session session2;
        Object obj2 = a.f48038a;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                c.b(obj);
                af afVar = (af) this.L$0;
                session = new SessionMutex.Session(o.d(afVar.getCoroutineContext()), this.$sessionInitializer.invoke(afVar));
                SessionMutex.Session session3 = (SessionMutex.Session) this.$arg0.getAndSet(session);
                if (session3 != null && (job = session3.getJob()) != null) {
                    this.L$0 = session;
                    this.label = 1;
                    if (o.b(job, this) != obj2) {
                    }
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    session2 = (SessionMutex.Session) this.L$0;
                    try {
                        c.b(obj);
                        SessionMutex$withSessionCancellingPrevious$2$$ExternalSyntheticBackportWithForwarding0.m(this.$arg0, session2, null);
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        SessionMutex$withSessionCancellingPrevious$2$$ExternalSyntheticBackportWithForwarding0.m(this.$arg0, session2, null);
                        throw th;
                    }
                }
                session = (SessionMutex.Session) this.L$0;
                c.b(obj);
            }
            p<T, e, Object> pVar = this.$session;
            Object value = session.getValue();
            this.L$0 = session;
            this.label = 2;
            obj = pVar.invoke(value, this);
            if (obj != obj2) {
                session2 = session;
                SessionMutex$withSessionCancellingPrevious$2$$ExternalSyntheticBackportWithForwarding0.m(this.$arg0, session2, null);
                return obj;
            }
            return obj2;
        } catch (Throwable th2) {
            th = th2;
            session2 = session;
            SessionMutex$withSessionCancellingPrevious$2$$ExternalSyntheticBackportWithForwarding0.m(this.$arg0, session2, null);
            throw th;
        }
    }
}
