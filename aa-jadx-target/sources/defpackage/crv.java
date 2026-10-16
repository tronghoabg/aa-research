package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class crv extends defpackage.cge implements defpackage.cri, defpackage.dlo, defpackage.cza {
    public java.lang.Object a;
    public java.lang.Object b;
    public androidx.compose.ui.input.pointer.PointerInputEventHandler c;
    public defpackage.cqu d = defpackage.crq.a;
    public final defpackage.bzc e;
    public final java.lang.Object f;
    public long g;
    private aiwg h;
    private final defpackage.bzc i;
    private defpackage.cqu j;

    public crv(java.lang.Object obj, java.lang.Object obj2, androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler) {
        this.a = obj;
        this.b = obj2;
        this.c = pointerInputEventHandler;
        defpackage.bzc bzcVar = new defpackage.bzc(new defpackage.cru[16]);
        this.e = bzcVar;
        this.f = bzcVar;
        this.i = new defpackage.bzc(new defpackage.cru[16]);
        this.g = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:6:0x000d, B:13:0x001a, B:14:0x001f, B:15:0x0020, B:18:0x002d, B:19:0x0037, B:21:0x0040), top: B:31:0x000d }] */
    private final void v(defpackage.cqu cquVar, defpackage.cqv cqvVar) {
        java.lang.Object[] objArr;
        int i;
        int i2;
        synchronized (this.f) {
            defpackage.bzc bzcVar = this.i;
            bzcVar.o(bzcVar.b, this.e);
        }
        try {
            int iOrdinal = cqvVar.ordinal();
            if (iOrdinal == 0) {
                defpackage.bzc bzcVar2 = this.i;
                objArr = bzcVar2.a;
                i = bzcVar2.b;
                for (i2 = 0; i2 < i; i2++) {
                    ((defpackage.cru) objArr[i2]).v(cquVar, cqvVar);
                }
            } else if (iOrdinal == 1) {
                defpackage.bzc bzcVar3 = this.i;
                int i3 = bzcVar3.b - 1;
                java.lang.Object[] objArr2 = bzcVar3.a;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        ((defpackage.cru) objArr2[i3]).v(cquVar, cqvVar);
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new defpackage.afas();
                }
                defpackage.bzc bzcVar4 = this.i;
                objArr = bzcVar4.a;
                i = bzcVar4.b;
                while (i2 < i) {
                    ((defpackage.cru) objArr[i2]).v(cquVar, cqvVar);
                }
            }
            this.i.g();
        } catch (java.lang.Throwable th) {
            this.i.g();
            throw th;
        }
    }

    @Override // defpackage.cza
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // defpackage.dlo
    public final float a() {
        return defpackage.cjv.r(this).r.a();
    }

    @Override // defpackage.dlu
    public final float b() {
        return defpackage.cjv.r(this).r.b();
    }

    @Override // defpackage.dlu
    public final /* synthetic */ float dE(long j) {
        return defpackage.dln.n(this, j);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dF(float f) {
        return (f / a()) + 0.0f;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dG(int i) {
        return (i / a()) + 0.0f;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dH(long j) {
        return defpackage.dln.p(this, j);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dI(float f) {
        return f * a();
    }

    @Override // defpackage.dlo
    public final /* synthetic */ int dM(long j) {
        throw null;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ int dN(float f) {
        return defpackage.dln.q(this, f);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dO(long j) {
        return defpackage.dln.r(this, j);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dP(long j) {
        return defpackage.dln.s(this, j);
    }

    @Override // defpackage.dlu
    public final /* synthetic */ long dQ(float f) {
        return defpackage.dln.o(this, f);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dR(float f) {
        return defpackage.dln.o(this, (f / a()) + 0.0f);
    }

    @Override // defpackage.cza
    public final /* synthetic */ long dy() {
        return defpackage.ud.b(0, 0, 0, 0);
    }

    @Override // defpackage.cri
    public final defpackage.dck n() {
        return defpackage.cjv.r(this).t;
    }

    @Override // defpackage.cza
    public final void o() {
        defpackage.cqu cquVar = this.j;
        if (cquVar == null) {
            return;
        }
        java.util.List list = cquVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((defpackage.crd) list.get(i)).d) {
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    defpackage.crd crdVar = (defpackage.crd) list.get(i2);
                    long j = crdVar.a;
                    long j2 = crdVar.c;
                    long j3 = crdVar.b;
                    float f = crdVar.e;
                    boolean z = crdVar.d;
                    arrayList.add(new defpackage.crd(j, j3, j2, false, f, j3, j2, z, z, crdVar.i, 0L, 1.0f, 0L));
                }
                defpackage.cqu cquVar2 = new defpackage.cqu(arrayList, null);
                this.d = cquVar2;
                v(cquVar2, defpackage.cqv.a);
                v(cquVar2, defpackage.cqv.b);
                v(cquVar2, defpackage.cqv.c);
                this.j = null;
                return;
            }
        }
    }

    @Override // defpackage.cge
    /* JADX INFO: renamed from: p */
    public final void t() {
        u();
    }

    @Override // defpackage.cge
    public final void q() {
        u();
    }

    @Override // defpackage.cri
    public final java.lang.Object r(defpackage.affg affgVar, defpackage.afdk afdkVar) {
        aiug aiugVar = new aiug(defpackage.afga.s(afdkVar), 1);
        aiugVar.z();
        defpackage.cru cruVar = new defpackage.cru(this, aiugVar);
        synchronized (this.f) {
            this.e.n(cruVar);
            new afdq(defpackage.afga.s(defpackage.afga.r(affgVar, cruVar, cruVar)), defpackage.afdr.a).w(defpackage.afbk.a);
        }
        aiugVar.d(new dnh(cruVar, 1));
        return aiugVar.k();
    }

    @Override // defpackage.cza
    public final void s(defpackage.cqu cquVar, defpackage.cqv cqvVar, long j) {
        this.g = j;
        if (cqvVar == defpackage.cqv.a) {
            this.d = cquVar;
        }
        if (this.h == null) {
            this.h = ahoc.d(N(), (defpackage.afdo) null, 4, new defpackage.btt(this, (defpackage.afdk) null, 2), 1);
        }
        v(cquVar, cqvVar);
        java.util.List list = cquVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!defpackage.tq.l((defpackage.crd) list.get(i))) {
                this.j = cquVar;
            }
        }
        cquVar = null;
        this.j = cquVar;
    }

    @Override // defpackage.cza
    public final void t() {
        u();
    }

    public final void u() {
        aiwg aiwgVar = this.h;
        if (aiwgVar != null) {
            aiwgVar.s(new defpackage.crh());
            this.h = null;
        }
    }

    @Override // defpackage.cza
    public final /* synthetic */ void E() {
    }
}
