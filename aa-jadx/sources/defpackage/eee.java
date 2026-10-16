package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eee {
    public final java.util.ArrayList a = new java.util.ArrayList();
    public final defpackage.eej b;
    public int c;
    public boolean d;

    public eee(defpackage.eej eejVar, java.util.List list) {
        e(list, false);
        e(list, true);
        if (!eejVar.b.contains(this)) {
            eejVar.b.add(this);
            defpackage.dvl dvlVar = eejVar.c;
            defpackage.dvl dvlVar2 = eejVar.d;
            b();
            int i = eejVar.e;
            c();
        }
        this.b = eejVar;
    }

    private final void e(java.util.List list, boolean z) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            defpackage.eed eedVar = (defpackage.eed) list.get(i);
            if (eedVar.a() == z) {
                java.lang.Object obj = eedVar.b;
                if (obj != null) {
                    throw new java.lang.IllegalStateException(eedVar + " (" + i2 + "/" + size + ") is already controlled by " + obj + " but is still added to " + this);
                }
                eedVar.b = this;
                this.a.add(eedVar);
            }
            i = i2;
        }
    }

    public final int a() {
        return this.a.size();
    }

    public final void b() {
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        throw null;
    }

    public final void c() {
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((defpackage.eed) arrayList.get(size)).b();
            }
        }
    }

    public final void d() {
    }
}
