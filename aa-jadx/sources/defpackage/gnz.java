package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gnz {
    public static defpackage.gns a(androidx.car.app.FailureResponse failureResponse) {
        switch (failureResponse.getErrorType()) {
            case 1:
                return defpackage.gns.b;
            case 2:
                return defpackage.gns.c;
            case 3:
                return defpackage.gns.d;
            case 4:
                return defpackage.gns.e;
            case 5:
                return defpackage.gns.f;
            case 6:
                return defpackage.gns.g;
            default:
                return defpackage.gns.a;
        }
    }

    public void b() {
        throw null;
    }

    public final void c(android.content.ComponentName componentName, defpackage.gnr gnrVar, defpackage.gns gnsVar) {
        defpackage.gnx gnxVarB = defpackage.gny.b(3, componentName);
        gnxVarB.c = defpackage.xyn.h(gnrVar);
        gnxVarB.e = defpackage.xyn.h(gnsVar);
        d(gnxVarB);
    }

    public abstract void d(defpackage.gnx gnxVar);

    public void e() {
        throw null;
    }

    public void f(android.content.ComponentName componentName) {
        throw null;
    }

    public void g() {
        throw null;
    }
}
