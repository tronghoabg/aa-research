package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aqi extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqi(defpackage.aeb aebVar, long j, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.c = aebVar;
        this.b = j;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        int i = this.d;
        if (i == 0) {
            return new defpackage.aqi((defpackage.aqj) this.c, this.b, afdkVar, 0);
        }
        if (i == 1) {
            return new defpackage.aqi((defpackage.aqj) this.c, this.b, afdkVar, 1, (byte[]) null);
        }
        java.lang.Object obj2 = this.c;
        if (i != 2) {
            return new defpackage.aqi((defpackage.aeb) obj2, this.b, afdkVar, 3);
        }
        return new defpackage.aqi((defpackage.aqj) obj2, this.b, afdkVar, 2, (char[]) null);
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        int i = this.d;
        if (i == 0) {
            defpackage.afdr afdrVar = defpackage.afdr.a;
            if (this.a != 0) {
                defpackage.afga.cz(obj);
            } else {
                defpackage.afga.cz(obj);
                java.lang.Object obj2 = this.c;
                long j = this.b;
                this.a = 1;
                if (((defpackage.aqj) obj2).i.h(j, true, this) == afdrVar) {
                    return afdrVar;
                }
            }
            return defpackage.afbk.a;
        }
        if (i == 1) {
            defpackage.afdr afdrVar2 = defpackage.afdr.a;
            if (this.a != 0) {
                defpackage.afga.cz(obj);
            } else {
                defpackage.afga.cz(obj);
                java.lang.Object obj3 = this.c;
                long j2 = this.b;
                defpackage.akv akvVar = defpackage.akv.b;
                defpackage.aqh aqhVar = new defpackage.aqh(j2, null);
                this.a = 1;
                if (((defpackage.aqj) obj3).i.i(akvVar, aqhVar, this) == afdrVar2) {
                    return afdrVar2;
                }
            }
            return defpackage.afbk.a;
        }
        if (i == 2) {
            defpackage.afdr afdrVar3 = defpackage.afdr.a;
            if (this.a != 0) {
                defpackage.afga.cz(obj);
            } else {
                defpackage.afga.cz(obj);
                java.lang.Object obj4 = this.c;
                long j3 = this.b;
                this.a = 1;
                if (((defpackage.aqj) obj4).i.h(j3, false, this) == afdrVar3) {
                    return afdrVar3;
                }
            }
            return defpackage.afbk.a;
        }
        defpackage.afdr afdrVar4 = defpackage.afdr.a;
        int i2 = this.a;
        defpackage.afga.cz(obj);
        if (i2 == 0) {
            java.lang.Object obj5 = this.c;
            defpackage.cji cjiVar = new defpackage.cji(this.b);
            defpackage.aga agaVar = defpackage.blg.c;
            this.a = 1;
            if (defpackage.aeb.k((defpackage.aeb) obj5, cjiVar, agaVar, null, this, 12) == afdrVar4) {
                return afdrVar4;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((defpackage.aqi) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i == 1) {
            return ((defpackage.aqi) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i != 2) {
            return ((defpackage.aqi) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.aqi) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqi(defpackage.aqj aqjVar, long j, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.c = aqjVar;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqi(defpackage.aqj aqjVar, long j, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.d = i;
        this.c = aqjVar;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqi(defpackage.aqj aqjVar, long j, defpackage.afdk afdkVar, int i, char[] cArr) {
        super(2, afdkVar);
        this.d = i;
        this.c = aqjVar;
        this.b = j;
    }
}
