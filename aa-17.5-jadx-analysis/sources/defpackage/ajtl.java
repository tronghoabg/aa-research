package defpackage;

import java.net.InetAddress;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ajtl implements Cloneable, ajtk {
    public final ajpe a;
    public boolean b;
    private final InetAddress c;
    private ajpe[] d;
    private ajtj e;
    private ajti f;
    private boolean g;

    public ajtl(ajtg ajtgVar) {
        ajpe ajpeVar = ajtgVar.a;
        InetAddress inetAddress = ajtgVar.b;
        ahgm.e(ajpeVar, "Target host");
        this.a = ajpeVar;
        this.c = inetAddress;
        this.e = ajtj.a;
        this.f = ajti.a;
    }

    @Override // defpackage.ajtk
    public final int a() {
        if (this.b) {
            return this.d == null ? 1 : 2;
        }
        return 0;
    }

    @Override // defpackage.ajtk
    public final ajpe b(int i) {
        throw null;
    }

    @Override // defpackage.ajtk
    public final ajpe c() {
        ajpe[] ajpeVarArr = this.d;
        if (ajpeVarArr == null) {
            return null;
        }
        return ajpeVarArr[0];
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // defpackage.ajtk
    public final ajpe d() {
        return this.a;
    }

    @Override // defpackage.ajtk
    public final boolean e() {
        return this.f == ajti.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajtl)) {
            return false;
        }
        ajtl ajtlVar = (ajtl) obj;
        return this.b == ajtlVar.b && this.g == ajtlVar.g && this.e == ajtlVar.e && this.f == ajtlVar.f && a.ao(this.a, ajtlVar.a) && a.ao(this.c, ajtlVar.c) && ahku.d(this.d, ajtlVar.d);
    }

    @Override // defpackage.ajtk
    public final boolean f() {
        return this.g;
    }

    @Override // defpackage.ajtk
    public final boolean g() {
        return this.e == ajtj.b;
    }

    public final ajtg h() {
        if (!this.b) {
            return null;
        }
        ajpe ajpeVar = this.a;
        InetAddress inetAddress = this.c;
        ajpe[] ajpeVarArr = this.d;
        return new ajtg(ajpeVar, inetAddress, ajpeVarArr != null ? Arrays.asList(ajpeVarArr) : null, this.g, this.e, this.f);
    }

    public final int hashCode() {
        int iC = ahku.c(ahku.c(17, this.a), this.c);
        ajpe[] ajpeVarArr = this.d;
        if (ajpeVarArr != null) {
            for (char c = 0; c <= 0; c = 1) {
                iC = ahku.c(iC, ajpeVarArr[0]);
            }
        }
        return ahku.c(ahku.c((((iC * 37) + (this.b ? 1 : 0)) * 37) + (this.g ? 1 : 0), this.e), this.f);
    }

    public final void i(ajpe ajpeVar, boolean z) {
        ahkp.b(!this.b, "Already connected");
        this.b = true;
        this.d = new ajpe[]{ajpeVar};
        this.g = z;
    }

    public final void j(boolean z) {
        ahkp.b(!this.b, "Already connected");
        this.b = true;
        this.g = z;
    }

    public final void k(boolean z) {
        ahkp.b(this.b, "No layered protocol unless connected");
        this.f = ajti.b;
        this.g = z;
    }

    public final void l() {
        this.b = false;
        this.d = null;
        this.e = ajtj.a;
        this.f = ajti.a;
        this.g = false;
    }

    public final void m() {
        ahkp.b(this.b, "No tunnel unless connected");
        ahkp.c(this.d, "No tunnel without proxy");
        this.e = ajtj.b;
        this.g = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((a() * 30) + 50);
        sb.append("RouteTracker[");
        InetAddress inetAddress = this.c;
        if (inetAddress != null) {
            sb.append(inetAddress);
            sb.append("->");
        }
        sb.append('{');
        if (this.b) {
            sb.append('c');
        }
        if (this.e == ajtj.b) {
            sb.append('t');
        }
        if (this.f == ajti.b) {
            sb.append('l');
        }
        if (this.g) {
            sb.append('s');
        }
        sb.append("}->");
        ajpe[] ajpeVarArr = this.d;
        if (ajpeVarArr != null) {
            sb.append(ajpeVarArr[0]);
            sb.append("->");
        }
        sb.append(this.a);
        sb.append(']');
        return sb.toString();
    }
}
