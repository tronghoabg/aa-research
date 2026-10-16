package defpackage;

import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class nrw extends ebj {
    public final ProjectionWindowAnimationParams a;
    public final ProjectionWindowAnimationParams b;
    public final boolean c;

    public nrw(ProjectionWindowAnimationParams projectionWindowAnimationParams, ProjectionWindowAnimationParams projectionWindowAnimationParams2, boolean z) {
        this.a = projectionWindowAnimationParams;
        this.b = projectionWindowAnimationParams2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nrw) {
            nrw nrwVar = (nrw) obj;
            if (this.c == nrwVar.c && Objects.equals(this.a, nrwVar.a) && Objects.equals(this.b, nrwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((a.f(this.c) * 31) + Objects.hashCode(this.a)) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, Boolean.valueOf(this.c)};
        String[] strArrSplit = "inAnim;outAnim;isRhd".split(";");
        StringBuilder sb = new StringBuilder("nrw[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
