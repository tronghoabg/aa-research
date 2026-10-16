package defpackage;

import com.google.android.gms.car.CarWindowLayoutParams;

/* loaded from: classes2.dex */
public final class nsf {
    public final int a;
    public final CarWindowLayoutParams b;

    public nsf(int i, CarWindowLayoutParams carWindowLayoutParams) {
        this.a = i;
        this.b = carWindowLayoutParams;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nsf) {
            nsf nsfVar = (nsf) obj;
            if (this.a == nsfVar.a && this.b.equals(nsfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return this.b.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ChromeWindowInfo{layoutId=" + this.a + ", layoutParams=" + String.valueOf(this.b) + "}";
    }

    public nsf() {
        throw null;
    }
}
