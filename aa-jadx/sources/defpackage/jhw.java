package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jhw {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.WM.Drag");
    public static final defpackage.jhu b = new defpackage.jhu();
    public final com.google.android.gms.car.ProjectionWindowDragParams c;
    public final defpackage.rau d;
    public final defpackage.jhv e;
    public final java.util.List f;
    public final java.util.List g;
    public final int h;
    public final float i;
    public int j;
    public android.graphics.Point k;
    public android.graphics.Point l;
    public boolean m;
    public android.view.VelocityTracker n;
    public int o;
    public int p;
    public defpackage.emv q;
    public int r;
    public int s;
    public java.util.List t;
    private final android.util.Size u;
    private final int v;

    /* JADX WARN: Multi-variable type inference failed */
    public jhw(android.content.Context context, com.google.android.gms.car.ProjectionWindowDragParams projectionWindowDragParams, defpackage.jhv jhvVar, android.util.Size size, int i, int i2) {
        defpackage.rau rasVar;
        context.getClass();
        projectionWindowDragParams.getClass();
        android.os.IBinder iBinder = projectionWindowDragParams.c;
        if (iBinder == null) {
            rasVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.IProjectionWindowDragCallback");
            rasVar = iInterfaceQueryLocalInterface instanceof defpackage.rau ? (defpackage.rau) iInterfaceQueryLocalInterface : new defpackage.ras(iBinder);
        }
        this.c = projectionWindowDragParams;
        this.d = rasVar;
        this.e = jhvVar;
        this.u = size;
        this.v = i;
        defpackage.ygw ygwVarD = d();
        ygwVarD.getClass();
        this.f = defpackage.afga.aV(ygwVarD);
        defpackage.ygw ygwVarD2 = d();
        ygwVarD2.getClass();
        this.g = defpackage.afga.aW(ygwVarD2, defpackage.afdf.a);
        android.content.res.Configuration configuration = new android.content.res.Configuration(context.getResources().getConfiguration());
        configuration.densityDpi = i;
        configuration.screenWidthDp = (int) defpackage.ebm.p(size.getWidth(), i);
        configuration.screenHeightDp = (int) defpackage.ebm.p(size.getHeight(), i);
        context.createConfigurationContext(configuration).getClass();
        this.h = (int) defpackage.ebm.o(16, i);
        this.i = (i / 160.0f) * 100.0f;
        this.j = -1;
        this.k = new android.graphics.Point(0, 0);
        this.l = new android.graphics.Point(0, 0);
        defpackage.ygw ygwVarD3 = d();
        ygwVarD3.getClass();
        java.lang.Integer num = !ygwVarD3.isEmpty() ? (java.lang.Integer) d().get(defpackage.afqt.e(i2, 0)) : 0;
        num.getClass();
        this.o = num.intValue();
        this.s = -1;
        this.t = defpackage.afce.a;
    }

    public final float a(float f) {
        float f2 = this.i;
        return (f * f2) / (f + f2);
    }

    public final float b(float f) {
        float f2 = this.i;
        float fC = defpackage.afqt.c(f, (-0.001f) + f2);
        return (fC * f2) / (f2 - fC);
    }

    public final int c() {
        return d().indexOf(java.lang.Integer.valueOf(this.r));
    }

    public final defpackage.ygw d() {
        return this.c.a();
    }

    public final void e(int i) {
        defpackage.emv emvVar = new defpackage.emv(this, b, i);
        defpackage.emw emwVar = emvVar.s;
        if (emwVar != null) {
            emwVar.e(200.0f);
        }
        defpackage.emw emwVar2 = emvVar.s;
        if (emwVar2 != null) {
            emwVar2.c(1.0f);
        }
        emvVar.g(new defpackage.jht(this, i, 1));
        emvVar.e();
        this.q = emvVar;
    }

    public final void f() {
        if (java.lang.Math.abs(this.o - this.s) > 10) {
            try {
                defpackage.rau rauVar = this.d;
                if (rauVar != null) {
                    rauVar.f(this.o);
                }
                this.s = this.o;
            } catch (android.os.RemoteException unused) {
                ((defpackage.yqj) a.h()).u("RemoteException when notifying client of drag progress");
            }
        }
    }

    public final void g(int i) {
        this.e.aJ();
        try {
            defpackage.rau rauVar = this.d;
            if (rauVar != null) {
                rauVar.e(i);
            }
        } catch (android.os.RemoteException unused) {
            ((defpackage.yqj) a.h()).u("RemoteException when notifying client of drag");
        }
    }

    public final int h() {
        int i = this.c.a;
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 1;
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final java.lang.String toString() {
        int iH = h();
        defpackage.ygw ygwVarD = d();
        boolean z = this.m;
        int i = this.r;
        int iC = c();
        java.util.List list = this.t;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WindowDragHandler{direction=");
        sb.append((java.lang.Object) (iH != 1 ? "HORIZONTAL" : "VERTICAL"));
        sb.append(",windowSize=");
        sb.append(this.u);
        sb.append(",dragSteps=");
        sb.append(ygwVarD);
        sb.append(",isBeingDragged=");
        sb.append(z);
        sb.append(",currentDragOffset=");
        sb.append(i);
        sb.append(",currentDragStep=");
        sb.append(iC);
        sb.append(",nonDraggableAreas=");
        sb.append(list);
        sb.append("}");
        return sb.toString();
    }
}
