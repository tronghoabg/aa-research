package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import coil.memory.MemoryCache$Key;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class ajju {
    public int a;
    public final Object b;

    public ajju(ActionStrip actionStrip) {
        this.a = -1;
        ArrayList arrayList = new ArrayList();
        Iterator<Action> it = actionStrip.getActions().iterator();
        while (it.hasNext()) {
            arrayList.add(new hig(it.next(), null));
        }
        this.b = arrayList;
    }

    public static int l(Context context) {
        return context.getResources().getConfiguration().uiMode & 48;
    }

    private final void s() {
        int i = this.a;
        this.a = i + 1;
        if (i >= 10) {
            o();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final ajii a() {
        if (!b()) {
            throw new NoSuchElementException();
        }
        ?? r0 = this.b;
        int i = this.a;
        this.a = i + 1;
        return (ajii) r0.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final boolean b() {
        return this.a < this.b.size();
    }

    public final int c(int i) {
        return ((int[]) this.b)[i];
    }

    public final int d() {
        if ((this.a & 2) != 0) {
            return ((int[]) this.b)[1];
        }
        return -1;
    }

    public final boolean e(int i) {
        return (this.a & (1 << i)) != 0;
    }

    public final void f(int i, int i2) {
        if (i >= 10) {
            return;
        }
        this.a = (1 << i) | this.a;
        ((int[]) this.b)[i] = i2;
    }

    public final int g() {
        return ((LinkedList) this.b).size();
    }

    public final qsh h(qsg qsgVar) {
        Iterator it = ((LinkedList) this.b).iterator();
        while (it.hasNext()) {
            qsh qshVar = (qsh) it.next();
            if (Objects.equals(qshVar.a, qsgVar)) {
                return qshVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void i() {
        synchronized (this) {
            int i = this.a;
            if (i <= 0) {
                return;
            }
            int i2 = i - 1;
            this.a = i2;
            if (i2 == 0) {
                this.b.run();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final int j(int i) {
        return (i + this.a) % this.b.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final Object k(int i) {
        ?? r0 = this.b;
        if (i <= r0.size()) {
            return r0.get(j(i));
        }
        throw new IndexOutOfBoundsException();
    }

    public final void m() {
        this.a++;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized fsg n(MemoryCache$Key memoryCache$Key) {
        ArrayList arrayList = (ArrayList) ((LinkedHashMap) this.b).get(memoryCache$Key);
        fsg fsgVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            hrj hrjVar = (hrj) arrayList.get(i);
            Bitmap bitmap = (Bitmap) ((WeakReference) hrjVar.d).get();
            fsg fsgVar2 = bitmap != null ? new fsg(bitmap, hrjVar.c) : null;
            if (fsgVar2 != null) {
                fsgVar = fsgVar2;
                break;
            }
            i++;
        }
        s();
        return fsgVar;
    }

    public final void o() {
        this.a = 0;
        Iterator it = ((LinkedHashMap) this.b).values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            ArrayList arrayList = (ArrayList) next;
            if (arrayList.size() <= 1) {
                hrj hrjVar = (hrj) woy.bH(arrayList);
                if ((hrjVar != null ? (Bitmap) ((WeakReference) hrjVar.d).get() : null) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((WeakReference) ((hrj) arrayList.get(i3)).d).get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void p(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map, int i) {
        ?? r0 = this.b;
        Object arrayList = r0.get(memoryCache$Key);
        if (arrayList == null) {
            arrayList = new ArrayList();
            r0.put(memoryCache$Key, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        int iIdentityHashCode = System.identityHashCode(bitmap);
        hrj hrjVar = new hrj(iIdentityHashCode, new WeakReference(bitmap), map, i);
        int size = arrayList2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                arrayList2.add(hrjVar);
                break;
            }
            Object obj = arrayList2.get(i2);
            obj.getClass();
            hrj hrjVar2 = (hrj) obj;
            if (i < hrjVar2.a) {
                i2++;
            } else if (hrjVar2.b == iIdentityHashCode && ((WeakReference) hrjVar2.d).get() == bitmap) {
                arrayList2.set(i2, hrjVar);
            } else {
                arrayList2.add(i2, hrjVar);
            }
        }
        s();
    }

    public final synchronized void q(int i) {
        if (i < 10 || i == 20) {
            return;
        }
        o();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final acjs r() {
        int i = this.a;
        if (i < 0 || i >= this.b.size()) {
            this.a = -1;
        }
        return new acjs(this.b, this.a);
    }

    public ajju(List list) {
        this.b = list;
    }

    public ajju(List list, byte[] bArr) {
        this.b = list;
        this.a = 0;
    }

    public ajju(List list, byte[] bArr, byte[] bArr2) {
        this.a = -1;
        this.b = list;
    }

    public ajju(int i, Runnable runnable) {
        woy.N(i > 0);
        this.a = i;
        this.b = runnable;
    }

    public ajju(Context context) {
        this.b = context;
        this.a = l(context);
    }

    public ajju(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new LinkedHashMap();
    }

    public ajju(int i) {
        this.b = new LinkedList();
        this.a = i;
    }

    public ajju(byte[] bArr) {
        this.b = new ReentrantLock();
    }

    public ajju(byte[] bArr, byte[] bArr2) {
        this.b = new LinkedHashMap();
    }

    public ajju() {
        this.b = new int[10];
    }
}
