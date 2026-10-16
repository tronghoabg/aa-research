package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class hqt implements Comparable {
    public final hre a;
    public final int b;
    public final String c;
    public final int d;
    public final Object e;
    public hqx f;
    public Integer g;
    public hqw h;
    public boolean i;
    public boolean j;
    public hqh k;
    public hqk l;
    public kzt m;
    private boolean n;

    public hqt(int i, String str, hqx hqxVar) {
        Uri uri;
        String host;
        this.a = hre.a ? new hre() : null;
        this.e = new Object();
        this.i = true;
        int iHashCode = 0;
        this.n = false;
        this.j = false;
        this.k = null;
        this.b = i;
        this.c = str;
        this.f = hqxVar;
        this.l = new hqk(2500, 1, 1.0f);
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.d = iHashCode;
    }

    public final int a() {
        return this.l.a;
    }

    public String b() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public final String c() {
        int i = this.b;
        String str = this.c;
        if (i == 0) {
            return str;
        }
        return Integer.toString(1) + "-" + str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        hqt hqtVar = (hqt) obj;
        int iM = hqtVar.m();
        int iM2 = m();
        return iM2 == iM ? this.g.intValue() - hqtVar.g.intValue() : (iM - 1) - (iM2 - 1);
    }

    public Map d() throws hqg {
        return Collections.EMPTY_MAP;
    }

    public final void e(String str) {
        if (hre.a) {
            this.a.a(str, Thread.currentThread().getId());
        }
    }

    public void f() {
        synchronized (this.e) {
            this.n = true;
            this.f = null;
        }
    }

    protected abstract void g(Object obj);

    final void h(String str) {
        hqw hqwVar = this.h;
        if (hqwVar != null) {
            Set set = hqwVar.b;
            synchronized (set) {
                set.remove(this);
            }
            List list = hqwVar.h;
            synchronized (list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((hqv) it.next()).a();
                }
            }
            hqwVar.b();
        }
        if (hre.a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new jor(this, str, id, 1));
                return;
            }
            hre hreVar = this.a;
            hreVar.a(str, id);
            hreVar.b(toString());
        }
    }

    public final void i() {
        synchronized (this.e) {
            this.j = true;
        }
    }

    final void j() {
        kzt kztVar;
        synchronized (this.e) {
            kztVar = this.m;
        }
        if (kztVar != null) {
            kztVar.i(this);
        }
    }

    public final boolean k() {
        boolean z;
        synchronized (this.e) {
            z = this.n;
        }
        return z;
    }

    public byte[] l() throws hqg {
        return null;
    }

    public int m() {
        return 2;
    }

    final void n() {
        hqw hqwVar = this.h;
        if (hqwVar != null) {
            hqwVar.b();
        }
    }

    protected abstract scz o(hqq hqqVar);

    public final void p(kzt kztVar) {
        synchronized (this.e) {
            this.m = kztVar;
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.d));
        String str = true != k() ? "[ ] " : "[X] ";
        String str2 = m() != 1 ? "NORMAL" : "LOW";
        return str + this.c + " " + "0x".concat(strValueOf) + " " + str2 + " " + this.g;
    }
}
