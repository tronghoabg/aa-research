package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.messaging.m;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.c.j;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.ao;
import kotlinx.coroutines.av;
import kotlinx.coroutines.ax;
import kotlinx.coroutines.cj;
import kotlinx.coroutines.cm;
import kotlinx.coroutines.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class c extends d implements ao {

    /* renamed from: b, reason: collision with root package name */
    private final Handler f51359b;

    /* renamed from: c, reason: collision with root package name */
    private final String f51360c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f51361d;

    /* renamed from: e, reason: collision with root package name */
    private final c f51362e;

    private c(Handler handler, String str, boolean z) {
        super(null);
        this.f51359b = handler;
        this.f51360c = str;
        this.f51361d = z;
        this.f51362e = z ? this : new c(handler, str, true);
    }

    static final void e(c cVar, Runnable runnable) {
        cVar.f51359b.removeCallbacks(runnable);
    }

    static final ab g(c cVar, Runnable runnable) {
        cVar.f51359b.removeCallbacks(runnable);
        return ab.f48028a;
    }

    private final void h(j jVar, Runnable runnable) {
        o.e(jVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        av.b().dispatch(jVar, runnable);
    }

    @Override // kotlinx.coroutines.android.d, kotlinx.coroutines.ao
    public final ax b(long j2, final Runnable runnable, j jVar) {
        if (this.f51359b.postDelayed(runnable, n.l(j2, 4611686018427387903L))) {
            return new ax() { // from class: kotlinx.coroutines.android.a
                @Override // kotlinx.coroutines.ax
                public final void dispose() {
                    c.e(this.f51354a, runnable);
                }
            };
        }
        h(jVar, runnable);
        return cm.f51811a;
    }

    @Override // kotlinx.coroutines.cj
    public final /* synthetic */ cj c() {
        return this.f51362e;
    }

    @Override // kotlinx.coroutines.android.d
    public final /* synthetic */ d d() {
        return this.f51362e;
    }

    @Override // kotlinx.coroutines.ab
    public final void dispatch(j jVar, Runnable runnable) {
        if (this.f51359b.post(runnable)) {
            return;
        }
        h(jVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.f51359b == this.f51359b && cVar.f51361d == this.f51361d;
    }

    @Override // kotlinx.coroutines.ao
    public final void f(long j2, k kVar) {
        final m mVar = new m(kVar, this, 12, null);
        if (this.f51359b.postDelayed(mVar, n.l(j2, 4611686018427387903L))) {
            kVar.c(new l() { // from class: kotlinx.coroutines.android.b
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return c.g(this.f51357a, mVar);
                }
            });
        } else {
            h(kVar.getContext(), mVar);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f51359b) ^ (true != this.f51361d ? DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER : DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS);
    }

    @Override // kotlinx.coroutines.ab
    public final boolean isDispatchNeeded(j jVar) {
        if (this.f51361d) {
            return !x.n(Looper.myLooper(), this.f51359b.getLooper());
        }
        return true;
    }

    @Override // kotlinx.coroutines.cj, kotlinx.coroutines.ab
    public final String toString() {
        String strA = a();
        if (strA == null) {
            strA = this.f51360c;
            if (strA == null) {
                strA = this.f51359b.toString();
            }
            if (this.f51361d) {
                return String.valueOf(strA).concat(".immediate");
            }
        }
        return strA;
    }

    public c(Handler handler, String str) {
        this(handler, str, false);
    }
}
