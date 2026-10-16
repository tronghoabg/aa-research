package defpackage;

import com.google.android.apps.gmm.systems.accounts.GmmAccount;

/* loaded from: classes2.dex */
public final class qba {
    public final GmmAccount a;
    public final yfq b;
    private final qbb c;

    public qba(GmmAccount gmmAccount, yfq yfqVar, qbb qbbVar) {
        gmmAccount.getClass();
        this.a = gmmAccount;
        this.b = yfqVar;
        this.c = qbbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qba) {
            qba qbaVar = (qba) obj;
            if (this.a.equals(qbaVar.a) && yrm.W(this.b, qbaVar.b) && this.c.equals(qbaVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        qbb qbbVar = this.c;
        yfq yfqVar = this.b;
        return "{" + this.a.toString() + ", " + String.valueOf(yfqVar) + ", " + qbbVar.toString() + "}";
    }

    public qba() {
        throw null;
    }
}
