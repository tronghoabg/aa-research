package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ujn extends defpackage.ulc {
    public final java.util.ArrayList a;
    public final defpackage.ygw b;

    public ujn(java.util.List list, boolean z) {
        this.a = new java.util.ArrayList(list.size());
        this.b = z ? defpackage.ygw.o(list) : null;
    }

    public final int a(defpackage.ula ulaVar) {
        int size;
        java.util.ArrayList arrayList = this.a;
        synchronized (arrayList) {
            size = arrayList.size();
            arrayList.add(ulaVar);
        }
        return size;
    }

    @Override // defpackage.ulc
    public final defpackage.ula b(int i) {
        return d;
    }

    @Override // defpackage.ulc
    public final defpackage.ula c(long j) {
        java.util.ArrayList arrayList = this.a;
        synchronized (arrayList) {
            if (j >= 0) {
                if (j < arrayList.size()) {
                    return (defpackage.ula) arrayList.get((int) j);
                }
            }
            return d;
        }
    }

    @Override // defpackage.ulc
    public final defpackage.ula d(int i, defpackage.aelf aelfVar, defpackage.ule uleVar) {
        return d;
    }

    @Override // defpackage.ulc
    public final java.util.List e() {
        int i = defpackage.ygw.d;
        return defpackage.ymx.a;
    }

    @Override // defpackage.ulc
    public final byte[] f() {
        return new byte[0];
    }

    @Override // defpackage.ulc
    public final byte[] g() {
        return e;
    }

    @Override // defpackage.ulc
    public final void h() {
        java.util.ArrayList arrayList = this.a;
        synchronized (arrayList) {
            arrayList.size();
        }
    }

    @Override // defpackage.ulc
    public final defpackage.ula i() {
        return d;
    }

    public ujn(java.util.ArrayList arrayList, defpackage.ygw ygwVar) {
        this.a = new java.util.ArrayList(arrayList);
        this.b = ygwVar;
    }

    public ujn() {
        this.a = new java.util.ArrayList();
        this.b = null;
    }
}
