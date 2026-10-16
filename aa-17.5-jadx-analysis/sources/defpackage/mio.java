package defpackage;

import com.google.android.gms.car.RadioProgramInfo;

/* loaded from: classes2.dex */
public final class mio {
    public final RadioProgramInfo a;
    public final boolean b;

    public mio(RadioProgramInfo radioProgramInfo, boolean z) {
        radioProgramInfo.getClass();
        this.a = radioProgramInfo;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mio)) {
            return false;
        }
        mio mioVar = (mio) obj;
        return affa.f(this.a, mioVar.a) && this.b == mioVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.f(this.b);
    }

    public final String toString() {
        return "CurrentProgramInfo(programInfo=" + this.a + ", isFavorite=" + this.b + ")";
    }
}
