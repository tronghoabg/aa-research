package androidx.datastore.core;

import androidx.tracing.PropagationToken;
import h.c.e;
import h.c.j;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class Message<T> {

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class Read<T> extends Message<T> {
        private final State<T> lastState;

        public Read(State<T> state) {
            super(null);
            this.lastState = state;
        }

        @Override // androidx.datastore.core.Message
        public State<T> getLastState() {
            return this.lastState;
        }
    }

    /* compiled from: WazeSource */
    public final class Update<T> extends Message<T> {
        private final CompletableDeferred<T> ack;
        private final j callerContext;
        private final State<T> lastState;
        private final PropagationToken token;
        private final p<T, e<? super T>, Object> transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Update(p<? super T, ? super e<? super T>, ? extends Object> pVar, CompletableDeferred<T> completableDeferred, State<T> state, j jVar, PropagationToken propagationToken) {
            super(null);
            x.f(pVar, "transform");
            x.f(completableDeferred, "ack");
            x.f(jVar, "callerContext");
            this.transform = pVar;
            this.ack = completableDeferred;
            this.lastState = state;
            this.callerContext = jVar;
            this.token = propagationToken;
        }

        public final CompletableDeferred<T> getAck() {
            return this.ack;
        }

        public final j getCallerContext() {
            return this.callerContext;
        }

        @Override // androidx.datastore.core.Message
        public State<T> getLastState() {
            return this.lastState;
        }

        public final PropagationToken getToken() {
            return this.token;
        }

        public final p<T, e<? super T>, Object> getTransform() {
            return this.transform;
        }
    }

    private Message() {
    }

    public abstract State<T> getLastState();

    public /* synthetic */ Message(o oVar) {
        this();
    }
}
