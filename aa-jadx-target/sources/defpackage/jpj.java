package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jpj implements jpx {
    public final /* synthetic */ defpackage.jpy a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jpj(defpackage.jpy jpyVar, java.lang.Object obj, int i) {
        this.c = i;
        this.a = jpyVar;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, rqb] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, qxc] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, qzj] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, rqb] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, qxc] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, qvr] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, qvu] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, qwz] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, qvo] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, qvr] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, qvo] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, qzj] */
    public final void a() throws android.os.RemoteException {
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                this.a.m().aV((com.google.android.gms.car.MediaOptions) this.b);
                break;
            case 1:
                this.a.m().be(this.b);
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                this.a.m().bb((com.google.android.gms.car.display.CarRegionId) this.b);
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                this.a.m().aJ(this.b);
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                this.a.m().aB((com.google.android.gms.car.CarFacet) this.b);
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                this.a.m().aO(this.b);
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                this.a.m().aN(this.b);
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                this.a.m().aM(this.b);
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                this.a.m().aw((com.google.android.gms.car.CarInfo) this.b);
                break;
            case 9:
                this.a.m().bi(this.b);
                break;
            case 10:
                this.a.m().aC((com.google.android.gms.car.CarFrxEvent) this.b);
                break;
            case 11:
                this.a.m().bj((com.google.android.gms.car.lifecycle.CarActivityLayoutConfig) this.b);
                break;
            case 12:
                this.a.m().bh(this.b);
                break;
            case 13:
                this.a.m().bg(this.b);
                break;
            case 14:
                this.a.m().aK(this.b);
                break;
            case 15:
                this.a.m().aL(this.b);
                break;
            case 16:
                this.a.m().aq(this.b);
                break;
            default:
                this.a.m().bd(this.b);
                break;
        }
    }
}
