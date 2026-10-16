package defpackage;

import com.google.android.apps.gmm.systems.accounts.GmmAccount;

/* loaded from: classes2.dex */
public final class qas {
    public final GmmAccount a;
    public final int b;
    public final String c;
    public final String d;
    public final sm e;

    public qas(GmmAccount gmmAccount, int i, String str, String str2, sm smVar) {
        gmmAccount.getClass();
        this.a = gmmAccount;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = smVar;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qas) {
            qas qasVar = (qas) obj;
            if (this.a.equals(qasVar.a) && this.b == qasVar.b && this.c.equals(qasVar.c) && ((str = this.d) != null ? str.equals(qasVar.d) : qasVar.d == null) && this.e.equals(qasVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
        String str = this.d;
        return (this.e.hashCode() ^ (((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * (-721379959))) * (-721379959);
    }

    public final String toString() {
        sm smVar = this.e;
        return "{" + this.a.toString() + ", " + this.b + ", " + this.c + ", " + this.d + ", null, " + smVar.toString() + ", null, 0}";
    }

    public qas() {
        throw null;
    }
}
