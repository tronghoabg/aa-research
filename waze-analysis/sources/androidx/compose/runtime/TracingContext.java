package androidx.compose.runtime;

import androidx.compose.runtime.internal.Trace;
import h.ab;
import h.c.h;
import h.c.i;
import h.c.j;
import h.g.a.p;
import h.g.b.o;
import kotlinx.coroutines.dc;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class TracingContext implements h, dc {
    public static final int $stable = 0;
    public static final Key Key = new Key(null);
    private final String name;

    public TracingContext(String str) {
        this.name = str;
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

    @Override // h.c.j
    public /* bridge */ j minusKey(i<?> iVar) {
        return h.c.a.h.g(this, iVar);
    }

    @Override // h.c.j
    public /* bridge */ j plus(j jVar) {
        return h.c.a.h.h(this, jVar);
    }

    @Override // kotlinx.coroutines.dc
    public void restoreThreadContext(j jVar, ab abVar) {
        Trace.INSTANCE.endSection(ab.f48028a);
    }

    /* renamed from: updateThreadContext, reason: collision with other method in class */
    public void m7341updateThreadContext(j jVar) {
        Trace.INSTANCE.beginSection(this.name);
    }

    /* compiled from: WazeSource */
    public final class Key implements i<TracingContext> {
        private Key() {
        }

        public /* synthetic */ Key(o oVar) {
            this();
        }
    }

    @Override // kotlinx.coroutines.dc
    public /* bridge */ /* synthetic */ Object updateThreadContext(j jVar) {
        m7341updateThreadContext(jVar);
        return ab.f48028a;
    }
}
