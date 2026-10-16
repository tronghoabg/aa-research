package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bge implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bge(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [cwm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [bwx, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        java.lang.Object objN = null;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                android.view.ActionMode actionMode = ((defpackage.bgk) this.a).f;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return defpackage.afbk.a;
            case 1:
                android.view.View view = ((defpackage.bgk) this.a).a;
                defpackage.afer aferVar = (defpackage.afer) obj;
                android.os.Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == android.os.Looper.myLooper()) {
                    aferVar.invoke();
                } else {
                    android.os.Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new defpackage.bgf(aferVar, 0));
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                android.view.ActionMode actionMode2 = ((defpackage.bgk) this.a).f;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                this.a.b((defpackage.ctc) obj);
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.lang.Object obj2 = this.a;
                ((defpackage.bgk) obj2).c.c();
                return new defpackage.agq(obj2, 7);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                this.a.b((defpackage.ctc) obj);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.cml cmlVar = (defpackage.cml) obj;
                defpackage.ckc ckcVarB = cmlVar.r().b();
                int iIntBitsToFloat = (int) java.lang.Float.intBitsToFloat((int) (cmlVar.o() >> 32));
                int iIntBitsToFloat2 = (int) java.lang.Float.intBitsToFloat((int) (cmlVar.o() & 4294967295L));
                android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) this.a;
                drawable.setBounds(0, 0, iIntBitsToFloat, iIntBitsToFloat2);
                drawable.draw(defpackage.cjn.a(ckcVarB));
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.bil bilVar = (defpackage.bil) obj;
                ?? r0 = this.a;
                defpackage.bhd bhdVar = (defpackage.bhd) r0;
                defpackage.bwx bwxVar = bhdVar.c;
                defpackage.affg affgVar = bhdVar.a;
                android.content.Context context = (android.content.Context) bwxVar.a();
                if (context == null) {
                    context = (android.content.Context) defpackage.cjv.y(r0, defpackage.daj.b);
                }
                affgVar.invoke(bilVar, context);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.czh czhVar = (defpackage.czh) obj;
                if (czhVar instanceof defpackage.bhb) {
                    this.a.invoke(((defpackage.bhb) czhVar).a);
                    return java.lang.Boolean.TRUE;
                }
                if (!(czhVar instanceof defpackage.bhe)) {
                    throw new java.lang.IllegalStateException("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                }
                throw null;
            case 9:
                ((defpackage.affc) obj).invoke(this.a);
                return defpackage.afbk.a;
            case 10:
                return new defpackage.agq(this.a, 8);
            case 11:
                this.a.b((defpackage.ctc) obj);
                return defpackage.afbk.a;
            case 12:
                defpackage.bih bihVar = (defpackage.bih) this.a;
                bihVar.c.k(true);
                bihVar.c.g(true);
                defpackage.beg begVar = bihVar.c;
                java.lang.CharSequence charSequenceB = ((defpackage.cgo) obj).b();
                charSequenceB.getClass();
                defpackage.bih.b(begVar, (java.lang.String) charSequenceB, bihVar.d);
                return java.lang.Boolean.TRUE;
            case 13:
                java.util.List list = (java.util.List) obj;
                defpackage.bih bihVar2 = (defpackage.bih) this.a;
                if (bihVar2.c.e() != null) {
                    defpackage.bfi bfiVarE = bihVar2.c.e();
                    bfiVarE.getClass();
                    list.add(bfiVarE.a);
                    z = true;
                } else {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 14:
                java.lang.String str = ((defpackage.dfb) obj).b;
                defpackage.bih bihVar3 = (defpackage.bih) this.a;
                defpackage.bih.b(bihVar3.c, str, bihVar3.d);
                return java.lang.Boolean.TRUE;
            case 15:
                defpackage.dfb dfbVar = (defpackage.dfb) obj;
                defpackage.bih bihVar4 = (defpackage.bih) this.a;
                if (bihVar4.d) {
                    defpackage.fbl fblVar = bihVar4.c.u;
                    if (fblVar != null) {
                        java.util.List listAc = defpackage.afga.ac(new defpackage.dji(), new defpackage.djb(dfbVar, 1));
                        defpackage.beg begVar2 = bihVar4.c;
                        defpackage.asq.V(listAc, begVar2.s, begVar2.m, fblVar);
                    } else {
                        java.lang.String strA = bihVar4.b.a();
                        int iE = defpackage.dgc.e(bihVar4.b.b);
                        int iA = defpackage.dgc.a(bihVar4.b.b);
                        strA.getClass();
                        dfbVar.getClass();
                        if (iA < iE) {
                            throw new java.lang.IndexOutOfBoundsException(defpackage.a.bz(iE, iA, "End index (", ") is less than start index (", ")."));
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append((java.lang.CharSequence) strA, 0, iE);
                        sb.append((java.lang.CharSequence) dfbVar);
                        sb.append((java.lang.CharSequence) strA, iA, strA.length());
                        java.lang.String string = sb.toString();
                        int iE2 = defpackage.dgc.e(bihVar4.b.b) + dfbVar.a();
                        bihVar4.c.m.invoke(new defpackage.dkd(string, defpackage.dax.g(iE2, iE2), 4));
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                return java.lang.Boolean.valueOf(z2);
            case 16:
                ((defpackage.bit) this.a).a((defpackage.djg) obj);
                return defpackage.afbk.a;
            case 17:
                ((defpackage.cuw) obj).r((defpackage.cux) this.a, 0, 0, 0.0f);
                return defpackage.afbk.a;
            case 18:
                java.util.List list2 = (java.util.List) obj;
                defpackage.bjk bjkVar = (defpackage.bjk) this.a;
                defpackage.dga dgaVar = bjkVar.d().c;
                if (dgaVar != null) {
                    defpackage.dgd dgdVar = bjkVar.b;
                    float[] fArr = defpackage.clr.a;
                    defpackage.dgd dgdVarX = defpackage.dgd.x(dgdVar, defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u), 0L, null, 0L, null, 0, 0L, 16777214);
                    defpackage.dfz dfzVar = dgaVar.a;
                    objN = dgaVar.n(new defpackage.dfz(dfzVar.a, dgdVarX, dfzVar.c, dfzVar.d, dfzVar.e, dfzVar.f, dfzVar.g, dfzVar.h, dfzVar.j, dfzVar.i), dgaVar.c);
                    list2.add(objN);
                }
                return java.lang.Boolean.valueOf(objN != null);
            case 19:
                defpackage.dfb dfbVar2 = (defpackage.dfb) obj;
                defpackage.bjk bjkVar2 = (defpackage.bjk) this.a;
                defpackage.bjj bjjVar = bjkVar2.h;
                if (bjjVar == null) {
                    defpackage.bjj bjjVar2 = new defpackage.bjj(bjkVar2.a, dfbVar2);
                    defpackage.bix bixVar = new defpackage.bix(dfbVar2, bjkVar2.b, bjkVar2.i, bjkVar2.c, bjkVar2.d, bjkVar2.e, bjkVar2.f, defpackage.afce.a);
                    bixVar.h(bjkVar2.d().b);
                    bjjVar2.d = bixVar;
                    bjkVar2.h = bjjVar2;
                } else if (!defpackage.afga.f(dfbVar2, bjjVar.b)) {
                    bjjVar.b = dfbVar2;
                    defpackage.bix bixVar2 = bjjVar.d;
                    if (bixVar2 != null) {
                        bixVar2.i(dfbVar2, bjkVar2.b, bjkVar2.i, bjkVar2.c, bjkVar2.d, bjkVar2.e, bjkVar2.f, defpackage.afce.a);
                    }
                }
                bjkVar2.m();
                return java.lang.Boolean.TRUE;
            default:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                defpackage.bjk bjkVar3 = (defpackage.bjk) this.a;
                defpackage.bjj bjjVar3 = bjkVar3.h;
                if (bjjVar3 == null) {
                    z3 = false;
                } else {
                    defpackage.affc affcVar = bjkVar3.g;
                    if (affcVar != null) {
                        affcVar.invoke(bjjVar3);
                    }
                    defpackage.bjj bjjVar4 = bjkVar3.h;
                    if (bjjVar4 != null) {
                        bjjVar4.c = zBooleanValue;
                    }
                    bjkVar3.m();
                    z3 = true;
                }
                return java.lang.Boolean.valueOf(z3);
        }
    }
}
