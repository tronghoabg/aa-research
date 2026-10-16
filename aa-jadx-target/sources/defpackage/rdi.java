package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rdi implements java.util.function.Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ rdi(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, qza] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, qyx] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                defpackage.rpe rpeVar = (defpackage.rpe) obj;
                if (defpackage.omv.c("CAR.SENSOR", 3)) {
                    defpackage.rrx.a("CAR.SENSOR", null, "handleCarDisconnection");
                }
                android.util.SparseArray sparseArray = rpeVar.c;
                synchronized (sparseArray) {
                    sparseArray.clear();
                    rpeVar.b = null;
                    break;
                }
                return;
            case 1:
                qsv qsvVar = (qsv) obj;
                if (defpackage.omv.c("CAR.RADIO", 3)) {
                    defpackage.rrx.a("CAR.RADIO", null, "handleCarDisconnection");
                }
                try {
                    qsvVar.a.x(qsvVar.d);
                    break;
                } catch (android.os.RemoteException unused) {
                }
                ?? r4 = qsvVar.b;
                for (ajnd ajndVar : r4) {
                    defpackage.yqm yqmVar = com.google.android.apps.auto.components.radio.RadioMediaBrowserService.g;
                    ((com.google.android.apps.auto.components.radio.RadioMediaBrowserService) ajndVar.a).l.b(new mix(0, (java.lang.Integer) null, (java.lang.String) null));
                }
                r4.clear();
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                throw null;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return;
            case 9:
                ((tvc) obj).a();
                return;
            case 10:
                ((tva) obj).a();
                return;
            case 11:
                ((tuy) obj).a();
                return;
            case 12:
                ((tvb) obj).a();
                return;
            case 13:
                ((tux) obj).a();
                return;
            case 14:
                defpackage.xuq xuqVar = defpackage.xva.a;
                ((xvs) obj).a();
                return;
            default:
                ((xvs) obj).a();
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
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
