package defpackage;

import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class qrx {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public qrx() {
        this.f = new htm((char[]) null, (short[]) null);
        this.d = new htm((char[]) null, (short[]) null);
        this.e = new htm((char[]) null, (short[]) null);
        this.b = new htm((char[]) null, (short[]) null);
        this.a = new htm((char[]) null, (short[]) null);
        new htm((char[]) null, (short[]) null);
        new htm((char[]) null, (short[]) null);
        new ConcurrentLinkedDeque();
        DesugarCollections.synchronizedSortedSet(new TreeSet(tuj.a));
        this.c = new htm((char[]) null, (short[]) null);
    }

    public final void a() {
        if (((AtomicBoolean) this.e).compareAndSet(true, false)) {
            ((psj) this.b).e(this.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            tzv tzvVar = ((tzw) it.next()).b;
            if (tzvVar != null) {
                ((roa) this.e).c(tzvVar.b, tzvVar);
                int i = 0;
                while (true) {
                    yfq yfqVar = tzvVar.c;
                    if (i < ((yls) yfqVar).c) {
                        tzx tzxVar = (tzx) yfqVar.get(i);
                        ((roa) this.b).c(tzxVar.a(), tzxVar);
                        i++;
                    }
                }
            }
        }
    }

    public final void c(tob tobVar, tzf tzfVar) {
        ((roa) this.e).b(tobVar, tzfVar);
    }

    public final void d(tud tudVar, Executor executor) {
        ((htm) this.c).z(tudVar, executor);
    }

    public final void e(tud tudVar) {
        vag vagVar;
        Object obj = this.c;
        synchronized (obj) {
            vagVar = (vag) ((HashMap) ((htm) obj).a).remove(tudVar);
        }
        if (vagVar != null) {
            vagVar.a = true;
        }
    }

    public final void f() {
        ((htm) this.f).A(new rcn(12));
    }

    public qrx(qwq qwqVar, qwu qwuVar, Looper looper) throws RemoteException {
        qwr qwrVar = new qwr(this, 0);
        this.d = qwrVar;
        qww qwwVar = new qww(this);
        this.e = qwwVar;
        kej kejVar = new kej(2);
        this.c = kejVar;
        this.b = new sss(looper, kejVar);
        this.f = qwqVar;
        this.a = qwuVar;
        qwuVar.h(qwwVar);
        if (qwqVar != null) {
            qwq qwqVar2 = qwqVar;
            Parcel parcelGh = qwqVar2.gh();
            ijp.i(parcelGh, qwrVar);
            Parcel parcelGi = qwqVar2.gi(5, parcelGh);
            ijp.j(parcelGi);
            parcelGi.recycle();
        }
    }

    public qrx(psj psjVar, Executor executor, ackk ackkVar, Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        this.b = psjVar;
        this.a = executor;
        this.f = ackkVar;
        this.d = optional3;
        ackkVar.a();
        this.c = new qsb(ackkVar, optional, optional2, optional4);
        this.e = new AtomicBoolean(false);
    }

    public qrx(pkx pkxVar, Executor executor, uod uodVar) {
        this.d = executor;
        this.a = uodVar;
        this.c = new tzu(50, pkz.INDOOR_METADATA, pkxVar);
        this.e = new roa(new tzu(1024, pkz.INDOOR_BUILDING, pkxVar));
        this.b = new roa(new tzu(1024, pkz.INDOOR_LEVEL, pkxVar));
        this.f = new HashMap();
    }
}
