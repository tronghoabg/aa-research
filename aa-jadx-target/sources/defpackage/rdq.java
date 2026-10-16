package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rdq implements defpackage.rfa {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rdq(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, qrm] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, rki] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, qrl] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, rdb] */
    @Override // defpackage.rfa
    public final void a(java.lang.Object obj) throws android.os.RemoteException {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.qvt) obj).b(this.a);
                break;
            case 1:
                ((defpackage.qvn) obj).b((defpackage.wyz) this.a);
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.qvq) obj).c(this.a);
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.rlk) obj).b(this.a);
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                rjr rjrVar = (rjq) obj;
                try {
                    ((defpackage.rjf) this.a).b.x(rjrVar);
                    break;
                } catch (android.os.RemoteException unused) {
                }
                rjrVar.a();
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                rjl rjlVar = (rjk) obj;
                try {
                    ((defpackage.rjf) this.a).b.w(rjlVar);
                    break;
                } catch (android.os.RemoteException unused2) {
                }
                rjlVar.a();
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((rkk) obj).b((defpackage.pyk) this.a);
                break;
            default:
                rkk rkkVar = (rkk) obj;
                ((rkn) this.a).c.c(rkkVar);
                rkkVar.a();
                break;
        }
    }
}
