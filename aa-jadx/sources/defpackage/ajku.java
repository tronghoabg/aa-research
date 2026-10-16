package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajku {
    public int a;
    public final java.lang.Object b;

    public ajku(androidx.car.app.model.ActionStrip actionStrip) {
        this.a = -1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.car.app.model.Action> it = actionStrip.getActions().iterator();
        while (it.hasNext()) {
            arrayList.add(new defpackage.hio(it.next(), null));
        }
        this.b = arrayList;
    }

    public static int l(android.content.Context context) {
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
    public final defpackage.ajji a() {
        if (!b()) {
            throw new java.util.NoSuchElementException();
        }
        ?? r0 = this.b;
        int i = this.a;
        this.a = i + 1;
        return (defpackage.ajji) r0.get(i);
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
        return ((java.util.LinkedList) this.b).size();
    }

    public final defpackage.qtb h(defpackage.qta qtaVar) {
        for (defpackage.qtb qtbVar : (java.util.LinkedList) this.b) {
            if (j$.util.Objects.equals(qtbVar.a, qtaVar)) {
                return qtbVar;
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
    public final java.lang.Object k(int i) {
        ?? r0 = this.b;
        if (i <= r0.size()) {
            return r0.get(j(i));
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    public final void m() {
        this.a++;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized defpackage.fsq n(coil.memory.MemoryCache$Key memoryCache$Key) {
        java.util.ArrayList arrayList = (java.util.ArrayList) ((java.util.LinkedHashMap) this.b).get(memoryCache$Key);
        defpackage.fsq fsqVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.hrs hrsVar = (defpackage.hrs) arrayList.get(i);
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((java.lang.ref.WeakReference) hrsVar.d).get();
            defpackage.fsq fsqVar2 = bitmap != null ? new defpackage.fsq(bitmap, hrsVar.c) : null;
            if (fsqVar2 != null) {
                fsqVar = fsqVar2;
                break;
            }
        }
        s();
        return fsqVar;
    }

    public final void o() {
        this.a = 0;
        java.util.Iterator it = ((java.util.LinkedHashMap) this.b).values().iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            next.getClass();
            java.util.ArrayList arrayList = (java.util.ArrayList) next;
            if (arrayList.size() <= 1) {
                defpackage.hrs hrsVar = (defpackage.hrs) defpackage.afga.aB(arrayList);
                if ((hrsVar != null ? (android.graphics.Bitmap) ((java.lang.ref.WeakReference) hrsVar.d).get() : null) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((java.lang.ref.WeakReference) ((defpackage.hrs) arrayList.get(i3)).d).get() == null) {
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
    public final synchronized void p(coil.memory.MemoryCache$Key memoryCache$Key, android.graphics.Bitmap bitmap, java.util.Map map, int i) {
        ?? r0 = this.b;
        java.lang.Object arrayList = r0.get(memoryCache$Key);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            r0.put(memoryCache$Key, arrayList);
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) arrayList;
        int iIdentityHashCode = java.lang.System.identityHashCode(bitmap);
        defpackage.hrs hrsVar = new defpackage.hrs(iIdentityHashCode, new java.lang.ref.WeakReference(bitmap), map, i);
        int size = arrayList2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                arrayList2.add(hrsVar);
                break;
            }
            java.lang.Object obj = arrayList2.get(i2);
            obj.getClass();
            defpackage.hrs hrsVar2 = (defpackage.hrs) obj;
            if (i >= hrsVar2.a) {
                if (hrsVar2.b != iIdentityHashCode || ((java.lang.ref.WeakReference) hrsVar2.d).get() != bitmap) {
                    arrayList2.add(i2, hrsVar);
                    break;
                } else {
                    arrayList2.set(i2, hrsVar);
                    break;
                }
            }
            i2++;
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
    public final defpackage.acku r() {
        int i = this.a;
        if (i < 0 || i >= this.b.size()) {
            this.a = -1;
        }
        return new defpackage.acku(this.b, this.a);
    }

    public ajku(java.util.List list) {
        this.b = list;
    }

    public ajku(java.util.List list, byte[] bArr) {
        this.b = list;
        this.a = 0;
    }

    public ajku(java.util.List list, byte[] bArr, byte[] bArr2) {
        this.a = -1;
        this.b = list;
    }

    public ajku(int i, java.lang.Runnable runnable) {
        defpackage.ysr.aX(i > 0);
        this.a = i;
        this.b = runnable;
    }

    public ajku(android.content.Context context) {
        this.b = context;
        this.a = l(context);
    }

    public ajku(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new java.util.LinkedHashMap();
    }

    public ajku(int i) {
        this.b = new java.util.LinkedList();
        this.a = i;
    }

    public ajku(byte[] bArr) {
        this.b = new java.util.concurrent.locks.ReentrantLock();
    }

    public ajku(byte[] bArr, byte[] bArr2) {
        this.b = new java.util.LinkedHashMap();
    }

    public ajku() {
        this.b = new int[10];
    }
}
