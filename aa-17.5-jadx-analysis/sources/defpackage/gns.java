package defpackage;

import android.content.ComponentName;
import androidx.car.app.FailureResponse;

/* loaded from: classes2.dex */
public abstract class gns {
    public static gnl a(FailureResponse failureResponse) {
        switch (failureResponse.getErrorType()) {
            case 1:
                return gnl.b;
            case 2:
                return gnl.c;
            case 3:
                return gnl.d;
            case 4:
                return gnl.e;
            case 5:
                return gnl.f;
            case 6:
                return gnl.g;
            default:
                return gnl.a;
        }
    }

    public void b() {
        throw null;
    }

    public final void c(ComponentName componentName, gnk gnkVar, gnl gnlVar) {
        gnq gnqVarB = gnr.b(3, componentName);
        gnqVarB.c = xxh.h(gnkVar);
        gnqVarB.e = xxh.h(gnlVar);
        d(gnqVarB);
    }

    public abstract void d(gnq gnqVar);

    public void e() {
        throw null;
    }

    public void f(ComponentName componentName) {
        throw null;
    }

    public void g() {
        throw null;
    }
}
