package okhttp3.internal.b;

import androidx.autofill.HintConstants;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final e f55966a;

    /* renamed from: b, reason: collision with root package name */
    private final String f55967b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f55968c;

    /* renamed from: d, reason: collision with root package name */
    private a f55969d;

    /* renamed from: e, reason: collision with root package name */
    private final List f55970e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f55971f;

    public c(e eVar, String str) {
        x.f(eVar, "taskRunner");
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f55966a = eVar;
        this.f55967b = str;
        this.f55970e = new ArrayList();
    }

    public final String a() {
        return this.f55967b;
    }

    public final List b() {
        return this.f55970e;
    }

    public final a c() {
        return this.f55969d;
    }

    public final void d() {
        byte[] bArr = okhttp3.internal.b.f55955a;
        e eVar = this.f55966a;
        synchronized (eVar) {
            if (g()) {
                eVar.e(this);
            }
        }
    }

    public final void e(a aVar) {
        this.f55969d = aVar;
    }

    public final void f() {
        byte[] bArr = okhttp3.internal.b.f55955a;
        e eVar = this.f55966a;
        synchronized (eVar) {
            this.f55968c = true;
            if (g()) {
                eVar.e(this);
            }
        }
    }

    public final boolean g() {
        if (this.f55969d != null) {
            this.f55971f = true;
        }
        List list = this.f55970e;
        int size = list.size() - 1;
        boolean z = false;
        while (size >= 0) {
            a aVar = (a) list.get(size);
            if (e.f55974b.isLoggable(Level.FINE)) {
                com.waze.view.popups.b.b.j(aVar, this, "canceled");
            }
            list.remove(size);
            size--;
            z = true;
        }
        return z;
    }

    public final boolean h() {
        return this.f55971f;
    }

    public final boolean i() {
        return this.f55968c;
    }

    public final boolean j(a aVar, long j2, boolean z) {
        x.f(aVar, "task");
        aVar.e(this);
        long jNanoTime = System.nanoTime();
        long j3 = jNanoTime + j2;
        List list = this.f55970e;
        int iIndexOf = list.indexOf(aVar);
        if (iIndexOf != -1) {
            if (aVar.a() <= j3) {
                if (e.f55974b.isLoggable(Level.FINE)) {
                    com.waze.view.popups.b.b.j(aVar, this, "already scheduled");
                }
                return false;
            }
            list.remove(iIndexOf);
        }
        aVar.f(j3);
        if (e.f55974b.isLoggable(Level.FINE)) {
            long j4 = j3 - jNanoTime;
            com.waze.view.popups.b.b.j(aVar, this, z ? "run again after ".concat(String.valueOf(com.waze.view.popups.b.b.i(j4))) : "scheduled after ".concat(String.valueOf(com.waze.view.popups.b.b.i(j4))));
        }
        Iterator it = list.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((a) it.next()).a() - jNanoTime > j2) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = list.size();
        }
        list.add(size, aVar);
        return size == 0;
    }

    public final void k() {
        this.f55971f = false;
    }

    public final void l(a aVar) {
        x.f(aVar, "task");
        e eVar = this.f55966a;
        synchronized (eVar) {
            if (this.f55968c) {
                if (e.f55974b.isLoggable(Level.FINE)) {
                    com.waze.view.popups.b.b.j(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else if (j(aVar, 0L, false)) {
                eVar.e(this);
            }
        }
    }

    public final String toString() {
        return this.f55967b;
    }
}
