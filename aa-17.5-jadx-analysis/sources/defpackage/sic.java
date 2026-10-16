package defpackage;

import android.util.Log;
import java.util.LinkedHashSet;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public class sic {
    public final String a;
    public final Object b;
    aat c;
    public int d;
    public int e;
    final /* synthetic */ sio f;

    protected sic(sio sioVar, String str) {
        this.f = sioVar;
        this.b = new Object();
        this.c = new aat(0);
        this.e = 50;
        Object[] objArr = {str};
        if (sioVar.i.containsKey(str)) {
            throw new IllegalStateException(String.format("counter/histogram already exists: %s", objArr));
        }
        this.a = str;
    }

    public final void a(final long j, sij sijVar) {
        if (sijVar == null) {
            sijVar = sio.b;
        }
        xwx xwxVar = new xwx() { // from class: sib
            @Override // defpackage.xwx
            public final Object a(Object obj) {
                long j2 = j;
                sij sijVar2 = (sij) obj;
                sic sicVar = this.a;
                synchronized (sicVar.b) {
                    zs zsVar = (zs) sicVar.c.get(sijVar2);
                    if (zsVar == null) {
                        zsVar = new zs(10);
                        sicVar.c.put(sijVar2, zsVar);
                    }
                    int i = sicVar.d;
                    boolean z = false;
                    if (i >= 50 && !sicVar.f.e) {
                        if (i == 50 && Log.isLoggable("Counters", 3)) {
                            Log.d("Counters", "exceeded sample count in " + sicVar.a);
                        }
                        return false;
                    }
                    sicVar.d = i + 1;
                    long[] jArr = (long[]) zsVar.d(j2);
                    if (jArr == null) {
                        zsVar.g(j2, new long[]{1});
                    } else {
                        jArr[0] = jArr[0] + 1;
                    }
                    if (sicVar.f.e && sicVar.d >= sicVar.e) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }
        };
        spu.aw(sijVar);
        if (sio.c.equals(sijVar)) {
            sijVar = this.f.j;
        }
        sio sioVar = this.f;
        ReentrantReadWriteLock reentrantReadWriteLock = sioVar.d;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            LinkedHashSet linkedHashSet = sioVar.k;
            if (!linkedHashSet.contains(sijVar)) {
                lock.unlock();
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                lock.lock();
                try {
                    linkedHashSet.add(sijVar);
                    writeLock.unlock();
                } catch (Throwable th) {
                    writeLock.unlock();
                    throw th;
                }
            }
            boolean zBooleanValue = ((Boolean) xwxVar.a(sijVar)).booleanValue();
            Future future = this.f.g;
            if (zBooleanValue) {
                this.f.e();
            }
            int i = this.f.f;
        } finally {
            lock.unlock();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbstractCounter(");
        sb.append(this.a);
        sb.append(")[");
        synchronized (this.b) {
            int i = 0;
            while (true) {
                aat aatVar = this.c;
                if (i < aatVar.d) {
                    zs zsVar = (zs) aatVar.g(i);
                    sb.append(this.c.d(i));
                    sb.append(" -> [");
                    for (int i2 = 0; i2 < zsVar.b(); i2++) {
                        sb.append(zsVar.c(i2));
                        sb.append(" = ");
                        sb.append(((long[]) zsVar.e(i2))[0]);
                        sb.append(", ");
                    }
                    sb.append("], ");
                    i++;
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected sic(sio sioVar, sic sicVar) {
        this(sioVar, sicVar.a);
        synchronized (sicVar.b) {
            this.d = sicVar.d;
            aat aatVar = this.c;
            this.c = sicVar.c;
            sicVar.c = aatVar;
            sicVar.d = 0;
        }
    }
}
