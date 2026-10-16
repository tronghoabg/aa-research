package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bav implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bav(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v43, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v47, types: [blh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v49, types: [blh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v59, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v62, types: [beq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v64, types: [beq, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        int iJ;
        int i = 2;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return java.lang.Integer.valueOf(((defpackage.bby) this.a).b());
            case 1:
                defpackage.cdz cdzVar = defpackage.bau.b;
                java.lang.Object obj = this.a.get(2);
                obj.getClass();
                java.lang.Integer num = (java.lang.Integer) obj;
                num.intValue();
                return num;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return java.lang.Integer.valueOf(((defpackage.bby) this.a).b());
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.bby bbyVar = (defpackage.bby) this.a;
                return java.lang.Integer.valueOf(bbyVar.i() ? bbyVar.C.e() : bbyVar.j());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.bby bbyVar2 = (defpackage.bby) this.a;
                if (!bbyVar2.i()) {
                    iJ = bbyVar2.j();
                } else if (bbyVar2.n() != -1) {
                    iJ = bbyVar2.n();
                } else if (java.lang.Math.abs(bbyVar2.c()) >= java.lang.Math.abs(bbyVar2.d())) {
                    iJ = bbyVar2.u() ? bbyVar2.f + 1 : bbyVar2.f;
                } else {
                    iJ = bbyVar2.j();
                }
                return java.lang.Integer.valueOf(bbyVar2.f(iJ));
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return java.lang.Integer.valueOf(((defpackage.bby) this.a).b());
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return this.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.bcq bcqVar = (defpackage.bcq) this.a;
                bcqVar.j.invoke(java.lang.Boolean.valueOf(!bcqVar.i));
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return this.a;
            case 9:
                java.lang.Object obj2 = this.a;
                return java.lang.Boolean.valueOf(obj2 != null ? ((java.lang.Boolean) new defpackage.bfd(obj2, i).invoke()).booleanValue() : false);
            case 10:
                java.lang.Object obj3 = this.a;
                return java.lang.Boolean.valueOf(obj3 != null ? ((java.lang.Boolean) new defpackage.bfd(obj3, i).invoke()).booleanValue() : false);
            case 11:
                ?? r3 = this.a;
                if (r3 != 0) {
                    return (java.util.List) r3.a();
                }
                return null;
            case 12:
                return java.lang.Long.valueOf(this.a.a());
            case 13:
                return java.lang.Long.valueOf(this.a.a());
            case 14:
                ((defpackage.bip) this.a).e();
                return defpackage.afbk.a;
            case 15:
                return ((defpackage.beg) this.a).e();
            case 16:
                return new defpackage.bff((defpackage.apn) this.a, 0.0f);
            case 17:
                java.lang.Boolean bool = (java.lang.Boolean) this.a.a();
                bool.booleanValue();
                return bool;
            case 18:
                this.a.d();
                return defpackage.afbk.a;
            case 19:
                this.a.a();
                return defpackage.afbk.a;
            default:
                defpackage.bep bepVar = (defpackage.bep) this.a;
                return new defpackage.dly(defpackage.bes.a(bepVar.b, bepVar.e, bepVar.g));
        }
    }
}
