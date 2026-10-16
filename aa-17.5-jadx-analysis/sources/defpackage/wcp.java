package defpackage;

import android.util.SparseIntArray;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class wcp {
    public Object a;
    public final Object b;

    public wcp(sjw sjwVar) {
        this.b = new SparseIntArray();
        if (sjwVar == null) {
            throw new NullPointerException("null reference");
        }
        this.a = sjwVar;
    }

    public static wcp c(eqj eqjVar) {
        wcp wcpVar = new wcp((byte[]) null);
        wcpVar.b(eqjVar);
        return wcpVar;
    }

    public final synchronized void a(wae waeVar) {
        if (this.a == null) {
            this.a = tmz.c(waeVar.c, new upk(this, 16), waeVar.b());
        }
    }

    public final void b(eqj eqjVar) {
        Object obj = this.a;
        if (eqjVar == obj) {
            return;
        }
        if (obj != null) {
            ((eql) this.b).s((eqj) obj);
        }
        this.a = eqjVar;
        Object obj2 = this.b;
        ((eql) obj2).r(eqjVar, new kkl(obj2, 8));
    }

    public final void d() {
        Object obj = this.b;
        synchronized (obj) {
            ((SparseIntArray) obj).clear();
        }
    }

    public final int e(int i) {
        int i2;
        Object obj = this.b;
        synchronized (obj) {
            i2 = ((SparseIntArray) obj).get(i, -1);
        }
        return i2;
    }

    public wcp(byte[] bArr) {
        this.b = new eql();
    }

    public wcp() {
        this.a = null;
        this.b = new ConcurrentHashMap();
    }
}
