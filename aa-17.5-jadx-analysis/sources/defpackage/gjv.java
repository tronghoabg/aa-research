package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class gjv {
    public final Object a;

    public gjv(kzt kztVar) {
        String str = fmp.a;
        List listBk = woy.bk(new fmr((fnc) kztVar.b), new fms((fmx) kztVar.c), new fmu((fnc) kztVar.d));
        Object systemService = ((Context) kztVar.a).getSystemService("connectivity");
        systemService.getClass();
        listBk.add(new fmk((ConnectivityManager) systemService));
        this.a = listBk;
    }

    public static final fsu d(fsy fsyVar, Throwable th) {
        fsyVar.getClass();
        if (th instanceof ftb) {
            fss fssVar = ftu.a;
        } else {
            fss fssVar2 = ftu.a;
        }
        return new fsu(fsyVar, th);
    }

    public static final boolean e(fsy fsyVar, Bitmap.Config config) {
        config.getClass();
        return !a.bi(config) || fsyVar.k;
    }

    public static final boolean f(fsg fsgVar) {
        Object obj = fsgVar.b.get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.lang.Runnable] */
    public final void a(int i) {
        int i2;
        ArrayList arrayList = new ArrayList(((WeakHashMap) this.a).values());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            ArrayList arrayList2 = new ArrayList((List) arrayList.get(i3));
            int size2 = arrayList2.size();
            int i4 = 0;
            while (true) {
                i2 = i3 + 1;
                if (i4 < size2) {
                    acjs acjsVar = (acjs) arrayList2.get(i4);
                    if (acjsVar.a == i) {
                        acjsVar.b.run();
                    }
                    i4++;
                }
            }
            i3 = i2;
        }
    }

    public final void b(Object obj, int i, Runnable runnable) {
        WeakHashMap weakHashMap = (WeakHashMap) this.a;
        List arrayList = (List) weakHashMap.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
            weakHashMap.put(obj, arrayList);
        }
        arrayList.add(new acjs(i, runnable));
    }

    public final void c(Object obj, int i) {
        List list = (List) ((WeakHashMap) this.a).get(obj);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((acjs) it.next()).a == i) {
                    it.remove();
                }
            }
        }
    }

    public final ajnr g() {
        return ((nbu) this.a).f(0);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable, java.lang.Object] */
    public final aiyk h(fod fodVar) {
        fodVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((fmt) obj).b(fodVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(woy.bp(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((fmt) it.next()).a(fodVar.j));
        }
        return aiyr.a(new fmn((aiyk[]) woy.cf(arrayList2).toArray(new aiyk[0]), 0));
    }

    public final void i(Runnable runnable) {
        ((Handler) this.a).removeCallbacks(runnable);
    }

    public final void j(long j, Runnable runnable) {
        ((Handler) this.a).postDelayed(runnable, j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ackk, java.lang.Object] */
    public final synchronized void k(Runnable runnable) {
        ((uvg) this.a.a()).h(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ackk, java.lang.Object] */
    public final void l() {
        ((uvg) this.a.a()).k();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ackk, java.lang.Object] */
    public final void m(Runnable runnable) {
        ((uvg) this.a.a()).l(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ackk, java.lang.Object] */
    public final synchronized void n(Runnable runnable) {
        ((uvg) this.a.a()).n(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ackk, java.lang.Object] */
    public final synchronized void o(Runnable runnable) {
        ((uvg) this.a.a()).p(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ackk, java.lang.Object] */
    public final synchronized void p() {
        ((uvg) this.a.a()).o();
    }

    public final zgt q() {
        zgt zgtVar = (zgt) ((AtomicReference) this.a).getAndSet(null);
        zgtVar.getClass();
        return zgtVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xyc] */
    public final boolean r() {
        return ((Boolean) this.a.gu()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, tpd] */
    public final tox s(abgl abglVar) {
        return new tox(this.a.u(abglVar), abglVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, tpd] */
    public final tox t(abgl abglVar, String str) {
        String strU = this.a.u(abglVar);
        return new tox(!str.isEmpty() ? a.bJ(str, strU, ".") : strU, strU, abglVar, false);
    }

    public final Duration u() {
        return ((xya) this.a).c();
    }

    public final Object v() {
        return ((gjt) this.a).e();
    }

    public final void w(Object obj) {
        ((gjt) this.a).f(obj);
    }

    public final /* synthetic */ void x(int i) {
        z(i, new int[0]);
    }

    public final /* synthetic */ void y(int i, int i2) {
        z(i, i2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    public final void z(int i, int... iArr) {
        this.a.add(new aezu(Integer.valueOf(i), iArr));
    }

    public gjv(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public gjv(Object obj, char[] cArr) {
        this.a = obj;
    }

    public gjv(fte fteVar) {
        this.a = woy.be(fteVar.b);
    }

    public gjv(fvp fvpVar) {
        fvpVar.getClass();
        this.a = fvpVar;
    }

    public gjv(xyi xyiVar) {
        this.a = xya.b(xyiVar);
    }

    public gjv(char[] cArr) {
        this.a = Handler.createAsync(Looper.getMainLooper());
    }

    public gjv() {
        this.a = new HashMap();
    }

    public gjv(ftz ftzVar) {
        ftzVar.getClass();
        this.a = ftzVar;
    }

    public gjv(tpd tpdVar) {
        tpdVar.getClass();
        this.a = tpdVar;
    }

    public gjv(fny fnyVar) {
        fnyVar.getClass();
        this.a = fnyVar;
    }

    public gjv(plq plqVar, Executor executor) {
        this.a = plqVar;
        plqVar.a().e(new tsi(1), executor);
    }

    public gjv(byte[] bArr) {
        this.a = new WeakHashMap();
    }

    public gjv(byte[] bArr, byte[] bArr2) {
        this.a = new ArrayList();
    }

    public gjv(Object obj) {
        this.a = new gjt(obj, new tic(7), new tic(8));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, uzy] */
    public gjv(kex kexVar, Executor executor) {
        this.a = kexVar;
        kexVar.a.e(new tsi(0), executor);
    }

    public gjv(sm smVar, aezk aezkVar) {
        this.a = wub.L(new qfe(aezkVar, 8));
        wub.L(new plm(smVar, aezkVar, 7));
        wub.L(new tnp(3));
    }

    public gjv(zgt zgtVar) {
        this.a = new AtomicReference(zgtVar);
    }

    public gjv(typ typVar) {
        tyn tynVar = new tyn();
        this.a = tynVar;
        typVar.d(tynVar);
        tynVar.b(new txo(this, typVar, 3, null));
    }

    public gjv(short[] sArr) {
        this.a = new aevt(16);
    }
}
