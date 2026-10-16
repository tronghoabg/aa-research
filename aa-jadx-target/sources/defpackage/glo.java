package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class glo implements defpackage.affc {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ glo(java.lang.Object obj, boolean z, int i) {
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, ut] */
    /* JADX WARN: Type inference failed for: r8v14, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, xj] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean z = true;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                gep gepVar = (gep) obj;
                gepVar.getClass();
                this.b.sendCheckedChange(this.a, gepVar);
                return defpackage.afbk.a;
            case 1:
                boolean z2 = this.a;
                defpackage.dek dekVar = (defpackage.dek) obj;
                float f = bqn.a;
                if (!z2) {
                    defpackage.dbb.f(dekVar);
                }
                java.lang.Object obj2 = this.b;
                dekVar.a(defpackage.def.b, java.lang.String.valueOf(defpackage.afhi.k(((bqp) obj2).c() * 100.0f) / 100.0f));
                dekVar.a(defpackage.ddy.i, new defpackage.ddn(null, new defpackage.bmp(obj2, 6)));
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                gep gepVar2 = (gep) obj;
                gepVar2.getClass();
                this.b.sendPanModeChanged(this.a, gepVar2);
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                gjg gjgVar = (gjg) obj;
                gjgVar.getClass();
                return java.lang.Boolean.valueOf(gjgVar == (this.a ? gjg.d : gjg.b) ? ((defpackage.cit) this.b).a(7) : false);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.cuw cuwVar = (defpackage.cuw) obj;
                cuwVar.getClass();
                java.util.Iterator it = this.b.iterator();
                int i = 0;
                while (it.hasNext()) {
                    int iMax = 0;
                    for (defpackage.cux cuxVar : (java.util.List) it.next()) {
                        boolean z3 = this.a;
                        iMax = java.lang.Math.max(iMax, defpackage.mtt.f(cuxVar, z3));
                        if (z3) {
                            cuwVar.r(cuxVar, i, 0, 0.0f);
                        } else {
                            cuwVar.r(cuxVar, 0, i, 0.0f);
                        }
                    }
                    i += iMax;
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return defpackage.duu.b((1 & 1) != 0 ? defpackage.afdp.a : null, (1 & 2) != 0 ? 5000L : 0L, new defpackage.mud(((java.lang.Boolean) obj).booleanValue(), this.a, (defpackage.eqp) this.b, null));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.yqm yqmVar = defpackage.myx.a;
                ((defpackage.bxi) obj).getClass();
                if (!this.a) {
                    return new eoe(2);
                }
                ?? r8 = this.b;
                r8.invoke(java.lang.Boolean.TRUE);
                return new defpackage.dnb(r8, 4);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.cim cimVar = (defpackage.cim) obj;
                defpackage.yqm yqmVar2 = defpackage.nif.a;
                cimVar.getClass();
                boolean z4 = this.a;
                java.lang.Object obj3 = this.b;
                if (z4) {
                    defpackage.cit citVar = (defpackage.cit) obj3;
                    cimVar.h(citVar);
                    cimVar.d(citVar);
                } else {
                    defpackage.cit citVar2 = (defpackage.cit) obj3;
                    cimVar.e(citVar2);
                    cimVar.i(citVar2);
                }
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.cim cimVar2 = (defpackage.cim) obj;
                cimVar2.getClass();
                if (this.a || (defpackage.acyc.ac() && ((defpackage.nxh) this.b).m == null)) {
                    z = false;
                }
                cimVar2.a(z);
                return defpackage.afbk.a;
            default:
                android.widget.ImageView imageView = (android.widget.ImageView) obj;
                imageView.getClass();
                nzi drawable = imageView.getDrawable();
                drawable.getClass();
                nzi nziVar = drawable;
                defpackage.nfh nfhVar = (defpackage.nfh) this.b;
                nziVar.a(nfhVar.a);
                nziVar.b(nfhVar.a());
                nziVar.c(this.a);
                return defpackage.afbk.a;
        }
    }

    public /* synthetic */ glo(boolean z, java.lang.Object obj, int i) {
        this.c = i;
        this.a = z;
        this.b = obj;
    }
}
