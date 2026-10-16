package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aqo extends defpackage.afee implements defpackage.affg {
    long a;
    int b;
    /* synthetic */ long c;
    final /* synthetic */ defpackage.aqp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqo(defpackage.aqp aqpVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.d = aqpVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.aqo aqoVar = new defpackage.aqo(this.d, afdkVar);
        aqoVar.c = ((defpackage.dmd) obj).a;
        return aqoVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                j3 = this.a;
                if (i != 2) {
                    j5 = this.c;
                    defpackage.afga.cz(obj);
                } else {
                    j2 = this.c;
                    defpackage.afga.cz(obj);
                    j4 = ((defpackage.dmd) obj).a;
                    defpackage.tu tuVar = this.d.k;
                    long jR = defpackage.acmj.r(j3, j4);
                    this.c = j2;
                    this.a = j4;
                    this.b = 3;
                    obj = tuVar.d(jR, j4, this);
                    if (obj != afdrVar) {
                        return afdrVar;
                    }
                    j5 = j2;
                    j3 = j4;
                }
            } else {
                j = this.c;
                defpackage.afga.cz(obj);
            }
            return new defpackage.dmd(defpackage.acmj.r(j5, defpackage.acmj.r(j3, ((defpackage.dmd) obj).a)));
        }
        defpackage.afga.cz(obj);
        long j6 = this.c;
        defpackage.tu tuVar2 = this.d.k;
        this.b = 1;
        obj = tuVar2.e(j6, this);
        if (obj == afdrVar) {
            return afdrVar;
        }
        j = j6;
        long jR2 = defpackage.acmj.r(j, ((defpackage.dmd) obj).a);
        defpackage.aqp aqpVar = this.d;
        this.c = j;
        this.a = jR2;
        this.b = 2;
        obj = aqpVar.g(jR2, this);
        if (obj == afdrVar) {
            return afdrVar;
        }
        j2 = j;
        j3 = jR2;
        j4 = ((defpackage.dmd) obj).a;
        defpackage.tu tuVar3 = this.d.k;
        long jR3 = defpackage.acmj.r(j3, j4);
        this.c = j2;
        this.a = j4;
        this.b = 3;
        obj = tuVar3.d(jR3, j4, this);
        if (obj != afdrVar) {
            return afdrVar;
        }
        j5 = j2;
        j3 = j4;
        return new defpackage.dmd(defpackage.acmj.r(j5, defpackage.acmj.r(j3, ((defpackage.dmd) obj).a)));
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aqo) b(new defpackage.dmd(((defpackage.dmd) obj).a), (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
