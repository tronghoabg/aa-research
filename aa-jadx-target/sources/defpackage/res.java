package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class res implements defpackage.rzz {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ res(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, qwn] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, rji] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, rlf] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, qwq] */
    @Override // defpackage.rzz, java.util.concurrent.Callable
    public final java.lang.Object call() throws android.os.RemoteException {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return ((defpackage.shg) ((defpackage.ret) this.a).e).b().i();
            case 1:
                defpackage.ref refVar = (defpackage.ref) this.a;
                return (rko) refVar.g.b(rko.class, new defpackage.rdu(refVar, 10));
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((defpackage.shg) ((defpackage.ret) this.a).e).b().h();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return ((defpackage.rjf) this.a).b.j();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return this.a.i();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                j$.util.stream.Stream map = j$.util.Collection.-EL.stream(((defpackage.rjf) this.a).b.k()).map(new defpackage.rix(6));
                int i = defpackage.ygw.d;
                return (defpackage.ygw) map.collect(defpackage.yds.a);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Boolean.valueOf(this.a.g());
            default:
                defpackage.rov rovVar = (defpackage.rov) this.a;
                ?? r0 = rovVar.a;
                int iC = r0.c();
                if (iC == 0) {
                    r0.v(rovVar.b);
                    iC = 0;
                }
                return java.lang.Integer.valueOf(iC);
        }
    }
}
