package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class qag implements Serializable {
    public final String a;

    private qag(zbp zbpVar) {
        zbpVar.getClass();
        zbq zbqVar = zbpVar.c;
        String strD = qaf.d(zbqVar == null ? zbq.a : zbqVar);
        if ((zbpVar.b & 2) != 0) {
            strD = strD + ":" + zbpVar.d;
        }
        this.a = strD;
    }

    public static qag a(String str) {
        zbp zbpVarA = qaf.a(str);
        zbpVarA.getClass();
        return new qag(zbpVarA);
    }

    public final qag b(long j) {
        abnp abnpVarN = zbp.a.n();
        zbp zbpVarA = qaf.a(this.a);
        zbpVarA.getClass();
        zbq zbqVar = zbpVarA.c;
        if (zbqVar == null) {
            zbqVar = zbq.a;
        }
        abnpVarN.t();
        zbp zbpVar = (zbp) abnpVarN.b;
        zbqVar.getClass();
        zbpVar.c = zbqVar;
        zbpVar.b |= 1;
        abnpVarN.t();
        zbp zbpVar2 = (zbp) abnpVarN.b;
        zbpVar2.b |= 2;
        zbpVar2.d = j;
        return new qag((zbp) abnpVarN.q());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((qag) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
