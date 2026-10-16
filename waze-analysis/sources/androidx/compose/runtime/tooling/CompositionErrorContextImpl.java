package androidx.compose.runtime.tooling;

import androidx.compose.runtime.InternalComposer;
import androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext;
import h.c.h;
import h.c.i;
import h.c.j;
import h.g.a.a;
import h.g.a.p;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CompositionErrorContextImpl implements CompositionErrorContext, OperationErrorContext, h {
    public static final int $stable = 0;
    public static final Key Key = new Key(null);
    private final InternalComposer composer;

    public CompositionErrorContextImpl(InternalComposer internalComposer) {
        this.composer = internalComposer;
    }

    @Override // androidx.compose.runtime.tooling.CompositionErrorContext
    public boolean attachComposeStackTrace(Throwable th, final Object obj) {
        return ComposeStackTraceKt.tryAttachComposeStackTrace(th, new a() { // from class: androidx.compose.runtime.tooling.CompositionErrorContextImpl$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.composer.stackTraceForValue$runtime(obj);
            }
        });
    }

    @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext
    public List<ComposeStackTraceFrame> buildStackTrace(Integer num) {
        return this.composer.parentStackTrace$runtime();
    }

    @Override // h.c.j
    public /* bridge */ <R> R fold(R r, p<? super R, ? super h, ? extends R> pVar) {
        return (R) h.c.a.h.e(this, r, pVar);
    }

    @Override // h.c.h, h.c.j
    public /* bridge */ <E extends h> E get(i<E> iVar) {
        return (E) h.c.a.h.f(this, iVar);
    }

    @Override // h.c.h
    public i<?> getKey() {
        return Key;
    }

    @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext
    public boolean getSourceInformationEnabled() {
        return this.composer.getSourceMarkersEnabled$runtime();
    }

    @Override // h.c.j
    public /* bridge */ j minusKey(i<?> iVar) {
        return h.c.a.h.g(this, iVar);
    }

    @Override // h.c.j
    public /* bridge */ j plus(j jVar) {
        return h.c.a.h.h(this, jVar);
    }

    /* compiled from: WazeSource */
    public final class Key implements i<CompositionErrorContextImpl> {
        private Key() {
        }

        public String toString() {
            return "CompositionErrorContext";
        }

        public /* synthetic */ Key(o oVar) {
            this();
        }
    }
}
