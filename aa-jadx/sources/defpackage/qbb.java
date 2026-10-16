package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qbb implements java.io.Serializable {
    public final java.lang.String a;

    private qbb(defpackage.zcv zcvVar) {
        zcvVar.getClass();
        defpackage.zcw zcwVar = zcvVar.c;
        java.lang.String strD = defpackage.qba.d(zcwVar == null ? defpackage.zcw.a : zcwVar);
        if ((zcvVar.b & 2) != 0) {
            strD = strD + ":" + zcvVar.d;
        }
        this.a = strD;
    }

    public static defpackage.qbb a(java.lang.String str) {
        defpackage.zcv zcvVarA = defpackage.qba.a(str);
        zcvVarA.getClass();
        return new defpackage.qbb(zcvVarA);
    }

    public final defpackage.qbb b(long j) {
        defpackage.abor aborVarN = defpackage.zcv.a.n();
        defpackage.zcv zcvVarA = defpackage.qba.a(this.a);
        zcvVarA.getClass();
        defpackage.zcw zcwVar = zcvVarA.c;
        if (zcwVar == null) {
            zcwVar = defpackage.zcw.a;
        }
        aborVarN.t();
        defpackage.zcv zcvVar = (defpackage.zcv) aborVarN.b;
        zcwVar.getClass();
        zcvVar.c = zcwVar;
        zcvVar.b |= 1;
        aborVarN.t();
        defpackage.zcv zcvVar2 = (defpackage.zcv) aborVarN.b;
        zcvVar2.b |= 2;
        zcvVar2.d = j;
        return new defpackage.qbb((defpackage.zcv) aborVarN.q());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((defpackage.qbb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a;
    }
}
