package defpackage;

import android.os.Handler;

/* loaded from: classes2.dex */
public final class oci implements ocq {
    public boolean a = true;
    final /* synthetic */ Handler b;
    final /* synthetic */ mpi c;
    final /* synthetic */ sab d;
    final /* synthetic */ rby e;
    final /* synthetic */ ocx f;
    public final /* synthetic */ oco g;

    public oci(oco ocoVar, Handler handler, mpi mpiVar, sab sabVar, rby rbyVar, ocx ocxVar) {
        this.b = handler;
        this.c = mpiVar;
        this.d = sabVar;
        this.e = rbyVar;
        this.f = ocxVar;
        this.g = ocoVar;
    }

    @Override // defpackage.ocq
    public final void a() {
        this.b.removeCallbacksAndMessages(null);
        mpi mpiVar = this.c;
        if (mpiVar != null) {
            mpiVar.b();
        }
        if (this.a) {
            this.a = false;
            oco ocoVar = this.g;
            ocoVar.c.g();
            ocp ocpVar = ocoVar.f;
            if (ocpVar != null) {
                ocpVar.a();
            }
            this.d.i(this.e);
            this.f.e();
        }
    }
}
