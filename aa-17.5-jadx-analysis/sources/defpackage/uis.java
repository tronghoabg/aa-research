package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class uis extends ukh {
    public final ArrayList a;
    public final yfq b;

    public uis(List list, boolean z) {
        this.a = new ArrayList(list.size());
        this.b = z ? yfq.o(list) : null;
    }

    public final int a(ukf ukfVar) {
        int size;
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            size = arrayList.size();
            arrayList.add(ukfVar);
        }
        return size;
    }

    @Override // defpackage.ukh
    public final ukf b(int i) {
        return d;
    }

    @Override // defpackage.ukh
    public final ukf c(long j) {
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            if (j >= 0) {
                if (j < arrayList.size()) {
                    return (ukf) arrayList.get((int) j);
                }
            }
            return d;
        }
    }

    @Override // defpackage.ukh
    public final ukf d(int i, aekf aekfVar, ukj ukjVar) {
        return d;
    }

    @Override // defpackage.ukh
    public final List e() {
        int i = yfq.d;
        return yls.a;
    }

    @Override // defpackage.ukh
    public final byte[] f() {
        return new byte[0];
    }

    @Override // defpackage.ukh
    public final byte[] g() {
        return e;
    }

    @Override // defpackage.ukh
    public final void h() {
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            arrayList.size();
        }
    }

    @Override // defpackage.ukh
    public final ukf i() {
        return d;
    }

    public uis(ArrayList arrayList, yfq yfqVar) {
        this.a = new ArrayList(arrayList);
        this.b = yfqVar;
    }

    public uis() {
        this.a = new ArrayList();
        this.b = null;
    }
}
