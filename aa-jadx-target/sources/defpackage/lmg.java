package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lmg implements java.lang.Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ lmg(java.lang.Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                ((do) ((defpackage.lma) this.b).b).j(this.a);
                return;
            case 1:
                ((defpackage.jqk) this.b).e.b(this.a);
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((do) ((defpackage.lma) this.b).b).e(this.a);
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) pnu.a.g()).p((java.lang.Throwable) this.b)).ai(6819)).y("ClientParametersBlocked on main thread for %s ms.", new defpackage.vqo(this.a));
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) pnu.a.g()).p((java.lang.Throwable) this.b)).ai(6820)).y("ClientParametersBlocked on background thread for %s ms.", new defpackage.vqo(this.a));
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.lang.Object obj = this.b;
                uyj uyjVar = ((zyk) obj).i;
                long j = this.a;
                synchronized (uyjVar) {
                    if (((zyk) obj).o == 1) {
                        ((zyk) obj).j = j;
                        ((zyk) obj).o = 5;
                    }
                    break;
                }
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object obj2 = this.b;
                uyj uyjVar2 = ((zyk) obj2).i;
                long j2 = this.a;
                synchronized (uyjVar2) {
                    int i = ((zyk) obj2).o;
                    if (i != 1) {
                        if (!((zyk) obj2).k) {
                            int i2 = i - 1;
                            if (i == 0) {
                                throw null;
                            }
                            if (i2 == 1) {
                                uyjVar2.k(aaix.fS, (int) j2);
                            } else if (i2 == 2) {
                                uyjVar2.k(aaix.fP, (int) j2);
                            } else if (i2 == 3) {
                                uyjVar2.k(aaix.fV, (int) j2);
                            } else if (i2 == 4) {
                                uyjVar2.k(aaix.fY, (int) j2);
                            }
                            ((zyk) obj2).k = true;
                        }
                        ((zyk) obj2).a();
                    }
                }
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object obj3 = this.b;
                uyj uyjVar3 = ((zyk) obj3).i;
                long j3 = this.a;
                synchronized (uyjVar3) {
                    if (((zyk) obj3).o == 1) {
                        ((zyk) obj3).j = j3;
                        ((zyk) obj3).o = 4;
                    }
                    break;
                }
                return;
            default:
                if (adel.l()) {
                    return;
                }
                ((aafy) this.b).g(this.a);
                return;
        }
    }

    public lmg(defpackage.jqk jqkVar, long j, int i) {
        this.c = i;
        this.a = j;
        this.b = jqkVar;
    }
}
