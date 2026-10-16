package defpackage;

import com.google.android.gms.carsetup.CarInfoInternal;

/* loaded from: classes2.dex */
public final class jol implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public jol(jou jouVar, boolean z, boolean z2, int i) {
        this.d = i;
        this.a = z;
        this.b = z2;
        this.c = jouVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.c;
        if (i != 0) {
            if (this.b) {
                gnv gnvVar = (gnv) obj;
                gnvVar.l().setVisibility(0);
                gnvVar.j().setVisibility(8);
                gnvVar.f().setVisibility(8);
                gnvVar.h().setVisibility(0);
                return;
            }
            boolean z = this.a;
            gnv gnvVar2 = (gnv) obj;
            gnvVar2.l().setVisibility(8);
            gnvVar2.j().setVisibility(0);
            boolean z2 = !z;
            gnvVar2.f().setVisibility(gnv.r(z2));
            gnvVar2.h().setVisibility(gnv.r(z2));
            return;
        }
        jos josVar = ((jou) obj).h;
        josVar.getClass();
        jnh jnhVar = josVar.a;
        joi joiVar = (joi) jnhVar;
        joiVar.c();
        jlo jloVar = new jlo(joiVar.b);
        boolean z3 = this.b;
        boolean z4 = this.a;
        try {
            CarInfoInternal carInfoInternal = ((joi) jnhVar).m;
            carInfoInternal.getClass();
            carInfoInternal.c = z3;
            ((ype) ((ype) joi.a.f()).ai(2506)).Q("databaseWrite: proj:%b bt:%b", z4, z3);
            if (z4) {
                jloVar.l(((joi) jnhVar).m);
                jloVar.o(((joi) jnhVar).m, z3);
            } else {
                jloVar.m(((joi) jnhVar).m);
            }
            jloVar.close();
        } catch (Throwable th) {
            try {
                jloVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public /* synthetic */ jol(boolean z, gnv gnvVar, boolean z2, int i) {
        this.d = i;
        this.b = z;
        this.c = gnvVar;
        this.a = z2;
    }
}
