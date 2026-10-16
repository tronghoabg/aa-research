package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class ajiw {
    public final ajix a;
    public final String b;
    public boolean c;
    public ajiu d;
    public final List e = new ArrayList();
    public boolean f;

    public ajiw(ajix ajixVar, String str) {
        this.a = ajixVar;
        this.b = str;
    }

    public final void a() {
        TimeZone timeZone = ajis.a;
        ajix ajixVar = this.a;
        synchronized (ajixVar) {
            if (c()) {
                ajixVar.d(this);
            }
        }
    }

    public final void b() {
        TimeZone timeZone = ajis.a;
        ajix ajixVar = this.a;
        synchronized (ajixVar) {
            this.c = true;
            if (c()) {
                ajixVar.d(this);
            }
        }
    }

    public final boolean c() {
        if (this.d != null) {
            this.f = true;
        }
        List list = this.e;
        int size = list.size() - 1;
        boolean z = false;
        while (size >= 0) {
            ajix ajixVar = this.a;
            ajiu ajiuVar = (ajiu) list.get(size);
            Logger logger = ajixVar.b;
            if (logger.isLoggable(Level.FINE)) {
                ahee.b(logger, ajiuVar, this, "canceled");
            }
            list.remove(size);
            size--;
            z = true;
        }
        return z;
    }

    public final boolean d(ajiu ajiuVar, long j, boolean z) {
        ajiuVar.getClass();
        ajiw ajiwVar = ajiuVar.b;
        if (ajiwVar != this) {
            if (ajiwVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            ajiuVar.b = this;
        }
        ajix ajixVar = this.a;
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        List list = this.e;
        int iIndexOf = list.indexOf(ajiuVar);
        if (iIndexOf != -1) {
            if (ajiuVar.c <= j2) {
                Logger logger = ajixVar.b;
                if (logger.isLoggable(Level.FINE)) {
                    ahee.b(logger, ajiuVar, this, "already scheduled");
                }
                return false;
            }
            list.remove(iIndexOf);
        }
        ajiuVar.c = j2;
        Logger logger2 = ajixVar.b;
        if (logger2.isLoggable(Level.FINE)) {
            long j3 = j2 - jNanoTime;
            ahee.b(logger2, ajiuVar, this, z ? "run again after ".concat(ahee.a(j3)) : "scheduled after ".concat(ahee.a(j3)));
        }
        Iterator it = list.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((ajiu) it.next()).c - jNanoTime > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = list.size();
        }
        list.add(size, ajiuVar);
        return size == 0;
    }

    public final void e(String str, afdr afdrVar) {
        str.getClass();
        afdrVar.getClass();
        f(new ajiv(str, afdrVar));
    }

    public final void f(ajiu ajiuVar) {
        ajiuVar.getClass();
        ajix ajixVar = this.a;
        synchronized (ajixVar) {
            if (this.c) {
                Logger logger = ajixVar.b;
                if (logger.isLoggable(Level.FINE)) {
                    ahee.b(logger, ajiuVar, this, "schedule canceled (queue is shutdown)");
                }
            } else if (d(ajiuVar, 0L, false)) {
                ajixVar.d(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
