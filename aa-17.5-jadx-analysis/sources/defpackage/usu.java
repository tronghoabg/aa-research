package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class usu implements uth {
    private static final uwt r = new uwt(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final usx i;
    public final boolean j;
    public final boolean k;
    public ArrayList m;
    public ArrayList n;
    uud a = null;
    public boolean l = false;
    public ArrayList o = new ArrayList();
    public ArrayList p = new ArrayList();
    public aeiy q = new aeiy();

    public usu(int i, int i2, int i3, float f, ArrayList arrayList, ArrayList arrayList2, usx usxVar, boolean z, boolean z2, uvm uvmVar) {
        int i4;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.h = f;
        this.e = 1073741824 >> i3;
        this.f = (i * r5) - 536870912;
        this.g = -((r5 * (i2 + 1)) - 536870912);
        this.i = usxVar;
        this.j = z;
        this.k = z2;
        this.m = arrayList;
        this.n = arrayList2;
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i4 = true != z2 ? 3 : 4;
            if (i5 >= size) {
                break;
            }
            i6 += ((aeiy) arrayList.get(i5)).b / i4;
            i5++;
        }
        int size2 = arrayList2.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size2; i8++) {
            i7 += ((aeye) arrayList2.get(i8)).b;
        }
        uvmVar.c++;
        uvmVar.a += (i6 * i4 * 4) + i7 + i7;
    }

    @Override // defpackage.uth
    public final void A(boolean z) {
        this.l = z;
    }

    @Override // defpackage.uth
    public final boolean B() {
        return true;
    }

    @Override // defpackage.uth
    public final boolean C() {
        return this.a != null;
    }

    @Override // defpackage.uth
    public final ute E() {
        return ute.a;
    }

    @Override // defpackage.uth
    public final uvp F() {
        return uvp.k;
    }

    @Override // defpackage.uth
    public final uwt G() {
        return r;
    }

    @Override // defpackage.uth
    public final void b(long j) {
        usx usxVar = this.i;
        if (!usxVar.j) {
            usxVar.l = 1.0f;
            return;
        }
        float f = (j - usxVar.k) / 500.0f;
        usxVar.l = f;
        if (f > 1.0f) {
            usxVar.l = 1.0f;
        }
    }

    @Override // defpackage.uth
    public final uwm d(int i) {
        throw null;
    }

    @Override // defpackage.uth
    public final void e(boolean z) {
        if (C()) {
            uud uudVar = this.a;
            uudVar.getClass();
            if (!z) {
                ArrayList arrayList = this.o;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    uudVar.h((uue) arrayList.get(i));
                }
                ArrayList arrayList2 = this.p;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    uudVar.h((uue) arrayList2.get(i2));
                }
            }
            this.o.clear();
            this.p.clear();
        }
    }

    @Override // defpackage.uth
    public final int i() {
        return this.d;
    }

    @Override // defpackage.uth
    public final utf j() {
        return uul.a;
    }

    @Override // defpackage.uth
    public final boolean o() {
        return true;
    }

    @Override // defpackage.uth
    public final umi p() {
        return null;
    }

    @Override // defpackage.uth
    public final void y(uud uudVar) {
        if (C()) {
            return;
        }
        ArrayList arrayList = this.m;
        ArrayList arrayList2 = this.n;
        if (arrayList == null || arrayList2 == null) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            aeiy aeiyVar = (aeiy) arrayList.get(i);
            aeye aeyeVar = (aeye) arrayList2.get(i);
            if (!aeiyVar.isEmpty()) {
                this.a = uudVar;
                uue uueVarQ = uudVar.Q();
                this.a.g(uueVarQ);
                this.a.M(aeiyVar.a, aeiyVar.b);
                uue uueVarO = this.a.O();
                this.a.e(uueVarO);
                this.a.G(aeyeVar.a, aeyeVar.b, 35044);
                this.o.add(uueVarQ);
                this.p.add(uueVarO);
                this.q.c(aeyeVar.b);
            }
        }
        this.m = null;
        this.n = null;
    }

    @Override // defpackage.uth
    public final void h() {
    }

    @Override // defpackage.uth
    public final void H(uth uthVar, uth uthVar2, usy usyVar) {
    }
}
