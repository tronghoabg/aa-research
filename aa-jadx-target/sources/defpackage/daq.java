package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class daq implements defpackage.affc {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public daq(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [aiuf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.Object, zhs] */
    /* JADX WARN: Type inference failed for: r7v35, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v37, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Object, wi] */
    /* JADX WARN: Type inference failed for: r7v41, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, wi] */
    /* JADX WARN: Type inference failed for: r7v45, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, wi] */
    /* JADX WARN: Type inference failed for: r7v53, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [djy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17, types: [aiuf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.Choreographer$FrameCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20, types: [aiuf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v32, types: [aiuw, java.lang.Object] */
    @Override // defpackage.affc
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        boolean zA = false;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.das) this.a).a.removeFrameCallback(this.b);
                return defpackage.afbk.a;
            case 1:
                java.lang.Object obj2 = this.a;
                synchronized (((rie) obj2).e) {
                    ((rie) obj2).a = true;
                    java.lang.Object obj3 = ((rie) obj2).b;
                    java.lang.Object[] objArr = ((defpackage.bzc) obj3).a;
                    int i = ((defpackage.bzc) obj3).b;
                    for (int i2 = 0; i2 < i; i2++) {
                        defpackage.djp djpVar = (defpackage.djp) ((czk) objArr[i2]).get();
                        if (djpVar != null) {
                            djpVar.b();
                        }
                    }
                    ((defpackage.bzc) obj3).g();
                }
                defpackage.fbl fblVar = ((defpackage.dal) this.b).d;
                ((java.util.concurrent.atomic.AtomicReference) fblVar.a).set(null);
                fblVar.b.f();
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((se) ((aack) this.a).a).l((android.telecom.Call.Callback) this.b);
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((se) ((aack) this.a).a).l((android.telecom.Call.Callback) this.b);
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.afbk) obj).getClass();
                ahoc.d(((dxq) this.b).d, (defpackage.afdo) null, 0, new defpackage.dxp((aiuf) this.a, (defpackage.afdk) null, 0), 3);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ahoc.d(((dyy) this.b).c, (defpackage.afdo) null, 0, new defpackage.dxh((aiuf) this.a, (dzf) obj, (defpackage.afdk) null, 2), 3);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.afbk) obj).getClass();
                ahoc.d(((dza) this.b).c, (defpackage.afdo) null, 0, new defpackage.dxp((aiuf) this.a, (defpackage.afdk) null, 2, (byte[]) null), 3);
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                flz flzVar = (java.lang.Throwable) obj;
                if (flzVar instanceof flz) {
                    ((fju) this.b).g(flzVar.a);
                }
                this.a.cancel(false);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                android.view.KeyEvent keyEvent = ((cpx) obj).a;
                keyEvent.getClass();
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 23) {
                    this.a.invoke(new gin(keyEvent, android.os.SystemClock.elapsedRealtime()));
                } else {
                    this.a.invoke(new gim(keyEvent, android.os.SystemClock.elapsedRealtime()));
                }
                this.b.b(java.lang.Boolean.TRUE);
                return java.lang.Boolean.FALSE;
            case 9:
                wi wiVar = (wi) obj;
                if (((java.lang.Boolean) this.a.invoke(wiVar)).booleanValue()) {
                    return new ghx(true, true);
                }
                java.util.Map map = ghy.a;
                return ghy.a((wi) this.b.invoke(wiVar));
            case 10:
                wi wiVar2 = (wi) obj;
                if (((java.lang.Boolean) this.a.invoke(wiVar2)).booleanValue()) {
                    return new ghx(true, true);
                }
                java.util.Map map2 = ghy.a;
                return ghy.a((wi) this.b.invoke(wiVar2));
            case 11:
                wi wiVar3 = (wi) obj;
                if (((java.lang.Boolean) this.a.invoke(wiVar3)).booleanValue()) {
                    return new ghx(true, true);
                }
                java.util.Map map3 = ghy.a;
                return ghy.a((wi) this.b.invoke(wiVar3));
            case 12:
                defpackage.cja cjaVar = (defpackage.cja) obj;
                cjaVar.getClass();
                if (cjaVar.b()) {
                    ahoc.d((aiuw) this.a, (defpackage.afdo) null, 0, new ggc((defpackage.bcf) this.b, (defpackage.afdk) null, 9, (byte[]) null), 3);
                }
                return defpackage.afbk.a;
            case 13:
                defpackage.cim cimVar = (defpackage.cim) obj;
                cimVar.getClass();
                cimVar.a((((java.lang.Boolean) this.a.a()).booleanValue() || ((java.lang.Boolean) this.b.a()).booleanValue()) ? false : true);
                return defpackage.afbk.a;
            case 14:
                doq doqVar = (doq) obj;
                doqVar.getClass();
                doqVar.i.k(((dor) this.a).g, 0.0f);
                doqVar.j.k(((dor) this.b).d, 0.0f);
                dor dorVar = doqVar.c;
                doqVar.e.j(dorVar.b, 0.0f);
                doqVar.g.j(dorVar.e, 0.0f);
                return defpackage.afbk.a;
            case 15:
                doq doqVar2 = (doq) obj;
                doqVar2.getClass();
                doqVar2.i.k(this.a != null ? ((dor) this.b).g : doqVar2.c.d, 0.0f);
                defpackage.tc tcVar = doqVar2.f;
                dor dorVar2 = doqVar2.c;
                tcVar.j(dorVar2.c, 0.0f);
                doqVar2.h.j(dorVar2.f, 0.0f);
                doqVar2.c(new defpackage.ndd("spread"));
                return defpackage.afbk.a;
            case 16:
                gjg gjgVar = (gjg) obj;
                gjgVar.getClass();
                int iOrdinal = gjgVar.ordinal();
                if (iOrdinal == 0) {
                    zA = ((defpackage.cit) this.b).a(7);
                } else if (iOrdinal == 3) {
                    zA = ((defpackage.cit) this.a).a(7);
                }
                return java.lang.Boolean.valueOf(zA);
            default:
                defpackage.eqp eqpVar = (defpackage.eqp) this.b;
                java.lang.Object objE = eqpVar.e();
                defpackage.afgq afgqVar = (defpackage.afgq) this.a;
                if (afgqVar.a || ((objE == null && obj != null) || (objE != null && !defpackage.afga.f(objE, obj)))) {
                    afgqVar.a = false;
                    eqpVar.m(obj);
                }
                return defpackage.afbk.a;
        }
    }

    public daq(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
