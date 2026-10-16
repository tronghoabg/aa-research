package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rdj implements defpackage.rez {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rdj(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.rez
    public final java.lang.Object a() throws android.os.RemoteException {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return new defpackage.qvt(((defpackage.ref) this.a).C());
            case 1:
                return new defpackage.qvq(((defpackage.ref) this.a).C());
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.qvn(((defpackage.ref) this.a).C());
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.rqa(((defpackage.ref) this.a).C());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.qzi qziVar = new defpackage.qzi(null);
                ((defpackage.shg) ((defpackage.ret) this.a).e).b().n(qziVar);
                return qziVar;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.rky rkyVar = new defpackage.rky(null);
                ((defpackage.shg) ((defpackage.ret) this.a).e).b().k(rkyVar);
                return rkyVar;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.rlb rlbVar = new defpackage.rlb(null);
                ((defpackage.shg) ((defpackage.ret) this.a).e).b().l(rlbVar);
                return rlbVar;
            default:
                defpackage.rlk rlkVar = new defpackage.rlk(null);
                ((defpackage.shg) ((defpackage.ret) this.a).e).b().m(rlkVar);
                return rlkVar;
        }
    }
}
