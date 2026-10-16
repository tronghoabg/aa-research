package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rer implements defpackage.rfa {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rer(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, rdf] */
    @Override // defpackage.rfa
    public final void a(java.lang.Object obj) throws android.os.RemoteException {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.rky) obj).b((defpackage.shg) this.a);
                break;
            case 1:
                ((defpackage.rqa) obj).b((defpackage.wyz) this.a);
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.qzi) obj).b(this.a);
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.qzi qziVar = (defpackage.qzi) obj;
                ((defpackage.shg) ((defpackage.ret) this.a).e).b().s(qziVar);
                qziVar.a();
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.rky rkyVar = (defpackage.rky) obj;
                ((defpackage.shg) ((defpackage.ret) this.a).e).b().p(rkyVar);
                rkyVar.a();
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.rlb rlbVar = (defpackage.rlb) obj;
                ((defpackage.shg) ((defpackage.ret) this.a).e).b().q(rlbVar);
                rlbVar.a();
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.rlk rlkVar = (defpackage.rlk) obj;
                ((defpackage.shg) ((defpackage.ret) this.a).e).b().r(rlkVar);
                rlkVar.a();
                break;
            default:
                ((defpackage.rlb) obj).b((defpackage.shg) this.a);
                break;
        }
    }
}
