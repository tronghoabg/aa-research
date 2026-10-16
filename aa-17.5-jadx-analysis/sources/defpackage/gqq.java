package defpackage;

import androidx.car.app.model.Action;

/* loaded from: classes2.dex */
public final class gqq {
    public final gag a;
    public final String b;
    public final boolean c;
    public final Action d;

    public gqq(gag gagVar, String str, boolean z, Action action) {
        str.getClass();
        this.a = gagVar;
        this.b = str;
        this.c = z;
        this.d = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqq)) {
            return false;
        }
        gqq gqqVar = (gqq) obj;
        return affa.f(this.a, gqqVar.a) && affa.f(this.b, gqqVar.b) && this.c == gqqVar.c && affa.f(this.d, gqqVar.d);
    }

    public final int hashCode() {
        gag gagVar = this.a;
        int iHashCode = ((gagVar == null ? 0 : gagVar.hashCode()) * 31) + this.b.hashCode();
        boolean z = this.c;
        Action action = this.d;
        return (((iHashCode * 31) + a.f(z)) * 31) + (action != null ? action.hashCode() : 0);
    }

    public final String toString() {
        return "ErrorData(icon=" + this.a + ", message=" + this.b + ", isLoading=" + this.c + ", action=" + this.d + ")";
    }

    public gqq() {
        this(null, "", false, null);
    }
}
