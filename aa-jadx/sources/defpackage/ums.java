package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ums extends defpackage.umx {
    private final defpackage.uxj[] A;
    private java.util.List B;
    private boolean C;
    private java.util.List D;
    public defpackage.utd a;
    public int b;
    public boolean c;
    private final java.lang.Object y;
    private final java.util.Set z;

    public ums(defpackage.uub uubVar, defpackage.uua uuaVar) {
        super(uubVar, uuaVar);
        this.y = new java.lang.Object();
        this.z = new java.util.HashSet();
        this.A = new defpackage.uxj[8];
        this.B = new java.util.ArrayList();
        this.D = new java.util.ArrayList();
        this.c = false;
    }

    private final void q(defpackage.uxj uxjVar) {
        if (uxjVar == null || this.l == null) {
            return;
        }
        java.util.Set set = this.z;
        if (set.contains(uxjVar)) {
            return;
        }
        uxjVar.b(this.l);
        set.add(uxjVar);
    }

    @Override // defpackage.umx, defpackage.uuf, defpackage.uud
    public final void H(defpackage.uud uudVar, defpackage.uud uudVar2, defpackage.utu utuVar) {
        if (this.l != null) {
            android.opengl.GLES20.glEnable(2884);
            android.opengl.GLES20.glCullFace(1029);
            synchronized (this.y) {
                int size = this.D.size();
                this.b = 0;
                while (this.b < size) {
                    super.H(uudVar, uudVar2, utuVar);
                    this.b++;
                }
            }
            android.opengl.GLES20.glDisable(2884);
        }
    }

    public final defpackage.umr c() {
        return (defpackage.umr) this.D.get(this.b);
    }

    @Override // defpackage.uuf, defpackage.uud
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.uxj d(int i) {
        defpackage.uuz uuzVar;
        defpackage.uwz uwzVarD = null;
        if (i >= 0 && i < 8) {
            defpackage.uxj uxjVar = this.A[i];
            if (uxjVar != null) {
                q(uxjVar);
                return uxjVar;
            }
            if (!this.D.isEmpty()) {
                defpackage.utb utbVar = ((defpackage.umr) this.D.get(this.b)).a[i];
                defpackage.utd utdVar = this.a;
                defpackage.uwz uwzVarM = (utdVar == null || utbVar == null || utbVar.a()) ? null : utdVar.m(utbVar);
                if (uwzVarM == null && (uuzVar = this.l) != null) {
                    if (i == 1 || i == 2) {
                        uwzVarD = uuzVar.d(com.google.android.projection.gearhead.R.drawable.client_injected_default_cap);
                    } else if (i == 3) {
                        uwzVarD = uuzVar.d(com.google.android.projection.gearhead.R.drawable.white_pixel);
                    }
                    uwzVarM = uwzVarD;
                }
                q(uwzVarM);
                return uwzVarM;
            }
        }
        return null;
    }

    @Override // defpackage.uuf, defpackage.uud
    public final void e(boolean z) {
        super.e(z);
        java.util.Set set = this.z;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            ((defpackage.uxj) it.next()).c(z);
        }
        set.clear();
    }

    public final void f(float f) {
        int i;
        java.util.Iterator it = this.B.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            defpackage.uka ukaVarG = ((defpackage.ula) it.next()).g((int) f);
            iMax = java.lang.Math.max(iMax, (this.C ? ukaVarG.n : ukaVarG.o).length);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(iMax);
        int size = this.B.size();
        for (int i2 = 0; i2 < iMax && i2 < 4; i2++) {
            defpackage.umr umrVar = new defpackage.umr();
            arrayList.add(umrVar);
            defpackage.ukz ukzVar = null;
            for (int i3 = 0; i3 < size && i3 < 8; i3++) {
                defpackage.uka ukaVarG2 = ((defpackage.ula) this.B.get(i3)).g((int) f);
                defpackage.ukz[] ukzVarArr = this.C ? ukaVarG2.n : ukaVarG2.o;
                int length = ukzVarArr.length;
                if (length > 0 && i2 < length) {
                    defpackage.ukz ukzVar2 = ukzVarArr[i2];
                    float[] fArr = umrVar.b;
                    float f2 = ukzVar2.d;
                    fArr[i3] = f2;
                    if (f2 != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                        ukzVar = ukzVar2;
                    }
                }
            }
            if (ukzVar != null) {
                int i4 = ukzVar.g;
                while (true) {
                    i = ukzVar.f;
                    if (i / i4 <= 64) {
                        break;
                    } else {
                        i4 += i4;
                    }
                }
                umrVar.d = i4;
                umrVar.c = i == 0 ? 1.0f : i;
                defpackage.utb utbVar = ukzVar.j;
                defpackage.utb utbVar2 = ukzVar.k;
                defpackage.utb utbVar3 = ukzVar.i;
                defpackage.utb[] utbVarArr = umrVar.a;
                utbVarArr[1] = utbVar;
                utbVarArr[2] = utbVar2;
                utbVarArr[3] = utbVar3;
                umrVar.e = ukzVar.b;
                umrVar.f = ukzVar.c;
            }
        }
        synchronized (this.y) {
            this.D = arrayList;
        }
    }

    public final void g(java.util.List list, boolean z) {
        this.B = list;
        this.C = z;
        boolean z2 = false;
        if (list.size() == 1) {
            defpackage.ula ulaVar = (defpackage.ula) list.get(0);
            if (ulaVar.b() == 1) {
                defpackage.uka ukaVarD = ulaVar.d();
                for (defpackage.ukz ukzVar : this.C ? ukaVarD.n : ukaVarD.o) {
                    if (ukzVar.d == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || (!ukzVar.c() && ukzVar.i == defpackage.utb.a)) {
                    }
                }
                z2 = true;
            }
        }
        this.c = z2;
    }

    @Override // defpackage.uuf
    public final void z(int i, defpackage.uxj uxjVar) {
        if (this.r) {
            defpackage.uwo uwoVar = defpackage.uwo.a;
            defpackage.uxj uxjVar2 = this.A[i];
            if (uxjVar2 == uxjVar) {
                return;
            }
            if (uxjVar2 != null) {
                java.util.Set set = this.z;
                if (set.contains(uxjVar2)) {
                    set.remove(uxjVar2);
                    uxjVar2.c(false);
                }
            }
            this.z.add(uxjVar);
            defpackage.uuz uuzVar = this.l;
            uuzVar.getClass();
            uxjVar.b(uuzVar);
        }
        this.A[i] = uxjVar;
    }
}
