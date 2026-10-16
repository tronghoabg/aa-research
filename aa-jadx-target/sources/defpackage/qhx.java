package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class qhx implements java.util.function.Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ qhx(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.os.IInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object, qxq] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, qxt] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                ((android.view.View) obj).requestApplyInsets();
                return;
            case 1:
                ((android.view.View) obj).requestApplyInsets();
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.qjm.n((luk) obj);
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                android.os.Bundle bundle = (android.os.Bundle) obj;
                lxi.r(bundle, defpackage.qjm.o(bundle));
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                android.os.Bundle bundle2 = (android.os.Bundle) obj;
                int i = lxi.e;
                if (bundle2.getBoolean("group_conversation")) {
                    lxi.r(bundle2, defpackage.qjm.o(bundle2));
                    return;
                }
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.qjm.n((luk) obj);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.qjm.n((luk) obj);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.ros) obj).a();
                return;
            case 9:
                defpackage.sax saxVar = (defpackage.sax) obj;
                synchronized (saxVar.d) {
                    saxVar.f.clear();
                    defpackage.qzs qzsVar = saxVar.e;
                    if (qzsVar != null) {
                        try {
                            saxVar.a.k(qzsVar);
                            break;
                        } catch (android.os.RemoteException unused) {
                        }
                        saxVar.e = null;
                    }
                    break;
                }
                defpackage.rbz.j(new defpackage.ryw(saxVar, 9));
                return;
            case 10:
                defpackage.ret retVar = (defpackage.ret) obj;
                ((defpackage.lam) retVar.a).D();
                ((defpackage.lam) retVar.b).D();
                ((defpackage.lam) retVar.c).D();
                ((defpackage.lam) retVar.d).D();
                return;
            case 11:
                return;
            case 12:
                defpackage.rjf rjfVar = (defpackage.rjf) obj;
                rjfVar.c.D();
                rjfVar.d.D();
                return;
            case 13:
                ((rif) obj).a();
                return;
            case 14:
                ((defpackage.lam) ((rkn) obj).a).D();
                return;
            case 15:
                ((rfz) obj).d();
                return;
            case 16:
                defpackage.rov rovVar = (defpackage.rov) obj;
                if (defpackage.omv.c("CAR.BT", 3)) {
                    defpackage.rrx.a("CAR.BT", null, "handleCarDisconnection");
                }
                ((defpackage.qwp) rovVar.b).a();
                return;
            case 17:
                return;
            case 18:
                defpackage.qsr qsrVar = (defpackage.qsr) obj;
                if (defpackage.rrx.e("CAR.MEDIA", 3)) {
                    defpackage.rrx.a("CAR.MEDIA", null, "handleCarDisconnection");
                }
                try {
                    java.lang.Object obj2 = qsrVar.f;
                    ?? r0 = qsrVar.d;
                    android.os.Parcel parcelFp = ((defpackage.ijv) obj2).fp();
                    defpackage.ijx.i(parcelFp, r0);
                    android.os.Parcel parcelFq = ((defpackage.ijv) obj2).fq(6, parcelFp);
                    defpackage.ijx.j(parcelFq);
                    parcelFq.recycle();
                    break;
                } catch (java.lang.Exception unused2) {
                }
                try {
                    qsrVar.a.i(qsrVar.e);
                    return;
                } catch (java.lang.Exception unused3) {
                    return;
                }
            case 19:
                defpackage.roz rozVar = (defpackage.roz) obj;
                if (defpackage.rrx.e("CAR.MSG", 3)) {
                    defpackage.rrx.a("CAR.MSG", null, "handleCarDisconnection");
                }
                try {
                    rozVar.a.j(rozVar.d);
                    break;
                } catch (android.os.RemoteException | java.lang.IllegalStateException unused4) {
                }
                rozVar.b = null;
                return;
            default:
                defpackage.rpb rpbVar = (defpackage.rpb) obj;
                if (defpackage.omv.c("CAR.SENSOR", 3)) {
                    defpackage.rrx.a("CAR.SENSOR", null, "handleCarDisconnection");
                }
                rpbVar.a();
                return;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
