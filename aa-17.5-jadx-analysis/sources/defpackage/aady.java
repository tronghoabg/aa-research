package defpackage;

import com.google.android.libraries.maps.model.CameraPosition;
import java.util.Arrays;

/* loaded from: classes3.dex */
abstract class aady {
    public final CameraPosition a;
    public final CameraPosition b;
    public final long c;

    public aady(CameraPosition cameraPosition, CameraPosition cameraPosition2, long j) {
        this.a = cameraPosition;
        zkt.n(cameraPosition2, "dest");
        this.b = cameraPosition2;
        aclh.o(j >= 0, "invalid durationMs: %s", new Object[]{Long.valueOf(j)});
        this.c = j;
    }

    protected abstract double a(double d);

    protected abstract double b(double d, double d2, double d3);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aady)) {
            return false;
        }
        aady aadyVar = (aady) obj;
        return a.C(this.a, aadyVar.a) && a.C(this.b, aadyVar.b) && this.c == aadyVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c)});
    }
}
